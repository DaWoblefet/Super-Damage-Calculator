/* The back-end / logical representation of field options, e.g. Helping Hand. */

package superDamageCalculator;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class SideFieldOptions
{
	private GridPane options;
	
	private ToggleButton protect;
	private ToggleButton reflect;
	private ToggleButton lightScreen;
	private ToggleButton auroraVeil;
	private ToggleButton helpingHand;
	private ToggleButton friendGuard;
	private ToggleButton battery;
	private ToggleButton plusOneAll;
	private ToggleButton plusTwoAll;
	private ToggleButton soak;
	
	private boolean isLeftSide; //if false, it is the right side
	private boolean isHelpingHand;
	private boolean isProtect;
	private boolean isReflect;
	private boolean isLightScreen;
	private boolean isAuroraVeil;
	private boolean isFriendGuard;
	private boolean isBattery;
	
	
	public SideFieldOptions(boolean isLeftSide)
	{
		this.isLeftSide = isLeftSide;
			
		options = new GridPane();

 		protect = new ToggleButton("Protect");
 		protect.setOnAction(e -> 
 		{
 			isProtect = protect.isSelected();
 		});
 		options.addRow(0, protect);

		HBox screens = new HBox();
 		reflect = new ToggleButton("Reflect");
 		reflect.setOnAction(e -> 
 		{
 			isReflect = reflect.isSelected();
 		});
 		lightScreen = new ToggleButton("Light Screen");
 		lightScreen.setOnAction(e -> 
 		{
 			isLightScreen = lightScreen.isSelected();
 		});
 		screens.getChildren().addAll(reflect, lightScreen);
 		options.addRow(1, screens);

 		auroraVeil = new ToggleButton("Aurora Veil");
 		auroraVeil.setOnAction(e -> 
 		{
 			isAuroraVeil = auroraVeil.isSelected();
 		});
 		options.addRow(2, auroraVeil);

 		helpingHand = new ToggleButton("Helping Hand");
 		helpingHand.setOnAction(e -> 
 		{
 			isHelpingHand = helpingHand.isSelected();
 		});
 		options.addRow(3, helpingHand);

 		friendGuard = new ToggleButton("Friend Guard");
 		friendGuard.setOnAction(e -> 
 		{
 			isFriendGuard = friendGuard.isSelected();
 		});
 		options.addRow(4, friendGuard);
 		
 		battery = new ToggleButton("Battery");
 		battery.setOnAction(e -> 
 		{
 			isBattery = battery.isSelected();
 		});
 		options.addRow(5, battery);

		ToggleGroup boosts = new ToggleGroup();
 		plusOneAll = new ToggleButton("+1 All Stats");
 		plusOneAll.setToggleGroup(boosts);
 		options.addRow(6, plusOneAll);

 		plusTwoAll = new ToggleButton("+2 All Stats");
 		plusTwoAll.setToggleGroup(boosts);
 		options.addRow(7, plusTwoAll);

 		soak = new ToggleButton("Soak");
		options.addRow(8, soak);
		
		if (!isLeftSide)
		{
			GridPane.setHalignment(protect, HPos.RIGHT);
			GridPane.setHalignment(screens, HPos.RIGHT);
			GridPane.setHalignment(auroraVeil, HPos.RIGHT);
			GridPane.setHalignment(helpingHand, HPos.RIGHT);
			GridPane.setHalignment(friendGuard, HPos.RIGHT);
			GridPane.setHalignment(battery, HPos.RIGHT);
			GridPane.setHalignment(plusOneAll, HPos.RIGHT);
			GridPane.setHalignment(plusTwoAll, HPos.RIGHT);
			GridPane.setHalignment(soak, HPos.RIGHT);
			BorderPane.setMargin(options, new Insets(0,5,0,0));
		}
	}
	
	public boolean isLeftSide()
	{
		return isLeftSide;
	}
	
	public GridPane getOptions()
	{
		return options;
	}
	
	public boolean isHelpingHand()
	{
		return isHelpingHand;
	}

	public boolean isProtect()
	{
		return isProtect;
	}

	public boolean isReflect()
	{
		return isReflect;
	}

	public boolean isLightScreen()
	{
		return isLightScreen;
	}

	public boolean isAuroraVeil()
	{
		return isAuroraVeil;
	}

	public boolean isFriendGuard()
	{
		return isFriendGuard;
	}
	
	public boolean isBattery()
	{
		return isBattery;
	}
	
	public ToggleButton getSoakButton()
	{
		return soak;
	}
	
	public ToggleButton getPlusOneAllButton()
	{
		return plusOneAll;
	}
	
	public ToggleButton getPlusTwoAllButton()
	{
		return plusTwoAll;
	}
}
