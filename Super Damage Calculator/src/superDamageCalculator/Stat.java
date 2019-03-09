/* Models a Pokemon's stats without modifiers. The Pokemon class contains 6 instances of these. */

package superDamageCalculator;
import java.util.Arrays;
import java.util.HashMap;
import static superDamageCalculator.StatConstants.*;

public class Stat
{
	private int EVs;
	private int IVs;
	private int baseStat;
	private int level;
	private int nature;
	private int currentStat;
	private HashMap<String, Integer> natures = new Nature().natures;

	public Stat(int EVs, int IVs, int baseStat, int level, int nature, int currentStat)
	{
		this.EVs = EVs;
		this.IVs = IVs;
		this.baseStat = baseStat;
		this.level = level;
		this.nature = nature;
		this.currentStat = currentStat;
	}

	public int getEVs()
	{
		return EVs;
	}

	public int getIVs()
	{
		return IVs;
	}

	public int getBaseStat()
	{
		return baseStat;
	}

	public int getLevel()
	{
		return level;
	}

	public int getNature()
	{
		return nature;
	}

	public void setEVs(int EVs)
	{
		this.EVs = EVs;
	}

	public void setIVs(int IVs)
	{
		this.IVs = IVs;
	}

	public void setBaseStat(int baseStat)
	{
		this.baseStat = baseStat;
	}

	public void setLevel(int level)
	{
		this.level = level;
	}

	public void setNature(int nature)
	{
		this.nature = nature;
	}

	public int calculateStat()
	{
		double total = 0;
		//Shedinja
		if (currentStat == HP && baseStat == 1)
		{
			total = 1;
		}
		//Normal HP
		else if (currentStat == HP)
		{
			total = Math.floor((2 * baseStat + IVs + Math.floor(EVs / 4)) * level / 100) + level + 10;
		}
		//All other stats
		else
		{
			double natureMod = getNatureMod();
			total = Math.floor((Math.floor((2 * baseStat + IVs + Math.floor(EVs / 4)) * level / 100) + 5) * natureMod);
		}

		return (int) total;
	}

	/* Retrieves the nature mod (1.1, 0.9, or 1).
	   Switches on whatever stat is getting calculated, not the Nature itself.
	   Simplifies if statement by using a makeshift arraylist and checking if that Nature matches the mon's nature.*/
	public double getNatureMod()
	{
		double mod = 1;

		switch (this.currentStat)
		{
			case ATK:
				if (Arrays.asList(natures.get("Adamant"), natures.get("Brave"), natures.get("Lonely"), natures.get("Naughty")).contains(nature))
				{
					mod = 1.1;
				}
				else if (Arrays.asList(natures.get("Bold"), natures.get("Calm"), natures.get("Modest"), natures.get("Timid")).contains(nature))
				{
					mod = 0.9;
				}
				else
				{
					mod = 1;
				}
				break;

			case DEF:
				if (Arrays.asList(natures.get("Bold"), natures.get("Impish"), natures.get("Lax"), natures.get("Relaxed")).contains(nature))
				{
					mod = 1.1;
				}
				else if (Arrays.asList(natures.get("Gentle"), natures.get("Hasty"), natures.get("Lonely"), natures.get("Mild")).contains(nature))
				{
					mod = 0.9;
				}
				else
				{
					mod = 1;
				}
				break;

			case SATK:
				if (Arrays.asList(natures.get("Mild"), natures.get("Modest"), natures.get("Quiet"), natures.get("Rash")).contains(nature))
				{
					mod = 1.1;
				}
				else if (Arrays.asList(natures.get("Adamant"), natures.get("Careful"), natures.get("Impish"), natures.get("Jolly")).contains(nature))
				{
					mod = 0.9;
				}
				else
				{
					mod = 1;
				}
				break;

			case SDEF:
				if (Arrays.asList(natures.get("Calm"), natures.get("Careful"), natures.get("Gentle"), natures.get("Sassy")).contains(nature))
				{
					mod = 1.1;
				}
				else if (Arrays.asList(natures.get("Lax"), natures.get("Naive"), natures.get("Naughty"), natures.get("Rash")).contains(nature))
				{
					mod = 0.9;
				}
				else
				{
					mod = 1;
				}
				break;


			case SPE:
				if (Arrays.asList(natures.get("Hasty"), natures.get("Jolly"), natures.get("Naive"), natures.get("Timid")).contains(nature))
				{
					mod = 1.1;
				}
				else if (Arrays.asList(natures.get("Brave"), natures.get("Quiet"), natures.get("Relaxed"), natures.get("Sassy")).contains(nature))
				{
					mod = 0.9;
				}
				else
				{
					mod = 1;
				}
				break;

			default:
				System.out.println("Something went wrong");
				break;
		}

		return mod;
	}
}
