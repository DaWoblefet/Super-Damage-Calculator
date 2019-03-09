/* Associates an item with various properties. Note the Sinnoh trio orbs and Soul Dew
 * are considered to be type-boosting items with only one primary type; the logic
 * for all items is checked in CalculateDamage.
 * Data from Pokemon Showdown's items file: https://raw.githubusercontent.com/Zarel/Pokemon-Showdown/master/data/items.js */

package superDamageCalculator;
import java.util.HashMap;

public class Itemdex
{
	public HashMap<String, Item> items = new HashMap<String, Item>();

	public Itemdex()
	{
		init();
	}

	public void init()
	{
		Item none = new Item("(none)");
		items.put("(none)", none);
		
		Item abomasite = new Item("Abomasite");
		abomasite.setMegaStone(true);
		items.put("Abomasite", abomasite);

		Item absolite = new Item("Absolite");
		absolite.setMegaStone(true);
		items.put("Absolite", absolite);

		Item absorbbulb = new Item("Absorb Bulb");
		absorbbulb.setFlingBP(30);
		items.put("Absorb Bulb", absorbbulb);

		Item adamantorb = new Item("Adamant Orb");
		adamantorb.setTypeAssociated("Multiple");
		adamantorb.setTypeBoosting(true);
		adamantorb.setFlingBP(60);
		items.put("Adamant Orb", adamantorb);

		Item adrenalineorb = new Item("Adrenaline Orb");
		adrenalineorb.setFlingBP(30);
		items.put("Adrenaline Orb", adrenalineorb);

		Item aerodactylite = new Item("Aerodactylite");
		aerodactylite.setMegaStone(true);
		items.put("Aerodactylite", aerodactylite);

		Item aggronite = new Item("Aggronite");
		aggronite.setMegaStone(true);
		items.put("Aggronite", aggronite);

		Item aguavberry = new Item("Aguav Berry");
		aguavberry.setBerry(true);
		aguavberry.setNaturalGiftType("Dragon");
		aguavberry.setNaturalGiftBP(80);
		items.put("Aguav Berry", aguavberry);

		Item airballoon = new Item("Air Balloon");
		airballoon.setFlingBP(10);
		items.put("Air Balloon", airballoon);

		Item alakazite = new Item("Alakazite");
		alakazite.setMegaStone(true);
		items.put("Alakazite", alakazite);

		Item aloraichiumz = new Item("Aloraichium Z");
		aloraichiumz.setZCrystal(true);
		items.put("Aloraichium Z", aloraichiumz);

		Item altarianite = new Item("Altarianite");
		altarianite.setMegaStone(true);
		items.put("Altarianite", altarianite);

		Item ampharosite = new Item("Ampharosite");
		ampharosite.setMegaStone(true);
		items.put("Ampharosite", ampharosite);

		Item apicotberry = new Item("Apicot Berry");
		apicotberry.setBerry(true);
		apicotberry.setNaturalGiftType("Ground");
		apicotberry.setNaturalGiftBP(100);
		items.put("Apicot Berry", apicotberry);

		Item aspearberry = new Item("Aspear Berry");
		aspearberry.setBerry(true);
		aspearberry.setNaturalGiftType("Ice");
		aspearberry.setNaturalGiftBP(80);
		items.put("Aspear Berry", aspearberry);

		Item assaultvest = new Item("Assault Vest");
		assaultvest.setFlingBP(80);
		items.put("Assault Vest", assaultvest);

		Item audinite = new Item("Audinite");
		audinite.setMegaStone(true);
		items.put("Audinite", audinite);

		Item babiriberry = new Item("Babiri Berry");
		babiriberry.setBerry(true);
		babiriberry.setResistBerry(true);
		babiriberry.setNaturalGiftType("Steel");
		babiriberry.setNaturalGiftBP(80);
		babiriberry.setTypeAssociated("Steel");
		items.put("Babiri Berry", babiriberry);

		Item banettite = new Item("Banettite");
		banettite.setMegaStone(true);
		items.put("Banettite", banettite);

		Item beedrillite = new Item("Beedrillite");
		beedrillite.setMegaStone(true);
		items.put("Beedrillite", beedrillite);

		Item belueberry = new Item("Belue Berry");
		belueberry.setBerry(true);
		belueberry.setNaturalGiftType("Electric");
		belueberry.setNaturalGiftBP(100);
		items.put("Belue Berry", belueberry);

		Item berryjuice = new Item("Berry Juice");
		berryjuice.setFlingBP(30);
		items.put("Berry Juice", berryjuice);

		Item bigroot = new Item("Big Root");
		bigroot.setFlingBP(10);
		items.put("Big Root", bigroot);

		Item bindingband = new Item("Binding Band");
		bindingband.setFlingBP(30);
		items.put("Binding Band", bindingband);

		Item blackbelt = new Item("Black Belt");
		blackbelt.setTypeAssociated("Fighting");
		blackbelt.setTypeBoosting(true);
		blackbelt.setFlingBP(30);
		items.put("Black Belt", blackbelt);

		Item blackglasses = new Item("Black Glasses");
		blackglasses.setTypeAssociated("Dark");
		blackglasses.setTypeBoosting(true);
		blackglasses.setFlingBP(30);
		items.put("Black Glasses", blackglasses);

		Item blacksludge = new Item("Black Sludge");
		blacksludge.setFlingBP(30);
		items.put("Black Sludge", blacksludge);

		Item blastoisinite = new Item("Blastoisinite");
		blastoisinite.setMegaStone(true);
		items.put("Blastoisinite", blastoisinite);

		Item blazikenite = new Item("Blazikenite");
		blazikenite.setMegaStone(true);
		items.put("Blazikenite", blazikenite);

		Item blueorb = new Item("Blue Orb");
		items.put("Blue Orb", blueorb);

		Item blukberry = new Item("Bluk Berry");
		blukberry.setBerry(true);
		blukberry.setNaturalGiftType("Fire");
		blukberry.setNaturalGiftBP(90);
		items.put("Bluk Berry", blukberry);

		Item brightpowder = new Item("BrightPowder");
		brightpowder.setFlingBP(10);
		items.put("BrightPowder", brightpowder);

		Item buggem = new Item("Bug Gem");
		buggem.setTypeAssociated("Bug");
		buggem.setGem(true);
		items.put("Bug Gem", buggem);

		Item bugmemory = new Item("Bug Memory");
		bugmemory.setTypeAssociated("Bug");
		bugmemory.setMemory(true);
		items.put("Bug Memory", bugmemory);

		Item buginiumz = new Item("Buginium Z");
		buginiumz.setTypeAssociated("Bug");
		buginiumz.setZCrystal(true);
		items.put("Buginium Z", buginiumz);

		Item burndrive = new Item("Burn Drive");
		burndrive.setTypeAssociated("Fire");
		burndrive.setDrive(true);
		items.put("Burn Drive", burndrive);

		Item cameruptite = new Item("Cameruptite");
		cameruptite.setMegaStone(true);
		items.put("Cameruptite", cameruptite);

		Item cellbattery = new Item("Cell Battery");
		cellbattery.setFlingBP(30);
		items.put("Cell Battery", cellbattery);

		Item charcoal = new Item("Charcoal");
		charcoal.setTypeAssociated("Fire");
		charcoal.setTypeBoosting(true);
		charcoal.setFlingBP(30);
		items.put("Charcoal", charcoal);

		Item charizarditex = new Item("Charizardite X");
		charizarditex.setMegaStone(true);
		items.put("Charizardite X", charizarditex);

		Item charizarditey = new Item("Charizardite Y");
		charizarditey.setMegaStone(true);
		items.put("Charizardite Y", charizarditey);

		Item chartiberry = new Item("Charti Berry");
		chartiberry.setBerry(true);
		chartiberry.setResistBerry(true);
		chartiberry.setNaturalGiftType("Rock");
		chartiberry.setNaturalGiftBP(80);
		chartiberry.setTypeAssociated("Rock");
		items.put("Charti Berry", chartiberry);

		Item cheriberry = new Item("Cheri Berry");
		cheriberry.setBerry(true);
		cheriberry.setNaturalGiftType("Fire");
		cheriberry.setNaturalGiftBP(80);
		items.put("Cheri Berry", cheriberry);

		Item chestoberry = new Item("Chesto Berry");
		chestoberry.setBerry(true);
		chestoberry.setNaturalGiftType("Water");
		chestoberry.setNaturalGiftBP(80);
		items.put("Chesto Berry", chestoberry);

		Item chilanberry = new Item("Chilan Berry");
		chilanberry.setBerry(true);
		chilanberry.setResistBerry(true);
		chilanberry.setNaturalGiftType("Normal");
		chilanberry.setNaturalGiftBP(80);
		chilanberry.setTypeAssociated("Normal");
		items.put("Chilan Berry", chilanberry);

		Item chilldrive = new Item("Chill Drive");
		chilldrive.setTypeAssociated("Ice");
		chilldrive.setDrive(true);
		items.put("Chill Drive", chilldrive);

		Item choiceband = new Item("Choice Band");
		choiceband.setFlingBP(10);
		items.put("Choice Band", choiceband);

		Item choicescarf = new Item("Choice Scarf");
		choicescarf.setFlingBP(10);
		items.put("Choice Scarf", choicescarf);

		Item choicespecs = new Item("Choice Specs");
		choicespecs.setFlingBP(10);
		items.put("Choice Specs", choicespecs);

		Item chopleberry = new Item("Chople Berry");
		chopleberry.setBerry(true);
		chopleberry.setResistBerry(true);
		chopleberry.setNaturalGiftType("Fighting");
		chopleberry.setNaturalGiftBP(80);
		chopleberry.setTypeAssociated("Fighting");
		items.put("Chople Berry", chopleberry);

		Item cobaberry = new Item("Coba Berry");
		cobaberry.setBerry(true);
		cobaberry.setResistBerry(true);
		cobaberry.setNaturalGiftType("Flying");
		cobaberry.setNaturalGiftBP(80);
		cobaberry.setTypeAssociated("Flying");
		items.put("Coba Berry", cobaberry);

		Item colburberry = new Item("Colbur Berry");
		colburberry.setBerry(true);
		colburberry.setResistBerry(true);
		colburberry.setNaturalGiftType("Dark");
		colburberry.setNaturalGiftBP(80);
		colburberry.setTypeAssociated("Dark");
		items.put("Colbur Berry", colburberry);

		Item cornnberry = new Item("Cornn Berry");
		cornnberry.setBerry(true);
		cornnberry.setNaturalGiftType("Bug");
		cornnberry.setNaturalGiftBP(90);
		items.put("Cornn Berry", cornnberry);

		Item crucibellite = new Item("Crucibellite");
		crucibellite.setMegaStone(true);
		items.put("Crucibellite", crucibellite);

		Item custapberry = new Item("Custap Berry");
		custapberry.setBerry(true);
		custapberry.setNaturalGiftType("Ghost");
		custapberry.setNaturalGiftBP(100);
		items.put("Custap Berry", custapberry);

		Item damprock = new Item("Damp Rock");
		damprock.setFlingBP(60);
		items.put("Damp Rock", damprock);

		Item darkgem = new Item("Dark Gem");
		darkgem.setTypeAssociated("Dark");
		darkgem.setGem(true);
		items.put("Dark Gem", darkgem);

		Item darkmemory = new Item("Dark Memory");
		darkmemory.setTypeAssociated("Dark");
		darkmemory.setMemory(true);
		items.put("Dark Memory", darkmemory);

		Item darkiniumz = new Item("Darkinium Z");
		darkiniumz.setTypeAssociated("Dark");
		darkiniumz.setZCrystal(true);
		items.put("Darkinium Z", darkiniumz);

		Item decidiumz = new Item("Decidium Z");
		decidiumz.setZCrystal(true);
		items.put("Decidium Z", decidiumz);

		Item deepseascale = new Item("Deep Sea Scale");
		deepseascale.setFlingBP(30);
		items.put("Deep Sea Scale", deepseascale);

		Item deepseatooth = new Item("Deep Sea Tooth");
		deepseatooth.setFlingBP(90);
		items.put("Deep Sea Tooth", deepseatooth);

		Item destinyknot = new Item("Destiny Knot");
		destinyknot.setFlingBP(10);
		items.put("Destiny Knot", destinyknot);

		Item diancite = new Item("Diancite");
		diancite.setMegaStone(true);
		items.put("Diancite", diancite);

		Item dousedrive = new Item("Douse Drive");
		dousedrive.setTypeAssociated("Water");
		dousedrive.setDrive(true);
		items.put("Douse Drive", dousedrive);

		Item dracoplate = new Item("Draco Plate");
		dracoplate.setTypeAssociated("Dragon");
		dracoplate.setTypeBoosting(true);
		dracoplate.setPlate(true);
		items.put("Draco Plate", dracoplate);

		Item dragonfang = new Item("Dragon Fang");
		dragonfang.setTypeAssociated("Dragon");
		dragonfang.setTypeBoosting(true);
		dragonfang.setFlingBP(70);
		items.put("Dragon Fang", dragonfang);

		Item dragongem = new Item("Dragon Gem");
		dragongem.setTypeAssociated("Dragon");
		dragongem.setGem(true);
		items.put("Dragon Gem", dragongem);

		Item dragonmemory = new Item("Dragon Memory");
		dragonmemory.setTypeAssociated("Dragon");
		dragonmemory.setMemory(true);
		items.put("Dragon Memory", dragonmemory);

		Item dragoniumz = new Item("Dragonium Z");
		dragoniumz.setTypeAssociated("Dragon");
		dragoniumz.setZCrystal(true);
		items.put("Dragonium Z", dragoniumz);

		Item dreadplate = new Item("Dread Plate");
		dreadplate.setTypeAssociated("Dark");
		dreadplate.setTypeBoosting(true);
		dreadplate.setPlate(true);
		items.put("Dread Plate", dreadplate);

		Item durinberry = new Item("Durin Berry");
		durinberry.setBerry(true);
		durinberry.setNaturalGiftType("Water");
		durinberry.setNaturalGiftBP(100);
		items.put("Durin Berry", durinberry);

		Item earthplate = new Item("Earth Plate");
		earthplate.setTypeAssociated("Ground");
		earthplate.setTypeBoosting(true);
		earthplate.setPlate(true);
		items.put("Earth Plate", earthplate);

		Item eeviumz = new Item("Eevium Z");
		eeviumz.setZCrystal(true);
		items.put("Eevium Z", eeviumz);

		Item ejectbutton = new Item("Eject Button");
		ejectbutton.setFlingBP(30);
		items.put("Eject Button", ejectbutton);

		Item electricgem = new Item("Electric Gem");
		electricgem.setTypeAssociated("Electric");
		electricgem.setGem(true);
		items.put("Electric Gem", electricgem);

		Item electricmemory = new Item("Electric Memory");
		electricmemory.setTypeAssociated("Electric");
		electricmemory.setMemory(true);
		items.put("Electric Memory", electricmemory);

		Item electricseed = new Item("Electric Seed");
		electricseed.setFlingBP(10);
		items.put("Electric Seed", electricseed);

		Item electriumz = new Item("Electrium Z");
		electriumz.setTypeAssociated("Electric");
		electriumz.setZCrystal(true);
		items.put("Electrium Z", electriumz);

		Item energypowder = new Item("Energy Powder");
		energypowder.setFlingBP(30);
		items.put("Energy Powder", energypowder);

		Item enigmaberry = new Item("Enigma Berry");
		enigmaberry.setBerry(true);
		enigmaberry.setNaturalGiftType("Bug");
		enigmaberry.setNaturalGiftBP(100);
		items.put("Enigma Berry", enigmaberry);

		Item eviolite = new Item("Eviolite");
		eviolite.setFlingBP(40);
		items.put("Eviolite", eviolite);

		Item expertbelt = new Item("Expert Belt");
		expertbelt.setFlingBP(10);
		items.put("Expert Belt", expertbelt);

		Item fairiumz = new Item("Fairium Z");
		fairiumz.setTypeAssociated("Fairy");
		fairiumz.setZCrystal(true);
		items.put("Fairium Z", fairiumz);

		Item fairygem = new Item("Fairy Gem");
		fairygem.setTypeAssociated("Fairy");
		fairygem.setGem(true);
		items.put("Fairy Gem", fairygem);

		Item fairymemory = new Item("Fairy Memory");
		fairymemory.setTypeAssociated("Fairy");
		fairymemory.setMemory(true);
		items.put("Fairy Memory", fairymemory);

		Item fightinggem = new Item("Fighting Gem");
		fightinggem.setTypeAssociated("Fighting");
		fightinggem.setGem(true);
		items.put("Fighting Gem", fightinggem);

		Item fightingmemory = new Item("Fighting Memory");
		fightingmemory.setTypeAssociated("Fighting");
		fightingmemory.setMemory(true);
		items.put("Fighting Memory", fightingmemory);

		Item fightiniumz = new Item("Fightinium Z");
		fightiniumz.setTypeAssociated("Fighting");
		fightiniumz.setZCrystal(true);
		items.put("Fightinium Z", fightiniumz);

		Item figyberry = new Item("Figy Berry");
		figyberry.setBerry(true);
		figyberry.setNaturalGiftType("Bug");
		figyberry.setNaturalGiftBP(80);
		items.put("Figy Berry", figyberry);

		Item firegem = new Item("Fire Gem");
		firegem.setTypeAssociated("Fire");
		firegem.setGem(true);
		items.put("Fire Gem", firegem);

		Item firememory = new Item("Fire Memory");
		firememory.setTypeAssociated("Fire");
		firememory.setMemory(true);
		items.put("Fire Memory", firememory);

		Item firiumz = new Item("Firium Z");
		firiumz.setTypeAssociated("Fire");
		firiumz.setZCrystal(true);
		items.put("Firium Z", firiumz);

		Item fistplate = new Item("Fist Plate");
		fistplate.setTypeAssociated("Fighting");
		fistplate.setTypeBoosting(true);
		fistplate.setPlate(true);
		items.put("Fist Plate", fistplate);

		Item flameorb = new Item("Flame Orb");
		flameorb.setFlingBP(30);
		items.put("Flame Orb", flameorb);

		Item flameplate = new Item("Flame Plate");
		flameplate.setTypeAssociated("Fire");
		flameplate.setTypeBoosting(true);
		flameplate.setPlate(true);
		items.put("Flame Plate", flameplate);

		Item floatstone = new Item("Float Stone");
		floatstone.setFlingBP(30);
		items.put("Float Stone", floatstone);

		Item flyinggem = new Item("Flying Gem");
		flyinggem.setTypeAssociated("Flying");
		flyinggem.setGem(true);
		items.put("Flying Gem", flyinggem);

		Item flyingmemory = new Item("Flying Memory");
		flyingmemory.setTypeAssociated("Flying");
		flyingmemory.setMemory(true);
		items.put("Flying Memory", flyingmemory);

		Item flyiniumz = new Item("Flyinium Z");
		flyiniumz.setTypeAssociated("Flying");
		flyiniumz.setZCrystal(true);
		items.put("Flyinium Z", flyiniumz);

		Item focusband = new Item("Focus Band");
		focusband.setFlingBP(10);
		items.put("Focus Band", focusband);

		Item focussash = new Item("Focus Sash");
		focussash.setFlingBP(10);
		items.put("Focus Sash", focussash);

		Item fullincense = new Item("Full Incense");
		fullincense.setFlingBP(10);
		items.put("Full Incense", fullincense);

		Item galladite = new Item("Galladite");
		galladite.setMegaStone(true);
		items.put("Galladite", galladite);

		Item ganlonberry = new Item("Ganlon Berry");
		ganlonberry.setBerry(true);
		ganlonberry.setNaturalGiftType("Ice");
		ganlonberry.setNaturalGiftBP(100);
		items.put("Ganlon Berry", ganlonberry);

		Item garchompite = new Item("Garchompite");
		garchompite.setMegaStone(true);
		items.put("Garchompite", garchompite);

		Item gardevoirite = new Item("Gardevoirite");
		gardevoirite.setMegaStone(true);
		items.put("Gardevoirite", gardevoirite);

		Item gengarite = new Item("Gengarite");
		gengarite.setMegaStone(true);
		items.put("Gengarite", gengarite);

		Item ghostgem = new Item("Ghost Gem");
		ghostgem.setTypeAssociated("Ghost");
		ghostgem.setGem(true);
		items.put("Ghost Gem", ghostgem);

		Item ghostmemory = new Item("Ghost Memory");
		ghostmemory.setTypeAssociated("Ghost");
		ghostmemory.setMemory(true);
		items.put("Ghost Memory", ghostmemory);

		Item ghostiumz = new Item("Ghostium Z");
		ghostiumz.setTypeAssociated("Ghost");
		ghostiumz.setZCrystal(true);
		items.put("Ghostium Z", ghostiumz);

		Item glalitite = new Item("Glalitite");
		glalitite.setMegaStone(true);
		items.put("Glalitite", glalitite);

		Item grassgem = new Item("Grass Gem");
		grassgem.setTypeAssociated("Grass");
		grassgem.setGem(true);
		items.put("Grass Gem", grassgem);

		Item grassmemory = new Item("Grass Memory");
		grassmemory.setTypeAssociated("Grass");
		grassmemory.setMemory(true);
		items.put("Grass Memory", grassmemory);

		Item grassiumz = new Item("Grassium Z");
		grassiumz.setTypeAssociated("Grass");
		grassiumz.setZCrystal(true);
		items.put("Grassium Z", grassiumz);

		Item grassyseed = new Item("Grassy Seed");
		grassyseed.setFlingBP(10);
		items.put("Grassy Seed", grassyseed);

		Item grepaberry = new Item("Grepa Berry");
		grepaberry.setBerry(true);
		grepaberry.setNaturalGiftType("Flying");
		grepaberry.setNaturalGiftBP(90);
		items.put("Grepa Berry", grepaberry);

		Item gripclaw = new Item("Grip Claw");
		gripclaw.setFlingBP(90);
		items.put("Grip Claw", gripclaw);

		Item griseousorb = new Item("Griseous Orb");
		griseousorb.setTypeAssociated("Multiple");
		griseousorb.setTypeBoosting(true);
		griseousorb.setFlingBP(60);
		items.put("Griseous Orb", griseousorb);

		Item groundgem = new Item("Ground Gem");
		groundgem.setTypeAssociated("Ground");
		groundgem.setGem(true);
		items.put("Ground Gem", groundgem);

		Item groundmemory = new Item("Ground Memory");
		groundmemory.setTypeAssociated("Ground");
		groundmemory.setMemory(true);
		items.put("Ground Memory", groundmemory);

		Item groundiumz = new Item("Groundium Z");
		groundiumz.setTypeAssociated("Ground");
		groundiumz.setZCrystal(true);
		items.put("Groundium Z", groundiumz);

		Item gyaradosite = new Item("Gyaradosite");
		gyaradosite.setMegaStone(true);
		items.put("Gyaradosite", gyaradosite);

		Item habanberry = new Item("Haban Berry");
		habanberry.setBerry(true);
		habanberry.setResistBerry(true);
		habanberry.setNaturalGiftType("Dragon");
		habanberry.setNaturalGiftBP(80);
		habanberry.setTypeAssociated("Dragon");
		items.put("Haban Berry", habanberry);

		Item heatrock = new Item("Heat Rock");
		heatrock.setFlingBP(60);
		items.put("Heat Rock", heatrock);

		Item heracronite = new Item("Heracronite");
		heracronite.setMegaStone(true);
		items.put("Heracronite", heracronite);

		Item hondewberry = new Item("Hondew Berry");
		hondewberry.setBerry(true);
		hondewberry.setNaturalGiftType("Ground");
		hondewberry.setNaturalGiftBP(90);
		items.put("Hondew Berry", hondewberry);

		Item houndoominite = new Item("Houndoominite");
		houndoominite.setMegaStone(true);
		items.put("Houndoominite", houndoominite);

		Item iapapaberry = new Item("Iapapa Berry");
		iapapaberry.setBerry(true);
		iapapaberry.setNaturalGiftType("Dark");
		iapapaberry.setNaturalGiftBP(80);
		items.put("Iapapa Berry", iapapaberry);

		Item icegem = new Item("Ice Gem");
		icegem.setTypeAssociated("Ice");
		icegem.setGem(true);
		items.put("Ice Gem", icegem);

		Item icememory = new Item("Ice Memory");
		icememory.setTypeAssociated("Ice");
		icememory.setMemory(true);
		items.put("Ice Memory", icememory);

		Item icicleplate = new Item("Icicle Plate");
		icicleplate.setTypeAssociated("Ice");
		icicleplate.setTypeBoosting(true);
		icicleplate.setPlate(true);
		items.put("Icicle Plate", icicleplate);

		Item iciumz = new Item("Icium Z");
		iciumz.setTypeAssociated("Ice");
		iciumz.setZCrystal(true);
		items.put("Icium Z", iciumz);

		Item icyrock = new Item("Icy Rock");
		icyrock.setFlingBP(40);
		items.put("Icy Rock", icyrock);

		Item inciniumz = new Item("Incinium Z");
		inciniumz.setZCrystal(true);
		items.put("Incinium Z", inciniumz);

		Item insectplate = new Item("Insect Plate");
		insectplate.setTypeAssociated("Bug");
		insectplate.setTypeBoosting(true);
		insectplate.setPlate(true);
		items.put("Insect Plate", insectplate);

		Item ironball = new Item("Iron Ball");
		ironball.setFlingBP(130);
		ironball.setHalvesSpeed(true);
		items.put("Iron Ball", ironball);

		Item ironplate = new Item("Iron Plate");
		ironplate.setTypeAssociated("Steel");
		ironplate.setTypeBoosting(true);
		ironplate.setPlate(true);
		items.put("Iron Plate", ironplate);

		Item jabocaberry = new Item("Jaboca Berry");
		jabocaberry.setBerry(true);
		jabocaberry.setNaturalGiftType("Dragon");
		jabocaberry.setNaturalGiftBP(100);
		items.put("Jaboca Berry", jabocaberry);

		Item kangaskhanite = new Item("Kangaskhanite");
		kangaskhanite.setMegaStone(true);
		items.put("Kangaskhanite", kangaskhanite);

		Item kasibberry = new Item("Kasib Berry");
		kasibberry.setBerry(true);
		kasibberry.setResistBerry(true);
		kasibberry.setNaturalGiftType("Ghost");
		kasibberry.setNaturalGiftBP(80);
		kasibberry.setTypeAssociated("Ghost");
		items.put("Kasib Berry", kasibberry);

		Item kebiaberry = new Item("Kebia Berry");
		kebiaberry.setBerry(true);
		kebiaberry.setResistBerry(true);
		kebiaberry.setNaturalGiftType("Poison");
		kebiaberry.setNaturalGiftBP(80);
		kebiaberry.setTypeAssociated("Poison");
		items.put("Kebia Berry", kebiaberry);

		Item keeberry = new Item("Kee Berry");
		keeberry.setBerry(true);
		keeberry.setNaturalGiftType("Fairy");
		keeberry.setNaturalGiftBP(100);
		items.put("Kee Berry", keeberry);

		Item kelpsyberry = new Item("Kelpsy Berry");
		kelpsyberry.setBerry(true);
		kelpsyberry.setNaturalGiftType("Fighting");
		kelpsyberry.setNaturalGiftBP(90);
		items.put("Kelpsy Berry", kelpsyberry);

		Item kingsrock = new Item("King's Rock");
		kingsrock.setFlingBP(30);
		items.put("King's Rock", kingsrock);

		Item kommoniumz = new Item("Kommonium Z");
		kommoniumz.setZCrystal(true);
		items.put("Kommonium Z", kommoniumz);

		Item laggingtail = new Item("Lagging Tail");
		laggingtail.setFlingBP(10);
		items.put("Lagging Tail", laggingtail);

		Item lansatberry = new Item("Lansat Berry");
		lansatberry.setBerry(true);
		lansatberry.setNaturalGiftType("Flying");
		lansatberry.setNaturalGiftBP(100);
		items.put("Lansat Berry", lansatberry);

		Item latiasite = new Item("Latiasite");
		latiasite.setMegaStone(true);
		items.put("Latiasite", latiasite);

		Item latiosite = new Item("Latiosite");
		latiosite.setMegaStone(true);
		items.put("Latiosite", latiosite);

		Item laxincense = new Item("Lax Incense");
		laxincense.setFlingBP(10);
		items.put("Lax Incense", laxincense);

		Item leftovers = new Item("Leftovers");
		leftovers.setFlingBP(10);
		items.put("Leftovers", leftovers);

		Item leppaberry = new Item("Leppa Berry");
		leppaberry.setBerry(true);
		leppaberry.setNaturalGiftType("Fighting");
		leppaberry.setNaturalGiftBP(80);
		items.put("Leppa Berry", leppaberry);

		Item liechiberry = new Item("Liechi Berry");
		liechiberry.setBerry(true);
		liechiberry.setNaturalGiftType("Grass");
		liechiberry.setNaturalGiftBP(100);
		items.put("Liechi Berry", liechiberry);

		Item lifeorb = new Item("Life Orb");
		lifeorb.setFlingBP(30);
		items.put("Life Orb", lifeorb);

		Item lightball = new Item("Light Ball");
		lightball.setFlingBP(30);
		items.put("Light Ball", lightball);

		Item lightclay = new Item("Light Clay");
		lightclay.setFlingBP(30);
		items.put("Light Clay", lightclay);

		Item lopunnite = new Item("Lopunnite");
		lopunnite.setMegaStone(true);
		items.put("Lopunnite", lopunnite);

		Item lucarionite = new Item("Lucarionite");
		lucarionite.setMegaStone(true);
		items.put("Lucarionite", lucarionite);

		Item luckypunch = new Item("Lucky Punch");
		luckypunch.setFlingBP(40);
		items.put("Lucky Punch", luckypunch);

		Item lumberry = new Item("Lum Berry");
		lumberry.setBerry(true);
		lumberry.setNaturalGiftType("Flying");
		lumberry.setNaturalGiftBP(80);
		items.put("Lum Berry", lumberry);

		Item luminousmoss = new Item("Luminous Moss");
		luminousmoss.setFlingBP(30);
		items.put("Luminous Moss", luminousmoss);

		Item lunaliumz = new Item("Lunalium Z");
		lunaliumz.setZCrystal(true);
		items.put("Lunalium Z", lunaliumz);

		Item lustrousorb = new Item("Lustrous Orb");
		lustrousorb.setTypeAssociated("Multiple");
		lustrousorb.setTypeBoosting(true);
		lustrousorb.setFlingBP(60);
		items.put("Lustrous Orb", lustrousorb);

		Item lycaniumz = new Item("Lycanium Z");
		lycaniumz.setZCrystal(true);
		items.put("Lycanium Z", lycaniumz);

		Item machobrace = new Item("Macho Brace");
		machobrace.setFlingBP(60);
		machobrace.setHalvesSpeed(true);
		items.put("Macho Brace", machobrace);

		Item magnet = new Item("Magnet");
		magnet.setTypeAssociated("Electric");
		magnet.setTypeBoosting(true);
		magnet.setFlingBP(30);
		items.put("Magnet", magnet);

		Item magoberry = new Item("Mago Berry");
		magoberry.setBerry(true);
		magoberry.setNaturalGiftType("Ghost");
		magoberry.setNaturalGiftBP(80);
		items.put("Mago Berry", magoberry);

		Item magostberry = new Item("Magost Berry");
		magostberry.setBerry(true);
		magostberry.setNaturalGiftType("Rock");
		magostberry.setNaturalGiftBP(90);
		items.put("Magost Berry", magostberry);

		Item manectite = new Item("Manectite");
		manectite.setMegaStone(true);
		items.put("Manectite", manectite);

		Item marangaberry = new Item("Maranga Berry");
		marangaberry.setBerry(true);
		marangaberry.setNaturalGiftType("Dark");
		marangaberry.setNaturalGiftBP(100);
		items.put("Maranga Berry", marangaberry);

		Item marshadiumz = new Item("Marshadium Z");
		marshadiumz.setZCrystal(true);
		items.put("Marshadium Z", marshadiumz);

		Item mawilite = new Item("Mawilite");
		mawilite.setMegaStone(true);
		items.put("Mawilite", mawilite);

		Item meadowplate = new Item("Meadow Plate");
		meadowplate.setTypeAssociated("Grass");
		meadowplate.setTypeBoosting(true);
		meadowplate.setPlate(true);
		items.put("Meadow Plate", meadowplate);

		Item medichamite = new Item("Medichamite");
		medichamite.setMegaStone(true);
		items.put("Medichamite", medichamite);

		Item mentalherb = new Item("Mental Herb");
		mentalherb.setFlingBP(10);
		items.put("Mental Herb", mentalherb);

		Item metagrossite = new Item("Metagrossite");
		metagrossite.setMegaStone(true);
		items.put("Metagrossite", metagrossite);

		Item metalcoat = new Item("Metal Coat");
		metalcoat.setTypeAssociated("Steel");
		metalcoat.setTypeBoosting(true);
		metalcoat.setFlingBP(30);
		items.put("Metal Coat", metalcoat);

		Item metalpowder = new Item("Metal Powder");
		metalpowder.setFlingBP(10);
		items.put("Metal Powder", metalpowder);

		Item metronome = new Item("Metronome");
		metronome.setFlingBP(30);
		items.put("Metronome", metronome);

		Item mewniumz = new Item("Mewnium Z");
		mewniumz.setZCrystal(true);
		items.put("Mewnium Z", mewniumz);

		Item mewtwonitex = new Item("Mewtwonite X");
		mewtwonitex.setMegaStone(true);
		items.put("Mewtwonite X", mewtwonitex);

		Item mewtwonitey = new Item("Mewtwonite Y");
		mewtwonitey.setMegaStone(true);
		items.put("Mewtwonite Y", mewtwonitey);

		Item micleberry = new Item("Micle Berry");
		micleberry.setBerry(true);
		micleberry.setNaturalGiftType("Rock");
		micleberry.setNaturalGiftBP(100);
		items.put("Micle Berry", micleberry);

		Item mimikiumz = new Item("Mimikium Z");
		mimikiumz.setZCrystal(true);
		items.put("Mimikium Z", mimikiumz);

		Item mindplate = new Item("Mind Plate");
		mindplate.setTypeAssociated("Psychic");
		mindplate.setTypeBoosting(true);
		mindplate.setPlate(true);
		items.put("Mind Plate", mindplate);

		Item miracleseed = new Item("Miracle Seed");
		miracleseed.setTypeAssociated("Grass");
		miracleseed.setTypeBoosting(true);
		miracleseed.setFlingBP(30);
		items.put("Miracle Seed", miracleseed);

		Item mistyseed = new Item("Misty Seed");
		mistyseed.setFlingBP(10);
		items.put("Misty Seed", mistyseed);

		Item muscleband = new Item("Muscle Band");
		muscleband.setFlingBP(10);
		items.put("Muscle Band", muscleband);

		Item mysticwater = new Item("Mystic Water");
		mysticwater.setTypeAssociated("Water");
		mysticwater.setTypeBoosting(true);
		mysticwater.setFlingBP(30);
		items.put("Mystic Water", mysticwater);

		Item nanabberry = new Item("Nanab Berry");
		nanabberry.setBerry(true);
		nanabberry.setNaturalGiftType("Water");
		nanabberry.setNaturalGiftBP(90);
		items.put("Nanab Berry", nanabberry);

		Item nevermeltice = new Item("Never-Melt Ice");
		nevermeltice.setTypeAssociated("Ice");
		nevermeltice.setTypeBoosting(true);
		nevermeltice.setFlingBP(30);
		items.put("Never-Melt Ice", nevermeltice);

		Item nomelberry = new Item("Nomel Berry");
		nomelberry.setBerry(true);
		nomelberry.setNaturalGiftType("Dragon");
		nomelberry.setNaturalGiftBP(90);
		items.put("Nomel Berry", nomelberry);

		Item normalgem = new Item("Normal Gem");
		normalgem.setTypeAssociated("Normal");
		normalgem.setGem(true);
		items.put("Normal Gem", normalgem);

		Item normaliumz = new Item("Normalium Z");
		normaliumz.setTypeAssociated("Normal");
		normaliumz.setZCrystal(true);
		items.put("Normalium Z", normaliumz);

		Item occaberry = new Item("Occa Berry");
		occaberry.setBerry(true);
		occaberry.setResistBerry(true);
		occaberry.setNaturalGiftType("Fire");
		occaberry.setNaturalGiftBP(80);
		occaberry.setTypeAssociated("Fire");
		items.put("Occa Berry", occaberry);

		Item oddincense = new Item("Odd Incense");
		oddincense.setTypeAssociated("Psychic");
		oddincense.setTypeBoosting(true);
		oddincense.setFlingBP(10);
		items.put("Odd Incense", oddincense);

		Item oldamber = new Item("Old Amber");
		oldamber.setFlingBP(100);
		items.put("Old Amber", oldamber);

		Item oranberry = new Item("Oran Berry");
		oranberry.setBerry(true);
		oranberry.setNaturalGiftType("Poison");
		oranberry.setNaturalGiftBP(80);
		items.put("Oran Berry", oranberry);

		Item pamtreberry = new Item("Pamtre Berry");
		pamtreberry.setBerry(true);
		pamtreberry.setNaturalGiftType("Steel");
		pamtreberry.setNaturalGiftBP(90);
		items.put("Pamtre Berry", pamtreberry);

		Item passhoberry = new Item("Passho Berry");
		passhoberry.setBerry(true);
		passhoberry.setResistBerry(true);
		passhoberry.setNaturalGiftType("Water");
		passhoberry.setNaturalGiftBP(80);
		passhoberry.setTypeAssociated("Water");
		items.put("Passho Berry", passhoberry);

		Item payapaberry = new Item("Payapa Berry");
		payapaberry.setBerry(true);
		payapaberry.setResistBerry(true);
		payapaberry.setNaturalGiftType("Psychic");
		payapaberry.setNaturalGiftBP(80);
		payapaberry.setTypeAssociated("Psychic");
		items.put("Payapa Berry", payapaberry);

		Item pechaberry = new Item("Pecha Berry");
		pechaberry.setBerry(true);
		pechaberry.setNaturalGiftType("Electric");
		pechaberry.setNaturalGiftBP(80);
		items.put("Pecha Berry", pechaberry);

		Item persimberry = new Item("Persim Berry");
		persimberry.setBerry(true);
		persimberry.setNaturalGiftType("Ground");
		persimberry.setNaturalGiftBP(80);
		items.put("Persim Berry", persimberry);

		Item petayaberry = new Item("Petaya Berry");
		petayaberry.setBerry(true);
		petayaberry.setNaturalGiftType("Poison");
		petayaberry.setNaturalGiftBP(100);
		items.put("Petaya Berry", petayaberry);

		Item pidgeotite = new Item("Pidgeotite");
		pidgeotite.setMegaStone(true);
		items.put("Pidgeotite", pidgeotite);

		Item pikaniumz = new Item("Pikanium Z");
		pikaniumz.setZCrystal(true);
		items.put("Pikanium Z", pikaniumz);

		Item pikashuniumz = new Item("Pikashunium Z");
		pikashuniumz.setZCrystal(true);
		items.put("Pikashunium Z", pikashuniumz);

		Item pinapberry = new Item("Pinap Berry");
		pinapberry.setBerry(true);
		pinapberry.setNaturalGiftType("Grass");
		pinapberry.setNaturalGiftBP(90);
		items.put("Pinap Berry", pinapberry);

		Item pinsirite = new Item("Pinsirite");
		pinsirite.setMegaStone(true);
		items.put("Pinsirite", pinsirite);

		Item pixieplate = new Item("Pixie Plate");
		pixieplate.setTypeAssociated("Fairy");
		pixieplate.setTypeBoosting(true);
		pixieplate.setPlate(true);
		items.put("Pixie Plate", pixieplate);

		Item poisonbarb = new Item("Poison Barb");
		poisonbarb.setTypeAssociated("Poison");
		poisonbarb.setTypeBoosting(true);
		poisonbarb.setFlingBP(70);
		items.put("Poison Barb", poisonbarb);

		Item poisongem = new Item("Poison Gem");
		poisongem.setTypeAssociated("Poison");
		poisongem.setGem(true);
		items.put("Poison Gem", poisongem);

		Item poisonmemory = new Item("Poison Memory");
		poisonmemory.setTypeAssociated("Poison");
		poisonmemory.setMemory(true);
		items.put("Poison Memory", poisonmemory);

		Item poisoniumz = new Item("Poisonium Z");
		poisoniumz.setTypeAssociated("Poison");
		poisoniumz.setZCrystal(true);
		items.put("Poisonium Z", poisoniumz);

		Item pomegberry = new Item("Pomeg Berry");
		pomegberry.setBerry(true);
		pomegberry.setNaturalGiftType("Ice");
		pomegberry.setNaturalGiftBP(90);
		items.put("Pomeg Berry", pomegberry);

		Item poweranklet = new Item("Power Anklet");
		poweranklet.setFlingBP(70);
		poweranklet.setHalvesSpeed(true);
		items.put("Power Anklet", poweranklet);

		Item powerband = new Item("Power Band");
		powerband.setFlingBP(70);
		powerband.setHalvesSpeed(true);
		items.put("Power Band", powerband);

		Item powerbelt = new Item("Power Belt");
		powerbelt.setFlingBP(70);
		powerbelt.setHalvesSpeed(true);
		items.put("Power Belt", powerbelt);

		Item powerbracer = new Item("Power Bracer");
		powerbracer.setFlingBP(70);
		powerbracer.setHalvesSpeed(true);
		items.put("Power Bracer", powerbracer);

		Item powerherb = new Item("Power Herb");
		powerherb.setFlingBP(10);
		items.put("Power Herb", powerherb);

		Item powerlens = new Item("Power Lens");
		powerlens.setFlingBP(70);
		powerlens.setHalvesSpeed(true);
		items.put("Power Lens", powerlens);

		Item powerweight = new Item("Power Weight");
		powerweight.setFlingBP(70);
		powerweight.setHalvesSpeed(true);
		items.put("Power Weight", powerweight);

		Item primariumz = new Item("Primarium Z");
		primariumz.setZCrystal(true);
		items.put("Primarium Z", primariumz);

		Item protectivepads = new Item("Protective Pads");
		protectivepads.setFlingBP(30);
		items.put("Protective Pads", protectivepads);

		Item psychicgem = new Item("Psychic Gem");
		psychicgem.setTypeAssociated("Psychic");
		psychicgem.setGem(true);
		items.put("Psychic Gem", psychicgem);

		Item psychicmemory = new Item("Psychic Memory");
		psychicmemory.setTypeAssociated("Psychic");
		psychicmemory.setMemory(true);
		items.put("Psychic Memory", psychicmemory);

		Item psychicseed = new Item("Psychic Seed");
		psychicseed.setFlingBP(10);
		items.put("Psychic Seed", psychicseed);

		Item psychiumz = new Item("Psychium Z");
		psychiumz.setTypeAssociated("Psychic");
		psychiumz.setZCrystal(true);
		items.put("Psychium Z", psychiumz);

		Item qualotberry = new Item("Qualot Berry");
		qualotberry.setBerry(true);
		qualotberry.setNaturalGiftType("Poison");
		qualotberry.setNaturalGiftBP(90);
		items.put("Qualot Berry", qualotberry);

		Item quickclaw = new Item("Quick Claw");
		quickclaw.setFlingBP(80);
		items.put("Quick Claw", quickclaw);

		Item quickpowder = new Item("Quick Powder");
		quickpowder.setFlingBP(10);
		items.put("Quick Powder", quickpowder);

		Item rabutaberry = new Item("Rabuta Berry");
		rabutaberry.setBerry(true);
		rabutaberry.setNaturalGiftType("Ghost");
		rabutaberry.setNaturalGiftBP(90);
		items.put("Rabuta Berry", rabutaberry);

		Item rarebone = new Item("Rare Bone");
		rarebone.setFlingBP(100);
		items.put("Rare Bone", rarebone);

		Item rawstberry = new Item("Rawst Berry");
		rawstberry.setBerry(true);
		rawstberry.setNaturalGiftType("Grass");
		rawstberry.setNaturalGiftBP(80);
		items.put("Rawst Berry", rawstberry);

		Item razorclaw = new Item("Razor Claw");
		razorclaw.setFlingBP(80);
		items.put("Razor Claw", razorclaw);

		Item razorfang = new Item("Razor Fang");
		razorfang.setFlingBP(30);
		items.put("Razor Fang", razorfang);

		Item razzberry = new Item("Razz Berry");
		razzberry.setBerry(true);
		razzberry.setNaturalGiftType("Steel");
		razzberry.setNaturalGiftBP(80);
		items.put("Razz Berry", razzberry);

		Item redcard = new Item("Red Card");
		redcard.setFlingBP(10);
		items.put("Red Card", redcard);

		Item redorb = new Item("Red Orb");
		items.put("Red Orb", redorb);

		Item rindoberry = new Item("Rindo Berry");
		rindoberry.setBerry(true);
		rindoberry.setResistBerry(true);
		rindoberry.setNaturalGiftType("Grass");
		rindoberry.setNaturalGiftBP(80);
		rindoberry.setTypeAssociated("Grass");
		items.put("Rindo Berry", rindoberry);

		Item ringtarget = new Item("Ring Target");
		ringtarget.setFlingBP(10);
		items.put("Ring Target", ringtarget);

		Item rockgem = new Item("Rock Gem");
		rockgem.setTypeAssociated("Rock");
		rockgem.setGem(true);
		items.put("Rock Gem", rockgem);

		Item rockincense = new Item("Rock Incense");
		rockincense.setTypeAssociated("Rock");
		rockincense.setTypeBoosting(true);
		rockincense.setFlingBP(10);
		items.put("Rock Incense", rockincense);

		Item rockmemory = new Item("Rock Memory");
		rockmemory.setTypeAssociated("Rock");
		rockmemory.setMemory(true);
		items.put("Rock Memory", rockmemory);

		Item rockiumz = new Item("Rockium Z");
		rockiumz.setTypeAssociated("Rock");
		rockiumz.setZCrystal(true);
		items.put("Rockium Z", rockiumz);

		Item rockyhelmet = new Item("Rocky Helmet");
		rockyhelmet.setFlingBP(60);
		items.put("Rocky Helmet", rockyhelmet);

		Item roseincense = new Item("Rose Incense");
		roseincense.setTypeAssociated("Grass");
		roseincense.setTypeBoosting(true);
		roseincense.setFlingBP(10);
		items.put("Rose Incense", roseincense);

		Item roseliberry = new Item("Roseli Berry");
		roseliberry.setBerry(true);
		roseliberry.setResistBerry(true);
		roseliberry.setNaturalGiftType("Fairy");
		roseliberry.setNaturalGiftBP(80);
		roseliberry.setTypeAssociated("Fairy");
		items.put("Roseli Berry", roseliberry);

		Item rowapberry = new Item("Rowap Berry");
		rowapberry.setBerry(true);
		rowapberry.setNaturalGiftType("Dark");
		rowapberry.setNaturalGiftBP(100);
		items.put("Rowap Berry", rowapberry);

		Item sablenite = new Item("Sablenite");
		sablenite.setMegaStone(true);
		items.put("Sablenite", sablenite);

		Item safetygoggles = new Item("Safety Goggles");
		safetygoggles.setFlingBP(80);
		items.put("Safety Goggles", safetygoggles);

		Item salacberry = new Item("Salac Berry");
		salacberry.setBerry(true);
		salacberry.setNaturalGiftType("Fighting");
		salacberry.setNaturalGiftBP(100);
		items.put("Salac Berry", salacberry);

		Item salamencite = new Item("Salamencite");
		salamencite.setMegaStone(true);
		items.put("Salamencite", salamencite);

		Item sceptilite = new Item("Sceptilite");
		sceptilite.setMegaStone(true);
		items.put("Sceptilite", sceptilite);

		Item scizorite = new Item("Scizorite");
		scizorite.setMegaStone(true);
		items.put("Scizorite", scizorite);

		Item scopelens = new Item("Scope Lens");
		scopelens.setFlingBP(30);
		items.put("Scope Lens", scopelens);

		Item seaincense = new Item("Sea Incense");
		seaincense.setTypeAssociated("Water");
		seaincense.setTypeBoosting(true);
		seaincense.setFlingBP(10);
		items.put("Sea Incense", seaincense);

		Item sharpbeak = new Item("Sharp Beak");
		sharpbeak.setTypeAssociated("Flying");
		sharpbeak.setTypeBoosting(true);
		sharpbeak.setFlingBP(50);
		items.put("Sharp Beak", sharpbeak);

		Item sharpedonite = new Item("Sharpedonite");
		sharpedonite.setMegaStone(true);
		items.put("Sharpedonite", sharpedonite);

		Item shedshell = new Item("Shed Shell");
		shedshell.setFlingBP(10);
		items.put("Shed Shell", shedshell);

		Item shellbell = new Item("Shell Bell");
		shellbell.setFlingBP(30);
		items.put("Shell Bell", shellbell);

		Item shockdrive = new Item("Shock Drive");
		shockdrive.setTypeAssociated("Electric");
		shockdrive.setDrive(true);
		items.put("Shock Drive", shockdrive);

		Item shucaberry = new Item("Shuca Berry");
		shucaberry.setBerry(true);
		shucaberry.setResistBerry(true);
		shucaberry.setNaturalGiftType("Ground");
		shucaberry.setNaturalGiftBP(80);
		shucaberry.setTypeAssociated("Ground");
		items.put("Shuca Berry", shucaberry);

		Item silkscarf = new Item("Silk Scarf");
		silkscarf.setTypeAssociated("Normal");
		silkscarf.setTypeBoosting(true);
		silkscarf.setFlingBP(10);
		items.put("Silk Scarf", silkscarf);

		Item silverpowder = new Item("SilverPowder");
		silverpowder.setTypeAssociated("Bug");
		silverpowder.setTypeBoosting(true);
		silverpowder.setFlingBP(10);
		items.put("SilverPowder", silverpowder);

		Item sitrusberry = new Item("Sitrus Berry");
		sitrusberry.setBerry(true);
		sitrusberry.setNaturalGiftType("Psychic");
		sitrusberry.setNaturalGiftBP(80);
		items.put("Sitrus Berry", sitrusberry);

		Item skyplate = new Item("Sky Plate");
		skyplate.setTypeAssociated("Flying");
		skyplate.setTypeBoosting(true);
		skyplate.setPlate(true);
		items.put("Sky Plate", skyplate);

		Item slowbronite = new Item("Slowbronite");
		slowbronite.setMegaStone(true);
		items.put("Slowbronite", slowbronite);

		Item smoothrock = new Item("Smooth Rock");
		smoothrock.setFlingBP(10);
		items.put("Smooth Rock", smoothrock);

		Item snorliumz = new Item("Snorlium Z");
		snorliumz.setZCrystal(true);
		items.put("Snorlium Z", snorliumz);

		Item snowball = new Item("Snowball");
		snowball.setFlingBP(30);
		items.put("Snowball", snowball);

		Item softsand = new Item("Soft Sand");
		softsand.setTypeAssociated("Ground");
		softsand.setTypeBoosting(true);
		softsand.setFlingBP(10);
		items.put("Soft Sand", softsand);

		Item solganiumz = new Item("Solganium Z");
		solganiumz.setZCrystal(true);
		items.put("Solganium Z", solganiumz);

		Item souldew = new Item("Soul Dew");
		souldew.setTypeAssociated("Multiple");
		souldew.setTypeBoosting(true);
		souldew.setFlingBP(30);
		items.put("Soul Dew", souldew);

		Item spelltag = new Item("Spell Tag");
		spelltag.setTypeAssociated("Ghost");
		spelltag.setTypeBoosting(true);
		spelltag.setFlingBP(30);
		items.put("Spell Tag", spelltag);

		Item spelonberry = new Item("Spelon Berry");
		spelonberry.setBerry(true);
		spelonberry.setNaturalGiftType("Dark");
		spelonberry.setNaturalGiftBP(90);
		items.put("Spelon Berry", spelonberry);

		Item splashplate = new Item("Splash Plate");
		splashplate.setTypeAssociated("Water");
		splashplate.setTypeBoosting(true);
		splashplate.setPlate(true);
		items.put("Splash Plate", splashplate);

		Item spookyplate = new Item("Spooky Plate");
		spookyplate.setTypeAssociated("Ghost");
		spookyplate.setTypeBoosting(true);
		spookyplate.setPlate(true);
		items.put("Spooky Plate", spookyplate);

		Item starfberry = new Item("Starf Berry");
		starfberry.setBerry(true);
		starfberry.setNaturalGiftType("Psychic");
		starfberry.setNaturalGiftBP(100);
		items.put("Starf Berry", starfberry);

		Item steelgem = new Item("Steel Gem");
		steelgem.setTypeAssociated("Steel");
		steelgem.setGem(true);
		items.put("Steel Gem", steelgem);

		Item steelmemory = new Item("Steel Memory");
		steelmemory.setTypeAssociated("Steel");
		steelmemory.setMemory(true);
		items.put("Steel Memory", steelmemory);

		Item steeliumz = new Item("Steelium Z");
		steeliumz.setTypeAssociated("Steel");
		steeliumz.setZCrystal(true);
		items.put("Steelium Z", steeliumz);

		Item steelixite = new Item("Steelixite");
		steelixite.setMegaStone(true);
		items.put("Steelixite", steelixite);

		Item stick = new Item("Stick");
		stick.setFlingBP(60);
		items.put("Stick", stick);

		Item stickybarb = new Item("Sticky Barb");
		stickybarb.setFlingBP(80);
		items.put("Sticky Barb", stickybarb);

		Item stoneplate = new Item("Stone Plate");
		stoneplate.setTypeAssociated("Rock");
		stoneplate.setTypeBoosting(true);
		stoneplate.setPlate(true);
		items.put("Stone Plate", stoneplate);

		Item swampertite = new Item("Swampertite");
		swampertite.setMegaStone(true);
		items.put("Swampertite", swampertite);

		Item tamatoberry = new Item("Tamato Berry");
		tamatoberry.setBerry(true);
		tamatoberry.setNaturalGiftType("Psychic");
		tamatoberry.setNaturalGiftBP(90);
		items.put("Tamato Berry", tamatoberry);

		Item tangaberry = new Item("Tanga Berry");
		tangaberry.setBerry(true);
		tangaberry.setResistBerry(true);
		tangaberry.setNaturalGiftType("Bug");
		tangaberry.setNaturalGiftBP(80);
		tangaberry.setTypeAssociated("Bug");
		items.put("Tanga Berry", tangaberry);

		Item tapuniumz = new Item("Tapunium Z");
		tapuniumz.setZCrystal(true);
		items.put("Tapunium Z", tapuniumz);

		Item terrainextender = new Item("Terrain Extender");
		terrainextender.setFlingBP(60);
		items.put("Terrain Extender", terrainextender);

		Item thickclub = new Item("Thick Club");
		thickclub.setFlingBP(90);
		items.put("Thick Club", thickclub);

		Item toxicorb = new Item("Toxic Orb");
		toxicorb.setFlingBP(30);
		items.put("Toxic Orb", toxicorb);

		Item toxicplate = new Item("Toxic Plate");
		toxicplate.setTypeAssociated("Poison");
		toxicplate.setTypeBoosting(true);
		toxicplate.setPlate(true);
		items.put("Toxic Plate", toxicplate);

		Item twistedspoon = new Item("Twisted Spoon");
		twistedspoon.setTypeAssociated("Psychic");
		twistedspoon.setTypeBoosting(true);
		twistedspoon.setFlingBP(30);
		items.put("Twisted Spoon", twistedspoon);

		Item tyranitarite = new Item("Tyranitarite");
		tyranitarite.setMegaStone(true);
		items.put("Tyranitarite", tyranitarite);

		Item ultranecroziumz = new Item("Ultranecrozium Z");
		ultranecroziumz.setZCrystal(true);
		items.put("Ultranecrozium Z", ultranecroziumz);

		Item venusaurite = new Item("Venusaurite");
		venusaurite.setMegaStone(true);
		items.put("Venusaurite", venusaurite);

		Item wacanberry = new Item("Wacan Berry");
		wacanberry.setBerry(true);
		wacanberry.setResistBerry(true);
		wacanberry.setNaturalGiftType("Electric");
		wacanberry.setNaturalGiftBP(80);
		wacanberry.setTypeAssociated("Electric");
		items.put("Wacan Berry", wacanberry);

		Item watergem = new Item("Water Gem");
		watergem.setTypeAssociated("Water");
		watergem.setGem(true);
		items.put("Water Gem", watergem);

		Item watermemory = new Item("Water Memory");
		watermemory.setTypeAssociated("Water");
		watermemory.setMemory(true);
		items.put("Water Memory", watermemory);

		Item wateriumz = new Item("Waterium Z");
		wateriumz.setTypeAssociated("Water");
		wateriumz.setZCrystal(true);
		items.put("Waterium Z", wateriumz);

		Item watmelberry = new Item("Watmel Berry");
		watmelberry.setBerry(true);
		watmelberry.setNaturalGiftType("Fire");
		watmelberry.setNaturalGiftBP(100);
		items.put("Watmel Berry", watmelberry);

		Item waveincense = new Item("Wave Incense");
		waveincense.setTypeAssociated("Water");
		waveincense.setTypeBoosting(true);
		waveincense.setFlingBP(10);
		items.put("Wave Incense", waveincense);

		Item weaknesspolicy = new Item("Weakness Policy");
		weaknesspolicy.setFlingBP(80);
		items.put("Weakness Policy", weaknesspolicy);

		Item wepearberry = new Item("Wepear Berry");
		wepearberry.setBerry(true);
		wepearberry.setNaturalGiftType("Electric");
		wepearberry.setNaturalGiftBP(90);
		items.put("Wepear Berry", wepearberry);

		Item whiteherb = new Item("White Herb");
		whiteherb.setFlingBP(10);
		items.put("White Herb", whiteherb);

		Item widelens = new Item("Wide Lens");
		widelens.setFlingBP(10);
		items.put("Wide Lens", widelens);

		Item wikiberry = new Item("Wiki Berry");
		wikiberry.setBerry(true);
		wikiberry.setNaturalGiftType("Rock");
		wikiberry.setNaturalGiftBP(80);
		items.put("Wiki Berry", wikiberry);

		Item wiseglasses = new Item("Wise Glasses");
		wiseglasses.setFlingBP(10);
		items.put("Wise Glasses", wiseglasses);

		Item yacheberry = new Item("Yache Berry");
		yacheberry.setBerry(true);
		yacheberry.setResistBerry(true);
		yacheberry.setNaturalGiftType("Ice");
		yacheberry.setNaturalGiftBP(80);
		yacheberry.setTypeAssociated("Ice");
		items.put("Yache Berry", yacheberry);

		Item zapplate = new Item("Zap Plate");
		zapplate.setTypeAssociated("Electric");
		zapplate.setTypeBoosting(true);
		zapplate.setPlate(true);
		items.put("Zap Plate", zapplate);

		Item zoomlens = new Item("Zoom Lens");
		zoomlens.setFlingBP(10);
		items.put("Zoom Lens", zoomlens);
	}
}
