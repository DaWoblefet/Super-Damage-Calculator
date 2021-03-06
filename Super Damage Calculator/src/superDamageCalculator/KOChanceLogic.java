package superDamageCalculator;
import java.util.ArrayList;

public class KOChanceLogic
{
	private int HPStat;
	private long[][] dmgRolls;
	private int rawCount;
	private int possibleCombinations;
	
	public KOChanceLogic (int HPStat, long[][] dmgRolls)
	{
		this.HPStat = HPStat;
		this.dmgRolls = dmgRolls;
		
		this.rawCount = getKOChance();
		this.possibleCombinations = (int) Math.pow(16, dmgRolls.length);
	}
	
	public KOChanceLogic (int HPStat, int[][] dmgRolls)
	{
		this.HPStat = HPStat;
		for (int i = 0; i < dmgRolls.length; i++)
		{
			for (int j = 0; j < 16; j++)
			{
				this.dmgRolls[i][j] = dmgRolls[i][j];
			}
		}
		
		this.rawCount = getKOChance();
		this.possibleCombinations = (int) Math.pow(16, dmgRolls.length);
	}
	
	public String getPercentToKO()
	{
		return "" + (100.0 * rawCount / possibleCombinations);
	}
	
	public String getPercentToKO(int decimals)
	{
		return String.format("%." + decimals + "f", (100.0 * rawCount / possibleCombinations));
	}
	
	public String getFractionToKO()
	{
		return rawCount + "/" + possibleCombinations;
	}
	
	public String getSimplifiedFractionToKO()
	{
		return reduceFraction(rawCount, possibleCombinations);
	}
	
	public int getKOChance()
	{
		//Turns all the sets of damage rolls into a big arraylist.
		ArrayList<Long> combinedRolls = new ArrayList<Long>();

		for (int i = 0; i < dmgRolls[0].length; i++)
		{
			combinedRolls.add(dmgRolls[0][i]);
		}

		int result = getKOChance(combinedRolls, 1);
		return result;
	}
	
	//Generates all combinations of possible damage rolls recursively and compares each against an HP stat. Blame Stats if the algorithm's bad.
	public int getKOChance(ArrayList<Long> combinedRolls, int beginIndex)
	{

		if (beginIndex >= dmgRolls.length)
		{
			int count = 0;

			for (int i = 0; i < combinedRolls.size(); i++)
			{
				if (combinedRolls.get(i) >= HPStat) count++;
			}

			//System.out.println(100.0 * count / combinedRolls.size() + "% chance to KO");
			//System.out.println("Fraction equivalent: " + reduceFraction(count, combinedRolls.size()));
			return count;
		}

		ArrayList<Long> newRolls = new ArrayList<Long>();

		for (int i = 0; i < combinedRolls.size(); i++)
		{
			for (int j = 0; j < dmgRolls[beginIndex].length; j++)
			{
				newRolls.add(combinedRolls.get(i) + dmgRolls[beginIndex][j]);
			}
		}

		return getKOChance(newRolls, beginIndex + 1);
	}

	public String reduceFraction(int top, int bottom)
	{
		int gcd = getGCD(top, bottom);
		return top / gcd + "/" + bottom / gcd;
	}

	public int getGCD(int top, int bottom)
	{
		if (bottom == 0) {return top;}
		return getGCD(bottom, top%bottom);
	}
}
