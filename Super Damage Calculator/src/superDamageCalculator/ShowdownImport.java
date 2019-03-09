/* Takes the specified String and translates it into either a full team
or a single Pokemon. Currently, this only works on PS formatting, which
is technically all that's needed; TODO generalize import. */

package superDamageCalculator;
import java.util.HashMap;
import java.util.ArrayList;

public class ShowdownImport
{
	String[] importString = new String[6];
	Pokemon[] team = new Pokemon[6];
	boolean isTeam = false;
	HashMap<String, Pokemon> pokedex = new Pokedex().pokedex;
	HashMap<String, Move> movedex = new Movedex().movedex;
	HashMap<String, Integer> natures = new Nature().natures;

	public ShowdownImport(String importString)
	{
		this.importString[0] = importString;

		if (this.importString[0] != null)
		{
			checkIsTeam();

			if (this.isTeam)
			{
				splitTeam();
				for (int i = 0; i < 6; i++)
				{
					team[i] = makePokemon(i);
				}
			}
			else
			{
				team[0] = makePokemon(0);
			}
		}
	}

	public Pokemon getPokemon(int partyNumber)
	{
		return this.team[partyNumber];
	}

	public boolean getIsTeam()
	{
		return this.isTeam;
	}

	/* Checks for team data based on if there are two newLines in a row somewhere. */
	public void checkIsTeam()
	{
		StringBuilder monsData = new StringBuilder(this.importString[0]);
		if (monsData.indexOf("\n\n") == -1)
		{
			this.isTeam = false;
		}
		else
		{
			this.isTeam = true;
		}
	}

	/* Assumes there are 6 Pokemon on a team. */
	public void splitTeam()
	{
		StringBuilder team = new StringBuilder(importString[0]);
		int newlineIndex;

		for (int i = 0; i < 6; i++)
		{
			newlineIndex = team.indexOf("  \n\n");
			importString[i] = team.substring(0, newlineIndex);
			team = new StringBuilder(team.substring(newlineIndex + 4, team.length()));
		}
	}

	/* Prepares a Pokemon object based on the Pokemon Showdown import. */
	public Pokemon makePokemon(int partyNumber)
	{
		Pokemon pokemon = new Pokemon("Bulbasaur");
		StringBuilder importText = new StringBuilder(this.importString[partyNumber]);
		int notFound = -1;

		/* Break up import string into lines */
		int numLines = 1;
		for (int i = 0; i < importText.length(); i++)
		{
			if ((importText.charAt(i)) == ('\n'))
			{
				numLines++;
			}
		}

		//Something went wrong if it's on less than 2 lines
		if (numLines < 2)
		{
			return pokemon;
		}

		StringBuilder[] lines = new StringBuilder[numLines];
		int startingIndex = 0;

		for (int i = 0; i < numLines; i++)
		{
			lines[i] = new StringBuilder("");
			int endOfLine = importText.indexOf("\n", startingIndex);
			//If final line of import
			if (endOfLine == notFound)
			{
				endOfLine = importText.length();
			}
			lines[i].append(importText.substring(startingIndex, endOfLine));
			startingIndex = endOfLine + 1;
		}

		/* Get the Pokemon's name and item. Ignores gender / nickname. */
		StringBuilder name = new StringBuilder("");
		StringBuilder item = new StringBuilder("");
		int firstParen = lines[0].indexOf("(");
		int atSymbol = lines[0].indexOf(" @ ");
		int secondParen = notFound;
		if (firstParen != notFound)
		{
			secondParen = lines[0].indexOf("(", firstParen + 1);
		}

		//If there's an item
		if (atSymbol != notFound)
		{
			name.append(lines[0].substring(0, atSymbol));
			item.append(lines[0].substring(atSymbol + 3, lines[0].length() - 2));
		}
		else //no item
		{
			name = lines[0];
		}

		//No nickname, no gender
		if (firstParen == notFound && secondParen == notFound)
		{
			pokemon = pokedex.get(name.toString());
		}
		else if (secondParen != notFound) //has both gender and nickname
		{
			int endParen = lines[0].indexOf(")");
			pokemon = pokedex.get(name.substring(firstParen + 1, endParen));
		}
		else if (secondParen == notFound) //could have gender or nickname, but not both
		{
			int endParen = lines[0].indexOf(")");
			if (name.substring(firstParen, endParen).length() == 2) //it's gender
			{
				//Wouldn't account for gendered Pokemon with spaces in their names. As of Gen 7, none exist.
				pokemon = pokedex.get(name.substring(0, name.indexOf(" ")));
			}
			else //it's nickname
			{
				pokemon = pokedex.get(name.substring(firstParen + 1, endParen));
			}
		}
		pokemon.setItem(item.toString());

		/* Find all lines with "- ", add those substrings as moves.*/
		int moveslot = 0;
		for (int i = 0; i < lines.length; i++)
		{
			if (lines[i].indexOf("- ") != -1)
			{
				if (i != lines.length - 1)
				{
					String moveWithoutBrackets = lines[i].substring(2, lines[i].length() - 2);
					//Sanitizes the brackets around Hidden Power
					moveWithoutBrackets = moveWithoutBrackets.replaceAll("[\\[\\](){}]", "");

					pokemon.setMove(movedex.get(moveWithoutBrackets), moveslot);
				}
				else
				{
					String moveWithoutBrackets = lines[i].substring(2, lines[i].length());
					//Sanitizes the brackets around Hidden Power
					moveWithoutBrackets = moveWithoutBrackets.replaceAll("[\\[\\](){}]", "");
					pokemon.setMove(movedex.get(moveWithoutBrackets), moveslot);
				}
				moveslot++;
			}
		}

		/* Nature */
		int nature = 0;
		String natureText = "";
		for (int i = 1; i < lines.length; i++)
		{
			if(lines[i].indexOf(" Nature ") != -1)
			{
				natureText = lines[i].substring(0, lines[i].indexOf(" Nature "));
				nature = natures.get(natureText);
				pokemon.setNature(natureText);
			}
		}

		/* Level, Ability, IVs, EVs */
		int level = 100;
		String ability = "";
		int[] ivs = new int[6];
		int[] evs = new int[6];
		StringBuilder statString;

		for (int i = 0; i < 6; i++)
		{
			ivs[i] = 31;
			evs[i] = 0;
		}
		for (int i = 1; i < lines.length; i++)
		{
			int colon = lines[i].indexOf(": ");
			if (colon != -1)
			{
				String front = lines[i].substring(0, colon);
				switch (front)
				{
					case "Ability":
						ability = lines[i].substring(colon + 2, lines[i].length() - 2);
						pokemon.addAbility(ability);
						break;
					case "Level":
						level = Integer.parseInt(lines[i].substring(colon + 2, lines[i].length() - 2));
						break;
					case "EVs":
						statString = new StringBuilder(lines[i].substring(colon + 2, lines[i].length() - 2));
						evs = parseStats(statString, "EVs");
						break;
					case "IVs":
						statString = new StringBuilder(lines[i].substring(colon + 2, lines[i].length() - 2));
						ivs = parseStats(statString, "IVs");
						break;
					case "Shiny":
					case "Happiness":
						break;
					default:
						System.out.println("Something went wrong.");
						break;
				}
			}
		}

		pokemon.addAbility(ability);
		for (int i = 0; i < 6; i++)
		{
			pokemon.setStat(evs[i], ivs[i], level, nature, i);
		}

		/* Tests if output was correct by printing the newly created Pokemon back. */
		//System.out.println(pokemon);

		return pokemon;
	}

	public int[] parseStats(StringBuilder statString, String statType)
	{
		int slashCount = 0;
		ArrayList<Integer> slashIndexes = new ArrayList<Integer>();
		ArrayList<StringBuilder> tokens = new ArrayList<StringBuilder>();

		/* Initializes stats. */
		int[] stats = new int[6];
		if (statType.equals("EVs"))
		{
			for (int i = 0; i < 6; i++)
			{
				stats[i] = 0;
			}
		}
		else // IVs
		{
			for (int i = 0; i < 6; i++)
			{
				stats[i] = 31;
			}
		}

		/* If multiple IV/EV values are set*/
		if (statString.indexOf("/") != -1)
		{
			/* Finds the number of slashes and indexes of those slashes. */
			for (int i = 0; i < statString.length(); i++)
			{
				if (statString.charAt(i) == '/')
				{
					slashCount++;
					slashIndexes.add(i);
				}
			}

			/* Breaks up the stat line into tokens, e.g. 252 HP, 140 Atk, 60 Def */
			StringBuilder numberAndStat = new StringBuilder(statString.substring(0, slashIndexes.get(0) - 1));
			tokens.add(numberAndStat);
			for (int i = 0; i < slashCount - 1; i++)
			{
				numberAndStat = new StringBuilder(statString.substring(slashIndexes.get(i) + 2, slashIndexes.get(i+1) - 1));
				tokens.add(numberAndStat);
			}

			numberAndStat = new StringBuilder(statString.substring(statString.lastIndexOf("/") + 2, statString.length()));
			tokens.add(numberAndStat);
		}
		else //Only 1 IV/EV value is set
		{
			StringBuilder numberAndStat = new StringBuilder(statString.substring(0, statString.length()));
			tokens.add(numberAndStat);
		}

		/* Gets the actual value and stores it in the appropriate stat. */
		for (int i = 0; i < tokens.size(); i++)
		{
			int statValue = Integer.parseInt(tokens.get(i).substring(0, tokens.get(i).indexOf(" ")));
			if (tokens.get(i).indexOf("HP") != -1)
			{
				stats[0] = statValue;
			}
			else if (tokens.get(i).indexOf("Atk") != -1)
			{
				stats[1] = statValue;
			}
			else if (tokens.get(i).indexOf("Def") != -1)
			{
				stats[2] = statValue;
			}
			else if (tokens.get(i).indexOf("SpA") != -1)
			{
				stats[3] = statValue;
			}
			else if (tokens.get(i).indexOf("SpD") != -1)
			{
				stats[4] = statValue;
			}
			else
			{
				stats[5] = statValue;
			}
		}
		return stats;
	}
}
