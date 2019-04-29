/* The GUI and logical representation of the center
 * options, including for each side. */

package superDamageCalculator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class FieldOptions
{
	private String format;
	private String terrain;
	private String weather;
	private boolean isFairyAura;
	private boolean isDarkAura;
	private boolean isAuraBreak;
	
	//Left side is 0, right side is 1
	private GridPane fieldOptions;
	private RadioButton levelFive;
	private RadioButton levelFifty;
	private RadioButton levelHundred;
	private ListView<String> formats;
	private ListView<String> terrains;
	private ListView<String> weathers;
	private ListView<String> auras;
	private SideFieldOptions[] sideFieldOptions = new SideFieldOptions[2];
	
	public FieldOptions(SideFieldOptions leftSideOptions, SideFieldOptions rightSideOptions)
	{
		fieldOptions = new GridPane();
		sideFieldOptions[0] = leftSideOptions;
		sideFieldOptions[1] = rightSideOptions;

		HBox levelDefault = new HBox();
		levelFive = new RadioButton("Level 5");
		levelFifty = new RadioButton("Level 50");
		levelHundred = new RadioButton("Level 100");
		ToggleGroup levelTG = new ToggleGroup();
		levelFive.setToggleGroup(levelTG);
		levelFifty.setToggleGroup(levelTG);
		levelHundred.setToggleGroup(levelTG);
		levelFifty.setSelected(true);
		levelDefault.setAlignment(Pos.CENTER);
		levelDefault.getChildren().addAll(levelFive, levelFifty, levelHundred);
		levelDefault.setSpacing(5);
		fieldOptions.addRow(0, levelDefault);

		ObservableList<String> formatTypes = FXCollections.observableArrayList("Singles", "Doubles");
		formats = new ListView<String>(formatTypes);
		formats.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		formats.setOnMouseClicked(e ->
		{
			format = formats.getSelectionModel().getSelectedItem();
		});
		formats.setOrientation(Orientation.HORIZONTAL);
 		formats.setMaxWidth(111);
 		formats.setMaxHeight(35);
 		fieldOptions.addRow(1, formats);
 		GridPane.setHalignment(formats, HPos.CENTER);
 		GridPane.setValignment(formats, VPos.CENTER);

 		ObservableList<String> terrainNames = FXCollections.observableArrayList("None", "Electric", "Grassy", "Misty", "Psychic");
		terrains = new ListView<String>(terrainNames);
		terrains.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		terrains.setOnMouseClicked(e ->
		{
			terrain = terrains.getSelectionModel().getSelectedItem();
		});
		terrains.setOrientation(Orientation.HORIZONTAL);
		terrains.setMaxWidth(242);
 		terrains.setMaxHeight(35);
 		fieldOptions.addRow(2, terrains);
 		GridPane.setHalignment(terrains, HPos.CENTER);
 		GridPane.setValignment(terrains, VPos.CENTER);

		ObservableList<String> weatherNames = FXCollections.observableArrayList("None", "Sun", "Rain", "Sand", "Hail", "Strong Winds");
 		weathers = new ListView<String>(weatherNames);
 		weathers.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
 		weathers.setOnMouseClicked(e ->
		{
			weather = weathers.getSelectionModel().getSelectedItem();
		});
 		weathers.setOrientation(Orientation.HORIZONTAL);
 		weathers.setPrefWidth(277);
 		weathers.setMaxHeight(35);
 		fieldOptions.addRow(3, weathers);
 		GridPane.setHalignment(weathers, HPos.CENTER);
 		GridPane.setValignment(weathers, VPos.CENTER);

 		ObservableList<String> auraNames = FXCollections.observableArrayList("Fairy Aura", "Dark Aura", "Aura Break");
 		auras = new ListView<String>(auraNames);
 		auras.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
 		auras.setOnMouseClicked(e ->
		{
			//Initialize options
			isFairyAura = false;
			isDarkAura = false;
			isAuraBreak = false;
			
			//Set auras as appropriate
			ObservableList<String> selectedAuras = auras.getSelectionModel().getSelectedItems();
			for (int i = 0; i < selectedAuras.size(); i++)
			{
				switch (selectedAuras.get(i))
				{
					case "Fairy Aura":
						isFairyAura = true;
						break;
					case "Dark Aura":
						isDarkAura = true;
						break;
					case "Aura Break":
						isAuraBreak = true;
						break;
				}
			}
		});
 		auras.setOrientation(Orientation.HORIZONTAL);
 		auras.setMaxWidth(208);
 		auras.setMaxHeight(35);
 		fieldOptions.addRow(4, auras);
 		GridPane.setHalignment(auras, HPos.CENTER);
 		GridPane.setValignment(auras, VPos.CENTER);
 		
 		fieldOptions.setAlignment(Pos.CENTER);
 		
 		/*Defaults*/	
 		format = "Doubles";
 		formats.getSelectionModel().select(1);
 		terrain = "None";
 		terrains.getSelectionModel().select(0);
 		weather = "None";
 		weathers.getSelectionModel().select(0);
	}
	
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
	
	public GridPane getFieldOptions()
	{
		return fieldOptions;
	}
	
	//if side is true (left), return left; else, return right
	public SideFieldOptions getSideFieldOptions(boolean side)
	{
		return side ? sideFieldOptions[0] : sideFieldOptions[1];
	}
	
	public RadioButton getLevelFiveButton()
	{
		return levelFive;
	}
	
	public RadioButton getLevelFiftyButton()
	{
		return levelFifty;
	}
	
	public RadioButton getLevelHundredButton()
	{
		return levelHundred;
	}
}
