/* Models damage calculation based on the games.
 * Quick references:
 * http://bbs10.aimix-z.com/mtpt.cgi?room=sonota&mode=view2&f=140&no=27-29 (OZY Gen 7 research)
 * https://www.smogon.com/bw/articles/bw_complete_damage_formula (BW documentation)
 * https://docs.google.com/document/d/1uJtdnOTtM6b0uu7bNkRHhmvNvxgHrtQ4mSXgimJ1_P0/edit (DaWoblefet's old guide based on BW documentation)
 * https://pokemonshowdown.com/damagecalc/js/damage.js?97051234 (PS damage calc implementation) */

package superDamageCalculator;
import java.util.HashMap;
import java.util.Arrays;

import static superDamageCalculator.StatConstants.*;

import java.util.ArrayList;
import java.util.Map.*;
import java.util.Objects;

public class CalculateDamage
{
	private HashMap<String, Pokemon> pokedex = Pokedex.getPokedex();
	private HashMap<String, Move> movedex = new Movedex().getMovedex();
	private HashMap<String, Integer> types = new Type().types;
	private HashMap<String, Integer> natures = new Nature().natures;
	private double typechart[][] = new Type().typeChart;
	private boolean debugMode = false;

	private Pokemon attacker;
	private String attackerName;
	private String attackerTypeLeft;
	private String attackerTypeRight;
	private int attackerLevel;
	private int attackerOffenseStat;
	private int attackerOffenseStatEVs;
	private int attackerSpeedStat;
	private int attackerOffenseChange;
	private int attackerSpeedChange;
	private String attackerNature;
	private String attackerAbility;
	private Item attackerItem;
	private String attackerStatus;

	private Move move;
	private int moveBP;
	private String moveType;
	private String moveCategory;
	private boolean isCrit;
	private boolean isZ;

	private Pokemon defender;
	private String defenderName;
	private String defenderTypeLeft;
	private String defenderTypeRight;
	private int defenderHPStat;
	private int defenderHPStatEVs;
	private int defenderDefenseStat;
	private int defenderDefenseStatEVs;
	private int defenderSpeedStat;
	private int defenderDefenseChange;
	private int defenderSpeedChange;
	private String defenderNature;
	private String defenderAbility;
	private Item defenderItem;
	private String defenderStatus;

	private String format;
	private String terrain;
	private String weather;
	private boolean isFairyAura;
	private boolean isDarkAura;
	private boolean isAuraBreak;
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
	public CalculateDamage(Move move, Pokemon attacker, Pokemon defender, FieldOptions fieldOptions, boolean isLeft)
	{
		this.attacker = attacker;
		this.defender = defender;
		this.move = move;
		moveBP = move.getBP();
		moveType = move.getType();
		moveCategory = move.getCategory();
		isCrit = move.isCritChecked();
		isZ = move.isZChecked();
		
		int whichAtk = 0;
		int whichDef = 0;
		if (moveCategory.equals("Physical"))
		{
			whichAtk = ATK;
			whichDef = DEF;
		}
		else if (moveCategory.equals("Special"))
		{
			whichAtk = SATK;
			whichDef = SDEF;
		}
		else if (moveCategory.equals("Psyshock effect"))
		{
			whichAtk = SATK;
			whichDef = DEF;
		}
		
		
		attackerName = attacker.getName();
		attackerTypeLeft = attacker.getType(0);
		attackerTypeRight = attacker.getType(1);
		attackerLevel = attacker.getStat(1).getLevel();
		attackerOffenseStat = attacker.getStat(whichAtk).calculateStat();
		attackerOffenseStatEVs = attacker.getStat(whichAtk).getEVs();
		attackerSpeedStat = attacker.getStat(SPE).calculateStat();
		attackerOffenseChange = parseChangeValue(attacker.getStat(whichAtk).getBoostLevel());
		attackerSpeedChange = parseChangeValue(attacker.getStat(SPE).getBoostLevel());
		attackerNature = attacker.getNature();
		attackerAbility = attacker.getAbility(0);
		attackerItem = attacker.getItem();
		attackerStatus = attacker.getStatus();


		defenderName = defender.getName();
		defenderTypeLeft = defender.getType(0);
		defenderTypeRight = defender.getType(1);
		defenderHPStat = defender.getStat(HP).calculateStat();
		defenderHPStatEVs = defender.getStat(HP).getEVs();
		defenderDefenseStat = defender.getStat(whichDef).calculateStat();
		defenderDefenseStatEVs = defender.getStat(whichDef).getEVs();
		defenderSpeedStat = defender.getStat(SPE).calculateStat();
		defenderDefenseChange = parseChangeValue(defender.getStat(whichDef).getBoostLevel());
		defenderSpeedChange = parseChangeValue(defender.getStat(SPE).getBoostLevel());
		defenderNature = defender.getNature();
		defenderAbility = defender.getAbility(0);
		defenderItem = defender.getItem();
		defenderStatus = defender.getStatus();

		format = fieldOptions.getFormat();
		terrain = fieldOptions.getTerrain();
		weather = fieldOptions.getWeather();
		isFairyAura = fieldOptions.isFairyAura();
		isDarkAura = fieldOptions.isDarkAura();
		isAuraBreak = fieldOptions.isAuraBreak();
		
		if (isLeft)
		{
			isHelpingHand = fieldOptions.getLeftSideOptions().isHelpingHand();
			isProtect = fieldOptions.getLeftSideOptions().isProtect();
			isReflect = fieldOptions.getLeftSideOptions().isReflect();
			isLightScreen = fieldOptions.getLeftSideOptions().isLightScreen();
			if (fieldOptions.getLeftSideOptions().isAuroraVeil())
			{
				isReflect = true;
				isLightScreen = true;
			}
			isFriendGuard = fieldOptions.getLeftSideOptions().isFriendGuard();
		}
		else
		{
			isHelpingHand = fieldOptions.getRightSideOptions().isHelpingHand();
			isProtect = fieldOptions.getRightSideOptions().isProtect();
			isReflect = fieldOptions.getRightSideOptions().isReflect();
			isLightScreen = fieldOptions.getRightSideOptions().isLightScreen();
			if (fieldOptions.getRightSideOptions().isAuroraVeil())
			{
				isReflect = true;
				isLightScreen = true;
			}
			isFriendGuard = fieldOptions.getRightSideOptions().isFriendGuard();
		}

		typeMod = typechart[types.get(moveType)][types.get(defenderTypeLeft)] * typechart[types.get(moveType)][types.get(defenderTypeRight)];
		if (moveCategory.equals("Status") || typeMod == 0)
		{
			if (moveType.equals("Electric") && (defenderTypeLeft.equals("Ground") || defenderTypeRight.equals("Ground")))
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
			moveBP = checkForCustomBP();
			finalBasePower = calculateFinalBasePower();
			finalAttack = calculateFinalAttack();
			finalDefense = calculateFinalDefense();
			mainCalculation();
			writeDamageOutput();
		}
	}
	
	
	public int checkForCustomBP()
	{
		int initialBP = moveBP;
		switch (move.getName())
		{
			case "Low Kick":
			case "Grass Knot":
				double userWeight = calculateWeight(attackerName, attackerAbility, attackerItem);
				double targetWeight = calculateWeight(defenderName, defenderAbility, defenderItem);
				int relativeWeight = (int) Math.floor(userWeight / targetWeight);
				initialBP = relativeWeight >= 5 ? 120 : relativeWeight >= 4 ? 100 : relativeWeight >= 3 ? 80 : relativeWeight >= 2 ? 60 : 40; 
				break;
			case "Gyro Ball":
				int userSpeed = calculateSpeed(attackerSpeedStat, attackerSpeedChange, attackerItem, attackerAbility, attackerStatus);
				int targetSpeed = calculateSpeed(defenderSpeedStat, defenderSpeedChange, defenderItem, defenderAbility, defenderStatus);
				if (userSpeed == 0) {initialBP = 1;}
				else //Gyro Ball must have min 1 BP and max 150 BP
				{
					initialBP = Math.max(1, Math.min(150, (int) Math.floor((25 * (double) targetSpeed) / userSpeed)));
				}
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
				break;
			case "Water Spout":
			case "Eruption":
				initialBP = Math.max(1, (int) Math.floor((150.0 * attacker.getCurrentHP() / attacker.getStat(HP).calculateStat())));
				break;
			case "Heavy Slam":
			case "Heat Crash":
				targetWeight = calculateWeight(defenderName, defenderAbility, defenderItem);
				initialBP = targetWeight >= 200 ? 120 : targetWeight >= 100 ? 100 : targetWeight >= 50 ? 80 : targetWeight >= 25 ? 60 : targetWeight >= 10 ? 40 : 20;
				break;
			case "Acrobatics":
				if (attackerItem.getName().equals("(none"))
				{
					initialBP = 110;
				}
				else
				{
					initialBP = 55;
				}
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
				}
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
					default: break;
				}
				moveType = move.getType();
				moveBP = move.getBP();
				moveCategory = "Special";
				break;
			case "Fling": //Could verify an item is unFlingable by checking if BP is 0
				initialBP = attackerItem.getFlingBP();
				break;	
			case "Natural Gift": //Could avoid running checks on non-Berries
				if (attackerItem.isBerry())
				{
					initialBP = attackerItem.getNaturalGiftBP();
					moveType = attackerItem.getNaturalGiftType();
				}
				break;
			case "Hex":
				if (!defenderStatus.equals("Healthy"))
				{
					initialBP = 130;
				}
				break;
			case "Wake-Up Slap":
				if (defenderStatus.equals("Asleep"))
				{
					initialBP = 140;
				}
				break;
			case "Smelling Salts":
				if (defenderStatus.equals("Paralyzed"))
				{
					initialBP = 140;
				}
				break;
			case "Wring Out":
			case "Crush Grip":
				//Taken from https://raw.githubusercontent.com/Zarel/Pokemon-Showdown/master/data/moves.js
				int fancyCalculation = (int) Math.floor(Math.floor((120 * (100 * Math.floor((defender.getCurrentHP() * 4096.0 / defender.getStat(HP).calculateStat())) + 2048 - 1) / 4096) / 100));	
				initialBP = Math.max(1, fancyCalculation);
				break;
			case "Flail":
			case "Reversal":
				int p = ((int) Math.floor(48.0 * attacker.getCurrentHP() / attacker.getStat(HP).calculateStat()));
				initialBP = p <= 1 ? 200 : p <= 4 ? 150 : p <= 9 ? 100 : p <= 16 ? 80 : p <= 32 ? 40 : 20;
				break;
			case "Water Shuriken":
				if (attackerName.equals("Greninja-Ash") && attackerAbility.equals("Battle Bond"))
				{
					initialBP = 20;
				}
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
		return initialBP;
	}

	public int calculateFinalBasePower()
	{
		int startingBP = moveBP;
		if (debugMode)
		{
			System.out.println("BP prior to modifiers is: " + startingBP);
		}
		
		ArrayList<Integer> bpModifiers = new ArrayList<Integer>();
		
		if (isAuraBreak && (isFairyAura && moveType.equals("Fairy")) || (isDarkAura && moveType.equals("Dark")))
		{
			bpModifiers.add(0xC00);
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
					break;
				case "Pixilate":
					moveType = "Fairy";
					bpModifiers.add(0x1333);
					break;
				case "Refrigerate":
					moveType = "Ice";
					bpModifiers.add(0x1333);
					break;
				case "Galvanize":
					moveType = "Electric";
					bpModifiers.add(0x1333);
					break;
				case "Liquid Voice":
					if (move.isSound())
					{
						moveType = "Water";
					}
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
		}
		
		if (attackerAbility.equals("Iron Fist") && move.isPunch())
		{
			bpModifiers.add(0x1333);
		}
		
		//Doesn't account for Jump Kick or HJK atm
		if (attackerAbility.equals("Reckless") && move.getHasRecoil())
		{
			bpModifiers.add(0x1333);
		}
		
		//if (Rivalry and gender is the same) TODO
		//bpModifiers.add(0x1400);
		
		//if (Battery field effect active) TODO
		//bpModifiers.add(0x14CD);
		
		if (attackerAbility.equals("Sheer Force") && move.getHasSecondaryEffect())
		{
			bpModifiers.add(0x14CD);
		}
		
		if (attackerAbility.equals("Sand Force") && weather.equals("Sand") && Arrays.asList("Rock", "Ground", "Steel").contains(moveType))
		{
			bpModifiers.add(0x14CD);
		}
		
		//Automatically apply Analytic and skip Speed checks or whatever
		if (attackerAbility.equals("Analytic"))
		{
			bpModifiers.add(0x14CD);
		}
		
		if (attackerAbility.equals("Tough Claws") && move.getMakesContact())
		{
			bpModifiers.add(0x14CD);
		}
		
		if ((isFairyAura && moveType.equals("Fairy")) || (isDarkAura && moveType.equals("Dark")))
		{
			bpModifiers.add(0x1548);
		}
		
		//Technician considers any previous modifiers in its <= 60 BP check.
		if (attackerAbility.equals("Technician"))
		{
			int tempBP = pokeRound(startingBP * chainMods(bpModifiers) / 0x1000);
			if (tempBP <= 60)
			{
				bpModifiers.add(0x1800);
			}
		}
		
		if (attackerAbility.equals("Flare Boost") && attackerStatus.equals("Burned") && (moveType.equals("Special") || moveType.equals("Psyshock effect")))
		{
			bpModifiers.add(0x1800);
		}
		
		if (attackerAbility.equals("Toxic Boost") && (attackerStatus.equals("Poisoned") || attackerStatus.equals("Badly Poisoned")) && moveType.equals("Physical"))
		{
			bpModifiers.add(0x1800);
		}
		
		if (attackerAbility.equals("Strong Jaw") && move.isBite())
		{
			bpModifiers.add(0x1800);
		}
		
		if (attackerAbility.equals("Mega Launcher") && move.isPulse())
		{
			bpModifiers.add(0x1800);
		}
		
		if (defenderAbility.equals("Heatproof") && moveType.equals("Fire"))
		{
			bpModifiers.add(0x800);
		}
		
		if (defenderAbility.equals("Dry Skin") && moveType.equals("Fire"))
		{
			bpModifiers.add(0x1400);
		}
		
		if ((attackerItem.getName().equals("Muscle Band") && moveCategory.equals("Physical")) || (attackerItem.getName().equals("Wise Glasses") && (moveCategory.equals("Special") || moveCategory.equals("Psyshock effect"))))
		{
			bpModifiers.add(0x1199);
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
			}
		}
		
		if (attackerItem.isGem() && attackerItem.getTypeAssociated().equals(moveType))
		{
			bpModifiers.add(0x14CD);
		}
		
		if ((move.getName().equals("Solar Beam") || move.getName().equals("Solar Blade")) && weather.equals("Rain"))
		{
			bpModifiers.add(0x800);
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
		}
		
		if (isHelpingHand)
		{
			bpModifiers.add(0x1800);
		}
				
		//if (has Charge) TODO
		//bpModifiers.add(0x2000);
		
		//Facade doesn't double on sleep or freeze
		if (move.getName().equals("Facade") && !Arrays.asList("Healthy", "Asleep", "Frozen").contains(attackerStatus))
		{
			bpModifiers.add(0x2000);
		}
		
		if (move.getName().equals("Brine") && defender.getCurrentHP() <= defenderHPStat / 2.0)
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
			}
			if (terrain.equals("Grassy") && (move.getName().equals("Earthquake") || move.getName().equals("Bulldoze") || move.getName().equals("Magnitude")))
			{
				bpModifiers.add(0x800);
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
	
	public int calculateFinalAttack()
	{
		int baseAttack = attackerOffenseStat;
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
			if (attackerOffenseChange > 0)
			{
				baseAttack = (int) Math.floor((baseAttack * (2 + attackerOffenseChange)) / 2);
			}
			else
			{
				baseAttack = (int) Math.floor((baseAttack * 2) / (2-attackerOffenseChange));
			}
		}
		
		//Hustle is not chained like the other modifiers, instead applied directly.
		if (attackerAbility.equals("Hustle") && moveCategory.equals("Physical"))
		{
			baseAttack = pokeRound(baseAttack * 3 / 2);
		}
		
		ArrayList<Integer> attackModifiers = new ArrayList<Integer>();
		
		//Slow Start halves damage for all physical attacks and special Z-moves
		if (attackerAbility.equals("Slow Start") && (moveCategory.equals("Physical") || (moveCategory.equals("Special") && isZ)))
		{
			attackModifiers.add(0x800);
		}
		
		if (attackerAbility.equals("Defeatist") && attacker.getCurrentHP() <= attacker.getStat(HP).calculateStat() / 2.0)
		{
			attackModifiers.add(0x800);
		}
		
		//Technically Flower Gift can also be an ally's ability
		if (attackerAbility.equals("Flower Gift") && moveCategory.equals("Physical") && weather.equals("Sun"))
		{
			attackModifiers.add(0x1800);
		}
		
		if (attackerAbility.equals("Guts") && !attackerStatus.equals("Healthy") && moveCategory.equals("Physical"))
		{
			attackModifiers.add(0x1800);
		}
		
		//Torrent/Swarm/Overgrow/Blaze
		if (attacker.getCurrentHP() <= attacker.getStat(HP).calculateStat() / 3.0 && (attackerAbility.equals("Blaze") && moveType.equals("Fire")) || (attackerAbility.equals("Torrent") && moveType.equals("Water")) || (attackerAbility.equals("Overgrow") && moveType.equals("Grass")) || (attackerAbility.equals("Swarm") && moveType.equals("Bug")))
		{
			attackModifiers.add(0x1800);
		}
		
		//TODO Flash Fire needs a trigger to activate
		if (attackerAbility.equals("Flash Fire") && moveType.equals("Fire"))
		{
			//attackModifiers.add(0x1800);
		}
		
		if (attackerAbility.equals("Solar Power") && weather.equals("Sun") && (moveCategory.equals("Special") || moveCategory.equals("Psyshock effect")))
		{
			attackModifiers.add(0x1800);
		}
		
		//Plus/Minus default to being on if the ability is selected
		if ((attackerAbility.equals("Plus") || attackerAbility.equals("Minus")) && (moveCategory.equals("Special") || moveCategory.equals("Psyshock effect")))
		{
			attackModifiers.add(0x1800);
		}
		
		if (attackerAbility.equals("Steelworker") && moveType.equals("Steel"))
		{
			attackModifiers.add(0x1800);
		}
		
		if ((attackerAbility.equals("Huge Power") || attackerAbility.equals("Pure Power")) && moveCategory.equals("Physical"))
		{
			attackModifiers.add(0x2000);
		}
		
		//Offensive Water Bubble
		if (attackerAbility.equals("Water Bubble") && moveType.equals("Water"))
		{
			attackModifiers.add(0x2000);
		}
		
		//TODO flag for Stakeout double condition
		if (attackerAbility.equals("Stakeout"))
		{
			//attackModifiers.add(0x2000);
		}
		
		if (defenderAbility.equals("Thick Fat") && (moveType.equals("Fire") || moveType.equals("Ice")))
		{
			attackModifiers.add(0x800);
		}
		
		//Defensive Water Bubble
		if (defenderAbility.equals("Water Bubble") && moveType.equals("Fire"))
		{
			attackModifiers.add(0x800);
		}
		
		if ((attackerItem.getName().equals("Choice Band") && moveCategory.equals("Physical")) || (attackerItem.getName().equals("Choice Specs") && (moveCategory.equals("Special") || moveCategory.equals("Psyshock effect"))))
		{
			attackModifiers.add(0x1800);
		}
		
		if (attackerItem.getName().equals("Thick Club") && Arrays.asList("Marowak", "Marowak-Alola", "Marowak-Alola-Totem", "Cubone").contains(attackerName) && moveCategory.equals("Physical"))
		{
			attackModifiers.add(0x2000);
		}
		
		if (attackerItem.getName().equals("Deep Sea Tooth") && attackerName.equals("Clamperl") && (moveCategory.equals("Special") || moveCategory.equals("Psyshock effect")))
		{
			attackModifiers.add(0x2000);
		}
		
		if (attackerItem.getName().equals("Light Ball") && attackerName.equals("Pikachu"))
		{
			attackModifiers.add(0x2000);
		}

		if (debugMode)
		{
			System.out.println("Attack after modifiers is: " + (int) Math.max(1, pokeRound(baseAttack * chainMods(attackModifiers) / 0x1000)));
		}
		
		//Chain modifiers; attack must be 1 at a minimum.
		return (int) Math.max(1, pokeRound(baseAttack * chainMods(attackModifiers) / 0x1000));
	}

	public int calculateFinalDefense()
	{
		int baseDefense = defenderDefenseStat;
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
			
			if (defenderDefenseChange > 0)
			{
				baseDefense = (int) Math.floor((baseDefense * (2 + defenderDefenseChange)) / 2);
			}
			else
			{
				baseDefense = (int) Math.floor((baseDefense * 2) / (2-defenderDefenseChange));
			}
		}
		
		//Sandstorm is applied prior to the other defense modifiers
		if (weather.equals("Sand") && (defenderTypeLeft.equals("Rock") || defenderTypeRight.equals("Rock")) && moveCategory.equals("Special"))
		{
			baseDefense = pokeRound(baseDefense * 3 / 2);
		}
		
		ArrayList<Integer> defenseModifiers = new ArrayList<Integer>();
		
		//Technically Flower Gift can be an ally's ability
		if (defenderAbility.equals("Flower Gift") && weather.equals("Sun") && moveCategory.equals("Special"))
		{
			defenseModifiers.add(0x1800);
		}		
		
		if (defenderAbility.equals("Marvel Scale") && !defenderStatus.equals("Healthy") && (moveCategory.equals("Physical") || moveCategory.equals("Psyshock effect")))
		{
			defenseModifiers.add(0x1800);
		}
		
		if (defenderAbility.equals("Grass Pelt") && terrain.equals("Grassy") && (moveCategory.equals("Physical") || moveCategory.equals("Psyshock effect")))
		{
			defenseModifiers.add(0x1800);
		}
		
		if (defenderAbility.equals("Fur Coat") && (moveCategory.equals("Physical") || moveCategory.equals("Psyshock effect")))
		{
			defenseModifiers.add(0x2000);
		}
		
		//Assumes Eviolite holder meets the correct conditions
		if (defenderItem.getName().equals("Eviolite"))
		{
			defenseModifiers.add(0x1800);
		}
		
		if (defenderItem.getName().equals("Assault Vest") && moveCategory.equals("Special"))
		{
			defenseModifiers.add(0x1800);
		}
		
		//BW documentation says 0x1800 but everywhere else says 0x2000
		if (defenderItem.getName().equals("Deep Sea Scale") && defenderName.equals("Clamperl") && moveCategory.equals("Special"))
		{
			defenseModifiers.add(0x2000);
		}
		
		if (defenderItem.getName().equals("Metal Powder") && defenderName.equals("Ditto") && (moveCategory.equals("Physical") || moveCategory.equals("Psyshock effect")))
		{
			defenseModifiers.add(0x2000);
		}
		
		if (debugMode)
		{
			System.out.println("Defense after modifiers: " + (int) Math.max(1, pokeRound(baseDefense * chainMods(defenseModifiers) / 0x1000)));
		}
		
		//Defense must be 1 at a minimum
		return (int) Math.max(1, pokeRound(baseDefense * chainMods(defenseModifiers) / 0x1000));
	}

	public void mainCalculation()
	{
		double baseDamage = (int) Math.floor((2 * attackerLevel / 5) + 2);
		baseDamage = (int) Math.floor((baseDamage * finalBasePower * finalAttack) / finalDefense);
		baseDamage = (int) (Math.floor(baseDamage / 50)) + 2;

		if (debugMode)
		{
			System.out.println("Base Damage: " + baseDamage);
		}

		double damagePreRolls = baseDamage;

		//If spread move, 0.75x
		if (format.equals("Doubles") && move.isSpread() && !(isZ))
		{
			damagePreRolls = pokeRound((damagePreRolls * 0xC00) / 0x1000);
		}
		
		//TODO Parental Bond checks here
		if (attackerAbility.equals("Parental Bond") && !move.isSpread() && !isZ)
		{
			//Parental Bond doesn't work on any of the following:
			if (!Arrays.asList("Fling", "Self-Destruct", "Explosion", "Final Gambit", "Uproar", "Rollout", "Ice Ball", "Endeavor", 
					"Bounce", "Dig", "Dive", "Fly", "Freeze Shock", "Ice Burn", "Phantom Force", "Razor Wind", "Shadow Force", 
					"Skull Bush", "Sky Attack", "Sky Drop", "Solar Beam", "Solar Blade").contains(move.getName()))
			{
				//Parental Bond logic
			}
		}

		//Weather 		
		switch (weather)
		{
			case "Sun":
				if (moveType.equals("Fire"))
				{
					damagePreRolls = pokeRound((damagePreRolls * 0x1800) / 0x1000);
				}
				else if (moveType.equals("Water"))
				{
					damagePreRolls = pokeRound((damagePreRolls * 0x800) / 0x1000);
				}
				break;
			case "Rain":
				if (moveType.equals("Water"))
				{
					damagePreRolls = pokeRound((damagePreRolls * 0x1800) / 0x1000);
				}
				else if (moveType.equals("Fire"))
				{
					damagePreRolls = pokeRound((damagePreRolls * 0x800) / 0x1000);
				}
				break;
			case "Strong Winds":
				if (defenderTypeLeft.equals("Flying") || defenderTypeRight.equals("Flying"))
				{
					//If the move is super effective on a Flying-type, cut the damage by half
					if (typechart[types.get(moveType)][types.get("Flying")] > 1)
					{
						damagePreRolls = pokeRound((damagePreRolls * 0x800) / 0x1000);
					}
				}
				break;
			default:
				break;
		}

		//Critical hit
		if (isCrit)
		{
			damagePreRolls = (int) Math.floor((damagePreRolls * 0x1800) / 0x1000);
		}
		//Random factor; from now on, all modifiers are applied to each roll separately.
		for (int i = 0; i < 16; i++)
		{
			damageRolls[i] = (int) Math.floor((damagePreRolls * (85 + i)) / 100);
		}
		
		if (debugMode)
		{
			System.out.println("After random factor: " + Arrays.toString(damageRolls));
			System.out.println(); //extra space for readability in console
		}

		//Automatically account for STAB if the ability is Protean
		if (moveType.equals(attackerTypeLeft) || (moveType.equals(attackerTypeRight) || attackerAbility.equals("Protean")))
		{
			int stabMod = 0x1800;
			if (attackerAbility.equals("Adaptability"))
			{
				stabMod = 0x2000;
			}
			for (int i = 0; i < 16; i++)
			{
				damageRolls[i] = (int) Math.floor((damageRolls[i] * stabMod) / 0x1000);
			}
		}

		//Type chart. The modifier was calculated already when it checked to see if the move was immune.
		for (int i = 0; i < 16; i++)
		{
			damageRolls[i] = (int) Math.floor(damageRolls[i] * typeMod);
		}

		//If burned. Guts/Facade ignores the effects of burn, but the boosts are applied elsewhere.
		if (attackerStatus.equals("Burned") && moveCategory.equals("Physical") && !(attackerAbility.equals("Guts")) && !(move.getName().equals("Facade")))
		{
			for (int i = 0; i < 16; i++)
			{
				damageRolls[i] = (int) Math.floor((damagePreRolls * 0x800) / 0x1000);
			}
		}
		/*****Final modifiers*****
		*Final modifiers are specifically chained together. Using OZY's order rather than PS/BW research. */

		ArrayList<Integer> finalModifiers = new ArrayList<Integer>();

		//NOTE: OZY and PS calc say 0xAAC in Gen 6 and later for doubles screens rather than 0xA8F.
		if ((isReflect && moveCategory.equals("Physical")) || (isLightScreen && (moveCategory.equals("Special") || moveCategory.equals("Psyshock effect"))))
		{
			if (format.equals("Doubles"))
			{
				finalModifiers.add(0xAAC);
			}
			else //Singles multiplier
			{
				finalModifiers.add(0x800);
			}
		}
		
		if (attackerAbility.equals("Neuroforce") && typeMod > 1)
		{
			finalModifiers.add(0x1400);
		}
		
		if (attackerAbility.equals("Sniper") && isCrit)
		{
			finalModifiers.add(0x1800);
		}
		
		if (attackerAbility.equals("Tinted Lens") && typeMod < 1)
		{
			finalModifiers.add(0x2000);
		}

		//Multiscale / Shadow Shield requires the target is at full HP.
		if ((defenderAbility.equals("Multiscale") || defenderAbility.equals("Shadow Shield")) && defender.getCurrentHP() == defenderHPStat)
		{
			finalModifiers.add(0x800);
		}
		
		if (defenderAbility.equals("Fluffy") && move.getMakesContact())
		{
			finalModifiers.add(0x800);
		}

		if (isFriendGuard)
		{
			finalModifiers.add(0xC00);
		}

		if (defenderAbility.equals("Solid Rock") || defenderAbility.equals("Filter") || defenderAbility.equals("Prism Armor"))
		{
			finalModifiers.add(0xC00);
		}

		//Metronome
		if (attackerItem.getName().equals("Metronome"))
		{
			//Atm do nothing because it requires a specific turn count passed in.
		}
		
		if (defenderAbility.equals("Fluffy") && moveType.equals("Fire"))
		{
			finalModifiers.add(0x2000);
		}

		//Expert Belt
		if (attackerItem.getName().equals("Expert Belt") && typeMod > 1)
		{
			finalModifiers.add(0x1333);
		}

		//Life Orb
		if (attackerItem.getName().equals("Life Orb"))
		{
			finalModifiers.add(0x14CC);
		}

		//Calls a couple functions to check if it is a resist Berry, and what type it is.
		if (defenderItem.isResistBerry())
		{
			if (defenderItem.getTypeAssociated().equals(moveType) && (typeMod > 1 || moveType.equals("Normal")))
			{
				finalModifiers.add(0x800);
			}
		}

		//TODO Double-powered moves are yet to be implemented.

		//Applying the final modifiers
		double finalMod = chainMods(finalModifiers);
		for (int i = 0; i < 16; i++)
		{
			damageRolls[i] = pokeRound((damageRolls[i] * finalMod) / 0x1000);
		}

		//PS and OZY has Z-moves quartered post-final modifiers.
		if (isZ && isProtect)
		{
			for (int i = 0; i < 16; i++)
			{
				damageRolls[i] = pokeRound((damageRolls[i] * 0x400) / 0x1000);
			}
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
	}
	
	/********* HELPER FUNCTIONS ************
	 * */
	
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
	
	//Calculate weight with modifiers (no Autotomize)
	public double calculateWeight(String name, String ability, Item item)
	{
		double baseWeight = (int) Math.floor(pokedex.get(name).getWeight());
		if (ability.equals("Heavy Metal"))
		{
			baseWeight *= 2;
		}
		if (ability.equals("Light Metal"))
		{
			baseWeight = pokeRound(baseWeight / 2.0);
		}
		if (item.getName().equals("Float Stone"))
		{
			baseWeight = pokeRound(baseWeight / 2.0);
		}
		return baseWeight;	
	}
	
	//Calculate Speed with modifiers (no Tailwind or Pledge Swamp atm)
	public int calculateSpeed(int stat, int statChange, Item item, String ability, String status)
	{
		int baseSpeed = stat;
		
		//-6 to +6
		if (statChange > 0)
		{
			baseSpeed = (int) Math.floor((baseSpeed * (2 + statChange)) / 2);
		}
		else
		{
			baseSpeed = (int) Math.floor((baseSpeed * 2) / (2-statChange));
		}
		
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
		
		if (ability.equals("Slow Start") || item.isHalvesSpeed())
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
			baseSpeed = (int) Math.floor(baseSpeed / 4);
		}
		
		if (baseSpeed > 10000) {baseSpeed = 10000;}
		
		return baseSpeed;
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
		
		int smallestXHKO = (int) Math.ceil((double) defenderHPStat / damageRolls[15]);
		int largestXHKO = (int) Math.ceil((double) defenderHPStat / damageRolls[0]);
		
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
				KOChanceLogic xhkoChance = new KOChanceLogic(defenderHPStat, damageRollDuplicates);
				if (smallestXHKO == 1)
				{
					result = xhkoChance.getPercentToKO() + "% chance to " + "OHKO ";
				}
				else
				{
					result = xhkoChance.getPercentToKO(2) + "% chance to " + smallestXHKO + "HKO ";
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
