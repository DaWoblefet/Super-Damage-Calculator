package superDamageCalculator;

/* Models damage calculation based on the games.

Quick references:
https://www.smogon.com/bw/articles/bw_complete_damage_formula
https://docs.google.com/document/d/1uJtdnOTtM6b0uu7bNkRHhmvNvxgHrtQ4mSXgimJ1_P0/edit
https://github.com/jake-white/VGC-Damage-Calculator/blob/gh-pages/script_res/damage.js
*/
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map.*;
import java.util.Objects;

public class CalculateDamage
{
	private HashMap<String, Move> movedex = new Movedex().movedex;
	private HashMap<String, Integer> types = new Type().types;
	private HashMap<String, Integer> natures = new Nature().natures;
	private double typechart[][] = new Type().typeChart;

	private String attackerName;
	private String attackerTypeLeft;
	private String attackerTypeRight;
	private int attackerLevel;
	private String attackerForme;
	private int attackerOffenseStat;
	private int attackerOffenseStatEVs;
	private int attackerSpeedStat;
	private int attackerOffenseChange;
	private int attackerSpeedChange;
	private String attackerNature;
	private String attackerAbility;
	private String attackerItem;
	private String attackerStatus;

	private Move move;
	private int moveBP;
	private String moveType;
	private String moveCategory;
	private boolean isCrit;
	private boolean isZ;

	private String defenderName;
	private String defenderTypeLeft;
	private String defenderTypeRight;
	private String defenderForme;
	private int defenderHPStat;
	private int defenderHPStatEVs;
	private int defenderDefenseStat;
	private int defenderDefenseStatEVs;
	private int defenderSpeedStat;
	private int defenderDefenseChange;
	private int defenderSpeedChange;
	private String defenderNature;
	private String defenderAbility;
	private String defenderItem;
	private String defenderStatus;

	private String format;
	private String terrain;
	private String weather;
	private boolean isHelpingHand;
	private boolean isProtect;
	private boolean isReflect;
	private boolean isLightScreen;
	private boolean isFriendGuard;

	private int[] damageRolls = new int[16];
	private String damageOutput = "";
	private String damageOutputShort = "";
	private double typeMod;
	private int finalAttack;
	private int finalDefense;
	private int finalBasePower;

	/* Passes in the variables affecting damage calculation, sets them, then starts damage calculation. */
	public CalculateDamage(Object[] damageVariablesLeft, Object[] damageVariablesRight, Object[] damageVariablesCenter)
	{
		attackerName = (String) damageVariablesLeft[0];
		attackerTypeLeft = (String) damageVariablesLeft[1];
		attackerTypeRight = (String) damageVariablesLeft[2];
		attackerLevel = (int) damageVariablesLeft[3];
		attackerForme = (String) damageVariablesLeft[4];
		attackerOffenseStat = (int) damageVariablesLeft[5];
		attackerOffenseStatEVs = (int) damageVariablesLeft[6];
		attackerSpeedStat = (int) damageVariablesLeft[7];
		attackerOffenseChange = (int) damageVariablesLeft[8];
		attackerSpeedChange = (int) damageVariablesLeft[9];
		attackerNature = (String) damageVariablesLeft[10];
		attackerAbility = (String) damageVariablesLeft[11];
		attackerItem = (String) damageVariablesLeft[12];
		attackerStatus = (String) damageVariablesLeft[13];

		move = movedex.get((String) damageVariablesLeft[14]);
		moveBP = (int) damageVariablesLeft[15];
		moveType = (String) damageVariablesLeft[16];
		moveCategory = (String) damageVariablesLeft[17];
		isCrit = (boolean) damageVariablesLeft[18];
		isZ = (boolean) damageVariablesLeft[19];

		defenderName = (String) damageVariablesRight[0];
		defenderTypeLeft = (String) damageVariablesRight[1];
		defenderTypeRight = (String) damageVariablesRight[2];
		defenderForme = (String) damageVariablesRight[3];
		defenderHPStat = (int) damageVariablesRight[4];
		defenderHPStatEVs = (int) damageVariablesRight[5];
		defenderDefenseStat = (int) damageVariablesRight[6];
		defenderDefenseStatEVs = (int) damageVariablesRight[7];
		defenderSpeedStat = (int) damageVariablesRight[8];
		defenderDefenseChange = (int) damageVariablesRight[9];
		defenderSpeedChange = (int) damageVariablesRight[10];
		defenderNature = (String) damageVariablesRight[11];
		defenderAbility = (String) damageVariablesRight[12];
		defenderItem = (String) damageVariablesRight[13];
		defenderStatus = (String) damageVariablesRight[14];

		format = (String) damageVariablesCenter[0];
		terrain = (String) damageVariablesCenter[1];
		weather = (String) damageVariablesCenter[2]; //skip Auras
		isHelpingHand = (boolean) damageVariablesCenter[4];
		isProtect = (boolean) damageVariablesCenter[5];
		isReflect = (boolean) damageVariablesCenter[6];
		isLightScreen = (boolean) damageVariablesCenter[7];
		isFriendGuard = (boolean) damageVariablesCenter[8];

		typeMod = typechart[types.get(moveType)][types.get(defenderTypeLeft)] * typechart[types.get(moveType)][types.get(defenderTypeRight)];
		if (moveCategory.equals("Status") || typeMod == 0)
		{
			if (moveType.equals("Electric") && (defenderTypeLeft.equals("Ground") || defenderTypeLeft.equals("Ground")))
			{
				writeDamageOutput("try using Soak first");
			}
			else
			{
				writeDamageOutput("nice move there m8");
			}
		}
		else //Do the damage calc like normal
		{
			calculateFinalAttack();
			calculateFinalDefense();
			calculateFinalBasePower();
			mainCalculation();
			writeDamageOutput();
		}
	}

	public void calculateFinalAttack()
	{
		int baseAttack = attackerOffenseStat;
		//System.out.println("Attack is: " + baseAttack);

		/* Modifiers are:
		+6 -6
		Thick Fat
		Torrent
		Guts
		Swarm
		Overgrow
		Plus/Minus
		Blaze
		Defeatist
		Pure / Huge Power
		Solar Power
		Hustle
		Flash Fire
		Slow Start
		Flower Gift
		Thick Club
		Deep Sea Tooth
		Light Ball
		Soul Dew
		Choice Band / Choice Specs
		*/

		finalAttack = baseAttack;
	}

	public void calculateFinalDefense()
	{
		int baseDefense = defenderDefenseStat;
		//System.out.println("Defense is: " + baseDefense);
		/*
		+6 -6
		Sandstorm has priority

		Marvel Scale
		Flower Gift
		Deep Sea Scale
		Metal Powder
		Eviolite
		Soul Dew
		*/
		finalDefense = baseDefense;
	}

	public void calculateFinalBasePower()
	{
		int startingBP = moveBP;
		//System.out.println("BP is: " + startingBP);
		/*
		Technician
		Flare Boost
		Analytic
		Reckless
		Iron Fist
		Toxic Boost
		Rivalry
		Sand Force
		Heatproof
		Dry Skin
		Sheer force
		Plates / increase / others
		Muscle Band
		Wise Glasses
		the Sinnoh trio orbs
		Normal Gem
		Facade
		Brine
		Venoshock
		Retaliate
		Fusion Bolt / Fusion Flare
		Me First
		Solar Beam
		Charge
		HH
		Water Sport
		Mud Sport
		*/
		finalBasePower = startingBP;
	}

	public void mainCalculation()
	{
		double baseDamage = (int) Math.floor((2 * attackerLevel / 5)  + 2);
		baseDamage = (int) Math.floor((baseDamage * finalBasePower * finalAttack) / finalDefense);
		baseDamage = (int) (Math.floor(baseDamage / 50)) + 2;

		//System.out.println("baseDamage: " + baseDamage);

		double damagePreRolls = baseDamage;

		//If spread move, 0.75x
		if (format.equals("Doubles") && move.getIsSpread() && !(isZ))
		{
			damagePreRolls = pokeRound((damagePreRolls * 0xC00) / 0x1000);
		}

		//If Rain, Sun, or Strong Winds
		if ((moveType.equals("Fire") && weather.equals("Sun")) || (moveType.equals("Water") && weather.equals("Rain")))
		{
			damagePreRolls = pokeRound((damagePreRolls * 0x1800) / 0x1000);
		}
		else if ((moveType.equals("Water") && weather.equals("Sun")) || (moveType.equals("Fire") && weather.equals("Rain")))
		{
			damagePreRolls = pokeRound((damagePreRolls * 0x800) / 0x1000);
		}
		else if (weather.equals("Strong Winds") && (defenderTypeLeft.equals("Flying") || defenderTypeRight.equals("Flying")) && typechart[types.get(moveType)][types.get("Flying")] > 1)
		{
			damagePreRolls = pokeRound((damagePreRolls * 0x800) / 0x1000);
		}

		//If Terrain (assumed to be here, requires Pokemon is on the ground)
		if (!(attackerTypeLeft.equals("Flying")) || !(attackerTypeRight.equals("Flying")) || !(attackerAbility.equals("Levitate")) || !(attackerItem.equals("Air Balloon")))
		{
			if (terrain.equals("Electric") && moveType.equals("Electric"))
			{
				damagePreRolls = pokeRound((damagePreRolls * 0x1800) / 0x1000);
			}
			if (terrain.equals("Grassy") && moveType.equals("Grass"))
			{
				damagePreRolls = pokeRound((damagePreRolls * 0x1800) / 0x1000);
			}
			if (terrain.equals("Psychic") && moveType.equals("Psychic"))
			{
				damagePreRolls = pokeRound((damagePreRolls * 0x1800) / 0x1000);
			}
		}

		if (!(defenderTypeLeft.equals("Flying")) || !(defenderTypeRight.equals("Flying")) || !(defenderAbility.equals("Levitate")) || !(defenderItem.equals("Air Balloon")))
		{
			if (terrain.equals("Misty") && moveType.equals("Dragon"))
			{
				damagePreRolls = pokeRound((damagePreRolls * 0x800) / 0x1000);
			}
			//NOTE: This is different from TT's location for Grassy Terrain halving, but TT's location is certainly wrong. See: https://www.smogon.com/forums/threads/pokemon-sun-moon-battle-mechanics-research.3586701/post-7305700
			if (terrain.equals("Grassy") && (move.getName().equals("Earthquake") ||  move.getName().equals("Bulldoze") ||move.getName().equals("Magnitude")))
			{
				damagePreRolls = pokeRound((damagePreRolls * 0x800) / 0x1000);
			}
		}

		//If crit
		if (isCrit)
		{
			damagePreRolls = (int) Math.floor(damagePreRolls * 1.5);
		}
		//Random factor
		for (int i = 0; i < 16; i++)
		{
			damageRolls[i] = (int) Math.floor((damagePreRolls * (85 + i)) / 100);
		}
		//System.out.println("After random factor: " + Arrays.toString(damageRolls));

		//If STAB
		if (moveType.equals(attackerTypeLeft) || (moveType.equals(attackerTypeRight) || attackerAbility.equals("Protean")))
		{
			double stabMod = 1.5;
			if (attackerAbility.equals("Adaptability"))
			{
				stabMod = 2.0;
			}
			for (int i = 0; i < 16; i++)
			{
				damageRolls[i] = (int) Math.floor(damageRolls[i] * stabMod);
			}
		}

		//Type chart. The modifier was calculated already when it checked to see if the move was immune.
		for (int i = 0; i < 16; i++)
		{
			damageRolls[i] = (int) Math.floor(damageRolls[i] * typeMod);
		}

		//If burned. Currently does not check for Guts.
		if (attackerStatus.equals("Burned") && moveCategory.equals("Physical") && !(attackerAbility.equals("Guts")) && !(move.getName().equals("Facade")))
		{
			for (int i = 0; i < 16; i++)
			{
				damageRolls[i] = (int) Math.floor(damageRolls[i] / 2);
			}
		}
		/*****Final modifiers*****
		*Final modifiers are specifically chained together. */

		ArrayList<Integer> finalModifiers = new ArrayList<Integer>();

		//Reflect and Light Screen (Aurora Veil includes both by default)
		if ((isReflect && moveCategory.equals("Physical")) || (isLightScreen && (moveCategory.equals("Special") || moveCategory.equals("Psyshock effect"))))
		{
			if (format.equals("Doubles"))
			{
				finalModifiers.add(0xA8F);
			}
			else //Singles multiplier
			{
				finalModifiers.add(0x800);
			}
		}

		//Multiscale / Shadow Shield. Assumes the target is at full HP.
		if (defenderAbility.equals("Multiscale") || defenderAbility.equals("Shadow Shield"))
		{
			finalModifiers.add(0x800);
		}

		//Tinted Lens
		if (attackerAbility.equals("Tinted Lens") && typeMod < 1)
		{
			finalModifiers.add(0x2000);
		}

		//Friend Guard
		if (isFriendGuard)
		{
			finalModifiers.add(0xC00);
		}

		//Sniper
		if (attackerAbility.equals("Sniper") && isCrit)
		{
			finalModifiers.add(0x1800);
		}

		//Solid Rock / Filter
		if (defenderAbility.equals("Solid Rock") || defenderAbility.equals("Filter"))
		{
			finalModifiers.add(0xC00);
		}

		//Metronome
		if (attackerItem.equals("Metronome"))
		{
			//Atm do nothing because it requires a specific turn count passed in.
		}

		//Expert Belt
		if (attackerItem.equals("Expert Belt") && typeMod > 1)
		{
			finalModifiers.add(0x1333);
		}

		//Life Orb
		if (attackerItem.equals("Life Orb"))
		{
			finalModifiers.add(0x14CC);
		}

		//Calls a couple functions to check if it is a resist Berry, and what type it is.
		if (isResistBerry())
		{
			if (getResistBerryType().equals(moveType) && (typeMod > 1 || moveType.equals("Normal")))
			{
				finalModifiers.add(0x800);
			}
		}

		//Double-powered moves are yet to be implemented.

		//Applying the final modifiers
		double finalMod = chainMods(finalModifiers);
		for (int i = 0; i < 16; i++)
		{
			damageRolls[i] = pokeRound((damageRolls[i] * finalMod) / 0x1000);
		}

		//PS has Z-moves quartered post-final modifiers, TT has it during final modifiers. I'm assuming it's rounded.
		if (isZ && isProtect)
		{
			for (int i = 0; i < 16; i++)
			{
				damageRolls[i] = pokeRound((damageRolls[i] * 0x400) / 0x1000);
			}
		}

		//System.out.println();
	}

	public boolean isResistBerry()
	{
		if (Arrays.asList("Chilan Berry", "Chople Berry", "Coba Berry", "Kebia Berry", "Shuca Berry", "Charti Berry", "Tanga Berry",
						  "Kasib Berry", "Babiri Berry", "Occa Berry", "Passho Berry", "Rindo Berry", "Wacan Berry", "Payapa Berry",
						  "Yache Berry", "Haban Berry", "Colbur Berry", "Roseli Berry").contains(defenderItem))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public String getResistBerryType()
	{
		int resistBerryType = (Arrays.asList("Chilan Berry", "Chople Berry", "Coba Berry", "Kebia Berry", "Shuca Berry", "Charti Berry",
											 "Tanga Berry", "Kasib Berry", "Babiri Berry", "Occa Berry", "Passho Berry", "Rindo Berry",
											 "Wacan Berry", "Payapa Berry", "Yache Berry", "Haban Berry", "Colbur Berry", "Roseli Berry"
											 ).indexOf(defenderItem));
		HashMap<String, Integer> types = new Type().types;
		return getKeyByValue(types, resistBerryType);
	}

	public void writeDamageOutput()
	{
		String offense = "";
		String defense = "";
		if (moveCategory.equals("Physical"))
		{
			offense = "Atk";
			defense = "Def";
		}
		else if (moveCategory.equals("Special"))
		{
			offense = "SpA";
			defense = "SpD";
		}
		else if (moveCategory.equals("Psyshock effect"))
		{
			offense = "SpA";
			defense = "Def";
		}

		calculatePercentDamage();

		damageOutput += attackerOffenseStatEVs + attackerNature() + " " + offense + " ";
		damageOutput += attackerName + " " + move.getName() + " vs. ";
		damageOutput += defenderHPStatEVs + " HP / " + defenderDefenseStatEVs + defenderNature() + " " + defense + " ";
		damageOutput += defenderName + ": " + damageRolls[0] + "-" + damageRolls[15] + " ";
		damageOutput += damageOutputShort + " -- " + getXHKO();
	}

	public void writeDamageOutput(String message)
	{
		damageOutputShort += "(0-0%)";
		damageOutput += attackerName + " " + move.getName() + " vs. ";
		damageOutput += defenderName + ": 0 - 0 " + damageOutputShort +  " -- " + message;
	}

	public void calculatePercentDamage()
	{
		double minRollPercent = ((double) damageRolls[0] / (double) defenderHPStat) * 100;
		double maxRollPercent = ((double) damageRolls[15] / (double) defenderHPStat) * 100;

		damageOutputShort += "(" + String.format("%.2f", minRollPercent) + " - ";
		damageOutputShort += String.format("%.2f", maxRollPercent) + "%)";
	}

	public String getXHKO()
	{
		String result = "";

		if (damageRolls[15] >= defenderHPStat) //OHKO chance
		{
			double rollsThatOHKO = 0;
			for (int i = 0; i < damageRolls.length; i++)
			{
				if (damageRolls[i] >= defenderHPStat)
				{
					rollsThatOHKO++;
				}
			}
			if (rollsThatOHKO == 16)
			{
				result = "guaranteed OHKO";
			}
			else
			{
				double percentToOHKO = (rollsThatOHKO / damageRolls.length) * 100;
				result = percentToOHKO + "% chance to OHKO (" + (int) rollsThatOHKO + "/" + damageRolls.length + ")";
			}
		}

		//XHKO chance. Algorithm currently doesn't work / is too long. TODO: Figure out an algorithm.
		else
		{
			int smallestXHKO = (int) Math.ceil((double) defenderHPStat / damageRolls[15]);
			int largestXHKO = (int) Math.ceil((double) defenderHPStat / damageRolls[0]);

			ArrayList<Double> KOChances = new ArrayList<Double>();

			if (largestXHKO > 1)
			{
				if (smallestXHKO == largestXHKO)
				{
					result = "guaranteed " + smallestXHKO + "HKO";
				}
				else
				{
					result = smallestXHKO + "-" + largestXHKO + "HKO";
				}
			}
			/* Ignores the actual math for now.
			if (smallestXHKO == largestXHKO) //Only one possibility in the XHKO
			{
				System.out.println("XHKO: " + smallestXHKO);
				double percentToXHKO = getKOChance(smallestXHKO);
				result = String.format("%.2f", percentToXHKO) + "% chance to " + smallestXHKO + "HKO";
			}
			else
			{
				for (int i = smallestXHKO; i <= largestXHKO; i++)
				{
					double percentToXHKO = getKOChance(i);
					KOChances.add(percentToXHKO);
				}

				//Display the greatest % chance to XHKO, rather than the % chance of the smallestXHKO
				double max = 0;
				int maxPercentIndex = 0;
				for (int i = 0; i < KOChances.size(); i++)
				{
					if (KOChances.get(i) > max)
					{
						max = KOChances.get(i);
						maxPercentIndex = i;
					}
				}

				result = String.format("%.2f", KOChances.get(maxPercentIndex)) + "% chance to " + (smallestXHKO + maxPercentIndex) + "HKO";
			}
			*/
		}

		return result;
	}

	public double getKOChance(int xhko)
	{
		ArrayList<Integer> combinedRolls = new ArrayList<Integer>();

		for (int i = 0; i < damageRolls.length; i++)
		{
			combinedRolls.add(damageRolls[i]);
		}

		double result = getKOChance(combinedRolls, 1, xhko);
		return result;
	}

	public double getKOChance(ArrayList<Integer> combinedRolls, int beginIndex, int xhko)
	{
		if (beginIndex == xhko)
		{
			double count = 0;
			for (int i = 0; i < combinedRolls.size(); i++)
			{
				if (combinedRolls.get(i) >= defenderHPStat)
				{
					count++;
				}
			}
			return (count / combinedRolls.size()) * 100.0;
		}

		ArrayList<Integer> newRolls = new ArrayList<Integer>();

		for (int i = 0; i < combinedRolls.size(); i++)
		{
			for (int j = 0; j < damageRolls.length; j++)
			{
				newRolls.add(combinedRolls.get(i) + damageRolls[j]);
			}
		}

		getKOChance(newRolls, beginIndex + 1, xhko);
		//System.out.println("If I'm here, something went wrong.");
		return 0;
	}

	public String attackerNature()
	{
		String isPlusOrMinus = "";
		int natureNum = natures.get(attackerNature);
		if (moveCategory.equals("Physical"))
		{
			if (Arrays.asList(0, 3, 13, 17).contains(natureNum))
			{
				isPlusOrMinus = "+";
			}
			else if (Arrays.asList(2, 4, 15, 24).contains(natureNum))
			{
				isPlusOrMinus = "-";
			}
		}
		else if (moveCategory.equals("Special") || moveCategory.equals("Psyshock effect"))
		{
			if (Arrays.asList(14, 15, 18, 20).contains(natureNum))
			{
				isPlusOrMinus = "+";
			}
			else if (Arrays.asList(0, 5, 10, 11).contains(natureNum))
			{
				isPlusOrMinus = "-";
			}
		}
		return isPlusOrMinus;
	}

	public String defenderNature()
	{
		String isPlusOrMinus = "";
		int natureNum = natures.get(defenderNature);
		if (moveCategory.equals("Physical") || moveCategory.equals("Psyshock effect"))
		{
			if (Arrays.asList(2, 10, 12, 21).contains(natureNum))
			{
				isPlusOrMinus = "+";
			}
			else if (Arrays.asList(7, 9, 13, 14).contains(natureNum))
			{
				isPlusOrMinus = "-";
			}
		}
		else if (moveCategory.equals("Special"))
		{
			if (Arrays.asList(4, 5, 7, 22).contains(natureNum))
			{
				isPlusOrMinus = "-";
			}
			else if (Arrays.asList(12, 16, 17, 20).contains(natureNum))
			{
				isPlusOrMinus = "-";
			}
		}
		return isPlusOrMinus;
	}

	public static <T, E> T getKeyByValue(HashMap<T, E> map, E value)
	{
		for (Entry<T, E> entry : map.entrySet())
		{
			if (Objects.equals(value, entry.getValue()))
			{
				return entry.getKey();
			}
		}
		return null;
	}

	/* Game Freak rounds down on 0.5 decimals. */
	public int pokeRound(double num)
	{
		return num % 1 > 0.5 ? (int) Math.ceil(num) : (int) Math.floor(num);
	}

	public double chainMods(ArrayList<Integer> mods)
	{
	    double m = 0x1000;
	    for (int i = 0; i < mods.size(); i++)
	    {
	        if (mods.get(i) != 0x1000)
	        {
	            m = ((m * mods.get(i)) + 0x800) / 0x1000;
	        }
	    }
	    return m;
	}

	public int[] getDamageRolls()
	{
		return this.damageRolls;
	}

	public String getDamageOutput()
	{
		return this.damageOutput;
	}

	public String getDamageOutputShort()
	{
		return this.damageOutputShort;
	}
}
