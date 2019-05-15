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
	private boolean isBurnt;
	private boolean isHelpingHand;
	private boolean isBattery;	
	private boolean knockOff;
	
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

	private boolean isReflect;
	private boolean isLightScreen;
	private boolean isCrit;
	private boolean isFriendGuard;
	private boolean isProtect;
	
	private String KOChance;
	private int[] damageRolls;
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
		
		double minRollPercent = ((double) damageRolls[0] / (double) defenderCurrentHP) * 100;
		double maxRollPercent = ((double) damageRolls[15] / (double) defenderCurrentHP) * 100;

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
		if (terrain != null) {result += "in " + terrain + "Terrain ";}
		if (isReflect) {result += "through Reflect ";}
		if (isLightScreen) {result += "through Light Screen ";}
		if (isCrit) {result += "with a critical hit ";}
		if (isFriendGuard) {result += "through Friend Guard ";}
		if (isProtect) {result += "through Protect ";}
		
		//Damage rolls, %, and % to KO
		result = result.trim() + ": ";
		result += damageRolls[0] + "-" + damageRolls[15] + " ";
		result += calculatePercentDamage() + " -- ";
		result += getXHKO();
		
		return result;
	}
	
	public String getXHKO()
	{
		String result;
		
		int smallestXHKO = (int) Math.ceil((double) defenderCurrentHP / damageRolls[15]);
		int largestXHKO = (int) Math.ceil((double) defenderCurrentHP / damageRolls[0]);
		
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
			if (smallestXHKO < 6) //Don't bother checking % to 6HKO, etc
			{
				int damageRollDuplicates[][] = new int[smallestXHKO][16];
				for (int i = 0; i < smallestXHKO; i++)
				{
					damageRollDuplicates[i] = damageRolls; //make X copies for the XHKO chance.
				}
				KOChanceLogic xhkoChance = new KOChanceLogic(defenderCurrentHP, damageRollDuplicates);
				if (smallestXHKO == 1)
				{
					result = xhkoChance.getPercentToKO() + "% chance to " + "OHKO ";
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
		
		double minRollPercent = ((double) damageRolls[0] / (double) defenderCurrentHP) * 100;
		double maxRollPercent = ((double) damageRolls[15] / (double) defenderCurrentHP) * 100;

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

	public int getMoveBP() {
		return moveBP;
	}

	public void setMoveBP(int moveBP) {
		this.moveBP = moveBP;
	}

	public String getDefenderName() {
		return defenderName;
	}

	public void setDefenderName(String defenderName) {
		this.defenderName = defenderName;
	}

	public int getDefenderHPEVs() {
		return defenderHPEVs;
	}

	public void setDefenderHPEVs(int defenderHPEVs) {
		this.defenderHPEVs = defenderHPEVs;
	}

	public int getDefenderDefEVs() {
		return defenderDefEVs;
	}

	public void setDefenderDefEVs(int defenderDefEVs) {
		this.defenderDefEVs = defenderDefEVs;
	}

	public String getDefenderNature() {
		return defenderNature;
	}

	public void setDefenderNature(String defenderNature) {
		this.defenderNature = defenderNature;
	}

	public String getDefenderItem() {
		return defenderItem;
	}

	public void setDefenderItem(String defenderItem) {
		this.defenderItem = defenderItem;
	}

	public String getDefenderAbility() {
		return defenderAbility;
	}

	public void setDefenderAbility(String defenderAbility) {
		this.defenderAbility = defenderAbility;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getTerrain() {
		return terrain;
	}

	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	public boolean isReflect() {
		return isReflect;
	}

	public void setReflect(boolean isReflect) {
		this.isReflect = isReflect;
	}

	public boolean isLightScreen() {
		return isLightScreen;
	}

	public void setLightScreen(boolean isLightScreen) {
		this.isLightScreen = isLightScreen;
	}

	public boolean isCrit() {
		return isCrit;
	}

	public void setCrit(boolean isCrit) {
		this.isCrit = isCrit;
	}

	public boolean isFriendGuard() {
		return isFriendGuard;
	}

	public void setFriendGuard(boolean isFriendGuard) {
		this.isFriendGuard = isFriendGuard;
	}

	public boolean isProtect() {
		return isProtect;
	}

	public void setProtect(boolean isProtect) {
		this.isProtect = isProtect;
	}
	
	public int getAttackerOffenseChange() {
		return attackerOffenseChange;
	}

	public void setAttackerOffenseChange(int attackerOffenseChange) {
		this.attackerOffenseChange = attackerOffenseChange;
	}

	public boolean isHitsPhysical() {
		return hitsPhysical;
	}

	public void setHitsPhysical(boolean hitsPhysical) {
		this.hitsPhysical = hitsPhysical;
	}

	public boolean isUsesPhysicalAttack() {
		return usesPhysicalAttack;
	}

	public void setUsesPhysicalAttack(boolean usesPhysicalAttack) {
		this.usesPhysicalAttack = usesPhysicalAttack;
	}

	public int getDefenderCurrentHP() {
		return defenderCurrentHP;
	}

	public void setDefenderCurrentHP(int defenderCurrentHP) {
		this.defenderCurrentHP = defenderCurrentHP;
	}

	public int getDefenderDefenseChange() {
		return defenderDefenseChange;
	}

	public void setDefenderDefenseChange(int defenderDefenseChange) {
		this.defenderDefenseChange = defenderDefenseChange;
	}

	public String getKOChance() {
		return KOChance;
	}

	public void setKOChance(String kOChance) {
		KOChance = kOChance;
	}

	public int[] getDamageRolls() {
		return damageRolls;
	}

	public void setDamageRolls(int[] damageRolls) {
		this.damageRolls = damageRolls;
	}

	public int getPrecision() {
		return precision;
	}

	public void setPrecision(int precision) {
		this.precision = precision;
	}
	
	public String getAura() {
		return aura;
	}

	public void setAura(String aura) {
		this.aura = aura;
	}

	public boolean isKnockOff() {
		return knockOff;
	}

	public void setKnockOff(boolean knockOff) {
		this.knockOff = knockOff;
	}
}
