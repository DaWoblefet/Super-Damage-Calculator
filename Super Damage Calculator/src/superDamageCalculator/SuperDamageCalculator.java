/* The main GUI. Imports two copies of PokemonSide to represent each Pokemon, a top menubar,
labels at the top to display damage output, and center field options.
*/

package superDamageCalculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.collections.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

import java.awt.Desktop;
import java.net.URI;
import java.util.Arrays;
import java.io.*;
import java.util.Scanner;

public class SuperDamageCalculator extends Application
{
	private PokemonSide leftMon = new PokemonSide();
	private PokemonSide rightMon = new PokemonSide();

	private BorderPane pokemonLeft = leftMon.pokemonSide;
	private BorderPane pokemonRight = rightMon.pokemonSide;

	private Label mainDamageResultLabel;
	private Label mainDamageRollsLabel;

	//Center Options
	private RadioButton levelFive;
	private RadioButton levelFifty;
	private RadioButton levelHundred;
	private ListView<String> format;
	private ListView<String> terrains;
	private ListView<String> weathers;
	private ListView<String> auras;

	private ToggleButton leftProtect;
	private ToggleButton leftReflect;
	private ToggleButton leftLightScreen;
	private ToggleButton leftAuroraVeil;
	private ToggleButton leftHelpingHand;
	private ToggleButton leftFriendGuard;
	private ToggleButton leftPlusOneAll;
	private ToggleButton leftPlusTwoAll;
	private ToggleButton leftSoak;

	private ToggleButton rightProtect;
	private ToggleButton rightReflect;
	private ToggleButton rightLightScreen;
	private ToggleButton rightAuroraVeil;
	private ToggleButton rightHelpingHand;
	private ToggleButton rightFriendGuard;
	private ToggleButton rightPlusOneAll;
	private ToggleButton rightPlusTwoAll;
	private ToggleButton rightSoak;

	private final Clipboard clipboard = Clipboard.getSystemClipboard();
    private final ClipboardContent content = new ClipboardContent();

	@Override
	public void start(Stage primaryStage)
	{
		BorderPane mainPane = new BorderPane();
		BorderPane subPane = new BorderPane();
		mainPane.setStyle("-fx-background-color: #f3f3f3;");

		MenuBar menubar = new MenuBar();

		Menu menuFile = new Menu("File");

		MenuItem psImport = new MenuItem("Import from Showdown");
		psImport.setOnAction(e -> openPSImport());

		MenuItem additionalOptions = new MenuItem("Additional Options");
		additionalOptions.setOnAction(e -> openAdditionalOptions());

		MenuItem menuExit = new MenuItem("Exit");
		menuExit.setOnAction(e -> {System.exit(0);});
		//menuFile.getItems().addAll(additionalOptions, psImport, menuExit); //There are no additional options atm.
		menuFile.getItems().addAll(psImport, menuExit);

		Menu menuLinks = new Menu("Links");
		MenuItem ttHome = new MenuItem("Trainer Tower");
		ttHome.setOnAction(e -> openLink("https://www.trainertower.com"));
		MenuItem psVGC = new MenuItem("Pokemon Showdown VGC room");
		psVGC.setOnAction(e -> openLink("https://play.pokemonshowdown.com/vgc"));
		MenuItem speedTiers = new MenuItem("Speed Tiers");
		speedTiers.setOnAction(e -> openLink("https://trainertower.com/vgc-2018-speed-tiers/"));
		MenuItem survivalCalc = new MenuItem("Survival Calc");
		survivalCalc.setOnAction(e -> openLink("https://www.trainertower.com/survivalcalc/"));
		menuLinks.getItems().addAll(ttHome, psVGC, speedTiers, survivalCalc);

		Menu menuAbout = new Menu("About");

		MenuItem credits = new MenuItem("Credits");
		credits.setOnAction(e -> openCredits());
		menuAbout.getItems().addAll(credits);


		menubar.getMenus().addAll(menuFile, menuLinks, menuAbout);

		/****** BEGIN TOP *******/
		BorderPane center = new BorderPane();
		BorderPane damages = new BorderPane();
		GridPane damageCalcs = new GridPane();
		HBox rollsAndCopy = new HBox();

		leftMon.damageOutput[0] = "This is where the calc would go.";
		mainDamageResultLabel = new Label(leftMon.damageOutput[0]);
		mainDamageResultLabel.setFont(new Font("Times New Roman", 20)); //formerly 28
		mainDamageResultLabel.setWrapText(true);
		damageCalcs.addRow(0, mainDamageResultLabel);

		mainDamageRollsLabel = new Label(Arrays.toString(leftMon.damageRolls[0]));
		mainDamageRollsLabel.setFont(new Font("Times New Roman", 14));
		Button copyCalc = new Button("Copy Calc");
		Button copyCalcAndRolls = new Button("Copy Calc + Damage Rolls");
		rollsAndCopy.getChildren().addAll(mainDamageRollsLabel, copyCalc, copyCalcAndRolls);
		rollsAndCopy.setSpacing(5);
		rollsAndCopy.setAlignment(Pos.CENTER_LEFT);
		damageCalcs.addRow(1, rollsAndCopy);

		Button refreshCalcs = new Button("Refresh damage calcs");
		damages.setLeft(damageCalcs);
		damages.setRight(refreshCalcs);
		refreshCalcs.setOnAction(e ->
		{
			updateDamageCalcs(leftMon, rightMon);
			updateDamageCalcs(rightMon, leftMon);
		});

		copyCalc.setOnAction(e ->
		{
			content.putString(mainDamageResultLabel.getText());
			clipboard.setContent(content);
		});

		copyCalcAndRolls.setOnAction(e ->
		{
			content.putString(mainDamageResultLabel.getText() + "\n" + Arrays.toString(leftMon.damageRolls[0]));
			clipboard.setContent(content);
		});

		/* Coordinates the ListView with the main damage output.*/
		leftMon.topMoves.setOnMouseClicked(e ->
		{
			leftMon.currentMoveslot = leftMon.topMoves.getSelectionModel().getSelectedIndices().get(0);
			System.out.println(leftMon.currentMoveslot);
			mainDamageResultLabel.setText(leftMon.damageOutput[leftMon.currentMoveslot]);
			mainDamageRollsLabel.setText(Arrays.toString(leftMon.damageRolls[leftMon.currentMoveslot]));
		});

		rightMon.topMoves.setOnMouseClicked(e ->
		{
			rightMon.currentMoveslot = rightMon.topMoves.getSelectionModel().getSelectedIndices().get(0);
			mainDamageResultLabel.setText(rightMon.damageOutput[rightMon.currentMoveslot ]);
			mainDamageRollsLabel.setText(Arrays.toString(rightMon.damageRolls[rightMon.currentMoveslot ]));
		});
		/****** END TOP *******/

		/****** BEGIN CENTER *******/
		GridPane fieldOptions = new GridPane();

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

		levelFive.setOnAction(e -> setDefaultLevels(5));
		levelFifty.setOnAction(e -> setDefaultLevels(50));
		levelHundred.setOnAction(e -> setDefaultLevels(100));

		ObservableList<String> formatTypes = FXCollections.observableArrayList("Singles", "Doubles");
		format = new ListView<String>(formatTypes);
		format.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		format.getSelectionModel().select(1);
		format.setOrientation(Orientation.HORIZONTAL);
 		format.setMaxWidth(111);
 		format.setMaxHeight(35);
 		fieldOptions.addRow(1, format);
 		GridPane.setHalignment(format, HPos.CENTER);
 		GridPane.setValignment(format, VPos.CENTER);

 		ObservableList<String> terrainNames = FXCollections.observableArrayList("None", "Electric", "Grassy", "Misty", "Psychic");
		terrains = new ListView<String>(terrainNames);
		terrains.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		terrains.getSelectionModel().select(0);
		terrains.setOrientation(Orientation.HORIZONTAL);
		terrains.setMaxWidth(242);
 		terrains.setMaxHeight(35);
 		fieldOptions.addRow(2, terrains);
 		GridPane.setHalignment(terrains, HPos.CENTER);
 		GridPane.setValignment(terrains, VPos.CENTER);

		ObservableList<String> weatherNames = FXCollections.observableArrayList("None", "Sun", "Rain", "Sand", "Hail", "Strong Winds");
 		weathers = new ListView<String>(weatherNames);
 		weathers.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
 		weathers.getSelectionModel().select(0);
 		weathers.setOrientation(Orientation.HORIZONTAL);
 		weathers.setPrefWidth(277);
 		weathers.setMaxHeight(35);
 		fieldOptions.addRow(3, weathers);
 		GridPane.setHalignment(weathers, HPos.CENTER);
 		GridPane.setValignment(weathers, VPos.CENTER);

 		ObservableList<String> auraNames = FXCollections.observableArrayList("Fairy Aura", "Dark Aura", "Aura Break");
 		auras = new ListView<String>(auraNames);
 		auras.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
 		auras.setOrientation(Orientation.HORIZONTAL);
 		auras.setMaxWidth(208);
 		auras.setMaxHeight(35);
 		fieldOptions.addRow(4, auras);
 		GridPane.setHalignment(auras, HPos.CENTER);
 		GridPane.setValignment(auras, VPos.CENTER);

 		BorderPane sideOptions = new BorderPane();

		/****** BEGIN LEFT-CENTER SIDE OPTIONS *******/
 		GridPane leftSideOptions = new GridPane();

 		leftProtect = new ToggleButton("Protect");
 		leftSideOptions.addRow(0, leftProtect);

		HBox leftScreens = new HBox();
 		leftReflect = new ToggleButton("Reflect");
 		leftLightScreen = new ToggleButton("Light Screen");
 		leftScreens.getChildren().addAll(leftReflect, leftLightScreen);
 		leftSideOptions.addRow(1, leftScreens);

 		leftAuroraVeil = new ToggleButton("Aurora Veil");
 		leftAuroraVeil.setSelected(false);
 		leftSideOptions.addRow(2, leftAuroraVeil);

 		leftHelpingHand = new ToggleButton("Helping Hand");
 		leftSideOptions.addRow(3, leftHelpingHand);

 		leftFriendGuard = new ToggleButton("Friend Guard");
 		leftSideOptions.addRow(4, leftFriendGuard);

		ToggleGroup leftBoosts = new ToggleGroup();
 		leftPlusOneAll = new ToggleButton("+1 All Stats");
 		leftPlusOneAll.setToggleGroup(leftBoosts);
 		leftSideOptions.addRow(5, leftPlusOneAll);
		leftPlusOneAll.setOnAction(e ->
 		{
			if (leftPlusOneAll.isSelected())
			{
				for (int i = 0; i < 6; i++)
				{
					leftMon.statChanges[i].setValue("+1");
				}
			}
			else
			{
				for (int i = 0; i < 6; i++)
				{
					leftMon.statChanges[i].setValue("--");
				}
			}
		});

 		leftPlusTwoAll = new ToggleButton("+2 All Stats");
 		leftPlusTwoAll.setToggleGroup(leftBoosts);
 		leftSideOptions.addRow(6, leftPlusTwoAll);
  		leftPlusTwoAll.setOnAction(e ->
  		{
 			if (leftPlusTwoAll.isSelected())
 			{
 				for (int i = 0; i < 6; i++)
 				{
 					leftMon.statChanges[i].setValue("+2");
 				}
 			}
 			else
 			{
 				for (int i = 0; i < 6; i++)
 				{
 					leftMon.statChanges[i].setValue("--");
 				}
 			}
 		});

 		leftSoak = new ToggleButton("Soak");
 		leftSoak.setOnAction(e ->
 		{
			if (leftSoak.isSelected())
			{
				leftMon.typeLeft.setValue("Water");
				leftMon.typeRight.setValue("(none)");
			}
			else
			{
				leftMon.typeLeft.setValue(leftMon.teamData[leftMon.currentPokemon].getType(0));
				try
				{
					leftMon.typeRight.setValue(leftMon.teamData[leftMon.currentPokemon].getType(1));
				}
				catch (Exception ex) {} //Do nothing because Soak already set the value to (none).
			}
		});
		leftSideOptions.addRow(7, leftSoak);
 		/****** END LEFT-CENTER SIDE OPTIONS *******/

 		/****** BEGIN RIGHT-CENTER SIDE OPTIONS *******/
 		GridPane rightSideOptions = new GridPane();

		rightProtect = new ToggleButton("Protect");
		rightSideOptions.addRow(0, rightProtect);

		HBox rightScreens = new HBox();
		rightReflect = new ToggleButton("Reflect");
		rightLightScreen = new ToggleButton("Light Screen");
		rightScreens.getChildren().addAll(rightReflect, rightLightScreen);
		rightSideOptions.addRow(1, rightScreens);

		rightAuroraVeil = new ToggleButton("Aurora Veil");
		rightSideOptions.addRow(2, rightAuroraVeil);

		rightHelpingHand = new ToggleButton("Helping Hand");
		rightSideOptions.addRow(3, rightHelpingHand);

		rightFriendGuard = new ToggleButton("Friend Guard");
		rightSideOptions.addRow(4, rightFriendGuard);

 		ToggleGroup rightBoosts = new ToggleGroup();
		rightPlusOneAll = new ToggleButton("+1 All Stats");
		rightPlusOneAll.setToggleGroup(rightBoosts);
		rightSideOptions.addRow(5, rightPlusOneAll);
 		rightPlusOneAll.setOnAction(e ->
 		{
			if (rightPlusOneAll.isSelected())
			{
				for (int i = 0; i < 6; i++)
				{
					rightMon.statChanges[i].setValue("+1");
				}
			}
			else
			{
				for (int i = 0; i < 6; i++)
				{
					rightMon.statChanges[i].setValue("--");
				}
			}
		});

		rightPlusTwoAll = new ToggleButton("+2 All Stats");
		rightPlusTwoAll.setToggleGroup(rightBoosts);
		rightSideOptions.addRow(6, rightPlusTwoAll);
 		rightPlusTwoAll.setOnAction(e ->
 		{
			if (rightPlusTwoAll.isSelected())
			{
				for (int i = 0; i < 6; i++)
				{
					rightMon.statChanges[i].setValue("+2");
				}
			}
			else
			{
				for (int i = 0; i < 6; i++)
				{
					rightMon.statChanges[i].setValue("--");
				}
			}
		});
		rightSoak = new ToggleButton("Soak");
 		rightSoak.setOnAction(e ->
 		{
			if (rightSoak.isSelected())
			{
				rightMon.typeLeft.setValue("Water");
				rightMon.typeRight.setValue("(none)");
			}
			else
			{
				rightMon.typeLeft.setValue(rightMon.teamData[rightMon.currentPokemon].getType(0));
				try
				{
					rightMon.typeRight.setValue(rightMon.teamData[rightMon.currentPokemon].getType(1));
				}
				catch (Exception ex) {} //Do nothing because Soak already set the value to (none).
			}
		});
		rightSideOptions.addRow(7, rightSoak);

		/* Right-aligning the right side of the center options to give a mirrored-image effect*/
		GridPane.setHalignment(rightProtect, HPos.RIGHT);
		GridPane.setHalignment(rightScreens, HPos.RIGHT);
		GridPane.setHalignment(rightAuroraVeil, HPos.RIGHT);
		GridPane.setHalignment(rightHelpingHand, HPos.RIGHT);
		GridPane.setHalignment(rightFriendGuard, HPos.RIGHT);
		GridPane.setHalignment(rightPlusOneAll, HPos.RIGHT);
		GridPane.setHalignment(rightPlusTwoAll, HPos.RIGHT);
		GridPane.setHalignment(rightSoak, HPos.RIGHT);

		/****** END RIGHT-CENTER SIDE OPTIONS *******/

		ImageView bottomImage = new ImageView(new Image(getClass().getResourceAsStream("/resources/Wobbuffet-large.png")));
		bottomImage.setPreserveRatio(true);
		bottomImage.setFitHeight(235);

		/****** END CENTER *******/
		updateDamageCalcs(leftMon, rightMon);
		updateDamageCalcs(rightMon, rightMon);

		fieldOptions.setAlignment(Pos.CENTER);
		rightSideOptions.setAlignment(Pos.TOP_RIGHT);
		center.setTop(fieldOptions);
		sideOptions.setLeft(leftSideOptions);
		sideOptions.setRight(rightSideOptions);
		BorderPane.setMargin(rightSideOptions, new Insets(0,5,0,0));
		center.setCenter(sideOptions);
		center.setBottom(bottomImage);
		BorderPane.setAlignment(bottomImage, Pos.CENTER);
		BorderPane.setMargin(bottomImage, new Insets(0,0,5,0));

		subPane.setTop(damages);
		subPane.setLeft(pokemonLeft);
		subPane.setRight(pokemonRight);
		subPane.setCenter(center);

		mainPane.setTop(menubar);
		mainPane.setCenter(subPane);

		Scene scene = new Scene(mainPane, 1200, 675);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Super Damage Calculator");
		primaryStage.show();
	}

	/* Launches the URL in the user's default web browser.*/
	public void openLink(String url)
	{
		try
		{
			Desktop.getDesktop().browse(new URI(url));
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

	public void openAdditionalOptions()
	{
		Stage stage = new Stage();
		BorderPane pane = new BorderPane();
		Text tempText = new Text("Coming Soon!");

		pane.setTop(tempText);

		Scene scene = new Scene(pane, 400, 400);
		stage.setScene(scene);
		stage.setTitle("Additional Options");
		stage.show();
	}

	//The GUI for importing sets from Showdown.
	public void openPSImport()
	{
		Stage stage = new Stage();
		VBox vbox = new VBox();
		BorderPane borderpane = new BorderPane();
		TextArea PSText = new TextArea();
		PSText.setPrefRowCount(36);
		Button leftImportButton = new Button("Import to Left Side");
		Button rightImportButton = new Button("Import to Right Side");
		BorderPane importButtons = new BorderPane();
		importButtons.setLeft(leftImportButton);
		importButtons.setRight(rightImportButton);
		leftImportButton.setOnAction(e -> setImportedData(stage, PSText.getText(), 0));
		rightImportButton.setOnAction(e -> setImportedData(stage, PSText.getText(), 1));

		borderpane.setCenter(importButtons);
		vbox.getChildren().addAll(PSText, borderpane);

		Scene scene = new Scene(vbox, 350, 500);
		stage.setScene(scene);
		stage.setTitle("Import from Pokemon Showdown");
		stage.show();
	}

	//The logic for importing the sets from GUI.
	public void setImportedData(Stage stage, String text, int side)
	{
		ShowdownImport psImport = new ShowdownImport(text);
		if (psImport.getIsTeam())
		{
			if (side == 0) //left side
			{
				for (int i = 0; i < 6; i++)
				{
					leftMon.teamData[i] = psImport.getPokemon(i);
					leftMon.teamSprites[i].setImage(new Image(".\\Sprites\\" + leftMon.teamData[i].getName() + ".png"));
				}
				leftMon.spriteMain.setImage(new Image(".\\Sprites\\" + leftMon.teamData[0].getName() + ".png"));
				leftMon.currentPokemon = 0;
				leftMon.isToggleMon = true;
				leftMon.chooseMon.setValue(leftMon.teamData[leftMon.currentPokemon].getName());
				leftMon.isToggleMon = false;
			}
			else //right side
			{
				for (int i = 0; i < 6; i++)
				{
					rightMon.teamData[i] = psImport.getPokemon(i);
					rightMon.teamSprites[i].setImage(new Image(".\\Sprites\\" + rightMon.teamData[i].getName() + ".png"));
				}
				rightMon.spriteMain.setImage(new Image(".\\Sprites\\" + rightMon.teamData[0].getName() + ".png"));
				rightMon.currentPokemon = 0;
				rightMon.isToggleMon = true;
				rightMon.chooseMon.setValue(rightMon.teamData[rightMon.currentPokemon].getName());
				rightMon.isToggleMon = false;
			}
		}
		else
		{
			if (side == 0) //left side
			{
				leftMon.teamData[leftMon.currentPokemon] = psImport.getPokemon(0);
				leftMon.teamSprites[leftMon.currentPokemon].setImage(new Image(".\\Sprites\\" + leftMon.teamData[leftMon.currentPokemon].getName() + ".png"));
				leftMon.spriteMain.setImage(new Image(".\\Sprites\\" + leftMon.teamData[leftMon.currentPokemon].getName() + ".png"));
				leftMon.isToggleMon = true;
				leftMon.chooseMon.setValue(leftMon.teamData[leftMon.currentPokemon].getName());
				leftMon.isToggleMon = false;
			}
			else //right side
			{
				rightMon.teamData[rightMon.currentPokemon] = psImport.getPokemon(0);
				rightMon.teamSprites[rightMon.currentPokemon].setImage(new Image(".\\Sprites\\" + rightMon.teamData[rightMon.currentPokemon].getName() + ".png"));
				rightMon.spriteMain.setImage(new Image(".\\Sprites\\" + rightMon.teamData[rightMon.currentPokemon].getName() + ".png"));
				rightMon.isToggleMon = true;
				rightMon.chooseMon.setValue(rightMon.teamData[rightMon.currentPokemon].getName());
				rightMon.isToggleMon = false;
			}
		}
		updateDamageCalcs(leftMon, rightMon);
		updateDamageCalcs(rightMon, leftMon);
		stage.close();
	}

	//Opens a text file with credits.
	public void openCredits()
	{
		String credits = "";
		try
		{
			Scanner input = new Scanner(new File("Credits.txt"));
			while (input.hasNextLine())
			{
				credits += input.nextLine() + "\n";
			}
			input.close();
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}


		Stage stage = new Stage();
		TextArea creditsText = new TextArea(credits);
		creditsText.setEditable(false);
		creditsText.setWrapText(true);
		creditsText.setPrefRowCount(19);

		Scene scene = new Scene(creditsText, 405, 325);
		stage.setScene(scene);
		stage.setTitle("Credits");
		stage.show();
	}

	//Assigns a default Level to all Pokemon which can be overriden manually.
	public void setDefaultLevels(int level)
	{
		leftMon.level.setText(Integer.toString(level));
		leftMon.updateStats();
		rightMon.level.setText(Integer.toString(level));
		rightMon.updateStats();
		leftMon.defaultLevel = level;
		rightMon.defaultLevel = level;
	}

	public void updateDamageCalcs(PokemonSide attacker, PokemonSide defender)
	{
		/*
		updateCalc task = new updateCalc(attacker, defender);
		Thread thread = new Thread(task);
		thread.start();
		*/
		attacker.topMoveNames.clear();
		//Left side vs. right side
		for (int i = 0; i < 4; i++)
		{
			int attackingStatToUse = 0;
			int defendingStatToUse = 0;
			String category = (String) attacker.category[i].getValue();
			if (category.equals("Physical"))
			{
				attackingStatToUse = StatConstants.ATK;
				defendingStatToUse = StatConstants.DEF;
			}
			else if (category.equals("Special"))
			{
				attackingStatToUse = StatConstants.SATK;
				defendingStatToUse = StatConstants.SDEF;
			}
			else if (category.equals("Psyshock effect"))
			{
				attackingStatToUse = StatConstants.SATK;
				defendingStatToUse = StatConstants.DEF;
			}

			//Parsing value from the +6 to -6 combobox
			String offenseChange = (String) attacker.statChanges[attackingStatToUse].getValue();
			int offenseChangeValue = parseChangeValue(offenseChange);
			String speedAttackerChange = (String) attacker.statChanges[StatConstants.SPE].getValue();
			int speedAttackerChangeValue = parseChangeValue(speedAttackerChange);
			String defenseChange = (String) defender.statChanges[defendingStatToUse].getValue();
			int defenseChangeValue = parseChangeValue(defenseChange);
			String speedDefenderChange = (String) attacker.statChanges[StatConstants.SPE].getValue();
			int speedDefenderChangeValue = parseChangeValue(speedDefenderChange);

			Object[] damageVariablesLeft = new Object[20];
			damageVariablesLeft[0] = (String) attacker.teamData[attacker.currentPokemon].getName();
			damageVariablesLeft[1] = (String) attacker.typeLeft.getValue();
			damageVariablesLeft[2] = (String) attacker.typeRight.getValue();
			damageVariablesLeft[3] = Integer.parseInt((String) attacker.level.getText());
			damageVariablesLeft[4] = (String) attacker.forme.getValue();
			damageVariablesLeft[5] = Integer.parseInt((String) attacker.calculatedStats[attackingStatToUse].getText());
			damageVariablesLeft[6] = Integer.parseInt((String) attacker.EVsField[attackingStatToUse].getText());
			damageVariablesLeft[7] = Integer.parseInt((String) attacker.calculatedStats[StatConstants.SPE].getText());
			damageVariablesLeft[8] = offenseChangeValue;
			damageVariablesLeft[9] = speedAttackerChangeValue;
			damageVariablesLeft[10] = (String) attacker.nature.getValue();
			damageVariablesLeft[11] = (String) attacker.ability.getValue();
			damageVariablesLeft[12] = (String) attacker.item.getValue();
			damageVariablesLeft[13] = (String) attacker.status.getValue();
			damageVariablesLeft[14] = (String) attacker.moveData[i].getName();
			damageVariablesLeft[15] = Integer.parseInt((String) attacker.basePower[i].getText());
			damageVariablesLeft[16] = (String) attacker.type[i].getValue();
			damageVariablesLeft[17] = (String) attacker.category[i].getValue();
			damageVariablesLeft[18] = (boolean) attacker.crit[i].isSelected();
			damageVariablesLeft[19] = (boolean) attacker.zOption[i].isSelected();

			Object[] damageVariablesRight = new Object[15];
			damageVariablesRight[0] = (String) defender.teamData[defender.currentPokemon].getName();
			damageVariablesRight[1] = (String) defender.typeLeft.getValue();
			damageVariablesRight[2] = (String) defender.typeRight.getValue();
			damageVariablesRight[3] = (String) defender.forme.getValue();
			damageVariablesRight[4] = Integer.parseInt((String) defender.calculatedStats[StatConstants.HP].getText());
			damageVariablesRight[5] = Integer.parseInt((String) defender.EVsField[StatConstants.HP].getText());
			damageVariablesRight[6] = Integer.parseInt((String) defender.calculatedStats[defendingStatToUse].getText());
			damageVariablesRight[7] = Integer.parseInt((String) defender.EVsField[defendingStatToUse].getText());
			damageVariablesRight[8] = Integer.parseInt((String) defender.calculatedStats[StatConstants.SPE].getText());
			damageVariablesRight[9] = defenseChangeValue;
			damageVariablesRight[10] = speedDefenderChangeValue;
			damageVariablesRight[11] = (String) defender.nature.getValue();
			damageVariablesRight[12] = (String) defender.ability.getValue();
			damageVariablesRight[13] = (String) defender.item.getValue();
			damageVariablesRight[14] = (String) defender.status.getValue();

			Object[] damageVariablesCenter = new Object[9];
			damageVariablesCenter[0] = (String) format.getSelectionModel().getSelectedItem();
			damageVariablesCenter[1] = (String) terrains.getSelectionModel().getSelectedItem();
			damageVariablesCenter[2] = (String) weathers.getSelectionModel().getSelectedItem();
			//damageVariablesCenter[3] = (String) auras.getSelectionModel().getSelectedItem(); Auras not implemented yet
			if (attacker.equals(leftMon))
			{
				damageVariablesCenter[4] = (boolean) leftHelpingHand.isSelected();
				damageVariablesCenter[5] = (boolean) rightProtect.isSelected();
				damageVariablesCenter[6] = (boolean) rightReflect.isSelected();
				damageVariablesCenter[7] = (boolean) rightLightScreen.isSelected();
				if (rightAuroraVeil.isSelected()) //Set Reflect and Light Screen to be true
				{
					damageVariablesCenter[6] = true;
					damageVariablesCenter[7] = true;
				}
				damageVariablesCenter[8] = (boolean) rightFriendGuard.isSelected();
			}
			else //the attacker is the right side
			{
				damageVariablesCenter[4] = (boolean) rightHelpingHand.isSelected();
				damageVariablesCenter[5] = (boolean) leftProtect.isSelected();
				damageVariablesCenter[6] = (boolean) leftReflect.isSelected();
				damageVariablesCenter[7] = (boolean) leftLightScreen.isSelected();
				if (leftAuroraVeil.isSelected()) //Set Reflect and Light Screen to be true
				{
					damageVariablesCenter[6] = true;
					damageVariablesCenter[7] = true;
				}
				damageVariablesCenter[8] = (boolean) leftFriendGuard.isSelected();
			}

			CalculateDamage damagecalc = new CalculateDamage(damageVariablesLeft, damageVariablesRight, damageVariablesCenter);
			attacker.damageOutput[i] = damagecalc.getDamageOutput();
			attacker.damageOutputShort[i] = damagecalc.getDamageOutputShort();
			attacker.damageRolls[i] = damagecalc.getDamageRolls();
			attacker.topMoveNames.add((String) attacker.movesComboBox[i].getValue() + " " + attacker.damageOutputShort[i]);
		}

		mainDamageResultLabel.setText(leftMon.damageOutput[leftMon.currentMoveslot]);
		mainDamageRollsLabel.setText(Arrays.toString(leftMon.damageRolls[leftMon.currentMoveslot]));
	}

	public int parseChangeValue(String changeValue)
	{
		int result = 0;
		if (changeValue.charAt(0) == '+') //Attack / Sp. Atk
		{
			result = Character.getNumericValue(changeValue.charAt(1));
		}
		else if (changeValue.charAt(0) == '-')
		{
			result -= Character.getNumericValue(changeValue.charAt(1));
		}
		else {result = 0;}

		return result;
	}

	public static void main(String args[])
	{
		launch(args);
	}

	/* This didn't end up working the way it was supposed to work. It functions better without multithreading right now. */
	class updateCalc implements Runnable
	{
		private PokemonSide attacker;
		private PokemonSide defender;

		public updateCalc(PokemonSide attacker, PokemonSide defender)
		{
			this.attacker = attacker;
			this.defender = defender;
		}

		@Override
		public void run()
		{
			attacker.topMoveNames.clear();
			//Left side vs. right side
			for (int i = 0; i < 4; i++)
			{
				int attackingStatToUse = 0;
				int defendingStatToUse = 0;
				String category = (String) attacker.category[i].getValue();
				if (category.equals("Physical"))
				{
					attackingStatToUse = StatConstants.ATK;
					defendingStatToUse = StatConstants.DEF;
				}
				else if (category.equals("Special"))
				{
					attackingStatToUse = StatConstants.SATK;
					defendingStatToUse = StatConstants.SDEF;
				}
				else if (category.equals("Psyshock effect"))
				{
					attackingStatToUse = StatConstants.SATK;
					defendingStatToUse = StatConstants.DEF;
				}

				//Parsing value from the +6 to -6 combobox
				String offenseChange = (String) attacker.statChanges[attackingStatToUse].getValue();
				int offenseChangeValue = parseChangeValue(offenseChange);
				String speedAttackerChange = (String) attacker.statChanges[StatConstants.SPE].getValue();
				int speedAttackerChangeValue = parseChangeValue(speedAttackerChange);
				String defenseChange = (String) defender.statChanges[defendingStatToUse].getValue();
				int defenseChangeValue = parseChangeValue(defenseChange);
				String speedDefenderChange = (String) attacker.statChanges[StatConstants.SPE].getValue();
				int speedDefenderChangeValue = parseChangeValue(speedDefenderChange);

				Object[] damageVariablesLeft = new Object[20];
				damageVariablesLeft[0] = (String) attacker.teamData[attacker.currentPokemon].getName();
				damageVariablesLeft[1] = (String) attacker.typeLeft.getValue();
				damageVariablesLeft[2] = (String) attacker.typeRight.getValue();
				damageVariablesLeft[3] = Integer.parseInt((String) attacker.level.getText());
				damageVariablesLeft[4] = (String) attacker.forme.getValue();
				damageVariablesLeft[5] = Integer.parseInt((String) attacker.calculatedStats[attackingStatToUse].getText());
				damageVariablesLeft[6] = Integer.parseInt((String) attacker.EVsField[attackingStatToUse].getText());
				damageVariablesLeft[7] = Integer.parseInt((String) attacker.calculatedStats[StatConstants.SPE].getText());
				damageVariablesLeft[8] = offenseChangeValue;
				damageVariablesLeft[9] = speedAttackerChangeValue;
				damageVariablesLeft[10] = (String) attacker.nature.getValue();
				damageVariablesLeft[11] = (String) attacker.ability.getValue();
				damageVariablesLeft[12] = (String) attacker.item.getValue();
				damageVariablesLeft[13] = (String) attacker.status.getValue();
				damageVariablesLeft[14] = (String) attacker.moveData[i].getName();
				damageVariablesLeft[15] = Integer.parseInt((String) attacker.basePower[i].getText());
				damageVariablesLeft[16] = (String) attacker.type[i].getValue();
				damageVariablesLeft[17] = (String) attacker.category[i].getValue();
				damageVariablesLeft[18] = (boolean) attacker.crit[i].isSelected();
				damageVariablesLeft[19] = (boolean) attacker.zOption[i].isSelected();

				Object[] damageVariablesRight = new Object[15];
				damageVariablesRight[0] = (String) defender.teamData[defender.currentPokemon].getName();
				damageVariablesRight[1] = (String) defender.typeLeft.getValue();
				damageVariablesRight[2] = (String) defender.typeRight.getValue();
				damageVariablesRight[3] = (String) defender.forme.getValue();
				damageVariablesRight[4] = Integer.parseInt((String) defender.calculatedStats[StatConstants.HP].getText());
				damageVariablesRight[5] = Integer.parseInt((String) defender.EVsField[StatConstants.HP].getText());
				damageVariablesRight[6] = Integer.parseInt((String) defender.calculatedStats[defendingStatToUse].getText());
				damageVariablesRight[7] = Integer.parseInt((String) defender.EVsField[defendingStatToUse].getText());
				damageVariablesRight[8] = Integer.parseInt((String) defender.calculatedStats[StatConstants.SPE].getText());
				damageVariablesRight[9] = defenseChangeValue;
				damageVariablesRight[10] = speedDefenderChangeValue;
				damageVariablesRight[11] = (String) defender.nature.getValue();
				damageVariablesRight[12] = (String) defender.ability.getValue();
				damageVariablesRight[13] = (String) defender.item.getValue();
				damageVariablesRight[14] = (String) defender.status.getValue();

				Object[] damageVariablesCenter = new Object[9];
				damageVariablesCenter[0] = (String) format.getSelectionModel().getSelectedItem();
				damageVariablesCenter[1] = (String) terrains.getSelectionModel().getSelectedItem();
				damageVariablesCenter[2] = (String) weathers.getSelectionModel().getSelectedItem();
				//damageVariablesCenter[3] = (String) auras.getSelectionModel().getSelectedItem(); Auras not implemented yet
				if (attacker.equals(leftMon))
				{
					damageVariablesCenter[4] = (boolean) leftHelpingHand.isSelected();
					damageVariablesCenter[5] = (boolean) rightProtect.isSelected();
					damageVariablesCenter[6] = (boolean) rightReflect.isSelected();
					damageVariablesCenter[7] = (boolean) rightLightScreen.isSelected();
					if (rightAuroraVeil.isSelected()) //Set Reflect and Light Screen to be true
					{
						damageVariablesCenter[6] = true;
						damageVariablesCenter[7] = true;
					}
					damageVariablesCenter[8] = (boolean) rightFriendGuard.isSelected();
				}
				else //the attacker is the right side
				{
					damageVariablesCenter[4] = (boolean) rightHelpingHand.isSelected();
					damageVariablesCenter[5] = (boolean) leftProtect.isSelected();
					damageVariablesCenter[6] = (boolean) leftReflect.isSelected();
					damageVariablesCenter[7] = (boolean) leftLightScreen.isSelected();
					if (leftAuroraVeil.isSelected()) //Set Reflect and Light Screen to be true
					{
						damageVariablesCenter[6] = true;
						damageVariablesCenter[7] = true;
					}
					damageVariablesCenter[8] = (boolean) leftFriendGuard.isSelected();
				}

				CalculateDamage damagecalc = new CalculateDamage(damageVariablesLeft, damageVariablesRight, damageVariablesCenter);
				attacker.damageOutput[i] = damagecalc.getDamageOutput();
				attacker.damageOutputShort[i] = damagecalc.getDamageOutputShort();
				attacker.damageRolls[i] = damagecalc.getDamageRolls();
				attacker.topMoveNames.add((String) attacker.movesComboBox[i].getValue() + " " + attacker.damageOutputShort[i]);
			}

			mainDamageResultLabel.setText(leftMon.damageOutput[leftMon.currentMoveslot]);
			mainDamageRollsLabel.setText(Arrays.toString(leftMon.damageRolls[leftMon.currentMoveslot]));
		}
	}
}
