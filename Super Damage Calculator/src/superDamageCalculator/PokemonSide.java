/* This GUI is what constitutes each Pokemon of the GUI.
 * Autocomplete feature from ControlsFX (license BSD 3-Clause)*/

package superDamageCalculator;
import javafx.collections.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.*;
import java.util.Objects;
import java.util.Iterator;
import java.util.Set;

import org.controlsfx.control.textfield.TextFields;

import java.util.ArrayList;
import java.util.Collections;

public class PokemonSide
{
	private HashMap<String, Pokemon> pokedex = Pokedex.getPokedex();
	private HashMap<String, Move> movedex = new Movedex().getMovedex();
	private HashMap<String, Item> items = new Itemdex().getItems();
	private HashMap<String, Integer> natures = new Nature().natures;
	private HashMap<String, Integer> abilities = new Abilitydex().abilities;
	private HashMap<String, Integer> types = new Type().types;

	public BorderPane pokemonSide;

	public Pokemon[] teamData = new Pokemon[6];
	private ComboBox<String> chooseMon;
	public int currentPokemon = 0;
	private boolean isToggleMon = false;
	private boolean currentlyZ = false;
	public ComboBox<String> typeLeft;
	public ComboBox<String> typeRight;
	public int defaultLevel = 50;
	public TextField level;
	private ComboBox<String> forme;

	private TextField[] baseField = new TextField[6];
	private TextField[] IVsField = new TextField[6];
	private TextField[] EVsField = new TextField[6];
	private Label[] calculatedStats = new Label[6];
	public ComboBox[] statChanges = new ComboBox[6];

	private ComboBox<String> nature;
	private ComboBox<String> ability;
	private ComboBox<String> item;
	private ComboBox<String> status;

	private TextField currentHP;
	private TextField currentHPPercent;
	private Label totalHPLabel;
	private boolean modifyingHP = false;
	private boolean modifyingHPPercent = false;

	private Move[] moveData = new Move[4];
	public int currentMoveslot;
	public ComboBox[] movesComboBox = new ComboBox[4];
	private TextField[] basePower = new TextField[4];
	private ComboBox[] type = new ComboBox[4];
	private ComboBox[] category = new ComboBox[4];
	private CheckBox[] crit = new CheckBox[4];
	private CheckBox[] zOption = new CheckBox[4];
	public ObservableList<String> topMoveNames;
	public ListView<String> topMoves;

	public String[] damageOutput = new String[4];
	public int[][] damageRolls = new int[4][16];
	public String[] damageOutputShort = new String[4];

	private ImageView spriteMain;
	private ImageView[] teamSprites = new ImageView[6];
	private ToggleButton[] teamSpritesToggles = new ToggleButton[6];
	
	public PokemonSide()
	{
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

		for (int i = 0; i < teamData.length; i++)
		{
			teamData[i] = pokedex.get("Abomasnow");
			for (int j = 0; j < moveData.length; j++)
			{
				teamData[i].setMove(movedex.get("(none)"), j);
			}
		}

		pokemonSide = new BorderPane();
		VBox structure = new VBox();

		GridPane mon = new GridPane();

		spriteMain = new ImageView(new Image("/resources/Sprites/Abomasnow.png"));
		chooseMon = new ComboBox<String>(pokemonNames);
		TextFields.bindAutoCompletion(chooseMon.getEditor(), chooseMon.getItems());
		chooseMon.setEditable(true);
		chooseMon.setPrefWidth(150);
		mon.addRow(0, spriteMain, chooseMon);

		GridPane TLFStructure = new GridPane();
		Label typeLabel = new Label("Type");
		typeLeft = new ComboBox<String>(typeNames);
		typeLeft.setPrefWidth(90);
		typeRight = new ComboBox<String>(typeNames);
		typeRight.setPrefWidth(90);
		TLFStructure.addRow(0, typeLabel, typeLeft, typeRight);
		GridPane.setMargin(typeLabel, new Insets(0,5,0,0));

		Label levelLabel = new Label("Level");
		level = new TextField(Integer.toString(defaultLevel));
		level.setPrefWidth(35);
		GridPane.setMargin(levelLabel, new Insets(0,5,0,0));

		Label formeLabel = new Label("Forme");
		//ObservableList<String> formes = FXCollections.observableArrayList(teamData[currentPokemon].getOtherFormes());
		forme = new ComboBox<String>();
		HBox formeHBox = new HBox(formeLabel, forme);
		formeHBox.setAlignment(Pos.CENTER);
		formeHBox.setSpacing(5);
		TLFStructure.addRow(1, levelLabel, level);
		//TLFStructure.addRow(1, levelLabel, level, formeHBox);
		//Not ready yet, need to figure out how to display the alternate formes correctly TODO

		structure.getChildren().add(TLFStructure);

		GridPane statsStructure = new GridPane();
		Label baseLabel = new Label("Base");
		Label IVsLabel = new Label("IVs");
		Label EVsLabel = new Label("EVs");

		//Import from Pokemon Showdown.
		ImageView psIcon = new ImageView(new Image(getClass().getResourceAsStream("/resources/psIcon.png"), 20, 20, true, true));
		Button importButton = new Button("Import", psIcon);
		statsStructure.addRow(0, new Label(""), baseLabel, IVsLabel, EVsLabel, new Label(""), new Label(""), importButton);
		GridPane.setColumnSpan(importButton, 2);
		GridPane.setMargin(importButton, new Insets(0,5,0,40));

		Label[] statLabel = new Label[6];
		ToggleGroup teamTG = new ToggleGroup();
		Label[] teamSpriteLabels = new Label[6];
		String[] statLabelNames = {"HP", "Attack", "Defense", "Sp. Atk", "Sp. Def", "Speed"};
		for (int i = 0; i < 6; i++)
		{
			statLabel[i] = new Label(statLabelNames[i]);
			baseField[i] = new TextField("100");
			baseField[i].setPrefWidth(35);
			IVsField[i] = new TextField("31");
			IVsField[i].setPrefWidth(35);
			EVsField[i] = new TextField("0");
			EVsField[i].setPrefWidth(35);
			calculatedStats[i] = new Label("100");
			statChanges[i] = new ComboBox<String>(statChangesNames);
			statChanges[i].setPrefWidth(60);
			statChanges[i].setValue("--");
			if (i == 0)
			{
				statChanges[i].setVisible(false); //There is no statChanges for HP.
			}

			teamSpriteLabels[i] = new Label("Mon " + (i+1));
			try
			{
				teamSprites[i] = new ImageView(new Image(getClass().getResourceAsStream("/resources/Sprites/" + teamData[i].getName() + ".png")));
				teamSprites[i].setFitWidth(20);
				teamSprites[i].setFitHeight(15);
				teamSpritesToggles[i] = new ToggleButton(null, teamSprites[i]);
			}
			catch (Exception ex) //If the sprite can't be found for whatever reason, load the ? sprite.
			{
				teamSprites[i] = new ImageView(new Image(getClass().getResourceAsStream("/resources/Sprites/Missingno..png")));
				teamSpritesToggles[i] = new ToggleButton(null, teamSprites[i]);
			}
			teamSpritesToggles[i].setToggleGroup(teamTG);
			statsStructure.addRow(i + 1, statLabel[i], baseField[i], IVsField[i], EVsField[i], calculatedStats[i], statChanges[i], teamSpriteLabels[i], teamSpritesToggles[i]);
			GridPane.setMargin(statLabel[i], new Insets(0,5,0,0));
			GridPane.setMargin(calculatedStats[i], new Insets(0,2,0,5));
			GridPane.setMargin(teamSpriteLabels[i], new Insets(0,5,0,40));
		}

		Label totalEVsLabel = new Label("0");
		Label totalEVsRemainingLabel = new Label("508");
		statsStructure.addRow(7, new Label(""), new Label(""), new Label(""), totalEVsLabel, totalEVsRemainingLabel);
		GridPane.setMargin(totalEVsLabel, new Insets(0,5,0,0));
		GridPane.setMargin(totalEVsRemainingLabel, new Insets(0,5,0,0));
		statsStructure.setPadding(new Insets(5, 0, 0, 0));
		structure.getChildren().add(statsStructure);

		GridPane NAISstructure = new GridPane();
		Label natureLabel = new Label("Nature");
		nature = new ComboBox<String>(natureNames);
		nature.setPrefWidth(85);

		Label abilityLabel = new Label("Ability");
		ability = new ComboBox<String>(abilityNames);
		TextFields.bindAutoCompletion(ability.getEditor(), ability.getItems());
		ability.setPrefWidth(120);
		ability.setEditable(true);

		Label itemLabel = new Label("Item");
		item = new ComboBox<String>(itemNames);
		TextFields.bindAutoCompletion(item.getEditor(), item.getItems());
		item.setPrefWidth(120);
		item.setEditable(true);
		NAISstructure.addRow(0, natureLabel, nature, new Label(""), new Label(""), itemLabel, item);

		Label statusLabel = new Label("Status");
		status = new ComboBox<String>(statusNames);
		status.setPrefWidth(85);
		NAISstructure.addRow(1, abilityLabel, ability, new Label(""), new Label(""), statusLabel, status);

		GridPane.setMargin(natureLabel, new Insets(0,5,0,0));
		GridPane.setMargin(abilityLabel, new Insets(0,5,0,0));
		GridPane.setMargin(itemLabel, new Insets(0,5,0,5));
		GridPane.setMargin(statusLabel, new Insets(0,5,0,5));

		NAISstructure.setPadding(new Insets(9, 0, 0, 0));
		structure.getChildren().add(NAISstructure);

		HBox percentHP = new HBox();
		Label currentHPLabel = new Label("Current HP: ");
		currentHP = new TextField("100");
		currentHP.setPrefWidth(33);
		currentHP.setPrefHeight(10);
		currentHP.setFont(new Font(11));
		currentHP.setTranslateY(currentHP.getLayoutY() - 4);

		totalHPLabel = new Label(" /100 (");
		currentHPPercent = new TextField("100");
		currentHPPercent.setPrefWidth(33);
		currentHPPercent.setPrefHeight(10);
		currentHPPercent.setFont(new Font(11));
		currentHPPercent.setTranslateY(currentHPPercent.getLayoutY() - 4);
		Label currentHPPercentLabel = new Label("%)");
		percentHP.getChildren().addAll(currentHPLabel, currentHP, totalHPLabel, currentHPPercent, currentHPPercentLabel);
		percentHP.setPadding(new Insets(9, 0, 0, 0));
		
		structure.getChildren().add(percentHP);
		GridPane.setRowSpan(percentHP, 2);

		GridPane moveStructure = new GridPane();

		Label BPLabel = new Label("BP");
		Label moveTypeLabel = new Label("Type");
		Label categoryLabel = new Label("Category");
		Label critLabel = new Label("Crit");
		Label ZLabel = new Label("Z-move");
		moveStructure.addRow(0, new Label(""), BPLabel, moveTypeLabel, categoryLabel, critLabel, ZLabel);
		GridPane.setMargin(critLabel, new Insets(0,0,0,5));

		for (int i = 0; i < 4; i++)
		{
			movesComboBox[i] = new ComboBox<String>(moveNames);
			TextFields.bindAutoCompletion(movesComboBox[i].getEditor(), movesComboBox[i].getItems());
			movesComboBox[i].setEditable(true);
			movesComboBox[i].setPrefWidth(110);
			basePower[i] = new TextField();
			basePower[i].setPrefWidth(35);
			type[i] = new ComboBox<String>(typeNames);
			type[i].setPrefWidth(85);
			category[i] = new ComboBox<String>(categories);
			category[i].setPrefWidth(85);
			crit[i] = new CheckBox();
			zOption[i] = new CheckBox();
			moveStructure.addRow(i + 1, movesComboBox[i], basePower[i], type[i], category[i], crit[i], zOption[i]);
			GridPane.setMargin(crit[i], new Insets(0,0,0,5));
		}
		GridPane.setMargin(movesComboBox[3], new Insets(0,0,15,0));
		GridPane.setMargin(basePower[3], new Insets(0,0,15,0));
		GridPane.setMargin(type[3], new Insets(0,0,15,0));
		GridPane.setMargin(category[3], new Insets(0,0,15,0));
		GridPane.setMargin(crit[3], new Insets(0,0,15,5));
		GridPane.setMargin(zOption[3], new Insets(0,0,15,0));
		
		structure.getChildren().add(moveStructure);

		/****** SETTING DEFAULT VALUES ************/
		chooseMon.setValue(teamData[currentPokemon].getName());
		typeLeft.setValue(teamData[currentPokemon].getType(0));
		try
		{
			typeRight.setValue(teamData[currentPokemon].getType(1));
		}
		catch (IndexOutOfBoundsException ex)
		{
			typeRight.setValue("(none)");
		}
		teamSpritesToggles[0].setSelected(true);
		level.setText(Integer.toString(defaultLevel));
		teamData[currentPokemon].setNature("Hardy");;
		nature.setValue("Hardy");
		ability.setValue(teamData[currentPokemon].getAbility(0));
		item.setValue("(none)");
		status.setValue("Healthy");

		for (int i = 0; i < 6; i++)
		{
			teamData[currentPokemon].setStat(Integer.parseInt(EVsField[i].getText()), Integer.parseInt(IVsField[i].getText()), Integer.parseInt(level.getText()), natures.get(nature.getValue()), "--", i);
			baseField[i].setText(Integer.toString(teamData[currentPokemon].getStat(i).getBaseStat()));
			calculatedStats[i].setText(Integer.toString(teamData[currentPokemon].getStat(i).calculateStat()));
		}
		
		currentHP.setText(Integer.toString(teamData[currentPokemon].getStat(0).calculateStat()));
		totalHPLabel.setText("/" + Integer.toString(teamData[currentPokemon].getStat(0).calculateStat()) + " (");
		currentHPPercent.setText("100");

		for (int i = 0; i < 4; i++)
		{
			movesComboBox[i].setValue("(none)");
			moveData[i] = movedex.get((String) movesComboBox[i].getValue());
			basePower[i].setText(Integer.toString(moveData[i].getBP()));
			category[i].setValue(moveData[i].getCategory());
			type[i].setValue(moveData[i].getType());
		}

		BorderPane topPane = new BorderPane();
		topMoveNames = FXCollections.observableArrayList();
		for (int i = 0; i < 4; i++)
		{
			topMoveNames.add((String) movesComboBox[i].getValue() + damageOutputShort[i]);
		}

		topMoves = new ListView<String>(topMoveNames);
		topMoves.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		topMoves.setPrefHeight(94);
		topMoves.setMaxWidth(200);
		/***** END DEFAULTS *******/

		/***** SetOnAction()s to update the GUI live. *******/

		chooseMon.setOnAction(e ->
		{
			if (isToggleMon)
			{
				return;
			}
			
			//Sometimes when a user types too quickly, they load in an illegal Pokemon.
			if (pokedex.get(chooseMon.getValue()) == null)
			{
				return;
			}
			teamData[currentPokemon] = pokedex.get(chooseMon.getValue());

			try
			{
				spriteMain.setImage(new Image(getClass().getResourceAsStream("/resources/Sprites/" + teamData[currentPokemon].getName() + ".png")));
				teamSprites[currentPokemon].setImage(new Image(getClass().getResourceAsStream("/resources/Sprites/" + teamData[currentPokemon].getName() + ".png")));
			}
			catch (IllegalArgumentException ex)
			{
				spriteMain.setImage(new Image(getClass().getResourceAsStream("/resources/Sprites/Missingno..png")));
				teamSprites[currentPokemon].setImage(new Image(getClass().getResourceAsStream("resources/Sprites/Missingno..png")));
			}
			
			typeLeft.setValue(teamData[currentPokemon].getType(0));
			try
			{
				typeRight.setValue(teamData[currentPokemon].getType(1));
			}
			catch (IndexOutOfBoundsException ex)
			{
				typeRight.setValue("(none)");
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
			}
			
			currentHP.setText(Integer.toString(teamData[currentPokemon].getStat(0).calculateStat()));
			totalHPLabel.setText("/" + Integer.toString(teamData[currentPokemon].getStat(0).calculateStat()) + " (");
			currentHPPercent.setText("100");
			
			for (int i = 0; i < 4; i++)
			{
				movesComboBox[i].setValue("(none)");
			}
		});

		//Stat calculation done dynamically
		level.textProperty().addListener((observable) -> {
			try //Make sure input is an integer.
			{
				Integer.parseInt(level.getText());
			}
			catch (NumberFormatException ex)
			{
				level.setText(Integer.toString(defaultLevel));
			}
			updateStats();
		});
		level.setOnKeyPressed(e -> {
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

		typeLeft.setOnAction(e -> 
		{
			teamData[currentPokemon].setType((String) typeLeft.getValue(), 0);
		});
		
		typeRight.setOnAction(e -> 
		{
			teamData[currentPokemon].setType((String) typeRight.getValue(), 1);
		});
		
		nature.setOnAction(e ->
		{
			teamData[currentPokemon].setNature(nature.getValue());
			updateStats();
		});
		
		ability.setOnAction(e ->
		{
			teamData[currentPokemon].setAbility(ability.getValue());
		});
		
		item.setOnAction(e ->
		{
			teamData[currentPokemon].setItem(item.getValue());
		});
		
		status.setOnAction(e ->
		{
			teamData[currentPokemon].setStatus(status.getValue());
		});

		//Stats and their properties
		for (int i = 0; i < 6; i++)
		{
			final int j = i;
			baseField[j].textProperty().addListener((observable) -> {
				if (isToggleMon) {return;}
				
				try //Make sure input is an integer.
				{
					int x = Integer.parseInt(baseField[j].getText());
				}
				catch (NumberFormatException ex)
				{
					baseField[j].setText("1");
				}
				updateStats(j);
			});
			IVsField[j].textProperty().addListener((observable) -> {
				if (isToggleMon) {return;}
				try //Make sure input is an integer.
				{
					Integer.parseInt(IVsField[j].getText());
				}
				catch (NumberFormatException ex)
				{
					IVsField[j].setText("0");
				}
				updateStats(j);
			});
			//Increment or decrement by 1 on UP/DOWN arrows.
			IVsField[j].setOnKeyPressed(e -> {
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
			EVsField[j].textProperty().addListener((observable) ->
			{
				if (isToggleMon) {return;}
				try //Make sure input is an integer.
				{
					Integer.parseInt(EVsField[j].getText());
				}
				catch (NumberFormatException ex)
				{
					EVsField[j].setText("0");
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
			EVsField[j].setOnKeyPressed(e -> {
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
			statChanges[j].setOnAction(e ->
			{
				teamData[currentPokemon].getStat(j).setBoostLevel((String) statChanges[j].getValue());
			});
			
		}
		
		calculatedStats[0].textProperty().addListener((observable) ->
		{
			totalHPLabel.setText("/" + calculatedStats[0].getText() + " (");
			currentHP.setText(calculatedStats[0].getText());
			currentHPPercent.setText("100");
		});
		
		currentHP.textProperty().addListener((observable) ->
		{
			if (modifyingHPPercent) {return;}
			int x = 1;
			try //Make sure input is an integer.
			{
				x = Integer.parseInt(currentHP.getText());
			}
			catch (NumberFormatException ex)
			{
				currentHP.setText("1");
			}
			
			int HPstat = teamData[currentPokemon].getStat(0).calculateStat();
		
			if (x > HPstat) //don't allow higher than the maximum HP stat
			{
				x = HPstat;
				currentHP.setText(Integer.toString(HPstat));
			}
			
			teamData[currentPokemon].setCurrentHP(x);
			modifyingHP = true;
			currentHPPercent.setText(Integer.toString((int) (100.0 * x / HPstat)));
			modifyingHP = false;
		});
		
		currentHPPercent.textProperty().addListener((observable) ->
		{
			if (modifyingHP) {return;}
			int x = 100;
			try //Make sure input is an integer.
			{
				x = Integer.parseInt(currentHPPercent.getText());
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
			int HPstat = teamData[currentPokemon].getStat(0).calculateStat();
			currentHP.setText(Integer.toString((int) (0.01 * x * HPstat)));
			modifyingHPPercent = false;
		});

		//Moves and their properties
		for (int i = 0; i < 4; i++)
		{
			final int j = i;
			movesComboBox[i].setOnAction(e ->
			{
				if (isToggleMon) {return;}
				moveData[j] = movedex.get((String) movesComboBox[j].getValue());
				teamData[currentPokemon].setMove(moveData[j], j);
				basePower[j].setText(Integer.toString(moveData[j].getBP()));
				category[j].setValue(moveData[j].getCategory());
				type[j].setValue(moveData[j].getType());
				zOption[j].setSelected(false);
				topMoveNames.set(j, (String) movesComboBox[j].getValue());
			});
			
			basePower[i].textProperty().addListener((observable) ->
			{
				if (currentlyZ) {return;} //Don't overwrite normal BP with Z-BP.
				teamData[currentPokemon].getMove(j).setBP(Integer.parseInt(basePower[j].getText()));
			});
			
			type[i].setOnAction(e ->
			{
				teamData[currentPokemon].getMove(j).setType((String) type[j].getValue());
			});
			
			category[i].setOnAction(e ->
			{
				teamData[currentPokemon].getMove(j).setCategory((String) category[j].getValue());
			});
			
			crit[i].armedProperty().addListener((observable) ->
			{
				teamData[currentPokemon].getMove(j).setCritChecked(crit[j].isSelected());
			});
			
			//Z-move toggles Z-base power on and off.
			zOption[i].setOnAction(e ->
			{
				if (zOption[j].isSelected())
				{
					currentlyZ = true;
					basePower[j].setText(Integer.toString(moveData[j].getZBP()));
				}
				else
				{
					currentlyZ = false;
					basePower[j].setText(Integer.toString(moveData[j].getBP()));
				}
			});
			zOption[i].armedProperty().addListener((observable) ->
			{
				teamData[currentPokemon].getMove(j).setZChecked(zOption[j].isSelected());
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
			importButton.setOnAction(e -> 
			{
				openPSImport();
			});
		}

		/****** END SETONACTION SETUP *******/

		structure.setPadding(new Insets(0, 5, 0, 5));
		topPane.setTop(new Label(""));
		topPane.setCenter(topMoves);
		pokemonSide.setTop(topPane);
		pokemonSide.setBottom(structure);
		mon.setAlignment(Pos.CENTER);
		pokemonSide.setCenter(mon);
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
			String boostLevel = (String) statChanges[i].getValue();
			teamData[currentPokemon].setStat(currentEVs, currentIVs, currentBaseStat, currentLevel, currentNature, boostLevel, i);
			calculatedStats[i].setText(Integer.toString(teamData[currentPokemon].getStat(i).calculateStat()));
		}
	}

	public void updateStats(int i)
	{
		int currentEVs = Integer.parseInt(EVsField[i].getText());
		int currentIVs = Integer.parseInt(IVsField[i].getText());
		int currentBaseStat = Integer.parseInt(baseField[i].getText());
		int currentLevel = Integer.parseInt(level.getText());
		int currentNature = natures.get(nature.getValue());
		String boostLevel = (String) statChanges[i].getValue();
		teamData[currentPokemon].setStat(currentEVs, currentIVs, currentBaseStat, currentLevel, currentNature, boostLevel, i);
		calculatedStats[i].setText(Integer.toString(teamData[currentPokemon].getStat(i).calculateStat()));
	}
	
	public void loadPokemonDisplay()
	{
		isToggleMon = true;
		chooseMon.setValue(teamData[currentPokemon].getName());
		
		try
		{
			spriteMain.setImage(new Image(getClass().getResourceAsStream("/resources/Sprites/" + teamData[currentPokemon].getName() + ".png")));
			teamSprites[currentPokemon].setImage(new Image(getClass().getResourceAsStream("/resources/Sprites/" + teamData[currentPokemon].getName() + ".png")));
		}
		catch (IllegalArgumentException ex)
		{
			spriteMain.setImage(new Image(getClass().getResourceAsStream("/resources/Sprites/Missingno..png")));
			teamSprites[currentPokemon].setImage(new Image(getClass().getResourceAsStream("resources/Sprites/Missingno..png")));
		}
		
		typeLeft.setValue(teamData[currentPokemon].getType(0));
		try
		{
			typeRight.setValue(teamData[currentPokemon].getType(1));
		}
		catch (IndexOutOfBoundsException ex)
		{
			typeRight.setValue("(none)");
		}

		ability.setValue(teamData[currentPokemon].getAbility(0));
		item.setValue(teamData[currentPokemon].getItem().getName());
		status.setValue(teamData[currentPokemon].getStatus());

		for (int k = 0; k < 6; k++)
		{
			baseField[k].setText(Integer.toString(teamData[currentPokemon].getStat(k).getBaseStat()));
			IVsField[k].setText(Integer.toString(teamData[currentPokemon].getStat(k).getIVs()));
			EVsField[k].setText(Integer.toString(teamData[currentPokemon].getStat(k).getEVs()));
			statChanges[k].setValue(teamData[currentPokemon].getStat(k).getBoostLevel());
		}
		nature.setValue(teamData[currentPokemon].getNature());
		level.setText(Integer.toString(teamData[currentPokemon].getStat(1).getLevel()));
		
		if (teamData[currentPokemon].getCurrentHP() != 0) //if current HP is 0, then load the max HP stat
		{
			currentHP.setText(Integer.toString(teamData[currentPokemon].getCurrentHP()));
		}
		else
		{
			currentHP.setText(Integer.toString(teamData[currentPokemon].getStat(0).calculateStat()));
		}
		totalHPLabel.setText("/" + Integer.toString(teamData[currentPokemon].getStat(0).calculateStat()) + " (");
		
		for (int k = 0; k < 4; k++)
		{
			movesComboBox[k].setValue(teamData[currentPokemon].getMove(k).getName());
			basePower[k].setText(Integer.toString(teamData[currentPokemon].getMove(k).getBP()));
			type[k].setValue(teamData[currentPokemon].getMove(k).getType());
			category[k].setValue(teamData[currentPokemon].getMove(k).getCategory());
			crit[k].setSelected(teamData[currentPokemon].getMove(k).isCritChecked());
			zOption[k].setSelected(teamData[currentPokemon].getMove(k).isZChecked());
		}
		isToggleMon = false;
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
			loadPokemonDisplay();
		}
		stage.close();
	}
	
	// Reads in a HashMap and outputs the name values as an arrayList for use in the ComboBoxes.
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

	public static <T, E> T getKeyByValue(HashMap<T, E> map, E value)
	{
		for (Entry<T, E> entry : map.entrySet())
		{
			if (Objects.equals(value, entry.getValue()))
			{
				return entry.getKey();
			}
		}
		return null;
	}
}
