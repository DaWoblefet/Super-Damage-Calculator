/* Models an item. Mostly getters and setters for various properties. */

package superDamageCalculator;

public class Item
{
	private String name;
	private boolean isBerry;
	private boolean isResistBerry;
	private String naturalGiftType;
	private int naturalGiftBP;
	
	private String typeAssociated;
	private boolean isTypeBoosting;
	private boolean isPlate;
	private boolean isMemory;
	private boolean isGem;
	private boolean isDrive;
	private boolean isZCrystal;
	private boolean isMegaStone;

	private int flingBP;
	private boolean halvesSpeed;
	
	public Item(String name)
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
	
	public boolean isBerry()
	{
		return isBerry;
	}
	
	public void setBerry(boolean isBerry)
	{
		this.isBerry = isBerry;
	}
	
	public boolean isResistBerry()
	{
		return isResistBerry;
	}
	
	public void setResistBerry(boolean isResistBerry)
	{
		this.isResistBerry = isResistBerry;
	}
	
	public String getNaturalGiftType() 
	{
		return naturalGiftType;
	}
	
	public void setNaturalGiftType(String naturalGiftType)
	{
		this.naturalGiftType = naturalGiftType;
	}
	
	public int getNaturalGiftBP() 
	{
		return naturalGiftBP;
	}
	
	public void setNaturalGiftBP(int naturalGiftBP) 
	{
		this.naturalGiftBP = naturalGiftBP;
	}
	
	public boolean isPlate() 
	{
		return isPlate;
	}
	
	public void setPlate(boolean isPlate) 
	{
		this.isPlate = isPlate;
	}
	
	public boolean isMemory() 
	{
		return isMemory;
	}
	
	public void setMemory(boolean isMemory)
	{
		this.isMemory = isMemory;
	}
	
	public boolean isGem() 
	{
		return isGem;
	}
	
	public void setGem(boolean isGem) 
	{
		this.isGem = isGem;
	}
	
	public boolean isDrive() 
	{
		return isDrive;
	}
	
	public void setDrive(boolean isDrive)
	{
		this.isDrive = isDrive;
	}
	
	public boolean isZCrystal() 
	{
		return isZCrystal;
	}
	
	public void setZCrystal(boolean isZCrystal) 
	{
		this.isZCrystal = isZCrystal;
	}
	
	public boolean isTypeBoosting() 
	{
		return isTypeBoosting;
	}
	
	public void setTypeBoosting(boolean isTypeBoosting) 
	{
		this.isTypeBoosting = isTypeBoosting;
	}
	
	public String getTypeAssociated() 
	{
		return typeAssociated;
	}
	
	public void setTypeAssociated(String typeAssociated) 
	{
		this.typeAssociated = typeAssociated;
	}
	
	public int getFlingBP() 
	{
		return flingBP;
	}
	
	public void setFlingBP(int flingBP) 
	{
		this.flingBP = flingBP;
	}
	
	public boolean isHalvesSpeed() 
	{
		return halvesSpeed;
	}
	
	public void setHalvesSpeed(boolean halvesSpeed)
	{
		this.halvesSpeed = halvesSpeed;
	}
	
	public boolean isMegaStone() {
		return isMegaStone;
	}

	public void setMegaStone(boolean isMegaStone) {
		this.isMegaStone = isMegaStone;
	}
	
	@Override
	public String toString()
	{
		return this.name;
	}
}
