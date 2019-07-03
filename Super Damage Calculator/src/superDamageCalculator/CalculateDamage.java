/* Models damage calculation based on the games.
 * Quick references:
 * http://bbs10.aimix-z.com/mtpt.cgi?room=sonota&mode=view2&f=140&no=27-29 (OZY Gen 7 research)
 * https://www.smogon.com/bw/articles/bw_complete_damage_formula (BW documentation)
 * https://docs.google.com/document/d/1uJtdnOTtM6b0uu7bNkRHhmvNvxgHrtQ4mSXgimJ1_P0/edit (DaWoblefet's old guide based on BW documentation)
 * https://pokemonshowdown.com/damagecalc/js/damage.js?97051234 (PS damage calc implementation) */

package superDamageCalculator;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;

import static superDamageCalculator.StatConstants.*;

public class CalculateDamage
{
	private HashMap<String, Pokemon> pokedex = Pokedex.getPokedex();
	private HashMap<String, Move> movedex = new Movedex().getMovedex();
	private HashMap<String, Integer> types = new Type().types;
	private double typechart[][] = new Type().typeChart;
	private boolean debugMode = false;

	private int attackerLevel;
	private int attackerHPStat;
	private int attackerCurrentHP;
	private String attackerName;
	private String attackerTypeLeft;
	private String attackerTypeRight;
	private int attackerOffenseStat;
	private int attackerSpeedStat;
	private int attackerOffenseChange;
	private int attackerSpeedChange;
	private String attackerAbility;
	private Item attackerItem;
	private String attackerStatus;

	private Move move;
	private int moveBP;
	private String moveType;
	private String moveCategory;
	private boolean usesPhysicalAttack;
	private boolean hitsPhysical; //Either physical or Psyshock effect
	private boolean isCrit;
	private boolean isZ;

	private String defenderName;
	private String defenderTypeLeft;
	private String defenderTypeRight;
	private int defenderHPStat;
	private int defenderCurrentHP;
	private int defenderDefenseStat;
	private int defenderSpeedStat;
	private int defenderDefenseChange;
	private int defenderSpeedChange;
	private String defenderAbility;
	private Item defenderItem;
	private String defenderStatus;

	private String format;
	private String terrain;
	private String weather;
	private String aura;
	private boolean isHelpingHand;
	private boolean isProtect;
	private boolean isReflect;
	private boolean isLightScreen;
	private boolean isAuroraVeil;
	private boolean isFriendGuard;
	private boolean isBattery;

	private int[] damageRolls = new int[16];
	private String damageOutput;
	private String damageOutputShort;
	private double typeMod;
	
	private DamageDescriptionBuilder description;
	private int[] zeroDamageArray = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	
	private boolean isBabyHit;
	private int[] pBondDamageRolls = zeroDamageArray;
	

	/* Passes in the variables affecting damage calculation, sets them, then starts damage calculation. */
	public CalculateDamage(Move move, Pokemon attacker, Pokemon defender, FieldOptions fieldOptions, boolean isLeft)
	{
		this.move = move;
		moveType = move.getType();
		moveCategory = move.getCategory();
		isCrit = move.isCritChecked();
		isZ = move.isZChecked();
		moveBP = isZ ? move.getZBP() : move.getBP();
		
		//Photon Geyser is conditionally a physical/special move based on which offense stat is higher
		if (move.getName().equals("Photon Geyser") || move.getName().equals("Light That Burns the Sky"))
		{
			int tempAtk = applyStatChange(attacker.getStat(ATK).calculateStat(), parseChangeValue(attacker.getStat(ATK).getBoostLevel()));
			int tempSpA = applyStatChange(attacker.getStat(SATK).calculateStat(), parseChangeValue(attacker.getStat(SATK).getBoostLevel()));
			moveCategory = tempAtk > tempSpA ? "Physical" : "Special";
		}	
		
		int whichAtk = 0;
		int whichDef = 0;
		switch (moveCategory)
		{
			case "Physical":
				whichAtk = ATK;
				whichDef = DEF;
				hitsPhysical = true;
				usesPhysicalAttack = true;
				break;
			case "Special":
				whichAtk = SATK;
				whichDef = SDEF;
				hitsPhysical = false;
				usesPhysicalAttack = false;
				break;
			case "Psyshock effect":
				whichAtk = SATK;
				whichDef = DEF;
				hitsPhysical = true;
				usesPhysicalAttack = false;
				break;
			case "Status": //fall through
			default:
				break;
		}	
		
		attackerName = attacker.getCurrentForme();
		attackerLevel = attacker.getStat(HP).getLevel();
		attackerTypeLeft = attacker.getType(0);
		attackerTypeRight = attacker.getType(1);
		attackerHPStat = attacker.getStat(HP).calculateStat();
		attackerCurrentHP = attacker.getCurrentHP() != 0 ? attacker.getCurrentHP() : attackerHPStat; //If currentHP is 0, ignore it
		attackerOffenseStat = attacker.getStat(whichAtk).calculateStat();
		attackerSpeedStat = attacker.getStat(SPE).calculateStat();
		attackerOffenseChange = parseChangeValue(attacker.getStat(whichAtk).getBoostLevel());
		attackerSpeedChange = parseChangeValue(attacker.getStat(SPE).getBoostLevel());
		attackerAbility = attacker.getAbility();
		attackerItem = attacker.getItem();
		attackerStatus = attacker.getStatus();

		defenderName = defender.getCurrentForme();
		defenderTypeLeft = defender.getType(0);
		defenderTypeRight = defender.getType(1);
		defenderHPStat = defender.getStat(HP).calculateStat();
		defenderCurrentHP = defender.getCurrentHP() != 0 ? defender.getCurrentHP() : defenderHPStat; //If currentHP is 0, ignore it
		defenderDefenseStat = defender.getStat(whichDef).calculateStat();
		defenderSpeedStat = defender.getStat(SPE).calculateStat();
		defenderDefenseChange = parseChangeValue(defender.getStat(whichDef).getBoostLevel());
		defenderSpeedChange = parseChangeValue(defender.getStat(SPE).getBoostLevel());
		defenderAbility = defender.getAbility();
		defenderItem = defender.getItem();
		defenderStatus = defender.getStatus();
		
		description = new DamageDescriptionBuilder(attackerName, defenderName, move.getName());
		
		//Mold Breaker checks. Shadow Shield/Prism Armor/Full Metal Body immune to Mold Breaker
		if (!Arrays.asList("Shadow Shield", "Prism Armor", "Full Metal Body").contains(defenderAbility))
		{
			if (Arrays.asList("Moongeist Beam", "Menacing Moonraze Maelstrom",
							"Sunsteel Strike", "Searing Sunraze Smash",
							"Photon Geyser", "Light That Burns the Sky").contains(move.getName()))
			{
				defenderAbility = ""; //Suppress Ability
			}
			else if (Arrays.asList("Mold Breaker", "Turboblaze", "Teravolt").contains(attackerAbility))
			{
				//Technically doesn't display when Mold Breaker actually suppresses, only the potential to suppress
				if (Arrays.asList("Heatproof", "Dry Skin", "Unaware", "Thick Fat", "Water Bubble",
						"Flower Gift", "Marvel Scale", "Grass Pelt", "Fur Coat", "Multiscale",
						"Fluffy", "Solid Rock", "Filter", "Prism Armor").contains(defenderAbility))
				{
					description.setAttackerAbility(attackerAbility);
				}
				defenderAbility = ""; //Suppress Ability
			}
		}
		
		if (move.getName().equals("Foul Play") && !isZ)
		{
			attackerOffenseStat = defender.getStat(ATK).calculateStat();
			attackerOffenseChange = parseChangeValue(defender.getStat(ATK).getBoostLevel());
		}
		
		format = fieldOptions.getFormat();
		terrain = fieldOptions.getTerrain();
		weather = fieldOptions.getWeather();
		aura = fieldOptions.getAura();
		isHelpingHand = fieldOptions.getSideFieldOptions(isLeft).isHelpingHand();
		isProtect = fieldOptions.getSideFieldOptions(!isLeft).isProtect();
		isReflect = fieldOptions.getSideFieldOptions(!isLeft).isReflect();
		isLightScreen = fieldOptions.getSideFieldOptions(!isLeft).isLightScreen();
		if (fieldOptions.getSideFieldOptions(!isLeft).isAuroraVeil())
		{
			isReflect = true;
			isLightScreen = true;
			isAuroraVeil = true;
		}
		isFriendGuard = fieldOptions.getSideFieldOptions(!isLeft).isFriendGuard();
		isBattery = fieldOptions.getSideFieldOptions(isLeft).isBattery();

		typeMod = getTypeMod();
		
		if (moveCategory.equals("Status") || typeMod == 0)
		{
			if (moveType.equals("Electric") && (defenderTypeLeft.equals("Ground") || defenderTypeRight.equals("Ground")))
			{
				damageOutput = description.getNoDamageDescription("try using Soak first");
			}
			else
			{
				damageOutput = description.getNoDamageDescription("nice move there m8");
			}
			damageOutputShort = description.getNoDamageShortDescription();
		}
		else //Do the damage calc like normal
		{
			moveBP = checkForCustomBP(moveBP);
			int finalBasePower = calculateFinalBasePower(moveBP);
			int finalAttack = calculateFinalAttack(attackerOffenseStat);
			int finalDefense = calculateFinalDefense(defenderDefenseStat);
			damageRolls = mainCalculation(finalBasePower, finalAttack, finalDefense);
			
			if (!Arrays.equals(damageRolls, zeroDamageArray)) //If the damage roll array was all zeroes, skip the detailed description
			{
				//Parental Bond does not work on spread moves, Z-moves, or multi-hit moves
				if (attackerAbility.equals("Parental Bond") && !(move.isSpread() && !format.equals("Singles")) && !isZ && !move.isMultiHit() && !move.isTwoHit())
				{
					//Additionally, Parental Bond doesn't work on any of the following moves:
					if (!Arrays.asList("Fling", "Self-Destruct", "Explosion", "Final Gambit", "Uproar", "Rollout",
							"Ice Ball", "Endeavor", "Bounce", "Dig", "Dive", "Fly", "Freeze Shock", "Ice Burn",
							"Phantom Force", "Razor Wind", "Shadow Force", "Skull Bush", "Sky Attack",
							"Sky Drop", "Solar Beam", "Solar Blade").contains(move.getName()))
					{
						isBabyHit = true;
						
						//Rudimentary checks for Assurance/Power-Up Punch
						if (move.getName().equals("Power-Up Punch"))
						{
							attackerOffenseChange++;
							finalAttack = calculateFinalAttack(attackerOffenseStat);
							attackerOffenseChange--;
							description.setAttackerOffenseChange(attackerOffenseChange); //Display as the pre-baby hit boost
						}
						else if (move.getName().equals("Assurance"))
						{
							finalBasePower = calculateFinalBasePower(120);
						}
						
						pBondDamageRolls = mainCalculation(finalBasePower, finalAttack, finalDefense);
						description.setAttackerAbility(attackerAbility);
						description.setParentalBond(true);
						description.setpBondDamageRolls(pBondDamageRolls);
					}
				}
				
				description.setZ(isZ);
				description.setAttackerEVs(attacker.getStat(whichAtk).getEVs());
				description.setAttackerNature(attacker.getNature());
				description.setMoveCategory(moveCategory);
				description.setDefenderHPEVs(defender.getStat(HP).getEVs());
				description.setDefenderCurrentHP(defenderCurrentHP);
				description.setDefenderDefEVs(defender.getStat(whichDef).getEVs());
				description.setDefenderNature(defender.getNature());
				description.setDamageRolls(damageRolls);
				
				damageOutput = description.getLongDescription();
				damageOutputShort = description.getShortDescription();
			}
		}
	}
	
	
	public int checkForCustomBP(int initialBP)
	{
		switch (move.getName())
		{
			case "Low Kick":
			case "Grass Knot":
				double targetWeight = calculateWeight(defenderName, defenderAbility, defenderItem);
				initialBP = targetWeight >= 200 ? 120 : targetWeight >= 100 ? 100 : targetWeight >= 50 ? 80 : targetWeight >= 25 ? 60 : targetWeight >= 10 ? 40 : 20;
				description.setMoveBP(initialBP);
				break;
			case "Gyro Ball":
				int userSpeed = calculateSpeed(attackerSpeedStat, attackerSpeedChange, attackerItem, attackerAbility, attackerStatus);
				int targetSpeed = calculateSpeed(defenderSpeedStat, defenderSpeedChange, defenderItem, defenderAbility, defenderStatus);
				if (userSpeed == 0) {initialBP = 1;}
				else //Gyro Ball must have min 1 BP and max 150 BP
				{
					initialBP = Math.max(1, Math.min(150, (int) Math.floor((25 * (double) targetSpeed) / userSpeed)));
				}
				description.setMoveBP(initialBP);
				break;	
			case "Electro Ball":
				userSpeed = calculateSpeed(attackerSpeedStat, attackerSpeedChange, attackerItem, attackerAbility, attackerStatus);
				targetSpeed = calculateSpeed(defenderSpeedStat, defenderSpeedChange, defenderItem, defenderAbility, defenderStatus);
				int relativeSpeed = (int) Math.floor((double) userSpeed / targetSpeed);
				if (targetSpeed == 0) {initialBP = 40;}
				else
				{
					initialBP = relativeSpeed >= 4 ? 150 : relativeSpeed == 3 ? 120 : relativeSpeed == 2 ? 80 : relativeSpeed == 1 ? 60 : 40;
				}
				description.setMoveBP(initialBP);
				break;
			case "Water Spout":
			case "Eruption":
				initialBP = Math.max(1, (int) Math.floor((150.0 * attackerCurrentHP / attackerHPStat)));
				description.setMoveBP(initialBP);
				break;
			case "Heavy Slam":
			case "Heat Crash":
				double userWeight = calculateWeight(attackerName, attackerAbility, attackerItem);
				targetWeight = calculateWeight(defenderName, defenderAbility, defenderItem);
				int relativeWeight = (int) Math.floor(userWeight / targetWeight);
				initialBP = relativeWeight >= 5 ? 120 : relativeWeight >= 4 ? 100 : relativeWeight >= 3 ? 80 : relativeWeight >= 2 ? 60 : 40; 
				description.setMoveBP(initialBP);
				break;
			case "Acrobatics":
				if (attackerItem.getName().equals("(none)"))
				{
					initialBP = 110;
				}
				else
				{
					initialBP = 55;
				}
				description.setMoveBP(initialBP);
				break;
			case "Weather Ball":
				if (weather.equals("None") || weather.equals("Strong Winds"))
				{
					initialBP = 50;
				}
				else
				{
					switch (weather)
					{
						case "Sun": moveType = "Fire"; break;
						case "Rain": moveType = "Water"; break;
						case "Hail": moveType = "Ice"; break;
						case "Sand": moveType = "Rock"; break;
					}
					typeMod = getTypeMod();
					initialBP = 100;
				}
				description.setMoveBP(initialBP);
				break;
			case "Nature Power":
				switch (terrain)
				{
					case "Misty":
						move = movedex.get("Moonblast");
						break;
					case "Electric":
						move = movedex.get("Thunderbolt");
						break;
					case "Grassy":
						move = movedex.get("Energy Ball");
						break;
					case "Psychic":
						move = movedex.get("Psychic");
						break;
					case "None":
						move = movedex.get("Tri Attack");
						break;
					default:
						break;
				}
				moveType = move.getType();
				moveBP = move.getBP();
				moveCategory = "Special";
				description.setMoveBP(initialBP);
				typeMod = getTypeMod();
				break;
			case "Fling": //Could verify an item is unFlingable by checking if BP is 0
				initialBP = attackerItem.getFlingBP();
				description.setMoveBP(initialBP);
				break;	
			case "Natural Gift": //Could avoid running checks on non-Berries
				if (attackerItem.isBerry())
				{
					initialBP = attackerItem.getNaturalGiftBP();
					moveType = attackerItem.getNaturalGiftType();
					typeMod = getTypeMod();
				}
				description.setMoveBP(initialBP);
				break;
			case "Hex":
				if (!defenderStatus.equals("Healthy"))
				{
					initialBP = 130;
				}
				description.setMoveBP(initialBP);
				break;
			case "Wake-Up Slap":
				if (defenderStatus.equals("Asleep"))
				{
					initialBP = 140;
				}
				description.setMoveBP(initialBP);
				break;
			case "Smelling Salts":
				if (defenderStatus.equals("Paralyzed"))
				{
					initialBP = 140;
				}
				description.setMoveBP(initialBP);
				break;
			case "Wring Out":
			case "Crush Grip":
				//Taken from https://raw.githubusercontent.com/Zarel/Pokemon-Showdown/master/data/moves.js
				int fancyCalculation = (int) Math.floor(Math.floor((120 * (100 * Math.floor((defenderCurrentHP * 4096.0 / defenderHPStat)) + 2048 - 1) / 4096) / 100));	
				initialBP = Math.max(1, fancyCalculation);
				description.setMoveBP(initialBP);
				break;
			case "Flail":
			case "Reversal":
				int p = ((int) Math.floor(48.0 * attackerCurrentHP / attackerHPStat));
				initialBP = p <= 1 ? 200 : p <= 4 ? 150 : p <= 9 ? 100 : p <= 16 ? 80 : p <= 32 ? 40 : 20;
				description.setMoveBP(initialBP);
				break;
			case "Water Shuriken":
				if (attackerName.equals("Greninja-Ash") && attackerAbility.equals("Battle Bond"))
				{
					description.setAttackerAbility(attackerAbility);
					initialBP = 20;
				}
				description.setMoveBP(initialBP);
				break;
			
			//Higher priority to support
			case "Stored Power":
			case "Power Trip":
				break;
			case "Punishment":
				break;
			
			//Lower priority to support
			case "Beat Up":
				break;
				
			//Hardly matter to support	
			case "Assurance":
			case "Avalanche":
				break;
			case "Fury Cutter":
				break;
			case "Triple Kick":
				break;
			case "Spit Up":
				break;
			case "Rollout":
			case "Ice Ball":
				break;	
			default:
				break;		
		}
		if (isZ) {description.setMoveBP(initialBP);}
		
		return initialBP;
	}

	public int calculateFinalBasePower(int startingBP)
	{
		if (debugMode)
		{
			System.out.println("BP prior to modifiers is: " + startingBP);
		}
		
		ArrayList<Integer> bpModifiers = new ArrayList<Integer>();
		
		//Assumes Fairy/Dark Aura is active
		if (aura.equals("Aura Break") && (moveType.equals("Fairy") || moveType.equals("Dark")))
		{
			bpModifiers.add(0xC00);
			description.setAura(aura);
		}
		
		//if (Rivalry and gender is not the same) TODO
		//bpModifiers.add(0xC00)
		
		//Check for -ate abilities changing move typing.
		if (!isZ && moveType.equals("Normal")) //Z-moves aren't affected by -ate.
		{
			switch (attackerAbility)
			{
				case "Aerilate":
					moveType = "Flying";
					bpModifiers.add(0x1333);
					description.setAttackerAbility(attackerAbility);
					typeMod = getTypeMod();
					break;
				case "Pixilate":
					moveType = "Fairy";
					bpModifiers.add(0x1333);
					description.setAttackerAbility(attackerAbility);
					typeMod = getTypeMod();
					break;
				case "Refrigerate":
					moveType = "Ice";
					bpModifiers.add(0x1333);
					description.setAttackerAbility(attackerAbility);
					typeMod = getTypeMod();
					break;
				case "Galvanize":
					moveType = "Electric";
					bpModifiers.add(0x1333);
					description.setAttackerAbility(attackerAbility);
					typeMod = getTypeMod();
					break;
				case "Liquid Voice":
					if (move.isSound())
					{
						moveType = "Water";
					}
					typeMod = getTypeMod();
					description.setAttackerAbility(attackerAbility);
					break;
				default:
					break;
			}
		}
		
		//Normalize not explicitly in OZY's list
		if (!isZ && attackerAbility.equals("Normalize"))
		{
			moveType = "Normal";
			bpModifiers.add(0x1333);
			description.setAttackerAbility(attackerAbility);
			typeMod = getTypeMod();
		}
		
		if (attackerAbility.equals("Iron Fist") && move.isPunch())
		{
			bpModifiers.add(0x1333);
			description.setAttackerAbility(attackerAbility);
		}
		
		if (attackerAbility.equals("Reckless") && (move.getHasRecoil() || move.getName().equals("Jump Kick") || move.getName().equals("High Jump Kick")))
		{
			bpModifiers.add(0x1333);
			description.setAttackerAbility(attackerAbility);
		}
		
		/*if (Rivalry and gender is the same) TODO
		{
			bpModifiers.add(0x1400);
			description.setAttackerAbility(attackerAbility);
		}*/
		
		if (isBattery && !usesPhysicalAttack)
		{
			bpModifiers.add(0x14CD);
			description.setBattery(true);
		}
		
		if (attackerAbility.equals("Sheer Force") && move.getHasSecondaryEffect())
		{
			bpModifiers.add(0x14CD);
			description.setAttackerAbility(attackerAbility);
		}
		
		if (attackerAbility.equals("Sand Force") && weather.equals("Sand") && Arrays.asList("Rock", "Ground", "Steel").contains(moveType))
		{
			bpModifiers.add(0x14CD);
			description.setAttackerAbility(attackerAbility);
		}
		
		//Automatically apply Analytic and skip Speed checks or whatever
		if (attackerAbility.equals("Analytic"))
		{
			bpModifiers.add(0x14CD);
			description.setAttackerAbility(attackerAbility);
		}
		
		if (attackerAbility.equals("Tough Claws") && move.getMakesContact())
		{
			bpModifiers.add(0x14CD);
			description.setAttackerAbility(attackerAbility);
		}
		
		//Assumes Aura Break is not active
		if ((aura.equals("Fairy Aura") && moveType.equals("Fairy")) || (aura.equals("Dark Aura") && moveType.equals("Dark")))
		{
			bpModifiers.add(0x1548);
			description.setAura(aura);
		}
		
		//Technician considers any previous modifiers in its <= 60 BP check.
		if (attackerAbility.equals("Technician"))
		{
			int tempBP = pokeRound(startingBP * chainMods(bpModifiers) / 0x1000);
			if (tempBP <= 60)
			{
				bpModifiers.add(0x1800);
				description.setAttackerAbility(attackerAbility);
			}
		}
		
		if (attackerAbility.equals("Flare Boost") && attackerStatus.equals("Burned") && !usesPhysicalAttack)
		{
			bpModifiers.add(0x1800);
			description.setAttackerAbility(attackerAbility);
		}
		
		if (attackerAbility.equals("Toxic Boost") && (attackerStatus.equals("Poisoned") || attackerStatus.equals("Badly Poisoned")) && usesPhysicalAttack)
		{
			bpModifiers.add(0x1800);
			description.setAttackerAbility(attackerAbility);
		}
		
		if (attackerAbility.equals("Strong Jaw") && move.isBite())
		{
			bpModifiers.add(0x1800);
			description.setAttackerAbility(attackerAbility);
		}
		
		if (attackerAbility.equals("Mega Launcher") && move.isPulse())
		{
			bpModifiers.add(0x1800);
			description.setAttackerAbility(attackerAbility);
		}
		
		if (defenderAbility.equals("Heatproof") && moveType.equals("Fire"))
		{
			bpModifiers.add(0x800);
			description.setDefenderAbility(defenderAbility);
		}
		
		if (defenderAbility.equals("Dry Skin") && moveType.equals("Fire"))
		{
			bpModifiers.add(0x1400);
			description.setDefenderAbility(defenderAbility);
		}
		
		if ((attackerItem.getName().equals("Muscle Band") && usesPhysicalAttack) || (attackerItem.getName().equals("Wise Glasses") && !usesPhysicalAttack))
		{
			bpModifiers.add(0x1199);
			description.setAttackerItem(attackerItem.getName());
		}
		
		//Plates, Incenses, other type boosting items
		if (attackerItem.isTypeBoosting())
		{
			//Sinnoh Orbs and Soul Dew need extra checks since they can boost multiple types
			if (attackerItem.getTypeAssociated().equals(moveType)
					|| (attackerItem.getName().equals("Adamant Orb") && attackerName.equals("Dialga") && (moveType.equals("Dragon") || moveType.equals("Steel")))
					|| (attackerItem.getName().equals("Lustrous Orb") && attackerName.equals("Palkia") && (moveType.equals("Dragon") || moveType.equals("Water")))
					|| (attackerItem.getName().equals("Griseous Orb") && attackerName.equals("Giratina-Origin") && (moveType.equals("Dragon") || moveType.equals("Ghost")))
					|| (attackerItem.getName().equals("Soul Dew") && (attackerName.contains("Latios") || attackerName.contains("Latias"))&& (moveType.equals("Dragon") || moveType.equals("Psychic"))))
			{
				bpModifiers.add(0x1333);
				description.setAttackerItem(attackerItem.getName());
			}
		}
		
		if (attackerItem.isGem() && attackerItem.getTypeAssociated().equals(moveType))
		{
			bpModifiers.add(0x14CD);
			description.setAttackerItem(attackerItem.getName());
		}
		
		if ((move.getName().equals("Solar Beam") || move.getName().equals("Solar Blade")) && !weather.equals("Sun") && !weather.equals("None"))
		{
			bpModifiers.add(0x800);
			description.setWeather(weather);
		}
		
		//if (meFirst variable) TODO
		//bpModifiers.add(0x1800);
		
		//Knock Off doesn't boost on Z-crystals, Mega Stones, Giratina-O, Arceus + Plate, Genesect + Drive, Silvally + Memory, or Primal Reversion
		if (move.getName().equals("Knock Off") && !(defenderItem.getName().equals("(none)")
				|| defenderItem.isZCrystal() || defenderItem.isMegaStone()
				|| (defenderItem.getName().equals("Red Orb") && defenderName.contains("Groudon"))
				|| (defenderItem.getName().equals("Blue Orb") && defenderName.contains("Kyogre"))
				|| (defenderItem.getName().equals("Griseous Orb") && defenderName.equals("Giratina-Origin"))
				|| (defenderItem.isPlate() && defenderName.contains("Arceus"))
				|| (defenderItem.isDrive() && defenderName.contains("Genesect"))
				|| (defenderItem.isMemory() && defenderName.contains("Silvally"))))
		{
			bpModifiers.add(0x1800);
			description.setKnockOff(true);
		}
		
		if (isHelpingHand)
		{
			bpModifiers.add(0x1800);
			description.setHelpingHand(true);
		}
				
		//if (has Charge) TODO
		//bpModifiers.add(0x2000);
		
		//Facade doesn't double on sleep or freeze
		if (move.getName().equals("Facade") && !Arrays.asList("Healthy", "Asleep", "Frozen").contains(attackerStatus))
		{
			bpModifiers.add(0x2000);
		}
		
		if (move.getName().equals("Brine") && defenderCurrentHP <= defenderHPStat / 2.0)
		{
			bpModifiers.add(0x2000);
		}
		
		if (move.getName().equals("Venoshock") && (defenderStatus.equals("Poisoned") || defenderStatus.equals("Badly Poisoned")))
		{
			bpModifiers.add(0x2000);
		}
		
		//if (Retaliate condition) TODO
		//bpModifiers.add(0x2000);
		
		//if (Fusion Bolt/Flare condition) TODO
		//bpModifiers.add(0x2000);
		
		//Grassy/Misty Terrain (negative). Check for grounded-state first.
		if (!(defenderTypeLeft.equals("Flying") || defenderTypeRight.equals("Flying") || defenderAbility.equals("Levitate") || defenderItem.getName().equals("Air Balloon")))
		{
			if (terrain.equals("Misty") && moveType.equals("Dragon"))
			{
				bpModifiers.add(0x800);
				description.setTerrain(terrain);
			}
			if (terrain.equals("Grassy") && (move.getName().equals("Earthquake") || move.getName().equals("Bulldoze") || move.getName().equals("Magnitude")))
			{
				bpModifiers.add(0x800);
				description.setTerrain(terrain);
			}
		}
		
		//Electric/Psychic/Grassy Terrain (positive). Check for grounded-state first.
		if (!(attackerTypeLeft.equals("Flying") || attackerTypeRight.equals("Flying") || attackerAbility.equals("Levitate") || attackerItem.getName().equals("Air Balloon")))
		{
			if ((terrain.equals("Electric") && moveType.equals("Electric"))
					|| (terrain.equals("Psychic") && moveType.equals("Psychic"))
					|| (terrain.equals("Grassy") && moveType.equals("Grass")))
			{
				bpModifiers.add(0x1800);
				description.setTerrain(terrain);
			}
		}
		
		//if (Water Sport active and move is Fire, Mud Sport active and move is Electric) TODO
		//bpModifiers.add(0x548);
		
		if (debugMode)
		{
			System.out.println("Base Power after modifiers: " + (int) Math.max(1, pokeRound(startingBP * chainMods(bpModifiers) / 0x1000)));
		}
		//Base Power must be 1 at a minimum
		return (int) Math.max(1, pokeRound(startingBP * chainMods(bpModifiers) / 0x1000));
	}
	
	public int calculateFinalAttack(int baseAttack)
	{
		if (debugMode)
		{
			System.out.println("Attack prior to modifiers is: " + baseAttack);
		}

		//Unaware checks happen prior to crit checks; +1 crit Leaf Blade into Unaware counts at +0 crit Leaf Blade
		if (!defenderAbility.equals("Unaware"))
		{
			if (isCrit && attackerOffenseChange < 0)
			{
				attackerOffenseChange = 0;
			}
			baseAttack = applyStatChange(baseAttack, attackerOffenseChange);
			description.setAttackerOffenseChange(attackerOffenseChange);
		}
		else if (attackerOffenseChange != 0)
		{
			description.setDefenderAbility(defenderAbility);
		}
		
		
		//Hustle is not chained like the other modifiers, instead applied directly.
		if (attackerAbility.equals("Hustle") && usesPhysicalAttack)
		{
			baseAttack = pokeRound(baseAttack * 3 / 2);
			description.setAttackerAbility(attackerAbility);
		}
		
		ArrayList<Integer> attackModifiers = new ArrayList<Integer>();
		
		//Slow Start halves damage for all physical attacks and special Z-moves
		if (attackerAbility.equals("Slow Start") && (usesPhysicalAttack || (!usesPhysicalAttack && isZ)))
		{
			attackModifiers.add(0x800);
			description.setAttackerAbility(attackerAbility);
		}
		
		if (attackerAbility.equals("Defeatist") && attackerCurrentHP <= attackerHPStat / 2.0)
		{
			attackModifiers.add(0x800);
			description.setAttackerAbility(attackerAbility);
		}
		
		//Technically Flower Gift can also be an ally's ability
		if (attackerAbility.equals("Flower Gift") && weather.equals("Sun") && usesPhysicalAttack)
		{
			attackModifiers.add(0x1800);
			description.setAttackerAbility(attackerAbility);
		}
		
		if (attackerAbility.equals("Guts") && !attackerStatus.equals("Healthy") && usesPhysicalAttack)
		{
			attackModifiers.add(0x1800);
			description.setAttackerAbility(attackerAbility);
		}
		
		//Torrent/Swarm/Overgrow/Blaze
		if (attackerCurrentHP <= attackerHPStat / 3.0 &&
				(attackerAbility.equals("Blaze") && moveType.equals("Fire")) || 
				(attackerAbility.equals("Torrent") && moveType.equals("Water")) || 
				(attackerAbility.equals("Overgrow") && moveType.equals("Grass")) || 
				(attackerAbility.equals("Swarm") && moveType.equals("Bug")))
		{
			attackModifiers.add(0x1800);
			description.setAttackerAbility(attackerAbility);
		}
		
		//TODO Flash Fire needs a trigger to activate
		if (attackerAbility.equals("Flash Fire") && moveType.equals("Fire"))
		{
			//attackModifiers.add(0x1800);
			//description.setAttackerAbility(attackerAbility);
		}
		
		if (attackerAbility.equals("Solar Power") && weather.equals("Sun") && !usesPhysicalAttack)
		{
			attackModifiers.add(0x1800);
			description.setAttackerAbility(attackerAbility);
		}
		
		//Plus/Minus default to being on if the ability is selected
		if ((attackerAbility.equals("Plus") || attackerAbility.equals("Minus")) && !usesPhysicalAttack)
		{
			attackModifiers.add(0x1800);
			description.setAttackerAbility(attackerAbility);
		}
		
		if (attackerAbility.equals("Steelworker") && moveType.equals("Steel"))
		{
			attackModifiers.add(0x1800);
			description.setAttackerAbility(attackerAbility);
		}
		
		if ((attackerAbility.equals("Huge Power") || attackerAbility.equals("Pure Power")) && usesPhysicalAttack)
		{
			attackModifiers.add(0x2000);
			description.setAttackerAbility(attackerAbility);
		}
		
		//Offensive Water Bubble
		if (attackerAbility.equals("Water Bubble") && moveType.equals("Water"))
		{
			attackModifiers.add(0x2000);
			description.setAttackerAbility(attackerAbility);
		}
		
		//TODO flag for Stakeout double condition
		if (attackerAbility.equals("Stakeout"))
		{
			//attackModifiers.add(0x2000);
			//description.setAttackerAbility(attackerAbility);
		}
		
		if (defenderAbility.equals("Thick Fat") && (moveType.equals("Fire") || moveType.equals("Ice")))
		{
			attackModifiers.add(0x800);
			description.setDefenderAbility(defenderAbility);
		}
		
		//Defensive Water Bubble
		if (defenderAbility.equals("Water Bubble") && moveType.equals("Fire"))
		{
			attackModifiers.add(0x800);
			description.setDefenderAbility(defenderAbility);
		}
		
		if ((attackerItem.getName().equals("Choice Band") && usesPhysicalAttack|| (attackerItem.getName().equals("Choice Specs") && !usesPhysicalAttack)))
		{
			attackModifiers.add(0x1800);
			description.setAttackerItem(attackerItem.getName());
		}
		
		if (attackerItem.getName().equals("Thick Club") && Arrays.asList("Marowak", "Marowak-Alola", "Marowak-Alola-Totem", "Cubone").contains(attackerName) && usesPhysicalAttack)
		{
			attackModifiers.add(0x2000);
			description.setAttackerItem(attackerItem.getName());
		}
		
		if (attackerItem.getName().equals("Deep Sea Tooth") && attackerName.equals("Clamperl") && !usesPhysicalAttack)
		{
			attackModifiers.add(0x2000);
			description.setAttackerItem(attackerItem.getName());
		}
		
		if (attackerItem.getName().equals("Light Ball") && attackerName.equals("Pikachu"))
		{
			attackModifiers.add(0x2000);
			description.setAttackerItem(attackerItem.getName());
		}

		if (debugMode)
		{
			System.out.println("Attack after modifiers is: " + (int) Math.max(1, pokeRound(baseAttack * chainMods(attackModifiers) / 0x1000)));
		}
		
		//Chain modifiers; attack must be 1 at a minimum.
		return (int) Math.max(1, pokeRound(baseAttack * chainMods(attackModifiers) / 0x1000));
	}

	public int calculateFinalDefense(int baseDefense)
	{
		if (debugMode)
		{
			System.out.println("Defense prior to modifiers is: " + baseDefense);
		}
		
		//Unaware checks happen prior to crit checks (a crit Sacred Sword at -1 Def is treated as +0 Def)
		if (!(attackerAbility.equals("Unaware") || move.isIgnoresDefenseBoosts()))
		{
			if (isCrit && defenderDefenseChange > 0)
			{
				defenderDefenseChange = 0;
			}		
			baseDefense = applyStatChange(baseDefense, defenderDefenseChange);
			description.setDefenderDefenseChange(defenderDefenseChange);
		}
		else if (attackerAbility.equals("Unaware") && defenderDefenseChange != 0)
		{
			description.setAttackerAbility(attackerAbility);
		}
		
		//Sandstorm is applied prior to the other defense modifiers
		if (weather.equals("Sand") && (defenderTypeLeft.equals("Rock") || defenderTypeRight.equals("Rock")) && !hitsPhysical)
		{
			baseDefense = pokeRound(baseDefense * 3 / 2);
			description.setWeather(weather);
		}
		
		ArrayList<Integer> defenseModifiers = new ArrayList<Integer>();
		
		//Technically Flower Gift can be an ally's ability
		if (defenderAbility.equals("Flower Gift") && weather.equals("Sun") && !hitsPhysical)
		{
			defenseModifiers.add(0x1800);
			description.setDefenderAbility(defenderAbility);
		}		
		
		if (defenderAbility.equals("Marvel Scale") && !defenderStatus.equals("Healthy") && hitsPhysical)
		{
			defenseModifiers.add(0x1800);
			description.setDefenderAbility(defenderAbility);
		}
		
		if (defenderAbility.equals("Grass Pelt") && terrain.equals("Grassy") && hitsPhysical)
		{
			defenseModifiers.add(0x1800);
			description.setDefenderAbility(defenderAbility);
		}
		
		if (defenderAbility.equals("Fur Coat") && hitsPhysical)
		{
			defenseModifiers.add(0x2000);
			description.setDefenderAbility(defenderAbility);
		}
		
		//Assumes Eviolite holder meets the correct conditions
		if (defenderItem.getName().equals("Eviolite"))
		{
			defenseModifiers.add(0x1800);
			description.setDefenderItem(defenderItem.getName());
		}
		
		if (defenderItem.getName().equals("Assault Vest") && !hitsPhysical)
		{
			defenseModifiers.add(0x1800);
			description.setDefenderItem(defenderItem.getName());
		}
		
		//BW documentation says 0x1800 but everywhere else says 0x2000
		if (defenderItem.getName().equals("Deep Sea Scale") && defenderName.equals("Clamperl") && !hitsPhysical)
		{
			defenseModifiers.add(0x2000);
			description.setDefenderItem(defenderItem.getName());
		}
		
		if (defenderItem.getName().equals("Metal Powder") && defenderName.equals("Ditto") && hitsPhysical)
		{
			defenseModifiers.add(0x2000);
			description.setDefenderItem(defenderItem.getName());
		}
		
		if (debugMode)
		{
			System.out.println("Defense after modifiers: " + (int) Math.max(1, pokeRound(baseDefense * chainMods(defenseModifiers) / 0x1000)));
		}
		
		//Defense must be 1 at a minimum
		return (int) Math.max(1, pokeRound(baseDefense * chainMods(defenseModifiers) / 0x1000));
	}

	public int[] mainCalculation(int finalBasePower, int finalAttack, int finalDefense)
	{
		double baseDamage = (int) Math.floor((2.0 * attackerLevel / 5.0) + 2);
		baseDamage = (int) Math.floor((baseDamage * finalBasePower * finalAttack) / finalDefense);
		baseDamage = (int) (Math.floor(baseDamage / 50)) + 2;

		if (debugMode)
		{
			System.out.println("Base Damage: " + baseDamage);
		}

		double damagePreRolls = baseDamage;

		//If spread move, 0.75x
		if (format.equals("Doubles") && move.isSpread() && !isZ)
		{
			damagePreRolls = pokeRound((damagePreRolls * 0xC00) / 0x1000);
		}
		
		if (isBabyHit)
		{
			damagePreRolls = pokeRound((damagePreRolls * 0x400) / 0x1000);
		}

		//Weather. Note that Strong Winds is actually a modifier to type matchups, not weather. 		
		if ((weather.equals("Sun") && moveType.equals("Fire")) ||(weather.equals("Rain") && moveType.equals("Water")))
		{
			damagePreRolls = pokeRound((damagePreRolls * 0x1800) / 0x1000);
			description.setWeather(weather);
		}
		else if ((weather.equals("Sun") && moveType.equals("Water")) ||(weather.equals("Rain") && moveType.equals("Fire")))
		{
			damagePreRolls = pokeRound((damagePreRolls * 0x800) / 0x1000);
			description.setWeather(weather);
		}

		//Critical hit
		if (isCrit)
		{
			damagePreRolls = (int) Math.floor((damagePreRolls * 0x1800) / 0x1000);
			description.setCrit(true);
		}
		
		int[] damageRolls = new int[16];
		
		//Random factor; from now on, all modifiers are applied to each roll separately.
		for (int i = 0; i < 16; i++)
		{
			damageRolls[i] = (int) Math.floor((damagePreRolls * (85 + i)) / 100);
		}
		
		if (debugMode)
		{
			System.out.println("After random factor: " + Arrays.toString(damageRolls));
		}

		//Automatically account for STAB if the ability is Protean
		if (moveType.equals(attackerTypeLeft) || (moveType.equals(attackerTypeRight) || attackerAbility.equals("Protean")))
		{
			int stabMod = 0x1800;
			if (attackerAbility.equals("Adaptability"))
			{
				stabMod = 0x2000;
				description.setAttackerAbility(attackerAbility);
			}
			for (int i = 0; i < 16; i++)
			{
				damageRolls[i] = (int) Math.floor((damageRolls[i] * stabMod) / 0x1000);
			}
		}
		
		
		//Type modifier. If some dynamic change to change move type reached this far (e.g. from -ate abilities), break out.
		if (typeMod == 0)
		{
			damageOutput = description.getNoDamageDescription("nice move there m8");
			damageOutputShort = description.getNoDamageShortDescription();
			return zeroDamageArray;
		}
		for (int i = 0; i < 16; i++)
		{
			damageRolls[i] = (int) Math.floor(damageRolls[i] * typeMod);
		}
		
		if (debugMode)
		{
			System.out.println("typeMod: " + typeMod);
			System.out.println("After typeMod: " + Arrays.toString(damageRolls));
			System.out.println(); //extra space for readability in console
		}

		//If burned. Guts/Facade ignores the effects of burn, but the boosts are applied elsewhere.
		if (attackerStatus.equals("Burned") && !(attackerAbility.equals("Guts")) && !(move.getName().equals("Facade") && usesPhysicalAttack))
		{
			for (int i = 0; i < 16; i++)
			{
				damageRolls[i] = (int) Math.floor((damagePreRolls * 0x800) / 0x1000);
			}
			description.setBurnt(true);
		}
		/*****Final modifiers*****
		*Final modifiers are specifically chained together. Using OZY's order rather than PS/BW research. */

		ArrayList<Integer> finalModifiers = new ArrayList<Integer>();

		//NOTE: OZY and PS calc say 0xAAC in Gen 6 and later for doubles screens rather than 0xA8F.
		if ((isReflect && usesPhysicalAttack) || (isLightScreen && !usesPhysicalAttack) && !isCrit)
		{
			if (format.equals("Doubles"))
			{
				finalModifiers.add(0xAAC);
			}
			else //Singles multiplier
			{
				finalModifiers.add(0x800);
			}
			
			String screen = isAuroraVeil ? "Aurora Veil" : usesPhysicalAttack ? "Reflect" : "Light Screen";
			description.setScreen(screen);
		}
		
		if (attackerAbility.equals("Neuroforce") && typeMod > 1)
		{
			finalModifiers.add(0x1400);
			description.setAttackerAbility(attackerAbility);
		}
		
		if (attackerAbility.equals("Sniper") && isCrit)
		{
			finalModifiers.add(0x1800);
			description.setAttackerAbility(attackerAbility);
		}
		
		if (attackerAbility.equals("Tinted Lens") && typeMod < 1)
		{
			finalModifiers.add(0x2000);
			description.setAttackerAbility(attackerAbility);
		}

		//Multiscale / Shadow Shield requires the target is at full HP.
		if ((defenderAbility.equals("Multiscale") || defenderAbility.equals("Shadow Shield")) && ((defenderCurrentHP == defenderHPStat) && !isBabyHit))
		{
			finalModifiers.add(0x800);
			description.setDefenderAbility(defenderAbility);
		}
		
		if (defenderAbility.equals("Fluffy") && move.getMakesContact())
		{
			finalModifiers.add(0x800);
			description.setDefenderAbility(defenderAbility);
		}

		if (isFriendGuard)
		{
			finalModifiers.add(0xC00);
			description.setFriendGuard(true);
		}

		if ((defenderAbility.equals("Solid Rock") || defenderAbility.equals("Filter") || defenderAbility.equals("Prism Armor")) && typeMod > 1)
		{
			finalModifiers.add(0xC00);
			description.setDefenderAbility(defenderAbility);
		}

		//Metronome
		if (attackerItem.getName().equals("Metronome"))
		{
			//Atm do nothing because it requires a specific turn count passed in.
			//description.setAttackerItem(attackerItem.getName());
		}
		
		if (defenderAbility.equals("Fluffy") && moveType.equals("Fire"))
		{
			finalModifiers.add(0x2000);
			description.setDefenderAbility(defenderAbility);
		}

		//Expert Belt
		if (attackerItem.getName().equals("Expert Belt") && typeMod > 1)
		{
			finalModifiers.add(0x1333);
			description.setAttackerItem(attackerItem.getName());
		}

		//Life Orb
		if (attackerItem.getName().equals("Life Orb"))
		{
			finalModifiers.add(0x14CC);
			description.setAttackerItem(attackerItem.getName());
		}

		//Calls a couple functions to check if it is a resist Berry, and what type it is.
		if (defenderItem.isResistBerry())
		{
			if (defenderItem.getTypeAssociated().equals(moveType) && (typeMod > 1 || moveType.equals("Normal")))
			{
				finalModifiers.add(0x800);
				description.setDefenderItem(defenderItem.getName());
			}
		}

		//TODO Double-powered moves are yet to be implemented.

		//Applying the final modifiers
		double finalMod = chainMods(finalModifiers);
		for (int i = 0; i < 16; i++)
		{
			damageRolls[i] = pokeRound((damageRolls[i] * finalMod) / 0x1000);
		}

		if (isZ && isProtect)
		{
			for (int i = 0; i < 16; i++)
			{
				damageRolls[i] = pokeRound((damageRolls[i] * 0x400) / 0x1000);
			}
			description.setProtect(true);
		}
		
		//Check for 1 damage and 16-bit cutoffs
		for (int i = 0; i < 16; i++)
		{
			if (damageRolls[i] < 1)
			{
				damageRolls[i] = 1;
			}
			if (damageRolls[i] > 65535) //It is possible to do 0 damage if this is 65536n.
			{
				damageRolls[i] = damageRolls[i] % 65536;
			}
		}
		
		return damageRolls;
	}
	
	/********* HELPER FUNCTIONS ************/
	
	//Game Freak rounds down on 0.5 decimals quite often.
	public int pokeRound(double num)
	{
		return num % 1 > 0.5 ? (int) Math.ceil(num) : (int) Math.floor(num);
	}

	//See how to chain a modifier.
	public double chainMods(ArrayList<Integer> mods)
	{
	    double m = 0x1000;
	    for (int i = 0; i < mods.size(); i++)
	    {
	        if (mods.get(i) != 0x1000)
	        {
	        	//Chained modifiers use school rounding, i.e. regular and NOT pokeRounding.
	        	m = Math.round((m * mods.get(i)) / 0x1000);
	        }
	    }
	    return m;
	}
	
	public double getTypeMod()
	{
		double modifier;
		
		if (attackerAbility.equals("Scrappy") && defenderTypeLeft.equals("Ghost"))
		{
			modifier = typechart[types.get(moveType)][types.get(defenderTypeRight)];
			description.setAttackerAbility(attackerAbility);
		}
		else if (attackerAbility.equals("Scrappy") && defenderTypeRight.equals("Ghost"))
		{
			modifier = typechart[types.get(moveType)][types.get(defenderTypeLeft)];
			description.setAttackerAbility(attackerAbility);
		}
		else if (move.getName().equals("Thousand Arrows") && moveType.equals("Ground") && (defenderTypeLeft.equals("Flying") || defenderTypeRight.equals("Flying")))
		{
			modifier = 1;
		}
		else if (move.getName().equals("Freeze-Dry") && (defenderTypeLeft.equals("Water") || defenderTypeRight.equals("Water")))
		{
			modifier = 4; //cheating a bit; 4x0.5 = 2 to balance out
			modifier *= typechart[types.get(moveType)][types.get(defenderTypeLeft)] * typechart[types.get(moveType)][types.get(defenderTypeRight)];
		}
		else if (move.getName().equals("Flying Press"))
		{
			modifier = typechart[types.get("Fighting")][types.get(defenderTypeLeft)]
					* typechart[types.get("Flying")][types.get(defenderTypeLeft)]
					* typechart[types.get("Fighting")][types.get(defenderTypeRight)]
					* typechart[types.get("Flying")][types.get(defenderTypeRight)];
		}
		else //Normal case
		{
			modifier = typechart[types.get(moveType)][types.get(defenderTypeLeft)] * typechart[types.get(moveType)][types.get(defenderTypeRight)];
		}
		
		//Strong Winds completely changes the type mod for things like Neuroforce, etc.
		if (weather.equals("Strong Winds") && (defenderTypeLeft.equals("Flying") || defenderTypeRight.equals("Flying")) && typechart[types.get(moveType)][types.get("Flying")] > 1)
		{
			modifier *= 0.5;
			description.setWeather(weather);
		}
		
		return modifier;
	}
	
	public int parseChangeValue(String changeValue)
	{
		int result;
		
		if (changeValue.charAt(1) == '-') //Neutral boost
		{
			result = 0;
		}
		else if (changeValue.charAt(0) == '+') //Positive boost
		{
			result = Character.getNumericValue(changeValue.charAt(1));
		}
		else
		{
			result = 0 - Character.getNumericValue(changeValue.charAt(1));
		}

		return result;
	}
	
	public int applyStatChange(int stat, int statChange)
	{
		if (statChange > 0)
		{
			stat = (int) Math.floor((stat * (2 + statChange)) / 2);
		}
		else
		{
			stat = (int) Math.floor((stat * 2) / (2 - statChange));
		}
		return stat;
	}
	
	//Calculate weight with modifiers (no Autotomize)
	public double calculateWeight(String name, String ability, Item item)
	{
		double baseWeight = pokedex.get(name).getWeight();
		if (ability.equals("Heavy Metal"))
		{
			baseWeight *= 2;
		}
		else if (ability.equals("Light Metal"))
		{
			baseWeight = baseWeight / 2;
			if (baseWeight < 0.1) {baseWeight = 0.1;}
		}
		if (item.getName().equals("Float Stone"))
		{
			baseWeight = baseWeight / 2;
			if (baseWeight < 0.1) {baseWeight = 0.1;}
		}
		//Weight is "floored" to the nearest tenths place.
		baseWeight = Math.floor(baseWeight * 10) / 10;
		
		return baseWeight;	
	}
	
	//Calculate Speed with modifiers (no Tailwind or Pledge Swamp atm)
	public int calculateSpeed(int stat, int statChange, Item item, String ability, String status)
	{
		int baseSpeed = stat;
		
		//-6 to +6
		baseSpeed = applyStatChange(baseSpeed, statChange);
		
		//It's possible these are chained together TODO test (if mathematically significant)
		double otherSpeedMods = 1;
		
		if ((ability.equals("Chlorophyll") && weather.equals("Sun"))
				|| (ability.equals("Swift Swim") && weather.equals("Rain"))
				|| (ability.equals("Sand Rush") && weather.equals("Sand"))
				|| (ability.equals("Slush Rush") && weather.equals("Hail"))
				|| (ability.equals("Surge Surfer") && terrain.equals("Electric"))
				|| (ability.equals("Unburden") && item.getName().equals("(none)"))
				|| (item.getName().equals("Quick Powder"))) //Technically not checking for Ditto
		{
			otherSpeedMods *= 2;
		}
		
		if (ability.equals("Slow Start"))
		{
			otherSpeedMods *= 0.5;
		}
		if (item.isHalvesSpeed())
		{
			otherSpeedMods *= 0.5;
		}
		
		if (ability.equals("Quick Feet") && !status.equals("Healthy"))
		{
			otherSpeedMods *= 1.5;
		}
		
		if (item.getName().equals("Choice Scarf"))
		{
			otherSpeedMods *= 1.5;
		}
		
		baseSpeed = pokeRound(baseSpeed * otherSpeedMods);
		
		//Don't apply para if Ability was Quick Feet
		if (status.equals("Paralyzed") && !ability.equals("Quick Feet"))
		{
			baseSpeed = (int) Math.floor(baseSpeed / 2);
		}
		
		if (baseSpeed > 10000) {baseSpeed = 10000;}
		
		return baseSpeed;
	}

	public String getDamageRolls()
	{
		return description.getDamageRolls();
	}

	public String getDamageOutput()
	{
		return damageOutput;
	}

	public String getDamageOutputShort()
	{
		return damageOutputShort;
	}
}
