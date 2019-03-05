package superDamageCalculator;

/* Associates a Nature with a particular number. Mostly for the
Nature combobox, the application in the stat formula is done in Stats.java */

import java.util.HashMap;

public class Nature
{
	public HashMap<String, Integer> natures = new HashMap<String, Integer>();

	public Nature()
	{
		init();
	}

	public void init()
	{
		natures.put("Adamant", 0);
		natures.put("Bashful", 1);
		natures.put("Bold", 2);
		natures.put("Brave", 3);
		natures.put("Calm", 4);
		natures.put("Careful", 5);
		natures.put("Docile", 6);
		natures.put("Gentle", 7);
		natures.put("Hardy", 8);
		natures.put("Hasty", 9);
		natures.put("Impish", 10);
		natures.put("Jolly", 11);
		natures.put("Lax", 12);
		natures.put("Lonely", 13);
		natures.put("Mild", 14);
		natures.put("Modest", 15);
		natures.put("Naive", 16);
		natures.put("Naughty", 17);
		natures.put("Quiet", 18);
		natures.put("Quirky", 19);
		natures.put("Rash", 20);
		natures.put("Relaxed", 21);
		natures.put("Sassy", 22);
		natures.put("Serious", 23);
		natures.put("Timid", 24);
	}
}
