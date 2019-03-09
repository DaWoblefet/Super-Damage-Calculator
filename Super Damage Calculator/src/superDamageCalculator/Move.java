/* Models a move. Mostly getters and setters for various properties. */

package superDamageCalculator;

public class Move
{
	private String name;
	private int bp;
	private int zbp;
	private String category; //Status, Physical, Special, and Psyshock effect
	private String type;

	private boolean isSpread;
	private boolean makesContact;
	private boolean hasSecondaryEffect;
	private boolean isSignatureZ;
	private boolean hasRecoil;
	private boolean isTwoHit;
	private boolean isMultiHit;
	private boolean isPunch;
	private boolean isPulse;
	private boolean isBite;
	private boolean isSound;
	private boolean isBullet;
	private boolean hasSpecialModifier;
	private boolean ignoresDefenseBoosts;
	private boolean ignoresAbilities;

	public Move(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public int getBP() 
	{
		return bp;
	}


	public void setBP(int bp) 
	{
		this.bp = bp;
	}


	public int getZBP() 
	{
		return zbp;
	}


	public void setZBP(int zbp) 
	{
		this.zbp = zbp;
	}


	public String getCategory() 
	{
		return category;
	}


	public void setCategory(String category) 
	{
		this.category = category;
	}


	public String getType() 
	{
		return type;
	}


	public void setType(String type) 
	{
		this.type = type;
	}


	public boolean isSpread() 
	{
		return isSpread;
	}


	public void setSpread(boolean isSpread) 
	{
		this.isSpread = isSpread;
	}


	public boolean getMakesContact() 
	{
		return makesContact;
	}


	public void setMakesContact(boolean makesContact) 
	{
		this.makesContact = makesContact;
	}


	public boolean getHasSecondaryEffect() 
	{
		return hasSecondaryEffect;
	}


	public void setHasSecondaryEffect(boolean hasSecondaryEffect) 
	{
		this.hasSecondaryEffect = hasSecondaryEffect;
	}


	public boolean getIsSignatureZ() 
	{
		return isSignatureZ;
	}


	public void setSignatureZ(boolean isSignatureZ) 
	{
		this.isSignatureZ = isSignatureZ;
	}


	public boolean getHasRecoil() 
	{
		return hasRecoil;
	}


	public void setHasRecoil(boolean hasRecoil) 
	{
		this.hasRecoil = hasRecoil;
	}


	public boolean isTwoHit() 
	{
		return isTwoHit;
	}


	public void setTwoHit(boolean isTwoHit) 
	{
		this.isTwoHit = isTwoHit;
	}


	public boolean isMultiHit() 
	{
		return isMultiHit;
	}


	public void setMultiHit(boolean isMultiHit) 
	{
		this.isMultiHit = isMultiHit;
	}


	public boolean isPunch() 
	{
		return isPunch;
	}


	public void setPunch(boolean isPunch) 
	{
		this.isPunch = isPunch;
	}


	public boolean isPulse() 
	{
		return isPulse;
	}


	public void setPulse(boolean isPulse) 
	{
		this.isPulse = isPulse;
	}


	public boolean isBite() 
	{
		return isBite;
	}


	public void setBite(boolean isBite) 
	{
		this.isBite = isBite;
	}


	public boolean isSound() 
	{
		return isSound;
	}


	public void setSound(boolean isSound) 
	{
		this.isSound = isSound;
	}


	public boolean isBullet() 
	{
		return isBullet;
	}


	public void setBullet(boolean isBullet) 
	{
		this.isBullet = isBullet;
	}


	public boolean hasSpecialModifier() 
	{
		return hasSpecialModifier;
	}


	public void setHasSpecialModifier(boolean hasSpecialModifier) 
	{
		this.hasSpecialModifier = hasSpecialModifier;
	}


	public boolean isIgnoresDefenseBoosts() 
	{
		return ignoresDefenseBoosts;
	}

	public void setIgnoresDefenseBoosts(boolean ignoresDefenseBoosts) 
	{
		this.ignoresDefenseBoosts = ignoresDefenseBoosts;
	}

	public boolean isIgnoresAbilities()
	{
		return ignoresAbilities;
	}

	public void setIgnoresAbilities(boolean ignoresAbilities)
	{
		this.ignoresAbilities = ignoresAbilities;
	}
}
