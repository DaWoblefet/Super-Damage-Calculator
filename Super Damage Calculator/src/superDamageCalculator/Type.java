/* Represents a Pokemon's type as an integer. Uses Bulbapedia's type chart as a model for my own chart.
 * https://bulbapedia.bulbagarden.net/wiki/Type#Type_chart */

package superDamageCalculator;
import java.util.HashMap;

public class Type
{
	public HashMap<String, Integer> types = new HashMap<String, Integer>();
	public double typeChart[][];

	public Type()
	{
		init();
		initTypeChart();
	}

	public void init()
	{
		types.put("Normal", 0);
		types.put("Fighting", 1);
		types.put("Flying", 2);
		types.put("Poison", 3);
		types.put("Ground", 4);
		types.put("Rock", 5);
		types.put("Bug", 6);
		types.put("Ghost", 7);
		types.put("Steel", 8);
		types.put("Fire", 9);
		types.put("Water", 10);
		types.put("Grass", 11);
		types.put("Electric", 12);
		types.put("Psychic", 13);
		types.put("Ice", 14);
		types.put("Dragon", 15);
		types.put("Dark", 16);
		types.put("Fairy", 17);
		types.put("Typeless", 18);
		types.put("(none)", 19);
	}

	public void initTypeChart()
	{
		double immune = 0; //immune type-wise
		double resist = 0.5; //not very effective
		double normal = 1; //neutral effectiveness
		double strong = 2; //super effective

		/* [Attacking type][Defending type]
		typeChart[Fire][Water] = not very effective; typeChart[Water][Fire] = super effective;*/
		double typeChart[][] =
		{
				//Normal Fighting Flying Poison  Ground  Rock    Bug     Ghost   Steel   Fire    Water   Grass  Electric Psychic Ice     Dragon  Dark    Fairy   Typeless (none)
/* Normal */	{normal, normal, normal, normal, normal, resist, normal, immune, resist, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal},
/* Fighting */	{strong, normal, resist, resist, normal, strong, resist, immune, strong, normal, normal, normal, normal, resist, strong, normal, strong, resist, normal, normal},
/* Flying */	{normal, strong, normal, normal, normal, resist, strong, normal, resist, normal, normal, strong, resist, normal, normal, normal, normal, normal, normal, normal},
/* Poison */	{normal, normal, normal, resist, resist, resist, normal, resist, immune, normal, normal, strong, normal, normal, normal, normal, normal, strong, normal, normal},
/* Ground */	{normal, normal, immune, strong, normal, strong, resist, normal, strong, strong, normal, resist, strong, normal, normal, normal, normal, normal, normal, normal},
/* Rock */		{normal, resist, strong, normal, resist, normal, strong, normal, resist, strong, normal, normal, normal, normal, strong, normal, normal, normal, normal, normal},
/* Bug */		{normal, resist, resist, resist, normal, normal, normal, resist, resist, resist, normal, strong, normal, strong, normal, normal, strong, resist, normal, normal},
/* Ghost */		{immune, normal, normal, normal, normal, normal, normal, strong, normal, normal, normal, normal, normal, strong, normal, normal, resist, normal, normal, normal},
/* Steel */		{normal, normal, normal, normal, normal, strong, normal, normal, resist, resist, resist, normal, resist, normal, strong, normal, normal, strong, normal, normal},
/* Fire */		{normal, normal, normal, normal, normal, resist, strong, normal, strong, resist, resist, strong, normal, normal, strong, resist, normal, normal, normal, normal},
/* Water */		{normal, normal, normal, normal, strong, strong, normal, normal, normal, strong, resist, resist, normal, normal, normal, resist, normal, normal, normal, normal},
/* Grass */		{normal, normal, resist, resist, strong, strong, resist, normal, resist, resist, strong, resist, normal, normal, normal, resist, normal, normal, normal, normal},
/* Electric */	{normal, normal, strong, normal, immune, normal, normal, normal, normal, normal, strong, resist, resist, normal, normal, resist, normal, normal, normal, normal},
/* Psychic */	{normal, strong, normal, strong, normal, normal, normal, normal, resist, normal, normal, normal, normal, resist, normal, normal, immune, normal, normal, normal},
/* Ice */		{normal, normal, strong, normal, strong, normal, normal, normal, resist, resist, resist, strong, normal, normal, resist, strong, normal, normal, normal, normal},
/* Dragon */	{normal, normal, normal, normal, normal, normal, normal, normal, resist, normal, normal, normal, normal, normal, normal, strong, normal, immune, normal, normal},
/* Dark */		{normal, resist, normal, normal, normal, normal, normal, strong, normal, normal, normal, normal, normal, strong, normal, normal, resist, resist, normal, normal},
/* Fairy */		{normal, strong, normal, resist, normal, normal, normal, normal, resist, resist, normal, normal, normal, normal, normal, strong, strong, normal, normal, normal},
/* Typeless */	{normal, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal},
/* (none) */	{normal, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal, normal}
		};

		this.typeChart = typeChart;
	}
}

