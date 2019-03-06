/*
A hashmap of moves from the Pokemon games. Modeled in Move.java. If a boolean wasn't set, it is
assumed to be false.

Data from Pokemon Showdown's moves file: https://raw.githubusercontent.com/Zarel/Pokemon-Showdown/master/data/moves.js
*/

package superDamageCalculator;
import java.util.HashMap;

public class Movedex
{
	public HashMap<String, Move> movedex = new HashMap<String, Move>();

	public Movedex()
	{
		init();
	}

	public void init()
	{
		Move boneclub = new Move("Bone Club");
		boneclub.setBP(65);
		boneclub.setZBP(120);
		boneclub.setCategory(1);
		boneclub.setType("Ground");
		boneclub.setHasSecondaryEffect(true);
		movedex.put("Bone Club", boneclub);

		Move cottonguard = new Move("Cotton Guard");
		cottonguard.setBP(0);
		cottonguard.setZBP(0);
		cottonguard.setCategory(0);
		cottonguard.setType("Grass");
		movedex.put("Cotton Guard", cottonguard);

		Move reflecttype = new Move("Reflect Type");
		reflecttype.setBP(0);
		reflecttype.setZBP(0);
		reflecttype.setCategory(0);
		reflecttype.setType("Normal");
		movedex.put("Reflect Type", reflecttype);

		Move bulletseed = new Move("Bullet Seed");
		bulletseed.setBP(25);
		bulletseed.setZBP(140);
		bulletseed.setCategory(1);
		bulletseed.setType("Grass");
		bulletseed.setIsMultiHit(true);
		movedex.put("Bullet Seed", bulletseed);

		Move thundershock = new Move("Thunder Shock");
		thundershock.setBP(40);
		thundershock.setZBP(100);
		thundershock.setCategory(2);
		thundershock.setType("Electric");
		thundershock.setHasSecondaryEffect(true);
		movedex.put("Thunder Shock", thundershock);

		Move hyperspacehole = new Move("Hyperspace Hole");
		hyperspacehole.setBP(80);
		hyperspacehole.setZBP(160);
		hyperspacehole.setCategory(2);
		hyperspacehole.setType("Psychic");
		movedex.put("Hyperspace Hole", hyperspacehole);

		Move stokedsparksurfer = new Move("Stoked Sparksurfer");
		stokedsparksurfer.setBP(175);
		stokedsparksurfer.setZBP(0);
		stokedsparksurfer.setCategory(2);
		stokedsparksurfer.setType("Electric");
		stokedsparksurfer.setHasSecondaryEffect(true);
		stokedsparksurfer.setIsSignatureZ(true);
		movedex.put("Stoked Sparksurfer", stokedsparksurfer);

		Move autotomize = new Move("Autotomize");
		autotomize.setBP(0);
		autotomize.setZBP(0);
		autotomize.setCategory(0);
		autotomize.setType("Steel");
		movedex.put("Autotomize", autotomize);

		Move brine = new Move("Brine");
		brine.setBP(65);
		brine.setZBP(120);
		brine.setCategory(2);
		brine.setType("Water");
		movedex.put("Brine", brine);

		Move selfdestruct = new Move("Self-Destruct");
		selfdestruct.setBP(200);
		selfdestruct.setZBP(200);
		selfdestruct.setCategory(1);
		selfdestruct.setType("Normal");
		selfdestruct.setIsSpread(true);
		movedex.put("Self-Destruct", selfdestruct);

		Move psychoboost = new Move("Psycho Boost");
		psychoboost.setBP(140);
		psychoboost.setZBP(200);
		psychoboost.setCategory(2);
		psychoboost.setType("Psychic");
		movedex.put("Psycho Boost", psychoboost);

		Move wakeupslap = new Move("Wake-Up Slap");
		wakeupslap.setBP(70);
		wakeupslap.setZBP(140);
		wakeupslap.setCategory(1);
		wakeupslap.setType("Fighting");
		wakeupslap.setMakesContact(true);
		movedex.put("Wake-Up Slap", wakeupslap);

		Move dracometeor = new Move("Draco Meteor");
		dracometeor.setBP(130);
		dracometeor.setZBP(195);
		dracometeor.setCategory(2);
		dracometeor.setType("Dragon");
		movedex.put("Draco Meteor", dracometeor);

		Move watershuriken = new Move("Water Shuriken");
		watershuriken.setBP(15);
		watershuriken.setZBP(100);
		watershuriken.setCategory(2);
		watershuriken.setType("Water");
		watershuriken.setIsMultiHit(true);
		movedex.put("Water Shuriken", watershuriken);

		Move worryseed = new Move("Worry Seed");
		worryseed.setBP(0);
		worryseed.setZBP(0);
		worryseed.setCategory(0);
		worryseed.setType("Grass");
		movedex.put("Worry Seed", worryseed);

		Move workup = new Move("Work Up");
		workup.setBP(0);
		workup.setZBP(0);
		workup.setCategory(0);
		workup.setType("Normal");
		movedex.put("Work Up", workup);

		Move shadowstrike = new Move("Shadow Strike");
		shadowstrike.setBP(80);
		shadowstrike.setZBP(160);
		shadowstrike.setCategory(1);
		shadowstrike.setType("Ghost");
		shadowstrike.setMakesContact(true);
		shadowstrike.setHasSecondaryEffect(true);
		movedex.put("Shadow Strike", shadowstrike);

		Move rockclimb = new Move("Rock Climb");
		rockclimb.setBP(90);
		rockclimb.setZBP(175);
		rockclimb.setCategory(1);
		rockclimb.setType("Normal");
		rockclimb.setMakesContact(true);
		rockclimb.setHasSecondaryEffect(true);
		movedex.put("Rock Climb", rockclimb);

		Move trickroom = new Move("Trick Room");
		trickroom.setBP(0);
		trickroom.setZBP(0);
		trickroom.setCategory(0);
		trickroom.setType("Psychic");
		movedex.put("Trick Room", trickroom);

		Move bind = new Move("Bind");
		bind.setBP(15);
		bind.setZBP(100);
		bind.setCategory(1);
		bind.setType("Normal");
		bind.setMakesContact(true);
		movedex.put("Bind", bind);

		Move gyroball = new Move("Gyro Ball");
		gyroball.setBP(0);
		gyroball.setZBP(160);
		gyroball.setCategory(1);
		gyroball.setType("Steel");
		gyroball.setMakesContact(true);
		movedex.put("Gyro Ball", gyroball);

		Move nobleroar = new Move("Noble Roar");
		nobleroar.setBP(0);
		nobleroar.setZBP(0);
		nobleroar.setCategory(0);
		nobleroar.setType("Normal");
		movedex.put("Noble Roar", nobleroar);

		Move mirrormove = new Move("Mirror Move");
		mirrormove.setBP(0);
		mirrormove.setZBP(0);
		mirrormove.setCategory(0);
		mirrormove.setType("Flying");
		movedex.put("Mirror Move", mirrormove);

		Move constrict = new Move("Constrict");
		constrict.setBP(10);
		constrict.setZBP(100);
		constrict.setCategory(1);
		constrict.setType("Normal");
		constrict.setMakesContact(true);
		constrict.setHasSecondaryEffect(true);
		movedex.put("Constrict", constrict);

		Move dragonpulse = new Move("Dragon Pulse");
		dragonpulse.setBP(85);
		dragonpulse.setZBP(160);
		dragonpulse.setCategory(2);
		dragonpulse.setType("Dragon");
		movedex.put("Dragon Pulse", dragonpulse);

		Move megadrain = new Move("Mega Drain");
		megadrain.setBP(40);
		megadrain.setZBP(120);
		megadrain.setCategory(2);
		megadrain.setType("Grass");
		movedex.put("Mega Drain", megadrain);

		Move psychoshift = new Move("Psycho Shift");
		psychoshift.setBP(0);
		psychoshift.setZBP(0);
		psychoshift.setCategory(0);
		psychoshift.setType("Psychic");
		movedex.put("Psycho Shift", psychoshift);

		Move cottonspore = new Move("Cotton Spore");
		cottonspore.setBP(0);
		cottonspore.setZBP(0);
		cottonspore.setCategory(0);
		cottonspore.setType("Grass");
		cottonspore.setIsSpread(true);
		movedex.put("Cotton Spore", cottonspore);

		Move surf = new Move("Surf");
		surf.setBP(90);
		surf.setZBP(175);
		surf.setCategory(2);
		surf.setType("Water");
		surf.setIsSpread(true);
		movedex.put("Surf", surf);

		Move instruct = new Move("Instruct");
		instruct.setBP(0);
		instruct.setZBP(0);
		instruct.setCategory(0);
		instruct.setType("Psychic");
		movedex.put("Instruct", instruct);

		Move beatup = new Move("Beat Up");
		beatup.setBP(0);
		beatup.setZBP(100);
		beatup.setCategory(1);
		beatup.setType("Dark");
		movedex.put("Beat Up", beatup);

		Move dragonrage = new Move("Dragon Rage");
		dragonrage.setBP(0);
		dragonrage.setZBP(100);
		dragonrage.setCategory(2);
		dragonrage.setType("Dragon");
		movedex.put("Dragon Rage", dragonrage);

		Move scratch = new Move("Scratch");
		scratch.setBP(40);
		scratch.setZBP(100);
		scratch.setCategory(1);
		scratch.setType("Normal");
		scratch.setMakesContact(true);
		movedex.put("Scratch", scratch);

		Move freezedry = new Move("Freeze-Dry");
		freezedry.setBP(70);
		freezedry.setZBP(140);
		freezedry.setCategory(2);
		freezedry.setType("Ice");
		freezedry.setHasSecondaryEffect(true);
		movedex.put("Freeze-Dry", freezedry);

		Move nightshade = new Move("Night Shade");
		nightshade.setBP(0);
		nightshade.setZBP(100);
		nightshade.setCategory(2);
		nightshade.setType("Ghost");
		movedex.put("Night Shade", nightshade);

		Move acrobatics = new Move("Acrobatics");
		acrobatics.setBP(55);
		acrobatics.setZBP(100);
		acrobatics.setCategory(1);
		acrobatics.setType("Flying");
		acrobatics.setMakesContact(true);
		movedex.put("Acrobatics", acrobatics);

		Move shadowball = new Move("Shadow Ball");
		shadowball.setBP(80);
		shadowball.setZBP(160);
		shadowball.setCategory(2);
		shadowball.setType("Ghost");
		shadowball.setHasSecondaryEffect(true);
		movedex.put("Shadow Ball", shadowball);

		Move snore = new Move("Snore");
		snore.setBP(50);
		snore.setZBP(100);
		snore.setCategory(2);
		snore.setType("Normal");
		snore.setHasSecondaryEffect(true);
		movedex.put("Snore", snore);

		Move fairywind = new Move("Fairy Wind");
		fairywind.setBP(40);
		fairywind.setZBP(100);
		fairywind.setCategory(2);
		fairywind.setType("Fairy");
		movedex.put("Fairy Wind", fairywind);

		Move takedown = new Move("Take Down");
		takedown.setBP(90);
		takedown.setZBP(175);
		takedown.setCategory(1);
		takedown.setType("Normal");
		takedown.setMakesContact(true);
		takedown.setHasRecoil(true);
		movedex.put("Take Down", takedown);

		Move metalsound = new Move("Metal Sound");
		metalsound.setBP(0);
		metalsound.setZBP(0);
		metalsound.setCategory(0);
		metalsound.setType("Steel");
		movedex.put("Metal Sound", metalsound);

		Move mefirst = new Move("Me First");
		mefirst.setBP(0);
		mefirst.setZBP(0);
		mefirst.setCategory(0);
		mefirst.setType("Normal");
		movedex.put("Me First", mefirst);

		Move iondeluge = new Move("Ion Deluge");
		iondeluge.setBP(0);
		iondeluge.setZBP(0);
		iondeluge.setCategory(0);
		iondeluge.setType("Electric");
		movedex.put("Ion Deluge", iondeluge);

		Move floralhealing = new Move("Floral Healing");
		floralhealing.setBP(0);
		floralhealing.setZBP(0);
		floralhealing.setCategory(0);
		floralhealing.setType("Fairy");
		movedex.put("Floral Healing", floralhealing);

		Move endure = new Move("Endure");
		endure.setBP(0);
		endure.setZBP(0);
		endure.setCategory(0);
		endure.setType("Normal");
		movedex.put("Endure", endure);

		Move focusenergy = new Move("Focus Energy");
		focusenergy.setBP(0);
		focusenergy.setZBP(0);
		focusenergy.setCategory(0);
		focusenergy.setType("Normal");
		movedex.put("Focus Energy", focusenergy);

		Move clangoroussoulblaze = new Move("Clangorous Soulblaze");
		clangoroussoulblaze.setBP(185);
		clangoroussoulblaze.setZBP(0);
		clangoroussoulblaze.setCategory(2);
		clangoroussoulblaze.setType("Dragon");
		clangoroussoulblaze.setIsSpread(true);
		clangoroussoulblaze.setIsSignatureZ(true);
		movedex.put("Clangorous Soulblaze", clangoroussoulblaze);

		Move hammerarm = new Move("Hammer Arm");
		hammerarm.setBP(100);
		hammerarm.setZBP(180);
		hammerarm.setCategory(1);
		hammerarm.setType("Fighting");
		hammerarm.setMakesContact(true);
		hammerarm.setIsPunch(true);
		movedex.put("Hammer Arm", hammerarm);

		Move razorwind = new Move("Razor Wind");
		razorwind.setBP(80);
		razorwind.setZBP(160);
		razorwind.setCategory(2);
		razorwind.setType("Normal");
		razorwind.setIsSpread(true);
		movedex.put("Razor Wind", razorwind);

		Move tickle = new Move("Tickle");
		tickle.setBP(0);
		tickle.setZBP(0);
		tickle.setCategory(0);
		tickle.setType("Normal");
		movedex.put("Tickle", tickle);

		Move originpulse = new Move("Origin Pulse");
		originpulse.setBP(110);
		originpulse.setZBP(185);
		originpulse.setCategory(2);
		originpulse.setType("Water");
		originpulse.setIsSpread(true);
		originpulse.setHasSecondaryEffect(true);
		movedex.put("Origin Pulse", originpulse);

		Move twinkletackle = new Move("Twinkle Tackle");
		twinkletackle.setBP(1);
		twinkletackle.setZBP(0);
		twinkletackle.setCategory(1);
		twinkletackle.setType("Fairy");
		movedex.put("Twinkle Tackle", twinkletackle);

		Move mysticalfire = new Move("Mystical Fire");
		mysticalfire.setBP(75);
		mysticalfire.setZBP(140);
		mysticalfire.setCategory(2);
		mysticalfire.setType("Fire");
		mysticalfire.setHasSecondaryEffect(true);
		movedex.put("Mystical Fire", mysticalfire);

		Move wonderroom = new Move("Wonder Room");
		wonderroom.setBP(0);
		wonderroom.setZBP(0);
		wonderroom.setCategory(0);
		wonderroom.setType("Psychic");
		movedex.put("Wonder Room", wonderroom);

		Move sweetscent = new Move("Sweet Scent");
		sweetscent.setBP(0);
		sweetscent.setZBP(0);
		sweetscent.setCategory(0);
		sweetscent.setType("Normal");
		sweetscent.setIsSpread(true);
		movedex.put("Sweet Scent", sweetscent);

		Move zapcannon = new Move("Zap Cannon");
		zapcannon.setBP(120);
		zapcannon.setZBP(190);
		zapcannon.setCategory(2);
		zapcannon.setType("Electric");
		zapcannon.setHasSecondaryEffect(true);
		movedex.put("Zap Cannon", zapcannon);

		Move batonpass = new Move("Baton Pass");
		batonpass.setBP(0);
		batonpass.setZBP(0);
		batonpass.setCategory(0);
		batonpass.setType("Normal");
		movedex.put("Baton Pass", batonpass);

		Move brutalswing = new Move("Brutal Swing");
		brutalswing.setBP(60);
		brutalswing.setZBP(120);
		brutalswing.setCategory(1);
		brutalswing.setType("Dark");
		brutalswing.setIsSpread(true);
		brutalswing.setMakesContact(true);
		movedex.put("Brutal Swing", brutalswing);

		Move extremeevoboost = new Move("Extreme Evoboost");
		extremeevoboost.setBP(0);
		extremeevoboost.setZBP(0);
		extremeevoboost.setCategory(0);
		extremeevoboost.setType("Normal");
		extremeevoboost.setIsSignatureZ(true);
		movedex.put("Extreme Evoboost", extremeevoboost);

		Move psybeam = new Move("Psybeam");
		psybeam.setBP(65);
		psybeam.setZBP(120);
		psybeam.setCategory(2);
		psybeam.setType("Psychic");
		psybeam.setHasSecondaryEffect(true);
		movedex.put("Psybeam", psybeam);

		Move powerwhip = new Move("Power Whip");
		powerwhip.setBP(120);
		powerwhip.setZBP(190);
		powerwhip.setCategory(1);
		powerwhip.setType("Grass");
		powerwhip.setMakesContact(true);
		movedex.put("Power Whip", powerwhip);

		Move shadowclaw = new Move("Shadow Claw");
		shadowclaw.setBP(70);
		shadowclaw.setZBP(140);
		shadowclaw.setCategory(1);
		shadowclaw.setType("Ghost");
		shadowclaw.setMakesContact(true);
		movedex.put("Shadow Claw", shadowclaw);

		Move fierydance = new Move("Fiery Dance");
		fierydance.setBP(80);
		fierydance.setZBP(160);
		fierydance.setCategory(2);
		fierydance.setType("Fire");
		fierydance.setHasSecondaryEffect(true);
		movedex.put("Fiery Dance", fierydance);

		Move precipiceblades = new Move("Precipice Blades");
		precipiceblades.setBP(120);
		precipiceblades.setZBP(190);
		precipiceblades.setCategory(1);
		precipiceblades.setType("Ground");
		precipiceblades.setIsSpread(true);
		precipiceblades.setHasSecondaryEffect(true);
		movedex.put("Precipice Blades", precipiceblades);

		Move eggbomb = new Move("Egg Bomb");
		eggbomb.setBP(100);
		eggbomb.setZBP(180);
		eggbomb.setCategory(1);
		eggbomb.setType("Normal");
		movedex.put("Egg Bomb", eggbomb);

		Move spark = new Move("Spark");
		spark.setBP(65);
		spark.setZBP(120);
		spark.setCategory(1);
		spark.setType("Electric");
		spark.setMakesContact(true);
		spark.setHasSecondaryEffect(true);
		movedex.put("Spark", spark);

		Move vitalthrow = new Move("Vital Throw");
		vitalthrow.setBP(70);
		vitalthrow.setZBP(140);
		vitalthrow.setCategory(1);
		vitalthrow.setType("Fighting");
		vitalthrow.setMakesContact(true);
		movedex.put("Vital Throw", vitalthrow);

		Move gigaimpact = new Move("Giga Impact");
		gigaimpact.setBP(150);
		gigaimpact.setZBP(200);
		gigaimpact.setCategory(1);
		gigaimpact.setType("Normal");
		gigaimpact.setMakesContact(true);
		movedex.put("Giga Impact", gigaimpact);

		Move quickguard = new Move("Quick Guard");
		quickguard.setBP(0);
		quickguard.setZBP(0);
		quickguard.setCategory(0);
		quickguard.setType("Fighting");
		movedex.put("Quick Guard", quickguard);

		Move shiftgear = new Move("Shift Gear");
		shiftgear.setBP(0);
		shiftgear.setZBP(0);
		shiftgear.setCategory(0);
		shiftgear.setType("Steel");
		movedex.put("Shift Gear", shiftgear);

		Move watergun = new Move("Water Gun");
		watergun.setBP(40);
		watergun.setZBP(100);
		watergun.setCategory(2);
		watergun.setType("Water");
		movedex.put("Water Gun", watergun);

		Move catastropika = new Move("Catastropika");
		catastropika.setBP(210);
		catastropika.setZBP(0);
		catastropika.setCategory(1);
		catastropika.setType("Electric");
		catastropika.setMakesContact(true);
		catastropika.setIsSignatureZ(true);
		movedex.put("Catastropika", catastropika);

		Move fusionbolt = new Move("Fusion Bolt");
		fusionbolt.setBP(100);
		fusionbolt.setZBP(180);
		fusionbolt.setCategory(1);
		fusionbolt.setType("Electric");
		movedex.put("Fusion Bolt", fusionbolt);

		Move minimize = new Move("Minimize");
		minimize.setBP(0);
		minimize.setZBP(0);
		minimize.setCategory(0);
		minimize.setType("Normal");
		movedex.put("Minimize", minimize);

		Move mistball = new Move("Mist Ball");
		mistball.setBP(70);
		mistball.setZBP(140);
		mistball.setCategory(2);
		mistball.setType("Psychic");
		mistball.setHasSecondaryEffect(true);
		movedex.put("Mist Ball", mistball);

		Move sharpen = new Move("Sharpen");
		sharpen.setBP(0);
		sharpen.setZBP(0);
		sharpen.setCategory(0);
		sharpen.setType("Normal");
		movedex.put("Sharpen", sharpen);

		Move charge = new Move("Charge");
		charge.setBP(0);
		charge.setZBP(0);
		charge.setCategory(0);
		charge.setType("Electric");
		movedex.put("Charge", charge);

		Move skyattack = new Move("Sky Attack");
		skyattack.setBP(140);
		skyattack.setZBP(200);
		skyattack.setCategory(1);
		skyattack.setType("Flying");
		skyattack.setHasSecondaryEffect(true);
		movedex.put("Sky Attack", skyattack);

		Move triattack = new Move("Tri Attack");
		triattack.setBP(80);
		triattack.setZBP(160);
		triattack.setCategory(2);
		triattack.setType("Normal");
		triattack.setHasSecondaryEffect(true);
		movedex.put("Tri Attack", triattack);

		Move weatherball = new Move("Weather Ball");
		weatherball.setBP(50);
		weatherball.setZBP(160);
		weatherball.setCategory(2);
		weatherball.setType("Normal");
		movedex.put("Weather Ball", weatherball);

		Move hiddenpowerground = new Move("Hidden Power Ground");
		hiddenpowerground.setBP(60);
		hiddenpowerground.setZBP(0);
		hiddenpowerground.setCategory(2);
		hiddenpowerground.setType("Ground");
		movedex.put("Hidden Power Ground", hiddenpowerground);

		Move psychocut = new Move("Psycho Cut");
		psychocut.setBP(70);
		psychocut.setZBP(140);
		psychocut.setCategory(1);
		psychocut.setType("Psychic");
		movedex.put("Psycho Cut", psychocut);

		Move spectralthief = new Move("Spectral Thief");
		spectralthief.setBP(90);
		spectralthief.setZBP(175);
		spectralthief.setCategory(1);
		spectralthief.setType("Ghost");
		spectralthief.setMakesContact(true);
		movedex.put("Spectral Thief", spectralthief);

		Move naturesmadness = new Move("Nature's Madness");
		naturesmadness.setBP(0);
		naturesmadness.setZBP(100);
		naturesmadness.setCategory(2);
		naturesmadness.setType("Fairy");
		movedex.put("Nature's Madness", naturesmadness);

		Move slam = new Move("Slam");
		slam.setBP(80);
		slam.setZBP(160);
		slam.setCategory(1);
		slam.setType("Normal");
		slam.setMakesContact(true);
		movedex.put("Slam", slam);

		Move amnesia = new Move("Amnesia");
		amnesia.setBP(0);
		amnesia.setZBP(0);
		amnesia.setCategory(0);
		amnesia.setType("Psychic");
		movedex.put("Amnesia", amnesia);

		Move fly = new Move("Fly");
		fly.setBP(90);
		fly.setZBP(175);
		fly.setCategory(1);
		fly.setType("Flying");
		fly.setMakesContact(true);
		movedex.put("Fly", fly);

		Move lowsweep = new Move("Low Sweep");
		lowsweep.setBP(65);
		lowsweep.setZBP(120);
		lowsweep.setCategory(1);
		lowsweep.setType("Fighting");
		lowsweep.setMakesContact(true);
		lowsweep.setHasSecondaryEffect(true);
		movedex.put("Low Sweep", lowsweep);

		Move sandattack = new Move("Sand Attack");
		sandattack.setBP(0);
		sandattack.setZBP(0);
		sandattack.setCategory(0);
		sandattack.setType("Ground");
		movedex.put("Sand Attack", sandattack);

		Move dazzlinggleam = new Move("Dazzling Gleam");
		dazzlinggleam.setBP(80);
		dazzlinggleam.setZBP(160);
		dazzlinggleam.setCategory(2);
		dazzlinggleam.setType("Fairy");
		dazzlinggleam.setIsSpread(true);
		movedex.put("Dazzling Gleam", dazzlinggleam);

		Move revelationdance = new Move("Revelation Dance");
		revelationdance.setBP(90);
		revelationdance.setZBP(175);
		revelationdance.setCategory(2);
		revelationdance.setType("Normal");
		movedex.put("Revelation Dance", revelationdance);

		Move speedswap = new Move("Speed Swap");
		speedswap.setBP(0);
		speedswap.setZBP(0);
		speedswap.setCategory(0);
		speedswap.setType("Psychic");
		movedex.put("Speed Swap", speedswap);

		Move wrap = new Move("Wrap");
		wrap.setBP(15);
		wrap.setZBP(100);
		wrap.setCategory(1);
		wrap.setType("Normal");
		wrap.setMakesContact(true);
		movedex.put("Wrap", wrap);

		Move mudsport = new Move("Mud Sport");
		mudsport.setBP(0);
		mudsport.setZBP(0);
		mudsport.setCategory(0);
		mudsport.setType("Ground");
		movedex.put("Mud Sport", mudsport);

		Move spotlight = new Move("Spotlight");
		spotlight.setBP(0);
		spotlight.setZBP(0);
		spotlight.setCategory(0);
		spotlight.setType("Normal");
		movedex.put("Spotlight", spotlight);

		Move roleplay = new Move("Role Play");
		roleplay.setBP(0);
		roleplay.setZBP(0);
		roleplay.setCategory(0);
		roleplay.setType("Psychic");
		movedex.put("Role Play", roleplay);

		Move aciddownpour = new Move("Acid Downpour");
		aciddownpour.setBP(1);
		aciddownpour.setZBP(0);
		aciddownpour.setCategory(1);
		aciddownpour.setType("Poison");
		movedex.put("Acid Downpour", aciddownpour);

		Move dig = new Move("Dig");
		dig.setBP(80);
		dig.setZBP(160);
		dig.setCategory(1);
		dig.setType("Ground");
		dig.setMakesContact(true);
		movedex.put("Dig", dig);

		Move firefang = new Move("Fire Fang");
		firefang.setBP(65);
		firefang.setZBP(120);
		firefang.setCategory(1);
		firefang.setType("Fire");
		firefang.setMakesContact(true);
		firefang.setHasSecondaryEffect(true);
		firefang.setIsBite(true);
		movedex.put("Fire Fang", firefang);

		Move irontail = new Move("Iron Tail");
		irontail.setBP(100);
		irontail.setZBP(180);
		irontail.setCategory(1);
		irontail.setType("Steel");
		irontail.setMakesContact(true);
		irontail.setHasSecondaryEffect(true);
		movedex.put("Iron Tail", irontail);

		Move lightthatburnsthesky = new Move("Light That Burns the Sky");
		lightthatburnsthesky.setBP(200);
		lightthatburnsthesky.setZBP(0);
		lightthatburnsthesky.setCategory(2);
		lightthatburnsthesky.setType("Psychic");
		lightthatburnsthesky.setIsSignatureZ(true);
		movedex.put("Light That Burns the Sky", lightthatburnsthesky);

		Move thunder = new Move("Thunder");
		thunder.setBP(110);
		thunder.setZBP(185);
		thunder.setCategory(2);
		thunder.setType("Electric");
		thunder.setHasSecondaryEffect(true);
		movedex.put("Thunder", thunder);

		Move fakeout = new Move("Fake Out");
		fakeout.setBP(40);
		fakeout.setZBP(100);
		fakeout.setCategory(1);
		fakeout.setType("Normal");
		fakeout.setMakesContact(true);
		fakeout.setHasSecondaryEffect(true);
		movedex.put("Fake Out", fakeout);

		Move fling = new Move("Fling");
		fling.setBP(0);
		fling.setZBP(100);
		fling.setCategory(1);
		fling.setType("Dark");
		movedex.put("Fling", fling);

		Move storedpower = new Move("Stored Power");
		storedpower.setBP(20);
		storedpower.setZBP(160);
		storedpower.setCategory(2);
		storedpower.setType("Psychic");
		movedex.put("Stored Power", storedpower);

		Move kinesis = new Move("Kinesis");
		kinesis.setBP(0);
		kinesis.setZBP(0);
		kinesis.setCategory(0);
		kinesis.setType("Psychic");
		movedex.put("Kinesis", kinesis);

		Move acid = new Move("Acid");
		acid.setBP(40);
		acid.setZBP(100);
		acid.setCategory(2);
		acid.setType("Poison");
		acid.setIsSpread(true);
		acid.setHasSecondaryEffect(true);
		movedex.put("Acid", acid);

		Move crushgrip = new Move("Crush Grip");
		crushgrip.setBP(0);
		crushgrip.setZBP(190);
		crushgrip.setCategory(1);
		crushgrip.setType("Normal");
		crushgrip.setMakesContact(true);
		movedex.put("Crush Grip", crushgrip);

		Move whirlwind = new Move("Whirlwind");
		whirlwind.setBP(0);
		whirlwind.setZBP(0);
		whirlwind.setCategory(0);
		whirlwind.setType("Normal");
		movedex.put("Whirlwind", whirlwind);

		Move wish = new Move("Wish");
		wish.setBP(0);
		wish.setZBP(0);
		wish.setCategory(0);
		wish.setType("Normal");
		movedex.put("Wish", wish);

		Move copycat = new Move("Copycat");
		copycat.setBP(0);
		copycat.setZBP(0);
		copycat.setCategory(0);
		copycat.setType("Normal");
		movedex.put("Copycat", copycat);

		Move playnice = new Move("Play Nice");
		playnice.setBP(0);
		playnice.setZBP(0);
		playnice.setCategory(0);
		playnice.setType("Normal");
		movedex.put("Play Nice", playnice);

		Move discharge = new Move("Discharge");
		discharge.setBP(80);
		discharge.setZBP(160);
		discharge.setCategory(2);
		discharge.setType("Electric");
		discharge.setIsSpread(true);
		discharge.setHasSecondaryEffect(true);
		movedex.put("Discharge", discharge);

		Move payback = new Move("Payback");
		payback.setBP(50);
		payback.setZBP(100);
		payback.setCategory(1);
		payback.setType("Dark");
		payback.setMakesContact(true);
		movedex.put("Payback", payback);

		Move geomancy = new Move("Geomancy");
		geomancy.setBP(0);
		geomancy.setZBP(0);
		geomancy.setCategory(0);
		geomancy.setType("Fairy");
		movedex.put("Geomancy", geomancy);

		Move holdhands = new Move("Hold Hands");
		holdhands.setBP(0);
		holdhands.setZBP(0);
		holdhands.setCategory(0);
		holdhands.setType("Normal");
		movedex.put("Hold Hands", holdhands);

		Move doomdesire = new Move("Doom Desire");
		doomdesire.setBP(140);
		doomdesire.setZBP(200);
		doomdesire.setCategory(2);
		doomdesire.setType("Steel");
		movedex.put("Doom Desire", doomdesire);

		Move dragonascent = new Move("Dragon Ascent");
		dragonascent.setBP(120);
		dragonascent.setZBP(190);
		dragonascent.setCategory(1);
		dragonascent.setType("Flying");
		dragonascent.setMakesContact(true);
		dragonascent.setHasSecondaryEffect(true);
		movedex.put("Dragon Ascent", dragonascent);

		Move steameruption = new Move("Steam Eruption");
		steameruption.setBP(110);
		steameruption.setZBP(185);
		steameruption.setCategory(2);
		steameruption.setType("Water");
		steameruption.setHasSecondaryEffect(true);
		movedex.put("Steam Eruption", steameruption);

		Move swift = new Move("Swift");
		swift.setBP(60);
		swift.setZBP(120);
		swift.setCategory(2);
		swift.setType("Normal");
		swift.setIsSpread(true);
		movedex.put("Swift", swift);

		Move incinerate = new Move("Incinerate");
		incinerate.setBP(60);
		incinerate.setZBP(120);
		incinerate.setCategory(2);
		incinerate.setType("Fire");
		incinerate.setIsSpread(true);
		movedex.put("Incinerate", incinerate);

		Move multiattack = new Move("Multi-Attack");
		multiattack.setBP(90);
		multiattack.setZBP(185);
		multiattack.setCategory(1);
		multiattack.setType("Normal");
		multiattack.setMakesContact(true);
		movedex.put("Multi-Attack", multiattack);

		Move craftyshield = new Move("Crafty Shield");
		craftyshield.setBP(0);
		craftyshield.setZBP(0);
		craftyshield.setCategory(0);
		craftyshield.setType("Fairy");
		movedex.put("Crafty Shield", craftyshield);

		Move corkscrewcrash = new Move("Corkscrew Crash");
		corkscrewcrash.setBP(1);
		corkscrewcrash.setZBP(0);
		corkscrewcrash.setCategory(1);
		corkscrewcrash.setType("Steel");
		movedex.put("Corkscrew Crash", corkscrewcrash);

		Move snarl = new Move("Snarl");
		snarl.setBP(55);
		snarl.setZBP(100);
		snarl.setCategory(2);
		snarl.setType("Dark");
		snarl.setIsSpread(true);
		snarl.setHasSecondaryEffect(true);
		movedex.put("Snarl", snarl);

		Move memento = new Move("Memento");
		memento.setBP(0);
		memento.setZBP(0);
		memento.setCategory(0);
		memento.setType("Dark");
		movedex.put("Memento", memento);

		Move featherdance = new Move("Feather Dance");
		featherdance.setBP(0);
		featherdance.setZBP(0);
		featherdance.setCategory(0);
		featherdance.setType("Flying");
		movedex.put("Feather Dance", featherdance);

		Move milkdrink = new Move("Milk Drink");
		milkdrink.setBP(0);
		milkdrink.setZBP(0);
		milkdrink.setCategory(0);
		milkdrink.setType("Normal");
		movedex.put("Milk Drink", milkdrink);

		Move bloomdoom = new Move("Bloom Doom");
		bloomdoom.setBP(1);
		bloomdoom.setZBP(0);
		bloomdoom.setCategory(1);
		bloomdoom.setType("Grass");
		movedex.put("Bloom Doom", bloomdoom);

		Move darkestlariat = new Move("Darkest Lariat");
		darkestlariat.setBP(85);
		darkestlariat.setZBP(160);
		darkestlariat.setCategory(1);
		darkestlariat.setType("Dark");
		darkestlariat.setMakesContact(true);
		darkestlariat.setIgnoresDefenseBoosts(true);
		movedex.put("Darkest Lariat", darkestlariat);

		Move lightofruin = new Move("Light of Ruin");
		lightofruin.setBP(140);
		lightofruin.setZBP(200);
		lightofruin.setCategory(2);
		lightofruin.setType("Fairy");
		lightofruin.setHasRecoil(true);
		movedex.put("Light of Ruin", lightofruin);

		Move maliciousmoonsault = new Move("Malicious Moonsault");
		maliciousmoonsault.setBP(180);
		maliciousmoonsault.setZBP(0);
		maliciousmoonsault.setCategory(1);
		maliciousmoonsault.setType("Dark");
		maliciousmoonsault.setMakesContact(true);
		maliciousmoonsault.setIsSignatureZ(true);
		movedex.put("Malicious Moonsault", maliciousmoonsault);

		Move tackle = new Move("Tackle");
		tackle.setBP(40);
		tackle.setZBP(100);
		tackle.setCategory(1);
		tackle.setType("Normal");
		tackle.setMakesContact(true);
		movedex.put("Tackle", tackle);

		Move ominouswind = new Move("Ominous Wind");
		ominouswind.setBP(60);
		ominouswind.setZBP(120);
		ominouswind.setCategory(2);
		ominouswind.setType("Ghost");
		ominouswind.setHasSecondaryEffect(true);
		movedex.put("Ominous Wind", ominouswind);

		Move agility = new Move("Agility");
		agility.setBP(0);
		agility.setZBP(0);
		agility.setCategory(0);
		agility.setType("Psychic");
		movedex.put("Agility", agility);

		Move confusion = new Move("Confusion");
		confusion.setBP(50);
		confusion.setZBP(100);
		confusion.setCategory(2);
		confusion.setType("Psychic");
		confusion.setHasSecondaryEffect(true);
		movedex.put("Confusion", confusion);

		Move leafstorm = new Move("Leaf Storm");
		leafstorm.setBP(130);
		leafstorm.setZBP(195);
		leafstorm.setCategory(2);
		leafstorm.setType("Grass");
		movedex.put("Leaf Storm", leafstorm);

		Move stringshot = new Move("String Shot");
		stringshot.setBP(0);
		stringshot.setZBP(0);
		stringshot.setCategory(0);
		stringshot.setType("Bug");
		stringshot.setIsSpread(true);
		movedex.put("String Shot", stringshot);

		Move powertrip = new Move("Power Trip");
		powertrip.setBP(20);
		powertrip.setZBP(160);
		powertrip.setCategory(1);
		powertrip.setType("Dark");
		powertrip.setMakesContact(true);
		movedex.put("Power Trip", powertrip);

		Move telekinesis = new Move("Telekinesis");
		telekinesis.setBP(0);
		telekinesis.setZBP(0);
		telekinesis.setCategory(0);
		telekinesis.setType("Psychic");
		movedex.put("Telekinesis", telekinesis);

		Move mist = new Move("Mist");
		mist.setBP(0);
		mist.setZBP(0);
		mist.setCategory(0);
		mist.setType("Ice");
		movedex.put("Mist", mist);

		Move bugbite = new Move("Bug Bite");
		bugbite.setBP(60);
		bugbite.setZBP(120);
		bugbite.setCategory(1);
		bugbite.setType("Bug");
		bugbite.setMakesContact(true);
		movedex.put("Bug Bite", bugbite);

		Move continentalcrush = new Move("Continental Crush");
		continentalcrush.setBP(1);
		continentalcrush.setZBP(0);
		continentalcrush.setCategory(1);
		continentalcrush.setType("Rock");
		movedex.put("Continental Crush", continentalcrush);

		Move splinteredstormshards = new Move("Splintered Stormshards");
		splinteredstormshards.setBP(190);
		splinteredstormshards.setZBP(0);
		splinteredstormshards.setCategory(1);
		splinteredstormshards.setType("Rock");
		splinteredstormshards.setIsSignatureZ(true);
		movedex.put("Splintered Stormshards", splinteredstormshards);

		Move woodhammer = new Move("Wood Hammer");
		woodhammer.setBP(120);
		woodhammer.setZBP(190);
		woodhammer.setCategory(1);
		woodhammer.setType("Grass");
		woodhammer.setMakesContact(true);
		woodhammer.setHasRecoil(true);
		movedex.put("Wood Hammer", woodhammer);

		Move pound = new Move("Pound");
		pound.setBP(40);
		pound.setZBP(100);
		pound.setCategory(1);
		pound.setType("Normal");
		pound.setMakesContact(true);
		movedex.put("Pound", pound);

		Move perishsong = new Move("Perish Song");
		perishsong.setBP(0);
		perishsong.setZBP(0);
		perishsong.setCategory(0);
		perishsong.setType("Normal");
		movedex.put("Perish Song", perishsong);

		Move magneticflux = new Move("Magnetic Flux");
		magneticflux.setBP(0);
		magneticflux.setZBP(0);
		magneticflux.setCategory(0);
		magneticflux.setType("Electric");
		movedex.put("Magnetic Flux", magneticflux);

		Move shadowbone = new Move("Shadow Bone");
		shadowbone.setBP(85);
		shadowbone.setZBP(160);
		shadowbone.setCategory(1);
		shadowbone.setType("Ghost");
		shadowbone.setHasSecondaryEffect(true);
		movedex.put("Shadow Bone", shadowbone);

		Move uturn = new Move("U-turn");
		uturn.setBP(70);
		uturn.setZBP(140);
		uturn.setCategory(1);
		uturn.setType("Bug");
		uturn.setMakesContact(true);
		movedex.put("U-turn", uturn);

		Move bite = new Move("Bite");
		bite.setBP(60);
		bite.setZBP(120);
		bite.setCategory(1);
		bite.setType("Dark");
		bite.setMakesContact(true);
		bite.setHasSecondaryEffect(true);
		bite.setIsBite(true);
		movedex.put("Bite", bite);

		Move hyperbeam = new Move("Hyper Beam");
		hyperbeam.setBP(150);
		hyperbeam.setZBP(200);
		hyperbeam.setCategory(2);
		hyperbeam.setType("Normal");
		movedex.put("Hyper Beam", hyperbeam);

		Move quiverdance = new Move("Quiver Dance");
		quiverdance.setBP(0);
		quiverdance.setZBP(0);
		quiverdance.setCategory(0);
		quiverdance.setType("Bug");
		movedex.put("Quiver Dance", quiverdance);

		Move conversion = new Move("Conversion");
		conversion.setBP(0);
		conversion.setZBP(0);
		conversion.setCategory(0);
		conversion.setType("Normal");
		movedex.put("Conversion", conversion);

		Move firepledge = new Move("Fire Pledge");
		firepledge.setBP(80);
		firepledge.setZBP(160);
		firepledge.setCategory(2);
		firepledge.setType("Fire");
		movedex.put("Fire Pledge", firepledge);

		Move hyperfang = new Move("Hyper Fang");
		hyperfang.setBP(80);
		hyperfang.setZBP(160);
		hyperfang.setCategory(1);
		hyperfang.setType("Normal");
		hyperfang.setMakesContact(true);
		hyperfang.setHasSecondaryEffect(true);
		hyperfang.setIsBite(true);
		movedex.put("Hyper Fang", hyperfang);

		Move spiritshackle = new Move("Spirit Shackle");
		spiritshackle.setBP(80);
		spiritshackle.setZBP(160);
		spiritshackle.setCategory(1);
		spiritshackle.setType("Ghost");
		spiritshackle.setHasSecondaryEffect(true);
		movedex.put("Spirit Shackle", spiritshackle);

		Move hiddenpowerbug = new Move("Hidden Power Bug");
		hiddenpowerbug.setBP(60);
		hiddenpowerbug.setZBP(0);
		hiddenpowerbug.setCategory(2);
		hiddenpowerbug.setType("Bug");
		movedex.put("Hidden Power Bug", hiddenpowerbug);

		Move wideguard = new Move("Wide Guard");
		wideguard.setBP(0);
		wideguard.setZBP(0);
		wideguard.setCategory(0);
		wideguard.setType("Rock");
		movedex.put("Wide Guard", wideguard);

		Move teeterdance = new Move("Teeter Dance");
		teeterdance.setBP(0);
		teeterdance.setZBP(0);
		teeterdance.setCategory(0);
		teeterdance.setType("Normal");
		teeterdance.setIsSpread(true);
		movedex.put("Teeter Dance", teeterdance);

		Move honeclaws = new Move("Hone Claws");
		honeclaws.setBP(0);
		honeclaws.setZBP(0);
		honeclaws.setCategory(0);
		honeclaws.setType("Dark");
		movedex.put("Hone Claws", honeclaws);

		Move counter = new Move("Counter");
		counter.setBP(0);
		counter.setZBP(100);
		counter.setCategory(1);
		counter.setType("Fighting");
		counter.setMakesContact(true);
		movedex.put("Counter", counter);

		Move painsplit = new Move("Pain Split");
		painsplit.setBP(0);
		painsplit.setZBP(0);
		painsplit.setCategory(0);
		painsplit.setType("Normal");
		movedex.put("Pain Split", painsplit);

		Move electroweb = new Move("Electroweb");
		electroweb.setBP(55);
		electroweb.setZBP(100);
		electroweb.setCategory(2);
		electroweb.setType("Electric");
		electroweb.setIsSpread(true);
		electroweb.setHasSecondaryEffect(true);
		movedex.put("Electroweb", electroweb);

		Move icehammer = new Move("Ice Hammer");
		icehammer.setBP(100);
		icehammer.setZBP(180);
		icehammer.setCategory(1);
		icehammer.setType("Ice");
		icehammer.setMakesContact(true);
		icehammer.setIsPunch(true);
		movedex.put("Ice Hammer", icehammer);

		Move leafblade = new Move("Leaf Blade");
		leafblade.setBP(90);
		leafblade.setZBP(175);
		leafblade.setCategory(1);
		leafblade.setType("Grass");
		leafblade.setMakesContact(true);
		movedex.put("Leaf Blade", leafblade);

		Move karatechop = new Move("Karate Chop");
		karatechop.setBP(50);
		karatechop.setZBP(100);
		karatechop.setCategory(1);
		karatechop.setType("Fighting");
		karatechop.setMakesContact(true);
		movedex.put("Karate Chop", karatechop);

		Move superpower = new Move("Superpower");
		superpower.setBP(120);
		superpower.setZBP(190);
		superpower.setCategory(1);
		superpower.setType("Fighting");
		superpower.setMakesContact(true);
		movedex.put("Superpower", superpower);

		Move paleowave = new Move("Paleo Wave");
		paleowave.setBP(85);
		paleowave.setZBP(160);
		paleowave.setCategory(2);
		paleowave.setType("Rock");
		paleowave.setHasSecondaryEffect(true);
		movedex.put("Paleo Wave", paleowave);

		Move chargebeam = new Move("Charge Beam");
		chargebeam.setBP(50);
		chargebeam.setZBP(100);
		chargebeam.setCategory(2);
		chargebeam.setType("Electric");
		chargebeam.setHasSecondaryEffect(true);
		movedex.put("Charge Beam", chargebeam);

		Move hypnosis = new Move("Hypnosis");
		hypnosis.setBP(0);
		hypnosis.setZBP(0);
		hypnosis.setCategory(0);
		hypnosis.setType("Psychic");
		movedex.put("Hypnosis", hypnosis);

		Move explosion = new Move("Explosion");
		explosion.setBP(250);
		explosion.setZBP(200);
		explosion.setCategory(1);
		explosion.setType("Normal");
		explosion.setIsSpread(true);
		movedex.put("Explosion", explosion);

		Move aquajet = new Move("Aqua Jet");
		aquajet.setBP(40);
		aquajet.setZBP(100);
		aquajet.setCategory(1);
		aquajet.setType("Water");
		aquajet.setMakesContact(true);
		movedex.put("Aqua Jet", aquajet);

		Move flowershield = new Move("Flower Shield");
		flowershield.setBP(0);
		flowershield.setZBP(0);
		flowershield.setCategory(0);
		flowershield.setType("Fairy");
		movedex.put("Flower Shield", flowershield);

		Move followme = new Move("Follow Me");
		followme.setBP(0);
		followme.setZBP(0);
		followme.setCategory(0);
		followme.setType("Normal");
		movedex.put("Follow Me", followme);

		Move blastburn = new Move("Blast Burn");
		blastburn.setBP(150);
		blastburn.setZBP(200);
		blastburn.setCategory(2);
		blastburn.setType("Fire");
		movedex.put("Blast Burn", blastburn);

		Move naturepower = new Move("Nature Power");
		naturepower.setBP(0);
		naturepower.setZBP(0);
		naturepower.setCategory(0);
		naturepower.setType("Normal");
		movedex.put("Nature Power", naturepower);

		Move astonish = new Move("Astonish");
		astonish.setBP(30);
		astonish.setZBP(100);
		astonish.setCategory(1);
		astonish.setType("Ghost");
		astonish.setMakesContact(true);
		astonish.setHasSecondaryEffect(true);
		movedex.put("Astonish", astonish);

		Move splash = new Move("Splash");
		splash.setBP(0);
		splash.setZBP(0);
		splash.setCategory(0);
		splash.setType("Normal");
		movedex.put("Splash", splash);

		Move gigadrain = new Move("Giga Drain");
		gigadrain.setBP(75);
		gigadrain.setZBP(140);
		gigadrain.setCategory(2);
		gigadrain.setType("Grass");
		movedex.put("Giga Drain", gigadrain);

		Move shoreup = new Move("Shore Up");
		shoreup.setBP(0);
		shoreup.setZBP(0);
		shoreup.setCategory(0);
		shoreup.setType("Ground");
		movedex.put("Shore Up", shoreup);

		Move withdraw = new Move("Withdraw");
		withdraw.setBP(0);
		withdraw.setZBP(0);
		withdraw.setCategory(0);
		withdraw.setType("Water");
		movedex.put("Withdraw", withdraw);

		Move knockoff = new Move("Knock Off");
		knockoff.setBP(65);
		knockoff.setZBP(120);
		knockoff.setCategory(1);
		knockoff.setType("Dark");
		knockoff.setMakesContact(true);
		movedex.put("Knock Off", knockoff);

		Move hornleech = new Move("Horn Leech");
		hornleech.setBP(75);
		hornleech.setZBP(140);
		hornleech.setCategory(1);
		hornleech.setType("Grass");
		hornleech.setMakesContact(true);
		movedex.put("Horn Leech", hornleech);

		Move hydrocannon = new Move("Hydro Cannon");
		hydrocannon.setBP(150);
		hydrocannon.setZBP(200);
		hydrocannon.setCategory(2);
		hydrocannon.setType("Water");
		movedex.put("Hydro Cannon", hydrocannon);

		Move sweetkiss = new Move("Sweet Kiss");
		sweetkiss.setBP(0);
		sweetkiss.setZBP(0);
		sweetkiss.setCategory(0);
		sweetkiss.setType("Fairy");
		movedex.put("Sweet Kiss", sweetkiss);

		Move sandtomb = new Move("Sand Tomb");
		sandtomb.setBP(35);
		sandtomb.setZBP(100);
		sandtomb.setCategory(1);
		sandtomb.setType("Ground");
		movedex.put("Sand Tomb", sandtomb);

		Move spikyshield = new Move("Spiky Shield");
		spikyshield.setBP(0);
		spikyshield.setZBP(0);
		spikyshield.setCategory(0);
		spikyshield.setType("Grass");
		movedex.put("Spiky Shield", spikyshield);

		Move steamroller = new Move("Steamroller");
		steamroller.setBP(65);
		steamroller.setZBP(120);
		steamroller.setCategory(1);
		steamroller.setType("Bug");
		steamroller.setMakesContact(true);
		steamroller.setHasSecondaryEffect(true);
		movedex.put("Steamroller", steamroller);

		Move firespin = new Move("Fire Spin");
		firespin.setBP(35);
		firespin.setZBP(100);
		firespin.setCategory(2);
		firespin.setType("Fire");
		movedex.put("Fire Spin", firespin);

		Move purify = new Move("Purify");
		purify.setBP(0);
		purify.setZBP(0);
		purify.setCategory(0);
		purify.setType("Poison");
		movedex.put("Purify", purify);

		Move foulplay = new Move("Foul Play");
		foulplay.setBP(95);
		foulplay.setZBP(175);
		foulplay.setCategory(1);
		foulplay.setType("Dark");
		foulplay.setMakesContact(true);
		movedex.put("Foul Play", foulplay);

		Move metalclaw = new Move("Metal Claw");
		metalclaw.setBP(50);
		metalclaw.setZBP(100);
		metalclaw.setCategory(1);
		metalclaw.setType("Steel");
		metalclaw.setMakesContact(true);
		metalclaw.setHasSecondaryEffect(true);
		movedex.put("Metal Claw", metalclaw);

		Move psywave = new Move("Psywave");
		psywave.setBP(0);
		psywave.setZBP(100);
		psywave.setCategory(2);
		psywave.setType("Psychic");
		movedex.put("Psywave", psywave);

		Move icywind = new Move("Icy Wind");
		icywind.setBP(55);
		icywind.setZBP(100);
		icywind.setCategory(2);
		icywind.setType("Ice");
		icywind.setIsSpread(true);
		icywind.setHasSecondaryEffect(true);
		movedex.put("Icy Wind", icywind);

		Move block = new Move("Block");
		block.setBP(0);
		block.setZBP(0);
		block.setCategory(0);
		block.setType("Normal");
		movedex.put("Block", block);

		Move mimic = new Move("Mimic");
		mimic.setBP(0);
		mimic.setZBP(0);
		mimic.setCategory(0);
		mimic.setType("Normal");
		movedex.put("Mimic", mimic);

		Move bonerush = new Move("Bone Rush");
		bonerush.setBP(25);
		bonerush.setZBP(140);
		bonerush.setCategory(1);
		bonerush.setType("Ground");
		bonerush.setIsMultiHit(true);
		movedex.put("Bone Rush", bonerush);

		Move smokescreen = new Move("Smokescreen");
		smokescreen.setBP(0);
		smokescreen.setZBP(0);
		smokescreen.setCategory(0);
		smokescreen.setType("Normal");
		movedex.put("Smokescreen", smokescreen);

		Move clamp = new Move("Clamp");
		clamp.setBP(35);
		clamp.setZBP(100);
		clamp.setCategory(1);
		clamp.setType("Water");
		clamp.setMakesContact(true);
		movedex.put("Clamp", clamp);

		Move cometpunch = new Move("Comet Punch");
		cometpunch.setBP(18);
		cometpunch.setZBP(100);
		cometpunch.setCategory(1);
		cometpunch.setType("Normal");
		cometpunch.setMakesContact(true);
		cometpunch.setIsMultiHit(true);
		cometpunch.setIsPunch(true);
		movedex.put("Comet Punch", cometpunch);

		Move peck = new Move("Peck");
		peck.setBP(35);
		peck.setZBP(100);
		peck.setCategory(1);
		peck.setType("Flying");
		peck.setMakesContact(true);
		movedex.put("Peck", peck);

		Move freezeshock = new Move("Freeze Shock");
		freezeshock.setBP(140);
		freezeshock.setZBP(200);
		freezeshock.setCategory(1);
		freezeshock.setType("Ice");
		freezeshock.setHasSecondaryEffect(true);
		movedex.put("Freeze Shock", freezeshock);

		Move defog = new Move("Defog");
		defog.setBP(0);
		defog.setZBP(0);
		defog.setCategory(0);
		defog.setType("Flying");
		movedex.put("Defog", defog);

		Move foresight = new Move("Foresight");
		foresight.setBP(0);
		foresight.setZBP(0);
		foresight.setCategory(0);
		foresight.setType("Normal");
		movedex.put("Foresight", foresight);

		Move hiddenpowerice = new Move("Hidden Power Ice");
		hiddenpowerice.setBP(60);
		hiddenpowerice.setZBP(0);
		hiddenpowerice.setCategory(2);
		hiddenpowerice.setType("Ice");
		movedex.put("Hidden Power Ice", hiddenpowerice);

		Move clearsmog = new Move("Clear Smog");
		clearsmog.setBP(50);
		clearsmog.setZBP(100);
		clearsmog.setCategory(2);
		clearsmog.setType("Poison");
		movedex.put("Clear Smog", clearsmog);

		Move dragonclaw = new Move("Dragon Claw");
		dragonclaw.setBP(80);
		dragonclaw.setZBP(160);
		dragonclaw.setCategory(1);
		dragonclaw.setType("Dragon");
		dragonclaw.setMakesContact(true);
		movedex.put("Dragon Claw", dragonclaw);

		Move curse = new Move("Curse");
		curse.setBP(0);
		curse.setZBP(0);
		curse.setCategory(0);
		curse.setType("Ghost");
		movedex.put("Curse", curse);

		Move shellsmash = new Move("Shell Smash");
		shellsmash.setBP(0);
		shellsmash.setZBP(0);
		shellsmash.setCategory(0);
		shellsmash.setType("Normal");
		movedex.put("Shell Smash", shellsmash);

		Move circlethrow = new Move("Circle Throw");
		circlethrow.setBP(60);
		circlethrow.setZBP(120);
		circlethrow.setCategory(1);
		circlethrow.setType("Fighting");
		circlethrow.setMakesContact(true);
		circlethrow.setHasSecondaryEffect(true);
		movedex.put("Circle Throw", circlethrow);

		Move waterpulse = new Move("Water Pulse");
		waterpulse.setBP(60);
		waterpulse.setZBP(120);
		waterpulse.setCategory(2);
		waterpulse.setType("Water");
		waterpulse.setHasSecondaryEffect(true);
		movedex.put("Water Pulse", waterpulse);

		Move magicalleaf = new Move("Magical Leaf");
		magicalleaf.setBP(60);
		magicalleaf.setZBP(120);
		magicalleaf.setCategory(2);
		magicalleaf.setType("Grass");
		movedex.put("Magical Leaf", magicalleaf);

		Move supersonic = new Move("Supersonic");
		supersonic.setBP(0);
		supersonic.setZBP(0);
		supersonic.setCategory(0);
		supersonic.setType("Normal");
		movedex.put("Supersonic", supersonic);

		Move lavaplume = new Move("Lava Plume");
		lavaplume.setBP(80);
		lavaplume.setZBP(160);
		lavaplume.setCategory(2);
		lavaplume.setType("Fire");
		lavaplume.setIsSpread(true);
		lavaplume.setHasSecondaryEffect(true);
		movedex.put("Lava Plume", lavaplume);

		Move thief = new Move("Thief");
		thief.setBP(60);
		thief.setZBP(120);
		thief.setCategory(1);
		thief.setType("Dark");
		thief.setMakesContact(true);
		movedex.put("Thief", thief);

		Move thunderbolt = new Move("Thunderbolt");
		thunderbolt.setBP(90);
		thunderbolt.setZBP(175);
		thunderbolt.setCategory(2);
		thunderbolt.setType("Electric");
		thunderbolt.setHasSecondaryEffect(true);
		movedex.put("Thunderbolt", thunderbolt);

		Move pursuit = new Move("Pursuit");
		pursuit.setBP(40);
		pursuit.setZBP(100);
		pursuit.setCategory(1);
		pursuit.setType("Dark");
		pursuit.setMakesContact(true);
		movedex.put("Pursuit", pursuit);

		Move dragondance = new Move("Dragon Dance");
		dragondance.setBP(0);
		dragondance.setZBP(0);
		dragondance.setCategory(0);
		dragondance.setType("Dragon");
		movedex.put("Dragon Dance", dragondance);

		Move burnup = new Move("Burn Up");
		burnup.setBP(130);
		burnup.setZBP(195);
		burnup.setCategory(2);
		burnup.setType("Fire");
		movedex.put("Burn Up", burnup);

		Move highhorsepower = new Move("High Horsepower");
		highhorsepower.setBP(95);
		highhorsepower.setZBP(175);
		highhorsepower.setCategory(1);
		highhorsepower.setType("Ground");
		highhorsepower.setMakesContact(true);
		movedex.put("High Horsepower", highhorsepower);

		Move bulletpunch = new Move("Bullet Punch");
		bulletpunch.setBP(40);
		bulletpunch.setZBP(100);
		bulletpunch.setCategory(1);
		bulletpunch.setType("Steel");
		bulletpunch.setMakesContact(true);
		bulletpunch.setIsPunch(true);
		movedex.put("Bullet Punch", bulletpunch);

		Move boomburst = new Move("Boomburst");
		boomburst.setBP(140);
		boomburst.setZBP(200);
		boomburst.setCategory(2);
		boomburst.setType("Normal");
		boomburst.setIsSpread(true);
		movedex.put("Boomburst", boomburst);

		Move waterpledge = new Move("Water Pledge");
		waterpledge.setBP(80);
		waterpledge.setZBP(160);
		waterpledge.setCategory(2);
		waterpledge.setType("Water");
		movedex.put("Water Pledge", waterpledge);

		Move lovelykiss = new Move("Lovely Kiss");
		lovelykiss.setBP(0);
		lovelykiss.setZBP(0);
		lovelykiss.setCategory(0);
		lovelykiss.setType("Normal");
		movedex.put("Lovely Kiss", lovelykiss);

		Move bubble = new Move("Bubble");
		bubble.setBP(40);
		bubble.setZBP(100);
		bubble.setCategory(2);
		bubble.setType("Water");
		bubble.setIsSpread(true);
		bubble.setHasSecondaryEffect(true);
		movedex.put("Bubble", bubble);

		Move fissure = new Move("Fissure");
		fissure.setBP(0);
		fissure.setZBP(180);
		fissure.setCategory(1);
		fissure.setType("Ground");
		movedex.put("Fissure", fissure);

		Move guardswap = new Move("Guard Swap");
		guardswap.setBP(0);
		guardswap.setZBP(0);
		guardswap.setCategory(0);
		guardswap.setType("Psychic");
		movedex.put("Guard Swap", guardswap);

		Move imprison = new Move("Imprison");
		imprison.setBP(0);
		imprison.setZBP(0);
		imprison.setCategory(0);
		imprison.setType("Psychic");
		movedex.put("Imprison", imprison);

		Move grudge = new Move("Grudge");
		grudge.setBP(0);
		grudge.setZBP(0);
		grudge.setCategory(0);
		grudge.setType("Ghost");
		movedex.put("Grudge", grudge);

		Move grasswhistle = new Move("Grass Whistle");
		grasswhistle.setBP(0);
		grasswhistle.setZBP(0);
		grasswhistle.setCategory(0);
		grasswhistle.setType("Grass");
		movedex.put("Grass Whistle", grasswhistle);

		Move payday = new Move("Pay Day");
		payday.setBP(40);
		payday.setZBP(100);
		payday.setCategory(1);
		payday.setType("Normal");
		movedex.put("Pay Day", payday);

		Move alloutpummeling = new Move("All-Out Pummeling");
		alloutpummeling.setBP(1);
		alloutpummeling.setZBP(0);
		alloutpummeling.setCategory(1);
		alloutpummeling.setType("Fighting");
		movedex.put("All-Out Pummeling", alloutpummeling);

		Move hydropump = new Move("Hydro Pump");
		hydropump.setBP(110);
		hydropump.setZBP(185);
		hydropump.setCategory(2);
		hydropump.setType("Water");
		movedex.put("Hydro Pump", hydropump);

		Move encore = new Move("Encore");
		encore.setBP(0);
		encore.setZBP(0);
		encore.setCategory(0);
		encore.setType("Normal");
		movedex.put("Encore", encore);

		Move hornattack = new Move("Horn Attack");
		hornattack.setBP(65);
		hornattack.setZBP(120);
		hornattack.setCategory(1);
		hornattack.setType("Normal");
		hornattack.setMakesContact(true);
		movedex.put("Horn Attack", hornattack);

		Move nightslash = new Move("Night Slash");
		nightslash.setBP(70);
		nightslash.setZBP(140);
		nightslash.setCategory(1);
		nightslash.setType("Dark");
		nightslash.setMakesContact(true);
		movedex.put("Night Slash", nightslash);

		Move nuzzle = new Move("Nuzzle");
		nuzzle.setBP(20);
		nuzzle.setZBP(100);
		nuzzle.setCategory(1);
		nuzzle.setType("Electric");
		nuzzle.setMakesContact(true);
		nuzzle.setHasSecondaryEffect(true);
		movedex.put("Nuzzle", nuzzle);

		Move synthesis = new Move("Synthesis");
		synthesis.setBP(0);
		synthesis.setZBP(0);
		synthesis.setCategory(0);
		synthesis.setType("Grass");
		movedex.put("Synthesis", synthesis);

		Move mudslap = new Move("Mud-Slap");
		mudslap.setBP(20);
		mudslap.setZBP(100);
		mudslap.setCategory(2);
		mudslap.setType("Ground");
		mudslap.setHasSecondaryEffect(true);
		movedex.put("Mud-Slap", mudslap);

		Move electroball = new Move("Electro Ball");
		electroball.setBP(0);
		electroball.setZBP(160);
		electroball.setCategory(2);
		electroball.setType("Electric");
		movedex.put("Electro Ball", electroball);

		Move leaftornado = new Move("Leaf Tornado");
		leaftornado.setBP(65);
		leaftornado.setZBP(120);
		leaftornado.setCategory(2);
		leaftornado.setType("Grass");
		leaftornado.setHasSecondaryEffect(true);
		movedex.put("Leaf Tornado", leaftornado);

		Move infernooverdrive = new Move("Inferno Overdrive");
		infernooverdrive.setBP(1);
		infernooverdrive.setZBP(0);
		infernooverdrive.setCategory(1);
		infernooverdrive.setType("Fire");
		movedex.put("Inferno Overdrive", infernooverdrive);

		Move whirlpool = new Move("Whirlpool");
		whirlpool.setBP(35);
		whirlpool.setZBP(100);
		whirlpool.setCategory(2);
		whirlpool.setType("Water");
		movedex.put("Whirlpool", whirlpool);

		Move rockwrecker = new Move("Rock Wrecker");
		rockwrecker.setBP(150);
		rockwrecker.setZBP(200);
		rockwrecker.setCategory(1);
		rockwrecker.setType("Rock");
		movedex.put("Rock Wrecker", rockwrecker);

		Move ancientpower = new Move("Ancient Power");
		ancientpower.setBP(60);
		ancientpower.setZBP(120);
		ancientpower.setCategory(2);
		ancientpower.setType("Rock");
		ancientpower.setHasSecondaryEffect(true);
		movedex.put("Ancient Power", ancientpower);

		Move meditate = new Move("Meditate");
		meditate.setBP(0);
		meditate.setZBP(0);
		meditate.setCategory(0);
		meditate.setType("Psychic");
		movedex.put("Meditate", meditate);

		Move signalbeam = new Move("Signal Beam");
		signalbeam.setBP(75);
		signalbeam.setZBP(140);
		signalbeam.setCategory(2);
		signalbeam.setType("Bug");
		signalbeam.setHasSecondaryEffect(true);
		movedex.put("Signal Beam", signalbeam);

		Move bodyslam = new Move("Body Slam");
		bodyslam.setBP(85);
		bodyslam.setZBP(160);
		bodyslam.setCategory(1);
		bodyslam.setType("Normal");
		bodyslam.setMakesContact(true);
		bodyslam.setHasSecondaryEffect(true);
		movedex.put("Body Slam", bodyslam);

		Move trumpcard = new Move("Trump Card");
		trumpcard.setBP(0);
		trumpcard.setZBP(160);
		trumpcard.setCategory(2);
		trumpcard.setType("Normal");
		trumpcard.setMakesContact(true);
		movedex.put("Trump Card", trumpcard);

		Move punishment = new Move("Punishment");
		punishment.setBP(0);
		punishment.setZBP(160);
		punishment.setCategory(1);
		punishment.setType("Dark");
		punishment.setMakesContact(true);
		movedex.put("Punishment", punishment);

		Move reversal = new Move("Reversal");
		reversal.setBP(0);
		reversal.setZBP(160);
		reversal.setCategory(1);
		reversal.setType("Fighting");
		reversal.setMakesContact(true);
		movedex.put("Reversal", reversal);

		Move genesissupernova = new Move("Genesis Supernova");
		genesissupernova.setBP(185);
		genesissupernova.setZBP(0);
		genesissupernova.setCategory(2);
		genesissupernova.setType("Psychic");
		genesissupernova.setHasSecondaryEffect(true);
		genesissupernova.setIsSignatureZ(true);
		movedex.put("Genesis Supernova", genesissupernova);

		Move disable = new Move("Disable");
		disable.setBP(0);
		disable.setZBP(0);
		disable.setCategory(0);
		disable.setType("Normal");
		movedex.put("Disable", disable);

		Move quickattack = new Move("Quick Attack");
		quickattack.setBP(40);
		quickattack.setZBP(100);
		quickattack.setCategory(1);
		quickattack.setType("Normal");
		quickattack.setMakesContact(true);
		movedex.put("Quick Attack", quickattack);

		Move vcreate = new Move("V-create");
		vcreate.setBP(180);
		vcreate.setZBP(220);
		vcreate.setCategory(1);
		vcreate.setType("Fire");
		vcreate.setMakesContact(true);
		movedex.put("V-create", vcreate);

		Move boltstrike = new Move("Bolt Strike");
		boltstrike.setBP(130);
		boltstrike.setZBP(195);
		boltstrike.setCategory(1);
		boltstrike.setType("Electric");
		boltstrike.setMakesContact(true);
		boltstrike.setHasSecondaryEffect(true);
		movedex.put("Bolt Strike", boltstrike);

		Move headcharge = new Move("Head Charge");
		headcharge.setBP(120);
		headcharge.setZBP(190);
		headcharge.setCategory(1);
		headcharge.setType("Normal");
		headcharge.setMakesContact(true);
		headcharge.setHasRecoil(true);
		movedex.put("Head Charge", headcharge);

		Move returnMove = new Move("Return");
		returnMove.setBP(102);
		returnMove.setZBP(160);
		returnMove.setCategory(1);
		returnMove.setType("Normal");
		returnMove.setMakesContact(true);
		movedex.put("Return", returnMove);

		Move inferno = new Move("Inferno");
		inferno.setBP(100);
		inferno.setZBP(180);
		inferno.setCategory(2);
		inferno.setType("Fire");
		inferno.setHasSecondaryEffect(true);
		movedex.put("Inferno", inferno);

		Move machpunch = new Move("Mach Punch");
		machpunch.setBP(40);
		machpunch.setZBP(100);
		machpunch.setCategory(1);
		machpunch.setType("Fighting");
		machpunch.setMakesContact(true);
		machpunch.setIsPunch(true);
		movedex.put("Mach Punch", machpunch);

		Move sinisterarrowraid = new Move("Sinister Arrow Raid");
		sinisterarrowraid.setBP(180);
		sinisterarrowraid.setZBP(0);
		sinisterarrowraid.setCategory(1);
		sinisterarrowraid.setType("Ghost");
		sinisterarrowraid.setIsSignatureZ(true);
		movedex.put("Sinister Arrow Raid", sinisterarrowraid);

		Move smog = new Move("Smog");
		smog.setBP(30);
		smog.setZBP(100);
		smog.setCategory(2);
		smog.setType("Poison");
		smog.setHasSecondaryEffect(true);
		movedex.put("Smog", smog);

		Move outrage = new Move("Outrage");
		outrage.setBP(120);
		outrage.setZBP(190);
		outrage.setCategory(1);
		outrage.setType("Dragon");
		outrage.setMakesContact(true);
		movedex.put("Outrage", outrage);

		Move lunge = new Move("Lunge");
		lunge.setBP(80);
		lunge.setZBP(160);
		lunge.setCategory(1);
		lunge.setType("Bug");
		lunge.setMakesContact(true);
		lunge.setHasSecondaryEffect(true);
		movedex.put("Lunge", lunge);

		Move focuspunch = new Move("Focus Punch");
		focuspunch.setBP(150);
		focuspunch.setZBP(200);
		focuspunch.setCategory(1);
		focuspunch.setType("Fighting");
		focuspunch.setMakesContact(true);
		focuspunch.setIsPunch(true);
		movedex.put("Focus Punch", focuspunch);

		Move shockwave = new Move("Shock Wave");
		shockwave.setBP(60);
		shockwave.setZBP(120);
		shockwave.setCategory(2);
		shockwave.setType("Electric");
		movedex.put("Shock Wave", shockwave);

		Move frostbreath = new Move("Frost Breath");
		frostbreath.setBP(60);
		frostbreath.setZBP(120);
		frostbreath.setCategory(2);
		frostbreath.setType("Ice");
		movedex.put("Frost Breath", frostbreath);

		Move swagger = new Move("Swagger");
		swagger.setBP(0);
		swagger.setZBP(0);
		swagger.setCategory(0);
		swagger.setType("Normal");
		movedex.put("Swagger", swagger);

		Move silverwind = new Move("Silver Wind");
		silverwind.setBP(60);
		silverwind.setZBP(120);
		silverwind.setCategory(2);
		silverwind.setType("Bug");
		silverwind.setHasSecondaryEffect(true);
		movedex.put("Silver Wind", silverwind);

		Move anchorshot = new Move("Anchor Shot");
		anchorshot.setBP(80);
		anchorshot.setZBP(160);
		anchorshot.setCategory(1);
		anchorshot.setType("Steel");
		anchorshot.setMakesContact(true);
		anchorshot.setHasSecondaryEffect(true);
		movedex.put("Anchor Shot", anchorshot);

		Move iciclespear = new Move("Icicle Spear");
		iciclespear.setBP(25);
		iciclespear.setZBP(140);
		iciclespear.setCategory(1);
		iciclespear.setType("Ice");
		iciclespear.setIsMultiHit(true);
		movedex.put("Icicle Spear", iciclespear);

		Move meteormash = new Move("Meteor Mash");
		meteormash.setBP(90);
		meteormash.setZBP(175);
		meteormash.setCategory(1);
		meteormash.setType("Steel");
		meteormash.setMakesContact(true);
		meteormash.setHasSecondaryEffect(true);
		meteormash.setIsPunch(true);
		movedex.put("Meteor Mash", meteormash);

		Move judgment = new Move("Judgment");
		judgment.setBP(100);
		judgment.setZBP(180);
		judgment.setCategory(2);
		judgment.setType("Normal");
		movedex.put("Judgment", judgment);

		Move metronome = new Move("Metronome");
		metronome.setBP(0);
		metronome.setZBP(0);
		metronome.setCategory(0);
		metronome.setType("Normal");
		movedex.put("Metronome", metronome);

		Move searingshot = new Move("Searing Shot");
		searingshot.setBP(100);
		searingshot.setZBP(180);
		searingshot.setCategory(2);
		searingshot.setType("Fire");
		searingshot.setIsSpread(true);
		searingshot.setHasSecondaryEffect(true);
		movedex.put("Searing Shot", searingshot);

		Move thunderwave = new Move("Thunder Wave");
		thunderwave.setBP(0);
		thunderwave.setZBP(0);
		thunderwave.setCategory(0);
		thunderwave.setType("Electric");
		movedex.put("Thunder Wave", thunderwave);

		Move acupressure = new Move("Acupressure");
		acupressure.setBP(0);
		acupressure.setZBP(0);
		acupressure.setCategory(0);
		acupressure.setType("Normal");
		movedex.put("Acupressure", acupressure);

		Move mistyterrain = new Move("Misty Terrain");
		mistyterrain.setBP(0);
		mistyterrain.setZBP(0);
		mistyterrain.setCategory(0);
		mistyterrain.setType("Fairy");
		movedex.put("Misty Terrain", mistyterrain);

		Move moongeistbeam = new Move("Moongeist Beam");
		moongeistbeam.setBP(100);
		moongeistbeam.setZBP(180);
		moongeistbeam.setCategory(2);
		moongeistbeam.setType("Ghost");
		movedex.put("Moongeist Beam", moongeistbeam);

		Move superfang = new Move("Super Fang");
		superfang.setBP(0);
		superfang.setZBP(100);
		superfang.setCategory(1);
		superfang.setType("Normal");
		superfang.setMakesContact(true);
		movedex.put("Super Fang", superfang);

		Move icebeam = new Move("Ice Beam");
		icebeam.setBP(90);
		icebeam.setZBP(175);
		icebeam.setCategory(2);
		icebeam.setType("Ice");
		icebeam.setHasSecondaryEffect(true);
		movedex.put("Ice Beam", icebeam);

		Move toxic = new Move("Toxic");
		toxic.setBP(0);
		toxic.setZBP(0);
		toxic.setCategory(0);
		toxic.setType("Poison");
		movedex.put("Toxic", toxic);

		Move icefang = new Move("Ice Fang");
		icefang.setBP(65);
		icefang.setZBP(120);
		icefang.setCategory(1);
		icefang.setType("Ice");
		icefang.setMakesContact(true);
		icefang.setHasSecondaryEffect(true);
		icefang.setIsBite(true);
		movedex.put("Ice Fang", icefang);

		Move roaroftime = new Move("Roar of Time");
		roaroftime.setBP(150);
		roaroftime.setZBP(200);
		roaroftime.setCategory(2);
		roaroftime.setType("Dragon");
		movedex.put("Roar of Time", roaroftime);

		Move lusterpurge = new Move("Luster Purge");
		lusterpurge.setBP(70);
		lusterpurge.setZBP(140);
		lusterpurge.setCategory(2);
		lusterpurge.setType("Psychic");
		lusterpurge.setHasSecondaryEffect(true);
		movedex.put("Luster Purge", lusterpurge);

		Move spacialrend = new Move("Spacial Rend");
		spacialrend.setBP(100);
		spacialrend.setZBP(180);
		spacialrend.setCategory(2);
		spacialrend.setType("Dragon");
		movedex.put("Spacial Rend", spacialrend);

		Move voltswitch = new Move("Volt Switch");
		voltswitch.setBP(70);
		voltswitch.setZBP(140);
		voltswitch.setCategory(2);
		voltswitch.setType("Electric");
		movedex.put("Volt Switch", voltswitch);

		Move synchronoise = new Move("Synchronoise");
		synchronoise.setBP(120);
		synchronoise.setZBP(190);
		synchronoise.setCategory(2);
		synchronoise.setType("Psychic");
		synchronoise.setIsSpread(true);
		movedex.put("Synchronoise", synchronoise);

		Move hyperspacefury = new Move("Hyperspace Fury");
		hyperspacefury.setBP(100);
		hyperspacefury.setZBP(180);
		hyperspacefury.setCategory(1);
		hyperspacefury.setType("Dark");
		movedex.put("Hyperspace Fury", hyperspacefury);

		Move slackoff = new Move("Slack Off");
		slackoff.setBP(0);
		slackoff.setZBP(0);
		slackoff.setCategory(0);
		slackoff.setType("Normal");
		movedex.put("Slack Off", slackoff);

		Move toxicspikes = new Move("Toxic Spikes");
		toxicspikes.setBP(0);
		toxicspikes.setZBP(0);
		toxicspikes.setCategory(0);
		toxicspikes.setType("Poison");
		movedex.put("Toxic Spikes", toxicspikes);

		Move stoneedge = new Move("Stone Edge");
		stoneedge.setBP(100);
		stoneedge.setZBP(180);
		stoneedge.setCategory(1);
		stoneedge.setType("Rock");
		movedex.put("Stone Edge", stoneedge);

		Move sacredsword = new Move("Sacred Sword");
		sacredsword.setBP(90);
		sacredsword.setZBP(175);
		sacredsword.setCategory(1);
		sacredsword.setType("Fighting");
		sacredsword.setMakesContact(true);
		sacredsword.setIgnoresDefenseBoosts(true);
		movedex.put("Sacred Sword", sacredsword);

		Move dragonhammer = new Move("Dragon Hammer");
		dragonhammer.setBP(90);
		dragonhammer.setZBP(175);
		dragonhammer.setCategory(1);
		dragonhammer.setType("Dragon");
		dragonhammer.setMakesContact(true);
		movedex.put("Dragon Hammer", dragonhammer);

		Move rototiller = new Move("Rototiller");
		rototiller.setBP(0);
		rototiller.setZBP(0);
		rototiller.setCategory(0);
		rototiller.setType("Ground");
		movedex.put("Rototiller", rototiller);

		Move helpinghand = new Move("Helping Hand");
		helpinghand.setBP(0);
		helpinghand.setZBP(0);
		helpinghand.setCategory(0);
		helpinghand.setType("Normal");
		movedex.put("Helping Hand", helpinghand);

		Move confide = new Move("Confide");
		confide.setBP(0);
		confide.setZBP(0);
		confide.setCategory(0);
		confide.setType("Normal");
		movedex.put("Confide", confide);

		Move psystrike = new Move("Psystrike");
		psystrike.setBP(100);
		psystrike.setZBP(180);
		psystrike.setCategory(3);
		psystrike.setType("Psychic");
		movedex.put("Psystrike", psystrike);

		Move devastatingdrake = new Move("Devastating Drake");
		devastatingdrake.setBP(1);
		devastatingdrake.setZBP(0);
		devastatingdrake.setCategory(1);
		devastatingdrake.setType("Dragon");
		movedex.put("Devastating Drake", devastatingdrake);

		Move airslash = new Move("Air Slash");
		airslash.setBP(75);
		airslash.setZBP(140);
		airslash.setCategory(2);
		airslash.setType("Flying");
		airslash.setHasSecondaryEffect(true);
		movedex.put("Air Slash", airslash);

		Move present = new Move("Present");
		present.setBP(0);
		present.setZBP(100);
		present.setCategory(1);
		present.setType("Normal");
		movedex.put("Present", present);

		Move fellstinger = new Move("Fell Stinger");
		fellstinger.setBP(50);
		fellstinger.setZBP(100);
		fellstinger.setCategory(1);
		fellstinger.setType("Bug");
		fellstinger.setMakesContact(true);
		movedex.put("Fell Stinger", fellstinger);

		Move stealthrock = new Move("Stealth Rock");
		stealthrock.setBP(0);
		stealthrock.setZBP(0);
		stealthrock.setCategory(0);
		stealthrock.setType("Rock");
		movedex.put("Stealth Rock", stealthrock);

		Move crabhammer = new Move("Crabhammer");
		crabhammer.setBP(100);
		crabhammer.setZBP(180);
		crabhammer.setCategory(1);
		crabhammer.setType("Water");
		crabhammer.setMakesContact(true);
		movedex.put("Crabhammer", crabhammer);

		Move barrage = new Move("Barrage");
		barrage.setBP(15);
		barrage.setZBP(100);
		barrage.setCategory(1);
		barrage.setType("Normal");
		barrage.setIsMultiHit(true);
		movedex.put("Barrage", barrage);

		Move aurasphere = new Move("Aura Sphere");
		aurasphere.setBP(80);
		aurasphere.setZBP(160);
		aurasphere.setCategory(2);
		aurasphere.setType("Fighting");
		movedex.put("Aura Sphere", aurasphere);

		Move magmastorm = new Move("Magma Storm");
		magmastorm.setBP(100);
		magmastorm.setZBP(180);
		magmastorm.setCategory(2);
		magmastorm.setType("Fire");
		movedex.put("Magma Storm", magmastorm);

		Move chatter = new Move("Chatter");
		chatter.setBP(65);
		chatter.setZBP(120);
		chatter.setCategory(2);
		chatter.setType("Flying");
		chatter.setHasSecondaryEffect(true);
		movedex.put("Chatter", chatter);

		Move teleport = new Move("Teleport");
		teleport.setBP(0);
		teleport.setZBP(0);
		teleport.setCategory(0);
		teleport.setType("Psychic");
		movedex.put("Teleport", teleport);

		Move aquaring = new Move("Aqua Ring");
		aquaring.setBP(0);
		aquaring.setZBP(0);
		aquaring.setCategory(0);
		aquaring.setType("Water");
		movedex.put("Aqua Ring", aquaring);

		Move roost = new Move("Roost");
		roost.setBP(0);
		roost.setZBP(0);
		roost.setCategory(0);
		roost.setType("Flying");
		movedex.put("Roost", roost);

		Move sandstorm = new Move("Sandstorm");
		sandstorm.setBP(0);
		sandstorm.setZBP(0);
		sandstorm.setCategory(0);
		sandstorm.setType("Rock");
		movedex.put("Sandstorm", sandstorm);

		Move venomdrench = new Move("Venom Drench");
		venomdrench.setBP(0);
		venomdrench.setZBP(0);
		venomdrench.setCategory(0);
		venomdrench.setType("Poison");
		venomdrench.setIsSpread(true);
		movedex.put("Venom Drench", venomdrench);

		Move poweruppunch = new Move("Power-Up Punch");
		poweruppunch.setBP(40);
		poweruppunch.setZBP(100);
		poweruppunch.setCategory(1);
		poweruppunch.setType("Fighting");
		poweruppunch.setMakesContact(true);
		poweruppunch.setHasSecondaryEffect(true);
		poweruppunch.setIsPunch(true);
		movedex.put("Power-Up Punch", poweruppunch);

		Move flyingpress = new Move("Flying Press");
		flyingpress.setBP(100);
		flyingpress.setZBP(170);
		flyingpress.setCategory(1);
		flyingpress.setType("Fighting");
		flyingpress.setMakesContact(true);
		movedex.put("Flying Press", flyingpress);

		Move trick = new Move("Trick");
		trick.setBP(0);
		trick.setZBP(0);
		trick.setCategory(0);
		trick.setType("Psychic");
		movedex.put("Trick", trick);

		Move venoshock = new Move("Venoshock");
		venoshock.setBP(65);
		venoshock.setZBP(120);
		venoshock.setCategory(2);
		venoshock.setType("Poison");
		movedex.put("Venoshock", venoshock);

		Move heatcrash = new Move("Heat Crash");
		heatcrash.setBP(0);
		heatcrash.setZBP(160);
		heatcrash.setCategory(1);
		heatcrash.setType("Fire");
		heatcrash.setMakesContact(true);
		movedex.put("Heat Crash", heatcrash);

		Move vicegrip = new Move("Vice Grip");
		vicegrip.setBP(55);
		vicegrip.setZBP(100);
		vicegrip.setCategory(1);
		vicegrip.setType("Normal");
		vicegrip.setMakesContact(true);
		movedex.put("Vice Grip", vicegrip);

		Move harden = new Move("Harden");
		harden.setBP(0);
		harden.setZBP(0);
		harden.setCategory(0);
		harden.setType("Normal");
		movedex.put("Harden", harden);

		Move doublehit = new Move("Double Hit");
		doublehit.setBP(35);
		doublehit.setZBP(140);
		doublehit.setCategory(1);
		doublehit.setType("Normal");
		doublehit.setMakesContact(true);
		doublehit.setIsTwoHit(true);
		movedex.put("Double Hit", doublehit);

		Move furyswipes = new Move("Fury Swipes");
		furyswipes.setBP(18);
		furyswipes.setZBP(100);
		furyswipes.setCategory(1);
		furyswipes.setType("Normal");
		furyswipes.setMakesContact(true);
		furyswipes.setIsMultiHit(true);
		movedex.put("Fury Swipes", furyswipes);

		Move transform = new Move("Transform");
		transform.setBP(0);
		transform.setZBP(0);
		transform.setCategory(0);
		transform.setType("Normal");
		movedex.put("Transform", transform);

		Move haze = new Move("Haze");
		haze.setBP(0);
		haze.setZBP(0);
		haze.setCategory(0);
		haze.setType("Ice");
		movedex.put("Haze", haze);

		Move flamethrower = new Move("Flamethrower");
		flamethrower.setBP(90);
		flamethrower.setZBP(175);
		flamethrower.setCategory(2);
		flamethrower.setType("Fire");
		flamethrower.setHasSecondaryEffect(true);
		movedex.put("Flamethrower", flamethrower);

		Move hiddenpowerpoison = new Move("Hidden Power Poison");
		hiddenpowerpoison.setBP(60);
		hiddenpowerpoison.setZBP(0);
		hiddenpowerpoison.setCategory(2);
		hiddenpowerpoison.setType("Poison");
		movedex.put("Hidden Power Poison", hiddenpowerpoison);

		Move skillswap = new Move("Skill Swap");
		skillswap.setBP(0);
		skillswap.setZBP(0);
		skillswap.setCategory(0);
		skillswap.setType("Psychic");
		movedex.put("Skill Swap", skillswap);

		Move magnitude = new Move("Magnitude");
		magnitude.setBP(0);
		magnitude.setZBP(140);
		magnitude.setCategory(1);
		magnitude.setType("Ground");
		magnitude.setIsSpread(true);
		movedex.put("Magnitude", magnitude);

		Move dive = new Move("Dive");
		dive.setBP(80);
		dive.setZBP(160);
		dive.setCategory(1);
		dive.setType("Water");
		dive.setMakesContact(true);
		movedex.put("Dive", dive);

		Move mirrorcoat = new Move("Mirror Coat");
		mirrorcoat.setBP(0);
		mirrorcoat.setZBP(100);
		mirrorcoat.setCategory(2);
		mirrorcoat.setType("Psychic");
		movedex.put("Mirror Coat", mirrorcoat);

		Move darkvoid = new Move("Dark Void");
		darkvoid.setBP(0);
		darkvoid.setZBP(0);
		darkvoid.setCategory(0);
		darkvoid.setType("Dark");
		darkvoid.setIsSpread(true);
		movedex.put("Dark Void", darkvoid);

		Move doubleslap = new Move("Double Slap");
		doubleslap.setBP(15);
		doubleslap.setZBP(100);
		doubleslap.setCategory(1);
		doubleslap.setType("Normal");
		doubleslap.setMakesContact(true);
		doubleslap.setIsMultiHit(true);
		movedex.put("Double Slap", doubleslap);

		Move geargrind = new Move("Gear Grind");
		geargrind.setBP(50);
		geargrind.setZBP(180);
		geargrind.setCategory(1);
		geargrind.setType("Steel");
		geargrind.setMakesContact(true);
		geargrind.setIsTwoHit(true);
		movedex.put("Gear Grind", geargrind);

		Move recover = new Move("Recover");
		recover.setBP(0);
		recover.setZBP(0);
		recover.setCategory(0);
		recover.setType("Normal");
		movedex.put("Recover", recover);

		Move oblivionwing = new Move("Oblivion Wing");
		oblivionwing.setBP(80);
		oblivionwing.setZBP(160);
		oblivionwing.setCategory(2);
		oblivionwing.setType("Flying");
		movedex.put("Oblivion Wing", oblivionwing);

		Move supersonicskystrike = new Move("Supersonic Skystrike");
		supersonicskystrike.setBP(1);
		supersonicskystrike.setZBP(0);
		supersonicskystrike.setCategory(1);
		supersonicskystrike.setType("Flying");
		movedex.put("Supersonic Skystrike", supersonicskystrike);

		Move endeavor = new Move("Endeavor");
		endeavor.setBP(0);
		endeavor.setZBP(160);
		endeavor.setCategory(1);
		endeavor.setType("Normal");
		endeavor.setMakesContact(true);
		movedex.put("Endeavor", endeavor);

		Move dragonbreath = new Move("Dragon Breath");
		dragonbreath.setBP(60);
		dragonbreath.setZBP(120);
		dragonbreath.setCategory(2);
		dragonbreath.setType("Dragon");
		dragonbreath.setHasSecondaryEffect(true);
		movedex.put("Dragon Breath", dragonbreath);

		Move gearup = new Move("Gear Up");
		gearup.setBP(0);
		gearup.setZBP(0);
		gearup.setCategory(0);
		gearup.setType("Steel");
		movedex.put("Gear Up", gearup);

		Move naturalgift = new Move("Natural Gift");
		naturalgift.setBP(0);
		naturalgift.setZBP(160);
		naturalgift.setCategory(1);
		naturalgift.setType("Normal");
		movedex.put("Natural Gift", naturalgift);

		Move spore = new Move("Spore");
		spore.setBP(0);
		spore.setZBP(0);
		spore.setCategory(0);
		spore.setType("Grass");
		movedex.put("Spore", spore);

		Move nightdaze = new Move("Night Daze");
		nightdaze.setBP(85);
		nightdaze.setZBP(160);
		nightdaze.setCategory(2);
		nightdaze.setType("Dark");
		nightdaze.setHasSecondaryEffect(true);
		movedex.put("Night Daze", nightdaze);

		Move rockthrow = new Move("Rock Throw");
		rockthrow.setBP(50);
		rockthrow.setZBP(100);
		rockthrow.setCategory(1);
		rockthrow.setType("Rock");
		movedex.put("Rock Throw", rockthrow);

		Move throatchop = new Move("Throat Chop");
		throatchop.setBP(80);
		throatchop.setZBP(160);
		throatchop.setCategory(1);
		throatchop.setType("Dark");
		throatchop.setMakesContact(true);
		throatchop.setHasSecondaryEffect(true);
		movedex.put("Throat Chop", throatchop);

		Move technoblast = new Move("Techno Blast");
		technoblast.setBP(120);
		technoblast.setZBP(190);
		technoblast.setCategory(2);
		technoblast.setType("Normal");
		movedex.put("Techno Blast", technoblast);

		Move sketch = new Move("Sketch");
		sketch.setBP(0);
		sketch.setZBP(0);
		sketch.setCategory(0);
		sketch.setType("Normal");
		movedex.put("Sketch", sketch);

		Move taunt = new Move("Taunt");
		taunt.setBP(0);
		taunt.setZBP(0);
		taunt.setCategory(0);
		taunt.setType("Dark");
		movedex.put("Taunt", taunt);

		Move powertrick = new Move("Power Trick");
		powertrick.setBP(0);
		powertrick.setZBP(0);
		powertrick.setCategory(0);
		powertrick.setType("Psychic");
		movedex.put("Power Trick", powertrick);

		Move tailslap = new Move("Tail Slap");
		tailslap.setBP(25);
		tailslap.setZBP(140);
		tailslap.setCategory(1);
		tailslap.setType("Normal");
		tailslap.setMakesContact(true);
		tailslap.setIsMultiHit(true);
		movedex.put("Tail Slap", tailslap);

		Move paraboliccharge = new Move("Parabolic Charge");
		paraboliccharge.setBP(65);
		paraboliccharge.setZBP(120);
		paraboliccharge.setCategory(2);
		paraboliccharge.setType("Electric");
		paraboliccharge.setIsSpread(true);
		movedex.put("Parabolic Charge", paraboliccharge);

		Move raindance = new Move("Rain Dance");
		raindance.setBP(0);
		raindance.setZBP(0);
		raindance.setCategory(0);
		raindance.setType("Water");
		movedex.put("Rain Dance", raindance);

		Move acidarmor = new Move("Acid Armor");
		acidarmor.setBP(0);
		acidarmor.setZBP(0);
		acidarmor.setCategory(0);
		acidarmor.setType("Poison");
		movedex.put("Acid Armor", acidarmor);

		Move gunkshot = new Move("Gunk Shot");
		gunkshot.setBP(120);
		gunkshot.setZBP(190);
		gunkshot.setCategory(1);
		gunkshot.setType("Poison");
		gunkshot.setHasSecondaryEffect(true);
		movedex.put("Gunk Shot", gunkshot);

		Move cosmicpower = new Move("Cosmic Power");
		cosmicpower.setBP(0);
		cosmicpower.setZBP(0);
		cosmicpower.setCategory(0);
		cosmicpower.setType("Psychic");
		movedex.put("Cosmic Power", cosmicpower);

		Move guardianofalola = new Move("Guardian of Alola");
		guardianofalola.setBP(0);
		guardianofalola.setZBP(0);
		guardianofalola.setCategory(2);
		guardianofalola.setType("Fairy");
		guardianofalola.setIsSignatureZ(true);
		movedex.put("Guardian of Alola", guardianofalola);

		Move petaldance = new Move("Petal Dance");
		petaldance.setBP(120);
		petaldance.setZBP(190);
		petaldance.setCategory(2);
		petaldance.setType("Grass");
		petaldance.setMakesContact(true);
		movedex.put("Petal Dance", petaldance);

		Move lunardance = new Move("Lunar Dance");
		lunardance.setBP(0);
		lunardance.setZBP(0);
		lunardance.setCategory(0);
		lunardance.setType("Psychic");
		movedex.put("Lunar Dance", lunardance);

		Move absorb = new Move("Absorb");
		absorb.setBP(20);
		absorb.setZBP(100);
		absorb.setCategory(2);
		absorb.setType("Grass");
		movedex.put("Absorb", absorb);

		Move sonicboom = new Move("Sonic Boom");
		sonicboom.setBP(0);
		sonicboom.setZBP(100);
		sonicboom.setCategory(2);
		sonicboom.setType("Normal");
		movedex.put("Sonic Boom", sonicboom);

		Move thousandarrows = new Move("Thousand Arrows");
		thousandarrows.setBP(90);
		thousandarrows.setZBP(180);
		thousandarrows.setCategory(1);
		thousandarrows.setType("Ground");
		thousandarrows.setIsSpread(true);
		movedex.put("Thousand Arrows", thousandarrows);

		Move hiddenpowerdragon = new Move("Hidden Power Dragon");
		hiddenpowerdragon.setBP(60);
		hiddenpowerdragon.setZBP(0);
		hiddenpowerdragon.setCategory(2);
		hiddenpowerdragon.setType("Dragon");
		movedex.put("Hidden Power Dragon", hiddenpowerdragon);

		Move psychicfangs = new Move("Psychic Fangs");
		psychicfangs.setBP(85);
		psychicfangs.setZBP(160);
		psychicfangs.setCategory(1);
		psychicfangs.setType("Psychic");
		psychicfangs.setMakesContact(true);
		psychicfangs.setIsBite(true);
		movedex.put("Psychic Fangs", psychicfangs);

		Move iceball = new Move("Ice Ball");
		iceball.setBP(30);
		iceball.setZBP(100);
		iceball.setCategory(1);
		iceball.setType("Ice");
		iceball.setMakesContact(true);
		movedex.put("Ice Ball", iceball);

		Move pulverizingpancake = new Move("Pulverizing Pancake");
		pulverizingpancake.setBP(210);
		pulverizingpancake.setZBP(0);
		pulverizingpancake.setCategory(1);
		pulverizingpancake.setType("Normal");
		pulverizingpancake.setMakesContact(true);
		pulverizingpancake.setIsSignatureZ(true);
		movedex.put("Pulverizing Pancake", pulverizingpancake);

		Move reflect = new Move("Reflect");
		reflect.setBP(0);
		reflect.setZBP(0);
		reflect.setCategory(0);
		reflect.setType("Psychic");
		movedex.put("Reflect", reflect);

		Move happyhour = new Move("Happy Hour");
		happyhour.setBP(0);
		happyhour.setZBP(0);
		happyhour.setCategory(0);
		happyhour.setType("Normal");
		movedex.put("Happy Hour", happyhour);

		Move shadowsneak = new Move("Shadow Sneak");
		shadowsneak.setBP(40);
		shadowsneak.setZBP(100);
		shadowsneak.setCategory(1);
		shadowsneak.setType("Ghost");
		shadowsneak.setMakesContact(true);
		movedex.put("Shadow Sneak", shadowsneak);

		Move shatteredpsyche = new Move("Shattered Psyche");
		shatteredpsyche.setBP(1);
		shatteredpsyche.setZBP(0);
		shatteredpsyche.setCategory(1);
		shatteredpsyche.setType("Psychic");
		movedex.put("Shattered Psyche", shatteredpsyche);

		Move crosschop = new Move("Cross Chop");
		crosschop.setBP(100);
		crosschop.setZBP(180);
		crosschop.setCategory(1);
		crosschop.setType("Fighting");
		crosschop.setMakesContact(true);
		movedex.put("Cross Chop", crosschop);

		Move dreameater = new Move("Dream Eater");
		dreameater.setBP(100);
		dreameater.setZBP(180);
		dreameater.setCategory(2);
		dreameater.setType("Psychic");
		movedex.put("Dream Eater", dreameater);

		Move recycle = new Move("Recycle");
		recycle.setBP(0);
		recycle.setZBP(0);
		recycle.setCategory(0);
		recycle.setType("Normal");
		movedex.put("Recycle", recycle);

		Move drillpeck = new Move("Drill Peck");
		drillpeck.setBP(80);
		drillpeck.setZBP(160);
		drillpeck.setCategory(1);
		drillpeck.setType("Flying");
		drillpeck.setMakesContact(true);
		movedex.put("Drill Peck", drillpeck);

		Move chipaway = new Move("Chip Away");
		chipaway.setBP(70);
		chipaway.setZBP(140);
		chipaway.setCategory(1);
		chipaway.setType("Normal");
		chipaway.setMakesContact(true);
		chipaway.setIgnoresDefenseBoosts(true);
		movedex.put("Chip Away", chipaway);

		Move sheercold = new Move("Sheer Cold");
		sheercold.setBP(0);
		sheercold.setZBP(180);
		sheercold.setCategory(2);
		sheercold.setType("Ice");
		movedex.put("Sheer Cold", sheercold);

		Move sludgebomb = new Move("Sludge Bomb");
		sludgebomb.setBP(90);
		sludgebomb.setZBP(175);
		sludgebomb.setCategory(2);
		sludgebomb.setType("Poison");
		sludgebomb.setHasSecondaryEffect(true);
		movedex.put("Sludge Bomb", sludgebomb);

		Move covet = new Move("Covet");
		covet.setBP(60);
		covet.setZBP(120);
		covet.setCategory(1);
		covet.setType("Normal");
		covet.setMakesContact(true);
		movedex.put("Covet", covet);

		Move stormthrow = new Move("Storm Throw");
		stormthrow.setBP(60);
		stormthrow.setZBP(120);
		stormthrow.setCategory(1);
		stormthrow.setType("Fighting");
		stormthrow.setMakesContact(true);
		movedex.put("Storm Throw", stormthrow);

		Move seedflare = new Move("Seed Flare");
		seedflare.setBP(120);
		seedflare.setZBP(190);
		seedflare.setCategory(2);
		seedflare.setType("Grass");
		seedflare.setHasSecondaryEffect(true);
		movedex.put("Seed Flare", seedflare);

		Move accelerock = new Move("Accelerock");
		accelerock.setBP(40);
		accelerock.setZBP(100);
		accelerock.setCategory(1);
		accelerock.setType("Rock");
		accelerock.setMakesContact(true);
		movedex.put("Accelerock", accelerock);

		Move frustration = new Move("Frustration");
		frustration.setBP(102);
		frustration.setZBP(160);
		frustration.setCategory(1);
		frustration.setType("Normal");
		frustration.setMakesContact(true);
		movedex.put("Frustration", frustration);

		Move magiccoat = new Move("Magic Coat");
		magiccoat.setBP(0);
		magiccoat.setZBP(0);
		magiccoat.setCategory(0);
		magiccoat.setType("Psychic");
		movedex.put("Magic Coat", magiccoat);

		Move aquatail = new Move("Aqua Tail");
		aquatail.setBP(90);
		aquatail.setZBP(175);
		aquatail.setCategory(1);
		aquatail.setType("Water");
		aquatail.setMakesContact(true);
		movedex.put("Aqua Tail", aquatail);

		Move hurricane = new Move("Hurricane");
		hurricane.setBP(110);
		hurricane.setZBP(185);
		hurricane.setCategory(2);
		hurricane.setType("Flying");
		hurricane.setHasSecondaryEffect(true);
		movedex.put("Hurricane", hurricane);

		Move howl = new Move("Howl");
		howl.setBP(0);
		howl.setZBP(0);
		howl.setCategory(0);
		howl.setType("Normal");
		movedex.put("Howl", howl);

		Move rockslide = new Move("Rock Slide");
		rockslide.setBP(75);
		rockslide.setZBP(140);
		rockslide.setCategory(1);
		rockslide.setType("Rock");
		rockslide.setIsSpread(true);
		rockslide.setHasSecondaryEffect(true);
		movedex.put("Rock Slide", rockslide);

		Move tectonicrage = new Move("Tectonic Rage");
		tectonicrage.setBP(1);
		tectonicrage.setZBP(0);
		tectonicrage.setCategory(1);
		tectonicrage.setType("Ground");
		movedex.put("Tectonic Rage", tectonicrage);

		Move bellydrum = new Move("Belly Drum");
		bellydrum.setBP(0);
		bellydrum.setZBP(0);
		bellydrum.setCategory(0);
		bellydrum.setType("Normal");
		movedex.put("Belly Drum", bellydrum);

		Move focusblast = new Move("Focus Blast");
		focusblast.setBP(120);
		focusblast.setZBP(190);
		focusblast.setCategory(2);
		focusblast.setType("Fighting");
		focusblast.setHasSecondaryEffect(true);
		movedex.put("Focus Blast", focusblast);

		Move skullbash = new Move("Skull Bash");
		skullbash.setBP(130);
		skullbash.setZBP(195);
		skullbash.setCategory(1);
		skullbash.setType("Normal");
		skullbash.setMakesContact(true);
		movedex.put("Skull Bash", skullbash);

		Move gastroacid = new Move("Gastro Acid");
		gastroacid.setBP(0);
		gastroacid.setZBP(0);
		gastroacid.setCategory(0);
		gastroacid.setType("Poison");
		movedex.put("Gastro Acid", gastroacid);

		Move glaciate = new Move("Glaciate");
		glaciate.setBP(65);
		glaciate.setZBP(120);
		glaciate.setCategory(2);
		glaciate.setType("Ice");
		glaciate.setIsSpread(true);
		glaciate.setHasSecondaryEffect(true);
		movedex.put("Glaciate", glaciate);

		Move drainpunch = new Move("Drain Punch");
		drainpunch.setBP(75);
		drainpunch.setZBP(140);
		drainpunch.setCategory(1);
		drainpunch.setType("Fighting");
		drainpunch.setMakesContact(true);
		drainpunch.setIsPunch(true);
		movedex.put("Drain Punch", drainpunch);

		Move photongeyser = new Move("Photon Geyser");
		photongeyser.setBP(100);
		photongeyser.setZBP(180);
		photongeyser.setCategory(2);
		photongeyser.setType("Psychic");
		movedex.put("Photon Geyser", photongeyser);

		Move auroraveil = new Move("Aurora Veil");
		auroraveil.setBP(0);
		auroraveil.setZBP(0);
		auroraveil.setCategory(0);
		auroraveil.setType("Ice");
		movedex.put("Aurora Veil", auroraveil);

		Move defensecurl = new Move("Defense Curl");
		defensecurl.setBP(0);
		defensecurl.setZBP(0);
		defensecurl.setCategory(0);
		defensecurl.setType("Normal");
		movedex.put("Defense Curl", defensecurl);

		Move flash = new Move("Flash");
		flash.setBP(0);
		flash.setZBP(0);
		flash.setCategory(0);
		flash.setType("Normal");
		movedex.put("Flash", flash);

		Move safeguard = new Move("Safeguard");
		safeguard.setBP(0);
		safeguard.setZBP(0);
		safeguard.setCategory(0);
		safeguard.setType("Normal");
		movedex.put("Safeguard", safeguard);

		Move sludgewave = new Move("Sludge Wave");
		sludgewave.setBP(95);
		sludgewave.setZBP(175);
		sludgewave.setCategory(2);
		sludgewave.setType("Poison");
		sludgewave.setIsSpread(true);
		sludgewave.setHasSecondaryEffect(true);
		movedex.put("Sludge Wave", sludgewave);

		Move mindblown = new Move("Mind Blown");
		mindblown.setBP(150);
		mindblown.setZBP(200);
		mindblown.setCategory(2);
		mindblown.setType("Fire");
		mindblown.setIsSpread(true);
		movedex.put("Mind Blown", mindblown);

		Move cut = new Move("Cut");
		cut.setBP(50);
		cut.setZBP(100);
		cut.setCategory(1);
		cut.setType("Normal");
		cut.setMakesContact(true);
		movedex.put("Cut", cut);

		Move feintattack = new Move("Feint Attack");
		feintattack.setBP(60);
		feintattack.setZBP(120);
		feintattack.setCategory(1);
		feintattack.setType("Dark");
		feintattack.setMakesContact(true);
		movedex.put("Feint Attack", feintattack);

		Move triplekick = new Move("Triple Kick");
		triplekick.setBP(10);
		triplekick.setZBP(120);
		triplekick.setCategory(1);
		triplekick.setType("Fighting");
		triplekick.setMakesContact(true);
		movedex.put("Triple Kick", triplekick);

		Move steelwing = new Move("Steel Wing");
		steelwing.setBP(70);
		steelwing.setZBP(140);
		steelwing.setCategory(1);
		steelwing.setType("Steel");
		steelwing.setMakesContact(true);
		steelwing.setHasSecondaryEffect(true);
		movedex.put("Steel Wing", steelwing);

		Move furycutter = new Move("Fury Cutter");
		furycutter.setBP(40);
		furycutter.setZBP(100);
		furycutter.setCategory(1);
		furycutter.setType("Bug");
		furycutter.setMakesContact(true);
		movedex.put("Fury Cutter", furycutter);

		Move aurorabeam = new Move("Aurora Beam");
		aurorabeam.setBP(65);
		aurorabeam.setZBP(120);
		aurorabeam.setCategory(2);
		aurorabeam.setType("Ice");
		aurorabeam.setHasSecondaryEffect(true);
		movedex.put("Aurora Beam", aurorabeam);

		Move hiddenpowerdark = new Move("Hidden Power Dark");
		hiddenpowerdark.setBP(60);
		hiddenpowerdark.setZBP(0);
		hiddenpowerdark.setCategory(2);
		hiddenpowerdark.setType("Dark");
		movedex.put("Hidden Power Dark", hiddenpowerdark);

		Move uproar = new Move("Uproar");
		uproar.setBP(90);
		uproar.setZBP(175);
		uproar.setCategory(2);
		uproar.setType("Normal");
		movedex.put("Uproar", uproar);

		Move frenzyplant = new Move("Frenzy Plant");
		frenzyplant.setBP(150);
		frenzyplant.setZBP(200);
		frenzyplant.setCategory(2);
		frenzyplant.setType("Grass");
		movedex.put("Frenzy Plant", frenzyplant);

		Move powersplit = new Move("Power Split");
		powersplit.setBP(0);
		powersplit.setZBP(0);
		powersplit.setCategory(0);
		powersplit.setType("Psychic");
		movedex.put("Power Split", powersplit);

		Move babydolleyes = new Move("Baby-Doll Eyes");
		babydolleyes.setBP(0);
		babydolleyes.setZBP(0);
		babydolleyes.setCategory(0);
		babydolleyes.setType("Fairy");
		movedex.put("Baby-Doll Eyes", babydolleyes);

		Move blazekick = new Move("Blaze Kick");
		blazekick.setBP(85);
		blazekick.setZBP(160);
		blazekick.setCategory(1);
		blazekick.setType("Fire");
		blazekick.setMakesContact(true);
		blazekick.setHasSecondaryEffect(true);
		movedex.put("Blaze Kick", blazekick);

		Move spiderweb = new Move("Spider Web");
		spiderweb.setBP(0);
		spiderweb.setZBP(0);
		spiderweb.setCategory(0);
		spiderweb.setType("Bug");
		movedex.put("Spider Web", spiderweb);

		Move waterfall = new Move("Waterfall");
		waterfall.setBP(80);
		waterfall.setZBP(160);
		waterfall.setCategory(1);
		waterfall.setType("Water");
		waterfall.setMakesContact(true);
		waterfall.setHasSecondaryEffect(true);
		movedex.put("Waterfall", waterfall);

		Move hiddenpowerfighting = new Move("Hidden Power Fighting");
		hiddenpowerfighting.setBP(60);
		hiddenpowerfighting.setZBP(0);
		hiddenpowerfighting.setCategory(2);
		hiddenpowerfighting.setType("Fighting");
		movedex.put("Hidden Power Fighting", hiddenpowerfighting);

		Move psychup = new Move("Psych Up");
		psychup.setBP(0);
		psychup.setZBP(0);
		psychup.setCategory(0);
		psychup.setType("Normal");
		movedex.put("Psych Up", psychup);

		Move retaliate = new Move("Retaliate");
		retaliate.setBP(70);
		retaliate.setZBP(140);
		retaliate.setCategory(1);
		retaliate.setType("Normal");
		retaliate.setMakesContact(true);
		movedex.put("Retaliate", retaliate);

		Move forestscurse = new Move("Forest's Curse");
		forestscurse.setBP(0);
		forestscurse.setZBP(0);
		forestscurse.setCategory(0);
		forestscurse.setType("Grass");
		movedex.put("Forest's Curse", forestscurse);

		Move sparklingaria = new Move("Sparkling Aria");
		sparklingaria.setBP(90);
		sparklingaria.setZBP(175);
		sparklingaria.setCategory(2);
		sparklingaria.setType("Water");
		sparklingaria.setIsSpread(true);
		sparklingaria.setHasSecondaryEffect(true);
		movedex.put("Sparkling Aria", sparklingaria);

		Move magikarpsrevenge = new Move("Magikarp's Revenge");
		magikarpsrevenge.setBP(120);
		magikarpsrevenge.setZBP(190);
		magikarpsrevenge.setCategory(1);
		magikarpsrevenge.setType("Water");
		magikarpsrevenge.setMakesContact(true);
		magikarpsrevenge.setHasSecondaryEffect(true);
		movedex.put("Magikarp's Revenge", magikarpsrevenge);

		Move liquidation = new Move("Liquidation");
		liquidation.setBP(85);
		liquidation.setZBP(160);
		liquidation.setCategory(1);
		liquidation.setType("Water");
		liquidation.setMakesContact(true);
		liquidation.setHasSecondaryEffect(true);
		movedex.put("Liquidation", liquidation);

		Move blizzard = new Move("Blizzard");
		blizzard.setBP(110);
		blizzard.setZBP(185);
		blizzard.setCategory(2);
		blizzard.setType("Ice");
		blizzard.setIsSpread(true);
		blizzard.setHasSecondaryEffect(true);
		movedex.put("Blizzard", blizzard);

		Move clangingscales = new Move("Clanging Scales");
		clangingscales.setBP(110);
		clangingscales.setZBP(185);
		clangingscales.setCategory(2);
		clangingscales.setType("Dragon");
		clangingscales.setIsSpread(true);
		movedex.put("Clanging Scales", clangingscales);

		Move hiddenpowerrock = new Move("Hidden Power Rock");
		hiddenpowerrock.setBP(60);
		hiddenpowerrock.setZBP(0);
		hiddenpowerrock.setCategory(2);
		hiddenpowerrock.setType("Rock");
		movedex.put("Hidden Power Rock", hiddenpowerrock);

		Move refresh = new Move("Refresh");
		refresh.setBP(0);
		refresh.setZBP(0);
		refresh.setCategory(0);
		refresh.setType("Normal");
		movedex.put("Refresh", refresh);

		Move soulstealing7starstrike = new Move("Soul-Stealing 7-Star Strike");
		soulstealing7starstrike.setBP(195);
		soulstealing7starstrike.setZBP(0);
		soulstealing7starstrike.setCategory(1);
		soulstealing7starstrike.setType("Ghost");
		soulstealing7starstrike.setMakesContact(true);
		soulstealing7starstrike.setIsSignatureZ(true);
		movedex.put("Soul-Stealing 7-Star Strike", soulstealing7starstrike);

		Move fusionflare = new Move("Fusion Flare");
		fusionflare.setBP(100);
		fusionflare.setZBP(180);
		fusionflare.setCategory(2);
		fusionflare.setType("Fire");
		movedex.put("Fusion Flare", fusionflare);

		Move landswrath = new Move("Land's Wrath");
		landswrath.setBP(90);
		landswrath.setZBP(185);
		landswrath.setCategory(1);
		landswrath.setType("Ground");
		landswrath.setIsSpread(true);
		movedex.put("Land's Wrath", landswrath);

		Move kingsshield = new Move("King's Shield");
		kingsshield.setBP(0);
		kingsshield.setZBP(0);
		kingsshield.setCategory(0);
		kingsshield.setType("Steel");
		movedex.put("King's Shield", kingsshield);

		Move ingrain = new Move("Ingrain");
		ingrain.setBP(0);
		ingrain.setZBP(0);
		ingrain.setCategory(0);
		ingrain.setType("Grass");
		movedex.put("Ingrain", ingrain);

		Move charm = new Move("Charm");
		charm.setBP(0);
		charm.setZBP(0);
		charm.setCategory(0);
		charm.setType("Fairy");
		movedex.put("Charm", charm);

		Move healingwish = new Move("Healing Wish");
		healingwish.setBP(0);
		healingwish.setZBP(0);
		healingwish.setCategory(0);
		healingwish.setType("Psychic");
		movedex.put("Healing Wish", healingwish);

		Move phantomforce = new Move("Phantom Force");
		phantomforce.setBP(90);
		phantomforce.setZBP(175);
		phantomforce.setCategory(1);
		phantomforce.setType("Ghost");
		phantomforce.setMakesContact(true);
		movedex.put("Phantom Force", phantomforce);

		Move brickbreak = new Move("Brick Break");
		brickbreak.setBP(75);
		brickbreak.setZBP(140);
		brickbreak.setCategory(1);
		brickbreak.setType("Fighting");
		brickbreak.setMakesContact(true);
		movedex.put("Brick Break", brickbreak);

		Move headbutt = new Move("Headbutt");
		headbutt.setBP(70);
		headbutt.setZBP(140);
		headbutt.setCategory(1);
		headbutt.setType("Normal");
		headbutt.setMakesContact(true);
		headbutt.setHasSecondaryEffect(true);
		movedex.put("Headbutt", headbutt);

		Move powerswap = new Move("Power Swap");
		powerswap.setBP(0);
		powerswap.setZBP(0);
		powerswap.setCategory(0);
		powerswap.setType("Psychic");
		movedex.put("Power Swap", powerswap);

		Move assist = new Move("Assist");
		assist.setBP(0);
		assist.setZBP(0);
		assist.setCategory(0);
		assist.setType("Normal");
		movedex.put("Assist", assist);

		Move eerieimpulse = new Move("Eerie Impulse");
		eerieimpulse.setBP(0);
		eerieimpulse.setZBP(0);
		eerieimpulse.setCategory(0);
		eerieimpulse.setType("Electric");
		movedex.put("Eerie Impulse", eerieimpulse);

		Move spitup = new Move("Spit Up");
		spitup.setBP(0);
		spitup.setZBP(100);
		spitup.setCategory(2);
		spitup.setType("Normal");
		movedex.put("Spit Up", spitup);

		Move aeroblast = new Move("Aeroblast");
		aeroblast.setBP(100);
		aeroblast.setZBP(180);
		aeroblast.setCategory(2);
		aeroblast.setType("Flying");
		movedex.put("Aeroblast", aeroblast);

		Move strugglebug = new Move("Struggle Bug");
		strugglebug.setBP(50);
		strugglebug.setZBP(100);
		strugglebug.setCategory(2);
		strugglebug.setType("Bug");
		strugglebug.setIsSpread(true);
		strugglebug.setHasSecondaryEffect(true);
		movedex.put("Struggle Bug", strugglebug);

		Move pluck = new Move("Pluck");
		pluck.setBP(60);
		pluck.setZBP(120);
		pluck.setCategory(1);
		pluck.setType("Flying");
		pluck.setMakesContact(true);
		movedex.put("Pluck", pluck);

		Move sunnyday = new Move("Sunny Day");
		sunnyday.setBP(0);
		sunnyday.setZBP(0);
		sunnyday.setCategory(0);
		sunnyday.setType("Fire");
		movedex.put("Sunny Day", sunnyday);

		Move tenmillionvoltthunderbolt = new Move("10,000,000 Volt Thunderbolt");
		tenmillionvoltthunderbolt.setBP(195);
		tenmillionvoltthunderbolt.setZBP(0);
		tenmillionvoltthunderbolt.setCategory(2);
		tenmillionvoltthunderbolt.setType("Electric");
		tenmillionvoltthunderbolt.setIsSignatureZ(true);
		movedex.put("10,000,000 Volt Thunderbolt", tenmillionvoltthunderbolt);

		Move megapunch = new Move("Mega Punch");
		megapunch.setBP(80);
		megapunch.setZBP(160);
		megapunch.setCategory(1);
		megapunch.setType("Normal");
		megapunch.setMakesContact(true);
		megapunch.setIsPunch(true);
		movedex.put("Mega Punch", megapunch);

		Move poisonfang = new Move("Poison Fang");
		poisonfang.setBP(50);
		poisonfang.setZBP(100);
		poisonfang.setCategory(1);
		poisonfang.setType("Poison");
		poisonfang.setMakesContact(true);
		poisonfang.setHasSecondaryEffect(true);
		poisonfang.setIsBite(true);
		movedex.put("Poison Fang", poisonfang);

		Move conversion2 = new Move("Conversion 2");
		conversion2.setBP(0);
		conversion2.setZBP(0);
		conversion2.setCategory(0);
		conversion2.setType("Normal");
		movedex.put("Conversion 2", conversion2);

		Move hypervoice = new Move("Hyper Voice");
		hypervoice.setBP(90);
		hypervoice.setZBP(175);
		hypervoice.setCategory(2);
		hypervoice.setType("Normal");
		hypervoice.setIsSpread(true);
		movedex.put("Hyper Voice", hypervoice);

		Move strength = new Move("Strength");
		strength.setBP(80);
		strength.setZBP(160);
		strength.setCategory(1);
		strength.setType("Normal");
		strength.setMakesContact(true);
		movedex.put("Strength", strength);

		Move heatwave = new Move("Heat Wave");
		heatwave.setBP(95);
		heatwave.setZBP(175);
		heatwave.setCategory(2);
		heatwave.setType("Fire");
		heatwave.setIsSpread(true);
		heatwave.setHasSecondaryEffect(true);
		movedex.put("Heat Wave", heatwave);

		Move matblock = new Move("Mat Block");
		matblock.setBP(0);
		matblock.setZBP(0);
		matblock.setCategory(0);
		matblock.setType("Fighting");
		movedex.put("Mat Block", matblock);

		Move octazooka = new Move("Octazooka");
		octazooka.setBP(65);
		octazooka.setZBP(120);
		octazooka.setCategory(2);
		octazooka.setType("Water");
		octazooka.setHasSecondaryEffect(true);
		movedex.put("Octazooka", octazooka);

		Move secretsword = new Move("Secret Sword");
		secretsword.setBP(85);
		secretsword.setZBP(160);
		secretsword.setCategory(3);
		secretsword.setType("Fighting");
		movedex.put("Secret Sword", secretsword);

		Move solarbeam = new Move("Solar Beam");
		solarbeam.setBP(120);
		solarbeam.setZBP(190);
		solarbeam.setCategory(2);
		solarbeam.setType("Grass");
		movedex.put("Solar Beam", solarbeam);

		Move stickyweb = new Move("Sticky Web");
		stickyweb.setBP(0);
		stickyweb.setZBP(0);
		stickyweb.setCategory(0);
		stickyweb.setType("Bug");
		movedex.put("Sticky Web", stickyweb);

		Move prismaticlaser = new Move("Prismatic Laser");
		prismaticlaser.setBP(160);
		prismaticlaser.setZBP(200);
		prismaticlaser.setCategory(2);
		prismaticlaser.setType("Psychic");
		movedex.put("Prismatic Laser", prismaticlaser);

		Move glare = new Move("Glare");
		glare.setBP(0);
		glare.setZBP(0);
		glare.setCategory(0);
		glare.setType("Normal");
		movedex.put("Glare", glare);

		Move blackholeeclipse = new Move("Black Hole Eclipse");
		blackholeeclipse.setBP(1);
		blackholeeclipse.setZBP(0);
		blackholeeclipse.setCategory(1);
		blackholeeclipse.setType("Dark");
		movedex.put("Black Hole Eclipse", blackholeeclipse);

		Move tailwhip = new Move("Tail Whip");
		tailwhip.setBP(0);
		tailwhip.setZBP(0);
		tailwhip.setCategory(0);
		tailwhip.setType("Normal");
		tailwhip.setIsSpread(true);
		movedex.put("Tail Whip", tailwhip);

		Move fireblast = new Move("Fire Blast");
		fireblast.setBP(110);
		fireblast.setZBP(185);
		fireblast.setCategory(2);
		fireblast.setType("Fire");
		fireblast.setHasSecondaryEffect(true);
		movedex.put("Fire Blast", fireblast);

		Move heavyslam = new Move("Heavy Slam");
		heavyslam.setBP(0);
		heavyslam.setZBP(160);
		heavyslam.setCategory(1);
		heavyslam.setType("Steel");
		heavyslam.setMakesContact(true);
		movedex.put("Heavy Slam", heavyslam);

		Move lick = new Move("Lick");
		lick.setBP(30);
		lick.setZBP(100);
		lick.setCategory(1);
		lick.setType("Ghost");
		lick.setMakesContact(true);
		lick.setHasSecondaryEffect(true);
		movedex.put("Lick", lick);

		Move meanlook = new Move("Mean Look");
		meanlook.setBP(0);
		meanlook.setZBP(0);
		meanlook.setCategory(0);
		meanlook.setType("Normal");
		movedex.put("Mean Look", meanlook);

		Move crosspoison = new Move("Cross Poison");
		crosspoison.setBP(70);
		crosspoison.setZBP(140);
		crosspoison.setCategory(1);
		crosspoison.setType("Poison");
		crosspoison.setMakesContact(true);
		crosspoison.setHasSecondaryEffect(true);
		movedex.put("Cross Poison", crosspoison);

		Move hiddenpowerpsychic = new Move("Hidden Power Psychic");
		hiddenpowerpsychic.setBP(60);
		hiddenpowerpsychic.setZBP(0);
		hiddenpowerpsychic.setCategory(2);
		hiddenpowerpsychic.setType("Psychic");
		movedex.put("Hidden Power Psychic", hiddenpowerpsychic);

		Move icepunch = new Move("Ice Punch");
		icepunch.setBP(75);
		icepunch.setZBP(140);
		icepunch.setCategory(1);
		icepunch.setType("Ice");
		icepunch.setMakesContact(true);
		icepunch.setHasSecondaryEffect(true);
		icepunch.setIsPunch(true);
		movedex.put("Ice Punch", icepunch);

		Move grassyterrain = new Move("Grassy Terrain");
		grassyterrain.setBP(0);
		grassyterrain.setZBP(0);
		grassyterrain.setCategory(0);
		grassyterrain.setType("Grass");
		movedex.put("Grassy Terrain", grassyterrain);

		Move bonemerang = new Move("Bonemerang");
		bonemerang.setBP(50);
		bonemerang.setZBP(100);
		bonemerang.setCategory(1);
		bonemerang.setType("Ground");
		bonemerang.setIsTwoHit(true);
		movedex.put("Bonemerang", bonemerang);

		Move faketears = new Move("Fake Tears");
		faketears.setBP(0);
		faketears.setZBP(0);
		faketears.setCategory(0);
		faketears.setType("Dark");
		movedex.put("Fake Tears", faketears);

		Move coil = new Move("Coil");
		coil.setBP(0);
		coil.setZBP(0);
		coil.setCategory(0);
		coil.setType("Poison");
		movedex.put("Coil", coil);

		Move hiddenpowerwater = new Move("Hidden Power Water");
		hiddenpowerwater.setBP(60);
		hiddenpowerwater.setZBP(0);
		hiddenpowerwater.setCategory(2);
		hiddenpowerwater.setType("Water");
		movedex.put("Hidden Power Water", hiddenpowerwater);

		Move pollenpuff = new Move("Pollen Puff");
		pollenpuff.setBP(90);
		pollenpuff.setZBP(175);
		pollenpuff.setCategory(2);
		pollenpuff.setType("Bug");
		movedex.put("Pollen Puff", pollenpuff);

		Move celebrate = new Move("Celebrate");
		celebrate.setBP(0);
		celebrate.setZBP(0);
		celebrate.setCategory(0);
		celebrate.setType("Normal");
		movedex.put("Celebrate", celebrate);

		Move thunderfang = new Move("Thunder Fang");
		thunderfang.setBP(65);
		thunderfang.setZBP(120);
		thunderfang.setCategory(1);
		thunderfang.setType("Electric");
		thunderfang.setMakesContact(true);
		thunderfang.setHasSecondaryEffect(true);
		thunderfang.setIsBite(true);
		movedex.put("Thunder Fang", thunderfang);

		Move seismictoss = new Move("Seismic Toss");
		seismictoss.setBP(0);
		seismictoss.setZBP(100);
		seismictoss.setCategory(1);
		seismictoss.setType("Fighting");
		seismictoss.setMakesContact(true);
		movedex.put("Seismic Toss", seismictoss);

		Move rockpolish = new Move("Rock Polish");
		rockpolish.setBP(0);
		rockpolish.setZBP(0);
		rockpolish.setCategory(0);
		rockpolish.setType("Rock");
		movedex.put("Rock Polish", rockpolish);

		Move laserfocus = new Move("Laser Focus");
		laserfocus.setBP(0);
		laserfocus.setZBP(0);
		laserfocus.setCategory(0);
		laserfocus.setType("Normal");
		movedex.put("Laser Focus", laserfocus);

		Move tearfullook = new Move("Tearful Look");
		tearfullook.setBP(0);
		tearfullook.setZBP(0);
		tearfullook.setCategory(0);
		tearfullook.setType("Normal");
		movedex.put("Tearful Look", tearfullook);

		Move assurance = new Move("Assurance");
		assurance.setBP(60);
		assurance.setZBP(120);
		assurance.setCategory(1);
		assurance.setType("Dark");
		assurance.setMakesContact(true);
		movedex.put("Assurance", assurance);

		Move oceanicoperetta = new Move("Oceanic Operetta");
		oceanicoperetta.setBP(195);
		oceanicoperetta.setZBP(0);
		oceanicoperetta.setCategory(2);
		oceanicoperetta.setType("Water");
		oceanicoperetta.setIsSignatureZ(true);
		movedex.put("Oceanic Operetta", oceanicoperetta);

		Move petalblizzard = new Move("Petal Blizzard");
		petalblizzard.setBP(90);
		petalblizzard.setZBP(175);
		petalblizzard.setCategory(1);
		petalblizzard.setType("Grass");
		petalblizzard.setIsSpread(true);
		movedex.put("Petal Blizzard", petalblizzard);

		Move aromatherapy = new Move("Aromatherapy");
		aromatherapy.setBP(0);
		aromatherapy.setZBP(0);
		aromatherapy.setCategory(0);
		aromatherapy.setType("Grass");
		aromatherapy.setHasSecondaryEffect(true);
		movedex.put("Aromatherapy", aromatherapy);

		Move suckerpunch = new Move("Sucker Punch");
		suckerpunch.setBP(70);
		suckerpunch.setZBP(140);
		suckerpunch.setCategory(1);
		suckerpunch.setType("Dark");
		suckerpunch.setMakesContact(true);
		movedex.put("Sucker Punch", suckerpunch);

		Move megakick = new Move("Mega Kick");
		megakick.setBP(120);
		megakick.setZBP(190);
		megakick.setCategory(1);
		megakick.setType("Normal");
		megakick.setMakesContact(true);
		movedex.put("Mega Kick", megakick);

		Move sing = new Move("Sing");
		sing.setBP(0);
		sing.setZBP(0);
		sing.setCategory(0);
		sing.setType("Normal");
		movedex.put("Sing", sing);

		Move futuresight = new Move("Future Sight");
		futuresight.setBP(120);
		futuresight.setZBP(190);
		futuresight.setCategory(2);
		futuresight.setType("Psychic");
		movedex.put("Future Sight", futuresight);

		Move watersport = new Move("Water Sport");
		watersport.setBP(0);
		watersport.setZBP(0);
		watersport.setCategory(0);
		watersport.setType("Water");
		movedex.put("Water Sport", watersport);

		Move crunch = new Move("Crunch");
		crunch.setBP(80);
		crunch.setZBP(160);
		crunch.setCategory(1);
		crunch.setType("Dark");
		crunch.setMakesContact(true);
		crunch.setHasSecondaryEffect(true);
		crunch.setIsBite(true);
		movedex.put("Crunch", crunch);

		Move tailwind = new Move("Tailwind");
		tailwind.setBP(0);
		tailwind.setZBP(0);
		tailwind.setCategory(0);
		tailwind.setType("Flying");
		movedex.put("Tailwind", tailwind);

		Move ragepowder = new Move("Rage Powder");
		ragepowder.setBP(0);
		ragepowder.setZBP(0);
		ragepowder.setCategory(0);
		ragepowder.setType("Bug");
		movedex.put("Rage Powder", ragepowder);

		Move twineedle = new Move("Twineedle");
		twineedle.setBP(25);
		twineedle.setZBP(100);
		twineedle.setCategory(1);
		twineedle.setType("Bug");
		twineedle.setHasSecondaryEffect(true);
		twineedle.setIsTwoHit(true);
		movedex.put("Twineedle", twineedle);

		Move attract = new Move("Attract");
		attract.setBP(0);
		attract.setZBP(0);
		attract.setCategory(0);
		attract.setType("Normal");
		movedex.put("Attract", attract);

		Move detect = new Move("Detect");
		detect.setBP(0);
		detect.setZBP(0);
		detect.setCategory(0);
		detect.setType("Fighting");
		movedex.put("Detect", detect);

		Move snatch = new Move("Snatch");
		snatch.setBP(0);
		snatch.setZBP(0);
		snatch.setCategory(0);
		snatch.setType("Dark");
		movedex.put("Snatch", snatch);

		Move smackdown = new Move("Smack Down");
		smackdown.setBP(50);
		smackdown.setZBP(100);
		smackdown.setCategory(1);
		smackdown.setType("Rock");
		movedex.put("Smack Down", smackdown);

		Move lowkick = new Move("Low Kick");
		lowkick.setBP(0);
		lowkick.setZBP(160);
		lowkick.setCategory(1);
		lowkick.setType("Fighting");
		lowkick.setMakesContact(true);
		movedex.put("Low Kick", lowkick);

		Move simplebeam = new Move("Simple Beam");
		simplebeam.setBP(0);
		simplebeam.setZBP(0);
		simplebeam.setCategory(0);
		simplebeam.setType("Normal");
		movedex.put("Simple Beam", simplebeam);

		Move lightscreen = new Move("Light Screen");
		lightscreen.setBP(0);
		lightscreen.setZBP(0);
		lightscreen.setCategory(0);
		lightscreen.setType("Psychic");
		movedex.put("Light Screen", lightscreen);

		Move rocksmash = new Move("Rock Smash");
		rocksmash.setBP(40);
		rocksmash.setZBP(100);
		rocksmash.setCategory(1);
		rocksmash.setType("Fighting");
		rocksmash.setMakesContact(true);
		rocksmash.setHasSecondaryEffect(true);
		movedex.put("Rock Smash", rocksmash);

		Move stunspore = new Move("Stun Spore");
		stunspore.setBP(0);
		stunspore.setZBP(0);
		stunspore.setCategory(0);
		stunspore.setType("Grass");
		movedex.put("Stun Spore", stunspore);

		Move heartswap = new Move("Heart Swap");
		heartswap.setBP(0);
		heartswap.setZBP(0);
		heartswap.setCategory(0);
		heartswap.setType("Psychic");
		movedex.put("Heart Swap", heartswap);

		Move sunsteelstrike = new Move("Sunsteel Strike");
		sunsteelstrike.setBP(100);
		sunsteelstrike.setZBP(180);
		sunsteelstrike.setCategory(1);
		sunsteelstrike.setType("Steel");
		sunsteelstrike.setMakesContact(true);
		movedex.put("Sunsteel Strike", sunsteelstrike);

		Move horndrill = new Move("Horn Drill");
		horndrill.setBP(0);
		horndrill.setZBP(180);
		horndrill.setCategory(1);
		horndrill.setType("Normal");
		horndrill.setMakesContact(true);
		movedex.put("Horn Drill", horndrill);

		Move thrash = new Move("Thrash");
		thrash.setBP(120);
		thrash.setZBP(190);
		thrash.setCategory(1);
		thrash.setType("Normal");
		thrash.setMakesContact(true);
		movedex.put("Thrash", thrash);

		Move vacuumwave = new Move("Vacuum Wave");
		vacuumwave.setBP(40);
		vacuumwave.setZBP(100);
		vacuumwave.setCategory(2);
		vacuumwave.setType("Fighting");
		movedex.put("Vacuum Wave", vacuumwave);

		Move coreenforcer = new Move("Core Enforcer");
		coreenforcer.setBP(100);
		coreenforcer.setZBP(140);
		coreenforcer.setCategory(2);
		coreenforcer.setType("Dragon");
		coreenforcer.setIsSpread(true);
		movedex.put("Core Enforcer", coreenforcer);

		Move stomp = new Move("Stomp");
		stomp.setBP(65);
		stomp.setZBP(120);
		stomp.setCategory(1);
		stomp.setType("Normal");
		stomp.setMakesContact(true);
		stomp.setHasSecondaryEffect(true);
		movedex.put("Stomp", stomp);

		Move lockon = new Move("Lock-On");
		lockon.setBP(0);
		lockon.setZBP(0);
		lockon.setCategory(0);
		lockon.setType("Normal");
		movedex.put("Lock-On", lockon);

		Move shelltrap = new Move("Shell Trap");
		shelltrap.setBP(150);
		shelltrap.setZBP(200);
		shelltrap.setCategory(2);
		shelltrap.setType("Fire");
		shelltrap.setIsSpread(true);
		movedex.put("Shell Trap", shelltrap);

		Move furyattack = new Move("Fury Attack");
		furyattack.setBP(15);
		furyattack.setZBP(100);
		furyattack.setCategory(1);
		furyattack.setType("Normal");
		furyattack.setMakesContact(true);
		furyattack.setIsMultiHit(true);
		movedex.put("Fury Attack", furyattack);

		Move hiddenpowergrass = new Move("Hidden Power Grass");
		hiddenpowergrass.setBP(60);
		hiddenpowergrass.setZBP(0);
		hiddenpowergrass.setCategory(2);
		hiddenpowergrass.setType("Grass");
		movedex.put("Hidden Power Grass", hiddenpowergrass);

		Move thunderpunch = new Move("Thunder Punch");
		thunderpunch.setBP(75);
		thunderpunch.setZBP(140);
		thunderpunch.setCategory(1);
		thunderpunch.setType("Electric");
		thunderpunch.setMakesContact(true);
		thunderpunch.setHasSecondaryEffect(true);
		thunderpunch.setIsPunch(true);
		movedex.put("Thunder Punch", thunderpunch);

		Move flashcannon = new Move("Flash Cannon");
		flashcannon.setBP(80);
		flashcannon.setZBP(160);
		flashcannon.setCategory(2);
		flashcannon.setType("Steel");
		flashcannon.setHasSecondaryEffect(true);
		movedex.put("Flash Cannon", flashcannon);

		Move shadowforce = new Move("Shadow Force");
		shadowforce.setBP(120);
		shadowforce.setZBP(190);
		shadowforce.setCategory(1);
		shadowforce.setType("Ghost");
		shadowforce.setMakesContact(true);
		movedex.put("Shadow Force", shadowforce);

		Move partingshot = new Move("Parting Shot");
		partingshot.setBP(0);
		partingshot.setZBP(0);
		partingshot.setCategory(0);
		partingshot.setType("Dark");
		movedex.put("Parting Shot", partingshot);

		Move bugbuzz = new Move("Bug Buzz");
		bugbuzz.setBP(90);
		bugbuzz.setZBP(175);
		bugbuzz.setCategory(2);
		bugbuzz.setType("Bug");
		bugbuzz.setHasSecondaryEffect(true);
		movedex.put("Bug Buzz", bugbuzz);

		Move magicroom = new Move("Magic Room");
		magicroom.setBP(0);
		magicroom.setZBP(0);
		magicroom.setCategory(0);
		magicroom.setType("Psychic");
		movedex.put("Magic Room", magicroom);

		Move iciclecrash = new Move("Icicle Crash");
		iciclecrash.setBP(85);
		iciclecrash.setZBP(160);
		iciclecrash.setCategory(1);
		iciclecrash.setType("Ice");
		iciclecrash.setHasSecondaryEffect(true);
		movedex.put("Icicle Crash", iciclecrash);

		Move stockpile = new Move("Stockpile");
		stockpile.setBP(0);
		stockpile.setZBP(0);
		stockpile.setCategory(0);
		stockpile.setType("Normal");
		movedex.put("Stockpile", stockpile);

		Move sleeppowder = new Move("Sleep Powder");
		sleeppowder.setBP(0);
		sleeppowder.setZBP(0);
		sleeppowder.setCategory(0);
		sleeppowder.setType("Grass");
		movedex.put("Sleep Powder", sleeppowder);

		Move hiddenpowerelectric = new Move("Hidden Power Electric");
		hiddenpowerelectric.setBP(60);
		hiddenpowerelectric.setZBP(0);
		hiddenpowerelectric.setCategory(2);
		hiddenpowerelectric.setType("Electric");
		movedex.put("Hidden Power Electric", hiddenpowerelectric);

		Move grassknot = new Move("Grass Knot");
		grassknot.setBP(0);
		grassknot.setZBP(160);
		grassknot.setCategory(2);
		grassknot.setType("Grass");
		grassknot.setMakesContact(true);
		movedex.put("Grass Knot", grassknot);

		Move bulkup = new Move("Bulk Up");
		bulkup.setBP(0);
		bulkup.setZBP(0);
		bulkup.setCategory(0);
		bulkup.setType("Fighting");
		movedex.put("Bulk Up", bulkup);

		Move screech = new Move("Screech");
		screech.setBP(0);
		screech.setZBP(0);
		screech.setCategory(0);
		screech.setType("Normal");
		movedex.put("Screech", screech);

		Move gravity = new Move("Gravity");
		gravity.setBP(0);
		gravity.setZBP(0);
		gravity.setCategory(0);
		gravity.setType("Psychic");
		movedex.put("Gravity", gravity);

		Move plasmafists = new Move("Plasma Fists");
		plasmafists.setBP(100);
		plasmafists.setZBP(180);
		plasmafists.setCategory(1);
		plasmafists.setType("Electric");
		plasmafists.setMakesContact(true);
		plasmafists.setIsPunch(true);
		movedex.put("Plasma Fists", plasmafists);

		Move avalanche = new Move("Avalanche");
		avalanche.setBP(60);
		avalanche.setZBP(120);
		avalanche.setCategory(1);
		avalanche.setType("Ice");
		avalanche.setMakesContact(true);
		movedex.put("Avalanche", avalanche);

		Move embargo = new Move("Embargo");
		embargo.setBP(0);
		embargo.setZBP(0);
		embargo.setCategory(0);
		embargo.setType("Dark");
		movedex.put("Embargo", embargo);

		Move aerialace = new Move("Aerial Ace");
		aerialace.setBP(60);
		aerialace.setZBP(120);
		aerialace.setCategory(1);
		aerialace.setType("Flying");
		aerialace.setMakesContact(true);
		movedex.put("Aerial Ace", aerialace);

		Move diamondstorm = new Move("Diamond Storm");
		diamondstorm.setBP(100);
		diamondstorm.setZBP(180);
		diamondstorm.setCategory(1);
		diamondstorm.setType("Rock");
		diamondstorm.setIsSpread(true);
		diamondstorm.setHasSecondaryEffect(true);
		movedex.put("Diamond Storm", diamondstorm);

		Move calmmind = new Move("Calm Mind");
		calmmind.setBP(0);
		calmmind.setZBP(0);
		calmmind.setCategory(0);
		calmmind.setType("Psychic");
		movedex.put("Calm Mind", calmmind);

		Move poisonpowder = new Move("Poison Powder");
		poisonpowder.setBP(0);
		poisonpowder.setZBP(0);
		poisonpowder.setCategory(0);
		poisonpowder.setType("Poison");
		movedex.put("Poison Powder", poisonpowder);

		Move electrify = new Move("Electrify");
		electrify.setBP(0);
		electrify.setZBP(0);
		electrify.setCategory(0);
		electrify.setType("Electric");
		movedex.put("Electrify", electrify);

		Move mudbomb = new Move("Mud Bomb");
		mudbomb.setBP(65);
		mudbomb.setZBP(120);
		mudbomb.setCategory(2);
		mudbomb.setType("Ground");
		mudbomb.setHasSecondaryEffect(true);
		movedex.put("Mud Bomb", mudbomb);

		Move torment = new Move("Torment");
		torment.setBP(0);
		torment.setZBP(0);
		torment.setCategory(0);
		torment.setType("Dark");
		movedex.put("Torment", torment);

		Move wildcharge = new Move("Wild Charge");
		wildcharge.setBP(90);
		wildcharge.setZBP(175);
		wildcharge.setCategory(1);
		wildcharge.setType("Electric");
		wildcharge.setMakesContact(true);
		wildcharge.setHasRecoil(true);
		movedex.put("Wild Charge", wildcharge);

		Move bounce = new Move("Bounce");
		bounce.setBP(85);
		bounce.setZBP(160);
		bounce.setCategory(1);
		bounce.setType("Flying");
		bounce.setMakesContact(true);
		bounce.setHasSecondaryEffect(true);
		movedex.put("Bounce", bounce);

		Move scaryface = new Move("Scary Face");
		scaryface.setBP(0);
		scaryface.setZBP(0);
		scaryface.setCategory(0);
		scaryface.setType("Normal");
		movedex.put("Scary Face", scaryface);

		Move powergem = new Move("Power Gem");
		powergem.setBP(80);
		powergem.setZBP(160);
		powergem.setCategory(2);
		powergem.setType("Rock");
		movedex.put("Power Gem", powergem);

		Move afteryou = new Move("After You");
		afteryou.setBP(0);
		afteryou.setZBP(0);
		afteryou.setCategory(0);
		afteryou.setType("Normal");
		movedex.put("After You", afteryou);

		Move leechseed = new Move("Leech Seed");
		leechseed.setBP(0);
		leechseed.setZBP(0);
		leechseed.setCategory(0);
		leechseed.setType("Grass");
		movedex.put("Leech Seed", leechseed);

		Move metalburst = new Move("Metal Burst");
		metalburst.setBP(0);
		metalburst.setZBP(100);
		metalburst.setCategory(1);
		metalburst.setType("Steel");
		movedex.put("Metal Burst", metalburst);

		Move facade = new Move("Facade");
		facade.setBP(70);
		facade.setZBP(140);
		facade.setCategory(1);
		facade.setType("Normal");
		facade.setMakesContact(true);
		movedex.put("Facade", facade);

		Move topsyturvy = new Move("Topsy-Turvy");
		topsyturvy.setBP(0);
		topsyturvy.setZBP(0);
		topsyturvy.setCategory(0);
		topsyturvy.setType("Dark");
		movedex.put("Topsy-Turvy", topsyturvy);

		Move aircutter = new Move("Air Cutter");
		aircutter.setBP(60);
		aircutter.setZBP(120);
		aircutter.setCategory(2);
		aircutter.setType("Flying");
		aircutter.setIsSpread(true);
		movedex.put("Air Cutter", aircutter);

		Move echoedvoice = new Move("Echoed Voice");
		echoedvoice.setBP(40);
		echoedvoice.setZBP(100);
		echoedvoice.setCategory(2);
		echoedvoice.setType("Normal");
		movedex.put("Echoed Voice", echoedvoice);

		Move defendorder = new Move("Defend Order");
		defendorder.setBP(0);
		defendorder.setZBP(0);
		defendorder.setCategory(0);
		defendorder.setType("Bug");
		movedex.put("Defend Order", defendorder);

		Move heartstamp = new Move("Heart Stamp");
		heartstamp.setBP(60);
		heartstamp.setZBP(120);
		heartstamp.setCategory(1);
		heartstamp.setType("Psychic");
		heartstamp.setMakesContact(true);
		heartstamp.setHasSecondaryEffect(true);
		movedex.put("Heart Stamp", heartstamp);

		Move rocktomb = new Move("Rock Tomb");
		rocktomb.setBP(60);
		rocktomb.setZBP(120);
		rocktomb.setCategory(1);
		rocktomb.setType("Rock");
		rocktomb.setHasSecondaryEffect(true);
		movedex.put("Rock Tomb", rocktomb);

		Move beakblast = new Move("Beak Blast");
		beakblast.setBP(100);
		beakblast.setZBP(180);
		beakblast.setCategory(1);
		beakblast.setType("Flying");
		movedex.put("Beak Blast", beakblast);

		Move hex = new Move("Hex");
		hex.setBP(65);
		hex.setZBP(160);
		hex.setCategory(2);
		hex.setType("Ghost");
		movedex.put("Hex", hex);

		Move waterspout = new Move("Water Spout");
		waterspout.setBP(150);
		waterspout.setZBP(200);
		waterspout.setCategory(2);
		waterspout.setType("Water");
		waterspout.setIsSpread(true);
		movedex.put("Water Spout", waterspout);

		Move healorder = new Move("Heal Order");
		healorder.setBP(0);
		healorder.setZBP(0);
		healorder.setCategory(0);
		healorder.setType("Bug");
		movedex.put("Heal Order", healorder);

		Move poisontail = new Move("Poison Tail");
		poisontail.setBP(50);
		poisontail.setZBP(100);
		poisontail.setCategory(1);
		poisontail.setType("Poison");
		poisontail.setMakesContact(true);
		poisontail.setHasSecondaryEffect(true);
		movedex.put("Poison Tail", poisontail);

		Move roar = new Move("Roar");
		roar.setBP(0);
		roar.setZBP(0);
		roar.setCategory(0);
		roar.setType("Normal");
		movedex.put("Roar", roar);

		Move feint = new Move("Feint");
		feint.setBP(30);
		feint.setZBP(100);
		feint.setCategory(1);
		feint.setType("Normal");
		movedex.put("Feint", feint);

		Move healbell = new Move("Heal Bell");
		healbell.setBP(0);
		healbell.setZBP(0);
		healbell.setCategory(0);
		healbell.setType("Normal");
		healbell.setHasSecondaryEffect(true);
		movedex.put("Heal Bell", healbell);

		Move struggle = new Move("Struggle");
		struggle.setBP(50);
		struggle.setZBP(1);
		struggle.setCategory(1);
		struggle.setType("Normal");
		struggle.setMakesContact(true);
		movedex.put("Struggle", struggle);

		Move breakneckblitz = new Move("Breakneck Blitz");
		breakneckblitz.setBP(1);
		breakneckblitz.setZBP(0);
		breakneckblitz.setCategory(1);
		breakneckblitz.setType("Normal");
		movedex.put("Breakneck Blitz", breakneckblitz);

		Move ironhead = new Move("Iron Head");
		ironhead.setBP(80);
		ironhead.setZBP(160);
		ironhead.setCategory(1);
		ironhead.setType("Steel");
		ironhead.setMakesContact(true);
		ironhead.setHasSecondaryEffect(true);
		movedex.put("Iron Head", ironhead);

		Move zingzap = new Move("Zing Zap");
		zingzap.setBP(80);
		zingzap.setZBP(160);
		zingzap.setCategory(1);
		zingzap.setType("Electric");
		zingzap.setMakesContact(true);
		zingzap.setHasSecondaryEffect(true);
		movedex.put("Zing Zap", zingzap);

		Move playrough = new Move("Play Rough");
		playrough.setBP(90);
		playrough.setZBP(175);
		playrough.setCategory(1);
		playrough.setType("Fairy");
		playrough.setMakesContact(true);
		playrough.setHasSecondaryEffect(true);
		movedex.put("Play Rough", playrough);

		Move ember = new Move("Ember");
		ember.setBP(40);
		ember.setZBP(100);
		ember.setCategory(2);
		ember.setType("Fire");
		ember.setHasSecondaryEffect(true);
		movedex.put("Ember", ember);

		Move bide = new Move("Bide");
		bide.setBP(0);
		bide.setZBP(100);
		bide.setCategory(1);
		bide.setType("Normal");
		bide.setMakesContact(true);
		movedex.put("Bide", bide);

		Move blueflare = new Move("Blue Flare");
		blueflare.setBP(130);
		blueflare.setZBP(195);
		blueflare.setCategory(2);
		blueflare.setType("Fire");
		blueflare.setHasSecondaryEffect(true);
		movedex.put("Blue Flare", blueflare);

		Move dragontail = new Move("Dragon Tail");
		dragontail.setBP(60);
		dragontail.setZBP(120);
		dragontail.setCategory(1);
		dragontail.setType("Dragon");
		dragontail.setMakesContact(true);
		dragontail.setHasSecondaryEffect(true);
		movedex.put("Dragon Tail", dragontail);

		Move guillotine = new Move("Guillotine");
		guillotine.setBP(0);
		guillotine.setZBP(180);
		guillotine.setCategory(1);
		guillotine.setType("Normal");
		guillotine.setMakesContact(true);
		movedex.put("Guillotine", guillotine);

		Move mirrorshot = new Move("Mirror Shot");
		mirrorshot.setBP(65);
		mirrorshot.setZBP(120);
		mirrorshot.setCategory(2);
		mirrorshot.setType("Steel");
		mirrorshot.setHasSecondaryEffect(true);
		movedex.put("Mirror Shot", mirrorshot);

		Move attackorder = new Move("Attack Order");
		attackorder.setBP(90);
		attackorder.setZBP(175);
		attackorder.setCategory(1);
		attackorder.setType("Bug");
		movedex.put("Attack Order", attackorder);

		Move flamecharge = new Move("Flame Charge");
		flamecharge.setBP(50);
		flamecharge.setZBP(100);
		flamecharge.setCategory(1);
		flamecharge.setType("Fire");
		flamecharge.setMakesContact(true);
		flamecharge.setHasSecondaryEffect(true);
		movedex.put("Flame Charge", flamecharge);

		Move highjumpkick = new Move("High Jump Kick");
		highjumpkick.setBP(130);
		highjumpkick.setZBP(195);
		highjumpkick.setCategory(1);
		highjumpkick.setType("Fighting");
		highjumpkick.setMakesContact(true);
		movedex.put("High Jump Kick", highjumpkick);

		Move finalgambit = new Move("Final Gambit");
		finalgambit.setBP(0);
		finalgambit.setZBP(180);
		finalgambit.setCategory(2);
		finalgambit.setType("Fighting");
		movedex.put("Final Gambit", finalgambit);

		Move belch = new Move("Belch");
		belch.setBP(120);
		belch.setZBP(190);
		belch.setCategory(2);
		belch.setType("Poison");
		movedex.put("Belch", belch);

		Move hiddenpower = new Move("Hidden Power");
		hiddenpower.setBP(60);
		hiddenpower.setZBP(120);
		hiddenpower.setCategory(2);
		hiddenpower.setType("Normal");
		movedex.put("Hidden Power", hiddenpower);

		Move fleurcannon = new Move("Fleur Cannon");
		fleurcannon.setBP(130);
		fleurcannon.setZBP(195);
		fleurcannon.setCategory(2);
		fleurcannon.setType("Fairy");
		movedex.put("Fleur Cannon", fleurcannon);

		Move healpulse = new Move("Heal Pulse");
		healpulse.setBP(0);
		healpulse.setZBP(0);
		healpulse.setCategory(0);
		healpulse.setType("Psychic");
		movedex.put("Heal Pulse", healpulse);

		Move volttackle = new Move("Volt Tackle");
		volttackle.setBP(120);
		volttackle.setZBP(190);
		volttackle.setCategory(1);
		volttackle.setType("Electric");
		volttackle.setMakesContact(true);
		volttackle.setHasSecondaryEffect(true);
		volttackle.setHasRecoil(true);
		movedex.put("Volt Tackle", volttackle);

		Move aromaticmist = new Move("Aromatic Mist");
		aromaticmist.setBP(0);
		aromaticmist.setZBP(0);
		aromaticmist.setCategory(0);
		aromaticmist.setType("Fairy");
		movedex.put("Aromatic Mist", aromaticmist);

		Move pinmissile = new Move("Pin Missile");
		pinmissile.setBP(25);
		pinmissile.setZBP(140);
		pinmissile.setCategory(1);
		pinmissile.setType("Bug");
		pinmissile.setIsMultiHit(true);
		movedex.put("Pin Missile", pinmissile);

		Move sacredfire = new Move("Sacred Fire");
		sacredfire.setBP(100);
		sacredfire.setZBP(180);
		sacredfire.setCategory(1);
		sacredfire.setType("Fire");
		sacredfire.setHasSecondaryEffect(true);
		movedex.put("Sacred Fire", sacredfire);

		Move softboiled = new Move("Soft-Boiled");
		softboiled.setBP(0);
		softboiled.setZBP(0);
		softboiled.setCategory(0);
		softboiled.setType("Normal");
		movedex.put("Soft-Boiled", softboiled);

		Move tailglow = new Move("Tail Glow");
		tailglow.setBP(0);
		tailglow.setZBP(0);
		tailglow.setCategory(0);
		tailglow.setType("Bug");
		movedex.put("Tail Glow", tailglow);

		Move skydrop = new Move("Sky Drop");
		skydrop.setBP(60);
		skydrop.setZBP(120);
		skydrop.setCategory(1);
		skydrop.setType("Flying");
		skydrop.setMakesContact(true);
		movedex.put("Sky Drop", skydrop);

		Move guardsplit = new Move("Guard Split");
		guardsplit.setBP(0);
		guardsplit.setZBP(0);
		guardsplit.setCategory(0);
		guardsplit.setType("Psychic");
		movedex.put("Guard Split", guardsplit);

		Move substitute = new Move("Substitute");
		substitute.setBP(0);
		substitute.setZBP(0);
		substitute.setCategory(0);
		substitute.setType("Normal");
		movedex.put("Substitute", substitute);

		Move relicsong = new Move("Relic Song");
		relicsong.setBP(75);
		relicsong.setZBP(140);
		relicsong.setCategory(2);
		relicsong.setType("Normal");
		relicsong.setIsSpread(true);
		relicsong.setHasSecondaryEffect(true);
		movedex.put("Relic Song", relicsong);

		Move sleeptalk = new Move("Sleep Talk");
		sleeptalk.setBP(0);
		sleeptalk.setZBP(0);
		sleeptalk.setCategory(0);
		sleeptalk.setType("Normal");
		movedex.put("Sleep Talk", sleeptalk);

		Move bulldoze = new Move("Bulldoze");
		bulldoze.setBP(60);
		bulldoze.setZBP(120);
		bulldoze.setCategory(1);
		bulldoze.setType("Ground");
		bulldoze.setIsSpread(true);
		bulldoze.setHasSecondaryEffect(true);
		movedex.put("Bulldoze", bulldoze);

		Move electricterrain = new Move("Electric Terrain");
		electricterrain.setBP(0);
		electricterrain.setZBP(0);
		electricterrain.setCategory(0);
		electricterrain.setType("Electric");
		movedex.put("Electric Terrain", electricterrain);

		Move allyswitch = new Move("Ally Switch");
		allyswitch.setBP(0);
		allyswitch.setZBP(0);
		allyswitch.setCategory(0);
		allyswitch.setType("Psychic");
		movedex.put("Ally Switch", allyswitch);

		Move subzeroslammer = new Move("Subzero Slammer");
		subzeroslammer.setBP(1);
		subzeroslammer.setZBP(0);
		subzeroslammer.setCategory(1);
		subzeroslammer.setType("Ice");
		movedex.put("Subzero Slammer", subzeroslammer);

		Move overheat = new Move("Overheat");
		overheat.setBP(130);
		overheat.setZBP(195);
		overheat.setCategory(2);
		overheat.setType("Fire");
		movedex.put("Overheat", overheat);

		Move dualchop = new Move("Dual Chop");
		dualchop.setBP(40);
		dualchop.setZBP(100);
		dualchop.setCategory(1);
		dualchop.setType("Dragon");
		dualchop.setMakesContact(true);
		dualchop.setIsTwoHit(true);
		movedex.put("Dual Chop", dualchop);

		Move rapidspin = new Move("Rapid Spin");
		rapidspin.setBP(20);
		rapidspin.setZBP(100);
		rapidspin.setCategory(1);
		rapidspin.setType("Normal");
		rapidspin.setMakesContact(true);
		movedex.put("Rapid Spin", rapidspin);

		Move firepunch = new Move("Fire Punch");
		firepunch.setBP(75);
		firepunch.setZBP(140);
		firepunch.setCategory(1);
		firepunch.setType("Fire");
		firepunch.setMakesContact(true);
		firepunch.setHasSecondaryEffect(true);
		firepunch.setIsPunch(true);
		movedex.put("Fire Punch", firepunch);

		Move growl = new Move("Growl");
		growl.setBP(0);
		growl.setZBP(0);
		growl.setCategory(0);
		growl.setType("Normal");
		growl.setIsSpread(true);
		movedex.put("Growl", growl);

		Move wringout = new Move("Wring Out");
		wringout.setBP(0);
		wringout.setZBP(190);
		wringout.setCategory(2);
		wringout.setType("Normal");
		wringout.setMakesContact(true);
		movedex.put("Wring Out", wringout);

		Move protect = new Move("Protect");
		protect.setBP(0);
		protect.setZBP(0);
		protect.setCategory(0);
		protect.setType("Normal");
		movedex.put("Protect", protect);

		Move poisongas = new Move("Poison Gas");
		poisongas.setBP(0);
		poisongas.setZBP(0);
		poisongas.setCategory(0);
		poisongas.setType("Poison");
		poisongas.setIsSpread(true);
		movedex.put("Poison Gas", poisongas);

		Move swallow = new Move("Swallow");
		swallow.setBP(0);
		swallow.setZBP(0);
		swallow.setCategory(0);
		swallow.setType("Normal");
		movedex.put("Swallow", swallow);

		Move smellingsalts = new Move("Smelling Salts");
		smellingsalts.setBP(70);
		smellingsalts.setZBP(140);
		smellingsalts.setCategory(1);
		smellingsalts.setType("Normal");
		smellingsalts.setMakesContact(true);
		movedex.put("Smelling Salts", smellingsalts);

		Move entrainment = new Move("Entrainment");
		entrainment.setBP(0);
		entrainment.setZBP(0);
		entrainment.setCategory(0);
		entrainment.setType("Normal");
		movedex.put("Entrainment", entrainment);

		Move healblock = new Move("Heal Block");
		healblock.setBP(0);
		healblock.setZBP(0);
		healblock.setCategory(0);
		healblock.setType("Psychic");
		healblock.setIsSpread(true);
		movedex.put("Heal Block", healblock);

		Move darkpulse = new Move("Dark Pulse");
		darkpulse.setBP(80);
		darkpulse.setZBP(160);
		darkpulse.setCategory(2);
		darkpulse.setType("Dark");
		darkpulse.setHasSecondaryEffect(true);
		movedex.put("Dark Pulse", darkpulse);

		Move stompingtantrum = new Move("Stomping Tantrum");
		stompingtantrum.setBP(75);
		stompingtantrum.setZBP(140);
		stompingtantrum.setCategory(1);
		stompingtantrum.setType("Ground");
		stompingtantrum.setMakesContact(true);
		movedex.put("Stomping Tantrum", stompingtantrum);

		Move hiddenpowerflying = new Move("Hidden Power Flying");
		hiddenpowerflying.setBP(60);
		hiddenpowerflying.setZBP(0);
		hiddenpowerflying.setCategory(2);
		hiddenpowerflying.setType("Flying");
		movedex.put("Hidden Power Flying", hiddenpowerflying);

		Move holdback = new Move("Hold Back");
		holdback.setBP(40);
		holdback.setZBP(100);
		holdback.setCategory(1);
		holdback.setType("Normal");
		holdback.setMakesContact(true);
		movedex.put("Hold Back", holdback);

		Move odorsleuth = new Move("Odor Sleuth");
		odorsleuth.setBP(0);
		odorsleuth.setZBP(0);
		odorsleuth.setCategory(0);
		odorsleuth.setType("Normal");
		movedex.put("Odor Sleuth", odorsleuth);

		Move iceshard = new Move("Ice Shard");
		iceshard.setBP(40);
		iceshard.setZBP(100);
		iceshard.setCategory(1);
		iceshard.setType("Ice");
		movedex.put("Ice Shard", iceshard);

		Move flail = new Move("Flail");
		flail.setBP(0);
		flail.setZBP(160);
		flail.setCategory(1);
		flail.setType("Normal");
		flail.setMakesContact(true);
		movedex.put("Flail", flail);

		Move moonblast = new Move("Moonblast");
		moonblast.setBP(95);
		moonblast.setZBP(175);
		moonblast.setCategory(2);
		moonblast.setType("Fairy");
		moonblast.setHasSecondaryEffect(true);
		movedex.put("Moonblast", moonblast);

		Move razorshell = new Move("Razor Shell");
		razorshell.setBP(75);
		razorshell.setZBP(140);
		razorshell.setCategory(1);
		razorshell.setType("Water");
		razorshell.setMakesContact(true);
		razorshell.setHasSecondaryEffect(true);
		movedex.put("Razor Shell", razorshell);

		Move infestation = new Move("Infestation");
		infestation.setBP(20);
		infestation.setZBP(100);
		infestation.setCategory(2);
		infestation.setType("Bug");
		infestation.setMakesContact(true);
		movedex.put("Infestation", infestation);

		Move falseswipe = new Move("False Swipe");
		falseswipe.setBP(40);
		falseswipe.setZBP(100);
		falseswipe.setCategory(1);
		falseswipe.setType("Normal");
		falseswipe.setMakesContact(true);
		movedex.put("False Swipe", falseswipe);

		Move twister = new Move("Twister");
		twister.setBP(40);
		twister.setZBP(100);
		twister.setCategory(2);
		twister.setType("Dragon");
		twister.setIsSpread(true);
		twister.setHasSecondaryEffect(true);
		movedex.put("Twister", twister);

		Move zenheadbutt = new Move("Zen Headbutt");
		zenheadbutt.setBP(80);
		zenheadbutt.setZBP(160);
		zenheadbutt.setCategory(1);
		zenheadbutt.setType("Psychic");
		zenheadbutt.setMakesContact(true);
		zenheadbutt.setHasSecondaryEffect(true);
		movedex.put("Zen Headbutt", zenheadbutt);

		Move eruption = new Move("Eruption");
		eruption.setBP(150);
		eruption.setZBP(200);
		eruption.setCategory(2);
		eruption.setType("Fire");
		eruption.setIsSpread(true);
		movedex.put("Eruption", eruption);

		Move rage = new Move("Rage");
		rage.setBP(20);
		rage.setZBP(100);
		rage.setCategory(1);
		rage.setType("Normal");
		rage.setMakesContact(true);
		movedex.put("Rage", rage);

		Move submission = new Move("Submission");
		submission.setBP(80);
		submission.setZBP(160);
		submission.setCategory(1);
		submission.setType("Fighting");
		submission.setMakesContact(true);
		submission.setHasRecoil(true);
		movedex.put("Submission", submission);

		Move doubleedge = new Move("Double-Edge");
		doubleedge.setBP(120);
		doubleedge.setZBP(190);
		doubleedge.setCategory(1);
		doubleedge.setType("Normal");
		doubleedge.setMakesContact(true);
		doubleedge.setHasRecoil(true);
		movedex.put("Double-Edge", doubleedge);

		Move irondefense = new Move("Iron Defense");
		irondefense.setBP(0);
		irondefense.setZBP(0);
		irondefense.setCategory(0);
		irondefense.setType("Steel");
		movedex.put("Iron Defense", irondefense);

		Move psyshock = new Move("Psyshock");
		psyshock.setBP(80);
		psyshock.setZBP(160);
		psyshock.setCategory(3);
		psyshock.setType("Psychic");
		movedex.put("Psyshock", psyshock);

		Move gigavolthavoc = new Move("Gigavolt Havoc");
		gigavolthavoc.setBP(1);
		gigavolthavoc.setZBP(0);
		gigavolthavoc.setCategory(1);
		gigavolthavoc.setType("Electric");
		movedex.put("Gigavolt Havoc", gigavolthavoc);

		Move crushclaw = new Move("Crush Claw");
		crushclaw.setBP(75);
		crushclaw.setZBP(140);
		crushclaw.setCategory(1);
		crushclaw.setType("Normal");
		crushclaw.setMakesContact(true);
		crushclaw.setHasSecondaryEffect(true);
		movedex.put("Crush Claw", crushclaw);

		Move powdersnow = new Move("Powder Snow");
		powdersnow.setBP(40);
		powdersnow.setZBP(100);
		powdersnow.setCategory(2);
		powdersnow.setType("Ice");
		powdersnow.setIsSpread(true);
		powdersnow.setHasSecondaryEffect(true);
		movedex.put("Powder Snow", powdersnow);

		Move xscissor = new Move("X-Scissor");
		xscissor.setBP(80);
		xscissor.setZBP(160);
		xscissor.setCategory(1);
		xscissor.setType("Bug");
		xscissor.setMakesContact(true);
		movedex.put("X-Scissor", xscissor);

		Move rollingkick = new Move("Rolling Kick");
		rollingkick.setBP(60);
		rollingkick.setZBP(120);
		rollingkick.setCategory(1);
		rollingkick.setType("Fighting");
		rollingkick.setMakesContact(true);
		rollingkick.setHasSecondaryEffect(true);
		movedex.put("Rolling Kick", rollingkick);

		Move searingsunrazesmash = new Move("Searing Sunraze Smash");
		searingsunrazesmash.setBP(200);
		searingsunrazesmash.setZBP(0);
		searingsunrazesmash.setCategory(1);
		searingsunrazesmash.setType("Steel");
		searingsunrazesmash.setMakesContact(true);
		searingsunrazesmash.setIsSignatureZ(true);
		movedex.put("Searing Sunraze Smash", searingsunrazesmash);

		Move extrasensory = new Move("Extrasensory");
		extrasensory.setBP(80);
		extrasensory.setZBP(160);
		extrasensory.setCategory(2);
		extrasensory.setType("Psychic");
		extrasensory.setHasSecondaryEffect(true);
		movedex.put("Extrasensory", extrasensory);

		Move leechlife = new Move("Leech Life");
		leechlife.setBP(80);
		leechlife.setZBP(160);
		leechlife.setCategory(1);
		leechlife.setType("Bug");
		leechlife.setMakesContact(true);
		movedex.put("Leech Life", leechlife);

		Move poisonjab = new Move("Poison Jab");
		poisonjab.setBP(80);
		poisonjab.setZBP(160);
		poisonjab.setCategory(1);
		poisonjab.setType("Poison");
		poisonjab.setMakesContact(true);
		poisonjab.setHasSecondaryEffect(true);
		movedex.put("Poison Jab", poisonjab);

		Move acidspray = new Move("Acid Spray");
		acidspray.setBP(40);
		acidspray.setZBP(100);
		acidspray.setCategory(2);
		acidspray.setType("Poison");
		acidspray.setHasSecondaryEffect(true);
		movedex.put("Acid Spray", acidspray);

		Move hiddenpowerfire = new Move("Hidden Power Fire");
		hiddenpowerfire.setBP(60);
		hiddenpowerfire.setZBP(0);
		hiddenpowerfire.setCategory(2);
		hiddenpowerfire.setType("Fire");
		movedex.put("Hidden Power Fire", hiddenpowerfire);

		Move barrier = new Move("Barrier");
		barrier.setBP(0);
		barrier.setZBP(0);
		barrier.setCategory(0);
		barrier.setType("Psychic");
		movedex.put("Barrier", barrier);

		Move spite = new Move("Spite");
		spite.setBP(0);
		spite.setZBP(0);
		spite.setCategory(0);
		spite.setType("Ghost");
		movedex.put("Spite", spite);

		Move grasspledge = new Move("Grass Pledge");
		grasspledge.setBP(80);
		grasspledge.setZBP(160);
		grasspledge.setCategory(2);
		grasspledge.setType("Grass");
		movedex.put("Grass Pledge", grasspledge);

		Move seedbomb = new Move("Seed Bomb");
		seedbomb.setBP(80);
		seedbomb.setZBP(160);
		seedbomb.setCategory(1);
		seedbomb.setType("Grass");
		movedex.put("Seed Bomb", seedbomb);

		Move strengthsap = new Move("Strength Sap");
		strengthsap.setBP(0);
		strengthsap.setZBP(0);
		strengthsap.setCategory(0);
		strengthsap.setType("Grass");
		movedex.put("Strength Sap", strengthsap);

		Move magnetrise = new Move("Magnet Rise");
		magnetrise.setBP(0);
		magnetrise.setZBP(0);
		magnetrise.setCategory(0);
		magnetrise.setType("Electric");
		movedex.put("Magnet Rise", magnetrise);

		Move morningsun = new Move("Morning Sun");
		morningsun.setBP(0);
		morningsun.setZBP(0);
		morningsun.setCategory(0);
		morningsun.setType("Normal");
		movedex.put("Morning Sun", morningsun);

		Move flamewheel = new Move("Flame Wheel");
		flamewheel.setBP(60);
		flamewheel.setZBP(120);
		flamewheel.setCategory(1);
		flamewheel.setType("Fire");
		flamewheel.setMakesContact(true);
		flamewheel.setHasSecondaryEffect(true);
		movedex.put("Flame Wheel", flamewheel);

		Move savagespinout = new Move("Savage Spin-Out");
		savagespinout.setBP(1);
		savagespinout.setZBP(0);
		savagespinout.setCategory(1);
		savagespinout.setType("Bug");
		movedex.put("Savage Spin-Out", savagespinout);

		Move trickortreat = new Move("Trick-or-Treat");
		trickortreat.setBP(0);
		trickortreat.setZBP(0);
		trickortreat.setCategory(0);
		trickortreat.setType("Ghost");
		movedex.put("Trick-or-Treat", trickortreat);

		Move flatter = new Move("Flatter");
		flatter.setBP(0);
		flatter.setZBP(0);
		flatter.setCategory(0);
		flatter.setType("Dark");
		movedex.put("Flatter", flatter);

		Move drillrun = new Move("Drill Run");
		drillrun.setBP(80);
		drillrun.setZBP(160);
		drillrun.setCategory(1);
		drillrun.setType("Ground");
		drillrun.setMakesContact(true);
		movedex.put("Drill Run", drillrun);

		Move banefulbunker = new Move("Baneful Bunker");
		banefulbunker.setBP(0);
		banefulbunker.setZBP(0);
		banefulbunker.setCategory(0);
		banefulbunker.setType("Poison");
		movedex.put("Baneful Bunker", banefulbunker);

		Move dragonrush = new Move("Dragon Rush");
		dragonrush.setBP(100);
		dragonrush.setZBP(180);
		dragonrush.setCategory(1);
		dragonrush.setType("Dragon");
		dragonrush.setMakesContact(true);
		dragonrush.setHasSecondaryEffect(true);
		movedex.put("Dragon Rush", dragonrush);

		Move rollout = new Move("Rollout");
		rollout.setBP(30);
		rollout.setZBP(100);
		rollout.setCategory(1);
		rollout.setType("Rock");
		rollout.setMakesContact(true);
		movedex.put("Rollout", rollout);

		Move wingattack = new Move("Wing Attack");
		wingattack.setBP(60);
		wingattack.setZBP(120);
		wingattack.setCategory(1);
		wingattack.setType("Flying");
		wingattack.setMakesContact(true);
		movedex.put("Wing Attack", wingattack);

		Move jumpkick = new Move("Jump Kick");
		jumpkick.setBP(100);
		jumpkick.setZBP(180);
		jumpkick.setCategory(1);
		jumpkick.setType("Fighting");
		jumpkick.setMakesContact(true);
		movedex.put("Jump Kick", jumpkick);

		Move armthrust = new Move("Arm Thrust");
		armthrust.setBP(15);
		armthrust.setZBP(100);
		armthrust.setCategory(1);
		armthrust.setType("Fighting");
		armthrust.setMakesContact(true);
		armthrust.setIsMultiHit(true);
		movedex.put("Arm Thrust", armthrust);

		Move magnetbomb = new Move("Magnet Bomb");
		magnetbomb.setBP(60);
		magnetbomb.setZBP(120);
		magnetbomb.setCategory(1);
		magnetbomb.setType("Steel");
		movedex.put("Magnet Bomb", magnetbomb);

		Move earthquake = new Move("Earthquake");
		earthquake.setBP(100);
		earthquake.setZBP(180);
		earthquake.setCategory(1);
		earthquake.setType("Ground");
		earthquake.setIsSpread(true);
		movedex.put("Earthquake", earthquake);

		Move neverendingnightmare = new Move("Never-Ending Nightmare");
		neverendingnightmare.setBP(1);
		neverendingnightmare.setZBP(0);
		neverendingnightmare.setCategory(1);
		neverendingnightmare.setType("Ghost");
		movedex.put("Never-Ending Nightmare", neverendingnightmare);

		Move earthpower = new Move("Earth Power");
		earthpower.setBP(90);
		earthpower.setZBP(175);
		earthpower.setCategory(2);
		earthpower.setType("Ground");
		earthpower.setHasSecondaryEffect(true);
		movedex.put("Earth Power", earthpower);

		Move nightmare = new Move("Nightmare");
		nightmare.setBP(0);
		nightmare.setZBP(0);
		nightmare.setCategory(0);
		nightmare.setType("Ghost");
		movedex.put("Nightmare", nightmare);

		Move firelash = new Move("Fire Lash");
		firelash.setBP(80);
		firelash.setZBP(160);
		firelash.setCategory(1);
		firelash.setType("Fire");
		firelash.setMakesContact(true);
		firelash.setHasSecondaryEffect(true);
		movedex.put("Fire Lash", firelash);

		Move soak = new Move("Soak");
		soak.setBP(0);
		soak.setZBP(0);
		soak.setCategory(0);
		soak.setType("Water");
		movedex.put("Soak", soak);

		Move needlearm = new Move("Needle Arm");
		needlearm.setBP(60);
		needlearm.setZBP(120);
		needlearm.setCategory(1);
		needlearm.setType("Grass");
		needlearm.setMakesContact(true);
		needlearm.setHasSecondaryEffect(true);
		movedex.put("Needle Arm", needlearm);

		Move shadowpunch = new Move("Shadow Punch");
		shadowpunch.setBP(60);
		shadowpunch.setZBP(120);
		shadowpunch.setCategory(1);
		shadowpunch.setType("Ghost");
		shadowpunch.setMakesContact(true);
		shadowpunch.setIsPunch(true);
		movedex.put("Shadow Punch", shadowpunch);

		Move spikes = new Move("Spikes");
		spikes.setBP(0);
		spikes.setZBP(0);
		spikes.setCategory(0);
		spikes.setType("Ground");
		movedex.put("Spikes", spikes);

		Move closecombat = new Move("Close Combat");
		closecombat.setBP(120);
		closecombat.setZBP(190);
		closecombat.setCategory(1);
		closecombat.setType("Fighting");
		closecombat.setMakesContact(true);
		movedex.put("Close Combat", closecombat);

		Move flameburst = new Move("Flame Burst");
		flameburst.setBP(70);
		flameburst.setZBP(140);
		flameburst.setCategory(2);
		flameburst.setType("Fire");
		movedex.put("Flame Burst", flameburst);

		Move forcepalm = new Move("Force Palm");
		forcepalm.setBP(60);
		forcepalm.setZBP(120);
		forcepalm.setCategory(1);
		forcepalm.setType("Fighting");
		forcepalm.setMakesContact(true);
		forcepalm.setHasSecondaryEffect(true);
		movedex.put("Force Palm", forcepalm);

		Move quash = new Move("Quash");
		quash.setBP(0);
		quash.setZBP(0);
		quash.setCategory(0);
		quash.setType("Dark");
		movedex.put("Quash", quash);

		Move dizzypunch = new Move("Dizzy Punch");
		dizzypunch.setBP(70);
		dizzypunch.setZBP(140);
		dizzypunch.setCategory(1);
		dizzypunch.setType("Normal");
		dizzypunch.setMakesContact(true);
		dizzypunch.setHasSecondaryEffect(true);
		dizzypunch.setIsPunch(true);
		movedex.put("Dizzy Punch", dizzypunch);

		Move hydrovortex = new Move("Hydro Vortex");
		hydrovortex.setBP(1);
		hydrovortex.setZBP(0);
		hydrovortex.setCategory(1);
		hydrovortex.setType("Water");
		movedex.put("Hydro Vortex", hydrovortex);

		Move iceburn = new Move("Ice Burn");
		iceburn.setBP(140);
		iceburn.setZBP(200);
		iceburn.setCategory(2);
		iceburn.setType("Ice");
		iceburn.setHasSecondaryEffect(true);
		movedex.put("Ice Burn", iceburn);

		Move muddywater = new Move("Muddy Water");
		muddywater.setBP(90);
		muddywater.setZBP(175);
		muddywater.setCategory(2);
		muddywater.setType("Water");
		muddywater.setIsSpread(true);
		muddywater.setHasSecondaryEffect(true);
		movedex.put("Muddy Water", muddywater);

		Move moonlight = new Move("Moonlight");
		moonlight.setBP(0);
		moonlight.setZBP(0);
		moonlight.setCategory(0);
		moonlight.setType("Fairy");
		movedex.put("Moonlight", moonlight);

		Move destinybond = new Move("Destiny Bond");
		destinybond.setBP(0);
		destinybond.setZBP(0);
		destinybond.setCategory(0);
		destinybond.setType("Ghost");
		movedex.put("Destiny Bond", destinybond);

		Move miracleeye = new Move("Miracle Eye");
		miracleeye.setBP(0);
		miracleeye.setZBP(0);
		miracleeye.setCategory(0);
		miracleeye.setType("Psychic");
		movedex.put("Miracle Eye", miracleeye);

		Move razorleaf = new Move("Razor Leaf");
		razorleaf.setBP(55);
		razorleaf.setZBP(100);
		razorleaf.setCategory(1);
		razorleaf.setType("Grass");
		razorleaf.setIsSpread(true);
		movedex.put("Razor Leaf", razorleaf);

		Move scald = new Move("Scald");
		scald.setBP(80);
		scald.setZBP(160);
		scald.setCategory(2);
		scald.setType("Water");
		scald.setHasSecondaryEffect(true);
		movedex.put("Scald", scald);

		Move drainingkiss = new Move("Draining Kiss");
		drainingkiss.setBP(50);
		drainingkiss.setZBP(100);
		drainingkiss.setCategory(2);
		drainingkiss.setType("Fairy");
		drainingkiss.setMakesContact(true);
		movedex.put("Draining Kiss", drainingkiss);

		Move powder = new Move("Powder");
		powder.setBP(0);
		powder.setZBP(0);
		powder.setCategory(0);
		powder.setType("Bug");
		movedex.put("Powder", powder);

		Move bestow = new Move("Bestow");
		bestow.setBP(0);
		bestow.setZBP(0);
		bestow.setCategory(0);
		bestow.setType("Normal");
		movedex.put("Bestow", bestow);

		Move skyuppercut = new Move("Sky Uppercut");
		skyuppercut.setBP(85);
		skyuppercut.setZBP(160);
		skyuppercut.setCategory(1);
		skyuppercut.setType("Fighting");
		skyuppercut.setMakesContact(true);
		skyuppercut.setIsPunch(true);
		movedex.put("Sky Uppercut", skyuppercut);

		Move secretpower = new Move("Secret Power");
		secretpower.setBP(70);
		secretpower.setZBP(140);
		secretpower.setCategory(1);
		secretpower.setType("Normal");
		secretpower.setHasSecondaryEffect(true);
		movedex.put("Secret Power", secretpower);

		Move captivate = new Move("Captivate");
		captivate.setBP(0);
		captivate.setZBP(0);
		captivate.setCategory(0);
		captivate.setType("Normal");
		captivate.setIsSpread(true);
		movedex.put("Captivate", captivate);

		Move extremespeed = new Move("Extreme Speed");
		extremespeed.setBP(80);
		extremespeed.setZBP(160);
		extremespeed.setCategory(1);
		extremespeed.setType("Normal");
		extremespeed.setMakesContact(true);
		movedex.put("Extreme Speed", extremespeed);

		Move menacingmoonrazemaelstrom = new Move("Menacing Moonraze Maelstrom");
		menacingmoonrazemaelstrom.setBP(200);
		menacingmoonrazemaelstrom.setZBP(0);
		menacingmoonrazemaelstrom.setCategory(2);
		menacingmoonrazemaelstrom.setType("Ghost");
		menacingmoonrazemaelstrom.setIsSignatureZ(true);
		movedex.put("Menacing Moonraze Maelstrom", menacingmoonrazemaelstrom);

		Move mudshot = new Move("Mud Shot");
		mudshot.setBP(55);
		mudshot.setZBP(100);
		mudshot.setCategory(2);
		mudshot.setType("Ground");
		mudshot.setHasSecondaryEffect(true);
		movedex.put("Mud Shot", mudshot);

		Move toxicthread = new Move("Toxic Thread");
		toxicthread.setBP(0);
		toxicthread.setZBP(0);
		toxicthread.setCategory(0);
		toxicthread.setType("Poison");
		movedex.put("Toxic Thread", toxicthread);

		Move leer = new Move("Leer");
		leer.setBP(0);
		leer.setZBP(0);
		leer.setCategory(0);
		leer.setType("Normal");
		leer.setIsSpread(true);
		movedex.put("Leer", leer);

		Move letssnuggleforever = new Move("Let's Snuggle Forever");
		letssnuggleforever.setBP(190);
		letssnuggleforever.setZBP(0);
		letssnuggleforever.setCategory(1);
		letssnuggleforever.setType("Fairy");
		letssnuggleforever.setMakesContact(true);
		letssnuggleforever.setIsSignatureZ(true);
		movedex.put("Let's Snuggle Forever", letssnuggleforever);

		Move luckychant = new Move("Lucky Chant");
		luckychant.setBP(0);
		luckychant.setZBP(0);
		luckychant.setCategory(0);
		luckychant.setType("Normal");
		movedex.put("Lucky Chant", luckychant);

		Move switcheroo = new Move("Switcheroo");
		switcheroo.setBP(0);
		switcheroo.setZBP(0);
		switcheroo.setCategory(0);
		switcheroo.setType("Dark");
		movedex.put("Switcheroo", switcheroo);

		Move dynamicpunch = new Move("Dynamic Punch");
		dynamicpunch.setBP(100);
		dynamicpunch.setZBP(180);
		dynamicpunch.setCategory(1);
		dynamicpunch.setType("Fighting");
		dynamicpunch.setMakesContact(true);
		dynamicpunch.setHasSecondaryEffect(true);
		dynamicpunch.setIsPunch(true);
		movedex.put("Dynamic Punch", dynamicpunch);

		Move lastresort = new Move("Last Resort");
		lastresort.setBP(140);
		lastresort.setZBP(200);
		lastresort.setCategory(1);
		lastresort.setType("Normal");
		lastresort.setMakesContact(true);
		movedex.put("Last Resort", lastresort);

		Move doubleteam = new Move("Double Team");
		doubleteam.setBP(0);
		doubleteam.setZBP(0);
		doubleteam.setCategory(0);
		doubleteam.setType("Normal");
		movedex.put("Double Team", doubleteam);

		Move vinewhip = new Move("Vine Whip");
		vinewhip.setBP(45);
		vinewhip.setZBP(100);
		vinewhip.setCategory(1);
		vinewhip.setType("Grass");
		vinewhip.setMakesContact(true);
		movedex.put("Vine Whip", vinewhip);

		Move mindreader = new Move("Mind Reader");
		mindreader.setBP(0);
		mindreader.setZBP(0);
		mindreader.setCategory(0);
		mindreader.setType("Normal");
		movedex.put("Mind Reader", mindreader);

		Move camouflage = new Move("Camouflage");
		camouflage.setBP(0);
		camouflage.setZBP(0);
		camouflage.setCategory(0);
		camouflage.setType("Normal");
		movedex.put("Camouflage", camouflage);

		Move psychic = new Move("Psychic");
		psychic.setBP(90);
		psychic.setZBP(175);
		psychic.setCategory(2);
		psychic.setType("Psychic");
		psychic.setHasSecondaryEffect(true);
		movedex.put("Psychic", psychic);

		Move confuseray = new Move("Confuse Ray");
		confuseray.setBP(0);
		confuseray.setZBP(0);
		confuseray.setCategory(0);
		confuseray.setType("Ghost");
		movedex.put("Confuse Ray", confuseray);

		Move thousandwaves = new Move("Thousand Waves");
		thousandwaves.setBP(90);
		thousandwaves.setZBP(175);
		thousandwaves.setCategory(1);
		thousandwaves.setType("Ground");
		thousandwaves.setIsSpread(true);
		movedex.put("Thousand Waves", thousandwaves);

		Move energyball = new Move("Energy Ball");
		energyball.setBP(90);
		energyball.setZBP(175);
		energyball.setCategory(2);
		energyball.setType("Grass");
		energyball.setHasSecondaryEffect(true);
		movedex.put("Energy Ball", energyball);

		Move hiddenpowersteel = new Move("Hidden Power Steel");
		hiddenpowersteel.setBP(60);
		hiddenpowersteel.setZBP(0);
		hiddenpowersteel.setCategory(2);
		hiddenpowersteel.setType("Steel");
		movedex.put("Hidden Power Steel", hiddenpowersteel);

		Move spikecannon = new Move("Spike Cannon");
		spikecannon.setBP(20);
		spikecannon.setZBP(100);
		spikecannon.setCategory(1);
		spikecannon.setType("Normal");
		spikecannon.setIsMultiHit(true);
		movedex.put("Spike Cannon", spikecannon);

		Move leafage = new Move("Leafage");
		leafage.setBP(40);
		leafage.setZBP(100);
		leafage.setCategory(1);
		leafage.setType("Grass");
		movedex.put("Leafage", leafage);

		Move rest = new Move("Rest");
		rest.setBP(0);
		rest.setZBP(0);
		rest.setCategory(0);
		rest.setType("Psychic");
		movedex.put("Rest", rest);

		Move rockblast = new Move("Rock Blast");
		rockblast.setBP(25);
		rockblast.setZBP(140);
		rockblast.setCategory(1);
		rockblast.setType("Rock");
		rockblast.setIsMultiHit(true);
		movedex.put("Rock Blast", rockblast);

		Move doublekick = new Move("Double Kick");
		doublekick.setBP(30);
		doublekick.setZBP(100);
		doublekick.setCategory(1);
		doublekick.setType("Fighting");
		doublekick.setMakesContact(true);
		doublekick.setIsTwoHit(true);
		movedex.put("Double Kick", doublekick);

		Move firstimpression = new Move("First Impression");
		firstimpression.setBP(90);
		firstimpression.setZBP(175);
		firstimpression.setCategory(1);
		firstimpression.setType("Bug");
		firstimpression.setMakesContact(true);
		movedex.put("First Impression", firstimpression);

		Move sludge = new Move("Sludge");
		sludge.setBP(65);
		sludge.setZBP(120);
		sludge.setCategory(2);
		sludge.setType("Poison");
		sludge.setHasSecondaryEffect(true);
		movedex.put("Sludge", sludge);

		Move revenge = new Move("Revenge");
		revenge.setBP(60);
		revenge.setZBP(120);
		revenge.setCategory(1);
		revenge.setType("Fighting");
		revenge.setMakesContact(true);
		movedex.put("Revenge", revenge);

		Move smartstrike = new Move("Smart Strike");
		smartstrike.setBP(70);
		smartstrike.setZBP(140);
		smartstrike.setCategory(1);
		smartstrike.setType("Steel");
		smartstrike.setMakesContact(true);
		movedex.put("Smart Strike", smartstrike);

		Move willowisp = new Move("Will-O-Wisp");
		willowisp.setBP(0);
		willowisp.setZBP(0);
		willowisp.setCategory(0);
		willowisp.setType("Fire");
		movedex.put("Will-O-Wisp", willowisp);

		Move yawn = new Move("Yawn");
		yawn.setBP(0);
		yawn.setZBP(0);
		yawn.setCategory(0);
		yawn.setType("Normal");
		movedex.put("Yawn", yawn);

		Move fairylock = new Move("Fairy Lock");
		fairylock.setBP(0);
		fairylock.setZBP(0);
		fairylock.setCategory(0);
		fairylock.setType("Fairy");
		movedex.put("Fairy Lock", fairylock);

		Move poisonsting = new Move("Poison Sting");
		poisonsting.setBP(15);
		poisonsting.setZBP(100);
		poisonsting.setCategory(1);
		poisonsting.setType("Poison");
		poisonsting.setHasSecondaryEffect(true);
		movedex.put("Poison Sting", poisonsting);

		Move hail = new Move("Hail");
		hail.setBP(0);
		hail.setZBP(0);
		hail.setCategory(0);
		hail.setType("Ice");
		movedex.put("Hail", hail);

		Move headsmash = new Move("Head Smash");
		headsmash.setBP(150);
		headsmash.setZBP(200);
		headsmash.setCategory(1);
		headsmash.setType("Rock");
		headsmash.setMakesContact(true);
		headsmash.setHasRecoil(true);
		movedex.put("Head Smash", headsmash);

		Move nastyplot = new Move("Nasty Plot");
		nastyplot.setBP(0);
		nastyplot.setZBP(0);
		nastyplot.setCategory(0);
		nastyplot.setType("Dark");
		movedex.put("Nasty Plot", nastyplot);

		Move psychicterrain = new Move("Psychic Terrain");
		psychicterrain.setBP(0);
		psychicterrain.setZBP(0);
		psychicterrain.setCategory(0);
		psychicterrain.setType("Psychic");
		movedex.put("Psychic Terrain", psychicterrain);

		Move swordsdance = new Move("Swords Dance");
		swordsdance.setBP(0);
		swordsdance.setZBP(0);
		swordsdance.setCategory(0);
		swordsdance.setType("Normal");
		movedex.put("Swords Dance", swordsdance);

		Move tropkick = new Move("Trop Kick");
		tropkick.setBP(70);
		tropkick.setZBP(140);
		tropkick.setCategory(1);
		tropkick.setType("Grass");
		tropkick.setMakesContact(true);
		tropkick.setHasSecondaryEffect(true);
		movedex.put("Trop Kick", tropkick);

		Move solarblade = new Move("Solar Blade");
		solarblade.setBP(125);
		solarblade.setZBP(190);
		solarblade.setCategory(1);
		solarblade.setType("Grass");
		solarblade.setMakesContact(true);
		movedex.put("Solar Blade", solarblade);

		Move hiddenpowerghost = new Move("Hidden Power Ghost");
		hiddenpowerghost.setBP(60);
		hiddenpowerghost.setZBP(0);
		hiddenpowerghost.setCategory(2);
		hiddenpowerghost.setType("Ghost");
		movedex.put("Hidden Power Ghost", hiddenpowerghost);

		Move round = new Move("Round");
		round.setBP(60);
		round.setZBP(120);
		round.setCategory(2);
		round.setType("Normal");
		movedex.put("Round", round);

		Move disarmingvoice = new Move("Disarming Voice");
		disarmingvoice.setBP(40);
		disarmingvoice.setZBP(100);
		disarmingvoice.setCategory(2);
		disarmingvoice.setType("Fairy");
		disarmingvoice.setIsSpread(true);
		movedex.put("Disarming Voice", disarmingvoice);

		Move megahorn = new Move("Megahorn");
		megahorn.setBP(120);
		megahorn.setZBP(190);
		megahorn.setCategory(1);
		megahorn.setType("Bug");
		megahorn.setMakesContact(true);
		movedex.put("Megahorn", megahorn);

		Move bravebird = new Move("Brave Bird");
		bravebird.setBP(120);
		bravebird.setZBP(190);
		bravebird.setCategory(1);
		bravebird.setType("Flying");
		bravebird.setMakesContact(true);
		bravebird.setHasRecoil(true);
		movedex.put("Brave Bird", bravebird);

		Move bubblebeam = new Move("Bubble Beam");
		bubblebeam.setBP(65);
		bubblebeam.setZBP(120);
		bubblebeam.setCategory(2);
		bubblebeam.setType("Water");
		bubblebeam.setHasSecondaryEffect(true);
		movedex.put("Bubble Beam", bubblebeam);

		Move growth = new Move("Growth");
		growth.setBP(0);
		growth.setZBP(0);
		growth.setCategory(0);
		growth.setType("Normal");
		movedex.put("Growth", growth);

		Move slash = new Move("Slash");
		slash.setBP(70);
		slash.setZBP(140);
		slash.setCategory(1);
		slash.setType("Normal");
		slash.setMakesContact(true);
		movedex.put("Slash", slash);

		Move flareblitz = new Move("Flare Blitz");
		flareblitz.setBP(120);
		flareblitz.setZBP(190);
		flareblitz.setCategory(1);
		flareblitz.setType("Fire");
		flareblitz.setMakesContact(true);
		flareblitz.setHasSecondaryEffect(true);
		flareblitz.setHasRecoil(true);
		movedex.put("Flare Blitz", flareblitz);

		Move gust = new Move("Gust");
		gust.setBP(40);
		gust.setZBP(100);
		gust.setCategory(2);
		gust.setType("Flying");
		movedex.put("Gust", gust);

		Move none = new Move("(none)");
		none.setBP(0);
		none.setZBP(0);
		none.setCategory(0);
		none.setType("(none)");
		movedex.put("(none)", none);
	}
}
