/* This GUI is what constitutes each Pokemon of the GUI.
 * Autocomplete feature from ControlsFX (license BSD 3-Clause)*/

package superDamageCalculator;
import javafx.application.Platform;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

import org.controlsfx.control.textfield.TextFields;

import java.util.ArrayList;
import java.util.Collections;

import static superDamageCalculator.StatConstants.*;

public class PokemonSide
{
	private HashMap<String, Pokemon> pokedex = Pokedex.getPokedex();
	private HashMap<String, Move> movedex = new Movedex().getMovedex();
	private HashMap<String, Item> items = new Itemdex().getItems();
	private HashMap<String, Integer> natures = new Nature().natures;
	private HashMap<String, Integer> abilities = new Abilitydex().abilities;
	private HashMap<String, Integer> types = new Type().types;

	private BorderPane pokemonSide = new BorderPane();

	private Pokemon[] teamData = new Pokemon[6];
	private String defaultPokemon = "Abomasnow";
	private ComboBox<String> chooseMon;
	private int currentPokemon = 0;
	
	private boolean isToggleMon = false;
	private boolean currentlyMove = false;
	
	private ComboBox<String> typeLeft;
	private ComboBox<String> typeRight;
	private int defaultLevel = 50;
	private TextField level;
	private ComboBox<String> forme;
	private ObservableList<String> formes;
	private Label formeLabel;

	private GridPane statsStructure;
	private Label[] statLabel;
	private TextField[] baseField = new TextField[6];
	private TextField[] IVsField = new TextField[6];
	private TextField[] EVsField = new TextField[6];
	private Label[] calculatedStats = new Label[6];
	
	//Java doesn't like arrays of objects that utilize generics, so we use ArrayLists instead for clumps of ComboBoxes.
	private ArrayList<ComboBox<String>> statChanges = new ArrayList<ComboBox<String>>();

	private ComboBox<String> nature;
	private ComboBox<String> ability;
	private ComboBox<String> item;
	private ComboBox<String> status;

	private TextField currentHP;
	private TextField currentHPPercent;
	private Label totalHPLabel;
	private boolean modifyingHP = false;
	private boolean modifyingHPPercent = false;
	
	private Label totalEVsLabel;
	private Label totalEVsRemainingLabel;

	private Move[] moveData = new Move[4];
	private ArrayList<ComboBox<String>> movesComboBox = new ArrayList<ComboBox<String>>();
	private TextField[] basePower = new TextField[4];
	private ArrayList<ComboBox<String>> type = new ArrayList<ComboBox<String>>();
	private ArrayList<ComboBox<String>> category = new ArrayList<ComboBox<String>>();
	private CheckBox[] crit = new CheckBox[4];
	private CheckBox[] zOption = new CheckBox[4];
	private ObservableList<String> topMoveNames;
	private ListView<String> topMoves;

	private String[] damageOutput = new String[4];
	private String[] damageRolls = new String[4];
	private String[] damageOutputShort = new String[4];

	private ImageView spriteMain;
	private ImageView[] teamSprites = new ImageView[6];
	private ToggleButton[] teamSpritesToggles = new ToggleButton[6];
	
	private SimpleBooleanProperty triggerCalcs = new SimpleBooleanProperty(false);
	private SimpleBooleanProperty triggerAbilities = new SimpleBooleanProperty(false);
	private SimpleBooleanProperty triggerFieldOptionsReset = new SimpleBooleanProperty(false);
	
	private final ClipboardContent content = new ClipboardContent();
	
	private boolean skipTrigger = false;
	
	public PokemonSide()
	{
		//Initialize the 6 Pokemon
		for (int i = 0; i < teamData.length; i++)
		{
			teamData[i] = pokedex.get(defaultPokemon).clonePokemon();
		}
		
		/*** Setting up the bigger ObservableLists for the ComboBoxes ***/
		
		ArrayList<String> pnames = generateNames(pokedex, true);
		ArrayList<String> mnames = generateNames(movedex, true);
		ArrayList<String> nnames = generateNames(natures, true);
		ArrayList<String> anames = generateNames(abilities, true);
		ArrayList<String> inames = generateNames(items, true);
		ArrayList<String> tnames = generateNames(types, true);

		ObservableList<String> categories = FXCollections.observableArrayList("Status", "Physical", "Special", "Psyshock effect");
		ObservableList<String> statChangesNames = FXCollections.observableArrayList("+6", "+5", "+4", "+3", "+2", "+1", "--", "-1", "-2", "-3", "-4", "-5", "-6");
		ObservableList<String> statusNames = FXCollections.observableArrayList("Healthy", "Poisoned", "Badly Poisoned", "Burned", "Paralyzed", "Asleep", "Frozen");
		ObservableList<String> pokemonNames = FXCollections.observableArrayList(pnames);
		ObservableList<String> moveNames = FXCollections.observableArrayList(mnames);
		ObservableList<String> natureNames = FXCollections.observableArrayList(nnames);
		ObservableList<String> abilityNames = FXCollections.observableArrayList(anames);
		ObservableList<String> itemNames = FXCollections.observableArrayList(inames);
		ObservableList<String> typeNames = FXCollections.observableArrayList(tnames);
		
		/*** Declarations of GUI elements ***/	
		
		//The main area for selecting a Pokemon
		spriteMain = new ImageView(new Image(getClass().getResourceAsStream("/resources/Sprites/" + defaultPokemon + ".png")));
		chooseMon = new ComboBox<String>(pokemonNames);
		TextFields.bindAutoCompletion(chooseMon.getEditor(), chooseMon.getItems());
		chooseMon.setEditable(true);
		chooseMon.setId("chooseMon");
		
		//Type
		Label typeLabel = new Label("Type");
		typeLeft = new ComboBox<String>(typeNames);
		typeRight = new ComboBox<String>(typeNames);
		GridPane.setMargin(typeLabel, new Insets(0,5,0,0));
		
		//Level
		Label levelLabel = new Label("Level");
		level = new TextField(Integer.toString(defaultLevel));
		level.setId("level");
		
		//Formes
		formeLabel = new Label("Forme");
		forme = new ComboBox<String>();
		
		//Top stat labels
		Label baseLabel = new Label("Base");
		Label IVsLabel = new Label("IVs");
		Label EVsLabel = new Label("EVs");
		GridPane.setConstraints(baseLabel, 1, 0);
		GridPane.setConstraints(IVsLabel, 2, 0);
		GridPane.setConstraints(EVsLabel, 3, 0);
		
		//Import from Pokemon Showdown button.
		ImageView psIcon = new ImageView(new Image(getClass().getResourceAsStream("/resources/psIcon.png"), 20, 20, true, true));
		Button importButton = new Button("Import", psIcon);
		GridPane.setConstraints(importButton, 6, 0, 2, 1);
		GridPane.setMargin(importButton, new Insets(0,5,0,40));
		
		//Stats
		statLabel = new Label[6];
		ToggleGroup teamTG = new ToggleGroup();
		Label[] teamSpriteLabels = new Label[6];
		String[] statLabelNames = {"HP", "Attack", "Defense", "Sp. Atk", "Sp. Def", "Speed"};
		for (int i = 0; i < 6; i++)
		{
			statLabel[i] = new Label(statLabelNames[i]);
			baseField[i] = new TextField("100");
			baseField[i].getStyleClass().add("stat-textfield");
			IVsField[i] = new TextField("31");
			IVsField[i].getStyleClass().add("stat-textfield");
			EVsField[i] = new TextField("0");
			EVsField[i].getStyleClass().add("stat-textfield");
			calculatedStats[i] = new Label("100");
			statChanges.add(i, new ComboBox<String>(statChangesNames));
			statChanges.get(i).setId("stat-changes");
			statChanges.get(i).setValue("--");
			if (i == 0)
			{
				statChanges.get(i).setVisible(false); //There is no statChanges for HP.
			}

			teamSpriteLabels[i] = new Label("Mon " + (i+1));
			teamSprites[i] = new ImageView(new Image(getClass().getResourceAsStream("/resources/Sprites/" + teamData[i].getName() + ".png")));
			teamSprites[i].setFitWidth(20);
			teamSprites[i].setFitHeight(15);
			teamSpritesToggles[i] = new ToggleButton(null, teamSprites[i]);
			teamSpritesToggles[i].setToggleGroup(teamTG);
			GridPane.setMargin(statLabel[i], new Insets(0,5,0,0));
			GridPane.setMargin(calculatedStats[i], new Insets(0,2,0,5));
			GridPane.setMargin(teamSpriteLabels[i], new Insets(0,5,0,40));
		}
		
		//Total EVs
		totalEVsLabel = new Label("0");
		totalEVsRemainingLabel = new Label("508");
		GridPane.setMargin(totalEVsLabel, new Insets(0,5,0,0));
		GridPane.setMargin(totalEVsRemainingLabel, new Insets(0,5,0,0));
		GridPane.setConstraints(totalEVsLabel, 3, 7);
		GridPane.setConstraints(totalEVsRemainingLabel, 4, 7);
		
		//Nature
		Label natureLabel = new Label("Nature");
		nature = new ComboBox<String>(natureNames);
		GridPane.setMargin(natureLabel, new Insets(0,5,0,0));
		GridPane.setConstraints(natureLabel, 0, 0);
		GridPane.setConstraints(nature, 1, 0);
		
		//Ability
		Label abilityLabel = new Label("Ability");
		ability = new ComboBox<String>(abilityNames);
		TextFields.bindAutoCompletion(ability.getEditor(), ability.getItems());
		ability.setId("ability");
		ability.setEditable(true);
		GridPane.setMargin(abilityLabel, new Insets(0,5,0,0));
		GridPane.setConstraints(abilityLabel, 0, 1);
		GridPane.setConstraints(ability, 1, 1);
		
		//Item
		Label itemLabel = new Label("Item");
		item = new ComboBox<String>(itemNames);
		TextFields.bindAutoCompletion(item.getEditor(), item.getItems());
		item.setId("item");
		item.setEditable(true);
		GridPane.setMargin(itemLabel, new Insets(0,5,0,5));
		GridPane.setConstraints(itemLabel, 4, 0);
		GridPane.setConstraints(item, 5, 0);
		
		//Status
		Label statusLabel = new Label("Status");
		status = new ComboBox<String>(statusNames);
		GridPane.setMargin(statusLabel, new Insets(0,5,0,5));
		GridPane.setConstraints(statusLabel, 4, 1);
		GridPane.setConstraints(status, 5, 1);
		
		//HP Percent control
		Label currentHPLabel = new Label("Current HP: ");
		currentHP = new TextField(Integer.toString(teamData[0].getStat(HP).calculateStat()));
		currentHP.getStyleClass().add("currentHP");

		totalHPLabel = new Label(" /100 (");
		currentHPPercent = new TextField("100");
		currentHPPercent.getStyleClass().add("currentHP");
		Label currentHPPercentLabel = new Label("%)");
		
		//Move labels
		Label BPLabel = new Label("BP");
		GridPane.setConstraints(BPLabel, 1, 0);
		Label moveTypeLabel = new Label("Type");
		GridPane.setConstraints(moveTypeLabel, 2, 0);
		Label categoryLabel = new Label("Category");
		GridPane.setConstraints(categoryLabel, 3, 0);
		Label critLabel = new Label("Crit");
		GridPane.setConstraints(critLabel, 4, 0);
		GridPane.setMargin(critLabel, new Insets(0,0,0,3.5));
		Label zLabel = new Label("Z");
		GridPane.setConstraints(zLabel, 5, 0);
		GridPane.setMargin(zLabel, new Insets(0,0,0,4.5));
		
		//Moves
		for (int i = 0; i < 4; i++)
		{
			movesComboBox.add(i, new ComboBox<String>(moveNames));
			TextFields.bindAutoCompletion(movesComboBox.get(i).getEditor(), movesComboBox.get(i).getItems());
			movesComboBox.get(i).setEditable(true);
			movesComboBox.get(i).setId("moves");
			basePower[i] = new TextField();
			basePower[i].getStyleClass().add("stat-textfield");
			type.add(i, new ComboBox<String>(typeNames));
			category.add(i, new ComboBox<String>(categories));
			category.get(i).setId("category");
			crit[i] = new CheckBox();
			zOption[i] = new CheckBox();
			GridPane.setMargin(crit[i], new Insets(0,0,0,5));
		}
		
		//Top moves
		topMoveNames = FXCollections.observableArrayList();
		for (int i = 0; i < 4; i++)
		{
			topMoveNames.add(damageOutputShort[i]);
		}
		topMoves = new ListView<String>(topMoveNames);
		topMoves.setId("move-cells");
		
		/*** Structure of GUI elements ***/
		
		//Type, level, formes structure
		GridPane TLFStructure = new GridPane();
		TLFStructure.addRow(0, typeLabel, typeLeft, typeRight);
		
		GridPane formeLevel = new GridPane();
		HBox levelHBox = new HBox(levelLabel, level);
		HBox formeHBox = new HBox(formeLabel, forme);
		levelHBox.getStyleClass().add("forme-level");
		formeHBox.getStyleClass().add("forme-level");
		formeLevel.addRow(0, levelHBox, formeHBox);
		GridPane.setMargin(formeHBox, new Insets(0,0,0,5));
		
		//Stats structure
		statsStructure = new GridPane();
		statsStructure.getChildren().addAll(baseLabel, IVsLabel, EVsLabel, importButton);
		for (int i = 0; i < 6; i++)
		{
			statsStructure.addRow(i + 1, statLabel[i], baseField[i], IVsField[i], EVsField[i], calculatedStats[i], statChanges.get(i), teamSpriteLabels[i], teamSpritesToggles[i]);
			
		}
		statsStructure.getChildren().addAll(totalEVsLabel, totalEVsRemainingLabel);
		statsStructure.setPadding(new Insets(5,0,0,0));

		//Nature, Ability, Item, Status structure
		GridPane NAISstructure = new GridPane();
		NAISstructure.getChildren().addAll(natureLabel, nature, itemLabel, item, abilityLabel, ability, statusLabel, status);
		NAISstructure.setPadding(new Insets(5, 0, 0, 0));
		
		//Percent HP control structure
		HBox percentHP = new HBox();
		percentHP.getChildren().addAll(currentHPLabel, currentHP, totalHPLabel, currentHPPercent, currentHPPercentLabel);
		percentHP.setPadding(new Insets(10, 0, 0, 0));
		GridPane.setRowSpan(percentHP, 2);
		
		//Moves structure
		GridPane moveStructure = new GridPane();
		moveStructure.getChildren().addAll(BPLabel, moveTypeLabel, categoryLabel, critLabel, zLabel);
		for (int i = 0; i < 4; i++)
		{
			moveStructure.addRow(i + 1, movesComboBox.get(i), basePower[i], type.get(i), category.get(i), crit[i], zOption[i]);
		}	

		GridPane mon = new GridPane();
		mon.addRow(0, spriteMain, chooseMon);
		mon.setAlignment(Pos.CENTER);
		
		VBox structure = new VBox();
		structure.getChildren().addAll(TLFStructure, formeLevel, statsStructure, NAISstructure, percentHP, moveStructure);
		structure.setPadding(new Insets(0,5,5,5));
		
		GridPane topPane = new GridPane();
		topPane.addRow(0, topMoves);
		topPane.setAlignment(Pos.CENTER);
		GridPane.setMargin(topMoves, new Insets(15,0,0,0));
		
		pokemonSide.setTop(topPane);
		pokemonSide.setBottom(structure);
		pokemonSide.setCenter(mon);


		/*** SetOnAction()s for GUI elements ***/

		chooseMon.setOnAction(e ->
		{
			if (isToggleMon) {return;}
			
			//Sometimes when a user types too quickly, they load in an illegal Pokemon.
			if (pokedex.get(chooseMon.getValue()) == null) {return;}
			
			skipTrigger = true;
			teamData[currentPokemon] = pokedex.get(chooseMon.getValue()).clonePokemon();
			loadSprites(teamData[currentPokemon].getName());
			
			typeLeft.setValue(teamData[currentPokemon].getType(0));
			typeRight.setValue(teamData[currentPokemon].getType(1));
			
			if (teamData[currentPokemon].getFormes().size() > 0)
			{
				forme.setVisible(true);
				formeLabel.setVisible(true);
				formes = FXCollections.observableArrayList(teamData[currentPokemon].getFormes());
				forme.setItems(formes);
				forme.setValue(teamData[currentPokemon].getFormes().get(0));
			}
			else
			{
				forme.setVisible(false);
				formeLabel.setVisible(false);
			}

			teamData[currentPokemon].setNature("Hardy");
			ability.setValue(teamData[currentPokemon].getAbility());
			nature.setValue(teamData[currentPokemon].getNature());
			item.setValue(teamData[currentPokemon].getItem().getName());
			status.setValue("Healthy");

			for (int i = 0; i < 6; i++)
			{
				baseField[i].setText(Integer.toString(teamData[currentPokemon].getBaseStat(i)));
				IVsField[i].setText("31");
				EVsField[i].setText("0");
				statChanges.get(i).setValue("--");
			}
			
			currentHP.setText(Integer.toString(teamData[currentPokemon].getStat(HP).calculateStat()));
			totalHPLabel.setText("/" + Integer.toString(teamData[currentPokemon].getStat(HP).calculateStat()) + " (");
			currentHPPercent.setText("100");
			
			for (int i = 0; i < 4; i++)
			{
				movesComboBox.get(i).setValue("(none)");
			}
			skipTrigger = false;
			triggerFieldOptionsReset(); //Also implicitly calls triggerCalcs()
		});
		chooseMon.getEditor().focusedProperty().addListener((observable) -> {Platform.runLater(chooseMon.getEditor()::selectAll);});

		//Stat calculation done dynamically
		level.textProperty().addListener((observable, oldValue, newValue) ->
		{
			if (isToggleMon) {return;}
			try //Make sure input is an integer.
			{
				Integer.parseInt(newValue);
			}
			catch (NumberFormatException ex)
			{
				level.setText(Integer.toString(defaultLevel));
			}
			updateStats();
		});
		level.setOnKeyPressed(e ->
		{
			int currentLevel = Integer.parseInt(level.getText());
			switch (e.getCode())
			{
				case UP:
					if (!(currentLevel + 1 > 100))
					{
						level.setText(Integer.toString(currentLevel + 1));
					}
					break;
				case DOWN:
					if (!(currentLevel - 1 < 1))
					{
						level.setText(Integer.toString(currentLevel - 1));
					}
					break;
				default:
					break;
			}
		});
		level.setOnMouseClicked(e -> {level.selectAll();});

		typeLeft.setOnAction(e -> 
		{
			teamData[currentPokemon].setType(typeLeft.getValue(), 0);
			triggerCalcs();
		});
		
		typeRight.setOnAction(e -> 
		{
			teamData[currentPokemon].setType(typeRight.getValue(), 1);
			triggerCalcs();
		});
		
		forme.setOnAction(e -> 
		{
			if (isToggleMon) {return;}
			String newForme = forme.getValue();
			if (newForme == null) {return;}
			teamData[currentPokemon].switchForme(pokedex.get(newForme));
			loadSprites(newForme);
			typeLeft.setValue(teamData[currentPokemon].getType(0));
			typeRight.setValue(teamData[currentPokemon].getType(1));
			ability.setValue(teamData[currentPokemon].getAbility());
			
			skipTrigger = true;
			for (int i = 0; i < 6; i++)
			{
				baseField[i].setText(Integer.toString(teamData[currentPokemon].getBaseStat(i)));
			}
			skipTrigger = false;
			triggerCalcs();
		});
		nature.setOnAction(e ->
		{
			teamData[currentPokemon].setNature(nature.getValue());
			
			String none = "-fx-background-color: transparent";
			String green = "-fx-background-color: #90ee90";
			String red = "-fx-background-color: #ff6666";
			
			for (int i = 0; i < statLabel.length; i++)
			{
				statLabel[i].setStyle(none);
			}
			
			switch (nature.getValue())
			{
				case "Adamant": case "Brave": case "Lonely": case "Naughty":
					statLabel[ATK].setStyle(green);
					break;
				case "Bold": case "Impish": case "Lax": case "Relaxed":
					statLabel[DEF].setStyle(green);
					break;
				case "Mild": case "Modest": case "Quiet": case "Rash":
					statLabel[SATK].setStyle(green);
					break;
				case "Calm": case "Careful": case "Gentle": case "Sassy":
					statLabel[SDEF].setStyle(green);
					break;
				case "Hasty": case "Jolly": case "Naive": case "Timid":
					statLabel[SPE].setStyle(green);
					break;
			}
			switch (nature.getValue())
			{
				case "Bold": case "Calm": case "Modest": case "Timid":
					statLabel[ATK].setStyle(red);
					break;
				case "Gentle": case "Hasty": case "Lonely": case "Mild":
					statLabel[DEF].setStyle(red);
					break;
				case "Adamant": case "Careful": case "Impish": case "Jolly":
					statLabel[SATK].setStyle(red);
					break;
				case "Lax": case "Naive": case "Naughty": case "Rash":
					statLabel[SDEF].setStyle(red);
					break;
				case "Brave": case "Quiet": case "Relaxed": case "Sassy":
					statLabel[SPE].setStyle(red);
					break;
			}
			
			updateStats();
		});
		
		ability.setOnAction(e ->
		{
			//Sometimes when a user types too quickly, they load in an illegal item.
			if (abilities.get(ability.getValue()) == null) {return;}
			
			teamData[currentPokemon].setAbility(ability.getValue());
			triggerAbilities();
			triggerCalcs();
		});
		
		ability.focusedProperty().addListener((observable) -> {Platform.runLater(ability.getEditor()::selectAll);});
		
		item.setOnAction(e ->
		{
			//Sometimes when a user types too quickly, they load in an illegal item.
			if (items.get(item.getValue()) == null) {return;}
			
			teamData[currentPokemon].setItem(item.getValue());
			triggerCalcs();
		});
		
		item.getEditor().focusedProperty().addListener((observable) -> {Platform.runLater(item.getEditor()::selectAll);});
		
		status.setOnAction(e ->
		{
			teamData[currentPokemon].setStatus(status.getValue());
			triggerCalcs();
		});
		
		//Drag-and-drop with HP stat
		calculatedStats[HP].setOnDragDetected(e -> 
		{
			Dragboard db = calculatedStats[HP].startDragAndDrop(TransferMode.ANY);
			db.setDragView(new Text(calculatedStats[HP].getText()).snapshot(null, null), e.getX(), e.getY());
			
			content.putString(calculatedStats[HP].getText());
			db.setContent(content);
		});

		//Stats and their properties
		for (int i = 0; i < 6; i++)
		{
			final int j = i;
			baseField[j].textProperty().addListener((observable, oldValue, newValue) ->
			{
				if (isToggleMon) {return;}
				
				try //Make sure input is an integer.
				{
					Integer.parseInt(newValue);
				}
				catch (NumberFormatException ex)
				{
					baseField[j].setText("1");
				}
				updateStats(j);
			});
			baseField[j].setOnMouseClicked(e -> {baseField[j].selectAll();});
			IVsField[j].textProperty().addListener((observable, oldValue, newValue) ->
			{
				if (isToggleMon) {return;}
				try //Make sure input is an integer.
				{
					Integer.parseInt(newValue);
				}
				catch (NumberFormatException ex)
				{
					IVsField[j].setText("0");
				}
				updateStats(j);
			});
			//Increment or decrement by 1 on UP/DOWN arrows.
			IVsField[j].setOnKeyPressed(e ->
			{
				int currentIVs = Integer.parseInt(IVsField[j].getText());
				switch (e.getCode())
				{
					case UP:
						if (!(currentIVs + 1 > 31))
						{
							IVsField[j].setText(Integer.toString(currentIVs + 1));
						}
						break;
					case DOWN:
						if (!(currentIVs - 1 < 0))
						{
							IVsField[j].setText(Integer.toString(currentIVs - 1));
						}
						break;
					default:
						break;
				}
			});
			IVsField[j].setOnMouseClicked(e -> {IVsField[j].selectAll();});
			EVsField[j].textProperty().addListener((observable, oldValue, newValue) ->
			{
				//if (isToggleMon) {return;}
				try //Make sure input is an integer.
				{
					Integer.parseInt(newValue);
				}
				catch (NumberFormatException ex)
				{
					EVsField[j].setText(oldValue);
				}
				updateStats(j);
				int currentEVSum = 0;
				for (int k = 0; k < 6; k++)
				{
					currentEVSum += Integer.parseInt(EVsField[k].getText());
				}
				totalEVsLabel.setText(Integer.toString(currentEVSum));
				totalEVsRemainingLabel.setText(Integer.toString(508 - currentEVSum));
				if (currentEVSum > 508)
				{
					totalEVsLabel.setTextFill(Color.RED);
					totalEVsRemainingLabel.setTextFill(Color.RED);
				}
				else
				{
					totalEVsLabel.setTextFill(Color.BLACK);
					totalEVsRemainingLabel.setTextFill(Color.BLACK);
				}
			});
			//Increment or decrement by 4/8 depending on levels on UP/DOWN arrows.
			EVsField[j].setOnKeyPressed(e ->
			{
				int currentEVs = Integer.parseInt(EVsField[j].getText());
				switch (e.getCode())
				{
					case UP:
						if (level.getText().equals("50") && currentEVs != 0) //Move around by increments of 8 EVs at level 50
						{
							if (!(currentEVs + 8 > 252))
							{
								EVsField[j].setText(Integer.toString(currentEVs + 8));
							}
						}
						else
						{
							if (!(currentEVs + 4 > 252))
							{
								EVsField[j].setText(Integer.toString(currentEVs + 4));
							}
						}
						break;
					case DOWN:
						if (level.getText().equals("50") && currentEVs != 4) //Move around by increments of 8 EVs at level 50
						{
							if (!(currentEVs - 8 < 0))
							{
								EVsField[j].setText(Integer.toString(currentEVs - 8));
							}
						}
						else
						{
							if (!(currentEVs - 4 < 0))
							{
								EVsField[j].setText(Integer.toString(currentEVs - 4));
							}
						}
						break;
					default:
						break;
				}
			});
			EVsField[j].setOnMouseClicked(e -> {EVsField[j].selectAll();});
			statChanges.get(j).setOnAction(e ->
			{
				teamData[currentPokemon].getStat(j).setBoostLevel((String) statChanges.get(j).getValue());
				triggerCalcs();
			});
		}
		
		calculatedStats[HP].textProperty().addListener((observable, oldValue, newValue) ->
		{
			if (isToggleMon) {return;}
			totalHPLabel.setText("/" + newValue + " (");
			currentHP.setText(newValue);
			currentHPPercent.setText("100");
		});
		
		currentHP.textProperty().addListener((observable, oldValue, newValue) ->
		{
			if (modifyingHPPercent) {return;}
			int x = 1;
			try //Make sure input is an integer.
			{
				x = Integer.parseInt(newValue);
			}
			catch (NumberFormatException ex)
			{
				currentHP.setText("1");
			}
			
			int HPstat = teamData[currentPokemon].getStat(HP).calculateStat();
		
			if (x > HPstat) //don't allow higher than the maximum HP stat
			{
				x = HPstat;
				currentHP.setText(Integer.toString(HPstat));
			}
			System.out.println("Setting the supposed current HP of " + x);
			teamData[currentPokemon].setCurrentHP(x);
			modifyingHP = true;
			currentHPPercent.setText(Integer.toString((int) (100.0 * x / HPstat)));
			modifyingHP = false;
			triggerCalcs();
		});
		currentHP.setOnMouseClicked(e -> {currentHP.selectAll();});
		
		currentHPPercent.textProperty().addListener((observable, oldValue, newValue) ->
		{
			if (modifyingHP) {return;}
			int x = 100;
			try //Make sure input is an integer.
			{
				x = Integer.parseInt(newValue);
			}
			catch (NumberFormatException ex)
			{
				currentHPPercent.setText("100");
			}
			
			if (x > 100) //don't allow higher than 100%
			{
				x = 100;
				currentHPPercent.setText("100");
			} 
			
			modifyingHPPercent = true;
			int HPstat = teamData[currentPokemon].getStat(HP).calculateStat();
			currentHP.setText(Integer.toString((int) (0.01 * x * HPstat)));
			modifyingHPPercent = false;
		});
		currentHPPercent.setOnMouseClicked(e -> {currentHPPercent.selectAll();});

		//Moves and their properties
		for (int i = 0; i < 4; i++)
		{
			final int j = i;
			movesComboBox.get(i).setOnAction(e ->
			{
				if (isToggleMon) {return;}
				
				//Sometimes when a user types too quickly, they load in an illegal move.
				if (movedex.get(movesComboBox.get(j).getValue()) == null) {return;}
				
				moveData[j] = movedex.get((String) movesComboBox.get(j).getValue()).cloneMove();
				teamData[currentPokemon].setMove(moveData[j], j);
				currentlyMove = true;
				basePower[j].setText(Integer.toString(moveData[j].getBP()));
				category.get(j).setValue(moveData[j].getCategory());
				type.get(j).setValue(moveData[j].getType());
				crit[j].setSelected(false);
				zOption[j].setSelected(false);
				topMoveNames.set(j, damageOutputShort[j]);
				currentlyMove = false;
				triggerCalcs();
			});
			
			movesComboBox.get(i).getEditor().focusedProperty().addListener((observable) ->
			{
				Platform.runLater(movesComboBox.get(j).getEditor()::selectAll);
		    });
			
			basePower[i].textProperty().addListener((observable, oldValue, newValue) ->
			{
				if (currentlyMove) {return;}
				
				try //Make sure input is an integer.
				{
					Integer.parseInt(newValue);
				}
				catch (NumberFormatException ex)
				{
					basePower[j].setText("0");
					newValue = "0";
				}
				
				teamData[currentPokemon].getMove(j).setBP(Integer.parseInt(newValue));
				triggerCalcs();
			});
			basePower[j].setOnMouseClicked(e -> {basePower[j].selectAll();});
			
			type.get(i).setOnAction(e ->
			{
				if (currentlyMove) {return;}
				teamData[currentPokemon].getMove(j).setType((String) type.get(j).getValue());
				triggerCalcs();
			});
			
			category.get(i).setOnAction(e ->
			{
				if (currentlyMove) {return;}
				teamData[currentPokemon].getMove(j).setCategory((String) category.get(j).getValue());
				triggerCalcs();
			});
			
			crit[i].setOnAction(e -> 
			{
				if (currentlyMove) {return;}
				teamData[currentPokemon].getMove(j).setCritChecked(crit[j].isSelected());
				triggerCalcs();
			});
			
			//Z-move toggles Z-base power on and off for the purposes of damage calculation only.
			zOption[i].setOnAction(e ->
			{
				if (currentlyMove) {return;}
				teamData[currentPokemon].getMove(j).setZChecked(zOption[j].isSelected());
				triggerCalcs();
			});
		}

		//Handling switching multiple Pokemon around with the team togglebuttons.
		for (int i = 0; i < 6; i++)
		{
			final int j = i;
			teamSpritesToggles[i].setOnAction(e ->
			{
				currentPokemon = j;
				loadPokemonDisplay();
			});
		}
		importButton.setOnAction(e -> {openPSImport();});

		//Finally, load up default sets
		loadPokemonDisplay();
		teamSpritesToggles[0].setSelected(true);
	}
	
	//Flips a boolean to trigger event handlers elsewhere
	public void triggerCalcs()
	{
		if (!skipTrigger) {triggerCalcs.setValue(!triggerCalcs.getValue());}
	}
	
	public void triggerAbilities()
	{
		triggerAbilities.setValue(!triggerAbilities.getValue());
	}
	
	public void triggerFieldOptionsReset()
	{
		triggerFieldOptionsReset.setValue(!triggerFieldOptionsReset.getValue());
	}

	public void updateStats()
	{
		for (int i = 0; i < 6; i++)
		{
			int currentEVs = Integer.parseInt(EVsField[i].getText());
			int currentIVs = Integer.parseInt(IVsField[i].getText());
			int currentBaseStat = Integer.parseInt(baseField[i].getText());
			int currentLevel = Integer.parseInt(level.getText());
			int currentNature = natures.get(nature.getValue());
			String boostLevel = (String) statChanges.get(i).getValue();
			teamData[currentPokemon].setStat(currentEVs, currentIVs, currentBaseStat, currentLevel, currentNature, boostLevel, i);
			calculatedStats[i].setText(Integer.toString(teamData[currentPokemon].getStat(i).calculateStat()));
		}
		triggerCalcs();
	}

	public void updateStats(int i)
	{
		int currentEVs = Integer.parseInt(EVsField[i].getText());
		int currentIVs = Integer.parseInt(IVsField[i].getText());
		int currentBaseStat = Integer.parseInt(baseField[i].getText());
		int currentLevel = Integer.parseInt(level.getText());
		int currentNature = natures.get(nature.getValue());
		String boostLevel = (String) statChanges.get(i).getValue();
		teamData[currentPokemon].setStat(currentEVs, currentIVs, currentBaseStat, currentLevel, currentNature, boostLevel, i);
		calculatedStats[i].setText(Integer.toString(teamData[currentPokemon].getStat(i).calculateStat()));
		triggerCalcs();
	}
	
	public void loadSprites(String pokemonName)
	{
		try
		{
			spriteMain.setImage(new Image(getClass().getResourceAsStream("/resources/Sprites/" + pokemonName + ".png")));
			teamSprites[currentPokemon].setImage(new Image(getClass().getResourceAsStream("/resources/Sprites/" + pokemonName + ".png")));
		}
		catch (NullPointerException ex) //If the sprite can't be found for whatever reason, load the ? sprite.
		{
			spriteMain.setImage(new Image(getClass().getResourceAsStream("/resources/Sprites/Missingno..png")));
			teamSprites[currentPokemon].setImage(new Image(getClass().getResourceAsStream("/resources/Sprites/Missingno..png")));
		}
	}
	
	public void loadPokemonDisplay()
	{
		isToggleMon = true;
		skipTrigger = true;
		chooseMon.setValue(teamData[currentPokemon].getName());
		
		typeLeft.setValue(teamData[currentPokemon].getType(0));
		typeRight.setValue(teamData[currentPokemon].getType(1));
		
		if (teamData[currentPokemon].getFormes().size() > 0)
		{
			forme.setVisible(true);
			formeLabel.setVisible(true);
			formes = FXCollections.observableArrayList(teamData[currentPokemon].getFormes());
			forme.setItems(formes);
			String currentForme = teamData[currentPokemon].getCurrentForme();
			if (currentForme == null) {currentForme = teamData[currentPokemon].getName();}
			forme.setValue(currentForme);
			loadSprites(currentForme);
		}
		else
		{
			forme.setVisible(false);
			formeLabel.setVisible(false);
			loadSprites(teamData[currentPokemon].getName());
		}

		ability.setValue(teamData[currentPokemon].getAbility());
		item.setValue(teamData[currentPokemon].getItem().getName());
		status.setValue(teamData[currentPokemon].getStatus());

		level.setText(Integer.toString(teamData[currentPokemon].getStat(HP).getLevel()));
		for (int k = 0; k < 6; k++)
		{
			baseField[k].setText(Integer.toString(teamData[currentPokemon].getBaseStat(k)));
			IVsField[k].setText(Integer.toString(teamData[currentPokemon].getStat(k).getIVs()));
			EVsField[k].setText(Integer.toString(teamData[currentPokemon].getStat(k).getEVs()));
			statChanges.get(k).setValue(teamData[currentPokemon].getStat(k).getBoostLevel());
		}
		nature.setValue(teamData[currentPokemon].getNature());
	
		if (teamData[currentPokemon].getCurrentHP() == 0) //if current HP is 0, then load the max HP stat
		{
			int totalHP = teamData[currentPokemon].getStat(HP).calculateStat();
			teamData[currentPokemon].setCurrentHP(totalHP);
			currentHP.setText(Integer.toString(totalHP));	
		}
		else
		{
			currentHP.setText(Integer.toString(teamData[currentPokemon].getCurrentHP()));
		}
		totalHPLabel.setText("/" + Integer.toString(teamData[currentPokemon].getStat(HP).calculateStat()) + " (");
		
		for (int k = 0; k < 4; k++)
		{
			teamData[currentPokemon].setMove(teamData[currentPokemon].getMove(k).cloneMove(), k);
			movesComboBox.get(k).setValue(teamData[currentPokemon].getMove(k).getName());
			basePower[k].setText(Integer.toString(teamData[currentPokemon].getMove(k).getBP()));
			type.get(k).setValue(teamData[currentPokemon].getMove(k).getType());
			category.get(k).setValue(teamData[currentPokemon].getMove(k).getCategory());
			crit[k].setSelected(teamData[currentPokemon].getMove(k).isCritChecked());
			zOption[k].setSelected(teamData[currentPokemon].getMove(k).isZChecked());
		}
		
		isToggleMon = false;
		updateStats();
		skipTrigger = false;
		triggerFieldOptionsReset();
		triggerCalcs();
	}
	
	public void openPSImport()
	{
		Stage stage = new Stage();
		VBox vbox = new VBox();
		BorderPane borderpane = new BorderPane();
		TextArea PSText = new TextArea();
		PSText.setPrefRowCount(36);
		Button importButton = new Button("Import from Pokemon Showdown");
		
		importButton.setOnAction(e -> setImportedData(stage, PSText.getText()));

		borderpane.setCenter(importButton);
		vbox.getChildren().addAll(PSText, borderpane);

		Scene scene = new Scene(vbox, 350, 500);
		stage.setScene(scene);
		Image icon = new Image(getClass().getResourceAsStream("/resources/woblescientist.png"));
		stage.getIcons().add(icon);
		stage.setTitle("Import from Pokemon Showdown");
		stage.show();
	}
	
	//The logic for importing the sets from GUI.
	public void setImportedData(Stage stage, String text)
	{
		ShowdownImport psImport = new ShowdownImport(text);
		if (psImport.getIsTeam())
		{
			for (int i = 0; i < 6; i++)
			{
				teamData[i] = psImport.getPokemon(i);
				teamSprites[i].setImage(new Image(getClass().getResourceAsStream("/resources/Sprites/" + teamData[i].getName() + ".png")));
			}
			currentPokemon = 0;
		}
		else
		{
			teamData[currentPokemon] = psImport.getPokemon(0);
			teamSprites[currentPokemon].setImage(new Image(getClass().getResourceAsStream("/resources/Sprites/" + teamData[currentPokemon].getName() + ".png")));
		}
		loadPokemonDisplay();
		stage.close();
	}
	
	//Reads in a HashMap and outputs the name values as an arrayList for use in the ComboBoxes.
	//TODO add the String ArrayLists to dexes to reduce startup time.
	public <E> ArrayList<String> generateNames(HashMap<?, ?> dex, boolean alphabetize)
	{
		ArrayList<String> names = new ArrayList<String>();
		Set<?> set = dex.entrySet();
      	Iterator<?> iterator = set.iterator();
      	while (iterator.hasNext())
      	{
			Map.Entry tempentry = (Map.Entry) iterator.next();
			names.add((String) tempentry.getKey());
		}
		if (alphabetize)
		{
			Collections.sort(names);
		}
		return names;
	}
	
	/*Needed getters and setters*/
	public SimpleBooleanProperty getTriggerCalcs()
	{
		return triggerCalcs;
	}
	
	public SimpleBooleanProperty getTriggerAbilities()
	{
		return triggerAbilities;
	}
	
	public SimpleBooleanProperty getTriggerFieldOptionsReset()
	{
		return triggerFieldOptionsReset;
	}
	
	public BorderPane getPokemonSide()
	{
		return pokemonSide;
	}
	
	public Pokemon getTeamData(int slot)
	{
		return teamData[slot];
	}
	
	public int getCurrentPokemon()
	{
		return currentPokemon;
	}

	public void setCurrentPokemon(int currentPokemon)
	{
		this.currentPokemon = currentPokemon;
	}
	
	public ComboBox<String> getTypeLeft()
	{
		return typeLeft;
	}
	
	public ComboBox<String> getTypeRight()
	{
		return typeRight;
	}
	
	public void setLevel(int level)
	{
		this.level.setText(Integer.toString(level));
	}
	
	public void setDefaultLevel(int defaultLevel)
	{
		this.defaultLevel = defaultLevel;
	}
	
	public ComboBox<String> getStatChanges(int slot)
	{
		return statChanges.get(slot);
	}
	
	public String getAbility()
	{
		return ability.getValue();
	}
	
	public String getMoveName (int slot)
	{
		return (String) movesComboBox.get(slot).getValue();
	}
	
	public ListView<String> getTopMoves()
	{
		return topMoves;
	}

	public ObservableList<String> getTopMoveNames()
	{
		return topMoveNames;
	}
	
	public String getDamageOutput(int slot)
	{
		return damageOutput[slot];
	}
	
	public void setDamageOutput(String damageOutput, int slot)
	{
		this.damageOutput[slot] = damageOutput;
	}
	
	public String getDamageRolls(int slot)
	{
		return damageRolls[slot];
	}
	
	public void setDamageRolls(String damageRolls, int slot)
	{
		this.damageRolls[slot] = damageRolls;
	}
	
	public void setDamageOutputShort(String damageOutputShort, int slot)
	{
		this.damageOutputShort[slot] = damageOutputShort;
	}
	
	public String getDamageOutputShort(int slot)
	{
		return damageOutputShort[slot];
	}
}
