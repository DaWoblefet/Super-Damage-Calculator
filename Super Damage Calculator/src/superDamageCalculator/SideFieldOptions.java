/* The back-end / logical representation of field options, e.g. Helping Hand. */

package superDamageCalculator;

public class SideFieldOptions
{
	private boolean isLeftSide; //if false, it is the right side
	private boolean isHelpingHand;
	private boolean isProtect;
	private boolean isReflect;
	private boolean isLightScreen;
	private boolean isAuroraVeil;
	private boolean isFriendGuard;
	
	
	public SideFieldOptions(boolean isLeftSide)
	{
		this.isLeftSide = isLeftSide;
	}
	
	public boolean isLeftSide()
	{
		return isLeftSide;
	}
	
	public boolean isHelpingHand()
	{
		return isHelpingHand;
	}
	public void setHelpingHand(boolean isHelpingHand)
	{
		this.isHelpingHand = isHelpingHand;
	}
	public boolean isProtect()
	{
		return isProtect;
	}
	public void setProtect(boolean isProtect)
	{
		this.isProtect = isProtect;
	}
	public boolean isReflect()
	{
		return isReflect;
	}
	public void setReflect(boolean isReflect)
	{
		this.isReflect = isReflect;
	}
	public boolean isLightScreen()
	{
		return isLightScreen;
	}
	public void setLightScreen(boolean isLightScreen)
	{
		this.isLightScreen = isLightScreen;
	}
	public boolean isAuroraVeil()
	{
		return isAuroraVeil;
	}
	public void setAuroraVeil(boolean isAuroraVeil)
	{
		this.isAuroraVeil = isAuroraVeil;
	}
	public boolean isFriendGuard()
	{
		return isFriendGuard;
	}
	public void setFriendGuard(boolean isFriendGuard)
	{
		this.isFriendGuard = isFriendGuard;
	}	
}
