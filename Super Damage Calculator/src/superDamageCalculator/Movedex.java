/* A hashmap of moves from the Pokemon games. Modeled in Move.java. If a boolean wasn't set, it is
 * assumed to be false.
 * Data from Pokemon Showdown's moves file: https://raw.githubusercontent.com/Zarel/Pokemon-Showdown/master/data/moves.js */

package superDamageCalculator;
import java.util.HashMap;

public class Movedex
{
	public HashMap<String, Move> movedex = new HashMap<String, Move>();

	public Movedex()
	{
		init();
	}
	
	public Move get(String name)
    {
    	return movedex.get(name);
    }
    
    public HashMap<String, Move> getMovedex()
    {
    	return movedex;
    }

	public void init()
	{
		Move tenmillionvoltthunderbolt = new Move("10,000,000 Volt Thunderbolt");
		tenmillionvoltthunderbolt.setBP(195);
		tenmillionvoltthunderbolt.setZBP(0);
		tenmillionvoltthunderbolt.setCategory("Special");
		tenmillionvoltthunderbolt.setType("Electric");
		tenmillionvoltthunderbolt.setSignatureZ(true);
		movedex.put("10,000,000 Volt Thunderbolt", tenmillionvoltthunderbolt);

		Move absorb = new Move("Absorb");
		absorb.setBP(20);
		absorb.setZBP(100);
		absorb.setCategory("Special");
		absorb.setType("Grass");
		movedex.put("Absorb", absorb);

		Move accelerock = new Move("Accelerock");
		accelerock.setBP(40);
		accelerock.setZBP(100);
		accelerock.setCategory("Physical");
		accelerock.setType("Rock");
		accelerock.setMakesContact(true);
		movedex.put("Accelerock", accelerock);

		Move acid = new Move("Acid");
		acid.setBP(40);
		acid.setZBP(100);
		acid.setCategory("Special");
		acid.setType("Poison");
		acid.setSpread(true);
		acid.setHasSecondaryEffect(true);
		movedex.put("Acid", acid);

		Move acidarmor = new Move("Acid Armor");
		acidarmor.setBP(0);
		acidarmor.setZBP(0);
		acidarmor.setCategory("Status");
		acidarmor.setType("Poison");
		movedex.put("Acid Armor", acidarmor);

		Move aciddownpour = new Move("Acid Downpour");
		aciddownpour.setBP(1);
		aciddownpour.setZBP(0);
		aciddownpour.setCategory("Physical");
		aciddownpour.setType("Poison");
		movedex.put("Acid Downpour", aciddownpour);

		Move acidspray = new Move("Acid Spray");
		acidspray.setBP(40);
		acidspray.setZBP(100);
		acidspray.setCategory("Special");
		acidspray.setType("Poison");
		acidspray.setHasSecondaryEffect(true);
		acidspray.setBullet(true);
		movedex.put("Acid Spray", acidspray);

		Move acrobatics = new Move("Acrobatics");
		acrobatics.setBP(55);
		acrobatics.setZBP(100);
		acrobatics.setCategory("Physical");
		acrobatics.setType("Flying");
		acrobatics.setMakesContact(true);
		acrobatics.setHasSpecialModifier(true);
		movedex.put("Acrobatics", acrobatics);

		Move acupressure = new Move("Acupressure");
		acupressure.setBP(0);
		acupressure.setZBP(0);
		acupressure.setCategory("Status");
		acupressure.setType("Normal");
		movedex.put("Acupressure", acupressure);

		Move aerialace = new Move("Aerial Ace");
		aerialace.setBP(60);
		aerialace.setZBP(120);
		aerialace.setCategory("Physical");
		aerialace.setType("Flying");
		aerialace.setMakesContact(true);
		movedex.put("Aerial Ace", aerialace);

		Move aeroblast = new Move("Aeroblast");
		aeroblast.setBP(100);
		aeroblast.setZBP(180);
		aeroblast.setCategory("Special");
		aeroblast.setType("Flying");
		movedex.put("Aeroblast", aeroblast);

		Move afteryou = new Move("After You");
		afteryou.setBP(0);
		afteryou.setZBP(0);
		afteryou.setCategory("Status");
		afteryou.setType("Normal");
		movedex.put("After You", afteryou);

		Move agility = new Move("Agility");
		agility.setBP(0);
		agility.setZBP(0);
		agility.setCategory("Status");
		agility.setType("Psychic");
		movedex.put("Agility", agility);

		Move aircutter = new Move("Air Cutter");
		aircutter.setBP(60);
		aircutter.setZBP(120);
		aircutter.setCategory("Special");
		aircutter.setType("Flying");
		aircutter.setSpread(true);
		movedex.put("Air Cutter", aircutter);

		Move airslash = new Move("Air Slash");
		airslash.setBP(75);
		airslash.setZBP(140);
		airslash.setCategory("Special");
		airslash.setType("Flying");
		airslash.setHasSecondaryEffect(true);
		movedex.put("Air Slash", airslash);

		Move alloutpummeling = new Move("All-Out Pummeling");
		alloutpummeling.setBP(1);
		alloutpummeling.setZBP(0);
		alloutpummeling.setCategory("Physical");
		alloutpummeling.setType("Fighting");
		movedex.put("All-Out Pummeling", alloutpummeling);

		Move allyswitch = new Move("Ally Switch");
		allyswitch.setBP(0);
		allyswitch.setZBP(0);
		allyswitch.setCategory("Status");
		allyswitch.setType("Psychic");
		movedex.put("Ally Switch", allyswitch);

		Move amnesia = new Move("Amnesia");
		amnesia.setBP(0);
		amnesia.setZBP(0);
		amnesia.setCategory("Status");
		amnesia.setType("Psychic");
		movedex.put("Amnesia", amnesia);

		Move anchorshot = new Move("Anchor Shot");
		anchorshot.setBP(80);
		anchorshot.setZBP(160);
		anchorshot.setCategory("Physical");
		anchorshot.setType("Steel");
		anchorshot.setMakesContact(true);
		anchorshot.setHasSecondaryEffect(true);
		movedex.put("Anchor Shot", anchorshot);

		Move ancientpower = new Move("Ancient Power");
		ancientpower.setBP(60);
		ancientpower.setZBP(120);
		ancientpower.setCategory("Special");
		ancientpower.setType("Rock");
		ancientpower.setHasSecondaryEffect(true);
		movedex.put("Ancient Power", ancientpower);

		Move aquajet = new Move("Aqua Jet");
		aquajet.setBP(40);
		aquajet.setZBP(100);
		aquajet.setCategory("Physical");
		aquajet.setType("Water");
		aquajet.setMakesContact(true);
		movedex.put("Aqua Jet", aquajet);

		Move aquaring = new Move("Aqua Ring");
		aquaring.setBP(0);
		aquaring.setZBP(0);
		aquaring.setCategory("Status");
		aquaring.setType("Water");
		movedex.put("Aqua Ring", aquaring);

		Move aquatail = new Move("Aqua Tail");
		aquatail.setBP(90);
		aquatail.setZBP(175);
		aquatail.setCategory("Physical");
		aquatail.setType("Water");
		aquatail.setMakesContact(true);
		movedex.put("Aqua Tail", aquatail);

		Move armthrust = new Move("Arm Thrust");
		armthrust.setBP(15);
		armthrust.setZBP(100);
		armthrust.setCategory("Physical");
		armthrust.setType("Fighting");
		armthrust.setMakesContact(true);
		armthrust.setMultiHit(true);
		movedex.put("Arm Thrust", armthrust);

		Move aromatherapy = new Move("Aromatherapy");
		aromatherapy.setBP(0);
		aromatherapy.setZBP(0);
		aromatherapy.setCategory("Status");
		aromatherapy.setType("Grass");
		aromatherapy.setHasSecondaryEffect(true);
		movedex.put("Aromatherapy", aromatherapy);

		Move aromaticmist = new Move("Aromatic Mist");
		aromaticmist.setBP(0);
		aromaticmist.setZBP(0);
		aromaticmist.setCategory("Status");
		aromaticmist.setType("Fairy");
		movedex.put("Aromatic Mist", aromaticmist);

		Move assist = new Move("Assist");
		assist.setBP(0);
		assist.setZBP(0);
		assist.setCategory("Status");
		assist.setType("Normal");
		movedex.put("Assist", assist);

		Move assurance = new Move("Assurance");
		assurance.setBP(60);
		assurance.setZBP(120);
		assurance.setCategory("Physical");
		assurance.setType("Dark");
		assurance.setMakesContact(true);
		assurance.setHasSpecialModifier(true);
		movedex.put("Assurance", assurance);

		Move astonish = new Move("Astonish");
		astonish.setBP(30);
		astonish.setZBP(100);
		astonish.setCategory("Physical");
		astonish.setType("Ghost");
		astonish.setMakesContact(true);
		astonish.setHasSecondaryEffect(true);
		movedex.put("Astonish", astonish);

		Move attackorder = new Move("Attack Order");
		attackorder.setBP(90);
		attackorder.setZBP(175);
		attackorder.setCategory("Physical");
		attackorder.setType("Bug");
		movedex.put("Attack Order", attackorder);

		Move attract = new Move("Attract");
		attract.setBP(0);
		attract.setZBP(0);
		attract.setCategory("Status");
		attract.setType("Normal");
		movedex.put("Attract", attract);

		Move aurasphere = new Move("Aura Sphere");
		aurasphere.setBP(80);
		aurasphere.setZBP(160);
		aurasphere.setCategory("Special");
		aurasphere.setType("Fighting");
		aurasphere.setBullet(true);
		movedex.put("Aura Sphere", aurasphere);

		Move aurorabeam = new Move("Aurora Beam");
		aurorabeam.setBP(65);
		aurorabeam.setZBP(120);
		aurorabeam.setCategory("Special");
		aurorabeam.setType("Ice");
		aurorabeam.setHasSecondaryEffect(true);
		movedex.put("Aurora Beam", aurorabeam);

		Move auroraveil = new Move("Aurora Veil");
		auroraveil.setBP(0);
		auroraveil.setZBP(0);
		auroraveil.setCategory("Status");
		auroraveil.setType("Ice");
		movedex.put("Aurora Veil", auroraveil);

		Move autotomize = new Move("Autotomize");
		autotomize.setBP(0);
		autotomize.setZBP(0);
		autotomize.setCategory("Status");
		autotomize.setType("Steel");
		movedex.put("Autotomize", autotomize);

		Move avalanche = new Move("Avalanche");
		avalanche.setBP(60);
		avalanche.setZBP(120);
		avalanche.setCategory("Physical");
		avalanche.setType("Ice");
		avalanche.setMakesContact(true);
		avalanche.setHasSpecialModifier(true);
		movedex.put("Avalanche", avalanche);

		Move babydolleyes = new Move("Baby-Doll Eyes");
		babydolleyes.setBP(0);
		babydolleyes.setZBP(0);
		babydolleyes.setCategory("Status");
		babydolleyes.setType("Fairy");
		movedex.put("Baby-Doll Eyes", babydolleyes);

		Move banefulbunker = new Move("Baneful Bunker");
		banefulbunker.setBP(0);
		banefulbunker.setZBP(0);
		banefulbunker.setCategory("Status");
		banefulbunker.setType("Poison");
		movedex.put("Baneful Bunker", banefulbunker);

		Move barrage = new Move("Barrage");
		barrage.setBP(15);
		barrage.setZBP(100);
		barrage.setCategory("Physical");
		barrage.setType("Normal");
		barrage.setMultiHit(true);
		barrage.setBullet(true);
		movedex.put("Barrage", barrage);

		Move barrier = new Move("Barrier");
		barrier.setBP(0);
		barrier.setZBP(0);
		barrier.setCategory("Status");
		barrier.setType("Psychic");
		movedex.put("Barrier", barrier);

		Move batonpass = new Move("Baton Pass");
		batonpass.setBP(0);
		batonpass.setZBP(0);
		batonpass.setCategory("Status");
		batonpass.setType("Normal");
		movedex.put("Baton Pass", batonpass);

		Move beakblast = new Move("Beak Blast");
		beakblast.setBP(100);
		beakblast.setZBP(180);
		beakblast.setCategory("Physical");
		beakblast.setType("Flying");
		beakblast.setBullet(true);
		movedex.put("Beak Blast", beakblast);

		Move beatup = new Move("Beat Up");
		beatup.setBP(0);
		beatup.setZBP(100);
		beatup.setCategory("Physical");
		beatup.setType("Dark");
		beatup.setHasSpecialModifier(true);
		movedex.put("Beat Up", beatup);

		Move belch = new Move("Belch");
		belch.setBP(120);
		belch.setZBP(190);
		belch.setCategory("Special");
		belch.setType("Poison");
		movedex.put("Belch", belch);

		Move bellydrum = new Move("Belly Drum");
		bellydrum.setBP(0);
		bellydrum.setZBP(0);
		bellydrum.setCategory("Status");
		bellydrum.setType("Normal");
		movedex.put("Belly Drum", bellydrum);

		Move bestow = new Move("Bestow");
		bestow.setBP(0);
		bestow.setZBP(0);
		bestow.setCategory("Status");
		bestow.setType("Normal");
		movedex.put("Bestow", bestow);

		Move bide = new Move("Bide");
		bide.setBP(0);
		bide.setZBP(100);
		bide.setCategory("Physical");
		bide.setType("Normal");
		bide.setMakesContact(true);
		movedex.put("Bide", bide);

		Move bind = new Move("Bind");
		bind.setBP(15);
		bind.setZBP(100);
		bind.setCategory("Physical");
		bind.setType("Normal");
		bind.setMakesContact(true);
		movedex.put("Bind", bind);

		Move bite = new Move("Bite");
		bite.setBP(60);
		bite.setZBP(120);
		bite.setCategory("Physical");
		bite.setType("Dark");
		bite.setMakesContact(true);
		bite.setHasSecondaryEffect(true);
		bite.setBite(true);
		movedex.put("Bite", bite);

		Move blackholeeclipse = new Move("Black Hole Eclipse");
		blackholeeclipse.setBP(1);
		blackholeeclipse.setZBP(0);
		blackholeeclipse.setCategory("Physical");
		blackholeeclipse.setType("Dark");
		movedex.put("Black Hole Eclipse", blackholeeclipse);

		Move blastburn = new Move("Blast Burn");
		blastburn.setBP(150);
		blastburn.setZBP(200);
		blastburn.setCategory("Special");
		blastburn.setType("Fire");
		movedex.put("Blast Burn", blastburn);

		Move blazekick = new Move("Blaze Kick");
		blazekick.setBP(85);
		blazekick.setZBP(160);
		blazekick.setCategory("Physical");
		blazekick.setType("Fire");
		blazekick.setMakesContact(true);
		blazekick.setHasSecondaryEffect(true);
		movedex.put("Blaze Kick", blazekick);

		Move blizzard = new Move("Blizzard");
		blizzard.setBP(110);
		blizzard.setZBP(185);
		blizzard.setCategory("Special");
		blizzard.setType("Ice");
		blizzard.setSpread(true);
		blizzard.setHasSecondaryEffect(true);
		movedex.put("Blizzard", blizzard);

		Move block = new Move("Block");
		block.setBP(0);
		block.setZBP(0);
		block.setCategory("Status");
		block.setType("Normal");
		movedex.put("Block", block);

		Move bloomdoom = new Move("Bloom Doom");
		bloomdoom.setBP(1);
		bloomdoom.setZBP(0);
		bloomdoom.setCategory("Physical");
		bloomdoom.setType("Grass");
		movedex.put("Bloom Doom", bloomdoom);

		Move blueflare = new Move("Blue Flare");
		blueflare.setBP(130);
		blueflare.setZBP(195);
		blueflare.setCategory("Special");
		blueflare.setType("Fire");
		blueflare.setHasSecondaryEffect(true);
		movedex.put("Blue Flare", blueflare);

		Move bodyslam = new Move("Body Slam");
		bodyslam.setBP(85);
		bodyslam.setZBP(160);
		bodyslam.setCategory("Physical");
		bodyslam.setType("Normal");
		bodyslam.setMakesContact(true);
		bodyslam.setHasSecondaryEffect(true);
		bodyslam.setHasSpecialModifier(true);
		movedex.put("Body Slam", bodyslam);

		Move boltstrike = new Move("Bolt Strike");
		boltstrike.setBP(130);
		boltstrike.setZBP(195);
		boltstrike.setCategory("Physical");
		boltstrike.setType("Electric");
		boltstrike.setMakesContact(true);
		boltstrike.setHasSecondaryEffect(true);
		movedex.put("Bolt Strike", boltstrike);

		Move boneclub = new Move("Bone Club");
		boneclub.setBP(65);
		boneclub.setZBP(120);
		boneclub.setCategory("Physical");
		boneclub.setType("Ground");
		boneclub.setHasSecondaryEffect(true);
		movedex.put("Bone Club", boneclub);

		Move bonerush = new Move("Bone Rush");
		bonerush.setBP(25);
		bonerush.setZBP(140);
		bonerush.setCategory("Physical");
		bonerush.setType("Ground");
		bonerush.setMultiHit(true);
		movedex.put("Bone Rush", bonerush);

		Move bonemerang = new Move("Bonemerang");
		bonemerang.setBP(50);
		bonemerang.setZBP(100);
		bonemerang.setCategory("Physical");
		bonemerang.setType("Ground");
		bonemerang.setTwoHit(true);
		movedex.put("Bonemerang", bonemerang);

		Move boomburst = new Move("Boomburst");
		boomburst.setBP(140);
		boomburst.setZBP(200);
		boomburst.setCategory("Special");
		boomburst.setType("Normal");
		boomburst.setSpread(true);
		boomburst.setSound(true);
		movedex.put("Boomburst", boomburst);

		Move bounce = new Move("Bounce");
		bounce.setBP(85);
		bounce.setZBP(160);
		bounce.setCategory("Physical");
		bounce.setType("Flying");
		bounce.setMakesContact(true);
		bounce.setHasSecondaryEffect(true);
		movedex.put("Bounce", bounce);

		Move bravebird = new Move("Brave Bird");
		bravebird.setBP(120);
		bravebird.setZBP(190);
		bravebird.setCategory("Physical");
		bravebird.setType("Flying");
		bravebird.setMakesContact(true);
		bravebird.setHasRecoil(true);
		movedex.put("Brave Bird", bravebird);

		Move breakneckblitz = new Move("Breakneck Blitz");
		breakneckblitz.setBP(1);
		breakneckblitz.setZBP(0);
		breakneckblitz.setCategory("Physical");
		breakneckblitz.setType("Normal");
		movedex.put("Breakneck Blitz", breakneckblitz);

		Move brickbreak = new Move("Brick Break");
		brickbreak.setBP(75);
		brickbreak.setZBP(140);
		brickbreak.setCategory("Physical");
		brickbreak.setType("Fighting");
		brickbreak.setMakesContact(true);
		movedex.put("Brick Break", brickbreak);

		Move brine = new Move("Brine");
		brine.setBP(65);
		brine.setZBP(120);
		brine.setCategory("Special");
		brine.setType("Water");
		movedex.put("Brine", brine);

		Move brutalswing = new Move("Brutal Swing");
		brutalswing.setBP(60);
		brutalswing.setZBP(120);
		brutalswing.setCategory("Physical");
		brutalswing.setType("Dark");
		brutalswing.setSpread(true);
		brutalswing.setMakesContact(true);
		movedex.put("Brutal Swing", brutalswing);

		Move bubble = new Move("Bubble");
		bubble.setBP(40);
		bubble.setZBP(100);
		bubble.setCategory("Special");
		bubble.setType("Water");
		bubble.setSpread(true);
		bubble.setHasSecondaryEffect(true);
		movedex.put("Bubble", bubble);

		Move bubblebeam = new Move("Bubble Beam");
		bubblebeam.setBP(65);
		bubblebeam.setZBP(120);
		bubblebeam.setCategory("Special");
		bubblebeam.setType("Water");
		bubblebeam.setHasSecondaryEffect(true);
		movedex.put("Bubble Beam", bubblebeam);

		Move bugbite = new Move("Bug Bite");
		bugbite.setBP(60);
		bugbite.setZBP(120);
		bugbite.setCategory("Physical");
		bugbite.setType("Bug");
		bugbite.setMakesContact(true);
		movedex.put("Bug Bite", bugbite);

		Move bugbuzz = new Move("Bug Buzz");
		bugbuzz.setBP(90);
		bugbuzz.setZBP(175);
		bugbuzz.setCategory("Special");
		bugbuzz.setType("Bug");
		bugbuzz.setHasSecondaryEffect(true);
		bugbuzz.setSound(true);
		movedex.put("Bug Buzz", bugbuzz);

		Move bulkup = new Move("Bulk Up");
		bulkup.setBP(0);
		bulkup.setZBP(0);
		bulkup.setCategory("Status");
		bulkup.setType("Fighting");
		movedex.put("Bulk Up", bulkup);

		Move bulldoze = new Move("Bulldoze");
		bulldoze.setBP(60);
		bulldoze.setZBP(120);
		bulldoze.setCategory("Physical");
		bulldoze.setType("Ground");
		bulldoze.setSpread(true);
		bulldoze.setHasSecondaryEffect(true);
		movedex.put("Bulldoze", bulldoze);

		Move bulletpunch = new Move("Bullet Punch");
		bulletpunch.setBP(40);
		bulletpunch.setZBP(100);
		bulletpunch.setCategory("Physical");
		bulletpunch.setType("Steel");
		bulletpunch.setMakesContact(true);
		bulletpunch.setPunch(true);
		movedex.put("Bullet Punch", bulletpunch);

		Move bulletseed = new Move("Bullet Seed");
		bulletseed.setBP(25);
		bulletseed.setZBP(140);
		bulletseed.setCategory("Physical");
		bulletseed.setType("Grass");
		bulletseed.setMultiHit(true);
		bulletseed.setBullet(true);
		movedex.put("Bullet Seed", bulletseed);

		Move burnup = new Move("Burn Up");
		burnup.setBP(130);
		burnup.setZBP(195);
		burnup.setCategory("Special");
		burnup.setType("Fire");
		movedex.put("Burn Up", burnup);

		Move calmmind = new Move("Calm Mind");
		calmmind.setBP(0);
		calmmind.setZBP(0);
		calmmind.setCategory("Status");
		calmmind.setType("Psychic");
		movedex.put("Calm Mind", calmmind);

		Move camouflage = new Move("Camouflage");
		camouflage.setBP(0);
		camouflage.setZBP(0);
		camouflage.setCategory("Status");
		camouflage.setType("Normal");
		movedex.put("Camouflage", camouflage);

		Move captivate = new Move("Captivate");
		captivate.setBP(0);
		captivate.setZBP(0);
		captivate.setCategory("Status");
		captivate.setType("Normal");
		captivate.setSpread(true);
		movedex.put("Captivate", captivate);

		Move catastropika = new Move("Catastropika");
		catastropika.setBP(210);
		catastropika.setZBP(0);
		catastropika.setCategory("Physical");
		catastropika.setType("Electric");
		catastropika.setMakesContact(true);
		catastropika.setSignatureZ(true);
		movedex.put("Catastropika", catastropika);

		Move celebrate = new Move("Celebrate");
		celebrate.setBP(0);
		celebrate.setZBP(0);
		celebrate.setCategory("Status");
		celebrate.setType("Normal");
		movedex.put("Celebrate", celebrate);

		Move charge = new Move("Charge");
		charge.setBP(0);
		charge.setZBP(0);
		charge.setCategory("Status");
		charge.setType("Electric");
		movedex.put("Charge", charge);

		Move chargebeam = new Move("Charge Beam");
		chargebeam.setBP(50);
		chargebeam.setZBP(100);
		chargebeam.setCategory("Special");
		chargebeam.setType("Electric");
		chargebeam.setHasSecondaryEffect(true);
		movedex.put("Charge Beam", chargebeam);

		Move charm = new Move("Charm");
		charm.setBP(0);
		charm.setZBP(0);
		charm.setCategory("Status");
		charm.setType("Fairy");
		movedex.put("Charm", charm);

		Move chatter = new Move("Chatter");
		chatter.setBP(65);
		chatter.setZBP(120);
		chatter.setCategory("Special");
		chatter.setType("Flying");
		chatter.setHasSecondaryEffect(true);
		chatter.setSound(true);
		movedex.put("Chatter", chatter);

		Move chipaway = new Move("Chip Away");
		chipaway.setBP(70);
		chipaway.setZBP(140);
		chipaway.setCategory("Physical");
		chipaway.setType("Normal");
		chipaway.setMakesContact(true);
		chipaway.setIgnoresDefenseBoosts(true);
		movedex.put("Chip Away", chipaway);

		Move circlethrow = new Move("Circle Throw");
		circlethrow.setBP(60);
		circlethrow.setZBP(120);
		circlethrow.setCategory("Physical");
		circlethrow.setType("Fighting");
		circlethrow.setMakesContact(true);
		circlethrow.setHasSecondaryEffect(true);
		movedex.put("Circle Throw", circlethrow);

		Move clamp = new Move("Clamp");
		clamp.setBP(35);
		clamp.setZBP(100);
		clamp.setCategory("Physical");
		clamp.setType("Water");
		clamp.setMakesContact(true);
		movedex.put("Clamp", clamp);

		Move clangingscales = new Move("Clanging Scales");
		clangingscales.setBP(110);
		clangingscales.setZBP(185);
		clangingscales.setCategory("Special");
		clangingscales.setType("Dragon");
		clangingscales.setSpread(true);
		clangingscales.setSound(true);
		movedex.put("Clanging Scales", clangingscales);

		Move clangoroussoulblaze = new Move("Clangorous Soulblaze");
		clangoroussoulblaze.setBP(185);
		clangoroussoulblaze.setZBP(0);
		clangoroussoulblaze.setCategory("Special");
		clangoroussoulblaze.setType("Dragon");
		clangoroussoulblaze.setSpread(true);
		clangoroussoulblaze.setSignatureZ(true);
		clangoroussoulblaze.setSound(true);
		movedex.put("Clangorous Soulblaze", clangoroussoulblaze);

		Move clearsmog = new Move("Clear Smog");
		clearsmog.setBP(50);
		clearsmog.setZBP(100);
		clearsmog.setCategory("Special");
		clearsmog.setType("Poison");
		movedex.put("Clear Smog", clearsmog);

		Move closecombat = new Move("Close Combat");
		closecombat.setBP(120);
		closecombat.setZBP(190);
		closecombat.setCategory("Physical");
		closecombat.setType("Fighting");
		closecombat.setMakesContact(true);
		movedex.put("Close Combat", closecombat);

		Move coil = new Move("Coil");
		coil.setBP(0);
		coil.setZBP(0);
		coil.setCategory("Status");
		coil.setType("Poison");
		movedex.put("Coil", coil);

		Move cometpunch = new Move("Comet Punch");
		cometpunch.setBP(18);
		cometpunch.setZBP(100);
		cometpunch.setCategory("Physical");
		cometpunch.setType("Normal");
		cometpunch.setMakesContact(true);
		cometpunch.setMultiHit(true);
		cometpunch.setPunch(true);
		movedex.put("Comet Punch", cometpunch);

		Move confide = new Move("Confide");
		confide.setBP(0);
		confide.setZBP(0);
		confide.setCategory("Status");
		confide.setType("Normal");
		confide.setSound(true);
		movedex.put("Confide", confide);

		Move confuseray = new Move("Confuse Ray");
		confuseray.setBP(0);
		confuseray.setZBP(0);
		confuseray.setCategory("Status");
		confuseray.setType("Ghost");
		movedex.put("Confuse Ray", confuseray);

		Move confusion = new Move("Confusion");
		confusion.setBP(50);
		confusion.setZBP(100);
		confusion.setCategory("Special");
		confusion.setType("Psychic");
		confusion.setHasSecondaryEffect(true);
		movedex.put("Confusion", confusion);

		Move constrict = new Move("Constrict");
		constrict.setBP(10);
		constrict.setZBP(100);
		constrict.setCategory("Physical");
		constrict.setType("Normal");
		constrict.setMakesContact(true);
		constrict.setHasSecondaryEffect(true);
		movedex.put("Constrict", constrict);

		Move continentalcrush = new Move("Continental Crush");
		continentalcrush.setBP(1);
		continentalcrush.setZBP(0);
		continentalcrush.setCategory("Physical");
		continentalcrush.setType("Rock");
		movedex.put("Continental Crush", continentalcrush);

		Move conversion = new Move("Conversion");
		conversion.setBP(0);
		conversion.setZBP(0);
		conversion.setCategory("Status");
		conversion.setType("Normal");
		movedex.put("Conversion", conversion);

		Move conversion2 = new Move("Conversion 2");
		conversion2.setBP(0);
		conversion2.setZBP(0);
		conversion2.setCategory("Status");
		conversion2.setType("Normal");
		movedex.put("Conversion 2", conversion2);

		Move copycat = new Move("Copycat");
		copycat.setBP(0);
		copycat.setZBP(0);
		copycat.setCategory("Status");
		copycat.setType("Normal");
		movedex.put("Copycat", copycat);

		Move coreenforcer = new Move("Core Enforcer");
		coreenforcer.setBP(100);
		coreenforcer.setZBP(140);
		coreenforcer.setCategory("Special");
		coreenforcer.setType("Dragon");
		coreenforcer.setSpread(true);
		movedex.put("Core Enforcer", coreenforcer);

		Move corkscrewcrash = new Move("Corkscrew Crash");
		corkscrewcrash.setBP(1);
		corkscrewcrash.setZBP(0);
		corkscrewcrash.setCategory("Physical");
		corkscrewcrash.setType("Steel");
		movedex.put("Corkscrew Crash", corkscrewcrash);

		Move cosmicpower = new Move("Cosmic Power");
		cosmicpower.setBP(0);
		cosmicpower.setZBP(0);
		cosmicpower.setCategory("Status");
		cosmicpower.setType("Psychic");
		movedex.put("Cosmic Power", cosmicpower);

		Move cottonguard = new Move("Cotton Guard");
		cottonguard.setBP(0);
		cottonguard.setZBP(0);
		cottonguard.setCategory("Status");
		cottonguard.setType("Grass");
		movedex.put("Cotton Guard", cottonguard);

		Move cottonspore = new Move("Cotton Spore");
		cottonspore.setBP(0);
		cottonspore.setZBP(0);
		cottonspore.setCategory("Status");
		cottonspore.setType("Grass");
		cottonspore.setSpread(true);
		movedex.put("Cotton Spore", cottonspore);

		Move counter = new Move("Counter");
		counter.setBP(0);
		counter.setZBP(100);
		counter.setCategory("Physical");
		counter.setType("Fighting");
		counter.setMakesContact(true);
		movedex.put("Counter", counter);

		Move covet = new Move("Covet");
		covet.setBP(60);
		covet.setZBP(120);
		covet.setCategory("Physical");
		covet.setType("Normal");
		covet.setMakesContact(true);
		movedex.put("Covet", covet);

		Move crabhammer = new Move("Crabhammer");
		crabhammer.setBP(100);
		crabhammer.setZBP(180);
		crabhammer.setCategory("Physical");
		crabhammer.setType("Water");
		crabhammer.setMakesContact(true);
		movedex.put("Crabhammer", crabhammer);

		Move craftyshield = new Move("Crafty Shield");
		craftyshield.setBP(0);
		craftyshield.setZBP(0);
		craftyshield.setCategory("Status");
		craftyshield.setType("Fairy");
		movedex.put("Crafty Shield", craftyshield);

		Move crosschop = new Move("Cross Chop");
		crosschop.setBP(100);
		crosschop.setZBP(180);
		crosschop.setCategory("Physical");
		crosschop.setType("Fighting");
		crosschop.setMakesContact(true);
		movedex.put("Cross Chop", crosschop);

		Move crosspoison = new Move("Cross Poison");
		crosspoison.setBP(70);
		crosspoison.setZBP(140);
		crosspoison.setCategory("Physical");
		crosspoison.setType("Poison");
		crosspoison.setMakesContact(true);
		crosspoison.setHasSecondaryEffect(true);
		movedex.put("Cross Poison", crosspoison);

		Move crunch = new Move("Crunch");
		crunch.setBP(80);
		crunch.setZBP(160);
		crunch.setCategory("Physical");
		crunch.setType("Dark");
		crunch.setMakesContact(true);
		crunch.setHasSecondaryEffect(true);
		crunch.setBite(true);
		movedex.put("Crunch", crunch);

		Move crushclaw = new Move("Crush Claw");
		crushclaw.setBP(75);
		crushclaw.setZBP(140);
		crushclaw.setCategory("Physical");
		crushclaw.setType("Normal");
		crushclaw.setMakesContact(true);
		crushclaw.setHasSecondaryEffect(true);
		movedex.put("Crush Claw", crushclaw);

		Move crushgrip = new Move("Crush Grip");
		crushgrip.setBP(0);
		crushgrip.setZBP(190);
		crushgrip.setCategory("Physical");
		crushgrip.setType("Normal");
		crushgrip.setMakesContact(true);
		crushgrip.setHasSpecialModifier(true);
		movedex.put("Crush Grip", crushgrip);

		Move curse = new Move("Curse");
		curse.setBP(0);
		curse.setZBP(0);
		curse.setCategory("Status");
		curse.setType("Ghost");
		movedex.put("Curse", curse);

		Move cut = new Move("Cut");
		cut.setBP(50);
		cut.setZBP(100);
		cut.setCategory("Physical");
		cut.setType("Normal");
		cut.setMakesContact(true);
		movedex.put("Cut", cut);

		Move darkpulse = new Move("Dark Pulse");
		darkpulse.setBP(80);
		darkpulse.setZBP(160);
		darkpulse.setCategory("Special");
		darkpulse.setType("Dark");
		darkpulse.setHasSecondaryEffect(true);
		movedex.put("Dark Pulse", darkpulse);

		Move darkvoid = new Move("Dark Void");
		darkvoid.setBP(0);
		darkvoid.setZBP(0);
		darkvoid.setCategory("Status");
		darkvoid.setType("Dark");
		darkvoid.setSpread(true);
		movedex.put("Dark Void", darkvoid);

		Move darkestlariat = new Move("Darkest Lariat");
		darkestlariat.setBP(85);
		darkestlariat.setZBP(160);
		darkestlariat.setCategory("Physical");
		darkestlariat.setType("Dark");
		darkestlariat.setMakesContact(true);
		darkestlariat.setIgnoresDefenseBoosts(true);
		movedex.put("Darkest Lariat", darkestlariat);

		Move dazzlinggleam = new Move("Dazzling Gleam");
		dazzlinggleam.setBP(80);
		dazzlinggleam.setZBP(160);
		dazzlinggleam.setCategory("Special");
		dazzlinggleam.setType("Fairy");
		dazzlinggleam.setSpread(true);
		movedex.put("Dazzling Gleam", dazzlinggleam);

		Move defendorder = new Move("Defend Order");
		defendorder.setBP(0);
		defendorder.setZBP(0);
		defendorder.setCategory("Status");
		defendorder.setType("Bug");
		movedex.put("Defend Order", defendorder);

		Move defensecurl = new Move("Defense Curl");
		defensecurl.setBP(0);
		defensecurl.setZBP(0);
		defensecurl.setCategory("Status");
		defensecurl.setType("Normal");
		movedex.put("Defense Curl", defensecurl);

		Move defog = new Move("Defog");
		defog.setBP(0);
		defog.setZBP(0);
		defog.setCategory("Status");
		defog.setType("Flying");
		movedex.put("Defog", defog);

		Move destinybond = new Move("Destiny Bond");
		destinybond.setBP(0);
		destinybond.setZBP(0);
		destinybond.setCategory("Status");
		destinybond.setType("Ghost");
		movedex.put("Destiny Bond", destinybond);

		Move detect = new Move("Detect");
		detect.setBP(0);
		detect.setZBP(0);
		detect.setCategory("Status");
		detect.setType("Fighting");
		movedex.put("Detect", detect);

		Move devastatingdrake = new Move("Devastating Drake");
		devastatingdrake.setBP(1);
		devastatingdrake.setZBP(0);
		devastatingdrake.setCategory("Physical");
		devastatingdrake.setType("Dragon");
		movedex.put("Devastating Drake", devastatingdrake);

		Move diamondstorm = new Move("Diamond Storm");
		diamondstorm.setBP(100);
		diamondstorm.setZBP(180);
		diamondstorm.setCategory("Physical");
		diamondstorm.setType("Rock");
		diamondstorm.setSpread(true);
		diamondstorm.setHasSecondaryEffect(true);
		movedex.put("Diamond Storm", diamondstorm);

		Move dig = new Move("Dig");
		dig.setBP(80);
		dig.setZBP(160);
		dig.setCategory("Physical");
		dig.setType("Ground");
		dig.setMakesContact(true);
		movedex.put("Dig", dig);

		Move disable = new Move("Disable");
		disable.setBP(0);
		disable.setZBP(0);
		disable.setCategory("Status");
		disable.setType("Normal");
		movedex.put("Disable", disable);

		Move disarmingvoice = new Move("Disarming Voice");
		disarmingvoice.setBP(40);
		disarmingvoice.setZBP(100);
		disarmingvoice.setCategory("Special");
		disarmingvoice.setType("Fairy");
		disarmingvoice.setSpread(true);
		disarmingvoice.setSound(true);
		movedex.put("Disarming Voice", disarmingvoice);

		Move discharge = new Move("Discharge");
		discharge.setBP(80);
		discharge.setZBP(160);
		discharge.setCategory("Special");
		discharge.setType("Electric");
		discharge.setSpread(true);
		discharge.setHasSecondaryEffect(true);
		movedex.put("Discharge", discharge);

		Move dive = new Move("Dive");
		dive.setBP(80);
		dive.setZBP(160);
		dive.setCategory("Physical");
		dive.setType("Water");
		dive.setMakesContact(true);
		movedex.put("Dive", dive);

		Move dizzypunch = new Move("Dizzy Punch");
		dizzypunch.setBP(70);
		dizzypunch.setZBP(140);
		dizzypunch.setCategory("Physical");
		dizzypunch.setType("Normal");
		dizzypunch.setMakesContact(true);
		dizzypunch.setHasSecondaryEffect(true);
		dizzypunch.setPunch(true);
		movedex.put("Dizzy Punch", dizzypunch);

		Move doomdesire = new Move("Doom Desire");
		doomdesire.setBP(140);
		doomdesire.setZBP(200);
		doomdesire.setCategory("Special");
		doomdesire.setType("Steel");
		movedex.put("Doom Desire", doomdesire);

		Move doublehit = new Move("Double Hit");
		doublehit.setBP(35);
		doublehit.setZBP(140);
		doublehit.setCategory("Physical");
		doublehit.setType("Normal");
		doublehit.setMakesContact(true);
		doublehit.setTwoHit(true);
		movedex.put("Double Hit", doublehit);

		Move doublekick = new Move("Double Kick");
		doublekick.setBP(30);
		doublekick.setZBP(100);
		doublekick.setCategory("Physical");
		doublekick.setType("Fighting");
		doublekick.setMakesContact(true);
		doublekick.setTwoHit(true);
		movedex.put("Double Kick", doublekick);

		Move doubleslap = new Move("Double Slap");
		doubleslap.setBP(15);
		doubleslap.setZBP(100);
		doubleslap.setCategory("Physical");
		doubleslap.setType("Normal");
		doubleslap.setMakesContact(true);
		doubleslap.setMultiHit(true);
		movedex.put("Double Slap", doubleslap);

		Move doubleteam = new Move("Double Team");
		doubleteam.setBP(0);
		doubleteam.setZBP(0);
		doubleteam.setCategory("Status");
		doubleteam.setType("Normal");
		movedex.put("Double Team", doubleteam);

		Move doubleedge = new Move("Double-Edge");
		doubleedge.setBP(120);
		doubleedge.setZBP(190);
		doubleedge.setCategory("Physical");
		doubleedge.setType("Normal");
		doubleedge.setMakesContact(true);
		doubleedge.setHasRecoil(true);
		movedex.put("Double-Edge", doubleedge);

		Move dracometeor = new Move("Draco Meteor");
		dracometeor.setBP(130);
		dracometeor.setZBP(195);
		dracometeor.setCategory("Special");
		dracometeor.setType("Dragon");
		movedex.put("Draco Meteor", dracometeor);

		Move dragonascent = new Move("Dragon Ascent");
		dragonascent.setBP(120);
		dragonascent.setZBP(190);
		dragonascent.setCategory("Physical");
		dragonascent.setType("Flying");
		dragonascent.setMakesContact(true);
		dragonascent.setHasSecondaryEffect(true);
		movedex.put("Dragon Ascent", dragonascent);

		Move dragonbreath = new Move("Dragon Breath");
		dragonbreath.setBP(60);
		dragonbreath.setZBP(120);
		dragonbreath.setCategory("Special");
		dragonbreath.setType("Dragon");
		dragonbreath.setHasSecondaryEffect(true);
		movedex.put("Dragon Breath", dragonbreath);

		Move dragonclaw = new Move("Dragon Claw");
		dragonclaw.setBP(80);
		dragonclaw.setZBP(160);
		dragonclaw.setCategory("Physical");
		dragonclaw.setType("Dragon");
		dragonclaw.setMakesContact(true);
		movedex.put("Dragon Claw", dragonclaw);

		Move dragondance = new Move("Dragon Dance");
		dragondance.setBP(0);
		dragondance.setZBP(0);
		dragondance.setCategory("Status");
		dragondance.setType("Dragon");
		movedex.put("Dragon Dance", dragondance);

		Move dragonhammer = new Move("Dragon Hammer");
		dragonhammer.setBP(90);
		dragonhammer.setZBP(175);
		dragonhammer.setCategory("Physical");
		dragonhammer.setType("Dragon");
		dragonhammer.setMakesContact(true);
		movedex.put("Dragon Hammer", dragonhammer);

		Move dragonpulse = new Move("Dragon Pulse");
		dragonpulse.setBP(85);
		dragonpulse.setZBP(160);
		dragonpulse.setCategory("Special");
		dragonpulse.setType("Dragon");
		movedex.put("Dragon Pulse", dragonpulse);

		Move dragonrage = new Move("Dragon Rage");
		dragonrage.setBP(0);
		dragonrage.setZBP(100);
		dragonrage.setCategory("Special");
		dragonrage.setType("Dragon");
		movedex.put("Dragon Rage", dragonrage);

		Move dragonrush = new Move("Dragon Rush");
		dragonrush.setBP(100);
		dragonrush.setZBP(180);
		dragonrush.setCategory("Physical");
		dragonrush.setType("Dragon");
		dragonrush.setMakesContact(true);
		dragonrush.setHasSecondaryEffect(true);
		dragonrush.setHasSpecialModifier(true);
		movedex.put("Dragon Rush", dragonrush);

		Move dragontail = new Move("Dragon Tail");
		dragontail.setBP(60);
		dragontail.setZBP(120);
		dragontail.setCategory("Physical");
		dragontail.setType("Dragon");
		dragontail.setMakesContact(true);
		dragontail.setHasSecondaryEffect(true);
		movedex.put("Dragon Tail", dragontail);

		Move drainpunch = new Move("Drain Punch");
		drainpunch.setBP(75);
		drainpunch.setZBP(140);
		drainpunch.setCategory("Physical");
		drainpunch.setType("Fighting");
		drainpunch.setMakesContact(true);
		drainpunch.setPunch(true);
		movedex.put("Drain Punch", drainpunch);

		Move drainingkiss = new Move("Draining Kiss");
		drainingkiss.setBP(50);
		drainingkiss.setZBP(100);
		drainingkiss.setCategory("Special");
		drainingkiss.setType("Fairy");
		drainingkiss.setMakesContact(true);
		movedex.put("Draining Kiss", drainingkiss);

		Move dreameater = new Move("Dream Eater");
		dreameater.setBP(100);
		dreameater.setZBP(180);
		dreameater.setCategory("Special");
		dreameater.setType("Psychic");
		movedex.put("Dream Eater", dreameater);

		Move drillpeck = new Move("Drill Peck");
		drillpeck.setBP(80);
		drillpeck.setZBP(160);
		drillpeck.setCategory("Physical");
		drillpeck.setType("Flying");
		drillpeck.setMakesContact(true);
		movedex.put("Drill Peck", drillpeck);

		Move drillrun = new Move("Drill Run");
		drillrun.setBP(80);
		drillrun.setZBP(160);
		drillrun.setCategory("Physical");
		drillrun.setType("Ground");
		drillrun.setMakesContact(true);
		movedex.put("Drill Run", drillrun);

		Move dualchop = new Move("Dual Chop");
		dualchop.setBP(40);
		dualchop.setZBP(100);
		dualchop.setCategory("Physical");
		dualchop.setType("Dragon");
		dualchop.setMakesContact(true);
		dualchop.setTwoHit(true);
		movedex.put("Dual Chop", dualchop);

		Move dynamicpunch = new Move("Dynamic Punch");
		dynamicpunch.setBP(100);
		dynamicpunch.setZBP(180);
		dynamicpunch.setCategory("Physical");
		dynamicpunch.setType("Fighting");
		dynamicpunch.setMakesContact(true);
		dynamicpunch.setHasSecondaryEffect(true);
		dynamicpunch.setPunch(true);
		movedex.put("Dynamic Punch", dynamicpunch);

		Move earthpower = new Move("Earth Power");
		earthpower.setBP(90);
		earthpower.setZBP(175);
		earthpower.setCategory("Special");
		earthpower.setType("Ground");
		earthpower.setHasSecondaryEffect(true);
		movedex.put("Earth Power", earthpower);

		Move earthquake = new Move("Earthquake");
		earthquake.setBP(100);
		earthquake.setZBP(180);
		earthquake.setCategory("Physical");
		earthquake.setType("Ground");
		earthquake.setSpread(true);
		earthquake.setHasSpecialModifier(true);
		movedex.put("Earthquake", earthquake);

		Move echoedvoice = new Move("Echoed Voice");
		echoedvoice.setBP(40);
		echoedvoice.setZBP(100);
		echoedvoice.setCategory("Special");
		echoedvoice.setType("Normal");
		echoedvoice.setSound(true);
		echoedvoice.setHasSpecialModifier(true);
		movedex.put("Echoed Voice", echoedvoice);

		Move eerieimpulse = new Move("Eerie Impulse");
		eerieimpulse.setBP(0);
		eerieimpulse.setZBP(0);
		eerieimpulse.setCategory("Status");
		eerieimpulse.setType("Electric");
		movedex.put("Eerie Impulse", eerieimpulse);

		Move eggbomb = new Move("Egg Bomb");
		eggbomb.setBP(100);
		eggbomb.setZBP(180);
		eggbomb.setCategory("Physical");
		eggbomb.setType("Normal");
		eggbomb.setBullet(true);
		movedex.put("Egg Bomb", eggbomb);

		Move electricterrain = new Move("Electric Terrain");
		electricterrain.setBP(0);
		electricterrain.setZBP(0);
		electricterrain.setCategory("Status");
		electricterrain.setType("Electric");
		movedex.put("Electric Terrain", electricterrain);

		Move electrify = new Move("Electrify");
		electrify.setBP(0);
		electrify.setZBP(0);
		electrify.setCategory("Status");
		electrify.setType("Electric");
		movedex.put("Electrify", electrify);

		Move electroball = new Move("Electro Ball");
		electroball.setBP(0);
		electroball.setZBP(160);
		electroball.setCategory("Special");
		electroball.setType("Electric");
		electroball.setBullet(true);
		electroball.setHasSpecialModifier(true);
		movedex.put("Electro Ball", electroball);

		Move electroweb = new Move("Electroweb");
		electroweb.setBP(55);
		electroweb.setZBP(100);
		electroweb.setCategory("Special");
		electroweb.setType("Electric");
		electroweb.setSpread(true);
		electroweb.setHasSecondaryEffect(true);
		movedex.put("Electroweb", electroweb);

		Move embargo = new Move("Embargo");
		embargo.setBP(0);
		embargo.setZBP(0);
		embargo.setCategory("Status");
		embargo.setType("Dark");
		movedex.put("Embargo", embargo);

		Move ember = new Move("Ember");
		ember.setBP(40);
		ember.setZBP(100);
		ember.setCategory("Special");
		ember.setType("Fire");
		ember.setHasSecondaryEffect(true);
		movedex.put("Ember", ember);

		Move encore = new Move("Encore");
		encore.setBP(0);
		encore.setZBP(0);
		encore.setCategory("Status");
		encore.setType("Normal");
		movedex.put("Encore", encore);

		Move endeavor = new Move("Endeavor");
		endeavor.setBP(0);
		endeavor.setZBP(160);
		endeavor.setCategory("Physical");
		endeavor.setType("Normal");
		endeavor.setMakesContact(true);
		movedex.put("Endeavor", endeavor);

		Move endure = new Move("Endure");
		endure.setBP(0);
		endure.setZBP(0);
		endure.setCategory("Status");
		endure.setType("Normal");
		movedex.put("Endure", endure);

		Move energyball = new Move("Energy Ball");
		energyball.setBP(90);
		energyball.setZBP(175);
		energyball.setCategory("Special");
		energyball.setType("Grass");
		energyball.setHasSecondaryEffect(true);
		energyball.setBullet(true);
		movedex.put("Energy Ball", energyball);

		Move entrainment = new Move("Entrainment");
		entrainment.setBP(0);
		entrainment.setZBP(0);
		entrainment.setCategory("Status");
		entrainment.setType("Normal");
		movedex.put("Entrainment", entrainment);

		Move eruption = new Move("Eruption");
		eruption.setBP(150);
		eruption.setZBP(200);
		eruption.setCategory("Special");
		eruption.setType("Fire");
		eruption.setSpread(true);
		eruption.setHasSpecialModifier(true);
		movedex.put("Eruption", eruption);

		Move explosion = new Move("Explosion");
		explosion.setBP(250);
		explosion.setZBP(200);
		explosion.setCategory("Physical");
		explosion.setType("Normal");
		explosion.setSpread(true);
		movedex.put("Explosion", explosion);

		Move extrasensory = new Move("Extrasensory");
		extrasensory.setBP(80);
		extrasensory.setZBP(160);
		extrasensory.setCategory("Special");
		extrasensory.setType("Psychic");
		extrasensory.setHasSecondaryEffect(true);
		movedex.put("Extrasensory", extrasensory);

		Move extremeevoboost = new Move("Extreme Evoboost");
		extremeevoboost.setBP(0);
		extremeevoboost.setZBP(0);
		extremeevoboost.setCategory("Status");
		extremeevoboost.setType("Normal");
		extremeevoboost.setSignatureZ(true);
		movedex.put("Extreme Evoboost", extremeevoboost);

		Move extremespeed = new Move("Extreme Speed");
		extremespeed.setBP(80);
		extremespeed.setZBP(160);
		extremespeed.setCategory("Physical");
		extremespeed.setType("Normal");
		extremespeed.setMakesContact(true);
		movedex.put("Extreme Speed", extremespeed);

		Move facade = new Move("Facade");
		facade.setBP(70);
		facade.setZBP(140);
		facade.setCategory("Physical");
		facade.setType("Normal");
		facade.setMakesContact(true);
		movedex.put("Facade", facade);

		Move fairylock = new Move("Fairy Lock");
		fairylock.setBP(0);
		fairylock.setZBP(0);
		fairylock.setCategory("Status");
		fairylock.setType("Fairy");
		movedex.put("Fairy Lock", fairylock);

		Move fairywind = new Move("Fairy Wind");
		fairywind.setBP(40);
		fairywind.setZBP(100);
		fairywind.setCategory("Special");
		fairywind.setType("Fairy");
		movedex.put("Fairy Wind", fairywind);

		Move fakeout = new Move("Fake Out");
		fakeout.setBP(40);
		fakeout.setZBP(100);
		fakeout.setCategory("Physical");
		fakeout.setType("Normal");
		fakeout.setMakesContact(true);
		fakeout.setHasSecondaryEffect(true);
		movedex.put("Fake Out", fakeout);

		Move faketears = new Move("Fake Tears");
		faketears.setBP(0);
		faketears.setZBP(0);
		faketears.setCategory("Status");
		faketears.setType("Dark");
		movedex.put("Fake Tears", faketears);

		Move falseswipe = new Move("False Swipe");
		falseswipe.setBP(40);
		falseswipe.setZBP(100);
		falseswipe.setCategory("Physical");
		falseswipe.setType("Normal");
		falseswipe.setMakesContact(true);
		movedex.put("False Swipe", falseswipe);

		Move featherdance = new Move("Feather Dance");
		featherdance.setBP(0);
		featherdance.setZBP(0);
		featherdance.setCategory("Status");
		featherdance.setType("Flying");
		movedex.put("Feather Dance", featherdance);

		Move feint = new Move("Feint");
		feint.setBP(30);
		feint.setZBP(100);
		feint.setCategory("Physical");
		feint.setType("Normal");
		movedex.put("Feint", feint);

		Move feintattack = new Move("Feint Attack");
		feintattack.setBP(60);
		feintattack.setZBP(120);
		feintattack.setCategory("Physical");
		feintattack.setType("Dark");
		feintattack.setMakesContact(true);
		movedex.put("Feint Attack", feintattack);

		Move fellstinger = new Move("Fell Stinger");
		fellstinger.setBP(50);
		fellstinger.setZBP(100);
		fellstinger.setCategory("Physical");
		fellstinger.setType("Bug");
		fellstinger.setMakesContact(true);
		movedex.put("Fell Stinger", fellstinger);

		Move fierydance = new Move("Fiery Dance");
		fierydance.setBP(80);
		fierydance.setZBP(160);
		fierydance.setCategory("Special");
		fierydance.setType("Fire");
		fierydance.setHasSecondaryEffect(true);
		movedex.put("Fiery Dance", fierydance);

		Move finalgambit = new Move("Final Gambit");
		finalgambit.setBP(0);
		finalgambit.setZBP(180);
		finalgambit.setCategory("Special");
		finalgambit.setType("Fighting");
		movedex.put("Final Gambit", finalgambit);

		Move fireblast = new Move("Fire Blast");
		fireblast.setBP(110);
		fireblast.setZBP(185);
		fireblast.setCategory("Special");
		fireblast.setType("Fire");
		fireblast.setHasSecondaryEffect(true);
		movedex.put("Fire Blast", fireblast);

		Move firefang = new Move("Fire Fang");
		firefang.setBP(65);
		firefang.setZBP(120);
		firefang.setCategory("Physical");
		firefang.setType("Fire");
		firefang.setMakesContact(true);
		firefang.setHasSecondaryEffect(true);
		firefang.setBite(true);
		movedex.put("Fire Fang", firefang);

		Move firelash = new Move("Fire Lash");
		firelash.setBP(80);
		firelash.setZBP(160);
		firelash.setCategory("Physical");
		firelash.setType("Fire");
		firelash.setMakesContact(true);
		firelash.setHasSecondaryEffect(true);
		movedex.put("Fire Lash", firelash);

		Move firepledge = new Move("Fire Pledge");
		firepledge.setBP(80);
		firepledge.setZBP(160);
		firepledge.setCategory("Special");
		firepledge.setType("Fire");
		firepledge.setHasSpecialModifier(true);
		movedex.put("Fire Pledge", firepledge);

		Move firepunch = new Move("Fire Punch");
		firepunch.setBP(75);
		firepunch.setZBP(140);
		firepunch.setCategory("Physical");
		firepunch.setType("Fire");
		firepunch.setMakesContact(true);
		firepunch.setHasSecondaryEffect(true);
		firepunch.setPunch(true);
		movedex.put("Fire Punch", firepunch);

		Move firespin = new Move("Fire Spin");
		firespin.setBP(35);
		firespin.setZBP(100);
		firespin.setCategory("Special");
		firespin.setType("Fire");
		movedex.put("Fire Spin", firespin);

		Move firstimpression = new Move("First Impression");
		firstimpression.setBP(90);
		firstimpression.setZBP(175);
		firstimpression.setCategory("Physical");
		firstimpression.setType("Bug");
		firstimpression.setMakesContact(true);
		movedex.put("First Impression", firstimpression);

		Move fissure = new Move("Fissure");
		fissure.setBP(0);
		fissure.setZBP(180);
		fissure.setCategory("Physical");
		fissure.setType("Ground");
		movedex.put("Fissure", fissure);

		Move flail = new Move("Flail");
		flail.setBP(0);
		flail.setZBP(160);
		flail.setCategory("Physical");
		flail.setType("Normal");
		flail.setMakesContact(true);
		flail.setHasSpecialModifier(true);
		movedex.put("Flail", flail);

		Move flameburst = new Move("Flame Burst");
		flameburst.setBP(70);
		flameburst.setZBP(140);
		flameburst.setCategory("Special");
		flameburst.setType("Fire");
		movedex.put("Flame Burst", flameburst);

		Move flamecharge = new Move("Flame Charge");
		flamecharge.setBP(50);
		flamecharge.setZBP(100);
		flamecharge.setCategory("Physical");
		flamecharge.setType("Fire");
		flamecharge.setMakesContact(true);
		flamecharge.setHasSecondaryEffect(true);
		movedex.put("Flame Charge", flamecharge);

		Move flamewheel = new Move("Flame Wheel");
		flamewheel.setBP(60);
		flamewheel.setZBP(120);
		flamewheel.setCategory("Physical");
		flamewheel.setType("Fire");
		flamewheel.setMakesContact(true);
		flamewheel.setHasSecondaryEffect(true);
		movedex.put("Flame Wheel", flamewheel);

		Move flamethrower = new Move("Flamethrower");
		flamethrower.setBP(90);
		flamethrower.setZBP(175);
		flamethrower.setCategory("Special");
		flamethrower.setType("Fire");
		flamethrower.setHasSecondaryEffect(true);
		movedex.put("Flamethrower", flamethrower);

		Move flareblitz = new Move("Flare Blitz");
		flareblitz.setBP(120);
		flareblitz.setZBP(190);
		flareblitz.setCategory("Physical");
		flareblitz.setType("Fire");
		flareblitz.setMakesContact(true);
		flareblitz.setHasSecondaryEffect(true);
		flareblitz.setHasRecoil(true);
		movedex.put("Flare Blitz", flareblitz);

		Move flash = new Move("Flash");
		flash.setBP(0);
		flash.setZBP(0);
		flash.setCategory("Status");
		flash.setType("Normal");
		movedex.put("Flash", flash);

		Move flashcannon = new Move("Flash Cannon");
		flashcannon.setBP(80);
		flashcannon.setZBP(160);
		flashcannon.setCategory("Special");
		flashcannon.setType("Steel");
		flashcannon.setHasSecondaryEffect(true);
		movedex.put("Flash Cannon", flashcannon);

		Move flatter = new Move("Flatter");
		flatter.setBP(0);
		flatter.setZBP(0);
		flatter.setCategory("Status");
		flatter.setType("Dark");
		movedex.put("Flatter", flatter);

		Move fleurcannon = new Move("Fleur Cannon");
		fleurcannon.setBP(130);
		fleurcannon.setZBP(195);
		fleurcannon.setCategory("Special");
		fleurcannon.setType("Fairy");
		movedex.put("Fleur Cannon", fleurcannon);

		Move fling = new Move("Fling");
		fling.setBP(0);
		fling.setZBP(100);
		fling.setCategory("Physical");
		fling.setType("Dark");
		movedex.put("Fling", fling);

		Move floralhealing = new Move("Floral Healing");
		floralhealing.setBP(0);
		floralhealing.setZBP(0);
		floralhealing.setCategory("Status");
		floralhealing.setType("Fairy");
		movedex.put("Floral Healing", floralhealing);

		Move flowershield = new Move("Flower Shield");
		flowershield.setBP(0);
		flowershield.setZBP(0);
		flowershield.setCategory("Status");
		flowershield.setType("Fairy");
		movedex.put("Flower Shield", flowershield);

		Move fly = new Move("Fly");
		fly.setBP(90);
		fly.setZBP(175);
		fly.setCategory("Physical");
		fly.setType("Flying");
		fly.setMakesContact(true);
		movedex.put("Fly", fly);

		Move flyingpress = new Move("Flying Press");
		flyingpress.setBP(100);
		flyingpress.setZBP(170);
		flyingpress.setCategory("Physical");
		flyingpress.setType("Fighting");
		flyingpress.setMakesContact(true);
		flyingpress.setHasSpecialModifier(true);
		movedex.put("Flying Press", flyingpress);

		Move focusblast = new Move("Focus Blast");
		focusblast.setBP(120);
		focusblast.setZBP(190);
		focusblast.setCategory("Special");
		focusblast.setType("Fighting");
		focusblast.setHasSecondaryEffect(true);
		focusblast.setBullet(true);
		movedex.put("Focus Blast", focusblast);

		Move focusenergy = new Move("Focus Energy");
		focusenergy.setBP(0);
		focusenergy.setZBP(0);
		focusenergy.setCategory("Status");
		focusenergy.setType("Normal");
		movedex.put("Focus Energy", focusenergy);

		Move focuspunch = new Move("Focus Punch");
		focuspunch.setBP(150);
		focuspunch.setZBP(200);
		focuspunch.setCategory("Physical");
		focuspunch.setType("Fighting");
		focuspunch.setMakesContact(true);
		focuspunch.setPunch(true);
		movedex.put("Focus Punch", focuspunch);

		Move followme = new Move("Follow Me");
		followme.setBP(0);
		followme.setZBP(0);
		followme.setCategory("Status");
		followme.setType("Normal");
		movedex.put("Follow Me", followme);

		Move forcepalm = new Move("Force Palm");
		forcepalm.setBP(60);
		forcepalm.setZBP(120);
		forcepalm.setCategory("Physical");
		forcepalm.setType("Fighting");
		forcepalm.setMakesContact(true);
		forcepalm.setHasSecondaryEffect(true);
		movedex.put("Force Palm", forcepalm);

		Move foresight = new Move("Foresight");
		foresight.setBP(0);
		foresight.setZBP(0);
		foresight.setCategory("Status");
		foresight.setType("Normal");
		movedex.put("Foresight", foresight);

		Move forestscurse = new Move("Forest's Curse");
		forestscurse.setBP(0);
		forestscurse.setZBP(0);
		forestscurse.setCategory("Status");
		forestscurse.setType("Grass");
		movedex.put("Forest's Curse", forestscurse);

		Move foulplay = new Move("Foul Play");
		foulplay.setBP(95);
		foulplay.setZBP(175);
		foulplay.setCategory("Physical");
		foulplay.setType("Dark");
		foulplay.setMakesContact(true);
		movedex.put("Foul Play", foulplay);

		Move freezeshock = new Move("Freeze Shock");
		freezeshock.setBP(140);
		freezeshock.setZBP(200);
		freezeshock.setCategory("Physical");
		freezeshock.setType("Ice");
		freezeshock.setHasSecondaryEffect(true);
		movedex.put("Freeze Shock", freezeshock);

		Move freezedry = new Move("Freeze-Dry");
		freezedry.setBP(70);
		freezedry.setZBP(140);
		freezedry.setCategory("Special");
		freezedry.setType("Ice");
		freezedry.setHasSecondaryEffect(true);
		movedex.put("Freeze-Dry", freezedry);

		Move frenzyplant = new Move("Frenzy Plant");
		frenzyplant.setBP(150);
		frenzyplant.setZBP(200);
		frenzyplant.setCategory("Special");
		frenzyplant.setType("Grass");
		movedex.put("Frenzy Plant", frenzyplant);

		Move frostbreath = new Move("Frost Breath");
		frostbreath.setBP(60);
		frostbreath.setZBP(120);
		frostbreath.setCategory("Special");
		frostbreath.setType("Ice");
		movedex.put("Frost Breath", frostbreath);

		Move frustration = new Move("Frustration");
		frustration.setBP(102);
		frustration.setZBP(160);
		frustration.setCategory("Physical");
		frustration.setType("Normal");
		frustration.setMakesContact(true);
		movedex.put("Frustration", frustration);

		Move furyattack = new Move("Fury Attack");
		furyattack.setBP(15);
		furyattack.setZBP(100);
		furyattack.setCategory("Physical");
		furyattack.setType("Normal");
		furyattack.setMakesContact(true);
		furyattack.setMultiHit(true);
		movedex.put("Fury Attack", furyattack);

		Move furycutter = new Move("Fury Cutter");
		furycutter.setBP(40);
		furycutter.setZBP(100);
		furycutter.setCategory("Physical");
		furycutter.setType("Bug");
		furycutter.setMakesContact(true);
		furycutter.setHasSpecialModifier(true);
		movedex.put("Fury Cutter", furycutter);

		Move furyswipes = new Move("Fury Swipes");
		furyswipes.setBP(18);
		furyswipes.setZBP(100);
		furyswipes.setCategory("Physical");
		furyswipes.setType("Normal");
		furyswipes.setMakesContact(true);
		furyswipes.setMultiHit(true);
		movedex.put("Fury Swipes", furyswipes);

		Move fusionbolt = new Move("Fusion Bolt");
		fusionbolt.setBP(100);
		fusionbolt.setZBP(180);
		fusionbolt.setCategory("Physical");
		fusionbolt.setType("Electric");
		movedex.put("Fusion Bolt", fusionbolt);

		Move fusionflare = new Move("Fusion Flare");
		fusionflare.setBP(100);
		fusionflare.setZBP(180);
		fusionflare.setCategory("Special");
		fusionflare.setType("Fire");
		movedex.put("Fusion Flare", fusionflare);

		Move futuresight = new Move("Future Sight");
		futuresight.setBP(120);
		futuresight.setZBP(190);
		futuresight.setCategory("Special");
		futuresight.setType("Psychic");
		movedex.put("Future Sight", futuresight);

		Move gastroacid = new Move("Gastro Acid");
		gastroacid.setBP(0);
		gastroacid.setZBP(0);
		gastroacid.setCategory("Status");
		gastroacid.setType("Poison");
		movedex.put("Gastro Acid", gastroacid);

		Move geargrind = new Move("Gear Grind");
		geargrind.setBP(50);
		geargrind.setZBP(180);
		geargrind.setCategory("Physical");
		geargrind.setType("Steel");
		geargrind.setMakesContact(true);
		geargrind.setTwoHit(true);
		movedex.put("Gear Grind", geargrind);

		Move gearup = new Move("Gear Up");
		gearup.setBP(0);
		gearup.setZBP(0);
		gearup.setCategory("Status");
		gearup.setType("Steel");
		movedex.put("Gear Up", gearup);

		Move genesissupernova = new Move("Genesis Supernova");
		genesissupernova.setBP(185);
		genesissupernova.setZBP(0);
		genesissupernova.setCategory("Special");
		genesissupernova.setType("Psychic");
		genesissupernova.setHasSecondaryEffect(true);
		genesissupernova.setSignatureZ(true);
		movedex.put("Genesis Supernova", genesissupernova);

		Move geomancy = new Move("Geomancy");
		geomancy.setBP(0);
		geomancy.setZBP(0);
		geomancy.setCategory("Status");
		geomancy.setType("Fairy");
		movedex.put("Geomancy", geomancy);

		Move gigadrain = new Move("Giga Drain");
		gigadrain.setBP(75);
		gigadrain.setZBP(140);
		gigadrain.setCategory("Special");
		gigadrain.setType("Grass");
		movedex.put("Giga Drain", gigadrain);

		Move gigaimpact = new Move("Giga Impact");
		gigaimpact.setBP(150);
		gigaimpact.setZBP(200);
		gigaimpact.setCategory("Physical");
		gigaimpact.setType("Normal");
		gigaimpact.setMakesContact(true);
		movedex.put("Giga Impact", gigaimpact);

		Move gigavolthavoc = new Move("Gigavolt Havoc");
		gigavolthavoc.setBP(1);
		gigavolthavoc.setZBP(0);
		gigavolthavoc.setCategory("Physical");
		gigavolthavoc.setType("Electric");
		movedex.put("Gigavolt Havoc", gigavolthavoc);

		Move glaciate = new Move("Glaciate");
		glaciate.setBP(65);
		glaciate.setZBP(120);
		glaciate.setCategory("Special");
		glaciate.setType("Ice");
		glaciate.setSpread(true);
		glaciate.setHasSecondaryEffect(true);
		movedex.put("Glaciate", glaciate);

		Move glare = new Move("Glare");
		glare.setBP(0);
		glare.setZBP(0);
		glare.setCategory("Status");
		glare.setType("Normal");
		movedex.put("Glare", glare);

		Move grassknot = new Move("Grass Knot");
		grassknot.setBP(0);
		grassknot.setZBP(160);
		grassknot.setCategory("Special");
		grassknot.setType("Grass");
		grassknot.setMakesContact(true);
		grassknot.setHasSpecialModifier(true);
		movedex.put("Grass Knot", grassknot);

		Move grasspledge = new Move("Grass Pledge");
		grasspledge.setBP(80);
		grasspledge.setZBP(160);
		grasspledge.setCategory("Special");
		grasspledge.setType("Grass");
		grasspledge.setHasSpecialModifier(true);
		movedex.put("Grass Pledge", grasspledge);

		Move grasswhistle = new Move("Grass Whistle");
		grasswhistle.setBP(0);
		grasswhistle.setZBP(0);
		grasswhistle.setCategory("Status");
		grasswhistle.setType("Grass");
		grasswhistle.setSound(true);
		movedex.put("Grass Whistle", grasswhistle);

		Move grassyterrain = new Move("Grassy Terrain");
		grassyterrain.setBP(0);
		grassyterrain.setZBP(0);
		grassyterrain.setCategory("Status");
		grassyterrain.setType("Grass");
		movedex.put("Grassy Terrain", grassyterrain);

		Move gravity = new Move("Gravity");
		gravity.setBP(0);
		gravity.setZBP(0);
		gravity.setCategory("Status");
		gravity.setType("Psychic");
		movedex.put("Gravity", gravity);

		Move growl = new Move("Growl");
		growl.setBP(0);
		growl.setZBP(0);
		growl.setCategory("Status");
		growl.setType("Normal");
		growl.setSpread(true);
		growl.setSound(true);
		movedex.put("Growl", growl);

		Move growth = new Move("Growth");
		growth.setBP(0);
		growth.setZBP(0);
		growth.setCategory("Status");
		growth.setType("Normal");
		movedex.put("Growth", growth);

		Move grudge = new Move("Grudge");
		grudge.setBP(0);
		grudge.setZBP(0);
		grudge.setCategory("Status");
		grudge.setType("Ghost");
		movedex.put("Grudge", grudge);

		Move guardsplit = new Move("Guard Split");
		guardsplit.setBP(0);
		guardsplit.setZBP(0);
		guardsplit.setCategory("Status");
		guardsplit.setType("Psychic");
		movedex.put("Guard Split", guardsplit);

		Move guardswap = new Move("Guard Swap");
		guardswap.setBP(0);
		guardswap.setZBP(0);
		guardswap.setCategory("Status");
		guardswap.setType("Psychic");
		movedex.put("Guard Swap", guardswap);

		Move guardianofalola = new Move("Guardian of Alola");
		guardianofalola.setBP(0);
		guardianofalola.setZBP(0);
		guardianofalola.setCategory("Special");
		guardianofalola.setType("Fairy");
		guardianofalola.setSignatureZ(true);
		movedex.put("Guardian of Alola", guardianofalola);

		Move guillotine = new Move("Guillotine");
		guillotine.setBP(0);
		guillotine.setZBP(180);
		guillotine.setCategory("Physical");
		guillotine.setType("Normal");
		guillotine.setMakesContact(true);
		movedex.put("Guillotine", guillotine);

		Move gunkshot = new Move("Gunk Shot");
		gunkshot.setBP(120);
		gunkshot.setZBP(190);
		gunkshot.setCategory("Physical");
		gunkshot.setType("Poison");
		gunkshot.setHasSecondaryEffect(true);
		movedex.put("Gunk Shot", gunkshot);

		Move gust = new Move("Gust");
		gust.setBP(40);
		gust.setZBP(100);
		gust.setCategory("Special");
		gust.setType("Flying");
		movedex.put("Gust", gust);

		Move gyroball = new Move("Gyro Ball");
		gyroball.setBP(0);
		gyroball.setZBP(160);
		gyroball.setCategory("Physical");
		gyroball.setType("Steel");
		gyroball.setMakesContact(true);
		gyroball.setBullet(true);
		gyroball.setHasSpecialModifier(true);
		movedex.put("Gyro Ball", gyroball);

		Move hail = new Move("Hail");
		hail.setBP(0);
		hail.setZBP(0);
		hail.setCategory("Status");
		hail.setType("Ice");
		movedex.put("Hail", hail);

		Move hammerarm = new Move("Hammer Arm");
		hammerarm.setBP(100);
		hammerarm.setZBP(180);
		hammerarm.setCategory("Physical");
		hammerarm.setType("Fighting");
		hammerarm.setMakesContact(true);
		hammerarm.setPunch(true);
		movedex.put("Hammer Arm", hammerarm);

		Move happyhour = new Move("Happy Hour");
		happyhour.setBP(0);
		happyhour.setZBP(0);
		happyhour.setCategory("Status");
		happyhour.setType("Normal");
		movedex.put("Happy Hour", happyhour);

		Move harden = new Move("Harden");
		harden.setBP(0);
		harden.setZBP(0);
		harden.setCategory("Status");
		harden.setType("Normal");
		movedex.put("Harden", harden);

		Move haze = new Move("Haze");
		haze.setBP(0);
		haze.setZBP(0);
		haze.setCategory("Status");
		haze.setType("Ice");
		movedex.put("Haze", haze);

		Move headcharge = new Move("Head Charge");
		headcharge.setBP(120);
		headcharge.setZBP(190);
		headcharge.setCategory("Physical");
		headcharge.setType("Normal");
		headcharge.setMakesContact(true);
		headcharge.setHasRecoil(true);
		movedex.put("Head Charge", headcharge);

		Move headsmash = new Move("Head Smash");
		headsmash.setBP(150);
		headsmash.setZBP(200);
		headsmash.setCategory("Physical");
		headsmash.setType("Rock");
		headsmash.setMakesContact(true);
		headsmash.setHasRecoil(true);
		movedex.put("Head Smash", headsmash);

		Move headbutt = new Move("Headbutt");
		headbutt.setBP(70);
		headbutt.setZBP(140);
		headbutt.setCategory("Physical");
		headbutt.setType("Normal");
		headbutt.setMakesContact(true);
		headbutt.setHasSecondaryEffect(true);
		movedex.put("Headbutt", headbutt);

		Move healbell = new Move("Heal Bell");
		healbell.setBP(0);
		healbell.setZBP(0);
		healbell.setCategory("Status");
		healbell.setType("Normal");
		healbell.setHasSecondaryEffect(true);
		healbell.setSound(true);
		movedex.put("Heal Bell", healbell);

		Move healblock = new Move("Heal Block");
		healblock.setBP(0);
		healblock.setZBP(0);
		healblock.setCategory("Status");
		healblock.setType("Psychic");
		healblock.setSpread(true);
		movedex.put("Heal Block", healblock);

		Move healorder = new Move("Heal Order");
		healorder.setBP(0);
		healorder.setZBP(0);
		healorder.setCategory("Status");
		healorder.setType("Bug");
		movedex.put("Heal Order", healorder);

		Move healpulse = new Move("Heal Pulse");
		healpulse.setBP(0);
		healpulse.setZBP(0);
		healpulse.setCategory("Status");
		healpulse.setType("Psychic");
		movedex.put("Heal Pulse", healpulse);

		Move healingwish = new Move("Healing Wish");
		healingwish.setBP(0);
		healingwish.setZBP(0);
		healingwish.setCategory("Status");
		healingwish.setType("Psychic");
		movedex.put("Healing Wish", healingwish);

		Move heartstamp = new Move("Heart Stamp");
		heartstamp.setBP(60);
		heartstamp.setZBP(120);
		heartstamp.setCategory("Physical");
		heartstamp.setType("Psychic");
		heartstamp.setMakesContact(true);
		heartstamp.setHasSecondaryEffect(true);
		movedex.put("Heart Stamp", heartstamp);

		Move heartswap = new Move("Heart Swap");
		heartswap.setBP(0);
		heartswap.setZBP(0);
		heartswap.setCategory("Status");
		heartswap.setType("Psychic");
		movedex.put("Heart Swap", heartswap);

		Move heatcrash = new Move("Heat Crash");
		heatcrash.setBP(0);
		heatcrash.setZBP(160);
		heatcrash.setCategory("Physical");
		heatcrash.setType("Fire");
		heatcrash.setMakesContact(true);
		heatcrash.setHasSpecialModifier(true);
		movedex.put("Heat Crash", heatcrash);

		Move heatwave = new Move("Heat Wave");
		heatwave.setBP(95);
		heatwave.setZBP(175);
		heatwave.setCategory("Special");
		heatwave.setType("Fire");
		heatwave.setSpread(true);
		heatwave.setHasSecondaryEffect(true);
		movedex.put("Heat Wave", heatwave);

		Move heavyslam = new Move("Heavy Slam");
		heavyslam.setBP(0);
		heavyslam.setZBP(160);
		heavyslam.setCategory("Physical");
		heavyslam.setType("Steel");
		heavyslam.setMakesContact(true);
		heavyslam.setHasSpecialModifier(true);
		movedex.put("Heavy Slam", heavyslam);

		Move helpinghand = new Move("Helping Hand");
		helpinghand.setBP(0);
		helpinghand.setZBP(0);
		helpinghand.setCategory("Status");
		helpinghand.setType("Normal");
		movedex.put("Helping Hand", helpinghand);

		Move hex = new Move("Hex");
		hex.setBP(65);
		hex.setZBP(160);
		hex.setCategory("Special");
		hex.setType("Ghost");
		hex.setHasSpecialModifier(true);
		movedex.put("Hex", hex);

		Move hiddenpower = new Move("Hidden Power");
		hiddenpower.setBP(60);
		hiddenpower.setZBP(120);
		hiddenpower.setCategory("Special");
		hiddenpower.setType("Normal");
		movedex.put("Hidden Power", hiddenpower);

		Move hiddenpowerbug = new Move("Hidden Power Bug");
		hiddenpowerbug.setBP(60);
		hiddenpowerbug.setZBP(0);
		hiddenpowerbug.setCategory("Special");
		hiddenpowerbug.setType("Bug");
		movedex.put("Hidden Power Bug", hiddenpowerbug);

		Move hiddenpowerdark = new Move("Hidden Power Dark");
		hiddenpowerdark.setBP(60);
		hiddenpowerdark.setZBP(0);
		hiddenpowerdark.setCategory("Special");
		hiddenpowerdark.setType("Dark");
		movedex.put("Hidden Power Dark", hiddenpowerdark);

		Move hiddenpowerdragon = new Move("Hidden Power Dragon");
		hiddenpowerdragon.setBP(60);
		hiddenpowerdragon.setZBP(0);
		hiddenpowerdragon.setCategory("Special");
		hiddenpowerdragon.setType("Dragon");
		movedex.put("Hidden Power Dragon", hiddenpowerdragon);

		Move hiddenpowerelectric = new Move("Hidden Power Electric");
		hiddenpowerelectric.setBP(60);
		hiddenpowerelectric.setZBP(0);
		hiddenpowerelectric.setCategory("Special");
		hiddenpowerelectric.setType("Electric");
		movedex.put("Hidden Power Electric", hiddenpowerelectric);

		Move hiddenpowerfighting = new Move("Hidden Power Fighting");
		hiddenpowerfighting.setBP(60);
		hiddenpowerfighting.setZBP(0);
		hiddenpowerfighting.setCategory("Special");
		hiddenpowerfighting.setType("Fighting");
		movedex.put("Hidden Power Fighting", hiddenpowerfighting);

		Move hiddenpowerfire = new Move("Hidden Power Fire");
		hiddenpowerfire.setBP(60);
		hiddenpowerfire.setZBP(0);
		hiddenpowerfire.setCategory("Special");
		hiddenpowerfire.setType("Fire");
		movedex.put("Hidden Power Fire", hiddenpowerfire);

		Move hiddenpowerflying = new Move("Hidden Power Flying");
		hiddenpowerflying.setBP(60);
		hiddenpowerflying.setZBP(0);
		hiddenpowerflying.setCategory("Special");
		hiddenpowerflying.setType("Flying");
		movedex.put("Hidden Power Flying", hiddenpowerflying);

		Move hiddenpowerghost = new Move("Hidden Power Ghost");
		hiddenpowerghost.setBP(60);
		hiddenpowerghost.setZBP(0);
		hiddenpowerghost.setCategory("Special");
		hiddenpowerghost.setType("Ghost");
		movedex.put("Hidden Power Ghost", hiddenpowerghost);

		Move hiddenpowergrass = new Move("Hidden Power Grass");
		hiddenpowergrass.setBP(60);
		hiddenpowergrass.setZBP(0);
		hiddenpowergrass.setCategory("Special");
		hiddenpowergrass.setType("Grass");
		movedex.put("Hidden Power Grass", hiddenpowergrass);

		Move hiddenpowerground = new Move("Hidden Power Ground");
		hiddenpowerground.setBP(60);
		hiddenpowerground.setZBP(0);
		hiddenpowerground.setCategory("Special");
		hiddenpowerground.setType("Ground");
		movedex.put("Hidden Power Ground", hiddenpowerground);

		Move hiddenpowerice = new Move("Hidden Power Ice");
		hiddenpowerice.setBP(60);
		hiddenpowerice.setZBP(0);
		hiddenpowerice.setCategory("Special");
		hiddenpowerice.setType("Ice");
		movedex.put("Hidden Power Ice", hiddenpowerice);

		Move hiddenpowerpoison = new Move("Hidden Power Poison");
		hiddenpowerpoison.setBP(60);
		hiddenpowerpoison.setZBP(0);
		hiddenpowerpoison.setCategory("Special");
		hiddenpowerpoison.setType("Poison");
		movedex.put("Hidden Power Poison", hiddenpowerpoison);

		Move hiddenpowerpsychic = new Move("Hidden Power Psychic");
		hiddenpowerpsychic.setBP(60);
		hiddenpowerpsychic.setZBP(0);
		hiddenpowerpsychic.setCategory("Special");
		hiddenpowerpsychic.setType("Psychic");
		movedex.put("Hidden Power Psychic", hiddenpowerpsychic);

		Move hiddenpowerrock = new Move("Hidden Power Rock");
		hiddenpowerrock.setBP(60);
		hiddenpowerrock.setZBP(0);
		hiddenpowerrock.setCategory("Special");
		hiddenpowerrock.setType("Rock");
		movedex.put("Hidden Power Rock", hiddenpowerrock);

		Move hiddenpowersteel = new Move("Hidden Power Steel");
		hiddenpowersteel.setBP(60);
		hiddenpowersteel.setZBP(0);
		hiddenpowersteel.setCategory("Special");
		hiddenpowersteel.setType("Steel");
		movedex.put("Hidden Power Steel", hiddenpowersteel);

		Move hiddenpowerwater = new Move("Hidden Power Water");
		hiddenpowerwater.setBP(60);
		hiddenpowerwater.setZBP(0);
		hiddenpowerwater.setCategory("Special");
		hiddenpowerwater.setType("Water");
		movedex.put("Hidden Power Water", hiddenpowerwater);

		Move highhorsepower = new Move("High Horsepower");
		highhorsepower.setBP(95);
		highhorsepower.setZBP(175);
		highhorsepower.setCategory("Physical");
		highhorsepower.setType("Ground");
		highhorsepower.setMakesContact(true);
		movedex.put("High Horsepower", highhorsepower);

		Move highjumpkick = new Move("High Jump Kick");
		highjumpkick.setBP(130);
		highjumpkick.setZBP(195);
		highjumpkick.setCategory("Physical");
		highjumpkick.setType("Fighting");
		highjumpkick.setMakesContact(true);
		movedex.put("High Jump Kick", highjumpkick);

		Move holdback = new Move("Hold Back");
		holdback.setBP(40);
		holdback.setZBP(100);
		holdback.setCategory("Physical");
		holdback.setType("Normal");
		holdback.setMakesContact(true);
		movedex.put("Hold Back", holdback);

		Move holdhands = new Move("Hold Hands");
		holdhands.setBP(0);
		holdhands.setZBP(0);
		holdhands.setCategory("Status");
		holdhands.setType("Normal");
		movedex.put("Hold Hands", holdhands);

		Move honeclaws = new Move("Hone Claws");
		honeclaws.setBP(0);
		honeclaws.setZBP(0);
		honeclaws.setCategory("Status");
		honeclaws.setType("Dark");
		movedex.put("Hone Claws", honeclaws);

		Move hornattack = new Move("Horn Attack");
		hornattack.setBP(65);
		hornattack.setZBP(120);
		hornattack.setCategory("Physical");
		hornattack.setType("Normal");
		hornattack.setMakesContact(true);
		movedex.put("Horn Attack", hornattack);

		Move horndrill = new Move("Horn Drill");
		horndrill.setBP(0);
		horndrill.setZBP(180);
		horndrill.setCategory("Physical");
		horndrill.setType("Normal");
		horndrill.setMakesContact(true);
		movedex.put("Horn Drill", horndrill);

		Move hornleech = new Move("Horn Leech");
		hornleech.setBP(75);
		hornleech.setZBP(140);
		hornleech.setCategory("Physical");
		hornleech.setType("Grass");
		hornleech.setMakesContact(true);
		movedex.put("Horn Leech", hornleech);

		Move howl = new Move("Howl");
		howl.setBP(0);
		howl.setZBP(0);
		howl.setCategory("Status");
		howl.setType("Normal");
		movedex.put("Howl", howl);

		Move hurricane = new Move("Hurricane");
		hurricane.setBP(110);
		hurricane.setZBP(185);
		hurricane.setCategory("Special");
		hurricane.setType("Flying");
		hurricane.setHasSecondaryEffect(true);
		movedex.put("Hurricane", hurricane);

		Move hydrocannon = new Move("Hydro Cannon");
		hydrocannon.setBP(150);
		hydrocannon.setZBP(200);
		hydrocannon.setCategory("Special");
		hydrocannon.setType("Water");
		movedex.put("Hydro Cannon", hydrocannon);

		Move hydropump = new Move("Hydro Pump");
		hydropump.setBP(110);
		hydropump.setZBP(185);
		hydropump.setCategory("Special");
		hydropump.setType("Water");
		movedex.put("Hydro Pump", hydropump);

		Move hydrovortex = new Move("Hydro Vortex");
		hydrovortex.setBP(1);
		hydrovortex.setZBP(0);
		hydrovortex.setCategory("Physical");
		hydrovortex.setType("Water");
		movedex.put("Hydro Vortex", hydrovortex);

		Move hyperbeam = new Move("Hyper Beam");
		hyperbeam.setBP(150);
		hyperbeam.setZBP(200);
		hyperbeam.setCategory("Special");
		hyperbeam.setType("Normal");
		movedex.put("Hyper Beam", hyperbeam);

		Move hyperfang = new Move("Hyper Fang");
		hyperfang.setBP(80);
		hyperfang.setZBP(160);
		hyperfang.setCategory("Physical");
		hyperfang.setType("Normal");
		hyperfang.setMakesContact(true);
		hyperfang.setHasSecondaryEffect(true);
		hyperfang.setBite(true);
		movedex.put("Hyper Fang", hyperfang);

		Move hypervoice = new Move("Hyper Voice");
		hypervoice.setBP(90);
		hypervoice.setZBP(175);
		hypervoice.setCategory("Special");
		hypervoice.setType("Normal");
		hypervoice.setSpread(true);
		hypervoice.setSound(true);
		movedex.put("Hyper Voice", hypervoice);

		Move hyperspacefury = new Move("Hyperspace Fury");
		hyperspacefury.setBP(100);
		hyperspacefury.setZBP(180);
		hyperspacefury.setCategory("Physical");
		hyperspacefury.setType("Dark");
		movedex.put("Hyperspace Fury", hyperspacefury);

		Move hyperspacehole = new Move("Hyperspace Hole");
		hyperspacehole.setBP(80);
		hyperspacehole.setZBP(160);
		hyperspacehole.setCategory("Special");
		hyperspacehole.setType("Psychic");
		movedex.put("Hyperspace Hole", hyperspacehole);

		Move hypnosis = new Move("Hypnosis");
		hypnosis.setBP(0);
		hypnosis.setZBP(0);
		hypnosis.setCategory("Status");
		hypnosis.setType("Psychic");
		movedex.put("Hypnosis", hypnosis);

		Move iceball = new Move("Ice Ball");
		iceball.setBP(30);
		iceball.setZBP(100);
		iceball.setCategory("Physical");
		iceball.setType("Ice");
		iceball.setMakesContact(true);
		iceball.setBullet(true);
		iceball.setHasSpecialModifier(true);
		movedex.put("Ice Ball", iceball);

		Move icebeam = new Move("Ice Beam");
		icebeam.setBP(90);
		icebeam.setZBP(175);
		icebeam.setCategory("Special");
		icebeam.setType("Ice");
		icebeam.setHasSecondaryEffect(true);
		movedex.put("Ice Beam", icebeam);

		Move iceburn = new Move("Ice Burn");
		iceburn.setBP(140);
		iceburn.setZBP(200);
		iceburn.setCategory("Special");
		iceburn.setType("Ice");
		iceburn.setHasSecondaryEffect(true);
		movedex.put("Ice Burn", iceburn);

		Move icefang = new Move("Ice Fang");
		icefang.setBP(65);
		icefang.setZBP(120);
		icefang.setCategory("Physical");
		icefang.setType("Ice");
		icefang.setMakesContact(true);
		icefang.setHasSecondaryEffect(true);
		icefang.setBite(true);
		movedex.put("Ice Fang", icefang);

		Move icehammer = new Move("Ice Hammer");
		icehammer.setBP(100);
		icehammer.setZBP(180);
		icehammer.setCategory("Physical");
		icehammer.setType("Ice");
		icehammer.setMakesContact(true);
		icehammer.setPunch(true);
		movedex.put("Ice Hammer", icehammer);

		Move icepunch = new Move("Ice Punch");
		icepunch.setBP(75);
		icepunch.setZBP(140);
		icepunch.setCategory("Physical");
		icepunch.setType("Ice");
		icepunch.setMakesContact(true);
		icepunch.setHasSecondaryEffect(true);
		icepunch.setPunch(true);
		movedex.put("Ice Punch", icepunch);

		Move iceshard = new Move("Ice Shard");
		iceshard.setBP(40);
		iceshard.setZBP(100);
		iceshard.setCategory("Physical");
		iceshard.setType("Ice");
		movedex.put("Ice Shard", iceshard);

		Move iciclecrash = new Move("Icicle Crash");
		iciclecrash.setBP(85);
		iciclecrash.setZBP(160);
		iciclecrash.setCategory("Physical");
		iciclecrash.setType("Ice");
		iciclecrash.setHasSecondaryEffect(true);
		movedex.put("Icicle Crash", iciclecrash);

		Move iciclespear = new Move("Icicle Spear");
		iciclespear.setBP(25);
		iciclespear.setZBP(140);
		iciclespear.setCategory("Physical");
		iciclespear.setType("Ice");
		iciclespear.setMultiHit(true);
		movedex.put("Icicle Spear", iciclespear);

		Move icywind = new Move("Icy Wind");
		icywind.setBP(55);
		icywind.setZBP(100);
		icywind.setCategory("Special");
		icywind.setType("Ice");
		icywind.setSpread(true);
		icywind.setHasSecondaryEffect(true);
		movedex.put("Icy Wind", icywind);

		Move imprison = new Move("Imprison");
		imprison.setBP(0);
		imprison.setZBP(0);
		imprison.setCategory("Status");
		imprison.setType("Psychic");
		movedex.put("Imprison", imprison);

		Move incinerate = new Move("Incinerate");
		incinerate.setBP(60);
		incinerate.setZBP(120);
		incinerate.setCategory("Special");
		incinerate.setType("Fire");
		incinerate.setSpread(true);
		movedex.put("Incinerate", incinerate);

		Move inferno = new Move("Inferno");
		inferno.setBP(100);
		inferno.setZBP(180);
		inferno.setCategory("Special");
		inferno.setType("Fire");
		inferno.setHasSecondaryEffect(true);
		movedex.put("Inferno", inferno);

		Move infernooverdrive = new Move("Inferno Overdrive");
		infernooverdrive.setBP(1);
		infernooverdrive.setZBP(0);
		infernooverdrive.setCategory("Physical");
		infernooverdrive.setType("Fire");
		movedex.put("Inferno Overdrive", infernooverdrive);

		Move infestation = new Move("Infestation");
		infestation.setBP(20);
		infestation.setZBP(100);
		infestation.setCategory("Special");
		infestation.setType("Bug");
		infestation.setMakesContact(true);
		movedex.put("Infestation", infestation);

		Move ingrain = new Move("Ingrain");
		ingrain.setBP(0);
		ingrain.setZBP(0);
		ingrain.setCategory("Status");
		ingrain.setType("Grass");
		movedex.put("Ingrain", ingrain);

		Move instruct = new Move("Instruct");
		instruct.setBP(0);
		instruct.setZBP(0);
		instruct.setCategory("Status");
		instruct.setType("Psychic");
		movedex.put("Instruct", instruct);

		Move iondeluge = new Move("Ion Deluge");
		iondeluge.setBP(0);
		iondeluge.setZBP(0);
		iondeluge.setCategory("Status");
		iondeluge.setType("Electric");
		movedex.put("Ion Deluge", iondeluge);

		Move irondefense = new Move("Iron Defense");
		irondefense.setBP(0);
		irondefense.setZBP(0);
		irondefense.setCategory("Status");
		irondefense.setType("Steel");
		movedex.put("Iron Defense", irondefense);

		Move ironhead = new Move("Iron Head");
		ironhead.setBP(80);
		ironhead.setZBP(160);
		ironhead.setCategory("Physical");
		ironhead.setType("Steel");
		ironhead.setMakesContact(true);
		ironhead.setHasSecondaryEffect(true);
		movedex.put("Iron Head", ironhead);

		Move irontail = new Move("Iron Tail");
		irontail.setBP(100);
		irontail.setZBP(180);
		irontail.setCategory("Physical");
		irontail.setType("Steel");
		irontail.setMakesContact(true);
		irontail.setHasSecondaryEffect(true);
		movedex.put("Iron Tail", irontail);

		Move judgment = new Move("Judgment");
		judgment.setBP(100);
		judgment.setZBP(180);
		judgment.setCategory("Special");
		judgment.setType("Normal");
		movedex.put("Judgment", judgment);

		Move jumpkick = new Move("Jump Kick");
		jumpkick.setBP(100);
		jumpkick.setZBP(180);
		jumpkick.setCategory("Physical");
		jumpkick.setType("Fighting");
		jumpkick.setMakesContact(true);
		movedex.put("Jump Kick", jumpkick);

		Move karatechop = new Move("Karate Chop");
		karatechop.setBP(50);
		karatechop.setZBP(100);
		karatechop.setCategory("Physical");
		karatechop.setType("Fighting");
		karatechop.setMakesContact(true);
		movedex.put("Karate Chop", karatechop);

		Move kinesis = new Move("Kinesis");
		kinesis.setBP(0);
		kinesis.setZBP(0);
		kinesis.setCategory("Status");
		kinesis.setType("Psychic");
		movedex.put("Kinesis", kinesis);

		Move kingsshield = new Move("King's Shield");
		kingsshield.setBP(0);
		kingsshield.setZBP(0);
		kingsshield.setCategory("Status");
		kingsshield.setType("Steel");
		movedex.put("King's Shield", kingsshield);

		Move knockoff = new Move("Knock Off");
		knockoff.setBP(65);
		knockoff.setZBP(120);
		knockoff.setCategory("Physical");
		knockoff.setType("Dark");
		knockoff.setMakesContact(true);
		movedex.put("Knock Off", knockoff);

		Move landswrath = new Move("Land's Wrath");
		landswrath.setBP(90);
		landswrath.setZBP(185);
		landswrath.setCategory("Physical");
		landswrath.setType("Ground");
		landswrath.setSpread(true);
		movedex.put("Land's Wrath", landswrath);

		Move laserfocus = new Move("Laser Focus");
		laserfocus.setBP(0);
		laserfocus.setZBP(0);
		laserfocus.setCategory("Status");
		laserfocus.setType("Normal");
		movedex.put("Laser Focus", laserfocus);

		Move lastresort = new Move("Last Resort");
		lastresort.setBP(140);
		lastresort.setZBP(200);
		lastresort.setCategory("Physical");
		lastresort.setType("Normal");
		lastresort.setMakesContact(true);
		movedex.put("Last Resort", lastresort);

		Move lavaplume = new Move("Lava Plume");
		lavaplume.setBP(80);
		lavaplume.setZBP(160);
		lavaplume.setCategory("Special");
		lavaplume.setType("Fire");
		lavaplume.setSpread(true);
		lavaplume.setHasSecondaryEffect(true);
		movedex.put("Lava Plume", lavaplume);

		Move leafblade = new Move("Leaf Blade");
		leafblade.setBP(90);
		leafblade.setZBP(175);
		leafblade.setCategory("Physical");
		leafblade.setType("Grass");
		leafblade.setMakesContact(true);
		movedex.put("Leaf Blade", leafblade);

		Move leafstorm = new Move("Leaf Storm");
		leafstorm.setBP(130);
		leafstorm.setZBP(195);
		leafstorm.setCategory("Special");
		leafstorm.setType("Grass");
		movedex.put("Leaf Storm", leafstorm);

		Move leaftornado = new Move("Leaf Tornado");
		leaftornado.setBP(65);
		leaftornado.setZBP(120);
		leaftornado.setCategory("Special");
		leaftornado.setType("Grass");
		leaftornado.setHasSecondaryEffect(true);
		movedex.put("Leaf Tornado", leaftornado);

		Move leafage = new Move("Leafage");
		leafage.setBP(40);
		leafage.setZBP(100);
		leafage.setCategory("Physical");
		leafage.setType("Grass");
		movedex.put("Leafage", leafage);

		Move leechlife = new Move("Leech Life");
		leechlife.setBP(80);
		leechlife.setZBP(160);
		leechlife.setCategory("Physical");
		leechlife.setType("Bug");
		leechlife.setMakesContact(true);
		movedex.put("Leech Life", leechlife);

		Move leechseed = new Move("Leech Seed");
		leechseed.setBP(0);
		leechseed.setZBP(0);
		leechseed.setCategory("Status");
		leechseed.setType("Grass");
		movedex.put("Leech Seed", leechseed);

		Move leer = new Move("Leer");
		leer.setBP(0);
		leer.setZBP(0);
		leer.setCategory("Status");
		leer.setType("Normal");
		leer.setSpread(true);
		movedex.put("Leer", leer);

		Move letssnuggleforever = new Move("Let's Snuggle Forever");
		letssnuggleforever.setBP(190);
		letssnuggleforever.setZBP(0);
		letssnuggleforever.setCategory("Physical");
		letssnuggleforever.setType("Fairy");
		letssnuggleforever.setMakesContact(true);
		letssnuggleforever.setSignatureZ(true);
		movedex.put("Let's Snuggle Forever", letssnuggleforever);

		Move lick = new Move("Lick");
		lick.setBP(30);
		lick.setZBP(100);
		lick.setCategory("Physical");
		lick.setType("Ghost");
		lick.setMakesContact(true);
		lick.setHasSecondaryEffect(true);
		movedex.put("Lick", lick);

		Move lightscreen = new Move("Light Screen");
		lightscreen.setBP(0);
		lightscreen.setZBP(0);
		lightscreen.setCategory("Status");
		lightscreen.setType("Psychic");
		movedex.put("Light Screen", lightscreen);

		Move lightthatburnsthesky = new Move("Light That Burns the Sky");
		lightthatburnsthesky.setBP(200);
		lightthatburnsthesky.setZBP(0);
		lightthatburnsthesky.setCategory("Special");
		lightthatburnsthesky.setType("Psychic");
		lightthatburnsthesky.setSignatureZ(true);
		lightthatburnsthesky.setIgnoresAbilities(true);
		movedex.put("Light That Burns the Sky", lightthatburnsthesky);

		Move lightofruin = new Move("Light of Ruin");
		lightofruin.setBP(140);
		lightofruin.setZBP(200);
		lightofruin.setCategory("Special");
		lightofruin.setType("Fairy");
		lightofruin.setHasRecoil(true);
		movedex.put("Light of Ruin", lightofruin);

		Move liquidation = new Move("Liquidation");
		liquidation.setBP(85);
		liquidation.setZBP(160);
		liquidation.setCategory("Physical");
		liquidation.setType("Water");
		liquidation.setMakesContact(true);
		liquidation.setHasSecondaryEffect(true);
		movedex.put("Liquidation", liquidation);

		Move lockon = new Move("Lock-On");
		lockon.setBP(0);
		lockon.setZBP(0);
		lockon.setCategory("Status");
		lockon.setType("Normal");
		movedex.put("Lock-On", lockon);

		Move lovelykiss = new Move("Lovely Kiss");
		lovelykiss.setBP(0);
		lovelykiss.setZBP(0);
		lovelykiss.setCategory("Status");
		lovelykiss.setType("Normal");
		movedex.put("Lovely Kiss", lovelykiss);

		Move lowkick = new Move("Low Kick");
		lowkick.setBP(0);
		lowkick.setZBP(160);
		lowkick.setCategory("Physical");
		lowkick.setType("Fighting");
		lowkick.setMakesContact(true);
		lowkick.setHasSpecialModifier(true);
		movedex.put("Low Kick", lowkick);

		Move lowsweep = new Move("Low Sweep");
		lowsweep.setBP(65);
		lowsweep.setZBP(120);
		lowsweep.setCategory("Physical");
		lowsweep.setType("Fighting");
		lowsweep.setMakesContact(true);
		lowsweep.setHasSecondaryEffect(true);
		movedex.put("Low Sweep", lowsweep);

		Move luckychant = new Move("Lucky Chant");
		luckychant.setBP(0);
		luckychant.setZBP(0);
		luckychant.setCategory("Status");
		luckychant.setType("Normal");
		movedex.put("Lucky Chant", luckychant);

		Move lunardance = new Move("Lunar Dance");
		lunardance.setBP(0);
		lunardance.setZBP(0);
		lunardance.setCategory("Status");
		lunardance.setType("Psychic");
		movedex.put("Lunar Dance", lunardance);

		Move lunge = new Move("Lunge");
		lunge.setBP(80);
		lunge.setZBP(160);
		lunge.setCategory("Physical");
		lunge.setType("Bug");
		lunge.setMakesContact(true);
		lunge.setHasSecondaryEffect(true);
		movedex.put("Lunge", lunge);

		Move lusterpurge = new Move("Luster Purge");
		lusterpurge.setBP(70);
		lusterpurge.setZBP(140);
		lusterpurge.setCategory("Special");
		lusterpurge.setType("Psychic");
		lusterpurge.setHasSecondaryEffect(true);
		movedex.put("Luster Purge", lusterpurge);

		Move machpunch = new Move("Mach Punch");
		machpunch.setBP(40);
		machpunch.setZBP(100);
		machpunch.setCategory("Physical");
		machpunch.setType("Fighting");
		machpunch.setMakesContact(true);
		machpunch.setPunch(true);
		movedex.put("Mach Punch", machpunch);

		Move magiccoat = new Move("Magic Coat");
		magiccoat.setBP(0);
		magiccoat.setZBP(0);
		magiccoat.setCategory("Status");
		magiccoat.setType("Psychic");
		movedex.put("Magic Coat", magiccoat);

		Move magicroom = new Move("Magic Room");
		magicroom.setBP(0);
		magicroom.setZBP(0);
		magicroom.setCategory("Status");
		magicroom.setType("Psychic");
		movedex.put("Magic Room", magicroom);

		Move magicalleaf = new Move("Magical Leaf");
		magicalleaf.setBP(60);
		magicalleaf.setZBP(120);
		magicalleaf.setCategory("Special");
		magicalleaf.setType("Grass");
		movedex.put("Magical Leaf", magicalleaf);

		Move magikarpsrevenge = new Move("Magikarp's Revenge");
		magikarpsrevenge.setBP(120);
		magikarpsrevenge.setZBP(190);
		magikarpsrevenge.setCategory("Physical");
		magikarpsrevenge.setType("Water");
		magikarpsrevenge.setMakesContact(true);
		magikarpsrevenge.setHasSecondaryEffect(true);
		movedex.put("Magikarp's Revenge", magikarpsrevenge);

		Move magmastorm = new Move("Magma Storm");
		magmastorm.setBP(100);
		magmastorm.setZBP(180);
		magmastorm.setCategory("Special");
		magmastorm.setType("Fire");
		movedex.put("Magma Storm", magmastorm);

		Move magnetbomb = new Move("Magnet Bomb");
		magnetbomb.setBP(60);
		magnetbomb.setZBP(120);
		magnetbomb.setCategory("Physical");
		magnetbomb.setType("Steel");
		magnetbomb.setBullet(true);
		movedex.put("Magnet Bomb", magnetbomb);

		Move magnetrise = new Move("Magnet Rise");
		magnetrise.setBP(0);
		magnetrise.setZBP(0);
		magnetrise.setCategory("Status");
		magnetrise.setType("Electric");
		movedex.put("Magnet Rise", magnetrise);

		Move magneticflux = new Move("Magnetic Flux");
		magneticflux.setBP(0);
		magneticflux.setZBP(0);
		magneticflux.setCategory("Status");
		magneticflux.setType("Electric");
		movedex.put("Magnetic Flux", magneticflux);

		Move magnitude = new Move("Magnitude");
		magnitude.setBP(0);
		magnitude.setZBP(140);
		magnitude.setCategory("Physical");
		magnitude.setType("Ground");
		magnitude.setSpread(true);
		movedex.put("Magnitude", magnitude);

		Move maliciousmoonsault = new Move("Malicious Moonsault");
		maliciousmoonsault.setBP(180);
		maliciousmoonsault.setZBP(0);
		maliciousmoonsault.setCategory("Physical");
		maliciousmoonsault.setType("Dark");
		maliciousmoonsault.setMakesContact(true);
		maliciousmoonsault.setSignatureZ(true);
		maliciousmoonsault.setHasSpecialModifier(true);
		movedex.put("Malicious Moonsault", maliciousmoonsault);

		Move matblock = new Move("Mat Block");
		matblock.setBP(0);
		matblock.setZBP(0);
		matblock.setCategory("Status");
		matblock.setType("Fighting");
		movedex.put("Mat Block", matblock);

		Move mefirst = new Move("Me First");
		mefirst.setBP(0);
		mefirst.setZBP(0);
		mefirst.setCategory("Status");
		mefirst.setType("Normal");
		movedex.put("Me First", mefirst);

		Move meanlook = new Move("Mean Look");
		meanlook.setBP(0);
		meanlook.setZBP(0);
		meanlook.setCategory("Status");
		meanlook.setType("Normal");
		movedex.put("Mean Look", meanlook);

		Move meditate = new Move("Meditate");
		meditate.setBP(0);
		meditate.setZBP(0);
		meditate.setCategory("Status");
		meditate.setType("Psychic");
		movedex.put("Meditate", meditate);

		Move megadrain = new Move("Mega Drain");
		megadrain.setBP(40);
		megadrain.setZBP(120);
		megadrain.setCategory("Special");
		megadrain.setType("Grass");
		movedex.put("Mega Drain", megadrain);

		Move megakick = new Move("Mega Kick");
		megakick.setBP(120);
		megakick.setZBP(190);
		megakick.setCategory("Physical");
		megakick.setType("Normal");
		megakick.setMakesContact(true);
		movedex.put("Mega Kick", megakick);

		Move megapunch = new Move("Mega Punch");
		megapunch.setBP(80);
		megapunch.setZBP(160);
		megapunch.setCategory("Physical");
		megapunch.setType("Normal");
		megapunch.setMakesContact(true);
		megapunch.setPunch(true);
		movedex.put("Mega Punch", megapunch);

		Move megahorn = new Move("Megahorn");
		megahorn.setBP(120);
		megahorn.setZBP(190);
		megahorn.setCategory("Physical");
		megahorn.setType("Bug");
		megahorn.setMakesContact(true);
		movedex.put("Megahorn", megahorn);

		Move memento = new Move("Memento");
		memento.setBP(0);
		memento.setZBP(0);
		memento.setCategory("Status");
		memento.setType("Dark");
		movedex.put("Memento", memento);

		Move menacingmoonrazemaelstrom = new Move("Menacing Moonraze Maelstrom");
		menacingmoonrazemaelstrom.setBP(200);
		menacingmoonrazemaelstrom.setZBP(0);
		menacingmoonrazemaelstrom.setCategory("Special");
		menacingmoonrazemaelstrom.setType("Ghost");
		menacingmoonrazemaelstrom.setSignatureZ(true);
		menacingmoonrazemaelstrom.setIgnoresAbilities(true);
		movedex.put("Menacing Moonraze Maelstrom", menacingmoonrazemaelstrom);

		Move metalburst = new Move("Metal Burst");
		metalburst.setBP(0);
		metalburst.setZBP(100);
		metalburst.setCategory("Physical");
		metalburst.setType("Steel");
		movedex.put("Metal Burst", metalburst);

		Move metalclaw = new Move("Metal Claw");
		metalclaw.setBP(50);
		metalclaw.setZBP(100);
		metalclaw.setCategory("Physical");
		metalclaw.setType("Steel");
		metalclaw.setMakesContact(true);
		metalclaw.setHasSecondaryEffect(true);
		movedex.put("Metal Claw", metalclaw);

		Move metalsound = new Move("Metal Sound");
		metalsound.setBP(0);
		metalsound.setZBP(0);
		metalsound.setCategory("Status");
		metalsound.setType("Steel");
		metalsound.setSound(true);
		movedex.put("Metal Sound", metalsound);

		Move meteormash = new Move("Meteor Mash");
		meteormash.setBP(90);
		meteormash.setZBP(175);
		meteormash.setCategory("Physical");
		meteormash.setType("Steel");
		meteormash.setMakesContact(true);
		meteormash.setHasSecondaryEffect(true);
		meteormash.setPunch(true);
		movedex.put("Meteor Mash", meteormash);

		Move metronome = new Move("Metronome");
		metronome.setBP(0);
		metronome.setZBP(0);
		metronome.setCategory("Status");
		metronome.setType("Normal");
		movedex.put("Metronome", metronome);

		Move milkdrink = new Move("Milk Drink");
		milkdrink.setBP(0);
		milkdrink.setZBP(0);
		milkdrink.setCategory("Status");
		milkdrink.setType("Normal");
		movedex.put("Milk Drink", milkdrink);

		Move mimic = new Move("Mimic");
		mimic.setBP(0);
		mimic.setZBP(0);
		mimic.setCategory("Status");
		mimic.setType("Normal");
		movedex.put("Mimic", mimic);

		Move mindblown = new Move("Mind Blown");
		mindblown.setBP(150);
		mindblown.setZBP(200);
		mindblown.setCategory("Special");
		mindblown.setType("Fire");
		mindblown.setSpread(true);
		movedex.put("Mind Blown", mindblown);

		Move mindreader = new Move("Mind Reader");
		mindreader.setBP(0);
		mindreader.setZBP(0);
		mindreader.setCategory("Status");
		mindreader.setType("Normal");
		movedex.put("Mind Reader", mindreader);

		Move minimize = new Move("Minimize");
		minimize.setBP(0);
		minimize.setZBP(0);
		minimize.setCategory("Status");
		minimize.setType("Normal");
		movedex.put("Minimize", minimize);

		Move miracleeye = new Move("Miracle Eye");
		miracleeye.setBP(0);
		miracleeye.setZBP(0);
		miracleeye.setCategory("Status");
		miracleeye.setType("Psychic");
		movedex.put("Miracle Eye", miracleeye);

		Move mirrorcoat = new Move("Mirror Coat");
		mirrorcoat.setBP(0);
		mirrorcoat.setZBP(100);
		mirrorcoat.setCategory("Special");
		mirrorcoat.setType("Psychic");
		movedex.put("Mirror Coat", mirrorcoat);

		Move mirrormove = new Move("Mirror Move");
		mirrormove.setBP(0);
		mirrormove.setZBP(0);
		mirrormove.setCategory("Status");
		mirrormove.setType("Flying");
		movedex.put("Mirror Move", mirrormove);

		Move mirrorshot = new Move("Mirror Shot");
		mirrorshot.setBP(65);
		mirrorshot.setZBP(120);
		mirrorshot.setCategory("Special");
		mirrorshot.setType("Steel");
		mirrorshot.setHasSecondaryEffect(true);
		movedex.put("Mirror Shot", mirrorshot);

		Move mist = new Move("Mist");
		mist.setBP(0);
		mist.setZBP(0);
		mist.setCategory("Status");
		mist.setType("Ice");
		movedex.put("Mist", mist);

		Move mistball = new Move("Mist Ball");
		mistball.setBP(70);
		mistball.setZBP(140);
		mistball.setCategory("Special");
		mistball.setType("Psychic");
		mistball.setHasSecondaryEffect(true);
		mistball.setBullet(true);
		movedex.put("Mist Ball", mistball);

		Move mistyterrain = new Move("Misty Terrain");
		mistyterrain.setBP(0);
		mistyterrain.setZBP(0);
		mistyterrain.setCategory("Status");
		mistyterrain.setType("Fairy");
		movedex.put("Misty Terrain", mistyterrain);

		Move moonblast = new Move("Moonblast");
		moonblast.setBP(95);
		moonblast.setZBP(175);
		moonblast.setCategory("Special");
		moonblast.setType("Fairy");
		moonblast.setHasSecondaryEffect(true);
		movedex.put("Moonblast", moonblast);

		Move moongeistbeam = new Move("Moongeist Beam");
		moongeistbeam.setBP(100);
		moongeistbeam.setZBP(180);
		moongeistbeam.setCategory("Special");
		moongeistbeam.setType("Ghost");
		moongeistbeam.setIgnoresAbilities(true);
		movedex.put("Moongeist Beam", moongeistbeam);

		Move moonlight = new Move("Moonlight");
		moonlight.setBP(0);
		moonlight.setZBP(0);
		moonlight.setCategory("Status");
		moonlight.setType("Fairy");
		movedex.put("Moonlight", moonlight);

		Move morningsun = new Move("Morning Sun");
		morningsun.setBP(0);
		morningsun.setZBP(0);
		morningsun.setCategory("Status");
		morningsun.setType("Normal");
		movedex.put("Morning Sun", morningsun);

		Move mudbomb = new Move("Mud Bomb");
		mudbomb.setBP(65);
		mudbomb.setZBP(120);
		mudbomb.setCategory("Special");
		mudbomb.setType("Ground");
		mudbomb.setHasSecondaryEffect(true);
		mudbomb.setBullet(true);
		movedex.put("Mud Bomb", mudbomb);

		Move mudshot = new Move("Mud Shot");
		mudshot.setBP(55);
		mudshot.setZBP(100);
		mudshot.setCategory("Special");
		mudshot.setType("Ground");
		mudshot.setHasSecondaryEffect(true);
		movedex.put("Mud Shot", mudshot);

		Move mudsport = new Move("Mud Sport");
		mudsport.setBP(0);
		mudsport.setZBP(0);
		mudsport.setCategory("Status");
		mudsport.setType("Ground");
		movedex.put("Mud Sport", mudsport);

		Move mudslap = new Move("Mud-Slap");
		mudslap.setBP(20);
		mudslap.setZBP(100);
		mudslap.setCategory("Special");
		mudslap.setType("Ground");
		mudslap.setHasSecondaryEffect(true);
		movedex.put("Mud-Slap", mudslap);

		Move muddywater = new Move("Muddy Water");
		muddywater.setBP(90);
		muddywater.setZBP(175);
		muddywater.setCategory("Special");
		muddywater.setType("Water");
		muddywater.setSpread(true);
		muddywater.setHasSecondaryEffect(true);
		movedex.put("Muddy Water", muddywater);

		Move multiattack = new Move("Multi-Attack");
		multiattack.setBP(90);
		multiattack.setZBP(185);
		multiattack.setCategory("Physical");
		multiattack.setType("Normal");
		multiattack.setMakesContact(true);
		movedex.put("Multi-Attack", multiattack);

		Move mysticalfire = new Move("Mystical Fire");
		mysticalfire.setBP(75);
		mysticalfire.setZBP(140);
		mysticalfire.setCategory("Special");
		mysticalfire.setType("Fire");
		mysticalfire.setHasSecondaryEffect(true);
		movedex.put("Mystical Fire", mysticalfire);

		Move nastyplot = new Move("Nasty Plot");
		nastyplot.setBP(0);
		nastyplot.setZBP(0);
		nastyplot.setCategory("Status");
		nastyplot.setType("Dark");
		movedex.put("Nasty Plot", nastyplot);

		Move naturalgift = new Move("Natural Gift");
		naturalgift.setBP(0);
		naturalgift.setZBP(160);
		naturalgift.setCategory("Physical");
		naturalgift.setType("Normal");
		movedex.put("Natural Gift", naturalgift);

		Move naturepower = new Move("Nature Power");
		naturepower.setBP(0);
		naturepower.setZBP(0);
		naturepower.setCategory("Status");
		naturepower.setType("Normal");
		movedex.put("Nature Power", naturepower);

		Move naturesmadness = new Move("Nature's Madness");
		naturesmadness.setBP(0);
		naturesmadness.setZBP(100);
		naturesmadness.setCategory("Special");
		naturesmadness.setType("Fairy");
		movedex.put("Nature's Madness", naturesmadness);

		Move needlearm = new Move("Needle Arm");
		needlearm.setBP(60);
		needlearm.setZBP(120);
		needlearm.setCategory("Physical");
		needlearm.setType("Grass");
		needlearm.setMakesContact(true);
		needlearm.setHasSecondaryEffect(true);
		movedex.put("Needle Arm", needlearm);

		Move neverendingnightmare = new Move("Never-Ending Nightmare");
		neverendingnightmare.setBP(1);
		neverendingnightmare.setZBP(0);
		neverendingnightmare.setCategory("Physical");
		neverendingnightmare.setType("Ghost");
		movedex.put("Never-Ending Nightmare", neverendingnightmare);

		Move nightdaze = new Move("Night Daze");
		nightdaze.setBP(85);
		nightdaze.setZBP(160);
		nightdaze.setCategory("Special");
		nightdaze.setType("Dark");
		nightdaze.setHasSecondaryEffect(true);
		movedex.put("Night Daze", nightdaze);

		Move nightshade = new Move("Night Shade");
		nightshade.setBP(0);
		nightshade.setZBP(100);
		nightshade.setCategory("Special");
		nightshade.setType("Ghost");
		movedex.put("Night Shade", nightshade);

		Move nightslash = new Move("Night Slash");
		nightslash.setBP(70);
		nightslash.setZBP(140);
		nightslash.setCategory("Physical");
		nightslash.setType("Dark");
		nightslash.setMakesContact(true);
		movedex.put("Night Slash", nightslash);

		Move nightmare = new Move("Nightmare");
		nightmare.setBP(0);
		nightmare.setZBP(0);
		nightmare.setCategory("Status");
		nightmare.setType("Ghost");
		movedex.put("Nightmare", nightmare);

		Move nobleroar = new Move("Noble Roar");
		nobleroar.setBP(0);
		nobleroar.setZBP(0);
		nobleroar.setCategory("Status");
		nobleroar.setType("Normal");
		nobleroar.setSound(true);
		movedex.put("Noble Roar", nobleroar);

		Move nuzzle = new Move("Nuzzle");
		nuzzle.setBP(20);
		nuzzle.setZBP(100);
		nuzzle.setCategory("Physical");
		nuzzle.setType("Electric");
		nuzzle.setMakesContact(true);
		nuzzle.setHasSecondaryEffect(true);
		movedex.put("Nuzzle", nuzzle);

		Move oblivionwing = new Move("Oblivion Wing");
		oblivionwing.setBP(80);
		oblivionwing.setZBP(160);
		oblivionwing.setCategory("Special");
		oblivionwing.setType("Flying");
		movedex.put("Oblivion Wing", oblivionwing);

		Move oceanicoperetta = new Move("Oceanic Operetta");
		oceanicoperetta.setBP(195);
		oceanicoperetta.setZBP(0);
		oceanicoperetta.setCategory("Special");
		oceanicoperetta.setType("Water");
		oceanicoperetta.setSignatureZ(true);
		movedex.put("Oceanic Operetta", oceanicoperetta);

		Move octazooka = new Move("Octazooka");
		octazooka.setBP(65);
		octazooka.setZBP(120);
		octazooka.setCategory("Special");
		octazooka.setType("Water");
		octazooka.setHasSecondaryEffect(true);
		octazooka.setBullet(true);
		movedex.put("Octazooka", octazooka);

		Move odorsleuth = new Move("Odor Sleuth");
		odorsleuth.setBP(0);
		odorsleuth.setZBP(0);
		odorsleuth.setCategory("Status");
		odorsleuth.setType("Normal");
		movedex.put("Odor Sleuth", odorsleuth);

		Move ominouswind = new Move("Ominous Wind");
		ominouswind.setBP(60);
		ominouswind.setZBP(120);
		ominouswind.setCategory("Special");
		ominouswind.setType("Ghost");
		ominouswind.setHasSecondaryEffect(true);
		movedex.put("Ominous Wind", ominouswind);

		Move originpulse = new Move("Origin Pulse");
		originpulse.setBP(110);
		originpulse.setZBP(185);
		originpulse.setCategory("Special");
		originpulse.setType("Water");
		originpulse.setSpread(true);
		originpulse.setHasSecondaryEffect(true);
		movedex.put("Origin Pulse", originpulse);

		Move outrage = new Move("Outrage");
		outrage.setBP(120);
		outrage.setZBP(190);
		outrage.setCategory("Physical");
		outrage.setType("Dragon");
		outrage.setMakesContact(true);
		movedex.put("Outrage", outrage);

		Move overheat = new Move("Overheat");
		overheat.setBP(130);
		overheat.setZBP(195);
		overheat.setCategory("Special");
		overheat.setType("Fire");
		movedex.put("Overheat", overheat);

		Move painsplit = new Move("Pain Split");
		painsplit.setBP(0);
		painsplit.setZBP(0);
		painsplit.setCategory("Status");
		painsplit.setType("Normal");
		movedex.put("Pain Split", painsplit);

		Move paleowave = new Move("Paleo Wave");
		paleowave.setBP(85);
		paleowave.setZBP(160);
		paleowave.setCategory("Special");
		paleowave.setType("Rock");
		paleowave.setHasSecondaryEffect(true);
		movedex.put("Paleo Wave", paleowave);

		Move paraboliccharge = new Move("Parabolic Charge");
		paraboliccharge.setBP(65);
		paraboliccharge.setZBP(120);
		paraboliccharge.setCategory("Special");
		paraboliccharge.setType("Electric");
		paraboliccharge.setSpread(true);
		movedex.put("Parabolic Charge", paraboliccharge);

		Move partingshot = new Move("Parting Shot");
		partingshot.setBP(0);
		partingshot.setZBP(0);
		partingshot.setCategory("Status");
		partingshot.setType("Dark");
		partingshot.setSound(true);
		movedex.put("Parting Shot", partingshot);

		Move payday = new Move("Pay Day");
		payday.setBP(40);
		payday.setZBP(100);
		payday.setCategory("Physical");
		payday.setType("Normal");
		movedex.put("Pay Day", payday);

		Move payback = new Move("Payback");
		payback.setBP(50);
		payback.setZBP(100);
		payback.setCategory("Physical");
		payback.setType("Dark");
		payback.setMakesContact(true);
		payback.setHasSpecialModifier(true);
		movedex.put("Payback", payback);

		Move peck = new Move("Peck");
		peck.setBP(35);
		peck.setZBP(100);
		peck.setCategory("Physical");
		peck.setType("Flying");
		peck.setMakesContact(true);
		movedex.put("Peck", peck);

		Move perishsong = new Move("Perish Song");
		perishsong.setBP(0);
		perishsong.setZBP(0);
		perishsong.setCategory("Status");
		perishsong.setType("Normal");
		perishsong.setSound(true);
		movedex.put("Perish Song", perishsong);

		Move petalblizzard = new Move("Petal Blizzard");
		petalblizzard.setBP(90);
		petalblizzard.setZBP(175);
		petalblizzard.setCategory("Physical");
		petalblizzard.setType("Grass");
		petalblizzard.setSpread(true);
		movedex.put("Petal Blizzard", petalblizzard);

		Move petaldance = new Move("Petal Dance");
		petaldance.setBP(120);
		petaldance.setZBP(190);
		petaldance.setCategory("Special");
		petaldance.setType("Grass");
		petaldance.setMakesContact(true);
		movedex.put("Petal Dance", petaldance);

		Move phantomforce = new Move("Phantom Force");
		phantomforce.setBP(90);
		phantomforce.setZBP(175);
		phantomforce.setCategory("Physical");
		phantomforce.setType("Ghost");
		phantomforce.setMakesContact(true);
		movedex.put("Phantom Force", phantomforce);

		Move photongeyser = new Move("Photon Geyser");
		photongeyser.setBP(100);
		photongeyser.setZBP(180);
		photongeyser.setCategory("Special");
		photongeyser.setType("Psychic");
		photongeyser.setIgnoresAbilities(true);
		movedex.put("Photon Geyser", photongeyser);

		Move pinmissile = new Move("Pin Missile");
		pinmissile.setBP(25);
		pinmissile.setZBP(140);
		pinmissile.setCategory("Physical");
		pinmissile.setType("Bug");
		pinmissile.setMultiHit(true);
		movedex.put("Pin Missile", pinmissile);

		Move plasmafists = new Move("Plasma Fists");
		plasmafists.setBP(100);
		plasmafists.setZBP(180);
		plasmafists.setCategory("Physical");
		plasmafists.setType("Electric");
		plasmafists.setMakesContact(true);
		plasmafists.setPunch(true);
		movedex.put("Plasma Fists", plasmafists);

		Move playnice = new Move("Play Nice");
		playnice.setBP(0);
		playnice.setZBP(0);
		playnice.setCategory("Status");
		playnice.setType("Normal");
		movedex.put("Play Nice", playnice);

		Move playrough = new Move("Play Rough");
		playrough.setBP(90);
		playrough.setZBP(175);
		playrough.setCategory("Physical");
		playrough.setType("Fairy");
		playrough.setMakesContact(true);
		playrough.setHasSecondaryEffect(true);
		movedex.put("Play Rough", playrough);

		Move pluck = new Move("Pluck");
		pluck.setBP(60);
		pluck.setZBP(120);
		pluck.setCategory("Physical");
		pluck.setType("Flying");
		pluck.setMakesContact(true);
		movedex.put("Pluck", pluck);

		Move poisonfang = new Move("Poison Fang");
		poisonfang.setBP(50);
		poisonfang.setZBP(100);
		poisonfang.setCategory("Physical");
		poisonfang.setType("Poison");
		poisonfang.setMakesContact(true);
		poisonfang.setHasSecondaryEffect(true);
		poisonfang.setBite(true);
		movedex.put("Poison Fang", poisonfang);

		Move poisongas = new Move("Poison Gas");
		poisongas.setBP(0);
		poisongas.setZBP(0);
		poisongas.setCategory("Status");
		poisongas.setType("Poison");
		poisongas.setSpread(true);
		movedex.put("Poison Gas", poisongas);

		Move poisonjab = new Move("Poison Jab");
		poisonjab.setBP(80);
		poisonjab.setZBP(160);
		poisonjab.setCategory("Physical");
		poisonjab.setType("Poison");
		poisonjab.setMakesContact(true);
		poisonjab.setHasSecondaryEffect(true);
		movedex.put("Poison Jab", poisonjab);

		Move poisonpowder = new Move("Poison Powder");
		poisonpowder.setBP(0);
		poisonpowder.setZBP(0);
		poisonpowder.setCategory("Status");
		poisonpowder.setType("Poison");
		movedex.put("Poison Powder", poisonpowder);

		Move poisonsting = new Move("Poison Sting");
		poisonsting.setBP(15);
		poisonsting.setZBP(100);
		poisonsting.setCategory("Physical");
		poisonsting.setType("Poison");
		poisonsting.setHasSecondaryEffect(true);
		movedex.put("Poison Sting", poisonsting);

		Move poisontail = new Move("Poison Tail");
		poisontail.setBP(50);
		poisontail.setZBP(100);
		poisontail.setCategory("Physical");
		poisontail.setType("Poison");
		poisontail.setMakesContact(true);
		poisontail.setHasSecondaryEffect(true);
		movedex.put("Poison Tail", poisontail);

		Move pollenpuff = new Move("Pollen Puff");
		pollenpuff.setBP(90);
		pollenpuff.setZBP(175);
		pollenpuff.setCategory("Special");
		pollenpuff.setType("Bug");
		pollenpuff.setBullet(true);
		movedex.put("Pollen Puff", pollenpuff);

		Move pound = new Move("Pound");
		pound.setBP(40);
		pound.setZBP(100);
		pound.setCategory("Physical");
		pound.setType("Normal");
		pound.setMakesContact(true);
		movedex.put("Pound", pound);

		Move powder = new Move("Powder");
		powder.setBP(0);
		powder.setZBP(0);
		powder.setCategory("Status");
		powder.setType("Bug");
		movedex.put("Powder", powder);

		Move powdersnow = new Move("Powder Snow");
		powdersnow.setBP(40);
		powdersnow.setZBP(100);
		powdersnow.setCategory("Special");
		powdersnow.setType("Ice");
		powdersnow.setSpread(true);
		powdersnow.setHasSecondaryEffect(true);
		movedex.put("Powder Snow", powdersnow);

		Move powergem = new Move("Power Gem");
		powergem.setBP(80);
		powergem.setZBP(160);
		powergem.setCategory("Special");
		powergem.setType("Rock");
		movedex.put("Power Gem", powergem);

		Move powersplit = new Move("Power Split");
		powersplit.setBP(0);
		powersplit.setZBP(0);
		powersplit.setCategory("Status");
		powersplit.setType("Psychic");
		movedex.put("Power Split", powersplit);

		Move powerswap = new Move("Power Swap");
		powerswap.setBP(0);
		powerswap.setZBP(0);
		powerswap.setCategory("Status");
		powerswap.setType("Psychic");
		movedex.put("Power Swap", powerswap);

		Move powertrick = new Move("Power Trick");
		powertrick.setBP(0);
		powertrick.setZBP(0);
		powertrick.setCategory("Status");
		powertrick.setType("Psychic");
		movedex.put("Power Trick", powertrick);

		Move powertrip = new Move("Power Trip");
		powertrip.setBP(20);
		powertrip.setZBP(160);
		powertrip.setCategory("Physical");
		powertrip.setType("Dark");
		powertrip.setMakesContact(true);
		powertrip.setHasSpecialModifier(true);
		movedex.put("Power Trip", powertrip);

		Move powerwhip = new Move("Power Whip");
		powerwhip.setBP(120);
		powerwhip.setZBP(190);
		powerwhip.setCategory("Physical");
		powerwhip.setType("Grass");
		powerwhip.setMakesContact(true);
		movedex.put("Power Whip", powerwhip);

		Move poweruppunch = new Move("Power-Up Punch");
		poweruppunch.setBP(40);
		poweruppunch.setZBP(100);
		poweruppunch.setCategory("Physical");
		poweruppunch.setType("Fighting");
		poweruppunch.setMakesContact(true);
		poweruppunch.setHasSecondaryEffect(true);
		poweruppunch.setPunch(true);
		movedex.put("Power-Up Punch", poweruppunch);

		Move precipiceblades = new Move("Precipice Blades");
		precipiceblades.setBP(120);
		precipiceblades.setZBP(190);
		precipiceblades.setCategory("Physical");
		precipiceblades.setType("Ground");
		precipiceblades.setSpread(true);
		precipiceblades.setHasSecondaryEffect(true);
		movedex.put("Precipice Blades", precipiceblades);

		Move present = new Move("Present");
		present.setBP(0);
		present.setZBP(100);
		present.setCategory("Physical");
		present.setType("Normal");
		movedex.put("Present", present);

		Move prismaticlaser = new Move("Prismatic Laser");
		prismaticlaser.setBP(160);
		prismaticlaser.setZBP(200);
		prismaticlaser.setCategory("Special");
		prismaticlaser.setType("Psychic");
		movedex.put("Prismatic Laser", prismaticlaser);

		Move protect = new Move("Protect");
		protect.setBP(0);
		protect.setZBP(0);
		protect.setCategory("Status");
		protect.setType("Normal");
		movedex.put("Protect", protect);

		Move psybeam = new Move("Psybeam");
		psybeam.setBP(65);
		psybeam.setZBP(120);
		psybeam.setCategory("Special");
		psybeam.setType("Psychic");
		psybeam.setHasSecondaryEffect(true);
		movedex.put("Psybeam", psybeam);

		Move psychup = new Move("Psych Up");
		psychup.setBP(0);
		psychup.setZBP(0);
		psychup.setCategory("Status");
		psychup.setType("Normal");
		movedex.put("Psych Up", psychup);

		Move psychic = new Move("Psychic");
		psychic.setBP(90);
		psychic.setZBP(175);
		psychic.setCategory("Special");
		psychic.setType("Psychic");
		psychic.setHasSecondaryEffect(true);
		movedex.put("Psychic", psychic);

		Move psychicfangs = new Move("Psychic Fangs");
		psychicfangs.setBP(85);
		psychicfangs.setZBP(160);
		psychicfangs.setCategory("Physical");
		psychicfangs.setType("Psychic");
		psychicfangs.setMakesContact(true);
		psychicfangs.setBite(true);
		movedex.put("Psychic Fangs", psychicfangs);

		Move psychicterrain = new Move("Psychic Terrain");
		psychicterrain.setBP(0);
		psychicterrain.setZBP(0);
		psychicterrain.setCategory("Status");
		psychicterrain.setType("Psychic");
		movedex.put("Psychic Terrain", psychicterrain);

		Move psychoboost = new Move("Psycho Boost");
		psychoboost.setBP(140);
		psychoboost.setZBP(200);
		psychoboost.setCategory("Special");
		psychoboost.setType("Psychic");
		movedex.put("Psycho Boost", psychoboost);

		Move psychocut = new Move("Psycho Cut");
		psychocut.setBP(70);
		psychocut.setZBP(140);
		psychocut.setCategory("Physical");
		psychocut.setType("Psychic");
		movedex.put("Psycho Cut", psychocut);

		Move psychoshift = new Move("Psycho Shift");
		psychoshift.setBP(0);
		psychoshift.setZBP(0);
		psychoshift.setCategory("Status");
		psychoshift.setType("Psychic");
		movedex.put("Psycho Shift", psychoshift);

		Move psyshock = new Move("Psyshock");
		psyshock.setBP(80);
		psyshock.setZBP(160);
		psyshock.setCategory("Psyshock effect");
		psyshock.setType("Psychic");
		movedex.put("Psyshock", psyshock);

		Move psystrike = new Move("Psystrike");
		psystrike.setBP(100);
		psystrike.setZBP(180);
		psystrike.setCategory("Psyshock effect");
		psystrike.setType("Psychic");
		movedex.put("Psystrike", psystrike);

		Move psywave = new Move("Psywave");
		psywave.setBP(0);
		psywave.setZBP(100);
		psywave.setCategory("Special");
		psywave.setType("Psychic");
		movedex.put("Psywave", psywave);

		Move pulverizingpancake = new Move("Pulverizing Pancake");
		pulverizingpancake.setBP(210);
		pulverizingpancake.setZBP(0);
		pulverizingpancake.setCategory("Physical");
		pulverizingpancake.setType("Normal");
		pulverizingpancake.setMakesContact(true);
		pulverizingpancake.setSignatureZ(true);
		movedex.put("Pulverizing Pancake", pulverizingpancake);

		Move punishment = new Move("Punishment");
		punishment.setBP(0);
		punishment.setZBP(160);
		punishment.setCategory("Physical");
		punishment.setType("Dark");
		punishment.setMakesContact(true);
		punishment.setHasSpecialModifier(true);
		movedex.put("Punishment", punishment);

		Move purify = new Move("Purify");
		purify.setBP(0);
		purify.setZBP(0);
		purify.setCategory("Status");
		purify.setType("Poison");
		movedex.put("Purify", purify);

		Move pursuit = new Move("Pursuit");
		pursuit.setBP(40);
		pursuit.setZBP(100);
		pursuit.setCategory("Physical");
		pursuit.setType("Dark");
		pursuit.setMakesContact(true);
		pursuit.setHasSpecialModifier(true);
		movedex.put("Pursuit", pursuit);

		Move quash = new Move("Quash");
		quash.setBP(0);
		quash.setZBP(0);
		quash.setCategory("Status");
		quash.setType("Dark");
		movedex.put("Quash", quash);

		Move quickattack = new Move("Quick Attack");
		quickattack.setBP(40);
		quickattack.setZBP(100);
		quickattack.setCategory("Physical");
		quickattack.setType("Normal");
		quickattack.setMakesContact(true);
		movedex.put("Quick Attack", quickattack);

		Move quickguard = new Move("Quick Guard");
		quickguard.setBP(0);
		quickguard.setZBP(0);
		quickguard.setCategory("Status");
		quickguard.setType("Fighting");
		movedex.put("Quick Guard", quickguard);

		Move quiverdance = new Move("Quiver Dance");
		quiverdance.setBP(0);
		quiverdance.setZBP(0);
		quiverdance.setCategory("Status");
		quiverdance.setType("Bug");
		movedex.put("Quiver Dance", quiverdance);

		Move rage = new Move("Rage");
		rage.setBP(20);
		rage.setZBP(100);
		rage.setCategory("Physical");
		rage.setType("Normal");
		rage.setMakesContact(true);
		movedex.put("Rage", rage);

		Move ragepowder = new Move("Rage Powder");
		ragepowder.setBP(0);
		ragepowder.setZBP(0);
		ragepowder.setCategory("Status");
		ragepowder.setType("Bug");
		movedex.put("Rage Powder", ragepowder);

		Move raindance = new Move("Rain Dance");
		raindance.setBP(0);
		raindance.setZBP(0);
		raindance.setCategory("Status");
		raindance.setType("Water");
		movedex.put("Rain Dance", raindance);

		Move rapidspin = new Move("Rapid Spin");
		rapidspin.setBP(20);
		rapidspin.setZBP(100);
		rapidspin.setCategory("Physical");
		rapidspin.setType("Normal");
		rapidspin.setMakesContact(true);
		movedex.put("Rapid Spin", rapidspin);

		Move razorleaf = new Move("Razor Leaf");
		razorleaf.setBP(55);
		razorleaf.setZBP(100);
		razorleaf.setCategory("Physical");
		razorleaf.setType("Grass");
		razorleaf.setSpread(true);
		movedex.put("Razor Leaf", razorleaf);

		Move razorshell = new Move("Razor Shell");
		razorshell.setBP(75);
		razorshell.setZBP(140);
		razorshell.setCategory("Physical");
		razorshell.setType("Water");
		razorshell.setMakesContact(true);
		razorshell.setHasSecondaryEffect(true);
		movedex.put("Razor Shell", razorshell);

		Move razorwind = new Move("Razor Wind");
		razorwind.setBP(80);
		razorwind.setZBP(160);
		razorwind.setCategory("Special");
		razorwind.setType("Normal");
		razorwind.setSpread(true);
		movedex.put("Razor Wind", razorwind);

		Move recover = new Move("Recover");
		recover.setBP(0);
		recover.setZBP(0);
		recover.setCategory("Status");
		recover.setType("Normal");
		movedex.put("Recover", recover);

		Move recycle = new Move("Recycle");
		recycle.setBP(0);
		recycle.setZBP(0);
		recycle.setCategory("Status");
		recycle.setType("Normal");
		movedex.put("Recycle", recycle);

		Move reflect = new Move("Reflect");
		reflect.setBP(0);
		reflect.setZBP(0);
		reflect.setCategory("Status");
		reflect.setType("Psychic");
		movedex.put("Reflect", reflect);

		Move reflecttype = new Move("Reflect Type");
		reflecttype.setBP(0);
		reflecttype.setZBP(0);
		reflecttype.setCategory("Status");
		reflecttype.setType("Normal");
		movedex.put("Reflect Type", reflecttype);

		Move refresh = new Move("Refresh");
		refresh.setBP(0);
		refresh.setZBP(0);
		refresh.setCategory("Status");
		refresh.setType("Normal");
		movedex.put("Refresh", refresh);

		Move relicsong = new Move("Relic Song");
		relicsong.setBP(75);
		relicsong.setZBP(140);
		relicsong.setCategory("Special");
		relicsong.setType("Normal");
		relicsong.setSpread(true);
		relicsong.setHasSecondaryEffect(true);
		relicsong.setSound(true);
		movedex.put("Relic Song", relicsong);

		Move rest = new Move("Rest");
		rest.setBP(0);
		rest.setZBP(0);
		rest.setCategory("Status");
		rest.setType("Psychic");
		movedex.put("Rest", rest);

		Move retaliate = new Move("Retaliate");
		retaliate.setBP(70);
		retaliate.setZBP(140);
		retaliate.setCategory("Physical");
		retaliate.setType("Normal");
		retaliate.setMakesContact(true);
		movedex.put("Retaliate", retaliate);

		Move returnMove = new Move("Return");
		returnMove.setBP(102);
		returnMove.setZBP(160);
		returnMove.setCategory("Physical");
		returnMove.setType("Normal");
		returnMove.setMakesContact(true);
		movedex.put("Return", returnMove);

		Move revelationdance = new Move("Revelation Dance");
		revelationdance.setBP(90);
		revelationdance.setZBP(175);
		revelationdance.setCategory("Special");
		revelationdance.setType("Normal");
		movedex.put("Revelation Dance", revelationdance);

		Move revenge = new Move("Revenge");
		revenge.setBP(60);
		revenge.setZBP(120);
		revenge.setCategory("Physical");
		revenge.setType("Fighting");
		revenge.setMakesContact(true);
		revenge.setHasSpecialModifier(true);
		movedex.put("Revenge", revenge);

		Move reversal = new Move("Reversal");
		reversal.setBP(0);
		reversal.setZBP(160);
		reversal.setCategory("Physical");
		reversal.setType("Fighting");
		reversal.setMakesContact(true);
		reversal.setHasSpecialModifier(true);
		movedex.put("Reversal", reversal);

		Move roar = new Move("Roar");
		roar.setBP(0);
		roar.setZBP(0);
		roar.setCategory("Status");
		roar.setType("Normal");
		roar.setSound(true);
		movedex.put("Roar", roar);

		Move roaroftime = new Move("Roar of Time");
		roaroftime.setBP(150);
		roaroftime.setZBP(200);
		roaroftime.setCategory("Special");
		roaroftime.setType("Dragon");
		movedex.put("Roar of Time", roaroftime);

		Move rockblast = new Move("Rock Blast");
		rockblast.setBP(25);
		rockblast.setZBP(140);
		rockblast.setCategory("Physical");
		rockblast.setType("Rock");
		rockblast.setMultiHit(true);
		rockblast.setBullet(true);
		movedex.put("Rock Blast", rockblast);

		Move rockclimb = new Move("Rock Climb");
		rockclimb.setBP(90);
		rockclimb.setZBP(175);
		rockclimb.setCategory("Physical");
		rockclimb.setType("Normal");
		rockclimb.setMakesContact(true);
		rockclimb.setHasSecondaryEffect(true);
		movedex.put("Rock Climb", rockclimb);

		Move rockpolish = new Move("Rock Polish");
		rockpolish.setBP(0);
		rockpolish.setZBP(0);
		rockpolish.setCategory("Status");
		rockpolish.setType("Rock");
		movedex.put("Rock Polish", rockpolish);

		Move rockslide = new Move("Rock Slide");
		rockslide.setBP(75);
		rockslide.setZBP(140);
		rockslide.setCategory("Physical");
		rockslide.setType("Rock");
		rockslide.setSpread(true);
		rockslide.setHasSecondaryEffect(true);
		movedex.put("Rock Slide", rockslide);

		Move rocksmash = new Move("Rock Smash");
		rocksmash.setBP(40);
		rocksmash.setZBP(100);
		rocksmash.setCategory("Physical");
		rocksmash.setType("Fighting");
		rocksmash.setMakesContact(true);
		rocksmash.setHasSecondaryEffect(true);
		movedex.put("Rock Smash", rocksmash);

		Move rockthrow = new Move("Rock Throw");
		rockthrow.setBP(50);
		rockthrow.setZBP(100);
		rockthrow.setCategory("Physical");
		rockthrow.setType("Rock");
		movedex.put("Rock Throw", rockthrow);

		Move rocktomb = new Move("Rock Tomb");
		rocktomb.setBP(60);
		rocktomb.setZBP(120);
		rocktomb.setCategory("Physical");
		rocktomb.setType("Rock");
		rocktomb.setHasSecondaryEffect(true);
		movedex.put("Rock Tomb", rocktomb);

		Move rockwrecker = new Move("Rock Wrecker");
		rockwrecker.setBP(150);
		rockwrecker.setZBP(200);
		rockwrecker.setCategory("Physical");
		rockwrecker.setType("Rock");
		rockwrecker.setBullet(true);
		movedex.put("Rock Wrecker", rockwrecker);

		Move roleplay = new Move("Role Play");
		roleplay.setBP(0);
		roleplay.setZBP(0);
		roleplay.setCategory("Status");
		roleplay.setType("Psychic");
		movedex.put("Role Play", roleplay);

		Move rollingkick = new Move("Rolling Kick");
		rollingkick.setBP(60);
		rollingkick.setZBP(120);
		rollingkick.setCategory("Physical");
		rollingkick.setType("Fighting");
		rollingkick.setMakesContact(true);
		rollingkick.setHasSecondaryEffect(true);
		movedex.put("Rolling Kick", rollingkick);

		Move rollout = new Move("Rollout");
		rollout.setBP(30);
		rollout.setZBP(100);
		rollout.setCategory("Physical");
		rollout.setType("Rock");
		rollout.setMakesContact(true);
		rollout.setHasSpecialModifier(true);
		movedex.put("Rollout", rollout);

		Move roost = new Move("Roost");
		roost.setBP(0);
		roost.setZBP(0);
		roost.setCategory("Status");
		roost.setType("Flying");
		movedex.put("Roost", roost);

		Move rototiller = new Move("Rototiller");
		rototiller.setBP(0);
		rototiller.setZBP(0);
		rototiller.setCategory("Status");
		rototiller.setType("Ground");
		movedex.put("Rototiller", rototiller);

		Move round = new Move("Round");
		round.setBP(60);
		round.setZBP(120);
		round.setCategory("Special");
		round.setType("Normal");
		round.setSound(true);
		round.setHasSpecialModifier(true);
		movedex.put("Round", round);

		Move sacredfire = new Move("Sacred Fire");
		sacredfire.setBP(100);
		sacredfire.setZBP(180);
		sacredfire.setCategory("Physical");
		sacredfire.setType("Fire");
		sacredfire.setHasSecondaryEffect(true);
		movedex.put("Sacred Fire", sacredfire);

		Move sacredsword = new Move("Sacred Sword");
		sacredsword.setBP(90);
		sacredsword.setZBP(175);
		sacredsword.setCategory("Physical");
		sacredsword.setType("Fighting");
		sacredsword.setMakesContact(true);
		sacredsword.setIgnoresDefenseBoosts(true);
		movedex.put("Sacred Sword", sacredsword);

		Move safeguard = new Move("Safeguard");
		safeguard.setBP(0);
		safeguard.setZBP(0);
		safeguard.setCategory("Status");
		safeguard.setType("Normal");
		movedex.put("Safeguard", safeguard);

		Move sandattack = new Move("Sand Attack");
		sandattack.setBP(0);
		sandattack.setZBP(0);
		sandattack.setCategory("Status");
		sandattack.setType("Ground");
		movedex.put("Sand Attack", sandattack);

		Move sandtomb = new Move("Sand Tomb");
		sandtomb.setBP(35);
		sandtomb.setZBP(100);
		sandtomb.setCategory("Physical");
		sandtomb.setType("Ground");
		movedex.put("Sand Tomb", sandtomb);

		Move sandstorm = new Move("Sandstorm");
		sandstorm.setBP(0);
		sandstorm.setZBP(0);
		sandstorm.setCategory("Status");
		sandstorm.setType("Rock");
		movedex.put("Sandstorm", sandstorm);

		Move savagespinout = new Move("Savage Spin-Out");
		savagespinout.setBP(1);
		savagespinout.setZBP(0);
		savagespinout.setCategory("Physical");
		savagespinout.setType("Bug");
		movedex.put("Savage Spin-Out", savagespinout);

		Move scald = new Move("Scald");
		scald.setBP(80);
		scald.setZBP(160);
		scald.setCategory("Special");
		scald.setType("Water");
		scald.setHasSecondaryEffect(true);
		movedex.put("Scald", scald);

		Move scaryface = new Move("Scary Face");
		scaryface.setBP(0);
		scaryface.setZBP(0);
		scaryface.setCategory("Status");
		scaryface.setType("Normal");
		movedex.put("Scary Face", scaryface);

		Move scratch = new Move("Scratch");
		scratch.setBP(40);
		scratch.setZBP(100);
		scratch.setCategory("Physical");
		scratch.setType("Normal");
		scratch.setMakesContact(true);
		movedex.put("Scratch", scratch);

		Move screech = new Move("Screech");
		screech.setBP(0);
		screech.setZBP(0);
		screech.setCategory("Status");
		screech.setType("Normal");
		screech.setSound(true);
		movedex.put("Screech", screech);

		Move searingshot = new Move("Searing Shot");
		searingshot.setBP(100);
		searingshot.setZBP(180);
		searingshot.setCategory("Special");
		searingshot.setType("Fire");
		searingshot.setSpread(true);
		searingshot.setHasSecondaryEffect(true);
		searingshot.setBullet(true);
		movedex.put("Searing Shot", searingshot);

		Move searingsunrazesmash = new Move("Searing Sunraze Smash");
		searingsunrazesmash.setBP(200);
		searingsunrazesmash.setZBP(0);
		searingsunrazesmash.setCategory("Physical");
		searingsunrazesmash.setType("Steel");
		searingsunrazesmash.setMakesContact(true);
		searingsunrazesmash.setSignatureZ(true);
		searingsunrazesmash.setIgnoresAbilities(true);
		movedex.put("Searing Sunraze Smash", searingsunrazesmash);

		Move secretpower = new Move("Secret Power");
		secretpower.setBP(70);
		secretpower.setZBP(140);
		secretpower.setCategory("Physical");
		secretpower.setType("Normal");
		secretpower.setHasSecondaryEffect(true);
		movedex.put("Secret Power", secretpower);

		Move secretsword = new Move("Secret Sword");
		secretsword.setBP(85);
		secretsword.setZBP(160);
		secretsword.setCategory("Psyshock effect");
		secretsword.setType("Fighting");
		movedex.put("Secret Sword", secretsword);

		Move seedbomb = new Move("Seed Bomb");
		seedbomb.setBP(80);
		seedbomb.setZBP(160);
		seedbomb.setCategory("Physical");
		seedbomb.setType("Grass");
		seedbomb.setBullet(true);
		movedex.put("Seed Bomb", seedbomb);

		Move seedflare = new Move("Seed Flare");
		seedflare.setBP(120);
		seedflare.setZBP(190);
		seedflare.setCategory("Special");
		seedflare.setType("Grass");
		seedflare.setHasSecondaryEffect(true);
		movedex.put("Seed Flare", seedflare);

		Move seismictoss = new Move("Seismic Toss");
		seismictoss.setBP(0);
		seismictoss.setZBP(100);
		seismictoss.setCategory("Physical");
		seismictoss.setType("Fighting");
		seismictoss.setMakesContact(true);
		movedex.put("Seismic Toss", seismictoss);

		Move selfdestruct = new Move("Self-Destruct");
		selfdestruct.setBP(200);
		selfdestruct.setZBP(200);
		selfdestruct.setCategory("Physical");
		selfdestruct.setType("Normal");
		selfdestruct.setSpread(true);
		movedex.put("Self-Destruct", selfdestruct);

		Move shadowball = new Move("Shadow Ball");
		shadowball.setBP(80);
		shadowball.setZBP(160);
		shadowball.setCategory("Special");
		shadowball.setType("Ghost");
		shadowball.setHasSecondaryEffect(true);
		shadowball.setBullet(true);
		movedex.put("Shadow Ball", shadowball);

		Move shadowbone = new Move("Shadow Bone");
		shadowbone.setBP(85);
		shadowbone.setZBP(160);
		shadowbone.setCategory("Physical");
		shadowbone.setType("Ghost");
		shadowbone.setHasSecondaryEffect(true);
		movedex.put("Shadow Bone", shadowbone);

		Move shadowclaw = new Move("Shadow Claw");
		shadowclaw.setBP(70);
		shadowclaw.setZBP(140);
		shadowclaw.setCategory("Physical");
		shadowclaw.setType("Ghost");
		shadowclaw.setMakesContact(true);
		movedex.put("Shadow Claw", shadowclaw);

		Move shadowforce = new Move("Shadow Force");
		shadowforce.setBP(120);
		shadowforce.setZBP(190);
		shadowforce.setCategory("Physical");
		shadowforce.setType("Ghost");
		shadowforce.setMakesContact(true);
		movedex.put("Shadow Force", shadowforce);

		Move shadowpunch = new Move("Shadow Punch");
		shadowpunch.setBP(60);
		shadowpunch.setZBP(120);
		shadowpunch.setCategory("Physical");
		shadowpunch.setType("Ghost");
		shadowpunch.setMakesContact(true);
		shadowpunch.setPunch(true);
		movedex.put("Shadow Punch", shadowpunch);

		Move shadowsneak = new Move("Shadow Sneak");
		shadowsneak.setBP(40);
		shadowsneak.setZBP(100);
		shadowsneak.setCategory("Physical");
		shadowsneak.setType("Ghost");
		shadowsneak.setMakesContact(true);
		movedex.put("Shadow Sneak", shadowsneak);

		Move shadowstrike = new Move("Shadow Strike");
		shadowstrike.setBP(80);
		shadowstrike.setZBP(160);
		shadowstrike.setCategory("Physical");
		shadowstrike.setType("Ghost");
		shadowstrike.setMakesContact(true);
		shadowstrike.setHasSecondaryEffect(true);
		movedex.put("Shadow Strike", shadowstrike);

		Move sharpen = new Move("Sharpen");
		sharpen.setBP(0);
		sharpen.setZBP(0);
		sharpen.setCategory("Status");
		sharpen.setType("Normal");
		movedex.put("Sharpen", sharpen);

		Move shatteredpsyche = new Move("Shattered Psyche");
		shatteredpsyche.setBP(1);
		shatteredpsyche.setZBP(0);
		shatteredpsyche.setCategory("Physical");
		shatteredpsyche.setType("Psychic");
		movedex.put("Shattered Psyche", shatteredpsyche);

		Move sheercold = new Move("Sheer Cold");
		sheercold.setBP(0);
		sheercold.setZBP(180);
		sheercold.setCategory("Special");
		sheercold.setType("Ice");
		movedex.put("Sheer Cold", sheercold);

		Move shellsmash = new Move("Shell Smash");
		shellsmash.setBP(0);
		shellsmash.setZBP(0);
		shellsmash.setCategory("Status");
		shellsmash.setType("Normal");
		movedex.put("Shell Smash", shellsmash);

		Move shelltrap = new Move("Shell Trap");
		shelltrap.setBP(150);
		shelltrap.setZBP(200);
		shelltrap.setCategory("Special");
		shelltrap.setType("Fire");
		shelltrap.setSpread(true);
		movedex.put("Shell Trap", shelltrap);

		Move shiftgear = new Move("Shift Gear");
		shiftgear.setBP(0);
		shiftgear.setZBP(0);
		shiftgear.setCategory("Status");
		shiftgear.setType("Steel");
		movedex.put("Shift Gear", shiftgear);

		Move shockwave = new Move("Shock Wave");
		shockwave.setBP(60);
		shockwave.setZBP(120);
		shockwave.setCategory("Special");
		shockwave.setType("Electric");
		movedex.put("Shock Wave", shockwave);

		Move shoreup = new Move("Shore Up");
		shoreup.setBP(0);
		shoreup.setZBP(0);
		shoreup.setCategory("Status");
		shoreup.setType("Ground");
		movedex.put("Shore Up", shoreup);

		Move signalbeam = new Move("Signal Beam");
		signalbeam.setBP(75);
		signalbeam.setZBP(140);
		signalbeam.setCategory("Special");
		signalbeam.setType("Bug");
		signalbeam.setHasSecondaryEffect(true);
		movedex.put("Signal Beam", signalbeam);

		Move silverwind = new Move("Silver Wind");
		silverwind.setBP(60);
		silverwind.setZBP(120);
		silverwind.setCategory("Special");
		silverwind.setType("Bug");
		silverwind.setHasSecondaryEffect(true);
		movedex.put("Silver Wind", silverwind);

		Move simplebeam = new Move("Simple Beam");
		simplebeam.setBP(0);
		simplebeam.setZBP(0);
		simplebeam.setCategory("Status");
		simplebeam.setType("Normal");
		movedex.put("Simple Beam", simplebeam);

		Move sing = new Move("Sing");
		sing.setBP(0);
		sing.setZBP(0);
		sing.setCategory("Status");
		sing.setType("Normal");
		sing.setSound(true);
		movedex.put("Sing", sing);

		Move sinisterarrowraid = new Move("Sinister Arrow Raid");
		sinisterarrowraid.setBP(180);
		sinisterarrowraid.setZBP(0);
		sinisterarrowraid.setCategory("Physical");
		sinisterarrowraid.setType("Ghost");
		sinisterarrowraid.setSignatureZ(true);
		movedex.put("Sinister Arrow Raid", sinisterarrowraid);

		Move sketch = new Move("Sketch");
		sketch.setBP(0);
		sketch.setZBP(0);
		sketch.setCategory("Status");
		sketch.setType("Normal");
		movedex.put("Sketch", sketch);

		Move skillswap = new Move("Skill Swap");
		skillswap.setBP(0);
		skillswap.setZBP(0);
		skillswap.setCategory("Status");
		skillswap.setType("Psychic");
		movedex.put("Skill Swap", skillswap);

		Move skullbash = new Move("Skull Bash");
		skullbash.setBP(130);
		skullbash.setZBP(195);
		skullbash.setCategory("Physical");
		skullbash.setType("Normal");
		skullbash.setMakesContact(true);
		movedex.put("Skull Bash", skullbash);

		Move skyattack = new Move("Sky Attack");
		skyattack.setBP(140);
		skyattack.setZBP(200);
		skyattack.setCategory("Physical");
		skyattack.setType("Flying");
		skyattack.setHasSecondaryEffect(true);
		movedex.put("Sky Attack", skyattack);

		Move skydrop = new Move("Sky Drop");
		skydrop.setBP(60);
		skydrop.setZBP(120);
		skydrop.setCategory("Physical");
		skydrop.setType("Flying");
		skydrop.setMakesContact(true);
		movedex.put("Sky Drop", skydrop);

		Move skyuppercut = new Move("Sky Uppercut");
		skyuppercut.setBP(85);
		skyuppercut.setZBP(160);
		skyuppercut.setCategory("Physical");
		skyuppercut.setType("Fighting");
		skyuppercut.setMakesContact(true);
		skyuppercut.setPunch(true);
		movedex.put("Sky Uppercut", skyuppercut);

		Move slackoff = new Move("Slack Off");
		slackoff.setBP(0);
		slackoff.setZBP(0);
		slackoff.setCategory("Status");
		slackoff.setType("Normal");
		movedex.put("Slack Off", slackoff);

		Move slam = new Move("Slam");
		slam.setBP(80);
		slam.setZBP(160);
		slam.setCategory("Physical");
		slam.setType("Normal");
		slam.setMakesContact(true);
		movedex.put("Slam", slam);

		Move slash = new Move("Slash");
		slash.setBP(70);
		slash.setZBP(140);
		slash.setCategory("Physical");
		slash.setType("Normal");
		slash.setMakesContact(true);
		movedex.put("Slash", slash);

		Move sleeppowder = new Move("Sleep Powder");
		sleeppowder.setBP(0);
		sleeppowder.setZBP(0);
		sleeppowder.setCategory("Status");
		sleeppowder.setType("Grass");
		movedex.put("Sleep Powder", sleeppowder);

		Move sleeptalk = new Move("Sleep Talk");
		sleeptalk.setBP(0);
		sleeptalk.setZBP(0);
		sleeptalk.setCategory("Status");
		sleeptalk.setType("Normal");
		movedex.put("Sleep Talk", sleeptalk);

		Move sludge = new Move("Sludge");
		sludge.setBP(65);
		sludge.setZBP(120);
		sludge.setCategory("Special");
		sludge.setType("Poison");
		sludge.setHasSecondaryEffect(true);
		movedex.put("Sludge", sludge);

		Move sludgebomb = new Move("Sludge Bomb");
		sludgebomb.setBP(90);
		sludgebomb.setZBP(175);
		sludgebomb.setCategory("Special");
		sludgebomb.setType("Poison");
		sludgebomb.setHasSecondaryEffect(true);
		sludgebomb.setBullet(true);
		movedex.put("Sludge Bomb", sludgebomb);

		Move sludgewave = new Move("Sludge Wave");
		sludgewave.setBP(95);
		sludgewave.setZBP(175);
		sludgewave.setCategory("Special");
		sludgewave.setType("Poison");
		sludgewave.setSpread(true);
		sludgewave.setHasSecondaryEffect(true);
		movedex.put("Sludge Wave", sludgewave);

		Move smackdown = new Move("Smack Down");
		smackdown.setBP(50);
		smackdown.setZBP(100);
		smackdown.setCategory("Physical");
		smackdown.setType("Rock");
		movedex.put("Smack Down", smackdown);

		Move smartstrike = new Move("Smart Strike");
		smartstrike.setBP(70);
		smartstrike.setZBP(140);
		smartstrike.setCategory("Physical");
		smartstrike.setType("Steel");
		smartstrike.setMakesContact(true);
		movedex.put("Smart Strike", smartstrike);

		Move smellingsalts = new Move("Smelling Salts");
		smellingsalts.setBP(70);
		smellingsalts.setZBP(140);
		smellingsalts.setCategory("Physical");
		smellingsalts.setType("Normal");
		smellingsalts.setMakesContact(true);
		smellingsalts.setHasSpecialModifier(true);
		movedex.put("Smelling Salts", smellingsalts);

		Move smog = new Move("Smog");
		smog.setBP(30);
		smog.setZBP(100);
		smog.setCategory("Special");
		smog.setType("Poison");
		smog.setHasSecondaryEffect(true);
		movedex.put("Smog", smog);

		Move smokescreen = new Move("Smokescreen");
		smokescreen.setBP(0);
		smokescreen.setZBP(0);
		smokescreen.setCategory("Status");
		smokescreen.setType("Normal");
		movedex.put("Smokescreen", smokescreen);

		Move snarl = new Move("Snarl");
		snarl.setBP(55);
		snarl.setZBP(100);
		snarl.setCategory("Special");
		snarl.setType("Dark");
		snarl.setSpread(true);
		snarl.setHasSecondaryEffect(true);
		snarl.setSound(true);
		movedex.put("Snarl", snarl);

		Move snatch = new Move("Snatch");
		snatch.setBP(0);
		snatch.setZBP(0);
		snatch.setCategory("Status");
		snatch.setType("Dark");
		movedex.put("Snatch", snatch);

		Move snore = new Move("Snore");
		snore.setBP(50);
		snore.setZBP(100);
		snore.setCategory("Special");
		snore.setType("Normal");
		snore.setHasSecondaryEffect(true);
		snore.setSound(true);
		movedex.put("Snore", snore);

		Move soak = new Move("Soak");
		soak.setBP(0);
		soak.setZBP(0);
		soak.setCategory("Status");
		soak.setType("Water");
		movedex.put("Soak", soak);

		Move softboiled = new Move("Soft-Boiled");
		softboiled.setBP(0);
		softboiled.setZBP(0);
		softboiled.setCategory("Status");
		softboiled.setType("Normal");
		movedex.put("Soft-Boiled", softboiled);

		Move solarbeam = new Move("Solar Beam");
		solarbeam.setBP(120);
		solarbeam.setZBP(190);
		solarbeam.setCategory("Special");
		solarbeam.setType("Grass");
		movedex.put("Solar Beam", solarbeam);

		Move solarblade = new Move("Solar Blade");
		solarblade.setBP(125);
		solarblade.setZBP(190);
		solarblade.setCategory("Physical");
		solarblade.setType("Grass");
		solarblade.setMakesContact(true);
		movedex.put("Solar Blade", solarblade);

		Move sonicboom = new Move("Sonic Boom");
		sonicboom.setBP(0);
		sonicboom.setZBP(100);
		sonicboom.setCategory("Special");
		sonicboom.setType("Normal");
		movedex.put("Sonic Boom", sonicboom);

		Move soulstealing7starstrike = new Move("Soul-Stealing 7-Star Strike");
		soulstealing7starstrike.setBP(195);
		soulstealing7starstrike.setZBP(0);
		soulstealing7starstrike.setCategory("Physical");
		soulstealing7starstrike.setType("Ghost");
		soulstealing7starstrike.setMakesContact(true);
		soulstealing7starstrike.setSignatureZ(true);
		movedex.put("Soul-Stealing 7-Star Strike", soulstealing7starstrike);

		Move spacialrend = new Move("Spacial Rend");
		spacialrend.setBP(100);
		spacialrend.setZBP(180);
		spacialrend.setCategory("Special");
		spacialrend.setType("Dragon");
		movedex.put("Spacial Rend", spacialrend);

		Move spark = new Move("Spark");
		spark.setBP(65);
		spark.setZBP(120);
		spark.setCategory("Physical");
		spark.setType("Electric");
		spark.setMakesContact(true);
		spark.setHasSecondaryEffect(true);
		movedex.put("Spark", spark);

		Move sparklingaria = new Move("Sparkling Aria");
		sparklingaria.setBP(90);
		sparklingaria.setZBP(175);
		sparklingaria.setCategory("Special");
		sparklingaria.setType("Water");
		sparklingaria.setSpread(true);
		sparklingaria.setHasSecondaryEffect(true);
		sparklingaria.setSound(true);
		movedex.put("Sparkling Aria", sparklingaria);

		Move spectralthief = new Move("Spectral Thief");
		spectralthief.setBP(90);
		spectralthief.setZBP(175);
		spectralthief.setCategory("Physical");
		spectralthief.setType("Ghost");
		spectralthief.setMakesContact(true);
		movedex.put("Spectral Thief", spectralthief);

		Move speedswap = new Move("Speed Swap");
		speedswap.setBP(0);
		speedswap.setZBP(0);
		speedswap.setCategory("Status");
		speedswap.setType("Psychic");
		movedex.put("Speed Swap", speedswap);

		Move spiderweb = new Move("Spider Web");
		spiderweb.setBP(0);
		spiderweb.setZBP(0);
		spiderweb.setCategory("Status");
		spiderweb.setType("Bug");
		movedex.put("Spider Web", spiderweb);

		Move spikecannon = new Move("Spike Cannon");
		spikecannon.setBP(20);
		spikecannon.setZBP(100);
		spikecannon.setCategory("Physical");
		spikecannon.setType("Normal");
		spikecannon.setMultiHit(true);
		movedex.put("Spike Cannon", spikecannon);

		Move spikes = new Move("Spikes");
		spikes.setBP(0);
		spikes.setZBP(0);
		spikes.setCategory("Status");
		spikes.setType("Ground");
		movedex.put("Spikes", spikes);

		Move spikyshield = new Move("Spiky Shield");
		spikyshield.setBP(0);
		spikyshield.setZBP(0);
		spikyshield.setCategory("Status");
		spikyshield.setType("Grass");
		movedex.put("Spiky Shield", spikyshield);

		Move spiritshackle = new Move("Spirit Shackle");
		spiritshackle.setBP(80);
		spiritshackle.setZBP(160);
		spiritshackle.setCategory("Physical");
		spiritshackle.setType("Ghost");
		spiritshackle.setHasSecondaryEffect(true);
		movedex.put("Spirit Shackle", spiritshackle);

		Move spitup = new Move("Spit Up");
		spitup.setBP(0);
		spitup.setZBP(100);
		spitup.setCategory("Special");
		spitup.setType("Normal");
		spitup.setHasSpecialModifier(true);
		movedex.put("Spit Up", spitup);

		Move spite = new Move("Spite");
		spite.setBP(0);
		spite.setZBP(0);
		spite.setCategory("Status");
		spite.setType("Ghost");
		movedex.put("Spite", spite);

		Move splash = new Move("Splash");
		splash.setBP(0);
		splash.setZBP(0);
		splash.setCategory("Status");
		splash.setType("Normal");
		movedex.put("Splash", splash);

		Move splinteredstormshards = new Move("Splintered Stormshards");
		splinteredstormshards.setBP(190);
		splinteredstormshards.setZBP(0);
		splinteredstormshards.setCategory("Physical");
		splinteredstormshards.setType("Rock");
		splinteredstormshards.setSignatureZ(true);
		movedex.put("Splintered Stormshards", splinteredstormshards);

		Move spore = new Move("Spore");
		spore.setBP(0);
		spore.setZBP(0);
		spore.setCategory("Status");
		spore.setType("Grass");
		movedex.put("Spore", spore);

		Move spotlight = new Move("Spotlight");
		spotlight.setBP(0);
		spotlight.setZBP(0);
		spotlight.setCategory("Status");
		spotlight.setType("Normal");
		movedex.put("Spotlight", spotlight);

		Move stealthrock = new Move("Stealth Rock");
		stealthrock.setBP(0);
		stealthrock.setZBP(0);
		stealthrock.setCategory("Status");
		stealthrock.setType("Rock");
		movedex.put("Stealth Rock", stealthrock);

		Move steameruption = new Move("Steam Eruption");
		steameruption.setBP(110);
		steameruption.setZBP(185);
		steameruption.setCategory("Special");
		steameruption.setType("Water");
		steameruption.setHasSecondaryEffect(true);
		movedex.put("Steam Eruption", steameruption);

		Move steamroller = new Move("Steamroller");
		steamroller.setBP(65);
		steamroller.setZBP(120);
		steamroller.setCategory("Physical");
		steamroller.setType("Bug");
		steamroller.setMakesContact(true);
		steamroller.setHasSecondaryEffect(true);
		steamroller.setHasSpecialModifier(true);
		movedex.put("Steamroller", steamroller);

		Move steelwing = new Move("Steel Wing");
		steelwing.setBP(70);
		steelwing.setZBP(140);
		steelwing.setCategory("Physical");
		steelwing.setType("Steel");
		steelwing.setMakesContact(true);
		steelwing.setHasSecondaryEffect(true);
		movedex.put("Steel Wing", steelwing);

		Move stickyweb = new Move("Sticky Web");
		stickyweb.setBP(0);
		stickyweb.setZBP(0);
		stickyweb.setCategory("Status");
		stickyweb.setType("Bug");
		movedex.put("Sticky Web", stickyweb);

		Move stockpile = new Move("Stockpile");
		stockpile.setBP(0);
		stockpile.setZBP(0);
		stockpile.setCategory("Status");
		stockpile.setType("Normal");
		movedex.put("Stockpile", stockpile);

		Move stokedsparksurfer = new Move("Stoked Sparksurfer");
		stokedsparksurfer.setBP(175);
		stokedsparksurfer.setZBP(0);
		stokedsparksurfer.setCategory("Special");
		stokedsparksurfer.setType("Electric");
		stokedsparksurfer.setHasSecondaryEffect(true);
		stokedsparksurfer.setSignatureZ(true);
		movedex.put("Stoked Sparksurfer", stokedsparksurfer);

		Move stomp = new Move("Stomp");
		stomp.setBP(65);
		stomp.setZBP(120);
		stomp.setCategory("Physical");
		stomp.setType("Normal");
		stomp.setMakesContact(true);
		stomp.setHasSecondaryEffect(true);
		stomp.setHasSpecialModifier(true);
		movedex.put("Stomp", stomp);

		Move stompingtantrum = new Move("Stomping Tantrum");
		stompingtantrum.setBP(75);
		stompingtantrum.setZBP(140);
		stompingtantrum.setCategory("Physical");
		stompingtantrum.setType("Ground");
		stompingtantrum.setMakesContact(true);
		stompingtantrum.setHasSpecialModifier(true);
		movedex.put("Stomping Tantrum", stompingtantrum);

		Move stoneedge = new Move("Stone Edge");
		stoneedge.setBP(100);
		stoneedge.setZBP(180);
		stoneedge.setCategory("Physical");
		stoneedge.setType("Rock");
		movedex.put("Stone Edge", stoneedge);

		Move storedpower = new Move("Stored Power");
		storedpower.setBP(20);
		storedpower.setZBP(160);
		storedpower.setCategory("Special");
		storedpower.setType("Psychic");
		storedpower.setHasSpecialModifier(true);
		movedex.put("Stored Power", storedpower);

		Move stormthrow = new Move("Storm Throw");
		stormthrow.setBP(60);
		stormthrow.setZBP(120);
		stormthrow.setCategory("Physical");
		stormthrow.setType("Fighting");
		stormthrow.setMakesContact(true);
		movedex.put("Storm Throw", stormthrow);

		Move strength = new Move("Strength");
		strength.setBP(80);
		strength.setZBP(160);
		strength.setCategory("Physical");
		strength.setType("Normal");
		strength.setMakesContact(true);
		movedex.put("Strength", strength);

		Move strengthsap = new Move("Strength Sap");
		strengthsap.setBP(0);
		strengthsap.setZBP(0);
		strengthsap.setCategory("Status");
		strengthsap.setType("Grass");
		movedex.put("Strength Sap", strengthsap);

		Move stringshot = new Move("String Shot");
		stringshot.setBP(0);
		stringshot.setZBP(0);
		stringshot.setCategory("Status");
		stringshot.setType("Bug");
		stringshot.setSpread(true);
		movedex.put("String Shot", stringshot);

		Move struggle = new Move("Struggle");
		struggle.setBP(50);
		struggle.setZBP(1);
		struggle.setCategory("Physical");
		struggle.setType("Normal");
		struggle.setMakesContact(true);
		movedex.put("Struggle", struggle);

		Move strugglebug = new Move("Struggle Bug");
		strugglebug.setBP(50);
		strugglebug.setZBP(100);
		strugglebug.setCategory("Special");
		strugglebug.setType("Bug");
		strugglebug.setSpread(true);
		strugglebug.setHasSecondaryEffect(true);
		movedex.put("Struggle Bug", strugglebug);

		Move stunspore = new Move("Stun Spore");
		stunspore.setBP(0);
		stunspore.setZBP(0);
		stunspore.setCategory("Status");
		stunspore.setType("Grass");
		movedex.put("Stun Spore", stunspore);

		Move submission = new Move("Submission");
		submission.setBP(80);
		submission.setZBP(160);
		submission.setCategory("Physical");
		submission.setType("Fighting");
		submission.setMakesContact(true);
		submission.setHasRecoil(true);
		movedex.put("Submission", submission);

		Move substitute = new Move("Substitute");
		substitute.setBP(0);
		substitute.setZBP(0);
		substitute.setCategory("Status");
		substitute.setType("Normal");
		movedex.put("Substitute", substitute);

		Move subzeroslammer = new Move("Subzero Slammer");
		subzeroslammer.setBP(1);
		subzeroslammer.setZBP(0);
		subzeroslammer.setCategory("Physical");
		subzeroslammer.setType("Ice");
		movedex.put("Subzero Slammer", subzeroslammer);

		Move suckerpunch = new Move("Sucker Punch");
		suckerpunch.setBP(70);
		suckerpunch.setZBP(140);
		suckerpunch.setCategory("Physical");
		suckerpunch.setType("Dark");
		suckerpunch.setMakesContact(true);
		movedex.put("Sucker Punch", suckerpunch);

		Move sunnyday = new Move("Sunny Day");
		sunnyday.setBP(0);
		sunnyday.setZBP(0);
		sunnyday.setCategory("Status");
		sunnyday.setType("Fire");
		movedex.put("Sunny Day", sunnyday);

		Move sunsteelstrike = new Move("Sunsteel Strike");
		sunsteelstrike.setBP(100);
		sunsteelstrike.setZBP(180);
		sunsteelstrike.setCategory("Physical");
		sunsteelstrike.setType("Steel");
		sunsteelstrike.setMakesContact(true);
		sunsteelstrike.setIgnoresAbilities(true);
		movedex.put("Sunsteel Strike", sunsteelstrike);

		Move superfang = new Move("Super Fang");
		superfang.setBP(0);
		superfang.setZBP(100);
		superfang.setCategory("Physical");
		superfang.setType("Normal");
		superfang.setMakesContact(true);
		movedex.put("Super Fang", superfang);

		Move superpower = new Move("Superpower");
		superpower.setBP(120);
		superpower.setZBP(190);
		superpower.setCategory("Physical");
		superpower.setType("Fighting");
		superpower.setMakesContact(true);
		movedex.put("Superpower", superpower);

		Move supersonic = new Move("Supersonic");
		supersonic.setBP(0);
		supersonic.setZBP(0);
		supersonic.setCategory("Status");
		supersonic.setType("Normal");
		supersonic.setSound(true);
		movedex.put("Supersonic", supersonic);

		Move supersonicskystrike = new Move("Supersonic Skystrike");
		supersonicskystrike.setBP(1);
		supersonicskystrike.setZBP(0);
		supersonicskystrike.setCategory("Physical");
		supersonicskystrike.setType("Flying");
		movedex.put("Supersonic Skystrike", supersonicskystrike);

		Move surf = new Move("Surf");
		surf.setBP(90);
		surf.setZBP(175);
		surf.setCategory("Special");
		surf.setType("Water");
		surf.setSpread(true);
		surf.setHasSpecialModifier(true);
		movedex.put("Surf", surf);

		Move swagger = new Move("Swagger");
		swagger.setBP(0);
		swagger.setZBP(0);
		swagger.setCategory("Status");
		swagger.setType("Normal");
		movedex.put("Swagger", swagger);

		Move swallow = new Move("Swallow");
		swallow.setBP(0);
		swallow.setZBP(0);
		swallow.setCategory("Status");
		swallow.setType("Normal");
		movedex.put("Swallow", swallow);

		Move sweetkiss = new Move("Sweet Kiss");
		sweetkiss.setBP(0);
		sweetkiss.setZBP(0);
		sweetkiss.setCategory("Status");
		sweetkiss.setType("Fairy");
		movedex.put("Sweet Kiss", sweetkiss);

		Move sweetscent = new Move("Sweet Scent");
		sweetscent.setBP(0);
		sweetscent.setZBP(0);
		sweetscent.setCategory("Status");
		sweetscent.setType("Normal");
		sweetscent.setSpread(true);
		movedex.put("Sweet Scent", sweetscent);

		Move swift = new Move("Swift");
		swift.setBP(60);
		swift.setZBP(120);
		swift.setCategory("Special");
		swift.setType("Normal");
		swift.setSpread(true);
		movedex.put("Swift", swift);

		Move switcheroo = new Move("Switcheroo");
		switcheroo.setBP(0);
		switcheroo.setZBP(0);
		switcheroo.setCategory("Status");
		switcheroo.setType("Dark");
		movedex.put("Switcheroo", switcheroo);

		Move swordsdance = new Move("Swords Dance");
		swordsdance.setBP(0);
		swordsdance.setZBP(0);
		swordsdance.setCategory("Status");
		swordsdance.setType("Normal");
		movedex.put("Swords Dance", swordsdance);

		Move synchronoise = new Move("Synchronoise");
		synchronoise.setBP(120);
		synchronoise.setZBP(190);
		synchronoise.setCategory("Special");
		synchronoise.setType("Psychic");
		synchronoise.setSpread(true);
		movedex.put("Synchronoise", synchronoise);

		Move synthesis = new Move("Synthesis");
		synthesis.setBP(0);
		synthesis.setZBP(0);
		synthesis.setCategory("Status");
		synthesis.setType("Grass");
		movedex.put("Synthesis", synthesis);

		Move tackle = new Move("Tackle");
		tackle.setBP(40);
		tackle.setZBP(100);
		tackle.setCategory("Physical");
		tackle.setType("Normal");
		tackle.setMakesContact(true);
		movedex.put("Tackle", tackle);

		Move tailglow = new Move("Tail Glow");
		tailglow.setBP(0);
		tailglow.setZBP(0);
		tailglow.setCategory("Status");
		tailglow.setType("Bug");
		movedex.put("Tail Glow", tailglow);

		Move tailslap = new Move("Tail Slap");
		tailslap.setBP(25);
		tailslap.setZBP(140);
		tailslap.setCategory("Physical");
		tailslap.setType("Normal");
		tailslap.setMakesContact(true);
		tailslap.setMultiHit(true);
		movedex.put("Tail Slap", tailslap);

		Move tailwhip = new Move("Tail Whip");
		tailwhip.setBP(0);
		tailwhip.setZBP(0);
		tailwhip.setCategory("Status");
		tailwhip.setType("Normal");
		tailwhip.setSpread(true);
		movedex.put("Tail Whip", tailwhip);

		Move tailwind = new Move("Tailwind");
		tailwind.setBP(0);
		tailwind.setZBP(0);
		tailwind.setCategory("Status");
		tailwind.setType("Flying");
		movedex.put("Tailwind", tailwind);

		Move takedown = new Move("Take Down");
		takedown.setBP(90);
		takedown.setZBP(175);
		takedown.setCategory("Physical");
		takedown.setType("Normal");
		takedown.setMakesContact(true);
		takedown.setHasRecoil(true);
		movedex.put("Take Down", takedown);

		Move taunt = new Move("Taunt");
		taunt.setBP(0);
		taunt.setZBP(0);
		taunt.setCategory("Status");
		taunt.setType("Dark");
		movedex.put("Taunt", taunt);

		Move tearfullook = new Move("Tearful Look");
		tearfullook.setBP(0);
		tearfullook.setZBP(0);
		tearfullook.setCategory("Status");
		tearfullook.setType("Normal");
		movedex.put("Tearful Look", tearfullook);

		Move technoblast = new Move("Techno Blast");
		technoblast.setBP(120);
		technoblast.setZBP(190);
		technoblast.setCategory("Special");
		technoblast.setType("Normal");
		movedex.put("Techno Blast", technoblast);

		Move tectonicrage = new Move("Tectonic Rage");
		tectonicrage.setBP(1);
		tectonicrage.setZBP(0);
		tectonicrage.setCategory("Physical");
		tectonicrage.setType("Ground");
		movedex.put("Tectonic Rage", tectonicrage);

		Move teeterdance = new Move("Teeter Dance");
		teeterdance.setBP(0);
		teeterdance.setZBP(0);
		teeterdance.setCategory("Status");
		teeterdance.setType("Normal");
		teeterdance.setSpread(true);
		movedex.put("Teeter Dance", teeterdance);

		Move telekinesis = new Move("Telekinesis");
		telekinesis.setBP(0);
		telekinesis.setZBP(0);
		telekinesis.setCategory("Status");
		telekinesis.setType("Psychic");
		movedex.put("Telekinesis", telekinesis);

		Move teleport = new Move("Teleport");
		teleport.setBP(0);
		teleport.setZBP(0);
		teleport.setCategory("Status");
		teleport.setType("Psychic");
		movedex.put("Teleport", teleport);

		Move thief = new Move("Thief");
		thief.setBP(60);
		thief.setZBP(120);
		thief.setCategory("Physical");
		thief.setType("Dark");
		thief.setMakesContact(true);
		movedex.put("Thief", thief);

		Move thousandarrows = new Move("Thousand Arrows");
		thousandarrows.setBP(90);
		thousandarrows.setZBP(180);
		thousandarrows.setCategory("Physical");
		thousandarrows.setType("Ground");
		thousandarrows.setSpread(true);
		movedex.put("Thousand Arrows", thousandarrows);

		Move thousandwaves = new Move("Thousand Waves");
		thousandwaves.setBP(90);
		thousandwaves.setZBP(175);
		thousandwaves.setCategory("Physical");
		thousandwaves.setType("Ground");
		thousandwaves.setSpread(true);
		movedex.put("Thousand Waves", thousandwaves);

		Move thrash = new Move("Thrash");
		thrash.setBP(120);
		thrash.setZBP(190);
		thrash.setCategory("Physical");
		thrash.setType("Normal");
		thrash.setMakesContact(true);
		movedex.put("Thrash", thrash);

		Move throatchop = new Move("Throat Chop");
		throatchop.setBP(80);
		throatchop.setZBP(160);
		throatchop.setCategory("Physical");
		throatchop.setType("Dark");
		throatchop.setMakesContact(true);
		throatchop.setHasSecondaryEffect(true);
		movedex.put("Throat Chop", throatchop);

		Move thunder = new Move("Thunder");
		thunder.setBP(110);
		thunder.setZBP(185);
		thunder.setCategory("Special");
		thunder.setType("Electric");
		thunder.setHasSecondaryEffect(true);
		movedex.put("Thunder", thunder);

		Move thunderfang = new Move("Thunder Fang");
		thunderfang.setBP(65);
		thunderfang.setZBP(120);
		thunderfang.setCategory("Physical");
		thunderfang.setType("Electric");
		thunderfang.setMakesContact(true);
		thunderfang.setHasSecondaryEffect(true);
		thunderfang.setBite(true);
		movedex.put("Thunder Fang", thunderfang);

		Move thunderpunch = new Move("Thunder Punch");
		thunderpunch.setBP(75);
		thunderpunch.setZBP(140);
		thunderpunch.setCategory("Physical");
		thunderpunch.setType("Electric");
		thunderpunch.setMakesContact(true);
		thunderpunch.setHasSecondaryEffect(true);
		thunderpunch.setPunch(true);
		movedex.put("Thunder Punch", thunderpunch);

		Move thundershock = new Move("Thunder Shock");
		thundershock.setBP(40);
		thundershock.setZBP(100);
		thundershock.setCategory("Special");
		thundershock.setType("Electric");
		thundershock.setHasSecondaryEffect(true);
		movedex.put("Thunder Shock", thundershock);

		Move thunderwave = new Move("Thunder Wave");
		thunderwave.setBP(0);
		thunderwave.setZBP(0);
		thunderwave.setCategory("Status");
		thunderwave.setType("Electric");
		movedex.put("Thunder Wave", thunderwave);

		Move thunderbolt = new Move("Thunderbolt");
		thunderbolt.setBP(90);
		thunderbolt.setZBP(175);
		thunderbolt.setCategory("Special");
		thunderbolt.setType("Electric");
		thunderbolt.setHasSecondaryEffect(true);
		movedex.put("Thunderbolt", thunderbolt);

		Move tickle = new Move("Tickle");
		tickle.setBP(0);
		tickle.setZBP(0);
		tickle.setCategory("Status");
		tickle.setType("Normal");
		movedex.put("Tickle", tickle);

		Move topsyturvy = new Move("Topsy-Turvy");
		topsyturvy.setBP(0);
		topsyturvy.setZBP(0);
		topsyturvy.setCategory("Status");
		topsyturvy.setType("Dark");
		movedex.put("Topsy-Turvy", topsyturvy);

		Move torment = new Move("Torment");
		torment.setBP(0);
		torment.setZBP(0);
		torment.setCategory("Status");
		torment.setType("Dark");
		movedex.put("Torment", torment);

		Move toxic = new Move("Toxic");
		toxic.setBP(0);
		toxic.setZBP(0);
		toxic.setCategory("Status");
		toxic.setType("Poison");
		movedex.put("Toxic", toxic);

		Move toxicspikes = new Move("Toxic Spikes");
		toxicspikes.setBP(0);
		toxicspikes.setZBP(0);
		toxicspikes.setCategory("Status");
		toxicspikes.setType("Poison");
		movedex.put("Toxic Spikes", toxicspikes);

		Move toxicthread = new Move("Toxic Thread");
		toxicthread.setBP(0);
		toxicthread.setZBP(0);
		toxicthread.setCategory("Status");
		toxicthread.setType("Poison");
		movedex.put("Toxic Thread", toxicthread);

		Move transform = new Move("Transform");
		transform.setBP(0);
		transform.setZBP(0);
		transform.setCategory("Status");
		transform.setType("Normal");
		movedex.put("Transform", transform);

		Move triattack = new Move("Tri Attack");
		triattack.setBP(80);
		triattack.setZBP(160);
		triattack.setCategory("Special");
		triattack.setType("Normal");
		triattack.setHasSecondaryEffect(true);
		movedex.put("Tri Attack", triattack);

		Move trick = new Move("Trick");
		trick.setBP(0);
		trick.setZBP(0);
		trick.setCategory("Status");
		trick.setType("Psychic");
		movedex.put("Trick", trick);

		Move trickroom = new Move("Trick Room");
		trickroom.setBP(0);
		trickroom.setZBP(0);
		trickroom.setCategory("Status");
		trickroom.setType("Psychic");
		movedex.put("Trick Room", trickroom);

		Move trickortreat = new Move("Trick-or-Treat");
		trickortreat.setBP(0);
		trickortreat.setZBP(0);
		trickortreat.setCategory("Status");
		trickortreat.setType("Ghost");
		movedex.put("Trick-or-Treat", trickortreat);

		Move triplekick = new Move("Triple Kick");
		triplekick.setBP(10);
		triplekick.setZBP(120);
		triplekick.setCategory("Physical");
		triplekick.setType("Fighting");
		triplekick.setMakesContact(true);
		triplekick.setHasSpecialModifier(true);
		movedex.put("Triple Kick", triplekick);

		Move tropkick = new Move("Trop Kick");
		tropkick.setBP(70);
		tropkick.setZBP(140);
		tropkick.setCategory("Physical");
		tropkick.setType("Grass");
		tropkick.setMakesContact(true);
		tropkick.setHasSecondaryEffect(true);
		movedex.put("Trop Kick", tropkick);

		Move trumpcard = new Move("Trump Card");
		trumpcard.setBP(0);
		trumpcard.setZBP(160);
		trumpcard.setCategory("Special");
		trumpcard.setType("Normal");
		trumpcard.setMakesContact(true);
		trumpcard.setHasSpecialModifier(true);
		movedex.put("Trump Card", trumpcard);

		Move twineedle = new Move("Twineedle");
		twineedle.setBP(25);
		twineedle.setZBP(100);
		twineedle.setCategory("Physical");
		twineedle.setType("Bug");
		twineedle.setHasSecondaryEffect(true);
		twineedle.setTwoHit(true);
		movedex.put("Twineedle", twineedle);

		Move twinkletackle = new Move("Twinkle Tackle");
		twinkletackle.setBP(1);
		twinkletackle.setZBP(0);
		twinkletackle.setCategory("Physical");
		twinkletackle.setType("Fairy");
		movedex.put("Twinkle Tackle", twinkletackle);

		Move twister = new Move("Twister");
		twister.setBP(40);
		twister.setZBP(100);
		twister.setCategory("Special");
		twister.setType("Dragon");
		twister.setSpread(true);
		twister.setHasSecondaryEffect(true);
		movedex.put("Twister", twister);

		Move uturn = new Move("U-turn");
		uturn.setBP(70);
		uturn.setZBP(140);
		uturn.setCategory("Physical");
		uturn.setType("Bug");
		uturn.setMakesContact(true);
		movedex.put("U-turn", uturn);

		Move uproar = new Move("Uproar");
		uproar.setBP(90);
		uproar.setZBP(175);
		uproar.setCategory("Special");
		uproar.setType("Normal");
		uproar.setSound(true);
		movedex.put("Uproar", uproar);

		Move vcreate = new Move("V-create");
		vcreate.setBP(180);
		vcreate.setZBP(220);
		vcreate.setCategory("Physical");
		vcreate.setType("Fire");
		vcreate.setMakesContact(true);
		movedex.put("V-create", vcreate);

		Move vacuumwave = new Move("Vacuum Wave");
		vacuumwave.setBP(40);
		vacuumwave.setZBP(100);
		vacuumwave.setCategory("Special");
		vacuumwave.setType("Fighting");
		movedex.put("Vacuum Wave", vacuumwave);

		Move venomdrench = new Move("Venom Drench");
		venomdrench.setBP(0);
		venomdrench.setZBP(0);
		venomdrench.setCategory("Status");
		venomdrench.setType("Poison");
		venomdrench.setSpread(true);
		movedex.put("Venom Drench", venomdrench);

		Move venoshock = new Move("Venoshock");
		venoshock.setBP(65);
		venoshock.setZBP(120);
		venoshock.setCategory("Special");
		venoshock.setType("Poison");
		movedex.put("Venoshock", venoshock);

		Move vicegrip = new Move("Vice Grip");
		vicegrip.setBP(55);
		vicegrip.setZBP(100);
		vicegrip.setCategory("Physical");
		vicegrip.setType("Normal");
		vicegrip.setMakesContact(true);
		movedex.put("Vice Grip", vicegrip);

		Move vinewhip = new Move("Vine Whip");
		vinewhip.setBP(45);
		vinewhip.setZBP(100);
		vinewhip.setCategory("Physical");
		vinewhip.setType("Grass");
		vinewhip.setMakesContact(true);
		movedex.put("Vine Whip", vinewhip);

		Move vitalthrow = new Move("Vital Throw");
		vitalthrow.setBP(70);
		vitalthrow.setZBP(140);
		vitalthrow.setCategory("Physical");
		vitalthrow.setType("Fighting");
		vitalthrow.setMakesContact(true);
		movedex.put("Vital Throw", vitalthrow);

		Move voltswitch = new Move("Volt Switch");
		voltswitch.setBP(70);
		voltswitch.setZBP(140);
		voltswitch.setCategory("Special");
		voltswitch.setType("Electric");
		movedex.put("Volt Switch", voltswitch);

		Move volttackle = new Move("Volt Tackle");
		volttackle.setBP(120);
		volttackle.setZBP(190);
		volttackle.setCategory("Physical");
		volttackle.setType("Electric");
		volttackle.setMakesContact(true);
		volttackle.setHasSecondaryEffect(true);
		volttackle.setHasRecoil(true);
		movedex.put("Volt Tackle", volttackle);

		Move wakeupslap = new Move("Wake-Up Slap");
		wakeupslap.setBP(70);
		wakeupslap.setZBP(140);
		wakeupslap.setCategory("Physical");
		wakeupslap.setType("Fighting");
		wakeupslap.setMakesContact(true);
		wakeupslap.setHasSpecialModifier(true);
		movedex.put("Wake-Up Slap", wakeupslap);

		Move watergun = new Move("Water Gun");
		watergun.setBP(40);
		watergun.setZBP(100);
		watergun.setCategory("Special");
		watergun.setType("Water");
		movedex.put("Water Gun", watergun);

		Move waterpledge = new Move("Water Pledge");
		waterpledge.setBP(80);
		waterpledge.setZBP(160);
		waterpledge.setCategory("Special");
		waterpledge.setType("Water");
		waterpledge.setHasSpecialModifier(true);
		movedex.put("Water Pledge", waterpledge);

		Move waterpulse = new Move("Water Pulse");
		waterpulse.setBP(60);
		waterpulse.setZBP(120);
		waterpulse.setCategory("Special");
		waterpulse.setType("Water");
		waterpulse.setHasSecondaryEffect(true);
		movedex.put("Water Pulse", waterpulse);

		Move watershuriken = new Move("Water Shuriken");
		watershuriken.setBP(15);
		watershuriken.setZBP(100);
		watershuriken.setCategory("Special");
		watershuriken.setType("Water");
		watershuriken.setMultiHit(true);
		watershuriken.setHasSpecialModifier(true);
		movedex.put("Water Shuriken", watershuriken);

		Move watersport = new Move("Water Sport");
		watersport.setBP(0);
		watersport.setZBP(0);
		watersport.setCategory("Status");
		watersport.setType("Water");
		movedex.put("Water Sport", watersport);

		Move waterspout = new Move("Water Spout");
		waterspout.setBP(150);
		waterspout.setZBP(200);
		waterspout.setCategory("Special");
		waterspout.setType("Water");
		waterspout.setSpread(true);
		waterspout.setHasSpecialModifier(true);
		movedex.put("Water Spout", waterspout);

		Move waterfall = new Move("Waterfall");
		waterfall.setBP(80);
		waterfall.setZBP(160);
		waterfall.setCategory("Physical");
		waterfall.setType("Water");
		waterfall.setMakesContact(true);
		waterfall.setHasSecondaryEffect(true);
		movedex.put("Waterfall", waterfall);

		Move weatherball = new Move("Weather Ball");
		weatherball.setBP(50);
		weatherball.setZBP(160);
		weatherball.setCategory("Special");
		weatherball.setType("Normal");
		weatherball.setBullet(true);
		movedex.put("Weather Ball", weatherball);

		Move whirlpool = new Move("Whirlpool");
		whirlpool.setBP(35);
		whirlpool.setZBP(100);
		whirlpool.setCategory("Special");
		whirlpool.setType("Water");
		movedex.put("Whirlpool", whirlpool);

		Move whirlwind = new Move("Whirlwind");
		whirlwind.setBP(0);
		whirlwind.setZBP(0);
		whirlwind.setCategory("Status");
		whirlwind.setType("Normal");
		movedex.put("Whirlwind", whirlwind);

		Move wideguard = new Move("Wide Guard");
		wideguard.setBP(0);
		wideguard.setZBP(0);
		wideguard.setCategory("Status");
		wideguard.setType("Rock");
		movedex.put("Wide Guard", wideguard);

		Move wildcharge = new Move("Wild Charge");
		wildcharge.setBP(90);
		wildcharge.setZBP(175);
		wildcharge.setCategory("Physical");
		wildcharge.setType("Electric");
		wildcharge.setMakesContact(true);
		wildcharge.setHasRecoil(true);
		movedex.put("Wild Charge", wildcharge);

		Move willowisp = new Move("Will-O-Wisp");
		willowisp.setBP(0);
		willowisp.setZBP(0);
		willowisp.setCategory("Status");
		willowisp.setType("Fire");
		movedex.put("Will-O-Wisp", willowisp);

		Move wingattack = new Move("Wing Attack");
		wingattack.setBP(60);
		wingattack.setZBP(120);
		wingattack.setCategory("Physical");
		wingattack.setType("Flying");
		wingattack.setMakesContact(true);
		movedex.put("Wing Attack", wingattack);

		Move wish = new Move("Wish");
		wish.setBP(0);
		wish.setZBP(0);
		wish.setCategory("Status");
		wish.setType("Normal");
		movedex.put("Wish", wish);

		Move withdraw = new Move("Withdraw");
		withdraw.setBP(0);
		withdraw.setZBP(0);
		withdraw.setCategory("Status");
		withdraw.setType("Water");
		movedex.put("Withdraw", withdraw);

		Move wonderroom = new Move("Wonder Room");
		wonderroom.setBP(0);
		wonderroom.setZBP(0);
		wonderroom.setCategory("Status");
		wonderroom.setType("Psychic");
		movedex.put("Wonder Room", wonderroom);

		Move woodhammer = new Move("Wood Hammer");
		woodhammer.setBP(120);
		woodhammer.setZBP(190);
		woodhammer.setCategory("Physical");
		woodhammer.setType("Grass");
		woodhammer.setMakesContact(true);
		woodhammer.setHasRecoil(true);
		movedex.put("Wood Hammer", woodhammer);

		Move workup = new Move("Work Up");
		workup.setBP(0);
		workup.setZBP(0);
		workup.setCategory("Status");
		workup.setType("Normal");
		movedex.put("Work Up", workup);

		Move worryseed = new Move("Worry Seed");
		worryseed.setBP(0);
		worryseed.setZBP(0);
		worryseed.setCategory("Status");
		worryseed.setType("Grass");
		movedex.put("Worry Seed", worryseed);

		Move wrap = new Move("Wrap");
		wrap.setBP(15);
		wrap.setZBP(100);
		wrap.setCategory("Physical");
		wrap.setType("Normal");
		wrap.setMakesContact(true);
		movedex.put("Wrap", wrap);

		Move wringout = new Move("Wring Out");
		wringout.setBP(0);
		wringout.setZBP(190);
		wringout.setCategory("Special");
		wringout.setType("Normal");
		wringout.setMakesContact(true);
		wringout.setHasSpecialModifier(true);
		movedex.put("Wring Out", wringout);

		Move xscissor = new Move("X-Scissor");
		xscissor.setBP(80);
		xscissor.setZBP(160);
		xscissor.setCategory("Physical");
		xscissor.setType("Bug");
		xscissor.setMakesContact(true);
		movedex.put("X-Scissor", xscissor);

		Move yawn = new Move("Yawn");
		yawn.setBP(0);
		yawn.setZBP(0);
		yawn.setCategory("Status");
		yawn.setType("Normal");
		movedex.put("Yawn", yawn);

		Move zapcannon = new Move("Zap Cannon");
		zapcannon.setBP(120);
		zapcannon.setZBP(190);
		zapcannon.setCategory("Special");
		zapcannon.setType("Electric");
		zapcannon.setHasSecondaryEffect(true);
		zapcannon.setBullet(true);
		movedex.put("Zap Cannon", zapcannon);

		Move zenheadbutt = new Move("Zen Headbutt");
		zenheadbutt.setBP(80);
		zenheadbutt.setZBP(160);
		zenheadbutt.setCategory("Physical");
		zenheadbutt.setType("Psychic");
		zenheadbutt.setMakesContact(true);
		zenheadbutt.setHasSecondaryEffect(true);
		movedex.put("Zen Headbutt", zenheadbutt);

		Move zingzap = new Move("Zing Zap");
		zingzap.setBP(80);
		zingzap.setZBP(160);
		zingzap.setCategory("Physical");
		zingzap.setType("Electric");
		zingzap.setMakesContact(true);
		zingzap.setHasSecondaryEffect(true);
		movedex.put("Zing Zap", zingzap);

		Move none = new Move("(none)");
		none.setBP(0);
		none.setZBP(0);
		none.setCategory("Status");
		none.setType("(none)");
		movedex.put("(none)", none);
	}
}
