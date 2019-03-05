package superDamageCalculator;

/* Models a Pokemon. Mostly getters and setters for various properties.
Pokemon's toString function returns a Showdown export.
TODO: Refactor abilities as fixed size? Pros: easier to get
Ability in GUI, cons: basically makes second ability useless. */

import java.util.ArrayList;
import java.util.HashMap;

public class Pokemon
{
    private String name;
    private int dexNumber;

    private ArrayList<String> types = new ArrayList<String>();
    private ArrayList<String> abilities = new ArrayList<String>();
    private Move[] moves = new Move[4];
    private ArrayList<String> otherFormes = new ArrayList<String>();
    private Stat[] stats = new Stat[6];
    private String item = "(none)";
    private String baseSpecies;
    private String forme;
    private String nature;

    private int[] baseStats = new int[6];
    private HashMap<String, Integer> natures = new Nature().natures;

    private double weightInKg;

    public Pokemon(String name)
    {
		this.name = name;
		initStats();
    }

    public String getName()
	{
		return name;
    }

    public void initStats()
    {
		for (int i = 0; i < 6; i++)
		{
			//0 EVs / IVs, 100 base, level 50, loops through the stats
			stats[i] = new Stat(0, 31, 100, 50, natures.get("Hardy"), i);
		}
	}

	public Stat getStat(int statType)
	{
		return stats[statType];
	}

	public void setStat(int EVs, int IVs, int baseStat, int level, int nature, int currentStat)
	{
		stats[currentStat] = new Stat(EVs, IVs, baseStat, level, nature, currentStat);
	}

	public void setStat(int EVs, int IVs, int level, int nature, int currentStat)
	{
		stats[currentStat] = new Stat(EVs, IVs, baseStats[currentStat], level, nature, currentStat);
	}

	/* These are only used for sprite parsing. */
	public int getDexNumber()
	{
		return this.dexNumber;
	}

	public void setDexNumber(int dexNumber)
	{
		this.dexNumber = dexNumber;
	}

	public String getForme()
	{
		return this.forme;
	}

	public void setForme(String forme)
	{
		this.forme = forme;
	}

	public String getBaseSpecies()
	{
		return this.baseSpecies;
	}

	public void setBaseSpecies(String baseSpecies)
	{
		this.baseSpecies = baseSpecies;
	}

	public void addOtherForme(String otherForme)
	{
		otherFormes.add(otherForme);
	}

	public String getOtherForme(int formeNumber)
	{
		return this.otherFormes.get(formeNumber);
	}

	public ArrayList<String> getOtherFormes()
	{
		return this.otherFormes;
	}

	public double getWeight()
    {
		return weightInKg;
    }

    public void setWeight(double weightInKg)
    {
		this.weightInKg = weightInKg;
    }

    public String getType(int index)
    {
		return types.get(index);
    }

    public void addType(String type)
    {
		types.add(type);
    }

	public String getAbility()
	{
		return abilities.get(abilities.size() - 1);
	}

    public String getAbility(int index)
    {
		return abilities.get(index);
    }

    public void addAbility(String ability)
    {
		abilities.add(ability);
    }

    public Move getMove(int moveslot)
	{
		return moves[moveslot];
	}

    public void setMove(Move move, int moveslot)
    {
		moves[moveslot] = move;
	}

	public String getNature()
	{
		return this.nature;
	}

	public void setNature(String nature)
	{
		this.nature = nature;
	}

 	public String getItem()
    {
		return this.item;
	}

	public void setItem(String item)
	{
		this.item = item;
	}

    public int getBaseStat(int statIndex)
    {
		return this.baseStats[statIndex];
	}

    //Can be reduced to one method after refactoring Pokedex again
    public void setBaseHP(int baseHP)
    {
		this.baseStats[StatConstants.HP] = baseHP;
    }

    public void setBaseAtk(int baseAtk)
    {
		this.baseStats[StatConstants.ATK] = baseAtk;
    }

    public void setBaseDef(int baseDef)
    {
		this.baseStats[StatConstants.DEF] = baseDef;
    }

    public void setBaseSAtk(int baseSAtk)
    {
		this.baseStats[StatConstants.SATK] = baseSAtk;
    }

    public void setBaseSDef(int baseSDef)
    {
		this.baseStats[StatConstants.SDEF] = baseSDef;
    }

    public void setBaseSpe(int baseSpe)
    {
		this.baseStats[StatConstants.SPE] = baseSpe;
    }

    @Override
    public String toString()
    {
		String showdownExport = "";

		showdownExport += name + " @ " + item + "\n";
		showdownExport += "Ability: " + abilities.get(abilities.size() - 1) + "\n";
		showdownExport += "Level: " + stats[0].getLevel() + "\n";
		showdownExport += "EVs: ";
		for (int i = 0; i < 6; i++)
		{
			int currentEVs = stats[i].getEVs();
			if (currentEVs != 0)
			{
				showdownExport += currentEVs;
				switch (i)
				{
					case 0:
						showdownExport += " HP / ";
						break;
					case 1:
						showdownExport += " Atk / ";
						break;
					case 2:
						showdownExport += " Def / ";
						break;
					case 3:
						showdownExport += " SpA / ";
						break;
					case 4:
						showdownExport += " SpD / ";
						break;
					case 5:
						showdownExport += " Spe / ";
						break;
				}
			}
		}

		showdownExport += "\n" + nature + " Nature";
		if (stats[0].getIVs() != 31 || stats[1].getIVs() != 31 || stats[2].getIVs() != 31 || stats[3].getIVs() != 31 || stats[4].getIVs() != 31 || stats[5].getIVs() != 31)
		{
			showdownExport += "\nIVs: ";
			for (int i = 0; i < 6; i++)
			{
				int currentIVs = stats[i].getIVs();
				if (currentIVs != 31)
				{
					showdownExport += currentIVs;
					switch (i)
					{
						case 0:
							showdownExport += " HP / ";
							break;
						case 1:
							showdownExport += " Atk / ";
							break;
						case 2:
							showdownExport += " Def / ";
							break;
						case 3:
							showdownExport += " SpA / ";
							break;
						case 4:
							showdownExport += " SpD / ";
							break;
						case 5:
							showdownExport += " Spe / ";
							break;
					}
				}
			}
		}


		for (int i = 0; i < moves.length; i++)
		{
			showdownExport += "\n- " + moves[i].getName();
		}


		return showdownExport;
	}
}

