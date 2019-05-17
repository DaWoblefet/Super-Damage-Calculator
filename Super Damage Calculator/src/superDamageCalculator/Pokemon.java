/* Models a Pokemon. Mostly getters and setters for various properties.
 * Pokemon's toString function returns a Showdown export. */

package superDamageCalculator;
import java.util.ArrayList;
import java.util.HashMap;

import static superDamageCalculator.StatConstants.*;

public class Pokemon
{
    private String name;
    
    private HashMap<String, Move> movedex = new Movedex().getMovedex();
	private HashMap<String, Item> items = new Itemdex().getItems();

    private String types[] = new String[2];
    private boolean isTrickOrTreat;
    private boolean isForestsCurse;
    
    private ArrayList<String> formes = new ArrayList<String>();
    private String currentForme;
    
    private String ability;
    private Move[] moves = new Move[4];
    
    private Stat[] stats = new Stat[6];
    private int currentHP; //The actual HP a Pokemon has; e.g. for 175/176 HP, 175 is currentHP
	private Item item;
    private String nature;
    private String status;
    private String gender;

	private int[] baseStats = new int[6];
    private HashMap<String, Integer> natures = new Nature().natures;

    private double weightInKg;

    public Pokemon(String name)
    {
		this.name = name;
		for (int i = 0; i < moves.length; i++)
		{
			this.moves[i] = movedex.get("(none)").cloneMove();
		}
		
		//0 EVs, 0 IVs, 100 base stat, level 50, Hardy Nature
		for (int i = 0; i < stats.length; i++)
		{
			stats[i] = new Stat(0, 31, 100, 50, natures.get("Hardy"), "--", i);
		}
		this.nature = "Hardy";
		this.item = items.get("(none)");
		this.status = "Healthy";
		this.gender = "Genderless";
		this.currentForme = name;
    }

    public String getName()
	{
		return name;
    }
    
    public void setName(String name)
    {
    	this.name = name;
    }

	public ArrayList<String> getFormes()
	{
		return this.formes;
	}
	
	public void setFormes(String...formes)
	{
		for (int i = 0; i < formes.length; i++)
		{
			this.formes.add(formes[i]);
		}
	}
	
	public void addForme(String forme)
	{
		this.formes.add(forme);
	}
	
	public void setCurrentForme(String currentForme)
	{
		this.currentForme = currentForme;
	}
	
	public String getCurrentForme()
	{
		return this.currentForme;
	}
	
	public void switchForme(Pokemon newForme)
	{
		this.setTypes(newForme.getType(0), newForme.getType(1));
		this.setAbility(newForme.getAbility());
		for (int i = 0; i < newForme.baseStats.length; i++)
		{
			this.setBaseStat(newForme.baseStats[i], i);
		}
		this.setWeight(newForme.weightInKg);
		this.setCurrentForme(newForme.getName());
	}
	
	public double getWeight()
    {
		return this.weightInKg;
    }

    public void setWeight(double weightInKg)
    {
		this.weightInKg = weightInKg;
    }
    
    //Stats
	public Stat getStat(int statType)
	{
		return stats[statType];
	}

	public void setStat(int EVs, int IVs, int baseStat, int level, int nature, String boostLevel, int currentStat)
	{
		stats[currentStat] = new Stat(EVs, IVs, baseStat, level, nature, boostLevel, currentStat);
	}

	public void setStat(int EVs, int IVs, int level, int nature, String boostLevel, int currentStat)
	{
		stats[currentStat] = new Stat(EVs, IVs, baseStats[currentStat], level, nature, boostLevel, currentStat);
	}
	
	public int getBaseStat(int statIndex)
    {
		return this.baseStats[statIndex];
	}
	
	public int[] getAllBaseStats()
	{
		return baseStats;
	}
	
	public void setBaseStat(int baseStat, int statIndex)
	{
		this.baseStats[statIndex] = baseStat;
	}
	
	public void setAllBaseStats(int hp, int atk, int def, int spa, int spd, int spe)
	{	
		this.baseStats[HP] = hp;
		this.baseStats[ATK] = atk;
		this.baseStats[DEF] = def;
		this.baseStats[SATK] = spa;
		this.baseStats[SDEF] = spd;
		this.baseStats[SPE] = spe;
		
		//0 EVs, 0 IVs, level 50, Hardy Nature
		for (int i = 0; i < stats.length; i++)
		{
			stats[i] = new Stat(0, 31, this.baseStats[i], 50, natures.get("Hardy"), "--", i);
		}
	}
	
    public int getCurrentHP()
    {
		return currentHP;
	}

	public void setCurrentHP(int currentHP)
	{
		this.currentHP = currentHP;
	}
    
	public String getNature()
	{
		return this.nature;
	}

	public void setNature(String nature)
	{
		this.nature = nature;
	}

    public String getType(int index)
    {
    	return types[index];
    }
    
    public void setType(String type, int index)
    {
    	types[index] = type;
    }
    
    public void setTypes(String typeZero, String typeOne)
    {
    	types[0] = typeZero;
    	types[1] = typeOne;
    }
    
    public boolean isTrickOrTreat()
    {
		return isTrickOrTreat;
	}

	public void setTrickOrTreat(boolean isTrickOrTreat)
	{
		this.isTrickOrTreat = isTrickOrTreat;
	}

	public boolean isForestsCurse()
	{
		return isForestsCurse;
	}

	public void setForestsCurse(boolean isForestsCurse)
	{
		this.isForestsCurse = isForestsCurse;
	}

	public String getAbility()
	{
		return ability;
	}
    
    public void setAbility(String ability)
    {
    	this.ability = ability;
    }

    public Move getMove(int moveslot)
	{
		return moves[moveslot];
	}

    public void setMove(Move move, int moveslot)
    {
		moves[moveslot] = move;
	}

 	public Item getItem()
    {
		return this.item;
	}

	public void setItem(String item)
	{
		this.item = items.get(item);
	}
    
    public String getStatus()
    {
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}
	
    public String getGender()
    {
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	//Used to "clone" a Pokemon off the hashmap so one doesn't interfere with another.
	public Pokemon clonePokemon()
	{
		Pokemon pokemon = new Pokemon(name);
		pokemon.setName(name);
		pokemon.setTypes(types[0], types[1]);
		pokemon.setAbility(ability);
		pokemon.setAllBaseStats(baseStats[HP], baseStats[ATK], baseStats[DEF],
								baseStats[SATK], baseStats[SDEF], baseStats[SPE]);
		pokemon.setWeight(weightInKg);
		for (int i = 0; i < formes.size(); i++)
		{
			pokemon.addForme(formes.get(i));
		}

		return pokemon;		
	}

	@Override
    public String toString()
    {
		String showdownExport = name;
		if (!item.getName().equals("(none)"))
		{
			showdownExport += " @ " + item;
		}
		showdownExport += "\nAbility: " + ability + "\n";
		
		int level = stats[HP].getLevel();
		if (level != 100)
		{
			showdownExport += "Level: " + stats[HP].getLevel() + "\n";
		}
		
		boolean first = true;
		boolean hasEVs = false;
		for (int i = 0; i < stats.length; i++)
		{
			if (stats[i].getEVs() > 0)
			{
				hasEVs = true;
				break;
			}
		}
		if (hasEVs)
		{
			for (int i = 0; i < 6; i++)
			{
				int currentEVs = stats[i].getEVs();
				if (currentEVs == 0) continue;
				if (first)
				{
					showdownExport += "EVs: ";
					first = false;
				}
				else
				{
					showdownExport += " / ";
				}
				showdownExport += currentEVs;
				switch (i)
				{
					case 0:
						showdownExport += " HP";
						break;
					case 1:
						showdownExport += " Atk";
						break;
					case 2:
						showdownExport += " Def";
						break;
					case 3:
						showdownExport += " SpA";
						break;
					case 4:
						showdownExport += " SpD";
						break;
					case 5:
						showdownExport += " Spe";
						break;
				}
			}
		}
		if (!first)
		{
			showdownExport += "\n";
		}

		showdownExport += nature + " Nature\n";
		
		first = true;
		boolean hasIVs = false;
		for (int i = 0; i < stats.length; i++)
		{
			if (stats[i].getIVs() != 31)
			{
				hasIVs = true;
				break;
			}
		}
		if (hasIVs)
		{
			for (int i = 0; i < 6; i++)
			{
				int currentIVs = stats[i].getIVs();
				if (currentIVs == 31) continue;
				if (first)
				{
					showdownExport += "IVs: ";
					first = false;
				}
				else
				{
					showdownExport += " / ";
				}
				showdownExport += currentIVs;
				switch (i)
				{
					case 0:
						showdownExport += " HP";
						break;
					case 1:
						showdownExport += " Atk";
						break;
					case 2:
						showdownExport += " Def";
						break;
					case 3:
						showdownExport += " SpA";
						break;
					case 4:
						showdownExport += " SpD";
						break;
					case 5:
						showdownExport += " Spe";
						break;
				}
			}
		}
		if (!first)
		{
			showdownExport += "\n";
		}

		for (int i = 0; i < moves.length; i++)
		{
			if (!moves[i].getName().equals("(none)"))
			{
				showdownExport += "- " + moves[i].getName() + "\n";
			}
		}

		return showdownExport.trim();
	}
}

//getDexNumber and setDexNumber are only used for sprite parsing
/*public int getDexNumber()
{
	return this.dexNumber;
}

public void setDexNumber(int dexNumber)
{
	this.dexNumber = dexNumber;
}*/
