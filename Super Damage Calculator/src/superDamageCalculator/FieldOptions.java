/* The back-end / logical representation of the field options in
 * the middle of the screen. */

package superDamageCalculator;

public class FieldOptions
{
	private String format;
	private String terrain;
	private String weather;
	private boolean isFairyAura;
	private boolean isDarkAura;
	private boolean isAuraBreak;
	
	private SideFieldOptions leftSideOptions = new SideFieldOptions(true);
	private SideFieldOptions rightSideOptions = new SideFieldOptions(false);
	
	
	public String getFormat() 
	{
		return format;
	}
	public void setFormat(String format) 
	{
		this.format = format;
	}
	public String getTerrain() 
	{
		return terrain;
	}
	public void setTerrain(String terrain) 
	{
		this.terrain = terrain;
	}
	public String getWeather() 
	{
		return weather;
	}
	public void setWeather(String weather) 
	{
		this.weather = weather;
	}
	public boolean isFairyAura() 
	{
		return isFairyAura;
	}
	public void setFairyAura(boolean isFairyAura) 
	{
		this.isFairyAura = isFairyAura;
	}
	public boolean isDarkAura() 
	{
		return isDarkAura;
	}
	public void setDarkAura(boolean isDarkAura) 
	{
		this.isDarkAura = isDarkAura;
	}
	public boolean isAuraBreak() 
	{
		return isAuraBreak;
	}
	public void setAuraBreak(boolean isAuraBreak) 
	{
		this.isAuraBreak = isAuraBreak;
	}
	public SideFieldOptions getLeftSideOptions() 
	{
		return leftSideOptions;
	}
	public void setLeftSideOptions(SideFieldOptions leftSideOptions) 
	{
		this.leftSideOptions = leftSideOptions;
	}
	public SideFieldOptions getRightSideOptions() 
	{
		return rightSideOptions;
	}
	public void setRightSideOptions(SideFieldOptions rightSideOptions) 
	{
		this.rightSideOptions = rightSideOptions;
	}
}
