/* A hashmap of moves from the Pokemon games. Modeled in Pokemon.java. Formes could use a refactor.
 * Data from Pokemon Showdown's Pokedex file: https://raw.githubusercontent.com/Zarel/Pokemon-Showdown/master/data/pokedex.js */

package superDamageCalculator;
import java.util.HashMap;

public class Pokedex
{
    public static final HashMap<String, Pokemon> pokedex = new HashMap<String, Pokemon>();
	
    public Pokedex()
    {
    	//Breaks it into halves because otherwise Java complains about the code size being too large.
    	initFirstHalf();
    	initSecondHalf();
    }
    
    public Pokemon get(String name)
    {
    	return pokedex.get(name);
    }
    
    public static HashMap<String, Pokemon> getPokedex()
    {
    	return pokedex;
    }
    
  public void initFirstHalf()
    {
    	Pokemon abomasnow = new Pokemon("Abomasnow");
    	abomasnow.setTypes("Grass", "Ice");
    	abomasnow.setAbility("Snow Warning");
    	abomasnow.setAllBaseStats(90, 92, 75, 92, 85, 60);
    	abomasnow.setWeight(135.5);
    	abomasnow.setFormes("Abomasnow", "Abomasnow-Mega");
    	pokedex.put("Abomasnow", abomasnow);

    	Pokemon abomasnowmega = new Pokemon("Abomasnow-Mega");
    	abomasnowmega.setTypes("Grass", "Ice");
    	abomasnowmega.setAbility("Snow Warning");
    	abomasnowmega.setAllBaseStats(90, 132, 105, 132, 105, 30);
    	abomasnowmega.setWeight(185.0);
    	pokedex.put("Abomasnow-Mega", abomasnowmega);

    	Pokemon abra = new Pokemon("Abra");
    	abra.setTypes("Psychic", "(none)");
    	abra.setAbility("Synchronize");
    	abra.setAllBaseStats(25, 20, 15, 105, 55, 90);
    	abra.setWeight(19.5);
    	pokedex.put("Abra", abra);

    	Pokemon absol = new Pokemon("Absol");
    	absol.setTypes("Dark", "(none)");
    	absol.setAbility("Pressure");
    	absol.setAllBaseStats(65, 130, 60, 75, 60, 75);
    	absol.setWeight(47.0);
    	absol.setFormes("Absol", "Absol-Mega");
    	pokedex.put("Absol", absol);

    	Pokemon absolmega = new Pokemon("Absol-Mega");
    	absolmega.setTypes("Dark", "(none)");
    	absolmega.setAbility("Magic Bounce");
    	absolmega.setAllBaseStats(65, 150, 60, 115, 60, 115);
    	absolmega.setWeight(49.0);
    	pokedex.put("Absol-Mega", absolmega);

    	Pokemon accelgor = new Pokemon("Accelgor");
    	accelgor.setTypes("Bug", "(none)");
    	accelgor.setAbility("Hydration");
    	accelgor.setAllBaseStats(80, 70, 40, 100, 60, 145);
    	accelgor.setWeight(25.3);
    	pokedex.put("Accelgor", accelgor);

    	Pokemon aegislash = new Pokemon("Aegislash");
    	aegislash.setTypes("Steel", "Ghost");
    	aegislash.setAbility("Stance Change");
    	aegislash.setAllBaseStats(60, 50, 150, 50, 150, 60);
    	aegislash.setWeight(53.0);
    	aegislash.setFormes("Aegislash", "Aegislash-Blade");
    	pokedex.put("Aegislash", aegislash);

    	Pokemon aegislashblade = new Pokemon("Aegislash-Blade");
    	aegislashblade.setTypes("Steel", "Ghost");
    	aegislashblade.setAbility("Stance Change");
    	aegislashblade.setAllBaseStats(60, 150, 50, 150, 50, 60);
    	aegislashblade.setWeight(53.0);
    	pokedex.put("Aegislash-Blade", aegislashblade);

    	Pokemon aerodactyl = new Pokemon("Aerodactyl");
    	aerodactyl.setTypes("Rock", "Flying");
    	aerodactyl.setAbility("Rock Head");
    	aerodactyl.setAllBaseStats(80, 105, 65, 60, 75, 130);
    	aerodactyl.setWeight(59.0);
    	aerodactyl.setFormes("Aerodactyl", "Aerodactyl-Mega");
    	pokedex.put("Aerodactyl", aerodactyl);

    	Pokemon aerodactylmega = new Pokemon("Aerodactyl-Mega");
    	aerodactylmega.setTypes("Rock", "Flying");
    	aerodactylmega.setAbility("Tough Claws");
    	aerodactylmega.setAllBaseStats(80, 135, 85, 70, 95, 150);
    	aerodactylmega.setWeight(79.0);
    	pokedex.put("Aerodactyl-Mega", aerodactylmega);

    	Pokemon aggron = new Pokemon("Aggron");
    	aggron.setTypes("Steel", "Rock");
    	aggron.setAbility("Sturdy");
    	aggron.setAllBaseStats(70, 110, 180, 60, 60, 50);
    	aggron.setWeight(360.0);
    	aggron.setFormes("Aggron", "Aggron-Mega");
    	pokedex.put("Aggron", aggron);

    	Pokemon aggronmega = new Pokemon("Aggron-Mega");
    	aggronmega.setTypes("Steel", "(none)");
    	aggronmega.setAbility("Filter");
    	aggronmega.setAllBaseStats(70, 140, 230, 60, 80, 50);
    	aggronmega.setWeight(395.0);
    	pokedex.put("Aggron-Mega", aggronmega);

    	Pokemon aipom = new Pokemon("Aipom");
    	aipom.setTypes("Normal", "(none)");
    	aipom.setAbility("Run Away");
    	aipom.setAllBaseStats(55, 70, 55, 40, 55, 85);
    	aipom.setWeight(11.5);
    	pokedex.put("Aipom", aipom);

    	Pokemon alakazam = new Pokemon("Alakazam");
    	alakazam.setTypes("Psychic", "(none)");
    	alakazam.setAbility("Magic Guard");
    	alakazam.setAllBaseStats(55, 50, 45, 135, 95, 120);
    	alakazam.setWeight(48.0);
    	alakazam.setFormes("Alakazam", "Alakazam-Mega");
    	pokedex.put("Alakazam", alakazam);

    	Pokemon alakazammega = new Pokemon("Alakazam-Mega");
    	alakazammega.setTypes("Psychic", "(none)");
    	alakazammega.setAbility("Trace");
    	alakazammega.setAllBaseStats(55, 50, 65, 175, 105, 150);
    	alakazammega.setWeight(48.0);
    	pokedex.put("Alakazam-Mega", alakazammega);

    	Pokemon alomomola = new Pokemon("Alomomola");
    	alomomola.setTypes("Water", "(none)");
    	alomomola.setAbility("Healer");
    	alomomola.setAllBaseStats(165, 75, 80, 40, 45, 65);
    	alomomola.setWeight(31.6);
    	pokedex.put("Alomomola", alomomola);

    	Pokemon altaria = new Pokemon("Altaria");
    	altaria.setTypes("Dragon", "Flying");
    	altaria.setAbility("Natural Cure");
    	altaria.setAllBaseStats(75, 70, 90, 70, 105, 80);
    	altaria.setWeight(20.6);
    	altaria.setFormes("Altaria", "Altaria-Mega");
    	pokedex.put("Altaria", altaria);

    	Pokemon altariamega = new Pokemon("Altaria-Mega");
    	altariamega.setTypes("Dragon", "Fairy");
    	altariamega.setAbility("Pixilate");
    	altariamega.setAllBaseStats(75, 110, 110, 110, 105, 80);
    	altariamega.setWeight(20.6);
    	pokedex.put("Altaria-Mega", altariamega);

    	Pokemon amaura = new Pokemon("Amaura");
    	amaura.setTypes("Rock", "Ice");
    	amaura.setAbility("Refrigerate");
    	amaura.setAllBaseStats(77, 59, 50, 67, 63, 46);
    	amaura.setWeight(25.2);
    	pokedex.put("Amaura", amaura);

    	Pokemon ambipom = new Pokemon("Ambipom");
    	ambipom.setTypes("Normal", "(none)");
    	ambipom.setAbility("Technician");
    	ambipom.setAllBaseStats(75, 100, 66, 60, 66, 115);
    	ambipom.setWeight(20.3);
    	pokedex.put("Ambipom", ambipom);

    	Pokemon amoonguss = new Pokemon("Amoonguss");
    	amoonguss.setTypes("Grass", "Poison");
    	amoonguss.setAbility("Regenerator");
    	amoonguss.setAllBaseStats(114, 85, 70, 85, 80, 30);
    	amoonguss.setWeight(10.5);
    	pokedex.put("Amoonguss", amoonguss);

    	Pokemon ampharos = new Pokemon("Ampharos");
    	ampharos.setTypes("Electric", "(none)");
    	ampharos.setAbility("Static");
    	ampharos.setAllBaseStats(90, 75, 85, 115, 90, 55);
    	ampharos.setWeight(61.5);
    	ampharos.setFormes("Ampharos", "Ampharos-Mega");
    	pokedex.put("Ampharos", ampharos);

    	Pokemon ampharosmega = new Pokemon("Ampharos-Mega");
    	ampharosmega.setTypes("Electric", "Dragon");
    	ampharosmega.setAbility("Mold Breaker");
    	ampharosmega.setAllBaseStats(90, 95, 105, 165, 110, 45);
    	ampharosmega.setWeight(61.5);
    	pokedex.put("Ampharos-Mega", ampharosmega);

    	Pokemon anorith = new Pokemon("Anorith");
    	anorith.setTypes("Rock", "Bug");
    	anorith.setAbility("Battle Armor");
    	anorith.setAllBaseStats(45, 95, 50, 40, 50, 75);
    	anorith.setWeight(12.5);
    	pokedex.put("Anorith", anorith);

    	Pokemon araquanid = new Pokemon("Araquanid");
    	araquanid.setTypes("Water", "Bug");
    	araquanid.setAbility("Water Bubble");
    	araquanid.setAllBaseStats(68, 70, 92, 50, 132, 42);
    	araquanid.setWeight(82.0);
    	pokedex.put("Araquanid", araquanid);

    	Pokemon araquanidtotem = new Pokemon("Araquanid-Totem");
    	araquanidtotem.setTypes("Water", "Bug");
    	araquanidtotem.setAbility("Water Bubble");
    	araquanidtotem.setAllBaseStats(68, 70, 92, 50, 132, 42);
    	araquanidtotem.setWeight(217.5);
    	pokedex.put("Araquanid-Totem", araquanidtotem);

    	Pokemon arbok = new Pokemon("Arbok");
    	arbok.setTypes("Poison", "(none)");
    	arbok.setAbility("Intimidate");
    	arbok.setAllBaseStats(60, 95, 69, 65, 79, 80);
    	arbok.setWeight(65.0);
    	pokedex.put("Arbok", arbok);

    	Pokemon arcanine = new Pokemon("Arcanine");
    	arcanine.setTypes("Fire", "(none)");
    	arcanine.setAbility("Intimidate");
    	arcanine.setAllBaseStats(90, 110, 80, 100, 80, 95);
    	arcanine.setWeight(155.0);
    	pokedex.put("Arcanine", arcanine);

    	Pokemon arceus = new Pokemon("Arceus");
    	arceus.setTypes("Normal", "(none)");
    	arceus.setAbility("Multitype");
    	arceus.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceus.setWeight(320.0);
    	pokedex.put("Arceus", arceus);

    	Pokemon arceusbug = new Pokemon("Arceus-Bug");
    	arceusbug.setTypes("Bug", "(none)");
    	arceusbug.setAbility("Multitype");
    	arceusbug.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusbug.setWeight(320.0);
    	pokedex.put("Arceus-Bug", arceusbug);

    	Pokemon arceusdark = new Pokemon("Arceus-Dark");
    	arceusdark.setTypes("Dark", "(none)");
    	arceusdark.setAbility("Multitype");
    	arceusdark.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusdark.setWeight(320.0);
    	pokedex.put("Arceus-Dark", arceusdark);

    	Pokemon arceusdragon = new Pokemon("Arceus-Dragon");
    	arceusdragon.setTypes("Dragon", "(none)");
    	arceusdragon.setAbility("Multitype");
    	arceusdragon.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusdragon.setWeight(320.0);
    	pokedex.put("Arceus-Dragon", arceusdragon);

    	Pokemon arceuselectric = new Pokemon("Arceus-Electric");
    	arceuselectric.setTypes("Electric", "(none)");
    	arceuselectric.setAbility("Multitype");
    	arceuselectric.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceuselectric.setWeight(320.0);
    	pokedex.put("Arceus-Electric", arceuselectric);

    	Pokemon arceusfairy = new Pokemon("Arceus-Fairy");
    	arceusfairy.setTypes("Fairy", "(none)");
    	arceusfairy.setAbility("Multitype");
    	arceusfairy.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusfairy.setWeight(320.0);
    	pokedex.put("Arceus-Fairy", arceusfairy);

    	Pokemon arceusfighting = new Pokemon("Arceus-Fighting");
    	arceusfighting.setTypes("Fighting", "(none)");
    	arceusfighting.setAbility("Multitype");
    	arceusfighting.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusfighting.setWeight(320.0);
    	pokedex.put("Arceus-Fighting", arceusfighting);

    	Pokemon arceusfire = new Pokemon("Arceus-Fire");
    	arceusfire.setTypes("Fire", "(none)");
    	arceusfire.setAbility("Multitype");
    	arceusfire.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusfire.setWeight(320.0);
    	pokedex.put("Arceus-Fire", arceusfire);

    	Pokemon arceusflying = new Pokemon("Arceus-Flying");
    	arceusflying.setTypes("Flying", "(none)");
    	arceusflying.setAbility("Multitype");
    	arceusflying.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusflying.setWeight(320.0);
    	pokedex.put("Arceus-Flying", arceusflying);

    	Pokemon arceusghost = new Pokemon("Arceus-Ghost");
    	arceusghost.setTypes("Ghost", "(none)");
    	arceusghost.setAbility("Multitype");
    	arceusghost.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusghost.setWeight(320.0);
    	pokedex.put("Arceus-Ghost", arceusghost);

    	Pokemon arceusgrass = new Pokemon("Arceus-Grass");
    	arceusgrass.setTypes("Grass", "(none)");
    	arceusgrass.setAbility("Multitype");
    	arceusgrass.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusgrass.setWeight(320.0);
    	pokedex.put("Arceus-Grass", arceusgrass);

    	Pokemon arceusground = new Pokemon("Arceus-Ground");
    	arceusground.setTypes("Ground", "(none)");
    	arceusground.setAbility("Multitype");
    	arceusground.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusground.setWeight(320.0);
    	pokedex.put("Arceus-Ground", arceusground);

    	Pokemon arceusice = new Pokemon("Arceus-Ice");
    	arceusice.setTypes("Ice", "(none)");
    	arceusice.setAbility("Multitype");
    	arceusice.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusice.setWeight(320.0);
    	pokedex.put("Arceus-Ice", arceusice);

    	Pokemon arceuspoison = new Pokemon("Arceus-Poison");
    	arceuspoison.setTypes("Poison", "(none)");
    	arceuspoison.setAbility("Multitype");
    	arceuspoison.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceuspoison.setWeight(320.0);
    	pokedex.put("Arceus-Poison", arceuspoison);

    	Pokemon arceuspsychic = new Pokemon("Arceus-Psychic");
    	arceuspsychic.setTypes("Psychic", "(none)");
    	arceuspsychic.setAbility("Multitype");
    	arceuspsychic.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceuspsychic.setWeight(320.0);
    	pokedex.put("Arceus-Psychic", arceuspsychic);

    	Pokemon arceusrock = new Pokemon("Arceus-Rock");
    	arceusrock.setTypes("Rock", "(none)");
    	arceusrock.setAbility("Multitype");
    	arceusrock.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusrock.setWeight(320.0);
    	pokedex.put("Arceus-Rock", arceusrock);

    	Pokemon arceussteel = new Pokemon("Arceus-Steel");
    	arceussteel.setTypes("Steel", "(none)");
    	arceussteel.setAbility("Multitype");
    	arceussteel.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceussteel.setWeight(320.0);
    	pokedex.put("Arceus-Steel", arceussteel);

    	Pokemon arceuswater = new Pokemon("Arceus-Water");
    	arceuswater.setTypes("Water", "(none)");
    	arceuswater.setAbility("Multitype");
    	arceuswater.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceuswater.setWeight(320.0);
    	pokedex.put("Arceus-Water", arceuswater);

    	Pokemon archen = new Pokemon("Archen");
    	archen.setTypes("Rock", "Flying");
    	archen.setAbility("Defeatist");
    	archen.setAllBaseStats(55, 112, 45, 74, 45, 70);
    	archen.setWeight(9.5);
    	pokedex.put("Archen", archen);

    	Pokemon archeops = new Pokemon("Archeops");
    	archeops.setTypes("Rock", "Flying");
    	archeops.setAbility("Defeatist");
    	archeops.setAllBaseStats(75, 140, 65, 112, 65, 110);
    	archeops.setWeight(32.0);
    	pokedex.put("Archeops", archeops);

    	Pokemon argalis = new Pokemon("Argalis");
    	argalis.setTypes("Bug", "Psychic");
    	argalis.setAbility("Shed Skin");
    	argalis.setAllBaseStats(60, 90, 89, 87, 40, 54);
    	argalis.setWeight(341.4);
    	pokedex.put("Argalis", argalis);

    	Pokemon arghonaut = new Pokemon("Arghonaut");
    	arghonaut.setTypes("Water", "Fighting");
    	arghonaut.setAbility("Unaware");
    	arghonaut.setAllBaseStats(105, 110, 95, 70, 100, 75);
    	arghonaut.setWeight(151.0);
    	pokedex.put("Arghonaut", arghonaut);

    	Pokemon ariados = new Pokemon("Ariados");
    	ariados.setTypes("Bug", "Poison");
    	ariados.setAbility("Swarm");
    	ariados.setAllBaseStats(70, 90, 70, 60, 70, 40);
    	ariados.setWeight(33.5);
    	pokedex.put("Ariados", ariados);

    	Pokemon armaldo = new Pokemon("Armaldo");
    	armaldo.setTypes("Rock", "Bug");
    	armaldo.setAbility("Battle Armor");
    	armaldo.setAllBaseStats(75, 125, 100, 70, 80, 45);
    	armaldo.setWeight(68.2);
    	pokedex.put("Armaldo", armaldo);

    	Pokemon aromatisse = new Pokemon("Aromatisse");
    	aromatisse.setTypes("Fairy", "(none)");
    	aromatisse.setAbility("Healer");
    	aromatisse.setAllBaseStats(101, 72, 72, 99, 89, 29);
    	aromatisse.setWeight(15.5);
    	pokedex.put("Aromatisse", aromatisse);

    	Pokemon aron = new Pokemon("Aron");
    	aron.setTypes("Steel", "Rock");
    	aron.setAbility("Sturdy");
    	aron.setAllBaseStats(50, 70, 100, 40, 40, 30);
    	aron.setWeight(60.0);
    	pokedex.put("Aron", aron);

    	Pokemon articuno = new Pokemon("Articuno");
    	articuno.setTypes("Ice", "Flying");
    	articuno.setAbility("Pressure");
    	articuno.setAllBaseStats(90, 85, 100, 95, 125, 85);
    	articuno.setWeight(55.4);
    	pokedex.put("Articuno", articuno);

    	Pokemon audino = new Pokemon("Audino");
    	audino.setTypes("Normal", "(none)");
    	audino.setAbility("Healer");
    	audino.setAllBaseStats(103, 60, 86, 60, 86, 50);
    	audino.setWeight(31.0);
    	audino.setFormes("Audino", "Audino-Mega");
    	pokedex.put("Audino", audino);

    	Pokemon audinomega = new Pokemon("Audino-Mega");
    	audinomega.setTypes("Normal", "Fairy");
    	audinomega.setAbility("Healer");
    	audinomega.setAllBaseStats(103, 60, 126, 80, 126, 50);
    	audinomega.setWeight(32.0);
    	pokedex.put("Audino-Mega", audinomega);

    	Pokemon aurorus = new Pokemon("Aurorus");
    	aurorus.setTypes("Rock", "Ice");
    	aurorus.setAbility("Refrigerate");
    	aurorus.setAllBaseStats(123, 77, 72, 99, 92, 58);
    	aurorus.setWeight(225.0);
    	pokedex.put("Aurorus", aurorus);

    	Pokemon aurumoth = new Pokemon("Aurumoth");
    	aurumoth.setTypes("Bug", "Psychic");
    	aurumoth.setAbility("Weak Armor");
    	aurumoth.setAllBaseStats(110, 120, 99, 117, 60, 94);
    	aurumoth.setWeight(193.0);
    	pokedex.put("Aurumoth", aurumoth);

    	Pokemon avalugg = new Pokemon("Avalugg");
    	avalugg.setTypes("Ice", "(none)");
    	avalugg.setAbility("Own Tempo");
    	avalugg.setAllBaseStats(95, 117, 184, 44, 46, 28);
    	avalugg.setWeight(505.0);
    	pokedex.put("Avalugg", avalugg);

    	Pokemon axew = new Pokemon("Axew");
    	axew.setTypes("Dragon", "(none)");
    	axew.setAbility("Rivalry");
    	axew.setAllBaseStats(46, 87, 60, 30, 40, 57);
    	axew.setWeight(18.0);
    	pokedex.put("Axew", axew);

    	Pokemon azelf = new Pokemon("Azelf");
    	azelf.setTypes("Psychic", "(none)");
    	azelf.setAbility("Levitate");
    	azelf.setAllBaseStats(75, 125, 70, 125, 70, 115);
    	azelf.setWeight(0.3);
    	pokedex.put("Azelf", azelf);

    	Pokemon azumarill = new Pokemon("Azumarill");
    	azumarill.setTypes("Water", "Fairy");
    	azumarill.setAbility("Huge Power");
    	azumarill.setAllBaseStats(100, 50, 80, 60, 80, 50);
    	azumarill.setWeight(28.5);
    	pokedex.put("Azumarill", azumarill);

    	Pokemon azurill = new Pokemon("Azurill");
    	azurill.setTypes("Normal", "Fairy");
    	azurill.setAbility("Thick Fat");
    	azurill.setAllBaseStats(50, 20, 40, 20, 40, 20);
    	azurill.setWeight(2.0);
    	pokedex.put("Azurill", azurill);

    	Pokemon bagon = new Pokemon("Bagon");
    	bagon.setTypes("Dragon", "(none)");
    	bagon.setAbility("Rock Head");
    	bagon.setAllBaseStats(45, 75, 60, 40, 30, 50);
    	bagon.setWeight(42.1);
    	pokedex.put("Bagon", bagon);

    	Pokemon baltoy = new Pokemon("Baltoy");
    	baltoy.setTypes("Ground", "Psychic");
    	baltoy.setAbility("Levitate");
    	baltoy.setAllBaseStats(40, 40, 55, 40, 70, 55);
    	baltoy.setWeight(21.5);
    	pokedex.put("Baltoy", baltoy);

    	Pokemon banette = new Pokemon("Banette");
    	banette.setTypes("Ghost", "(none)");
    	banette.setAbility("Insomnia");
    	banette.setAllBaseStats(64, 115, 65, 83, 63, 65);
    	banette.setWeight(12.5);
    	banette.setFormes("Banette", "Banette-Mega");
    	pokedex.put("Banette", banette);

    	Pokemon banettemega = new Pokemon("Banette-Mega");
    	banettemega.setTypes("Ghost", "(none)");
    	banettemega.setAbility("Prankster");
    	banettemega.setAllBaseStats(64, 165, 75, 93, 83, 75);
    	banettemega.setWeight(13.0);
    	pokedex.put("Banette-Mega", banettemega);

    	Pokemon barbaracle = new Pokemon("Barbaracle");
    	barbaracle.setTypes("Rock", "Water");
    	barbaracle.setAbility("Tough Claws");
    	barbaracle.setAllBaseStats(72, 105, 115, 54, 86, 68);
    	barbaracle.setWeight(96.0);
    	pokedex.put("Barbaracle", barbaracle);

    	Pokemon barboach = new Pokemon("Barboach");
    	barboach.setTypes("Water", "Ground");
    	barboach.setAbility("Oblivious");
    	barboach.setAllBaseStats(50, 48, 43, 46, 41, 60);
    	barboach.setWeight(1.9);
    	pokedex.put("Barboach", barboach);

    	Pokemon basculin = new Pokemon("Basculin");
    	basculin.setTypes("Water", "(none)");
    	basculin.setAbility("Reckless");
    	basculin.setAllBaseStats(70, 92, 65, 80, 55, 98);
    	basculin.setWeight(18.0);
    	pokedex.put("Basculin", basculin);

    	Pokemon basculinbluestriped = new Pokemon("Basculin-Blue-Striped");
    	basculinbluestriped.setTypes("Water", "(none)");
    	basculinbluestriped.setAbility("Rock Head");
    	basculinbluestriped.setAllBaseStats(70, 92, 65, 80, 55, 98);
    	basculinbluestriped.setWeight(18.0);
    	pokedex.put("Basculin-Blue-Striped", basculinbluestriped);

    	Pokemon bastiodon = new Pokemon("Bastiodon");
    	bastiodon.setTypes("Rock", "Steel");
    	bastiodon.setAbility("Sturdy");
    	bastiodon.setAllBaseStats(60, 52, 168, 47, 138, 30);
    	bastiodon.setWeight(149.5);
    	pokedex.put("Bastiodon", bastiodon);

    	Pokemon bayleef = new Pokemon("Bayleef");
    	bayleef.setTypes("Grass", "(none)");
    	bayleef.setAbility("Overgrow");
    	bayleef.setAllBaseStats(60, 62, 80, 63, 80, 60);
    	bayleef.setWeight(15.8);
    	pokedex.put("Bayleef", bayleef);

    	Pokemon beartic = new Pokemon("Beartic");
    	beartic.setTypes("Ice", "(none)");
    	beartic.setAbility("Snow Cloak");
    	beartic.setAllBaseStats(95, 130, 80, 70, 80, 50);
    	beartic.setWeight(260.0);
    	pokedex.put("Beartic", beartic);

    	Pokemon beautifly = new Pokemon("Beautifly");
    	beautifly.setTypes("Bug", "Flying");
    	beautifly.setAbility("Swarm");
    	beautifly.setAllBaseStats(60, 70, 50, 100, 50, 65);
    	beautifly.setWeight(28.4);
    	pokedex.put("Beautifly", beautifly);

    	Pokemon beedrill = new Pokemon("Beedrill");
    	beedrill.setTypes("Bug", "Poison");
    	beedrill.setAbility("Swarm");
    	beedrill.setAllBaseStats(65, 90, 40, 45, 80, 75);
    	beedrill.setWeight(29.5);
    	beedrill.setFormes("Beedrill", "Beedrill-Mega");
    	pokedex.put("Beedrill", beedrill);

    	Pokemon beedrillmega = new Pokemon("Beedrill-Mega");
    	beedrillmega.setTypes("Bug", "Poison");
    	beedrillmega.setAbility("Adaptability");
    	beedrillmega.setAllBaseStats(65, 150, 40, 15, 80, 145);
    	beedrillmega.setWeight(40.5);
    	pokedex.put("Beedrill-Mega", beedrillmega);

    	Pokemon beheeyem = new Pokemon("Beheeyem");
    	beheeyem.setTypes("Psychic", "(none)");
    	beheeyem.setAbility("Telepathy");
    	beheeyem.setAllBaseStats(75, 75, 75, 125, 95, 40);
    	beheeyem.setWeight(34.5);
    	pokedex.put("Beheeyem", beheeyem);

    	Pokemon beldum = new Pokemon("Beldum");
    	beldum.setTypes("Steel", "Psychic");
    	beldum.setAbility("Clear Body");
    	beldum.setAllBaseStats(40, 55, 80, 35, 60, 30);
    	beldum.setWeight(95.2);
    	pokedex.put("Beldum", beldum);

    	Pokemon bellossom = new Pokemon("Bellossom");
    	bellossom.setTypes("Grass", "(none)");
    	bellossom.setAbility("Chlorophyll");
    	bellossom.setAllBaseStats(75, 80, 95, 90, 100, 50);
    	bellossom.setWeight(5.8);
    	pokedex.put("Bellossom", bellossom);

    	Pokemon bellsprout = new Pokemon("Bellsprout");
    	bellsprout.setTypes("Grass", "Poison");
    	bellsprout.setAbility("Chlorophyll");
    	bellsprout.setAllBaseStats(50, 75, 35, 70, 30, 40);
    	bellsprout.setWeight(4.0);
    	pokedex.put("Bellsprout", bellsprout);

    	Pokemon bergmite = new Pokemon("Bergmite");
    	bergmite.setTypes("Ice", "(none)");
    	bergmite.setAbility("Own Tempo");
    	bergmite.setAllBaseStats(55, 69, 85, 32, 35, 28);
    	bergmite.setWeight(99.5);
    	pokedex.put("Bergmite", bergmite);

    	Pokemon bewear = new Pokemon("Bewear");
    	bewear.setTypes("Normal", "Fighting");
    	bewear.setAbility("Fluffy");
    	bewear.setAllBaseStats(120, 125, 80, 55, 60, 60);
    	bewear.setWeight(135.0);
    	pokedex.put("Bewear", bewear);

    	Pokemon bibarel = new Pokemon("Bibarel");
    	bibarel.setTypes("Normal", "Water");
    	bibarel.setAbility("Simple");
    	bibarel.setAllBaseStats(79, 85, 60, 55, 60, 71);
    	bibarel.setWeight(31.5);
    	pokedex.put("Bibarel", bibarel);

    	Pokemon bidoof = new Pokemon("Bidoof");
    	bidoof.setTypes("Normal", "(none)");
    	bidoof.setAbility("Simple");
    	bidoof.setAllBaseStats(59, 45, 40, 35, 40, 31);
    	bidoof.setWeight(20.0);
    	pokedex.put("Bidoof", bidoof);

    	Pokemon binacle = new Pokemon("Binacle");
    	binacle.setTypes("Rock", "Water");
    	binacle.setAbility("Tough Claws");
    	binacle.setAllBaseStats(42, 52, 67, 39, 56, 50);
    	binacle.setWeight(31.0);
    	pokedex.put("Binacle", binacle);

    	Pokemon bisharp = new Pokemon("Bisharp");
    	bisharp.setTypes("Dark", "Steel");
    	bisharp.setAbility("Defiant");
    	bisharp.setAllBaseStats(65, 125, 100, 60, 70, 70);
    	bisharp.setWeight(70.0);
    	pokedex.put("Bisharp", bisharp);

    	Pokemon blacephalon = new Pokemon("Blacephalon");
    	blacephalon.setTypes("Fire", "Ghost");
    	blacephalon.setAbility("Beast Boost");
    	blacephalon.setAllBaseStats(53, 127, 53, 151, 79, 107);
    	blacephalon.setWeight(13.0);
    	pokedex.put("Blacephalon", blacephalon);

    	Pokemon blastoise = new Pokemon("Blastoise");
    	blastoise.setTypes("Water", "(none)");
    	blastoise.setAbility("Torrent");
    	blastoise.setAllBaseStats(79, 83, 100, 85, 105, 78);
    	blastoise.setWeight(85.5);
    	blastoise.setFormes("Blastoise", "Blastoise-Mega");
    	pokedex.put("Blastoise", blastoise);

    	Pokemon blastoisemega = new Pokemon("Blastoise-Mega");
    	blastoisemega.setTypes("Water", "(none)");
    	blastoisemega.setAbility("Mega Launcher");
    	blastoisemega.setAllBaseStats(79, 103, 120, 135, 115, 78);
    	blastoisemega.setWeight(101.1);
    	pokedex.put("Blastoise-Mega", blastoisemega);

    	Pokemon blaziken = new Pokemon("Blaziken");
    	blaziken.setTypes("Fire", "Fighting");
    	blaziken.setAbility("Speed Boost");
    	blaziken.setAllBaseStats(80, 120, 70, 110, 70, 80);
    	blaziken.setWeight(52.0);
    	blaziken.setFormes("Blaziken", "Blaziken-Mega");
    	pokedex.put("Blaziken", blaziken);

    	Pokemon blazikenmega = new Pokemon("Blaziken-Mega");
    	blazikenmega.setTypes("Fire", "Fighting");
    	blazikenmega.setAbility("Speed Boost");
    	blazikenmega.setAllBaseStats(80, 160, 80, 130, 80, 100);
    	blazikenmega.setWeight(52.0);
    	pokedex.put("Blaziken-Mega", blazikenmega);

    	Pokemon blissey = new Pokemon("Blissey");
    	blissey.setTypes("Normal", "(none)");
    	blissey.setAbility("Natural Cure");
    	blissey.setAllBaseStats(255, 10, 10, 75, 135, 55);
    	blissey.setWeight(46.8);
    	pokedex.put("Blissey", blissey);

    	Pokemon blitzle = new Pokemon("Blitzle");
    	blitzle.setTypes("Electric", "(none)");
    	blitzle.setAbility("Lightning Rod");
    	blitzle.setAllBaseStats(45, 60, 32, 50, 32, 76);
    	blitzle.setWeight(29.8);
    	pokedex.put("Blitzle", blitzle);

    	Pokemon boldore = new Pokemon("Boldore");
    	boldore.setTypes("Rock", "(none)");
    	boldore.setAbility("Sturdy");
    	boldore.setAllBaseStats(70, 105, 105, 50, 40, 20);
    	boldore.setWeight(102.0);
    	pokedex.put("Boldore", boldore);

    	Pokemon bonsly = new Pokemon("Bonsly");
    	bonsly.setTypes("Rock", "(none)");
    	bonsly.setAbility("Sturdy");
    	bonsly.setAllBaseStats(50, 80, 95, 10, 45, 10);
    	bonsly.setWeight(15.0);
    	pokedex.put("Bonsly", bonsly);

    	Pokemon bouffalant = new Pokemon("Bouffalant");
    	bouffalant.setTypes("Normal", "(none)");
    	bouffalant.setAbility("Reckless");
    	bouffalant.setAllBaseStats(95, 110, 95, 40, 95, 55);
    	bouffalant.setWeight(94.6);
    	pokedex.put("Bouffalant", bouffalant);

    	Pokemon bounsweet = new Pokemon("Bounsweet");
    	bounsweet.setTypes("Grass", "(none)");
    	bounsweet.setAbility("Leaf Guard");
    	bounsweet.setAllBaseStats(42, 30, 38, 30, 38, 32);
    	bounsweet.setWeight(3.2);
    	pokedex.put("Bounsweet", bounsweet);

    	Pokemon braixen = new Pokemon("Braixen");
    	braixen.setTypes("Fire", "(none)");
    	braixen.setAbility("Blaze");
    	braixen.setAllBaseStats(59, 59, 58, 90, 70, 73);
    	braixen.setWeight(14.5);
    	pokedex.put("Braixen", braixen);

    	Pokemon brattler = new Pokemon("Brattler");
    	brattler.setTypes("Dark", "Grass");
    	brattler.setAbility("Harvest");
    	brattler.setAllBaseStats(80, 70, 40, 20, 90, 30);
    	brattler.setWeight(11.5);
    	pokedex.put("Brattler", brattler);

    	Pokemon braviary = new Pokemon("Braviary");
    	braviary.setTypes("Normal", "Flying");
    	braviary.setAbility("Keen Eye");
    	braviary.setAllBaseStats(100, 123, 75, 57, 75, 80);
    	braviary.setWeight(41.0);
    	pokedex.put("Braviary", braviary);

    	Pokemon breezi = new Pokemon("Breezi");
    	breezi.setTypes("Poison", "Flying");
    	breezi.setAbility("Unburden");
    	breezi.setAllBaseStats(50, 46, 69, 60, 50, 75);
    	breezi.setWeight(0.6);
    	pokedex.put("Breezi", breezi);

    	Pokemon breloom = new Pokemon("Breloom");
    	breloom.setTypes("Grass", "Fighting");
    	breloom.setAbility("Effect Spore");
    	breloom.setAllBaseStats(60, 130, 80, 60, 60, 70);
    	breloom.setWeight(39.2);
    	pokedex.put("Breloom", breloom);

    	Pokemon brionne = new Pokemon("Brionne");
    	brionne.setTypes("Water", "(none)");
    	brionne.setAbility("Torrent");
    	brionne.setAllBaseStats(60, 69, 69, 91, 81, 50);
    	brionne.setWeight(17.5);
    	pokedex.put("Brionne", brionne);

    	Pokemon bronzong = new Pokemon("Bronzong");
    	bronzong.setTypes("Steel", "Psychic");
    	bronzong.setAbility("Levitate");
    	bronzong.setAllBaseStats(67, 89, 116, 79, 116, 33);
    	bronzong.setWeight(187.0);
    	pokedex.put("Bronzong", bronzong);

    	Pokemon bronzor = new Pokemon("Bronzor");
    	bronzor.setTypes("Steel", "Psychic");
    	bronzor.setAbility("Levitate");
    	bronzor.setAllBaseStats(57, 24, 86, 24, 86, 23);
    	bronzor.setWeight(60.5);
    	pokedex.put("Bronzor", bronzor);

    	Pokemon bruxish = new Pokemon("Bruxish");
    	bruxish.setTypes("Water", "Psychic");
    	bruxish.setAbility("Dazzling");
    	bruxish.setAllBaseStats(68, 105, 70, 70, 70, 92);
    	bruxish.setWeight(19.0);
    	pokedex.put("Bruxish", bruxish);

    	Pokemon budew = new Pokemon("Budew");
    	budew.setTypes("Grass", "Poison");
    	budew.setAbility("Natural Cure");
    	budew.setAllBaseStats(40, 30, 35, 50, 70, 55);
    	budew.setWeight(1.2);
    	pokedex.put("Budew", budew);

    	Pokemon buizel = new Pokemon("Buizel");
    	buizel.setTypes("Water", "(none)");
    	buizel.setAbility("Swift Swim");
    	buizel.setAllBaseStats(55, 65, 35, 60, 30, 85);
    	buizel.setWeight(29.5);
    	pokedex.put("Buizel", buizel);

    	Pokemon bulbasaur = new Pokemon("Bulbasaur");
    	bulbasaur.setTypes("Grass", "Poison");
    	bulbasaur.setAbility("Overgrow");
    	bulbasaur.setAllBaseStats(45, 49, 49, 65, 65, 45);
    	bulbasaur.setWeight(6.9);
    	pokedex.put("Bulbasaur", bulbasaur);

    	Pokemon buneary = new Pokemon("Buneary");
    	buneary.setTypes("Normal", "(none)");
    	buneary.setAbility("Run Away");
    	buneary.setAllBaseStats(55, 66, 44, 44, 56, 85);
    	buneary.setWeight(5.5);
    	pokedex.put("Buneary", buneary);

    	Pokemon bunnelby = new Pokemon("Bunnelby");
    	bunnelby.setTypes("Normal", "(none)");
    	bunnelby.setAbility("Pickup");
    	bunnelby.setAllBaseStats(38, 36, 38, 32, 36, 57);
    	bunnelby.setWeight(5.0);
    	pokedex.put("Bunnelby", bunnelby);

    	Pokemon burmy = new Pokemon("Burmy");
    	burmy.setTypes("Bug", "(none)");
    	burmy.setAbility("Shed Skin");
    	burmy.setAllBaseStats(40, 29, 45, 29, 45, 36);
    	burmy.setWeight(3.4);
    	pokedex.put("Burmy", burmy);

    	Pokemon butterfree = new Pokemon("Butterfree");
    	butterfree.setTypes("Bug", "Flying");
    	butterfree.setAbility("Compound Eyes");
    	butterfree.setAllBaseStats(60, 45, 50, 90, 80, 70);
    	butterfree.setWeight(32.0);
    	pokedex.put("Butterfree", butterfree);

    	Pokemon buzzwole = new Pokemon("Buzzwole");
    	buzzwole.setTypes("Bug", "Fighting");
    	buzzwole.setAbility("Beast Boost");
    	buzzwole.setAllBaseStats(107, 139, 139, 53, 53, 79);
    	buzzwole.setWeight(333.6);
    	pokedex.put("Buzzwole", buzzwole);

    	Pokemon cacnea = new Pokemon("Cacnea");
    	cacnea.setTypes("Grass", "(none)");
    	cacnea.setAbility("Sand Veil");
    	cacnea.setAllBaseStats(50, 85, 40, 85, 40, 35);
    	cacnea.setWeight(51.3);
    	pokedex.put("Cacnea", cacnea);

    	Pokemon cacturne = new Pokemon("Cacturne");
    	cacturne.setTypes("Grass", "Dark");
    	cacturne.setAbility("Sand Veil");
    	cacturne.setAllBaseStats(70, 115, 60, 115, 60, 55);
    	cacturne.setWeight(77.4);
    	pokedex.put("Cacturne", cacturne);

    	Pokemon caimanoe = new Pokemon("Caimanoe");
    	caimanoe.setTypes("Water", "Steel");
    	caimanoe.setAbility("Water Veil");
    	caimanoe.setAllBaseStats(73, 85, 65, 80, 40, 87);
    	caimanoe.setWeight(72.5);
    	pokedex.put("Caimanoe", caimanoe);

    	Pokemon camerupt = new Pokemon("Camerupt");
    	camerupt.setTypes("Fire", "Ground");
    	camerupt.setAbility("Solid Rock");
    	camerupt.setAllBaseStats(70, 100, 70, 105, 75, 40);
    	camerupt.setWeight(220.0);
    	camerupt.setFormes("Camerupt", "Camerupt-Mega");
    	pokedex.put("Camerupt", camerupt);

    	Pokemon cameruptmega = new Pokemon("Camerupt-Mega");
    	cameruptmega.setTypes("Fire", "Ground");
    	cameruptmega.setAbility("Sheer Force");
    	cameruptmega.setAllBaseStats(70, 120, 100, 145, 105, 20);
    	cameruptmega.setWeight(320.5);
    	pokedex.put("Camerupt-Mega", cameruptmega);

    	Pokemon carbink = new Pokemon("Carbink");
    	carbink.setTypes("Rock", "Fairy");
    	carbink.setAbility("Clear Body");
    	carbink.setAllBaseStats(50, 50, 150, 50, 150, 50);
    	carbink.setWeight(5.7);
    	pokedex.put("Carbink", carbink);

    	Pokemon carnivine = new Pokemon("Carnivine");
    	carnivine.setTypes("Grass", "(none)");
    	carnivine.setAbility("Levitate");
    	carnivine.setAllBaseStats(74, 100, 72, 90, 72, 46);
    	carnivine.setWeight(27.0);
    	pokedex.put("Carnivine", carnivine);

    	Pokemon carracosta = new Pokemon("Carracosta");
    	carracosta.setTypes("Water", "Rock");
    	carracosta.setAbility("Solid Rock");
    	carracosta.setAllBaseStats(74, 108, 133, 83, 65, 32);
    	carracosta.setWeight(81.0);
    	pokedex.put("Carracosta", carracosta);

    	Pokemon carvanha = new Pokemon("Carvanha");
    	carvanha.setTypes("Water", "Dark");
    	carvanha.setAbility("Rough Skin");
    	carvanha.setAllBaseStats(45, 90, 20, 65, 20, 65);
    	carvanha.setWeight(20.8);
    	pokedex.put("Carvanha", carvanha);

    	Pokemon cascoon = new Pokemon("Cascoon");
    	cascoon.setTypes("Bug", "(none)");
    	cascoon.setAbility("Shed Skin");
    	cascoon.setAllBaseStats(50, 35, 55, 25, 25, 15);
    	cascoon.setWeight(11.5);
    	pokedex.put("Cascoon", cascoon);

    	Pokemon castform = new Pokemon("Castform");
    	castform.setTypes("Normal", "(none)");
    	castform.setAbility("Forecast");
    	castform.setAllBaseStats(70, 70, 70, 70, 70, 70);
    	castform.setWeight(0.8);
    	pokedex.put("Castform", castform);

    	Pokemon castformrainy = new Pokemon("Castform-Rainy");
    	castformrainy.setTypes("Water", "(none)");
    	castformrainy.setAbility("Forecast");
    	castformrainy.setAllBaseStats(70, 70, 70, 70, 70, 70);
    	castformrainy.setWeight(0.8);
    	pokedex.put("Castform-Rainy", castformrainy);

    	Pokemon castformsnowy = new Pokemon("Castform-Snowy");
    	castformsnowy.setTypes("Ice", "(none)");
    	castformsnowy.setAbility("Forecast");
    	castformsnowy.setAllBaseStats(70, 70, 70, 70, 70, 70);
    	castformsnowy.setWeight(0.8);
    	pokedex.put("Castform-Snowy", castformsnowy);

    	Pokemon castformsunny = new Pokemon("Castform-Sunny");
    	castformsunny.setTypes("Fire", "(none)");
    	castformsunny.setAbility("Forecast");
    	castformsunny.setAllBaseStats(70, 70, 70, 70, 70, 70);
    	castformsunny.setWeight(0.8);
    	pokedex.put("Castform-Sunny", castformsunny);

    	Pokemon caterpie = new Pokemon("Caterpie");
    	caterpie.setTypes("Bug", "(none)");
    	caterpie.setAbility("Shield Dust");
    	caterpie.setAllBaseStats(45, 30, 35, 20, 20, 45);
    	caterpie.setWeight(2.9);
    	pokedex.put("Caterpie", caterpie);

    	Pokemon cawdet = new Pokemon("Cawdet");
    	cawdet.setTypes("Steel", "Flying");
    	cawdet.setAbility("Keen Eye");
    	cawdet.setAllBaseStats(35, 72, 85, 40, 55, 88);
    	cawdet.setWeight(25.0);
    	pokedex.put("Cawdet", cawdet);

    	Pokemon cawmodore = new Pokemon("Cawmodore");
    	cawmodore.setTypes("Steel", "Flying");
    	cawmodore.setAbility("Intimidate");
    	cawmodore.setAllBaseStats(50, 92, 130, 65, 75, 118);
    	cawmodore.setWeight(37.0);
    	pokedex.put("Cawmodore", cawmodore);

    	Pokemon celebi = new Pokemon("Celebi");
    	celebi.setTypes("Psychic", "Grass");
    	celebi.setAbility("Natural Cure");
    	celebi.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	celebi.setWeight(5.0);
    	pokedex.put("Celebi", celebi);

    	Pokemon celesteela = new Pokemon("Celesteela");
    	celesteela.setTypes("Steel", "Flying");
    	celesteela.setAbility("Beast Boost");
    	celesteela.setAllBaseStats(97, 101, 103, 107, 101, 61);
    	celesteela.setWeight(999.9);
    	pokedex.put("Celesteela", celesteela);

    	Pokemon chandelure = new Pokemon("Chandelure");
    	chandelure.setTypes("Ghost", "Fire");
    	chandelure.setAbility("Flash Fire");
    	chandelure.setAllBaseStats(60, 55, 90, 145, 90, 80);
    	chandelure.setWeight(34.3);
    	pokedex.put("Chandelure", chandelure);

    	Pokemon chansey = new Pokemon("Chansey");
    	chansey.setTypes("Normal", "(none)");
    	chansey.setAbility("Natural Cure");
    	chansey.setAllBaseStats(250, 5, 5, 35, 105, 50);
    	chansey.setWeight(34.6);
    	pokedex.put("Chansey", chansey);

    	Pokemon charizard = new Pokemon("Charizard");
    	charizard.setTypes("Fire", "Flying");
    	charizard.setAbility("Blaze");
    	charizard.setAllBaseStats(78, 84, 78, 109, 85, 100);
    	charizard.setWeight(90.5);
    	charizard.setFormes("Charizard", "Charizard-Mega-X", "Charizard-Mega-Y");
    	pokedex.put("Charizard", charizard);

    	Pokemon charizardmegax = new Pokemon("Charizard-Mega-X");
    	charizardmegax.setTypes("Fire", "Dragon");
    	charizardmegax.setAbility("Tough Claws");
    	charizardmegax.setAllBaseStats(78, 130, 111, 130, 85, 100);
    	charizardmegax.setWeight(110.5);
    	pokedex.put("Charizard-Mega-X", charizardmegax);

    	Pokemon charizardmegay = new Pokemon("Charizard-Mega-Y");
    	charizardmegay.setTypes("Fire", "Flying");
    	charizardmegay.setAbility("Drought");
    	charizardmegay.setAllBaseStats(78, 104, 78, 159, 115, 100);
    	charizardmegay.setWeight(100.5);
    	pokedex.put("Charizard-Mega-Y", charizardmegay);

    	Pokemon charjabug = new Pokemon("Charjabug");
    	charjabug.setTypes("Bug", "Electric");
    	charjabug.setAbility("Battery");
    	charjabug.setAllBaseStats(57, 82, 95, 55, 75, 36);
    	charjabug.setWeight(10.5);
    	pokedex.put("Charjabug", charjabug);

    	Pokemon charmander = new Pokemon("Charmander");
    	charmander.setTypes("Fire", "(none)");
    	charmander.setAbility("Blaze");
    	charmander.setAllBaseStats(39, 52, 43, 60, 50, 65);
    	charmander.setWeight(8.5);
    	pokedex.put("Charmander", charmander);

    	Pokemon charmeleon = new Pokemon("Charmeleon");
    	charmeleon.setTypes("Fire", "(none)");
    	charmeleon.setAbility("Blaze");
    	charmeleon.setAllBaseStats(58, 64, 58, 80, 65, 80);
    	charmeleon.setWeight(19.0);
    	pokedex.put("Charmeleon", charmeleon);

    	Pokemon chatot = new Pokemon("Chatot");
    	chatot.setTypes("Normal", "Flying");
    	chatot.setAbility("Keen Eye");
    	chatot.setAllBaseStats(76, 65, 45, 92, 42, 91);
    	chatot.setWeight(1.9);
    	pokedex.put("Chatot", chatot);

    	Pokemon cherrim = new Pokemon("Cherrim");
    	cherrim.setTypes("Grass", "(none)");
    	cherrim.setAbility("Flower Gift");
    	cherrim.setAllBaseStats(70, 60, 70, 87, 78, 85);
    	cherrim.setWeight(9.3);
    	pokedex.put("Cherrim", cherrim);

    	Pokemon cherrimsunshine = new Pokemon("Cherrim-Sunshine");
    	cherrimsunshine.setTypes("Grass", "(none)");
    	cherrimsunshine.setAbility("Flower Gift");
    	cherrimsunshine.setAllBaseStats(70, 60, 70, 87, 78, 85);
    	cherrimsunshine.setWeight(9.3);
    	pokedex.put("Cherrim-Sunshine", cherrimsunshine);

    	Pokemon cherubi = new Pokemon("Cherubi");
    	cherubi.setTypes("Grass", "(none)");
    	cherubi.setAbility("Chlorophyll");
    	cherubi.setAllBaseStats(45, 35, 45, 62, 53, 35);
    	cherubi.setWeight(3.3);
    	pokedex.put("Cherubi", cherubi);

    	Pokemon chesnaught = new Pokemon("Chesnaught");
    	chesnaught.setTypes("Grass", "Fighting");
    	chesnaught.setAbility("Overgrow");
    	chesnaught.setAllBaseStats(88, 107, 122, 74, 75, 64);
    	chesnaught.setWeight(90.0);
    	pokedex.put("Chesnaught", chesnaught);

    	Pokemon chespin = new Pokemon("Chespin");
    	chespin.setTypes("Grass", "(none)");
    	chespin.setAbility("Overgrow");
    	chespin.setAllBaseStats(56, 61, 65, 48, 45, 38);
    	chespin.setWeight(9.0);
    	pokedex.put("Chespin", chespin);

    	Pokemon chikorita = new Pokemon("Chikorita");
    	chikorita.setTypes("Grass", "(none)");
    	chikorita.setAbility("Overgrow");
    	chikorita.setAllBaseStats(45, 49, 65, 49, 65, 45);
    	chikorita.setWeight(6.4);
    	pokedex.put("Chikorita", chikorita);

    	Pokemon chimchar = new Pokemon("Chimchar");
    	chimchar.setTypes("Fire", "(none)");
    	chimchar.setAbility("Blaze");
    	chimchar.setAllBaseStats(44, 58, 44, 58, 44, 61);
    	chimchar.setWeight(6.2);
    	pokedex.put("Chimchar", chimchar);

    	Pokemon chimecho = new Pokemon("Chimecho");
    	chimecho.setTypes("Psychic", "(none)");
    	chimecho.setAbility("Levitate");
    	chimecho.setAllBaseStats(75, 50, 80, 95, 90, 65);
    	chimecho.setWeight(1.0);
    	pokedex.put("Chimecho", chimecho);

    	Pokemon chinchou = new Pokemon("Chinchou");
    	chinchou.setTypes("Water", "Electric");
    	chinchou.setAbility("Volt Absorb");
    	chinchou.setAllBaseStats(75, 38, 38, 56, 56, 67);
    	chinchou.setWeight(12.0);
    	pokedex.put("Chinchou", chinchou);

    	Pokemon chingling = new Pokemon("Chingling");
    	chingling.setTypes("Psychic", "(none)");
    	chingling.setAbility("Levitate");
    	chingling.setAllBaseStats(45, 30, 50, 65, 50, 45);
    	chingling.setWeight(0.6);
    	pokedex.put("Chingling", chingling);

    	Pokemon cinccino = new Pokemon("Cinccino");
    	cinccino.setTypes("Normal", "(none)");
    	cinccino.setAbility("Cute Charm");
    	cinccino.setAllBaseStats(75, 95, 60, 65, 60, 115);
    	cinccino.setWeight(7.5);
    	pokedex.put("Cinccino", cinccino);

    	Pokemon clamperl = new Pokemon("Clamperl");
    	clamperl.setTypes("Water", "(none)");
    	clamperl.setAbility("Shell Armor");
    	clamperl.setAllBaseStats(35, 64, 85, 74, 55, 32);
    	clamperl.setWeight(52.5);
    	pokedex.put("Clamperl", clamperl);

    	Pokemon clauncher = new Pokemon("Clauncher");
    	clauncher.setTypes("Water", "(none)");
    	clauncher.setAbility("Mega Launcher");
    	clauncher.setAllBaseStats(50, 53, 62, 58, 63, 44);
    	clauncher.setWeight(8.3);
    	pokedex.put("Clauncher", clauncher);

    	Pokemon clawitzer = new Pokemon("Clawitzer");
    	clawitzer.setTypes("Water", "(none)");
    	clawitzer.setAbility("Mega Launcher");
    	clawitzer.setAllBaseStats(71, 73, 88, 120, 89, 59);
    	clawitzer.setWeight(35.3);
    	pokedex.put("Clawitzer", clawitzer);

    	Pokemon claydol = new Pokemon("Claydol");
    	claydol.setTypes("Ground", "Psychic");
    	claydol.setAbility("Levitate");
    	claydol.setAllBaseStats(60, 70, 105, 70, 120, 75);
    	claydol.setWeight(108.0);
    	pokedex.put("Claydol", claydol);

    	Pokemon clefable = new Pokemon("Clefable");
    	clefable.setTypes("Fairy", "(none)");
    	clefable.setAbility("Cute Charm");
    	clefable.setAllBaseStats(95, 70, 73, 95, 90, 60);
    	clefable.setWeight(40.0);
    	pokedex.put("Clefable", clefable);

    	Pokemon clefairy = new Pokemon("Clefairy");
    	clefairy.setTypes("Fairy", "(none)");
    	clefairy.setAbility("Friend Guard");
    	clefairy.setAllBaseStats(70, 45, 48, 60, 65, 35);
    	clefairy.setWeight(7.5);
    	pokedex.put("Clefairy", clefairy);

    	Pokemon cleffa = new Pokemon("Cleffa");
    	cleffa.setTypes("Fairy", "(none)");
    	cleffa.setAbility("Cute Charm");
    	cleffa.setAllBaseStats(50, 25, 28, 45, 55, 15);
    	cleffa.setWeight(3.0);
    	pokedex.put("Cleffa", cleffa);

    	Pokemon cloyster = new Pokemon("Cloyster");
    	cloyster.setTypes("Water", "Ice");
    	cloyster.setAbility("Shell Armor");
    	cloyster.setAllBaseStats(50, 95, 180, 85, 45, 70);
    	cloyster.setWeight(132.5);
    	pokedex.put("Cloyster", cloyster);

    	Pokemon cobalion = new Pokemon("Cobalion");
    	cobalion.setTypes("Steel", "Fighting");
    	cobalion.setAbility("Justified");
    	cobalion.setAllBaseStats(91, 90, 129, 90, 72, 108);
    	cobalion.setWeight(250.0);
    	pokedex.put("Cobalion", cobalion);

    	Pokemon cofagrigus = new Pokemon("Cofagrigus");
    	cofagrigus.setTypes("Ghost", "(none)");
    	cofagrigus.setAbility("Mummy");
    	cofagrigus.setAllBaseStats(58, 50, 145, 95, 105, 30);
    	cofagrigus.setWeight(76.5);
    	pokedex.put("Cofagrigus", cofagrigus);

    	Pokemon colossoil = new Pokemon("Colossoil");
    	colossoil.setTypes("Dark", "Ground");
    	colossoil.setAbility("Rebound");
    	colossoil.setAllBaseStats(133, 122, 72, 71, 72, 95);
    	colossoil.setWeight(683.6);
    	pokedex.put("Colossoil", colossoil);

    	Pokemon combee = new Pokemon("Combee");
    	combee.setTypes("Bug", "Flying");
    	combee.setAbility("Honey Gather");
    	combee.setAllBaseStats(30, 30, 42, 30, 42, 70);
    	combee.setWeight(5.5);
    	pokedex.put("Combee", combee);

    	Pokemon combusken = new Pokemon("Combusken");
    	combusken.setTypes("Fire", "Fighting");
    	combusken.setAbility("Blaze");
    	combusken.setAllBaseStats(60, 85, 60, 85, 60, 55);
    	combusken.setWeight(19.5);
    	pokedex.put("Combusken", combusken);

    	Pokemon comfey = new Pokemon("Comfey");
    	comfey.setTypes("Fairy", "(none)");
    	comfey.setAbility("Flower Veil");
    	comfey.setAllBaseStats(51, 52, 90, 82, 110, 100);
    	comfey.setWeight(0.3);
    	pokedex.put("Comfey", comfey);

    	Pokemon conkeldurr = new Pokemon("Conkeldurr");
    	conkeldurr.setTypes("Fighting", "(none)");
    	conkeldurr.setAbility("Guts");
    	conkeldurr.setAllBaseStats(105, 140, 95, 55, 65, 45);
    	conkeldurr.setWeight(87.0);
    	pokedex.put("Conkeldurr", conkeldurr);

    	Pokemon corphish = new Pokemon("Corphish");
    	corphish.setTypes("Water", "(none)");
    	corphish.setAbility("Hyper Cutter");
    	corphish.setAllBaseStats(43, 80, 65, 50, 35, 35);
    	corphish.setWeight(11.5);
    	pokedex.put("Corphish", corphish);

    	Pokemon corsola = new Pokemon("Corsola");
    	corsola.setTypes("Water", "Rock");
    	corsola.setAbility("Hustle");
    	corsola.setAllBaseStats(65, 55, 95, 65, 95, 35);
    	corsola.setWeight(5.0);
    	pokedex.put("Corsola", corsola);

    	Pokemon cosmoem = new Pokemon("Cosmoem");
    	cosmoem.setTypes("Psychic", "(none)");
    	cosmoem.setAbility("Sturdy");
    	cosmoem.setAllBaseStats(43, 29, 131, 29, 131, 37);
    	cosmoem.setWeight(999.9);
    	pokedex.put("Cosmoem", cosmoem);

    	Pokemon cosmog = new Pokemon("Cosmog");
    	cosmog.setTypes("Psychic", "(none)");
    	cosmog.setAbility("Unaware");
    	cosmog.setAllBaseStats(43, 29, 31, 29, 31, 37);
    	cosmog.setWeight(0.1);
    	pokedex.put("Cosmog", cosmog);

    	Pokemon cottonee = new Pokemon("Cottonee");
    	cottonee.setTypes("Grass", "Fairy");
    	cottonee.setAbility("Prankster");
    	cottonee.setAllBaseStats(40, 27, 60, 37, 50, 66);
    	cottonee.setWeight(0.6);
    	pokedex.put("Cottonee", cottonee);

    	Pokemon crabominable = new Pokemon("Crabominable");
    	crabominable.setTypes("Fighting", "Ice");
    	crabominable.setAbility("Hyper Cutter");
    	crabominable.setAllBaseStats(97, 132, 77, 62, 67, 43);
    	crabominable.setWeight(180.0);
    	pokedex.put("Crabominable", crabominable);

    	Pokemon crabrawler = new Pokemon("Crabrawler");
    	crabrawler.setTypes("Fighting", "(none)");
    	crabrawler.setAbility("Hyper Cutter");
    	crabrawler.setAllBaseStats(47, 82, 57, 42, 47, 63);
    	crabrawler.setWeight(7.0);
    	pokedex.put("Crabrawler", crabrawler);

    	Pokemon cradily = new Pokemon("Cradily");
    	cradily.setTypes("Rock", "Grass");
    	cradily.setAbility("Suction Cups");
    	cradily.setAllBaseStats(86, 81, 97, 81, 107, 43);
    	cradily.setWeight(60.4);
    	pokedex.put("Cradily", cradily);

    	Pokemon cranidos = new Pokemon("Cranidos");
    	cranidos.setTypes("Rock", "(none)");
    	cranidos.setAbility("Mold Breaker");
    	cranidos.setAllBaseStats(67, 125, 40, 30, 30, 58);
    	cranidos.setWeight(31.5);
    	pokedex.put("Cranidos", cranidos);

    	Pokemon crawdaunt = new Pokemon("Crawdaunt");
    	crawdaunt.setTypes("Water", "Dark");
    	crawdaunt.setAbility("Hyper Cutter");
    	crawdaunt.setAllBaseStats(63, 120, 85, 90, 55, 55);
    	crawdaunt.setWeight(32.8);
    	pokedex.put("Crawdaunt", crawdaunt);

    	Pokemon cresselia = new Pokemon("Cresselia");
    	cresselia.setTypes("Psychic", "(none)");
    	cresselia.setAbility("Levitate");
    	cresselia.setAllBaseStats(120, 70, 120, 75, 130, 85);
    	cresselia.setWeight(85.6);
    	pokedex.put("Cresselia", cresselia);

    	Pokemon croagunk = new Pokemon("Croagunk");
    	croagunk.setTypes("Poison", "Fighting");
    	croagunk.setAbility("Anticipation");
    	croagunk.setAllBaseStats(48, 61, 40, 61, 40, 50);
    	croagunk.setWeight(23.0);
    	pokedex.put("Croagunk", croagunk);

    	Pokemon crobat = new Pokemon("Crobat");
    	crobat.setTypes("Poison", "Flying");
    	crobat.setAbility("Inner Focus");
    	crobat.setAllBaseStats(85, 90, 80, 70, 80, 130);
    	crobat.setWeight(75.0);
    	pokedex.put("Crobat", crobat);

    	Pokemon croconaw = new Pokemon("Croconaw");
    	croconaw.setTypes("Water", "(none)");
    	croconaw.setAbility("Torrent");
    	croconaw.setAllBaseStats(65, 80, 80, 59, 63, 58);
    	croconaw.setWeight(25.0);
    	pokedex.put("Croconaw", croconaw);

    	Pokemon crucibelle = new Pokemon("Crucibelle");
    	crucibelle.setTypes("Rock", "Poison");
    	crucibelle.setAbility("Regenerator");
    	crucibelle.setAllBaseStats(106, 105, 65, 75, 85, 104);
    	crucibelle.setWeight(23.6);
    	pokedex.put("Crucibelle", crucibelle);

    	Pokemon crucibellemega = new Pokemon("Crucibelle-Mega");
    	crucibellemega.setTypes("Rock", "Poison");
    	crucibellemega.setAbility("Magic Guard");
    	crucibellemega.setAllBaseStats(106, 135, 75, 85, 125, 114);
    	crucibellemega.setWeight(22.5);
    	pokedex.put("Crucibelle-Mega", crucibellemega);

    	Pokemon crustle = new Pokemon("Crustle");
    	crustle.setTypes("Bug", "Rock");
    	crustle.setAbility("Sturdy");
    	crustle.setAllBaseStats(70, 105, 125, 65, 75, 45);
    	crustle.setWeight(200.0);
    	pokedex.put("Crustle", crustle);

    	Pokemon cryogonal = new Pokemon("Cryogonal");
    	cryogonal.setTypes("Ice", "(none)");
    	cryogonal.setAbility("Levitate");
    	cryogonal.setAllBaseStats(80, 50, 50, 95, 135, 105);
    	cryogonal.setWeight(148.0);
    	pokedex.put("Cryogonal", cryogonal);

    	Pokemon cubchoo = new Pokemon("Cubchoo");
    	cubchoo.setTypes("Ice", "(none)");
    	cubchoo.setAbility("Snow Cloak");
    	cubchoo.setAllBaseStats(55, 70, 40, 60, 40, 40);
    	cubchoo.setWeight(8.5);
    	pokedex.put("Cubchoo", cubchoo);

    	Pokemon cubone = new Pokemon("Cubone");
    	cubone.setTypes("Ground", "(none)");
    	cubone.setAbility("Rock Head");
    	cubone.setAllBaseStats(50, 50, 95, 40, 50, 35);
    	cubone.setWeight(6.5);
    	pokedex.put("Cubone", cubone);

    	Pokemon cupra = new Pokemon("Cupra");
    	cupra.setTypes("Bug", "Psychic");
    	cupra.setAbility("Shield Dust");
    	cupra.setAllBaseStats(50, 60, 49, 67, 30, 44);
    	cupra.setWeight(4.8);
    	pokedex.put("Cupra", cupra);

    	Pokemon cutiefly = new Pokemon("Cutiefly");
    	cutiefly.setTypes("Bug", "Fairy");
    	cutiefly.setAbility("Honey Gather");
    	cutiefly.setAllBaseStats(40, 45, 40, 55, 40, 84);
    	cutiefly.setWeight(0.2);
    	pokedex.put("Cutiefly", cutiefly);

    	Pokemon cyclohm = new Pokemon("Cyclohm");
    	cyclohm.setTypes("Electric", "Dragon");
    	cyclohm.setAbility("Shield Dust");
    	cyclohm.setAllBaseStats(108, 60, 118, 112, 70, 80);
    	cyclohm.setWeight(59.0);
    	pokedex.put("Cyclohm", cyclohm);

    	Pokemon cyndaquil = new Pokemon("Cyndaquil");
    	cyndaquil.setTypes("Fire", "(none)");
    	cyndaquil.setAbility("Blaze");
    	cyndaquil.setAllBaseStats(39, 52, 43, 60, 50, 65);
    	cyndaquil.setWeight(7.9);
    	pokedex.put("Cyndaquil", cyndaquil);

    	Pokemon darkrai = new Pokemon("Darkrai");
    	darkrai.setTypes("Dark", "(none)");
    	darkrai.setAbility("Bad Dreams");
    	darkrai.setAllBaseStats(70, 90, 90, 135, 90, 125);
    	darkrai.setWeight(50.5);
    	pokedex.put("Darkrai", darkrai);

    	Pokemon darmanitan = new Pokemon("Darmanitan");
    	darmanitan.setTypes("Fire", "(none)");
    	darmanitan.setAbility("Sheer Force");
    	darmanitan.setAllBaseStats(105, 140, 55, 30, 55, 95);
    	darmanitan.setWeight(92.9);
    	darmanitan.setFormes("Darmanitan", "Darmanitan-Zen");
    	pokedex.put("Darmanitan", darmanitan);

    	Pokemon darmanitanzen = new Pokemon("Darmanitan-Zen");
    	darmanitanzen.setTypes("Fire", "Psychic");
    	darmanitanzen.setAbility("Zen Mode");
    	darmanitanzen.setAllBaseStats(105, 30, 105, 140, 105, 55);
    	darmanitanzen.setWeight(92.9);
    	pokedex.put("Darmanitan-Zen", darmanitanzen);

    	Pokemon dartrix = new Pokemon("Dartrix");
    	dartrix.setTypes("Grass", "Flying");
    	dartrix.setAbility("Overgrow");
    	dartrix.setAllBaseStats(78, 75, 75, 70, 70, 52);
    	dartrix.setWeight(16.0);
    	pokedex.put("Dartrix", dartrix);

    	Pokemon darumaka = new Pokemon("Darumaka");
    	darumaka.setTypes("Fire", "(none)");
    	darumaka.setAbility("Hustle");
    	darumaka.setAllBaseStats(70, 90, 45, 15, 45, 50);
    	darumaka.setWeight(37.5);
    	pokedex.put("Darumaka", darumaka);

    	Pokemon decidueye = new Pokemon("Decidueye");
    	decidueye.setTypes("Grass", "Ghost");
    	decidueye.setAbility("Overgrow");
    	decidueye.setAllBaseStats(78, 107, 75, 100, 100, 70);
    	decidueye.setWeight(36.6);
    	pokedex.put("Decidueye", decidueye);

    	Pokemon dedenne = new Pokemon("Dedenne");
    	dedenne.setTypes("Electric", "Fairy");
    	dedenne.setAbility("Cheek Pouch");
    	dedenne.setAllBaseStats(67, 58, 57, 81, 67, 101);
    	dedenne.setWeight(2.2);
    	pokedex.put("Dedenne", dedenne);

    	Pokemon deerling = new Pokemon("Deerling");
    	deerling.setTypes("Normal", "Grass");
    	deerling.setAbility("Chlorophyll");
    	deerling.setAllBaseStats(60, 60, 50, 40, 50, 75);
    	deerling.setWeight(19.5);
    	pokedex.put("Deerling", deerling);

    	Pokemon deino = new Pokemon("Deino");
    	deino.setTypes("Dark", "Dragon");
    	deino.setAbility("Hustle");
    	deino.setAllBaseStats(52, 65, 50, 45, 50, 38);
    	deino.setWeight(17.3);
    	pokedex.put("Deino", deino);

    	Pokemon delcatty = new Pokemon("Delcatty");
    	delcatty.setTypes("Normal", "(none)");
    	delcatty.setAbility("Cute Charm");
    	delcatty.setAllBaseStats(70, 65, 65, 55, 55, 90);
    	delcatty.setWeight(32.6);
    	pokedex.put("Delcatty", delcatty);

    	Pokemon delibird = new Pokemon("Delibird");
    	delibird.setTypes("Ice", "Flying");
    	delibird.setAbility("Vital Spirit");
    	delibird.setAllBaseStats(45, 55, 45, 65, 45, 75);
    	delibird.setWeight(16.0);
    	pokedex.put("Delibird", delibird);

    	Pokemon delphox = new Pokemon("Delphox");
    	delphox.setTypes("Fire", "Psychic");
    	delphox.setAbility("Blaze");
    	delphox.setAllBaseStats(75, 69, 72, 114, 100, 104);
    	delphox.setWeight(39.0);
    	pokedex.put("Delphox", delphox);

    	Pokemon deoxys = new Pokemon("Deoxys");
    	deoxys.setTypes("Psychic", "(none)");
    	deoxys.setAbility("Pressure");
    	deoxys.setAllBaseStats(50, 150, 50, 150, 50, 150);
    	deoxys.setWeight(60.8);
    	pokedex.put("Deoxys", deoxys);

    	Pokemon deoxysattack = new Pokemon("Deoxys-Attack");
    	deoxysattack.setTypes("Psychic", "(none)");
    	deoxysattack.setAbility("Pressure");
    	deoxysattack.setAllBaseStats(50, 180, 20, 180, 20, 150);
    	deoxysattack.setWeight(60.8);
    	pokedex.put("Deoxys-Attack", deoxysattack);

    	Pokemon deoxysdefense = new Pokemon("Deoxys-Defense");
    	deoxysdefense.setTypes("Psychic", "(none)");
    	deoxysdefense.setAbility("Pressure");
    	deoxysdefense.setAllBaseStats(50, 70, 160, 70, 160, 90);
    	deoxysdefense.setWeight(60.8);
    	pokedex.put("Deoxys-Defense", deoxysdefense);

    	Pokemon deoxysspeed = new Pokemon("Deoxys-Speed");
    	deoxysspeed.setTypes("Psychic", "(none)");
    	deoxysspeed.setAbility("Pressure");
    	deoxysspeed.setAllBaseStats(50, 95, 90, 95, 90, 180);
    	deoxysspeed.setWeight(60.8);
    	pokedex.put("Deoxys-Speed", deoxysspeed);

    	Pokemon dewgong = new Pokemon("Dewgong");
    	dewgong.setTypes("Water", "Ice");
    	dewgong.setAbility("Thick Fat");
    	dewgong.setAllBaseStats(90, 70, 80, 70, 95, 70);
    	dewgong.setWeight(120.0);
    	pokedex.put("Dewgong", dewgong);

    	Pokemon dewott = new Pokemon("Dewott");
    	dewott.setTypes("Water", "(none)");
    	dewott.setAbility("Torrent");
    	dewott.setAllBaseStats(75, 75, 60, 83, 60, 60);
    	dewott.setWeight(24.5);
    	pokedex.put("Dewott", dewott);

    	Pokemon dewpider = new Pokemon("Dewpider");
    	dewpider.setTypes("Water", "Bug");
    	dewpider.setAbility("Water Bubble");
    	dewpider.setAllBaseStats(38, 40, 52, 40, 72, 27);
    	dewpider.setWeight(4.0);
    	pokedex.put("Dewpider", dewpider);

    	Pokemon dhelmise = new Pokemon("Dhelmise");
    	dhelmise.setTypes("Ghost", "Grass");
    	dhelmise.setAbility("Steelworker");
    	dhelmise.setAllBaseStats(70, 131, 100, 86, 90, 40);
    	dhelmise.setWeight(210.0);
    	pokedex.put("Dhelmise", dhelmise);

    	Pokemon dialga = new Pokemon("Dialga");
    	dialga.setTypes("Steel", "Dragon");
    	dialga.setAbility("Pressure");
    	dialga.setAllBaseStats(100, 120, 120, 150, 100, 90);
    	dialga.setWeight(683.0);
    	pokedex.put("Dialga", dialga);

    	Pokemon diancie = new Pokemon("Diancie");
    	diancie.setTypes("Rock", "Fairy");
    	diancie.setAbility("Clear Body");
    	diancie.setAllBaseStats(50, 100, 150, 100, 150, 50);
    	diancie.setWeight(8.8);
    	diancie.setFormes("Diancie", "Diancie-Mega");
    	pokedex.put("Diancie", diancie);

    	Pokemon dianciemega = new Pokemon("Diancie-Mega");
    	dianciemega.setTypes("Rock", "Fairy");
    	dianciemega.setAbility("Magic Bounce");
    	dianciemega.setAllBaseStats(50, 160, 110, 160, 110, 110);
    	dianciemega.setWeight(27.8);
    	pokedex.put("Diancie-Mega", dianciemega);

    	Pokemon diggersby = new Pokemon("Diggersby");
    	diggersby.setTypes("Normal", "Ground");
    	diggersby.setAbility("Pickup");
    	diggersby.setAllBaseStats(85, 56, 77, 50, 77, 78);
    	diggersby.setWeight(42.4);
    	pokedex.put("Diggersby", diggersby);

    	Pokemon diglett = new Pokemon("Diglett");
    	diglett.setTypes("Ground", "(none)");
    	diglett.setAbility("Sand Veil");
    	diglett.setAllBaseStats(10, 55, 25, 35, 45, 95);
    	diglett.setWeight(0.8);
    	pokedex.put("Diglett", diglett);

    	Pokemon diglettalola = new Pokemon("Diglett-Alola");
    	diglettalola.setTypes("Ground", "Steel");
    	diglettalola.setAbility("Sand Veil");
    	diglettalola.setAllBaseStats(10, 55, 30, 35, 45, 90);
    	diglettalola.setWeight(1.0);
    	pokedex.put("Diglett-Alola", diglettalola);

    	Pokemon ditto = new Pokemon("Ditto");
    	ditto.setTypes("Normal", "(none)");
    	ditto.setAbility("Limber");
    	ditto.setAllBaseStats(48, 48, 48, 48, 48, 48);
    	ditto.setWeight(4.0);
    	pokedex.put("Ditto", ditto);

    	Pokemon dodrio = new Pokemon("Dodrio");
    	dodrio.setTypes("Normal", "Flying");
    	dodrio.setAbility("Run Away");
    	dodrio.setAllBaseStats(60, 110, 70, 60, 60, 110);
    	dodrio.setWeight(85.2);
    	pokedex.put("Dodrio", dodrio);

    	Pokemon doduo = new Pokemon("Doduo");
    	doduo.setTypes("Normal", "Flying");
    	doduo.setAbility("Run Away");
    	doduo.setAllBaseStats(35, 85, 45, 35, 35, 75);
    	doduo.setWeight(39.2);
    	pokedex.put("Doduo", doduo);

    	Pokemon donphan = new Pokemon("Donphan");
    	donphan.setTypes("Ground", "(none)");
    	donphan.setAbility("Sturdy");
    	donphan.setAllBaseStats(90, 120, 120, 60, 60, 50);
    	donphan.setWeight(120.0);
    	pokedex.put("Donphan", donphan);

    	Pokemon doublade = new Pokemon("Doublade");
    	doublade.setTypes("Steel", "Ghost");
    	doublade.setAbility("No Guard");
    	doublade.setAllBaseStats(59, 110, 150, 45, 49, 35);
    	doublade.setWeight(4.5);
    	pokedex.put("Doublade", doublade);

    	Pokemon dragalge = new Pokemon("Dragalge");
    	dragalge.setTypes("Poison", "Dragon");
    	dragalge.setAbility("Poison Point");
    	dragalge.setAllBaseStats(65, 75, 90, 97, 123, 44);
    	dragalge.setWeight(81.5);
    	pokedex.put("Dragalge", dragalge);

    	Pokemon dragonair = new Pokemon("Dragonair");
    	dragonair.setTypes("Dragon", "(none)");
    	dragonair.setAbility("Shed Skin");
    	dragonair.setAllBaseStats(61, 84, 65, 70, 70, 70);
    	dragonair.setWeight(16.5);
    	pokedex.put("Dragonair", dragonair);

    	Pokemon dragonite = new Pokemon("Dragonite");
    	dragonite.setTypes("Dragon", "Flying");
    	dragonite.setAbility("Inner Focus");
    	dragonite.setAllBaseStats(91, 134, 95, 100, 100, 80);
    	dragonite.setWeight(210.0);
    	pokedex.put("Dragonite", dragonite);

    	Pokemon drampa = new Pokemon("Drampa");
    	drampa.setTypes("Normal", "Dragon");
    	drampa.setAbility("Cloud Nine");
    	drampa.setAllBaseStats(78, 60, 85, 135, 91, 36);
    	drampa.setWeight(185.0);
    	pokedex.put("Drampa", drampa);

    	Pokemon drapion = new Pokemon("Drapion");
    	drapion.setTypes("Poison", "Dark");
    	drapion.setAbility("Battle Armor");
    	drapion.setAllBaseStats(70, 90, 110, 60, 75, 95);
    	drapion.setWeight(61.5);
    	pokedex.put("Drapion", drapion);

    	Pokemon dratini = new Pokemon("Dratini");
    	dratini.setTypes("Dragon", "(none)");
    	dratini.setAbility("Shed Skin");
    	dratini.setAllBaseStats(41, 64, 45, 50, 50, 50);
    	dratini.setWeight(3.3);
    	pokedex.put("Dratini", dratini);

    	Pokemon drifblim = new Pokemon("Drifblim");
    	drifblim.setTypes("Ghost", "Flying");
    	drifblim.setAbility("Unburden");
    	drifblim.setAllBaseStats(150, 80, 44, 90, 54, 80);
    	drifblim.setWeight(15.0);
    	pokedex.put("Drifblim", drifblim);

    	Pokemon drifloon = new Pokemon("Drifloon");
    	drifloon.setTypes("Ghost", "Flying");
    	drifloon.setAbility("Aftermath");
    	drifloon.setAllBaseStats(90, 50, 34, 60, 44, 70);
    	drifloon.setWeight(1.2);
    	pokedex.put("Drifloon", drifloon);

    	Pokemon drilbur = new Pokemon("Drilbur");
    	drilbur.setTypes("Ground", "(none)");
    	drilbur.setAbility("Sand Rush");
    	drilbur.setAllBaseStats(60, 85, 40, 30, 45, 68);
    	drilbur.setWeight(8.5);
    	pokedex.put("Drilbur", drilbur);

    	Pokemon drowzee = new Pokemon("Drowzee");
    	drowzee.setTypes("Psychic", "(none)");
    	drowzee.setAbility("Insomnia");
    	drowzee.setAllBaseStats(60, 48, 45, 43, 90, 42);
    	drowzee.setWeight(32.4);
    	pokedex.put("Drowzee", drowzee);

    	Pokemon druddigon = new Pokemon("Druddigon");
    	druddigon.setTypes("Dragon", "(none)");
    	druddigon.setAbility("Rough Skin");
    	druddigon.setAllBaseStats(77, 120, 90, 60, 90, 48);
    	druddigon.setWeight(139.0);
    	pokedex.put("Druddigon", druddigon);

    	Pokemon ducklett = new Pokemon("Ducklett");
    	ducklett.setTypes("Water", "Flying");
    	ducklett.setAbility("Keen Eye");
    	ducklett.setAllBaseStats(62, 44, 50, 44, 50, 55);
    	ducklett.setWeight(5.5);
    	pokedex.put("Ducklett", ducklett);

    	Pokemon dugtrio = new Pokemon("Dugtrio");
    	dugtrio.setTypes("Ground", "(none)");
    	dugtrio.setAbility("Sand Veil");
    	dugtrio.setAllBaseStats(35, 100, 50, 50, 70, 120);
    	dugtrio.setWeight(33.3);
    	pokedex.put("Dugtrio", dugtrio);

    	Pokemon dugtrioalola = new Pokemon("Dugtrio-Alola");
    	dugtrioalola.setTypes("Ground", "Steel");
    	dugtrioalola.setAbility("Sand Veil");
    	dugtrioalola.setAllBaseStats(35, 100, 60, 50, 70, 110);
    	dugtrioalola.setWeight(66.6);
    	pokedex.put("Dugtrio-Alola", dugtrioalola);

    	Pokemon dunsparce = new Pokemon("Dunsparce");
    	dunsparce.setTypes("Normal", "(none)");
    	dunsparce.setAbility("Serene Grace");
    	dunsparce.setAllBaseStats(100, 70, 70, 65, 65, 45);
    	dunsparce.setWeight(14.0);
    	pokedex.put("Dunsparce", dunsparce);

    	Pokemon duosion = new Pokemon("Duosion");
    	duosion.setTypes("Psychic", "(none)");
    	duosion.setAbility("Overcoat");
    	duosion.setAllBaseStats(65, 40, 50, 125, 60, 30);
    	duosion.setWeight(8.0);
    	pokedex.put("Duosion", duosion);

    	Pokemon durant = new Pokemon("Durant");
    	durant.setTypes("Bug", "Steel");
    	durant.setAbility("Swarm");
    	durant.setAllBaseStats(58, 109, 112, 48, 48, 109);
    	durant.setWeight(33.0);
    	pokedex.put("Durant", durant);

    	Pokemon dusclops = new Pokemon("Dusclops");
    	dusclops.setTypes("Ghost", "(none)");
    	dusclops.setAbility("Pressure");
    	dusclops.setAllBaseStats(40, 70, 130, 60, 130, 25);
    	dusclops.setWeight(30.6);
    	pokedex.put("Dusclops", dusclops);

    	Pokemon dusknoir = new Pokemon("Dusknoir");
    	dusknoir.setTypes("Ghost", "(none)");
    	dusknoir.setAbility("Pressure");
    	dusknoir.setAllBaseStats(45, 100, 135, 65, 135, 45);
    	dusknoir.setWeight(106.6);
    	pokedex.put("Dusknoir", dusknoir);

    	Pokemon duskull = new Pokemon("Duskull");
    	duskull.setTypes("Ghost", "(none)");
    	duskull.setAbility("Levitate");
    	duskull.setAllBaseStats(20, 40, 90, 30, 90, 25);
    	duskull.setWeight(15.0);
    	pokedex.put("Duskull", duskull);

    	Pokemon dustox = new Pokemon("Dustox");
    	dustox.setTypes("Bug", "Poison");
    	dustox.setAbility("Shield Dust");
    	dustox.setAllBaseStats(60, 50, 70, 50, 90, 65);
    	dustox.setWeight(31.6);
    	pokedex.put("Dustox", dustox);

    	Pokemon dwebble = new Pokemon("Dwebble");
    	dwebble.setTypes("Bug", "Rock");
    	dwebble.setAbility("Sturdy");
    	dwebble.setAllBaseStats(50, 65, 85, 35, 35, 55);
    	dwebble.setWeight(14.5);
    	pokedex.put("Dwebble", dwebble);

    	Pokemon eelektrik = new Pokemon("Eelektrik");
    	eelektrik.setTypes("Electric", "(none)");
    	eelektrik.setAbility("Levitate");
    	eelektrik.setAllBaseStats(65, 85, 70, 75, 70, 40);
    	eelektrik.setWeight(22.0);
    	pokedex.put("Eelektrik", eelektrik);

    	Pokemon eelektross = new Pokemon("Eelektross");
    	eelektross.setTypes("Electric", "(none)");
    	eelektross.setAbility("Levitate");
    	eelektross.setAllBaseStats(85, 115, 80, 105, 80, 50);
    	eelektross.setWeight(80.5);
    	pokedex.put("Eelektross", eelektross);

    	Pokemon eevee = new Pokemon("Eevee");
    	eevee.setTypes("Normal", "(none)");
    	eevee.setAbility("Adaptability");
    	eevee.setAllBaseStats(55, 55, 50, 45, 65, 55);
    	eevee.setWeight(6.5);
    	pokedex.put("Eevee", eevee);

    	Pokemon ekans = new Pokemon("Ekans");
    	ekans.setTypes("Poison", "(none)");
    	ekans.setAbility("Intimidate");
    	ekans.setAllBaseStats(35, 60, 44, 40, 54, 55);
    	ekans.setWeight(6.9);
    	pokedex.put("Ekans", ekans);

    	Pokemon electabuzz = new Pokemon("Electabuzz");
    	electabuzz.setTypes("Electric", "(none)");
    	electabuzz.setAbility("Static");
    	electabuzz.setAllBaseStats(65, 83, 57, 95, 85, 105);
    	electabuzz.setWeight(30.0);
    	pokedex.put("Electabuzz", electabuzz);

    	Pokemon electivire = new Pokemon("Electivire");
    	electivire.setTypes("Electric", "(none)");
    	electivire.setAbility("Motor Drive");
    	electivire.setAllBaseStats(75, 123, 67, 95, 85, 95);
    	electivire.setWeight(138.6);
    	pokedex.put("Electivire", electivire);

    	Pokemon electrike = new Pokemon("Electrike");
    	electrike.setTypes("Electric", "(none)");
    	electrike.setAbility("Static");
    	electrike.setAllBaseStats(40, 45, 40, 65, 40, 65);
    	electrike.setWeight(15.2);
    	pokedex.put("Electrike", electrike);

    	Pokemon electrode = new Pokemon("Electrode");
    	electrode.setTypes("Electric", "(none)");
    	electrode.setAbility("Soundproof");
    	electrode.setAllBaseStats(60, 50, 70, 80, 80, 150);
    	electrode.setWeight(66.6);
    	pokedex.put("Electrode", electrode);

    	Pokemon elekid = new Pokemon("Elekid");
    	elekid.setTypes("Electric", "(none)");
    	elekid.setAbility("Static");
    	elekid.setAllBaseStats(45, 63, 37, 65, 55, 95);
    	elekid.setWeight(23.5);
    	pokedex.put("Elekid", elekid);

    	Pokemon elgyem = new Pokemon("Elgyem");
    	elgyem.setTypes("Psychic", "(none)");
    	elgyem.setAbility("Telepathy");
    	elgyem.setAllBaseStats(55, 55, 55, 85, 55, 30);
    	elgyem.setWeight(9.0);
    	pokedex.put("Elgyem", elgyem);

    	Pokemon embirch = new Pokemon("Embirch");
    	embirch.setTypes("Fire", "Grass");
    	embirch.setAbility("Reckless");
    	embirch.setAllBaseStats(60, 40, 55, 65, 40, 60);
    	embirch.setWeight(15.0);
    	pokedex.put("Embirch", embirch);

    	Pokemon emboar = new Pokemon("Emboar");
    	emboar.setTypes("Fire", "Fighting");
    	emboar.setAbility("Blaze");
    	emboar.setAllBaseStats(110, 123, 65, 100, 65, 65);
    	emboar.setWeight(150.0);
    	pokedex.put("Emboar", emboar);

    	Pokemon emolga = new Pokemon("Emolga");
    	emolga.setTypes("Electric", "Flying");
    	emolga.setAbility("Static");
    	emolga.setAllBaseStats(55, 75, 60, 75, 60, 103);
    	emolga.setWeight(5.0);
    	pokedex.put("Emolga", emolga);

    	Pokemon empoleon = new Pokemon("Empoleon");
    	empoleon.setTypes("Water", "Steel");
    	empoleon.setAbility("Torrent");
    	empoleon.setAllBaseStats(84, 86, 88, 111, 101, 60);
    	empoleon.setWeight(84.5);
    	pokedex.put("Empoleon", empoleon);

    	Pokemon entei = new Pokemon("Entei");
    	entei.setTypes("Fire", "(none)");
    	entei.setAbility("Pressure");
    	entei.setAllBaseStats(115, 115, 85, 90, 75, 100);
    	entei.setWeight(198.0);
    	pokedex.put("Entei", entei);

    	Pokemon escavalier = new Pokemon("Escavalier");
    	escavalier.setTypes("Bug", "Steel");
    	escavalier.setAbility("Swarm");
    	escavalier.setAllBaseStats(70, 135, 105, 60, 105, 20);
    	escavalier.setWeight(33.0);
    	pokedex.put("Escavalier", escavalier);

    	Pokemon espeon = new Pokemon("Espeon");
    	espeon.setTypes("Psychic", "(none)");
    	espeon.setAbility("Magic Bounce");
    	espeon.setAllBaseStats(65, 65, 60, 130, 95, 110);
    	espeon.setWeight(26.5);
    	pokedex.put("Espeon", espeon);

    	Pokemon espurr = new Pokemon("Espurr");
    	espurr.setTypes("Psychic", "(none)");
    	espurr.setAbility("Keen Eye");
    	espurr.setAllBaseStats(62, 48, 54, 63, 60, 68);
    	espurr.setWeight(3.5);
    	pokedex.put("Espurr", espurr);

    	Pokemon excadrill = new Pokemon("Excadrill");
    	excadrill.setTypes("Ground", "Steel");
    	excadrill.setAbility("Mold Breaker");
    	excadrill.setAllBaseStats(110, 135, 60, 50, 65, 88);
    	excadrill.setWeight(40.4);
    	pokedex.put("Excadrill", excadrill);

    	Pokemon exeggcute = new Pokemon("Exeggcute");
    	exeggcute.setTypes("Grass", "Psychic");
    	exeggcute.setAbility("Chlorophyll");
    	exeggcute.setAllBaseStats(60, 40, 80, 60, 45, 40);
    	exeggcute.setWeight(2.5);
    	pokedex.put("Exeggcute", exeggcute);

    	Pokemon exeggutor = new Pokemon("Exeggutor");
    	exeggutor.setTypes("Grass", "Psychic");
    	exeggutor.setAbility("Chlorophyll");
    	exeggutor.setAllBaseStats(95, 95, 85, 125, 75, 55);
    	exeggutor.setWeight(120.0);
    	pokedex.put("Exeggutor", exeggutor);

    	Pokemon exeggutoralola = new Pokemon("Exeggutor-Alola");
    	exeggutoralola.setTypes("Grass", "Dragon");
    	exeggutoralola.setAbility("Frisk");
    	exeggutoralola.setAllBaseStats(95, 105, 85, 125, 75, 45);
    	exeggutoralola.setWeight(415.6);
    	pokedex.put("Exeggutor-Alola", exeggutoralola);

    	Pokemon exploud = new Pokemon("Exploud");
    	exploud.setTypes("Normal", "(none)");
    	exploud.setAbility("Soundproof");
    	exploud.setAllBaseStats(104, 91, 63, 91, 73, 68);
    	exploud.setWeight(84.0);
    	pokedex.put("Exploud", exploud);

    	Pokemon farfetchd = new Pokemon("Farfetch'd");
    	farfetchd.setTypes("Normal", "Flying");
    	farfetchd.setAbility("Keen Eye");
    	farfetchd.setAllBaseStats(52, 90, 55, 58, 62, 60);
    	farfetchd.setWeight(15.0);
    	pokedex.put("Farfetch'd", farfetchd);

    	Pokemon fearow = new Pokemon("Fearow");
    	fearow.setTypes("Normal", "Flying");
    	fearow.setAbility("Keen Eye");
    	fearow.setAllBaseStats(65, 90, 65, 61, 61, 100);
    	fearow.setWeight(38.0);
    	pokedex.put("Fearow", fearow);

    	Pokemon feebas = new Pokemon("Feebas");
    	feebas.setTypes("Water", "(none)");
    	feebas.setAbility("Swift Swim");
    	feebas.setAllBaseStats(20, 15, 20, 10, 55, 80);
    	feebas.setWeight(7.4);
    	pokedex.put("Feebas", feebas);

    	Pokemon fennekin = new Pokemon("Fennekin");
    	fennekin.setTypes("Fire", "(none)");
    	fennekin.setAbility("Blaze");
    	fennekin.setAllBaseStats(40, 45, 40, 62, 60, 60);
    	fennekin.setWeight(9.4);
    	pokedex.put("Fennekin", fennekin);

    	Pokemon feraligatr = new Pokemon("Feraligatr");
    	feraligatr.setTypes("Water", "(none)");
    	feraligatr.setAbility("Torrent");
    	feraligatr.setAllBaseStats(85, 105, 100, 79, 83, 78);
    	feraligatr.setWeight(88.8);
    	pokedex.put("Feraligatr", feraligatr);

    	Pokemon ferroseed = new Pokemon("Ferroseed");
    	ferroseed.setTypes("Grass", "Steel");
    	ferroseed.setAbility("Iron Barbs");
    	ferroseed.setAllBaseStats(44, 50, 91, 24, 86, 10);
    	ferroseed.setWeight(18.8);
    	pokedex.put("Ferroseed", ferroseed);

    	Pokemon ferrothorn = new Pokemon("Ferrothorn");
    	ferrothorn.setTypes("Grass", "Steel");
    	ferrothorn.setAbility("Iron Barbs");
    	ferrothorn.setAllBaseStats(74, 94, 131, 54, 116, 20);
    	ferrothorn.setWeight(110.0);
    	pokedex.put("Ferrothorn", ferrothorn);

    	Pokemon fidgit = new Pokemon("Fidgit");
    	fidgit.setTypes("Poison", "Ground");
    	fidgit.setAbility("Persistent");
    	fidgit.setAllBaseStats(95, 76, 109, 90, 80, 105);
    	fidgit.setWeight(53.0);
    	pokedex.put("Fidgit", fidgit);

    	Pokemon finneon = new Pokemon("Finneon");
    	finneon.setTypes("Water", "(none)");
    	finneon.setAbility("Swift Swim");
    	finneon.setAllBaseStats(49, 49, 56, 49, 61, 66);
    	finneon.setWeight(7.0);
    	pokedex.put("Finneon", finneon);

    	Pokemon flaaffy = new Pokemon("Flaaffy");
    	flaaffy.setTypes("Electric", "(none)");
    	flaaffy.setAbility("Static");
    	flaaffy.setAllBaseStats(70, 55, 55, 80, 60, 45);
    	flaaffy.setWeight(13.3);
    	pokedex.put("Flaaffy", flaaffy);

    	Pokemon flabebe = new Pokemon("FlabeÌ?beÌ?");
    	flabebe.setTypes("Fairy", "(none)");
    	flabebe.setAbility("Flower Veil");
    	flabebe.setAllBaseStats(44, 38, 39, 61, 79, 42);
    	flabebe.setWeight(0.1);
    	pokedex.put("FlabeÌ?beÌ?", flabebe);

    	Pokemon flarelm = new Pokemon("Flarelm");
    	flarelm.setTypes("Fire", "Grass");
    	flarelm.setAbility("Rock Head");
    	flarelm.setAllBaseStats(90, 50, 95, 75, 70, 40);
    	flarelm.setWeight(73.0);
    	pokedex.put("Flarelm", flarelm);

    	Pokemon flareon = new Pokemon("Flareon");
    	flareon.setTypes("Fire", "(none)");
    	flareon.setAbility("Flash Fire");
    	flareon.setAllBaseStats(65, 130, 60, 95, 110, 65);
    	flareon.setWeight(25.0);
    	pokedex.put("Flareon", flareon);

    	Pokemon fletchinder = new Pokemon("Fletchinder");
    	fletchinder.setTypes("Fire", "Flying");
    	fletchinder.setAbility("Flame Body");
    	fletchinder.setAllBaseStats(62, 73, 55, 56, 52, 84);
    	fletchinder.setWeight(16.0);
    	pokedex.put("Fletchinder", fletchinder);

    	Pokemon fletchling = new Pokemon("Fletchling");
    	fletchling.setTypes("Normal", "Flying");
    	fletchling.setAbility("Big Pecks");
    	fletchling.setAllBaseStats(45, 50, 43, 40, 38, 62);
    	fletchling.setWeight(1.7);
    	pokedex.put("Fletchling", fletchling);

    	Pokemon floatoy = new Pokemon("Floatoy");
    	floatoy.setTypes("Water", "(none)");
    	floatoy.setAbility("Water Veil");
    	floatoy.setAllBaseStats(48, 70, 40, 70, 30, 77);
    	floatoy.setWeight(1.9);
    	pokedex.put("Floatoy", floatoy);

    	Pokemon floatzel = new Pokemon("Floatzel");
    	floatzel.setTypes("Water", "(none)");
    	floatzel.setAbility("Swift Swim");
    	floatzel.setAllBaseStats(85, 105, 55, 85, 50, 115);
    	floatzel.setWeight(33.5);
    	pokedex.put("Floatzel", floatzel);

    	Pokemon floette = new Pokemon("Floette");
    	floette.setTypes("Fairy", "(none)");
    	floette.setAbility("Flower Veil");
    	floette.setAllBaseStats(54, 45, 47, 75, 98, 52);
    	floette.setWeight(0.9);
    	pokedex.put("Floette", floette);

    	Pokemon floetteeternal = new Pokemon("Floette-Eternal");
    	floetteeternal.setTypes("Fairy", "(none)");
    	floetteeternal.setAbility("Flower Veil");
    	floetteeternal.setAllBaseStats(74, 65, 67, 125, 128, 92);
    	floetteeternal.setWeight(0.9);
    	pokedex.put("Floette-Eternal", floetteeternal);

    	Pokemon florges = new Pokemon("Florges");
    	florges.setTypes("Fairy", "(none)");
    	florges.setAbility("Flower Veil");
    	florges.setAllBaseStats(78, 65, 68, 112, 154, 75);
    	florges.setWeight(10.0);
    	pokedex.put("Florges", florges);

    	Pokemon flygon = new Pokemon("Flygon");
    	flygon.setTypes("Ground", "Dragon");
    	flygon.setAbility("Levitate");
    	flygon.setAllBaseStats(80, 100, 80, 80, 80, 100);
    	flygon.setWeight(82.0);
    	pokedex.put("Flygon", flygon);

    	Pokemon fomantis = new Pokemon("Fomantis");
    	fomantis.setTypes("Grass", "(none)");
    	fomantis.setAbility("Leaf Guard");
    	fomantis.setAllBaseStats(40, 55, 35, 50, 35, 35);
    	fomantis.setWeight(1.5);
    	pokedex.put("Fomantis", fomantis);

    	Pokemon foongus = new Pokemon("Foongus");
    	foongus.setTypes("Grass", "Poison");
    	foongus.setAbility("Effect Spore");
    	foongus.setAllBaseStats(69, 55, 45, 55, 55, 15);
    	foongus.setWeight(1.0);
    	pokedex.put("Foongus", foongus);

    	Pokemon forretress = new Pokemon("Forretress");
    	forretress.setTypes("Bug", "Steel");
    	forretress.setAbility("Sturdy");
    	forretress.setAllBaseStats(75, 90, 140, 60, 60, 40);
    	forretress.setWeight(125.8);
    	pokedex.put("Forretress", forretress);

    	Pokemon fraxure = new Pokemon("Fraxure");
    	fraxure.setTypes("Dragon", "(none)");
    	fraxure.setAbility("Rivalry");
    	fraxure.setAllBaseStats(66, 117, 70, 40, 50, 67);
    	fraxure.setWeight(36.0);
    	pokedex.put("Fraxure", fraxure);

    	Pokemon frillish = new Pokemon("Frillish");
    	frillish.setTypes("Water", "Ghost");
    	frillish.setAbility("Water Absorb");
    	frillish.setAllBaseStats(55, 40, 50, 65, 85, 40);
    	frillish.setWeight(33.0);
    	pokedex.put("Frillish", frillish);

    	Pokemon froakie = new Pokemon("Froakie");
    	froakie.setTypes("Water", "(none)");
    	froakie.setAbility("Torrent");
    	froakie.setAllBaseStats(41, 56, 40, 62, 44, 71);
    	froakie.setWeight(7.0);
    	pokedex.put("Froakie", froakie);

    	Pokemon frogadier = new Pokemon("Frogadier");
    	frogadier.setTypes("Water", "(none)");
    	frogadier.setAbility("Torrent");
    	frogadier.setAllBaseStats(54, 63, 52, 83, 56, 97);
    	frogadier.setWeight(10.9);
    	pokedex.put("Frogadier", frogadier);

    	Pokemon froslass = new Pokemon("Froslass");
    	froslass.setTypes("Ice", "Ghost");
    	froslass.setAbility("Snow Cloak");
    	froslass.setAllBaseStats(70, 80, 70, 80, 70, 110);
    	froslass.setWeight(26.6);
    	pokedex.put("Froslass", froslass);

    	Pokemon furfrou = new Pokemon("Furfrou");
    	furfrou.setTypes("Normal", "(none)");
    	furfrou.setAbility("Fur Coat");
    	furfrou.setAllBaseStats(75, 80, 60, 65, 90, 102);
    	furfrou.setWeight(28.0);
    	pokedex.put("Furfrou", furfrou);

    	Pokemon furret = new Pokemon("Furret");
    	furret.setTypes("Normal", "(none)");
    	furret.setAbility("Run Away");
    	furret.setAllBaseStats(85, 76, 64, 45, 55, 90);
    	furret.setWeight(32.5);
    	pokedex.put("Furret", furret);

    	Pokemon gabite = new Pokemon("Gabite");
    	gabite.setTypes("Dragon", "Ground");
    	gabite.setAbility("Sand Veil");
    	gabite.setAllBaseStats(68, 90, 65, 50, 55, 82);
    	gabite.setWeight(56.0);
    	pokedex.put("Gabite", gabite);

    	Pokemon gallade = new Pokemon("Gallade");
    	gallade.setTypes("Psychic", "Fighting");
    	gallade.setAbility("Steadfast");
    	gallade.setAllBaseStats(68, 125, 65, 65, 115, 80);
    	gallade.setWeight(52.0);
    	gallade.setFormes("Gallade", "Gallade-Mega");
    	pokedex.put("Gallade", gallade);

    	Pokemon gallademega = new Pokemon("Gallade-Mega");
    	gallademega.setTypes("Psychic", "Fighting");
    	gallademega.setAbility("Inner Focus");
    	gallademega.setAllBaseStats(68, 165, 95, 65, 115, 110);
    	gallademega.setWeight(56.4);
    	pokedex.put("Gallade-Mega", gallademega);

    	Pokemon galvantula = new Pokemon("Galvantula");
    	galvantula.setTypes("Bug", "Electric");
    	galvantula.setAbility("Compound Eyes");
    	galvantula.setAllBaseStats(70, 77, 60, 97, 60, 108);
    	galvantula.setWeight(14.3);
    	pokedex.put("Galvantula", galvantula);

    	Pokemon garbodor = new Pokemon("Garbodor");
    	garbodor.setTypes("Poison", "(none)");
    	garbodor.setAbility("Stench");
    	garbodor.setAllBaseStats(80, 95, 82, 60, 82, 75);
    	garbodor.setWeight(107.3);
    	pokedex.put("Garbodor", garbodor);

    	Pokemon garchomp = new Pokemon("Garchomp");
    	garchomp.setTypes("Dragon", "Ground");
    	garchomp.setAbility("Rough Skin");
    	garchomp.setAllBaseStats(108, 130, 95, 80, 85, 102);
    	garchomp.setWeight(95.0);
    	garchomp.setFormes("Garchomp", "Garchomp-Mega");
    	pokedex.put("Garchomp", garchomp);

    	Pokemon garchompmega = new Pokemon("Garchomp-Mega");
    	garchompmega.setTypes("Dragon", "Ground");
    	garchompmega.setAbility("Sand Force");
    	garchompmega.setAllBaseStats(108, 170, 115, 120, 95, 92);
    	garchompmega.setWeight(95.0);
    	pokedex.put("Garchomp-Mega", garchompmega);

    	Pokemon gardevoir = new Pokemon("Gardevoir");
    	gardevoir.setTypes("Psychic", "Fairy");
    	gardevoir.setAbility("Trace");
    	gardevoir.setAllBaseStats(68, 65, 65, 125, 115, 80);
    	gardevoir.setWeight(48.4);
    	gardevoir.setFormes("Gardevoir", "Gardevoir-Mega");
    	pokedex.put("Gardevoir", gardevoir);

    	Pokemon gardevoirmega = new Pokemon("Gardevoir-Mega");
    	gardevoirmega.setTypes("Psychic", "Fairy");
    	gardevoirmega.setAbility("Pixilate");
    	gardevoirmega.setAllBaseStats(68, 85, 65, 165, 135, 100);
    	gardevoirmega.setWeight(48.4);
    	pokedex.put("Gardevoir-Mega", gardevoirmega);

    	Pokemon gastly = new Pokemon("Gastly");
    	gastly.setTypes("Ghost", "Poison");
    	gastly.setAbility("Levitate");
    	gastly.setAllBaseStats(30, 35, 30, 100, 35, 80);
    	gastly.setWeight(0.1);
    	pokedex.put("Gastly", gastly);

    	Pokemon gastrodon = new Pokemon("Gastrodon");
    	gastrodon.setTypes("Water", "Ground");
    	gastrodon.setAbility("Storm Drain");
    	gastrodon.setAllBaseStats(111, 83, 68, 92, 82, 39);
    	gastrodon.setWeight(29.9);
    	pokedex.put("Gastrodon", gastrodon);

    	Pokemon genesect = new Pokemon("Genesect");
    	genesect.setTypes("Bug", "Steel");
    	genesect.setAbility("Download");
    	genesect.setAllBaseStats(71, 120, 95, 120, 95, 99);
    	genesect.setWeight(82.5);
    	pokedex.put("Genesect", genesect);

    	Pokemon genesectburn = new Pokemon("Genesect-Burn");
    	genesectburn.setTypes("Bug", "Steel");
    	genesectburn.setAbility("Download");
    	genesectburn.setAllBaseStats(71, 120, 95, 120, 95, 99);
    	genesectburn.setWeight(82.5);
    	pokedex.put("Genesect-Burn", genesectburn);

    	Pokemon genesectchill = new Pokemon("Genesect-Chill");
    	genesectchill.setTypes("Bug", "Steel");
    	genesectchill.setAbility("Download");
    	genesectchill.setAllBaseStats(71, 120, 95, 120, 95, 99);
    	genesectchill.setWeight(82.5);
    	pokedex.put("Genesect-Chill", genesectchill);

    	Pokemon genesectdouse = new Pokemon("Genesect-Douse");
    	genesectdouse.setTypes("Bug", "Steel");
    	genesectdouse.setAbility("Download");
    	genesectdouse.setAllBaseStats(71, 120, 95, 120, 95, 99);
    	genesectdouse.setWeight(82.5);
    	pokedex.put("Genesect-Douse", genesectdouse);

    	Pokemon genesectshock = new Pokemon("Genesect-Shock");
    	genesectshock.setTypes("Bug", "Steel");
    	genesectshock.setAbility("Download");
    	genesectshock.setAllBaseStats(71, 120, 95, 120, 95, 99);
    	genesectshock.setWeight(82.5);
    	pokedex.put("Genesect-Shock", genesectshock);

    	Pokemon gengar = new Pokemon("Gengar");
    	gengar.setTypes("Ghost", "Poison");
    	gengar.setAbility("Cursed Body");
    	gengar.setAllBaseStats(60, 65, 60, 130, 75, 110);
    	gengar.setWeight(40.5);
    	gengar.setFormes("Gengar", "Gengar-Mega");
    	pokedex.put("Gengar", gengar);

    	Pokemon gengarmega = new Pokemon("Gengar-Mega");
    	gengarmega.setTypes("Ghost", "Poison");
    	gengarmega.setAbility("Shadow Tag");
    	gengarmega.setAllBaseStats(60, 65, 80, 170, 95, 130);
    	gengarmega.setWeight(40.5);
    	pokedex.put("Gengar-Mega", gengarmega);

    	Pokemon geodude = new Pokemon("Geodude");
    	geodude.setTypes("Rock", "Ground");
    	geodude.setAbility("Rock Head");
    	geodude.setAllBaseStats(40, 80, 100, 30, 30, 20);
    	geodude.setWeight(20.0);
    	pokedex.put("Geodude", geodude);

    	Pokemon geodudealola = new Pokemon("Geodude-Alola");
    	geodudealola.setTypes("Rock", "Electric");
    	geodudealola.setAbility("Magnet Pull");
    	geodudealola.setAllBaseStats(40, 80, 100, 30, 30, 20);
    	geodudealola.setWeight(20.3);
    	pokedex.put("Geodude-Alola", geodudealola);

    	Pokemon gible = new Pokemon("Gible");
    	gible.setTypes("Dragon", "Ground");
    	gible.setAbility("Sand Veil");
    	gible.setAllBaseStats(58, 70, 45, 40, 45, 42);
    	gible.setWeight(20.5);
    	pokedex.put("Gible", gible);

    	Pokemon gigalith = new Pokemon("Gigalith");
    	gigalith.setTypes("Rock", "(none)");
    	gigalith.setAbility("Sand Stream");
    	gigalith.setAllBaseStats(85, 135, 130, 60, 80, 25);
    	gigalith.setWeight(260.0);
    	pokedex.put("Gigalith", gigalith);

    	Pokemon girafarig = new Pokemon("Girafarig");
    	girafarig.setTypes("Normal", "Psychic");
    	girafarig.setAbility("Inner Focus");
    	girafarig.setAllBaseStats(70, 80, 65, 90, 65, 85);
    	girafarig.setWeight(41.5);
    	pokedex.put("Girafarig", girafarig);

    	Pokemon giratina = new Pokemon("Giratina");
    	giratina.setTypes("Ghost", "Dragon");
    	giratina.setAbility("Pressure");
    	giratina.setAllBaseStats(150, 100, 120, 100, 120, 90);
    	giratina.setWeight(750.0);
    	pokedex.put("Giratina", giratina);

    	Pokemon giratinaorigin = new Pokemon("Giratina-Origin");
    	giratinaorigin.setTypes("Ghost", "Dragon");
    	giratinaorigin.setAbility("Levitate");
    	giratinaorigin.setAllBaseStats(150, 120, 100, 120, 100, 90);
    	giratinaorigin.setWeight(650.0);
    	pokedex.put("Giratina-Origin", giratinaorigin);

    	Pokemon glaceon = new Pokemon("Glaceon");
    	glaceon.setTypes("Ice", "(none)");
    	glaceon.setAbility("Snow Cloak");
    	glaceon.setAllBaseStats(65, 60, 110, 130, 95, 65);
    	glaceon.setWeight(25.9);
    	pokedex.put("Glaceon", glaceon);

    	Pokemon glalie = new Pokemon("Glalie");
    	glalie.setTypes("Ice", "(none)");
    	glalie.setAbility("Inner Focus");
    	glalie.setAllBaseStats(80, 80, 80, 80, 80, 80);
    	glalie.setWeight(256.5);
    	glalie.setFormes("Glalie", "Glalie-Mega");
    	pokedex.put("Glalie", glalie);

    	Pokemon glaliemega = new Pokemon("Glalie-Mega");
    	glaliemega.setTypes("Ice", "(none)");
    	glaliemega.setAbility("Refrigerate");
    	glaliemega.setAllBaseStats(80, 120, 80, 120, 80, 100);
    	glaliemega.setWeight(350.2);
    	pokedex.put("Glalie-Mega", glaliemega);

    	Pokemon glameow = new Pokemon("Glameow");
    	glameow.setTypes("Normal", "(none)");
    	glameow.setAbility("Limber");
    	glameow.setAllBaseStats(49, 55, 42, 42, 37, 85);
    	glameow.setWeight(3.9);
    	pokedex.put("Glameow", glameow);

    	Pokemon gligar = new Pokemon("Gligar");
    	gligar.setTypes("Ground", "Flying");
    	gligar.setAbility("Hyper Cutter");
    	gligar.setAllBaseStats(65, 75, 105, 35, 65, 85);
    	gligar.setWeight(64.8);
    	pokedex.put("Gligar", gligar);

    	Pokemon gliscor = new Pokemon("Gliscor");
    	gliscor.setTypes("Ground", "Flying");
    	gliscor.setAbility("Hyper Cutter");
    	gliscor.setAllBaseStats(75, 95, 125, 45, 75, 95);
    	gliscor.setWeight(42.5);
    	pokedex.put("Gliscor", gliscor);

    	Pokemon gloom = new Pokemon("Gloom");
    	gloom.setTypes("Grass", "Poison");
    	gloom.setAbility("Chlorophyll");
    	gloom.setAllBaseStats(60, 65, 70, 85, 75, 40);
    	gloom.setWeight(8.6);
    	pokedex.put("Gloom", gloom);

    	Pokemon gogoat = new Pokemon("Gogoat");
    	gogoat.setTypes("Grass", "(none)");
    	gogoat.setAbility("Sap Sipper");
    	gogoat.setAllBaseStats(123, 100, 62, 97, 81, 68);
    	gogoat.setWeight(91.0);
    	pokedex.put("Gogoat", gogoat);

    	Pokemon golbat = new Pokemon("Golbat");
    	golbat.setTypes("Poison", "Flying");
    	golbat.setAbility("Inner Focus");
    	golbat.setAllBaseStats(75, 80, 70, 65, 75, 90);
    	golbat.setWeight(55.0);
    	pokedex.put("Golbat", golbat);

    	Pokemon goldeen = new Pokemon("Goldeen");
    	goldeen.setTypes("Water", "(none)");
    	goldeen.setAbility("Swift Swim");
    	goldeen.setAllBaseStats(45, 67, 60, 35, 50, 63);
    	goldeen.setWeight(15.0);
    	pokedex.put("Goldeen", goldeen);

    	Pokemon golduck = new Pokemon("Golduck");
    	golduck.setTypes("Water", "(none)");
    	golduck.setAbility("Damp");
    	golduck.setAllBaseStats(80, 82, 78, 95, 80, 85);
    	golduck.setWeight(76.6);
    	pokedex.put("Golduck", golduck);

    	Pokemon golem = new Pokemon("Golem");
    	golem.setTypes("Rock", "Ground");
    	golem.setAbility("Rock Head");
    	golem.setAllBaseStats(80, 120, 130, 55, 65, 45);
    	golem.setWeight(300.0);
    	pokedex.put("Golem", golem);

    	Pokemon golemalola = new Pokemon("Golem-Alola");
    	golemalola.setTypes("Rock", "Electric");
    	golemalola.setAbility("Galvanize");
    	golemalola.setAllBaseStats(80, 120, 130, 55, 65, 45);
    	golemalola.setWeight(316.0);
    	pokedex.put("Golem-Alola", golemalola);

    	Pokemon golett = new Pokemon("Golett");
    	golett.setTypes("Ground", "Ghost");
    	golett.setAbility("Iron Fist");
    	golett.setAllBaseStats(59, 74, 50, 35, 50, 35);
    	golett.setWeight(92.0);
    	pokedex.put("Golett", golett);

    	Pokemon golisopod = new Pokemon("Golisopod");
    	golisopod.setTypes("Bug", "Water");
    	golisopod.setAbility("Emergency Exit");
    	golisopod.setAllBaseStats(75, 125, 140, 60, 90, 40);
    	golisopod.setWeight(108.0);
    	pokedex.put("Golisopod", golisopod);

    	Pokemon golurk = new Pokemon("Golurk");
    	golurk.setTypes("Ground", "Ghost");
    	golurk.setAbility("Iron Fist");
    	golurk.setAllBaseStats(89, 124, 80, 55, 80, 55);
    	golurk.setWeight(330.0);
    	pokedex.put("Golurk", golurk);

    	Pokemon goodra = new Pokemon("Goodra");
    	goodra.setTypes("Dragon", "(none)");
    	goodra.setAbility("Sap Sipper");
    	goodra.setAllBaseStats(90, 100, 70, 110, 150, 80);
    	goodra.setWeight(150.5);
    	pokedex.put("Goodra", goodra);

    	Pokemon goomy = new Pokemon("Goomy");
    	goomy.setTypes("Dragon", "(none)");
    	goomy.setAbility("Sap Sipper");
    	goomy.setAllBaseStats(45, 50, 35, 55, 75, 40);
    	goomy.setWeight(2.8);
    	pokedex.put("Goomy", goomy);

    	Pokemon gorebyss = new Pokemon("Gorebyss");
    	gorebyss.setTypes("Water", "(none)");
    	gorebyss.setAbility("Swift Swim");
    	gorebyss.setAllBaseStats(55, 84, 105, 114, 75, 52);
    	gorebyss.setWeight(22.6);
    	pokedex.put("Gorebyss", gorebyss);

    	Pokemon gothita = new Pokemon("Gothita");
    	gothita.setTypes("Psychic", "(none)");
    	gothita.setAbility("Shadow Tag");
    	gothita.setAllBaseStats(45, 30, 50, 55, 65, 45);
    	gothita.setWeight(5.8);
    	pokedex.put("Gothita", gothita);

    	Pokemon gothitelle = new Pokemon("Gothitelle");
    	gothitelle.setTypes("Psychic", "(none)");
    	gothitelle.setAbility("Shadow Tag");
    	gothitelle.setAllBaseStats(70, 55, 95, 95, 110, 65);
    	gothitelle.setWeight(44.0);
    	pokedex.put("Gothitelle", gothitelle);

    	Pokemon gothorita = new Pokemon("Gothorita");
    	gothorita.setTypes("Psychic", "(none)");
    	gothorita.setAbility("Shadow Tag");
    	gothorita.setAllBaseStats(60, 45, 70, 75, 85, 55);
    	gothorita.setWeight(18.0);
    	pokedex.put("Gothorita", gothorita);

    	Pokemon gourgeist = new Pokemon("Gourgeist");
    	gourgeist.setTypes("Ghost", "Grass");
    	gourgeist.setAbility("Pickup");
    	gourgeist.setAllBaseStats(65, 90, 122, 58, 75, 84);
    	gourgeist.setWeight(12.5);
    	pokedex.put("Gourgeist", gourgeist);

    	Pokemon gourgeistlarge = new Pokemon("Gourgeist-Large");
    	gourgeistlarge.setTypes("Ghost", "Grass");
    	gourgeistlarge.setAbility("Pickup");
    	gourgeistlarge.setAllBaseStats(75, 95, 122, 58, 75, 69);
    	gourgeistlarge.setWeight(14.0);
    	pokedex.put("Gourgeist-Large", gourgeistlarge);

    	Pokemon gourgeistsmall = new Pokemon("Gourgeist-Small");
    	gourgeistsmall.setTypes("Ghost", "Grass");
    	gourgeistsmall.setAbility("Pickup");
    	gourgeistsmall.setAllBaseStats(55, 85, 122, 58, 75, 99);
    	gourgeistsmall.setWeight(9.5);
    	pokedex.put("Gourgeist-Small", gourgeistsmall);

    	Pokemon gourgeistsuper = new Pokemon("Gourgeist-Super");
    	gourgeistsuper.setTypes("Ghost", "Grass");
    	gourgeistsuper.setAbility("Pickup");
    	gourgeistsuper.setAllBaseStats(85, 100, 122, 58, 75, 54);
    	gourgeistsuper.setWeight(39.0);
    	pokedex.put("Gourgeist-Super", gourgeistsuper);

    	Pokemon granbull = new Pokemon("Granbull");
    	granbull.setTypes("Fairy", "(none)");
    	granbull.setAbility("Intimidate");
    	granbull.setAllBaseStats(90, 120, 75, 60, 60, 45);
    	granbull.setWeight(48.7);
    	pokedex.put("Granbull", granbull);

    	Pokemon graveler = new Pokemon("Graveler");
    	graveler.setTypes("Rock", "Ground");
    	graveler.setAbility("Rock Head");
    	graveler.setAllBaseStats(55, 95, 115, 45, 45, 35);
    	graveler.setWeight(105.0);
    	pokedex.put("Graveler", graveler);

    	Pokemon graveleralola = new Pokemon("Graveler-Alola");
    	graveleralola.setTypes("Rock", "Electric");
    	graveleralola.setAbility("Magnet Pull");
    	graveleralola.setAllBaseStats(55, 95, 115, 45, 45, 35);
    	graveleralola.setWeight(110.0);
    	pokedex.put("Graveler-Alola", graveleralola);

    	Pokemon greninja = new Pokemon("Greninja");
    	greninja.setTypes("Water", "Dark");
    	greninja.setAbility("Protean");
    	greninja.setAllBaseStats(72, 95, 67, 103, 71, 122);
    	greninja.setWeight(40.0);
    	greninja.setFormes("Greninja", "Greninja-Ash");
    	pokedex.put("Greninja", greninja);

    	Pokemon greninjaash = new Pokemon("Greninja-Ash");
    	greninjaash.setTypes("Water", "Dark");
    	greninjaash.setAbility("Battle Bond");
    	greninjaash.setAllBaseStats(72, 145, 67, 153, 71, 132);
    	greninjaash.setWeight(40.0);
    	pokedex.put("Greninja-Ash", greninjaash);

    	Pokemon grimer = new Pokemon("Grimer");
    	grimer.setTypes("Poison", "(none)");
    	grimer.setAbility("Stench");
    	grimer.setAllBaseStats(80, 80, 50, 40, 50, 25);
    	grimer.setWeight(30.0);
    	pokedex.put("Grimer", grimer);

    	Pokemon grimeralola = new Pokemon("Grimer-Alola");
    	grimeralola.setTypes("Poison", "Dark");
    	grimeralola.setAbility("Poison Touch");
    	grimeralola.setAllBaseStats(80, 80, 50, 40, 50, 25);
    	grimeralola.setWeight(42.0);
    	pokedex.put("Grimer-Alola", grimeralola);

    	Pokemon grotle = new Pokemon("Grotle");
    	grotle.setTypes("Grass", "(none)");
    	grotle.setAbility("Overgrow");
    	grotle.setAllBaseStats(75, 89, 85, 55, 65, 36);
    	grotle.setWeight(97.0);
    	pokedex.put("Grotle", grotle);

    	Pokemon groudon = new Pokemon("Groudon");
    	groudon.setTypes("Ground", "(none)");
    	groudon.setAbility("Drought");
    	groudon.setAllBaseStats(100, 150, 140, 100, 90, 90);
    	groudon.setWeight(950.0);
    	groudon.setFormes("Groudon", "Groudon-Primal");
    	pokedex.put("Groudon", groudon);

    	Pokemon groudonprimal = new Pokemon("Groudon-Primal");
    	groudonprimal.setTypes("Ground", "Fire");
    	groudonprimal.setAbility("Desolate Land");
    	groudonprimal.setAllBaseStats(100, 180, 160, 150, 90, 90);
    	groudonprimal.setWeight(999.7);
    	pokedex.put("Groudon-Primal", groudonprimal);

    	Pokemon grovyle = new Pokemon("Grovyle");
    	grovyle.setTypes("Grass", "(none)");
    	grovyle.setAbility("Overgrow");
    	grovyle.setAllBaseStats(50, 65, 45, 85, 65, 95);
    	grovyle.setWeight(21.6);
    	pokedex.put("Grovyle", grovyle);

    	Pokemon growlithe = new Pokemon("Growlithe");
    	growlithe.setTypes("Fire", "(none)");
    	growlithe.setAbility("Intimidate");
    	growlithe.setAllBaseStats(55, 70, 45, 70, 50, 60);
    	growlithe.setWeight(19.0);
    	pokedex.put("Growlithe", growlithe);

    	Pokemon grubbin = new Pokemon("Grubbin");
    	grubbin.setTypes("Bug", "(none)");
    	grubbin.setAbility("Swarm");
    	grubbin.setAllBaseStats(47, 62, 45, 55, 45, 46);
    	grubbin.setWeight(4.4);
    	pokedex.put("Grubbin", grubbin);

    	Pokemon grumpig = new Pokemon("Grumpig");
    	grumpig.setTypes("Psychic", "(none)");
    	grumpig.setAbility("Thick Fat");
    	grumpig.setAllBaseStats(80, 45, 65, 90, 110, 80);
    	grumpig.setWeight(71.5);
    	pokedex.put("Grumpig", grumpig);

    	Pokemon gulpin = new Pokemon("Gulpin");
    	gulpin.setTypes("Poison", "(none)");
    	gulpin.setAbility("Liquid Ooze");
    	gulpin.setAllBaseStats(70, 43, 53, 43, 53, 40);
    	gulpin.setWeight(10.3);
    	pokedex.put("Gulpin", gulpin);

    	Pokemon gumshoos = new Pokemon("Gumshoos");
    	gumshoos.setTypes("Normal", "(none)");
    	gumshoos.setAbility("Stakeout");
    	gumshoos.setAllBaseStats(88, 110, 60, 55, 60, 45);
    	gumshoos.setWeight(14.2);
    	pokedex.put("Gumshoos", gumshoos);

    	Pokemon gumshoostotem = new Pokemon("Gumshoos-Totem");
    	gumshoostotem.setTypes("Normal", "(none)");
    	gumshoostotem.setAbility("Adaptability");
    	gumshoostotem.setAllBaseStats(88, 110, 60, 55, 60, 45);
    	gumshoostotem.setWeight(60.0);
    	pokedex.put("Gumshoos-Totem", gumshoostotem);

    	Pokemon gurdurr = new Pokemon("Gurdurr");
    	gurdurr.setTypes("Fighting", "(none)");
    	gurdurr.setAbility("Guts");
    	gurdurr.setAllBaseStats(85, 105, 85, 40, 50, 40);
    	gurdurr.setWeight(40.0);
    	pokedex.put("Gurdurr", gurdurr);

    	Pokemon guzzlord = new Pokemon("Guzzlord");
    	guzzlord.setTypes("Dark", "Dragon");
    	guzzlord.setAbility("Beast Boost");
    	guzzlord.setAllBaseStats(223, 101, 53, 97, 53, 43);
    	guzzlord.setWeight(888.0);
    	pokedex.put("Guzzlord", guzzlord);

    	Pokemon gyarados = new Pokemon("Gyarados");
    	gyarados.setTypes("Water", "Flying");
    	gyarados.setAbility("Intimidate");
    	gyarados.setAllBaseStats(95, 125, 79, 60, 100, 81);
    	gyarados.setWeight(235.0);
    	gyarados.setFormes("Gyarados", "Gyarados-Mega");
    	pokedex.put("Gyarados", gyarados);

    	Pokemon gyaradosmega = new Pokemon("Gyarados-Mega");
    	gyaradosmega.setTypes("Water", "Dark");
    	gyaradosmega.setAbility("Mold Breaker");
    	gyaradosmega.setAllBaseStats(95, 155, 109, 70, 130, 81);
    	gyaradosmega.setWeight(305.0);
    	pokedex.put("Gyarados-Mega", gyaradosmega);

    	Pokemon hakamoo = new Pokemon("Hakamo-o");
    	hakamoo.setTypes("Dragon", "Fighting");
    	hakamoo.setAbility("Bulletproof");
    	hakamoo.setAllBaseStats(55, 75, 90, 65, 70, 65);
    	hakamoo.setWeight(47.0);
    	pokedex.put("Hakamo-o", hakamoo);

    	Pokemon happiny = new Pokemon("Happiny");
    	happiny.setTypes("Normal", "(none)");
    	happiny.setAbility("Natural Cure");
    	happiny.setAllBaseStats(100, 5, 5, 15, 65, 30);
    	happiny.setWeight(24.4);
    	pokedex.put("Happiny", happiny);

    	Pokemon hariyama = new Pokemon("Hariyama");
    	hariyama.setTypes("Fighting", "(none)");
    	hariyama.setAbility("Thick Fat");
    	hariyama.setAllBaseStats(144, 120, 60, 40, 60, 50);
    	hariyama.setWeight(253.8);
    	pokedex.put("Hariyama", hariyama);

    	Pokemon haunter = new Pokemon("Haunter");
    	haunter.setTypes("Ghost", "Poison");
    	haunter.setAbility("Levitate");
    	haunter.setAllBaseStats(45, 50, 45, 115, 55, 95);
    	haunter.setWeight(0.1);
    	pokedex.put("Haunter", haunter);

    	Pokemon hawlucha = new Pokemon("Hawlucha");
    	hawlucha.setTypes("Fighting", "Flying");
    	hawlucha.setAbility("Limber");
    	hawlucha.setAllBaseStats(78, 92, 75, 74, 63, 118);
    	hawlucha.setWeight(21.5);
    	pokedex.put("Hawlucha", hawlucha);

    	Pokemon haxorus = new Pokemon("Haxorus");
    	haxorus.setTypes("Dragon", "(none)");
    	haxorus.setAbility("Rivalry");
    	haxorus.setAllBaseStats(76, 147, 90, 60, 70, 97);
    	haxorus.setWeight(105.5);
    	pokedex.put("Haxorus", haxorus);

    	Pokemon heatmor = new Pokemon("Heatmor");
    	heatmor.setTypes("Fire", "(none)");
    	heatmor.setAbility("Gluttony");
    	heatmor.setAllBaseStats(85, 97, 66, 105, 66, 65);
    	heatmor.setWeight(58.0);
    	pokedex.put("Heatmor", heatmor);

    	Pokemon heatran = new Pokemon("Heatran");
    	heatran.setTypes("Fire", "Steel");
    	heatran.setAbility("Flash Fire");
    	heatran.setAllBaseStats(91, 90, 106, 130, 106, 77);
    	heatran.setWeight(430.0);
    	pokedex.put("Heatran", heatran);

    	Pokemon heliolisk = new Pokemon("Heliolisk");
    	heliolisk.setTypes("Electric", "Normal");
    	heliolisk.setAbility("Dry Skin");
    	heliolisk.setAllBaseStats(62, 55, 52, 109, 94, 109);
    	heliolisk.setWeight(21.0);
    	pokedex.put("Heliolisk", heliolisk);

    	Pokemon helioptile = new Pokemon("Helioptile");
    	helioptile.setTypes("Electric", "Normal");
    	helioptile.setAbility("Dry Skin");
    	helioptile.setAllBaseStats(44, 38, 33, 61, 43, 70);
    	helioptile.setWeight(6.0);
    	pokedex.put("Helioptile", helioptile);

    	Pokemon heracross = new Pokemon("Heracross");
    	heracross.setTypes("Bug", "Fighting");
    	heracross.setAbility("Swarm");
    	heracross.setAllBaseStats(80, 125, 75, 40, 95, 85);
    	heracross.setWeight(54.0);
    	heracross.setFormes("Heracross", "Heracross-Mega");
    	pokedex.put("Heracross", heracross);

    	Pokemon heracrossmega = new Pokemon("Heracross-Mega");
    	heracrossmega.setTypes("Bug", "Fighting");
    	heracrossmega.setAbility("Skill Link");
    	heracrossmega.setAllBaseStats(80, 185, 115, 40, 105, 75);
    	heracrossmega.setWeight(62.5);
    	pokedex.put("Heracross-Mega", heracrossmega);

    	Pokemon herdier = new Pokemon("Herdier");
    	herdier.setTypes("Normal", "(none)");
    	herdier.setAbility("Intimidate");
    	herdier.setAllBaseStats(65, 80, 65, 35, 65, 60);
    	herdier.setWeight(14.7);
    	pokedex.put("Herdier", herdier);

    	Pokemon hippopotas = new Pokemon("Hippopotas");
    	hippopotas.setTypes("Ground", "(none)");
    	hippopotas.setAbility("Sand Stream");
    	hippopotas.setAllBaseStats(68, 72, 78, 38, 42, 32);
    	hippopotas.setWeight(49.5);
    	pokedex.put("Hippopotas", hippopotas);

    	Pokemon hippowdon = new Pokemon("Hippowdon");
    	hippowdon.setTypes("Ground", "(none)");
    	hippowdon.setAbility("Sand Stream");
    	hippowdon.setAllBaseStats(108, 112, 118, 68, 72, 47);
    	hippowdon.setWeight(300.0);
    	pokedex.put("Hippowdon", hippowdon);

    	Pokemon hitmonchan = new Pokemon("Hitmonchan");
    	hitmonchan.setTypes("Fighting", "(none)");
    	hitmonchan.setAbility("Keen Eye");
    	hitmonchan.setAllBaseStats(50, 105, 79, 35, 110, 76);
    	hitmonchan.setWeight(50.2);
    	pokedex.put("Hitmonchan", hitmonchan);

    	Pokemon hitmonlee = new Pokemon("Hitmonlee");
    	hitmonlee.setTypes("Fighting", "(none)");
    	hitmonlee.setAbility("Limber");
    	hitmonlee.setAllBaseStats(50, 120, 53, 35, 110, 87);
    	hitmonlee.setWeight(49.8);
    	pokedex.put("Hitmonlee", hitmonlee);

    	Pokemon hitmontop = new Pokemon("Hitmontop");
    	hitmontop.setTypes("Fighting", "(none)");
    	hitmontop.setAbility("Intimidate");
    	hitmontop.setAllBaseStats(50, 95, 95, 35, 110, 70);
    	hitmontop.setWeight(48.0);
    	pokedex.put("Hitmontop", hitmontop);

    	Pokemon hooh = new Pokemon("Ho-Oh");
    	hooh.setTypes("Fire", "Flying");
    	hooh.setAbility("Pressure");
    	hooh.setAllBaseStats(106, 130, 90, 110, 154, 90);
    	hooh.setWeight(199.0);
    	pokedex.put("Ho-Oh", hooh);

    	Pokemon honchkrow = new Pokemon("Honchkrow");
    	honchkrow.setTypes("Dark", "Flying");
    	honchkrow.setAbility("Insomnia");
    	honchkrow.setAllBaseStats(100, 125, 52, 105, 52, 71);
    	honchkrow.setWeight(27.3);
    	pokedex.put("Honchkrow", honchkrow);

    	Pokemon honedge = new Pokemon("Honedge");
    	honedge.setTypes("Steel", "Ghost");
    	honedge.setAbility("No Guard");
    	honedge.setAllBaseStats(45, 80, 100, 35, 37, 28);
    	honedge.setWeight(2.0);
    	pokedex.put("Honedge", honedge);

    	Pokemon hoopa = new Pokemon("Hoopa");
    	hoopa.setTypes("Psychic", "Ghost");
    	hoopa.setAbility("Magician");
    	hoopa.setAllBaseStats(80, 110, 60, 150, 130, 70);
    	hoopa.setWeight(9.0);
    	pokedex.put("Hoopa", hoopa);

    	Pokemon hoopaunbound = new Pokemon("Hoopa-Unbound");
    	hoopaunbound.setTypes("Psychic", "Dark");
    	hoopaunbound.setAbility("Magician");
    	hoopaunbound.setAllBaseStats(80, 160, 60, 170, 130, 80);
    	hoopaunbound.setWeight(490.0);
    	pokedex.put("Hoopa-Unbound", hoopaunbound);

    	Pokemon hoothoot = new Pokemon("Hoothoot");
    	hoothoot.setTypes("Normal", "Flying");
    	hoothoot.setAbility("Insomnia");
    	hoothoot.setAllBaseStats(60, 30, 30, 36, 56, 50);
    	hoothoot.setWeight(21.2);
    	pokedex.put("Hoothoot", hoothoot);

    	Pokemon hoppip = new Pokemon("Hoppip");
    	hoppip.setTypes("Grass", "Flying");
    	hoppip.setAbility("Chlorophyll");
    	hoppip.setAllBaseStats(35, 35, 40, 35, 55, 50);
    	hoppip.setWeight(0.5);
    	pokedex.put("Hoppip", hoppip);

    	Pokemon horsea = new Pokemon("Horsea");
    	horsea.setTypes("Water", "(none)");
    	horsea.setAbility("Swift Swim");
    	horsea.setAllBaseStats(30, 40, 70, 70, 25, 60);
    	horsea.setWeight(8.0);
    	pokedex.put("Horsea", horsea);

    	Pokemon houndoom = new Pokemon("Houndoom");
    	houndoom.setTypes("Dark", "Fire");
    	houndoom.setAbility("Early Bird");
    	houndoom.setAllBaseStats(75, 90, 50, 110, 80, 95);
    	houndoom.setWeight(35.0);
    	houndoom.setFormes("Houndoom", "Houndoom-Mega");
    	pokedex.put("Houndoom", houndoom);

    	Pokemon houndoommega = new Pokemon("Houndoom-Mega");
    	houndoommega.setTypes("Dark", "Fire");
    	houndoommega.setAbility("Solar Power");
    	houndoommega.setAllBaseStats(75, 90, 90, 140, 90, 115);
    	houndoommega.setWeight(49.5);
    	pokedex.put("Houndoom-Mega", houndoommega);

    	Pokemon houndour = new Pokemon("Houndour");
    	houndour.setTypes("Dark", "Fire");
    	houndour.setAbility("Early Bird");
    	houndour.setAllBaseStats(45, 60, 30, 80, 50, 65);
    	houndour.setWeight(10.8);
    	pokedex.put("Houndour", houndour);

    	Pokemon huntail = new Pokemon("Huntail");
    	huntail.setTypes("Water", "(none)");
    	huntail.setAbility("Swift Swim");
    	huntail.setAllBaseStats(55, 104, 105, 94, 75, 52);
    	huntail.setWeight(27.0);
    	pokedex.put("Huntail", huntail);

    	Pokemon hydreigon = new Pokemon("Hydreigon");
    	hydreigon.setTypes("Dark", "Dragon");
    	hydreigon.setAbility("Levitate");
    	hydreigon.setAllBaseStats(92, 105, 90, 125, 90, 98);
    	hydreigon.setWeight(160.0);
    	pokedex.put("Hydreigon", hydreigon);

    	Pokemon hypno = new Pokemon("Hypno");
    	hypno.setTypes("Psychic", "(none)");
    	hypno.setAbility("Insomnia");
    	hypno.setAllBaseStats(85, 73, 70, 73, 115, 67);
    	hypno.setWeight(75.6);
    	pokedex.put("Hypno", hypno);

    	Pokemon igglybuff = new Pokemon("Igglybuff");
    	igglybuff.setTypes("Normal", "Fairy");
    	igglybuff.setAbility("Cute Charm");
    	igglybuff.setAllBaseStats(90, 30, 15, 40, 20, 15);
    	igglybuff.setWeight(1.0);
    	pokedex.put("Igglybuff", igglybuff);

    	Pokemon illumise = new Pokemon("Illumise");
    	illumise.setTypes("Bug", "(none)");
    	illumise.setAbility("Oblivious");
    	illumise.setAllBaseStats(65, 47, 75, 73, 85, 85);
    	illumise.setWeight(17.7);
    	pokedex.put("Illumise", illumise);

    	Pokemon incineroar = new Pokemon("Incineroar");
    	incineroar.setTypes("Fire", "Dark");
    	incineroar.setAbility("Intimidate");
    	incineroar.setAllBaseStats(95, 115, 90, 80, 90, 60);
    	incineroar.setWeight(83.0);
    	pokedex.put("Incineroar", incineroar);

    	Pokemon infernape = new Pokemon("Infernape");
    	infernape.setTypes("Fire", "Fighting");
    	infernape.setAbility("Blaze");
    	infernape.setAllBaseStats(76, 104, 71, 104, 71, 108);
    	infernape.setWeight(55.0);
    	pokedex.put("Infernape", infernape);

    	Pokemon inkay = new Pokemon("Inkay");
    	inkay.setTypes("Dark", "Psychic");
    	inkay.setAbility("Contrary");
    	inkay.setAllBaseStats(53, 54, 53, 37, 46, 45);
    	inkay.setWeight(3.5);
    	pokedex.put("Inkay", inkay);

    	Pokemon ivysaur = new Pokemon("Ivysaur");
    	ivysaur.setTypes("Grass", "Poison");
    	ivysaur.setAbility("Overgrow");
    	ivysaur.setAllBaseStats(60, 62, 63, 80, 80, 60);
    	ivysaur.setWeight(13.0);
    	pokedex.put("Ivysaur", ivysaur);

    	Pokemon jangmoo = new Pokemon("Jangmo-o");
    	jangmoo.setTypes("Dragon", "(none)");
    	jangmoo.setAbility("Bulletproof");
    	jangmoo.setAllBaseStats(45, 55, 65, 45, 45, 45);
    	jangmoo.setWeight(29.7);
    	pokedex.put("Jangmo-o", jangmoo);

    	Pokemon jellicent = new Pokemon("Jellicent");
    	jellicent.setTypes("Water", "Ghost");
    	jellicent.setAbility("Water Absorb");
    	jellicent.setAllBaseStats(100, 60, 70, 85, 105, 60);
    	jellicent.setWeight(135.0);
    	pokedex.put("Jellicent", jellicent);

    	Pokemon jigglypuff = new Pokemon("Jigglypuff");
    	jigglypuff.setTypes("Normal", "Fairy");
    	jigglypuff.setAbility("Cute Charm");
    	jigglypuff.setAllBaseStats(115, 45, 20, 45, 25, 20);
    	jigglypuff.setWeight(5.5);
    	pokedex.put("Jigglypuff", jigglypuff);

    	Pokemon jirachi = new Pokemon("Jirachi");
    	jirachi.setTypes("Steel", "Psychic");
    	jirachi.setAbility("Serene Grace");
    	jirachi.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	jirachi.setWeight(1.1);
    	pokedex.put("Jirachi", jirachi);

    	Pokemon jolteon = new Pokemon("Jolteon");
    	jolteon.setTypes("Electric", "(none)");
    	jolteon.setAbility("Volt Absorb");
    	jolteon.setAllBaseStats(65, 65, 60, 110, 95, 130);
    	jolteon.setWeight(24.5);
    	pokedex.put("Jolteon", jolteon);

    	Pokemon joltik = new Pokemon("Joltik");
    	joltik.setTypes("Bug", "Electric");
    	joltik.setAbility("Compound Eyes");
    	joltik.setAllBaseStats(50, 47, 50, 57, 50, 65);
    	joltik.setWeight(0.6);
    	pokedex.put("Joltik", joltik);

    	Pokemon jumpluff = new Pokemon("Jumpluff");
    	jumpluff.setTypes("Grass", "Flying");
    	jumpluff.setAbility("Chlorophyll");
    	jumpluff.setAllBaseStats(75, 55, 70, 55, 95, 110);
    	jumpluff.setWeight(3.0);
    	pokedex.put("Jumpluff", jumpluff);

    	Pokemon jynx = new Pokemon("Jynx");
    	jynx.setTypes("Ice", "Psychic");
    	jynx.setAbility("Dry Skin");
    	jynx.setAllBaseStats(65, 50, 35, 115, 95, 95);
    	jynx.setWeight(40.6);
    	pokedex.put("Jynx", jynx);

    	Pokemon kabuto = new Pokemon("Kabuto");
    	kabuto.setTypes("Rock", "Water");
    	kabuto.setAbility("Swift Swim");
    	kabuto.setAllBaseStats(30, 80, 90, 55, 45, 55);
    	kabuto.setWeight(11.5);
    	pokedex.put("Kabuto", kabuto);

    	Pokemon kabutops = new Pokemon("Kabutops");
    	kabutops.setTypes("Rock", "Water");
    	kabutops.setAbility("Swift Swim");
    	kabutops.setAllBaseStats(60, 115, 105, 65, 70, 80);
    	kabutops.setWeight(40.5);
    	pokedex.put("Kabutops", kabutops);

    	Pokemon kadabra = new Pokemon("Kadabra");
    	kadabra.setTypes("Psychic", "(none)");
    	kadabra.setAbility("Synchronize");
    	kadabra.setAllBaseStats(40, 35, 30, 120, 70, 105);
    	kadabra.setWeight(56.5);
    	pokedex.put("Kadabra", kadabra);

    	Pokemon kakuna = new Pokemon("Kakuna");
    	kakuna.setTypes("Bug", "Poison");
    	kakuna.setAbility("Shed Skin");
    	kakuna.setAllBaseStats(45, 25, 50, 25, 25, 35);
    	kakuna.setWeight(10.0);
    	pokedex.put("Kakuna", kakuna);

    	Pokemon kangaskhan = new Pokemon("Kangaskhan");
    	kangaskhan.setTypes("Normal", "(none)");
    	kangaskhan.setAbility("Scrappy");
    	kangaskhan.setAllBaseStats(105, 95, 80, 40, 80, 90);
    	kangaskhan.setWeight(80.0);
    	kangaskhan.setFormes("Kangaskhan", "Kangaskhan-Mega");
    	pokedex.put("Kangaskhan", kangaskhan);

    	Pokemon kangaskhanmega = new Pokemon("Kangaskhan-Mega");
    	kangaskhanmega.setTypes("Normal", "(none)");
    	kangaskhanmega.setAbility("Parental Bond");
    	kangaskhanmega.setAllBaseStats(105, 125, 100, 60, 100, 100);
    	kangaskhanmega.setWeight(100.0);
    	pokedex.put("Kangaskhan-Mega", kangaskhanmega);

    	Pokemon karrablast = new Pokemon("Karrablast");
    	karrablast.setTypes("Bug", "(none)");
    	karrablast.setAbility("Swarm");
    	karrablast.setAllBaseStats(50, 75, 45, 40, 45, 60);
    	karrablast.setWeight(5.9);
    	pokedex.put("Karrablast", karrablast);

    	Pokemon kartana = new Pokemon("Kartana");
    	kartana.setTypes("Grass", "Steel");
    	kartana.setAbility("Beast Boost");
    	kartana.setAllBaseStats(59, 181, 131, 59, 31, 109);
    	kartana.setWeight(0.1);
    	pokedex.put("Kartana", kartana);

    	Pokemon kecleon = new Pokemon("Kecleon");
    	kecleon.setTypes("Normal", "(none)");
    	kecleon.setAbility("Color Change");
    	kecleon.setAllBaseStats(60, 90, 70, 60, 120, 40);
    	kecleon.setWeight(22.0);
    	pokedex.put("Kecleon", kecleon);

    	Pokemon keldeo = new Pokemon("Keldeo");
    	keldeo.setTypes("Water", "Fighting");
    	keldeo.setAbility("Justified");
    	keldeo.setAllBaseStats(91, 72, 90, 129, 90, 108);
    	keldeo.setWeight(48.5);
    	pokedex.put("Keldeo", keldeo);

    	Pokemon keldeoresolute = new Pokemon("Keldeo-Resolute");
    	keldeoresolute.setTypes("Water", "Fighting");
    	keldeoresolute.setAbility("Justified");
    	keldeoresolute.setAllBaseStats(91, 72, 90, 129, 90, 108);
    	keldeoresolute.setWeight(48.5);
    	pokedex.put("Keldeo-Resolute", keldeoresolute);

    	Pokemon kerfluffle = new Pokemon("Kerfluffle");
    	kerfluffle.setTypes("Fairy", "Fighting");
    	kerfluffle.setAbility("Natural Cure");
    	kerfluffle.setAllBaseStats(84, 78, 86, 115, 88, 119);
    	kerfluffle.setWeight(24.2);
    	pokedex.put("Kerfluffle", kerfluffle);

    	Pokemon kingdra = new Pokemon("Kingdra");
    	kingdra.setTypes("Water", "Dragon");
    	kingdra.setAbility("Swift Swim");
    	kingdra.setAllBaseStats(75, 95, 95, 95, 95, 85);
    	kingdra.setWeight(152.0);
    	pokedex.put("Kingdra", kingdra);

    	Pokemon kingler = new Pokemon("Kingler");
    	kingler.setTypes("Water", "(none)");
    	kingler.setAbility("Hyper Cutter");
    	kingler.setAllBaseStats(55, 130, 115, 50, 50, 75);
    	kingler.setWeight(60.0);
    	pokedex.put("Kingler", kingler);

    	Pokemon kirlia = new Pokemon("Kirlia");
    	kirlia.setTypes("Psychic", "Fairy");
    	kirlia.setAbility("Synchronize");
    	kirlia.setAllBaseStats(38, 35, 35, 65, 55, 50);
    	kirlia.setWeight(20.2);
    	pokedex.put("Kirlia", kirlia);

    	Pokemon kitsunoh = new Pokemon("Kitsunoh");
    	kitsunoh.setTypes("Steel", "Ghost");
    	kitsunoh.setAbility("Frisk");
    	kitsunoh.setAllBaseStats(80, 103, 85, 55, 80, 110);
    	kitsunoh.setWeight(51.0);
    	pokedex.put("Kitsunoh", kitsunoh);

    	Pokemon klang = new Pokemon("Klang");
    	klang.setTypes("Steel", "(none)");
    	klang.setAbility("Plus");
    	klang.setAllBaseStats(60, 80, 95, 70, 85, 50);
    	klang.setWeight(51.0);
    	pokedex.put("Klang", klang);

    	Pokemon klefki = new Pokemon("Klefki");
    	klefki.setTypes("Steel", "Fairy");
    	klefki.setAbility("Prankster");
    	klefki.setAllBaseStats(57, 80, 91, 80, 87, 75);
    	klefki.setWeight(3.0);
    	pokedex.put("Klefki", klefki);

    	Pokemon klink = new Pokemon("Klink");
    	klink.setTypes("Steel", "(none)");
    	klink.setAbility("Plus");
    	klink.setAllBaseStats(40, 55, 70, 45, 60, 30);
    	klink.setWeight(21.0);
    	pokedex.put("Klink", klink);

    	Pokemon klinklang = new Pokemon("Klinklang");
    	klinklang.setTypes("Steel", "(none)");
    	klinklang.setAbility("Plus");
    	klinklang.setAllBaseStats(60, 100, 115, 70, 85, 90);
    	klinklang.setWeight(81.0);
    	pokedex.put("Klinklang", klinklang);

    	Pokemon koffing = new Pokemon("Koffing");
    	koffing.setTypes("Poison", "(none)");
    	koffing.setAbility("Levitate");
    	koffing.setAllBaseStats(40, 65, 95, 60, 45, 35);
    	koffing.setWeight(1.0);
    	pokedex.put("Koffing", koffing);

    	Pokemon komala = new Pokemon("Komala");
    	komala.setTypes("Normal", "(none)");
    	komala.setAbility("Comatose");
    	komala.setAllBaseStats(65, 115, 65, 75, 95, 65);
    	komala.setWeight(19.9);
    	pokedex.put("Komala", komala);

    	Pokemon kommoo = new Pokemon("Kommo-o");
    	kommoo.setTypes("Dragon", "Fighting");
    	kommoo.setAbility("Soundproof");
    	kommoo.setAllBaseStats(75, 110, 125, 100, 105, 85);
    	kommoo.setWeight(78.2);
    	pokedex.put("Kommo-o", kommoo);

    	Pokemon kommoototem = new Pokemon("Kommo-o-Totem");
    	kommoototem.setTypes("Dragon", "Fighting");
    	kommoototem.setAbility("Overcoat");
    	kommoototem.setAllBaseStats(75, 110, 125, 100, 105, 85);
    	kommoototem.setWeight(207.5);
    	pokedex.put("Kommo-o-Totem", kommoototem);

    	Pokemon krabby = new Pokemon("Krabby");
    	krabby.setTypes("Water", "(none)");
    	krabby.setAbility("Hyper Cutter");
    	krabby.setAllBaseStats(30, 105, 90, 25, 25, 50);
    	krabby.setWeight(6.5);
    	pokedex.put("Krabby", krabby);

    	Pokemon kricketot = new Pokemon("Kricketot");
    	kricketot.setTypes("Bug", "(none)");
    	kricketot.setAbility("Shed Skin");
    	kricketot.setAllBaseStats(37, 25, 41, 25, 41, 25);
    	kricketot.setWeight(2.2);
    	pokedex.put("Kricketot", kricketot);

    	Pokemon kricketune = new Pokemon("Kricketune");
    	kricketune.setTypes("Bug", "(none)");
    	kricketune.setAbility("Swarm");
    	kricketune.setAllBaseStats(77, 85, 51, 55, 51, 65);
    	kricketune.setWeight(25.5);
    	pokedex.put("Kricketune", kricketune);

    	Pokemon krilowatt = new Pokemon("Krilowatt");
    	krilowatt.setTypes("Electric", "Water");
    	krilowatt.setAbility("Trace");
    	krilowatt.setAllBaseStats(151, 84, 73, 83, 74, 105);
    	krilowatt.setWeight(10.6);
    	pokedex.put("Krilowatt", krilowatt);

    	Pokemon krokorok = new Pokemon("Krokorok");
    	krokorok.setTypes("Ground", "Dark");
    	krokorok.setAbility("Intimidate");
    	krokorok.setAllBaseStats(60, 82, 45, 45, 45, 74);
    	krokorok.setWeight(33.4);
    	pokedex.put("Krokorok", krokorok);

    	Pokemon krookodile = new Pokemon("Krookodile");
    	krookodile.setTypes("Ground", "Dark");
    	krookodile.setAbility("Intimidate");
    	krookodile.setAllBaseStats(95, 117, 80, 65, 70, 92);
    	krookodile.setWeight(96.3);
    	pokedex.put("Krookodile", krookodile);

    	Pokemon kyogre = new Pokemon("Kyogre");
    	kyogre.setTypes("Water", "(none)");
    	kyogre.setAbility("Drizzle");
    	kyogre.setAllBaseStats(100, 100, 90, 150, 140, 90);
    	kyogre.setWeight(352.0);
    	kyogre.setFormes("Kyogre", "Kyogre-Primal");
    	pokedex.put("Kyogre", kyogre);

    	Pokemon kyogreprimal = new Pokemon("Kyogre-Primal");
    	kyogreprimal.setTypes("Water", "(none)");
    	kyogreprimal.setAbility("Primordial Sea");
    	kyogreprimal.setAllBaseStats(100, 150, 90, 180, 160, 90);
    	kyogreprimal.setWeight(430.0);
    	pokedex.put("Kyogre-Primal", kyogreprimal);

    	Pokemon kyurem = new Pokemon("Kyurem");
    	kyurem.setTypes("Dragon", "Ice");
    	kyurem.setAbility("Pressure");
    	kyurem.setAllBaseStats(125, 130, 90, 130, 90, 95);
    	kyurem.setWeight(325.0);
    	pokedex.put("Kyurem", kyurem);

    	Pokemon kyuremblack = new Pokemon("Kyurem-Black");
    	kyuremblack.setTypes("Dragon", "Ice");
    	kyuremblack.setAbility("Teravolt");
    	kyuremblack.setAllBaseStats(125, 170, 100, 120, 90, 95);
    	kyuremblack.setWeight(325.0);
    	pokedex.put("Kyurem-Black", kyuremblack);

    	Pokemon kyuremwhite = new Pokemon("Kyurem-White");
    	kyuremwhite.setTypes("Dragon", "Ice");
    	kyuremwhite.setAbility("Turboblaze");
    	kyuremwhite.setAllBaseStats(125, 120, 90, 170, 100, 95);
    	kyuremwhite.setWeight(325.0);
    	pokedex.put("Kyurem-White", kyuremwhite);

    	Pokemon lairon = new Pokemon("Lairon");
    	lairon.setTypes("Steel", "Rock");
    	lairon.setAbility("Sturdy");
    	lairon.setAllBaseStats(60, 90, 140, 50, 50, 40);
    	lairon.setWeight(120.0);
    	pokedex.put("Lairon", lairon);

    	Pokemon lampent = new Pokemon("Lampent");
    	lampent.setTypes("Ghost", "Fire");
    	lampent.setAbility("Flash Fire");
    	lampent.setAllBaseStats(60, 40, 60, 95, 60, 55);
    	lampent.setWeight(13.0);
    	pokedex.put("Lampent", lampent);

    	Pokemon landorus = new Pokemon("Landorus");
    	landorus.setTypes("Ground", "Flying");
    	landorus.setAbility("Sand Force");
    	landorus.setAllBaseStats(89, 125, 90, 115, 80, 101);
    	landorus.setWeight(68.0);
    	pokedex.put("Landorus", landorus);

    	Pokemon landorustherian = new Pokemon("Landorus-Therian");
    	landorustherian.setTypes("Ground", "Flying");
    	landorustherian.setAbility("Intimidate");
    	landorustherian.setAllBaseStats(89, 145, 90, 105, 80, 91);
    	landorustherian.setWeight(68.0);
    	pokedex.put("Landorus-Therian", landorustherian);

    	Pokemon lanturn = new Pokemon("Lanturn");
    	lanturn.setTypes("Water", "Electric");
    	lanturn.setAbility("Volt Absorb");
    	lanturn.setAllBaseStats(125, 58, 58, 76, 76, 67);
    	lanturn.setWeight(22.5);
    	pokedex.put("Lanturn", lanturn);

    	Pokemon lapras = new Pokemon("Lapras");
    	lapras.setTypes("Water", "Ice");
    	lapras.setAbility("Water Absorb");
    	lapras.setAllBaseStats(130, 85, 80, 85, 95, 60);
    	lapras.setWeight(220.0);
    	pokedex.put("Lapras", lapras);

    	Pokemon larvesta = new Pokemon("Larvesta");
    	larvesta.setTypes("Bug", "Fire");
    	larvesta.setAbility("Flame Body");
    	larvesta.setAllBaseStats(55, 85, 55, 50, 55, 60);
    	larvesta.setWeight(28.8);
    	pokedex.put("Larvesta", larvesta);

    	Pokemon larvitar = new Pokemon("Larvitar");
    	larvitar.setTypes("Rock", "Ground");
    	larvitar.setAbility("Guts");
    	larvitar.setAllBaseStats(50, 64, 50, 45, 50, 41);
    	larvitar.setWeight(72.0);
    	pokedex.put("Larvitar", larvitar);

    	Pokemon latias = new Pokemon("Latias");
    	latias.setTypes("Dragon", "Psychic");
    	latias.setAbility("Levitate");
    	latias.setAllBaseStats(80, 80, 90, 110, 130, 110);
    	latias.setWeight(40.0);
    	latias.setFormes("Latias", "Latias-Mega");
    	pokedex.put("Latias", latias);

    	Pokemon latiasmega = new Pokemon("Latias-Mega");
    	latiasmega.setTypes("Dragon", "Psychic");
    	latiasmega.setAbility("Levitate");
    	latiasmega.setAllBaseStats(80, 100, 120, 140, 150, 110);
    	latiasmega.setWeight(52.0);
    	pokedex.put("Latias-Mega", latiasmega);

    	Pokemon latios = new Pokemon("Latios");
    	latios.setTypes("Dragon", "Psychic");
    	latios.setAbility("Levitate");
    	latios.setAllBaseStats(80, 90, 80, 130, 110, 110);
    	latios.setWeight(60.0);
    	latios.setFormes("Latios", "Latios-Mega");
    	pokedex.put("Latios", latios);

    	Pokemon latiosmega = new Pokemon("Latios-Mega");
    	latiosmega.setTypes("Dragon", "Psychic");
    	latiosmega.setAbility("Levitate");
    	latiosmega.setAllBaseStats(80, 130, 100, 160, 120, 110);
    	latiosmega.setWeight(70.0);
    	pokedex.put("Latios-Mega", latiosmega);

    	Pokemon leafeon = new Pokemon("Leafeon");
    	leafeon.setTypes("Grass", "(none)");
    	leafeon.setAbility("Leaf Guard");
    	leafeon.setAllBaseStats(65, 110, 130, 60, 65, 95);
    	leafeon.setWeight(25.5);
    	pokedex.put("Leafeon", leafeon);

    	Pokemon leavanny = new Pokemon("Leavanny");
    	leavanny.setTypes("Bug", "Grass");
    	leavanny.setAbility("Swarm");
    	leavanny.setAllBaseStats(75, 103, 80, 70, 80, 92);
    	leavanny.setWeight(20.5);
    	pokedex.put("Leavanny", leavanny);

    	Pokemon ledian = new Pokemon("Ledian");
    	ledian.setTypes("Bug", "Flying");
    	ledian.setAbility("Swarm");
    	ledian.setAllBaseStats(55, 35, 50, 55, 110, 85);
    	ledian.setWeight(35.6);
    	pokedex.put("Ledian", ledian);

    	Pokemon ledyba = new Pokemon("Ledyba");
    	ledyba.setTypes("Bug", "Flying");
    	ledyba.setAbility("Swarm");
    	ledyba.setAllBaseStats(40, 20, 30, 40, 80, 55);
    	ledyba.setWeight(10.8);
    	pokedex.put("Ledyba", ledyba);

    	Pokemon lickilicky = new Pokemon("Lickilicky");
    	lickilicky.setTypes("Normal", "(none)");
    	lickilicky.setAbility("Own Tempo");
    	lickilicky.setAllBaseStats(110, 85, 95, 80, 95, 50);
    	lickilicky.setWeight(140.0);
    	pokedex.put("Lickilicky", lickilicky);

    	Pokemon lickitung = new Pokemon("Lickitung");
    	lickitung.setTypes("Normal", "(none)");
    	lickitung.setAbility("Own Tempo");
    	lickitung.setAllBaseStats(90, 55, 75, 60, 75, 30);
    	lickitung.setWeight(65.5);
    	pokedex.put("Lickitung", lickitung);

    	Pokemon liepard = new Pokemon("Liepard");
    	liepard.setTypes("Dark", "(none)");
    	liepard.setAbility("Limber");
    	liepard.setAllBaseStats(64, 88, 50, 88, 50, 106);
    	liepard.setWeight(37.5);
    	pokedex.put("Liepard", liepard);

    	Pokemon lileep = new Pokemon("Lileep");
    	lileep.setTypes("Rock", "Grass");
    	lileep.setAbility("Suction Cups");
    	lileep.setAllBaseStats(66, 41, 77, 61, 87, 23);
    	lileep.setWeight(23.8);
    	pokedex.put("Lileep", lileep);

    	Pokemon lilligant = new Pokemon("Lilligant");
    	lilligant.setTypes("Grass", "(none)");
    	lilligant.setAbility("Chlorophyll");
    	lilligant.setAllBaseStats(70, 60, 75, 110, 75, 90);
    	lilligant.setWeight(16.3);
    	pokedex.put("Lilligant", lilligant);

    	Pokemon lillipup = new Pokemon("Lillipup");
    	lillipup.setTypes("Normal", "(none)");
    	lillipup.setAbility("Vital Spirit");
    	lillipup.setAllBaseStats(45, 60, 45, 25, 45, 55);
    	lillipup.setWeight(4.1);
    	pokedex.put("Lillipup", lillipup);

    	Pokemon linoone = new Pokemon("Linoone");
    	linoone.setTypes("Normal", "(none)");
    	linoone.setAbility("Pickup");
    	linoone.setAllBaseStats(78, 70, 61, 50, 61, 100);
    	linoone.setWeight(32.5);
    	pokedex.put("Linoone", linoone);

    	Pokemon litleo = new Pokemon("Litleo");
    	litleo.setTypes("Fire", "Normal");
    	litleo.setAbility("Rivalry");
    	litleo.setAllBaseStats(62, 50, 58, 73, 54, 72);
    	litleo.setWeight(13.5);
    	pokedex.put("Litleo", litleo);

    	Pokemon litten = new Pokemon("Litten");
    	litten.setTypes("Fire", "(none)");
    	litten.setAbility("Blaze");
    	litten.setAllBaseStats(45, 65, 40, 60, 40, 70);
    	litten.setWeight(4.3);
    	pokedex.put("Litten", litten);

    	Pokemon litwick = new Pokemon("Litwick");
    	litwick.setTypes("Ghost", "Fire");
    	litwick.setAbility("Flash Fire");
    	litwick.setAllBaseStats(50, 30, 55, 65, 55, 20);
    	litwick.setWeight(3.1);
    	pokedex.put("Litwick", litwick);

    	Pokemon lombre = new Pokemon("Lombre");
    	lombre.setTypes("Water", "Grass");
    	lombre.setAbility("Swift Swim");
    	lombre.setAllBaseStats(60, 50, 50, 60, 70, 50);
    	lombre.setWeight(32.5);
    	pokedex.put("Lombre", lombre);

    	Pokemon lopunny = new Pokemon("Lopunny");
    	lopunny.setTypes("Normal", "(none)");
    	lopunny.setAbility("Limber");
    	lopunny.setAllBaseStats(65, 76, 84, 54, 96, 105);
    	lopunny.setWeight(33.3);
    	lopunny.setFormes("Lopunny", "Lopunny-Mega");
    	pokedex.put("Lopunny", lopunny);

    	Pokemon lopunnymega = new Pokemon("Lopunny-Mega");
    	lopunnymega.setTypes("Normal", "Fighting");
    	lopunnymega.setAbility("Scrappy");
    	lopunnymega.setAllBaseStats(65, 136, 94, 54, 96, 135);
    	lopunnymega.setWeight(28.3);
    	pokedex.put("Lopunny-Mega", lopunnymega);

    	Pokemon lotad = new Pokemon("Lotad");
    	lotad.setTypes("Water", "Grass");
    	lotad.setAbility("Swift Swim");
    	lotad.setAllBaseStats(40, 30, 30, 40, 50, 30);
    	lotad.setWeight(2.6);
    	pokedex.put("Lotad", lotad);

    	Pokemon loudred = new Pokemon("Loudred");
    	loudred.setTypes("Normal", "(none)");
    	loudred.setAbility("Soundproof");
    	loudred.setAllBaseStats(84, 71, 43, 71, 43, 48);
    	loudred.setWeight(40.5);
    	pokedex.put("Loudred", loudred);

    	Pokemon lucario = new Pokemon("Lucario");
    	lucario.setTypes("Fighting", "Steel");
    	lucario.setAbility("Inner Focus");
    	lucario.setAllBaseStats(70, 110, 70, 115, 70, 90);
    	lucario.setWeight(54.0);
    	lucario.setFormes("Lucario", "Lucario-Mega");
    	pokedex.put("Lucario", lucario);

    	Pokemon lucariomega = new Pokemon("Lucario-Mega");
    	lucariomega.setTypes("Fighting", "Steel");
    	lucariomega.setAbility("Adaptability");
    	lucariomega.setAllBaseStats(70, 145, 88, 140, 70, 112);
    	lucariomega.setWeight(57.5);
    	pokedex.put("Lucario-Mega", lucariomega);

    	Pokemon ludicolo = new Pokemon("Ludicolo");
    	ludicolo.setTypes("Water", "Grass");
    	ludicolo.setAbility("Swift Swim");
    	ludicolo.setAllBaseStats(80, 70, 70, 90, 100, 70);
    	ludicolo.setWeight(55.0);
    	pokedex.put("Ludicolo", ludicolo);

    	Pokemon lugia = new Pokemon("Lugia");
    	lugia.setTypes("Psychic", "Flying");
    	lugia.setAbility("Multiscale");
    	lugia.setAllBaseStats(106, 90, 130, 90, 154, 110);
    	lugia.setWeight(216.0);
    	pokedex.put("Lugia", lugia);

    	Pokemon lumineon = new Pokemon("Lumineon");
    	lumineon.setTypes("Water", "(none)");
    	lumineon.setAbility("Swift Swim");
    	lumineon.setAllBaseStats(69, 69, 76, 69, 86, 91);
    	lumineon.setWeight(24.0);
    	pokedex.put("Lumineon", lumineon);

    	Pokemon lunala = new Pokemon("Lunala");
    	lunala.setTypes("Psychic", "Ghost");
    	lunala.setAbility("Shadow Shield");
    	lunala.setAllBaseStats(137, 113, 89, 137, 107, 97);
    	lunala.setWeight(120.0);
    	pokedex.put("Lunala", lunala);

    	Pokemon lunatone = new Pokemon("Lunatone");
    	lunatone.setTypes("Rock", "Psychic");
    	lunatone.setAbility("Levitate");
    	lunatone.setAllBaseStats(90, 55, 65, 95, 85, 70);
    	lunatone.setWeight(168.0);
    	pokedex.put("Lunatone", lunatone);

    	Pokemon lurantis = new Pokemon("Lurantis");
    	lurantis.setTypes("Grass", "(none)");
    	lurantis.setAbility("Contrary");
    	lurantis.setAllBaseStats(70, 105, 90, 80, 90, 45);
    	lurantis.setWeight(18.5);
    	pokedex.put("Lurantis", lurantis);

    	Pokemon lurantistotem = new Pokemon("Lurantis-Totem");
    	lurantistotem.setTypes("Grass", "(none)");
    	lurantistotem.setAbility("Leaf Guard");
    	lurantistotem.setAllBaseStats(70, 105, 90, 80, 90, 45);
    	lurantistotem.setWeight(58.0);
    	pokedex.put("Lurantis-Totem", lurantistotem);

    	Pokemon luvdisc = new Pokemon("Luvdisc");
    	luvdisc.setTypes("Water", "(none)");
    	luvdisc.setAbility("Swift Swim");
    	luvdisc.setAllBaseStats(43, 30, 55, 40, 65, 97);
    	luvdisc.setWeight(8.7);
    	pokedex.put("Luvdisc", luvdisc);

    	Pokemon luxio = new Pokemon("Luxio");
    	luxio.setTypes("Electric", "(none)");
    	luxio.setAbility("Rivalry");
    	luxio.setAllBaseStats(60, 85, 49, 60, 49, 60);
    	luxio.setWeight(30.5);
    	pokedex.put("Luxio", luxio);

    	Pokemon luxray = new Pokemon("Luxray");
    	luxray.setTypes("Electric", "(none)");
    	luxray.setAbility("Rivalry");
    	luxray.setAllBaseStats(80, 120, 79, 95, 79, 70);
    	luxray.setWeight(42.0);
    	pokedex.put("Luxray", luxray);

    	Pokemon lycanroc = new Pokemon("Lycanroc");
    	lycanroc.setTypes("Rock", "(none)");
    	lycanroc.setAbility("Keen Eye");
    	lycanroc.setAllBaseStats(75, 115, 65, 55, 65, 112);
    	lycanroc.setWeight(25.0);
    	pokedex.put("Lycanroc", lycanroc);

    	Pokemon lycanrocdusk = new Pokemon("Lycanroc-Dusk");
    	lycanrocdusk.setTypes("Rock", "(none)");
    	lycanrocdusk.setAbility("Tough Claws");
    	lycanrocdusk.setAllBaseStats(75, 117, 65, 55, 65, 110);
    	lycanrocdusk.setWeight(25.0);
    	pokedex.put("Lycanroc-Dusk", lycanrocdusk);

    	Pokemon lycanrocmidnight = new Pokemon("Lycanroc-Midnight");
    	lycanrocmidnight.setTypes("Rock", "(none)");
    	lycanrocmidnight.setAbility("Keen Eye");
    	lycanrocmidnight.setAllBaseStats(85, 115, 75, 55, 75, 82);
    	lycanrocmidnight.setWeight(25.0);
    	pokedex.put("Lycanroc-Midnight", lycanrocmidnight);

    	Pokemon machamp = new Pokemon("Machamp");
    	machamp.setTypes("Fighting", "(none)");
    	machamp.setAbility("Guts");
    	machamp.setAllBaseStats(90, 130, 80, 65, 85, 55);
    	machamp.setWeight(130.0);
    	pokedex.put("Machamp", machamp);

    	Pokemon machoke = new Pokemon("Machoke");
    	machoke.setTypes("Fighting", "(none)");
    	machoke.setAbility("Guts");
    	machoke.setAllBaseStats(80, 100, 70, 50, 60, 45);
    	machoke.setWeight(70.5);
    	pokedex.put("Machoke", machoke);

    	Pokemon machop = new Pokemon("Machop");
    	machop.setTypes("Fighting", "(none)");
    	machop.setAbility("Guts");
    	machop.setAllBaseStats(70, 80, 50, 35, 35, 35);
    	machop.setWeight(19.5);
    	pokedex.put("Machop", machop);

    	Pokemon magby = new Pokemon("Magby");
    	magby.setTypes("Fire", "(none)");
    	magby.setAbility("Flame Body");
    	magby.setAllBaseStats(45, 75, 37, 70, 55, 83);
    	magby.setWeight(21.4);
    	pokedex.put("Magby", magby);

    	Pokemon magcargo = new Pokemon("Magcargo");
    	magcargo.setTypes("Fire", "Rock");
    	magcargo.setAbility("Magma Armor");
    	magcargo.setAllBaseStats(60, 50, 120, 90, 80, 30);
    	magcargo.setWeight(55.0);
    	pokedex.put("Magcargo", magcargo);

    	Pokemon magearna = new Pokemon("Magearna");
    	magearna.setTypes("Steel", "Fairy");
    	magearna.setAbility("Soul-Heart");
    	magearna.setAllBaseStats(80, 95, 115, 130, 115, 65);
    	magearna.setWeight(80.5);
    	pokedex.put("Magearna", magearna);

    	Pokemon magearnaoriginal = new Pokemon("Magearna-Original");
    	magearnaoriginal.setTypes("Steel", "Fairy");
    	magearnaoriginal.setAbility("Soul-Heart");
    	magearnaoriginal.setAllBaseStats(80, 95, 115, 130, 115, 65);
    	magearnaoriginal.setWeight(80.5);
    	pokedex.put("Magearna-Original", magearnaoriginal);

    	Pokemon magikarp = new Pokemon("Magikarp");
    	magikarp.setTypes("Water", "(none)");
    	magikarp.setAbility("Swift Swim");
    	magikarp.setAllBaseStats(20, 10, 55, 15, 20, 80);
    	magikarp.setWeight(10.0);
    	pokedex.put("Magikarp", magikarp);

    	Pokemon magmar = new Pokemon("Magmar");
    	magmar.setTypes("Fire", "(none)");
    	magmar.setAbility("Flame Body");
    	magmar.setAllBaseStats(65, 95, 57, 100, 85, 93);
    	magmar.setWeight(44.5);
    	pokedex.put("Magmar", magmar);

    	Pokemon magmortar = new Pokemon("Magmortar");
    	magmortar.setTypes("Fire", "(none)");
    	magmortar.setAbility("Flame Body");
    	magmortar.setAllBaseStats(75, 95, 67, 125, 95, 83);
    	magmortar.setWeight(68.0);
    	pokedex.put("Magmortar", magmortar);

    	Pokemon magnemite = new Pokemon("Magnemite");
    	magnemite.setTypes("Electric", "Steel");
    	magnemite.setAbility("Magnet Pull");
    	magnemite.setAllBaseStats(25, 35, 70, 95, 55, 45);
    	magnemite.setWeight(6.0);
    	pokedex.put("Magnemite", magnemite);

    	Pokemon magneton = new Pokemon("Magneton");
    	magneton.setTypes("Electric", "Steel");
    	magneton.setAbility("Magnet Pull");
    	magneton.setAllBaseStats(50, 60, 95, 120, 70, 70);
    	magneton.setWeight(60.0);
    	pokedex.put("Magneton", magneton);

    	Pokemon magnezone = new Pokemon("Magnezone");
    	magnezone.setTypes("Electric", "Steel");
    	magnezone.setAbility("Magnet Pull");
    	magnezone.setAllBaseStats(70, 70, 115, 130, 90, 60);
    	magnezone.setWeight(180.0);
    	pokedex.put("Magnezone", magnezone);

    	Pokemon makuhita = new Pokemon("Makuhita");
    	makuhita.setTypes("Fighting", "(none)");
    	makuhita.setAbility("Thick Fat");
    	makuhita.setAllBaseStats(72, 60, 30, 20, 30, 25);
    	makuhita.setWeight(86.4);
    	pokedex.put("Makuhita", makuhita);

    	Pokemon malaconda = new Pokemon("Malaconda");
    	malaconda.setTypes("Dark", "Grass");
    	malaconda.setAbility("Harvest");
    	malaconda.setAllBaseStats(115, 100, 60, 40, 130, 55);
    	malaconda.setWeight(108.8);
    	pokedex.put("Malaconda", malaconda);

    	Pokemon malamar = new Pokemon("Malamar");
    	malamar.setTypes("Dark", "Psychic");
    	malamar.setAbility("Contrary");
    	malamar.setAllBaseStats(86, 92, 88, 68, 75, 73);
    	malamar.setWeight(47.0);
    	pokedex.put("Malamar", malamar);

    	Pokemon mamoswine = new Pokemon("Mamoswine");
    	mamoswine.setTypes("Ice", "Ground");
    	mamoswine.setAbility("Oblivious");
    	mamoswine.setAllBaseStats(110, 130, 80, 70, 60, 80);
    	mamoswine.setWeight(291.0);
    	pokedex.put("Mamoswine", mamoswine);

    	Pokemon manaphy = new Pokemon("Manaphy");
    	manaphy.setTypes("Water", "(none)");
    	manaphy.setAbility("Hydration");
    	manaphy.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	manaphy.setWeight(1.4);
    	pokedex.put("Manaphy", manaphy);

    	Pokemon mandibuzz = new Pokemon("Mandibuzz");
    	mandibuzz.setTypes("Dark", "Flying");
    	mandibuzz.setAbility("Overcoat");
    	mandibuzz.setAllBaseStats(110, 65, 105, 55, 95, 80);
    	mandibuzz.setWeight(39.5);
    	pokedex.put("Mandibuzz", mandibuzz);

    	Pokemon manectric = new Pokemon("Manectric");
    	manectric.setTypes("Electric", "(none)");
    	manectric.setAbility("Lightning Rod");
    	manectric.setAllBaseStats(70, 75, 60, 105, 60, 105);
    	manectric.setWeight(40.2);
    	manectric.setFormes("Manectric", "Manectric-Mega");
    	pokedex.put("Manectric", manectric);

    	Pokemon manectricmega = new Pokemon("Manectric-Mega");
    	manectricmega.setTypes("Electric", "(none)");
    	manectricmega.setAbility("Intimidate");
    	manectricmega.setAllBaseStats(70, 75, 80, 135, 80, 135);
    	manectricmega.setWeight(44.0);
    	pokedex.put("Manectric-Mega", manectricmega);

    	Pokemon mankey = new Pokemon("Mankey");
    	mankey.setTypes("Fighting", "(none)");
    	mankey.setAbility("Vital Spirit");
    	mankey.setAllBaseStats(40, 80, 35, 35, 45, 70);
    	mankey.setWeight(28.0);
    	pokedex.put("Mankey", mankey);

    	Pokemon mantine = new Pokemon("Mantine");
    	mantine.setTypes("Water", "Flying");
    	mantine.setAbility("Swift Swim");
    	mantine.setAllBaseStats(85, 40, 70, 80, 140, 70);
    	mantine.setWeight(220.0);
    	pokedex.put("Mantine", mantine);
    }
    public void initSecondHalf()
    {
    	Pokemon mantyke = new Pokemon("Mantyke");
    	mantyke.setTypes("Water", "Flying");
    	mantyke.setAbility("Swift Swim");
    	mantyke.setAllBaseStats(45, 20, 50, 60, 120, 50);
    	mantyke.setWeight(65.0);
    	pokedex.put("Mantyke", mantyke);

    	Pokemon maractus = new Pokemon("Maractus");
    	maractus.setTypes("Grass", "(none)");
    	maractus.setAbility("Water Absorb");
    	maractus.setAllBaseStats(75, 86, 67, 106, 67, 60);
    	maractus.setWeight(28.0);
    	pokedex.put("Maractus", maractus);

    	Pokemon mareanie = new Pokemon("Mareanie");
    	mareanie.setTypes("Poison", "Water");
    	mareanie.setAbility("Merciless");
    	mareanie.setAllBaseStats(50, 53, 62, 43, 52, 45);
    	mareanie.setWeight(8.0);
    	pokedex.put("Mareanie", mareanie);

    	Pokemon mareep = new Pokemon("Mareep");
    	mareep.setTypes("Electric", "(none)");
    	mareep.setAbility("Static");
    	mareep.setAllBaseStats(55, 40, 40, 65, 45, 35);
    	mareep.setWeight(7.8);
    	pokedex.put("Mareep", mareep);

    	Pokemon marill = new Pokemon("Marill");
    	marill.setTypes("Water", "Fairy");
    	marill.setAbility("Thick Fat");
    	marill.setAllBaseStats(70, 20, 50, 20, 50, 40);
    	marill.setWeight(8.5);
    	pokedex.put("Marill", marill);

    	Pokemon marowak = new Pokemon("Marowak");
    	marowak.setTypes("Ground", "(none)");
    	marowak.setAbility("Lightning Rod");
    	marowak.setAllBaseStats(60, 80, 110, 50, 80, 45);
    	marowak.setWeight(45.0);
    	pokedex.put("Marowak", marowak);

    	Pokemon marowakalola = new Pokemon("Marowak-Alola");
    	marowakalola.setTypes("Fire", "Ghost");
    	marowakalola.setAbility("Lightning Rod");
    	marowakalola.setAllBaseStats(60, 80, 110, 50, 80, 45);
    	marowakalola.setWeight(34.0);
    	pokedex.put("Marowak-Alola", marowakalola);

    	Pokemon marowakalolatotem = new Pokemon("Marowak-Alola-Totem");
    	marowakalolatotem.setTypes("Fire", "Ghost");
    	marowakalolatotem.setAbility("Rock Head");
    	marowakalolatotem.setAllBaseStats(60, 80, 110, 50, 80, 45);
    	marowakalolatotem.setWeight(98.0);
    	pokedex.put("Marowak-Alola-Totem", marowakalolatotem);

    	Pokemon marshadow = new Pokemon("Marshadow");
    	marshadow.setTypes("Fighting", "Ghost");
    	marshadow.setAbility("Technician");
    	marshadow.setAllBaseStats(90, 125, 80, 90, 90, 125);
    	marshadow.setWeight(22.2);
    	pokedex.put("Marshadow", marshadow);

    	Pokemon marshtomp = new Pokemon("Marshtomp");
    	marshtomp.setTypes("Water", "Ground");
    	marshtomp.setAbility("Torrent");
    	marshtomp.setAllBaseStats(70, 85, 70, 60, 70, 50);
    	marshtomp.setWeight(28.0);
    	pokedex.put("Marshtomp", marshtomp);

    	Pokemon masquerain = new Pokemon("Masquerain");
    	masquerain.setTypes("Bug", "Flying");
    	masquerain.setAbility("Intimidate");
    	masquerain.setAllBaseStats(70, 60, 62, 100, 82, 80);
    	masquerain.setWeight(3.6);
    	pokedex.put("Masquerain", masquerain);

    	Pokemon mawile = new Pokemon("Mawile");
    	mawile.setTypes("Steel", "Fairy");
    	mawile.setAbility("Intimidate");
    	mawile.setAllBaseStats(50, 85, 85, 55, 55, 50);
    	mawile.setWeight(11.5);
    	mawile.setFormes("Mawile", "Mawile-Mega");
    	pokedex.put("Mawile", mawile);

    	Pokemon mawilemega = new Pokemon("Mawile-Mega");
    	mawilemega.setTypes("Steel", "Fairy");
    	mawilemega.setAbility("Huge Power");
    	mawilemega.setAllBaseStats(50, 105, 125, 55, 95, 50);
    	mawilemega.setWeight(23.5);
    	pokedex.put("Mawile-Mega", mawilemega);

    	Pokemon medicham = new Pokemon("Medicham");
    	medicham.setTypes("Fighting", "Psychic");
    	medicham.setAbility("Pure Power");
    	medicham.setAllBaseStats(60, 60, 75, 60, 75, 80);
    	medicham.setWeight(31.5);
    	medicham.setFormes("Medicham", "Medicham-Mega");
    	pokedex.put("Medicham", medicham);

    	Pokemon medichammega = new Pokemon("Medicham-Mega");
    	medichammega.setTypes("Fighting", "Psychic");
    	medichammega.setAbility("Pure Power");
    	medichammega.setAllBaseStats(60, 100, 85, 80, 85, 100);
    	medichammega.setWeight(31.5);
    	pokedex.put("Medicham-Mega", medichammega);

    	Pokemon meditite = new Pokemon("Meditite");
    	meditite.setTypes("Fighting", "Psychic");
    	meditite.setAbility("Pure Power");
    	meditite.setAllBaseStats(30, 40, 55, 40, 55, 60);
    	meditite.setWeight(11.2);
    	pokedex.put("Meditite", meditite);

    	Pokemon meganium = new Pokemon("Meganium");
    	meganium.setTypes("Grass", "(none)");
    	meganium.setAbility("Overgrow");
    	meganium.setAllBaseStats(80, 82, 100, 83, 100, 80);
    	meganium.setWeight(100.5);
    	pokedex.put("Meganium", meganium);

    	Pokemon meloetta = new Pokemon("Meloetta");
    	meloetta.setTypes("Normal", "Psychic");
    	meloetta.setAbility("Serene Grace");
    	meloetta.setAllBaseStats(100, 77, 77, 128, 128, 90);
    	meloetta.setWeight(6.5);
    	meloetta.setFormes("Meloetta", "Meloetta-Pirouette");
    	pokedex.put("Meloetta", meloetta);

    	Pokemon meloettapirouette = new Pokemon("Meloetta-Pirouette");
    	meloettapirouette.setTypes("Normal", "Fighting");
    	meloettapirouette.setAbility("Serene Grace");
    	meloettapirouette.setAllBaseStats(100, 128, 90, 77, 77, 128);
    	meloettapirouette.setWeight(6.5);
    	pokedex.put("Meloetta-Pirouette", meloettapirouette);

    	Pokemon meowstic = new Pokemon("Meowstic");
    	meowstic.setTypes("Psychic", "(none)");
    	meowstic.setAbility("Keen Eye");
    	meowstic.setAllBaseStats(74, 48, 76, 83, 81, 104);
    	meowstic.setWeight(8.5);
    	pokedex.put("Meowstic", meowstic);

    	Pokemon meowsticf = new Pokemon("Meowstic-F");
    	meowsticf.setTypes("Psychic", "(none)");
    	meowsticf.setAbility("Keen Eye");
    	meowsticf.setAllBaseStats(74, 48, 76, 83, 81, 104);
    	meowsticf.setWeight(8.5);
    	pokedex.put("Meowstic-F", meowsticf);

    	Pokemon meowth = new Pokemon("Meowth");
    	meowth.setTypes("Normal", "(none)");
    	meowth.setAbility("Pickup");
    	meowth.setAllBaseStats(40, 45, 35, 40, 40, 90);
    	meowth.setWeight(4.2);
    	pokedex.put("Meowth", meowth);

    	Pokemon meowthalola = new Pokemon("Meowth-Alola");
    	meowthalola.setTypes("Dark", "(none)");
    	meowthalola.setAbility("Pickup");
    	meowthalola.setAllBaseStats(40, 35, 35, 50, 40, 90);
    	meowthalola.setWeight(4.2);
    	pokedex.put("Meowth-Alola", meowthalola);

    	Pokemon mesprit = new Pokemon("Mesprit");
    	mesprit.setTypes("Psychic", "(none)");
    	mesprit.setAbility("Levitate");
    	mesprit.setAllBaseStats(80, 105, 105, 105, 105, 80);
    	mesprit.setWeight(0.3);
    	pokedex.put("Mesprit", mesprit);

    	Pokemon metagross = new Pokemon("Metagross");
    	metagross.setTypes("Steel", "Psychic");
    	metagross.setAbility("Clear Body");
    	metagross.setAllBaseStats(80, 135, 130, 95, 90, 70);
    	metagross.setWeight(550.0);
    	metagross.setFormes("Metagross", "Metagross-Mega");
    	pokedex.put("Metagross", metagross);

    	Pokemon metagrossmega = new Pokemon("Metagross-Mega");
    	metagrossmega.setTypes("Steel", "Psychic");
    	metagrossmega.setAbility("Tough Claws");
    	metagrossmega.setAllBaseStats(80, 145, 150, 105, 110, 110);
    	metagrossmega.setWeight(942.9);
    	pokedex.put("Metagross-Mega", metagrossmega);

    	Pokemon metang = new Pokemon("Metang");
    	metang.setTypes("Steel", "Psychic");
    	metang.setAbility("Clear Body");
    	metang.setAllBaseStats(60, 75, 100, 55, 80, 50);
    	metang.setWeight(202.5);
    	pokedex.put("Metang", metang);

    	Pokemon metapod = new Pokemon("Metapod");
    	metapod.setTypes("Bug", "(none)");
    	metapod.setAbility("Shed Skin");
    	metapod.setAllBaseStats(50, 20, 55, 25, 25, 30);
    	metapod.setWeight(9.9);
    	pokedex.put("Metapod", metapod);

    	Pokemon mew = new Pokemon("Mew");
    	mew.setTypes("Psychic", "(none)");
    	mew.setAbility("Synchronize");
    	mew.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	mew.setWeight(4.0);
    	pokedex.put("Mew", mew);

    	Pokemon mewtwo = new Pokemon("Mewtwo");
    	mewtwo.setTypes("Psychic", "(none)");
    	mewtwo.setAbility("Pressure");
    	mewtwo.setAllBaseStats(106, 110, 90, 154, 90, 130);
    	mewtwo.setWeight(122.0);
    	mewtwo.setFormes("Mewtwo", "Mewtwo-Mega-X", "Mewtwo-Mega-Y");
    	pokedex.put("Mewtwo", mewtwo);

    	Pokemon mewtwomegax = new Pokemon("Mewtwo-Mega-X");
    	mewtwomegax.setTypes("Psychic", "Fighting");
    	mewtwomegax.setAbility("Steadfast");
    	mewtwomegax.setAllBaseStats(106, 190, 100, 154, 100, 130);
    	mewtwomegax.setWeight(127.0);
    	pokedex.put("Mewtwo-Mega-X", mewtwomegax);

    	Pokemon mewtwomegay = new Pokemon("Mewtwo-Mega-Y");
    	mewtwomegay.setTypes("Psychic", "(none)");
    	mewtwomegay.setAbility("Insomnia");
    	mewtwomegay.setAllBaseStats(106, 150, 70, 194, 120, 140);
    	mewtwomegay.setWeight(33.0);
    	pokedex.put("Mewtwo-Mega-Y", mewtwomegay);

    	Pokemon mienfoo = new Pokemon("Mienfoo");
    	mienfoo.setTypes("Fighting", "(none)");
    	mienfoo.setAbility("Inner Focus");
    	mienfoo.setAllBaseStats(45, 85, 50, 55, 50, 65);
    	mienfoo.setWeight(20.0);
    	pokedex.put("Mienfoo", mienfoo);

    	Pokemon mienshao = new Pokemon("Mienshao");
    	mienshao.setTypes("Fighting", "(none)");
    	mienshao.setAbility("Inner Focus");
    	mienshao.setAllBaseStats(65, 125, 60, 95, 60, 105);
    	mienshao.setWeight(35.5);
    	pokedex.put("Mienshao", mienshao);

    	Pokemon mightyena = new Pokemon("Mightyena");
    	mightyena.setTypes("Dark", "(none)");
    	mightyena.setAbility("Intimidate");
    	mightyena.setAllBaseStats(70, 90, 70, 60, 60, 70);
    	mightyena.setWeight(37.0);
    	pokedex.put("Mightyena", mightyena);

    	Pokemon milotic = new Pokemon("Milotic");
    	milotic.setTypes("Water", "(none)");
    	milotic.setAbility("Competitive");
    	milotic.setAllBaseStats(95, 60, 79, 100, 125, 81);
    	milotic.setWeight(162.0);
    	pokedex.put("Milotic", milotic);

    	Pokemon miltank = new Pokemon("Miltank");
    	miltank.setTypes("Normal", "(none)");
    	miltank.setAbility("Thick Fat");
    	miltank.setAllBaseStats(95, 80, 105, 40, 70, 100);
    	miltank.setWeight(75.5);
    	pokedex.put("Miltank", miltank);

    	Pokemon mimejr = new Pokemon("Mime Jr.");
    	mimejr.setTypes("Psychic", "Fairy");
    	mimejr.setAbility("Soundproof");
    	mimejr.setAllBaseStats(20, 25, 45, 70, 90, 60);
    	mimejr.setWeight(13.0);
    	pokedex.put("Mime Jr.", mimejr);

    	Pokemon mimikyu = new Pokemon("Mimikyu");
    	mimikyu.setTypes("Ghost", "Fairy");
    	mimikyu.setAbility("Disguise");
    	mimikyu.setAllBaseStats(55, 90, 80, 50, 105, 96);
    	mimikyu.setWeight(0.7);
    	pokedex.put("Mimikyu", mimikyu);

    	Pokemon mimikyubusted = new Pokemon("Mimikyu-Busted");
    	mimikyubusted.setTypes("Ghost", "Fairy");
    	mimikyubusted.setAbility("Disguise");
    	mimikyubusted.setAllBaseStats(55, 90, 80, 50, 105, 96);
    	mimikyubusted.setWeight(0.7);
    	pokedex.put("Mimikyu-Busted", mimikyubusted);

    	Pokemon mimikyubustedtotem = new Pokemon("Mimikyu-Busted-Totem");
    	mimikyubustedtotem.setTypes("Ghost", "Fairy");
    	mimikyubustedtotem.setAbility("Disguise");
    	mimikyubustedtotem.setAllBaseStats(55, 90, 80, 50, 105, 96);
    	mimikyubustedtotem.setWeight(2.8);
    	pokedex.put("Mimikyu-Busted-Totem", mimikyubustedtotem);

    	Pokemon mimikyutotem = new Pokemon("Mimikyu-Totem");
    	mimikyutotem.setTypes("Ghost", "Fairy");
    	mimikyutotem.setAbility("Disguise");
    	mimikyutotem.setAllBaseStats(55, 90, 80, 50, 105, 96);
    	mimikyutotem.setWeight(2.8);
    	pokedex.put("Mimikyu-Totem", mimikyutotem);

    	Pokemon minccino = new Pokemon("Minccino");
    	minccino.setTypes("Normal", "(none)");
    	minccino.setAbility("Cute Charm");
    	minccino.setAllBaseStats(55, 50, 40, 40, 40, 75);
    	minccino.setWeight(5.8);
    	pokedex.put("Minccino", minccino);

    	Pokemon minior = new Pokemon("Minior");
    	minior.setTypes("Rock", "Flying");
    	minior.setAbility("Shields Down");
    	minior.setAllBaseStats(60, 100, 60, 100, 60, 120);
    	minior.setWeight(0.3);
    	minior.setFormes("Minior", "Minior-Meteor");
    	pokedex.put("Minior", minior);

    	Pokemon miniormeteor = new Pokemon("Minior-Meteor");
    	miniormeteor.setTypes("Rock", "Flying");
    	miniormeteor.setAbility("Shields Down");
    	miniormeteor.setAllBaseStats(60, 60, 100, 60, 100, 60);
    	miniormeteor.setWeight(40.0);
    	pokedex.put("Minior-Meteor", miniormeteor);

    	Pokemon minun = new Pokemon("Minun");
    	minun.setTypes("Electric", "(none)");
    	minun.setAbility("Minus");
    	minun.setAllBaseStats(60, 40, 50, 75, 85, 95);
    	minun.setWeight(4.2);
    	pokedex.put("Minun", minun);

    	Pokemon misdreavus = new Pokemon("Misdreavus");
    	misdreavus.setTypes("Ghost", "(none)");
    	misdreavus.setAbility("Levitate");
    	misdreavus.setAllBaseStats(60, 60, 60, 85, 85, 85);
    	misdreavus.setWeight(1.0);
    	pokedex.put("Misdreavus", misdreavus);

    	Pokemon mismagius = new Pokemon("Mismagius");
    	mismagius.setTypes("Ghost", "(none)");
    	mismagius.setAbility("Levitate");
    	mismagius.setAllBaseStats(60, 60, 60, 105, 105, 105);
    	mismagius.setWeight(4.4);
    	pokedex.put("Mismagius", mismagius);

    	Pokemon missingno = new Pokemon("Missingno.");
    	missingno.setTypes("Bird", "Normal");
    	missingno.setAbility("");
    	missingno.setAllBaseStats(33, 136, 0, 6, 6, 29);
    	missingno.setWeight(1590.8);
    	pokedex.put("Missingno.", missingno);

    	Pokemon mollux = new Pokemon("Mollux");
    	mollux.setTypes("Fire", "Poison");
    	mollux.setAbility("Dry Skin");
    	mollux.setAllBaseStats(95, 45, 83, 131, 105, 76);
    	mollux.setWeight(41.0);
    	pokedex.put("Mollux", mollux);

    	Pokemon moltres = new Pokemon("Moltres");
    	moltres.setTypes("Fire", "Flying");
    	moltres.setAbility("Pressure");
    	moltres.setAllBaseStats(90, 100, 90, 125, 85, 90);
    	moltres.setWeight(60.0);
    	pokedex.put("Moltres", moltres);

    	Pokemon monferno = new Pokemon("Monferno");
    	monferno.setTypes("Fire", "Fighting");
    	monferno.setAbility("Blaze");
    	monferno.setAllBaseStats(64, 78, 52, 78, 52, 81);
    	monferno.setWeight(22.0);
    	pokedex.put("Monferno", monferno);

    	Pokemon morelull = new Pokemon("Morelull");
    	morelull.setTypes("Grass", "Fairy");
    	morelull.setAbility("Illuminate");
    	morelull.setAllBaseStats(40, 35, 55, 65, 75, 15);
    	morelull.setWeight(1.5);
    	pokedex.put("Morelull", morelull);

    	Pokemon mothim = new Pokemon("Mothim");
    	mothim.setTypes("Bug", "Flying");
    	mothim.setAbility("Swarm");
    	mothim.setAllBaseStats(70, 94, 50, 94, 50, 66);
    	mothim.setWeight(23.3);
    	pokedex.put("Mothim", mothim);

    	Pokemon mrmime = new Pokemon("Mr. Mime");
    	mrmime.setTypes("Psychic", "Fairy");
    	mrmime.setAbility("Soundproof");
    	mrmime.setAllBaseStats(40, 45, 65, 100, 120, 90);
    	mrmime.setWeight(54.5);
    	pokedex.put("Mr. Mime", mrmime);

    	Pokemon mudbray = new Pokemon("Mudbray");
    	mudbray.setTypes("Ground", "(none)");
    	mudbray.setAbility("Own Tempo");
    	mudbray.setAllBaseStats(70, 100, 70, 45, 55, 45);
    	mudbray.setWeight(110.0);
    	pokedex.put("Mudbray", mudbray);

    	Pokemon mudkip = new Pokemon("Mudkip");
    	mudkip.setTypes("Water", "(none)");
    	mudkip.setAbility("Torrent");
    	mudkip.setAllBaseStats(50, 70, 50, 50, 50, 40);
    	mudkip.setWeight(7.6);
    	pokedex.put("Mudkip", mudkip);

    	Pokemon mudsdale = new Pokemon("Mudsdale");
    	mudsdale.setTypes("Ground", "(none)");
    	mudsdale.setAbility("Stamina");
    	mudsdale.setAllBaseStats(100, 125, 100, 55, 85, 35);
    	mudsdale.setWeight(920.0);
    	pokedex.put("Mudsdale", mudsdale);

    	Pokemon muk = new Pokemon("Muk");
    	muk.setTypes("Poison", "(none)");
    	muk.setAbility("Stench");
    	muk.setAllBaseStats(105, 105, 75, 65, 100, 50);
    	muk.setWeight(30.0);
    	pokedex.put("Muk", muk);

    	Pokemon mukalola = new Pokemon("Muk-Alola");
    	mukalola.setTypes("Poison", "Dark");
    	mukalola.setAbility("Gluttony");
    	mukalola.setAllBaseStats(105, 105, 75, 65, 100, 50);
    	mukalola.setWeight(52.0);
    	pokedex.put("Muk-Alola", mukalola);

    	Pokemon munchlax = new Pokemon("Munchlax");
    	munchlax.setTypes("Normal", "(none)");
    	munchlax.setAbility("Pickup");
    	munchlax.setAllBaseStats(135, 85, 40, 40, 85, 5);
    	munchlax.setWeight(105.0);
    	pokedex.put("Munchlax", munchlax);

    	Pokemon munna = new Pokemon("Munna");
    	munna.setTypes("Psychic", "(none)");
    	munna.setAbility("Forewarn");
    	munna.setAllBaseStats(76, 25, 45, 67, 55, 24);
    	munna.setWeight(23.3);
    	pokedex.put("Munna", munna);

    	Pokemon murkrow = new Pokemon("Murkrow");
    	murkrow.setTypes("Dark", "Flying");
    	murkrow.setAbility("Prankster");
    	murkrow.setAllBaseStats(60, 85, 42, 85, 42, 91);
    	murkrow.setWeight(2.1);
    	pokedex.put("Murkrow", murkrow);

    	Pokemon musharna = new Pokemon("Musharna");
    	musharna.setTypes("Psychic", "(none)");
    	musharna.setAbility("Forewarn");
    	musharna.setAllBaseStats(116, 55, 85, 107, 95, 29);
    	musharna.setWeight(60.5);
    	pokedex.put("Musharna", musharna);

    	Pokemon naganadel = new Pokemon("Naganadel");
    	naganadel.setTypes("Poison", "Dragon");
    	naganadel.setAbility("Beast Boost");
    	naganadel.setAllBaseStats(73, 73, 73, 127, 73, 121);
    	naganadel.setWeight(150.0);
    	pokedex.put("Naganadel", naganadel);

    	Pokemon natu = new Pokemon("Natu");
    	natu.setTypes("Psychic", "Flying");
    	natu.setAbility("Synchronize");
    	natu.setAllBaseStats(40, 50, 45, 70, 45, 70);
    	natu.setWeight(2.0);
    	pokedex.put("Natu", natu);

    	Pokemon naviathan = new Pokemon("Naviathan");
    	naviathan.setTypes("Water", "Steel");
    	naviathan.setAbility("Guts");
    	naviathan.setAllBaseStats(103, 110, 90, 95, 65, 97);
    	naviathan.setWeight(510.0);
    	pokedex.put("Naviathan", naviathan);

    	Pokemon necrozma = new Pokemon("Necrozma");
    	necrozma.setTypes("Psychic", "(none)");
    	necrozma.setAbility("Prism Armor");
    	necrozma.setAllBaseStats(97, 107, 101, 127, 89, 79);
    	necrozma.setWeight(230.0);
    	pokedex.put("Necrozma", necrozma);

    	Pokemon necrozmadawnwings = new Pokemon("Necrozma-Dawn-Wings");
    	necrozmadawnwings.setTypes("Psychic", "Ghost");
    	necrozmadawnwings.setAbility("Prism Armor");
    	necrozmadawnwings.setAllBaseStats(97, 113, 109, 157, 127, 77);
    	necrozmadawnwings.setWeight(350.0);
    	necrozmadawnwings.setFormes("Necrozma-Dawn-Wings", "Necrozma-Ultra");
    	pokedex.put("Necrozma-Dawn-Wings", necrozmadawnwings);

    	Pokemon necrozmaduskmane = new Pokemon("Necrozma-Dusk-Mane");
    	necrozmaduskmane.setTypes("Psychic", "Steel");
    	necrozmaduskmane.setAbility("Prism Armor");
    	necrozmaduskmane.setAllBaseStats(97, 157, 127, 113, 109, 77);
    	necrozmaduskmane.setWeight(460.0);
    	necrozmaduskmane.setFormes("Necrozma-Dusk-Mane", "Necrozma-Ultra");
    	pokedex.put("Necrozma-Dusk-Mane", necrozmaduskmane);

    	Pokemon necrozmaultra = new Pokemon("Necrozma-Ultra");
    	necrozmaultra.setTypes("Psychic", "Dragon");
    	necrozmaultra.setAbility("Neuroforce");
    	necrozmaultra.setAllBaseStats(97, 167, 97, 167, 97, 129);
    	necrozmaultra.setWeight(230.0);
    	pokedex.put("Necrozma-Ultra", necrozmaultra);

    	Pokemon necturine = new Pokemon("Necturine");
    	necturine.setTypes("Grass", "Ghost");
    	necturine.setAbility("Anticipation");
    	necturine.setAllBaseStats(49, 55, 60, 50, 75, 51);
    	necturine.setWeight(1.8);
    	pokedex.put("Necturine", necturine);

    	Pokemon necturna = new Pokemon("Necturna");
    	necturna.setTypes("Grass", "Ghost");
    	necturna.setAbility("Forewarn");
    	necturna.setAllBaseStats(64, 120, 100, 85, 120, 81);
    	necturna.setWeight(49.6);
    	pokedex.put("Necturna", necturna);

    	Pokemon nidoking = new Pokemon("Nidoking");
    	nidoking.setTypes("Poison", "Ground");
    	nidoking.setAbility("Sheer Force");
    	nidoking.setAllBaseStats(81, 102, 77, 85, 75, 85);
    	nidoking.setWeight(62.0);
    	pokedex.put("Nidoking", nidoking);

    	Pokemon nidoqueen = new Pokemon("Nidoqueen");
    	nidoqueen.setTypes("Poison", "Ground");
    	nidoqueen.setAbility("Sheer Force");
    	nidoqueen.setAllBaseStats(90, 92, 87, 75, 85, 76);
    	nidoqueen.setWeight(60.0);
    	pokedex.put("Nidoqueen", nidoqueen);

    	Pokemon nidoranf = new Pokemon("Nidoran-F");
    	nidoranf.setTypes("Poison", "(none)");
    	nidoranf.setAbility("Poison Point");
    	nidoranf.setAllBaseStats(55, 47, 52, 40, 40, 41);
    	nidoranf.setWeight(7.0);
    	pokedex.put("Nidoran-F", nidoranf);

    	Pokemon nidoranm = new Pokemon("Nidoran-M");
    	nidoranm.setTypes("Poison", "(none)");
    	nidoranm.setAbility("Poison Point");
    	nidoranm.setAllBaseStats(46, 57, 40, 40, 40, 50);
    	nidoranm.setWeight(9.0);
    	pokedex.put("Nidoran-M", nidoranm);

    	Pokemon nidorina = new Pokemon("Nidorina");
    	nidorina.setTypes("Poison", "(none)");
    	nidorina.setAbility("Poison Point");
    	nidorina.setAllBaseStats(70, 62, 67, 55, 55, 56);
    	nidorina.setWeight(20.0);
    	pokedex.put("Nidorina", nidorina);

    	Pokemon nidorino = new Pokemon("Nidorino");
    	nidorino.setTypes("Poison", "(none)");
    	nidorino.setAbility("Poison Point");
    	nidorino.setAllBaseStats(61, 72, 57, 55, 55, 65);
    	nidorino.setWeight(19.5);
    	pokedex.put("Nidorino", nidorino);

    	Pokemon nihilego = new Pokemon("Nihilego");
    	nihilego.setTypes("Rock", "Poison");
    	nihilego.setAbility("Beast Boost");
    	nihilego.setAllBaseStats(109, 53, 47, 127, 131, 103);
    	nihilego.setWeight(55.5);
    	pokedex.put("Nihilego", nihilego);

    	Pokemon nincada = new Pokemon("Nincada");
    	nincada.setTypes("Bug", "Ground");
    	nincada.setAbility("Compound Eyes");
    	nincada.setAllBaseStats(31, 45, 90, 30, 30, 40);
    	nincada.setWeight(5.5);
    	pokedex.put("Nincada", nincada);

    	Pokemon ninetales = new Pokemon("Ninetales");
    	ninetales.setTypes("Fire", "(none)");
    	ninetales.setAbility("Drought");
    	ninetales.setAllBaseStats(73, 76, 75, 81, 100, 100);
    	ninetales.setWeight(19.9);
    	pokedex.put("Ninetales", ninetales);

    	Pokemon ninetalesalola = new Pokemon("Ninetales-Alola");
    	ninetalesalola.setTypes("Ice", "Fairy");
    	ninetalesalola.setAbility("Snow Warning");
    	ninetalesalola.setAllBaseStats(73, 67, 75, 81, 100, 109);
    	ninetalesalola.setWeight(19.9);
    	pokedex.put("Ninetales-Alola", ninetalesalola);

    	Pokemon ninjask = new Pokemon("Ninjask");
    	ninjask.setTypes("Bug", "Flying");
    	ninjask.setAbility("Speed Boost");
    	ninjask.setAllBaseStats(61, 90, 45, 50, 50, 160);
    	ninjask.setWeight(12.0);
    	pokedex.put("Ninjask", ninjask);

    	Pokemon noctowl = new Pokemon("Noctowl");
    	noctowl.setTypes("Normal", "Flying");
    	noctowl.setAbility("Insomnia");
    	noctowl.setAllBaseStats(100, 50, 50, 86, 96, 70);
    	noctowl.setWeight(40.8);
    	pokedex.put("Noctowl", noctowl);

    	Pokemon noibat = new Pokemon("Noibat");
    	noibat.setTypes("Flying", "Dragon");
    	noibat.setAbility("Frisk");
    	noibat.setAllBaseStats(40, 30, 35, 45, 40, 55);
    	noibat.setWeight(8.0);
    	pokedex.put("Noibat", noibat);

    	Pokemon noivern = new Pokemon("Noivern");
    	noivern.setTypes("Flying", "Dragon");
    	noivern.setAbility("Frisk");
    	noivern.setAllBaseStats(85, 70, 80, 97, 80, 123);
    	noivern.setWeight(85.0);
    	pokedex.put("Noivern", noivern);

    	Pokemon nosepass = new Pokemon("Nosepass");
    	nosepass.setTypes("Rock", "(none)");
    	nosepass.setAbility("Sturdy");
    	nosepass.setAllBaseStats(30, 45, 135, 45, 90, 30);
    	nosepass.setWeight(97.0);
    	pokedex.put("Nosepass", nosepass);

    	Pokemon numel = new Pokemon("Numel");
    	numel.setTypes("Fire", "Ground");
    	numel.setAbility("Oblivious");
    	numel.setAllBaseStats(60, 60, 40, 65, 45, 35);
    	numel.setWeight(24.0);
    	pokedex.put("Numel", numel);

    	Pokemon nuzleaf = new Pokemon("Nuzleaf");
    	nuzleaf.setTypes("Grass", "Dark");
    	nuzleaf.setAbility("Chlorophyll");
    	nuzleaf.setAllBaseStats(70, 70, 40, 60, 40, 60);
    	nuzleaf.setWeight(28.0);
    	pokedex.put("Nuzleaf", nuzleaf);

    	Pokemon octillery = new Pokemon("Octillery");
    	octillery.setTypes("Water", "(none)");
    	octillery.setAbility("Suction Cups");
    	octillery.setAllBaseStats(75, 105, 75, 105, 75, 45);
    	octillery.setWeight(28.5);
    	pokedex.put("Octillery", octillery);

    	Pokemon oddish = new Pokemon("Oddish");
    	oddish.setTypes("Grass", "Poison");
    	oddish.setAbility("Chlorophyll");
    	oddish.setAllBaseStats(45, 50, 55, 75, 65, 30);
    	oddish.setWeight(5.4);
    	pokedex.put("Oddish", oddish);

    	Pokemon omanyte = new Pokemon("Omanyte");
    	omanyte.setTypes("Rock", "Water");
    	omanyte.setAbility("Swift Swim");
    	omanyte.setAllBaseStats(35, 40, 100, 90, 55, 35);
    	omanyte.setWeight(7.5);
    	pokedex.put("Omanyte", omanyte);

    	Pokemon omastar = new Pokemon("Omastar");
    	omastar.setTypes("Rock", "Water");
    	omastar.setAbility("Swift Swim");
    	omastar.setAllBaseStats(70, 60, 125, 115, 70, 55);
    	omastar.setWeight(35.0);
    	pokedex.put("Omastar", omastar);

    	Pokemon onix = new Pokemon("Onix");
    	onix.setTypes("Rock", "Ground");
    	onix.setAbility("Rock Head");
    	onix.setAllBaseStats(35, 45, 160, 30, 45, 70);
    	onix.setWeight(210.0);
    	pokedex.put("Onix", onix);

    	Pokemon oranguru = new Pokemon("Oranguru");
    	oranguru.setTypes("Normal", "Psychic");
    	oranguru.setAbility("Inner Focus");
    	oranguru.setAllBaseStats(90, 60, 80, 90, 110, 60);
    	oranguru.setWeight(76.0);
    	pokedex.put("Oranguru", oranguru);

    	Pokemon oricorio = new Pokemon("Oricorio");
    	oricorio.setTypes("Fire", "Flying");
    	oricorio.setAbility("Dancer");
    	oricorio.setAllBaseStats(75, 70, 70, 98, 70, 93);
    	oricorio.setWeight(3.4);
    	pokedex.put("Oricorio", oricorio);

    	Pokemon oricoriopau = new Pokemon("Oricorio-Pa'u");
    	oricoriopau.setTypes("Psychic", "Flying");
    	oricoriopau.setAbility("Dancer");
    	oricoriopau.setAllBaseStats(75, 70, 70, 98, 70, 93);
    	oricoriopau.setWeight(3.4);
    	pokedex.put("Oricorio-Pa'u", oricoriopau);

    	Pokemon oricoriopompom = new Pokemon("Oricorio-Pom-Pom");
    	oricoriopompom.setTypes("Electric", "Flying");
    	oricoriopompom.setAbility("Dancer");
    	oricoriopompom.setAllBaseStats(75, 70, 70, 98, 70, 93);
    	oricoriopompom.setWeight(3.4);
    	pokedex.put("Oricorio-Pom-Pom", oricoriopompom);

    	Pokemon oricoriosensu = new Pokemon("Oricorio-Sensu");
    	oricoriosensu.setTypes("Ghost", "Flying");
    	oricoriosensu.setAbility("Dancer");
    	oricoriosensu.setAllBaseStats(75, 70, 70, 98, 70, 93);
    	oricoriosensu.setWeight(3.4);
    	pokedex.put("Oricorio-Sensu", oricoriosensu);

    	Pokemon oshawott = new Pokemon("Oshawott");
    	oshawott.setTypes("Water", "(none)");
    	oshawott.setAbility("Torrent");
    	oshawott.setAllBaseStats(55, 55, 45, 63, 45, 45);
    	oshawott.setWeight(5.9);
    	pokedex.put("Oshawott", oshawott);

    	Pokemon pachirisu = new Pokemon("Pachirisu");
    	pachirisu.setTypes("Electric", "(none)");
    	pachirisu.setAbility("Run Away");
    	pachirisu.setAllBaseStats(60, 45, 70, 45, 90, 95);
    	pachirisu.setWeight(3.9);
    	pokedex.put("Pachirisu", pachirisu);

    	Pokemon pajantom = new Pokemon("Pajantom");
    	pajantom.setTypes("Dragon", "Ghost");
    	pajantom.setAbility("Comatose");
    	pajantom.setAllBaseStats(84, 133, 71, 51, 111, 101);
    	pajantom.setWeight(3.1);
    	pokedex.put("Pajantom", pajantom);

    	Pokemon palkia = new Pokemon("Palkia");
    	palkia.setTypes("Water", "Dragon");
    	palkia.setAbility("Pressure");
    	palkia.setAllBaseStats(90, 120, 100, 150, 120, 100);
    	palkia.setWeight(336.0);
    	pokedex.put("Palkia", palkia);

    	Pokemon palossand = new Pokemon("Palossand");
    	palossand.setTypes("Ghost", "Ground");
    	palossand.setAbility("Water Compaction");
    	palossand.setAllBaseStats(85, 75, 110, 100, 75, 35);
    	palossand.setWeight(250.0);
    	pokedex.put("Palossand", palossand);

    	Pokemon palpitoad = new Pokemon("Palpitoad");
    	palpitoad.setTypes("Water", "Ground");
    	palpitoad.setAbility("Swift Swim");
    	palpitoad.setAllBaseStats(75, 65, 55, 65, 55, 69);
    	palpitoad.setWeight(17.0);
    	pokedex.put("Palpitoad", palpitoad);

    	Pokemon pancham = new Pokemon("Pancham");
    	pancham.setTypes("Fighting", "(none)");
    	pancham.setAbility("Iron Fist");
    	pancham.setAllBaseStats(67, 82, 62, 46, 48, 43);
    	pancham.setWeight(8.0);
    	pokedex.put("Pancham", pancham);

    	Pokemon pangoro = new Pokemon("Pangoro");
    	pangoro.setTypes("Fighting", "Dark");
    	pangoro.setAbility("Iron Fist");
    	pangoro.setAllBaseStats(95, 124, 78, 69, 71, 58);
    	pangoro.setWeight(136.0);
    	pokedex.put("Pangoro", pangoro);

    	Pokemon panpour = new Pokemon("Panpour");
    	panpour.setTypes("Water", "(none)");
    	panpour.setAbility("Gluttony");
    	panpour.setAllBaseStats(50, 53, 48, 53, 48, 64);
    	panpour.setWeight(13.5);
    	pokedex.put("Panpour", panpour);

    	Pokemon pansage = new Pokemon("Pansage");
    	pansage.setTypes("Grass", "(none)");
    	pansage.setAbility("Gluttony");
    	pansage.setAllBaseStats(50, 53, 48, 53, 48, 64);
    	pansage.setWeight(10.5);
    	pokedex.put("Pansage", pansage);

    	Pokemon pansear = new Pokemon("Pansear");
    	pansear.setTypes("Fire", "(none)");
    	pansear.setAbility("Gluttony");
    	pansear.setAllBaseStats(50, 53, 48, 53, 48, 64);
    	pansear.setWeight(11.0);
    	pokedex.put("Pansear", pansear);

    	Pokemon paras = new Pokemon("Paras");
    	paras.setTypes("Bug", "Grass");
    	paras.setAbility("Effect Spore");
    	paras.setAllBaseStats(35, 70, 55, 45, 55, 25);
    	paras.setWeight(5.4);
    	pokedex.put("Paras", paras);

    	Pokemon parasect = new Pokemon("Parasect");
    	parasect.setTypes("Bug", "Grass");
    	parasect.setAbility("Effect Spore");
    	parasect.setAllBaseStats(60, 95, 80, 60, 80, 30);
    	parasect.setWeight(29.5);
    	pokedex.put("Parasect", parasect);

    	Pokemon passimian = new Pokemon("Passimian");
    	passimian.setTypes("Fighting", "(none)");
    	passimian.setAbility("Defiant");
    	passimian.setAllBaseStats(100, 120, 90, 40, 60, 80);
    	passimian.setWeight(82.8);
    	pokedex.put("Passimian", passimian);

    	Pokemon patrat = new Pokemon("Patrat");
    	patrat.setTypes("Normal", "(none)");
    	patrat.setAbility("Run Away");
    	patrat.setAllBaseStats(45, 55, 39, 35, 39, 42);
    	patrat.setWeight(11.6);
    	pokedex.put("Patrat", patrat);

    	Pokemon pawniard = new Pokemon("Pawniard");
    	pawniard.setTypes("Dark", "Steel");
    	pawniard.setAbility("Defiant");
    	pawniard.setAllBaseStats(45, 85, 70, 40, 40, 60);
    	pawniard.setWeight(10.2);
    	pokedex.put("Pawniard", pawniard);

    	Pokemon pelipper = new Pokemon("Pelipper");
    	pelipper.setTypes("Water", "Flying");
    	pelipper.setAbility("Drizzle");
    	pelipper.setAllBaseStats(60, 50, 100, 95, 70, 65);
    	pelipper.setWeight(28.0);
    	pokedex.put("Pelipper", pelipper);

    	Pokemon persian = new Pokemon("Persian");
    	persian.setTypes("Normal", "(none)");
    	persian.setAbility("Limber");
    	persian.setAllBaseStats(65, 70, 60, 65, 65, 115);
    	persian.setWeight(32.0);
    	pokedex.put("Persian", persian);

    	Pokemon persianalola = new Pokemon("Persian-Alola");
    	persianalola.setTypes("Dark", "(none)");
    	persianalola.setAbility("Fur Coat");
    	persianalola.setAllBaseStats(65, 60, 60, 75, 65, 115);
    	persianalola.setWeight(33.0);
    	pokedex.put("Persian-Alola", persianalola);

    	Pokemon petilil = new Pokemon("Petilil");
    	petilil.setTypes("Grass", "(none)");
    	petilil.setAbility("Chlorophyll");
    	petilil.setAllBaseStats(45, 35, 50, 70, 50, 30);
    	petilil.setWeight(6.6);
    	pokedex.put("Petilil", petilil);

    	Pokemon phanpy = new Pokemon("Phanpy");
    	phanpy.setTypes("Ground", "(none)");
    	phanpy.setAbility("Pickup");
    	phanpy.setAllBaseStats(90, 60, 60, 40, 40, 40);
    	phanpy.setWeight(33.5);
    	pokedex.put("Phanpy", phanpy);

    	Pokemon phantump = new Pokemon("Phantump");
    	phantump.setTypes("Ghost", "Grass");
    	phantump.setAbility("Natural Cure");
    	phantump.setAllBaseStats(43, 70, 48, 50, 60, 38);
    	phantump.setWeight(7.0);
    	pokedex.put("Phantump", phantump);

    	Pokemon pheromosa = new Pokemon("Pheromosa");
    	pheromosa.setTypes("Bug", "Fighting");
    	pheromosa.setAbility("Beast Boost");
    	pheromosa.setAllBaseStats(71, 137, 37, 137, 37, 151);
    	pheromosa.setWeight(25.0);
    	pokedex.put("Pheromosa", pheromosa);

    	Pokemon phione = new Pokemon("Phione");
    	phione.setTypes("Water", "(none)");
    	phione.setAbility("Hydration");
    	phione.setAllBaseStats(80, 80, 80, 80, 80, 80);
    	phione.setWeight(3.1);
    	pokedex.put("Phione", phione);

    	Pokemon pichu = new Pokemon("Pichu");
    	pichu.setTypes("Electric", "(none)");
    	pichu.setAbility("Static");
    	pichu.setAllBaseStats(20, 40, 15, 35, 35, 60);
    	pichu.setWeight(2.0);
    	pokedex.put("Pichu", pichu);

    	Pokemon pichuspikyeared = new Pokemon("Pichu-Spiky-eared");
    	pichuspikyeared.setTypes("Electric", "(none)");
    	pichuspikyeared.setAbility("Static");
    	pichuspikyeared.setAllBaseStats(20, 40, 15, 35, 35, 60);
    	pichuspikyeared.setWeight(2.0);
    	pokedex.put("Pichu-Spiky-eared", pichuspikyeared);

    	Pokemon pidgeot = new Pokemon("Pidgeot");
    	pidgeot.setTypes("Normal", "Flying");
    	pidgeot.setAbility("Keen Eye");
    	pidgeot.setAllBaseStats(83, 80, 75, 70, 70, 101);
    	pidgeot.setWeight(39.5);
    	pidgeot.setFormes("Pidgeot", "Pidgeot-Mega");
    	pokedex.put("Pidgeot", pidgeot);

    	Pokemon pidgeotmega = new Pokemon("Pidgeot-Mega");
    	pidgeotmega.setTypes("Normal", "Flying");
    	pidgeotmega.setAbility("No Guard");
    	pidgeotmega.setAllBaseStats(83, 80, 80, 135, 80, 121);
    	pidgeotmega.setWeight(50.5);
    	pokedex.put("Pidgeot-Mega", pidgeotmega);

    	Pokemon pidgeotto = new Pokemon("Pidgeotto");
    	pidgeotto.setTypes("Normal", "Flying");
    	pidgeotto.setAbility("Keen Eye");
    	pidgeotto.setAllBaseStats(63, 60, 55, 50, 50, 71);
    	pidgeotto.setWeight(30.0);
    	pokedex.put("Pidgeotto", pidgeotto);

    	Pokemon pidgey = new Pokemon("Pidgey");
    	pidgey.setTypes("Normal", "Flying");
    	pidgey.setAbility("Keen Eye");
    	pidgey.setAllBaseStats(40, 45, 40, 35, 35, 56);
    	pidgey.setWeight(1.8);
    	pokedex.put("Pidgey", pidgey);

    	Pokemon pidove = new Pokemon("Pidove");
    	pidove.setTypes("Normal", "Flying");
    	pidove.setAbility("Big Pecks");
    	pidove.setAllBaseStats(50, 55, 50, 36, 30, 43);
    	pidove.setWeight(2.1);
    	pokedex.put("Pidove", pidove);

    	Pokemon pignite = new Pokemon("Pignite");
    	pignite.setTypes("Fire", "Fighting");
    	pignite.setAbility("Blaze");
    	pignite.setAllBaseStats(90, 93, 55, 70, 55, 55);
    	pignite.setWeight(55.5);
    	pokedex.put("Pignite", pignite);

    	Pokemon pikachu = new Pokemon("Pikachu");
    	pikachu.setTypes("Electric", "(none)");
    	pikachu.setAbility("Static");
    	pikachu.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachu.setWeight(6.0);
    	pokedex.put("Pikachu", pikachu);

    	Pokemon pikachualola = new Pokemon("Pikachu-Alola");
    	pikachualola.setTypes("Electric", "(none)");
    	pikachualola.setAbility("Static");
    	pikachualola.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachualola.setWeight(6.0);
    	pokedex.put("Pikachu-Alola", pikachualola);

    	Pokemon pikachubelle = new Pokemon("Pikachu-Belle");
    	pikachubelle.setTypes("Electric", "(none)");
    	pikachubelle.setAbility("Lightning Rod");
    	pikachubelle.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachubelle.setWeight(6.0);
    	pokedex.put("Pikachu-Belle", pikachubelle);

    	Pokemon pikachucosplay = new Pokemon("Pikachu-Cosplay");
    	pikachucosplay.setTypes("Electric", "(none)");
    	pikachucosplay.setAbility("Lightning Rod");
    	pikachucosplay.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachucosplay.setWeight(6.0);
    	pokedex.put("Pikachu-Cosplay", pikachucosplay);

    	Pokemon pikachuhoenn = new Pokemon("Pikachu-Hoenn");
    	pikachuhoenn.setTypes("Electric", "(none)");
    	pikachuhoenn.setAbility("Static");
    	pikachuhoenn.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachuhoenn.setWeight(6.0);
    	pokedex.put("Pikachu-Hoenn", pikachuhoenn);

    	Pokemon pikachukalos = new Pokemon("Pikachu-Kalos");
    	pikachukalos.setTypes("Electric", "(none)");
    	pikachukalos.setAbility("Static");
    	pikachukalos.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachukalos.setWeight(6.0);
    	pokedex.put("Pikachu-Kalos", pikachukalos);

    	Pokemon pikachulibre = new Pokemon("Pikachu-Libre");
    	pikachulibre.setTypes("Electric", "(none)");
    	pikachulibre.setAbility("Lightning Rod");
    	pikachulibre.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachulibre.setWeight(6.0);
    	pokedex.put("Pikachu-Libre", pikachulibre);

    	Pokemon pikachuoriginal = new Pokemon("Pikachu-Original");
    	pikachuoriginal.setTypes("Electric", "(none)");
    	pikachuoriginal.setAbility("Static");
    	pikachuoriginal.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachuoriginal.setWeight(6.0);
    	pokedex.put("Pikachu-Original", pikachuoriginal);

    	Pokemon pikachupartner = new Pokemon("Pikachu-Partner");
    	pikachupartner.setTypes("Electric", "(none)");
    	pikachupartner.setAbility("Static");
    	pikachupartner.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachupartner.setWeight(6.0);
    	pokedex.put("Pikachu-Partner", pikachupartner);

    	Pokemon pikachuphd = new Pokemon("Pikachu-PhD");
    	pikachuphd.setTypes("Electric", "(none)");
    	pikachuphd.setAbility("Lightning Rod");
    	pikachuphd.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachuphd.setWeight(6.0);
    	pokedex.put("Pikachu-PhD", pikachuphd);

    	Pokemon pikachupopstar = new Pokemon("Pikachu-Pop-Star");
    	pikachupopstar.setTypes("Electric", "(none)");
    	pikachupopstar.setAbility("Lightning Rod");
    	pikachupopstar.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachupopstar.setWeight(6.0);
    	pokedex.put("Pikachu-Pop-Star", pikachupopstar);

    	Pokemon pikachurockstar = new Pokemon("Pikachu-Rock-Star");
    	pikachurockstar.setTypes("Electric", "(none)");
    	pikachurockstar.setAbility("Lightning Rod");
    	pikachurockstar.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachurockstar.setWeight(6.0);
    	pokedex.put("Pikachu-Rock-Star", pikachurockstar);

    	Pokemon pikachusinnoh = new Pokemon("Pikachu-Sinnoh");
    	pikachusinnoh.setTypes("Electric", "(none)");
    	pikachusinnoh.setAbility("Static");
    	pikachusinnoh.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachusinnoh.setWeight(6.0);
    	pokedex.put("Pikachu-Sinnoh", pikachusinnoh);

    	Pokemon pikachuunova = new Pokemon("Pikachu-Unova");
    	pikachuunova.setTypes("Electric", "(none)");
    	pikachuunova.setAbility("Static");
    	pikachuunova.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachuunova.setWeight(6.0);
    	pokedex.put("Pikachu-Unova", pikachuunova);

    	Pokemon pikipek = new Pokemon("Pikipek");
    	pikipek.setTypes("Normal", "Flying");
    	pikipek.setAbility("Keen Eye");
    	pikipek.setAllBaseStats(35, 75, 30, 30, 30, 65);
    	pikipek.setWeight(1.2);
    	pokedex.put("Pikipek", pikipek);

    	Pokemon piloswine = new Pokemon("Piloswine");
    	piloswine.setTypes("Ice", "Ground");
    	piloswine.setAbility("Oblivious");
    	piloswine.setAllBaseStats(100, 100, 80, 60, 60, 50);
    	piloswine.setWeight(55.8);
    	pokedex.put("Piloswine", piloswine);

    	Pokemon pineco = new Pokemon("Pineco");
    	pineco.setTypes("Bug", "(none)");
    	pineco.setAbility("Sturdy");
    	pineco.setAllBaseStats(50, 65, 90, 35, 35, 15);
    	pineco.setWeight(7.2);
    	pokedex.put("Pineco", pineco);

    	Pokemon pinsir = new Pokemon("Pinsir");
    	pinsir.setTypes("Bug", "(none)");
    	pinsir.setAbility("Hyper Cutter");
    	pinsir.setAllBaseStats(65, 125, 100, 55, 70, 85);
    	pinsir.setWeight(55.0);
    	pinsir.setFormes("Pinsir", "Pinsir-Mega");
    	pokedex.put("Pinsir", pinsir);

    	Pokemon pinsirmega = new Pokemon("Pinsir-Mega");
    	pinsirmega.setTypes("Bug", "Flying");
    	pinsirmega.setAbility("Aerilate");
    	pinsirmega.setAllBaseStats(65, 155, 120, 65, 90, 105);
    	pinsirmega.setWeight(59.0);
    	pokedex.put("Pinsir-Mega", pinsirmega);

    	Pokemon piplup = new Pokemon("Piplup");
    	piplup.setTypes("Water", "(none)");
    	piplup.setAbility("Torrent");
    	piplup.setAllBaseStats(53, 51, 53, 61, 56, 40);
    	piplup.setWeight(5.2);
    	pokedex.put("Piplup", piplup);

    	Pokemon plasmanta = new Pokemon("Plasmanta");
    	plasmanta.setTypes("Electric", "Poison");
    	plasmanta.setAbility("Storm Drain");
    	plasmanta.setAllBaseStats(60, 57, 119, 131, 98, 100);
    	plasmanta.setWeight(460.0);
    	pokedex.put("Plasmanta", plasmanta);

    	Pokemon pluffle = new Pokemon("Pluffle");
    	pluffle.setTypes("Fairy", "(none)");
    	pluffle.setAbility("Natural Cure");
    	pluffle.setAllBaseStats(74, 38, 51, 65, 78, 49);
    	pluffle.setWeight(1.8);
    	pokedex.put("Pluffle", pluffle);

    	Pokemon plusle = new Pokemon("Plusle");
    	plusle.setTypes("Electric", "(none)");
    	plusle.setAbility("Plus");
    	plusle.setAllBaseStats(60, 50, 40, 85, 75, 95);
    	plusle.setWeight(4.2);
    	pokedex.put("Plusle", plusle);

    	Pokemon poipole = new Pokemon("Poipole");
    	poipole.setTypes("Poison", "(none)");
    	poipole.setAbility("Beast Boost");
    	poipole.setAllBaseStats(67, 73, 67, 73, 67, 73);
    	poipole.setWeight(1.8);
    	pokedex.put("Poipole", poipole);

    	Pokemon pokestarblackbelt = new Pokemon("Pokestar Black Belt");
    	pokestarblackbelt.setTypes("Fighting", "(none)");
    	pokestarblackbelt.setAbility("Huge Power");
    	pokestarblackbelt.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarblackbelt.setWeight(61.0);
    	pokedex.put("Pokestar Black Belt", pokestarblackbelt);

    	Pokemon pokestarblackdoor = new Pokemon("Pokestar Black Door");
    	pokestarblackdoor.setTypes("Grass", "(none)");
    	pokestarblackdoor.setAbility("Early Bird");
    	pokestarblackdoor.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarblackdoor.setWeight(61.0);
    	pokedex.put("Pokestar Black Door", pokestarblackdoor);

    	Pokemon pokestarbrycenman = new Pokemon("Pokestar Brycen-Man");
    	pokestarbrycenman.setTypes("Dark", "Psychic");
    	pokestarbrycenman.setAbility("Levitate");
    	pokestarbrycenman.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarbrycenman.setWeight(61.0);
    	pokedex.put("Pokestar Brycen-Man", pokestarbrycenman);

    	Pokemon pokestarf00 = new Pokemon("Pokestar F-00");
    	pokestarf00.setTypes("Steel", "Normal");
    	pokestarf00.setAbility("Volt Absorb");
    	pokestarf00.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarf00.setWeight(61.0);
    	pokedex.put("Pokestar F-00", pokestarf00);

    	Pokemon pokestarf002 = new Pokemon("Pokestar F-002");
    	pokestarf002.setTypes("Steel", "Normal");
    	pokestarf002.setAbility("Reckless");
    	pokestarf002.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarf002.setWeight(61.0);
    	pokedex.put("Pokestar F-002", pokestarf002);

    	Pokemon pokestargiant = new Pokemon("Pokestar Giant");
    	pokestargiant.setTypes("Normal", "(none)");
    	pokestargiant.setAbility("Huge Power");
    	pokestargiant.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestargiant.setWeight(61.0);
    	pokedex.put("Pokestar Giant", pokestargiant);

    	Pokemon pokestarhumanoid = new Pokemon("Pokestar Humanoid");
    	pokestarhumanoid.setTypes("Normal", "(none)");
    	pokestarhumanoid.setAbility("Insomnia");
    	pokestarhumanoid.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarhumanoid.setWeight(61.0);
    	pokedex.put("Pokestar Humanoid", pokestarhumanoid);

    	Pokemon pokestarmt = new Pokemon("Pokestar MT");
    	pokestarmt.setTypes("Steel", "(none)");
    	pokestarmt.setAbility("Analytic");
    	pokestarmt.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarmt.setWeight(61.0);
    	pokedex.put("Pokestar MT", pokestarmt);

    	Pokemon pokestarmt2 = new Pokemon("Pokestar MT2");
    	pokestarmt2.setTypes("Steel", "Electric");
    	pokestarmt2.setAbility("Flash Fire");
    	pokestarmt2.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarmt2.setWeight(61.0);
    	pokedex.put("Pokestar MT2", pokestarmt2);

    	Pokemon pokestarmonster = new Pokemon("Pokestar Monster");
    	pokestarmonster.setTypes("Dark", "(none)");
    	pokestarmonster.setAbility("Pressure");
    	pokestarmonster.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarmonster.setWeight(61.0);
    	pokedex.put("Pokestar Monster", pokestarmonster);

    	Pokemon pokestarsmeargle = new Pokemon("Pokestar Smeargle");
    	pokestarsmeargle.setTypes("Normal", "(none)");
    	pokestarsmeargle.setAbility("Own Tempo");
    	pokestarsmeargle.setAllBaseStats(55, 20, 35, 20, 45, 75);
    	pokestarsmeargle.setWeight(61.0);
    	pokedex.put("Pokestar Smeargle", pokestarsmeargle);

    	Pokemon pokestarspirit = new Pokemon("Pokestar Spirit");
    	pokestarspirit.setTypes("Dark", "Ghost");
    	pokestarspirit.setAbility("Wonder Guard");
    	pokestarspirit.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarspirit.setWeight(61.0);
    	pokedex.put("Pokestar Spirit", pokestarspirit);

    	Pokemon pokestartransport = new Pokemon("Pokestar Transport");
    	pokestartransport.setTypes("Steel", "(none)");
    	pokestartransport.setAbility("Motor Drive");
    	pokestartransport.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestartransport.setWeight(61.0);
    	pokedex.put("Pokestar Transport", pokestartransport);

    	Pokemon pokestarufo = new Pokemon("Pokestar UFO");
    	pokestarufo.setTypes("Flying", "Electric");
    	pokestarufo.setAbility("Levitate");
    	pokestarufo.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarufo.setWeight(61.0);
    	pokedex.put("Pokestar UFO", pokestarufo);

    	Pokemon pokestarufo2 = new Pokemon("Pokestar UFO-2");
    	pokestarufo2.setTypes("Psychic", "Electric");
    	pokestarufo2.setAbility("Levitate");
    	pokestarufo2.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarufo2.setWeight(61.0);
    	pokedex.put("Pokestar UFO-2", pokestarufo2);

    	Pokemon pokestarufopropu2 = new Pokemon("Pokestar UFO-PropU2");
    	pokestarufopropu2.setTypes("Psychic", "Electric");
    	pokestarufopropu2.setAbility("Levitate");
    	pokestarufopropu2.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarufopropu2.setWeight(61.0);
    	pokedex.put("Pokestar UFO-PropU2", pokestarufopropu2);

    	Pokemon pokestarwhitedoor = new Pokemon("Pokestar White Door");
    	pokestarwhitedoor.setTypes("Fire", "(none)");
    	pokestarwhitedoor.setAbility("Blaze");
    	pokestarwhitedoor.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarwhitedoor.setWeight(61.0);
    	pokedex.put("Pokestar White Door", pokestarwhitedoor);

    	Pokemon politoed = new Pokemon("Politoed");
    	politoed.setTypes("Water", "(none)");
    	politoed.setAbility("Drizzle");
    	politoed.setAllBaseStats(90, 75, 75, 90, 100, 70);
    	politoed.setWeight(33.9);
    	pokedex.put("Politoed", politoed);

    	Pokemon poliwag = new Pokemon("Poliwag");
    	poliwag.setTypes("Water", "(none)");
    	poliwag.setAbility("Water Absorb");
    	poliwag.setAllBaseStats(40, 50, 40, 40, 40, 90);
    	poliwag.setWeight(12.4);
    	pokedex.put("Poliwag", poliwag);

    	Pokemon poliwhirl = new Pokemon("Poliwhirl");
    	poliwhirl.setTypes("Water", "(none)");
    	poliwhirl.setAbility("Water Absorb");
    	poliwhirl.setAllBaseStats(65, 65, 65, 50, 50, 90);
    	poliwhirl.setWeight(20.0);
    	pokedex.put("Poliwhirl", poliwhirl);

    	Pokemon poliwrath = new Pokemon("Poliwrath");
    	poliwrath.setTypes("Water", "Fighting");
    	poliwrath.setAbility("Water Absorb");
    	poliwrath.setAllBaseStats(90, 95, 95, 70, 90, 70);
    	poliwrath.setWeight(54.0);
    	pokedex.put("Poliwrath", poliwrath);

    	Pokemon ponyta = new Pokemon("Ponyta");
    	ponyta.setTypes("Fire", "(none)");
    	ponyta.setAbility("Run Away");
    	ponyta.setAllBaseStats(50, 85, 55, 65, 65, 90);
    	ponyta.setWeight(30.0);
    	pokedex.put("Ponyta", ponyta);

    	Pokemon poochyena = new Pokemon("Poochyena");
    	poochyena.setTypes("Dark", "(none)");
    	poochyena.setAbility("Run Away");
    	poochyena.setAllBaseStats(35, 55, 35, 30, 30, 35);
    	poochyena.setWeight(13.6);
    	pokedex.put("Poochyena", poochyena);

    	Pokemon popplio = new Pokemon("Popplio");
    	popplio.setTypes("Water", "(none)");
    	popplio.setAbility("Torrent");
    	popplio.setAllBaseStats(50, 54, 54, 66, 56, 40);
    	popplio.setWeight(7.5);
    	pokedex.put("Popplio", popplio);

    	Pokemon porygon = new Pokemon("Porygon");
    	porygon.setTypes("Normal", "(none)");
    	porygon.setAbility("Trace");
    	porygon.setAllBaseStats(65, 60, 70, 85, 75, 40);
    	porygon.setWeight(36.5);
    	pokedex.put("Porygon", porygon);

    	Pokemon porygonz = new Pokemon("Porygon-Z");
    	porygonz.setTypes("Normal", "(none)");
    	porygonz.setAbility("Adaptability");
    	porygonz.setAllBaseStats(85, 80, 70, 135, 75, 90);
    	porygonz.setWeight(34.0);
    	pokedex.put("Porygon-Z", porygonz);

    	Pokemon porygon2 = new Pokemon("Porygon2");
    	porygon2.setTypes("Normal", "(none)");
    	porygon2.setAbility("Download");
    	porygon2.setAllBaseStats(85, 80, 90, 105, 95, 60);
    	porygon2.setWeight(32.5);
    	pokedex.put("Porygon2", porygon2);

    	Pokemon primarina = new Pokemon("Primarina");
    	primarina.setTypes("Water", "Fairy");
    	primarina.setAbility("Liquid Voice");
    	primarina.setAllBaseStats(80, 74, 74, 126, 116, 60);
    	primarina.setWeight(44.0);
    	pokedex.put("Primarina", primarina);

    	Pokemon primeape = new Pokemon("Primeape");
    	primeape.setTypes("Fighting", "(none)");
    	primeape.setAbility("Vital Spirit");
    	primeape.setAllBaseStats(65, 105, 60, 60, 70, 95);
    	primeape.setWeight(32.0);
    	pokedex.put("Primeape", primeape);

    	Pokemon prinplup = new Pokemon("Prinplup");
    	prinplup.setTypes("Water", "(none)");
    	prinplup.setAbility("Torrent");
    	prinplup.setAllBaseStats(64, 66, 68, 81, 76, 50);
    	prinplup.setWeight(23.0);
    	pokedex.put("Prinplup", prinplup);

    	Pokemon privatyke = new Pokemon("Privatyke");
    	privatyke.setTypes("Water", "Fighting");
    	privatyke.setAbility("Unaware");
    	privatyke.setAllBaseStats(65, 75, 65, 40, 60, 45);
    	privatyke.setWeight(35.0);
    	pokedex.put("Privatyke", privatyke);

    	Pokemon probopass = new Pokemon("Probopass");
    	probopass.setTypes("Rock", "Steel");
    	probopass.setAbility("Sturdy");
    	probopass.setAllBaseStats(60, 55, 145, 75, 150, 40);
    	probopass.setWeight(340.0);
    	pokedex.put("Probopass", probopass);

    	Pokemon psyduck = new Pokemon("Psyduck");
    	psyduck.setTypes("Water", "(none)");
    	psyduck.setAbility("Damp");
    	psyduck.setAllBaseStats(50, 52, 48, 65, 50, 55);
    	psyduck.setWeight(19.6);
    	pokedex.put("Psyduck", psyduck);

    	Pokemon pumpkaboo = new Pokemon("Pumpkaboo");
    	pumpkaboo.setTypes("Ghost", "Grass");
    	pumpkaboo.setAbility("Pickup");
    	pumpkaboo.setAllBaseStats(49, 66, 70, 44, 55, 51);
    	pumpkaboo.setWeight(5.0);
    	pokedex.put("Pumpkaboo", pumpkaboo);

    	Pokemon pumpkaboolarge = new Pokemon("Pumpkaboo-Large");
    	pumpkaboolarge.setTypes("Ghost", "Grass");
    	pumpkaboolarge.setAbility("Pickup");
    	pumpkaboolarge.setAllBaseStats(54, 66, 70, 44, 55, 46);
    	pumpkaboolarge.setWeight(7.5);
    	pokedex.put("Pumpkaboo-Large", pumpkaboolarge);

    	Pokemon pumpkaboosmall = new Pokemon("Pumpkaboo-Small");
    	pumpkaboosmall.setTypes("Ghost", "Grass");
    	pumpkaboosmall.setAbility("Pickup");
    	pumpkaboosmall.setAllBaseStats(44, 66, 70, 44, 55, 56);
    	pumpkaboosmall.setWeight(3.5);
    	pokedex.put("Pumpkaboo-Small", pumpkaboosmall);

    	Pokemon pumpkaboosuper = new Pokemon("Pumpkaboo-Super");
    	pumpkaboosuper.setTypes("Ghost", "Grass");
    	pumpkaboosuper.setAbility("Pickup");
    	pumpkaboosuper.setAllBaseStats(59, 66, 70, 44, 55, 41);
    	pumpkaboosuper.setWeight(15.0);
    	pokedex.put("Pumpkaboo-Super", pumpkaboosuper);

    	Pokemon pupitar = new Pokemon("Pupitar");
    	pupitar.setTypes("Rock", "Ground");
    	pupitar.setAbility("Shed Skin");
    	pupitar.setAllBaseStats(70, 84, 70, 65, 70, 51);
    	pupitar.setWeight(152.0);
    	pokedex.put("Pupitar", pupitar);

    	Pokemon purrloin = new Pokemon("Purrloin");
    	purrloin.setTypes("Dark", "(none)");
    	purrloin.setAbility("Limber");
    	purrloin.setAllBaseStats(41, 50, 37, 50, 37, 66);
    	purrloin.setWeight(10.1);
    	pokedex.put("Purrloin", purrloin);

    	Pokemon purugly = new Pokemon("Purugly");
    	purugly.setTypes("Normal", "(none)");
    	purugly.setAbility("Defiant");
    	purugly.setAllBaseStats(71, 82, 64, 64, 59, 112);
    	purugly.setWeight(43.8);
    	pokedex.put("Purugly", purugly);

    	Pokemon pyroak = new Pokemon("Pyroak");
    	pyroak.setTypes("Fire", "Grass");
    	pyroak.setAbility("Rock Head");
    	pyroak.setAllBaseStats(120, 70, 105, 95, 90, 60);
    	pyroak.setWeight(168.0);
    	pokedex.put("Pyroak", pyroak);

    	Pokemon pyroar = new Pokemon("Pyroar");
    	pyroar.setTypes("Fire", "Normal");
    	pyroar.setAbility("Rivalry");
    	pyroar.setAllBaseStats(86, 68, 72, 109, 66, 106);
    	pyroar.setWeight(81.5);
    	pokedex.put("Pyroar", pyroar);

    	Pokemon pyukumuku = new Pokemon("Pyukumuku");
    	pyukumuku.setTypes("Water", "(none)");
    	pyukumuku.setAbility("Innards Out");
    	pyukumuku.setAllBaseStats(55, 60, 130, 30, 130, 5);
    	pyukumuku.setWeight(1.2);
    	pokedex.put("Pyukumuku", pyukumuku);

    	Pokemon quagsire = new Pokemon("Quagsire");
    	quagsire.setTypes("Water", "Ground");
    	quagsire.setAbility("Damp");
    	quagsire.setAllBaseStats(95, 85, 85, 65, 65, 35);
    	quagsire.setWeight(75.0);
    	pokedex.put("Quagsire", quagsire);

    	Pokemon quilava = new Pokemon("Quilava");
    	quilava.setTypes("Fire", "(none)");
    	quilava.setAbility("Blaze");
    	quilava.setAllBaseStats(58, 64, 58, 80, 65, 80);
    	quilava.setWeight(19.0);
    	pokedex.put("Quilava", quilava);

    	Pokemon quilladin = new Pokemon("Quilladin");
    	quilladin.setTypes("Grass", "(none)");
    	quilladin.setAbility("Overgrow");
    	quilladin.setAllBaseStats(61, 78, 95, 56, 58, 57);
    	quilladin.setWeight(29.0);
    	pokedex.put("Quilladin", quilladin);

    	Pokemon qwilfish = new Pokemon("Qwilfish");
    	qwilfish.setTypes("Water", "Poison");
    	qwilfish.setAbility("Poison Point");
    	qwilfish.setAllBaseStats(65, 95, 85, 55, 55, 85);
    	qwilfish.setWeight(3.9);
    	pokedex.put("Qwilfish", qwilfish);

    	Pokemon raichu = new Pokemon("Raichu");
    	raichu.setTypes("Electric", "(none)");
    	raichu.setAbility("Lightning Rod");
    	raichu.setAllBaseStats(60, 90, 55, 90, 80, 110);
    	raichu.setWeight(30.0);
    	pokedex.put("Raichu", raichu);

    	Pokemon raichualola = new Pokemon("Raichu-Alola");
    	raichualola.setTypes("Electric", "Psychic");
    	raichualola.setAbility("Surge Surfer");
    	raichualola.setAllBaseStats(60, 85, 50, 95, 85, 110);
    	raichualola.setWeight(21.0);
    	pokedex.put("Raichu-Alola", raichualola);

    	Pokemon raikou = new Pokemon("Raikou");
    	raikou.setTypes("Electric", "(none)");
    	raikou.setAbility("Pressure");
    	raikou.setAllBaseStats(90, 85, 75, 115, 100, 115);
    	raikou.setWeight(178.0);
    	pokedex.put("Raikou", raikou);

    	Pokemon ralts = new Pokemon("Ralts");
    	ralts.setTypes("Psychic", "Fairy");
    	ralts.setAbility("Synchronize");
    	ralts.setAllBaseStats(28, 25, 25, 45, 35, 40);
    	ralts.setWeight(6.6);
    	pokedex.put("Ralts", ralts);

    	Pokemon rampardos = new Pokemon("Rampardos");
    	rampardos.setTypes("Rock", "(none)");
    	rampardos.setAbility("Mold Breaker");
    	rampardos.setAllBaseStats(97, 165, 60, 65, 50, 58);
    	rampardos.setWeight(102.5);
    	pokedex.put("Rampardos", rampardos);

    	Pokemon rapidash = new Pokemon("Rapidash");
    	rapidash.setTypes("Fire", "(none)");
    	rapidash.setAbility("Run Away");
    	rapidash.setAllBaseStats(65, 100, 70, 80, 80, 105);
    	rapidash.setWeight(95.0);
    	pokedex.put("Rapidash", rapidash);

    	Pokemon raticate = new Pokemon("Raticate");
    	raticate.setTypes("Normal", "(none)");
    	raticate.setAbility("Run Away");
    	raticate.setAllBaseStats(55, 81, 60, 50, 70, 97);
    	raticate.setWeight(18.5);
    	pokedex.put("Raticate", raticate);

    	Pokemon raticatealola = new Pokemon("Raticate-Alola");
    	raticatealola.setTypes("Dark", "Normal");
    	raticatealola.setAbility("Gluttony");
    	raticatealola.setAllBaseStats(75, 71, 70, 40, 80, 77);
    	raticatealola.setWeight(25.5);
    	pokedex.put("Raticate-Alola", raticatealola);

    	Pokemon raticatealolatotem = new Pokemon("Raticate-Alola-Totem");
    	raticatealolatotem.setTypes("Dark", "Normal");
    	raticatealolatotem.setAbility("Thick Fat");
    	raticatealolatotem.setAllBaseStats(75, 71, 70, 40, 80, 77);
    	raticatealolatotem.setWeight(105.0);
    	pokedex.put("Raticate-Alola-Totem", raticatealolatotem);

    	Pokemon rattata = new Pokemon("Rattata");
    	rattata.setTypes("Normal", "(none)");
    	rattata.setAbility("Run Away");
    	rattata.setAllBaseStats(30, 56, 35, 25, 35, 72);
    	rattata.setWeight(3.5);
    	pokedex.put("Rattata", rattata);

    	Pokemon rattataalola = new Pokemon("Rattata-Alola");
    	rattataalola.setTypes("Dark", "Normal");
    	rattataalola.setAbility("Gluttony");
    	rattataalola.setAllBaseStats(30, 56, 35, 25, 35, 72);
    	rattataalola.setWeight(3.8);
    	pokedex.put("Rattata-Alola", rattataalola);

    	Pokemon rayquaza = new Pokemon("Rayquaza");
    	rayquaza.setTypes("Dragon", "Flying");
    	rayquaza.setAbility("Air Lock");
    	rayquaza.setAllBaseStats(105, 150, 90, 150, 90, 95);
    	rayquaza.setWeight(206.5);
    	rayquaza.setFormes("Rayquaza", "Rayquaza-Mega");
    	pokedex.put("Rayquaza", rayquaza);

    	Pokemon rayquazamega = new Pokemon("Rayquaza-Mega");
    	rayquazamega.setTypes("Dragon", "Flying");
    	rayquazamega.setAbility("Delta Stream");
    	rayquazamega.setAllBaseStats(105, 180, 100, 180, 100, 115);
    	rayquazamega.setWeight(392.0);
    	pokedex.put("Rayquaza-Mega", rayquazamega);

    	Pokemon rebble = new Pokemon("Rebble");
    	rebble.setTypes("Rock", "(none)");
    	rebble.setAbility("Levitate");
    	rebble.setAllBaseStats(45, 25, 65, 75, 55, 80);
    	rebble.setWeight(7.0);
    	pokedex.put("Rebble", rebble);

    	Pokemon regice = new Pokemon("Regice");
    	regice.setTypes("Ice", "(none)");
    	regice.setAbility("Clear Body");
    	regice.setAllBaseStats(80, 50, 100, 100, 200, 50);
    	regice.setWeight(175.0);
    	pokedex.put("Regice", regice);

    	Pokemon regigigas = new Pokemon("Regigigas");
    	regigigas.setTypes("Normal", "(none)");
    	regigigas.setAbility("Slow Start");
    	regigigas.setAllBaseStats(110, 160, 110, 80, 110, 100);
    	regigigas.setWeight(420.0);
    	pokedex.put("Regigigas", regigigas);

    	Pokemon regirock = new Pokemon("Regirock");
    	regirock.setTypes("Rock", "(none)");
    	regirock.setAbility("Clear Body");
    	regirock.setAllBaseStats(80, 100, 200, 50, 100, 50);
    	regirock.setWeight(230.0);
    	pokedex.put("Regirock", regirock);

    	Pokemon registeel = new Pokemon("Registeel");
    	registeel.setTypes("Steel", "(none)");
    	registeel.setAbility("Clear Body");
    	registeel.setAllBaseStats(80, 75, 150, 75, 150, 50);
    	registeel.setWeight(205.0);
    	pokedex.put("Registeel", registeel);

    	Pokemon relicanth = new Pokemon("Relicanth");
    	relicanth.setTypes("Water", "Rock");
    	relicanth.setAbility("Swift Swim");
    	relicanth.setAllBaseStats(100, 90, 130, 45, 65, 55);
    	relicanth.setWeight(23.4);
    	pokedex.put("Relicanth", relicanth);

    	Pokemon remoraid = new Pokemon("Remoraid");
    	remoraid.setTypes("Water", "(none)");
    	remoraid.setAbility("Hustle");
    	remoraid.setAllBaseStats(35, 65, 35, 65, 35, 65);
    	remoraid.setWeight(12.0);
    	pokedex.put("Remoraid", remoraid);

    	Pokemon reshiram = new Pokemon("Reshiram");
    	reshiram.setTypes("Dragon", "Fire");
    	reshiram.setAbility("Turboblaze");
    	reshiram.setAllBaseStats(100, 120, 100, 150, 120, 90);
    	reshiram.setWeight(330.0);
    	pokedex.put("Reshiram", reshiram);

    	Pokemon reuniclus = new Pokemon("Reuniclus");
    	reuniclus.setTypes("Psychic", "(none)");
    	reuniclus.setAbility("Magic Guard");
    	reuniclus.setAllBaseStats(110, 65, 75, 125, 85, 30);
    	reuniclus.setWeight(20.1);
    	pokedex.put("Reuniclus", reuniclus);

    	Pokemon revenankh = new Pokemon("Revenankh");
    	revenankh.setTypes("Ghost", "Fighting");
    	revenankh.setAbility("Shed Skin");
    	revenankh.setAllBaseStats(90, 105, 90, 65, 110, 65);
    	revenankh.setWeight(44.0);
    	pokedex.put("Revenankh", revenankh);

    	Pokemon rhydon = new Pokemon("Rhydon");
    	rhydon.setTypes("Ground", "Rock");
    	rhydon.setAbility("Lightning Rod");
    	rhydon.setAllBaseStats(105, 130, 120, 45, 45, 40);
    	rhydon.setWeight(120.0);
    	pokedex.put("Rhydon", rhydon);

    	Pokemon rhyhorn = new Pokemon("Rhyhorn");
    	rhyhorn.setTypes("Ground", "Rock");
    	rhyhorn.setAbility("Lightning Rod");
    	rhyhorn.setAllBaseStats(80, 85, 95, 30, 30, 25);
    	rhyhorn.setWeight(115.0);
    	pokedex.put("Rhyhorn", rhyhorn);

    	Pokemon rhyperior = new Pokemon("Rhyperior");
    	rhyperior.setTypes("Ground", "Rock");
    	rhyperior.setAbility("Lightning Rod");
    	rhyperior.setAllBaseStats(115, 140, 130, 55, 55, 40);
    	rhyperior.setWeight(282.8);
    	pokedex.put("Rhyperior", rhyperior);

    	Pokemon ribombee = new Pokemon("Ribombee");
    	ribombee.setTypes("Bug", "Fairy");
    	ribombee.setAbility("Honey Gather");
    	ribombee.setAllBaseStats(60, 55, 60, 95, 70, 124);
    	ribombee.setWeight(0.5);
    	pokedex.put("Ribombee", ribombee);

    	Pokemon ribombeetotem = new Pokemon("Ribombee-Totem");
    	ribombeetotem.setTypes("Bug", "Fairy");
    	ribombeetotem.setAbility("Sweet Veil");
    	ribombeetotem.setAllBaseStats(60, 55, 60, 95, 70, 124);
    	ribombeetotem.setWeight(2.0);
    	pokedex.put("Ribombee-Totem", ribombeetotem);

    	Pokemon riolu = new Pokemon("Riolu");
    	riolu.setTypes("Fighting", "(none)");
    	riolu.setAbility("Prankster");
    	riolu.setAllBaseStats(40, 70, 40, 35, 40, 60);
    	riolu.setWeight(20.2);
    	pokedex.put("Riolu", riolu);

    	Pokemon rockruff = new Pokemon("Rockruff");
    	rockruff.setTypes("Rock", "(none)");
    	rockruff.setAbility("Keen Eye");
    	rockruff.setAllBaseStats(45, 65, 40, 30, 40, 60);
    	rockruff.setWeight(9.2);
    	pokedex.put("Rockruff", rockruff);

    	Pokemon roggenrola = new Pokemon("Roggenrola");
    	roggenrola.setTypes("Rock", "(none)");
    	roggenrola.setAbility("Sturdy");
    	roggenrola.setAllBaseStats(55, 75, 85, 25, 25, 15);
    	roggenrola.setWeight(18.0);
    	pokedex.put("Roggenrola", roggenrola);

    	Pokemon roselia = new Pokemon("Roselia");
    	roselia.setTypes("Grass", "Poison");
    	roselia.setAbility("Natural Cure");
    	roselia.setAllBaseStats(50, 60, 45, 100, 80, 65);
    	roselia.setWeight(2.0);
    	pokedex.put("Roselia", roselia);

    	Pokemon roserade = new Pokemon("Roserade");
    	roserade.setTypes("Grass", "Poison");
    	roserade.setAbility("Natural Cure");
    	roserade.setAllBaseStats(60, 70, 65, 125, 105, 90);
    	roserade.setWeight(14.5);
    	pokedex.put("Roserade", roserade);

    	Pokemon rotom = new Pokemon("Rotom");
    	rotom.setTypes("Electric", "Ghost");
    	rotom.setAbility("Levitate");
    	rotom.setAllBaseStats(50, 50, 77, 95, 77, 91);
    	rotom.setWeight(0.3);
    	pokedex.put("Rotom", rotom);

    	Pokemon rotomfan = new Pokemon("Rotom-Fan");
    	rotomfan.setTypes("Electric", "Flying");
    	rotomfan.setAbility("Levitate");
    	rotomfan.setAllBaseStats(50, 65, 107, 105, 107, 86);
    	rotomfan.setWeight(0.3);
    	pokedex.put("Rotom-Fan", rotomfan);

    	Pokemon rotomfrost = new Pokemon("Rotom-Frost");
    	rotomfrost.setTypes("Electric", "Ice");
    	rotomfrost.setAbility("Levitate");
    	rotomfrost.setAllBaseStats(50, 65, 107, 105, 107, 86);
    	rotomfrost.setWeight(0.3);
    	pokedex.put("Rotom-Frost", rotomfrost);

    	Pokemon rotomheat = new Pokemon("Rotom-Heat");
    	rotomheat.setTypes("Electric", "Fire");
    	rotomheat.setAbility("Levitate");
    	rotomheat.setAllBaseStats(50, 65, 107, 105, 107, 86);
    	rotomheat.setWeight(0.3);
    	pokedex.put("Rotom-Heat", rotomheat);

    	Pokemon rotommow = new Pokemon("Rotom-Mow");
    	rotommow.setTypes("Electric", "Grass");
    	rotommow.setAbility("Levitate");
    	rotommow.setAllBaseStats(50, 65, 107, 105, 107, 86);
    	rotommow.setWeight(0.3);
    	pokedex.put("Rotom-Mow", rotommow);

    	Pokemon rotomwash = new Pokemon("Rotom-Wash");
    	rotomwash.setTypes("Electric", "Water");
    	rotomwash.setAbility("Levitate");
    	rotomwash.setAllBaseStats(50, 65, 107, 105, 107, 86);
    	rotomwash.setWeight(0.3);
    	pokedex.put("Rotom-Wash", rotomwash);

    	Pokemon rowlet = new Pokemon("Rowlet");
    	rowlet.setTypes("Grass", "Flying");
    	rowlet.setAbility("Overgrow");
    	rowlet.setAllBaseStats(68, 55, 55, 50, 50, 42);
    	rowlet.setWeight(1.5);
    	pokedex.put("Rowlet", rowlet);

    	Pokemon rufflet = new Pokemon("Rufflet");
    	rufflet.setTypes("Normal", "Flying");
    	rufflet.setAbility("Keen Eye");
    	rufflet.setAllBaseStats(70, 83, 50, 37, 50, 60);
    	rufflet.setWeight(10.5);
    	pokedex.put("Rufflet", rufflet);

    	Pokemon sableye = new Pokemon("Sableye");
    	sableye.setTypes("Dark", "Ghost");
    	sableye.setAbility("Prankster");
    	sableye.setAllBaseStats(50, 75, 75, 65, 65, 50);
    	sableye.setWeight(11.0);
    	sableye.setFormes("Sableye", "Sableye-Mega");
    	pokedex.put("Sableye", sableye);

    	Pokemon sableyemega = new Pokemon("Sableye-Mega");
    	sableyemega.setTypes("Dark", "Ghost");
    	sableyemega.setAbility("Magic Bounce");
    	sableyemega.setAllBaseStats(50, 85, 125, 85, 115, 20);
    	sableyemega.setWeight(161.0);
    	pokedex.put("Sableye-Mega", sableyemega);

    	Pokemon salamence = new Pokemon("Salamence");
    	salamence.setTypes("Dragon", "Flying");
    	salamence.setAbility("Intimidate");
    	salamence.setAllBaseStats(95, 135, 80, 110, 80, 100);
    	salamence.setWeight(102.6);
    	salamence.setFormes("Salamence", "Salamence-Mega");
    	pokedex.put("Salamence", salamence);

    	Pokemon salamencemega = new Pokemon("Salamence-Mega");
    	salamencemega.setTypes("Dragon", "Flying");
    	salamencemega.setAbility("Aerilate");
    	salamencemega.setAllBaseStats(95, 145, 130, 120, 90, 120);
    	salamencemega.setWeight(112.6);
    	pokedex.put("Salamence-Mega", salamencemega);

    	Pokemon salandit = new Pokemon("Salandit");
    	salandit.setTypes("Poison", "Fire");
    	salandit.setAbility("Corrosion");
    	salandit.setAllBaseStats(48, 44, 40, 71, 40, 77);
    	salandit.setWeight(4.8);
    	pokedex.put("Salandit", salandit);

    	Pokemon salazzle = new Pokemon("Salazzle");
    	salazzle.setTypes("Poison", "Fire");
    	salazzle.setAbility("Corrosion");
    	salazzle.setAllBaseStats(68, 64, 60, 111, 60, 117);
    	salazzle.setWeight(22.2);
    	pokedex.put("Salazzle", salazzle);

    	Pokemon salazzletotem = new Pokemon("Salazzle-Totem");
    	salazzletotem.setTypes("Poison", "Fire");
    	salazzletotem.setAbility("Corrosion");
    	salazzletotem.setAllBaseStats(68, 64, 60, 111, 60, 117);
    	salazzletotem.setWeight(81.0);
    	pokedex.put("Salazzle-Totem", salazzletotem);

    	Pokemon samurott = new Pokemon("Samurott");
    	samurott.setTypes("Water", "(none)");
    	samurott.setAbility("Torrent");
    	samurott.setAllBaseStats(95, 100, 85, 108, 70, 70);
    	samurott.setWeight(94.6);
    	pokedex.put("Samurott", samurott);

    	Pokemon sandile = new Pokemon("Sandile");
    	sandile.setTypes("Ground", "Dark");
    	sandile.setAbility("Intimidate");
    	sandile.setAllBaseStats(50, 72, 35, 35, 35, 65);
    	sandile.setWeight(15.2);
    	pokedex.put("Sandile", sandile);

    	Pokemon sandshrew = new Pokemon("Sandshrew");
    	sandshrew.setTypes("Ground", "(none)");
    	sandshrew.setAbility("Sand Veil");
    	sandshrew.setAllBaseStats(50, 75, 85, 20, 30, 40);
    	sandshrew.setWeight(12.0);
    	pokedex.put("Sandshrew", sandshrew);

    	Pokemon sandshrewalola = new Pokemon("Sandshrew-Alola");
    	sandshrewalola.setTypes("Ice", "Steel");
    	sandshrewalola.setAbility("Snow Cloak");
    	sandshrewalola.setAllBaseStats(50, 75, 90, 10, 35, 40);
    	sandshrewalola.setWeight(40.0);
    	pokedex.put("Sandshrew-Alola", sandshrewalola);

    	Pokemon sandslash = new Pokemon("Sandslash");
    	sandslash.setTypes("Ground", "(none)");
    	sandslash.setAbility("Sand Veil");
    	sandslash.setAllBaseStats(75, 100, 110, 45, 55, 65);
    	sandslash.setWeight(29.5);
    	pokedex.put("Sandslash", sandslash);

    	Pokemon sandslashalola = new Pokemon("Sandslash-Alola");
    	sandslashalola.setTypes("Ice", "Steel");
    	sandslashalola.setAbility("Snow Cloak");
    	sandslashalola.setAllBaseStats(75, 100, 120, 25, 65, 65);
    	sandslashalola.setWeight(55.0);
    	pokedex.put("Sandslash-Alola", sandslashalola);

    	Pokemon sandygast = new Pokemon("Sandygast");
    	sandygast.setTypes("Ghost", "Ground");
    	sandygast.setAbility("Water Compaction");
    	sandygast.setAllBaseStats(55, 55, 80, 70, 45, 15);
    	sandygast.setWeight(70.0);
    	pokedex.put("Sandygast", sandygast);

    	Pokemon sawk = new Pokemon("Sawk");
    	sawk.setTypes("Fighting", "(none)");
    	sawk.setAbility("Sturdy");
    	sawk.setAllBaseStats(75, 125, 75, 30, 75, 85);
    	sawk.setWeight(51.0);
    	pokedex.put("Sawk", sawk);

    	Pokemon sawsbuck = new Pokemon("Sawsbuck");
    	sawsbuck.setTypes("Normal", "Grass");
    	sawsbuck.setAbility("Chlorophyll");
    	sawsbuck.setAllBaseStats(80, 100, 70, 60, 70, 95);
    	sawsbuck.setWeight(92.5);
    	pokedex.put("Sawsbuck", sawsbuck);

    	Pokemon scatterbug = new Pokemon("Scatterbug");
    	scatterbug.setTypes("Bug", "(none)");
    	scatterbug.setAbility("Shield Dust");
    	scatterbug.setAllBaseStats(38, 35, 40, 27, 25, 35);
    	scatterbug.setWeight(2.5);
    	pokedex.put("Scatterbug", scatterbug);

    	Pokemon sceptile = new Pokemon("Sceptile");
    	sceptile.setTypes("Grass", "(none)");
    	sceptile.setAbility("Overgrow");
    	sceptile.setAllBaseStats(70, 85, 65, 105, 85, 120);
    	sceptile.setWeight(52.2);
    	sceptile.setFormes("Sceptile", "Sceptile-Mega");
    	pokedex.put("Sceptile", sceptile);

    	Pokemon sceptilemega = new Pokemon("Sceptile-Mega");
    	sceptilemega.setTypes("Grass", "Dragon");
    	sceptilemega.setAbility("Lightning Rod");
    	sceptilemega.setAllBaseStats(70, 110, 75, 145, 85, 145);
    	sceptilemega.setWeight(55.2);
    	pokedex.put("Sceptile-Mega", sceptilemega);

    	Pokemon scizor = new Pokemon("Scizor");
    	scizor.setTypes("Bug", "Steel");
    	scizor.setAbility("Technician");
    	scizor.setAllBaseStats(70, 130, 100, 55, 80, 65);
    	scizor.setWeight(118.0);
    	scizor.setFormes("Scizor", "Scizor-Mega");
    	pokedex.put("Scizor", scizor);

    	Pokemon scizormega = new Pokemon("Scizor-Mega");
    	scizormega.setTypes("Bug", "Steel");
    	scizormega.setAbility("Technician");
    	scizormega.setAllBaseStats(70, 150, 140, 65, 100, 75);
    	scizormega.setWeight(125.0);
    	pokedex.put("Scizor-Mega", scizormega);

    	Pokemon scolipede = new Pokemon("Scolipede");
    	scolipede.setTypes("Bug", "Poison");
    	scolipede.setAbility("Poison Point");
    	scolipede.setAllBaseStats(60, 100, 89, 55, 69, 112);
    	scolipede.setWeight(200.5);
    	pokedex.put("Scolipede", scolipede);

    	Pokemon scrafty = new Pokemon("Scrafty");
    	scrafty.setTypes("Dark", "Fighting");
    	scrafty.setAbility("Intimidate");
    	scrafty.setAllBaseStats(65, 90, 115, 45, 115, 58);
    	scrafty.setWeight(30.0);
    	pokedex.put("Scrafty", scrafty);

    	Pokemon scraggy = new Pokemon("Scraggy");
    	scraggy.setTypes("Dark", "Fighting");
    	scraggy.setAbility("Shed Skin");
    	scraggy.setAllBaseStats(50, 75, 70, 35, 70, 48);
    	scraggy.setWeight(11.8);
    	pokedex.put("Scraggy", scraggy);

    	Pokemon scratchet = new Pokemon("Scratchet");
    	scratchet.setTypes("Normal", "Fighting");
    	scratchet.setAbility("Scrappy");
    	scratchet.setAllBaseStats(55, 85, 80, 20, 70, 40);
    	scratchet.setWeight(20.0);
    	pokedex.put("Scratchet", scratchet);

    	Pokemon scyther = new Pokemon("Scyther");
    	scyther.setTypes("Bug", "Flying");
    	scyther.setAbility("Swarm");
    	scyther.setAllBaseStats(70, 110, 80, 55, 80, 105);
    	scyther.setWeight(56.0);
    	pokedex.put("Scyther", scyther);

    	Pokemon seadra = new Pokemon("Seadra");
    	seadra.setTypes("Water", "(none)");
    	seadra.setAbility("Poison Point");
    	seadra.setAllBaseStats(55, 65, 95, 95, 45, 85);
    	seadra.setWeight(25.0);
    	pokedex.put("Seadra", seadra);

    	Pokemon seaking = new Pokemon("Seaking");
    	seaking.setTypes("Water", "(none)");
    	seaking.setAbility("Swift Swim");
    	seaking.setAllBaseStats(80, 92, 65, 65, 80, 68);
    	seaking.setWeight(39.0);
    	pokedex.put("Seaking", seaking);

    	Pokemon sealeo = new Pokemon("Sealeo");
    	sealeo.setTypes("Ice", "Water");
    	sealeo.setAbility("Thick Fat");
    	sealeo.setAllBaseStats(90, 60, 70, 75, 70, 45);
    	sealeo.setWeight(87.6);
    	pokedex.put("Sealeo", sealeo);

    	Pokemon seedot = new Pokemon("Seedot");
    	seedot.setTypes("Grass", "(none)");
    	seedot.setAbility("Chlorophyll");
    	seedot.setAllBaseStats(40, 40, 50, 30, 30, 30);
    	seedot.setWeight(4.0);
    	pokedex.put("Seedot", seedot);

    	Pokemon seel = new Pokemon("Seel");
    	seel.setTypes("Water", "(none)");
    	seel.setAbility("Thick Fat");
    	seel.setAllBaseStats(65, 45, 55, 45, 70, 45);
    	seel.setWeight(90.0);
    	pokedex.put("Seel", seel);

    	Pokemon seismitoad = new Pokemon("Seismitoad");
    	seismitoad.setTypes("Water", "Ground");
    	seismitoad.setAbility("Swift Swim");
    	seismitoad.setAllBaseStats(105, 95, 75, 85, 75, 74);
    	seismitoad.setWeight(62.0);
    	pokedex.put("Seismitoad", seismitoad);

    	Pokemon sentret = new Pokemon("Sentret");
    	sentret.setTypes("Normal", "(none)");
    	sentret.setAbility("Run Away");
    	sentret.setAllBaseStats(35, 46, 34, 35, 45, 20);
    	sentret.setWeight(6.0);
    	pokedex.put("Sentret", sentret);

    	Pokemon serperior = new Pokemon("Serperior");
    	serperior.setTypes("Grass", "(none)");
    	serperior.setAbility("Overgrow");
    	serperior.setAllBaseStats(75, 75, 95, 75, 95, 113);
    	serperior.setWeight(63.0);
    	pokedex.put("Serperior", serperior);

    	Pokemon servine = new Pokemon("Servine");
    	servine.setTypes("Grass", "(none)");
    	servine.setAbility("Overgrow");
    	servine.setAllBaseStats(60, 60, 75, 60, 75, 83);
    	servine.setWeight(16.0);
    	pokedex.put("Servine", servine);

    	Pokemon seviper = new Pokemon("Seviper");
    	seviper.setTypes("Poison", "(none)");
    	seviper.setAbility("Shed Skin");
    	seviper.setAllBaseStats(73, 100, 60, 100, 60, 65);
    	seviper.setWeight(52.5);
    	pokedex.put("Seviper", seviper);

    	Pokemon sewaddle = new Pokemon("Sewaddle");
    	sewaddle.setTypes("Bug", "Grass");
    	sewaddle.setAbility("Swarm");
    	sewaddle.setAllBaseStats(45, 53, 70, 40, 60, 42);
    	sewaddle.setWeight(2.5);
    	pokedex.put("Sewaddle", sewaddle);

    	Pokemon sharpedo = new Pokemon("Sharpedo");
    	sharpedo.setTypes("Water", "Dark");
    	sharpedo.setAbility("Rough Skin");
    	sharpedo.setAllBaseStats(70, 120, 40, 95, 40, 95);
    	sharpedo.setWeight(88.8);
    	sharpedo.setFormes("Sharpedo", "Sharpedo-Mega");
    	pokedex.put("Sharpedo", sharpedo);

    	Pokemon sharpedomega = new Pokemon("Sharpedo-Mega");
    	sharpedomega.setTypes("Water", "Dark");
    	sharpedomega.setAbility("Strong Jaw");
    	sharpedomega.setAllBaseStats(70, 140, 70, 110, 65, 105);
    	sharpedomega.setWeight(130.3);
    	pokedex.put("Sharpedo-Mega", sharpedomega);

    	Pokemon shaymin = new Pokemon("Shaymin");
    	shaymin.setTypes("Grass", "(none)");
    	shaymin.setAbility("Natural Cure");
    	shaymin.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	shaymin.setWeight(2.1);
    	pokedex.put("Shaymin", shaymin);

    	Pokemon shayminsky = new Pokemon("Shaymin-Sky");
    	shayminsky.setTypes("Grass", "Flying");
    	shayminsky.setAbility("Serene Grace");
    	shayminsky.setAllBaseStats(100, 103, 75, 120, 75, 127);
    	shayminsky.setWeight(5.2);
    	pokedex.put("Shaymin-Sky", shayminsky);

    	Pokemon shedinja = new Pokemon("Shedinja");
    	shedinja.setTypes("Bug", "Ghost");
    	shedinja.setAbility("Wonder Guard");
    	shedinja.setAllBaseStats(1, 90, 45, 30, 30, 40);
    	shedinja.setWeight(1.2);
    	pokedex.put("Shedinja", shedinja);

    	Pokemon shelgon = new Pokemon("Shelgon");
    	shelgon.setTypes("Dragon", "(none)");
    	shelgon.setAbility("Rock Head");
    	shelgon.setAllBaseStats(65, 95, 100, 60, 50, 50);
    	shelgon.setWeight(110.5);
    	pokedex.put("Shelgon", shelgon);

    	Pokemon shellder = new Pokemon("Shellder");
    	shellder.setTypes("Water", "(none)");
    	shellder.setAbility("Shell Armor");
    	shellder.setAllBaseStats(30, 65, 100, 45, 25, 40);
    	shellder.setWeight(4.0);
    	pokedex.put("Shellder", shellder);

    	Pokemon shellos = new Pokemon("Shellos");
    	shellos.setTypes("Water", "(none)");
    	shellos.setAbility("Sticky Hold");
    	shellos.setAllBaseStats(76, 48, 48, 57, 62, 34);
    	shellos.setWeight(6.3);
    	pokedex.put("Shellos", shellos);

    	Pokemon shelmet = new Pokemon("Shelmet");
    	shelmet.setTypes("Bug", "(none)");
    	shelmet.setAbility("Hydration");
    	shelmet.setAllBaseStats(50, 40, 85, 40, 65, 25);
    	shelmet.setWeight(7.7);
    	pokedex.put("Shelmet", shelmet);

    	Pokemon shieldon = new Pokemon("Shieldon");
    	shieldon.setTypes("Rock", "Steel");
    	shieldon.setAbility("Sturdy");
    	shieldon.setAllBaseStats(30, 42, 118, 42, 88, 30);
    	shieldon.setWeight(57.0);
    	pokedex.put("Shieldon", shieldon);

    	Pokemon shiftry = new Pokemon("Shiftry");
    	shiftry.setTypes("Grass", "Dark");
    	shiftry.setAbility("Chlorophyll");
    	shiftry.setAllBaseStats(90, 100, 60, 90, 60, 80);
    	shiftry.setWeight(59.6);
    	pokedex.put("Shiftry", shiftry);

    	Pokemon shiinotic = new Pokemon("Shiinotic");
    	shiinotic.setTypes("Grass", "Fairy");
    	shiinotic.setAbility("Illuminate");
    	shiinotic.setAllBaseStats(60, 45, 80, 90, 100, 30);
    	shiinotic.setWeight(11.5);
    	pokedex.put("Shiinotic", shiinotic);

    	Pokemon shinx = new Pokemon("Shinx");
    	shinx.setTypes("Electric", "(none)");
    	shinx.setAbility("Rivalry");
    	shinx.setAllBaseStats(45, 65, 34, 40, 34, 45);
    	shinx.setWeight(9.5);
    	pokedex.put("Shinx", shinx);

    	Pokemon shroomish = new Pokemon("Shroomish");
    	shroomish.setTypes("Grass", "(none)");
    	shroomish.setAbility("Effect Spore");
    	shroomish.setAllBaseStats(60, 40, 60, 40, 60, 35);
    	shroomish.setWeight(4.5);
    	pokedex.put("Shroomish", shroomish);

    	Pokemon shuckle = new Pokemon("Shuckle");
    	shuckle.setTypes("Bug", "Rock");
    	shuckle.setAbility("Sturdy");
    	shuckle.setAllBaseStats(20, 10, 230, 10, 230, 5);
    	shuckle.setWeight(20.5);
    	pokedex.put("Shuckle", shuckle);

    	Pokemon shuppet = new Pokemon("Shuppet");
    	shuppet.setTypes("Ghost", "(none)");
    	shuppet.setAbility("Insomnia");
    	shuppet.setAllBaseStats(44, 75, 35, 63, 33, 45);
    	shuppet.setWeight(2.3);
    	pokedex.put("Shuppet", shuppet);

    	Pokemon sigilyph = new Pokemon("Sigilyph");
    	sigilyph.setTypes("Psychic", "Flying");
    	sigilyph.setAbility("Wonder Skin");
    	sigilyph.setAllBaseStats(72, 58, 80, 103, 80, 97);
    	sigilyph.setWeight(14.0);
    	pokedex.put("Sigilyph", sigilyph);

    	Pokemon silcoon = new Pokemon("Silcoon");
    	silcoon.setTypes("Bug", "(none)");
    	silcoon.setAbility("Shed Skin");
    	silcoon.setAllBaseStats(50, 35, 55, 25, 25, 15);
    	silcoon.setWeight(10.0);
    	pokedex.put("Silcoon", silcoon);

    	Pokemon silvally = new Pokemon("Silvally");
    	silvally.setTypes("Normal", "(none)");
    	silvally.setAbility("RKS System");
    	silvally.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvally.setWeight(100.5);
    	pokedex.put("Silvally", silvally);

    	Pokemon silvallybug = new Pokemon("Silvally-Bug");
    	silvallybug.setTypes("Bug", "(none)");
    	silvallybug.setAbility("RKS System");
    	silvallybug.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallybug.setWeight(100.5);
    	pokedex.put("Silvally-Bug", silvallybug);

    	Pokemon silvallydark = new Pokemon("Silvally-Dark");
    	silvallydark.setTypes("Dark", "(none)");
    	silvallydark.setAbility("RKS System");
    	silvallydark.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallydark.setWeight(100.5);
    	pokedex.put("Silvally-Dark", silvallydark);

    	Pokemon silvallydragon = new Pokemon("Silvally-Dragon");
    	silvallydragon.setTypes("Dragon", "(none)");
    	silvallydragon.setAbility("RKS System");
    	silvallydragon.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallydragon.setWeight(100.5);
    	pokedex.put("Silvally-Dragon", silvallydragon);

    	Pokemon silvallyelectric = new Pokemon("Silvally-Electric");
    	silvallyelectric.setTypes("Electric", "(none)");
    	silvallyelectric.setAbility("RKS System");
    	silvallyelectric.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallyelectric.setWeight(100.5);
    	pokedex.put("Silvally-Electric", silvallyelectric);

    	Pokemon silvallyfairy = new Pokemon("Silvally-Fairy");
    	silvallyfairy.setTypes("Fairy", "(none)");
    	silvallyfairy.setAbility("RKS System");
    	silvallyfairy.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallyfairy.setWeight(100.5);
    	pokedex.put("Silvally-Fairy", silvallyfairy);

    	Pokemon silvallyfighting = new Pokemon("Silvally-Fighting");
    	silvallyfighting.setTypes("Fighting", "(none)");
    	silvallyfighting.setAbility("RKS System");
    	silvallyfighting.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallyfighting.setWeight(100.5);
    	pokedex.put("Silvally-Fighting", silvallyfighting);

    	Pokemon silvallyfire = new Pokemon("Silvally-Fire");
    	silvallyfire.setTypes("Fire", "(none)");
    	silvallyfire.setAbility("RKS System");
    	silvallyfire.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallyfire.setWeight(100.5);
    	pokedex.put("Silvally-Fire", silvallyfire);

    	Pokemon silvallyflying = new Pokemon("Silvally-Flying");
    	silvallyflying.setTypes("Flying", "(none)");
    	silvallyflying.setAbility("RKS System");
    	silvallyflying.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallyflying.setWeight(100.5);
    	pokedex.put("Silvally-Flying", silvallyflying);

    	Pokemon silvallyghost = new Pokemon("Silvally-Ghost");
    	silvallyghost.setTypes("Ghost", "(none)");
    	silvallyghost.setAbility("RKS System");
    	silvallyghost.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallyghost.setWeight(100.5);
    	pokedex.put("Silvally-Ghost", silvallyghost);

    	Pokemon silvallygrass = new Pokemon("Silvally-Grass");
    	silvallygrass.setTypes("Grass", "(none)");
    	silvallygrass.setAbility("RKS System");
    	silvallygrass.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallygrass.setWeight(100.5);
    	pokedex.put("Silvally-Grass", silvallygrass);

    	Pokemon silvallyground = new Pokemon("Silvally-Ground");
    	silvallyground.setTypes("Ground", "(none)");
    	silvallyground.setAbility("RKS System");
    	silvallyground.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallyground.setWeight(100.5);
    	pokedex.put("Silvally-Ground", silvallyground);

    	Pokemon silvallyice = new Pokemon("Silvally-Ice");
    	silvallyice.setTypes("Ice", "(none)");
    	silvallyice.setAbility("RKS System");
    	silvallyice.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallyice.setWeight(100.5);
    	pokedex.put("Silvally-Ice", silvallyice);

    	Pokemon silvallypoison = new Pokemon("Silvally-Poison");
    	silvallypoison.setTypes("Poison", "(none)");
    	silvallypoison.setAbility("RKS System");
    	silvallypoison.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallypoison.setWeight(100.5);
    	pokedex.put("Silvally-Poison", silvallypoison);

    	Pokemon silvallypsychic = new Pokemon("Silvally-Psychic");
    	silvallypsychic.setTypes("Psychic", "(none)");
    	silvallypsychic.setAbility("RKS System");
    	silvallypsychic.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallypsychic.setWeight(100.5);
    	pokedex.put("Silvally-Psychic", silvallypsychic);

    	Pokemon silvallyrock = new Pokemon("Silvally-Rock");
    	silvallyrock.setTypes("Rock", "(none)");
    	silvallyrock.setAbility("RKS System");
    	silvallyrock.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallyrock.setWeight(100.5);
    	pokedex.put("Silvally-Rock", silvallyrock);

    	Pokemon silvallysteel = new Pokemon("Silvally-Steel");
    	silvallysteel.setTypes("Steel", "(none)");
    	silvallysteel.setAbility("RKS System");
    	silvallysteel.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallysteel.setWeight(100.5);
    	pokedex.put("Silvally-Steel", silvallysteel);

    	Pokemon silvallywater = new Pokemon("Silvally-Water");
    	silvallywater.setTypes("Water", "(none)");
    	silvallywater.setAbility("RKS System");
    	silvallywater.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallywater.setWeight(100.5);
    	pokedex.put("Silvally-Water", silvallywater);

    	Pokemon simipour = new Pokemon("Simipour");
    	simipour.setTypes("Water", "(none)");
    	simipour.setAbility("Gluttony");
    	simipour.setAllBaseStats(75, 98, 63, 98, 63, 101);
    	simipour.setWeight(29.0);
    	pokedex.put("Simipour", simipour);

    	Pokemon simisage = new Pokemon("Simisage");
    	simisage.setTypes("Grass", "(none)");
    	simisage.setAbility("Gluttony");
    	simisage.setAllBaseStats(75, 98, 63, 98, 63, 101);
    	simisage.setWeight(30.5);
    	pokedex.put("Simisage", simisage);

    	Pokemon simisear = new Pokemon("Simisear");
    	simisear.setTypes("Fire", "(none)");
    	simisear.setAbility("Gluttony");
    	simisear.setAllBaseStats(75, 98, 63, 98, 63, 101);
    	simisear.setWeight(28.0);
    	pokedex.put("Simisear", simisear);

    	Pokemon skarmory = new Pokemon("Skarmory");
    	skarmory.setTypes("Steel", "Flying");
    	skarmory.setAbility("Keen Eye");
    	skarmory.setAllBaseStats(65, 80, 140, 40, 70, 70);
    	skarmory.setWeight(50.5);
    	pokedex.put("Skarmory", skarmory);

    	Pokemon skiddo = new Pokemon("Skiddo");
    	skiddo.setTypes("Grass", "(none)");
    	skiddo.setAbility("Sap Sipper");
    	skiddo.setAllBaseStats(66, 65, 48, 62, 57, 52);
    	skiddo.setWeight(31.0);
    	pokedex.put("Skiddo", skiddo);

    	Pokemon skiploom = new Pokemon("Skiploom");
    	skiploom.setTypes("Grass", "Flying");
    	skiploom.setAbility("Chlorophyll");
    	skiploom.setAllBaseStats(55, 45, 50, 45, 65, 80);
    	skiploom.setWeight(1.0);
    	pokedex.put("Skiploom", skiploom);

    	Pokemon skitty = new Pokemon("Skitty");
    	skitty.setTypes("Normal", "(none)");
    	skitty.setAbility("Cute Charm");
    	skitty.setAllBaseStats(50, 45, 45, 35, 35, 50);
    	skitty.setWeight(11.0);
    	pokedex.put("Skitty", skitty);

    	Pokemon skorupi = new Pokemon("Skorupi");
    	skorupi.setTypes("Poison", "Bug");
    	skorupi.setAbility("Battle Armor");
    	skorupi.setAllBaseStats(40, 50, 90, 30, 55, 65);
    	skorupi.setWeight(12.0);
    	pokedex.put("Skorupi", skorupi);

    	Pokemon skrelp = new Pokemon("Skrelp");
    	skrelp.setTypes("Poison", "Water");
    	skrelp.setAbility("Poison Point");
    	skrelp.setAllBaseStats(50, 60, 60, 60, 60, 30);
    	skrelp.setWeight(7.3);
    	pokedex.put("Skrelp", skrelp);

    	Pokemon skuntank = new Pokemon("Skuntank");
    	skuntank.setTypes("Poison", "Dark");
    	skuntank.setAbility("Stench");
    	skuntank.setAllBaseStats(103, 93, 67, 71, 61, 84);
    	skuntank.setWeight(38.0);
    	pokedex.put("Skuntank", skuntank);

    	Pokemon slaking = new Pokemon("Slaking");
    	slaking.setTypes("Normal", "(none)");
    	slaking.setAbility("Truant");
    	slaking.setAllBaseStats(150, 160, 100, 95, 65, 100);
    	slaking.setWeight(130.5);
    	pokedex.put("Slaking", slaking);

    	Pokemon slakoth = new Pokemon("Slakoth");
    	slakoth.setTypes("Normal", "(none)");
    	slakoth.setAbility("Truant");
    	slakoth.setAllBaseStats(60, 60, 60, 35, 35, 30);
    	slakoth.setWeight(24.0);
    	pokedex.put("Slakoth", slakoth);

    	Pokemon sliggoo = new Pokemon("Sliggoo");
    	sliggoo.setTypes("Dragon", "(none)");
    	sliggoo.setAbility("Sap Sipper");
    	sliggoo.setAllBaseStats(68, 75, 53, 83, 113, 60);
    	sliggoo.setWeight(17.5);
    	pokedex.put("Sliggoo", sliggoo);

    	Pokemon slowbro = new Pokemon("Slowbro");
    	slowbro.setTypes("Water", "Psychic");
    	slowbro.setAbility("Oblivious");
    	slowbro.setAllBaseStats(95, 75, 110, 100, 80, 30);
    	slowbro.setWeight(78.5);
    	slowbro.setFormes("Slowbro", "Slowbro-Mega");
    	pokedex.put("Slowbro", slowbro);

    	Pokemon slowbromega = new Pokemon("Slowbro-Mega");
    	slowbromega.setTypes("Water", "Psychic");
    	slowbromega.setAbility("Shell Armor");
    	slowbromega.setAllBaseStats(95, 75, 180, 130, 80, 30);
    	slowbromega.setWeight(120.0);
    	pokedex.put("Slowbro-Mega", slowbromega);

    	Pokemon slowking = new Pokemon("Slowking");
    	slowking.setTypes("Water", "Psychic");
    	slowking.setAbility("Oblivious");
    	slowking.setAllBaseStats(95, 75, 80, 100, 110, 30);
    	slowking.setWeight(79.5);
    	pokedex.put("Slowking", slowking);

    	Pokemon slowpoke = new Pokemon("Slowpoke");
    	slowpoke.setTypes("Water", "Psychic");
    	slowpoke.setAbility("Oblivious");
    	slowpoke.setAllBaseStats(90, 65, 65, 40, 40, 15);
    	slowpoke.setWeight(36.0);
    	pokedex.put("Slowpoke", slowpoke);

    	Pokemon slugma = new Pokemon("Slugma");
    	slugma.setTypes("Fire", "(none)");
    	slugma.setAbility("Magma Armor");
    	slugma.setAllBaseStats(40, 40, 40, 70, 40, 20);
    	slugma.setWeight(35.0);
    	pokedex.put("Slugma", slugma);

    	Pokemon slurpuff = new Pokemon("Slurpuff");
    	slurpuff.setTypes("Fairy", "(none)");
    	slurpuff.setAbility("Unburden");
    	slurpuff.setAllBaseStats(82, 80, 86, 85, 75, 72);
    	slurpuff.setWeight(5.0);
    	pokedex.put("Slurpuff", slurpuff);

    	Pokemon smeargle = new Pokemon("Smeargle");
    	smeargle.setTypes("Normal", "(none)");
    	smeargle.setAbility("Moody");
    	smeargle.setAllBaseStats(55, 20, 35, 20, 45, 75);
    	smeargle.setWeight(58.0);
    	pokedex.put("Smeargle", smeargle);

    	Pokemon smoochum = new Pokemon("Smoochum");
    	smoochum.setTypes("Ice", "Psychic");
    	smoochum.setAbility("Oblivious");
    	smoochum.setAllBaseStats(45, 30, 15, 85, 65, 65);
    	smoochum.setWeight(6.0);
    	pokedex.put("Smoochum", smoochum);

    	Pokemon sneasel = new Pokemon("Sneasel");
    	sneasel.setTypes("Dark", "Ice");
    	sneasel.setAbility("Inner Focus");
    	sneasel.setAllBaseStats(55, 95, 55, 35, 75, 115);
    	sneasel.setWeight(28.0);
    	pokedex.put("Sneasel", sneasel);

    	Pokemon snivy = new Pokemon("Snivy");
    	snivy.setTypes("Grass", "(none)");
    	snivy.setAbility("Overgrow");
    	snivy.setAllBaseStats(45, 45, 55, 45, 55, 63);
    	snivy.setWeight(8.1);
    	pokedex.put("Snivy", snivy);

    	Pokemon snorlax = new Pokemon("Snorlax");
    	snorlax.setTypes("Normal", "(none)");
    	snorlax.setAbility("Gluttony");
    	snorlax.setAllBaseStats(160, 110, 65, 65, 110, 30);
    	snorlax.setWeight(460.0);
    	pokedex.put("Snorlax", snorlax);

    	Pokemon snorunt = new Pokemon("Snorunt");
    	snorunt.setTypes("Ice", "(none)");
    	snorunt.setAbility("Inner Focus");
    	snorunt.setAllBaseStats(50, 50, 50, 50, 50, 50);
    	snorunt.setWeight(16.8);
    	pokedex.put("Snorunt", snorunt);

    	Pokemon snover = new Pokemon("Snover");
    	snover.setTypes("Grass", "Ice");
    	snover.setAbility("Snow Warning");
    	snover.setAllBaseStats(60, 62, 50, 62, 60, 40);
    	snover.setWeight(50.5);
    	pokedex.put("Snover", snover);

    	Pokemon snubbull = new Pokemon("Snubbull");
    	snubbull.setTypes("Fairy", "(none)");
    	snubbull.setAbility("Intimidate");
    	snubbull.setAllBaseStats(60, 80, 50, 40, 40, 30);
    	snubbull.setWeight(7.8);
    	pokedex.put("Snubbull", snubbull);

    	Pokemon snugglow = new Pokemon("Snugglow");
    	snugglow.setTypes("Electric", "Poison");
    	snugglow.setAbility("Storm Drain");
    	snugglow.setAllBaseStats(40, 37, 79, 91, 68, 70);
    	snugglow.setWeight(6.0);
    	pokedex.put("Snugglow", snugglow);

    	Pokemon solgaleo = new Pokemon("Solgaleo");
    	solgaleo.setTypes("Psychic", "Steel");
    	solgaleo.setAbility("Full Metal Body");
    	solgaleo.setAllBaseStats(137, 137, 107, 113, 89, 97);
    	solgaleo.setWeight(230.0);
    	pokedex.put("Solgaleo", solgaleo);

    	Pokemon solosis = new Pokemon("Solosis");
    	solosis.setTypes("Psychic", "(none)");
    	solosis.setAbility("Overcoat");
    	solosis.setAllBaseStats(45, 30, 40, 105, 50, 20);
    	solosis.setWeight(1.0);
    	pokedex.put("Solosis", solosis);

    	Pokemon solrock = new Pokemon("Solrock");
    	solrock.setTypes("Rock", "Psychic");
    	solrock.setAbility("Levitate");
    	solrock.setAllBaseStats(90, 95, 85, 55, 65, 70);
    	solrock.setWeight(154.0);
    	pokedex.put("Solrock", solrock);

    	Pokemon spearow = new Pokemon("Spearow");
    	spearow.setTypes("Normal", "Flying");
    	spearow.setAbility("Keen Eye");
    	spearow.setAllBaseStats(40, 60, 30, 31, 31, 70);
    	spearow.setWeight(2.0);
    	pokedex.put("Spearow", spearow);

    	Pokemon spewpa = new Pokemon("Spewpa");
    	spewpa.setTypes("Bug", "(none)");
    	spewpa.setAbility("Shed Skin");
    	spewpa.setAllBaseStats(45, 22, 60, 27, 30, 29);
    	spewpa.setWeight(8.4);
    	pokedex.put("Spewpa", spewpa);

    	Pokemon spheal = new Pokemon("Spheal");
    	spheal.setTypes("Ice", "Water");
    	spheal.setAbility("Thick Fat");
    	spheal.setAllBaseStats(70, 40, 50, 55, 50, 25);
    	spheal.setWeight(39.5);
    	pokedex.put("Spheal", spheal);

    	Pokemon spinarak = new Pokemon("Spinarak");
    	spinarak.setTypes("Bug", "Poison");
    	spinarak.setAbility("Swarm");
    	spinarak.setAllBaseStats(40, 60, 40, 40, 40, 30);
    	spinarak.setWeight(8.5);
    	pokedex.put("Spinarak", spinarak);

    	Pokemon spinda = new Pokemon("Spinda");
    	spinda.setTypes("Normal", "(none)");
    	spinda.setAbility("Own Tempo");
    	spinda.setAllBaseStats(60, 60, 60, 60, 60, 60);
    	spinda.setWeight(5.0);
    	pokedex.put("Spinda", spinda);

    	Pokemon spiritomb = new Pokemon("Spiritomb");
    	spiritomb.setTypes("Ghost", "Dark");
    	spiritomb.setAbility("Pressure");
    	spiritomb.setAllBaseStats(50, 92, 108, 92, 108, 35);
    	spiritomb.setWeight(108.0);
    	pokedex.put("Spiritomb", spiritomb);

    	Pokemon spoink = new Pokemon("Spoink");
    	spoink.setTypes("Psychic", "(none)");
    	spoink.setAbility("Thick Fat");
    	spoink.setAllBaseStats(60, 25, 35, 70, 80, 60);
    	spoink.setWeight(30.6);
    	pokedex.put("Spoink", spoink);

    	Pokemon spritzee = new Pokemon("Spritzee");
    	spritzee.setTypes("Fairy", "(none)");
    	spritzee.setAbility("Healer");
    	spritzee.setAllBaseStats(78, 52, 60, 63, 65, 23);
    	spritzee.setWeight(0.5);
    	pokedex.put("Spritzee", spritzee);

    	Pokemon squirtle = new Pokemon("Squirtle");
    	squirtle.setTypes("Water", "(none)");
    	squirtle.setAbility("Torrent");
    	squirtle.setAllBaseStats(44, 48, 65, 50, 64, 43);
    	squirtle.setWeight(9.0);
    	pokedex.put("Squirtle", squirtle);

    	Pokemon stakataka = new Pokemon("Stakataka");
    	stakataka.setTypes("Rock", "Steel");
    	stakataka.setAbility("Beast Boost");
    	stakataka.setAllBaseStats(61, 131, 211, 53, 101, 13);
    	stakataka.setWeight(820.0);
    	pokedex.put("Stakataka", stakataka);

    	Pokemon stantler = new Pokemon("Stantler");
    	stantler.setTypes("Normal", "(none)");
    	stantler.setAbility("Intimidate");
    	stantler.setAllBaseStats(73, 95, 62, 85, 65, 85);
    	stantler.setWeight(71.2);
    	pokedex.put("Stantler", stantler);

    	Pokemon staraptor = new Pokemon("Staraptor");
    	staraptor.setTypes("Normal", "Flying");
    	staraptor.setAbility("Intimidate");
    	staraptor.setAllBaseStats(85, 120, 70, 50, 60, 100);
    	staraptor.setWeight(24.9);
    	pokedex.put("Staraptor", staraptor);

    	Pokemon staravia = new Pokemon("Staravia");
    	staravia.setTypes("Normal", "Flying");
    	staravia.setAbility("Intimidate");
    	staravia.setAllBaseStats(55, 75, 50, 40, 40, 80);
    	staravia.setWeight(15.5);
    	pokedex.put("Staravia", staravia);

    	Pokemon starly = new Pokemon("Starly");
    	starly.setTypes("Normal", "Flying");
    	starly.setAbility("Keen Eye");
    	starly.setAllBaseStats(40, 55, 30, 30, 30, 60);
    	starly.setWeight(2.0);
    	pokedex.put("Starly", starly);

    	Pokemon starmie = new Pokemon("Starmie");
    	starmie.setTypes("Water", "Psychic");
    	starmie.setAbility("Illuminate");
    	starmie.setAllBaseStats(60, 75, 85, 100, 85, 115);
    	starmie.setWeight(80.0);
    	pokedex.put("Starmie", starmie);

    	Pokemon staryu = new Pokemon("Staryu");
    	staryu.setTypes("Water", "(none)");
    	staryu.setAbility("Illuminate");
    	staryu.setAllBaseStats(30, 45, 55, 70, 55, 85);
    	staryu.setWeight(34.5);
    	pokedex.put("Staryu", staryu);

    	Pokemon steelix = new Pokemon("Steelix");
    	steelix.setTypes("Steel", "Ground");
    	steelix.setAbility("Rock Head");
    	steelix.setAllBaseStats(75, 85, 200, 55, 65, 30);
    	steelix.setWeight(400.0);
    	steelix.setFormes("Steelix", "Steelix-Mega");
    	pokedex.put("Steelix", steelix);

    	Pokemon steelixmega = new Pokemon("Steelix-Mega");
    	steelixmega.setTypes("Steel", "Ground");
    	steelixmega.setAbility("Sand Force");
    	steelixmega.setAllBaseStats(75, 125, 230, 55, 95, 30);
    	steelixmega.setWeight(740.0);
    	pokedex.put("Steelix-Mega", steelixmega);

    	Pokemon steenee = new Pokemon("Steenee");
    	steenee.setTypes("Grass", "(none)");
    	steenee.setAbility("Leaf Guard");
    	steenee.setAllBaseStats(52, 40, 48, 40, 48, 62);
    	steenee.setWeight(8.2);
    	pokedex.put("Steenee", steenee);

    	Pokemon stoutland = new Pokemon("Stoutland");
    	stoutland.setTypes("Normal", "(none)");
    	stoutland.setAbility("Intimidate");
    	stoutland.setAllBaseStats(85, 110, 90, 45, 90, 80);
    	stoutland.setWeight(61.0);
    	pokedex.put("Stoutland", stoutland);

    	Pokemon stratagem = new Pokemon("Stratagem");
    	stratagem.setTypes("Rock", "(none)");
    	stratagem.setAbility("Levitate");
    	stratagem.setAllBaseStats(90, 60, 65, 120, 70, 130);
    	stratagem.setWeight(45.0);
    	pokedex.put("Stratagem", stratagem);

    	Pokemon stufful = new Pokemon("Stufful");
    	stufful.setTypes("Normal", "Fighting");
    	stufful.setAbility("Fluffy");
    	stufful.setAllBaseStats(70, 75, 50, 45, 50, 50);
    	stufful.setWeight(6.8);
    	pokedex.put("Stufful", stufful);

    	Pokemon stunfisk = new Pokemon("Stunfisk");
    	stunfisk.setTypes("Ground", "Electric");
    	stunfisk.setAbility("Static");
    	stunfisk.setAllBaseStats(109, 66, 84, 81, 99, 32);
    	stunfisk.setWeight(11.0);
    	pokedex.put("Stunfisk", stunfisk);

    	Pokemon stunky = new Pokemon("Stunky");
    	stunky.setTypes("Poison", "Dark");
    	stunky.setAbility("Stench");
    	stunky.setAllBaseStats(63, 63, 47, 41, 41, 74);
    	stunky.setWeight(19.2);
    	pokedex.put("Stunky", stunky);

    	Pokemon sudowoodo = new Pokemon("Sudowoodo");
    	sudowoodo.setTypes("Rock", "(none)");
    	sudowoodo.setAbility("Sturdy");
    	sudowoodo.setAllBaseStats(70, 100, 115, 30, 65, 30);
    	sudowoodo.setWeight(38.0);
    	pokedex.put("Sudowoodo", sudowoodo);

    	Pokemon suicune = new Pokemon("Suicune");
    	suicune.setTypes("Water", "(none)");
    	suicune.setAbility("Pressure");
    	suicune.setAllBaseStats(100, 75, 115, 90, 115, 85);
    	suicune.setWeight(187.0);
    	pokedex.put("Suicune", suicune);

    	Pokemon sunflora = new Pokemon("Sunflora");
    	sunflora.setTypes("Grass", "(none)");
    	sunflora.setAbility("Chlorophyll");
    	sunflora.setAllBaseStats(75, 75, 55, 105, 85, 30);
    	sunflora.setWeight(8.5);
    	pokedex.put("Sunflora", sunflora);

    	Pokemon sunkern = new Pokemon("Sunkern");
    	sunkern.setTypes("Grass", "(none)");
    	sunkern.setAbility("Chlorophyll");
    	sunkern.setAllBaseStats(30, 30, 30, 30, 30, 30);
    	sunkern.setWeight(1.8);
    	pokedex.put("Sunkern", sunkern);

    	Pokemon surskit = new Pokemon("Surskit");
    	surskit.setTypes("Bug", "Water");
    	surskit.setAbility("Swift Swim");
    	surskit.setAllBaseStats(40, 30, 32, 50, 52, 65);
    	surskit.setWeight(1.7);
    	pokedex.put("Surskit", surskit);

    	Pokemon swablu = new Pokemon("Swablu");
    	swablu.setTypes("Normal", "Flying");
    	swablu.setAbility("Natural Cure");
    	swablu.setAllBaseStats(45, 40, 60, 40, 75, 50);
    	swablu.setWeight(1.2);
    	pokedex.put("Swablu", swablu);

    	Pokemon swadloon = new Pokemon("Swadloon");
    	swadloon.setTypes("Bug", "Grass");
    	swadloon.setAbility("Leaf Guard");
    	swadloon.setAllBaseStats(55, 63, 90, 50, 80, 42);
    	swadloon.setWeight(7.3);
    	pokedex.put("Swadloon", swadloon);

    	Pokemon swalot = new Pokemon("Swalot");
    	swalot.setTypes("Poison", "(none)");
    	swalot.setAbility("Liquid Ooze");
    	swalot.setAllBaseStats(100, 73, 83, 73, 83, 55);
    	swalot.setWeight(80.0);
    	pokedex.put("Swalot", swalot);

    	Pokemon swampert = new Pokemon("Swampert");
    	swampert.setTypes("Water", "Ground");
    	swampert.setAbility("Torrent");
    	swampert.setAllBaseStats(100, 110, 90, 85, 90, 60);
    	swampert.setWeight(81.9);
    	swampert.setFormes("Swampert", "Swampert-Mega");
    	pokedex.put("Swampert", swampert);

    	Pokemon swampertmega = new Pokemon("Swampert-Mega");
    	swampertmega.setTypes("Water", "Ground");
    	swampertmega.setAbility("Swift Swim");
    	swampertmega.setAllBaseStats(100, 150, 110, 95, 110, 70);
    	swampertmega.setWeight(102.0);
    	pokedex.put("Swampert-Mega", swampertmega);

    	Pokemon swanna = new Pokemon("Swanna");
    	swanna.setTypes("Water", "Flying");
    	swanna.setAbility("Keen Eye");
    	swanna.setAllBaseStats(75, 87, 63, 87, 63, 98);
    	swanna.setWeight(24.2);
    	pokedex.put("Swanna", swanna);

    	Pokemon swellow = new Pokemon("Swellow");
    	swellow.setTypes("Normal", "Flying");
    	swellow.setAbility("Guts");
    	swellow.setAllBaseStats(60, 85, 60, 75, 50, 125);
    	swellow.setWeight(19.8);
    	pokedex.put("Swellow", swellow);

    	Pokemon swinub = new Pokemon("Swinub");
    	swinub.setTypes("Ice", "Ground");
    	swinub.setAbility("Oblivious");
    	swinub.setAllBaseStats(50, 50, 40, 30, 30, 50);
    	swinub.setWeight(6.5);
    	pokedex.put("Swinub", swinub);

    	Pokemon swirlix = new Pokemon("Swirlix");
    	swirlix.setTypes("Fairy", "(none)");
    	swirlix.setAbility("Sweet Veil");
    	swirlix.setAllBaseStats(62, 48, 66, 59, 57, 49);
    	swirlix.setWeight(3.5);
    	pokedex.put("Swirlix", swirlix);

    	Pokemon swoobat = new Pokemon("Swoobat");
    	swoobat.setTypes("Psychic", "Flying");
    	swoobat.setAbility("Unaware");
    	swoobat.setAllBaseStats(67, 57, 55, 77, 55, 114);
    	swoobat.setWeight(10.5);
    	pokedex.put("Swoobat", swoobat);

    	Pokemon syclant = new Pokemon("Syclant");
    	syclant.setTypes("Ice", "Bug");
    	syclant.setAbility("Compound Eyes");
    	syclant.setAllBaseStats(70, 116, 70, 114, 64, 121);
    	syclant.setWeight(52.0);
    	pokedex.put("Syclant", syclant);

    	Pokemon syclar = new Pokemon("Syclar");
    	syclar.setTypes("Ice", "Bug");
    	syclar.setAbility("Compound Eyes");
    	syclar.setAllBaseStats(40, 76, 45, 74, 39, 91);
    	syclar.setWeight(4.0);
    	pokedex.put("Syclar", syclar);

    	Pokemon sylveon = new Pokemon("Sylveon");
    	sylveon.setTypes("Fairy", "(none)");
    	sylveon.setAbility("Pixilate");
    	sylveon.setAllBaseStats(95, 65, 65, 110, 130, 60);
    	sylveon.setWeight(23.5);
    	pokedex.put("Sylveon", sylveon);

    	Pokemon tactite = new Pokemon("Tactite");
    	tactite.setTypes("Rock", "(none)");
    	tactite.setAbility("Levitate");
    	tactite.setAllBaseStats(70, 40, 65, 100, 65, 95);
    	tactite.setWeight(16.0);
    	pokedex.put("Tactite", tactite);

    	Pokemon taillow = new Pokemon("Taillow");
    	taillow.setTypes("Normal", "Flying");
    	taillow.setAbility("Guts");
    	taillow.setAllBaseStats(40, 55, 30, 30, 30, 85);
    	taillow.setWeight(2.3);
    	pokedex.put("Taillow", taillow);

    	Pokemon talonflame = new Pokemon("Talonflame");
    	talonflame.setTypes("Fire", "Flying");
    	talonflame.setAbility("Flame Body");
    	talonflame.setAllBaseStats(78, 81, 71, 74, 69, 126);
    	talonflame.setWeight(24.5);
    	pokedex.put("Talonflame", talonflame);

    	Pokemon tangela = new Pokemon("Tangela");
    	tangela.setTypes("Grass", "(none)");
    	tangela.setAbility("Chlorophyll");
    	tangela.setAllBaseStats(65, 55, 115, 100, 40, 60);
    	tangela.setWeight(35.0);
    	pokedex.put("Tangela", tangela);

    	Pokemon tangrowth = new Pokemon("Tangrowth");
    	tangrowth.setTypes("Grass", "(none)");
    	tangrowth.setAbility("Chlorophyll");
    	tangrowth.setAllBaseStats(100, 100, 125, 110, 50, 50);
    	tangrowth.setWeight(128.6);
    	pokedex.put("Tangrowth", tangrowth);

    	Pokemon tapubulu = new Pokemon("Tapu Bulu");
    	tapubulu.setTypes("Grass", "Fairy");
    	tapubulu.setAbility("Grassy Surge");
    	tapubulu.setAllBaseStats(70, 130, 115, 85, 95, 75);
    	tapubulu.setWeight(45.5);
    	pokedex.put("Tapu Bulu", tapubulu);

    	Pokemon tapufini = new Pokemon("Tapu Fini");
    	tapufini.setTypes("Water", "Fairy");
    	tapufini.setAbility("Misty Surge");
    	tapufini.setAllBaseStats(70, 75, 115, 95, 130, 85);
    	tapufini.setWeight(21.2);
    	pokedex.put("Tapu Fini", tapufini);

    	Pokemon tapukoko = new Pokemon("Tapu Koko");
    	tapukoko.setTypes("Electric", "Fairy");
    	tapukoko.setAbility("Electric Surge");
    	tapukoko.setAllBaseStats(70, 115, 85, 95, 75, 130);
    	tapukoko.setWeight(20.5);
    	pokedex.put("Tapu Koko", tapukoko);

    	Pokemon tapulele = new Pokemon("Tapu Lele");
    	tapulele.setTypes("Psychic", "Fairy");
    	tapulele.setAbility("Psychic Surge");
    	tapulele.setAllBaseStats(70, 85, 75, 130, 115, 95);
    	tapulele.setWeight(18.6);
    	pokedex.put("Tapu Lele", tapulele);

    	Pokemon tauros = new Pokemon("Tauros");
    	tauros.setTypes("Normal", "(none)");
    	tauros.setAbility("Intimidate");
    	tauros.setAllBaseStats(75, 100, 95, 40, 70, 110);
    	tauros.setWeight(88.4);
    	pokedex.put("Tauros", tauros);

    	Pokemon teddiursa = new Pokemon("Teddiursa");
    	teddiursa.setTypes("Normal", "(none)");
    	teddiursa.setAbility("Pickup");
    	teddiursa.setAllBaseStats(60, 80, 50, 50, 50, 40);
    	teddiursa.setWeight(8.8);
    	pokedex.put("Teddiursa", teddiursa);

    	Pokemon tentacool = new Pokemon("Tentacool");
    	tentacool.setTypes("Water", "Poison");
    	tentacool.setAbility("Clear Body");
    	tentacool.setAllBaseStats(40, 40, 35, 50, 100, 70);
    	tentacool.setWeight(45.5);
    	pokedex.put("Tentacool", tentacool);

    	Pokemon tentacruel = new Pokemon("Tentacruel");
    	tentacruel.setTypes("Water", "Poison");
    	tentacruel.setAbility("Clear Body");
    	tentacruel.setAllBaseStats(80, 70, 65, 80, 120, 100);
    	tentacruel.setWeight(55.0);
    	pokedex.put("Tentacruel", tentacruel);

    	Pokemon tepig = new Pokemon("Tepig");
    	tepig.setTypes("Fire", "(none)");
    	tepig.setAbility("Blaze");
    	tepig.setAllBaseStats(65, 63, 45, 45, 45, 45);
    	tepig.setWeight(9.9);
    	pokedex.put("Tepig", tepig);

    	Pokemon terrakion = new Pokemon("Terrakion");
    	terrakion.setTypes("Rock", "Fighting");
    	terrakion.setAbility("Justified");
    	terrakion.setAllBaseStats(91, 129, 90, 72, 90, 108);
    	terrakion.setWeight(260.0);
    	pokedex.put("Terrakion", terrakion);

    	Pokemon throh = new Pokemon("Throh");
    	throh.setTypes("Fighting", "(none)");
    	throh.setAbility("Guts");
    	throh.setAllBaseStats(120, 100, 85, 30, 85, 45);
    	throh.setWeight(55.5);
    	pokedex.put("Throh", throh);

    	Pokemon thundurus = new Pokemon("Thundurus");
    	thundurus.setTypes("Electric", "Flying");
    	thundurus.setAbility("Prankster");
    	thundurus.setAllBaseStats(79, 115, 70, 125, 80, 111);
    	thundurus.setWeight(61.0);
    	pokedex.put("Thundurus", thundurus);

    	Pokemon thundurustherian = new Pokemon("Thundurus-Therian");
    	thundurustherian.setTypes("Electric", "Flying");
    	thundurustherian.setAbility("Volt Absorb");
    	thundurustherian.setAllBaseStats(79, 105, 70, 145, 80, 101);
    	thundurustherian.setWeight(61.0);
    	pokedex.put("Thundurus-Therian", thundurustherian);

    	Pokemon timburr = new Pokemon("Timburr");
    	timburr.setTypes("Fighting", "(none)");
    	timburr.setAbility("Guts");
    	timburr.setAllBaseStats(75, 80, 55, 25, 35, 35);
    	timburr.setWeight(12.5);
    	pokedex.put("Timburr", timburr);

    	Pokemon tirtouga = new Pokemon("Tirtouga");
    	tirtouga.setTypes("Water", "Rock");
    	tirtouga.setAbility("Solid Rock");
    	tirtouga.setAllBaseStats(54, 78, 103, 53, 45, 22);
    	tirtouga.setWeight(16.5);
    	pokedex.put("Tirtouga", tirtouga);

    	Pokemon togedemaru = new Pokemon("Togedemaru");
    	togedemaru.setTypes("Electric", "Steel");
    	togedemaru.setAbility("Lightning Rod");
    	togedemaru.setAllBaseStats(65, 98, 63, 40, 73, 96);
    	togedemaru.setWeight(3.3);
    	pokedex.put("Togedemaru", togedemaru);

    	Pokemon togedemarutotem = new Pokemon("Togedemaru-Totem");
    	togedemarutotem.setTypes("Electric", "Steel");
    	togedemarutotem.setAbility("Sturdy");
    	togedemarutotem.setAllBaseStats(65, 98, 63, 40, 73, 96);
    	togedemarutotem.setWeight(13.0);
    	pokedex.put("Togedemaru-Totem", togedemarutotem);

    	Pokemon togekiss = new Pokemon("Togekiss");
    	togekiss.setTypes("Fairy", "Flying");
    	togekiss.setAbility("Serene Grace");
    	togekiss.setAllBaseStats(85, 50, 95, 120, 115, 80);
    	togekiss.setWeight(38.0);
    	pokedex.put("Togekiss", togekiss);

    	Pokemon togepi = new Pokemon("Togepi");
    	togepi.setTypes("Fairy", "(none)");
    	togepi.setAbility("Hustle");
    	togepi.setAllBaseStats(35, 20, 65, 40, 65, 20);
    	togepi.setWeight(1.5);
    	pokedex.put("Togepi", togepi);

    	Pokemon togetic = new Pokemon("Togetic");
    	togetic.setTypes("Fairy", "Flying");
    	togetic.setAbility("Hustle");
    	togetic.setAllBaseStats(55, 40, 85, 80, 105, 40);
    	togetic.setWeight(3.2);
    	pokedex.put("Togetic", togetic);

    	Pokemon tomohawk = new Pokemon("Tomohawk");
    	tomohawk.setTypes("Flying", "Fighting");
    	tomohawk.setAbility("Intimidate");
    	tomohawk.setAllBaseStats(105, 60, 90, 115, 80, 85);
    	tomohawk.setWeight(37.2);
    	pokedex.put("Tomohawk", tomohawk);

    	Pokemon torchic = new Pokemon("Torchic");
    	torchic.setTypes("Fire", "(none)");
    	torchic.setAbility("Blaze");
    	torchic.setAllBaseStats(45, 60, 40, 70, 50, 45);
    	torchic.setWeight(2.5);
    	pokedex.put("Torchic", torchic);

    	Pokemon torkoal = new Pokemon("Torkoal");
    	torkoal.setTypes("Fire", "(none)");
    	torkoal.setAbility("Drought");
    	torkoal.setAllBaseStats(70, 85, 140, 85, 70, 20);
    	torkoal.setWeight(80.4);
    	pokedex.put("Torkoal", torkoal);

    	Pokemon tornadus = new Pokemon("Tornadus");
    	tornadus.setTypes("Flying", "(none)");
    	tornadus.setAbility("Prankster");
    	tornadus.setAllBaseStats(79, 115, 70, 125, 80, 111);
    	tornadus.setWeight(63.0);
    	pokedex.put("Tornadus", tornadus);

    	Pokemon tornadustherian = new Pokemon("Tornadus-Therian");
    	tornadustherian.setTypes("Flying", "(none)");
    	tornadustherian.setAbility("Regenerator");
    	tornadustherian.setAllBaseStats(79, 100, 80, 110, 90, 121);
    	tornadustherian.setWeight(63.0);
    	pokedex.put("Tornadus-Therian", tornadustherian);

    	Pokemon torracat = new Pokemon("Torracat");
    	torracat.setTypes("Fire", "(none)");
    	torracat.setAbility("Blaze");
    	torracat.setAllBaseStats(65, 85, 50, 80, 50, 90);
    	torracat.setWeight(25.0);
    	pokedex.put("Torracat", torracat);

    	Pokemon torterra = new Pokemon("Torterra");
    	torterra.setTypes("Grass", "Ground");
    	torterra.setAbility("Overgrow");
    	torterra.setAllBaseStats(95, 109, 105, 75, 85, 56);
    	torterra.setWeight(310.0);
    	pokedex.put("Torterra", torterra);

    	Pokemon totodile = new Pokemon("Totodile");
    	totodile.setTypes("Water", "(none)");
    	totodile.setAbility("Torrent");
    	totodile.setAllBaseStats(50, 65, 64, 44, 48, 43);
    	totodile.setWeight(9.5);
    	pokedex.put("Totodile", totodile);

    	Pokemon toucannon = new Pokemon("Toucannon");
    	toucannon.setTypes("Normal", "Flying");
    	toucannon.setAbility("Keen Eye");
    	toucannon.setAllBaseStats(80, 120, 75, 75, 75, 60);
    	toucannon.setWeight(26.0);
    	pokedex.put("Toucannon", toucannon);

    	Pokemon toxapex = new Pokemon("Toxapex");
    	toxapex.setTypes("Poison", "Water");
    	toxapex.setAbility("Merciless");
    	toxapex.setAllBaseStats(50, 63, 152, 53, 142, 35);
    	toxapex.setWeight(14.5);
    	pokedex.put("Toxapex", toxapex);

    	Pokemon toxicroak = new Pokemon("Toxicroak");
    	toxicroak.setTypes("Poison", "Fighting");
    	toxicroak.setAbility("Dry Skin");
    	toxicroak.setAllBaseStats(83, 106, 65, 86, 65, 85);
    	toxicroak.setWeight(44.4);
    	pokedex.put("Toxicroak", toxicroak);

    	Pokemon tranquill = new Pokemon("Tranquill");
    	tranquill.setTypes("Normal", "Flying");
    	tranquill.setAbility("Big Pecks");
    	tranquill.setAllBaseStats(62, 77, 62, 50, 42, 65);
    	tranquill.setWeight(15.0);
    	pokedex.put("Tranquill", tranquill);

    	Pokemon trapinch = new Pokemon("Trapinch");
    	trapinch.setTypes("Ground", "(none)");
    	trapinch.setAbility("Hyper Cutter");
    	trapinch.setAllBaseStats(45, 100, 45, 45, 45, 10);
    	trapinch.setWeight(15.0);
    	pokedex.put("Trapinch", trapinch);

    	Pokemon treecko = new Pokemon("Treecko");
    	treecko.setTypes("Grass", "(none)");
    	treecko.setAbility("Overgrow");
    	treecko.setAllBaseStats(40, 45, 35, 65, 55, 70);
    	treecko.setWeight(5.0);
    	pokedex.put("Treecko", treecko);

    	Pokemon trevenant = new Pokemon("Trevenant");
    	trevenant.setTypes("Ghost", "Grass");
    	trevenant.setAbility("Natural Cure");
    	trevenant.setAllBaseStats(85, 110, 76, 65, 82, 56);
    	trevenant.setWeight(71.0);
    	pokedex.put("Trevenant", trevenant);

    	Pokemon tropius = new Pokemon("Tropius");
    	tropius.setTypes("Grass", "Flying");
    	tropius.setAbility("Chlorophyll");
    	tropius.setAllBaseStats(99, 68, 83, 72, 87, 51);
    	tropius.setWeight(100.0);
    	pokedex.put("Tropius", tropius);

    	Pokemon trubbish = new Pokemon("Trubbish");
    	trubbish.setTypes("Poison", "(none)");
    	trubbish.setAbility("Stench");
    	trubbish.setAllBaseStats(50, 50, 62, 40, 62, 65);
    	trubbish.setWeight(31.0);
    	pokedex.put("Trubbish", trubbish);

    	Pokemon trumbeak = new Pokemon("Trumbeak");
    	trumbeak.setTypes("Normal", "Flying");
    	trumbeak.setAbility("Keen Eye");
    	trumbeak.setAllBaseStats(55, 85, 50, 40, 50, 75);
    	trumbeak.setWeight(14.8);
    	pokedex.put("Trumbeak", trumbeak);

    	Pokemon tsareena = new Pokemon("Tsareena");
    	tsareena.setTypes("Grass", "(none)");
    	tsareena.setAbility("Queenly Majesty");
    	tsareena.setAllBaseStats(72, 120, 98, 50, 98, 72);
    	tsareena.setWeight(21.4);
    	pokedex.put("Tsareena", tsareena);

    	Pokemon turtonator = new Pokemon("Turtonator");
    	turtonator.setTypes("Fire", "Dragon");
    	turtonator.setAbility("Shell Armor");
    	turtonator.setAllBaseStats(60, 78, 135, 91, 85, 36);
    	turtonator.setWeight(212.0);
    	pokedex.put("Turtonator", turtonator);

    	Pokemon turtwig = new Pokemon("Turtwig");
    	turtwig.setTypes("Grass", "(none)");
    	turtwig.setAbility("Overgrow");
    	turtwig.setAllBaseStats(55, 68, 64, 45, 55, 31);
    	turtwig.setWeight(10.2);
    	pokedex.put("Turtwig", turtwig);

    	Pokemon tympole = new Pokemon("Tympole");
    	tympole.setTypes("Water", "(none)");
    	tympole.setAbility("Swift Swim");
    	tympole.setAllBaseStats(50, 50, 40, 50, 40, 64);
    	tympole.setWeight(4.5);
    	pokedex.put("Tympole", tympole);

    	Pokemon tynamo = new Pokemon("Tynamo");
    	tynamo.setTypes("Electric", "(none)");
    	tynamo.setAbility("Levitate");
    	tynamo.setAllBaseStats(35, 55, 40, 45, 40, 60);
    	tynamo.setWeight(0.3);
    	pokedex.put("Tynamo", tynamo);

    	Pokemon typenull = new Pokemon("Type: Null");
    	typenull.setTypes("Normal", "(none)");
    	typenull.setAbility("Battle Armor");
    	typenull.setAllBaseStats(95, 95, 95, 95, 95, 59);
    	typenull.setWeight(120.5);
    	pokedex.put("Type: Null", typenull);

    	Pokemon typhlosion = new Pokemon("Typhlosion");
    	typhlosion.setTypes("Fire", "(none)");
    	typhlosion.setAbility("Blaze");
    	typhlosion.setAllBaseStats(78, 84, 78, 109, 85, 100);
    	typhlosion.setWeight(79.5);
    	pokedex.put("Typhlosion", typhlosion);

    	Pokemon tyranitar = new Pokemon("Tyranitar");
    	tyranitar.setTypes("Rock", "Dark");
    	tyranitar.setAbility("Sand Stream");
    	tyranitar.setAllBaseStats(100, 134, 110, 95, 100, 61);
    	tyranitar.setWeight(202.0);
    	tyranitar.setFormes("Tyranitar", "Tyranitar-Mega");
    	pokedex.put("Tyranitar", tyranitar);

    	Pokemon tyranitarmega = new Pokemon("Tyranitar-Mega");
    	tyranitarmega.setTypes("Rock", "Dark");
    	tyranitarmega.setAbility("Sand Stream");
    	tyranitarmega.setAllBaseStats(100, 164, 150, 95, 120, 71);
    	tyranitarmega.setWeight(255.0);
    	pokedex.put("Tyranitar-Mega", tyranitarmega);

    	Pokemon tyrantrum = new Pokemon("Tyrantrum");
    	tyrantrum.setTypes("Rock", "Dragon");
    	tyrantrum.setAbility("Strong Jaw");
    	tyrantrum.setAllBaseStats(82, 121, 119, 69, 59, 71);
    	tyrantrum.setWeight(270.0);
    	pokedex.put("Tyrantrum", tyrantrum);

    	Pokemon tyrogue = new Pokemon("Tyrogue");
    	tyrogue.setTypes("Fighting", "(none)");
    	tyrogue.setAbility("Guts");
    	tyrogue.setAllBaseStats(35, 35, 35, 35, 35, 35);
    	tyrogue.setWeight(21.0);
    	pokedex.put("Tyrogue", tyrogue);

    	Pokemon tyrunt = new Pokemon("Tyrunt");
    	tyrunt.setTypes("Rock", "Dragon");
    	tyrunt.setAbility("Strong Jaw");
    	tyrunt.setAllBaseStats(58, 89, 77, 45, 45, 48);
    	tyrunt.setWeight(26.0);
    	pokedex.put("Tyrunt", tyrunt);

    	Pokemon umbreon = new Pokemon("Umbreon");
    	umbreon.setTypes("Dark", "(none)");
    	umbreon.setAbility("Synchronize");
    	umbreon.setAllBaseStats(95, 65, 110, 60, 130, 65);
    	umbreon.setWeight(27.0);
    	pokedex.put("Umbreon", umbreon);

    	Pokemon unfezant = new Pokemon("Unfezant");
    	unfezant.setTypes("Normal", "Flying");
    	unfezant.setAbility("Big Pecks");
    	unfezant.setAllBaseStats(80, 115, 80, 65, 55, 93);
    	unfezant.setWeight(29.0);
    	pokedex.put("Unfezant", unfezant);

    	Pokemon unown = new Pokemon("Unown");
    	unown.setTypes("Psychic", "(none)");
    	unown.setAbility("Levitate");
    	unown.setAllBaseStats(48, 72, 48, 72, 48, 48);
    	unown.setWeight(5.0);
    	pokedex.put("Unown", unown);

    	Pokemon ursaring = new Pokemon("Ursaring");
    	ursaring.setTypes("Normal", "(none)");
    	ursaring.setAbility("Guts");
    	ursaring.setAllBaseStats(90, 130, 75, 75, 75, 55);
    	ursaring.setWeight(125.8);
    	pokedex.put("Ursaring", ursaring);

    	Pokemon uxie = new Pokemon("Uxie");
    	uxie.setTypes("Psychic", "(none)");
    	uxie.setAbility("Levitate");
    	uxie.setAllBaseStats(75, 75, 130, 75, 130, 95);
    	uxie.setWeight(0.3);
    	pokedex.put("Uxie", uxie);

    	Pokemon vanillish = new Pokemon("Vanillish");
    	vanillish.setTypes("Ice", "(none)");
    	vanillish.setAbility("Ice Body");
    	vanillish.setAllBaseStats(51, 65, 65, 80, 75, 59);
    	vanillish.setWeight(41.0);
    	pokedex.put("Vanillish", vanillish);

    	Pokemon vanillite = new Pokemon("Vanillite");
    	vanillite.setTypes("Ice", "(none)");
    	vanillite.setAbility("Ice Body");
    	vanillite.setAllBaseStats(36, 50, 50, 65, 60, 44);
    	vanillite.setWeight(5.7);
    	pokedex.put("Vanillite", vanillite);

    	Pokemon vanilluxe = new Pokemon("Vanilluxe");
    	vanilluxe.setTypes("Ice", "(none)");
    	vanilluxe.setAbility("Ice Body");
    	vanilluxe.setAllBaseStats(71, 95, 85, 110, 95, 79);
    	vanilluxe.setWeight(57.5);
    	pokedex.put("Vanilluxe", vanilluxe);

    	Pokemon vaporeon = new Pokemon("Vaporeon");
    	vaporeon.setTypes("Water", "(none)");
    	vaporeon.setAbility("Water Absorb");
    	vaporeon.setAllBaseStats(130, 65, 60, 110, 95, 65);
    	vaporeon.setWeight(29.0);
    	pokedex.put("Vaporeon", vaporeon);

    	Pokemon venipede = new Pokemon("Venipede");
    	venipede.setTypes("Bug", "Poison");
    	venipede.setAbility("Poison Point");
    	venipede.setAllBaseStats(30, 45, 59, 30, 39, 57);
    	venipede.setWeight(5.3);
    	pokedex.put("Venipede", venipede);

    	Pokemon venomoth = new Pokemon("Venomoth");
    	venomoth.setTypes("Bug", "Poison");
    	venomoth.setAbility("Shield Dust");
    	venomoth.setAllBaseStats(70, 65, 60, 90, 75, 90);
    	venomoth.setWeight(12.5);
    	pokedex.put("Venomoth", venomoth);

    	Pokemon venonat = new Pokemon("Venonat");
    	venonat.setTypes("Bug", "Poison");
    	venonat.setAbility("Compound Eyes");
    	venonat.setAllBaseStats(60, 55, 50, 40, 55, 45);
    	venonat.setWeight(30.0);
    	pokedex.put("Venonat", venonat);

    	Pokemon venusaur = new Pokemon("Venusaur");
    	venusaur.setTypes("Grass", "Poison");
    	venusaur.setAbility("Chlorophyll");
    	venusaur.setAllBaseStats(80, 82, 83, 100, 100, 80);
    	venusaur.setWeight(100.0);
    	venusaur.setFormes("Venusaur", "Venusaur-Mega");
    	pokedex.put("Venusaur", venusaur);

    	Pokemon venusaurmega = new Pokemon("Venusaur-Mega");
    	venusaurmega.setTypes("Grass", "Poison");
    	venusaurmega.setAbility("Thick Fat");
    	venusaurmega.setAllBaseStats(80, 100, 123, 122, 120, 80);
    	venusaurmega.setWeight(155.5);
    	pokedex.put("Venusaur-Mega", venusaurmega);

    	Pokemon vespiquen = new Pokemon("Vespiquen");
    	vespiquen.setTypes("Bug", "Flying");
    	vespiquen.setAbility("Pressure");
    	vespiquen.setAllBaseStats(70, 80, 102, 80, 102, 40);
    	vespiquen.setWeight(38.5);
    	pokedex.put("Vespiquen", vespiquen);

    	Pokemon vibrava = new Pokemon("Vibrava");
    	vibrava.setTypes("Ground", "Dragon");
    	vibrava.setAbility("Levitate");
    	vibrava.setAllBaseStats(50, 70, 50, 50, 50, 70);
    	vibrava.setWeight(15.3);
    	pokedex.put("Vibrava", vibrava);

    	Pokemon victini = new Pokemon("Victini");
    	victini.setTypes("Psychic", "Fire");
    	victini.setAbility("Victory Star");
    	victini.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	victini.setWeight(4.0);
    	pokedex.put("Victini", victini);

    	Pokemon victreebel = new Pokemon("Victreebel");
    	victreebel.setTypes("Grass", "Poison");
    	victreebel.setAbility("Chlorophyll");
    	victreebel.setAllBaseStats(80, 105, 65, 100, 70, 70);
    	victreebel.setWeight(15.5);
    	pokedex.put("Victreebel", victreebel);

    	Pokemon vigoroth = new Pokemon("Vigoroth");
    	vigoroth.setTypes("Normal", "(none)");
    	vigoroth.setAbility("Vital Spirit");
    	vigoroth.setAllBaseStats(80, 80, 80, 55, 55, 90);
    	vigoroth.setWeight(46.5);
    	pokedex.put("Vigoroth", vigoroth);

    	Pokemon vikavolt = new Pokemon("Vikavolt");
    	vikavolt.setTypes("Bug", "Electric");
    	vikavolt.setAbility("Levitate");
    	vikavolt.setAllBaseStats(77, 70, 90, 145, 75, 43);
    	vikavolt.setWeight(45.0);
    	pokedex.put("Vikavolt", vikavolt);

    	Pokemon vikavolttotem = new Pokemon("Vikavolt-Totem");
    	vikavolttotem.setTypes("Bug", "Electric");
    	vikavolttotem.setAbility("Levitate");
    	vikavolttotem.setAllBaseStats(77, 70, 90, 145, 75, 43);
    	vikavolttotem.setWeight(147.5);
    	pokedex.put("Vikavolt-Totem", vikavolttotem);

    	Pokemon vileplume = new Pokemon("Vileplume");
    	vileplume.setTypes("Grass", "Poison");
    	vileplume.setAbility("Chlorophyll");
    	vileplume.setAllBaseStats(75, 80, 85, 110, 90, 50);
    	vileplume.setWeight(18.6);
    	pokedex.put("Vileplume", vileplume);

    	Pokemon virizion = new Pokemon("Virizion");
    	virizion.setTypes("Grass", "Fighting");
    	virizion.setAbility("Justified");
    	virizion.setAllBaseStats(91, 90, 72, 90, 129, 108);
    	virizion.setWeight(200.0);
    	pokedex.put("Virizion", virizion);

    	Pokemon vivillon = new Pokemon("Vivillon");
    	vivillon.setTypes("Bug", "Flying");
    	vivillon.setAbility("Shield Dust");
    	vivillon.setAllBaseStats(80, 52, 50, 90, 50, 89);
    	vivillon.setWeight(17.0);
    	pokedex.put("Vivillon", vivillon);

    	Pokemon vivillonfancy = new Pokemon("Vivillon-Fancy");
    	vivillonfancy.setTypes("Bug", "Flying");
    	vivillonfancy.setAbility("Shield Dust");
    	vivillonfancy.setAllBaseStats(80, 52, 50, 90, 50, 89);
    	vivillonfancy.setWeight(17.0);
    	pokedex.put("Vivillon-Fancy", vivillonfancy);

    	Pokemon vivillonpokeball = new Pokemon("Vivillon-Pokeball");
    	vivillonpokeball.setTypes("Bug", "Flying");
    	vivillonpokeball.setAbility("Shield Dust");
    	vivillonpokeball.setAllBaseStats(80, 52, 50, 90, 50, 89);
    	vivillonpokeball.setWeight(17.0);
    	pokedex.put("Vivillon-Pokeball", vivillonpokeball);

    	Pokemon volbeat = new Pokemon("Volbeat");
    	volbeat.setTypes("Bug", "(none)");
    	volbeat.setAbility("Illuminate");
    	volbeat.setAllBaseStats(65, 73, 75, 47, 85, 85);
    	volbeat.setWeight(17.7);
    	pokedex.put("Volbeat", volbeat);

    	Pokemon volcanion = new Pokemon("Volcanion");
    	volcanion.setTypes("Fire", "Water");
    	volcanion.setAbility("Water Absorb");
    	volcanion.setAllBaseStats(80, 110, 120, 130, 90, 70);
    	volcanion.setWeight(195.0);
    	pokedex.put("Volcanion", volcanion);

    	Pokemon volcarona = new Pokemon("Volcarona");
    	volcarona.setTypes("Bug", "Fire");
    	volcarona.setAbility("Flame Body");
    	volcarona.setAllBaseStats(85, 60, 65, 135, 105, 100);
    	volcarona.setWeight(46.0);
    	pokedex.put("Volcarona", volcarona);

    	Pokemon volkraken = new Pokemon("Volkraken");
    	volkraken.setTypes("Water", "Fire");
    	volkraken.setAbility("Analytic");
    	volkraken.setAllBaseStats(100, 45, 80, 135, 100, 95);
    	volkraken.setWeight(44.5);
    	pokedex.put("Volkraken", volkraken);

    	Pokemon volkritter = new Pokemon("Volkritter");
    	volkritter.setTypes("Water", "Fire");
    	volkritter.setAbility("Anticipation");
    	volkritter.setAllBaseStats(60, 30, 50, 80, 60, 70);
    	volkritter.setWeight(15.0);
    	pokedex.put("Volkritter", volkritter);

    	Pokemon voltorb = new Pokemon("Voltorb");
    	voltorb.setTypes("Electric", "(none)");
    	voltorb.setAbility("Soundproof");
    	voltorb.setAllBaseStats(40, 30, 50, 55, 55, 100);
    	voltorb.setWeight(10.4);
    	pokedex.put("Voltorb", voltorb);

    	Pokemon voodoll = new Pokemon("Voodoll");
    	voodoll.setTypes("Normal", "Dark");
    	voodoll.setAbility("Volt Absorb");
    	voodoll.setAllBaseStats(55, 40, 55, 75, 50, 70);
    	voodoll.setWeight(25.0);
    	pokedex.put("Voodoll", voodoll);

    	Pokemon voodoom = new Pokemon("Voodoom");
    	voodoom.setTypes("Fighting", "Dark");
    	voodoom.setAbility("Volt Absorb");
    	voodoom.setAllBaseStats(90, 85, 80, 105, 80, 110);
    	voodoom.setWeight(75.5);
    	pokedex.put("Voodoom", voodoom);

    	Pokemon vullaby = new Pokemon("Vullaby");
    	vullaby.setTypes("Dark", "Flying");
    	vullaby.setAbility("Big Pecks");
    	vullaby.setAllBaseStats(70, 55, 75, 45, 65, 60);
    	vullaby.setWeight(9.0);
    	pokedex.put("Vullaby", vullaby);

    	Pokemon vulpix = new Pokemon("Vulpix");
    	vulpix.setTypes("Fire", "(none)");
    	vulpix.setAbility("Flash Fire");
    	vulpix.setAllBaseStats(38, 41, 40, 50, 65, 65);
    	vulpix.setWeight(9.9);
    	pokedex.put("Vulpix", vulpix);

    	Pokemon vulpixalola = new Pokemon("Vulpix-Alola");
    	vulpixalola.setTypes("Ice", "(none)");
    	vulpixalola.setAbility("Snow Cloak");
    	vulpixalola.setAllBaseStats(38, 41, 40, 50, 65, 65);
    	vulpixalola.setWeight(9.9);
    	pokedex.put("Vulpix-Alola", vulpixalola);

    	Pokemon wailmer = new Pokemon("Wailmer");
    	wailmer.setTypes("Water", "(none)");
    	wailmer.setAbility("Water Veil");
    	wailmer.setAllBaseStats(130, 70, 35, 70, 35, 60);
    	wailmer.setWeight(130.0);
    	pokedex.put("Wailmer", wailmer);

    	Pokemon wailord = new Pokemon("Wailord");
    	wailord.setTypes("Water", "(none)");
    	wailord.setAbility("Water Veil");
    	wailord.setAllBaseStats(170, 90, 45, 90, 45, 60);
    	wailord.setWeight(398.0);
    	pokedex.put("Wailord", wailord);

    	Pokemon walrein = new Pokemon("Walrein");
    	walrein.setTypes("Ice", "Water");
    	walrein.setAbility("Thick Fat");
    	walrein.setAllBaseStats(110, 80, 90, 95, 90, 65);
    	walrein.setWeight(150.6);
    	pokedex.put("Walrein", walrein);

    	Pokemon wartortle = new Pokemon("Wartortle");
    	wartortle.setTypes("Water", "(none)");
    	wartortle.setAbility("Torrent");
    	wartortle.setAllBaseStats(59, 63, 80, 65, 80, 58);
    	wartortle.setWeight(22.5);
    	pokedex.put("Wartortle", wartortle);

    	Pokemon watchog = new Pokemon("Watchog");
    	watchog.setTypes("Normal", "(none)");
    	watchog.setAbility("Illuminate");
    	watchog.setAllBaseStats(60, 85, 69, 60, 69, 77);
    	watchog.setWeight(27.0);
    	pokedex.put("Watchog", watchog);

    	Pokemon weavile = new Pokemon("Weavile");
    	weavile.setTypes("Dark", "Ice");
    	weavile.setAbility("Pressure");
    	weavile.setAllBaseStats(70, 120, 65, 45, 85, 125);
    	weavile.setWeight(34.0);
    	pokedex.put("Weavile", weavile);

    	Pokemon weedle = new Pokemon("Weedle");
    	weedle.setTypes("Bug", "Poison");
    	weedle.setAbility("Shield Dust");
    	weedle.setAllBaseStats(40, 35, 30, 20, 20, 50);
    	weedle.setWeight(3.2);
    	pokedex.put("Weedle", weedle);

    	Pokemon weepinbell = new Pokemon("Weepinbell");
    	weepinbell.setTypes("Grass", "Poison");
    	weepinbell.setAbility("Chlorophyll");
    	weepinbell.setAllBaseStats(65, 90, 50, 85, 45, 55);
    	weepinbell.setWeight(6.4);
    	pokedex.put("Weepinbell", weepinbell);

    	Pokemon weezing = new Pokemon("Weezing");
    	weezing.setTypes("Poison", "(none)");
    	weezing.setAbility("Levitate");
    	weezing.setAllBaseStats(65, 90, 120, 85, 70, 60);
    	weezing.setWeight(9.5);
    	pokedex.put("Weezing", weezing);

    	Pokemon whimsicott = new Pokemon("Whimsicott");
    	whimsicott.setTypes("Grass", "Fairy");
    	whimsicott.setAbility("Prankster");
    	whimsicott.setAllBaseStats(60, 67, 85, 77, 75, 116);
    	whimsicott.setWeight(6.6);
    	pokedex.put("Whimsicott", whimsicott);

    	Pokemon whirlipede = new Pokemon("Whirlipede");
    	whirlipede.setTypes("Bug", "Poison");
    	whirlipede.setAbility("Poison Point");
    	whirlipede.setAllBaseStats(40, 55, 99, 40, 79, 47);
    	whirlipede.setWeight(58.5);
    	pokedex.put("Whirlipede", whirlipede);

    	Pokemon whiscash = new Pokemon("Whiscash");
    	whiscash.setTypes("Water", "Ground");
    	whiscash.setAbility("Oblivious");
    	whiscash.setAllBaseStats(110, 78, 73, 76, 71, 60);
    	whiscash.setWeight(23.6);
    	pokedex.put("Whiscash", whiscash);

    	Pokemon whismur = new Pokemon("Whismur");
    	whismur.setTypes("Normal", "(none)");
    	whismur.setAbility("Soundproof");
    	whismur.setAllBaseStats(64, 51, 23, 51, 23, 28);
    	whismur.setWeight(16.3);
    	pokedex.put("Whismur", whismur);

    	Pokemon wigglytuff = new Pokemon("Wigglytuff");
    	wigglytuff.setTypes("Normal", "Fairy");
    	wigglytuff.setAbility("Cute Charm");
    	wigglytuff.setAllBaseStats(140, 70, 45, 85, 50, 45);
    	wigglytuff.setWeight(12.0);
    	pokedex.put("Wigglytuff", wigglytuff);

    	Pokemon wimpod = new Pokemon("Wimpod");
    	wimpod.setTypes("Bug", "Water");
    	wimpod.setAbility("Wimp Out");
    	wimpod.setAllBaseStats(25, 35, 40, 20, 30, 80);
    	wimpod.setWeight(12.0);
    	pokedex.put("Wimpod", wimpod);

    	Pokemon wingull = new Pokemon("Wingull");
    	wingull.setTypes("Water", "Flying");
    	wingull.setAbility("Keen Eye");
    	wingull.setAllBaseStats(40, 30, 30, 55, 30, 85);
    	wingull.setWeight(9.5);
    	pokedex.put("Wingull", wingull);

    	Pokemon wishiwashi = new Pokemon("Wishiwashi");
    	wishiwashi.setTypes("Water", "(none)");
    	wishiwashi.setAbility("Schooling");
    	wishiwashi.setAllBaseStats(45, 20, 20, 25, 25, 40);
    	wishiwashi.setWeight(0.3);
    	wishiwashi.setFormes("Wishiwashi", "Wishiwashi-School");
    	pokedex.put("Wishiwashi", wishiwashi);

    	Pokemon wishiwashischool = new Pokemon("Wishiwashi-School");
    	wishiwashischool.setTypes("Water", "(none)");
    	wishiwashischool.setAbility("Schooling");
    	wishiwashischool.setAllBaseStats(45, 140, 130, 140, 135, 30);
    	wishiwashischool.setWeight(78.6);
    	pokedex.put("Wishiwashi-School", wishiwashischool);

    	Pokemon wobbuffet = new Pokemon("Wobbuffet");
    	wobbuffet.setTypes("Psychic", "(none)");
    	wobbuffet.setAbility("Shadow Tag");
    	wobbuffet.setAllBaseStats(190, 33, 58, 33, 58, 33);
    	wobbuffet.setWeight(28.5);
    	pokedex.put("Wobbuffet", wobbuffet);

    	Pokemon woobat = new Pokemon("Woobat");
    	woobat.setTypes("Psychic", "Flying");
    	woobat.setAbility("Unaware");
    	woobat.setAllBaseStats(65, 45, 43, 55, 43, 72);
    	woobat.setWeight(2.1);
    	pokedex.put("Woobat", woobat);

    	Pokemon wooper = new Pokemon("Wooper");
    	wooper.setTypes("Water", "Ground");
    	wooper.setAbility("Damp");
    	wooper.setAllBaseStats(55, 45, 45, 25, 25, 15);
    	wooper.setWeight(8.5);
    	pokedex.put("Wooper", wooper);

    	Pokemon wormadam = new Pokemon("Wormadam");
    	wormadam.setTypes("Bug", "Grass");
    	wormadam.setAbility("Anticipation");
    	wormadam.setAllBaseStats(60, 59, 85, 79, 105, 36);
    	wormadam.setWeight(6.5);
    	pokedex.put("Wormadam", wormadam);

    	Pokemon wormadamsandy = new Pokemon("Wormadam-Sandy");
    	wormadamsandy.setTypes("Bug", "Ground");
    	wormadamsandy.setAbility("Anticipation");
    	wormadamsandy.setAllBaseStats(60, 79, 105, 59, 85, 36);
    	wormadamsandy.setWeight(6.5);
    	pokedex.put("Wormadam-Sandy", wormadamsandy);

    	Pokemon wormadamtrash = new Pokemon("Wormadam-Trash");
    	wormadamtrash.setTypes("Bug", "Steel");
    	wormadamtrash.setAbility("Anticipation");
    	wormadamtrash.setAllBaseStats(60, 69, 95, 69, 95, 36);
    	wormadamtrash.setWeight(6.5);
    	pokedex.put("Wormadam-Trash", wormadamtrash);

    	Pokemon wurmple = new Pokemon("Wurmple");
    	wurmple.setTypes("Bug", "(none)");
    	wurmple.setAbility("Shield Dust");
    	wurmple.setAllBaseStats(45, 45, 35, 20, 30, 20);
    	wurmple.setWeight(3.6);
    	pokedex.put("Wurmple", wurmple);

    	Pokemon wynaut = new Pokemon("Wynaut");
    	wynaut.setTypes("Psychic", "(none)");
    	wynaut.setAbility("Shadow Tag");
    	wynaut.setAllBaseStats(95, 23, 48, 23, 48, 23);
    	wynaut.setWeight(14.0);
    	pokedex.put("Wynaut", wynaut);

    	Pokemon xatu = new Pokemon("Xatu");
    	xatu.setTypes("Psychic", "Flying");
    	xatu.setAbility("Synchronize");
    	xatu.setAllBaseStats(65, 75, 70, 95, 70, 95);
    	xatu.setWeight(15.0);
    	pokedex.put("Xatu", xatu);

    	Pokemon xerneas = new Pokemon("Xerneas");
    	xerneas.setTypes("Fairy", "(none)");
    	xerneas.setAbility("Fairy Aura");
    	xerneas.setAllBaseStats(126, 131, 95, 131, 98, 99);
    	xerneas.setWeight(215.0);
    	pokedex.put("Xerneas", xerneas);

    	Pokemon xurkitree = new Pokemon("Xurkitree");
    	xurkitree.setTypes("Electric", "(none)");
    	xurkitree.setAbility("Beast Boost");
    	xurkitree.setAllBaseStats(83, 89, 71, 173, 71, 83);
    	xurkitree.setWeight(100.0);
    	pokedex.put("Xurkitree", xurkitree);

    	Pokemon yamask = new Pokemon("Yamask");
    	yamask.setTypes("Ghost", "(none)");
    	yamask.setAbility("Mummy");
    	yamask.setAllBaseStats(38, 30, 85, 55, 65, 30);
    	yamask.setWeight(1.5);
    	pokedex.put("Yamask", yamask);

    	Pokemon yanma = new Pokemon("Yanma");
    	yanma.setTypes("Bug", "Flying");
    	yanma.setAbility("Speed Boost");
    	yanma.setAllBaseStats(65, 65, 45, 75, 45, 95);
    	yanma.setWeight(38.0);
    	pokedex.put("Yanma", yanma);

    	Pokemon yanmega = new Pokemon("Yanmega");
    	yanmega.setTypes("Bug", "Flying");
    	yanmega.setAbility("Speed Boost");
    	yanmega.setAllBaseStats(86, 76, 86, 116, 56, 95);
    	yanmega.setWeight(51.5);
    	pokedex.put("Yanmega", yanmega);

    	Pokemon yungoos = new Pokemon("Yungoos");
    	yungoos.setTypes("Normal", "(none)");
    	yungoos.setAbility("Stakeout");
    	yungoos.setAllBaseStats(48, 70, 30, 30, 30, 45);
    	yungoos.setWeight(6.0);
    	pokedex.put("Yungoos", yungoos);

    	Pokemon yveltal = new Pokemon("Yveltal");
    	yveltal.setTypes("Dark", "Flying");
    	yveltal.setAbility("Dark Aura");
    	yveltal.setAllBaseStats(126, 131, 95, 131, 98, 99);
    	yveltal.setWeight(203.0);
    	pokedex.put("Yveltal", yveltal);

    	Pokemon zangoose = new Pokemon("Zangoose");
    	zangoose.setTypes("Normal", "(none)");
    	zangoose.setAbility("Immunity");
    	zangoose.setAllBaseStats(73, 115, 60, 60, 60, 90);
    	zangoose.setWeight(40.3);
    	pokedex.put("Zangoose", zangoose);

    	Pokemon zapdos = new Pokemon("Zapdos");
    	zapdos.setTypes("Electric", "Flying");
    	zapdos.setAbility("Pressure");
    	zapdos.setAllBaseStats(90, 90, 85, 125, 90, 100);
    	zapdos.setWeight(52.6);
    	pokedex.put("Zapdos", zapdos);

    	Pokemon zebstrika = new Pokemon("Zebstrika");
    	zebstrika.setTypes("Electric", "(none)");
    	zebstrika.setAbility("Lightning Rod");
    	zebstrika.setAllBaseStats(75, 100, 63, 80, 63, 116);
    	zebstrika.setWeight(79.5);
    	pokedex.put("Zebstrika", zebstrika);

    	Pokemon zekrom = new Pokemon("Zekrom");
    	zekrom.setTypes("Dragon", "Electric");
    	zekrom.setAbility("Teravolt");
    	zekrom.setAllBaseStats(100, 150, 120, 120, 100, 90);
    	zekrom.setWeight(345.0);
    	pokedex.put("Zekrom", zekrom);

    	Pokemon zeraora = new Pokemon("Zeraora");
    	zeraora.setTypes("Electric", "(none)");
    	zeraora.setAbility("Volt Absorb");
    	zeraora.setAllBaseStats(88, 112, 75, 102, 80, 143);
    	zeraora.setWeight(44.5);
    	pokedex.put("Zeraora", zeraora);

    	Pokemon zigzagoon = new Pokemon("Zigzagoon");
    	zigzagoon.setTypes("Normal", "(none)");
    	zigzagoon.setAbility("Pickup");
    	zigzagoon.setAllBaseStats(38, 30, 41, 30, 41, 60);
    	zigzagoon.setWeight(17.5);
    	pokedex.put("Zigzagoon", zigzagoon);

    	Pokemon zoroark = new Pokemon("Zoroark");
    	zoroark.setTypes("Dark", "(none)");
    	zoroark.setAbility("Illusion");
    	zoroark.setAllBaseStats(60, 105, 60, 120, 60, 105);
    	zoroark.setWeight(81.1);
    	pokedex.put("Zoroark", zoroark);

    	Pokemon zorua = new Pokemon("Zorua");
    	zorua.setTypes("Dark", "(none)");
    	zorua.setAbility("Illusion");
    	zorua.setAllBaseStats(40, 65, 40, 80, 40, 65);
    	zorua.setWeight(12.5);
    	pokedex.put("Zorua", zorua);

    	Pokemon zubat = new Pokemon("Zubat");
    	zubat.setTypes("Poison", "Flying");
    	zubat.setAbility("Inner Focus");
    	zubat.setAllBaseStats(40, 45, 35, 30, 40, 55);
    	zubat.setWeight(7.5);
    	pokedex.put("Zubat", zubat);

    	Pokemon zweilous = new Pokemon("Zweilous");
    	zweilous.setTypes("Dark", "Dragon");
    	zweilous.setAbility("Hustle");
    	zweilous.setAllBaseStats(72, 85, 70, 65, 70, 58);
    	zweilous.setWeight(50.0);
    	pokedex.put("Zweilous", zweilous);

    	Pokemon zygarde = new Pokemon("Zygarde");
    	zygarde.setTypes("Dragon", "Ground");
    	zygarde.setAbility("Power Construct");
    	zygarde.setAllBaseStats(108, 100, 121, 81, 95, 95);
    	zygarde.setWeight(305.0);
    	zygarde.setFormes("Zygarde", "Zygarde-10%", "Zygarde-Complete");
    	pokedex.put("Zygarde", zygarde);

    	Pokemon zygarde10 = new Pokemon("Zygarde-10%");
    	zygarde10.setTypes("Dragon", "Ground");
    	zygarde10.setAbility("Power Construct");
    	zygarde10.setAllBaseStats(54, 100, 71, 61, 85, 115);
    	zygarde10.setWeight(33.5);
    	pokedex.put("Zygarde-10%", zygarde10);

    	Pokemon zygardecomplete = new Pokemon("Zygarde-Complete");
    	zygardecomplete.setTypes("Dragon", "Ground");
    	zygardecomplete.setAbility("Power Construct");
    	zygardecomplete.setAllBaseStats(216, 100, 121, 91, 95, 85);
    	zygardecomplete.setWeight(610.0);
    	pokedex.put("Zygarde-Complete", zygardecomplete);
    }
}
