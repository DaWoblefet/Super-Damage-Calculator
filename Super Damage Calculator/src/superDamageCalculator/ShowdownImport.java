/* Takes the specified String and translates it into either a full team
or a single Pokemon. Works on all sorts of Showdown strings. */

package superDamageCalculator;
import java.util.HashMap;

public class ShowdownImport
{
	private String importString;
	private String[] individualPokemon; //typically 6 Pokemon
	private Pokemon[] team = new Pokemon[6];
	private boolean isTeam = false;
	private HashMap<String, Pokemon> pokedex = Pokedex.getPokedex();
	private HashMap<String, Move> movedex = new Movedex().getMovedex();
	private HashMap<String, Integer> natures = new Nature().natures;

	public ShowdownImport(String importString)
	{
		this.importString = importString;

		isTeam = checkIsTeam(this.importString);
		individualPokemon = this.importString.split("\\n\\n"); //Split on two newLine characters
		
		if (isTeam)
		{
			for (int i = 0; i < individualPokemon.length; i++)
			{
				team[i] = makePokemon(i);
			}
			if (individualPokemon.length < 6) //if not a full team, add filler Abomasnow
			{
				for (int i = individualPokemon.length; i < 6; i++)
				{
					team[i] = pokedex.get("Abomasnow").clonePokemon();
				}
			}
		}
		else
		{
			team[0] = makePokemon(0);
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

	//Determines if the import string is a team by checking for two newLines.
	public boolean checkIsTeam(String monsData)
	{
		return !(monsData.indexOf("\n\n") == -1);
	}

	//Prepares a Pokemon object based on the Pokemon Showdown import.
	public Pokemon makePokemon(int partyNumber)
	{
		Pokemon pokemon;
		String[] lines = individualPokemon[partyNumber].split("\\n");
		for (int i = 0; i < lines.length; i++)
		{
			lines[i] = lines[i].trim();
		}

		//Something went wrong if it's on less than 2 lines
		if (lines.length < 2)
		{
			return pokedex.get("Abomasnow").clonePokemon();
		}

		String name = "Abomasnow";
		String item = "(none)";
		String gender = "Genderless";
		int firstParen = lines[0].indexOf("(");
		int secondParen = -1;
		if (firstParen != -1)
		{
			secondParen = lines[0].indexOf("(", firstParen + 1);
		}
		int atSymbol = lines[0].indexOf(" @ ");

		//If there's an item
		if (atSymbol != -1)
		{
			item = lines[0].substring(atSymbol + 3, lines[0].length());
		}

		if (firstParen == -1) //No nickname, no gender
		{
			if ("(none)".equals(item)) //No item, it's just the name
			{
				name = lines[0];
			}
			else //Grab the name that's before the @
			{
				name = lines[0].substring(0, atSymbol);
			}
		}
		else if (secondParen != -1) //has both gender and nickname
		{
			int firstEndParen = lines[0].indexOf(")");
			int secondEndParen = lines[0].indexOf(")", firstEndParen + 1);
			
			name = lines[0].substring(firstParen + 1, firstEndParen);
			gender = lines[0].substring(secondParen + 1, secondEndParen);
		}
		else if (secondParen == -1) //could have gender or nickname, but not both
		{
			int endParen = lines[0].indexOf(")");
			if (lines[0].substring(firstParen, endParen).length() == 2) //it's gender
			{
				//Wouldn't account for gendered Pokemon with spaces in their names. As of Gen 7, none exist.
				name = lines[0].substring(0, lines[0].indexOf(" "));
				gender = lines[0].substring(firstParen + 1, endParen);
			}
			else //it's nickname
			{
				name = lines[0].substring(firstParen + 1, endParen);
			}
		}
		pokemon = pokedex.get(name).clonePokemon();
		pokemon.setGender(gender);
		pokemon.setItem(item);

		//Find all lines with "- ", add those substrings as moves.
		int moveslot = 0;
		for (int i = 1; i < lines.length; i++)
		{
			if (lines[i].indexOf("- ") != -1) //If the line is a move
			{
				String moveWithoutBrackets = lines[i].substring(2, lines[i].length());
				//Sanitizes the brackets around Hidden Power
				moveWithoutBrackets = moveWithoutBrackets.replaceAll("[\\[\\](){}]", "");
				pokemon.setMove(movedex.get(moveWithoutBrackets).cloneMove(), moveslot);
				moveslot++;
			}
		}

		//Nature
		int nature = 0;
		String natureText = "";
		for (int i = 1; i < lines.length; i++)
		{
			if (lines[i].indexOf(" Nature") != -1) //If the line is Nature
			{
				natureText = lines[i].substring(0, lines[i].indexOf(' '));
				nature = natures.get(natureText);
				pokemon.setNature(natureText);
				break;
			}
		}

		//Level, Ability, IVs, EVs
		int level = 100;
		String ability = "";
		int[] ivs = new int[6];
		int[] evs = new int[6];
		String statString;

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
						ability = lines[i].substring(colon + 2, lines[i].length());
						pokemon.setAbility(ability);
						break;
					case "Level":
						level = Integer.parseInt(lines[i].substring(colon + 2, lines[i].length()));
						break;
					case "EVs":
						statString = lines[i].substring(colon + 2, lines[i].length());
						evs = parseStats(statString, true);
						break;
					case "IVs":
						statString = lines[i].substring(colon + 2, lines[i].length());
						ivs = parseStats(statString, false);
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

		for (int i = 0; i < 6; i++)
		{
			pokemon.setStat(evs[i], ivs[i], level, nature, "--", i);
		}

		// Tests if output was correct by printing the newly created Pokemon back.
		//System.out.println(pokemon + "\n");

		return pokemon;
	}

	public int[] parseStats(String statString, boolean isEVs)
	{
		String[] tokens = statString.split(" / ");
		int[] stats = new int[6];
		
		//Initializes stats
		if (isEVs)
		{
			for (int i = 0; i < 6; i++)
			{
				stats[i] = 0;
			}
		}
		else //IVs
		{
			for (int i = 0; i < 6; i++)
			{
				stats[i] = 31;
			}
		}

		//Gets the actual EV investment for a stat and stores it in the appropriate stat.
		for (int i = 0; i < tokens.length; i++)
		{
			String[] statTokens = tokens[i].split(" ");
			int statValue = Integer.parseInt(statTokens[0]);
			String statType = statTokens[1];
			
			switch (statType)
			{
				case "HP":
					stats[0] = statValue;
					break;
				case "Atk":
					stats[1] = statValue;
					break;
				case "Def":
					stats[2] = statValue;
					break;
				case "SpA":
					stats[3] = statValue;
					break;
				case "SpD":
					stats[4] = statValue;
					break;
				case "Spe":
					stats[5] = statValue;
					break;
				default:
					System.out.println("something went wrong with stat parsing");
					break;
			}
		}
		return stats;
	}
}
