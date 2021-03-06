/* The back-end / logical representation of field options, e.g. Helping Hand. */

package superDamageCalculator;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
	private ToggleButton geomancy;
	private ToggleButton plusOneAll;
	private ToggleButton plusTwoAll;
	private ToggleButton soak;
	
	private boolean isLeftSide; //if false, it is the right side
	
	private SimpleBooleanProperty triggerCalcs = new SimpleBooleanProperty(false);
	
	public SideFieldOptions(boolean isLeftSide)
	{
		this.isLeftSide = isLeftSide;
			
		options = new GridPane();

 		protect = new ToggleButton("Protect");
 		protect.setOnAction(e -> {triggerCalcs();});
 		options.addRow(0, protect);

		HBox screens = new HBox();
 		reflect = new ToggleButton("Reflect");
 		reflect.setOnAction(e -> {triggerCalcs();});
 		
 		lightScreen = new ToggleButton("Light Screen");
 		lightScreen.setOnAction(e -> {triggerCalcs();});
 		
 		screens.getChildren().addAll(reflect, lightScreen);
 		options.addRow(1, screens);

 		auroraVeil = new ToggleButton("Aurora Veil");
 		auroraVeil.setOnAction(e -> {triggerCalcs();});
 		options.addRow(2, auroraVeil);

 		helpingHand = new ToggleButton("Helping Hand");
 		helpingHand.setOnAction(e -> {triggerCalcs();});
 		options.addRow(3, helpingHand);

 		friendGuard = new ToggleButton("Friend Guard");
 		friendGuard.setOnAction(e -> {triggerCalcs();});
 		options.addRow(4, friendGuard);
 		
 		battery = new ToggleButton("Battery");
 		battery.setOnAction(e -> {triggerCalcs();});
 		options.addRow(5, battery);		

		ToggleGroup boosts = new ToggleGroup();
		
		ImageView xerneas = new ImageView(new Image(getClass().getResourceAsStream("/resources/Sprites/Xerneas.png"), 20, 20, true, true));
		geomancy = new ToggleButton(" Geomancy", xerneas);
		geomancy.setToggleGroup(boosts);
		geomancy.setPrefWidth(101);
		options.addRow(6, geomancy);
		
		ImageView porygonz = new ImageView(new Image(getClass().getResourceAsStream("/resources/Sprites/Porygon-Z.png"), 20, 20, true, true));	
		plusOneAll = new ToggleButton("+1 All Stats", porygonz);
 		plusOneAll.setToggleGroup(boosts);
 		options.addRow(7, plusOneAll);

 		ImageView eevee = new ImageView(new Image(getClass().getResourceAsStream("/resources/Sprites/Eevee.png"), 20, 20, true, true));	
 		plusTwoAll = new ToggleButton("+2 All Stats", eevee);
 		plusTwoAll.setToggleGroup(boosts);
 		options.addRow(8, plusTwoAll);

 		soak = new ToggleButton("Soak");
		options.addRow(9, soak);
		
		options.setVgap(0.5);
		if (!isLeftSide)
		{
			GridPane.setHalignment(protect, HPos.RIGHT);
			GridPane.setHalignment(screens, HPos.RIGHT);
			GridPane.setHalignment(auroraVeil, HPos.RIGHT);
			GridPane.setHalignment(helpingHand, HPos.RIGHT);
			GridPane.setHalignment(friendGuard, HPos.RIGHT);
			GridPane.setHalignment(battery, HPos.RIGHT);
			GridPane.setHalignment(geomancy, HPos.RIGHT);
			GridPane.setHalignment(plusOneAll, HPos.RIGHT);
			GridPane.setHalignment(plusTwoAll, HPos.RIGHT);
			GridPane.setHalignment(soak, HPos.RIGHT);
			BorderPane.setMargin(options, new Insets(0,5,0,0));
		}
	}
	
	public void resetFieldOptions()
	{
		protect.setSelected(false);
		reflect.setSelected(false);
		lightScreen.setSelected(false);
		auroraVeil.setSelected(false);
		helpingHand.setSelected(false);
		friendGuard.setSelected(false);
		battery.setSelected(false);
		geomancy.setSelected(false);
		plusOneAll.setSelected(false);
		plusTwoAll.setSelected(false);
		soak.setSelected(false);
	}
	
	//Flips a boolean to trigger event handlers elsewhere
	public void triggerCalcs()
	{
		triggerCalcs.setValue(!triggerCalcs.getValue());
	}
	
	public boolean isLeftSide()
	{
		return isLeftSide;
	}
	
	public SimpleBooleanProperty getTriggerCalcs()
	{
		return triggerCalcs;
	}
	
	public GridPane getOptions()
	{
		return options;
	}
	
	public boolean isHelpingHand()
	{
		return helpingHand.isSelected();
	}

	public boolean isProtect()
	{
		return protect.isSelected();
	}

	public boolean isReflect()
	{
		return reflect.isSelected();
	}

	public boolean isLightScreen()
	{
		return lightScreen.isSelected();
	}

	public boolean isAuroraVeil()
	{
		return auroraVeil.isSelected();
	}

	public boolean isFriendGuard()
	{
		return friendGuard.isSelected();
	}
	
	public boolean isBattery()
	{
		return battery.isSelected();
	}
	
	public ToggleButton getSoakButton()
	{
		return soak;
	}
	
	public ToggleButton getGeomancyButton()
	{
		return geomancy;
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
