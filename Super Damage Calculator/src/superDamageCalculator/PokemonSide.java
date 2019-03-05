/* This GUI is what constitutes each Pokemon of the GUI. A majority of the GUI elements
are declared as public global variables for easier communication between classes. */
package superDamageCalculator;

import javafx.collections.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.geometry.*;
import javafx.scene.control.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.*;
import java.util.Objects;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;

public class PokemonSide
{
	private HashMap<String, Pokemon> pokedex = new Pokedex().pokedex;
	private HashMap<String, Move> movedex = new Movedex().movedex;
	private HashMap<String, Integer> natures = new Nature().natures;
	private HashMap<String, Integer> abilities = new Abilitydex().abilities;
	private HashMap<String, Integer> items = new Itemdex().items;
	private HashMap<String, Integer> types = new Type().types;

	public BorderPane pokemonSide;

	public Pokemon[] teamData = new Pokemon[6];
	public ComboBox<String> chooseMon;
	public int currentPokemon = 0;
	public boolean isToggleMon = false;
	public ComboBox<String> typeLeft;
	public ComboBox<String> typeRight;
	public int defaultLevel = 50;
	public TextField level;
	public ComboBox<String> forme;

	public TextField[] baseField = new TextField[6];
	public TextField[] IVsField = new TextField[6];
	public TextField[] EVsField = new TextField[6];
	public Label[] calculatedStats = new Label[6];
	public ComboBox[] statChanges = new ComboBox[6];

	public ComboBox<String> nature;
	public ComboBox<String> ability;
	public ComboBox<String> item;
	public ComboBox<String> status;

	public TextField currentHP;
	public TextField currentHPPercent;

	public Move[] moveData = new Move[4];
	int currentMoveslot = 0;
	boolean isNewMoveset = true;
	public ComboBox[] movesComboBox = new ComboBox[4];
	public TextField[] basePower = new TextField[4];
	public ComboBox[] type = new ComboBox[4];
	public ComboBox[] category = new ComboBox[4];
	public CheckBox[] crit = new CheckBox[4];
	public CheckBox[] zOption = new CheckBox[4];
	public ObservableList<String> topMoveNames;
	public ListView<String> topMoves;

	public String[] damageOutput = new String[4];
	public int[][] damageRolls = new int[4][16];
	public String[] damageOutputShort = new String[4];

	public ImageView spriteMain;
	public ImageView[] teamSprites = new ImageView[6];
	public ToggleButton[] teamSpritesToggles = new ToggleButton[6];

	public PokemonSide()
	{
		init();
	}

	public void init()
	{
		ArrayList<String> pnames = new ArrayList<>();
		ArrayList<String> mnames = new ArrayList<>();
		ArrayList<String> nnames = new ArrayList<>();
		ArrayList<String> anames = new ArrayList<>();
		ArrayList<String> inames = new ArrayList<>();
		ArrayList<String> tnames = new ArrayList<>();
		pnames = generateNames(pnames, pokedex, true);
		mnames = generateNames(mnames, movedex, true);
		nnames = generateNames(nnames, natures, true);
		anames = generateNames(anames, abilities, true);
		inames = generateNames(inames, items, true);
		tnames = generateNames(tnames, types, true);

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
		//new AutoCompleteComboBoxListener<>(chooseMon);
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
		//Not ready yet, need to figure out how to display the alternate formes correctly

		structure.getChildren().add(TLFStructure);

		GridPane statsStructure = new GridPane();
		Label baseLabel = new Label("Base");
		Label IVsLabel = new Label("IVs");
		Label EVsLabel = new Label("EVs");

		/*Scrapped a plus/minus system, but left them in there because they look pretty. */
		ImageView plusImage = new ImageView(new Image("/resources/greenplus.png"));
		ImageView minusImage = new ImageView(new Image("/resources/redminus.png"));
		Button plus = new Button(null, plusImage);
		Button minus = new Button(null, minusImage);
		statsStructure.addRow(0, new Label(""), baseLabel, IVsLabel, EVsLabel, new Label(""), new Label(""), plus, minus);
		GridPane.setMargin(plus, new Insets(0,5,0,40));

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
			teamSpriteLabels[i] = new Label("Mon " + (i+1));
			try
			{
				teamSprites[i] = new ImageView(new Image("/resources/Sprites/" + teamData[i].getName() + ".png"));
				teamSprites[i].setFitWidth(20);
				teamSprites[i].setFitHeight(15);
				teamSpritesToggles[i] = new ToggleButton(null, teamSprites[i]);
			}
			catch (Exception ex) //If the sprite can't be found for whatever reason, load the ? sprite.
			{
				teamSprites[i] = new ImageView(new Image("/resources/Sprites/Missingno..png"));
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
		structure.getChildren().add(statsStructure);

		GridPane NAISstructure = new GridPane();
		Label natureLabel = new Label("Nature");
		nature = new ComboBox<String>(natureNames);
		nature.setPrefWidth(85);

		Label abilityLabel = new Label("Ability");
		ability = new ComboBox<String>(abilityNames);
		ability.setPrefWidth(120);
		ability.setEditable(true);

		Label itemLabel = new Label("Item");
		item = new ComboBox<String>(itemNames);
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

		structure.getChildren().add(NAISstructure);

		HBox percentHP = new HBox();
		Label currentHPLabel = new Label("150");
		currentHP = new TextField();
		currentHP.setPrefWidth(35);
		Label totalHPLabel = new Label("/" + "150" + "(");
		currentHPPercent = new TextField();
		currentHPPercent.setPrefWidth(35);
		Label currentHPPercentLabel = new Label("%)");
		percentHP.getChildren().addAll(currentHPLabel, currentHP, totalHPLabel, currentHPPercent, currentHPPercentLabel);

		/* This currently messes up the UI by extending it too much.*/
		//structure.getChildren().add(percentHP);

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
			teamData[currentPokemon].setStat(Integer.parseInt(EVsField[i].getText()), Integer.parseInt(IVsField[i].getText()), Integer.parseInt(level.getText()), natures.get(nature.getValue()), i);
			baseField[i].setText(Integer.toString(teamData[currentPokemon].getStat(i).getBaseStat()));
			calculatedStats[i].setText(Integer.toString(teamData[currentPokemon].getStat(i).calculateStat()));
		}

		for (int i = 0; i < 4; i++)
		{
			movesComboBox[i].setValue("(none)");
			moveData[i] = movedex.get((String) movesComboBox[i].getValue());
			basePower[i].setText(Integer.toString(moveData[i].getBP()));
			category[i].setValue(categories.get(moveData[i].getCategory()));
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
			if (!isToggleMon)
			{
				teamData[currentPokemon] = pokedex.get(chooseMon.getValue());
			}

			try
			{
				spriteMain.setImage(new Image("/resources/Sprites/" + teamData[currentPokemon].getName() + ".png"));
				teamSprites[currentPokemon].setImage(new Image("/resources/Sprites/" + teamData[currentPokemon].getName() + ".png"));
			}
			catch (IllegalArgumentException ex)
			{
				spriteMain.setImage(new Image("/Sprites/Missingno..png"));
				teamSprites[currentPokemon].setImage(new Image("/Sprites/Missingno..png"));
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

			if (isToggleMon)
			{
				ability.setValue(teamData[currentPokemon].getAbility(0));
			}
			else
			{
				teamData[currentPokemon].setNature("Hardy");
				ability.setValue(teamData[currentPokemon].getAbility());
			}
			nature.setValue(teamData[currentPokemon].getNature());
			item.setValue(teamData[currentPokemon].getItem());
			status.setValue("Healthy");

			for (int i = 0; i < 6; i++)
			{
				baseField[i].setText(Integer.toString(teamData[currentPokemon].getBaseStat(i)));
				if (isToggleMon)
				{
					IVsField[i].setText(Integer.toString(teamData[currentPokemon].getStat(i).getIVs()));
					EVsField[i].setText(Integer.toString(teamData[currentPokemon].getStat(i).getEVs()));
				}
				else
				{
					IVsField[i].setText("31");
					EVsField[i].setText("0");
				}
				updateStats(i);
			}

			/* TODO: moves are still buggy in one area; if a blank set is loaded from the ComboBox,
			then the user switches to another Pokemon and back without setting an initial move,
			it tries to load an empty move.*/
			if (isToggleMon)
			{
				for (int i = 0; i < 4; i++)
				{
					movesComboBox[i].setValue(teamData[currentPokemon].getMove(i).getName());
				}
			}
			else
			{
				for (int i = 0; i < 4; i++)
				{
					movesComboBox[i].setValue("(none)");
				}
			}
		});

		/* Currently stats (Level, IVs, EVs) do not update dynamically. The user must press Enter. */
		level.setOnAction(e -> updateStats());

		//Nature
		nature.setOnAction(e ->
		{
			teamData[currentPokemon].setNature(nature.getValue());
			if (!isToggleMon)
			{
				updateStats();
			}
		});

		//Stats
		for (int i = 0; i < 6; i++)
		{
			final int j = i;
			baseField[j].setOnAction(e -> updateStats(j));
			IVsField[j].setOnAction(e -> updateStats(j));
			EVsField[j].setOnAction(e ->
			{
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
		}

		//Moves
		for (int i = 0; i < 4; i++)
		{
			final int j = i;
			movesComboBox[i].setOnAction(e ->
			{
				moveData[j] = movedex.get((String) movesComboBox[j].getValue());
				teamData[currentPokemon].setMove(moveData[j], j);
				basePower[j].setText(Integer.toString(moveData[j].getBP()));
				category[j].setValue(categories.get(moveData[j].getCategory()));
				type[j].setValue(moveData[j].getType());
				zOption[j].setSelected(false);
				//topMoveNames.set(j, (String) movesComboBox[j].getValue());
				/*TODO: I would prefer for the damage calc to automatically update after choosing a move,
				*but since it doesn't atm, hide the combobox update*/
			});
		}

		//Z-move toggles Z-base power on and off.
		for (int i = 0; i < 4; i++)
		{
			final int j = i;
			zOption[i].setOnAction(e ->
			{
				if (zOption[j].isSelected())
				{
					basePower[j].setText(Integer.toString(moveData[j].getZBP()));
				}
				else
				{
					basePower[j].setText(Integer.toString(moveData[j].getBP()));
				}
			});
		}

		//Handling switching multiple Pokemon around. Needs some big work.
		for (int i = 0; i < 6; i++)
		{
			final int j = i;
			teamSpritesToggles[i].setOnAction(e ->
			{
				currentPokemon = j;
				isToggleMon = true;
				chooseMon.setValue(teamData[currentPokemon].getName());
				isToggleMon = false;
			});
		}

		/****** END SETONACTION SETUP *******/

		structure.setSpacing(10);
		topPane.setTop(new Label(""));
		topPane.setCenter(topMoves);
		pokemonSide.setTop(topPane);
		pokemonSide.setBottom(structure);
		mon.setAlignment(Pos.CENTER);
		pokemonSide.setCenter(mon);
	}

	/* Reads in a HashMap and outputs the name values as an arrayList for use in the ComboBoxes.
	TODO: Actually fix the forced alphabetical searching. */
	public <E> ArrayList<String> generateNames(ArrayList<String> names, HashMap<?, ?> dex, boolean alphabetize)
	{
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

	public void updateStats()
	{
		for (int i = 0; i < 6; i++)
		{
			teamData[currentPokemon].setStat(Integer.parseInt(EVsField[i].getText()), Integer.parseInt(IVsField[i].getText()), Integer.parseInt(baseField[i].getText()), Integer.parseInt(level.getText()), natures.get(nature.getValue()), i);
			calculatedStats[i].setText(Integer.toString(teamData[currentPokemon].getStat(i).calculateStat()));
		}
	}

	public void updateStats(int i)
	{
		teamData[currentPokemon].setStat(Integer.parseInt(EVsField[i].getText()), Integer.parseInt(IVsField[i].getText()), Integer.parseInt(baseField[i].getText()), Integer.parseInt(level.getText()), natures.get(nature.getValue()), i);
		calculatedStats[i].setText(Integer.toString(teamData[currentPokemon].getStat(i).calculateStat()));
	}
}
