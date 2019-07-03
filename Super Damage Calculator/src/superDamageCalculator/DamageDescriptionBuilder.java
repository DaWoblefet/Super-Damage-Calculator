/*Builds a description of the back-end damage calculation to be represented to the user.*/

package superDamageCalculator;

public class DamageDescriptionBuilder
{
	private String attackerName;
	private int attackerOffenseChange;
	private int attackerEVs;
	private String attackerNature;
	private String attackerItem;
	private String attackerAbility;
	private boolean isZ;
	private boolean isBurnt;
	private boolean isHelpingHand;
	private boolean isBattery;	
	private boolean knockOff;
	private boolean isParentalBond;
	private int[] pBondDamageRolls;
	private int pBondMinComboRoll;
	private int pBondMaxComboRoll;
	
	private String move;
	private String moveCategory;
	private int moveBP;
	private boolean hitsPhysical;
	private boolean usesPhysicalAttack;

	private String defenderName;
	private int defenderHPEVs;
	private int defenderCurrentHP;
	private int defenderDefenseChange;
	private int defenderDefEVs;
	private String defenderNature;
	private String defenderItem;
	private String defenderAbility;
	
	private String weather;
	private String terrain;
	private String aura;
	private String screen;
	
	private boolean isCrit;
	private boolean isFriendGuard;
	private boolean isProtect;
	
	private int[] damageRolls = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; //initialize to zero
	private int precision = 2;
	
	public DamageDescriptionBuilder(String attackerName, String defenderName, String move)
	{
		this.attackerName = attackerName;
		this.defenderName = defenderName;
		this.move = move;
	}
	
	public String getNoDamageDescription(String description)
	{
		String result = "";
		if (attackerAbility != null) {result += attackerAbility + " ";}
		result += attackerName + " " + move + " vs. " + defenderName + ": 0-0 (0-0%) -- " + description;
		return result;
	}
	
	public String getNoDamageShortDescription()
	{
		return move + " (0-0%)";
	}
	
	public String getShortDescription()
	{
		String result = move + " ";
		
		int minDamage = damageRolls[0];
		int maxDamage = damageRolls[15];
		
		if (isParentalBond)
		{
			minDamage = pBondMinComboRoll;
			maxDamage = pBondMaxComboRoll;
		}
		
		double minRollPercent = ((double) minDamage / (double) defenderCurrentHP) * 100;
		double maxRollPercent = ((double) maxDamage / (double) defenderCurrentHP) * 100;

		if (minRollPercent >= 100.0)
		{
			result += "(OHKO)";
		}
		else
		{
			result += "(" + String.format("%.1f", minRollPercent) + " - ";
			result += String.format("%.1f", maxRollPercent) + "%)";
		}
		
		return result;
	}
	
	public String getLongDescription()
	{
		String result = "";
		
		//Offensive stat notation
		if (attackerOffenseChange != 0)
		{
			if (attackerOffenseChange > 0) {result += "+";}
			result += attackerOffenseChange + " ";
		}
		result += attackerEVs;
		result += getAttackerNatureSign(attackerNature) + " ";
		result += usesPhysicalAttack ? "Atk " : "SpA ";
		
		//Additional attacker variables
		if (attackerItem != null) {result += attackerItem + " ";}
		if (attackerAbility != null) {result += attackerAbility + " ";}
		if (aura != null) {result += aura + " ";}
		result += attackerName + " ";
		if (isBurnt) {result += "burned ";}
		if (isHelpingHand) {result += "Helping Hand ";}
		if (isBattery) {result += "Battery ";}
		
		//Move data
		if (isZ) {result += "Z-";}
		result += move + " ";
		if (moveBP > 0) {result += "(" + moveBP + " BP) ";}
		if (knockOff) {result += "(1.5x BP) ";}
		
		result += "vs. ";
		
		//Defender stat notation
		if (defenderDefenseChange != 0)
		{
			if (defenderDefenseChange > 0) {result += "+";}
			result += defenderDefenseChange + " ";
		}
		result += defenderHPEVs + " HP / ";
		result += defenderDefEVs;
		result += getDefenderNatureSign(defenderNature) + " ";
		result += hitsPhysical ? "Def " : "SpD ";
		
		//Additional defender variables
		if (defenderItem != null) {result += defenderItem + " ";}
		if (defenderAbility != null) {result += defenderAbility + " ";}
		result += defenderName + " ";
		if (weather != null) {result += "in " + weather + " ";}
		if (terrain != null) {result += "in " + terrain + " Terrain ";}
		if (screen != null) {result += "through " + screen + " ";}
		if (isCrit) {result += "with a critical hit ";}
		if (isFriendGuard) {result += "through Friend Guard ";}
		if (isProtect) {result += "through Protect ";}
		
		//Damage rolls, %, and % to KO
		result = result.trim() + ": ";
		if (!isParentalBond)
		{
			result += damageRolls[0] + "-" + damageRolls[15] + " ";
		}
		else
		{
			pBondMinComboRoll = damageRolls[0] + pBondDamageRolls[0];
			pBondMaxComboRoll = damageRolls[15] + pBondDamageRolls[15];
			result += pBondMinComboRoll + "-" + pBondMaxComboRoll + " ";
		}
		result += calculatePercentDamage() + " -- ";
		result += getXHKO();
		
		return result;
	}
	
	public String getDamageRolls()
	{
		String result = "";
		
		result += !isParentalBond ? "(" : "(1st Hit: ";
		
		for (int i = 0; i < 15; i++)
		{
			result += damageRolls[i] + ", ";
		}
		result += damageRolls[15];
		
		result += !isParentalBond ? ")" : "; 2nd Hit: ";
		if (isParentalBond)
		{
			for (int i = 0; i < 15; i++)
			{
				result += pBondDamageRolls[i] + ", ";
			}
			result += pBondDamageRolls[15] + ")";
		}
		
		return result;
	}
	
	public String getXHKO()
	{
		String result;
		int smallestXHKO;
		int largestXHKO;
		
		
		if (!isParentalBond)
		{
			smallestXHKO = (int) Math.ceil((double) defenderCurrentHP / damageRolls[15]);
			largestXHKO = (int) Math.ceil((double) defenderCurrentHP / damageRolls[0]);
		}
		else
		{
			smallestXHKO = (int) Math.ceil((double) defenderCurrentHP / (damageRolls[15] + pBondDamageRolls[15]));
			largestXHKO = (int) Math.ceil((double) defenderCurrentHP / (damageRolls[0] + pBondDamageRolls[0]));
		}
		
		if (smallestXHKO == largestXHKO)
		{
			if (largestXHKO == 1)
			{
				result = "guaranteed OHKO";
			}
			else
			{
				result = "guaranteed " + largestXHKO + "HKO";
			}
		}
		else
		{
			if (smallestXHKO < 6 && !isParentalBond) //Don't bother checking % to 6HKO, etc
			{
				int damageRollDuplicates[][] = new int[smallestXHKO][16];
				for (int i = 0; i < smallestXHKO; i++)
				{
					damageRollDuplicates[i] = damageRolls; //make X copies for the XHKO chance.
				}
				KOChanceLogic xhkoChance = new KOChanceLogic(defenderCurrentHP, damageRollDuplicates);
				if (smallestXHKO == 1)
				{
					result = xhkoChance.getPercentToKO(precision) + "% chance to " + "OHKO ";
				}
				else
				{
					result = xhkoChance.getPercentToKO(precision) + "% chance to " + smallestXHKO + "HKO ";
				}
				result += "(" + xhkoChance.getSimplifiedFractionToKO() + ")";
			}
			else if (isParentalBond && smallestXHKO < 4) //only check for 3HKOs with Parental Bond
			{
				int damageRollDuplicates[][] = new int[smallestXHKO * 2][16];
				for (int i = 0; i < smallestXHKO * 2; i++)
				{
					damageRollDuplicates[i] = damageRolls;
					i++;
					damageRollDuplicates[i] = pBondDamageRolls;
				}
				
				KOChanceLogic xhkoChance = new KOChanceLogic(defenderCurrentHP, damageRollDuplicates);
				if (smallestXHKO == 1)
				{
					result = xhkoChance.getPercentToKO(precision) + "% chance to " + "OHKO ";
				}
				else
				{
					result = xhkoChance.getPercentToKO(precision) + "% chance to " + smallestXHKO + "HKO ";
				}
				result += "(" + xhkoChance.getSimplifiedFractionToKO() + ")";
			}
			else
			{
				result = "(" + smallestXHKO + "-" + largestXHKO + "HKO)";
			}
		}

		return result;
	}
	
	public String calculatePercentDamage()
	{
		String damageOutputShort;
		int minDamage = damageRolls[0];
		int maxDamage = damageRolls[15];
		
		if (isParentalBond)
		{
			minDamage = pBondMinComboRoll;
			maxDamage = pBondMaxComboRoll;
		}
		
		double minRollPercent = ((double) minDamage / (double) defenderCurrentHP) * 100;
		double maxRollPercent = ((double) maxDamage / (double) defenderCurrentHP) * 100;

		damageOutputShort = "(" + String.format("%." + precision + "f", minRollPercent) + " - ";
		damageOutputShort += String.format("%." + precision + "f", maxRollPercent) + "%)";
		
		return damageOutputShort;
	}
	
	public String getAttackerNatureSign(String nature)
	{
		String plusOrMinus = "";
		
		if (usesPhysicalAttack)
		{
			switch (nature)
			{
				case "Adamant": case "Brave": case "Lonely": case "Naughty":
					plusOrMinus = "+";
					break;
				case "Bold": case "Calm": case "Modest": case "Timid":
					plusOrMinus = "-";
					break;
				default:
					break;
			}
		}
		else
		{
			switch (nature)
			{
				case "Mild": case "Modest": case "Quiet": case "Rash":
					plusOrMinus = "+";
					break;
				case "Adamant": case "Careful": case "Impish": case "Jolly":
					plusOrMinus = "-";
					break;
				default:
					break;
			}
		}

		return plusOrMinus;
	}
	
	public String getDefenderNatureSign(String nature)
	{
		String plusOrMinus = "";
		
		if (hitsPhysical)
		{
			switch (nature)
			{
				case "Bold": case "Impish": case "Lax": case "Relaxed":
					plusOrMinus = "+";
					break;
				case "Gentle": case "Hasty": case "Lonely": case "Mild":
					plusOrMinus = "-";
					break;
				default:
					break;
			}
		}
		else
		{
			switch (nature)
			{
				case "Calm": case "Careful": case "Gentle": case "Sassy":
					plusOrMinus = "+";
					break;
				case "Lax": case "Naive": case "Naughty": case "Rash":
					plusOrMinus = "-";
					break;
				default:
					break;
			}
		}

		return plusOrMinus;
	}
	

	/* Getters and setters */
	
	public String getAttackerName() {
		return attackerName;
	}

	public void setAttackerName(String attackerName) {
		this.attackerName = attackerName;
	}

	public int getAttackerEVs() {
		return attackerEVs;
	}

	public void setAttackerEVs(int attackerEVs) {
		this.attackerEVs = attackerEVs;
	}

	public String getAttackerNature() {
		return attackerNature;
	}

	public void setAttackerNature(String attackerNature) {
		this.attackerNature = attackerNature;
	}

	public String getAttackerItem() {
		return attackerItem;
	}

	public void setAttackerItem(String attackerItem) {
		this.attackerItem = attackerItem;
	}

	public String getAttackerAbility() {
		return attackerAbility;
	}

	public void setAttackerAbility(String attackerAbility) {
		this.attackerAbility = attackerAbility;
	}

	public boolean isBurnt() {
		return isBurnt;
	}

	public void setBurnt(boolean isBurnt) {
		this.isBurnt = isBurnt;
	}

	public boolean isHelpingHand() {
		return isHelpingHand;
	}

	public void setHelpingHand(boolean isHelpingHand) {
		this.isHelpingHand = isHelpingHand;
	}

	public boolean isBattery() {
		return isBattery;
	}

	public void setBattery(boolean isBattery) {
		this.isBattery = isBattery;
	}

	public String getMove() {
		return move;
	}

	public void setMove(String move) {
		this.move = move;
	}

	public String getMoveCategory() {
		return moveCategory;
	}

	public void setMoveCategory(String moveCategory) {
		this.moveCategory = moveCategory;
		switch (moveCategory)
		{
			case "Physical":
				hitsPhysical = true;
				usesPhysicalAttack = true;
				break;
			case "Special":
				hitsPhysical = false;
				usesPhysicalAttack = false;
				break;
			case "Psyshock effect":
				hitsPhysical = true;
				usesPhysicalAttack = false;
				break;
			case "Status": //fall through
			default:
				break;
		}	
	}

	public void setMoveBP(int moveBP) {
		this.moveBP = moveBP;
	}

	public void setDefenderName(String defenderName) {
		this.defenderName = defenderName;
	}

	public void setDefenderHPEVs(int defenderHPEVs) {
		this.defenderHPEVs = defenderHPEVs;
	}

	public void setDefenderDefEVs(int defenderDefEVs) {
		this.defenderDefEVs = defenderDefEVs;
	}

	public void setDefenderNature(String defenderNature) {
		this.defenderNature = defenderNature;
	}

	public void setDefenderItem(String defenderItem) {
		this.defenderItem = defenderItem;
	}

	public void setDefenderAbility(String defenderAbility) {
		this.defenderAbility = defenderAbility;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public void setCrit(boolean isCrit) {
		this.isCrit = isCrit;
	}

	public void setFriendGuard(boolean isFriendGuard) {
		this.isFriendGuard = isFriendGuard;
	}

	public void setProtect(boolean isProtect) {
		this.isProtect = isProtect;
	}

	public void setAttackerOffenseChange(int attackerOffenseChange) {
		this.attackerOffenseChange = attackerOffenseChange;
	}

	public void setHitsPhysical(boolean hitsPhysical) {
		this.hitsPhysical = hitsPhysical;
	}

	public void setUsesPhysicalAttack(boolean usesPhysicalAttack) {
		this.usesPhysicalAttack = usesPhysicalAttack;
	}

	public void setDefenderCurrentHP(int defenderCurrentHP) {
		this.defenderCurrentHP = defenderCurrentHP;
	}
	
	public void setDefenderDefenseChange(int defenderDefenseChange) {
		this.defenderDefenseChange = defenderDefenseChange;
	}

	public void setDamageRolls(int[] damageRolls) {
		this.damageRolls = damageRolls;
	}

	public void setPrecision(int precision) {
		this.precision = precision;
	}

	public void setAura(String aura) {
		this.aura = aura;
	}

	public void setKnockOff(boolean knockOff) {
		this.knockOff = knockOff;
	}

	public void setParentalBond(boolean isParentalBond) {
		this.isParentalBond = isParentalBond;
	}


	public void setpBondDamageRolls(int[] pBondDamageRolls) {
		this.pBondDamageRolls = pBondDamageRolls;
	}

	public boolean isZ() {
		return isZ;
	}

	public void setZ(boolean isZ) {
		this.isZ = isZ;
	}
}
