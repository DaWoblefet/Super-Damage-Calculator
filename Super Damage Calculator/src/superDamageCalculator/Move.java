/* Models a move. Mostly getters and setters for various properties.
TODO: maybe refactor category in a similar way to typeConstants? */

package superDamageCalculator;

public class Move
{
	private String name;
	private int bp;
	private int zbp;
	private int category; //0 = status; 1 = physical; 2 = special, 3 = Psyshock effect
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
	private boolean ignoresDefenseBoosts;


	public Move(String name)
	{
		this.name = name;
	}

	public void setBP(int bp)
	{
		this.bp = bp;
	}

	public void setZBP(int zbp)
	{
		this.zbp = zbp;
	}

	public void setCategory(int category)
	{
		this.category = category;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public void setIsSpread(boolean isSpread)
	{
		this.isSpread = isSpread;
	}

	public void setMakesContact(boolean makesContact)
	{
		this.makesContact = makesContact;
	}

	public void setHasSecondaryEffect(boolean hasSecondaryEffect)
	{
		this.hasSecondaryEffect = hasSecondaryEffect;
	}

	public void setIsSignatureZ(boolean isSignatureZ)
	{
		this.isSignatureZ = isSignatureZ;
	}

	public void setHasRecoil(boolean hasRecoil)
	{
		this.hasRecoil = hasRecoil;
	}

	public void setIsTwoHit(boolean isTwoHit)
	{
		this.isTwoHit = isTwoHit;
	}

	public void setIsMultiHit(boolean isMultiHit)
	{
		this.isMultiHit = isMultiHit;
	}

	public void setIsPunch(boolean isPunch)
	{
		this.isPunch = isPunch;
	}

	public void setIsPulse(boolean isPulse)
	{
		this.isPulse = isPulse;
	}

	public void setIsBite(boolean isBite)
	{
		this.isBite = isBite;
	}

	public void setIgnoresDefenseBoosts(boolean ignoresDefenseBoosts)
	{
		this.ignoresDefenseBoosts = ignoresDefenseBoosts;
	}

	public String getName()
	{
		return this.name;
	}

	public int getBP()
	{
		return this.bp;
	}

	public int getZBP()
	{
		return this.zbp;
	}

	public int getCategory()
	{
		return this.category;
	}

	public String getType()
	{
		return this.type;
	}

	public boolean getIsSpread()
	{
		return this.isSpread;
	}

	public boolean getMakesContact()
	{
		return this.makesContact;
	}

	public boolean getHasSecondaryEffect()
	{
		return this.hasSecondaryEffect;
	}

	public boolean getIsSignatureZ()
	{
		return this.isSignatureZ;
	}

	public boolean getHasRecoil()
	{
		return this.hasRecoil;
	}

	public boolean getIsTwoHit()
	{
		return this.isTwoHit;
	}

	public boolean getIsMultiHit()
	{
		return this.isMultiHit;
	}

	public boolean getIsPunch()
	{
		return this.isPunch;
	}

	public boolean getIsPulse()
	{
		return this.isPulse;
	}

	public boolean getIsBite()
	{
		return this.isBite;
	}

	public boolean getIgnoresDefenseBoosts()
	{
		return this.ignoresDefenseBoosts;
	}
}
