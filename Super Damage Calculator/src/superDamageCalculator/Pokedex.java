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
    	abomasnow.setDexNumber(460);
    	abomasnow.setTypes("Grass", "Ice");
    	abomasnow.addAbilities("Snow Warning", "Soundproof");
    	abomasnow.setAllBaseStats(90, 92, 75, 92, 85, 60);
    	abomasnow.setWeight(135.5);
    	abomasnow.setFormes("Abomasnow", "Abomasnow-Mega");
    	pokedex.put("Abomasnow", abomasnow);

    	Pokemon abomasnowmega = new Pokemon("Abomasnow-Mega");
    	abomasnowmega.setDexNumber(460);
    	abomasnowmega.setTypes("Grass", "Ice");
    	abomasnowmega.addAbilities("Snow Warning");
    	abomasnowmega.setAllBaseStats(90, 132, 105, 132, 105, 30);
    	abomasnowmega.setWeight(185.0);
    	pokedex.put("Abomasnow-Mega", abomasnowmega);

    	Pokemon abra = new Pokemon("Abra");
    	abra.setDexNumber(63);
    	abra.setTypes("Psychic", "(none)");
    	abra.addAbilities("Synchronize", "Inner Focus", "Magic Guard");
    	abra.setAllBaseStats(25, 20, 15, 105, 55, 90);
    	abra.setWeight(19.5);
    	pokedex.put("Abra", abra);

    	Pokemon absol = new Pokemon("Absol");
    	absol.setDexNumber(359);
    	absol.setTypes("Dark", "(none)");
    	absol.addAbilities("Pressure", "Super Luck", "Justified");
    	absol.setAllBaseStats(65, 130, 60, 75, 60, 75);
    	absol.setWeight(47.0);
    	absol.setFormes("Absol", "Absol-Mega");
    	pokedex.put("Absol", absol);

    	Pokemon absolmega = new Pokemon("Absol-Mega");
    	absolmega.setDexNumber(359);
    	absolmega.setTypes("Dark", "(none)");
    	absolmega.addAbilities("Magic Bounce");
    	absolmega.setAllBaseStats(65, 150, 60, 115, 60, 115);
    	absolmega.setWeight(49.0);
    	pokedex.put("Absol-Mega", absolmega);

    	Pokemon accelgor = new Pokemon("Accelgor");
    	accelgor.setDexNumber(617);
    	accelgor.setTypes("Bug", "(none)");
    	accelgor.addAbilities("Hydration", "Sticky Hold", "Unburden");
    	accelgor.setAllBaseStats(80, 70, 40, 100, 60, 145);
    	accelgor.setWeight(25.3);
    	pokedex.put("Accelgor", accelgor);

    	Pokemon aegislash = new Pokemon("Aegislash");
    	aegislash.setDexNumber(681);
    	aegislash.setTypes("Steel", "Ghost");
    	aegislash.addAbilities("Stance Change");
    	aegislash.setAllBaseStats(60, 50, 150, 50, 150, 60);
    	aegislash.setWeight(53.0);
    	aegislash.setFormes("Aegislash", "Aegislash-Blade");
    	pokedex.put("Aegislash", aegislash);

    	Pokemon aegislashblade = new Pokemon("Aegislash-Blade");
    	aegislashblade.setDexNumber(681);
    	aegislashblade.setTypes("Steel", "Ghost");
    	aegislashblade.addAbilities("Stance Change");
    	aegislashblade.setAllBaseStats(60, 150, 50, 150, 50, 60);
    	aegislashblade.setWeight(53.0);
    	pokedex.put("Aegislash-Blade", aegislashblade);

    	Pokemon aerodactyl = new Pokemon("Aerodactyl");
    	aerodactyl.setDexNumber(142);
    	aerodactyl.setTypes("Rock", "Flying");
    	aerodactyl.addAbilities("Rock Head", "Pressure", "Unnerve");
    	aerodactyl.setAllBaseStats(80, 105, 65, 60, 75, 130);
    	aerodactyl.setWeight(59.0);
    	aerodactyl.setFormes("Aerodactyl", "Aerodactyl-Mega");
    	pokedex.put("Aerodactyl", aerodactyl);

    	Pokemon aerodactylmega = new Pokemon("Aerodactyl-Mega");
    	aerodactylmega.setDexNumber(142);
    	aerodactylmega.setTypes("Rock", "Flying");
    	aerodactylmega.addAbilities("Tough Claws");
    	aerodactylmega.setAllBaseStats(80, 135, 85, 70, 95, 150);
    	aerodactylmega.setWeight(79.0);
    	pokedex.put("Aerodactyl-Mega", aerodactylmega);

    	Pokemon aggron = new Pokemon("Aggron");
    	aggron.setDexNumber(306);
    	aggron.setTypes("Steel", "Rock");
    	aggron.addAbilities("Sturdy", "Rock Head", "Heavy Metal");
    	aggron.setAllBaseStats(70, 110, 180, 60, 60, 50);
    	aggron.setWeight(360.0);
    	aggron.setFormes("Aggron", "Aggron-Mega");
    	pokedex.put("Aggron", aggron);

    	Pokemon aggronmega = new Pokemon("Aggron-Mega");
    	aggronmega.setDexNumber(306);
    	aggronmega.setTypes("Steel", "(none)");
    	aggronmega.addAbilities("Filter");
    	aggronmega.setAllBaseStats(70, 140, 230, 60, 80, 50);
    	aggronmega.setWeight(395.0);
    	pokedex.put("Aggron-Mega", aggronmega);

    	Pokemon aipom = new Pokemon("Aipom");
    	aipom.setDexNumber(190);
    	aipom.setTypes("Normal", "(none)");
    	aipom.addAbilities("Run Away", "Pickup", "Skill Link");
    	aipom.setAllBaseStats(55, 70, 55, 40, 55, 85);
    	aipom.setWeight(11.5);
    	pokedex.put("Aipom", aipom);

    	Pokemon alakazam = new Pokemon("Alakazam");
    	alakazam.setDexNumber(65);
    	alakazam.setTypes("Psychic", "(none)");
    	alakazam.addAbilities("Synchronize", "Inner Focus", "Magic Guard");
    	alakazam.setAllBaseStats(55, 50, 45, 135, 95, 120);
    	alakazam.setWeight(48.0);
    	alakazam.setFormes("Alakazam", "Alakazam-Mega");
    	pokedex.put("Alakazam", alakazam);

    	Pokemon alakazammega = new Pokemon("Alakazam-Mega");
    	alakazammega.setDexNumber(65);
    	alakazammega.setTypes("Psychic", "(none)");
    	alakazammega.addAbilities("Trace");
    	alakazammega.setAllBaseStats(55, 50, 65, 175, 105, 150);
    	alakazammega.setWeight(48.0);
    	pokedex.put("Alakazam-Mega", alakazammega);

    	Pokemon alomomola = new Pokemon("Alomomola");
    	alomomola.setDexNumber(594);
    	alomomola.setTypes("Water", "(none)");
    	alomomola.addAbilities("Healer", "Hydration", "Regenerator");
    	alomomola.setAllBaseStats(165, 75, 80, 40, 45, 65);
    	alomomola.setWeight(31.6);
    	pokedex.put("Alomomola", alomomola);

    	Pokemon altaria = new Pokemon("Altaria");
    	altaria.setDexNumber(334);
    	altaria.setTypes("Dragon", "Flying");
    	altaria.addAbilities("Natural Cure", "Cloud Nine");
    	altaria.setAllBaseStats(75, 70, 90, 70, 105, 80);
    	altaria.setWeight(20.6);
    	altaria.setFormes("Altaria", "Altaria-Mega");
    	pokedex.put("Altaria", altaria);

    	Pokemon altariamega = new Pokemon("Altaria-Mega");
    	altariamega.setDexNumber(334);
    	altariamega.setTypes("Dragon", "Fairy");
    	altariamega.addAbilities("Pixilate");
    	altariamega.setAllBaseStats(75, 110, 110, 110, 105, 80);
    	altariamega.setWeight(20.6);
    	pokedex.put("Altaria-Mega", altariamega);

    	Pokemon amaura = new Pokemon("Amaura");
    	amaura.setDexNumber(698);
    	amaura.setTypes("Rock", "Ice");
    	amaura.addAbilities("Refrigerate", "Snow Warning");
    	amaura.setAllBaseStats(77, 59, 50, 67, 63, 46);
    	amaura.setWeight(25.2);
    	pokedex.put("Amaura", amaura);

    	Pokemon ambipom = new Pokemon("Ambipom");
    	ambipom.setDexNumber(424);
    	ambipom.setTypes("Normal", "(none)");
    	ambipom.addAbilities("Technician", "Pickup", "Skill Link");
    	ambipom.setAllBaseStats(75, 100, 66, 60, 66, 115);
    	ambipom.setWeight(20.3);
    	pokedex.put("Ambipom", ambipom);

    	Pokemon amoonguss = new Pokemon("Amoonguss");
    	amoonguss.setDexNumber(591);
    	amoonguss.setTypes("Grass", "Poison");
    	amoonguss.addAbilities("Effect Spore", "Regenerator");
    	amoonguss.setAllBaseStats(114, 85, 70, 85, 80, 30);
    	amoonguss.setWeight(10.5);
    	pokedex.put("Amoonguss", amoonguss);

    	Pokemon ampharos = new Pokemon("Ampharos");
    	ampharos.setDexNumber(181);
    	ampharos.setTypes("Electric", "(none)");
    	ampharos.addAbilities("Static", "Plus");
    	ampharos.setAllBaseStats(90, 75, 85, 115, 90, 55);
    	ampharos.setWeight(61.5);
    	ampharos.setFormes("Ampharos", "Ampharos-Mega");
    	pokedex.put("Ampharos", ampharos);

    	Pokemon ampharosmega = new Pokemon("Ampharos-Mega");
    	ampharosmega.setDexNumber(181);
    	ampharosmega.setTypes("Electric", "Dragon");
    	ampharosmega.addAbilities("Mold Breaker");
    	ampharosmega.setAllBaseStats(90, 95, 105, 165, 110, 45);
    	ampharosmega.setWeight(61.5);
    	pokedex.put("Ampharos-Mega", ampharosmega);

    	Pokemon anorith = new Pokemon("Anorith");
    	anorith.setDexNumber(347);
    	anorith.setTypes("Rock", "Bug");
    	anorith.addAbilities("Battle Armor", "Swift Swim");
    	anorith.setAllBaseStats(45, 95, 50, 40, 50, 75);
    	anorith.setWeight(12.5);
    	pokedex.put("Anorith", anorith);

    	Pokemon araquanid = new Pokemon("Araquanid");
    	araquanid.setDexNumber(752);
    	araquanid.setTypes("Water", "Bug");
    	araquanid.addAbilities("Water Bubble", "Water Absorb");
    	araquanid.setAllBaseStats(68, 70, 92, 50, 132, 42);
    	araquanid.setWeight(82.0);
    	pokedex.put("Araquanid", araquanid);

    	Pokemon araquanidtotem = new Pokemon("Araquanid-Totem");
    	araquanidtotem.setDexNumber(752);
    	araquanidtotem.setTypes("Water", "Bug");
    	araquanidtotem.addAbilities("Water Bubble");
    	araquanidtotem.setAllBaseStats(68, 70, 92, 50, 132, 42);
    	araquanidtotem.setWeight(217.5);
    	pokedex.put("Araquanid-Totem", araquanidtotem);

    	Pokemon arbok = new Pokemon("Arbok");
    	arbok.setDexNumber(24);
    	arbok.setTypes("Poison", "(none)");
    	arbok.addAbilities("Intimidate", "Shed Skin", "Unnerve");
    	arbok.setAllBaseStats(60, 95, 69, 65, 79, 80);
    	arbok.setWeight(65.0);
    	pokedex.put("Arbok", arbok);

    	Pokemon arcanine = new Pokemon("Arcanine");
    	arcanine.setDexNumber(59);
    	arcanine.setTypes("Fire", "(none)");
    	arcanine.addAbilities("Intimidate", "Flash Fire", "Justified");
    	arcanine.setAllBaseStats(90, 110, 80, 100, 80, 95);
    	arcanine.setWeight(155.0);
    	pokedex.put("Arcanine", arcanine);

    	Pokemon arceus = new Pokemon("Arceus");
    	arceus.setDexNumber(493);
    	arceus.setTypes("Normal", "(none)");
    	arceus.addAbilities("Multitype");
    	arceus.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceus.setWeight(320.0);
    	pokedex.put("Arceus", arceus);

    	Pokemon arceusbug = new Pokemon("Arceus-Bug");
    	arceusbug.setDexNumber(493);
    	arceusbug.setTypes("Bug", "(none)");
    	arceusbug.addAbilities("Multitype");
    	arceusbug.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusbug.setWeight(320.0);
    	pokedex.put("Arceus-Bug", arceusbug);

    	Pokemon arceusdark = new Pokemon("Arceus-Dark");
    	arceusdark.setDexNumber(493);
    	arceusdark.setTypes("Dark", "(none)");
    	arceusdark.addAbilities("Multitype");
    	arceusdark.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusdark.setWeight(320.0);
    	pokedex.put("Arceus-Dark", arceusdark);

    	Pokemon arceusdragon = new Pokemon("Arceus-Dragon");
    	arceusdragon.setDexNumber(493);
    	arceusdragon.setTypes("Dragon", "(none)");
    	arceusdragon.addAbilities("Multitype");
    	arceusdragon.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusdragon.setWeight(320.0);
    	pokedex.put("Arceus-Dragon", arceusdragon);

    	Pokemon arceuselectric = new Pokemon("Arceus-Electric");
    	arceuselectric.setDexNumber(493);
    	arceuselectric.setTypes("Electric", "(none)");
    	arceuselectric.addAbilities("Multitype");
    	arceuselectric.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceuselectric.setWeight(320.0);
    	pokedex.put("Arceus-Electric", arceuselectric);

    	Pokemon arceusfairy = new Pokemon("Arceus-Fairy");
    	arceusfairy.setDexNumber(493);
    	arceusfairy.setTypes("Fairy", "(none)");
    	arceusfairy.addAbilities("Multitype");
    	arceusfairy.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusfairy.setWeight(320.0);
    	pokedex.put("Arceus-Fairy", arceusfairy);

    	Pokemon arceusfighting = new Pokemon("Arceus-Fighting");
    	arceusfighting.setDexNumber(493);
    	arceusfighting.setTypes("Fighting", "(none)");
    	arceusfighting.addAbilities("Multitype");
    	arceusfighting.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusfighting.setWeight(320.0);
    	pokedex.put("Arceus-Fighting", arceusfighting);

    	Pokemon arceusfire = new Pokemon("Arceus-Fire");
    	arceusfire.setDexNumber(493);
    	arceusfire.setTypes("Fire", "(none)");
    	arceusfire.addAbilities("Multitype");
    	arceusfire.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusfire.setWeight(320.0);
    	pokedex.put("Arceus-Fire", arceusfire);

    	Pokemon arceusflying = new Pokemon("Arceus-Flying");
    	arceusflying.setDexNumber(493);
    	arceusflying.setTypes("Flying", "(none)");
    	arceusflying.addAbilities("Multitype");
    	arceusflying.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusflying.setWeight(320.0);
    	pokedex.put("Arceus-Flying", arceusflying);

    	Pokemon arceusghost = new Pokemon("Arceus-Ghost");
    	arceusghost.setDexNumber(493);
    	arceusghost.setTypes("Ghost", "(none)");
    	arceusghost.addAbilities("Multitype");
    	arceusghost.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusghost.setWeight(320.0);
    	pokedex.put("Arceus-Ghost", arceusghost);

    	Pokemon arceusgrass = new Pokemon("Arceus-Grass");
    	arceusgrass.setDexNumber(493);
    	arceusgrass.setTypes("Grass", "(none)");
    	arceusgrass.addAbilities("Multitype");
    	arceusgrass.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusgrass.setWeight(320.0);
    	pokedex.put("Arceus-Grass", arceusgrass);

    	Pokemon arceusground = new Pokemon("Arceus-Ground");
    	arceusground.setDexNumber(493);
    	arceusground.setTypes("Ground", "(none)");
    	arceusground.addAbilities("Multitype");
    	arceusground.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusground.setWeight(320.0);
    	pokedex.put("Arceus-Ground", arceusground);

    	Pokemon arceusice = new Pokemon("Arceus-Ice");
    	arceusice.setDexNumber(493);
    	arceusice.setTypes("Ice", "(none)");
    	arceusice.addAbilities("Multitype");
    	arceusice.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusice.setWeight(320.0);
    	pokedex.put("Arceus-Ice", arceusice);

    	Pokemon arceuspoison = new Pokemon("Arceus-Poison");
    	arceuspoison.setDexNumber(493);
    	arceuspoison.setTypes("Poison", "(none)");
    	arceuspoison.addAbilities("Multitype");
    	arceuspoison.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceuspoison.setWeight(320.0);
    	pokedex.put("Arceus-Poison", arceuspoison);

    	Pokemon arceuspsychic = new Pokemon("Arceus-Psychic");
    	arceuspsychic.setDexNumber(493);
    	arceuspsychic.setTypes("Psychic", "(none)");
    	arceuspsychic.addAbilities("Multitype");
    	arceuspsychic.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceuspsychic.setWeight(320.0);
    	pokedex.put("Arceus-Psychic", arceuspsychic);

    	Pokemon arceusrock = new Pokemon("Arceus-Rock");
    	arceusrock.setDexNumber(493);
    	arceusrock.setTypes("Rock", "(none)");
    	arceusrock.addAbilities("Multitype");
    	arceusrock.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceusrock.setWeight(320.0);
    	pokedex.put("Arceus-Rock", arceusrock);

    	Pokemon arceussteel = new Pokemon("Arceus-Steel");
    	arceussteel.setDexNumber(493);
    	arceussteel.setTypes("Steel", "(none)");
    	arceussteel.addAbilities("Multitype");
    	arceussteel.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceussteel.setWeight(320.0);
    	pokedex.put("Arceus-Steel", arceussteel);

    	Pokemon arceuswater = new Pokemon("Arceus-Water");
    	arceuswater.setDexNumber(493);
    	arceuswater.setTypes("Water", "(none)");
    	arceuswater.addAbilities("Multitype");
    	arceuswater.setAllBaseStats(120, 120, 120, 120, 120, 120);
    	arceuswater.setWeight(320.0);
    	pokedex.put("Arceus-Water", arceuswater);

    	Pokemon archen = new Pokemon("Archen");
    	archen.setDexNumber(566);
    	archen.setTypes("Rock", "Flying");
    	archen.addAbilities("Defeatist");
    	archen.setAllBaseStats(55, 112, 45, 74, 45, 70);
    	archen.setWeight(9.5);
    	pokedex.put("Archen", archen);

    	Pokemon archeops = new Pokemon("Archeops");
    	archeops.setDexNumber(567);
    	archeops.setTypes("Rock", "Flying");
    	archeops.addAbilities("Defeatist");
    	archeops.setAllBaseStats(75, 140, 65, 112, 65, 110);
    	archeops.setWeight(32.0);
    	pokedex.put("Archeops", archeops);

    	Pokemon argalis = new Pokemon("Argalis");
    	argalis.setDexNumber(-108);
    	argalis.setTypes("Bug", "Psychic");
    	argalis.addAbilities("Shed Skin", "Compound Eyes");
    	argalis.setAllBaseStats(60, 90, 89, 87, 40, 54);
    	argalis.setWeight(341.4);
    	pokedex.put("Argalis", argalis);

    	Pokemon arghonaut = new Pokemon("Arghonaut");
    	arghonaut.setDexNumber(-56);
    	arghonaut.setTypes("Water", "Fighting");
    	arghonaut.addAbilities("Unaware", "Technician");
    	arghonaut.setAllBaseStats(105, 110, 95, 70, 100, 75);
    	arghonaut.setWeight(151.0);
    	pokedex.put("Arghonaut", arghonaut);

    	Pokemon ariados = new Pokemon("Ariados");
    	ariados.setDexNumber(168);
    	ariados.setTypes("Bug", "Poison");
    	ariados.addAbilities("Swarm", "Insomnia", "Sniper");
    	ariados.setAllBaseStats(70, 90, 70, 60, 70, 40);
    	ariados.setWeight(33.5);
    	pokedex.put("Ariados", ariados);

    	Pokemon armaldo = new Pokemon("Armaldo");
    	armaldo.setDexNumber(348);
    	armaldo.setTypes("Rock", "Bug");
    	armaldo.addAbilities("Battle Armor", "Swift Swim");
    	armaldo.setAllBaseStats(75, 125, 100, 70, 80, 45);
    	armaldo.setWeight(68.2);
    	pokedex.put("Armaldo", armaldo);

    	Pokemon aromatisse = new Pokemon("Aromatisse");
    	aromatisse.setDexNumber(683);
    	aromatisse.setTypes("Fairy", "(none)");
    	aromatisse.addAbilities("Healer", "Aroma Veil");
    	aromatisse.setAllBaseStats(101, 72, 72, 99, 89, 29);
    	aromatisse.setWeight(15.5);
    	pokedex.put("Aromatisse", aromatisse);

    	Pokemon aron = new Pokemon("Aron");
    	aron.setDexNumber(304);
    	aron.setTypes("Steel", "Rock");
    	aron.addAbilities("Sturdy", "Rock Head", "Heavy Metal");
    	aron.setAllBaseStats(50, 70, 100, 40, 40, 30);
    	aron.setWeight(60.0);
    	pokedex.put("Aron", aron);

    	Pokemon articuno = new Pokemon("Articuno");
    	articuno.setDexNumber(144);
    	articuno.setTypes("Ice", "Flying");
    	articuno.addAbilities("Pressure", "Snow Cloak");
    	articuno.setAllBaseStats(90, 85, 100, 95, 125, 85);
    	articuno.setWeight(55.4);
    	pokedex.put("Articuno", articuno);

    	Pokemon audino = new Pokemon("Audino");
    	audino.setDexNumber(531);
    	audino.setTypes("Normal", "(none)");
    	audino.addAbilities("Healer", "Regenerator", "Klutz");
    	audino.setAllBaseStats(103, 60, 86, 60, 86, 50);
    	audino.setWeight(31.0);
    	audino.setFormes("Audino", "Audino-Mega");
    	pokedex.put("Audino", audino);

    	Pokemon audinomega = new Pokemon("Audino-Mega");
    	audinomega.setDexNumber(531);
    	audinomega.setTypes("Normal", "Fairy");
    	audinomega.addAbilities("Healer");
    	audinomega.setAllBaseStats(103, 60, 126, 80, 126, 50);
    	audinomega.setWeight(32.0);
    	pokedex.put("Audino-Mega", audinomega);

    	Pokemon aurorus = new Pokemon("Aurorus");
    	aurorus.setDexNumber(699);
    	aurorus.setTypes("Rock", "Ice");
    	aurorus.addAbilities("Refrigerate", "Snow Warning");
    	aurorus.setAllBaseStats(123, 77, 72, 99, 92, 58);
    	aurorus.setWeight(225.0);
    	pokedex.put("Aurorus", aurorus);

    	Pokemon aurumoth = new Pokemon("Aurumoth");
    	aurumoth.setDexNumber(-4);
    	aurumoth.setTypes("Bug", "Psychic");
    	aurumoth.addAbilities("Weak Armor", "No Guard", "Light Metal");
    	aurumoth.setAllBaseStats(110, 120, 99, 117, 60, 94);
    	aurumoth.setWeight(193.0);
    	pokedex.put("Aurumoth", aurumoth);

    	Pokemon avalugg = new Pokemon("Avalugg");
    	avalugg.setDexNumber(713);
    	avalugg.setTypes("Ice", "(none)");
    	avalugg.addAbilities("Own Tempo", "Ice Body", "Sturdy");
    	avalugg.setAllBaseStats(95, 117, 184, 44, 46, 28);
    	avalugg.setWeight(505.0);
    	pokedex.put("Avalugg", avalugg);

    	Pokemon axew = new Pokemon("Axew");
    	axew.setDexNumber(610);
    	axew.setTypes("Dragon", "(none)");
    	axew.addAbilities("Rivalry", "Mold Breaker", "Unnerve");
    	axew.setAllBaseStats(46, 87, 60, 30, 40, 57);
    	axew.setWeight(18.0);
    	pokedex.put("Axew", axew);

    	Pokemon azelf = new Pokemon("Azelf");
    	azelf.setDexNumber(482);
    	azelf.setTypes("Psychic", "(none)");
    	azelf.addAbilities("Levitate");
    	azelf.setAllBaseStats(75, 125, 70, 125, 70, 115);
    	azelf.setWeight(0.3);
    	pokedex.put("Azelf", azelf);

    	Pokemon azumarill = new Pokemon("Azumarill");
    	azumarill.setDexNumber(184);
    	azumarill.setTypes("Water", "Fairy");
    	azumarill.addAbilities("Thick Fat", "Huge Power", "Sap Sipper");
    	azumarill.setAllBaseStats(100, 50, 80, 60, 80, 50);
    	azumarill.setWeight(28.5);
    	pokedex.put("Azumarill", azumarill);

    	Pokemon azurill = new Pokemon("Azurill");
    	azurill.setDexNumber(298);
    	azurill.setTypes("Normal", "Fairy");
    	azurill.addAbilities("Thick Fat", "Huge Power", "Sap Sipper");
    	azurill.setAllBaseStats(50, 20, 40, 20, 40, 20);
    	azurill.setWeight(2.0);
    	pokedex.put("Azurill", azurill);

    	Pokemon bagon = new Pokemon("Bagon");
    	bagon.setDexNumber(371);
    	bagon.setTypes("Dragon", "(none)");
    	bagon.addAbilities("Rock Head", "Sheer Force");
    	bagon.setAllBaseStats(45, 75, 60, 40, 30, 50);
    	bagon.setWeight(42.1);
    	pokedex.put("Bagon", bagon);

    	Pokemon baltoy = new Pokemon("Baltoy");
    	baltoy.setDexNumber(343);
    	baltoy.setTypes("Ground", "Psychic");
    	baltoy.addAbilities("Levitate");
    	baltoy.setAllBaseStats(40, 40, 55, 40, 70, 55);
    	baltoy.setWeight(21.5);
    	pokedex.put("Baltoy", baltoy);

    	Pokemon banette = new Pokemon("Banette");
    	banette.setDexNumber(354);
    	banette.setTypes("Ghost", "(none)");
    	banette.addAbilities("Insomnia", "Frisk", "Cursed Body");
    	banette.setAllBaseStats(64, 115, 65, 83, 63, 65);
    	banette.setWeight(12.5);
    	banette.setFormes("Banette", "Banette-Mega");
    	pokedex.put("Banette", banette);

    	Pokemon banettemega = new Pokemon("Banette-Mega");
    	banettemega.setDexNumber(354);
    	banettemega.setTypes("Ghost", "(none)");
    	banettemega.addAbilities("Prankster");
    	banettemega.setAllBaseStats(64, 165, 75, 93, 83, 75);
    	banettemega.setWeight(13.0);
    	pokedex.put("Banette-Mega", banettemega);

    	Pokemon barbaracle = new Pokemon("Barbaracle");
    	barbaracle.setDexNumber(689);
    	barbaracle.setTypes("Rock", "Water");
    	barbaracle.addAbilities("Tough Claws", "Sniper", "Pickpocket");
    	barbaracle.setAllBaseStats(72, 105, 115, 54, 86, 68);
    	barbaracle.setWeight(96.0);
    	pokedex.put("Barbaracle", barbaracle);

    	Pokemon barboach = new Pokemon("Barboach");
    	barboach.setDexNumber(339);
    	barboach.setTypes("Water", "Ground");
    	barboach.addAbilities("Oblivious", "Anticipation", "Hydration");
    	barboach.setAllBaseStats(50, 48, 43, 46, 41, 60);
    	barboach.setWeight(1.9);
    	pokedex.put("Barboach", barboach);

    	Pokemon basculin = new Pokemon("Basculin");
    	basculin.setDexNumber(550);
    	basculin.setTypes("Water", "(none)");
    	basculin.addAbilities("Reckless", "Adaptability", "Mold Breaker");
    	basculin.setAllBaseStats(70, 92, 65, 80, 55, 98);
    	basculin.setWeight(18.0);
    	pokedex.put("Basculin", basculin);

    	Pokemon basculinbluestriped = new Pokemon("Basculin-Blue-Striped");
    	basculinbluestriped.setDexNumber(550);
    	basculinbluestriped.setTypes("Water", "(none)");
    	basculinbluestriped.addAbilities("Rock Head", "Adaptability", "Mold Breaker");
    	basculinbluestriped.setAllBaseStats(70, 92, 65, 80, 55, 98);
    	basculinbluestriped.setWeight(18.0);
    	pokedex.put("Basculin-Blue-Striped", basculinbluestriped);

    	Pokemon bastiodon = new Pokemon("Bastiodon");
    	bastiodon.setDexNumber(411);
    	bastiodon.setTypes("Rock", "Steel");
    	bastiodon.addAbilities("Sturdy", "Soundproof");
    	bastiodon.setAllBaseStats(60, 52, 168, 47, 138, 30);
    	bastiodon.setWeight(149.5);
    	pokedex.put("Bastiodon", bastiodon);

    	Pokemon bayleef = new Pokemon("Bayleef");
    	bayleef.setDexNumber(153);
    	bayleef.setTypes("Grass", "(none)");
    	bayleef.addAbilities("Overgrow", "Leaf Guard");
    	bayleef.setAllBaseStats(60, 62, 80, 63, 80, 60);
    	bayleef.setWeight(15.8);
    	pokedex.put("Bayleef", bayleef);

    	Pokemon beartic = new Pokemon("Beartic");
    	beartic.setDexNumber(614);
    	beartic.setTypes("Ice", "(none)");
    	beartic.addAbilities("Snow Cloak", "Slush Rush", "Swift Swim");
    	beartic.setAllBaseStats(95, 130, 80, 70, 80, 50);
    	beartic.setWeight(260.0);
    	pokedex.put("Beartic", beartic);

    	Pokemon beautifly = new Pokemon("Beautifly");
    	beautifly.setDexNumber(267);
    	beautifly.setTypes("Bug", "Flying");
    	beautifly.addAbilities("Swarm", "Rivalry");
    	beautifly.setAllBaseStats(60, 70, 50, 100, 50, 65);
    	beautifly.setWeight(28.4);
    	pokedex.put("Beautifly", beautifly);

    	Pokemon beedrill = new Pokemon("Beedrill");
    	beedrill.setDexNumber(15);
    	beedrill.setTypes("Bug", "Poison");
    	beedrill.addAbilities("Swarm", "Sniper");
    	beedrill.setAllBaseStats(65, 90, 40, 45, 80, 75);
    	beedrill.setWeight(29.5);
    	beedrill.setFormes("Beedrill", "Beedrill-Mega");
    	pokedex.put("Beedrill", beedrill);

    	Pokemon beedrillmega = new Pokemon("Beedrill-Mega");
    	beedrillmega.setDexNumber(15);
    	beedrillmega.setTypes("Bug", "Poison");
    	beedrillmega.addAbilities("Adaptability");
    	beedrillmega.setAllBaseStats(65, 150, 40, 15, 80, 145);
    	beedrillmega.setWeight(40.5);
    	pokedex.put("Beedrill-Mega", beedrillmega);

    	Pokemon beheeyem = new Pokemon("Beheeyem");
    	beheeyem.setDexNumber(606);
    	beheeyem.setTypes("Psychic", "(none)");
    	beheeyem.addAbilities("Telepathy", "Synchronize", "Analytic");
    	beheeyem.setAllBaseStats(75, 75, 75, 125, 95, 40);
    	beheeyem.setWeight(34.5);
    	pokedex.put("Beheeyem", beheeyem);

    	Pokemon beldum = new Pokemon("Beldum");
    	beldum.setDexNumber(374);
    	beldum.setTypes("Steel", "Psychic");
    	beldum.addAbilities("Clear Body", "Light Metal");
    	beldum.setAllBaseStats(40, 55, 80, 35, 60, 30);
    	beldum.setWeight(95.2);
    	pokedex.put("Beldum", beldum);

    	Pokemon bellossom = new Pokemon("Bellossom");
    	bellossom.setDexNumber(182);
    	bellossom.setTypes("Grass", "(none)");
    	bellossom.addAbilities("Chlorophyll", "Healer");
    	bellossom.setAllBaseStats(75, 80, 95, 90, 100, 50);
    	bellossom.setWeight(5.8);
    	pokedex.put("Bellossom", bellossom);

    	Pokemon bellsprout = new Pokemon("Bellsprout");
    	bellsprout.setDexNumber(69);
    	bellsprout.setTypes("Grass", "Poison");
    	bellsprout.addAbilities("Chlorophyll", "Gluttony");
    	bellsprout.setAllBaseStats(50, 75, 35, 70, 30, 40);
    	bellsprout.setWeight(4.0);
    	pokedex.put("Bellsprout", bellsprout);

    	Pokemon bergmite = new Pokemon("Bergmite");
    	bergmite.setDexNumber(712);
    	bergmite.setTypes("Ice", "(none)");
    	bergmite.addAbilities("Own Tempo", "Ice Body", "Sturdy");
    	bergmite.setAllBaseStats(55, 69, 85, 32, 35, 28);
    	bergmite.setWeight(99.5);
    	pokedex.put("Bergmite", bergmite);

    	Pokemon bewear = new Pokemon("Bewear");
    	bewear.setDexNumber(760);
    	bewear.setTypes("Normal", "Fighting");
    	bewear.addAbilities("Fluffy", "Klutz", "Unnerve");
    	bewear.setAllBaseStats(120, 125, 80, 55, 60, 60);
    	bewear.setWeight(135.0);
    	pokedex.put("Bewear", bewear);

    	Pokemon bibarel = new Pokemon("Bibarel");
    	bibarel.setDexNumber(400);
    	bibarel.setTypes("Normal", "Water");
    	bibarel.addAbilities("Simple", "Unaware", "Moody");
    	bibarel.setAllBaseStats(79, 85, 60, 55, 60, 71);
    	bibarel.setWeight(31.5);
    	pokedex.put("Bibarel", bibarel);

    	Pokemon bidoof = new Pokemon("Bidoof");
    	bidoof.setDexNumber(399);
    	bidoof.setTypes("Normal", "(none)");
    	bidoof.addAbilities("Simple", "Unaware", "Moody");
    	bidoof.setAllBaseStats(59, 45, 40, 35, 40, 31);
    	bidoof.setWeight(20.0);
    	pokedex.put("Bidoof", bidoof);

    	Pokemon binacle = new Pokemon("Binacle");
    	binacle.setDexNumber(688);
    	binacle.setTypes("Rock", "Water");
    	binacle.addAbilities("Tough Claws", "Sniper", "Pickpocket");
    	binacle.setAllBaseStats(42, 52, 67, 39, 56, 50);
    	binacle.setWeight(31.0);
    	pokedex.put("Binacle", binacle);

    	Pokemon bisharp = new Pokemon("Bisharp");
    	bisharp.setDexNumber(625);
    	bisharp.setTypes("Dark", "Steel");
    	bisharp.addAbilities("Defiant", "Inner Focus", "Pressure");
    	bisharp.setAllBaseStats(65, 125, 100, 60, 70, 70);
    	bisharp.setWeight(70.0);
    	pokedex.put("Bisharp", bisharp);

    	Pokemon blacephalon = new Pokemon("Blacephalon");
    	blacephalon.setDexNumber(806);
    	blacephalon.setTypes("Fire", "Ghost");
    	blacephalon.addAbilities("Beast Boost");
    	blacephalon.setAllBaseStats(53, 127, 53, 151, 79, 107);
    	blacephalon.setWeight(13.0);
    	pokedex.put("Blacephalon", blacephalon);

    	Pokemon blastoise = new Pokemon("Blastoise");
    	blastoise.setDexNumber(9);
    	blastoise.setTypes("Water", "(none)");
    	blastoise.addAbilities("Torrent", "Rain Dish");
    	blastoise.setAllBaseStats(79, 83, 100, 85, 105, 78);
    	blastoise.setWeight(85.5);
    	blastoise.setFormes("Blastoise", "Blastoise-Mega");
    	pokedex.put("Blastoise", blastoise);

    	Pokemon blastoisemega = new Pokemon("Blastoise-Mega");
    	blastoisemega.setDexNumber(9);
    	blastoisemega.setTypes("Water", "(none)");
    	blastoisemega.addAbilities("Mega Launcher");
    	blastoisemega.setAllBaseStats(79, 103, 120, 135, 115, 78);
    	blastoisemega.setWeight(101.1);
    	pokedex.put("Blastoise-Mega", blastoisemega);

    	Pokemon blaziken = new Pokemon("Blaziken");
    	blaziken.setDexNumber(257);
    	blaziken.setTypes("Fire", "Fighting");
    	blaziken.addAbilities("Blaze", "Speed Boost");
    	blaziken.setAllBaseStats(80, 120, 70, 110, 70, 80);
    	blaziken.setWeight(52.0);
    	blaziken.setFormes("Blaziken", "Blaziken-Mega");
    	pokedex.put("Blaziken", blaziken);

    	Pokemon blazikenmega = new Pokemon("Blaziken-Mega");
    	blazikenmega.setDexNumber(257);
    	blazikenmega.setTypes("Fire", "Fighting");
    	blazikenmega.addAbilities("Speed Boost");
    	blazikenmega.setAllBaseStats(80, 160, 80, 130, 80, 100);
    	blazikenmega.setWeight(52.0);
    	pokedex.put("Blaziken-Mega", blazikenmega);

    	Pokemon blissey = new Pokemon("Blissey");
    	blissey.setDexNumber(242);
    	blissey.setTypes("Normal", "(none)");
    	blissey.addAbilities("Natural Cure", "Serene Grace", "Healer");
    	blissey.setAllBaseStats(255, 10, 10, 75, 135, 55);
    	blissey.setWeight(46.8);
    	pokedex.put("Blissey", blissey);

    	Pokemon blitzle = new Pokemon("Blitzle");
    	blitzle.setDexNumber(522);
    	blitzle.setTypes("Electric", "(none)");
    	blitzle.addAbilities("Lightning Rod", "Motor Drive", "Sap Sipper");
    	blitzle.setAllBaseStats(45, 60, 32, 50, 32, 76);
    	blitzle.setWeight(29.8);
    	pokedex.put("Blitzle", blitzle);

    	Pokemon boldore = new Pokemon("Boldore");
    	boldore.setDexNumber(525);
    	boldore.setTypes("Rock", "(none)");
    	boldore.addAbilities("Sturdy", "Weak Armor", "Sand Force");
    	boldore.setAllBaseStats(70, 105, 105, 50, 40, 20);
    	boldore.setWeight(102.0);
    	pokedex.put("Boldore", boldore);

    	Pokemon bonsly = new Pokemon("Bonsly");
    	bonsly.setDexNumber(438);
    	bonsly.setTypes("Rock", "(none)");
    	bonsly.addAbilities("Sturdy", "Rock Head", "Rattled");
    	bonsly.setAllBaseStats(50, 80, 95, 10, 45, 10);
    	bonsly.setWeight(15.0);
    	pokedex.put("Bonsly", bonsly);

    	Pokemon bouffalant = new Pokemon("Bouffalant");
    	bouffalant.setDexNumber(626);
    	bouffalant.setTypes("Normal", "(none)");
    	bouffalant.addAbilities("Reckless", "Sap Sipper", "Soundproof");
    	bouffalant.setAllBaseStats(95, 110, 95, 40, 95, 55);
    	bouffalant.setWeight(94.6);
    	pokedex.put("Bouffalant", bouffalant);

    	Pokemon bounsweet = new Pokemon("Bounsweet");
    	bounsweet.setDexNumber(761);
    	bounsweet.setTypes("Grass", "(none)");
    	bounsweet.addAbilities("Leaf Guard", "Oblivious", "Sweet Veil");
    	bounsweet.setAllBaseStats(42, 30, 38, 30, 38, 32);
    	bounsweet.setWeight(3.2);
    	pokedex.put("Bounsweet", bounsweet);

    	Pokemon braixen = new Pokemon("Braixen");
    	braixen.setDexNumber(654);
    	braixen.setTypes("Fire", "(none)");
    	braixen.addAbilities("Blaze", "Magician");
    	braixen.setAllBaseStats(59, 59, 58, 90, 70, 73);
    	braixen.setWeight(14.5);
    	pokedex.put("Braixen", braixen);

    	Pokemon brattler = new Pokemon("Brattler");
    	brattler.setDexNumber(-109);
    	brattler.setTypes("Dark", "Grass");
    	brattler.addAbilities("Harvest", "Infiltrator");
    	brattler.setAllBaseStats(80, 70, 40, 20, 90, 30);
    	brattler.setWeight(11.5);
    	pokedex.put("Brattler", brattler);

    	Pokemon braviary = new Pokemon("Braviary");
    	braviary.setDexNumber(628);
    	braviary.setTypes("Normal", "Flying");
    	braviary.addAbilities("Keen Eye", "Sheer Force", "Defiant");
    	braviary.setAllBaseStats(100, 123, 75, 57, 75, 80);
    	braviary.setWeight(41.0);
    	pokedex.put("Braviary", braviary);

    	Pokemon breezi = new Pokemon("Breezi");
    	breezi.setDexNumber(-104);
    	breezi.setTypes("Poison", "Flying");
    	breezi.addAbilities("Unburden", "Own Tempo");
    	breezi.setAllBaseStats(50, 46, 69, 60, 50, 75);
    	breezi.setWeight(0.6);
    	pokedex.put("Breezi", breezi);

    	Pokemon breloom = new Pokemon("Breloom");
    	breloom.setDexNumber(286);
    	breloom.setTypes("Grass", "Fighting");
    	breloom.addAbilities("Effect Spore", "Poison Heal", "Technician");
    	breloom.setAllBaseStats(60, 130, 80, 60, 60, 70);
    	breloom.setWeight(39.2);
    	pokedex.put("Breloom", breloom);

    	Pokemon brionne = new Pokemon("Brionne");
    	brionne.setDexNumber(729);
    	brionne.setTypes("Water", "(none)");
    	brionne.addAbilities("Torrent", "Liquid Voice");
    	brionne.setAllBaseStats(60, 69, 69, 91, 81, 50);
    	brionne.setWeight(17.5);
    	pokedex.put("Brionne", brionne);

    	Pokemon bronzong = new Pokemon("Bronzong");
    	bronzong.setDexNumber(437);
    	bronzong.setTypes("Steel", "Psychic");
    	bronzong.addAbilities("Levitate", "Heatproof", "Heavy Metal");
    	bronzong.setAllBaseStats(67, 89, 116, 79, 116, 33);
    	bronzong.setWeight(187.0);
    	pokedex.put("Bronzong", bronzong);

    	Pokemon bronzor = new Pokemon("Bronzor");
    	bronzor.setDexNumber(436);
    	bronzor.setTypes("Steel", "Psychic");
    	bronzor.addAbilities("Levitate", "Heatproof", "Heavy Metal");
    	bronzor.setAllBaseStats(57, 24, 86, 24, 86, 23);
    	bronzor.setWeight(60.5);
    	pokedex.put("Bronzor", bronzor);

    	Pokemon bruxish = new Pokemon("Bruxish");
    	bruxish.setDexNumber(779);
    	bruxish.setTypes("Water", "Psychic");
    	bruxish.addAbilities("Dazzling", "Strong Jaw", "Wonder Skin");
    	bruxish.setAllBaseStats(68, 105, 70, 70, 70, 92);
    	bruxish.setWeight(19.0);
    	pokedex.put("Bruxish", bruxish);

    	Pokemon budew = new Pokemon("Budew");
    	budew.setDexNumber(406);
    	budew.setTypes("Grass", "Poison");
    	budew.addAbilities("Natural Cure", "Poison Point", "Leaf Guard");
    	budew.setAllBaseStats(40, 30, 35, 50, 70, 55);
    	budew.setWeight(1.2);
    	pokedex.put("Budew", budew);

    	Pokemon buizel = new Pokemon("Buizel");
    	buizel.setDexNumber(418);
    	buizel.setTypes("Water", "(none)");
    	buizel.addAbilities("Swift Swim", "Water Veil");
    	buizel.setAllBaseStats(55, 65, 35, 60, 30, 85);
    	buizel.setWeight(29.5);
    	pokedex.put("Buizel", buizel);

    	Pokemon bulbasaur = new Pokemon("Bulbasaur");
    	bulbasaur.setDexNumber(1);
    	bulbasaur.setTypes("Grass", "Poison");
    	bulbasaur.addAbilities("Overgrow", "Chlorophyll");
    	bulbasaur.setAllBaseStats(45, 49, 49, 65, 65, 45);
    	bulbasaur.setWeight(6.9);
    	pokedex.put("Bulbasaur", bulbasaur);

    	Pokemon buneary = new Pokemon("Buneary");
    	buneary.setDexNumber(427);
    	buneary.setTypes("Normal", "(none)");
    	buneary.addAbilities("Run Away", "Klutz", "Limber");
    	buneary.setAllBaseStats(55, 66, 44, 44, 56, 85);
    	buneary.setWeight(5.5);
    	pokedex.put("Buneary", buneary);

    	Pokemon bunnelby = new Pokemon("Bunnelby");
    	bunnelby.setDexNumber(659);
    	bunnelby.setTypes("Normal", "(none)");
    	bunnelby.addAbilities("Pickup", "Cheek Pouch", "Huge Power");
    	bunnelby.setAllBaseStats(38, 36, 38, 32, 36, 57);
    	bunnelby.setWeight(5.0);
    	pokedex.put("Bunnelby", bunnelby);

    	Pokemon burmy = new Pokemon("Burmy");
    	burmy.setDexNumber(412);
    	burmy.setTypes("Bug", "(none)");
    	burmy.addAbilities("Shed Skin", "Overcoat");
    	burmy.setAllBaseStats(40, 29, 45, 29, 45, 36);
    	burmy.setWeight(3.4);
    	pokedex.put("Burmy", burmy);

    	Pokemon butterfree = new Pokemon("Butterfree");
    	butterfree.setDexNumber(12);
    	butterfree.setTypes("Bug", "Flying");
    	butterfree.addAbilities("Compound Eyes", "Tinted Lens");
    	butterfree.setAllBaseStats(60, 45, 50, 90, 80, 70);
    	butterfree.setWeight(32.0);
    	pokedex.put("Butterfree", butterfree);

    	Pokemon buzzwole = new Pokemon("Buzzwole");
    	buzzwole.setDexNumber(794);
    	buzzwole.setTypes("Bug", "Fighting");
    	buzzwole.addAbilities("Beast Boost");
    	buzzwole.setAllBaseStats(107, 139, 139, 53, 53, 79);
    	buzzwole.setWeight(333.6);
    	pokedex.put("Buzzwole", buzzwole);

    	Pokemon cacnea = new Pokemon("Cacnea");
    	cacnea.setDexNumber(331);
    	cacnea.setTypes("Grass", "(none)");
    	cacnea.addAbilities("Sand Veil", "Water Absorb");
    	cacnea.setAllBaseStats(50, 85, 40, 85, 40, 35);
    	cacnea.setWeight(51.3);
    	pokedex.put("Cacnea", cacnea);

    	Pokemon cacturne = new Pokemon("Cacturne");
    	cacturne.setDexNumber(332);
    	cacturne.setTypes("Grass", "Dark");
    	cacturne.addAbilities("Sand Veil", "Water Absorb");
    	cacturne.setAllBaseStats(70, 115, 60, 115, 60, 55);
    	cacturne.setWeight(77.4);
    	pokedex.put("Cacturne", cacturne);

    	Pokemon caimanoe = new Pokemon("Caimanoe");
    	caimanoe.setDexNumber(-114);
    	caimanoe.setTypes("Water", "Steel");
    	caimanoe.addAbilities("Water Veil", "Heatproof", "Light Metal");
    	caimanoe.setAllBaseStats(73, 85, 65, 80, 40, 87);
    	caimanoe.setWeight(72.5);
    	pokedex.put("Caimanoe", caimanoe);

    	Pokemon camerupt = new Pokemon("Camerupt");
    	camerupt.setDexNumber(323);
    	camerupt.setTypes("Fire", "Ground");
    	camerupt.addAbilities("Magma Armor", "Solid Rock", "Anger Point");
    	camerupt.setAllBaseStats(70, 100, 70, 105, 75, 40);
    	camerupt.setWeight(220.0);
    	camerupt.setFormes("Camerupt", "Camerupt-Mega");
    	pokedex.put("Camerupt", camerupt);

    	Pokemon cameruptmega = new Pokemon("Camerupt-Mega");
    	cameruptmega.setDexNumber(323);
    	cameruptmega.setTypes("Fire", "Ground");
    	cameruptmega.addAbilities("Sheer Force");
    	cameruptmega.setAllBaseStats(70, 120, 100, 145, 105, 20);
    	cameruptmega.setWeight(320.5);
    	pokedex.put("Camerupt-Mega", cameruptmega);

    	Pokemon carbink = new Pokemon("Carbink");
    	carbink.setDexNumber(703);
    	carbink.setTypes("Rock", "Fairy");
    	carbink.addAbilities("Clear Body", "Sturdy");
    	carbink.setAllBaseStats(50, 50, 150, 50, 150, 50);
    	carbink.setWeight(5.7);
    	pokedex.put("Carbink", carbink);

    	Pokemon carnivine = new Pokemon("Carnivine");
    	carnivine.setDexNumber(455);
    	carnivine.setTypes("Grass", "(none)");
    	carnivine.addAbilities("Levitate");
    	carnivine.setAllBaseStats(74, 100, 72, 90, 72, 46);
    	carnivine.setWeight(27.0);
    	pokedex.put("Carnivine", carnivine);

    	Pokemon carracosta = new Pokemon("Carracosta");
    	carracosta.setDexNumber(565);
    	carracosta.setTypes("Water", "Rock");
    	carracosta.addAbilities("Solid Rock", "Sturdy", "Swift Swim");
    	carracosta.setAllBaseStats(74, 108, 133, 83, 65, 32);
    	carracosta.setWeight(81.0);
    	pokedex.put("Carracosta", carracosta);

    	Pokemon carvanha = new Pokemon("Carvanha");
    	carvanha.setDexNumber(318);
    	carvanha.setTypes("Water", "Dark");
    	carvanha.addAbilities("Rough Skin", "Speed Boost");
    	carvanha.setAllBaseStats(45, 90, 20, 65, 20, 65);
    	carvanha.setWeight(20.8);
    	pokedex.put("Carvanha", carvanha);

    	Pokemon cascoon = new Pokemon("Cascoon");
    	cascoon.setDexNumber(268);
    	cascoon.setTypes("Bug", "(none)");
    	cascoon.addAbilities("Shed Skin");
    	cascoon.setAllBaseStats(50, 35, 55, 25, 25, 15);
    	cascoon.setWeight(11.5);
    	pokedex.put("Cascoon", cascoon);

    	Pokemon castform = new Pokemon("Castform");
    	castform.setDexNumber(351);
    	castform.setTypes("Normal", "(none)");
    	castform.addAbilities("Forecast");
    	castform.setAllBaseStats(70, 70, 70, 70, 70, 70);
    	castform.setWeight(0.8);
    	pokedex.put("Castform", castform);

    	Pokemon castformrainy = new Pokemon("Castform-Rainy");
    	castformrainy.setDexNumber(351);
    	castformrainy.setTypes("Water", "(none)");
    	castformrainy.addAbilities("Forecast");
    	castformrainy.setAllBaseStats(70, 70, 70, 70, 70, 70);
    	castformrainy.setWeight(0.8);
    	pokedex.put("Castform-Rainy", castformrainy);

    	Pokemon castformsnowy = new Pokemon("Castform-Snowy");
    	castformsnowy.setDexNumber(351);
    	castformsnowy.setTypes("Ice", "(none)");
    	castformsnowy.addAbilities("Forecast");
    	castformsnowy.setAllBaseStats(70, 70, 70, 70, 70, 70);
    	castformsnowy.setWeight(0.8);
    	pokedex.put("Castform-Snowy", castformsnowy);

    	Pokemon castformsunny = new Pokemon("Castform-Sunny");
    	castformsunny.setDexNumber(351);
    	castformsunny.setTypes("Fire", "(none)");
    	castformsunny.addAbilities("Forecast");
    	castformsunny.setAllBaseStats(70, 70, 70, 70, 70, 70);
    	castformsunny.setWeight(0.8);
    	pokedex.put("Castform-Sunny", castformsunny);

    	Pokemon caterpie = new Pokemon("Caterpie");
    	caterpie.setDexNumber(10);
    	caterpie.setTypes("Bug", "(none)");
    	caterpie.addAbilities("Shield Dust", "Run Away");
    	caterpie.setAllBaseStats(45, 30, 35, 20, 20, 45);
    	caterpie.setWeight(2.9);
    	pokedex.put("Caterpie", caterpie);

    	Pokemon cawdet = new Pokemon("Cawdet");
    	cawdet.setDexNumber(-110);
    	cawdet.setTypes("Steel", "Flying");
    	cawdet.addAbilities("Keen Eye", "Volt Absorb", "Big Pecks");
    	cawdet.setAllBaseStats(35, 72, 85, 40, 55, 88);
    	cawdet.setWeight(25.0);
    	pokedex.put("Cawdet", cawdet);

    	Pokemon cawmodore = new Pokemon("Cawmodore");
    	cawmodore.setDexNumber(-6);
    	cawmodore.setTypes("Steel", "Flying");
    	cawmodore.addAbilities("Intimidate", "Volt Absorb", "Big Pecks");
    	cawmodore.setAllBaseStats(50, 92, 130, 65, 75, 118);
    	cawmodore.setWeight(37.0);
    	pokedex.put("Cawmodore", cawmodore);

    	Pokemon celebi = new Pokemon("Celebi");
    	celebi.setDexNumber(251);
    	celebi.setTypes("Psychic", "Grass");
    	celebi.addAbilities("Natural Cure");
    	celebi.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	celebi.setWeight(5.0);
    	pokedex.put("Celebi", celebi);

    	Pokemon celesteela = new Pokemon("Celesteela");
    	celesteela.setDexNumber(797);
    	celesteela.setTypes("Steel", "Flying");
    	celesteela.addAbilities("Beast Boost");
    	celesteela.setAllBaseStats(97, 101, 103, 107, 101, 61);
    	celesteela.setWeight(999.9);
    	pokedex.put("Celesteela", celesteela);

    	Pokemon chandelure = new Pokemon("Chandelure");
    	chandelure.setDexNumber(609);
    	chandelure.setTypes("Ghost", "Fire");
    	chandelure.addAbilities("Flash Fire", "Flame Body", "Infiltrator");
    	chandelure.setAllBaseStats(60, 55, 90, 145, 90, 80);
    	chandelure.setWeight(34.3);
    	pokedex.put("Chandelure", chandelure);

    	Pokemon chansey = new Pokemon("Chansey");
    	chansey.setDexNumber(113);
    	chansey.setTypes("Normal", "(none)");
    	chansey.addAbilities("Natural Cure", "Serene Grace", "Healer");
    	chansey.setAllBaseStats(250, 5, 5, 35, 105, 50);
    	chansey.setWeight(34.6);
    	pokedex.put("Chansey", chansey);

    	Pokemon charizard = new Pokemon("Charizard");
    	charizard.setDexNumber(6);
    	charizard.setTypes("Fire", "Flying");
    	charizard.addAbilities("Blaze", "Solar Power");
    	charizard.setAllBaseStats(78, 84, 78, 109, 85, 100);
    	charizard.setWeight(90.5);
    	charizard.setFormes("Charizard", "Charizard-Mega-X", "Charizard-Mega-Y");
    	pokedex.put("Charizard", charizard);

    	Pokemon charizardmegax = new Pokemon("Charizard-Mega-X");
    	charizardmegax.setDexNumber(6);
    	charizardmegax.setTypes("Fire", "Dragon");
    	charizardmegax.addAbilities("Tough Claws");
    	charizardmegax.setAllBaseStats(78, 130, 111, 130, 85, 100);
    	charizardmegax.setWeight(110.5);
    	pokedex.put("Charizard-Mega-X", charizardmegax);

    	Pokemon charizardmegay = new Pokemon("Charizard-Mega-Y");
    	charizardmegay.setDexNumber(6);
    	charizardmegay.setTypes("Fire", "Flying");
    	charizardmegay.addAbilities("Drought");
    	charizardmegay.setAllBaseStats(78, 104, 78, 159, 115, 100);
    	charizardmegay.setWeight(100.5);
    	pokedex.put("Charizard-Mega-Y", charizardmegay);

    	Pokemon charjabug = new Pokemon("Charjabug");
    	charjabug.setDexNumber(737);
    	charjabug.setTypes("Bug", "Electric");
    	charjabug.addAbilities("Battery");
    	charjabug.setAllBaseStats(57, 82, 95, 55, 75, 36);
    	charjabug.setWeight(10.5);
    	pokedex.put("Charjabug", charjabug);

    	Pokemon charmander = new Pokemon("Charmander");
    	charmander.setDexNumber(4);
    	charmander.setTypes("Fire", "(none)");
    	charmander.addAbilities("Blaze", "Solar Power");
    	charmander.setAllBaseStats(39, 52, 43, 60, 50, 65);
    	charmander.setWeight(8.5);
    	pokedex.put("Charmander", charmander);

    	Pokemon charmeleon = new Pokemon("Charmeleon");
    	charmeleon.setDexNumber(5);
    	charmeleon.setTypes("Fire", "(none)");
    	charmeleon.addAbilities("Blaze", "Solar Power");
    	charmeleon.setAllBaseStats(58, 64, 58, 80, 65, 80);
    	charmeleon.setWeight(19.0);
    	pokedex.put("Charmeleon", charmeleon);

    	Pokemon chatot = new Pokemon("Chatot");
    	chatot.setDexNumber(441);
    	chatot.setTypes("Normal", "Flying");
    	chatot.addAbilities("Keen Eye", "Tangled Feet", "Big Pecks");
    	chatot.setAllBaseStats(76, 65, 45, 92, 42, 91);
    	chatot.setWeight(1.9);
    	pokedex.put("Chatot", chatot);

    	Pokemon cherrim = new Pokemon("Cherrim");
    	cherrim.setDexNumber(421);
    	cherrim.setTypes("Grass", "(none)");
    	cherrim.addAbilities("Flower Gift");
    	cherrim.setAllBaseStats(70, 60, 70, 87, 78, 85);
    	cherrim.setWeight(9.3);
    	pokedex.put("Cherrim", cherrim);

    	Pokemon cherrimsunshine = new Pokemon("Cherrim-Sunshine");
    	cherrimsunshine.setDexNumber(421);
    	cherrimsunshine.setTypes("Grass", "(none)");
    	cherrimsunshine.addAbilities("Flower Gift");
    	cherrimsunshine.setAllBaseStats(70, 60, 70, 87, 78, 85);
    	cherrimsunshine.setWeight(9.3);
    	pokedex.put("Cherrim-Sunshine", cherrimsunshine);

    	Pokemon cherubi = new Pokemon("Cherubi");
    	cherubi.setDexNumber(420);
    	cherubi.setTypes("Grass", "(none)");
    	cherubi.addAbilities("Chlorophyll");
    	cherubi.setAllBaseStats(45, 35, 45, 62, 53, 35);
    	cherubi.setWeight(3.3);
    	pokedex.put("Cherubi", cherubi);

    	Pokemon chesnaught = new Pokemon("Chesnaught");
    	chesnaught.setDexNumber(652);
    	chesnaught.setTypes("Grass", "Fighting");
    	chesnaught.addAbilities("Overgrow", "Bulletproof");
    	chesnaught.setAllBaseStats(88, 107, 122, 74, 75, 64);
    	chesnaught.setWeight(90.0);
    	pokedex.put("Chesnaught", chesnaught);

    	Pokemon chespin = new Pokemon("Chespin");
    	chespin.setDexNumber(650);
    	chespin.setTypes("Grass", "(none)");
    	chespin.addAbilities("Overgrow", "Bulletproof");
    	chespin.setAllBaseStats(56, 61, 65, 48, 45, 38);
    	chespin.setWeight(9.0);
    	pokedex.put("Chespin", chespin);

    	Pokemon chikorita = new Pokemon("Chikorita");
    	chikorita.setDexNumber(152);
    	chikorita.setTypes("Grass", "(none)");
    	chikorita.addAbilities("Overgrow", "Leaf Guard");
    	chikorita.setAllBaseStats(45, 49, 65, 49, 65, 45);
    	chikorita.setWeight(6.4);
    	pokedex.put("Chikorita", chikorita);

    	Pokemon chimchar = new Pokemon("Chimchar");
    	chimchar.setDexNumber(390);
    	chimchar.setTypes("Fire", "(none)");
    	chimchar.addAbilities("Blaze", "Iron Fist");
    	chimchar.setAllBaseStats(44, 58, 44, 58, 44, 61);
    	chimchar.setWeight(6.2);
    	pokedex.put("Chimchar", chimchar);

    	Pokemon chimecho = new Pokemon("Chimecho");
    	chimecho.setDexNumber(358);
    	chimecho.setTypes("Psychic", "(none)");
    	chimecho.addAbilities("Levitate");
    	chimecho.setAllBaseStats(75, 50, 80, 95, 90, 65);
    	chimecho.setWeight(1.0);
    	pokedex.put("Chimecho", chimecho);

    	Pokemon chinchou = new Pokemon("Chinchou");
    	chinchou.setDexNumber(170);
    	chinchou.setTypes("Water", "Electric");
    	chinchou.addAbilities("Volt Absorb", "Illuminate", "Water Absorb");
    	chinchou.setAllBaseStats(75, 38, 38, 56, 56, 67);
    	chinchou.setWeight(12.0);
    	pokedex.put("Chinchou", chinchou);

    	Pokemon chingling = new Pokemon("Chingling");
    	chingling.setDexNumber(433);
    	chingling.setTypes("Psychic", "(none)");
    	chingling.addAbilities("Levitate");
    	chingling.setAllBaseStats(45, 30, 50, 65, 50, 45);
    	chingling.setWeight(0.6);
    	pokedex.put("Chingling", chingling);

    	Pokemon cinccino = new Pokemon("Cinccino");
    	cinccino.setDexNumber(573);
    	cinccino.setTypes("Normal", "(none)");
    	cinccino.addAbilities("Cute Charm", "Technician", "Skill Link");
    	cinccino.setAllBaseStats(75, 95, 60, 65, 60, 115);
    	cinccino.setWeight(7.5);
    	pokedex.put("Cinccino", cinccino);

    	Pokemon clamperl = new Pokemon("Clamperl");
    	clamperl.setDexNumber(366);
    	clamperl.setTypes("Water", "(none)");
    	clamperl.addAbilities("Shell Armor", "Rattled");
    	clamperl.setAllBaseStats(35, 64, 85, 74, 55, 32);
    	clamperl.setWeight(52.5);
    	pokedex.put("Clamperl", clamperl);

    	Pokemon clauncher = new Pokemon("Clauncher");
    	clauncher.setDexNumber(692);
    	clauncher.setTypes("Water", "(none)");
    	clauncher.addAbilities("Mega Launcher");
    	clauncher.setAllBaseStats(50, 53, 62, 58, 63, 44);
    	clauncher.setWeight(8.3);
    	pokedex.put("Clauncher", clauncher);

    	Pokemon clawitzer = new Pokemon("Clawitzer");
    	clawitzer.setDexNumber(693);
    	clawitzer.setTypes("Water", "(none)");
    	clawitzer.addAbilities("Mega Launcher");
    	clawitzer.setAllBaseStats(71, 73, 88, 120, 89, 59);
    	clawitzer.setWeight(35.3);
    	pokedex.put("Clawitzer", clawitzer);

    	Pokemon claydol = new Pokemon("Claydol");
    	claydol.setDexNumber(344);
    	claydol.setTypes("Ground", "Psychic");
    	claydol.addAbilities("Levitate");
    	claydol.setAllBaseStats(60, 70, 105, 70, 120, 75);
    	claydol.setWeight(108.0);
    	pokedex.put("Claydol", claydol);

    	Pokemon clefable = new Pokemon("Clefable");
    	clefable.setDexNumber(36);
    	clefable.setTypes("Fairy", "(none)");
    	clefable.addAbilities("Cute Charm", "Magic Guard", "Unaware");
    	clefable.setAllBaseStats(95, 70, 73, 95, 90, 60);
    	clefable.setWeight(40.0);
    	pokedex.put("Clefable", clefable);

    	Pokemon clefairy = new Pokemon("Clefairy");
    	clefairy.setDexNumber(35);
    	clefairy.setTypes("Fairy", "(none)");
    	clefairy.addAbilities("Cute Charm", "Magic Guard", "Friend Guard");
    	clefairy.setAllBaseStats(70, 45, 48, 60, 65, 35);
    	clefairy.setWeight(7.5);
    	pokedex.put("Clefairy", clefairy);

    	Pokemon cleffa = new Pokemon("Cleffa");
    	cleffa.setDexNumber(173);
    	cleffa.setTypes("Fairy", "(none)");
    	cleffa.addAbilities("Cute Charm", "Magic Guard", "Friend Guard");
    	cleffa.setAllBaseStats(50, 25, 28, 45, 55, 15);
    	cleffa.setWeight(3.0);
    	pokedex.put("Cleffa", cleffa);

    	Pokemon cloyster = new Pokemon("Cloyster");
    	cloyster.setDexNumber(91);
    	cloyster.setTypes("Water", "Ice");
    	cloyster.addAbilities("Shell Armor", "Skill Link", "Overcoat");
    	cloyster.setAllBaseStats(50, 95, 180, 85, 45, 70);
    	cloyster.setWeight(132.5);
    	pokedex.put("Cloyster", cloyster);

    	Pokemon cobalion = new Pokemon("Cobalion");
    	cobalion.setDexNumber(638);
    	cobalion.setTypes("Steel", "Fighting");
    	cobalion.addAbilities("Justified");
    	cobalion.setAllBaseStats(91, 90, 129, 90, 72, 108);
    	cobalion.setWeight(250.0);
    	pokedex.put("Cobalion", cobalion);

    	Pokemon cofagrigus = new Pokemon("Cofagrigus");
    	cofagrigus.setDexNumber(563);
    	cofagrigus.setTypes("Ghost", "(none)");
    	cofagrigus.addAbilities("Mummy");
    	cofagrigus.setAllBaseStats(58, 50, 145, 95, 105, 30);
    	cofagrigus.setWeight(76.5);
    	pokedex.put("Cofagrigus", cofagrigus);

    	Pokemon colossoil = new Pokemon("Colossoil");
    	colossoil.setDexNumber(-59);
    	colossoil.setTypes("Dark", "Ground");
    	colossoil.addAbilities("Rebound", "Guts", "Unnerve");
    	colossoil.setAllBaseStats(133, 122, 72, 71, 72, 95);
    	colossoil.setWeight(683.6);
    	pokedex.put("Colossoil", colossoil);

    	Pokemon combee = new Pokemon("Combee");
    	combee.setDexNumber(415);
    	combee.setTypes("Bug", "Flying");
    	combee.addAbilities("Honey Gather", "Hustle");
    	combee.setAllBaseStats(30, 30, 42, 30, 42, 70);
    	combee.setWeight(5.5);
    	pokedex.put("Combee", combee);

    	Pokemon combusken = new Pokemon("Combusken");
    	combusken.setDexNumber(256);
    	combusken.setTypes("Fire", "Fighting");
    	combusken.addAbilities("Blaze", "Speed Boost");
    	combusken.setAllBaseStats(60, 85, 60, 85, 60, 55);
    	combusken.setWeight(19.5);
    	pokedex.put("Combusken", combusken);

    	Pokemon comfey = new Pokemon("Comfey");
    	comfey.setDexNumber(764);
    	comfey.setTypes("Fairy", "(none)");
    	comfey.addAbilities("Flower Veil", "Triage", "Natural Cure");
    	comfey.setAllBaseStats(51, 52, 90, 82, 110, 100);
    	comfey.setWeight(0.3);
    	pokedex.put("Comfey", comfey);

    	Pokemon conkeldurr = new Pokemon("Conkeldurr");
    	conkeldurr.setDexNumber(534);
    	conkeldurr.setTypes("Fighting", "(none)");
    	conkeldurr.addAbilities("Guts", "Sheer Force", "Iron Fist");
    	conkeldurr.setAllBaseStats(105, 140, 95, 55, 65, 45);
    	conkeldurr.setWeight(87.0);
    	pokedex.put("Conkeldurr", conkeldurr);

    	Pokemon corphish = new Pokemon("Corphish");
    	corphish.setDexNumber(341);
    	corphish.setTypes("Water", "(none)");
    	corphish.addAbilities("Hyper Cutter", "Shell Armor", "Adaptability");
    	corphish.setAllBaseStats(43, 80, 65, 50, 35, 35);
    	corphish.setWeight(11.5);
    	pokedex.put("Corphish", corphish);

    	Pokemon corsola = new Pokemon("Corsola");
    	corsola.setDexNumber(222);
    	corsola.setTypes("Water", "Rock");
    	corsola.addAbilities("Hustle", "Natural Cure", "Regenerator");
    	corsola.setAllBaseStats(65, 55, 95, 65, 95, 35);
    	corsola.setWeight(5.0);
    	pokedex.put("Corsola", corsola);

    	Pokemon cosmoem = new Pokemon("Cosmoem");
    	cosmoem.setDexNumber(790);
    	cosmoem.setTypes("Psychic", "(none)");
    	cosmoem.addAbilities("Sturdy");
    	cosmoem.setAllBaseStats(43, 29, 131, 29, 131, 37);
    	cosmoem.setWeight(999.9);
    	pokedex.put("Cosmoem", cosmoem);

    	Pokemon cosmog = new Pokemon("Cosmog");
    	cosmog.setDexNumber(789);
    	cosmog.setTypes("Psychic", "(none)");
    	cosmog.addAbilities("Unaware");
    	cosmog.setAllBaseStats(43, 29, 31, 29, 31, 37);
    	cosmog.setWeight(0.1);
    	pokedex.put("Cosmog", cosmog);

    	Pokemon cottonee = new Pokemon("Cottonee");
    	cottonee.setDexNumber(546);
    	cottonee.setTypes("Grass", "Fairy");
    	cottonee.addAbilities("Prankster", "Infiltrator", "Chlorophyll");
    	cottonee.setAllBaseStats(40, 27, 60, 37, 50, 66);
    	cottonee.setWeight(0.6);
    	pokedex.put("Cottonee", cottonee);

    	Pokemon crabominable = new Pokemon("Crabominable");
    	crabominable.setDexNumber(740);
    	crabominable.setTypes("Fighting", "Ice");
    	crabominable.addAbilities("Hyper Cutter", "Iron Fist", "Anger Point");
    	crabominable.setAllBaseStats(97, 132, 77, 62, 67, 43);
    	crabominable.setWeight(180.0);
    	pokedex.put("Crabominable", crabominable);

    	Pokemon crabrawler = new Pokemon("Crabrawler");
    	crabrawler.setDexNumber(739);
    	crabrawler.setTypes("Fighting", "(none)");
    	crabrawler.addAbilities("Hyper Cutter", "Iron Fist", "Anger Point");
    	crabrawler.setAllBaseStats(47, 82, 57, 42, 47, 63);
    	crabrawler.setWeight(7.0);
    	pokedex.put("Crabrawler", crabrawler);

    	Pokemon cradily = new Pokemon("Cradily");
    	cradily.setDexNumber(346);
    	cradily.setTypes("Rock", "Grass");
    	cradily.addAbilities("Suction Cups", "Storm Drain");
    	cradily.setAllBaseStats(86, 81, 97, 81, 107, 43);
    	cradily.setWeight(60.4);
    	pokedex.put("Cradily", cradily);

    	Pokemon cranidos = new Pokemon("Cranidos");
    	cranidos.setDexNumber(408);
    	cranidos.setTypes("Rock", "(none)");
    	cranidos.addAbilities("Mold Breaker", "Sheer Force");
    	cranidos.setAllBaseStats(67, 125, 40, 30, 30, 58);
    	cranidos.setWeight(31.5);
    	pokedex.put("Cranidos", cranidos);

    	Pokemon crawdaunt = new Pokemon("Crawdaunt");
    	crawdaunt.setDexNumber(342);
    	crawdaunt.setTypes("Water", "Dark");
    	crawdaunt.addAbilities("Hyper Cutter", "Shell Armor", "Adaptability");
    	crawdaunt.setAllBaseStats(63, 120, 85, 90, 55, 55);
    	crawdaunt.setWeight(32.8);
    	pokedex.put("Crawdaunt", crawdaunt);

    	Pokemon cresselia = new Pokemon("Cresselia");
    	cresselia.setDexNumber(488);
    	cresselia.setTypes("Psychic", "(none)");
    	cresselia.addAbilities("Levitate");
    	cresselia.setAllBaseStats(120, 70, 120, 75, 130, 85);
    	cresselia.setWeight(85.6);
    	pokedex.put("Cresselia", cresselia);

    	Pokemon croagunk = new Pokemon("Croagunk");
    	croagunk.setDexNumber(453);
    	croagunk.setTypes("Poison", "Fighting");
    	croagunk.addAbilities("Anticipation", "Dry Skin", "Poison Touch");
    	croagunk.setAllBaseStats(48, 61, 40, 61, 40, 50);
    	croagunk.setWeight(23.0);
    	pokedex.put("Croagunk", croagunk);

    	Pokemon crobat = new Pokemon("Crobat");
    	crobat.setDexNumber(169);
    	crobat.setTypes("Poison", "Flying");
    	crobat.addAbilities("Inner Focus", "Infiltrator");
    	crobat.setAllBaseStats(85, 90, 80, 70, 80, 130);
    	crobat.setWeight(75.0);
    	pokedex.put("Crobat", crobat);

    	Pokemon croconaw = new Pokemon("Croconaw");
    	croconaw.setDexNumber(159);
    	croconaw.setTypes("Water", "(none)");
    	croconaw.addAbilities("Torrent", "Sheer Force");
    	croconaw.setAllBaseStats(65, 80, 80, 59, 63, 58);
    	croconaw.setWeight(25.0);
    	pokedex.put("Croconaw", croconaw);

    	Pokemon crucibelle = new Pokemon("Crucibelle");
    	crucibelle.setDexNumber(-10);
    	crucibelle.setTypes("Rock", "Poison");
    	crucibelle.addAbilities("Regenerator", "Mold Breaker", "Liquid Ooze");
    	crucibelle.setAllBaseStats(106, 105, 65, 75, 85, 104);
    	crucibelle.setWeight(23.6);
    	pokedex.put("Crucibelle", crucibelle);

    	Pokemon crucibellemega = new Pokemon("Crucibelle-Mega");
    	crucibellemega.setDexNumber(-10);
    	crucibellemega.setTypes("Rock", "Poison");
    	crucibellemega.addAbilities("Magic Guard");
    	crucibellemega.setAllBaseStats(106, 135, 75, 85, 125, 114);
    	crucibellemega.setWeight(22.5);
    	pokedex.put("Crucibelle-Mega", crucibellemega);

    	Pokemon crustle = new Pokemon("Crustle");
    	crustle.setDexNumber(558);
    	crustle.setTypes("Bug", "Rock");
    	crustle.addAbilities("Sturdy", "Shell Armor", "Weak Armor");
    	crustle.setAllBaseStats(70, 105, 125, 65, 75, 45);
    	crustle.setWeight(200.0);
    	pokedex.put("Crustle", crustle);

    	Pokemon cryogonal = new Pokemon("Cryogonal");
    	cryogonal.setDexNumber(615);
    	cryogonal.setTypes("Ice", "(none)");
    	cryogonal.addAbilities("Levitate");
    	cryogonal.setAllBaseStats(80, 50, 50, 95, 135, 105);
    	cryogonal.setWeight(148.0);
    	pokedex.put("Cryogonal", cryogonal);

    	Pokemon cubchoo = new Pokemon("Cubchoo");
    	cubchoo.setDexNumber(613);
    	cubchoo.setTypes("Ice", "(none)");
    	cubchoo.addAbilities("Snow Cloak", "Slush Rush", "Rattled");
    	cubchoo.setAllBaseStats(55, 70, 40, 60, 40, 40);
    	cubchoo.setWeight(8.5);
    	pokedex.put("Cubchoo", cubchoo);

    	Pokemon cubone = new Pokemon("Cubone");
    	cubone.setDexNumber(104);
    	cubone.setTypes("Ground", "(none)");
    	cubone.addAbilities("Rock Head", "Lightning Rod", "Battle Armor");
    	cubone.setAllBaseStats(50, 50, 95, 40, 50, 35);
    	cubone.setWeight(6.5);
    	pokedex.put("Cubone", cubone);

    	Pokemon cupra = new Pokemon("Cupra");
    	cupra.setDexNumber(-107);
    	cupra.setTypes("Bug", "Psychic");
    	cupra.addAbilities("Shield Dust", "Keen Eye");
    	cupra.setAllBaseStats(50, 60, 49, 67, 30, 44);
    	cupra.setWeight(4.8);
    	pokedex.put("Cupra", cupra);

    	Pokemon cutiefly = new Pokemon("Cutiefly");
    	cutiefly.setDexNumber(742);
    	cutiefly.setTypes("Bug", "Fairy");
    	cutiefly.addAbilities("Honey Gather", "Shield Dust", "Sweet Veil");
    	cutiefly.setAllBaseStats(40, 45, 40, 55, 40, 84);
    	cutiefly.setWeight(0.2);
    	pokedex.put("Cutiefly", cutiefly);

    	Pokemon cyclohm = new Pokemon("Cyclohm");
    	cyclohm.setDexNumber(-58);
    	cyclohm.setTypes("Electric", "Dragon");
    	cyclohm.addAbilities("Shield Dust", "Static", "Damp");
    	cyclohm.setAllBaseStats(108, 60, 118, 112, 70, 80);
    	cyclohm.setWeight(59.0);
    	pokedex.put("Cyclohm", cyclohm);

    	Pokemon cyndaquil = new Pokemon("Cyndaquil");
    	cyndaquil.setDexNumber(155);
    	cyndaquil.setTypes("Fire", "(none)");
    	cyndaquil.addAbilities("Blaze", "Flash Fire");
    	cyndaquil.setAllBaseStats(39, 52, 43, 60, 50, 65);
    	cyndaquil.setWeight(7.9);
    	pokedex.put("Cyndaquil", cyndaquil);

    	Pokemon darkrai = new Pokemon("Darkrai");
    	darkrai.setDexNumber(491);
    	darkrai.setTypes("Dark", "(none)");
    	darkrai.addAbilities("Bad Dreams");
    	darkrai.setAllBaseStats(70, 90, 90, 135, 90, 125);
    	darkrai.setWeight(50.5);
    	pokedex.put("Darkrai", darkrai);

    	Pokemon darmanitan = new Pokemon("Darmanitan");
    	darmanitan.setDexNumber(555);
    	darmanitan.setTypes("Fire", "(none)");
    	darmanitan.addAbilities("Sheer Force", "Zen Mode");
    	darmanitan.setAllBaseStats(105, 140, 55, 30, 55, 95);
    	darmanitan.setWeight(92.9);
    	darmanitan.setFormes("Darmanitan", "Darmanitan-Zen");
    	pokedex.put("Darmanitan", darmanitan);

    	Pokemon darmanitanzen = new Pokemon("Darmanitan-Zen");
    	darmanitanzen.setDexNumber(555);
    	darmanitanzen.setTypes("Fire", "Psychic");
    	darmanitanzen.addAbilities("Zen Mode");
    	darmanitanzen.setAllBaseStats(105, 30, 105, 140, 105, 55);
    	darmanitanzen.setWeight(92.9);
    	pokedex.put("Darmanitan-Zen", darmanitanzen);

    	Pokemon dartrix = new Pokemon("Dartrix");
    	dartrix.setDexNumber(723);
    	dartrix.setTypes("Grass", "Flying");
    	dartrix.addAbilities("Overgrow", "Long Reach");
    	dartrix.setAllBaseStats(78, 75, 75, 70, 70, 52);
    	dartrix.setWeight(16.0);
    	pokedex.put("Dartrix", dartrix);

    	Pokemon darumaka = new Pokemon("Darumaka");
    	darumaka.setDexNumber(554);
    	darumaka.setTypes("Fire", "(none)");
    	darumaka.addAbilities("Hustle", "Inner Focus");
    	darumaka.setAllBaseStats(70, 90, 45, 15, 45, 50);
    	darumaka.setWeight(37.5);
    	pokedex.put("Darumaka", darumaka);

    	Pokemon decidueye = new Pokemon("Decidueye");
    	decidueye.setDexNumber(724);
    	decidueye.setTypes("Grass", "Ghost");
    	decidueye.addAbilities("Overgrow", "Long Reach");
    	decidueye.setAllBaseStats(78, 107, 75, 100, 100, 70);
    	decidueye.setWeight(36.6);
    	pokedex.put("Decidueye", decidueye);

    	Pokemon dedenne = new Pokemon("Dedenne");
    	dedenne.setDexNumber(702);
    	dedenne.setTypes("Electric", "Fairy");
    	dedenne.addAbilities("Cheek Pouch", "Pickup", "Plus");
    	dedenne.setAllBaseStats(67, 58, 57, 81, 67, 101);
    	dedenne.setWeight(2.2);
    	pokedex.put("Dedenne", dedenne);

    	Pokemon deerling = new Pokemon("Deerling");
    	deerling.setDexNumber(585);
    	deerling.setTypes("Normal", "Grass");
    	deerling.addAbilities("Chlorophyll", "Sap Sipper", "Serene Grace");
    	deerling.setAllBaseStats(60, 60, 50, 40, 50, 75);
    	deerling.setWeight(19.5);
    	pokedex.put("Deerling", deerling);

    	Pokemon deino = new Pokemon("Deino");
    	deino.setDexNumber(633);
    	deino.setTypes("Dark", "Dragon");
    	deino.addAbilities("Hustle");
    	deino.setAllBaseStats(52, 65, 50, 45, 50, 38);
    	deino.setWeight(17.3);
    	pokedex.put("Deino", deino);

    	Pokemon delcatty = new Pokemon("Delcatty");
    	delcatty.setDexNumber(301);
    	delcatty.setTypes("Normal", "(none)");
    	delcatty.addAbilities("Cute Charm", "Normalize", "Wonder Skin");
    	delcatty.setAllBaseStats(70, 65, 65, 55, 55, 90);
    	delcatty.setWeight(32.6);
    	pokedex.put("Delcatty", delcatty);

    	Pokemon delibird = new Pokemon("Delibird");
    	delibird.setDexNumber(225);
    	delibird.setTypes("Ice", "Flying");
    	delibird.addAbilities("Vital Spirit", "Hustle", "Insomnia");
    	delibird.setAllBaseStats(45, 55, 45, 65, 45, 75);
    	delibird.setWeight(16.0);
    	pokedex.put("Delibird", delibird);

    	Pokemon delphox = new Pokemon("Delphox");
    	delphox.setDexNumber(655);
    	delphox.setTypes("Fire", "Psychic");
    	delphox.addAbilities("Blaze", "Magician");
    	delphox.setAllBaseStats(75, 69, 72, 114, 100, 104);
    	delphox.setWeight(39.0);
    	pokedex.put("Delphox", delphox);

    	Pokemon deoxys = new Pokemon("Deoxys");
    	deoxys.setDexNumber(386);
    	deoxys.setTypes("Psychic", "(none)");
    	deoxys.addAbilities("Pressure");
    	deoxys.setAllBaseStats(50, 150, 50, 150, 50, 150);
    	deoxys.setWeight(60.8);
    	pokedex.put("Deoxys", deoxys);

    	Pokemon deoxysattack = new Pokemon("Deoxys-Attack");
    	deoxysattack.setDexNumber(386);
    	deoxysattack.setTypes("Psychic", "(none)");
    	deoxysattack.addAbilities("Pressure");
    	deoxysattack.setAllBaseStats(50, 180, 20, 180, 20, 150);
    	deoxysattack.setWeight(60.8);
    	pokedex.put("Deoxys-Attack", deoxysattack);

    	Pokemon deoxysdefense = new Pokemon("Deoxys-Defense");
    	deoxysdefense.setDexNumber(386);
    	deoxysdefense.setTypes("Psychic", "(none)");
    	deoxysdefense.addAbilities("Pressure");
    	deoxysdefense.setAllBaseStats(50, 70, 160, 70, 160, 90);
    	deoxysdefense.setWeight(60.8);
    	pokedex.put("Deoxys-Defense", deoxysdefense);

    	Pokemon deoxysspeed = new Pokemon("Deoxys-Speed");
    	deoxysspeed.setDexNumber(386);
    	deoxysspeed.setTypes("Psychic", "(none)");
    	deoxysspeed.addAbilities("Pressure");
    	deoxysspeed.setAllBaseStats(50, 95, 90, 95, 90, 180);
    	deoxysspeed.setWeight(60.8);
    	pokedex.put("Deoxys-Speed", deoxysspeed);

    	Pokemon dewgong = new Pokemon("Dewgong");
    	dewgong.setDexNumber(87);
    	dewgong.setTypes("Water", "Ice");
    	dewgong.addAbilities("Thick Fat", "Hydration", "Ice Body");
    	dewgong.setAllBaseStats(90, 70, 80, 70, 95, 70);
    	dewgong.setWeight(120.0);
    	pokedex.put("Dewgong", dewgong);

    	Pokemon dewott = new Pokemon("Dewott");
    	dewott.setDexNumber(502);
    	dewott.setTypes("Water", "(none)");
    	dewott.addAbilities("Torrent", "Shell Armor");
    	dewott.setAllBaseStats(75, 75, 60, 83, 60, 60);
    	dewott.setWeight(24.5);
    	pokedex.put("Dewott", dewott);

    	Pokemon dewpider = new Pokemon("Dewpider");
    	dewpider.setDexNumber(751);
    	dewpider.setTypes("Water", "Bug");
    	dewpider.addAbilities("Water Bubble", "Water Absorb");
    	dewpider.setAllBaseStats(38, 40, 52, 40, 72, 27);
    	dewpider.setWeight(4.0);
    	pokedex.put("Dewpider", dewpider);

    	Pokemon dhelmise = new Pokemon("Dhelmise");
    	dhelmise.setDexNumber(781);
    	dhelmise.setTypes("Ghost", "Grass");
    	dhelmise.addAbilities("Steelworker");
    	dhelmise.setAllBaseStats(70, 131, 100, 86, 90, 40);
    	dhelmise.setWeight(210.0);
    	pokedex.put("Dhelmise", dhelmise);

    	Pokemon dialga = new Pokemon("Dialga");
    	dialga.setDexNumber(483);
    	dialga.setTypes("Steel", "Dragon");
    	dialga.addAbilities("Pressure", "Telepathy");
    	dialga.setAllBaseStats(100, 120, 120, 150, 100, 90);
    	dialga.setWeight(683.0);
    	pokedex.put("Dialga", dialga);

    	Pokemon diancie = new Pokemon("Diancie");
    	diancie.setDexNumber(719);
    	diancie.setTypes("Rock", "Fairy");
    	diancie.addAbilities("Clear Body");
    	diancie.setAllBaseStats(50, 100, 150, 100, 150, 50);
    	diancie.setWeight(8.8);
    	diancie.setFormes("Diancie", "Diancie-Mega");
    	pokedex.put("Diancie", diancie);

    	Pokemon dianciemega = new Pokemon("Diancie-Mega");
    	dianciemega.setDexNumber(719);
    	dianciemega.setTypes("Rock", "Fairy");
    	dianciemega.addAbilities("Magic Bounce");
    	dianciemega.setAllBaseStats(50, 160, 110, 160, 110, 110);
    	dianciemega.setWeight(27.8);
    	pokedex.put("Diancie-Mega", dianciemega);

    	Pokemon diggersby = new Pokemon("Diggersby");
    	diggersby.setDexNumber(660);
    	diggersby.setTypes("Normal", "Ground");
    	diggersby.addAbilities("Pickup", "Cheek Pouch", "Huge Power");
    	diggersby.setAllBaseStats(85, 56, 77, 50, 77, 78);
    	diggersby.setWeight(42.4);
    	pokedex.put("Diggersby", diggersby);

    	Pokemon diglett = new Pokemon("Diglett");
    	diglett.setDexNumber(50);
    	diglett.setTypes("Ground", "(none)");
    	diglett.addAbilities("Sand Veil", "Arena Trap", "Sand Force");
    	diglett.setAllBaseStats(10, 55, 25, 35, 45, 95);
    	diglett.setWeight(0.8);
    	pokedex.put("Diglett", diglett);

    	Pokemon diglettalola = new Pokemon("Diglett-Alola");
    	diglettalola.setDexNumber(50);
    	diglettalola.setTypes("Ground", "Steel");
    	diglettalola.addAbilities("Sand Veil", "Tangling Hair", "Sand Force");
    	diglettalola.setAllBaseStats(10, 55, 30, 35, 45, 90);
    	diglettalola.setWeight(1.0);
    	pokedex.put("Diglett-Alola", diglettalola);

    	Pokemon ditto = new Pokemon("Ditto");
    	ditto.setDexNumber(132);
    	ditto.setTypes("Normal", "(none)");
    	ditto.addAbilities("Limber", "Imposter");
    	ditto.setAllBaseStats(48, 48, 48, 48, 48, 48);
    	ditto.setWeight(4.0);
    	pokedex.put("Ditto", ditto);

    	Pokemon dodrio = new Pokemon("Dodrio");
    	dodrio.setDexNumber(85);
    	dodrio.setTypes("Normal", "Flying");
    	dodrio.addAbilities("Run Away", "Early Bird", "Tangled Feet");
    	dodrio.setAllBaseStats(60, 110, 70, 60, 60, 110);
    	dodrio.setWeight(85.2);
    	pokedex.put("Dodrio", dodrio);

    	Pokemon doduo = new Pokemon("Doduo");
    	doduo.setDexNumber(84);
    	doduo.setTypes("Normal", "Flying");
    	doduo.addAbilities("Run Away", "Early Bird", "Tangled Feet");
    	doduo.setAllBaseStats(35, 85, 45, 35, 35, 75);
    	doduo.setWeight(39.2);
    	pokedex.put("Doduo", doduo);

    	Pokemon donphan = new Pokemon("Donphan");
    	donphan.setDexNumber(232);
    	donphan.setTypes("Ground", "(none)");
    	donphan.addAbilities("Sturdy", "Sand Veil");
    	donphan.setAllBaseStats(90, 120, 120, 60, 60, 50);
    	donphan.setWeight(120.0);
    	pokedex.put("Donphan", donphan);

    	Pokemon doublade = new Pokemon("Doublade");
    	doublade.setDexNumber(680);
    	doublade.setTypes("Steel", "Ghost");
    	doublade.addAbilities("No Guard");
    	doublade.setAllBaseStats(59, 110, 150, 45, 49, 35);
    	doublade.setWeight(4.5);
    	pokedex.put("Doublade", doublade);

    	Pokemon dragalge = new Pokemon("Dragalge");
    	dragalge.setDexNumber(691);
    	dragalge.setTypes("Poison", "Dragon");
    	dragalge.addAbilities("Poison Point", "Poison Touch", "Adaptability");
    	dragalge.setAllBaseStats(65, 75, 90, 97, 123, 44);
    	dragalge.setWeight(81.5);
    	pokedex.put("Dragalge", dragalge);

    	Pokemon dragonair = new Pokemon("Dragonair");
    	dragonair.setDexNumber(148);
    	dragonair.setTypes("Dragon", "(none)");
    	dragonair.addAbilities("Shed Skin", "Marvel Scale");
    	dragonair.setAllBaseStats(61, 84, 65, 70, 70, 70);
    	dragonair.setWeight(16.5);
    	pokedex.put("Dragonair", dragonair);

    	Pokemon dragonite = new Pokemon("Dragonite");
    	dragonite.setDexNumber(149);
    	dragonite.setTypes("Dragon", "Flying");
    	dragonite.addAbilities("Inner Focus", "Multiscale");
    	dragonite.setAllBaseStats(91, 134, 95, 100, 100, 80);
    	dragonite.setWeight(210.0);
    	pokedex.put("Dragonite", dragonite);

    	Pokemon drampa = new Pokemon("Drampa");
    	drampa.setDexNumber(780);
    	drampa.setTypes("Normal", "Dragon");
    	drampa.addAbilities("Berserk", "Sap Sipper", "Cloud Nine");
    	drampa.setAllBaseStats(78, 60, 85, 135, 91, 36);
    	drampa.setWeight(185.0);
    	pokedex.put("Drampa", drampa);

    	Pokemon drapion = new Pokemon("Drapion");
    	drapion.setDexNumber(452);
    	drapion.setTypes("Poison", "Dark");
    	drapion.addAbilities("Battle Armor", "Sniper", "Keen Eye");
    	drapion.setAllBaseStats(70, 90, 110, 60, 75, 95);
    	drapion.setWeight(61.5);
    	pokedex.put("Drapion", drapion);

    	Pokemon dratini = new Pokemon("Dratini");
    	dratini.setDexNumber(147);
    	dratini.setTypes("Dragon", "(none)");
    	dratini.addAbilities("Shed Skin", "Marvel Scale");
    	dratini.setAllBaseStats(41, 64, 45, 50, 50, 50);
    	dratini.setWeight(3.3);
    	pokedex.put("Dratini", dratini);

    	Pokemon drifblim = new Pokemon("Drifblim");
    	drifblim.setDexNumber(426);
    	drifblim.setTypes("Ghost", "Flying");
    	drifblim.addAbilities("Aftermath", "Unburden", "Flare Boost");
    	drifblim.setAllBaseStats(150, 80, 44, 90, 54, 80);
    	drifblim.setWeight(15.0);
    	pokedex.put("Drifblim", drifblim);

    	Pokemon drifloon = new Pokemon("Drifloon");
    	drifloon.setDexNumber(425);
    	drifloon.setTypes("Ghost", "Flying");
    	drifloon.addAbilities("Aftermath", "Unburden", "Flare Boost");
    	drifloon.setAllBaseStats(90, 50, 34, 60, 44, 70);
    	drifloon.setWeight(1.2);
    	pokedex.put("Drifloon", drifloon);

    	Pokemon drilbur = new Pokemon("Drilbur");
    	drilbur.setDexNumber(529);
    	drilbur.setTypes("Ground", "(none)");
    	drilbur.addAbilities("Sand Rush", "Sand Force", "Mold Breaker");
    	drilbur.setAllBaseStats(60, 85, 40, 30, 45, 68);
    	drilbur.setWeight(8.5);
    	pokedex.put("Drilbur", drilbur);

    	Pokemon drowzee = new Pokemon("Drowzee");
    	drowzee.setDexNumber(96);
    	drowzee.setTypes("Psychic", "(none)");
    	drowzee.addAbilities("Insomnia", "Forewarn", "Inner Focus");
    	drowzee.setAllBaseStats(60, 48, 45, 43, 90, 42);
    	drowzee.setWeight(32.4);
    	pokedex.put("Drowzee", drowzee);

    	Pokemon druddigon = new Pokemon("Druddigon");
    	druddigon.setDexNumber(621);
    	druddigon.setTypes("Dragon", "(none)");
    	druddigon.addAbilities("Rough Skin", "Sheer Force", "Mold Breaker");
    	druddigon.setAllBaseStats(77, 120, 90, 60, 90, 48);
    	druddigon.setWeight(139.0);
    	pokedex.put("Druddigon", druddigon);

    	Pokemon ducklett = new Pokemon("Ducklett");
    	ducklett.setDexNumber(580);
    	ducklett.setTypes("Water", "Flying");
    	ducklett.addAbilities("Keen Eye", "Big Pecks", "Hydration");
    	ducklett.setAllBaseStats(62, 44, 50, 44, 50, 55);
    	ducklett.setWeight(5.5);
    	pokedex.put("Ducklett", ducklett);

    	Pokemon dugtrio = new Pokemon("Dugtrio");
    	dugtrio.setDexNumber(51);
    	dugtrio.setTypes("Ground", "(none)");
    	dugtrio.addAbilities("Sand Veil", "Arena Trap", "Sand Force");
    	dugtrio.setAllBaseStats(35, 100, 50, 50, 70, 120);
    	dugtrio.setWeight(33.3);
    	pokedex.put("Dugtrio", dugtrio);

    	Pokemon dugtrioalola = new Pokemon("Dugtrio-Alola");
    	dugtrioalola.setDexNumber(51);
    	dugtrioalola.setTypes("Ground", "Steel");
    	dugtrioalola.addAbilities("Sand Veil", "Tangling Hair", "Sand Force");
    	dugtrioalola.setAllBaseStats(35, 100, 60, 50, 70, 110);
    	dugtrioalola.setWeight(66.6);
    	pokedex.put("Dugtrio-Alola", dugtrioalola);

    	Pokemon dunsparce = new Pokemon("Dunsparce");
    	dunsparce.setDexNumber(206);
    	dunsparce.setTypes("Normal", "(none)");
    	dunsparce.addAbilities("Serene Grace", "Run Away", "Rattled");
    	dunsparce.setAllBaseStats(100, 70, 70, 65, 65, 45);
    	dunsparce.setWeight(14.0);
    	pokedex.put("Dunsparce", dunsparce);

    	Pokemon duosion = new Pokemon("Duosion");
    	duosion.setDexNumber(578);
    	duosion.setTypes("Psychic", "(none)");
    	duosion.addAbilities("Overcoat", "Magic Guard", "Regenerator");
    	duosion.setAllBaseStats(65, 40, 50, 125, 60, 30);
    	duosion.setWeight(8.0);
    	pokedex.put("Duosion", duosion);

    	Pokemon durant = new Pokemon("Durant");
    	durant.setDexNumber(632);
    	durant.setTypes("Bug", "Steel");
    	durant.addAbilities("Swarm", "Hustle", "Truant");
    	durant.setAllBaseStats(58, 109, 112, 48, 48, 109);
    	durant.setWeight(33.0);
    	pokedex.put("Durant", durant);

    	Pokemon dusclops = new Pokemon("Dusclops");
    	dusclops.setDexNumber(356);
    	dusclops.setTypes("Ghost", "(none)");
    	dusclops.addAbilities("Pressure", "Frisk");
    	dusclops.setAllBaseStats(40, 70, 130, 60, 130, 25);
    	dusclops.setWeight(30.6);
    	pokedex.put("Dusclops", dusclops);

    	Pokemon dusknoir = new Pokemon("Dusknoir");
    	dusknoir.setDexNumber(477);
    	dusknoir.setTypes("Ghost", "(none)");
    	dusknoir.addAbilities("Pressure", "Frisk");
    	dusknoir.setAllBaseStats(45, 100, 135, 65, 135, 45);
    	dusknoir.setWeight(106.6);
    	pokedex.put("Dusknoir", dusknoir);

    	Pokemon duskull = new Pokemon("Duskull");
    	duskull.setDexNumber(355);
    	duskull.setTypes("Ghost", "(none)");
    	duskull.addAbilities("Levitate", "Frisk");
    	duskull.setAllBaseStats(20, 40, 90, 30, 90, 25);
    	duskull.setWeight(15.0);
    	pokedex.put("Duskull", duskull);

    	Pokemon dustox = new Pokemon("Dustox");
    	dustox.setDexNumber(269);
    	dustox.setTypes("Bug", "Poison");
    	dustox.addAbilities("Shield Dust", "Compound Eyes");
    	dustox.setAllBaseStats(60, 50, 70, 50, 90, 65);
    	dustox.setWeight(31.6);
    	pokedex.put("Dustox", dustox);

    	Pokemon dwebble = new Pokemon("Dwebble");
    	dwebble.setDexNumber(557);
    	dwebble.setTypes("Bug", "Rock");
    	dwebble.addAbilities("Sturdy", "Shell Armor", "Weak Armor");
    	dwebble.setAllBaseStats(50, 65, 85, 35, 35, 55);
    	dwebble.setWeight(14.5);
    	pokedex.put("Dwebble", dwebble);

    	Pokemon eelektrik = new Pokemon("Eelektrik");
    	eelektrik.setDexNumber(603);
    	eelektrik.setTypes("Electric", "(none)");
    	eelektrik.addAbilities("Levitate");
    	eelektrik.setAllBaseStats(65, 85, 70, 75, 70, 40);
    	eelektrik.setWeight(22.0);
    	pokedex.put("Eelektrik", eelektrik);

    	Pokemon eelektross = new Pokemon("Eelektross");
    	eelektross.setDexNumber(604);
    	eelektross.setTypes("Electric", "(none)");
    	eelektross.addAbilities("Levitate");
    	eelektross.setAllBaseStats(85, 115, 80, 105, 80, 50);
    	eelektross.setWeight(80.5);
    	pokedex.put("Eelektross", eelektross);

    	Pokemon eevee = new Pokemon("Eevee");
    	eevee.setDexNumber(133);
    	eevee.setTypes("Normal", "(none)");
    	eevee.addAbilities("Run Away", "Adaptability", "Anticipation");
    	eevee.setAllBaseStats(55, 55, 50, 45, 65, 55);
    	eevee.setWeight(6.5);
    	pokedex.put("Eevee", eevee);

    	Pokemon ekans = new Pokemon("Ekans");
    	ekans.setDexNumber(23);
    	ekans.setTypes("Poison", "(none)");
    	ekans.addAbilities("Intimidate", "Shed Skin", "Unnerve");
    	ekans.setAllBaseStats(35, 60, 44, 40, 54, 55);
    	ekans.setWeight(6.9);
    	pokedex.put("Ekans", ekans);

    	Pokemon electabuzz = new Pokemon("Electabuzz");
    	electabuzz.setDexNumber(125);
    	electabuzz.setTypes("Electric", "(none)");
    	electabuzz.addAbilities("Static", "Vital Spirit");
    	electabuzz.setAllBaseStats(65, 83, 57, 95, 85, 105);
    	electabuzz.setWeight(30.0);
    	pokedex.put("Electabuzz", electabuzz);

    	Pokemon electivire = new Pokemon("Electivire");
    	electivire.setDexNumber(466);
    	electivire.setTypes("Electric", "(none)");
    	electivire.addAbilities("Motor Drive", "Vital Spirit");
    	electivire.setAllBaseStats(75, 123, 67, 95, 85, 95);
    	electivire.setWeight(138.6);
    	pokedex.put("Electivire", electivire);

    	Pokemon electrike = new Pokemon("Electrike");
    	electrike.setDexNumber(309);
    	electrike.setTypes("Electric", "(none)");
    	electrike.addAbilities("Static", "Lightning Rod", "Minus");
    	electrike.setAllBaseStats(40, 45, 40, 65, 40, 65);
    	electrike.setWeight(15.2);
    	pokedex.put("Electrike", electrike);

    	Pokemon electrode = new Pokemon("Electrode");
    	electrode.setDexNumber(101);
    	electrode.setTypes("Electric", "(none)");
    	electrode.addAbilities("Soundproof", "Static", "Aftermath");
    	electrode.setAllBaseStats(60, 50, 70, 80, 80, 150);
    	electrode.setWeight(66.6);
    	pokedex.put("Electrode", electrode);

    	Pokemon elekid = new Pokemon("Elekid");
    	elekid.setDexNumber(239);
    	elekid.setTypes("Electric", "(none)");
    	elekid.addAbilities("Static", "Vital Spirit");
    	elekid.setAllBaseStats(45, 63, 37, 65, 55, 95);
    	elekid.setWeight(23.5);
    	pokedex.put("Elekid", elekid);

    	Pokemon elgyem = new Pokemon("Elgyem");
    	elgyem.setDexNumber(605);
    	elgyem.setTypes("Psychic", "(none)");
    	elgyem.addAbilities("Telepathy", "Synchronize", "Analytic");
    	elgyem.setAllBaseStats(55, 55, 55, 85, 55, 30);
    	elgyem.setWeight(9.0);
    	pokedex.put("Elgyem", elgyem);

    	Pokemon embirch = new Pokemon("Embirch");
    	embirch.setDexNumber(-102);
    	embirch.setTypes("Fire", "Grass");
    	embirch.addAbilities("Reckless", "Leaf Guard");
    	embirch.setAllBaseStats(60, 40, 55, 65, 40, 60);
    	embirch.setWeight(15.0);
    	pokedex.put("Embirch", embirch);

    	Pokemon emboar = new Pokemon("Emboar");
    	emboar.setDexNumber(500);
    	emboar.setTypes("Fire", "Fighting");
    	emboar.addAbilities("Blaze", "Reckless");
    	emboar.setAllBaseStats(110, 123, 65, 100, 65, 65);
    	emboar.setWeight(150.0);
    	pokedex.put("Emboar", emboar);

    	Pokemon emolga = new Pokemon("Emolga");
    	emolga.setDexNumber(587);
    	emolga.setTypes("Electric", "Flying");
    	emolga.addAbilities("Static", "Motor Drive");
    	emolga.setAllBaseStats(55, 75, 60, 75, 60, 103);
    	emolga.setWeight(5.0);
    	pokedex.put("Emolga", emolga);

    	Pokemon empoleon = new Pokemon("Empoleon");
    	empoleon.setDexNumber(395);
    	empoleon.setTypes("Water", "Steel");
    	empoleon.addAbilities("Torrent", "Defiant");
    	empoleon.setAllBaseStats(84, 86, 88, 111, 101, 60);
    	empoleon.setWeight(84.5);
    	pokedex.put("Empoleon", empoleon);

    	Pokemon entei = new Pokemon("Entei");
    	entei.setDexNumber(244);
    	entei.setTypes("Fire", "(none)");
    	entei.addAbilities("Pressure", "Inner Focus");
    	entei.setAllBaseStats(115, 115, 85, 90, 75, 100);
    	entei.setWeight(198.0);
    	pokedex.put("Entei", entei);

    	Pokemon escavalier = new Pokemon("Escavalier");
    	escavalier.setDexNumber(589);
    	escavalier.setTypes("Bug", "Steel");
    	escavalier.addAbilities("Swarm", "Shell Armor", "Overcoat");
    	escavalier.setAllBaseStats(70, 135, 105, 60, 105, 20);
    	escavalier.setWeight(33.0);
    	pokedex.put("Escavalier", escavalier);

    	Pokemon espeon = new Pokemon("Espeon");
    	espeon.setDexNumber(196);
    	espeon.setTypes("Psychic", "(none)");
    	espeon.addAbilities("Synchronize", "Magic Bounce");
    	espeon.setAllBaseStats(65, 65, 60, 130, 95, 110);
    	espeon.setWeight(26.5);
    	pokedex.put("Espeon", espeon);

    	Pokemon espurr = new Pokemon("Espurr");
    	espurr.setDexNumber(677);
    	espurr.setTypes("Psychic", "(none)");
    	espurr.addAbilities("Keen Eye", "Infiltrator", "Own Tempo");
    	espurr.setAllBaseStats(62, 48, 54, 63, 60, 68);
    	espurr.setWeight(3.5);
    	pokedex.put("Espurr", espurr);

    	Pokemon excadrill = new Pokemon("Excadrill");
    	excadrill.setDexNumber(530);
    	excadrill.setTypes("Ground", "Steel");
    	excadrill.addAbilities("Sand Rush", "Sand Force", "Mold Breaker");
    	excadrill.setAllBaseStats(110, 135, 60, 50, 65, 88);
    	excadrill.setWeight(40.4);
    	pokedex.put("Excadrill", excadrill);

    	Pokemon exeggcute = new Pokemon("Exeggcute");
    	exeggcute.setDexNumber(102);
    	exeggcute.setTypes("Grass", "Psychic");
    	exeggcute.addAbilities("Chlorophyll", "Harvest");
    	exeggcute.setAllBaseStats(60, 40, 80, 60, 45, 40);
    	exeggcute.setWeight(2.5);
    	pokedex.put("Exeggcute", exeggcute);

    	Pokemon exeggutor = new Pokemon("Exeggutor");
    	exeggutor.setDexNumber(103);
    	exeggutor.setTypes("Grass", "Psychic");
    	exeggutor.addAbilities("Chlorophyll", "Harvest");
    	exeggutor.setAllBaseStats(95, 95, 85, 125, 75, 55);
    	exeggutor.setWeight(120.0);
    	pokedex.put("Exeggutor", exeggutor);

    	Pokemon exeggutoralola = new Pokemon("Exeggutor-Alola");
    	exeggutoralola.setDexNumber(103);
    	exeggutoralola.setTypes("Grass", "Dragon");
    	exeggutoralola.addAbilities("Frisk", "Harvest");
    	exeggutoralola.setAllBaseStats(95, 105, 85, 125, 75, 45);
    	exeggutoralola.setWeight(415.6);
    	pokedex.put("Exeggutor-Alola", exeggutoralola);

    	Pokemon exploud = new Pokemon("Exploud");
    	exploud.setDexNumber(295);
    	exploud.setTypes("Normal", "(none)");
    	exploud.addAbilities("Soundproof", "Scrappy");
    	exploud.setAllBaseStats(104, 91, 63, 91, 73, 68);
    	exploud.setWeight(84.0);
    	pokedex.put("Exploud", exploud);

    	Pokemon farfetchd = new Pokemon("Farfetch'd");
    	farfetchd.setDexNumber(83);
    	farfetchd.setTypes("Normal", "Flying");
    	farfetchd.addAbilities("Keen Eye", "Inner Focus", "Defiant");
    	farfetchd.setAllBaseStats(52, 90, 55, 58, 62, 60);
    	farfetchd.setWeight(15.0);
    	pokedex.put("Farfetch'd", farfetchd);

    	Pokemon fearow = new Pokemon("Fearow");
    	fearow.setDexNumber(22);
    	fearow.setTypes("Normal", "Flying");
    	fearow.addAbilities("Keen Eye", "Sniper");
    	fearow.setAllBaseStats(65, 90, 65, 61, 61, 100);
    	fearow.setWeight(38.0);
    	pokedex.put("Fearow", fearow);

    	Pokemon feebas = new Pokemon("Feebas");
    	feebas.setDexNumber(349);
    	feebas.setTypes("Water", "(none)");
    	feebas.addAbilities("Swift Swim", "Oblivious", "Adaptability");
    	feebas.setAllBaseStats(20, 15, 20, 10, 55, 80);
    	feebas.setWeight(7.4);
    	pokedex.put("Feebas", feebas);

    	Pokemon fennekin = new Pokemon("Fennekin");
    	fennekin.setDexNumber(653);
    	fennekin.setTypes("Fire", "(none)");
    	fennekin.addAbilities("Blaze", "Magician");
    	fennekin.setAllBaseStats(40, 45, 40, 62, 60, 60);
    	fennekin.setWeight(9.4);
    	pokedex.put("Fennekin", fennekin);

    	Pokemon feraligatr = new Pokemon("Feraligatr");
    	feraligatr.setDexNumber(160);
    	feraligatr.setTypes("Water", "(none)");
    	feraligatr.addAbilities("Torrent", "Sheer Force");
    	feraligatr.setAllBaseStats(85, 105, 100, 79, 83, 78);
    	feraligatr.setWeight(88.8);
    	pokedex.put("Feraligatr", feraligatr);

    	Pokemon ferroseed = new Pokemon("Ferroseed");
    	ferroseed.setDexNumber(597);
    	ferroseed.setTypes("Grass", "Steel");
    	ferroseed.addAbilities("Iron Barbs");
    	ferroseed.setAllBaseStats(44, 50, 91, 24, 86, 10);
    	ferroseed.setWeight(18.8);
    	pokedex.put("Ferroseed", ferroseed);

    	Pokemon ferrothorn = new Pokemon("Ferrothorn");
    	ferrothorn.setDexNumber(598);
    	ferrothorn.setTypes("Grass", "Steel");
    	ferrothorn.addAbilities("Iron Barbs", "Anticipation");
    	ferrothorn.setAllBaseStats(74, 94, 131, 54, 116, 20);
    	ferrothorn.setWeight(110.0);
    	pokedex.put("Ferrothorn", ferrothorn);

    	Pokemon fidgit = new Pokemon("Fidgit");
    	fidgit.setDexNumber(-54);
    	fidgit.setTypes("Poison", "Ground");
    	fidgit.addAbilities("Persistent", "Vital Spirit", "Frisk");
    	fidgit.setAllBaseStats(95, 76, 109, 90, 80, 105);
    	fidgit.setWeight(53.0);
    	pokedex.put("Fidgit", fidgit);

    	Pokemon finneon = new Pokemon("Finneon");
    	finneon.setDexNumber(456);
    	finneon.setTypes("Water", "(none)");
    	finneon.addAbilities("Swift Swim", "Storm Drain", "Water Veil");
    	finneon.setAllBaseStats(49, 49, 56, 49, 61, 66);
    	finneon.setWeight(7.0);
    	pokedex.put("Finneon", finneon);

    	Pokemon flaaffy = new Pokemon("Flaaffy");
    	flaaffy.setDexNumber(180);
    	flaaffy.setTypes("Electric", "(none)");
    	flaaffy.addAbilities("Static", "Plus");
    	flaaffy.setAllBaseStats(70, 55, 55, 80, 60, 45);
    	flaaffy.setWeight(13.3);
    	pokedex.put("Flaaffy", flaaffy);

    	Pokemon flabebe = new Pokemon("FlabeÌ?beÌ?");
    	flabebe.setDexNumber(669);
    	flabebe.setTypes("Fairy", "(none)");
    	flabebe.addAbilities("Flower Veil", "Symbiosis");
    	flabebe.setAllBaseStats(44, 38, 39, 61, 79, 42);
    	flabebe.setWeight(0.1);
    	pokedex.put("FlabeÌ?beÌ?", flabebe);

    	Pokemon flarelm = new Pokemon("Flarelm");
    	flarelm.setDexNumber(-103);
    	flarelm.setTypes("Fire", "Grass");
    	flarelm.addAbilities("Rock Head", "Battle Armor");
    	flarelm.setAllBaseStats(90, 50, 95, 75, 70, 40);
    	flarelm.setWeight(73.0);
    	pokedex.put("Flarelm", flarelm);

    	Pokemon flareon = new Pokemon("Flareon");
    	flareon.setDexNumber(136);
    	flareon.setTypes("Fire", "(none)");
    	flareon.addAbilities("Flash Fire", "Guts");
    	flareon.setAllBaseStats(65, 130, 60, 95, 110, 65);
    	flareon.setWeight(25.0);
    	pokedex.put("Flareon", flareon);

    	Pokemon fletchinder = new Pokemon("Fletchinder");
    	fletchinder.setDexNumber(662);
    	fletchinder.setTypes("Fire", "Flying");
    	fletchinder.addAbilities("Flame Body", "Gale Wings");
    	fletchinder.setAllBaseStats(62, 73, 55, 56, 52, 84);
    	fletchinder.setWeight(16.0);
    	pokedex.put("Fletchinder", fletchinder);

    	Pokemon fletchling = new Pokemon("Fletchling");
    	fletchling.setDexNumber(661);
    	fletchling.setTypes("Normal", "Flying");
    	fletchling.addAbilities("Big Pecks", "Gale Wings");
    	fletchling.setAllBaseStats(45, 50, 43, 40, 38, 62);
    	fletchling.setWeight(1.7);
    	pokedex.put("Fletchling", fletchling);

    	Pokemon floatoy = new Pokemon("Floatoy");
    	floatoy.setDexNumber(-113);
    	floatoy.setTypes("Water", "(none)");
    	floatoy.addAbilities("Water Veil", "Heatproof", "Swift Swim");
    	floatoy.setAllBaseStats(48, 70, 40, 70, 30, 77);
    	floatoy.setWeight(1.9);
    	pokedex.put("Floatoy", floatoy);

    	Pokemon floatzel = new Pokemon("Floatzel");
    	floatzel.setDexNumber(419);
    	floatzel.setTypes("Water", "(none)");
    	floatzel.addAbilities("Swift Swim", "Water Veil");
    	floatzel.setAllBaseStats(85, 105, 55, 85, 50, 115);
    	floatzel.setWeight(33.5);
    	pokedex.put("Floatzel", floatzel);

    	Pokemon floette = new Pokemon("Floette");
    	floette.setDexNumber(670);
    	floette.setTypes("Fairy", "(none)");
    	floette.addAbilities("Flower Veil", "Symbiosis");
    	floette.setAllBaseStats(54, 45, 47, 75, 98, 52);
    	floette.setWeight(0.9);
    	pokedex.put("Floette", floette);

    	Pokemon floetteeternal = new Pokemon("Floette-Eternal");
    	floetteeternal.setDexNumber(670);
    	floetteeternal.setTypes("Fairy", "(none)");
    	floetteeternal.addAbilities("Flower Veil");
    	floetteeternal.setAllBaseStats(74, 65, 67, 125, 128, 92);
    	floetteeternal.setWeight(0.9);
    	pokedex.put("Floette-Eternal", floetteeternal);

    	Pokemon florges = new Pokemon("Florges");
    	florges.setDexNumber(671);
    	florges.setTypes("Fairy", "(none)");
    	florges.addAbilities("Flower Veil", "Symbiosis");
    	florges.setAllBaseStats(78, 65, 68, 112, 154, 75);
    	florges.setWeight(10.0);
    	pokedex.put("Florges", florges);

    	Pokemon flygon = new Pokemon("Flygon");
    	flygon.setDexNumber(330);
    	flygon.setTypes("Ground", "Dragon");
    	flygon.addAbilities("Levitate");
    	flygon.setAllBaseStats(80, 100, 80, 80, 80, 100);
    	flygon.setWeight(82.0);
    	pokedex.put("Flygon", flygon);

    	Pokemon fomantis = new Pokemon("Fomantis");
    	fomantis.setDexNumber(753);
    	fomantis.setTypes("Grass", "(none)");
    	fomantis.addAbilities("Leaf Guard", "Contrary");
    	fomantis.setAllBaseStats(40, 55, 35, 50, 35, 35);
    	fomantis.setWeight(1.5);
    	pokedex.put("Fomantis", fomantis);

    	Pokemon foongus = new Pokemon("Foongus");
    	foongus.setDexNumber(590);
    	foongus.setTypes("Grass", "Poison");
    	foongus.addAbilities("Effect Spore", "Regenerator");
    	foongus.setAllBaseStats(69, 55, 45, 55, 55, 15);
    	foongus.setWeight(1.0);
    	pokedex.put("Foongus", foongus);

    	Pokemon forretress = new Pokemon("Forretress");
    	forretress.setDexNumber(205);
    	forretress.setTypes("Bug", "Steel");
    	forretress.addAbilities("Sturdy", "Overcoat");
    	forretress.setAllBaseStats(75, 90, 140, 60, 60, 40);
    	forretress.setWeight(125.8);
    	pokedex.put("Forretress", forretress);

    	Pokemon fraxure = new Pokemon("Fraxure");
    	fraxure.setDexNumber(611);
    	fraxure.setTypes("Dragon", "(none)");
    	fraxure.addAbilities("Rivalry", "Mold Breaker", "Unnerve");
    	fraxure.setAllBaseStats(66, 117, 70, 40, 50, 67);
    	fraxure.setWeight(36.0);
    	pokedex.put("Fraxure", fraxure);

    	Pokemon frillish = new Pokemon("Frillish");
    	frillish.setDexNumber(592);
    	frillish.setTypes("Water", "Ghost");
    	frillish.addAbilities("Water Absorb", "Cursed Body", "Damp");
    	frillish.setAllBaseStats(55, 40, 50, 65, 85, 40);
    	frillish.setWeight(33.0);
    	pokedex.put("Frillish", frillish);

    	Pokemon froakie = new Pokemon("Froakie");
    	froakie.setDexNumber(656);
    	froakie.setTypes("Water", "(none)");
    	froakie.addAbilities("Torrent", "Protean");
    	froakie.setAllBaseStats(41, 56, 40, 62, 44, 71);
    	froakie.setWeight(7.0);
    	pokedex.put("Froakie", froakie);

    	Pokemon frogadier = new Pokemon("Frogadier");
    	frogadier.setDexNumber(657);
    	frogadier.setTypes("Water", "(none)");
    	frogadier.addAbilities("Torrent", "Protean");
    	frogadier.setAllBaseStats(54, 63, 52, 83, 56, 97);
    	frogadier.setWeight(10.9);
    	pokedex.put("Frogadier", frogadier);

    	Pokemon froslass = new Pokemon("Froslass");
    	froslass.setDexNumber(478);
    	froslass.setTypes("Ice", "Ghost");
    	froslass.addAbilities("Snow Cloak", "Cursed Body");
    	froslass.setAllBaseStats(70, 80, 70, 80, 70, 110);
    	froslass.setWeight(26.6);
    	pokedex.put("Froslass", froslass);

    	Pokemon furfrou = new Pokemon("Furfrou");
    	furfrou.setDexNumber(676);
    	furfrou.setTypes("Normal", "(none)");
    	furfrou.addAbilities("Fur Coat");
    	furfrou.setAllBaseStats(75, 80, 60, 65, 90, 102);
    	furfrou.setWeight(28.0);
    	pokedex.put("Furfrou", furfrou);

    	Pokemon furret = new Pokemon("Furret");
    	furret.setDexNumber(162);
    	furret.setTypes("Normal", "(none)");
    	furret.addAbilities("Run Away", "Keen Eye", "Frisk");
    	furret.setAllBaseStats(85, 76, 64, 45, 55, 90);
    	furret.setWeight(32.5);
    	pokedex.put("Furret", furret);

    	Pokemon gabite = new Pokemon("Gabite");
    	gabite.setDexNumber(444);
    	gabite.setTypes("Dragon", "Ground");
    	gabite.addAbilities("Sand Veil", "Rough Skin");
    	gabite.setAllBaseStats(68, 90, 65, 50, 55, 82);
    	gabite.setWeight(56.0);
    	pokedex.put("Gabite", gabite);

    	Pokemon gallade = new Pokemon("Gallade");
    	gallade.setDexNumber(475);
    	gallade.setTypes("Psychic", "Fighting");
    	gallade.addAbilities("Steadfast", "Justified");
    	gallade.setAllBaseStats(68, 125, 65, 65, 115, 80);
    	gallade.setWeight(52.0);
    	gallade.setFormes("Gallade", "Gallade-Mega");
    	pokedex.put("Gallade", gallade);

    	Pokemon gallademega = new Pokemon("Gallade-Mega");
    	gallademega.setDexNumber(475);
    	gallademega.setTypes("Psychic", "Fighting");
    	gallademega.addAbilities("Inner Focus");
    	gallademega.setAllBaseStats(68, 165, 95, 65, 115, 110);
    	gallademega.setWeight(56.4);
    	pokedex.put("Gallade-Mega", gallademega);

    	Pokemon galvantula = new Pokemon("Galvantula");
    	galvantula.setDexNumber(596);
    	galvantula.setTypes("Bug", "Electric");
    	galvantula.addAbilities("Compound Eyes", "Unnerve", "Swarm");
    	galvantula.setAllBaseStats(70, 77, 60, 97, 60, 108);
    	galvantula.setWeight(14.3);
    	pokedex.put("Galvantula", galvantula);

    	Pokemon garbodor = new Pokemon("Garbodor");
    	garbodor.setDexNumber(569);
    	garbodor.setTypes("Poison", "(none)");
    	garbodor.addAbilities("Stench", "Weak Armor", "Aftermath");
    	garbodor.setAllBaseStats(80, 95, 82, 60, 82, 75);
    	garbodor.setWeight(107.3);
    	pokedex.put("Garbodor", garbodor);

    	Pokemon garchomp = new Pokemon("Garchomp");
    	garchomp.setDexNumber(445);
    	garchomp.setTypes("Dragon", "Ground");
    	garchomp.addAbilities("Sand Veil", "Rough Skin");
    	garchomp.setAllBaseStats(108, 130, 95, 80, 85, 102);
    	garchomp.setWeight(95.0);
    	garchomp.setFormes("Garchomp", "Garchomp-Mega");
    	pokedex.put("Garchomp", garchomp);

    	Pokemon garchompmega = new Pokemon("Garchomp-Mega");
    	garchompmega.setDexNumber(445);
    	garchompmega.setTypes("Dragon", "Ground");
    	garchompmega.addAbilities("Sand Force");
    	garchompmega.setAllBaseStats(108, 170, 115, 120, 95, 92);
    	garchompmega.setWeight(95.0);
    	pokedex.put("Garchomp-Mega", garchompmega);

    	Pokemon gardevoir = new Pokemon("Gardevoir");
    	gardevoir.setDexNumber(282);
    	gardevoir.setTypes("Psychic", "Fairy");
    	gardevoir.addAbilities("Synchronize", "Trace", "Telepathy");
    	gardevoir.setAllBaseStats(68, 65, 65, 125, 115, 80);
    	gardevoir.setWeight(48.4);
    	gardevoir.setFormes("Gardevoir", "Gardevoir-Mega");
    	pokedex.put("Gardevoir", gardevoir);

    	Pokemon gardevoirmega = new Pokemon("Gardevoir-Mega");
    	gardevoirmega.setDexNumber(282);
    	gardevoirmega.setTypes("Psychic", "Fairy");
    	gardevoirmega.addAbilities("Pixilate");
    	gardevoirmega.setAllBaseStats(68, 85, 65, 165, 135, 100);
    	gardevoirmega.setWeight(48.4);
    	pokedex.put("Gardevoir-Mega", gardevoirmega);

    	Pokemon gastly = new Pokemon("Gastly");
    	gastly.setDexNumber(92);
    	gastly.setTypes("Ghost", "Poison");
    	gastly.addAbilities("Levitate");
    	gastly.setAllBaseStats(30, 35, 30, 100, 35, 80);
    	gastly.setWeight(0.1);
    	pokedex.put("Gastly", gastly);

    	Pokemon gastrodon = new Pokemon("Gastrodon");
    	gastrodon.setDexNumber(423);
    	gastrodon.setTypes("Water", "Ground");
    	gastrodon.addAbilities("Sticky Hold", "Storm Drain", "Sand Force");
    	gastrodon.setAllBaseStats(111, 83, 68, 92, 82, 39);
    	gastrodon.setWeight(29.9);
    	pokedex.put("Gastrodon", gastrodon);

    	Pokemon genesect = new Pokemon("Genesect");
    	genesect.setDexNumber(649);
    	genesect.setTypes("Bug", "Steel");
    	genesect.addAbilities("Download");
    	genesect.setAllBaseStats(71, 120, 95, 120, 95, 99);
    	genesect.setWeight(82.5);
    	pokedex.put("Genesect", genesect);

    	Pokemon genesectburn = new Pokemon("Genesect-Burn");
    	genesectburn.setDexNumber(649);
    	genesectburn.setTypes("Bug", "Steel");
    	genesectburn.addAbilities("Download");
    	genesectburn.setAllBaseStats(71, 120, 95, 120, 95, 99);
    	genesectburn.setWeight(82.5);
    	pokedex.put("Genesect-Burn", genesectburn);

    	Pokemon genesectchill = new Pokemon("Genesect-Chill");
    	genesectchill.setDexNumber(649);
    	genesectchill.setTypes("Bug", "Steel");
    	genesectchill.addAbilities("Download");
    	genesectchill.setAllBaseStats(71, 120, 95, 120, 95, 99);
    	genesectchill.setWeight(82.5);
    	pokedex.put("Genesect-Chill", genesectchill);

    	Pokemon genesectdouse = new Pokemon("Genesect-Douse");
    	genesectdouse.setDexNumber(649);
    	genesectdouse.setTypes("Bug", "Steel");
    	genesectdouse.addAbilities("Download");
    	genesectdouse.setAllBaseStats(71, 120, 95, 120, 95, 99);
    	genesectdouse.setWeight(82.5);
    	pokedex.put("Genesect-Douse", genesectdouse);

    	Pokemon genesectshock = new Pokemon("Genesect-Shock");
    	genesectshock.setDexNumber(649);
    	genesectshock.setTypes("Bug", "Steel");
    	genesectshock.addAbilities("Download");
    	genesectshock.setAllBaseStats(71, 120, 95, 120, 95, 99);
    	genesectshock.setWeight(82.5);
    	pokedex.put("Genesect-Shock", genesectshock);

    	Pokemon gengar = new Pokemon("Gengar");
    	gengar.setDexNumber(94);
    	gengar.setTypes("Ghost", "Poison");
    	gengar.addAbilities("Cursed Body");
    	gengar.setAllBaseStats(60, 65, 60, 130, 75, 110);
    	gengar.setWeight(40.5);
    	gengar.setFormes("Gengar", "Gengar-Mega");
    	pokedex.put("Gengar", gengar);

    	Pokemon gengarmega = new Pokemon("Gengar-Mega");
    	gengarmega.setDexNumber(94);
    	gengarmega.setTypes("Ghost", "Poison");
    	gengarmega.addAbilities("Shadow Tag");
    	gengarmega.setAllBaseStats(60, 65, 80, 170, 95, 130);
    	gengarmega.setWeight(40.5);
    	pokedex.put("Gengar-Mega", gengarmega);

    	Pokemon geodude = new Pokemon("Geodude");
    	geodude.setDexNumber(74);
    	geodude.setTypes("Rock", "Ground");
    	geodude.addAbilities("Rock Head", "Sturdy", "Sand Veil");
    	geodude.setAllBaseStats(40, 80, 100, 30, 30, 20);
    	geodude.setWeight(20.0);
    	pokedex.put("Geodude", geodude);

    	Pokemon geodudealola = new Pokemon("Geodude-Alola");
    	geodudealola.setDexNumber(74);
    	geodudealola.setTypes("Rock", "Electric");
    	geodudealola.addAbilities("Magnet Pull", "Sturdy", "Galvanize");
    	geodudealola.setAllBaseStats(40, 80, 100, 30, 30, 20);
    	geodudealola.setWeight(20.3);
    	pokedex.put("Geodude-Alola", geodudealola);

    	Pokemon gible = new Pokemon("Gible");
    	gible.setDexNumber(443);
    	gible.setTypes("Dragon", "Ground");
    	gible.addAbilities("Sand Veil", "Rough Skin");
    	gible.setAllBaseStats(58, 70, 45, 40, 45, 42);
    	gible.setWeight(20.5);
    	pokedex.put("Gible", gible);

    	Pokemon gigalith = new Pokemon("Gigalith");
    	gigalith.setDexNumber(526);
    	gigalith.setTypes("Rock", "(none)");
    	gigalith.addAbilities("Sturdy", "Sand Stream", "Sand Force");
    	gigalith.setAllBaseStats(85, 135, 130, 60, 80, 25);
    	gigalith.setWeight(260.0);
    	pokedex.put("Gigalith", gigalith);

    	Pokemon girafarig = new Pokemon("Girafarig");
    	girafarig.setDexNumber(203);
    	girafarig.setTypes("Normal", "Psychic");
    	girafarig.addAbilities("Inner Focus", "Early Bird", "Sap Sipper");
    	girafarig.setAllBaseStats(70, 80, 65, 90, 65, 85);
    	girafarig.setWeight(41.5);
    	pokedex.put("Girafarig", girafarig);

    	Pokemon giratina = new Pokemon("Giratina");
    	giratina.setDexNumber(487);
    	giratina.setTypes("Ghost", "Dragon");
    	giratina.addAbilities("Pressure", "Telepathy");
    	giratina.setAllBaseStats(150, 100, 120, 100, 120, 90);
    	giratina.setWeight(750.0);
    	pokedex.put("Giratina", giratina);

    	Pokemon giratinaorigin = new Pokemon("Giratina-Origin");
    	giratinaorigin.setDexNumber(487);
    	giratinaorigin.setTypes("Ghost", "Dragon");
    	giratinaorigin.addAbilities("Levitate");
    	giratinaorigin.setAllBaseStats(150, 120, 100, 120, 100, 90);
    	giratinaorigin.setWeight(650.0);
    	pokedex.put("Giratina-Origin", giratinaorigin);

    	Pokemon glaceon = new Pokemon("Glaceon");
    	glaceon.setDexNumber(471);
    	glaceon.setTypes("Ice", "(none)");
    	glaceon.addAbilities("Snow Cloak", "Ice Body");
    	glaceon.setAllBaseStats(65, 60, 110, 130, 95, 65);
    	glaceon.setWeight(25.9);
    	pokedex.put("Glaceon", glaceon);

    	Pokemon glalie = new Pokemon("Glalie");
    	glalie.setDexNumber(362);
    	glalie.setTypes("Ice", "(none)");
    	glalie.addAbilities("Inner Focus", "Ice Body", "Moody");
    	glalie.setAllBaseStats(80, 80, 80, 80, 80, 80);
    	glalie.setWeight(256.5);
    	glalie.setFormes("Glalie", "Glalie-Mega");
    	pokedex.put("Glalie", glalie);

    	Pokemon glaliemega = new Pokemon("Glalie-Mega");
    	glaliemega.setDexNumber(362);
    	glaliemega.setTypes("Ice", "(none)");
    	glaliemega.addAbilities("Refrigerate");
    	glaliemega.setAllBaseStats(80, 120, 80, 120, 80, 100);
    	glaliemega.setWeight(350.2);
    	pokedex.put("Glalie-Mega", glaliemega);

    	Pokemon glameow = new Pokemon("Glameow");
    	glameow.setDexNumber(431);
    	glameow.setTypes("Normal", "(none)");
    	glameow.addAbilities("Limber", "Own Tempo", "Keen Eye");
    	glameow.setAllBaseStats(49, 55, 42, 42, 37, 85);
    	glameow.setWeight(3.9);
    	pokedex.put("Glameow", glameow);

    	Pokemon gligar = new Pokemon("Gligar");
    	gligar.setDexNumber(207);
    	gligar.setTypes("Ground", "Flying");
    	gligar.addAbilities("Hyper Cutter", "Sand Veil", "Immunity");
    	gligar.setAllBaseStats(65, 75, 105, 35, 65, 85);
    	gligar.setWeight(64.8);
    	pokedex.put("Gligar", gligar);

    	Pokemon gliscor = new Pokemon("Gliscor");
    	gliscor.setDexNumber(472);
    	gliscor.setTypes("Ground", "Flying");
    	gliscor.addAbilities("Hyper Cutter", "Sand Veil", "Poison Heal");
    	gliscor.setAllBaseStats(75, 95, 125, 45, 75, 95);
    	gliscor.setWeight(42.5);
    	pokedex.put("Gliscor", gliscor);

    	Pokemon gloom = new Pokemon("Gloom");
    	gloom.setDexNumber(44);
    	gloom.setTypes("Grass", "Poison");
    	gloom.addAbilities("Chlorophyll", "Stench");
    	gloom.setAllBaseStats(60, 65, 70, 85, 75, 40);
    	gloom.setWeight(8.6);
    	pokedex.put("Gloom", gloom);

    	Pokemon gogoat = new Pokemon("Gogoat");
    	gogoat.setDexNumber(673);
    	gogoat.setTypes("Grass", "(none)");
    	gogoat.addAbilities("Sap Sipper", "Grass Pelt");
    	gogoat.setAllBaseStats(123, 100, 62, 97, 81, 68);
    	gogoat.setWeight(91.0);
    	pokedex.put("Gogoat", gogoat);

    	Pokemon golbat = new Pokemon("Golbat");
    	golbat.setDexNumber(42);
    	golbat.setTypes("Poison", "Flying");
    	golbat.addAbilities("Inner Focus", "Infiltrator");
    	golbat.setAllBaseStats(75, 80, 70, 65, 75, 90);
    	golbat.setWeight(55.0);
    	pokedex.put("Golbat", golbat);

    	Pokemon goldeen = new Pokemon("Goldeen");
    	goldeen.setDexNumber(118);
    	goldeen.setTypes("Water", "(none)");
    	goldeen.addAbilities("Swift Swim", "Water Veil", "Lightning Rod");
    	goldeen.setAllBaseStats(45, 67, 60, 35, 50, 63);
    	goldeen.setWeight(15.0);
    	pokedex.put("Goldeen", goldeen);

    	Pokemon golduck = new Pokemon("Golduck");
    	golduck.setDexNumber(55);
    	golduck.setTypes("Water", "(none)");
    	golduck.addAbilities("Damp", "Cloud Nine", "Swift Swim");
    	golduck.setAllBaseStats(80, 82, 78, 95, 80, 85);
    	golduck.setWeight(76.6);
    	pokedex.put("Golduck", golduck);

    	Pokemon golem = new Pokemon("Golem");
    	golem.setDexNumber(76);
    	golem.setTypes("Rock", "Ground");
    	golem.addAbilities("Rock Head", "Sturdy", "Sand Veil");
    	golem.setAllBaseStats(80, 120, 130, 55, 65, 45);
    	golem.setWeight(300.0);
    	pokedex.put("Golem", golem);

    	Pokemon golemalola = new Pokemon("Golem-Alola");
    	golemalola.setDexNumber(76);
    	golemalola.setTypes("Rock", "Electric");
    	golemalola.addAbilities("Magnet Pull", "Sturdy", "Galvanize");
    	golemalola.setAllBaseStats(80, 120, 130, 55, 65, 45);
    	golemalola.setWeight(316.0);
    	pokedex.put("Golem-Alola", golemalola);

    	Pokemon golett = new Pokemon("Golett");
    	golett.setDexNumber(622);
    	golett.setTypes("Ground", "Ghost");
    	golett.addAbilities("Iron Fist", "Klutz", "No Guard");
    	golett.setAllBaseStats(59, 74, 50, 35, 50, 35);
    	golett.setWeight(92.0);
    	pokedex.put("Golett", golett);

    	Pokemon golisopod = new Pokemon("Golisopod");
    	golisopod.setDexNumber(768);
    	golisopod.setTypes("Bug", "Water");
    	golisopod.addAbilities("Emergency Exit");
    	golisopod.setAllBaseStats(75, 125, 140, 60, 90, 40);
    	golisopod.setWeight(108.0);
    	pokedex.put("Golisopod", golisopod);

    	Pokemon golurk = new Pokemon("Golurk");
    	golurk.setDexNumber(623);
    	golurk.setTypes("Ground", "Ghost");
    	golurk.addAbilities("Iron Fist", "Klutz", "No Guard");
    	golurk.setAllBaseStats(89, 124, 80, 55, 80, 55);
    	golurk.setWeight(330.0);
    	pokedex.put("Golurk", golurk);

    	Pokemon goodra = new Pokemon("Goodra");
    	goodra.setDexNumber(706);
    	goodra.setTypes("Dragon", "(none)");
    	goodra.addAbilities("Sap Sipper", "Hydration", "Gooey");
    	goodra.setAllBaseStats(90, 100, 70, 110, 150, 80);
    	goodra.setWeight(150.5);
    	pokedex.put("Goodra", goodra);

    	Pokemon goomy = new Pokemon("Goomy");
    	goomy.setDexNumber(704);
    	goomy.setTypes("Dragon", "(none)");
    	goomy.addAbilities("Sap Sipper", "Hydration", "Gooey");
    	goomy.setAllBaseStats(45, 50, 35, 55, 75, 40);
    	goomy.setWeight(2.8);
    	pokedex.put("Goomy", goomy);

    	Pokemon gorebyss = new Pokemon("Gorebyss");
    	gorebyss.setDexNumber(368);
    	gorebyss.setTypes("Water", "(none)");
    	gorebyss.addAbilities("Swift Swim", "Hydration");
    	gorebyss.setAllBaseStats(55, 84, 105, 114, 75, 52);
    	gorebyss.setWeight(22.6);
    	pokedex.put("Gorebyss", gorebyss);

    	Pokemon gothita = new Pokemon("Gothita");
    	gothita.setDexNumber(574);
    	gothita.setTypes("Psychic", "(none)");
    	gothita.addAbilities("Frisk", "Competitive", "Shadow Tag");
    	gothita.setAllBaseStats(45, 30, 50, 55, 65, 45);
    	gothita.setWeight(5.8);
    	pokedex.put("Gothita", gothita);

    	Pokemon gothitelle = new Pokemon("Gothitelle");
    	gothitelle.setDexNumber(576);
    	gothitelle.setTypes("Psychic", "(none)");
    	gothitelle.addAbilities("Frisk", "Competitive", "Shadow Tag");
    	gothitelle.setAllBaseStats(70, 55, 95, 95, 110, 65);
    	gothitelle.setWeight(44.0);
    	pokedex.put("Gothitelle", gothitelle);

    	Pokemon gothorita = new Pokemon("Gothorita");
    	gothorita.setDexNumber(575);
    	gothorita.setTypes("Psychic", "(none)");
    	gothorita.addAbilities("Frisk", "Competitive", "Shadow Tag");
    	gothorita.setAllBaseStats(60, 45, 70, 75, 85, 55);
    	gothorita.setWeight(18.0);
    	pokedex.put("Gothorita", gothorita);

    	Pokemon gourgeist = new Pokemon("Gourgeist");
    	gourgeist.setDexNumber(711);
    	gourgeist.setTypes("Ghost", "Grass");
    	gourgeist.addAbilities("Pickup", "Frisk", "Insomnia");
    	gourgeist.setAllBaseStats(65, 90, 122, 58, 75, 84);
    	gourgeist.setWeight(12.5);
    	pokedex.put("Gourgeist", gourgeist);

    	Pokemon gourgeistlarge = new Pokemon("Gourgeist-Large");
    	gourgeistlarge.setDexNumber(711);
    	gourgeistlarge.setTypes("Ghost", "Grass");
    	gourgeistlarge.addAbilities("Pickup", "Frisk", "Insomnia");
    	gourgeistlarge.setAllBaseStats(75, 95, 122, 58, 75, 69);
    	gourgeistlarge.setWeight(14.0);
    	pokedex.put("Gourgeist-Large", gourgeistlarge);

    	Pokemon gourgeistsmall = new Pokemon("Gourgeist-Small");
    	gourgeistsmall.setDexNumber(711);
    	gourgeistsmall.setTypes("Ghost", "Grass");
    	gourgeistsmall.addAbilities("Pickup", "Frisk", "Insomnia");
    	gourgeistsmall.setAllBaseStats(55, 85, 122, 58, 75, 99);
    	gourgeistsmall.setWeight(9.5);
    	pokedex.put("Gourgeist-Small", gourgeistsmall);

    	Pokemon gourgeistsuper = new Pokemon("Gourgeist-Super");
    	gourgeistsuper.setDexNumber(711);
    	gourgeistsuper.setTypes("Ghost", "Grass");
    	gourgeistsuper.addAbilities("Pickup", "Frisk", "Insomnia");
    	gourgeistsuper.setAllBaseStats(85, 100, 122, 58, 75, 54);
    	gourgeistsuper.setWeight(39.0);
    	pokedex.put("Gourgeist-Super", gourgeistsuper);

    	Pokemon granbull = new Pokemon("Granbull");
    	granbull.setDexNumber(210);
    	granbull.setTypes("Fairy", "(none)");
    	granbull.addAbilities("Intimidate", "Quick Feet", "Rattled");
    	granbull.setAllBaseStats(90, 120, 75, 60, 60, 45);
    	granbull.setWeight(48.7);
    	pokedex.put("Granbull", granbull);

    	Pokemon graveler = new Pokemon("Graveler");
    	graveler.setDexNumber(75);
    	graveler.setTypes("Rock", "Ground");
    	graveler.addAbilities("Rock Head", "Sturdy", "Sand Veil");
    	graveler.setAllBaseStats(55, 95, 115, 45, 45, 35);
    	graveler.setWeight(105.0);
    	pokedex.put("Graveler", graveler);

    	Pokemon graveleralola = new Pokemon("Graveler-Alola");
    	graveleralola.setDexNumber(75);
    	graveleralola.setTypes("Rock", "Electric");
    	graveleralola.addAbilities("Magnet Pull", "Sturdy", "Galvanize");
    	graveleralola.setAllBaseStats(55, 95, 115, 45, 45, 35);
    	graveleralola.setWeight(110.0);
    	pokedex.put("Graveler-Alola", graveleralola);

    	Pokemon greninja = new Pokemon("Greninja");
    	greninja.setDexNumber(658);
    	greninja.setTypes("Water", "Dark");
    	greninja.addAbilities("Torrent", "Protean");
    	greninja.setAllBaseStats(72, 95, 67, 103, 71, 122);
    	greninja.setWeight(40.0);
    	greninja.setFormes("Greninja", "Greninja-Ash");
    	pokedex.put("Greninja", greninja);

    	Pokemon greninjaash = new Pokemon("Greninja-Ash");
    	greninjaash.setDexNumber(658);
    	greninjaash.setTypes("Water", "Dark");
    	greninjaash.addAbilities("Battle Bond");
    	greninjaash.setAllBaseStats(72, 145, 67, 153, 71, 132);
    	greninjaash.setWeight(40.0);
    	pokedex.put("Greninja-Ash", greninjaash);

    	Pokemon grimer = new Pokemon("Grimer");
    	grimer.setDexNumber(88);
    	grimer.setTypes("Poison", "(none)");
    	grimer.addAbilities("Stench", "Sticky Hold", "Poison Touch");
    	grimer.setAllBaseStats(80, 80, 50, 40, 50, 25);
    	grimer.setWeight(30.0);
    	pokedex.put("Grimer", grimer);

    	Pokemon grimeralola = new Pokemon("Grimer-Alola");
    	grimeralola.setDexNumber(88);
    	grimeralola.setTypes("Poison", "Dark");
    	grimeralola.addAbilities("Poison Touch", "Gluttony", "Power of Alchemy");
    	grimeralola.setAllBaseStats(80, 80, 50, 40, 50, 25);
    	grimeralola.setWeight(42.0);
    	pokedex.put("Grimer-Alola", grimeralola);

    	Pokemon grotle = new Pokemon("Grotle");
    	grotle.setDexNumber(388);
    	grotle.setTypes("Grass", "(none)");
    	grotle.addAbilities("Overgrow", "Shell Armor");
    	grotle.setAllBaseStats(75, 89, 85, 55, 65, 36);
    	grotle.setWeight(97.0);
    	pokedex.put("Grotle", grotle);

    	Pokemon groudon = new Pokemon("Groudon");
    	groudon.setDexNumber(383);
    	groudon.setTypes("Ground", "(none)");
    	groudon.addAbilities("Drought");
    	groudon.setAllBaseStats(100, 150, 140, 100, 90, 90);
    	groudon.setWeight(950.0);
    	groudon.setFormes("Groudon", "Groudon-Primal");
    	pokedex.put("Groudon", groudon);

    	Pokemon groudonprimal = new Pokemon("Groudon-Primal");
    	groudonprimal.setDexNumber(383);
    	groudonprimal.setTypes("Ground", "Fire");
    	groudonprimal.addAbilities("Desolate Land");
    	groudonprimal.setAllBaseStats(100, 180, 160, 150, 90, 90);
    	groudonprimal.setWeight(999.7);
    	pokedex.put("Groudon-Primal", groudonprimal);

    	Pokemon grovyle = new Pokemon("Grovyle");
    	grovyle.setDexNumber(253);
    	grovyle.setTypes("Grass", "(none)");
    	grovyle.addAbilities("Overgrow", "Unburden");
    	grovyle.setAllBaseStats(50, 65, 45, 85, 65, 95);
    	grovyle.setWeight(21.6);
    	pokedex.put("Grovyle", grovyle);

    	Pokemon growlithe = new Pokemon("Growlithe");
    	growlithe.setDexNumber(58);
    	growlithe.setTypes("Fire", "(none)");
    	growlithe.addAbilities("Intimidate", "Flash Fire", "Justified");
    	growlithe.setAllBaseStats(55, 70, 45, 70, 50, 60);
    	growlithe.setWeight(19.0);
    	pokedex.put("Growlithe", growlithe);

    	Pokemon grubbin = new Pokemon("Grubbin");
    	grubbin.setDexNumber(736);
    	grubbin.setTypes("Bug", "(none)");
    	grubbin.addAbilities("Swarm");
    	grubbin.setAllBaseStats(47, 62, 45, 55, 45, 46);
    	grubbin.setWeight(4.4);
    	pokedex.put("Grubbin", grubbin);

    	Pokemon grumpig = new Pokemon("Grumpig");
    	grumpig.setDexNumber(326);
    	grumpig.setTypes("Psychic", "(none)");
    	grumpig.addAbilities("Thick Fat", "Own Tempo", "Gluttony");
    	grumpig.setAllBaseStats(80, 45, 65, 90, 110, 80);
    	grumpig.setWeight(71.5);
    	pokedex.put("Grumpig", grumpig);

    	Pokemon gulpin = new Pokemon("Gulpin");
    	gulpin.setDexNumber(316);
    	gulpin.setTypes("Poison", "(none)");
    	gulpin.addAbilities("Liquid Ooze", "Sticky Hold", "Gluttony");
    	gulpin.setAllBaseStats(70, 43, 53, 43, 53, 40);
    	gulpin.setWeight(10.3);
    	pokedex.put("Gulpin", gulpin);

    	Pokemon gumshoos = new Pokemon("Gumshoos");
    	gumshoos.setDexNumber(735);
    	gumshoos.setTypes("Normal", "(none)");
    	gumshoos.addAbilities("Stakeout", "Strong Jaw", "Adaptability");
    	gumshoos.setAllBaseStats(88, 110, 60, 55, 60, 45);
    	gumshoos.setWeight(14.2);
    	pokedex.put("Gumshoos", gumshoos);

    	Pokemon gumshoostotem = new Pokemon("Gumshoos-Totem");
    	gumshoostotem.setDexNumber(735);
    	gumshoostotem.setTypes("Normal", "(none)");
    	gumshoostotem.addAbilities("Adaptability");
    	gumshoostotem.setAllBaseStats(88, 110, 60, 55, 60, 45);
    	gumshoostotem.setWeight(60.0);
    	pokedex.put("Gumshoos-Totem", gumshoostotem);

    	Pokemon gurdurr = new Pokemon("Gurdurr");
    	gurdurr.setDexNumber(533);
    	gurdurr.setTypes("Fighting", "(none)");
    	gurdurr.addAbilities("Guts", "Sheer Force", "Iron Fist");
    	gurdurr.setAllBaseStats(85, 105, 85, 40, 50, 40);
    	gurdurr.setWeight(40.0);
    	pokedex.put("Gurdurr", gurdurr);

    	Pokemon guzzlord = new Pokemon("Guzzlord");
    	guzzlord.setDexNumber(799);
    	guzzlord.setTypes("Dark", "Dragon");
    	guzzlord.addAbilities("Beast Boost");
    	guzzlord.setAllBaseStats(223, 101, 53, 97, 53, 43);
    	guzzlord.setWeight(888.0);
    	pokedex.put("Guzzlord", guzzlord);

    	Pokemon gyarados = new Pokemon("Gyarados");
    	gyarados.setDexNumber(130);
    	gyarados.setTypes("Water", "Flying");
    	gyarados.addAbilities("Intimidate", "Moxie");
    	gyarados.setAllBaseStats(95, 125, 79, 60, 100, 81);
    	gyarados.setWeight(235.0);
    	gyarados.setFormes("Gyarados", "Gyarados-Mega");
    	pokedex.put("Gyarados", gyarados);

    	Pokemon gyaradosmega = new Pokemon("Gyarados-Mega");
    	gyaradosmega.setDexNumber(130);
    	gyaradosmega.setTypes("Water", "Dark");
    	gyaradosmega.addAbilities("Mold Breaker");
    	gyaradosmega.setAllBaseStats(95, 155, 109, 70, 130, 81);
    	gyaradosmega.setWeight(305.0);
    	pokedex.put("Gyarados-Mega", gyaradosmega);

    	Pokemon hakamoo = new Pokemon("Hakamo-o");
    	hakamoo.setDexNumber(783);
    	hakamoo.setTypes("Dragon", "Fighting");
    	hakamoo.addAbilities("Bulletproof", "Soundproof", "Overcoat");
    	hakamoo.setAllBaseStats(55, 75, 90, 65, 70, 65);
    	hakamoo.setWeight(47.0);
    	pokedex.put("Hakamo-o", hakamoo);

    	Pokemon happiny = new Pokemon("Happiny");
    	happiny.setDexNumber(440);
    	happiny.setTypes("Normal", "(none)");
    	happiny.addAbilities("Natural Cure", "Serene Grace", "Friend Guard");
    	happiny.setAllBaseStats(100, 5, 5, 15, 65, 30);
    	happiny.setWeight(24.4);
    	pokedex.put("Happiny", happiny);

    	Pokemon hariyama = new Pokemon("Hariyama");
    	hariyama.setDexNumber(297);
    	hariyama.setTypes("Fighting", "(none)");
    	hariyama.addAbilities("Thick Fat", "Guts", "Sheer Force");
    	hariyama.setAllBaseStats(144, 120, 60, 40, 60, 50);
    	hariyama.setWeight(253.8);
    	pokedex.put("Hariyama", hariyama);

    	Pokemon haunter = new Pokemon("Haunter");
    	haunter.setDexNumber(93);
    	haunter.setTypes("Ghost", "Poison");
    	haunter.addAbilities("Levitate");
    	haunter.setAllBaseStats(45, 50, 45, 115, 55, 95);
    	haunter.setWeight(0.1);
    	pokedex.put("Haunter", haunter);

    	Pokemon hawlucha = new Pokemon("Hawlucha");
    	hawlucha.setDexNumber(701);
    	hawlucha.setTypes("Fighting", "Flying");
    	hawlucha.addAbilities("Limber", "Unburden", "Mold Breaker");
    	hawlucha.setAllBaseStats(78, 92, 75, 74, 63, 118);
    	hawlucha.setWeight(21.5);
    	pokedex.put("Hawlucha", hawlucha);

    	Pokemon haxorus = new Pokemon("Haxorus");
    	haxorus.setDexNumber(612);
    	haxorus.setTypes("Dragon", "(none)");
    	haxorus.addAbilities("Rivalry", "Mold Breaker", "Unnerve");
    	haxorus.setAllBaseStats(76, 147, 90, 60, 70, 97);
    	haxorus.setWeight(105.5);
    	pokedex.put("Haxorus", haxorus);

    	Pokemon heatmor = new Pokemon("Heatmor");
    	heatmor.setDexNumber(631);
    	heatmor.setTypes("Fire", "(none)");
    	heatmor.addAbilities("Gluttony", "Flash Fire", "White Smoke");
    	heatmor.setAllBaseStats(85, 97, 66, 105, 66, 65);
    	heatmor.setWeight(58.0);
    	pokedex.put("Heatmor", heatmor);

    	Pokemon heatran = new Pokemon("Heatran");
    	heatran.setDexNumber(485);
    	heatran.setTypes("Fire", "Steel");
    	heatran.addAbilities("Flash Fire", "Flame Body");
    	heatran.setAllBaseStats(91, 90, 106, 130, 106, 77);
    	heatran.setWeight(430.0);
    	pokedex.put("Heatran", heatran);

    	Pokemon heliolisk = new Pokemon("Heliolisk");
    	heliolisk.setDexNumber(695);
    	heliolisk.setTypes("Electric", "Normal");
    	heliolisk.addAbilities("Dry Skin", "Sand Veil", "Solar Power");
    	heliolisk.setAllBaseStats(62, 55, 52, 109, 94, 109);
    	heliolisk.setWeight(21.0);
    	pokedex.put("Heliolisk", heliolisk);

    	Pokemon helioptile = new Pokemon("Helioptile");
    	helioptile.setDexNumber(694);
    	helioptile.setTypes("Electric", "Normal");
    	helioptile.addAbilities("Dry Skin", "Sand Veil", "Solar Power");
    	helioptile.setAllBaseStats(44, 38, 33, 61, 43, 70);
    	helioptile.setWeight(6.0);
    	pokedex.put("Helioptile", helioptile);

    	Pokemon heracross = new Pokemon("Heracross");
    	heracross.setDexNumber(214);
    	heracross.setTypes("Bug", "Fighting");
    	heracross.addAbilities("Swarm", "Guts", "Moxie");
    	heracross.setAllBaseStats(80, 125, 75, 40, 95, 85);
    	heracross.setWeight(54.0);
    	heracross.setFormes("Heracross", "Heracross-Mega");
    	pokedex.put("Heracross", heracross);

    	Pokemon heracrossmega = new Pokemon("Heracross-Mega");
    	heracrossmega.setDexNumber(214);
    	heracrossmega.setTypes("Bug", "Fighting");
    	heracrossmega.addAbilities("Skill Link");
    	heracrossmega.setAllBaseStats(80, 185, 115, 40, 105, 75);
    	heracrossmega.setWeight(62.5);
    	pokedex.put("Heracross-Mega", heracrossmega);

    	Pokemon herdier = new Pokemon("Herdier");
    	herdier.setDexNumber(507);
    	herdier.setTypes("Normal", "(none)");
    	herdier.addAbilities("Intimidate", "Sand Rush", "Scrappy");
    	herdier.setAllBaseStats(65, 80, 65, 35, 65, 60);
    	herdier.setWeight(14.7);
    	pokedex.put("Herdier", herdier);

    	Pokemon hippopotas = new Pokemon("Hippopotas");
    	hippopotas.setDexNumber(449);
    	hippopotas.setTypes("Ground", "(none)");
    	hippopotas.addAbilities("Sand Stream", "Sand Force");
    	hippopotas.setAllBaseStats(68, 72, 78, 38, 42, 32);
    	hippopotas.setWeight(49.5);
    	pokedex.put("Hippopotas", hippopotas);

    	Pokemon hippowdon = new Pokemon("Hippowdon");
    	hippowdon.setDexNumber(450);
    	hippowdon.setTypes("Ground", "(none)");
    	hippowdon.addAbilities("Sand Stream", "Sand Force");
    	hippowdon.setAllBaseStats(108, 112, 118, 68, 72, 47);
    	hippowdon.setWeight(300.0);
    	pokedex.put("Hippowdon", hippowdon);

    	Pokemon hitmonchan = new Pokemon("Hitmonchan");
    	hitmonchan.setDexNumber(107);
    	hitmonchan.setTypes("Fighting", "(none)");
    	hitmonchan.addAbilities("Keen Eye", "Iron Fist", "Inner Focus");
    	hitmonchan.setAllBaseStats(50, 105, 79, 35, 110, 76);
    	hitmonchan.setWeight(50.2);
    	pokedex.put("Hitmonchan", hitmonchan);

    	Pokemon hitmonlee = new Pokemon("Hitmonlee");
    	hitmonlee.setDexNumber(106);
    	hitmonlee.setTypes("Fighting", "(none)");
    	hitmonlee.addAbilities("Limber", "Reckless", "Unburden");
    	hitmonlee.setAllBaseStats(50, 120, 53, 35, 110, 87);
    	hitmonlee.setWeight(49.8);
    	pokedex.put("Hitmonlee", hitmonlee);

    	Pokemon hitmontop = new Pokemon("Hitmontop");
    	hitmontop.setDexNumber(237);
    	hitmontop.setTypes("Fighting", "(none)");
    	hitmontop.addAbilities("Intimidate", "Technician", "Steadfast");
    	hitmontop.setAllBaseStats(50, 95, 95, 35, 110, 70);
    	hitmontop.setWeight(48.0);
    	pokedex.put("Hitmontop", hitmontop);

    	Pokemon hooh = new Pokemon("Ho-Oh");
    	hooh.setDexNumber(250);
    	hooh.setTypes("Fire", "Flying");
    	hooh.addAbilities("Pressure", "Regenerator");
    	hooh.setAllBaseStats(106, 130, 90, 110, 154, 90);
    	hooh.setWeight(199.0);
    	pokedex.put("Ho-Oh", hooh);

    	Pokemon honchkrow = new Pokemon("Honchkrow");
    	honchkrow.setDexNumber(430);
    	honchkrow.setTypes("Dark", "Flying");
    	honchkrow.addAbilities("Insomnia", "Super Luck", "Moxie");
    	honchkrow.setAllBaseStats(100, 125, 52, 105, 52, 71);
    	honchkrow.setWeight(27.3);
    	pokedex.put("Honchkrow", honchkrow);

    	Pokemon honedge = new Pokemon("Honedge");
    	honedge.setDexNumber(679);
    	honedge.setTypes("Steel", "Ghost");
    	honedge.addAbilities("No Guard");
    	honedge.setAllBaseStats(45, 80, 100, 35, 37, 28);
    	honedge.setWeight(2.0);
    	pokedex.put("Honedge", honedge);

    	Pokemon hoopa = new Pokemon("Hoopa");
    	hoopa.setDexNumber(720);
    	hoopa.setTypes("Psychic", "Ghost");
    	hoopa.addAbilities("Magician");
    	hoopa.setAllBaseStats(80, 110, 60, 150, 130, 70);
    	hoopa.setWeight(9.0);
    	pokedex.put("Hoopa", hoopa);

    	Pokemon hoopaunbound = new Pokemon("Hoopa-Unbound");
    	hoopaunbound.setDexNumber(720);
    	hoopaunbound.setTypes("Psychic", "Dark");
    	hoopaunbound.addAbilities("Magician");
    	hoopaunbound.setAllBaseStats(80, 160, 60, 170, 130, 80);
    	hoopaunbound.setWeight(490.0);
    	pokedex.put("Hoopa-Unbound", hoopaunbound);

    	Pokemon hoothoot = new Pokemon("Hoothoot");
    	hoothoot.setDexNumber(163);
    	hoothoot.setTypes("Normal", "Flying");
    	hoothoot.addAbilities("Insomnia", "Keen Eye", "Tinted Lens");
    	hoothoot.setAllBaseStats(60, 30, 30, 36, 56, 50);
    	hoothoot.setWeight(21.2);
    	pokedex.put("Hoothoot", hoothoot);

    	Pokemon hoppip = new Pokemon("Hoppip");
    	hoppip.setDexNumber(187);
    	hoppip.setTypes("Grass", "Flying");
    	hoppip.addAbilities("Chlorophyll", "Leaf Guard", "Infiltrator");
    	hoppip.setAllBaseStats(35, 35, 40, 35, 55, 50);
    	hoppip.setWeight(0.5);
    	pokedex.put("Hoppip", hoppip);

    	Pokemon horsea = new Pokemon("Horsea");
    	horsea.setDexNumber(116);
    	horsea.setTypes("Water", "(none)");
    	horsea.addAbilities("Swift Swim", "Sniper", "Damp");
    	horsea.setAllBaseStats(30, 40, 70, 70, 25, 60);
    	horsea.setWeight(8.0);
    	pokedex.put("Horsea", horsea);

    	Pokemon houndoom = new Pokemon("Houndoom");
    	houndoom.setDexNumber(229);
    	houndoom.setTypes("Dark", "Fire");
    	houndoom.addAbilities("Early Bird", "Flash Fire", "Unnerve");
    	houndoom.setAllBaseStats(75, 90, 50, 110, 80, 95);
    	houndoom.setWeight(35.0);
    	houndoom.setFormes("Houndoom", "Houndoom-Mega");
    	pokedex.put("Houndoom", houndoom);

    	Pokemon houndoommega = new Pokemon("Houndoom-Mega");
    	houndoommega.setDexNumber(229);
    	houndoommega.setTypes("Dark", "Fire");
    	houndoommega.addAbilities("Solar Power");
    	houndoommega.setAllBaseStats(75, 90, 90, 140, 90, 115);
    	houndoommega.setWeight(49.5);
    	pokedex.put("Houndoom-Mega", houndoommega);

    	Pokemon houndour = new Pokemon("Houndour");
    	houndour.setDexNumber(228);
    	houndour.setTypes("Dark", "Fire");
    	houndour.addAbilities("Early Bird", "Flash Fire", "Unnerve");
    	houndour.setAllBaseStats(45, 60, 30, 80, 50, 65);
    	houndour.setWeight(10.8);
    	pokedex.put("Houndour", houndour);

    	Pokemon huntail = new Pokemon("Huntail");
    	huntail.setDexNumber(367);
    	huntail.setTypes("Water", "(none)");
    	huntail.addAbilities("Swift Swim", "Water Veil");
    	huntail.setAllBaseStats(55, 104, 105, 94, 75, 52);
    	huntail.setWeight(27.0);
    	pokedex.put("Huntail", huntail);

    	Pokemon hydreigon = new Pokemon("Hydreigon");
    	hydreigon.setDexNumber(635);
    	hydreigon.setTypes("Dark", "Dragon");
    	hydreigon.addAbilities("Levitate");
    	hydreigon.setAllBaseStats(92, 105, 90, 125, 90, 98);
    	hydreigon.setWeight(160.0);
    	pokedex.put("Hydreigon", hydreigon);

    	Pokemon hypno = new Pokemon("Hypno");
    	hypno.setDexNumber(97);
    	hypno.setTypes("Psychic", "(none)");
    	hypno.addAbilities("Insomnia", "Forewarn", "Inner Focus");
    	hypno.setAllBaseStats(85, 73, 70, 73, 115, 67);
    	hypno.setWeight(75.6);
    	pokedex.put("Hypno", hypno);

    	Pokemon igglybuff = new Pokemon("Igglybuff");
    	igglybuff.setDexNumber(174);
    	igglybuff.setTypes("Normal", "Fairy");
    	igglybuff.addAbilities("Cute Charm", "Competitive", "Friend Guard");
    	igglybuff.setAllBaseStats(90, 30, 15, 40, 20, 15);
    	igglybuff.setWeight(1.0);
    	pokedex.put("Igglybuff", igglybuff);

    	Pokemon illumise = new Pokemon("Illumise");
    	illumise.setDexNumber(314);
    	illumise.setTypes("Bug", "(none)");
    	illumise.addAbilities("Oblivious", "Tinted Lens", "Prankster");
    	illumise.setAllBaseStats(65, 47, 75, 73, 85, 85);
    	illumise.setWeight(17.7);
    	pokedex.put("Illumise", illumise);

    	Pokemon incineroar = new Pokemon("Incineroar");
    	incineroar.setDexNumber(727);
    	incineroar.setTypes("Fire", "Dark");
    	incineroar.addAbilities("Blaze", "Intimidate");
    	incineroar.setAllBaseStats(95, 115, 90, 80, 90, 60);
    	incineroar.setWeight(83.0);
    	pokedex.put("Incineroar", incineroar);

    	Pokemon infernape = new Pokemon("Infernape");
    	infernape.setDexNumber(392);
    	infernape.setTypes("Fire", "Fighting");
    	infernape.addAbilities("Blaze", "Iron Fist");
    	infernape.setAllBaseStats(76, 104, 71, 104, 71, 108);
    	infernape.setWeight(55.0);
    	pokedex.put("Infernape", infernape);

    	Pokemon inkay = new Pokemon("Inkay");
    	inkay.setDexNumber(686);
    	inkay.setTypes("Dark", "Psychic");
    	inkay.addAbilities("Contrary", "Suction Cups", "Infiltrator");
    	inkay.setAllBaseStats(53, 54, 53, 37, 46, 45);
    	inkay.setWeight(3.5);
    	pokedex.put("Inkay", inkay);

    	Pokemon ivysaur = new Pokemon("Ivysaur");
    	ivysaur.setDexNumber(2);
    	ivysaur.setTypes("Grass", "Poison");
    	ivysaur.addAbilities("Overgrow", "Chlorophyll");
    	ivysaur.setAllBaseStats(60, 62, 63, 80, 80, 60);
    	ivysaur.setWeight(13.0);
    	pokedex.put("Ivysaur", ivysaur);

    	Pokemon jangmoo = new Pokemon("Jangmo-o");
    	jangmoo.setDexNumber(782);
    	jangmoo.setTypes("Dragon", "(none)");
    	jangmoo.addAbilities("Bulletproof", "Soundproof", "Overcoat");
    	jangmoo.setAllBaseStats(45, 55, 65, 45, 45, 45);
    	jangmoo.setWeight(29.7);
    	pokedex.put("Jangmo-o", jangmoo);

    	Pokemon jellicent = new Pokemon("Jellicent");
    	jellicent.setDexNumber(593);
    	jellicent.setTypes("Water", "Ghost");
    	jellicent.addAbilities("Water Absorb", "Cursed Body", "Damp");
    	jellicent.setAllBaseStats(100, 60, 70, 85, 105, 60);
    	jellicent.setWeight(135.0);
    	pokedex.put("Jellicent", jellicent);

    	Pokemon jigglypuff = new Pokemon("Jigglypuff");
    	jigglypuff.setDexNumber(39);
    	jigglypuff.setTypes("Normal", "Fairy");
    	jigglypuff.addAbilities("Cute Charm", "Competitive", "Friend Guard");
    	jigglypuff.setAllBaseStats(115, 45, 20, 45, 25, 20);
    	jigglypuff.setWeight(5.5);
    	pokedex.put("Jigglypuff", jigglypuff);

    	Pokemon jirachi = new Pokemon("Jirachi");
    	jirachi.setDexNumber(385);
    	jirachi.setTypes("Steel", "Psychic");
    	jirachi.addAbilities("Serene Grace");
    	jirachi.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	jirachi.setWeight(1.1);
    	pokedex.put("Jirachi", jirachi);

    	Pokemon jolteon = new Pokemon("Jolteon");
    	jolteon.setDexNumber(135);
    	jolteon.setTypes("Electric", "(none)");
    	jolteon.addAbilities("Volt Absorb", "Quick Feet");
    	jolteon.setAllBaseStats(65, 65, 60, 110, 95, 130);
    	jolteon.setWeight(24.5);
    	pokedex.put("Jolteon", jolteon);

    	Pokemon joltik = new Pokemon("Joltik");
    	joltik.setDexNumber(595);
    	joltik.setTypes("Bug", "Electric");
    	joltik.addAbilities("Compound Eyes", "Unnerve", "Swarm");
    	joltik.setAllBaseStats(50, 47, 50, 57, 50, 65);
    	joltik.setWeight(0.6);
    	pokedex.put("Joltik", joltik);

    	Pokemon jumpluff = new Pokemon("Jumpluff");
    	jumpluff.setDexNumber(189);
    	jumpluff.setTypes("Grass", "Flying");
    	jumpluff.addAbilities("Chlorophyll", "Leaf Guard", "Infiltrator");
    	jumpluff.setAllBaseStats(75, 55, 70, 55, 95, 110);
    	jumpluff.setWeight(3.0);
    	pokedex.put("Jumpluff", jumpluff);

    	Pokemon jynx = new Pokemon("Jynx");
    	jynx.setDexNumber(124);
    	jynx.setTypes("Ice", "Psychic");
    	jynx.addAbilities("Oblivious", "Forewarn", "Dry Skin");
    	jynx.setAllBaseStats(65, 50, 35, 115, 95, 95);
    	jynx.setWeight(40.6);
    	pokedex.put("Jynx", jynx);

    	Pokemon kabuto = new Pokemon("Kabuto");
    	kabuto.setDexNumber(140);
    	kabuto.setTypes("Rock", "Water");
    	kabuto.addAbilities("Swift Swim", "Battle Armor", "Weak Armor");
    	kabuto.setAllBaseStats(30, 80, 90, 55, 45, 55);
    	kabuto.setWeight(11.5);
    	pokedex.put("Kabuto", kabuto);

    	Pokemon kabutops = new Pokemon("Kabutops");
    	kabutops.setDexNumber(141);
    	kabutops.setTypes("Rock", "Water");
    	kabutops.addAbilities("Swift Swim", "Battle Armor", "Weak Armor");
    	kabutops.setAllBaseStats(60, 115, 105, 65, 70, 80);
    	kabutops.setWeight(40.5);
    	pokedex.put("Kabutops", kabutops);

    	Pokemon kadabra = new Pokemon("Kadabra");
    	kadabra.setDexNumber(64);
    	kadabra.setTypes("Psychic", "(none)");
    	kadabra.addAbilities("Synchronize", "Inner Focus", "Magic Guard");
    	kadabra.setAllBaseStats(40, 35, 30, 120, 70, 105);
    	kadabra.setWeight(56.5);
    	pokedex.put("Kadabra", kadabra);

    	Pokemon kakuna = new Pokemon("Kakuna");
    	kakuna.setDexNumber(14);
    	kakuna.setTypes("Bug", "Poison");
    	kakuna.addAbilities("Shed Skin");
    	kakuna.setAllBaseStats(45, 25, 50, 25, 25, 35);
    	kakuna.setWeight(10.0);
    	pokedex.put("Kakuna", kakuna);

    	Pokemon kangaskhan = new Pokemon("Kangaskhan");
    	kangaskhan.setDexNumber(115);
    	kangaskhan.setTypes("Normal", "(none)");
    	kangaskhan.addAbilities("Early Bird", "Scrappy", "Inner Focus");
    	kangaskhan.setAllBaseStats(105, 95, 80, 40, 80, 90);
    	kangaskhan.setWeight(80.0);
    	kangaskhan.setFormes("Kangaskhan", "Kangaskhan-Mega");
    	pokedex.put("Kangaskhan", kangaskhan);

    	Pokemon kangaskhanmega = new Pokemon("Kangaskhan-Mega");
    	kangaskhanmega.setDexNumber(115);
    	kangaskhanmega.setTypes("Normal", "(none)");
    	kangaskhanmega.addAbilities("Parental Bond");
    	kangaskhanmega.setAllBaseStats(105, 125, 100, 60, 100, 100);
    	kangaskhanmega.setWeight(100.0);
    	pokedex.put("Kangaskhan-Mega", kangaskhanmega);

    	Pokemon karrablast = new Pokemon("Karrablast");
    	karrablast.setDexNumber(588);
    	karrablast.setTypes("Bug", "(none)");
    	karrablast.addAbilities("Swarm", "Shed Skin", "No Guard");
    	karrablast.setAllBaseStats(50, 75, 45, 40, 45, 60);
    	karrablast.setWeight(5.9);
    	pokedex.put("Karrablast", karrablast);

    	Pokemon kartana = new Pokemon("Kartana");
    	kartana.setDexNumber(798);
    	kartana.setTypes("Grass", "Steel");
    	kartana.addAbilities("Beast Boost");
    	kartana.setAllBaseStats(59, 181, 131, 59, 31, 109);
    	kartana.setWeight(0.1);
    	pokedex.put("Kartana", kartana);

    	Pokemon kecleon = new Pokemon("Kecleon");
    	kecleon.setDexNumber(352);
    	kecleon.setTypes("Normal", "(none)");
    	kecleon.addAbilities("Color Change", "Protean");
    	kecleon.setAllBaseStats(60, 90, 70, 60, 120, 40);
    	kecleon.setWeight(22.0);
    	pokedex.put("Kecleon", kecleon);

    	Pokemon keldeo = new Pokemon("Keldeo");
    	keldeo.setDexNumber(647);
    	keldeo.setTypes("Water", "Fighting");
    	keldeo.addAbilities("Justified");
    	keldeo.setAllBaseStats(91, 72, 90, 129, 90, 108);
    	keldeo.setWeight(48.5);
    	pokedex.put("Keldeo", keldeo);

    	Pokemon keldeoresolute = new Pokemon("Keldeo-Resolute");
    	keldeoresolute.setDexNumber(647);
    	keldeoresolute.setTypes("Water", "Fighting");
    	keldeoresolute.addAbilities("Justified");
    	keldeoresolute.setAllBaseStats(91, 72, 90, 129, 90, 108);
    	keldeoresolute.setWeight(48.5);
    	pokedex.put("Keldeo-Resolute", keldeoresolute);

    	Pokemon kerfluffle = new Pokemon("Kerfluffle");
    	kerfluffle.setDexNumber(-11);
    	kerfluffle.setTypes("Fairy", "Fighting");
    	kerfluffle.addAbilities("Natural Cure", "Aroma Veil", "Friend Guard");
    	kerfluffle.setAllBaseStats(84, 78, 86, 115, 88, 119);
    	kerfluffle.setWeight(24.2);
    	pokedex.put("Kerfluffle", kerfluffle);

    	Pokemon kingdra = new Pokemon("Kingdra");
    	kingdra.setDexNumber(230);
    	kingdra.setTypes("Water", "Dragon");
    	kingdra.addAbilities("Swift Swim", "Sniper", "Damp");
    	kingdra.setAllBaseStats(75, 95, 95, 95, 95, 85);
    	kingdra.setWeight(152.0);
    	pokedex.put("Kingdra", kingdra);

    	Pokemon kingler = new Pokemon("Kingler");
    	kingler.setDexNumber(99);
    	kingler.setTypes("Water", "(none)");
    	kingler.addAbilities("Hyper Cutter", "Shell Armor", "Sheer Force");
    	kingler.setAllBaseStats(55, 130, 115, 50, 50, 75);
    	kingler.setWeight(60.0);
    	pokedex.put("Kingler", kingler);

    	Pokemon kirlia = new Pokemon("Kirlia");
    	kirlia.setDexNumber(281);
    	kirlia.setTypes("Psychic", "Fairy");
    	kirlia.addAbilities("Synchronize", "Trace", "Telepathy");
    	kirlia.setAllBaseStats(38, 35, 35, 65, 55, 50);
    	kirlia.setWeight(20.2);
    	pokedex.put("Kirlia", kirlia);

    	Pokemon kitsunoh = new Pokemon("Kitsunoh");
    	kitsunoh.setDexNumber(-57);
    	kitsunoh.setTypes("Steel", "Ghost");
    	kitsunoh.addAbilities("Frisk", "Limber", "Iron Fist");
    	kitsunoh.setAllBaseStats(80, 103, 85, 55, 80, 110);
    	kitsunoh.setWeight(51.0);
    	pokedex.put("Kitsunoh", kitsunoh);

    	Pokemon klang = new Pokemon("Klang");
    	klang.setDexNumber(600);
    	klang.setTypes("Steel", "(none)");
    	klang.addAbilities("Plus", "Minus", "Clear Body");
    	klang.setAllBaseStats(60, 80, 95, 70, 85, 50);
    	klang.setWeight(51.0);
    	pokedex.put("Klang", klang);

    	Pokemon klefki = new Pokemon("Klefki");
    	klefki.setDexNumber(707);
    	klefki.setTypes("Steel", "Fairy");
    	klefki.addAbilities("Prankster", "Magician");
    	klefki.setAllBaseStats(57, 80, 91, 80, 87, 75);
    	klefki.setWeight(3.0);
    	pokedex.put("Klefki", klefki);

    	Pokemon klink = new Pokemon("Klink");
    	klink.setDexNumber(599);
    	klink.setTypes("Steel", "(none)");
    	klink.addAbilities("Plus", "Minus", "Clear Body");
    	klink.setAllBaseStats(40, 55, 70, 45, 60, 30);
    	klink.setWeight(21.0);
    	pokedex.put("Klink", klink);

    	Pokemon klinklang = new Pokemon("Klinklang");
    	klinklang.setDexNumber(601);
    	klinklang.setTypes("Steel", "(none)");
    	klinklang.addAbilities("Plus", "Minus", "Clear Body");
    	klinklang.setAllBaseStats(60, 100, 115, 70, 85, 90);
    	klinklang.setWeight(81.0);
    	pokedex.put("Klinklang", klinklang);

    	Pokemon koffing = new Pokemon("Koffing");
    	koffing.setDexNumber(109);
    	koffing.setTypes("Poison", "(none)");
    	koffing.addAbilities("Levitate");
    	koffing.setAllBaseStats(40, 65, 95, 60, 45, 35);
    	koffing.setWeight(1.0);
    	pokedex.put("Koffing", koffing);

    	Pokemon komala = new Pokemon("Komala");
    	komala.setDexNumber(775);
    	komala.setTypes("Normal", "(none)");
    	komala.addAbilities("Comatose");
    	komala.setAllBaseStats(65, 115, 65, 75, 95, 65);
    	komala.setWeight(19.9);
    	pokedex.put("Komala", komala);

    	Pokemon kommoo = new Pokemon("Kommo-o");
    	kommoo.setDexNumber(784);
    	kommoo.setTypes("Dragon", "Fighting");
    	kommoo.addAbilities("Bulletproof", "Soundproof", "Overcoat");
    	kommoo.setAllBaseStats(75, 110, 125, 100, 105, 85);
    	kommoo.setWeight(78.2);
    	pokedex.put("Kommo-o", kommoo);

    	Pokemon kommoototem = new Pokemon("Kommo-o-Totem");
    	kommoototem.setDexNumber(784);
    	kommoototem.setTypes("Dragon", "Fighting");
    	kommoototem.addAbilities("Overcoat");
    	kommoototem.setAllBaseStats(75, 110, 125, 100, 105, 85);
    	kommoototem.setWeight(207.5);
    	pokedex.put("Kommo-o-Totem", kommoototem);

    	Pokemon krabby = new Pokemon("Krabby");
    	krabby.setDexNumber(98);
    	krabby.setTypes("Water", "(none)");
    	krabby.addAbilities("Hyper Cutter", "Shell Armor", "Sheer Force");
    	krabby.setAllBaseStats(30, 105, 90, 25, 25, 50);
    	krabby.setWeight(6.5);
    	pokedex.put("Krabby", krabby);

    	Pokemon kricketot = new Pokemon("Kricketot");
    	kricketot.setDexNumber(401);
    	kricketot.setTypes("Bug", "(none)");
    	kricketot.addAbilities("Shed Skin", "Run Away");
    	kricketot.setAllBaseStats(37, 25, 41, 25, 41, 25);
    	kricketot.setWeight(2.2);
    	pokedex.put("Kricketot", kricketot);

    	Pokemon kricketune = new Pokemon("Kricketune");
    	kricketune.setDexNumber(402);
    	kricketune.setTypes("Bug", "(none)");
    	kricketune.addAbilities("Swarm", "Technician");
    	kricketune.setAllBaseStats(77, 85, 51, 55, 51, 65);
    	kricketune.setWeight(25.5);
    	pokedex.put("Kricketune", kricketune);

    	Pokemon krilowatt = new Pokemon("Krilowatt");
    	krilowatt.setDexNumber(-60);
    	krilowatt.setTypes("Electric", "Water");
    	krilowatt.addAbilities("Trace", "Magic Guard", "Minus");
    	krilowatt.setAllBaseStats(151, 84, 73, 83, 74, 105);
    	krilowatt.setWeight(10.6);
    	pokedex.put("Krilowatt", krilowatt);

    	Pokemon krokorok = new Pokemon("Krokorok");
    	krokorok.setDexNumber(552);
    	krokorok.setTypes("Ground", "Dark");
    	krokorok.addAbilities("Intimidate", "Moxie", "Anger Point");
    	krokorok.setAllBaseStats(60, 82, 45, 45, 45, 74);
    	krokorok.setWeight(33.4);
    	pokedex.put("Krokorok", krokorok);

    	Pokemon krookodile = new Pokemon("Krookodile");
    	krookodile.setDexNumber(553);
    	krookodile.setTypes("Ground", "Dark");
    	krookodile.addAbilities("Intimidate", "Moxie", "Anger Point");
    	krookodile.setAllBaseStats(95, 117, 80, 65, 70, 92);
    	krookodile.setWeight(96.3);
    	pokedex.put("Krookodile", krookodile);

    	Pokemon kyogre = new Pokemon("Kyogre");
    	kyogre.setDexNumber(382);
    	kyogre.setTypes("Water", "(none)");
    	kyogre.addAbilities("Drizzle");
    	kyogre.setAllBaseStats(100, 100, 90, 150, 140, 90);
    	kyogre.setWeight(352.0);
    	kyogre.setFormes("Kyogre", "Kyogre-Primal");
    	pokedex.put("Kyogre", kyogre);

    	Pokemon kyogreprimal = new Pokemon("Kyogre-Primal");
    	kyogreprimal.setDexNumber(382);
    	kyogreprimal.setTypes("Water", "(none)");
    	kyogreprimal.addAbilities("Primordial Sea");
    	kyogreprimal.setAllBaseStats(100, 150, 90, 180, 160, 90);
    	kyogreprimal.setWeight(430.0);
    	pokedex.put("Kyogre-Primal", kyogreprimal);

    	Pokemon kyurem = new Pokemon("Kyurem");
    	kyurem.setDexNumber(646);
    	kyurem.setTypes("Dragon", "Ice");
    	kyurem.addAbilities("Pressure");
    	kyurem.setAllBaseStats(125, 130, 90, 130, 90, 95);
    	kyurem.setWeight(325.0);
    	pokedex.put("Kyurem", kyurem);

    	Pokemon kyuremblack = new Pokemon("Kyurem-Black");
    	kyuremblack.setDexNumber(646);
    	kyuremblack.setTypes("Dragon", "Ice");
    	kyuremblack.addAbilities("Teravolt");
    	kyuremblack.setAllBaseStats(125, 170, 100, 120, 90, 95);
    	kyuremblack.setWeight(325.0);
    	pokedex.put("Kyurem-Black", kyuremblack);

    	Pokemon kyuremwhite = new Pokemon("Kyurem-White");
    	kyuremwhite.setDexNumber(646);
    	kyuremwhite.setTypes("Dragon", "Ice");
    	kyuremwhite.addAbilities("Turboblaze");
    	kyuremwhite.setAllBaseStats(125, 120, 90, 170, 100, 95);
    	kyuremwhite.setWeight(325.0);
    	pokedex.put("Kyurem-White", kyuremwhite);

    	Pokemon lairon = new Pokemon("Lairon");
    	lairon.setDexNumber(305);
    	lairon.setTypes("Steel", "Rock");
    	lairon.addAbilities("Sturdy", "Rock Head", "Heavy Metal");
    	lairon.setAllBaseStats(60, 90, 140, 50, 50, 40);
    	lairon.setWeight(120.0);
    	pokedex.put("Lairon", lairon);

    	Pokemon lampent = new Pokemon("Lampent");
    	lampent.setDexNumber(608);
    	lampent.setTypes("Ghost", "Fire");
    	lampent.addAbilities("Flash Fire", "Flame Body", "Infiltrator");
    	lampent.setAllBaseStats(60, 40, 60, 95, 60, 55);
    	lampent.setWeight(13.0);
    	pokedex.put("Lampent", lampent);

    	Pokemon landorus = new Pokemon("Landorus");
    	landorus.setDexNumber(645);
    	landorus.setTypes("Ground", "Flying");
    	landorus.addAbilities("Sand Force", "Sheer Force");
    	landorus.setAllBaseStats(89, 125, 90, 115, 80, 101);
    	landorus.setWeight(68.0);
    	pokedex.put("Landorus", landorus);

    	Pokemon landorustherian = new Pokemon("Landorus-Therian");
    	landorustherian.setDexNumber(645);
    	landorustherian.setTypes("Ground", "Flying");
    	landorustherian.addAbilities("Intimidate");
    	landorustherian.setAllBaseStats(89, 145, 90, 105, 80, 91);
    	landorustherian.setWeight(68.0);
    	pokedex.put("Landorus-Therian", landorustherian);

    	Pokemon lanturn = new Pokemon("Lanturn");
    	lanturn.setDexNumber(171);
    	lanturn.setTypes("Water", "Electric");
    	lanturn.addAbilities("Volt Absorb", "Illuminate", "Water Absorb");
    	lanturn.setAllBaseStats(125, 58, 58, 76, 76, 67);
    	lanturn.setWeight(22.5);
    	pokedex.put("Lanturn", lanturn);

    	Pokemon lapras = new Pokemon("Lapras");
    	lapras.setDexNumber(131);
    	lapras.setTypes("Water", "Ice");
    	lapras.addAbilities("Water Absorb", "Shell Armor", "Hydration");
    	lapras.setAllBaseStats(130, 85, 80, 85, 95, 60);
    	lapras.setWeight(220.0);
    	pokedex.put("Lapras", lapras);

    	Pokemon larvesta = new Pokemon("Larvesta");
    	larvesta.setDexNumber(636);
    	larvesta.setTypes("Bug", "Fire");
    	larvesta.addAbilities("Flame Body", "Swarm");
    	larvesta.setAllBaseStats(55, 85, 55, 50, 55, 60);
    	larvesta.setWeight(28.8);
    	pokedex.put("Larvesta", larvesta);

    	Pokemon larvitar = new Pokemon("Larvitar");
    	larvitar.setDexNumber(246);
    	larvitar.setTypes("Rock", "Ground");
    	larvitar.addAbilities("Guts", "Sand Veil");
    	larvitar.setAllBaseStats(50, 64, 50, 45, 50, 41);
    	larvitar.setWeight(72.0);
    	pokedex.put("Larvitar", larvitar);

    	Pokemon latias = new Pokemon("Latias");
    	latias.setDexNumber(380);
    	latias.setTypes("Dragon", "Psychic");
    	latias.addAbilities("Levitate");
    	latias.setAllBaseStats(80, 80, 90, 110, 130, 110);
    	latias.setWeight(40.0);
    	latias.setFormes("Latias", "Latias-Mega");
    	pokedex.put("Latias", latias);

    	Pokemon latiasmega = new Pokemon("Latias-Mega");
    	latiasmega.setDexNumber(380);
    	latiasmega.setTypes("Dragon", "Psychic");
    	latiasmega.addAbilities("Levitate");
    	latiasmega.setAllBaseStats(80, 100, 120, 140, 150, 110);
    	latiasmega.setWeight(52.0);
    	pokedex.put("Latias-Mega", latiasmega);

    	Pokemon latios = new Pokemon("Latios");
    	latios.setDexNumber(381);
    	latios.setTypes("Dragon", "Psychic");
    	latios.addAbilities("Levitate");
    	latios.setAllBaseStats(80, 90, 80, 130, 110, 110);
    	latios.setWeight(60.0);
    	latios.setFormes("Latios", "Latios-Mega");
    	pokedex.put("Latios", latios);

    	Pokemon latiosmega = new Pokemon("Latios-Mega");
    	latiosmega.setDexNumber(381);
    	latiosmega.setTypes("Dragon", "Psychic");
    	latiosmega.addAbilities("Levitate");
    	latiosmega.setAllBaseStats(80, 130, 100, 160, 120, 110);
    	latiosmega.setWeight(70.0);
    	pokedex.put("Latios-Mega", latiosmega);

    	Pokemon leafeon = new Pokemon("Leafeon");
    	leafeon.setDexNumber(470);
    	leafeon.setTypes("Grass", "(none)");
    	leafeon.addAbilities("Leaf Guard", "Chlorophyll");
    	leafeon.setAllBaseStats(65, 110, 130, 60, 65, 95);
    	leafeon.setWeight(25.5);
    	pokedex.put("Leafeon", leafeon);

    	Pokemon leavanny = new Pokemon("Leavanny");
    	leavanny.setDexNumber(542);
    	leavanny.setTypes("Bug", "Grass");
    	leavanny.addAbilities("Swarm", "Chlorophyll", "Overcoat");
    	leavanny.setAllBaseStats(75, 103, 80, 70, 80, 92);
    	leavanny.setWeight(20.5);
    	pokedex.put("Leavanny", leavanny);

    	Pokemon ledian = new Pokemon("Ledian");
    	ledian.setDexNumber(166);
    	ledian.setTypes("Bug", "Flying");
    	ledian.addAbilities("Swarm", "Early Bird", "Iron Fist");
    	ledian.setAllBaseStats(55, 35, 50, 55, 110, 85);
    	ledian.setWeight(35.6);
    	pokedex.put("Ledian", ledian);

    	Pokemon ledyba = new Pokemon("Ledyba");
    	ledyba.setDexNumber(165);
    	ledyba.setTypes("Bug", "Flying");
    	ledyba.addAbilities("Swarm", "Early Bird", "Rattled");
    	ledyba.setAllBaseStats(40, 20, 30, 40, 80, 55);
    	ledyba.setWeight(10.8);
    	pokedex.put("Ledyba", ledyba);

    	Pokemon lickilicky = new Pokemon("Lickilicky");
    	lickilicky.setDexNumber(463);
    	lickilicky.setTypes("Normal", "(none)");
    	lickilicky.addAbilities("Own Tempo", "Oblivious", "Cloud Nine");
    	lickilicky.setAllBaseStats(110, 85, 95, 80, 95, 50);
    	lickilicky.setWeight(140.0);
    	pokedex.put("Lickilicky", lickilicky);

    	Pokemon lickitung = new Pokemon("Lickitung");
    	lickitung.setDexNumber(108);
    	lickitung.setTypes("Normal", "(none)");
    	lickitung.addAbilities("Own Tempo", "Oblivious", "Cloud Nine");
    	lickitung.setAllBaseStats(90, 55, 75, 60, 75, 30);
    	lickitung.setWeight(65.5);
    	pokedex.put("Lickitung", lickitung);

    	Pokemon liepard = new Pokemon("Liepard");
    	liepard.setDexNumber(510);
    	liepard.setTypes("Dark", "(none)");
    	liepard.addAbilities("Limber", "Unburden", "Prankster");
    	liepard.setAllBaseStats(64, 88, 50, 88, 50, 106);
    	liepard.setWeight(37.5);
    	pokedex.put("Liepard", liepard);

    	Pokemon lileep = new Pokemon("Lileep");
    	lileep.setDexNumber(345);
    	lileep.setTypes("Rock", "Grass");
    	lileep.addAbilities("Suction Cups", "Storm Drain");
    	lileep.setAllBaseStats(66, 41, 77, 61, 87, 23);
    	lileep.setWeight(23.8);
    	pokedex.put("Lileep", lileep);

    	Pokemon lilligant = new Pokemon("Lilligant");
    	lilligant.setDexNumber(549);
    	lilligant.setTypes("Grass", "(none)");
    	lilligant.addAbilities("Chlorophyll", "Own Tempo", "Leaf Guard");
    	lilligant.setAllBaseStats(70, 60, 75, 110, 75, 90);
    	lilligant.setWeight(16.3);
    	pokedex.put("Lilligant", lilligant);

    	Pokemon lillipup = new Pokemon("Lillipup");
    	lillipup.setDexNumber(506);
    	lillipup.setTypes("Normal", "(none)");
    	lillipup.addAbilities("Vital Spirit", "Pickup", "Run Away");
    	lillipup.setAllBaseStats(45, 60, 45, 25, 45, 55);
    	lillipup.setWeight(4.1);
    	pokedex.put("Lillipup", lillipup);

    	Pokemon linoone = new Pokemon("Linoone");
    	linoone.setDexNumber(264);
    	linoone.setTypes("Normal", "(none)");
    	linoone.addAbilities("Pickup", "Gluttony", "Quick Feet");
    	linoone.setAllBaseStats(78, 70, 61, 50, 61, 100);
    	linoone.setWeight(32.5);
    	pokedex.put("Linoone", linoone);

    	Pokemon litleo = new Pokemon("Litleo");
    	litleo.setDexNumber(667);
    	litleo.setTypes("Fire", "Normal");
    	litleo.addAbilities("Rivalry", "Unnerve", "Moxie");
    	litleo.setAllBaseStats(62, 50, 58, 73, 54, 72);
    	litleo.setWeight(13.5);
    	pokedex.put("Litleo", litleo);

    	Pokemon litten = new Pokemon("Litten");
    	litten.setDexNumber(725);
    	litten.setTypes("Fire", "(none)");
    	litten.addAbilities("Blaze", "Intimidate");
    	litten.setAllBaseStats(45, 65, 40, 60, 40, 70);
    	litten.setWeight(4.3);
    	pokedex.put("Litten", litten);

    	Pokemon litwick = new Pokemon("Litwick");
    	litwick.setDexNumber(607);
    	litwick.setTypes("Ghost", "Fire");
    	litwick.addAbilities("Flash Fire", "Flame Body", "Infiltrator");
    	litwick.setAllBaseStats(50, 30, 55, 65, 55, 20);
    	litwick.setWeight(3.1);
    	pokedex.put("Litwick", litwick);

    	Pokemon lombre = new Pokemon("Lombre");
    	lombre.setDexNumber(271);
    	lombre.setTypes("Water", "Grass");
    	lombre.addAbilities("Swift Swim", "Rain Dish", "Own Tempo");
    	lombre.setAllBaseStats(60, 50, 50, 60, 70, 50);
    	lombre.setWeight(32.5);
    	pokedex.put("Lombre", lombre);

    	Pokemon lopunny = new Pokemon("Lopunny");
    	lopunny.setDexNumber(428);
    	lopunny.setTypes("Normal", "(none)");
    	lopunny.addAbilities("Cute Charm", "Klutz", "Limber");
    	lopunny.setAllBaseStats(65, 76, 84, 54, 96, 105);
    	lopunny.setWeight(33.3);
    	lopunny.setFormes("Lopunny", "Lopunny-Mega");
    	pokedex.put("Lopunny", lopunny);

    	Pokemon lopunnymega = new Pokemon("Lopunny-Mega");
    	lopunnymega.setDexNumber(428);
    	lopunnymega.setTypes("Normal", "Fighting");
    	lopunnymega.addAbilities("Scrappy");
    	lopunnymega.setAllBaseStats(65, 136, 94, 54, 96, 135);
    	lopunnymega.setWeight(28.3);
    	pokedex.put("Lopunny-Mega", lopunnymega);

    	Pokemon lotad = new Pokemon("Lotad");
    	lotad.setDexNumber(270);
    	lotad.setTypes("Water", "Grass");
    	lotad.addAbilities("Swift Swim", "Rain Dish", "Own Tempo");
    	lotad.setAllBaseStats(40, 30, 30, 40, 50, 30);
    	lotad.setWeight(2.6);
    	pokedex.put("Lotad", lotad);

    	Pokemon loudred = new Pokemon("Loudred");
    	loudred.setDexNumber(294);
    	loudred.setTypes("Normal", "(none)");
    	loudred.addAbilities("Soundproof", "Scrappy");
    	loudred.setAllBaseStats(84, 71, 43, 71, 43, 48);
    	loudred.setWeight(40.5);
    	pokedex.put("Loudred", loudred);

    	Pokemon lucario = new Pokemon("Lucario");
    	lucario.setDexNumber(448);
    	lucario.setTypes("Fighting", "Steel");
    	lucario.addAbilities("Steadfast", "Inner Focus", "Justified");
    	lucario.setAllBaseStats(70, 110, 70, 115, 70, 90);
    	lucario.setWeight(54.0);
    	lucario.setFormes("Lucario", "Lucario-Mega");
    	pokedex.put("Lucario", lucario);

    	Pokemon lucariomega = new Pokemon("Lucario-Mega");
    	lucariomega.setDexNumber(448);
    	lucariomega.setTypes("Fighting", "Steel");
    	lucariomega.addAbilities("Adaptability");
    	lucariomega.setAllBaseStats(70, 145, 88, 140, 70, 112);
    	lucariomega.setWeight(57.5);
    	pokedex.put("Lucario-Mega", lucariomega);

    	Pokemon ludicolo = new Pokemon("Ludicolo");
    	ludicolo.setDexNumber(272);
    	ludicolo.setTypes("Water", "Grass");
    	ludicolo.addAbilities("Swift Swim", "Rain Dish", "Own Tempo");
    	ludicolo.setAllBaseStats(80, 70, 70, 90, 100, 70);
    	ludicolo.setWeight(55.0);
    	pokedex.put("Ludicolo", ludicolo);

    	Pokemon lugia = new Pokemon("Lugia");
    	lugia.setDexNumber(249);
    	lugia.setTypes("Psychic", "Flying");
    	lugia.addAbilities("Pressure", "Multiscale");
    	lugia.setAllBaseStats(106, 90, 130, 90, 154, 110);
    	lugia.setWeight(216.0);
    	pokedex.put("Lugia", lugia);

    	Pokemon lumineon = new Pokemon("Lumineon");
    	lumineon.setDexNumber(457);
    	lumineon.setTypes("Water", "(none)");
    	lumineon.addAbilities("Swift Swim", "Storm Drain", "Water Veil");
    	lumineon.setAllBaseStats(69, 69, 76, 69, 86, 91);
    	lumineon.setWeight(24.0);
    	pokedex.put("Lumineon", lumineon);

    	Pokemon lunala = new Pokemon("Lunala");
    	lunala.setDexNumber(792);
    	lunala.setTypes("Psychic", "Ghost");
    	lunala.addAbilities("Shadow Shield");
    	lunala.setAllBaseStats(137, 113, 89, 137, 107, 97);
    	lunala.setWeight(120.0);
    	pokedex.put("Lunala", lunala);

    	Pokemon lunatone = new Pokemon("Lunatone");
    	lunatone.setDexNumber(337);
    	lunatone.setTypes("Rock", "Psychic");
    	lunatone.addAbilities("Levitate");
    	lunatone.setAllBaseStats(90, 55, 65, 95, 85, 70);
    	lunatone.setWeight(168.0);
    	pokedex.put("Lunatone", lunatone);

    	Pokemon lurantis = new Pokemon("Lurantis");
    	lurantis.setDexNumber(754);
    	lurantis.setTypes("Grass", "(none)");
    	lurantis.addAbilities("Leaf Guard", "Contrary");
    	lurantis.setAllBaseStats(70, 105, 90, 80, 90, 45);
    	lurantis.setWeight(18.5);
    	pokedex.put("Lurantis", lurantis);

    	Pokemon lurantistotem = new Pokemon("Lurantis-Totem");
    	lurantistotem.setDexNumber(754);
    	lurantistotem.setTypes("Grass", "(none)");
    	lurantistotem.addAbilities("Leaf Guard");
    	lurantistotem.setAllBaseStats(70, 105, 90, 80, 90, 45);
    	lurantistotem.setWeight(58.0);
    	pokedex.put("Lurantis-Totem", lurantistotem);

    	Pokemon luvdisc = new Pokemon("Luvdisc");
    	luvdisc.setDexNumber(370);
    	luvdisc.setTypes("Water", "(none)");
    	luvdisc.addAbilities("Swift Swim", "Hydration");
    	luvdisc.setAllBaseStats(43, 30, 55, 40, 65, 97);
    	luvdisc.setWeight(8.7);
    	pokedex.put("Luvdisc", luvdisc);

    	Pokemon luxio = new Pokemon("Luxio");
    	luxio.setDexNumber(404);
    	luxio.setTypes("Electric", "(none)");
    	luxio.addAbilities("Rivalry", "Intimidate", "Guts");
    	luxio.setAllBaseStats(60, 85, 49, 60, 49, 60);
    	luxio.setWeight(30.5);
    	pokedex.put("Luxio", luxio);

    	Pokemon luxray = new Pokemon("Luxray");
    	luxray.setDexNumber(405);
    	luxray.setTypes("Electric", "(none)");
    	luxray.addAbilities("Rivalry", "Intimidate", "Guts");
    	luxray.setAllBaseStats(80, 120, 79, 95, 79, 70);
    	luxray.setWeight(42.0);
    	pokedex.put("Luxray", luxray);

    	Pokemon lycanroc = new Pokemon("Lycanroc");
    	lycanroc.setDexNumber(745);
    	lycanroc.setTypes("Rock", "(none)");
    	lycanroc.addAbilities("Keen Eye", "Sand Rush", "Steadfast");
    	lycanroc.setAllBaseStats(75, 115, 65, 55, 65, 112);
    	lycanroc.setWeight(25.0);
    	pokedex.put("Lycanroc", lycanroc);

    	Pokemon lycanrocdusk = new Pokemon("Lycanroc-Dusk");
    	lycanrocdusk.setDexNumber(745);
    	lycanrocdusk.setTypes("Rock", "(none)");
    	lycanrocdusk.addAbilities("Tough Claws");
    	lycanrocdusk.setAllBaseStats(75, 117, 65, 55, 65, 110);
    	lycanrocdusk.setWeight(25.0);
    	pokedex.put("Lycanroc-Dusk", lycanrocdusk);

    	Pokemon lycanrocmidnight = new Pokemon("Lycanroc-Midnight");
    	lycanrocmidnight.setDexNumber(745);
    	lycanrocmidnight.setTypes("Rock", "(none)");
    	lycanrocmidnight.addAbilities("Keen Eye", "Vital Spirit", "No Guard");
    	lycanrocmidnight.setAllBaseStats(85, 115, 75, 55, 75, 82);
    	lycanrocmidnight.setWeight(25.0);
    	pokedex.put("Lycanroc-Midnight", lycanrocmidnight);

    	Pokemon machamp = new Pokemon("Machamp");
    	machamp.setDexNumber(68);
    	machamp.setTypes("Fighting", "(none)");
    	machamp.addAbilities("Guts", "No Guard", "Steadfast");
    	machamp.setAllBaseStats(90, 130, 80, 65, 85, 55);
    	machamp.setWeight(130.0);
    	pokedex.put("Machamp", machamp);

    	Pokemon machoke = new Pokemon("Machoke");
    	machoke.setDexNumber(67);
    	machoke.setTypes("Fighting", "(none)");
    	machoke.addAbilities("Guts", "No Guard", "Steadfast");
    	machoke.setAllBaseStats(80, 100, 70, 50, 60, 45);
    	machoke.setWeight(70.5);
    	pokedex.put("Machoke", machoke);

    	Pokemon machop = new Pokemon("Machop");
    	machop.setDexNumber(66);
    	machop.setTypes("Fighting", "(none)");
    	machop.addAbilities("Guts", "No Guard", "Steadfast");
    	machop.setAllBaseStats(70, 80, 50, 35, 35, 35);
    	machop.setWeight(19.5);
    	pokedex.put("Machop", machop);

    	Pokemon magby = new Pokemon("Magby");
    	magby.setDexNumber(240);
    	magby.setTypes("Fire", "(none)");
    	magby.addAbilities("Flame Body", "Vital Spirit");
    	magby.setAllBaseStats(45, 75, 37, 70, 55, 83);
    	magby.setWeight(21.4);
    	pokedex.put("Magby", magby);

    	Pokemon magcargo = new Pokemon("Magcargo");
    	magcargo.setDexNumber(219);
    	magcargo.setTypes("Fire", "Rock");
    	magcargo.addAbilities("Magma Armor", "Flame Body", "Weak Armor");
    	magcargo.setAllBaseStats(60, 50, 120, 90, 80, 30);
    	magcargo.setWeight(55.0);
    	pokedex.put("Magcargo", magcargo);

    	Pokemon magearna = new Pokemon("Magearna");
    	magearna.setDexNumber(801);
    	magearna.setTypes("Steel", "Fairy");
    	magearna.addAbilities("Soul-Heart");
    	magearna.setAllBaseStats(80, 95, 115, 130, 115, 65);
    	magearna.setWeight(80.5);
    	pokedex.put("Magearna", magearna);

    	Pokemon magearnaoriginal = new Pokemon("Magearna-Original");
    	magearnaoriginal.setDexNumber(801);
    	magearnaoriginal.setTypes("Steel", "Fairy");
    	magearnaoriginal.addAbilities("Soul-Heart");
    	magearnaoriginal.setAllBaseStats(80, 95, 115, 130, 115, 65);
    	magearnaoriginal.setWeight(80.5);
    	pokedex.put("Magearna-Original", magearnaoriginal);

    	Pokemon magikarp = new Pokemon("Magikarp");
    	magikarp.setDexNumber(129);
    	magikarp.setTypes("Water", "(none)");
    	magikarp.addAbilities("Swift Swim", "Rattled");
    	magikarp.setAllBaseStats(20, 10, 55, 15, 20, 80);
    	magikarp.setWeight(10.0);
    	pokedex.put("Magikarp", magikarp);

    	Pokemon magmar = new Pokemon("Magmar");
    	magmar.setDexNumber(126);
    	magmar.setTypes("Fire", "(none)");
    	magmar.addAbilities("Flame Body", "Vital Spirit");
    	magmar.setAllBaseStats(65, 95, 57, 100, 85, 93);
    	magmar.setWeight(44.5);
    	pokedex.put("Magmar", magmar);

    	Pokemon magmortar = new Pokemon("Magmortar");
    	magmortar.setDexNumber(467);
    	magmortar.setTypes("Fire", "(none)");
    	magmortar.addAbilities("Flame Body", "Vital Spirit");
    	magmortar.setAllBaseStats(75, 95, 67, 125, 95, 83);
    	magmortar.setWeight(68.0);
    	pokedex.put("Magmortar", magmortar);

    	Pokemon magnemite = new Pokemon("Magnemite");
    	magnemite.setDexNumber(81);
    	magnemite.setTypes("Electric", "Steel");
    	magnemite.addAbilities("Magnet Pull", "Sturdy", "Analytic");
    	magnemite.setAllBaseStats(25, 35, 70, 95, 55, 45);
    	magnemite.setWeight(6.0);
    	pokedex.put("Magnemite", magnemite);

    	Pokemon magneton = new Pokemon("Magneton");
    	magneton.setDexNumber(82);
    	magneton.setTypes("Electric", "Steel");
    	magneton.addAbilities("Magnet Pull", "Sturdy", "Analytic");
    	magneton.setAllBaseStats(50, 60, 95, 120, 70, 70);
    	magneton.setWeight(60.0);
    	pokedex.put("Magneton", magneton);

    	Pokemon magnezone = new Pokemon("Magnezone");
    	magnezone.setDexNumber(462);
    	magnezone.setTypes("Electric", "Steel");
    	magnezone.addAbilities("Magnet Pull", "Sturdy", "Analytic");
    	magnezone.setAllBaseStats(70, 70, 115, 130, 90, 60);
    	magnezone.setWeight(180.0);
    	pokedex.put("Magnezone", magnezone);

    	Pokemon makuhita = new Pokemon("Makuhita");
    	makuhita.setDexNumber(296);
    	makuhita.setTypes("Fighting", "(none)");
    	makuhita.addAbilities("Thick Fat", "Guts", "Sheer Force");
    	makuhita.setAllBaseStats(72, 60, 30, 20, 30, 25);
    	makuhita.setWeight(86.4);
    	pokedex.put("Makuhita", makuhita);

    	Pokemon malaconda = new Pokemon("Malaconda");
    	malaconda.setDexNumber(-5);
    	malaconda.setTypes("Dark", "Grass");
    	malaconda.addAbilities("Harvest", "Infiltrator", "Drought");
    	malaconda.setAllBaseStats(115, 100, 60, 40, 130, 55);
    	malaconda.setWeight(108.8);
    	pokedex.put("Malaconda", malaconda);

    	Pokemon malamar = new Pokemon("Malamar");
    	malamar.setDexNumber(687);
    	malamar.setTypes("Dark", "Psychic");
    	malamar.addAbilities("Contrary", "Suction Cups", "Infiltrator");
    	malamar.setAllBaseStats(86, 92, 88, 68, 75, 73);
    	malamar.setWeight(47.0);
    	pokedex.put("Malamar", malamar);

    	Pokemon mamoswine = new Pokemon("Mamoswine");
    	mamoswine.setDexNumber(473);
    	mamoswine.setTypes("Ice", "Ground");
    	mamoswine.addAbilities("Oblivious", "Snow Cloak", "Thick Fat");
    	mamoswine.setAllBaseStats(110, 130, 80, 70, 60, 80);
    	mamoswine.setWeight(291.0);
    	pokedex.put("Mamoswine", mamoswine);

    	Pokemon manaphy = new Pokemon("Manaphy");
    	manaphy.setDexNumber(490);
    	manaphy.setTypes("Water", "(none)");
    	manaphy.addAbilities("Hydration");
    	manaphy.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	manaphy.setWeight(1.4);
    	pokedex.put("Manaphy", manaphy);

    	Pokemon mandibuzz = new Pokemon("Mandibuzz");
    	mandibuzz.setDexNumber(630);
    	mandibuzz.setTypes("Dark", "Flying");
    	mandibuzz.addAbilities("Big Pecks", "Overcoat", "Weak Armor");
    	mandibuzz.setAllBaseStats(110, 65, 105, 55, 95, 80);
    	mandibuzz.setWeight(39.5);
    	pokedex.put("Mandibuzz", mandibuzz);

    	Pokemon manectric = new Pokemon("Manectric");
    	manectric.setDexNumber(310);
    	manectric.setTypes("Electric", "(none)");
    	manectric.addAbilities("Static", "Lightning Rod", "Minus");
    	manectric.setAllBaseStats(70, 75, 60, 105, 60, 105);
    	manectric.setWeight(40.2);
    	manectric.setFormes("Manectric", "Manectric-Mega");
    	pokedex.put("Manectric", manectric);

    	Pokemon manectricmega = new Pokemon("Manectric-Mega");
    	manectricmega.setDexNumber(310);
    	manectricmega.setTypes("Electric", "(none)");
    	manectricmega.addAbilities("Intimidate");
    	manectricmega.setAllBaseStats(70, 75, 80, 135, 80, 135);
    	manectricmega.setWeight(44.0);
    	pokedex.put("Manectric-Mega", manectricmega);

    	Pokemon mankey = new Pokemon("Mankey");
    	mankey.setDexNumber(56);
    	mankey.setTypes("Fighting", "(none)");
    	mankey.addAbilities("Vital Spirit", "Anger Point", "Defiant");
    	mankey.setAllBaseStats(40, 80, 35, 35, 45, 70);
    	mankey.setWeight(28.0);
    	pokedex.put("Mankey", mankey);

    	Pokemon mantine = new Pokemon("Mantine");
    	mantine.setDexNumber(226);
    	mantine.setTypes("Water", "Flying");
    	mantine.addAbilities("Swift Swim", "Water Absorb", "Water Veil");
    	mantine.setAllBaseStats(85, 40, 70, 80, 140, 70);
    	mantine.setWeight(220.0);
    	pokedex.put("Mantine", mantine);

    	Pokemon mantyke = new Pokemon("Mantyke");
    	mantyke.setDexNumber(458);
    	mantyke.setTypes("Water", "Flying");
    	mantyke.addAbilities("Swift Swim", "Water Absorb", "Water Veil");
    	mantyke.setAllBaseStats(45, 20, 50, 60, 120, 50);
    	mantyke.setWeight(65.0);
    	pokedex.put("Mantyke", mantyke);

    	Pokemon maractus = new Pokemon("Maractus");
    	maractus.setDexNumber(556);
    	maractus.setTypes("Grass", "(none)");
    	maractus.addAbilities("Water Absorb", "Chlorophyll", "Storm Drain");
    	maractus.setAllBaseStats(75, 86, 67, 106, 67, 60);
    	maractus.setWeight(28.0);
    	pokedex.put("Maractus", maractus);
    }
    public void initSecondHalf()
    {
    	Pokemon mareanie = new Pokemon("Mareanie");
    	mareanie.setDexNumber(747);
    	mareanie.setTypes("Poison", "Water");
    	mareanie.addAbilities("Merciless", "Limber", "Regenerator");
    	mareanie.setAllBaseStats(50, 53, 62, 43, 52, 45);
    	mareanie.setWeight(8.0);
    	pokedex.put("Mareanie", mareanie);

    	Pokemon mareep = new Pokemon("Mareep");
    	mareep.setDexNumber(179);
    	mareep.setTypes("Electric", "(none)");
    	mareep.addAbilities("Static", "Plus");
    	mareep.setAllBaseStats(55, 40, 40, 65, 45, 35);
    	mareep.setWeight(7.8);
    	pokedex.put("Mareep", mareep);

    	Pokemon marill = new Pokemon("Marill");
    	marill.setDexNumber(183);
    	marill.setTypes("Water", "Fairy");
    	marill.addAbilities("Thick Fat", "Huge Power", "Sap Sipper");
    	marill.setAllBaseStats(70, 20, 50, 20, 50, 40);
    	marill.setWeight(8.5);
    	pokedex.put("Marill", marill);

    	Pokemon marowak = new Pokemon("Marowak");
    	marowak.setDexNumber(105);
    	marowak.setTypes("Ground", "(none)");
    	marowak.addAbilities("Rock Head", "Lightning Rod", "Battle Armor");
    	marowak.setAllBaseStats(60, 80, 110, 50, 80, 45);
    	marowak.setWeight(45.0);
    	pokedex.put("Marowak", marowak);

    	Pokemon marowakalola = new Pokemon("Marowak-Alola");
    	marowakalola.setDexNumber(105);
    	marowakalola.setTypes("Fire", "Ghost");
    	marowakalola.addAbilities("Cursed Body", "Lightning Rod", "Rock Head");
    	marowakalola.setAllBaseStats(60, 80, 110, 50, 80, 45);
    	marowakalola.setWeight(34.0);
    	pokedex.put("Marowak-Alola", marowakalola);

    	Pokemon marowakalolatotem = new Pokemon("Marowak-Alola-Totem");
    	marowakalolatotem.setDexNumber(105);
    	marowakalolatotem.setTypes("Fire", "Ghost");
    	marowakalolatotem.addAbilities("Rock Head");
    	marowakalolatotem.setAllBaseStats(60, 80, 110, 50, 80, 45);
    	marowakalolatotem.setWeight(98.0);
    	pokedex.put("Marowak-Alola-Totem", marowakalolatotem);

    	Pokemon marshadow = new Pokemon("Marshadow");
    	marshadow.setDexNumber(802);
    	marshadow.setTypes("Fighting", "Ghost");
    	marshadow.addAbilities("Technician");
    	marshadow.setAllBaseStats(90, 125, 80, 90, 90, 125);
    	marshadow.setWeight(22.2);
    	pokedex.put("Marshadow", marshadow);

    	Pokemon marshtomp = new Pokemon("Marshtomp");
    	marshtomp.setDexNumber(259);
    	marshtomp.setTypes("Water", "Ground");
    	marshtomp.addAbilities("Torrent", "Damp");
    	marshtomp.setAllBaseStats(70, 85, 70, 60, 70, 50);
    	marshtomp.setWeight(28.0);
    	pokedex.put("Marshtomp", marshtomp);

    	Pokemon masquerain = new Pokemon("Masquerain");
    	masquerain.setDexNumber(284);
    	masquerain.setTypes("Bug", "Flying");
    	masquerain.addAbilities("Intimidate", "Unnerve");
    	masquerain.setAllBaseStats(70, 60, 62, 100, 82, 80);
    	masquerain.setWeight(3.6);
    	pokedex.put("Masquerain", masquerain);

    	Pokemon mawile = new Pokemon("Mawile");
    	mawile.setDexNumber(303);
    	mawile.setTypes("Steel", "Fairy");
    	mawile.addAbilities("Hyper Cutter", "Intimidate", "Sheer Force");
    	mawile.setAllBaseStats(50, 85, 85, 55, 55, 50);
    	mawile.setWeight(11.5);
    	mawile.setFormes("Mawile", "Mawile-Mega");
    	pokedex.put("Mawile", mawile);

    	Pokemon mawilemega = new Pokemon("Mawile-Mega");
    	mawilemega.setDexNumber(303);
    	mawilemega.setTypes("Steel", "Fairy");
    	mawilemega.addAbilities("Huge Power");
    	mawilemega.setAllBaseStats(50, 105, 125, 55, 95, 50);
    	mawilemega.setWeight(23.5);
    	pokedex.put("Mawile-Mega", mawilemega);

    	Pokemon medicham = new Pokemon("Medicham");
    	medicham.setDexNumber(308);
    	medicham.setTypes("Fighting", "Psychic");
    	medicham.addAbilities("Pure Power", "Telepathy");
    	medicham.setAllBaseStats(60, 60, 75, 60, 75, 80);
    	medicham.setWeight(31.5);
    	medicham.setFormes("Medicham", "Medicham-Mega");
    	pokedex.put("Medicham", medicham);

    	Pokemon medichammega = new Pokemon("Medicham-Mega");
    	medichammega.setDexNumber(308);
    	medichammega.setTypes("Fighting", "Psychic");
    	medichammega.addAbilities("Pure Power");
    	medichammega.setAllBaseStats(60, 100, 85, 80, 85, 100);
    	medichammega.setWeight(31.5);
    	pokedex.put("Medicham-Mega", medichammega);

    	Pokemon meditite = new Pokemon("Meditite");
    	meditite.setDexNumber(307);
    	meditite.setTypes("Fighting", "Psychic");
    	meditite.addAbilities("Pure Power", "Telepathy");
    	meditite.setAllBaseStats(30, 40, 55, 40, 55, 60);
    	meditite.setWeight(11.2);
    	pokedex.put("Meditite", meditite);

    	Pokemon meganium = new Pokemon("Meganium");
    	meganium.setDexNumber(154);
    	meganium.setTypes("Grass", "(none)");
    	meganium.addAbilities("Overgrow", "Leaf Guard");
    	meganium.setAllBaseStats(80, 82, 100, 83, 100, 80);
    	meganium.setWeight(100.5);
    	pokedex.put("Meganium", meganium);

    	Pokemon meloetta = new Pokemon("Meloetta");
    	meloetta.setDexNumber(648);
    	meloetta.setTypes("Normal", "Psychic");
    	meloetta.addAbilities("Serene Grace");
    	meloetta.setAllBaseStats(100, 77, 77, 128, 128, 90);
    	meloetta.setWeight(6.5);
    	meloetta.setFormes("Meloetta", "Meloetta-Pirouette");
    	pokedex.put("Meloetta", meloetta);

    	Pokemon meloettapirouette = new Pokemon("Meloetta-Pirouette");
    	meloettapirouette.setDexNumber(648);
    	meloettapirouette.setTypes("Normal", "Fighting");
    	meloettapirouette.addAbilities("Serene Grace");
    	meloettapirouette.setAllBaseStats(100, 128, 90, 77, 77, 128);
    	meloettapirouette.setWeight(6.5);
    	pokedex.put("Meloetta-Pirouette", meloettapirouette);

    	Pokemon meowstic = new Pokemon("Meowstic");
    	meowstic.setDexNumber(678);
    	meowstic.setTypes("Psychic", "(none)");
    	meowstic.addAbilities("Keen Eye", "Infiltrator", "Prankster");
    	meowstic.setAllBaseStats(74, 48, 76, 83, 81, 104);
    	meowstic.setWeight(8.5);
    	pokedex.put("Meowstic", meowstic);

    	Pokemon meowsticf = new Pokemon("Meowstic-F");
    	meowsticf.setDexNumber(678);
    	meowsticf.setTypes("Psychic", "(none)");
    	meowsticf.addAbilities("Keen Eye", "Infiltrator", "Competitive");
    	meowsticf.setAllBaseStats(74, 48, 76, 83, 81, 104);
    	meowsticf.setWeight(8.5);
    	pokedex.put("Meowstic-F", meowsticf);

    	Pokemon meowth = new Pokemon("Meowth");
    	meowth.setDexNumber(52);
    	meowth.setTypes("Normal", "(none)");
    	meowth.addAbilities("Pickup", "Technician", "Unnerve");
    	meowth.setAllBaseStats(40, 45, 35, 40, 40, 90);
    	meowth.setWeight(4.2);
    	pokedex.put("Meowth", meowth);

    	Pokemon meowthalola = new Pokemon("Meowth-Alola");
    	meowthalola.setDexNumber(52);
    	meowthalola.setTypes("Dark", "(none)");
    	meowthalola.addAbilities("Pickup", "Technician", "Rattled");
    	meowthalola.setAllBaseStats(40, 35, 35, 50, 40, 90);
    	meowthalola.setWeight(4.2);
    	pokedex.put("Meowth-Alola", meowthalola);

    	Pokemon mesprit = new Pokemon("Mesprit");
    	mesprit.setDexNumber(481);
    	mesprit.setTypes("Psychic", "(none)");
    	mesprit.addAbilities("Levitate");
    	mesprit.setAllBaseStats(80, 105, 105, 105, 105, 80);
    	mesprit.setWeight(0.3);
    	pokedex.put("Mesprit", mesprit);

    	Pokemon metagross = new Pokemon("Metagross");
    	metagross.setDexNumber(376);
    	metagross.setTypes("Steel", "Psychic");
    	metagross.addAbilities("Clear Body", "Light Metal");
    	metagross.setAllBaseStats(80, 135, 130, 95, 90, 70);
    	metagross.setWeight(550.0);
    	metagross.setFormes("Metagross", "Metagross-Mega");
    	pokedex.put("Metagross", metagross);

    	Pokemon metagrossmega = new Pokemon("Metagross-Mega");
    	metagrossmega.setDexNumber(376);
    	metagrossmega.setTypes("Steel", "Psychic");
    	metagrossmega.addAbilities("Tough Claws");
    	metagrossmega.setAllBaseStats(80, 145, 150, 105, 110, 110);
    	metagrossmega.setWeight(942.9);
    	pokedex.put("Metagross-Mega", metagrossmega);

    	Pokemon metang = new Pokemon("Metang");
    	metang.setDexNumber(375);
    	metang.setTypes("Steel", "Psychic");
    	metang.addAbilities("Clear Body", "Light Metal");
    	metang.setAllBaseStats(60, 75, 100, 55, 80, 50);
    	metang.setWeight(202.5);
    	pokedex.put("Metang", metang);

    	Pokemon metapod = new Pokemon("Metapod");
    	metapod.setDexNumber(11);
    	metapod.setTypes("Bug", "(none)");
    	metapod.addAbilities("Shed Skin");
    	metapod.setAllBaseStats(50, 20, 55, 25, 25, 30);
    	metapod.setWeight(9.9);
    	pokedex.put("Metapod", metapod);

    	Pokemon mew = new Pokemon("Mew");
    	mew.setDexNumber(151);
    	mew.setTypes("Psychic", "(none)");
    	mew.addAbilities("Synchronize");
    	mew.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	mew.setWeight(4.0);
    	pokedex.put("Mew", mew);

    	Pokemon mewtwo = new Pokemon("Mewtwo");
    	mewtwo.setDexNumber(150);
    	mewtwo.setTypes("Psychic", "(none)");
    	mewtwo.addAbilities("Pressure", "Unnerve");
    	mewtwo.setAllBaseStats(106, 110, 90, 154, 90, 130);
    	mewtwo.setWeight(122.0);
    	mewtwo.setFormes("Mewtwo", "Mewtwo-Mega-X", "Mewtwo-Mega-Y");
    	pokedex.put("Mewtwo", mewtwo);

    	Pokemon mewtwomegax = new Pokemon("Mewtwo-Mega-X");
    	mewtwomegax.setDexNumber(150);
    	mewtwomegax.setTypes("Psychic", "Fighting");
    	mewtwomegax.addAbilities("Steadfast");
    	mewtwomegax.setAllBaseStats(106, 190, 100, 154, 100, 130);
    	mewtwomegax.setWeight(127.0);
    	pokedex.put("Mewtwo-Mega-X", mewtwomegax);

    	Pokemon mewtwomegay = new Pokemon("Mewtwo-Mega-Y");
    	mewtwomegay.setDexNumber(150);
    	mewtwomegay.setTypes("Psychic", "(none)");
    	mewtwomegay.addAbilities("Insomnia");
    	mewtwomegay.setAllBaseStats(106, 150, 70, 194, 120, 140);
    	mewtwomegay.setWeight(33.0);
    	pokedex.put("Mewtwo-Mega-Y", mewtwomegay);

    	Pokemon mienfoo = new Pokemon("Mienfoo");
    	mienfoo.setDexNumber(619);
    	mienfoo.setTypes("Fighting", "(none)");
    	mienfoo.addAbilities("Inner Focus", "Regenerator", "Reckless");
    	mienfoo.setAllBaseStats(45, 85, 50, 55, 50, 65);
    	mienfoo.setWeight(20.0);
    	pokedex.put("Mienfoo", mienfoo);

    	Pokemon mienshao = new Pokemon("Mienshao");
    	mienshao.setDexNumber(620);
    	mienshao.setTypes("Fighting", "(none)");
    	mienshao.addAbilities("Inner Focus", "Regenerator", "Reckless");
    	mienshao.setAllBaseStats(65, 125, 60, 95, 60, 105);
    	mienshao.setWeight(35.5);
    	pokedex.put("Mienshao", mienshao);

    	Pokemon mightyena = new Pokemon("Mightyena");
    	mightyena.setDexNumber(262);
    	mightyena.setTypes("Dark", "(none)");
    	mightyena.addAbilities("Intimidate", "Quick Feet", "Moxie");
    	mightyena.setAllBaseStats(70, 90, 70, 60, 60, 70);
    	mightyena.setWeight(37.0);
    	pokedex.put("Mightyena", mightyena);

    	Pokemon milotic = new Pokemon("Milotic");
    	milotic.setDexNumber(350);
    	milotic.setTypes("Water", "(none)");
    	milotic.addAbilities("Marvel Scale", "Competitive", "Cute Charm");
    	milotic.setAllBaseStats(95, 60, 79, 100, 125, 81);
    	milotic.setWeight(162.0);
    	pokedex.put("Milotic", milotic);

    	Pokemon miltank = new Pokemon("Miltank");
    	miltank.setDexNumber(241);
    	miltank.setTypes("Normal", "(none)");
    	miltank.addAbilities("Thick Fat", "Scrappy", "Sap Sipper");
    	miltank.setAllBaseStats(95, 80, 105, 40, 70, 100);
    	miltank.setWeight(75.5);
    	pokedex.put("Miltank", miltank);

    	Pokemon mimejr = new Pokemon("Mime Jr.");
    	mimejr.setDexNumber(439);
    	mimejr.setTypes("Psychic", "Fairy");
    	mimejr.addAbilities("Soundproof", "Filter", "Technician");
    	mimejr.setAllBaseStats(20, 25, 45, 70, 90, 60);
    	mimejr.setWeight(13.0);
    	pokedex.put("Mime Jr.", mimejr);

    	Pokemon mimikyu = new Pokemon("Mimikyu");
    	mimikyu.setDexNumber(778);
    	mimikyu.setTypes("Ghost", "Fairy");
    	mimikyu.addAbilities("Disguise");
    	mimikyu.setAllBaseStats(55, 90, 80, 50, 105, 96);
    	mimikyu.setWeight(0.7);
    	pokedex.put("Mimikyu", mimikyu);

    	Pokemon mimikyubusted = new Pokemon("Mimikyu-Busted");
    	mimikyubusted.setDexNumber(778);
    	mimikyubusted.setTypes("Ghost", "Fairy");
    	mimikyubusted.addAbilities("Disguise");
    	mimikyubusted.setAllBaseStats(55, 90, 80, 50, 105, 96);
    	mimikyubusted.setWeight(0.7);
    	pokedex.put("Mimikyu-Busted", mimikyubusted);

    	Pokemon mimikyubustedtotem = new Pokemon("Mimikyu-Busted-Totem");
    	mimikyubustedtotem.setDexNumber(778);
    	mimikyubustedtotem.setTypes("Ghost", "Fairy");
    	mimikyubustedtotem.addAbilities("Disguise");
    	mimikyubustedtotem.setAllBaseStats(55, 90, 80, 50, 105, 96);
    	mimikyubustedtotem.setWeight(2.8);
    	pokedex.put("Mimikyu-Busted-Totem", mimikyubustedtotem);

    	Pokemon mimikyutotem = new Pokemon("Mimikyu-Totem");
    	mimikyutotem.setDexNumber(778);
    	mimikyutotem.setTypes("Ghost", "Fairy");
    	mimikyutotem.addAbilities("Disguise");
    	mimikyutotem.setAllBaseStats(55, 90, 80, 50, 105, 96);
    	mimikyutotem.setWeight(2.8);
    	pokedex.put("Mimikyu-Totem", mimikyutotem);

    	Pokemon minccino = new Pokemon("Minccino");
    	minccino.setDexNumber(572);
    	minccino.setTypes("Normal", "(none)");
    	minccino.addAbilities("Cute Charm", "Technician", "Skill Link");
    	minccino.setAllBaseStats(55, 50, 40, 40, 40, 75);
    	minccino.setWeight(5.8);
    	pokedex.put("Minccino", minccino);

    	Pokemon minior = new Pokemon("Minior");
    	minior.setDexNumber(774);
    	minior.setTypes("Rock", "Flying");
    	minior.addAbilities("Shields Down");
    	minior.setAllBaseStats(60, 100, 60, 100, 60, 120);
    	minior.setWeight(0.3);
    	minior.setFormes("Minior", "Minior-Meteor");
    	pokedex.put("Minior", minior);

    	Pokemon miniormeteor = new Pokemon("Minior-Meteor");
    	miniormeteor.setDexNumber(774);
    	miniormeteor.setTypes("Rock", "Flying");
    	miniormeteor.addAbilities("Shields Down");
    	miniormeteor.setAllBaseStats(60, 60, 100, 60, 100, 60);
    	miniormeteor.setWeight(40.0);
    	pokedex.put("Minior-Meteor", miniormeteor);

    	Pokemon minun = new Pokemon("Minun");
    	minun.setDexNumber(312);
    	minun.setTypes("Electric", "(none)");
    	minun.addAbilities("Minus", "Volt Absorb");
    	minun.setAllBaseStats(60, 40, 50, 75, 85, 95);
    	minun.setWeight(4.2);
    	pokedex.put("Minun", minun);

    	Pokemon misdreavus = new Pokemon("Misdreavus");
    	misdreavus.setDexNumber(200);
    	misdreavus.setTypes("Ghost", "(none)");
    	misdreavus.addAbilities("Levitate");
    	misdreavus.setAllBaseStats(60, 60, 60, 85, 85, 85);
    	misdreavus.setWeight(1.0);
    	pokedex.put("Misdreavus", misdreavus);

    	Pokemon mismagius = new Pokemon("Mismagius");
    	mismagius.setDexNumber(429);
    	mismagius.setTypes("Ghost", "(none)");
    	mismagius.addAbilities("Levitate");
    	mismagius.setAllBaseStats(60, 60, 60, 105, 105, 105);
    	mismagius.setWeight(4.4);
    	pokedex.put("Mismagius", mismagius);

    	Pokemon missingno = new Pokemon("Missingno.");
    	missingno.setDexNumber(0);
    	missingno.setTypes("Bird", "Normal");
    	missingno.addAbilities("");
    	missingno.setAllBaseStats(33, 136, 0, 6, 6, 29);
    	missingno.setWeight(1590.8);
    	pokedex.put("Missingno.", missingno);

    	Pokemon mollux = new Pokemon("Mollux");
    	mollux.setDexNumber(-3);
    	mollux.setTypes("Fire", "Poison");
    	mollux.addAbilities("Dry Skin", "Illuminate");
    	mollux.setAllBaseStats(95, 45, 83, 131, 105, 76);
    	mollux.setWeight(41.0);
    	pokedex.put("Mollux", mollux);

    	Pokemon moltres = new Pokemon("Moltres");
    	moltres.setDexNumber(146);
    	moltres.setTypes("Fire", "Flying");
    	moltres.addAbilities("Pressure", "Flame Body");
    	moltres.setAllBaseStats(90, 100, 90, 125, 85, 90);
    	moltres.setWeight(60.0);
    	pokedex.put("Moltres", moltres);

    	Pokemon monferno = new Pokemon("Monferno");
    	monferno.setDexNumber(391);
    	monferno.setTypes("Fire", "Fighting");
    	monferno.addAbilities("Blaze", "Iron Fist");
    	monferno.setAllBaseStats(64, 78, 52, 78, 52, 81);
    	monferno.setWeight(22.0);
    	pokedex.put("Monferno", monferno);

    	Pokemon morelull = new Pokemon("Morelull");
    	morelull.setDexNumber(755);
    	morelull.setTypes("Grass", "Fairy");
    	morelull.addAbilities("Illuminate", "Effect Spore", "Rain Dish");
    	morelull.setAllBaseStats(40, 35, 55, 65, 75, 15);
    	morelull.setWeight(1.5);
    	pokedex.put("Morelull", morelull);

    	Pokemon mothim = new Pokemon("Mothim");
    	mothim.setDexNumber(414);
    	mothim.setTypes("Bug", "Flying");
    	mothim.addAbilities("Swarm", "Tinted Lens");
    	mothim.setAllBaseStats(70, 94, 50, 94, 50, 66);
    	mothim.setWeight(23.3);
    	pokedex.put("Mothim", mothim);

    	Pokemon mrmime = new Pokemon("Mr. Mime");
    	mrmime.setDexNumber(122);
    	mrmime.setTypes("Psychic", "Fairy");
    	mrmime.addAbilities("Soundproof", "Filter", "Technician");
    	mrmime.setAllBaseStats(40, 45, 65, 100, 120, 90);
    	mrmime.setWeight(54.5);
    	pokedex.put("Mr. Mime", mrmime);

    	Pokemon mudbray = new Pokemon("Mudbray");
    	mudbray.setDexNumber(749);
    	mudbray.setTypes("Ground", "(none)");
    	mudbray.addAbilities("Own Tempo", "Stamina", "Inner Focus");
    	mudbray.setAllBaseStats(70, 100, 70, 45, 55, 45);
    	mudbray.setWeight(110.0);
    	pokedex.put("Mudbray", mudbray);

    	Pokemon mudkip = new Pokemon("Mudkip");
    	mudkip.setDexNumber(258);
    	mudkip.setTypes("Water", "(none)");
    	mudkip.addAbilities("Torrent", "Damp");
    	mudkip.setAllBaseStats(50, 70, 50, 50, 50, 40);
    	mudkip.setWeight(7.6);
    	pokedex.put("Mudkip", mudkip);

    	Pokemon mudsdale = new Pokemon("Mudsdale");
    	mudsdale.setDexNumber(750);
    	mudsdale.setTypes("Ground", "(none)");
    	mudsdale.addAbilities("Own Tempo", "Stamina", "Inner Focus");
    	mudsdale.setAllBaseStats(100, 125, 100, 55, 85, 35);
    	mudsdale.setWeight(920.0);
    	pokedex.put("Mudsdale", mudsdale);

    	Pokemon muk = new Pokemon("Muk");
    	muk.setDexNumber(89);
    	muk.setTypes("Poison", "(none)");
    	muk.addAbilities("Stench", "Sticky Hold", "Poison Touch");
    	muk.setAllBaseStats(105, 105, 75, 65, 100, 50);
    	muk.setWeight(30.0);
    	pokedex.put("Muk", muk);

    	Pokemon mukalola = new Pokemon("Muk-Alola");
    	mukalola.setDexNumber(89);
    	mukalola.setTypes("Poison", "Dark");
    	mukalola.addAbilities("Poison Touch", "Gluttony", "Power of Alchemy");
    	mukalola.setAllBaseStats(105, 105, 75, 65, 100, 50);
    	mukalola.setWeight(52.0);
    	pokedex.put("Muk-Alola", mukalola);

    	Pokemon munchlax = new Pokemon("Munchlax");
    	munchlax.setDexNumber(446);
    	munchlax.setTypes("Normal", "(none)");
    	munchlax.addAbilities("Pickup", "Thick Fat", "Gluttony");
    	munchlax.setAllBaseStats(135, 85, 40, 40, 85, 5);
    	munchlax.setWeight(105.0);
    	pokedex.put("Munchlax", munchlax);

    	Pokemon munna = new Pokemon("Munna");
    	munna.setDexNumber(517);
    	munna.setTypes("Psychic", "(none)");
    	munna.addAbilities("Forewarn", "Synchronize", "Telepathy");
    	munna.setAllBaseStats(76, 25, 45, 67, 55, 24);
    	munna.setWeight(23.3);
    	pokedex.put("Munna", munna);

    	Pokemon murkrow = new Pokemon("Murkrow");
    	murkrow.setDexNumber(198);
    	murkrow.setTypes("Dark", "Flying");
    	murkrow.addAbilities("Insomnia", "Super Luck", "Prankster");
    	murkrow.setAllBaseStats(60, 85, 42, 85, 42, 91);
    	murkrow.setWeight(2.1);
    	pokedex.put("Murkrow", murkrow);

    	Pokemon musharna = new Pokemon("Musharna");
    	musharna.setDexNumber(518);
    	musharna.setTypes("Psychic", "(none)");
    	musharna.addAbilities("Forewarn", "Synchronize", "Telepathy");
    	musharna.setAllBaseStats(116, 55, 85, 107, 95, 29);
    	musharna.setWeight(60.5);
    	pokedex.put("Musharna", musharna);

    	Pokemon naganadel = new Pokemon("Naganadel");
    	naganadel.setDexNumber(804);
    	naganadel.setTypes("Poison", "Dragon");
    	naganadel.addAbilities("Beast Boost");
    	naganadel.setAllBaseStats(73, 73, 73, 127, 73, 121);
    	naganadel.setWeight(150.0);
    	pokedex.put("Naganadel", naganadel);

    	Pokemon natu = new Pokemon("Natu");
    	natu.setDexNumber(177);
    	natu.setTypes("Psychic", "Flying");
    	natu.addAbilities("Synchronize", "Early Bird", "Magic Bounce");
    	natu.setAllBaseStats(40, 50, 45, 70, 45, 70);
    	natu.setWeight(2.0);
    	pokedex.put("Natu", natu);

    	Pokemon naviathan = new Pokemon("Naviathan");
    	naviathan.setDexNumber(-9);
    	naviathan.setTypes("Water", "Steel");
    	naviathan.addAbilities("Guts", "Heatproof", "Light Metal");
    	naviathan.setAllBaseStats(103, 110, 90, 95, 65, 97);
    	naviathan.setWeight(510.0);
    	pokedex.put("Naviathan", naviathan);

    	Pokemon necrozma = new Pokemon("Necrozma");
    	necrozma.setDexNumber(800);
    	necrozma.setTypes("Psychic", "(none)");
    	necrozma.addAbilities("Prism Armor");
    	necrozma.setAllBaseStats(97, 107, 101, 127, 89, 79);
    	necrozma.setWeight(230.0);
    	pokedex.put("Necrozma", necrozma);

    	Pokemon necrozmadawnwings = new Pokemon("Necrozma-Dawn-Wings");
    	necrozmadawnwings.setDexNumber(800);
    	necrozmadawnwings.setTypes("Psychic", "Ghost");
    	necrozmadawnwings.addAbilities("Prism Armor");
    	necrozmadawnwings.setAllBaseStats(97, 113, 109, 157, 127, 77);
    	necrozmadawnwings.setWeight(350.0);
    	necrozmadawnwings.setFormes("Necrozma-Dawn-Wings", "Necrozma-Ultra");
    	pokedex.put("Necrozma-Dawn-Wings", necrozmadawnwings);

    	Pokemon necrozmaduskmane = new Pokemon("Necrozma-Dusk-Mane");
    	necrozmaduskmane.setDexNumber(800);
    	necrozmaduskmane.setTypes("Psychic", "Steel");
    	necrozmaduskmane.addAbilities("Prism Armor");
    	necrozmaduskmane.setAllBaseStats(97, 157, 127, 113, 109, 77);
    	necrozmaduskmane.setWeight(460.0);
    	necrozmaduskmane.setFormes("Necrozma-Dusk-Mane", "Necrozma-Ultra");
    	pokedex.put("Necrozma-Dusk-Mane", necrozmaduskmane);

    	Pokemon necrozmaultra = new Pokemon("Necrozma-Ultra");
    	necrozmaultra.setDexNumber(800);
    	necrozmaultra.setTypes("Psychic", "Dragon");
    	necrozmaultra.addAbilities("Neuroforce");
    	necrozmaultra.setAllBaseStats(97, 167, 97, 167, 97, 129);
    	necrozmaultra.setWeight(230.0);
    	pokedex.put("Necrozma-Ultra", necrozmaultra);

    	Pokemon necturine = new Pokemon("Necturine");
    	necturine.setDexNumber(-106);
    	necturine.setTypes("Grass", "Ghost");
    	necturine.addAbilities("Anticipation", "Telepathy");
    	necturine.setAllBaseStats(49, 55, 60, 50, 75, 51);
    	necturine.setWeight(1.8);
    	pokedex.put("Necturine", necturine);

    	Pokemon necturna = new Pokemon("Necturna");
    	necturna.setDexNumber(-2);
    	necturna.setTypes("Grass", "Ghost");
    	necturna.addAbilities("Forewarn", "Telepathy");
    	necturna.setAllBaseStats(64, 120, 100, 85, 120, 81);
    	necturna.setWeight(49.6);
    	pokedex.put("Necturna", necturna);

    	Pokemon nidoking = new Pokemon("Nidoking");
    	nidoking.setDexNumber(34);
    	nidoking.setTypes("Poison", "Ground");
    	nidoking.addAbilities("Poison Point", "Rivalry", "Sheer Force");
    	nidoking.setAllBaseStats(81, 102, 77, 85, 75, 85);
    	nidoking.setWeight(62.0);
    	pokedex.put("Nidoking", nidoking);

    	Pokemon nidoqueen = new Pokemon("Nidoqueen");
    	nidoqueen.setDexNumber(31);
    	nidoqueen.setTypes("Poison", "Ground");
    	nidoqueen.addAbilities("Poison Point", "Rivalry", "Sheer Force");
    	nidoqueen.setAllBaseStats(90, 92, 87, 75, 85, 76);
    	nidoqueen.setWeight(60.0);
    	pokedex.put("Nidoqueen", nidoqueen);

    	Pokemon nidoranf = new Pokemon("Nidoran-F");
    	nidoranf.setDexNumber(29);
    	nidoranf.setTypes("Poison", "(none)");
    	nidoranf.addAbilities("Poison Point", "Rivalry", "Hustle");
    	nidoranf.setAllBaseStats(55, 47, 52, 40, 40, 41);
    	nidoranf.setWeight(7.0);
    	pokedex.put("Nidoran-F", nidoranf);

    	Pokemon nidoranm = new Pokemon("Nidoran-M");
    	nidoranm.setDexNumber(32);
    	nidoranm.setTypes("Poison", "(none)");
    	nidoranm.addAbilities("Poison Point", "Rivalry", "Hustle");
    	nidoranm.setAllBaseStats(46, 57, 40, 40, 40, 50);
    	nidoranm.setWeight(9.0);
    	pokedex.put("Nidoran-M", nidoranm);

    	Pokemon nidorina = new Pokemon("Nidorina");
    	nidorina.setDexNumber(30);
    	nidorina.setTypes("Poison", "(none)");
    	nidorina.addAbilities("Poison Point", "Rivalry", "Hustle");
    	nidorina.setAllBaseStats(70, 62, 67, 55, 55, 56);
    	nidorina.setWeight(20.0);
    	pokedex.put("Nidorina", nidorina);

    	Pokemon nidorino = new Pokemon("Nidorino");
    	nidorino.setDexNumber(33);
    	nidorino.setTypes("Poison", "(none)");
    	nidorino.addAbilities("Poison Point", "Rivalry", "Hustle");
    	nidorino.setAllBaseStats(61, 72, 57, 55, 55, 65);
    	nidorino.setWeight(19.5);
    	pokedex.put("Nidorino", nidorino);

    	Pokemon nihilego = new Pokemon("Nihilego");
    	nihilego.setDexNumber(793);
    	nihilego.setTypes("Rock", "Poison");
    	nihilego.addAbilities("Beast Boost");
    	nihilego.setAllBaseStats(109, 53, 47, 127, 131, 103);
    	nihilego.setWeight(55.5);
    	pokedex.put("Nihilego", nihilego);

    	Pokemon nincada = new Pokemon("Nincada");
    	nincada.setDexNumber(290);
    	nincada.setTypes("Bug", "Ground");
    	nincada.addAbilities("Compound Eyes", "Run Away");
    	nincada.setAllBaseStats(31, 45, 90, 30, 30, 40);
    	nincada.setWeight(5.5);
    	pokedex.put("Nincada", nincada);

    	Pokemon ninetales = new Pokemon("Ninetales");
    	ninetales.setDexNumber(38);
    	ninetales.setTypes("Fire", "(none)");
    	ninetales.addAbilities("Flash Fire", "Drought");
    	ninetales.setAllBaseStats(73, 76, 75, 81, 100, 100);
    	ninetales.setWeight(19.9);
    	pokedex.put("Ninetales", ninetales);

    	Pokemon ninetalesalola = new Pokemon("Ninetales-Alola");
    	ninetalesalola.setDexNumber(38);
    	ninetalesalola.setTypes("Ice", "Fairy");
    	ninetalesalola.addAbilities("Snow Cloak", "Snow Warning");
    	ninetalesalola.setAllBaseStats(73, 67, 75, 81, 100, 109);
    	ninetalesalola.setWeight(19.9);
    	pokedex.put("Ninetales-Alola", ninetalesalola);

    	Pokemon ninjask = new Pokemon("Ninjask");
    	ninjask.setDexNumber(291);
    	ninjask.setTypes("Bug", "Flying");
    	ninjask.addAbilities("Speed Boost", "Infiltrator");
    	ninjask.setAllBaseStats(61, 90, 45, 50, 50, 160);
    	ninjask.setWeight(12.0);
    	pokedex.put("Ninjask", ninjask);

    	Pokemon noctowl = new Pokemon("Noctowl");
    	noctowl.setDexNumber(164);
    	noctowl.setTypes("Normal", "Flying");
    	noctowl.addAbilities("Insomnia", "Keen Eye", "Tinted Lens");
    	noctowl.setAllBaseStats(100, 50, 50, 86, 96, 70);
    	noctowl.setWeight(40.8);
    	pokedex.put("Noctowl", noctowl);

    	Pokemon noibat = new Pokemon("Noibat");
    	noibat.setDexNumber(714);
    	noibat.setTypes("Flying", "Dragon");
    	noibat.addAbilities("Frisk", "Infiltrator", "Telepathy");
    	noibat.setAllBaseStats(40, 30, 35, 45, 40, 55);
    	noibat.setWeight(8.0);
    	pokedex.put("Noibat", noibat);

    	Pokemon noivern = new Pokemon("Noivern");
    	noivern.setDexNumber(715);
    	noivern.setTypes("Flying", "Dragon");
    	noivern.addAbilities("Frisk", "Infiltrator", "Telepathy");
    	noivern.setAllBaseStats(85, 70, 80, 97, 80, 123);
    	noivern.setWeight(85.0);
    	pokedex.put("Noivern", noivern);

    	Pokemon nosepass = new Pokemon("Nosepass");
    	nosepass.setDexNumber(299);
    	nosepass.setTypes("Rock", "(none)");
    	nosepass.addAbilities("Sturdy", "Magnet Pull", "Sand Force");
    	nosepass.setAllBaseStats(30, 45, 135, 45, 90, 30);
    	nosepass.setWeight(97.0);
    	pokedex.put("Nosepass", nosepass);

    	Pokemon numel = new Pokemon("Numel");
    	numel.setDexNumber(322);
    	numel.setTypes("Fire", "Ground");
    	numel.addAbilities("Oblivious", "Simple", "Own Tempo");
    	numel.setAllBaseStats(60, 60, 40, 65, 45, 35);
    	numel.setWeight(24.0);
    	pokedex.put("Numel", numel);

    	Pokemon nuzleaf = new Pokemon("Nuzleaf");
    	nuzleaf.setDexNumber(274);
    	nuzleaf.setTypes("Grass", "Dark");
    	nuzleaf.addAbilities("Chlorophyll", "Early Bird", "Pickpocket");
    	nuzleaf.setAllBaseStats(70, 70, 40, 60, 40, 60);
    	nuzleaf.setWeight(28.0);
    	pokedex.put("Nuzleaf", nuzleaf);

    	Pokemon octillery = new Pokemon("Octillery");
    	octillery.setDexNumber(224);
    	octillery.setTypes("Water", "(none)");
    	octillery.addAbilities("Suction Cups", "Sniper", "Moody");
    	octillery.setAllBaseStats(75, 105, 75, 105, 75, 45);
    	octillery.setWeight(28.5);
    	pokedex.put("Octillery", octillery);

    	Pokemon oddish = new Pokemon("Oddish");
    	oddish.setDexNumber(43);
    	oddish.setTypes("Grass", "Poison");
    	oddish.addAbilities("Chlorophyll", "Run Away");
    	oddish.setAllBaseStats(45, 50, 55, 75, 65, 30);
    	oddish.setWeight(5.4);
    	pokedex.put("Oddish", oddish);

    	Pokemon omanyte = new Pokemon("Omanyte");
    	omanyte.setDexNumber(138);
    	omanyte.setTypes("Rock", "Water");
    	omanyte.addAbilities("Swift Swim", "Shell Armor", "Weak Armor");
    	omanyte.setAllBaseStats(35, 40, 100, 90, 55, 35);
    	omanyte.setWeight(7.5);
    	pokedex.put("Omanyte", omanyte);

    	Pokemon omastar = new Pokemon("Omastar");
    	omastar.setDexNumber(139);
    	omastar.setTypes("Rock", "Water");
    	omastar.addAbilities("Swift Swim", "Shell Armor", "Weak Armor");
    	omastar.setAllBaseStats(70, 60, 125, 115, 70, 55);
    	omastar.setWeight(35.0);
    	pokedex.put("Omastar", omastar);

    	Pokemon onix = new Pokemon("Onix");
    	onix.setDexNumber(95);
    	onix.setTypes("Rock", "Ground");
    	onix.addAbilities("Rock Head", "Sturdy", "Weak Armor");
    	onix.setAllBaseStats(35, 45, 160, 30, 45, 70);
    	onix.setWeight(210.0);
    	pokedex.put("Onix", onix);

    	Pokemon oranguru = new Pokemon("Oranguru");
    	oranguru.setDexNumber(765);
    	oranguru.setTypes("Normal", "Psychic");
    	oranguru.addAbilities("Inner Focus", "Telepathy", "Symbiosis");
    	oranguru.setAllBaseStats(90, 60, 80, 90, 110, 60);
    	oranguru.setWeight(76.0);
    	pokedex.put("Oranguru", oranguru);

    	Pokemon oricorio = new Pokemon("Oricorio");
    	oricorio.setDexNumber(741);
    	oricorio.setTypes("Fire", "Flying");
    	oricorio.addAbilities("Dancer");
    	oricorio.setAllBaseStats(75, 70, 70, 98, 70, 93);
    	oricorio.setWeight(3.4);
    	pokedex.put("Oricorio", oricorio);

    	Pokemon oricoriopau = new Pokemon("Oricorio-Pa'u");
    	oricoriopau.setDexNumber(741);
    	oricoriopau.setTypes("Psychic", "Flying");
    	oricoriopau.addAbilities("Dancer");
    	oricoriopau.setAllBaseStats(75, 70, 70, 98, 70, 93);
    	oricoriopau.setWeight(3.4);
    	pokedex.put("Oricorio-Pa'u", oricoriopau);

    	Pokemon oricoriopompom = new Pokemon("Oricorio-Pom-Pom");
    	oricoriopompom.setDexNumber(741);
    	oricoriopompom.setTypes("Electric", "Flying");
    	oricoriopompom.addAbilities("Dancer");
    	oricoriopompom.setAllBaseStats(75, 70, 70, 98, 70, 93);
    	oricoriopompom.setWeight(3.4);
    	pokedex.put("Oricorio-Pom-Pom", oricoriopompom);

    	Pokemon oricoriosensu = new Pokemon("Oricorio-Sensu");
    	oricoriosensu.setDexNumber(741);
    	oricoriosensu.setTypes("Ghost", "Flying");
    	oricoriosensu.addAbilities("Dancer");
    	oricoriosensu.setAllBaseStats(75, 70, 70, 98, 70, 93);
    	oricoriosensu.setWeight(3.4);
    	pokedex.put("Oricorio-Sensu", oricoriosensu);

    	Pokemon oshawott = new Pokemon("Oshawott");
    	oshawott.setDexNumber(501);
    	oshawott.setTypes("Water", "(none)");
    	oshawott.addAbilities("Torrent", "Shell Armor");
    	oshawott.setAllBaseStats(55, 55, 45, 63, 45, 45);
    	oshawott.setWeight(5.9);
    	pokedex.put("Oshawott", oshawott);

    	Pokemon pachirisu = new Pokemon("Pachirisu");
    	pachirisu.setDexNumber(417);
    	pachirisu.setTypes("Electric", "(none)");
    	pachirisu.addAbilities("Run Away", "Pickup", "Volt Absorb");
    	pachirisu.setAllBaseStats(60, 45, 70, 45, 90, 95);
    	pachirisu.setWeight(3.9);
    	pokedex.put("Pachirisu", pachirisu);

    	Pokemon pajantom = new Pokemon("Pajantom");
    	pajantom.setDexNumber(-12);
    	pajantom.setTypes("Dragon", "Ghost");
    	pajantom.addAbilities("Comatose");
    	pajantom.setAllBaseStats(84, 133, 71, 51, 111, 101);
    	pajantom.setWeight(3.1);
    	pokedex.put("Pajantom", pajantom);

    	Pokemon palkia = new Pokemon("Palkia");
    	palkia.setDexNumber(484);
    	palkia.setTypes("Water", "Dragon");
    	palkia.addAbilities("Pressure", "Telepathy");
    	palkia.setAllBaseStats(90, 120, 100, 150, 120, 100);
    	palkia.setWeight(336.0);
    	pokedex.put("Palkia", palkia);

    	Pokemon palossand = new Pokemon("Palossand");
    	palossand.setDexNumber(770);
    	palossand.setTypes("Ghost", "Ground");
    	palossand.addAbilities("Water Compaction", "Sand Veil");
    	palossand.setAllBaseStats(85, 75, 110, 100, 75, 35);
    	palossand.setWeight(250.0);
    	pokedex.put("Palossand", palossand);

    	Pokemon palpitoad = new Pokemon("Palpitoad");
    	palpitoad.setDexNumber(536);
    	palpitoad.setTypes("Water", "Ground");
    	palpitoad.addAbilities("Swift Swim", "Hydration", "Water Absorb");
    	palpitoad.setAllBaseStats(75, 65, 55, 65, 55, 69);
    	palpitoad.setWeight(17.0);
    	pokedex.put("Palpitoad", palpitoad);

    	Pokemon pancham = new Pokemon("Pancham");
    	pancham.setDexNumber(674);
    	pancham.setTypes("Fighting", "(none)");
    	pancham.addAbilities("Iron Fist", "Mold Breaker", "Scrappy");
    	pancham.setAllBaseStats(67, 82, 62, 46, 48, 43);
    	pancham.setWeight(8.0);
    	pokedex.put("Pancham", pancham);

    	Pokemon pangoro = new Pokemon("Pangoro");
    	pangoro.setDexNumber(675);
    	pangoro.setTypes("Fighting", "Dark");
    	pangoro.addAbilities("Iron Fist", "Mold Breaker", "Scrappy");
    	pangoro.setAllBaseStats(95, 124, 78, 69, 71, 58);
    	pangoro.setWeight(136.0);
    	pokedex.put("Pangoro", pangoro);

    	Pokemon panpour = new Pokemon("Panpour");
    	panpour.setDexNumber(515);
    	panpour.setTypes("Water", "(none)");
    	panpour.addAbilities("Gluttony", "Torrent");
    	panpour.setAllBaseStats(50, 53, 48, 53, 48, 64);
    	panpour.setWeight(13.5);
    	pokedex.put("Panpour", panpour);

    	Pokemon pansage = new Pokemon("Pansage");
    	pansage.setDexNumber(511);
    	pansage.setTypes("Grass", "(none)");
    	pansage.addAbilities("Gluttony", "Overgrow");
    	pansage.setAllBaseStats(50, 53, 48, 53, 48, 64);
    	pansage.setWeight(10.5);
    	pokedex.put("Pansage", pansage);

    	Pokemon pansear = new Pokemon("Pansear");
    	pansear.setDexNumber(513);
    	pansear.setTypes("Fire", "(none)");
    	pansear.addAbilities("Gluttony", "Blaze");
    	pansear.setAllBaseStats(50, 53, 48, 53, 48, 64);
    	pansear.setWeight(11.0);
    	pokedex.put("Pansear", pansear);

    	Pokemon paras = new Pokemon("Paras");
    	paras.setDexNumber(46);
    	paras.setTypes("Bug", "Grass");
    	paras.addAbilities("Effect Spore", "Dry Skin", "Damp");
    	paras.setAllBaseStats(35, 70, 55, 45, 55, 25);
    	paras.setWeight(5.4);
    	pokedex.put("Paras", paras);

    	Pokemon parasect = new Pokemon("Parasect");
    	parasect.setDexNumber(47);
    	parasect.setTypes("Bug", "Grass");
    	parasect.addAbilities("Effect Spore", "Dry Skin", "Damp");
    	parasect.setAllBaseStats(60, 95, 80, 60, 80, 30);
    	parasect.setWeight(29.5);
    	pokedex.put("Parasect", parasect);

    	Pokemon passimian = new Pokemon("Passimian");
    	passimian.setDexNumber(766);
    	passimian.setTypes("Fighting", "(none)");
    	passimian.addAbilities("Receiver", "Defiant");
    	passimian.setAllBaseStats(100, 120, 90, 40, 60, 80);
    	passimian.setWeight(82.8);
    	pokedex.put("Passimian", passimian);

    	Pokemon patrat = new Pokemon("Patrat");
    	patrat.setDexNumber(504);
    	patrat.setTypes("Normal", "(none)");
    	patrat.addAbilities("Run Away", "Keen Eye", "Analytic");
    	patrat.setAllBaseStats(45, 55, 39, 35, 39, 42);
    	patrat.setWeight(11.6);
    	pokedex.put("Patrat", patrat);

    	Pokemon pawniard = new Pokemon("Pawniard");
    	pawniard.setDexNumber(624);
    	pawniard.setTypes("Dark", "Steel");
    	pawniard.addAbilities("Defiant", "Inner Focus", "Pressure");
    	pawniard.setAllBaseStats(45, 85, 70, 40, 40, 60);
    	pawniard.setWeight(10.2);
    	pokedex.put("Pawniard", pawniard);

    	Pokemon pelipper = new Pokemon("Pelipper");
    	pelipper.setDexNumber(279);
    	pelipper.setTypes("Water", "Flying");
    	pelipper.addAbilities("Keen Eye", "Drizzle", "Rain Dish");
    	pelipper.setAllBaseStats(60, 50, 100, 95, 70, 65);
    	pelipper.setWeight(28.0);
    	pokedex.put("Pelipper", pelipper);

    	Pokemon persian = new Pokemon("Persian");
    	persian.setDexNumber(53);
    	persian.setTypes("Normal", "(none)");
    	persian.addAbilities("Limber", "Technician", "Unnerve");
    	persian.setAllBaseStats(65, 70, 60, 65, 65, 115);
    	persian.setWeight(32.0);
    	pokedex.put("Persian", persian);

    	Pokemon persianalola = new Pokemon("Persian-Alola");
    	persianalola.setDexNumber(53);
    	persianalola.setTypes("Dark", "(none)");
    	persianalola.addAbilities("Fur Coat", "Technician", "Rattled");
    	persianalola.setAllBaseStats(65, 60, 60, 75, 65, 115);
    	persianalola.setWeight(33.0);
    	pokedex.put("Persian-Alola", persianalola);

    	Pokemon petilil = new Pokemon("Petilil");
    	petilil.setDexNumber(548);
    	petilil.setTypes("Grass", "(none)");
    	petilil.addAbilities("Chlorophyll", "Own Tempo", "Leaf Guard");
    	petilil.setAllBaseStats(45, 35, 50, 70, 50, 30);
    	petilil.setWeight(6.6);
    	pokedex.put("Petilil", petilil);

    	Pokemon phanpy = new Pokemon("Phanpy");
    	phanpy.setDexNumber(231);
    	phanpy.setTypes("Ground", "(none)");
    	phanpy.addAbilities("Pickup", "Sand Veil");
    	phanpy.setAllBaseStats(90, 60, 60, 40, 40, 40);
    	phanpy.setWeight(33.5);
    	pokedex.put("Phanpy", phanpy);

    	Pokemon phantump = new Pokemon("Phantump");
    	phantump.setDexNumber(708);
    	phantump.setTypes("Ghost", "Grass");
    	phantump.addAbilities("Natural Cure", "Frisk", "Harvest");
    	phantump.setAllBaseStats(43, 70, 48, 50, 60, 38);
    	phantump.setWeight(7.0);
    	pokedex.put("Phantump", phantump);

    	Pokemon pheromosa = new Pokemon("Pheromosa");
    	pheromosa.setDexNumber(795);
    	pheromosa.setTypes("Bug", "Fighting");
    	pheromosa.addAbilities("Beast Boost");
    	pheromosa.setAllBaseStats(71, 137, 37, 137, 37, 151);
    	pheromosa.setWeight(25.0);
    	pokedex.put("Pheromosa", pheromosa);

    	Pokemon phione = new Pokemon("Phione");
    	phione.setDexNumber(489);
    	phione.setTypes("Water", "(none)");
    	phione.addAbilities("Hydration");
    	phione.setAllBaseStats(80, 80, 80, 80, 80, 80);
    	phione.setWeight(3.1);
    	pokedex.put("Phione", phione);

    	Pokemon pichu = new Pokemon("Pichu");
    	pichu.setDexNumber(172);
    	pichu.setTypes("Electric", "(none)");
    	pichu.addAbilities("Static", "Lightning Rod");
    	pichu.setAllBaseStats(20, 40, 15, 35, 35, 60);
    	pichu.setWeight(2.0);
    	pokedex.put("Pichu", pichu);

    	Pokemon pichuspikyeared = new Pokemon("Pichu-Spiky-eared");
    	pichuspikyeared.setDexNumber(172);
    	pichuspikyeared.setTypes("Electric", "(none)");
    	pichuspikyeared.addAbilities("Static");
    	pichuspikyeared.setAllBaseStats(20, 40, 15, 35, 35, 60);
    	pichuspikyeared.setWeight(2.0);
    	pokedex.put("Pichu-Spiky-eared", pichuspikyeared);

    	Pokemon pidgeot = new Pokemon("Pidgeot");
    	pidgeot.setDexNumber(18);
    	pidgeot.setTypes("Normal", "Flying");
    	pidgeot.addAbilities("Keen Eye", "Tangled Feet", "Big Pecks");
    	pidgeot.setAllBaseStats(83, 80, 75, 70, 70, 101);
    	pidgeot.setWeight(39.5);
    	pidgeot.setFormes("Pidgeot", "Pidgeot-Mega");
    	pokedex.put("Pidgeot", pidgeot);

    	Pokemon pidgeotmega = new Pokemon("Pidgeot-Mega");
    	pidgeotmega.setDexNumber(18);
    	pidgeotmega.setTypes("Normal", "Flying");
    	pidgeotmega.addAbilities("No Guard");
    	pidgeotmega.setAllBaseStats(83, 80, 80, 135, 80, 121);
    	pidgeotmega.setWeight(50.5);
    	pokedex.put("Pidgeot-Mega", pidgeotmega);

    	Pokemon pidgeotto = new Pokemon("Pidgeotto");
    	pidgeotto.setDexNumber(17);
    	pidgeotto.setTypes("Normal", "Flying");
    	pidgeotto.addAbilities("Keen Eye", "Tangled Feet", "Big Pecks");
    	pidgeotto.setAllBaseStats(63, 60, 55, 50, 50, 71);
    	pidgeotto.setWeight(30.0);
    	pokedex.put("Pidgeotto", pidgeotto);

    	Pokemon pidgey = new Pokemon("Pidgey");
    	pidgey.setDexNumber(16);
    	pidgey.setTypes("Normal", "Flying");
    	pidgey.addAbilities("Keen Eye", "Tangled Feet", "Big Pecks");
    	pidgey.setAllBaseStats(40, 45, 40, 35, 35, 56);
    	pidgey.setWeight(1.8);
    	pokedex.put("Pidgey", pidgey);

    	Pokemon pidove = new Pokemon("Pidove");
    	pidove.setDexNumber(519);
    	pidove.setTypes("Normal", "Flying");
    	pidove.addAbilities("Big Pecks", "Super Luck", "Rivalry");
    	pidove.setAllBaseStats(50, 55, 50, 36, 30, 43);
    	pidove.setWeight(2.1);
    	pokedex.put("Pidove", pidove);

    	Pokemon pignite = new Pokemon("Pignite");
    	pignite.setDexNumber(499);
    	pignite.setTypes("Fire", "Fighting");
    	pignite.addAbilities("Blaze", "Thick Fat");
    	pignite.setAllBaseStats(90, 93, 55, 70, 55, 55);
    	pignite.setWeight(55.5);
    	pokedex.put("Pignite", pignite);

    	Pokemon pikachu = new Pokemon("Pikachu");
    	pikachu.setDexNumber(25);
    	pikachu.setTypes("Electric", "(none)");
    	pikachu.addAbilities("Static", "Lightning Rod");
    	pikachu.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachu.setWeight(6.0);
    	pokedex.put("Pikachu", pikachu);

    	Pokemon pikachualola = new Pokemon("Pikachu-Alola");
    	pikachualola.setDexNumber(25);
    	pikachualola.setTypes("Electric", "(none)");
    	pikachualola.addAbilities("Static");
    	pikachualola.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachualola.setWeight(6.0);
    	pokedex.put("Pikachu-Alola", pikachualola);

    	Pokemon pikachubelle = new Pokemon("Pikachu-Belle");
    	pikachubelle.setDexNumber(25);
    	pikachubelle.setTypes("Electric", "(none)");
    	pikachubelle.addAbilities("Lightning Rod");
    	pikachubelle.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachubelle.setWeight(6.0);
    	pokedex.put("Pikachu-Belle", pikachubelle);

    	Pokemon pikachucosplay = new Pokemon("Pikachu-Cosplay");
    	pikachucosplay.setDexNumber(25);
    	pikachucosplay.setTypes("Electric", "(none)");
    	pikachucosplay.addAbilities("Lightning Rod");
    	pikachucosplay.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachucosplay.setWeight(6.0);
    	pokedex.put("Pikachu-Cosplay", pikachucosplay);

    	Pokemon pikachuhoenn = new Pokemon("Pikachu-Hoenn");
    	pikachuhoenn.setDexNumber(25);
    	pikachuhoenn.setTypes("Electric", "(none)");
    	pikachuhoenn.addAbilities("Static");
    	pikachuhoenn.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachuhoenn.setWeight(6.0);
    	pokedex.put("Pikachu-Hoenn", pikachuhoenn);

    	Pokemon pikachukalos = new Pokemon("Pikachu-Kalos");
    	pikachukalos.setDexNumber(25);
    	pikachukalos.setTypes("Electric", "(none)");
    	pikachukalos.addAbilities("Static");
    	pikachukalos.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachukalos.setWeight(6.0);
    	pokedex.put("Pikachu-Kalos", pikachukalos);

    	Pokemon pikachulibre = new Pokemon("Pikachu-Libre");
    	pikachulibre.setDexNumber(25);
    	pikachulibre.setTypes("Electric", "(none)");
    	pikachulibre.addAbilities("Lightning Rod");
    	pikachulibre.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachulibre.setWeight(6.0);
    	pokedex.put("Pikachu-Libre", pikachulibre);

    	Pokemon pikachuoriginal = new Pokemon("Pikachu-Original");
    	pikachuoriginal.setDexNumber(25);
    	pikachuoriginal.setTypes("Electric", "(none)");
    	pikachuoriginal.addAbilities("Static");
    	pikachuoriginal.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachuoriginal.setWeight(6.0);
    	pokedex.put("Pikachu-Original", pikachuoriginal);

    	Pokemon pikachupartner = new Pokemon("Pikachu-Partner");
    	pikachupartner.setDexNumber(25);
    	pikachupartner.setTypes("Electric", "(none)");
    	pikachupartner.addAbilities("Static");
    	pikachupartner.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachupartner.setWeight(6.0);
    	pokedex.put("Pikachu-Partner", pikachupartner);

    	Pokemon pikachuphd = new Pokemon("Pikachu-PhD");
    	pikachuphd.setDexNumber(25);
    	pikachuphd.setTypes("Electric", "(none)");
    	pikachuphd.addAbilities("Lightning Rod");
    	pikachuphd.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachuphd.setWeight(6.0);
    	pokedex.put("Pikachu-PhD", pikachuphd);

    	Pokemon pikachupopstar = new Pokemon("Pikachu-Pop-Star");
    	pikachupopstar.setDexNumber(25);
    	pikachupopstar.setTypes("Electric", "(none)");
    	pikachupopstar.addAbilities("Lightning Rod");
    	pikachupopstar.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachupopstar.setWeight(6.0);
    	pokedex.put("Pikachu-Pop-Star", pikachupopstar);

    	Pokemon pikachurockstar = new Pokemon("Pikachu-Rock-Star");
    	pikachurockstar.setDexNumber(25);
    	pikachurockstar.setTypes("Electric", "(none)");
    	pikachurockstar.addAbilities("Lightning Rod");
    	pikachurockstar.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachurockstar.setWeight(6.0);
    	pokedex.put("Pikachu-Rock-Star", pikachurockstar);

    	Pokemon pikachusinnoh = new Pokemon("Pikachu-Sinnoh");
    	pikachusinnoh.setDexNumber(25);
    	pikachusinnoh.setTypes("Electric", "(none)");
    	pikachusinnoh.addAbilities("Static");
    	pikachusinnoh.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachusinnoh.setWeight(6.0);
    	pokedex.put("Pikachu-Sinnoh", pikachusinnoh);

    	Pokemon pikachuunova = new Pokemon("Pikachu-Unova");
    	pikachuunova.setDexNumber(25);
    	pikachuunova.setTypes("Electric", "(none)");
    	pikachuunova.addAbilities("Static");
    	pikachuunova.setAllBaseStats(35, 55, 40, 50, 50, 90);
    	pikachuunova.setWeight(6.0);
    	pokedex.put("Pikachu-Unova", pikachuunova);

    	Pokemon pikipek = new Pokemon("Pikipek");
    	pikipek.setDexNumber(731);
    	pikipek.setTypes("Normal", "Flying");
    	pikipek.addAbilities("Keen Eye", "Skill Link", "Pickup");
    	pikipek.setAllBaseStats(35, 75, 30, 30, 30, 65);
    	pikipek.setWeight(1.2);
    	pokedex.put("Pikipek", pikipek);

    	Pokemon piloswine = new Pokemon("Piloswine");
    	piloswine.setDexNumber(221);
    	piloswine.setTypes("Ice", "Ground");
    	piloswine.addAbilities("Oblivious", "Snow Cloak", "Thick Fat");
    	piloswine.setAllBaseStats(100, 100, 80, 60, 60, 50);
    	piloswine.setWeight(55.8);
    	pokedex.put("Piloswine", piloswine);

    	Pokemon pineco = new Pokemon("Pineco");
    	pineco.setDexNumber(204);
    	pineco.setTypes("Bug", "(none)");
    	pineco.addAbilities("Sturdy", "Overcoat");
    	pineco.setAllBaseStats(50, 65, 90, 35, 35, 15);
    	pineco.setWeight(7.2);
    	pokedex.put("Pineco", pineco);

    	Pokemon pinsir = new Pokemon("Pinsir");
    	pinsir.setDexNumber(127);
    	pinsir.setTypes("Bug", "(none)");
    	pinsir.addAbilities("Hyper Cutter", "Mold Breaker", "Moxie");
    	pinsir.setAllBaseStats(65, 125, 100, 55, 70, 85);
    	pinsir.setWeight(55.0);
    	pinsir.setFormes("Pinsir", "Pinsir-Mega");
    	pokedex.put("Pinsir", pinsir);

    	Pokemon pinsirmega = new Pokemon("Pinsir-Mega");
    	pinsirmega.setDexNumber(127);
    	pinsirmega.setTypes("Bug", "Flying");
    	pinsirmega.addAbilities("Aerilate");
    	pinsirmega.setAllBaseStats(65, 155, 120, 65, 90, 105);
    	pinsirmega.setWeight(59.0);
    	pokedex.put("Pinsir-Mega", pinsirmega);

    	Pokemon piplup = new Pokemon("Piplup");
    	piplup.setDexNumber(393);
    	piplup.setTypes("Water", "(none)");
    	piplup.addAbilities("Torrent", "Defiant");
    	piplup.setAllBaseStats(53, 51, 53, 61, 56, 40);
    	piplup.setWeight(5.2);
    	pokedex.put("Piplup", piplup);

    	Pokemon plasmanta = new Pokemon("Plasmanta");
    	plasmanta.setDexNumber(-8);
    	plasmanta.setTypes("Electric", "Poison");
    	plasmanta.addAbilities("Storm Drain", "Vital Spirit", "Telepathy");
    	plasmanta.setAllBaseStats(60, 57, 119, 131, 98, 100);
    	plasmanta.setWeight(460.0);
    	pokedex.put("Plasmanta", plasmanta);

    	Pokemon pluffle = new Pokemon("Pluffle");
    	pluffle.setDexNumber(-115);
    	pluffle.setTypes("Fairy", "(none)");
    	pluffle.addAbilities("Natural Cure", "Aroma Veil", "Friend Guard");
    	pluffle.setAllBaseStats(74, 38, 51, 65, 78, 49);
    	pluffle.setWeight(1.8);
    	pokedex.put("Pluffle", pluffle);

    	Pokemon plusle = new Pokemon("Plusle");
    	plusle.setDexNumber(311);
    	plusle.setTypes("Electric", "(none)");
    	plusle.addAbilities("Plus", "Lightning Rod");
    	plusle.setAllBaseStats(60, 50, 40, 85, 75, 95);
    	plusle.setWeight(4.2);
    	pokedex.put("Plusle", plusle);

    	Pokemon poipole = new Pokemon("Poipole");
    	poipole.setDexNumber(803);
    	poipole.setTypes("Poison", "(none)");
    	poipole.addAbilities("Beast Boost");
    	poipole.setAllBaseStats(67, 73, 67, 73, 67, 73);
    	poipole.setWeight(1.8);
    	pokedex.put("Poipole", poipole);

    	Pokemon pokestarblackbelt = new Pokemon("Pokestar Black Belt");
    	pokestarblackbelt.setDexNumber(-5014);
    	pokestarblackbelt.setTypes("Fighting", "(none)");
    	pokestarblackbelt.addAbilities("Huge Power");
    	pokestarblackbelt.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarblackbelt.setWeight(61.0);
    	pokedex.put("Pokestar Black Belt", pokestarblackbelt);

    	Pokemon pokestarblackdoor = new Pokemon("Pokestar Black Door");
    	pokestarblackdoor.setDexNumber(-5012);
    	pokestarblackdoor.setTypes("Grass", "(none)");
    	pokestarblackdoor.addAbilities("Early Bird");
    	pokestarblackdoor.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarblackdoor.setWeight(61.0);
    	pokedex.put("Pokestar Black Door", pokestarblackdoor);

    	Pokemon pokestarbrycenman = new Pokemon("Pokestar Brycen-Man");
    	pokestarbrycenman.setDexNumber(-5002);
    	pokestarbrycenman.setTypes("Dark", "Psychic");
    	pokestarbrycenman.addAbilities("Levitate");
    	pokestarbrycenman.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarbrycenman.setWeight(61.0);
    	pokedex.put("Pokestar Brycen-Man", pokestarbrycenman);

    	Pokemon pokestarf00 = new Pokemon("Pokestar F-00");
    	pokestarf00.setDexNumber(-5009);
    	pokestarf00.setTypes("Steel", "Normal");
    	pokestarf00.addAbilities("Volt Absorb");
    	pokestarf00.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarf00.setWeight(61.0);
    	pokedex.put("Pokestar F-00", pokestarf00);

    	Pokemon pokestarf002 = new Pokemon("Pokestar F-002");
    	pokestarf002.setDexNumber(-5010);
    	pokestarf002.setTypes("Steel", "Normal");
    	pokestarf002.addAbilities("Reckless");
    	pokestarf002.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarf002.setWeight(61.0);
    	pokedex.put("Pokestar F-002", pokestarf002);

    	Pokemon pokestargiant = new Pokemon("Pokestar Giant");
    	pokestargiant.setDexNumber(-5006);
    	pokestargiant.setTypes("Normal", "(none)");
    	pokestargiant.addAbilities("Huge Power");
    	pokestargiant.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestargiant.setWeight(61.0);
    	pokedex.put("Pokestar Giant", pokestargiant);

    	Pokemon pokestarhumanoid = new Pokemon("Pokestar Humanoid");
    	pokestarhumanoid.setDexNumber(-5007);
    	pokestarhumanoid.setTypes("Normal", "(none)");
    	pokestarhumanoid.addAbilities("Insomnia");
    	pokestarhumanoid.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarhumanoid.setWeight(61.0);
    	pokedex.put("Pokestar Humanoid", pokestarhumanoid);

    	Pokemon pokestarmt = new Pokemon("Pokestar MT");
    	pokestarmt.setDexNumber(-5003);
    	pokestarmt.setTypes("Steel", "(none)");
    	pokestarmt.addAbilities("Analytic");
    	pokestarmt.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarmt.setWeight(61.0);
    	pokedex.put("Pokestar MT", pokestarmt);

    	Pokemon pokestarmt2 = new Pokemon("Pokestar MT2");
    	pokestarmt2.setDexNumber(-5004);
    	pokestarmt2.setTypes("Steel", "Electric");
    	pokestarmt2.addAbilities("Flash Fire");
    	pokestarmt2.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarmt2.setWeight(61.0);
    	pokedex.put("Pokestar MT2", pokestarmt2);

    	Pokemon pokestarmonster = new Pokemon("Pokestar Monster");
    	pokestarmonster.setDexNumber(-5008);
    	pokestarmonster.setTypes("Dark", "(none)");
    	pokestarmonster.addAbilities("Pressure");
    	pokestarmonster.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarmonster.setWeight(61.0);
    	pokedex.put("Pokestar Monster", pokestarmonster);

    	Pokemon pokestarsmeargle = new Pokemon("Pokestar Smeargle");
    	pokestarsmeargle.setDexNumber(-5000);
    	pokestarsmeargle.setTypes("Normal", "(none)");
    	pokestarsmeargle.addAbilities("Own Tempo", "Technician", "Moody");
    	pokestarsmeargle.setAllBaseStats(55, 20, 35, 20, 45, 75);
    	pokestarsmeargle.setWeight(61.0);
    	pokedex.put("Pokestar Smeargle", pokestarsmeargle);

    	Pokemon pokestarspirit = new Pokemon("Pokestar Spirit");
    	pokestarspirit.setDexNumber(-5011);
    	pokestarspirit.setTypes("Dark", "Ghost");
    	pokestarspirit.addAbilities("Wonder Guard");
    	pokestarspirit.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarspirit.setWeight(61.0);
    	pokedex.put("Pokestar Spirit", pokestarspirit);

    	Pokemon pokestartransport = new Pokemon("Pokestar Transport");
    	pokestartransport.setDexNumber(-5005);
    	pokestartransport.setTypes("Steel", "(none)");
    	pokestartransport.addAbilities("Motor Drive");
    	pokestartransport.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestartransport.setWeight(61.0);
    	pokedex.put("Pokestar Transport", pokestartransport);

    	Pokemon pokestarufo = new Pokemon("Pokestar UFO");
    	pokestarufo.setDexNumber(-5001);
    	pokestarufo.setTypes("Flying", "Electric");
    	pokestarufo.addAbilities("Levitate");
    	pokestarufo.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarufo.setWeight(61.0);
    	pokedex.put("Pokestar UFO", pokestarufo);

    	Pokemon pokestarufo2 = new Pokemon("Pokestar UFO-2");
    	pokestarufo2.setDexNumber(-5001);
    	pokestarufo2.setTypes("Psychic", "Electric");
    	pokestarufo2.addAbilities("Levitate");
    	pokestarufo2.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarufo2.setWeight(61.0);
    	pokedex.put("Pokestar UFO-2", pokestarufo2);

    	Pokemon pokestarufopropu2 = new Pokemon("Pokestar UFO-PropU2");
    	pokestarufopropu2.setDexNumber(-5001);
    	pokestarufopropu2.setTypes("Psychic", "Electric");
    	pokestarufopropu2.addAbilities("Levitate");
    	pokestarufopropu2.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarufopropu2.setWeight(61.0);
    	pokedex.put("Pokestar UFO-PropU2", pokestarufopropu2);

    	Pokemon pokestarwhitedoor = new Pokemon("Pokestar White Door");
    	pokestarwhitedoor.setDexNumber(-5013);
    	pokestarwhitedoor.setTypes("Fire", "(none)");
    	pokestarwhitedoor.addAbilities("Blaze");
    	pokestarwhitedoor.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	pokestarwhitedoor.setWeight(61.0);
    	pokedex.put("Pokestar White Door", pokestarwhitedoor);

    	Pokemon politoed = new Pokemon("Politoed");
    	politoed.setDexNumber(186);
    	politoed.setTypes("Water", "(none)");
    	politoed.addAbilities("Water Absorb", "Damp", "Drizzle");
    	politoed.setAllBaseStats(90, 75, 75, 90, 100, 70);
    	politoed.setWeight(33.9);
    	pokedex.put("Politoed", politoed);

    	Pokemon poliwag = new Pokemon("Poliwag");
    	poliwag.setDexNumber(60);
    	poliwag.setTypes("Water", "(none)");
    	poliwag.addAbilities("Water Absorb", "Damp", "Swift Swim");
    	poliwag.setAllBaseStats(40, 50, 40, 40, 40, 90);
    	poliwag.setWeight(12.4);
    	pokedex.put("Poliwag", poliwag);

    	Pokemon poliwhirl = new Pokemon("Poliwhirl");
    	poliwhirl.setDexNumber(61);
    	poliwhirl.setTypes("Water", "(none)");
    	poliwhirl.addAbilities("Water Absorb", "Damp", "Swift Swim");
    	poliwhirl.setAllBaseStats(65, 65, 65, 50, 50, 90);
    	poliwhirl.setWeight(20.0);
    	pokedex.put("Poliwhirl", poliwhirl);

    	Pokemon poliwrath = new Pokemon("Poliwrath");
    	poliwrath.setDexNumber(62);
    	poliwrath.setTypes("Water", "Fighting");
    	poliwrath.addAbilities("Water Absorb", "Damp", "Swift Swim");
    	poliwrath.setAllBaseStats(90, 95, 95, 70, 90, 70);
    	poliwrath.setWeight(54.0);
    	pokedex.put("Poliwrath", poliwrath);

    	Pokemon ponyta = new Pokemon("Ponyta");
    	ponyta.setDexNumber(77);
    	ponyta.setTypes("Fire", "(none)");
    	ponyta.addAbilities("Run Away", "Flash Fire", "Flame Body");
    	ponyta.setAllBaseStats(50, 85, 55, 65, 65, 90);
    	ponyta.setWeight(30.0);
    	pokedex.put("Ponyta", ponyta);

    	Pokemon poochyena = new Pokemon("Poochyena");
    	poochyena.setDexNumber(261);
    	poochyena.setTypes("Dark", "(none)");
    	poochyena.addAbilities("Run Away", "Quick Feet", "Rattled");
    	poochyena.setAllBaseStats(35, 55, 35, 30, 30, 35);
    	poochyena.setWeight(13.6);
    	pokedex.put("Poochyena", poochyena);

    	Pokemon popplio = new Pokemon("Popplio");
    	popplio.setDexNumber(728);
    	popplio.setTypes("Water", "(none)");
    	popplio.addAbilities("Torrent", "Liquid Voice");
    	popplio.setAllBaseStats(50, 54, 54, 66, 56, 40);
    	popplio.setWeight(7.5);
    	pokedex.put("Popplio", popplio);

    	Pokemon porygon = new Pokemon("Porygon");
    	porygon.setDexNumber(137);
    	porygon.setTypes("Normal", "(none)");
    	porygon.addAbilities("Trace", "Download", "Analytic");
    	porygon.setAllBaseStats(65, 60, 70, 85, 75, 40);
    	porygon.setWeight(36.5);
    	pokedex.put("Porygon", porygon);

    	Pokemon porygonz = new Pokemon("Porygon-Z");
    	porygonz.setDexNumber(474);
    	porygonz.setTypes("Normal", "(none)");
    	porygonz.addAbilities("Adaptability", "Download", "Analytic");
    	porygonz.setAllBaseStats(85, 80, 70, 135, 75, 90);
    	porygonz.setWeight(34.0);
    	pokedex.put("Porygon-Z", porygonz);

    	Pokemon porygon2 = new Pokemon("Porygon2");
    	porygon2.setDexNumber(233);
    	porygon2.setTypes("Normal", "(none)");
    	porygon2.addAbilities("Trace", "Download", "Analytic");
    	porygon2.setAllBaseStats(85, 80, 90, 105, 95, 60);
    	porygon2.setWeight(32.5);
    	pokedex.put("Porygon2", porygon2);

    	Pokemon primarina = new Pokemon("Primarina");
    	primarina.setDexNumber(730);
    	primarina.setTypes("Water", "Fairy");
    	primarina.addAbilities("Torrent", "Liquid Voice");
    	primarina.setAllBaseStats(80, 74, 74, 126, 116, 60);
    	primarina.setWeight(44.0);
    	pokedex.put("Primarina", primarina);

    	Pokemon primeape = new Pokemon("Primeape");
    	primeape.setDexNumber(57);
    	primeape.setTypes("Fighting", "(none)");
    	primeape.addAbilities("Vital Spirit", "Anger Point", "Defiant");
    	primeape.setAllBaseStats(65, 105, 60, 60, 70, 95);
    	primeape.setWeight(32.0);
    	pokedex.put("Primeape", primeape);

    	Pokemon prinplup = new Pokemon("Prinplup");
    	prinplup.setDexNumber(394);
    	prinplup.setTypes("Water", "(none)");
    	prinplup.addAbilities("Torrent", "Defiant");
    	prinplup.setAllBaseStats(64, 66, 68, 81, 76, 50);
    	prinplup.setWeight(23.0);
    	pokedex.put("Prinplup", prinplup);

    	Pokemon privatyke = new Pokemon("Privatyke");
    	privatyke.setDexNumber(-118);
    	privatyke.setTypes("Water", "Fighting");
    	privatyke.addAbilities("Unaware", "Technician");
    	privatyke.setAllBaseStats(65, 75, 65, 40, 60, 45);
    	privatyke.setWeight(35.0);
    	pokedex.put("Privatyke", privatyke);

    	Pokemon probopass = new Pokemon("Probopass");
    	probopass.setDexNumber(476);
    	probopass.setTypes("Rock", "Steel");
    	probopass.addAbilities("Sturdy", "Magnet Pull", "Sand Force");
    	probopass.setAllBaseStats(60, 55, 145, 75, 150, 40);
    	probopass.setWeight(340.0);
    	pokedex.put("Probopass", probopass);

    	Pokemon psyduck = new Pokemon("Psyduck");
    	psyduck.setDexNumber(54);
    	psyduck.setTypes("Water", "(none)");
    	psyduck.addAbilities("Damp", "Cloud Nine", "Swift Swim");
    	psyduck.setAllBaseStats(50, 52, 48, 65, 50, 55);
    	psyduck.setWeight(19.6);
    	pokedex.put("Psyduck", psyduck);

    	Pokemon pumpkaboo = new Pokemon("Pumpkaboo");
    	pumpkaboo.setDexNumber(710);
    	pumpkaboo.setTypes("Ghost", "Grass");
    	pumpkaboo.addAbilities("Pickup", "Frisk", "Insomnia");
    	pumpkaboo.setAllBaseStats(49, 66, 70, 44, 55, 51);
    	pumpkaboo.setWeight(5.0);
    	pokedex.put("Pumpkaboo", pumpkaboo);

    	Pokemon pumpkaboolarge = new Pokemon("Pumpkaboo-Large");
    	pumpkaboolarge.setDexNumber(710);
    	pumpkaboolarge.setTypes("Ghost", "Grass");
    	pumpkaboolarge.addAbilities("Pickup", "Frisk", "Insomnia");
    	pumpkaboolarge.setAllBaseStats(54, 66, 70, 44, 55, 46);
    	pumpkaboolarge.setWeight(7.5);
    	pokedex.put("Pumpkaboo-Large", pumpkaboolarge);

    	Pokemon pumpkaboosmall = new Pokemon("Pumpkaboo-Small");
    	pumpkaboosmall.setDexNumber(710);
    	pumpkaboosmall.setTypes("Ghost", "Grass");
    	pumpkaboosmall.addAbilities("Pickup", "Frisk", "Insomnia");
    	pumpkaboosmall.setAllBaseStats(44, 66, 70, 44, 55, 56);
    	pumpkaboosmall.setWeight(3.5);
    	pokedex.put("Pumpkaboo-Small", pumpkaboosmall);

    	Pokemon pumpkaboosuper = new Pokemon("Pumpkaboo-Super");
    	pumpkaboosuper.setDexNumber(710);
    	pumpkaboosuper.setTypes("Ghost", "Grass");
    	pumpkaboosuper.addAbilities("Pickup", "Frisk", "Insomnia");
    	pumpkaboosuper.setAllBaseStats(59, 66, 70, 44, 55, 41);
    	pumpkaboosuper.setWeight(15.0);
    	pokedex.put("Pumpkaboo-Super", pumpkaboosuper);

    	Pokemon pupitar = new Pokemon("Pupitar");
    	pupitar.setDexNumber(247);
    	pupitar.setTypes("Rock", "Ground");
    	pupitar.addAbilities("Shed Skin");
    	pupitar.setAllBaseStats(70, 84, 70, 65, 70, 51);
    	pupitar.setWeight(152.0);
    	pokedex.put("Pupitar", pupitar);

    	Pokemon purrloin = new Pokemon("Purrloin");
    	purrloin.setDexNumber(509);
    	purrloin.setTypes("Dark", "(none)");
    	purrloin.addAbilities("Limber", "Unburden", "Prankster");
    	purrloin.setAllBaseStats(41, 50, 37, 50, 37, 66);
    	purrloin.setWeight(10.1);
    	pokedex.put("Purrloin", purrloin);

    	Pokemon purugly = new Pokemon("Purugly");
    	purugly.setDexNumber(432);
    	purugly.setTypes("Normal", "(none)");
    	purugly.addAbilities("Thick Fat", "Own Tempo", "Defiant");
    	purugly.setAllBaseStats(71, 82, 64, 64, 59, 112);
    	purugly.setWeight(43.8);
    	pokedex.put("Purugly", purugly);

    	Pokemon pyroak = new Pokemon("Pyroak");
    	pyroak.setDexNumber(-53);
    	pyroak.setTypes("Fire", "Grass");
    	pyroak.addAbilities("Rock Head", "Battle Armor", "White Smoke");
    	pyroak.setAllBaseStats(120, 70, 105, 95, 90, 60);
    	pyroak.setWeight(168.0);
    	pokedex.put("Pyroak", pyroak);

    	Pokemon pyroar = new Pokemon("Pyroar");
    	pyroar.setDexNumber(668);
    	pyroar.setTypes("Fire", "Normal");
    	pyroar.addAbilities("Rivalry", "Unnerve", "Moxie");
    	pyroar.setAllBaseStats(86, 68, 72, 109, 66, 106);
    	pyroar.setWeight(81.5);
    	pokedex.put("Pyroar", pyroar);

    	Pokemon pyukumuku = new Pokemon("Pyukumuku");
    	pyukumuku.setDexNumber(771);
    	pyukumuku.setTypes("Water", "(none)");
    	pyukumuku.addAbilities("Innards Out", "Unaware");
    	pyukumuku.setAllBaseStats(55, 60, 130, 30, 130, 5);
    	pyukumuku.setWeight(1.2);
    	pokedex.put("Pyukumuku", pyukumuku);

    	Pokemon quagsire = new Pokemon("Quagsire");
    	quagsire.setDexNumber(195);
    	quagsire.setTypes("Water", "Ground");
    	quagsire.addAbilities("Damp", "Water Absorb", "Unaware");
    	quagsire.setAllBaseStats(95, 85, 85, 65, 65, 35);
    	quagsire.setWeight(75.0);
    	pokedex.put("Quagsire", quagsire);

    	Pokemon quilava = new Pokemon("Quilava");
    	quilava.setDexNumber(156);
    	quilava.setTypes("Fire", "(none)");
    	quilava.addAbilities("Blaze", "Flash Fire");
    	quilava.setAllBaseStats(58, 64, 58, 80, 65, 80);
    	quilava.setWeight(19.0);
    	pokedex.put("Quilava", quilava);

    	Pokemon quilladin = new Pokemon("Quilladin");
    	quilladin.setDexNumber(651);
    	quilladin.setTypes("Grass", "(none)");
    	quilladin.addAbilities("Overgrow", "Bulletproof");
    	quilladin.setAllBaseStats(61, 78, 95, 56, 58, 57);
    	quilladin.setWeight(29.0);
    	pokedex.put("Quilladin", quilladin);

    	Pokemon qwilfish = new Pokemon("Qwilfish");
    	qwilfish.setDexNumber(211);
    	qwilfish.setTypes("Water", "Poison");
    	qwilfish.addAbilities("Poison Point", "Swift Swim", "Intimidate");
    	qwilfish.setAllBaseStats(65, 95, 85, 55, 55, 85);
    	qwilfish.setWeight(3.9);
    	pokedex.put("Qwilfish", qwilfish);

    	Pokemon raichu = new Pokemon("Raichu");
    	raichu.setDexNumber(26);
    	raichu.setTypes("Electric", "(none)");
    	raichu.addAbilities("Static", "Lightning Rod");
    	raichu.setAllBaseStats(60, 90, 55, 90, 80, 110);
    	raichu.setWeight(30.0);
    	pokedex.put("Raichu", raichu);

    	Pokemon raichualola = new Pokemon("Raichu-Alola");
    	raichualola.setDexNumber(26);
    	raichualola.setTypes("Electric", "Psychic");
    	raichualola.addAbilities("Surge Surfer");
    	raichualola.setAllBaseStats(60, 85, 50, 95, 85, 110);
    	raichualola.setWeight(21.0);
    	pokedex.put("Raichu-Alola", raichualola);

    	Pokemon raikou = new Pokemon("Raikou");
    	raikou.setDexNumber(243);
    	raikou.setTypes("Electric", "(none)");
    	raikou.addAbilities("Pressure", "Inner Focus");
    	raikou.setAllBaseStats(90, 85, 75, 115, 100, 115);
    	raikou.setWeight(178.0);
    	pokedex.put("Raikou", raikou);

    	Pokemon ralts = new Pokemon("Ralts");
    	ralts.setDexNumber(280);
    	ralts.setTypes("Psychic", "Fairy");
    	ralts.addAbilities("Synchronize", "Trace", "Telepathy");
    	ralts.setAllBaseStats(28, 25, 25, 45, 35, 40);
    	ralts.setWeight(6.6);
    	pokedex.put("Ralts", ralts);

    	Pokemon rampardos = new Pokemon("Rampardos");
    	rampardos.setDexNumber(409);
    	rampardos.setTypes("Rock", "(none)");
    	rampardos.addAbilities("Mold Breaker", "Sheer Force");
    	rampardos.setAllBaseStats(97, 165, 60, 65, 50, 58);
    	rampardos.setWeight(102.5);
    	pokedex.put("Rampardos", rampardos);

    	Pokemon rapidash = new Pokemon("Rapidash");
    	rapidash.setDexNumber(78);
    	rapidash.setTypes("Fire", "(none)");
    	rapidash.addAbilities("Run Away", "Flash Fire", "Flame Body");
    	rapidash.setAllBaseStats(65, 100, 70, 80, 80, 105);
    	rapidash.setWeight(95.0);
    	pokedex.put("Rapidash", rapidash);

    	Pokemon raticate = new Pokemon("Raticate");
    	raticate.setDexNumber(20);
    	raticate.setTypes("Normal", "(none)");
    	raticate.addAbilities("Run Away", "Guts", "Hustle");
    	raticate.setAllBaseStats(55, 81, 60, 50, 70, 97);
    	raticate.setWeight(18.5);
    	pokedex.put("Raticate", raticate);

    	Pokemon raticatealola = new Pokemon("Raticate-Alola");
    	raticatealola.setDexNumber(20);
    	raticatealola.setTypes("Dark", "Normal");
    	raticatealola.addAbilities("Gluttony", "Hustle", "Thick Fat");
    	raticatealola.setAllBaseStats(75, 71, 70, 40, 80, 77);
    	raticatealola.setWeight(25.5);
    	pokedex.put("Raticate-Alola", raticatealola);

    	Pokemon raticatealolatotem = new Pokemon("Raticate-Alola-Totem");
    	raticatealolatotem.setDexNumber(20);
    	raticatealolatotem.setTypes("Dark", "Normal");
    	raticatealolatotem.addAbilities("Thick Fat");
    	raticatealolatotem.setAllBaseStats(75, 71, 70, 40, 80, 77);
    	raticatealolatotem.setWeight(105.0);
    	pokedex.put("Raticate-Alola-Totem", raticatealolatotem);

    	Pokemon rattata = new Pokemon("Rattata");
    	rattata.setDexNumber(19);
    	rattata.setTypes("Normal", "(none)");
    	rattata.addAbilities("Run Away", "Guts", "Hustle");
    	rattata.setAllBaseStats(30, 56, 35, 25, 35, 72);
    	rattata.setWeight(3.5);
    	pokedex.put("Rattata", rattata);

    	Pokemon rattataalola = new Pokemon("Rattata-Alola");
    	rattataalola.setDexNumber(19);
    	rattataalola.setTypes("Dark", "Normal");
    	rattataalola.addAbilities("Gluttony", "Hustle", "Thick Fat");
    	rattataalola.setAllBaseStats(30, 56, 35, 25, 35, 72);
    	rattataalola.setWeight(3.8);
    	pokedex.put("Rattata-Alola", rattataalola);

    	Pokemon rayquaza = new Pokemon("Rayquaza");
    	rayquaza.setDexNumber(384);
    	rayquaza.setTypes("Dragon", "Flying");
    	rayquaza.addAbilities("Air Lock");
    	rayquaza.setAllBaseStats(105, 150, 90, 150, 90, 95);
    	rayquaza.setWeight(206.5);
    	rayquaza.setFormes("Rayquaza", "Rayquaza-Mega");
    	pokedex.put("Rayquaza", rayquaza);

    	Pokemon rayquazamega = new Pokemon("Rayquaza-Mega");
    	rayquazamega.setDexNumber(384);
    	rayquazamega.setTypes("Dragon", "Flying");
    	rayquazamega.addAbilities("Delta Stream");
    	rayquazamega.setAllBaseStats(105, 180, 100, 180, 100, 115);
    	rayquazamega.setWeight(392.0);
    	pokedex.put("Rayquaza-Mega", rayquazamega);

    	Pokemon rebble = new Pokemon("Rebble");
    	rebble.setDexNumber(-116);
    	rebble.setTypes("Rock", "(none)");
    	rebble.addAbilities("Levitate", "Solid Rock", "Sniper");
    	rebble.setAllBaseStats(45, 25, 65, 75, 55, 80);
    	rebble.setWeight(7.0);
    	pokedex.put("Rebble", rebble);

    	Pokemon regice = new Pokemon("Regice");
    	regice.setDexNumber(378);
    	regice.setTypes("Ice", "(none)");
    	regice.addAbilities("Clear Body", "Ice Body");
    	regice.setAllBaseStats(80, 50, 100, 100, 200, 50);
    	regice.setWeight(175.0);
    	pokedex.put("Regice", regice);

    	Pokemon regigigas = new Pokemon("Regigigas");
    	regigigas.setDexNumber(486);
    	regigigas.setTypes("Normal", "(none)");
    	regigigas.addAbilities("Slow Start");
    	regigigas.setAllBaseStats(110, 160, 110, 80, 110, 100);
    	regigigas.setWeight(420.0);
    	pokedex.put("Regigigas", regigigas);

    	Pokemon regirock = new Pokemon("Regirock");
    	regirock.setDexNumber(377);
    	regirock.setTypes("Rock", "(none)");
    	regirock.addAbilities("Clear Body", "Sturdy");
    	regirock.setAllBaseStats(80, 100, 200, 50, 100, 50);
    	regirock.setWeight(230.0);
    	pokedex.put("Regirock", regirock);

    	Pokemon registeel = new Pokemon("Registeel");
    	registeel.setDexNumber(379);
    	registeel.setTypes("Steel", "(none)");
    	registeel.addAbilities("Clear Body", "Light Metal");
    	registeel.setAllBaseStats(80, 75, 150, 75, 150, 50);
    	registeel.setWeight(205.0);
    	pokedex.put("Registeel", registeel);

    	Pokemon relicanth = new Pokemon("Relicanth");
    	relicanth.setDexNumber(369);
    	relicanth.setTypes("Water", "Rock");
    	relicanth.addAbilities("Swift Swim", "Rock Head", "Sturdy");
    	relicanth.setAllBaseStats(100, 90, 130, 45, 65, 55);
    	relicanth.setWeight(23.4);
    	pokedex.put("Relicanth", relicanth);

    	Pokemon remoraid = new Pokemon("Remoraid");
    	remoraid.setDexNumber(223);
    	remoraid.setTypes("Water", "(none)");
    	remoraid.addAbilities("Hustle", "Sniper", "Moody");
    	remoraid.setAllBaseStats(35, 65, 35, 65, 35, 65);
    	remoraid.setWeight(12.0);
    	pokedex.put("Remoraid", remoraid);

    	Pokemon reshiram = new Pokemon("Reshiram");
    	reshiram.setDexNumber(643);
    	reshiram.setTypes("Dragon", "Fire");
    	reshiram.addAbilities("Turboblaze");
    	reshiram.setAllBaseStats(100, 120, 100, 150, 120, 90);
    	reshiram.setWeight(330.0);
    	pokedex.put("Reshiram", reshiram);

    	Pokemon reuniclus = new Pokemon("Reuniclus");
    	reuniclus.setDexNumber(579);
    	reuniclus.setTypes("Psychic", "(none)");
    	reuniclus.addAbilities("Overcoat", "Magic Guard", "Regenerator");
    	reuniclus.setAllBaseStats(110, 65, 75, 125, 85, 30);
    	reuniclus.setWeight(20.1);
    	pokedex.put("Reuniclus", reuniclus);

    	Pokemon revenankh = new Pokemon("Revenankh");
    	revenankh.setDexNumber(-52);
    	revenankh.setTypes("Ghost", "Fighting");
    	revenankh.addAbilities("Shed Skin", "Air Lock", "Triage");
    	revenankh.setAllBaseStats(90, 105, 90, 65, 110, 65);
    	revenankh.setWeight(44.0);
    	pokedex.put("Revenankh", revenankh);

    	Pokemon rhydon = new Pokemon("Rhydon");
    	rhydon.setDexNumber(112);
    	rhydon.setTypes("Ground", "Rock");
    	rhydon.addAbilities("Lightning Rod", "Rock Head", "Reckless");
    	rhydon.setAllBaseStats(105, 130, 120, 45, 45, 40);
    	rhydon.setWeight(120.0);
    	pokedex.put("Rhydon", rhydon);

    	Pokemon rhyhorn = new Pokemon("Rhyhorn");
    	rhyhorn.setDexNumber(111);
    	rhyhorn.setTypes("Ground", "Rock");
    	rhyhorn.addAbilities("Lightning Rod", "Rock Head", "Reckless");
    	rhyhorn.setAllBaseStats(80, 85, 95, 30, 30, 25);
    	rhyhorn.setWeight(115.0);
    	pokedex.put("Rhyhorn", rhyhorn);

    	Pokemon rhyperior = new Pokemon("Rhyperior");
    	rhyperior.setDexNumber(464);
    	rhyperior.setTypes("Ground", "Rock");
    	rhyperior.addAbilities("Lightning Rod", "Solid Rock", "Reckless");
    	rhyperior.setAllBaseStats(115, 140, 130, 55, 55, 40);
    	rhyperior.setWeight(282.8);
    	pokedex.put("Rhyperior", rhyperior);

    	Pokemon ribombee = new Pokemon("Ribombee");
    	ribombee.setDexNumber(743);
    	ribombee.setTypes("Bug", "Fairy");
    	ribombee.addAbilities("Honey Gather", "Shield Dust", "Sweet Veil");
    	ribombee.setAllBaseStats(60, 55, 60, 95, 70, 124);
    	ribombee.setWeight(0.5);
    	pokedex.put("Ribombee", ribombee);

    	Pokemon ribombeetotem = new Pokemon("Ribombee-Totem");
    	ribombeetotem.setDexNumber(743);
    	ribombeetotem.setTypes("Bug", "Fairy");
    	ribombeetotem.addAbilities("Sweet Veil");
    	ribombeetotem.setAllBaseStats(60, 55, 60, 95, 70, 124);
    	ribombeetotem.setWeight(2.0);
    	pokedex.put("Ribombee-Totem", ribombeetotem);

    	Pokemon riolu = new Pokemon("Riolu");
    	riolu.setDexNumber(447);
    	riolu.setTypes("Fighting", "(none)");
    	riolu.addAbilities("Steadfast", "Inner Focus", "Prankster");
    	riolu.setAllBaseStats(40, 70, 40, 35, 40, 60);
    	riolu.setWeight(20.2);
    	pokedex.put("Riolu", riolu);

    	Pokemon rockruff = new Pokemon("Rockruff");
    	rockruff.setDexNumber(744);
    	rockruff.setTypes("Rock", "(none)");
    	rockruff.addAbilities("Keen Eye", "Vital Spirit", "Steadfast");
    	rockruff.setAllBaseStats(45, 65, 40, 30, 40, 60);
    	rockruff.setWeight(9.2);
    	pokedex.put("Rockruff", rockruff);

    	Pokemon roggenrola = new Pokemon("Roggenrola");
    	roggenrola.setDexNumber(524);
    	roggenrola.setTypes("Rock", "(none)");
    	roggenrola.addAbilities("Sturdy", "Weak Armor", "Sand Force");
    	roggenrola.setAllBaseStats(55, 75, 85, 25, 25, 15);
    	roggenrola.setWeight(18.0);
    	pokedex.put("Roggenrola", roggenrola);

    	Pokemon roselia = new Pokemon("Roselia");
    	roselia.setDexNumber(315);
    	roselia.setTypes("Grass", "Poison");
    	roselia.addAbilities("Natural Cure", "Poison Point", "Leaf Guard");
    	roselia.setAllBaseStats(50, 60, 45, 100, 80, 65);
    	roselia.setWeight(2.0);
    	pokedex.put("Roselia", roselia);

    	Pokemon roserade = new Pokemon("Roserade");
    	roserade.setDexNumber(407);
    	roserade.setTypes("Grass", "Poison");
    	roserade.addAbilities("Natural Cure", "Poison Point", "Technician");
    	roserade.setAllBaseStats(60, 70, 65, 125, 105, 90);
    	roserade.setWeight(14.5);
    	pokedex.put("Roserade", roserade);

    	Pokemon rotom = new Pokemon("Rotom");
    	rotom.setDexNumber(479);
    	rotom.setTypes("Electric", "Ghost");
    	rotom.addAbilities("Levitate");
    	rotom.setAllBaseStats(50, 50, 77, 95, 77, 91);
    	rotom.setWeight(0.3);
    	pokedex.put("Rotom", rotom);

    	Pokemon rotomfan = new Pokemon("Rotom-Fan");
    	rotomfan.setDexNumber(479);
    	rotomfan.setTypes("Electric", "Flying");
    	rotomfan.addAbilities("Levitate");
    	rotomfan.setAllBaseStats(50, 65, 107, 105, 107, 86);
    	rotomfan.setWeight(0.3);
    	pokedex.put("Rotom-Fan", rotomfan);

    	Pokemon rotomfrost = new Pokemon("Rotom-Frost");
    	rotomfrost.setDexNumber(479);
    	rotomfrost.setTypes("Electric", "Ice");
    	rotomfrost.addAbilities("Levitate");
    	rotomfrost.setAllBaseStats(50, 65, 107, 105, 107, 86);
    	rotomfrost.setWeight(0.3);
    	pokedex.put("Rotom-Frost", rotomfrost);

    	Pokemon rotomheat = new Pokemon("Rotom-Heat");
    	rotomheat.setDexNumber(479);
    	rotomheat.setTypes("Electric", "Fire");
    	rotomheat.addAbilities("Levitate");
    	rotomheat.setAllBaseStats(50, 65, 107, 105, 107, 86);
    	rotomheat.setWeight(0.3);
    	pokedex.put("Rotom-Heat", rotomheat);

    	Pokemon rotommow = new Pokemon("Rotom-Mow");
    	rotommow.setDexNumber(479);
    	rotommow.setTypes("Electric", "Grass");
    	rotommow.addAbilities("Levitate");
    	rotommow.setAllBaseStats(50, 65, 107, 105, 107, 86);
    	rotommow.setWeight(0.3);
    	pokedex.put("Rotom-Mow", rotommow);

    	Pokemon rotomwash = new Pokemon("Rotom-Wash");
    	rotomwash.setDexNumber(479);
    	rotomwash.setTypes("Electric", "Water");
    	rotomwash.addAbilities("Levitate");
    	rotomwash.setAllBaseStats(50, 65, 107, 105, 107, 86);
    	rotomwash.setWeight(0.3);
    	pokedex.put("Rotom-Wash", rotomwash);

    	Pokemon rowlet = new Pokemon("Rowlet");
    	rowlet.setDexNumber(722);
    	rowlet.setTypes("Grass", "Flying");
    	rowlet.addAbilities("Overgrow", "Long Reach");
    	rowlet.setAllBaseStats(68, 55, 55, 50, 50, 42);
    	rowlet.setWeight(1.5);
    	pokedex.put("Rowlet", rowlet);

    	Pokemon rufflet = new Pokemon("Rufflet");
    	rufflet.setDexNumber(627);
    	rufflet.setTypes("Normal", "Flying");
    	rufflet.addAbilities("Keen Eye", "Sheer Force", "Hustle");
    	rufflet.setAllBaseStats(70, 83, 50, 37, 50, 60);
    	rufflet.setWeight(10.5);
    	pokedex.put("Rufflet", rufflet);

    	Pokemon sableye = new Pokemon("Sableye");
    	sableye.setDexNumber(302);
    	sableye.setTypes("Dark", "Ghost");
    	sableye.addAbilities("Keen Eye", "Stall", "Prankster");
    	sableye.setAllBaseStats(50, 75, 75, 65, 65, 50);
    	sableye.setWeight(11.0);
    	sableye.setFormes("Sableye", "Sableye-Mega");
    	pokedex.put("Sableye", sableye);

    	Pokemon sableyemega = new Pokemon("Sableye-Mega");
    	sableyemega.setDexNumber(302);
    	sableyemega.setTypes("Dark", "Ghost");
    	sableyemega.addAbilities("Magic Bounce");
    	sableyemega.setAllBaseStats(50, 85, 125, 85, 115, 20);
    	sableyemega.setWeight(161.0);
    	pokedex.put("Sableye-Mega", sableyemega);

    	Pokemon salamence = new Pokemon("Salamence");
    	salamence.setDexNumber(373);
    	salamence.setTypes("Dragon", "Flying");
    	salamence.addAbilities("Intimidate", "Moxie");
    	salamence.setAllBaseStats(95, 135, 80, 110, 80, 100);
    	salamence.setWeight(102.6);
    	salamence.setFormes("Salamence", "Salamence-Mega");
    	pokedex.put("Salamence", salamence);

    	Pokemon salamencemega = new Pokemon("Salamence-Mega");
    	salamencemega.setDexNumber(373);
    	salamencemega.setTypes("Dragon", "Flying");
    	salamencemega.addAbilities("Aerilate");
    	salamencemega.setAllBaseStats(95, 145, 130, 120, 90, 120);
    	salamencemega.setWeight(112.6);
    	pokedex.put("Salamence-Mega", salamencemega);

    	Pokemon salandit = new Pokemon("Salandit");
    	salandit.setDexNumber(757);
    	salandit.setTypes("Poison", "Fire");
    	salandit.addAbilities("Corrosion", "Oblivious");
    	salandit.setAllBaseStats(48, 44, 40, 71, 40, 77);
    	salandit.setWeight(4.8);
    	pokedex.put("Salandit", salandit);

    	Pokemon salazzle = new Pokemon("Salazzle");
    	salazzle.setDexNumber(758);
    	salazzle.setTypes("Poison", "Fire");
    	salazzle.addAbilities("Corrosion", "Oblivious");
    	salazzle.setAllBaseStats(68, 64, 60, 111, 60, 117);
    	salazzle.setWeight(22.2);
    	pokedex.put("Salazzle", salazzle);

    	Pokemon salazzletotem = new Pokemon("Salazzle-Totem");
    	salazzletotem.setDexNumber(758);
    	salazzletotem.setTypes("Poison", "Fire");
    	salazzletotem.addAbilities("Corrosion");
    	salazzletotem.setAllBaseStats(68, 64, 60, 111, 60, 117);
    	salazzletotem.setWeight(81.0);
    	pokedex.put("Salazzle-Totem", salazzletotem);

    	Pokemon samurott = new Pokemon("Samurott");
    	samurott.setDexNumber(503);
    	samurott.setTypes("Water", "(none)");
    	samurott.addAbilities("Torrent", "Shell Armor");
    	samurott.setAllBaseStats(95, 100, 85, 108, 70, 70);
    	samurott.setWeight(94.6);
    	pokedex.put("Samurott", samurott);

    	Pokemon sandile = new Pokemon("Sandile");
    	sandile.setDexNumber(551);
    	sandile.setTypes("Ground", "Dark");
    	sandile.addAbilities("Intimidate", "Moxie", "Anger Point");
    	sandile.setAllBaseStats(50, 72, 35, 35, 35, 65);
    	sandile.setWeight(15.2);
    	pokedex.put("Sandile", sandile);

    	Pokemon sandshrew = new Pokemon("Sandshrew");
    	sandshrew.setDexNumber(27);
    	sandshrew.setTypes("Ground", "(none)");
    	sandshrew.addAbilities("Sand Veil", "Sand Rush");
    	sandshrew.setAllBaseStats(50, 75, 85, 20, 30, 40);
    	sandshrew.setWeight(12.0);
    	pokedex.put("Sandshrew", sandshrew);

    	Pokemon sandshrewalola = new Pokemon("Sandshrew-Alola");
    	sandshrewalola.setDexNumber(27);
    	sandshrewalola.setTypes("Ice", "Steel");
    	sandshrewalola.addAbilities("Snow Cloak", "Slush Rush");
    	sandshrewalola.setAllBaseStats(50, 75, 90, 10, 35, 40);
    	sandshrewalola.setWeight(40.0);
    	pokedex.put("Sandshrew-Alola", sandshrewalola);

    	Pokemon sandslash = new Pokemon("Sandslash");
    	sandslash.setDexNumber(28);
    	sandslash.setTypes("Ground", "(none)");
    	sandslash.addAbilities("Sand Veil", "Sand Rush");
    	sandslash.setAllBaseStats(75, 100, 110, 45, 55, 65);
    	sandslash.setWeight(29.5);
    	pokedex.put("Sandslash", sandslash);

    	Pokemon sandslashalola = new Pokemon("Sandslash-Alola");
    	sandslashalola.setDexNumber(28);
    	sandslashalola.setTypes("Ice", "Steel");
    	sandslashalola.addAbilities("Snow Cloak", "Slush Rush");
    	sandslashalola.setAllBaseStats(75, 100, 120, 25, 65, 65);
    	sandslashalola.setWeight(55.0);
    	pokedex.put("Sandslash-Alola", sandslashalola);

    	Pokemon sandygast = new Pokemon("Sandygast");
    	sandygast.setDexNumber(769);
    	sandygast.setTypes("Ghost", "Ground");
    	sandygast.addAbilities("Water Compaction", "Sand Veil");
    	sandygast.setAllBaseStats(55, 55, 80, 70, 45, 15);
    	sandygast.setWeight(70.0);
    	pokedex.put("Sandygast", sandygast);

    	Pokemon sawk = new Pokemon("Sawk");
    	sawk.setDexNumber(539);
    	sawk.setTypes("Fighting", "(none)");
    	sawk.addAbilities("Sturdy", "Inner Focus", "Mold Breaker");
    	sawk.setAllBaseStats(75, 125, 75, 30, 75, 85);
    	sawk.setWeight(51.0);
    	pokedex.put("Sawk", sawk);

    	Pokemon sawsbuck = new Pokemon("Sawsbuck");
    	sawsbuck.setDexNumber(586);
    	sawsbuck.setTypes("Normal", "Grass");
    	sawsbuck.addAbilities("Chlorophyll", "Sap Sipper", "Serene Grace");
    	sawsbuck.setAllBaseStats(80, 100, 70, 60, 70, 95);
    	sawsbuck.setWeight(92.5);
    	pokedex.put("Sawsbuck", sawsbuck);

    	Pokemon scatterbug = new Pokemon("Scatterbug");
    	scatterbug.setDexNumber(664);
    	scatterbug.setTypes("Bug", "(none)");
    	scatterbug.addAbilities("Shield Dust", "Compound Eyes", "Friend Guard");
    	scatterbug.setAllBaseStats(38, 35, 40, 27, 25, 35);
    	scatterbug.setWeight(2.5);
    	pokedex.put("Scatterbug", scatterbug);

    	Pokemon sceptile = new Pokemon("Sceptile");
    	sceptile.setDexNumber(254);
    	sceptile.setTypes("Grass", "(none)");
    	sceptile.addAbilities("Overgrow", "Unburden");
    	sceptile.setAllBaseStats(70, 85, 65, 105, 85, 120);
    	sceptile.setWeight(52.2);
    	sceptile.setFormes("Sceptile", "Sceptile-Mega");
    	pokedex.put("Sceptile", sceptile);

    	Pokemon sceptilemega = new Pokemon("Sceptile-Mega");
    	sceptilemega.setDexNumber(254);
    	sceptilemega.setTypes("Grass", "Dragon");
    	sceptilemega.addAbilities("Lightning Rod");
    	sceptilemega.setAllBaseStats(70, 110, 75, 145, 85, 145);
    	sceptilemega.setWeight(55.2);
    	pokedex.put("Sceptile-Mega", sceptilemega);

    	Pokemon scizor = new Pokemon("Scizor");
    	scizor.setDexNumber(212);
    	scizor.setTypes("Bug", "Steel");
    	scizor.addAbilities("Swarm", "Technician", "Light Metal");
    	scizor.setAllBaseStats(70, 130, 100, 55, 80, 65);
    	scizor.setWeight(118.0);
    	scizor.setFormes("Scizor", "Scizor-Mega");
    	pokedex.put("Scizor", scizor);

    	Pokemon scizormega = new Pokemon("Scizor-Mega");
    	scizormega.setDexNumber(212);
    	scizormega.setTypes("Bug", "Steel");
    	scizormega.addAbilities("Technician");
    	scizormega.setAllBaseStats(70, 150, 140, 65, 100, 75);
    	scizormega.setWeight(125.0);
    	pokedex.put("Scizor-Mega", scizormega);

    	Pokemon scolipede = new Pokemon("Scolipede");
    	scolipede.setDexNumber(545);
    	scolipede.setTypes("Bug", "Poison");
    	scolipede.addAbilities("Poison Point", "Swarm", "Speed Boost");
    	scolipede.setAllBaseStats(60, 100, 89, 55, 69, 112);
    	scolipede.setWeight(200.5);
    	pokedex.put("Scolipede", scolipede);

    	Pokemon scrafty = new Pokemon("Scrafty");
    	scrafty.setDexNumber(560);
    	scrafty.setTypes("Dark", "Fighting");
    	scrafty.addAbilities("Shed Skin", "Moxie", "Intimidate");
    	scrafty.setAllBaseStats(65, 90, 115, 45, 115, 58);
    	scrafty.setWeight(30.0);
    	pokedex.put("Scrafty", scrafty);

    	Pokemon scraggy = new Pokemon("Scraggy");
    	scraggy.setDexNumber(559);
    	scraggy.setTypes("Dark", "Fighting");
    	scraggy.addAbilities("Shed Skin", "Moxie", "Intimidate");
    	scraggy.setAllBaseStats(50, 75, 70, 35, 70, 48);
    	scraggy.setWeight(11.8);
    	pokedex.put("Scraggy", scraggy);

    	Pokemon scratchet = new Pokemon("Scratchet");
    	scratchet.setDexNumber(-105);
    	scratchet.setTypes("Normal", "Fighting");
    	scratchet.addAbilities("Scrappy", "Prankster", "Vital Spirit");
    	scratchet.setAllBaseStats(55, 85, 80, 20, 70, 40);
    	scratchet.setWeight(20.0);
    	pokedex.put("Scratchet", scratchet);

    	Pokemon scyther = new Pokemon("Scyther");
    	scyther.setDexNumber(123);
    	scyther.setTypes("Bug", "Flying");
    	scyther.addAbilities("Swarm", "Technician", "Steadfast");
    	scyther.setAllBaseStats(70, 110, 80, 55, 80, 105);
    	scyther.setWeight(56.0);
    	pokedex.put("Scyther", scyther);

    	Pokemon seadra = new Pokemon("Seadra");
    	seadra.setDexNumber(117);
    	seadra.setTypes("Water", "(none)");
    	seadra.addAbilities("Poison Point", "Sniper", "Damp");
    	seadra.setAllBaseStats(55, 65, 95, 95, 45, 85);
    	seadra.setWeight(25.0);
    	pokedex.put("Seadra", seadra);

    	Pokemon seaking = new Pokemon("Seaking");
    	seaking.setDexNumber(119);
    	seaking.setTypes("Water", "(none)");
    	seaking.addAbilities("Swift Swim", "Water Veil", "Lightning Rod");
    	seaking.setAllBaseStats(80, 92, 65, 65, 80, 68);
    	seaking.setWeight(39.0);
    	pokedex.put("Seaking", seaking);

    	Pokemon sealeo = new Pokemon("Sealeo");
    	sealeo.setDexNumber(364);
    	sealeo.setTypes("Ice", "Water");
    	sealeo.addAbilities("Thick Fat", "Ice Body", "Oblivious");
    	sealeo.setAllBaseStats(90, 60, 70, 75, 70, 45);
    	sealeo.setWeight(87.6);
    	pokedex.put("Sealeo", sealeo);

    	Pokemon seedot = new Pokemon("Seedot");
    	seedot.setDexNumber(273);
    	seedot.setTypes("Grass", "(none)");
    	seedot.addAbilities("Chlorophyll", "Early Bird", "Pickpocket");
    	seedot.setAllBaseStats(40, 40, 50, 30, 30, 30);
    	seedot.setWeight(4.0);
    	pokedex.put("Seedot", seedot);

    	Pokemon seel = new Pokemon("Seel");
    	seel.setDexNumber(86);
    	seel.setTypes("Water", "(none)");
    	seel.addAbilities("Thick Fat", "Hydration", "Ice Body");
    	seel.setAllBaseStats(65, 45, 55, 45, 70, 45);
    	seel.setWeight(90.0);
    	pokedex.put("Seel", seel);

    	Pokemon seismitoad = new Pokemon("Seismitoad");
    	seismitoad.setDexNumber(537);
    	seismitoad.setTypes("Water", "Ground");
    	seismitoad.addAbilities("Swift Swim", "Poison Touch", "Water Absorb");
    	seismitoad.setAllBaseStats(105, 95, 75, 85, 75, 74);
    	seismitoad.setWeight(62.0);
    	pokedex.put("Seismitoad", seismitoad);

    	Pokemon sentret = new Pokemon("Sentret");
    	sentret.setDexNumber(161);
    	sentret.setTypes("Normal", "(none)");
    	sentret.addAbilities("Run Away", "Keen Eye", "Frisk");
    	sentret.setAllBaseStats(35, 46, 34, 35, 45, 20);
    	sentret.setWeight(6.0);
    	pokedex.put("Sentret", sentret);

    	Pokemon serperior = new Pokemon("Serperior");
    	serperior.setDexNumber(497);
    	serperior.setTypes("Grass", "(none)");
    	serperior.addAbilities("Overgrow", "Contrary");
    	serperior.setAllBaseStats(75, 75, 95, 75, 95, 113);
    	serperior.setWeight(63.0);
    	pokedex.put("Serperior", serperior);

    	Pokemon servine = new Pokemon("Servine");
    	servine.setDexNumber(496);
    	servine.setTypes("Grass", "(none)");
    	servine.addAbilities("Overgrow", "Contrary");
    	servine.setAllBaseStats(60, 60, 75, 60, 75, 83);
    	servine.setWeight(16.0);
    	pokedex.put("Servine", servine);

    	Pokemon seviper = new Pokemon("Seviper");
    	seviper.setDexNumber(336);
    	seviper.setTypes("Poison", "(none)");
    	seviper.addAbilities("Shed Skin", "Infiltrator");
    	seviper.setAllBaseStats(73, 100, 60, 100, 60, 65);
    	seviper.setWeight(52.5);
    	pokedex.put("Seviper", seviper);

    	Pokemon sewaddle = new Pokemon("Sewaddle");
    	sewaddle.setDexNumber(540);
    	sewaddle.setTypes("Bug", "Grass");
    	sewaddle.addAbilities("Swarm", "Chlorophyll", "Overcoat");
    	sewaddle.setAllBaseStats(45, 53, 70, 40, 60, 42);
    	sewaddle.setWeight(2.5);
    	pokedex.put("Sewaddle", sewaddle);

    	Pokemon sharpedo = new Pokemon("Sharpedo");
    	sharpedo.setDexNumber(319);
    	sharpedo.setTypes("Water", "Dark");
    	sharpedo.addAbilities("Rough Skin", "Speed Boost");
    	sharpedo.setAllBaseStats(70, 120, 40, 95, 40, 95);
    	sharpedo.setWeight(88.8);
    	sharpedo.setFormes("Sharpedo", "Sharpedo-Mega");
    	pokedex.put("Sharpedo", sharpedo);

    	Pokemon sharpedomega = new Pokemon("Sharpedo-Mega");
    	sharpedomega.setDexNumber(319);
    	sharpedomega.setTypes("Water", "Dark");
    	sharpedomega.addAbilities("Strong Jaw");
    	sharpedomega.setAllBaseStats(70, 140, 70, 110, 65, 105);
    	sharpedomega.setWeight(130.3);
    	pokedex.put("Sharpedo-Mega", sharpedomega);

    	Pokemon shaymin = new Pokemon("Shaymin");
    	shaymin.setDexNumber(492);
    	shaymin.setTypes("Grass", "(none)");
    	shaymin.addAbilities("Natural Cure");
    	shaymin.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	shaymin.setWeight(2.1);
    	pokedex.put("Shaymin", shaymin);

    	Pokemon shayminsky = new Pokemon("Shaymin-Sky");
    	shayminsky.setDexNumber(492);
    	shayminsky.setTypes("Grass", "Flying");
    	shayminsky.addAbilities("Serene Grace");
    	shayminsky.setAllBaseStats(100, 103, 75, 120, 75, 127);
    	shayminsky.setWeight(5.2);
    	pokedex.put("Shaymin-Sky", shayminsky);

    	Pokemon shedinja = new Pokemon("Shedinja");
    	shedinja.setDexNumber(292);
    	shedinja.setTypes("Bug", "Ghost");
    	shedinja.addAbilities("Wonder Guard");
    	shedinja.setAllBaseStats(1, 90, 45, 30, 30, 40);
    	shedinja.setWeight(1.2);
    	pokedex.put("Shedinja", shedinja);

    	Pokemon shelgon = new Pokemon("Shelgon");
    	shelgon.setDexNumber(372);
    	shelgon.setTypes("Dragon", "(none)");
    	shelgon.addAbilities("Rock Head", "Overcoat");
    	shelgon.setAllBaseStats(65, 95, 100, 60, 50, 50);
    	shelgon.setWeight(110.5);
    	pokedex.put("Shelgon", shelgon);

    	Pokemon shellder = new Pokemon("Shellder");
    	shellder.setDexNumber(90);
    	shellder.setTypes("Water", "(none)");
    	shellder.addAbilities("Shell Armor", "Skill Link", "Overcoat");
    	shellder.setAllBaseStats(30, 65, 100, 45, 25, 40);
    	shellder.setWeight(4.0);
    	pokedex.put("Shellder", shellder);

    	Pokemon shellos = new Pokemon("Shellos");
    	shellos.setDexNumber(422);
    	shellos.setTypes("Water", "(none)");
    	shellos.addAbilities("Sticky Hold", "Storm Drain", "Sand Force");
    	shellos.setAllBaseStats(76, 48, 48, 57, 62, 34);
    	shellos.setWeight(6.3);
    	pokedex.put("Shellos", shellos);

    	Pokemon shelmet = new Pokemon("Shelmet");
    	shelmet.setDexNumber(616);
    	shelmet.setTypes("Bug", "(none)");
    	shelmet.addAbilities("Hydration", "Shell Armor", "Overcoat");
    	shelmet.setAllBaseStats(50, 40, 85, 40, 65, 25);
    	shelmet.setWeight(7.7);
    	pokedex.put("Shelmet", shelmet);

    	Pokemon shieldon = new Pokemon("Shieldon");
    	shieldon.setDexNumber(410);
    	shieldon.setTypes("Rock", "Steel");
    	shieldon.addAbilities("Sturdy", "Soundproof");
    	shieldon.setAllBaseStats(30, 42, 118, 42, 88, 30);
    	shieldon.setWeight(57.0);
    	pokedex.put("Shieldon", shieldon);

    	Pokemon shiftry = new Pokemon("Shiftry");
    	shiftry.setDexNumber(275);
    	shiftry.setTypes("Grass", "Dark");
    	shiftry.addAbilities("Chlorophyll", "Early Bird", "Pickpocket");
    	shiftry.setAllBaseStats(90, 100, 60, 90, 60, 80);
    	shiftry.setWeight(59.6);
    	pokedex.put("Shiftry", shiftry);

    	Pokemon shiinotic = new Pokemon("Shiinotic");
    	shiinotic.setDexNumber(756);
    	shiinotic.setTypes("Grass", "Fairy");
    	shiinotic.addAbilities("Illuminate", "Effect Spore", "Rain Dish");
    	shiinotic.setAllBaseStats(60, 45, 80, 90, 100, 30);
    	shiinotic.setWeight(11.5);
    	pokedex.put("Shiinotic", shiinotic);

    	Pokemon shinx = new Pokemon("Shinx");
    	shinx.setDexNumber(403);
    	shinx.setTypes("Electric", "(none)");
    	shinx.addAbilities("Rivalry", "Intimidate", "Guts");
    	shinx.setAllBaseStats(45, 65, 34, 40, 34, 45);
    	shinx.setWeight(9.5);
    	pokedex.put("Shinx", shinx);

    	Pokemon shroomish = new Pokemon("Shroomish");
    	shroomish.setDexNumber(285);
    	shroomish.setTypes("Grass", "(none)");
    	shroomish.addAbilities("Effect Spore", "Poison Heal", "Quick Feet");
    	shroomish.setAllBaseStats(60, 40, 60, 40, 60, 35);
    	shroomish.setWeight(4.5);
    	pokedex.put("Shroomish", shroomish);

    	Pokemon shuckle = new Pokemon("Shuckle");
    	shuckle.setDexNumber(213);
    	shuckle.setTypes("Bug", "Rock");
    	shuckle.addAbilities("Sturdy", "Gluttony", "Contrary");
    	shuckle.setAllBaseStats(20, 10, 230, 10, 230, 5);
    	shuckle.setWeight(20.5);
    	pokedex.put("Shuckle", shuckle);

    	Pokemon shuppet = new Pokemon("Shuppet");
    	shuppet.setDexNumber(353);
    	shuppet.setTypes("Ghost", "(none)");
    	shuppet.addAbilities("Insomnia", "Frisk", "Cursed Body");
    	shuppet.setAllBaseStats(44, 75, 35, 63, 33, 45);
    	shuppet.setWeight(2.3);
    	pokedex.put("Shuppet", shuppet);

    	Pokemon sigilyph = new Pokemon("Sigilyph");
    	sigilyph.setDexNumber(561);
    	sigilyph.setTypes("Psychic", "Flying");
    	sigilyph.addAbilities("Wonder Skin", "Magic Guard", "Tinted Lens");
    	sigilyph.setAllBaseStats(72, 58, 80, 103, 80, 97);
    	sigilyph.setWeight(14.0);
    	pokedex.put("Sigilyph", sigilyph);

    	Pokemon silcoon = new Pokemon("Silcoon");
    	silcoon.setDexNumber(266);
    	silcoon.setTypes("Bug", "(none)");
    	silcoon.addAbilities("Shed Skin");
    	silcoon.setAllBaseStats(50, 35, 55, 25, 25, 15);
    	silcoon.setWeight(10.0);
    	pokedex.put("Silcoon", silcoon);

    	Pokemon silvally = new Pokemon("Silvally");
    	silvally.setDexNumber(773);
    	silvally.setTypes("Normal", "(none)");
    	silvally.addAbilities("RKS System");
    	silvally.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvally.setWeight(100.5);
    	pokedex.put("Silvally", silvally);

    	Pokemon silvallybug = new Pokemon("Silvally-Bug");
    	silvallybug.setDexNumber(773);
    	silvallybug.setTypes("Bug", "(none)");
    	silvallybug.addAbilities("RKS System");
    	silvallybug.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallybug.setWeight(100.5);
    	pokedex.put("Silvally-Bug", silvallybug);

    	Pokemon silvallydark = new Pokemon("Silvally-Dark");
    	silvallydark.setDexNumber(773);
    	silvallydark.setTypes("Dark", "(none)");
    	silvallydark.addAbilities("RKS System");
    	silvallydark.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallydark.setWeight(100.5);
    	pokedex.put("Silvally-Dark", silvallydark);

    	Pokemon silvallydragon = new Pokemon("Silvally-Dragon");
    	silvallydragon.setDexNumber(773);
    	silvallydragon.setTypes("Dragon", "(none)");
    	silvallydragon.addAbilities("RKS System");
    	silvallydragon.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallydragon.setWeight(100.5);
    	pokedex.put("Silvally-Dragon", silvallydragon);

    	Pokemon silvallyelectric = new Pokemon("Silvally-Electric");
    	silvallyelectric.setDexNumber(773);
    	silvallyelectric.setTypes("Electric", "(none)");
    	silvallyelectric.addAbilities("RKS System");
    	silvallyelectric.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallyelectric.setWeight(100.5);
    	pokedex.put("Silvally-Electric", silvallyelectric);

    	Pokemon silvallyfairy = new Pokemon("Silvally-Fairy");
    	silvallyfairy.setDexNumber(773);
    	silvallyfairy.setTypes("Fairy", "(none)");
    	silvallyfairy.addAbilities("RKS System");
    	silvallyfairy.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallyfairy.setWeight(100.5);
    	pokedex.put("Silvally-Fairy", silvallyfairy);

    	Pokemon silvallyfighting = new Pokemon("Silvally-Fighting");
    	silvallyfighting.setDexNumber(773);
    	silvallyfighting.setTypes("Fighting", "(none)");
    	silvallyfighting.addAbilities("RKS System");
    	silvallyfighting.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallyfighting.setWeight(100.5);
    	pokedex.put("Silvally-Fighting", silvallyfighting);

    	Pokemon silvallyfire = new Pokemon("Silvally-Fire");
    	silvallyfire.setDexNumber(773);
    	silvallyfire.setTypes("Fire", "(none)");
    	silvallyfire.addAbilities("RKS System");
    	silvallyfire.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallyfire.setWeight(100.5);
    	pokedex.put("Silvally-Fire", silvallyfire);

    	Pokemon silvallyflying = new Pokemon("Silvally-Flying");
    	silvallyflying.setDexNumber(773);
    	silvallyflying.setTypes("Flying", "(none)");
    	silvallyflying.addAbilities("RKS System");
    	silvallyflying.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallyflying.setWeight(100.5);
    	pokedex.put("Silvally-Flying", silvallyflying);

    	Pokemon silvallyghost = new Pokemon("Silvally-Ghost");
    	silvallyghost.setDexNumber(773);
    	silvallyghost.setTypes("Ghost", "(none)");
    	silvallyghost.addAbilities("RKS System");
    	silvallyghost.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallyghost.setWeight(100.5);
    	pokedex.put("Silvally-Ghost", silvallyghost);

    	Pokemon silvallygrass = new Pokemon("Silvally-Grass");
    	silvallygrass.setDexNumber(773);
    	silvallygrass.setTypes("Grass", "(none)");
    	silvallygrass.addAbilities("RKS System");
    	silvallygrass.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallygrass.setWeight(100.5);
    	pokedex.put("Silvally-Grass", silvallygrass);

    	Pokemon silvallyground = new Pokemon("Silvally-Ground");
    	silvallyground.setDexNumber(773);
    	silvallyground.setTypes("Ground", "(none)");
    	silvallyground.addAbilities("RKS System");
    	silvallyground.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallyground.setWeight(100.5);
    	pokedex.put("Silvally-Ground", silvallyground);

    	Pokemon silvallyice = new Pokemon("Silvally-Ice");
    	silvallyice.setDexNumber(773);
    	silvallyice.setTypes("Ice", "(none)");
    	silvallyice.addAbilities("RKS System");
    	silvallyice.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallyice.setWeight(100.5);
    	pokedex.put("Silvally-Ice", silvallyice);

    	Pokemon silvallypoison = new Pokemon("Silvally-Poison");
    	silvallypoison.setDexNumber(773);
    	silvallypoison.setTypes("Poison", "(none)");
    	silvallypoison.addAbilities("RKS System");
    	silvallypoison.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallypoison.setWeight(100.5);
    	pokedex.put("Silvally-Poison", silvallypoison);

    	Pokemon silvallypsychic = new Pokemon("Silvally-Psychic");
    	silvallypsychic.setDexNumber(773);
    	silvallypsychic.setTypes("Psychic", "(none)");
    	silvallypsychic.addAbilities("RKS System");
    	silvallypsychic.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallypsychic.setWeight(100.5);
    	pokedex.put("Silvally-Psychic", silvallypsychic);

    	Pokemon silvallyrock = new Pokemon("Silvally-Rock");
    	silvallyrock.setDexNumber(773);
    	silvallyrock.setTypes("Rock", "(none)");
    	silvallyrock.addAbilities("RKS System");
    	silvallyrock.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallyrock.setWeight(100.5);
    	pokedex.put("Silvally-Rock", silvallyrock);

    	Pokemon silvallysteel = new Pokemon("Silvally-Steel");
    	silvallysteel.setDexNumber(773);
    	silvallysteel.setTypes("Steel", "(none)");
    	silvallysteel.addAbilities("RKS System");
    	silvallysteel.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallysteel.setWeight(100.5);
    	pokedex.put("Silvally-Steel", silvallysteel);

    	Pokemon silvallywater = new Pokemon("Silvally-Water");
    	silvallywater.setDexNumber(773);
    	silvallywater.setTypes("Water", "(none)");
    	silvallywater.addAbilities("RKS System");
    	silvallywater.setAllBaseStats(95, 95, 95, 95, 95, 95);
    	silvallywater.setWeight(100.5);
    	pokedex.put("Silvally-Water", silvallywater);

    	Pokemon simipour = new Pokemon("Simipour");
    	simipour.setDexNumber(516);
    	simipour.setTypes("Water", "(none)");
    	simipour.addAbilities("Gluttony", "Torrent");
    	simipour.setAllBaseStats(75, 98, 63, 98, 63, 101);
    	simipour.setWeight(29.0);
    	pokedex.put("Simipour", simipour);

    	Pokemon simisage = new Pokemon("Simisage");
    	simisage.setDexNumber(512);
    	simisage.setTypes("Grass", "(none)");
    	simisage.addAbilities("Gluttony", "Overgrow");
    	simisage.setAllBaseStats(75, 98, 63, 98, 63, 101);
    	simisage.setWeight(30.5);
    	pokedex.put("Simisage", simisage);

    	Pokemon simisear = new Pokemon("Simisear");
    	simisear.setDexNumber(514);
    	simisear.setTypes("Fire", "(none)");
    	simisear.addAbilities("Gluttony", "Blaze");
    	simisear.setAllBaseStats(75, 98, 63, 98, 63, 101);
    	simisear.setWeight(28.0);
    	pokedex.put("Simisear", simisear);

    	Pokemon skarmory = new Pokemon("Skarmory");
    	skarmory.setDexNumber(227);
    	skarmory.setTypes("Steel", "Flying");
    	skarmory.addAbilities("Keen Eye", "Sturdy", "Weak Armor");
    	skarmory.setAllBaseStats(65, 80, 140, 40, 70, 70);
    	skarmory.setWeight(50.5);
    	pokedex.put("Skarmory", skarmory);

    	Pokemon skiddo = new Pokemon("Skiddo");
    	skiddo.setDexNumber(672);
    	skiddo.setTypes("Grass", "(none)");
    	skiddo.addAbilities("Sap Sipper", "Grass Pelt");
    	skiddo.setAllBaseStats(66, 65, 48, 62, 57, 52);
    	skiddo.setWeight(31.0);
    	pokedex.put("Skiddo", skiddo);

    	Pokemon skiploom = new Pokemon("Skiploom");
    	skiploom.setDexNumber(188);
    	skiploom.setTypes("Grass", "Flying");
    	skiploom.addAbilities("Chlorophyll", "Leaf Guard", "Infiltrator");
    	skiploom.setAllBaseStats(55, 45, 50, 45, 65, 80);
    	skiploom.setWeight(1.0);
    	pokedex.put("Skiploom", skiploom);

    	Pokemon skitty = new Pokemon("Skitty");
    	skitty.setDexNumber(300);
    	skitty.setTypes("Normal", "(none)");
    	skitty.addAbilities("Cute Charm", "Normalize", "Wonder Skin");
    	skitty.setAllBaseStats(50, 45, 45, 35, 35, 50);
    	skitty.setWeight(11.0);
    	pokedex.put("Skitty", skitty);

    	Pokemon skorupi = new Pokemon("Skorupi");
    	skorupi.setDexNumber(451);
    	skorupi.setTypes("Poison", "Bug");
    	skorupi.addAbilities("Battle Armor", "Sniper", "Keen Eye");
    	skorupi.setAllBaseStats(40, 50, 90, 30, 55, 65);
    	skorupi.setWeight(12.0);
    	pokedex.put("Skorupi", skorupi);

    	Pokemon skrelp = new Pokemon("Skrelp");
    	skrelp.setDexNumber(690);
    	skrelp.setTypes("Poison", "Water");
    	skrelp.addAbilities("Poison Point", "Poison Touch", "Adaptability");
    	skrelp.setAllBaseStats(50, 60, 60, 60, 60, 30);
    	skrelp.setWeight(7.3);
    	pokedex.put("Skrelp", skrelp);

    	Pokemon skuntank = new Pokemon("Skuntank");
    	skuntank.setDexNumber(435);
    	skuntank.setTypes("Poison", "Dark");
    	skuntank.addAbilities("Stench", "Aftermath", "Keen Eye");
    	skuntank.setAllBaseStats(103, 93, 67, 71, 61, 84);
    	skuntank.setWeight(38.0);
    	pokedex.put("Skuntank", skuntank);

    	Pokemon slaking = new Pokemon("Slaking");
    	slaking.setDexNumber(289);
    	slaking.setTypes("Normal", "(none)");
    	slaking.addAbilities("Truant");
    	slaking.setAllBaseStats(150, 160, 100, 95, 65, 100);
    	slaking.setWeight(130.5);
    	pokedex.put("Slaking", slaking);

    	Pokemon slakoth = new Pokemon("Slakoth");
    	slakoth.setDexNumber(287);
    	slakoth.setTypes("Normal", "(none)");
    	slakoth.addAbilities("Truant");
    	slakoth.setAllBaseStats(60, 60, 60, 35, 35, 30);
    	slakoth.setWeight(24.0);
    	pokedex.put("Slakoth", slakoth);

    	Pokemon sliggoo = new Pokemon("Sliggoo");
    	sliggoo.setDexNumber(705);
    	sliggoo.setTypes("Dragon", "(none)");
    	sliggoo.addAbilities("Sap Sipper", "Hydration", "Gooey");
    	sliggoo.setAllBaseStats(68, 75, 53, 83, 113, 60);
    	sliggoo.setWeight(17.5);
    	pokedex.put("Sliggoo", sliggoo);

    	Pokemon slowbro = new Pokemon("Slowbro");
    	slowbro.setDexNumber(80);
    	slowbro.setTypes("Water", "Psychic");
    	slowbro.addAbilities("Oblivious", "Own Tempo", "Regenerator");
    	slowbro.setAllBaseStats(95, 75, 110, 100, 80, 30);
    	slowbro.setWeight(78.5);
    	slowbro.setFormes("Slowbro", "Slowbro-Mega");
    	pokedex.put("Slowbro", slowbro);

    	Pokemon slowbromega = new Pokemon("Slowbro-Mega");
    	slowbromega.setDexNumber(80);
    	slowbromega.setTypes("Water", "Psychic");
    	slowbromega.addAbilities("Shell Armor");
    	slowbromega.setAllBaseStats(95, 75, 180, 130, 80, 30);
    	slowbromega.setWeight(120.0);
    	pokedex.put("Slowbro-Mega", slowbromega);

    	Pokemon slowking = new Pokemon("Slowking");
    	slowking.setDexNumber(199);
    	slowking.setTypes("Water", "Psychic");
    	slowking.addAbilities("Oblivious", "Own Tempo", "Regenerator");
    	slowking.setAllBaseStats(95, 75, 80, 100, 110, 30);
    	slowking.setWeight(79.5);
    	pokedex.put("Slowking", slowking);

    	Pokemon slowpoke = new Pokemon("Slowpoke");
    	slowpoke.setDexNumber(79);
    	slowpoke.setTypes("Water", "Psychic");
    	slowpoke.addAbilities("Oblivious", "Own Tempo", "Regenerator");
    	slowpoke.setAllBaseStats(90, 65, 65, 40, 40, 15);
    	slowpoke.setWeight(36.0);
    	pokedex.put("Slowpoke", slowpoke);

    	Pokemon slugma = new Pokemon("Slugma");
    	slugma.setDexNumber(218);
    	slugma.setTypes("Fire", "(none)");
    	slugma.addAbilities("Magma Armor", "Flame Body", "Weak Armor");
    	slugma.setAllBaseStats(40, 40, 40, 70, 40, 20);
    	slugma.setWeight(35.0);
    	pokedex.put("Slugma", slugma);

    	Pokemon slurpuff = new Pokemon("Slurpuff");
    	slurpuff.setDexNumber(685);
    	slurpuff.setTypes("Fairy", "(none)");
    	slurpuff.addAbilities("Sweet Veil", "Unburden");
    	slurpuff.setAllBaseStats(82, 80, 86, 85, 75, 72);
    	slurpuff.setWeight(5.0);
    	pokedex.put("Slurpuff", slurpuff);

    	Pokemon smeargle = new Pokemon("Smeargle");
    	smeargle.setDexNumber(235);
    	smeargle.setTypes("Normal", "(none)");
    	smeargle.addAbilities("Own Tempo", "Technician", "Moody");
    	smeargle.setAllBaseStats(55, 20, 35, 20, 45, 75);
    	smeargle.setWeight(58.0);
    	pokedex.put("Smeargle", smeargle);

    	Pokemon smoochum = new Pokemon("Smoochum");
    	smoochum.setDexNumber(238);
    	smoochum.setTypes("Ice", "Psychic");
    	smoochum.addAbilities("Oblivious", "Forewarn", "Hydration");
    	smoochum.setAllBaseStats(45, 30, 15, 85, 65, 65);
    	smoochum.setWeight(6.0);
    	pokedex.put("Smoochum", smoochum);

    	Pokemon sneasel = new Pokemon("Sneasel");
    	sneasel.setDexNumber(215);
    	sneasel.setTypes("Dark", "Ice");
    	sneasel.addAbilities("Inner Focus", "Keen Eye", "Pickpocket");
    	sneasel.setAllBaseStats(55, 95, 55, 35, 75, 115);
    	sneasel.setWeight(28.0);
    	pokedex.put("Sneasel", sneasel);

    	Pokemon snivy = new Pokemon("Snivy");
    	snivy.setDexNumber(495);
    	snivy.setTypes("Grass", "(none)");
    	snivy.addAbilities("Overgrow", "Contrary");
    	snivy.setAllBaseStats(45, 45, 55, 45, 55, 63);
    	snivy.setWeight(8.1);
    	pokedex.put("Snivy", snivy);

    	Pokemon snorlax = new Pokemon("Snorlax");
    	snorlax.setDexNumber(143);
    	snorlax.setTypes("Normal", "(none)");
    	snorlax.addAbilities("Immunity", "Thick Fat", "Gluttony");
    	snorlax.setAllBaseStats(160, 110, 65, 65, 110, 30);
    	snorlax.setWeight(460.0);
    	pokedex.put("Snorlax", snorlax);

    	Pokemon snorunt = new Pokemon("Snorunt");
    	snorunt.setDexNumber(361);
    	snorunt.setTypes("Ice", "(none)");
    	snorunt.addAbilities("Inner Focus", "Ice Body", "Moody");
    	snorunt.setAllBaseStats(50, 50, 50, 50, 50, 50);
    	snorunt.setWeight(16.8);
    	pokedex.put("Snorunt", snorunt);

    	Pokemon snover = new Pokemon("Snover");
    	snover.setDexNumber(459);
    	snover.setTypes("Grass", "Ice");
    	snover.addAbilities("Snow Warning", "Soundproof");
    	snover.setAllBaseStats(60, 62, 50, 62, 60, 40);
    	snover.setWeight(50.5);
    	pokedex.put("Snover", snover);

    	Pokemon snubbull = new Pokemon("Snubbull");
    	snubbull.setDexNumber(209);
    	snubbull.setTypes("Fairy", "(none)");
    	snubbull.addAbilities("Intimidate", "Run Away", "Rattled");
    	snubbull.setAllBaseStats(60, 80, 50, 40, 40, 30);
    	snubbull.setWeight(7.8);
    	pokedex.put("Snubbull", snubbull);

    	Pokemon snugglow = new Pokemon("Snugglow");
    	snugglow.setDexNumber(-112);
    	snugglow.setTypes("Electric", "Poison");
    	snugglow.addAbilities("Storm Drain", "Vital Spirit", "Telepathy");
    	snugglow.setAllBaseStats(40, 37, 79, 91, 68, 70);
    	snugglow.setWeight(6.0);
    	pokedex.put("Snugglow", snugglow);

    	Pokemon solgaleo = new Pokemon("Solgaleo");
    	solgaleo.setDexNumber(791);
    	solgaleo.setTypes("Psychic", "Steel");
    	solgaleo.addAbilities("Full Metal Body");
    	solgaleo.setAllBaseStats(137, 137, 107, 113, 89, 97);
    	solgaleo.setWeight(230.0);
    	pokedex.put("Solgaleo", solgaleo);

    	Pokemon solosis = new Pokemon("Solosis");
    	solosis.setDexNumber(577);
    	solosis.setTypes("Psychic", "(none)");
    	solosis.addAbilities("Overcoat", "Magic Guard", "Regenerator");
    	solosis.setAllBaseStats(45, 30, 40, 105, 50, 20);
    	solosis.setWeight(1.0);
    	pokedex.put("Solosis", solosis);

    	Pokemon solrock = new Pokemon("Solrock");
    	solrock.setDexNumber(338);
    	solrock.setTypes("Rock", "Psychic");
    	solrock.addAbilities("Levitate");
    	solrock.setAllBaseStats(90, 95, 85, 55, 65, 70);
    	solrock.setWeight(154.0);
    	pokedex.put("Solrock", solrock);

    	Pokemon spearow = new Pokemon("Spearow");
    	spearow.setDexNumber(21);
    	spearow.setTypes("Normal", "Flying");
    	spearow.addAbilities("Keen Eye", "Sniper");
    	spearow.setAllBaseStats(40, 60, 30, 31, 31, 70);
    	spearow.setWeight(2.0);
    	pokedex.put("Spearow", spearow);

    	Pokemon spewpa = new Pokemon("Spewpa");
    	spewpa.setDexNumber(665);
    	spewpa.setTypes("Bug", "(none)");
    	spewpa.addAbilities("Shed Skin", "Friend Guard");
    	spewpa.setAllBaseStats(45, 22, 60, 27, 30, 29);
    	spewpa.setWeight(8.4);
    	pokedex.put("Spewpa", spewpa);

    	Pokemon spheal = new Pokemon("Spheal");
    	spheal.setDexNumber(363);
    	spheal.setTypes("Ice", "Water");
    	spheal.addAbilities("Thick Fat", "Ice Body", "Oblivious");
    	spheal.setAllBaseStats(70, 40, 50, 55, 50, 25);
    	spheal.setWeight(39.5);
    	pokedex.put("Spheal", spheal);

    	Pokemon spinarak = new Pokemon("Spinarak");
    	spinarak.setDexNumber(167);
    	spinarak.setTypes("Bug", "Poison");
    	spinarak.addAbilities("Swarm", "Insomnia", "Sniper");
    	spinarak.setAllBaseStats(40, 60, 40, 40, 40, 30);
    	spinarak.setWeight(8.5);
    	pokedex.put("Spinarak", spinarak);

    	Pokemon spinda = new Pokemon("Spinda");
    	spinda.setDexNumber(327);
    	spinda.setTypes("Normal", "(none)");
    	spinda.addAbilities("Own Tempo", "Tangled Feet", "Contrary");
    	spinda.setAllBaseStats(60, 60, 60, 60, 60, 60);
    	spinda.setWeight(5.0);
    	pokedex.put("Spinda", spinda);

    	Pokemon spiritomb = new Pokemon("Spiritomb");
    	spiritomb.setDexNumber(442);
    	spiritomb.setTypes("Ghost", "Dark");
    	spiritomb.addAbilities("Pressure", "Infiltrator");
    	spiritomb.setAllBaseStats(50, 92, 108, 92, 108, 35);
    	spiritomb.setWeight(108.0);
    	pokedex.put("Spiritomb", spiritomb);

    	Pokemon spoink = new Pokemon("Spoink");
    	spoink.setDexNumber(325);
    	spoink.setTypes("Psychic", "(none)");
    	spoink.addAbilities("Thick Fat", "Own Tempo", "Gluttony");
    	spoink.setAllBaseStats(60, 25, 35, 70, 80, 60);
    	spoink.setWeight(30.6);
    	pokedex.put("Spoink", spoink);

    	Pokemon spritzee = new Pokemon("Spritzee");
    	spritzee.setDexNumber(682);
    	spritzee.setTypes("Fairy", "(none)");
    	spritzee.addAbilities("Healer", "Aroma Veil");
    	spritzee.setAllBaseStats(78, 52, 60, 63, 65, 23);
    	spritzee.setWeight(0.5);
    	pokedex.put("Spritzee", spritzee);

    	Pokemon squirtle = new Pokemon("Squirtle");
    	squirtle.setDexNumber(7);
    	squirtle.setTypes("Water", "(none)");
    	squirtle.addAbilities("Torrent", "Rain Dish");
    	squirtle.setAllBaseStats(44, 48, 65, 50, 64, 43);
    	squirtle.setWeight(9.0);
    	pokedex.put("Squirtle", squirtle);

    	Pokemon stakataka = new Pokemon("Stakataka");
    	stakataka.setDexNumber(805);
    	stakataka.setTypes("Rock", "Steel");
    	stakataka.addAbilities("Beast Boost");
    	stakataka.setAllBaseStats(61, 131, 211, 53, 101, 13);
    	stakataka.setWeight(820.0);
    	pokedex.put("Stakataka", stakataka);

    	Pokemon stantler = new Pokemon("Stantler");
    	stantler.setDexNumber(234);
    	stantler.setTypes("Normal", "(none)");
    	stantler.addAbilities("Intimidate", "Frisk", "Sap Sipper");
    	stantler.setAllBaseStats(73, 95, 62, 85, 65, 85);
    	stantler.setWeight(71.2);
    	pokedex.put("Stantler", stantler);

    	Pokemon staraptor = new Pokemon("Staraptor");
    	staraptor.setDexNumber(398);
    	staraptor.setTypes("Normal", "Flying");
    	staraptor.addAbilities("Intimidate", "Reckless");
    	staraptor.setAllBaseStats(85, 120, 70, 50, 60, 100);
    	staraptor.setWeight(24.9);
    	pokedex.put("Staraptor", staraptor);

    	Pokemon staravia = new Pokemon("Staravia");
    	staravia.setDexNumber(397);
    	staravia.setTypes("Normal", "Flying");
    	staravia.addAbilities("Intimidate", "Reckless");
    	staravia.setAllBaseStats(55, 75, 50, 40, 40, 80);
    	staravia.setWeight(15.5);
    	pokedex.put("Staravia", staravia);

    	Pokemon starly = new Pokemon("Starly");
    	starly.setDexNumber(396);
    	starly.setTypes("Normal", "Flying");
    	starly.addAbilities("Keen Eye", "Reckless");
    	starly.setAllBaseStats(40, 55, 30, 30, 30, 60);
    	starly.setWeight(2.0);
    	pokedex.put("Starly", starly);

    	Pokemon starmie = new Pokemon("Starmie");
    	starmie.setDexNumber(121);
    	starmie.setTypes("Water", "Psychic");
    	starmie.addAbilities("Illuminate", "Natural Cure", "Analytic");
    	starmie.setAllBaseStats(60, 75, 85, 100, 85, 115);
    	starmie.setWeight(80.0);
    	pokedex.put("Starmie", starmie);

    	Pokemon staryu = new Pokemon("Staryu");
    	staryu.setDexNumber(120);
    	staryu.setTypes("Water", "(none)");
    	staryu.addAbilities("Illuminate", "Natural Cure", "Analytic");
    	staryu.setAllBaseStats(30, 45, 55, 70, 55, 85);
    	staryu.setWeight(34.5);
    	pokedex.put("Staryu", staryu);

    	Pokemon steelix = new Pokemon("Steelix");
    	steelix.setDexNumber(208);
    	steelix.setTypes("Steel", "Ground");
    	steelix.addAbilities("Rock Head", "Sturdy", "Sheer Force");
    	steelix.setAllBaseStats(75, 85, 200, 55, 65, 30);
    	steelix.setWeight(400.0);
    	steelix.setFormes("Steelix", "Steelix-Mega");
    	pokedex.put("Steelix", steelix);

    	Pokemon steelixmega = new Pokemon("Steelix-Mega");
    	steelixmega.setDexNumber(208);
    	steelixmega.setTypes("Steel", "Ground");
    	steelixmega.addAbilities("Sand Force");
    	steelixmega.setAllBaseStats(75, 125, 230, 55, 95, 30);
    	steelixmega.setWeight(740.0);
    	pokedex.put("Steelix-Mega", steelixmega);

    	Pokemon steenee = new Pokemon("Steenee");
    	steenee.setDexNumber(762);
    	steenee.setTypes("Grass", "(none)");
    	steenee.addAbilities("Leaf Guard", "Oblivious", "Sweet Veil");
    	steenee.setAllBaseStats(52, 40, 48, 40, 48, 62);
    	steenee.setWeight(8.2);
    	pokedex.put("Steenee", steenee);

    	Pokemon stoutland = new Pokemon("Stoutland");
    	stoutland.setDexNumber(508);
    	stoutland.setTypes("Normal", "(none)");
    	stoutland.addAbilities("Intimidate", "Sand Rush", "Scrappy");
    	stoutland.setAllBaseStats(85, 110, 90, 45, 90, 80);
    	stoutland.setWeight(61.0);
    	pokedex.put("Stoutland", stoutland);

    	Pokemon stratagem = new Pokemon("Stratagem");
    	stratagem.setDexNumber(-55);
    	stratagem.setTypes("Rock", "(none)");
    	stratagem.addAbilities("Levitate", "Technician", "Sniper");
    	stratagem.setAllBaseStats(90, 60, 65, 120, 70, 130);
    	stratagem.setWeight(45.0);
    	pokedex.put("Stratagem", stratagem);

    	Pokemon stufful = new Pokemon("Stufful");
    	stufful.setDexNumber(759);
    	stufful.setTypes("Normal", "Fighting");
    	stufful.addAbilities("Fluffy", "Klutz", "Cute Charm");
    	stufful.setAllBaseStats(70, 75, 50, 45, 50, 50);
    	stufful.setWeight(6.8);
    	pokedex.put("Stufful", stufful);

    	Pokemon stunfisk = new Pokemon("Stunfisk");
    	stunfisk.setDexNumber(618);
    	stunfisk.setTypes("Ground", "Electric");
    	stunfisk.addAbilities("Static", "Limber", "Sand Veil");
    	stunfisk.setAllBaseStats(109, 66, 84, 81, 99, 32);
    	stunfisk.setWeight(11.0);
    	pokedex.put("Stunfisk", stunfisk);

    	Pokemon stunky = new Pokemon("Stunky");
    	stunky.setDexNumber(434);
    	stunky.setTypes("Poison", "Dark");
    	stunky.addAbilities("Stench", "Aftermath", "Keen Eye");
    	stunky.setAllBaseStats(63, 63, 47, 41, 41, 74);
    	stunky.setWeight(19.2);
    	pokedex.put("Stunky", stunky);

    	Pokemon sudowoodo = new Pokemon("Sudowoodo");
    	sudowoodo.setDexNumber(185);
    	sudowoodo.setTypes("Rock", "(none)");
    	sudowoodo.addAbilities("Sturdy", "Rock Head", "Rattled");
    	sudowoodo.setAllBaseStats(70, 100, 115, 30, 65, 30);
    	sudowoodo.setWeight(38.0);
    	pokedex.put("Sudowoodo", sudowoodo);

    	Pokemon suicune = new Pokemon("Suicune");
    	suicune.setDexNumber(245);
    	suicune.setTypes("Water", "(none)");
    	suicune.addAbilities("Pressure", "Inner Focus");
    	suicune.setAllBaseStats(100, 75, 115, 90, 115, 85);
    	suicune.setWeight(187.0);
    	pokedex.put("Suicune", suicune);

    	Pokemon sunflora = new Pokemon("Sunflora");
    	sunflora.setDexNumber(192);
    	sunflora.setTypes("Grass", "(none)");
    	sunflora.addAbilities("Chlorophyll", "Solar Power", "Early Bird");
    	sunflora.setAllBaseStats(75, 75, 55, 105, 85, 30);
    	sunflora.setWeight(8.5);
    	pokedex.put("Sunflora", sunflora);

    	Pokemon sunkern = new Pokemon("Sunkern");
    	sunkern.setDexNumber(191);
    	sunkern.setTypes("Grass", "(none)");
    	sunkern.addAbilities("Chlorophyll", "Solar Power", "Early Bird");
    	sunkern.setAllBaseStats(30, 30, 30, 30, 30, 30);
    	sunkern.setWeight(1.8);
    	pokedex.put("Sunkern", sunkern);

    	Pokemon surskit = new Pokemon("Surskit");
    	surskit.setDexNumber(283);
    	surskit.setTypes("Bug", "Water");
    	surskit.addAbilities("Swift Swim", "Rain Dish");
    	surskit.setAllBaseStats(40, 30, 32, 50, 52, 65);
    	surskit.setWeight(1.7);
    	pokedex.put("Surskit", surskit);

    	Pokemon swablu = new Pokemon("Swablu");
    	swablu.setDexNumber(333);
    	swablu.setTypes("Normal", "Flying");
    	swablu.addAbilities("Natural Cure", "Cloud Nine");
    	swablu.setAllBaseStats(45, 40, 60, 40, 75, 50);
    	swablu.setWeight(1.2);
    	pokedex.put("Swablu", swablu);

    	Pokemon swadloon = new Pokemon("Swadloon");
    	swadloon.setDexNumber(541);
    	swadloon.setTypes("Bug", "Grass");
    	swadloon.addAbilities("Leaf Guard", "Chlorophyll", "Overcoat");
    	swadloon.setAllBaseStats(55, 63, 90, 50, 80, 42);
    	swadloon.setWeight(7.3);
    	pokedex.put("Swadloon", swadloon);

    	Pokemon swalot = new Pokemon("Swalot");
    	swalot.setDexNumber(317);
    	swalot.setTypes("Poison", "(none)");
    	swalot.addAbilities("Liquid Ooze", "Sticky Hold", "Gluttony");
    	swalot.setAllBaseStats(100, 73, 83, 73, 83, 55);
    	swalot.setWeight(80.0);
    	pokedex.put("Swalot", swalot);

    	Pokemon swampert = new Pokemon("Swampert");
    	swampert.setDexNumber(260);
    	swampert.setTypes("Water", "Ground");
    	swampert.addAbilities("Torrent", "Damp");
    	swampert.setAllBaseStats(100, 110, 90, 85, 90, 60);
    	swampert.setWeight(81.9);
    	swampert.setFormes("Swampert", "Swampert-Mega");
    	pokedex.put("Swampert", swampert);

    	Pokemon swampertmega = new Pokemon("Swampert-Mega");
    	swampertmega.setDexNumber(260);
    	swampertmega.setTypes("Water", "Ground");
    	swampertmega.addAbilities("Swift Swim");
    	swampertmega.setAllBaseStats(100, 150, 110, 95, 110, 70);
    	swampertmega.setWeight(102.0);
    	pokedex.put("Swampert-Mega", swampertmega);

    	Pokemon swanna = new Pokemon("Swanna");
    	swanna.setDexNumber(581);
    	swanna.setTypes("Water", "Flying");
    	swanna.addAbilities("Keen Eye", "Big Pecks", "Hydration");
    	swanna.setAllBaseStats(75, 87, 63, 87, 63, 98);
    	swanna.setWeight(24.2);
    	pokedex.put("Swanna", swanna);

    	Pokemon swellow = new Pokemon("Swellow");
    	swellow.setDexNumber(277);
    	swellow.setTypes("Normal", "Flying");
    	swellow.addAbilities("Guts", "Scrappy");
    	swellow.setAllBaseStats(60, 85, 60, 75, 50, 125);
    	swellow.setWeight(19.8);
    	pokedex.put("Swellow", swellow);

    	Pokemon swinub = new Pokemon("Swinub");
    	swinub.setDexNumber(220);
    	swinub.setTypes("Ice", "Ground");
    	swinub.addAbilities("Oblivious", "Snow Cloak", "Thick Fat");
    	swinub.setAllBaseStats(50, 50, 40, 30, 30, 50);
    	swinub.setWeight(6.5);
    	pokedex.put("Swinub", swinub);

    	Pokemon swirlix = new Pokemon("Swirlix");
    	swirlix.setDexNumber(684);
    	swirlix.setTypes("Fairy", "(none)");
    	swirlix.addAbilities("Sweet Veil", "Unburden");
    	swirlix.setAllBaseStats(62, 48, 66, 59, 57, 49);
    	swirlix.setWeight(3.5);
    	pokedex.put("Swirlix", swirlix);

    	Pokemon swoobat = new Pokemon("Swoobat");
    	swoobat.setDexNumber(528);
    	swoobat.setTypes("Psychic", "Flying");
    	swoobat.addAbilities("Unaware", "Klutz", "Simple");
    	swoobat.setAllBaseStats(67, 57, 55, 77, 55, 114);
    	swoobat.setWeight(10.5);
    	pokedex.put("Swoobat", swoobat);

    	Pokemon syclant = new Pokemon("Syclant");
    	syclant.setDexNumber(-51);
    	syclant.setTypes("Ice", "Bug");
    	syclant.addAbilities("Compound Eyes", "Mountaineer", "Ice Body");
    	syclant.setAllBaseStats(70, 116, 70, 114, 64, 121);
    	syclant.setWeight(52.0);
    	pokedex.put("Syclant", syclant);

    	Pokemon syclar = new Pokemon("Syclar");
    	syclar.setDexNumber(-101);
    	syclar.setTypes("Ice", "Bug");
    	syclar.addAbilities("Compound Eyes", "Snow Cloak");
    	syclar.setAllBaseStats(40, 76, 45, 74, 39, 91);
    	syclar.setWeight(4.0);
    	pokedex.put("Syclar", syclar);

    	Pokemon sylveon = new Pokemon("Sylveon");
    	sylveon.setDexNumber(700);
    	sylveon.setTypes("Fairy", "(none)");
    	sylveon.addAbilities("Cute Charm", "Pixilate");
    	sylveon.setAllBaseStats(95, 65, 65, 110, 130, 60);
    	sylveon.setWeight(23.5);
    	pokedex.put("Sylveon", sylveon);

    	Pokemon tactite = new Pokemon("Tactite");
    	tactite.setDexNumber(-117);
    	tactite.setTypes("Rock", "(none)");
    	tactite.addAbilities("Levitate", "Technician", "Sniper");
    	tactite.setAllBaseStats(70, 40, 65, 100, 65, 95);
    	tactite.setWeight(16.0);
    	pokedex.put("Tactite", tactite);

    	Pokemon taillow = new Pokemon("Taillow");
    	taillow.setDexNumber(276);
    	taillow.setTypes("Normal", "Flying");
    	taillow.addAbilities("Guts", "Scrappy");
    	taillow.setAllBaseStats(40, 55, 30, 30, 30, 85);
    	taillow.setWeight(2.3);
    	pokedex.put("Taillow", taillow);

    	Pokemon talonflame = new Pokemon("Talonflame");
    	talonflame.setDexNumber(663);
    	talonflame.setTypes("Fire", "Flying");
    	talonflame.addAbilities("Flame Body", "Gale Wings");
    	talonflame.setAllBaseStats(78, 81, 71, 74, 69, 126);
    	talonflame.setWeight(24.5);
    	pokedex.put("Talonflame", talonflame);

    	Pokemon tangela = new Pokemon("Tangela");
    	tangela.setDexNumber(114);
    	tangela.setTypes("Grass", "(none)");
    	tangela.addAbilities("Chlorophyll", "Leaf Guard", "Regenerator");
    	tangela.setAllBaseStats(65, 55, 115, 100, 40, 60);
    	tangela.setWeight(35.0);
    	pokedex.put("Tangela", tangela);

    	Pokemon tangrowth = new Pokemon("Tangrowth");
    	tangrowth.setDexNumber(465);
    	tangrowth.setTypes("Grass", "(none)");
    	tangrowth.addAbilities("Chlorophyll", "Leaf Guard", "Regenerator");
    	tangrowth.setAllBaseStats(100, 100, 125, 110, 50, 50);
    	tangrowth.setWeight(128.6);
    	pokedex.put("Tangrowth", tangrowth);

    	Pokemon tapubulu = new Pokemon("Tapu Bulu");
    	tapubulu.setDexNumber(787);
    	tapubulu.setTypes("Grass", "Fairy");
    	tapubulu.addAbilities("Grassy Surge", "Telepathy");
    	tapubulu.setAllBaseStats(70, 130, 115, 85, 95, 75);
    	tapubulu.setWeight(45.5);
    	pokedex.put("Tapu Bulu", tapubulu);

    	Pokemon tapufini = new Pokemon("Tapu Fini");
    	tapufini.setDexNumber(788);
    	tapufini.setTypes("Water", "Fairy");
    	tapufini.addAbilities("Misty Surge", "Telepathy");
    	tapufini.setAllBaseStats(70, 75, 115, 95, 130, 85);
    	tapufini.setWeight(21.2);
    	pokedex.put("Tapu Fini", tapufini);

    	Pokemon tapukoko = new Pokemon("Tapu Koko");
    	tapukoko.setDexNumber(785);
    	tapukoko.setTypes("Electric", "Fairy");
    	tapukoko.addAbilities("Electric Surge", "Telepathy");
    	tapukoko.setAllBaseStats(70, 115, 85, 95, 75, 130);
    	tapukoko.setWeight(20.5);
    	pokedex.put("Tapu Koko", tapukoko);

    	Pokemon tapulele = new Pokemon("Tapu Lele");
    	tapulele.setDexNumber(786);
    	tapulele.setTypes("Psychic", "Fairy");
    	tapulele.addAbilities("Psychic Surge", "Telepathy");
    	tapulele.setAllBaseStats(70, 85, 75, 130, 115, 95);
    	tapulele.setWeight(18.6);
    	pokedex.put("Tapu Lele", tapulele);

    	Pokemon tauros = new Pokemon("Tauros");
    	tauros.setDexNumber(128);
    	tauros.setTypes("Normal", "(none)");
    	tauros.addAbilities("Intimidate", "Anger Point", "Sheer Force");
    	tauros.setAllBaseStats(75, 100, 95, 40, 70, 110);
    	tauros.setWeight(88.4);
    	pokedex.put("Tauros", tauros);

    	Pokemon teddiursa = new Pokemon("Teddiursa");
    	teddiursa.setDexNumber(216);
    	teddiursa.setTypes("Normal", "(none)");
    	teddiursa.addAbilities("Pickup", "Quick Feet", "Honey Gather");
    	teddiursa.setAllBaseStats(60, 80, 50, 50, 50, 40);
    	teddiursa.setWeight(8.8);
    	pokedex.put("Teddiursa", teddiursa);

    	Pokemon tentacool = new Pokemon("Tentacool");
    	tentacool.setDexNumber(72);
    	tentacool.setTypes("Water", "Poison");
    	tentacool.addAbilities("Clear Body", "Liquid Ooze", "Rain Dish");
    	tentacool.setAllBaseStats(40, 40, 35, 50, 100, 70);
    	tentacool.setWeight(45.5);
    	pokedex.put("Tentacool", tentacool);

    	Pokemon tentacruel = new Pokemon("Tentacruel");
    	tentacruel.setDexNumber(73);
    	tentacruel.setTypes("Water", "Poison");
    	tentacruel.addAbilities("Clear Body", "Liquid Ooze", "Rain Dish");
    	tentacruel.setAllBaseStats(80, 70, 65, 80, 120, 100);
    	tentacruel.setWeight(55.0);
    	pokedex.put("Tentacruel", tentacruel);

    	Pokemon tepig = new Pokemon("Tepig");
    	tepig.setDexNumber(498);
    	tepig.setTypes("Fire", "(none)");
    	tepig.addAbilities("Blaze", "Thick Fat");
    	tepig.setAllBaseStats(65, 63, 45, 45, 45, 45);
    	tepig.setWeight(9.9);
    	pokedex.put("Tepig", tepig);

    	Pokemon terrakion = new Pokemon("Terrakion");
    	terrakion.setDexNumber(639);
    	terrakion.setTypes("Rock", "Fighting");
    	terrakion.addAbilities("Justified");
    	terrakion.setAllBaseStats(91, 129, 90, 72, 90, 108);
    	terrakion.setWeight(260.0);
    	pokedex.put("Terrakion", terrakion);

    	Pokemon throh = new Pokemon("Throh");
    	throh.setDexNumber(538);
    	throh.setTypes("Fighting", "(none)");
    	throh.addAbilities("Guts", "Inner Focus", "Mold Breaker");
    	throh.setAllBaseStats(120, 100, 85, 30, 85, 45);
    	throh.setWeight(55.5);
    	pokedex.put("Throh", throh);

    	Pokemon thundurus = new Pokemon("Thundurus");
    	thundurus.setDexNumber(642);
    	thundurus.setTypes("Electric", "Flying");
    	thundurus.addAbilities("Prankster", "Defiant");
    	thundurus.setAllBaseStats(79, 115, 70, 125, 80, 111);
    	thundurus.setWeight(61.0);
    	pokedex.put("Thundurus", thundurus);

    	Pokemon thundurustherian = new Pokemon("Thundurus-Therian");
    	thundurustherian.setDexNumber(642);
    	thundurustherian.setTypes("Electric", "Flying");
    	thundurustherian.addAbilities("Volt Absorb");
    	thundurustherian.setAllBaseStats(79, 105, 70, 145, 80, 101);
    	thundurustherian.setWeight(61.0);
    	pokedex.put("Thundurus-Therian", thundurustherian);

    	Pokemon timburr = new Pokemon("Timburr");
    	timburr.setDexNumber(532);
    	timburr.setTypes("Fighting", "(none)");
    	timburr.addAbilities("Guts", "Sheer Force", "Iron Fist");
    	timburr.setAllBaseStats(75, 80, 55, 25, 35, 35);
    	timburr.setWeight(12.5);
    	pokedex.put("Timburr", timburr);

    	Pokemon tirtouga = new Pokemon("Tirtouga");
    	tirtouga.setDexNumber(564);
    	tirtouga.setTypes("Water", "Rock");
    	tirtouga.addAbilities("Solid Rock", "Sturdy", "Swift Swim");
    	tirtouga.setAllBaseStats(54, 78, 103, 53, 45, 22);
    	tirtouga.setWeight(16.5);
    	pokedex.put("Tirtouga", tirtouga);

    	Pokemon togedemaru = new Pokemon("Togedemaru");
    	togedemaru.setDexNumber(777);
    	togedemaru.setTypes("Electric", "Steel");
    	togedemaru.addAbilities("Iron Barbs", "Lightning Rod", "Sturdy");
    	togedemaru.setAllBaseStats(65, 98, 63, 40, 73, 96);
    	togedemaru.setWeight(3.3);
    	pokedex.put("Togedemaru", togedemaru);

    	Pokemon togedemarutotem = new Pokemon("Togedemaru-Totem");
    	togedemarutotem.setDexNumber(777);
    	togedemarutotem.setTypes("Electric", "Steel");
    	togedemarutotem.addAbilities("Sturdy");
    	togedemarutotem.setAllBaseStats(65, 98, 63, 40, 73, 96);
    	togedemarutotem.setWeight(13.0);
    	pokedex.put("Togedemaru-Totem", togedemarutotem);

    	Pokemon togekiss = new Pokemon("Togekiss");
    	togekiss.setDexNumber(468);
    	togekiss.setTypes("Fairy", "Flying");
    	togekiss.addAbilities("Hustle", "Serene Grace", "Super Luck");
    	togekiss.setAllBaseStats(85, 50, 95, 120, 115, 80);
    	togekiss.setWeight(38.0);
    	pokedex.put("Togekiss", togekiss);

    	Pokemon togepi = new Pokemon("Togepi");
    	togepi.setDexNumber(175);
    	togepi.setTypes("Fairy", "(none)");
    	togepi.addAbilities("Hustle", "Serene Grace", "Super Luck");
    	togepi.setAllBaseStats(35, 20, 65, 40, 65, 20);
    	togepi.setWeight(1.5);
    	pokedex.put("Togepi", togepi);

    	Pokemon togetic = new Pokemon("Togetic");
    	togetic.setDexNumber(176);
    	togetic.setTypes("Fairy", "Flying");
    	togetic.addAbilities("Hustle", "Serene Grace", "Super Luck");
    	togetic.setAllBaseStats(55, 40, 85, 80, 105, 40);
    	togetic.setWeight(3.2);
    	pokedex.put("Togetic", togetic);

    	Pokemon tomohawk = new Pokemon("Tomohawk");
    	tomohawk.setDexNumber(-1);
    	tomohawk.setTypes("Flying", "Fighting");
    	tomohawk.addAbilities("Intimidate", "Prankster", "Justified");
    	tomohawk.setAllBaseStats(105, 60, 90, 115, 80, 85);
    	tomohawk.setWeight(37.2);
    	pokedex.put("Tomohawk", tomohawk);

    	Pokemon torchic = new Pokemon("Torchic");
    	torchic.setDexNumber(255);
    	torchic.setTypes("Fire", "(none)");
    	torchic.addAbilities("Blaze", "Speed Boost");
    	torchic.setAllBaseStats(45, 60, 40, 70, 50, 45);
    	torchic.setWeight(2.5);
    	pokedex.put("Torchic", torchic);

    	Pokemon torkoal = new Pokemon("Torkoal");
    	torkoal.setDexNumber(324);
    	torkoal.setTypes("Fire", "(none)");
    	torkoal.addAbilities("White Smoke", "Drought", "Shell Armor");
    	torkoal.setAllBaseStats(70, 85, 140, 85, 70, 20);
    	torkoal.setWeight(80.4);
    	pokedex.put("Torkoal", torkoal);

    	Pokemon tornadus = new Pokemon("Tornadus");
    	tornadus.setDexNumber(641);
    	tornadus.setTypes("Flying", "(none)");
    	tornadus.addAbilities("Prankster", "Defiant");
    	tornadus.setAllBaseStats(79, 115, 70, 125, 80, 111);
    	tornadus.setWeight(63.0);
    	pokedex.put("Tornadus", tornadus);

    	Pokemon tornadustherian = new Pokemon("Tornadus-Therian");
    	tornadustherian.setDexNumber(641);
    	tornadustherian.setTypes("Flying", "(none)");
    	tornadustherian.addAbilities("Regenerator");
    	tornadustherian.setAllBaseStats(79, 100, 80, 110, 90, 121);
    	tornadustherian.setWeight(63.0);
    	pokedex.put("Tornadus-Therian", tornadustherian);

    	Pokemon torracat = new Pokemon("Torracat");
    	torracat.setDexNumber(726);
    	torracat.setTypes("Fire", "(none)");
    	torracat.addAbilities("Blaze", "Intimidate");
    	torracat.setAllBaseStats(65, 85, 50, 80, 50, 90);
    	torracat.setWeight(25.0);
    	pokedex.put("Torracat", torracat);

    	Pokemon torterra = new Pokemon("Torterra");
    	torterra.setDexNumber(389);
    	torterra.setTypes("Grass", "Ground");
    	torterra.addAbilities("Overgrow", "Shell Armor");
    	torterra.setAllBaseStats(95, 109, 105, 75, 85, 56);
    	torterra.setWeight(310.0);
    	pokedex.put("Torterra", torterra);

    	Pokemon totodile = new Pokemon("Totodile");
    	totodile.setDexNumber(158);
    	totodile.setTypes("Water", "(none)");
    	totodile.addAbilities("Torrent", "Sheer Force");
    	totodile.setAllBaseStats(50, 65, 64, 44, 48, 43);
    	totodile.setWeight(9.5);
    	pokedex.put("Totodile", totodile);

    	Pokemon toucannon = new Pokemon("Toucannon");
    	toucannon.setDexNumber(733);
    	toucannon.setTypes("Normal", "Flying");
    	toucannon.addAbilities("Keen Eye", "Skill Link", "Sheer Force");
    	toucannon.setAllBaseStats(80, 120, 75, 75, 75, 60);
    	toucannon.setWeight(26.0);
    	pokedex.put("Toucannon", toucannon);

    	Pokemon toxapex = new Pokemon("Toxapex");
    	toxapex.setDexNumber(748);
    	toxapex.setTypes("Poison", "Water");
    	toxapex.addAbilities("Merciless", "Limber", "Regenerator");
    	toxapex.setAllBaseStats(50, 63, 152, 53, 142, 35);
    	toxapex.setWeight(14.5);
    	pokedex.put("Toxapex", toxapex);

    	Pokemon toxicroak = new Pokemon("Toxicroak");
    	toxicroak.setDexNumber(454);
    	toxicroak.setTypes("Poison", "Fighting");
    	toxicroak.addAbilities("Anticipation", "Dry Skin", "Poison Touch");
    	toxicroak.setAllBaseStats(83, 106, 65, 86, 65, 85);
    	toxicroak.setWeight(44.4);
    	pokedex.put("Toxicroak", toxicroak);

    	Pokemon tranquill = new Pokemon("Tranquill");
    	tranquill.setDexNumber(520);
    	tranquill.setTypes("Normal", "Flying");
    	tranquill.addAbilities("Big Pecks", "Super Luck", "Rivalry");
    	tranquill.setAllBaseStats(62, 77, 62, 50, 42, 65);
    	tranquill.setWeight(15.0);
    	pokedex.put("Tranquill", tranquill);

    	Pokemon trapinch = new Pokemon("Trapinch");
    	trapinch.setDexNumber(328);
    	trapinch.setTypes("Ground", "(none)");
    	trapinch.addAbilities("Hyper Cutter", "Arena Trap", "Sheer Force");
    	trapinch.setAllBaseStats(45, 100, 45, 45, 45, 10);
    	trapinch.setWeight(15.0);
    	pokedex.put("Trapinch", trapinch);

    	Pokemon treecko = new Pokemon("Treecko");
    	treecko.setDexNumber(252);
    	treecko.setTypes("Grass", "(none)");
    	treecko.addAbilities("Overgrow", "Unburden");
    	treecko.setAllBaseStats(40, 45, 35, 65, 55, 70);
    	treecko.setWeight(5.0);
    	pokedex.put("Treecko", treecko);

    	Pokemon trevenant = new Pokemon("Trevenant");
    	trevenant.setDexNumber(709);
    	trevenant.setTypes("Ghost", "Grass");
    	trevenant.addAbilities("Natural Cure", "Frisk", "Harvest");
    	trevenant.setAllBaseStats(85, 110, 76, 65, 82, 56);
    	trevenant.setWeight(71.0);
    	pokedex.put("Trevenant", trevenant);

    	Pokemon tropius = new Pokemon("Tropius");
    	tropius.setDexNumber(357);
    	tropius.setTypes("Grass", "Flying");
    	tropius.addAbilities("Chlorophyll", "Solar Power", "Harvest");
    	tropius.setAllBaseStats(99, 68, 83, 72, 87, 51);
    	tropius.setWeight(100.0);
    	pokedex.put("Tropius", tropius);

    	Pokemon trubbish = new Pokemon("Trubbish");
    	trubbish.setDexNumber(568);
    	trubbish.setTypes("Poison", "(none)");
    	trubbish.addAbilities("Stench", "Sticky Hold", "Aftermath");
    	trubbish.setAllBaseStats(50, 50, 62, 40, 62, 65);
    	trubbish.setWeight(31.0);
    	pokedex.put("Trubbish", trubbish);

    	Pokemon trumbeak = new Pokemon("Trumbeak");
    	trumbeak.setDexNumber(732);
    	trumbeak.setTypes("Normal", "Flying");
    	trumbeak.addAbilities("Keen Eye", "Skill Link", "Pickup");
    	trumbeak.setAllBaseStats(55, 85, 50, 40, 50, 75);
    	trumbeak.setWeight(14.8);
    	pokedex.put("Trumbeak", trumbeak);

    	Pokemon tsareena = new Pokemon("Tsareena");
    	tsareena.setDexNumber(763);
    	tsareena.setTypes("Grass", "(none)");
    	tsareena.addAbilities("Leaf Guard", "Queenly Majesty", "Sweet Veil");
    	tsareena.setAllBaseStats(72, 120, 98, 50, 98, 72);
    	tsareena.setWeight(21.4);
    	pokedex.put("Tsareena", tsareena);

    	Pokemon turtonator = new Pokemon("Turtonator");
    	turtonator.setDexNumber(776);
    	turtonator.setTypes("Fire", "Dragon");
    	turtonator.addAbilities("Shell Armor");
    	turtonator.setAllBaseStats(60, 78, 135, 91, 85, 36);
    	turtonator.setWeight(212.0);
    	pokedex.put("Turtonator", turtonator);

    	Pokemon turtwig = new Pokemon("Turtwig");
    	turtwig.setDexNumber(387);
    	turtwig.setTypes("Grass", "(none)");
    	turtwig.addAbilities("Overgrow", "Shell Armor");
    	turtwig.setAllBaseStats(55, 68, 64, 45, 55, 31);
    	turtwig.setWeight(10.2);
    	pokedex.put("Turtwig", turtwig);

    	Pokemon tympole = new Pokemon("Tympole");
    	tympole.setDexNumber(535);
    	tympole.setTypes("Water", "(none)");
    	tympole.addAbilities("Swift Swim", "Hydration", "Water Absorb");
    	tympole.setAllBaseStats(50, 50, 40, 50, 40, 64);
    	tympole.setWeight(4.5);
    	pokedex.put("Tympole", tympole);

    	Pokemon tynamo = new Pokemon("Tynamo");
    	tynamo.setDexNumber(602);
    	tynamo.setTypes("Electric", "(none)");
    	tynamo.addAbilities("Levitate");
    	tynamo.setAllBaseStats(35, 55, 40, 45, 40, 60);
    	tynamo.setWeight(0.3);
    	pokedex.put("Tynamo", tynamo);

    	Pokemon typenull = new Pokemon("Type: Null");
    	typenull.setDexNumber(772);
    	typenull.setTypes("Normal", "(none)");
    	typenull.addAbilities("Battle Armor");
    	typenull.setAllBaseStats(95, 95, 95, 95, 95, 59);
    	typenull.setWeight(120.5);
    	pokedex.put("Type: Null", typenull);

    	Pokemon typhlosion = new Pokemon("Typhlosion");
    	typhlosion.setDexNumber(157);
    	typhlosion.setTypes("Fire", "(none)");
    	typhlosion.addAbilities("Blaze", "Flash Fire");
    	typhlosion.setAllBaseStats(78, 84, 78, 109, 85, 100);
    	typhlosion.setWeight(79.5);
    	pokedex.put("Typhlosion", typhlosion);

    	Pokemon tyranitar = new Pokemon("Tyranitar");
    	tyranitar.setDexNumber(248);
    	tyranitar.setTypes("Rock", "Dark");
    	tyranitar.addAbilities("Sand Stream", "Unnerve");
    	tyranitar.setAllBaseStats(100, 134, 110, 95, 100, 61);
    	tyranitar.setWeight(202.0);
    	tyranitar.setFormes("Tyranitar", "Tyranitar-Mega");
    	pokedex.put("Tyranitar", tyranitar);

    	Pokemon tyranitarmega = new Pokemon("Tyranitar-Mega");
    	tyranitarmega.setDexNumber(248);
    	tyranitarmega.setTypes("Rock", "Dark");
    	tyranitarmega.addAbilities("Sand Stream");
    	tyranitarmega.setAllBaseStats(100, 164, 150, 95, 120, 71);
    	tyranitarmega.setWeight(255.0);
    	pokedex.put("Tyranitar-Mega", tyranitarmega);

    	Pokemon tyrantrum = new Pokemon("Tyrantrum");
    	tyrantrum.setDexNumber(697);
    	tyrantrum.setTypes("Rock", "Dragon");
    	tyrantrum.addAbilities("Strong Jaw", "Rock Head");
    	tyrantrum.setAllBaseStats(82, 121, 119, 69, 59, 71);
    	tyrantrum.setWeight(270.0);
    	pokedex.put("Tyrantrum", tyrantrum);

    	Pokemon tyrogue = new Pokemon("Tyrogue");
    	tyrogue.setDexNumber(236);
    	tyrogue.setTypes("Fighting", "(none)");
    	tyrogue.addAbilities("Guts", "Steadfast", "Vital Spirit");
    	tyrogue.setAllBaseStats(35, 35, 35, 35, 35, 35);
    	tyrogue.setWeight(21.0);
    	pokedex.put("Tyrogue", tyrogue);

    	Pokemon tyrunt = new Pokemon("Tyrunt");
    	tyrunt.setDexNumber(696);
    	tyrunt.setTypes("Rock", "Dragon");
    	tyrunt.addAbilities("Strong Jaw", "Sturdy");
    	tyrunt.setAllBaseStats(58, 89, 77, 45, 45, 48);
    	tyrunt.setWeight(26.0);
    	pokedex.put("Tyrunt", tyrunt);

    	Pokemon umbreon = new Pokemon("Umbreon");
    	umbreon.setDexNumber(197);
    	umbreon.setTypes("Dark", "(none)");
    	umbreon.addAbilities("Synchronize", "Inner Focus");
    	umbreon.setAllBaseStats(95, 65, 110, 60, 130, 65);
    	umbreon.setWeight(27.0);
    	pokedex.put("Umbreon", umbreon);

    	Pokemon unfezant = new Pokemon("Unfezant");
    	unfezant.setDexNumber(521);
    	unfezant.setTypes("Normal", "Flying");
    	unfezant.addAbilities("Big Pecks", "Super Luck", "Rivalry");
    	unfezant.setAllBaseStats(80, 115, 80, 65, 55, 93);
    	unfezant.setWeight(29.0);
    	pokedex.put("Unfezant", unfezant);

    	Pokemon unown = new Pokemon("Unown");
    	unown.setDexNumber(201);
    	unown.setTypes("Psychic", "(none)");
    	unown.addAbilities("Levitate");
    	unown.setAllBaseStats(48, 72, 48, 72, 48, 48);
    	unown.setWeight(5.0);
    	pokedex.put("Unown", unown);

    	Pokemon ursaring = new Pokemon("Ursaring");
    	ursaring.setDexNumber(217);
    	ursaring.setTypes("Normal", "(none)");
    	ursaring.addAbilities("Guts", "Quick Feet", "Unnerve");
    	ursaring.setAllBaseStats(90, 130, 75, 75, 75, 55);
    	ursaring.setWeight(125.8);
    	pokedex.put("Ursaring", ursaring);

    	Pokemon uxie = new Pokemon("Uxie");
    	uxie.setDexNumber(480);
    	uxie.setTypes("Psychic", "(none)");
    	uxie.addAbilities("Levitate");
    	uxie.setAllBaseStats(75, 75, 130, 75, 130, 95);
    	uxie.setWeight(0.3);
    	pokedex.put("Uxie", uxie);

    	Pokemon vanillish = new Pokemon("Vanillish");
    	vanillish.setDexNumber(583);
    	vanillish.setTypes("Ice", "(none)");
    	vanillish.addAbilities("Ice Body", "Snow Cloak", "Weak Armor");
    	vanillish.setAllBaseStats(51, 65, 65, 80, 75, 59);
    	vanillish.setWeight(41.0);
    	pokedex.put("Vanillish", vanillish);

    	Pokemon vanillite = new Pokemon("Vanillite");
    	vanillite.setDexNumber(582);
    	vanillite.setTypes("Ice", "(none)");
    	vanillite.addAbilities("Ice Body", "Snow Cloak", "Weak Armor");
    	vanillite.setAllBaseStats(36, 50, 50, 65, 60, 44);
    	vanillite.setWeight(5.7);
    	pokedex.put("Vanillite", vanillite);

    	Pokemon vanilluxe = new Pokemon("Vanilluxe");
    	vanilluxe.setDexNumber(584);
    	vanilluxe.setTypes("Ice", "(none)");
    	vanilluxe.addAbilities("Ice Body", "Snow Warning", "Weak Armor");
    	vanilluxe.setAllBaseStats(71, 95, 85, 110, 95, 79);
    	vanilluxe.setWeight(57.5);
    	pokedex.put("Vanilluxe", vanilluxe);

    	Pokemon vaporeon = new Pokemon("Vaporeon");
    	vaporeon.setDexNumber(134);
    	vaporeon.setTypes("Water", "(none)");
    	vaporeon.addAbilities("Water Absorb", "Hydration");
    	vaporeon.setAllBaseStats(130, 65, 60, 110, 95, 65);
    	vaporeon.setWeight(29.0);
    	pokedex.put("Vaporeon", vaporeon);

    	Pokemon venipede = new Pokemon("Venipede");
    	venipede.setDexNumber(543);
    	venipede.setTypes("Bug", "Poison");
    	venipede.addAbilities("Poison Point", "Swarm", "Speed Boost");
    	venipede.setAllBaseStats(30, 45, 59, 30, 39, 57);
    	venipede.setWeight(5.3);
    	pokedex.put("Venipede", venipede);

    	Pokemon venomoth = new Pokemon("Venomoth");
    	venomoth.setDexNumber(49);
    	venomoth.setTypes("Bug", "Poison");
    	venomoth.addAbilities("Shield Dust", "Tinted Lens", "Wonder Skin");
    	venomoth.setAllBaseStats(70, 65, 60, 90, 75, 90);
    	venomoth.setWeight(12.5);
    	pokedex.put("Venomoth", venomoth);

    	Pokemon venonat = new Pokemon("Venonat");
    	venonat.setDexNumber(48);
    	venonat.setTypes("Bug", "Poison");
    	venonat.addAbilities("Compound Eyes", "Tinted Lens", "Run Away");
    	venonat.setAllBaseStats(60, 55, 50, 40, 55, 45);
    	venonat.setWeight(30.0);
    	pokedex.put("Venonat", venonat);

    	Pokemon venusaur = new Pokemon("Venusaur");
    	venusaur.setDexNumber(3);
    	venusaur.setTypes("Grass", "Poison");
    	venusaur.addAbilities("Overgrow", "Chlorophyll");
    	venusaur.setAllBaseStats(80, 82, 83, 100, 100, 80);
    	venusaur.setWeight(100.0);
    	venusaur.setFormes("Venusaur", "Venusaur-Mega");
    	pokedex.put("Venusaur", venusaur);

    	Pokemon venusaurmega = new Pokemon("Venusaur-Mega");
    	venusaurmega.setDexNumber(3);
    	venusaurmega.setTypes("Grass", "Poison");
    	venusaurmega.addAbilities("Thick Fat");
    	venusaurmega.setAllBaseStats(80, 100, 123, 122, 120, 80);
    	venusaurmega.setWeight(155.5);
    	pokedex.put("Venusaur-Mega", venusaurmega);

    	Pokemon vespiquen = new Pokemon("Vespiquen");
    	vespiquen.setDexNumber(416);
    	vespiquen.setTypes("Bug", "Flying");
    	vespiquen.addAbilities("Pressure", "Unnerve");
    	vespiquen.setAllBaseStats(70, 80, 102, 80, 102, 40);
    	vespiquen.setWeight(38.5);
    	pokedex.put("Vespiquen", vespiquen);

    	Pokemon vibrava = new Pokemon("Vibrava");
    	vibrava.setDexNumber(329);
    	vibrava.setTypes("Ground", "Dragon");
    	vibrava.addAbilities("Levitate");
    	vibrava.setAllBaseStats(50, 70, 50, 50, 50, 70);
    	vibrava.setWeight(15.3);
    	pokedex.put("Vibrava", vibrava);

    	Pokemon victini = new Pokemon("Victini");
    	victini.setDexNumber(494);
    	victini.setTypes("Psychic", "Fire");
    	victini.addAbilities("Victory Star");
    	victini.setAllBaseStats(100, 100, 100, 100, 100, 100);
    	victini.setWeight(4.0);
    	pokedex.put("Victini", victini);

    	Pokemon victreebel = new Pokemon("Victreebel");
    	victreebel.setDexNumber(71);
    	victreebel.setTypes("Grass", "Poison");
    	victreebel.addAbilities("Chlorophyll", "Gluttony");
    	victreebel.setAllBaseStats(80, 105, 65, 100, 70, 70);
    	victreebel.setWeight(15.5);
    	pokedex.put("Victreebel", victreebel);

    	Pokemon vigoroth = new Pokemon("Vigoroth");
    	vigoroth.setDexNumber(288);
    	vigoroth.setTypes("Normal", "(none)");
    	vigoroth.addAbilities("Vital Spirit");
    	vigoroth.setAllBaseStats(80, 80, 80, 55, 55, 90);
    	vigoroth.setWeight(46.5);
    	pokedex.put("Vigoroth", vigoroth);

    	Pokemon vikavolt = new Pokemon("Vikavolt");
    	vikavolt.setDexNumber(738);
    	vikavolt.setTypes("Bug", "Electric");
    	vikavolt.addAbilities("Levitate");
    	vikavolt.setAllBaseStats(77, 70, 90, 145, 75, 43);
    	vikavolt.setWeight(45.0);
    	pokedex.put("Vikavolt", vikavolt);

    	Pokemon vikavolttotem = new Pokemon("Vikavolt-Totem");
    	vikavolttotem.setDexNumber(738);
    	vikavolttotem.setTypes("Bug", "Electric");
    	vikavolttotem.addAbilities("Levitate");
    	vikavolttotem.setAllBaseStats(77, 70, 90, 145, 75, 43);
    	vikavolttotem.setWeight(147.5);
    	pokedex.put("Vikavolt-Totem", vikavolttotem);

    	Pokemon vileplume = new Pokemon("Vileplume");
    	vileplume.setDexNumber(45);
    	vileplume.setTypes("Grass", "Poison");
    	vileplume.addAbilities("Chlorophyll", "Effect Spore");
    	vileplume.setAllBaseStats(75, 80, 85, 110, 90, 50);
    	vileplume.setWeight(18.6);
    	pokedex.put("Vileplume", vileplume);

    	Pokemon virizion = new Pokemon("Virizion");
    	virizion.setDexNumber(640);
    	virizion.setTypes("Grass", "Fighting");
    	virizion.addAbilities("Justified");
    	virizion.setAllBaseStats(91, 90, 72, 90, 129, 108);
    	virizion.setWeight(200.0);
    	pokedex.put("Virizion", virizion);

    	Pokemon vivillon = new Pokemon("Vivillon");
    	vivillon.setDexNumber(666);
    	vivillon.setTypes("Bug", "Flying");
    	vivillon.addAbilities("Shield Dust", "Compound Eyes", "Friend Guard");
    	vivillon.setAllBaseStats(80, 52, 50, 90, 50, 89);
    	vivillon.setWeight(17.0);
    	pokedex.put("Vivillon", vivillon);

    	Pokemon vivillonfancy = new Pokemon("Vivillon-Fancy");
    	vivillonfancy.setDexNumber(666);
    	vivillonfancy.setTypes("Bug", "Flying");
    	vivillonfancy.addAbilities("Shield Dust", "Compound Eyes");
    	vivillonfancy.setAllBaseStats(80, 52, 50, 90, 50, 89);
    	vivillonfancy.setWeight(17.0);
    	pokedex.put("Vivillon-Fancy", vivillonfancy);

    	Pokemon vivillonpokeball = new Pokemon("Vivillon-Pokeball");
    	vivillonpokeball.setDexNumber(666);
    	vivillonpokeball.setTypes("Bug", "Flying");
    	vivillonpokeball.addAbilities("Shield Dust", "Compound Eyes");
    	vivillonpokeball.setAllBaseStats(80, 52, 50, 90, 50, 89);
    	vivillonpokeball.setWeight(17.0);
    	pokedex.put("Vivillon-Pokeball", vivillonpokeball);

    	Pokemon volbeat = new Pokemon("Volbeat");
    	volbeat.setDexNumber(313);
    	volbeat.setTypes("Bug", "(none)");
    	volbeat.addAbilities("Illuminate", "Swarm", "Prankster");
    	volbeat.setAllBaseStats(65, 73, 75, 47, 85, 85);
    	volbeat.setWeight(17.7);
    	pokedex.put("Volbeat", volbeat);

    	Pokemon volcanion = new Pokemon("Volcanion");
    	volcanion.setDexNumber(721);
    	volcanion.setTypes("Fire", "Water");
    	volcanion.addAbilities("Water Absorb");
    	volcanion.setAllBaseStats(80, 110, 120, 130, 90, 70);
    	volcanion.setWeight(195.0);
    	pokedex.put("Volcanion", volcanion);

    	Pokemon volcarona = new Pokemon("Volcarona");
    	volcarona.setDexNumber(637);
    	volcarona.setTypes("Bug", "Fire");
    	volcarona.addAbilities("Flame Body", "Swarm");
    	volcarona.setAllBaseStats(85, 60, 65, 135, 105, 100);
    	volcarona.setWeight(46.0);
    	pokedex.put("Volcarona", volcarona);

    	Pokemon volkraken = new Pokemon("Volkraken");
    	volkraken.setDexNumber(-7);
    	volkraken.setTypes("Water", "Fire");
    	volkraken.addAbilities("Analytic", "Infiltrator", "Pressure");
    	volkraken.setAllBaseStats(100, 45, 80, 135, 100, 95);
    	volkraken.setWeight(44.5);
    	pokedex.put("Volkraken", volkraken);

    	Pokemon volkritter = new Pokemon("Volkritter");
    	volkritter.setDexNumber(-111);
    	volkritter.setTypes("Water", "Fire");
    	volkritter.addAbilities("Anticipation", "Infiltrator", "Unnerve");
    	volkritter.setAllBaseStats(60, 30, 50, 80, 60, 70);
    	volkritter.setWeight(15.0);
    	pokedex.put("Volkritter", volkritter);

    	Pokemon voltorb = new Pokemon("Voltorb");
    	voltorb.setDexNumber(100);
    	voltorb.setTypes("Electric", "(none)");
    	voltorb.addAbilities("Soundproof", "Static", "Aftermath");
    	voltorb.setAllBaseStats(40, 30, 50, 55, 55, 100);
    	voltorb.setWeight(10.4);
    	pokedex.put("Voltorb", voltorb);

    	Pokemon voodoll = new Pokemon("Voodoll");
    	voodoll.setDexNumber(-119);
    	voodoll.setTypes("Normal", "Dark");
    	voodoll.addAbilities("Volt Absorb", "Lightning Rod", "Cursed Body");
    	voodoll.setAllBaseStats(55, 40, 55, 75, 50, 70);
    	voodoll.setWeight(25.0);
    	pokedex.put("Voodoll", voodoll);

    	Pokemon voodoom = new Pokemon("Voodoom");
    	voodoom.setDexNumber(-61);
    	voodoom.setTypes("Fighting", "Dark");
    	voodoom.addAbilities("Volt Absorb", "Lightning Rod", "Cursed Body");
    	voodoom.setAllBaseStats(90, 85, 80, 105, 80, 110);
    	voodoom.setWeight(75.5);
    	pokedex.put("Voodoom", voodoom);

    	Pokemon vullaby = new Pokemon("Vullaby");
    	vullaby.setDexNumber(629);
    	vullaby.setTypes("Dark", "Flying");
    	vullaby.addAbilities("Big Pecks", "Overcoat", "Weak Armor");
    	vullaby.setAllBaseStats(70, 55, 75, 45, 65, 60);
    	vullaby.setWeight(9.0);
    	pokedex.put("Vullaby", vullaby);

    	Pokemon vulpix = new Pokemon("Vulpix");
    	vulpix.setDexNumber(37);
    	vulpix.setTypes("Fire", "(none)");
    	vulpix.addAbilities("Flash Fire", "Drought");
    	vulpix.setAllBaseStats(38, 41, 40, 50, 65, 65);
    	vulpix.setWeight(9.9);
    	pokedex.put("Vulpix", vulpix);

    	Pokemon vulpixalola = new Pokemon("Vulpix-Alola");
    	vulpixalola.setDexNumber(37);
    	vulpixalola.setTypes("Ice", "(none)");
    	vulpixalola.addAbilities("Snow Cloak", "Snow Warning");
    	vulpixalola.setAllBaseStats(38, 41, 40, 50, 65, 65);
    	vulpixalola.setWeight(9.9);
    	pokedex.put("Vulpix-Alola", vulpixalola);

    	Pokemon wailmer = new Pokemon("Wailmer");
    	wailmer.setDexNumber(320);
    	wailmer.setTypes("Water", "(none)");
    	wailmer.addAbilities("Water Veil", "Oblivious", "Pressure");
    	wailmer.setAllBaseStats(130, 70, 35, 70, 35, 60);
    	wailmer.setWeight(130.0);
    	pokedex.put("Wailmer", wailmer);

    	Pokemon wailord = new Pokemon("Wailord");
    	wailord.setDexNumber(321);
    	wailord.setTypes("Water", "(none)");
    	wailord.addAbilities("Water Veil", "Oblivious", "Pressure");
    	wailord.setAllBaseStats(170, 90, 45, 90, 45, 60);
    	wailord.setWeight(398.0);
    	pokedex.put("Wailord", wailord);

    	Pokemon walrein = new Pokemon("Walrein");
    	walrein.setDexNumber(365);
    	walrein.setTypes("Ice", "Water");
    	walrein.addAbilities("Thick Fat", "Ice Body", "Oblivious");
    	walrein.setAllBaseStats(110, 80, 90, 95, 90, 65);
    	walrein.setWeight(150.6);
    	pokedex.put("Walrein", walrein);

    	Pokemon wartortle = new Pokemon("Wartortle");
    	wartortle.setDexNumber(8);
    	wartortle.setTypes("Water", "(none)");
    	wartortle.addAbilities("Torrent", "Rain Dish");
    	wartortle.setAllBaseStats(59, 63, 80, 65, 80, 58);
    	wartortle.setWeight(22.5);
    	pokedex.put("Wartortle", wartortle);

    	Pokemon watchog = new Pokemon("Watchog");
    	watchog.setDexNumber(505);
    	watchog.setTypes("Normal", "(none)");
    	watchog.addAbilities("Illuminate", "Keen Eye", "Analytic");
    	watchog.setAllBaseStats(60, 85, 69, 60, 69, 77);
    	watchog.setWeight(27.0);
    	pokedex.put("Watchog", watchog);

    	Pokemon weavile = new Pokemon("Weavile");
    	weavile.setDexNumber(461);
    	weavile.setTypes("Dark", "Ice");
    	weavile.addAbilities("Pressure", "Pickpocket");
    	weavile.setAllBaseStats(70, 120, 65, 45, 85, 125);
    	weavile.setWeight(34.0);
    	pokedex.put("Weavile", weavile);

    	Pokemon weedle = new Pokemon("Weedle");
    	weedle.setDexNumber(13);
    	weedle.setTypes("Bug", "Poison");
    	weedle.addAbilities("Shield Dust", "Run Away");
    	weedle.setAllBaseStats(40, 35, 30, 20, 20, 50);
    	weedle.setWeight(3.2);
    	pokedex.put("Weedle", weedle);

    	Pokemon weepinbell = new Pokemon("Weepinbell");
    	weepinbell.setDexNumber(70);
    	weepinbell.setTypes("Grass", "Poison");
    	weepinbell.addAbilities("Chlorophyll", "Gluttony");
    	weepinbell.setAllBaseStats(65, 90, 50, 85, 45, 55);
    	weepinbell.setWeight(6.4);
    	pokedex.put("Weepinbell", weepinbell);

    	Pokemon weezing = new Pokemon("Weezing");
    	weezing.setDexNumber(110);
    	weezing.setTypes("Poison", "(none)");
    	weezing.addAbilities("Levitate");
    	weezing.setAllBaseStats(65, 90, 120, 85, 70, 60);
    	weezing.setWeight(9.5);
    	pokedex.put("Weezing", weezing);

    	Pokemon whimsicott = new Pokemon("Whimsicott");
    	whimsicott.setDexNumber(547);
    	whimsicott.setTypes("Grass", "Fairy");
    	whimsicott.addAbilities("Prankster", "Infiltrator", "Chlorophyll");
    	whimsicott.setAllBaseStats(60, 67, 85, 77, 75, 116);
    	whimsicott.setWeight(6.6);
    	pokedex.put("Whimsicott", whimsicott);

    	Pokemon whirlipede = new Pokemon("Whirlipede");
    	whirlipede.setDexNumber(544);
    	whirlipede.setTypes("Bug", "Poison");
    	whirlipede.addAbilities("Poison Point", "Swarm", "Speed Boost");
    	whirlipede.setAllBaseStats(40, 55, 99, 40, 79, 47);
    	whirlipede.setWeight(58.5);
    	pokedex.put("Whirlipede", whirlipede);

    	Pokemon whiscash = new Pokemon("Whiscash");
    	whiscash.setDexNumber(340);
    	whiscash.setTypes("Water", "Ground");
    	whiscash.addAbilities("Oblivious", "Anticipation", "Hydration");
    	whiscash.setAllBaseStats(110, 78, 73, 76, 71, 60);
    	whiscash.setWeight(23.6);
    	pokedex.put("Whiscash", whiscash);

    	Pokemon whismur = new Pokemon("Whismur");
    	whismur.setDexNumber(293);
    	whismur.setTypes("Normal", "(none)");
    	whismur.addAbilities("Soundproof", "Rattled");
    	whismur.setAllBaseStats(64, 51, 23, 51, 23, 28);
    	whismur.setWeight(16.3);
    	pokedex.put("Whismur", whismur);

    	Pokemon wigglytuff = new Pokemon("Wigglytuff");
    	wigglytuff.setDexNumber(40);
    	wigglytuff.setTypes("Normal", "Fairy");
    	wigglytuff.addAbilities("Cute Charm", "Competitive", "Frisk");
    	wigglytuff.setAllBaseStats(140, 70, 45, 85, 50, 45);
    	wigglytuff.setWeight(12.0);
    	pokedex.put("Wigglytuff", wigglytuff);

    	Pokemon wimpod = new Pokemon("Wimpod");
    	wimpod.setDexNumber(767);
    	wimpod.setTypes("Bug", "Water");
    	wimpod.addAbilities("Wimp Out");
    	wimpod.setAllBaseStats(25, 35, 40, 20, 30, 80);
    	wimpod.setWeight(12.0);
    	pokedex.put("Wimpod", wimpod);

    	Pokemon wingull = new Pokemon("Wingull");
    	wingull.setDexNumber(278);
    	wingull.setTypes("Water", "Flying");
    	wingull.addAbilities("Keen Eye", "Hydration", "Rain Dish");
    	wingull.setAllBaseStats(40, 30, 30, 55, 30, 85);
    	wingull.setWeight(9.5);
    	pokedex.put("Wingull", wingull);

    	Pokemon wishiwashi = new Pokemon("Wishiwashi");
    	wishiwashi.setDexNumber(746);
    	wishiwashi.setTypes("Water", "(none)");
    	wishiwashi.addAbilities("Schooling");
    	wishiwashi.setAllBaseStats(45, 20, 20, 25, 25, 40);
    	wishiwashi.setWeight(0.3);
    	wishiwashi.setFormes("Wishiwashi", "Wishiwashi-School");
    	pokedex.put("Wishiwashi", wishiwashi);

    	Pokemon wishiwashischool = new Pokemon("Wishiwashi-School");
    	wishiwashischool.setDexNumber(746);
    	wishiwashischool.setTypes("Water", "(none)");
    	wishiwashischool.addAbilities("Schooling");
    	wishiwashischool.setAllBaseStats(45, 140, 130, 140, 135, 30);
    	wishiwashischool.setWeight(78.6);
    	pokedex.put("Wishiwashi-School", wishiwashischool);

    	Pokemon wobbuffet = new Pokemon("Wobbuffet");
    	wobbuffet.setDexNumber(202);
    	wobbuffet.setTypes("Psychic", "(none)");
    	wobbuffet.addAbilities("Shadow Tag", "Telepathy");
    	wobbuffet.setAllBaseStats(190, 33, 58, 33, 58, 33);
    	wobbuffet.setWeight(28.5);
    	pokedex.put("Wobbuffet", wobbuffet);

    	Pokemon woobat = new Pokemon("Woobat");
    	woobat.setDexNumber(527);
    	woobat.setTypes("Psychic", "Flying");
    	woobat.addAbilities("Unaware", "Klutz", "Simple");
    	woobat.setAllBaseStats(65, 45, 43, 55, 43, 72);
    	woobat.setWeight(2.1);
    	pokedex.put("Woobat", woobat);

    	Pokemon wooper = new Pokemon("Wooper");
    	wooper.setDexNumber(194);
    	wooper.setTypes("Water", "Ground");
    	wooper.addAbilities("Damp", "Water Absorb", "Unaware");
    	wooper.setAllBaseStats(55, 45, 45, 25, 25, 15);
    	wooper.setWeight(8.5);
    	pokedex.put("Wooper", wooper);

    	Pokemon wormadam = new Pokemon("Wormadam");
    	wormadam.setDexNumber(413);
    	wormadam.setTypes("Bug", "Grass");
    	wormadam.addAbilities("Anticipation", "Overcoat");
    	wormadam.setAllBaseStats(60, 59, 85, 79, 105, 36);
    	wormadam.setWeight(6.5);
    	pokedex.put("Wormadam", wormadam);

    	Pokemon wormadamsandy = new Pokemon("Wormadam-Sandy");
    	wormadamsandy.setDexNumber(413);
    	wormadamsandy.setTypes("Bug", "Ground");
    	wormadamsandy.addAbilities("Anticipation", "Overcoat");
    	wormadamsandy.setAllBaseStats(60, 79, 105, 59, 85, 36);
    	wormadamsandy.setWeight(6.5);
    	pokedex.put("Wormadam-Sandy", wormadamsandy);

    	Pokemon wormadamtrash = new Pokemon("Wormadam-Trash");
    	wormadamtrash.setDexNumber(413);
    	wormadamtrash.setTypes("Bug", "Steel");
    	wormadamtrash.addAbilities("Anticipation", "Overcoat");
    	wormadamtrash.setAllBaseStats(60, 69, 95, 69, 95, 36);
    	wormadamtrash.setWeight(6.5);
    	pokedex.put("Wormadam-Trash", wormadamtrash);

    	Pokemon wurmple = new Pokemon("Wurmple");
    	wurmple.setDexNumber(265);
    	wurmple.setTypes("Bug", "(none)");
    	wurmple.addAbilities("Shield Dust", "Run Away");
    	wurmple.setAllBaseStats(45, 45, 35, 20, 30, 20);
    	wurmple.setWeight(3.6);
    	pokedex.put("Wurmple", wurmple);

    	Pokemon wynaut = new Pokemon("Wynaut");
    	wynaut.setDexNumber(360);
    	wynaut.setTypes("Psychic", "(none)");
    	wynaut.addAbilities("Shadow Tag", "Telepathy");
    	wynaut.setAllBaseStats(95, 23, 48, 23, 48, 23);
    	wynaut.setWeight(14.0);
    	pokedex.put("Wynaut", wynaut);

    	Pokemon xatu = new Pokemon("Xatu");
    	xatu.setDexNumber(178);
    	xatu.setTypes("Psychic", "Flying");
    	xatu.addAbilities("Synchronize", "Early Bird", "Magic Bounce");
    	xatu.setAllBaseStats(65, 75, 70, 95, 70, 95);
    	xatu.setWeight(15.0);
    	pokedex.put("Xatu", xatu);

    	Pokemon xerneas = new Pokemon("Xerneas");
    	xerneas.setDexNumber(716);
    	xerneas.setTypes("Fairy", "(none)");
    	xerneas.addAbilities("Fairy Aura");
    	xerneas.setAllBaseStats(126, 131, 95, 131, 98, 99);
    	xerneas.setWeight(215.0);
    	pokedex.put("Xerneas", xerneas);

    	Pokemon xurkitree = new Pokemon("Xurkitree");
    	xurkitree.setDexNumber(796);
    	xurkitree.setTypes("Electric", "(none)");
    	xurkitree.addAbilities("Beast Boost");
    	xurkitree.setAllBaseStats(83, 89, 71, 173, 71, 83);
    	xurkitree.setWeight(100.0);
    	pokedex.put("Xurkitree", xurkitree);

    	Pokemon yamask = new Pokemon("Yamask");
    	yamask.setDexNumber(562);
    	yamask.setTypes("Ghost", "(none)");
    	yamask.addAbilities("Mummy");
    	yamask.setAllBaseStats(38, 30, 85, 55, 65, 30);
    	yamask.setWeight(1.5);
    	pokedex.put("Yamask", yamask);

    	Pokemon yanma = new Pokemon("Yanma");
    	yanma.setDexNumber(193);
    	yanma.setTypes("Bug", "Flying");
    	yanma.addAbilities("Speed Boost", "Compound Eyes", "Frisk");
    	yanma.setAllBaseStats(65, 65, 45, 75, 45, 95);
    	yanma.setWeight(38.0);
    	pokedex.put("Yanma", yanma);

    	Pokemon yanmega = new Pokemon("Yanmega");
    	yanmega.setDexNumber(469);
    	yanmega.setTypes("Bug", "Flying");
    	yanmega.addAbilities("Speed Boost", "Tinted Lens", "Frisk");
    	yanmega.setAllBaseStats(86, 76, 86, 116, 56, 95);
    	yanmega.setWeight(51.5);
    	pokedex.put("Yanmega", yanmega);

    	Pokemon yungoos = new Pokemon("Yungoos");
    	yungoos.setDexNumber(734);
    	yungoos.setTypes("Normal", "(none)");
    	yungoos.addAbilities("Stakeout", "Strong Jaw", "Adaptability");
    	yungoos.setAllBaseStats(48, 70, 30, 30, 30, 45);
    	yungoos.setWeight(6.0);
    	pokedex.put("Yungoos", yungoos);

    	Pokemon yveltal = new Pokemon("Yveltal");
    	yveltal.setDexNumber(717);
    	yveltal.setTypes("Dark", "Flying");
    	yveltal.addAbilities("Dark Aura");
    	yveltal.setAllBaseStats(126, 131, 95, 131, 98, 99);
    	yveltal.setWeight(203.0);
    	pokedex.put("Yveltal", yveltal);

    	Pokemon zangoose = new Pokemon("Zangoose");
    	zangoose.setDexNumber(335);
    	zangoose.setTypes("Normal", "(none)");
    	zangoose.addAbilities("Immunity", "Toxic Boost");
    	zangoose.setAllBaseStats(73, 115, 60, 60, 60, 90);
    	zangoose.setWeight(40.3);
    	pokedex.put("Zangoose", zangoose);

    	Pokemon zapdos = new Pokemon("Zapdos");
    	zapdos.setDexNumber(145);
    	zapdos.setTypes("Electric", "Flying");
    	zapdos.addAbilities("Pressure", "Static");
    	zapdos.setAllBaseStats(90, 90, 85, 125, 90, 100);
    	zapdos.setWeight(52.6);
    	pokedex.put("Zapdos", zapdos);

    	Pokemon zebstrika = new Pokemon("Zebstrika");
    	zebstrika.setDexNumber(523);
    	zebstrika.setTypes("Electric", "(none)");
    	zebstrika.addAbilities("Lightning Rod", "Motor Drive", "Sap Sipper");
    	zebstrika.setAllBaseStats(75, 100, 63, 80, 63, 116);
    	zebstrika.setWeight(79.5);
    	pokedex.put("Zebstrika", zebstrika);

    	Pokemon zekrom = new Pokemon("Zekrom");
    	zekrom.setDexNumber(644);
    	zekrom.setTypes("Dragon", "Electric");
    	zekrom.addAbilities("Teravolt");
    	zekrom.setAllBaseStats(100, 150, 120, 120, 100, 90);
    	zekrom.setWeight(345.0);
    	pokedex.put("Zekrom", zekrom);

    	Pokemon zeraora = new Pokemon("Zeraora");
    	zeraora.setDexNumber(807);
    	zeraora.setTypes("Electric", "(none)");
    	zeraora.addAbilities("Volt Absorb");
    	zeraora.setAllBaseStats(88, 112, 75, 102, 80, 143);
    	zeraora.setWeight(44.5);
    	pokedex.put("Zeraora", zeraora);

    	Pokemon zigzagoon = new Pokemon("Zigzagoon");
    	zigzagoon.setDexNumber(263);
    	zigzagoon.setTypes("Normal", "(none)");
    	zigzagoon.addAbilities("Pickup", "Gluttony", "Quick Feet");
    	zigzagoon.setAllBaseStats(38, 30, 41, 30, 41, 60);
    	zigzagoon.setWeight(17.5);
    	pokedex.put("Zigzagoon", zigzagoon);

    	Pokemon zoroark = new Pokemon("Zoroark");
    	zoroark.setDexNumber(571);
    	zoroark.setTypes("Dark", "(none)");
    	zoroark.addAbilities("Illusion");
    	zoroark.setAllBaseStats(60, 105, 60, 120, 60, 105);
    	zoroark.setWeight(81.1);
    	pokedex.put("Zoroark", zoroark);

    	Pokemon zorua = new Pokemon("Zorua");
    	zorua.setDexNumber(570);
    	zorua.setTypes("Dark", "(none)");
    	zorua.addAbilities("Illusion");
    	zorua.setAllBaseStats(40, 65, 40, 80, 40, 65);
    	zorua.setWeight(12.5);
    	pokedex.put("Zorua", zorua);

    	Pokemon zubat = new Pokemon("Zubat");
    	zubat.setDexNumber(41);
    	zubat.setTypes("Poison", "Flying");
    	zubat.addAbilities("Inner Focus", "Infiltrator");
    	zubat.setAllBaseStats(40, 45, 35, 30, 40, 55);
    	zubat.setWeight(7.5);
    	pokedex.put("Zubat", zubat);

    	Pokemon zweilous = new Pokemon("Zweilous");
    	zweilous.setDexNumber(634);
    	zweilous.setTypes("Dark", "Dragon");
    	zweilous.addAbilities("Hustle");
    	zweilous.setAllBaseStats(72, 85, 70, 65, 70, 58);
    	zweilous.setWeight(50.0);
    	pokedex.put("Zweilous", zweilous);

    	Pokemon zygarde = new Pokemon("Zygarde");
    	zygarde.setDexNumber(718);
    	zygarde.setTypes("Dragon", "Ground");
    	zygarde.addAbilities("Aura Break", "Power Construct");
    	zygarde.setAllBaseStats(108, 100, 121, 81, 95, 95);
    	zygarde.setWeight(305.0);
    	zygarde.setFormes("Zygarde", "Zygarde-10%", "Zygarde-Complete");
    	pokedex.put("Zygarde", zygarde);

    	Pokemon zygarde10 = new Pokemon("Zygarde-10%");
    	zygarde10.setDexNumber(718);
    	zygarde10.setTypes("Dragon", "Ground");
    	zygarde10.addAbilities("Aura Break", "Power Construct");
    	zygarde10.setAllBaseStats(54, 100, 71, 61, 85, 115);
    	zygarde10.setWeight(33.5);
    	pokedex.put("Zygarde-10%", zygarde10);

    	Pokemon zygardecomplete = new Pokemon("Zygarde-Complete");
    	zygardecomplete.setDexNumber(718);
    	zygardecomplete.setTypes("Dragon", "Ground");
    	zygardecomplete.addAbilities("Power Construct");
    	zygardecomplete.setAllBaseStats(216, 100, 121, 91, 95, 85);
    	zygardecomplete.setWeight(610.0);
    	pokedex.put("Zygarde-Complete", zygardecomplete);
    }
}
