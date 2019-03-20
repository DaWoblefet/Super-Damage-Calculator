/* The main GUI. Imports two copies of PokemonSide to represent each Pokemon, a top menubar,
 * labels at the top to display damage output, and center field options. */

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
import static superDamageCalculator.StatConstants.*;

public class SuperDamageCalculator extends Application
{
	//Initializing the HashMaps for use
	private Pokedex pokedex = new Pokedex();
	
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
	
	private FieldOptions fieldOptionsLogic = new FieldOptions();

	private final Clipboard clipboard = Clipboard.getSystemClipboard();
    private final ClipboardContent content = new ClipboardContent();

	@Override
	public void start(Stage primaryStage)
	{
		long startTime = System.currentTimeMillis();
		Thread.setDefaultUncaughtExceptionHandler(SuperDamageCalculator::showError);
		BorderPane mainPane = new BorderPane();
		BorderPane subPane = new BorderPane();
		mainPane.setStyle("-fx-background-color: #f3f3f3;");

		MenuBar menubar = new MenuBar();

		Menu menuFile = new Menu("File");

		MenuItem psImport = new MenuItem("Import from Showdown");
		psImport.setOnAction(e -> openPSImport());
		
		MenuItem koChanceWidget = new MenuItem("KO Chance Calculator");
		koChanceWidget.setOnAction(e -> openKOChanceCalculator());

		MenuItem additionalOptions = new MenuItem("Additional Options");
		additionalOptions.setOnAction(e -> openAdditionalOptions());

		MenuItem menuExit = new MenuItem("Exit");
		menuExit.setOnAction(e -> {System.exit(0);});
		//menuFile.getItems().addAll(additionalOptions, psImport, menuExit); //There are no additional options atm.
		menuFile.getItems().addAll(psImport, koChanceWidget, menuExit);

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
		Button copyRolls = new Button("Copy Rolls");
		Button copyCalcAndRolls = new Button("Copy Calc + Damage Rolls");
		rollsAndCopy.getChildren().addAll(mainDamageRollsLabel, copyCalc, copyRolls, copyCalcAndRolls);
		rollsAndCopy.setSpacing(5);
		rollsAndCopy.setAlignment(Pos.CENTER_LEFT);
		damageCalcs.addRow(1, rollsAndCopy);

		Button refreshCalcs = new Button("Refresh damage calcs");
		damages.setLeft(damageCalcs);
		damages.setRight(refreshCalcs);
		refreshCalcs.setOnAction(e ->
		{
			updateDamageCalcs(leftMon.teamData[leftMon.currentPokemon], rightMon.teamData[rightMon.currentPokemon], leftMon, true);
			updateDamageCalcs(rightMon.teamData[rightMon.currentPokemon], leftMon.teamData[leftMon.currentPokemon], rightMon, false);
		});

		copyCalc.setOnAction(e ->
		{
			content.putString(mainDamageResultLabel.getText());
			clipboard.setContent(content);
		});
		
		copyRolls.setOnAction(e ->
		{
			content.putString(mainDamageRollsLabel.getText());
			clipboard.setContent(content);
		});

		copyCalcAndRolls.setOnAction(e ->
		{
			content.putString(mainDamageResultLabel.getText() + "\n" + mainDamageRollsLabel.getText());
			clipboard.setContent(content);
		});

		/* Coordinates the ListView with the main damage output.*/
		leftMon.topMoves.setOnMouseClicked(e ->
		{
			leftMon.currentMoveslot = leftMon.topMoves.getSelectionModel().getSelectedIndices().get(0);
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
		fieldOptionsLogic.setFormat("Doubles");
		format.setOnMouseClicked(e ->
		{
			fieldOptionsLogic.setFormat(format.getSelectionModel().getSelectedItem());
		});
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
		fieldOptionsLogic.setTerrain("None");
		terrains.setOnMouseClicked(e ->
		{
			fieldOptionsLogic.setTerrain(terrains.getSelectionModel().getSelectedItem());
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
 		weathers.getSelectionModel().select(0);
 		fieldOptionsLogic.setWeather("None");
 		weathers.setOnMouseClicked(e ->
		{
			fieldOptionsLogic.setWeather(weathers.getSelectionModel().getSelectedItem());
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
			fieldOptionsLogic.setFairyAura(false);
			fieldOptionsLogic.setDarkAura(false);
			fieldOptionsLogic.setAuraBreak(false);
			
			//Set auras as appropriate
			ObservableList<String> selectedAuras = auras.getSelectionModel().getSelectedItems();
			for (int i = 0; i < selectedAuras.size(); i++)
			{
				switch (selectedAuras.get(i))
				{
					case "Fairy Aura":
						fieldOptionsLogic.setFairyAura(true);
						break;
					case "Dark Aura":
						fieldOptionsLogic.setDarkAura(true);
						break;
					case "Aura Break":
						fieldOptionsLogic.setAuraBreak(true);
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

 		BorderPane sideOptions = new BorderPane();

		/****** BEGIN LEFT-CENTER SIDE OPTIONS *******/
 		GridPane leftSideOptions = new GridPane();

 		leftProtect = new ToggleButton("Protect");
 		leftProtect.setOnAction(e -> 
 		{
 			fieldOptionsLogic.getLeftSideOptions().setProtect(leftProtect.isSelected());
 		});
 		leftSideOptions.addRow(0, leftProtect);

		HBox leftScreens = new HBox();
 		leftReflect = new ToggleButton("Reflect");
 		leftReflect.setOnAction(e -> 
 		{
 			fieldOptionsLogic.getLeftSideOptions().setReflect(leftReflect.isSelected());
 		});
 		leftLightScreen = new ToggleButton("Light Screen");
 		leftLightScreen.setOnAction(e -> 
 		{
 			fieldOptionsLogic.getLeftSideOptions().setLightScreen(leftLightScreen.isSelected());
 		});
 		leftScreens.getChildren().addAll(leftReflect, leftLightScreen);
 		leftSideOptions.addRow(1, leftScreens);

 		leftAuroraVeil = new ToggleButton("Aurora Veil");
 		leftAuroraVeil.setOnAction(e -> 
 		{
 			fieldOptionsLogic.getLeftSideOptions().setAuroraVeil(leftAuroraVeil.isSelected());
 		});
 		leftSideOptions.addRow(2, leftAuroraVeil);

 		leftHelpingHand = new ToggleButton("Helping Hand");
 		leftHelpingHand.setOnAction(e -> 
 		{
 			fieldOptionsLogic.getLeftSideOptions().setHelpingHand(leftHelpingHand.isSelected());
 		});
 		leftSideOptions.addRow(3, leftHelpingHand);

 		leftFriendGuard = new ToggleButton("Friend Guard");
 		leftFriendGuard.setOnAction(e -> 
 		{
 			fieldOptionsLogic.getLeftSideOptions().setFriendGuard(leftFriendGuard.isSelected());
 		});
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
		rightProtect.setOnAction(e -> 
 		{
 			fieldOptionsLogic.getRightSideOptions().setProtect(rightProtect.isSelected());
 		});
		rightSideOptions.addRow(0, rightProtect);

		HBox rightScreens = new HBox();
		rightReflect = new ToggleButton("Reflect");
		rightReflect.setOnAction(e -> 
 		{
 			fieldOptionsLogic.getRightSideOptions().setReflect(rightReflect.isSelected());
 		});
		rightLightScreen = new ToggleButton("Light Screen");
		rightLightScreen.setOnAction(e -> 
 		{
 			fieldOptionsLogic.getRightSideOptions().setLightScreen(rightLightScreen.isSelected());
 		});
		rightScreens.getChildren().addAll(rightReflect, rightLightScreen);
		rightSideOptions.addRow(1, rightScreens);

		rightAuroraVeil = new ToggleButton("Aurora Veil");
		rightAuroraVeil.setOnAction(e -> 
 		{
 			fieldOptionsLogic.getRightSideOptions().setAuroraVeil(rightAuroraVeil.isSelected());
 		});
		rightSideOptions.addRow(2, rightAuroraVeil);

		rightHelpingHand = new ToggleButton("Helping Hand");
		rightHelpingHand.setOnAction(e -> 
 		{
 			fieldOptionsLogic.getRightSideOptions().setHelpingHand(rightHelpingHand.isSelected());
 		});
		rightSideOptions.addRow(3, rightHelpingHand);

		rightFriendGuard = new ToggleButton("Friend Guard");
		rightFriendGuard.setOnAction(e -> 
 		{
 			fieldOptionsLogic.getRightSideOptions().setFriendGuard(rightFriendGuard.isSelected());
 		});
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
		updateDamageCalcs(leftMon.teamData[leftMon.currentPokemon], rightMon.teamData[rightMon.currentPokemon], leftMon, true);
		updateDamageCalcs(rightMon.teamData[rightMon.currentPokemon], leftMon.teamData[leftMon.currentPokemon], rightMon, false);

		fieldOptions.setAlignment(Pos.CENTER);
		rightSideOptions.setAlignment(Pos.TOP_RIGHT);
		center.setTop(fieldOptions);
		sideOptions.setLeft(leftSideOptions);
		sideOptions.setRight(rightSideOptions);
		BorderPane.setMargin(rightSideOptions, new Insets(0,5,0,0));
		center.setCenter(sideOptions);
		center.setBottom(bottomImage);
		BorderPane.setAlignment(bottomImage, Pos.CENTER);
		BorderPane.setMargin(bottomImage, new Insets(0,0,20,0));

		subPane.setTop(damages);
		subPane.setLeft(pokemonLeft);
		subPane.setRight(pokemonRight);
		subPane.setCenter(center);

		mainPane.setTop(menubar);
		mainPane.setCenter(subPane);

		Scene scene = new Scene(mainPane, 1200, 680);
		Image icon = new Image(getClass().getResourceAsStream("/resources/woblescientist.png"));
		primaryStage.getIcons().add(icon);
		primaryStage.setTitle("Super Damage Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		long endTime = System.currentTimeMillis();
		System.out.println("Startup time: " + (endTime - startTime));
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
		Image icon = new Image(getClass().getResourceAsStream("/resources/woblescientist.png"));
		stage.getIcons().add(icon);
		stage.setTitle("Additional Options");
		stage.show();
	}
	
	public void openKOChanceCalculator()
	{
		Stage stage = new Stage();
		KOChanceGUI koChanceGUI = new KOChanceGUI();
		koChanceGUI.start(stage);
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
		leftImportButton.setOnAction(e -> leftMon.setImportedData(stage, PSText.getText()));
		rightImportButton.setOnAction(e -> rightMon.setImportedData(stage, PSText.getText()));

		borderpane.setCenter(importButtons);
		vbox.getChildren().addAll(PSText, borderpane);

		Scene scene = new Scene(vbox, 350, 500);
		Image icon = new Image(getClass().getResourceAsStream("/resources/woblescientist.png"));
		stage.getIcons().add(icon);
		stage.setScene(scene);
		stage.setTitle("Import from Pokemon Showdown");
		stage.show();
	}

	//Opens a text file with credits.
	public void openCredits()
	{
		String credits = "";
		try
		{
			Scanner input = new Scanner((getClass().getResourceAsStream("/resources/Credits.txt")));
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
		Image icon = new Image(getClass().getResourceAsStream("/resources/woblescientist.png"));
		stage.getIcons().add(icon);
		stage.setScene(scene);
		stage.setTitle("Credits");
		stage.show();
	}

	//Assigns a default Level to all Pokemon which can be overriden manually.
	public void setDefaultLevels(int level)
	{
		leftMon.level.setText(Integer.toString(level));
		rightMon.level.setText(Integer.toString(level));
		leftMon.defaultLevel = level;
		rightMon.defaultLevel = level;
	}
	
	//Passes in the Pokemon for damage calculation, then updates the GUI.
	public void updateDamageCalcs(Pokemon attacker, Pokemon defender, PokemonSide attackerUI, boolean isLeft)
	{
		for (int i = 0; i < 4; i++)
		{
			CalculateDamage damagecalc = new CalculateDamage(attacker.getMove(i), attacker, defender, fieldOptionsLogic, isLeft);
			attackerUI.damageOutput[i] = damagecalc.getDamageOutput();
			attackerUI.damageOutputShort[i] = damagecalc.getDamageOutputShort();
			attackerUI.damageRolls[i] = damagecalc.getDamageRolls();
			attackerUI.topMoveNames.set(i, (String) attackerUI.movesComboBox[i].getValue() + " " + attackerUI.damageOutputShort[i]);
		}
		
		mainDamageResultLabel.setText(leftMon.damageOutput[leftMon.currentMoveslot]);
		String rollsText = getRollsText(leftMon.damageRolls[leftMon.currentMoveslot]);
		mainDamageRollsLabel.setText(rollsText);
	}
	
	public String getRollsText(int[] rolls)
	{
		String rollsText = "(";
		for (int i = 0; i < 15; i++)
		{
			rollsText += rolls[i] + ", ";
		}
		rollsText += rolls[15] + ")";
		return rollsText;
	}
	
	//Displays a popup with some exception that gets called for beta testing.
	private static void showError(Thread t, Throwable e)
	{
		Exception ex = new Exception(e);
		ex.printStackTrace();
        String exceptionTrace = ex.getMessage() + "\n";
        StackTraceElement[] stackTrace = e.getStackTrace();
        
        for (int i = 0; i < stackTrace.length; i++)
        {
        	exceptionTrace += stackTrace[i].toString() + "\n";
        }
        
        Stage stage = new Stage();
		TextArea exceptionText = new TextArea("An uncaught exception has occurred. Please copy/paste this log and report it to DaWoblefet. Things should /probably/ still work.\n\n" + exceptionTrace);
		exceptionText.setEditable(false);
		exceptionText.setWrapText(true);
		exceptionText.setPrefRowCount(19);

		Scene scene = new Scene(exceptionText, 405, 325);
		stage.setScene(scene);
		stage.setTitle("Uncaught Exception");
		stage.show();
    }

	public static void main(String args[])
	{
		launch(args);
	}
}
