/* The main GUI. Imports two copies of PokemonSide to represent each Pokemon, a top menubar,
 * labels at the top to display damage output, and center field options. */

package superDamageCalculator;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.stage.Stage;
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
import java.util.Scanner;

public class SuperDamageCalculator extends Application
{
	//Initializing the HashMaps for use
	private Pokedex pokedex = new Pokedex();
	
	private PokemonSide leftMon = new PokemonSide();
	private PokemonSide rightMon = new PokemonSide();

	private BorderPane pokemonLeft = leftMon.getPokemonSide();
	private BorderPane pokemonRight = rightMon.getPokemonSide();

	private Label mainDamageResultLabel;
	private Label mainDamageRollsLabel;

	private SideFieldOptions leftSideFieldOptions;
	private SideFieldOptions rightSideFieldOptions;
	private FieldOptions fieldOptions;

	private final Clipboard clipboard = Clipboard.getSystemClipboard();
	private final ClipboardContent content = new ClipboardContent();

	@Override
	public void start(Stage primaryStage)
	{
		long startTime = System.currentTimeMillis();
		Thread.setDefaultUncaughtExceptionHandler(SuperDamageCalculator::showError);
		Font.loadFont(getClass().getResourceAsStream("/resources/segoeui.ttf"), 16);
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
		speedTiers.setOnAction(e -> openLink("https://victoryroad.es/en/speed-tiers-vgc19-ultra/"));
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
		GridPane damageCalcs = new GridPane();
		HBox rollsAndCopy = new HBox();
		
		mainDamageResultLabel = new Label("This is where the calc would go.");
		mainDamageResultLabel.setId("damage-label");
		damageCalcs.addRow(0, mainDamageResultLabel);

		mainDamageRollsLabel = new Label(leftMon.getDamageRolls(leftMon.getCurrentMoveslot()));
		mainDamageRollsLabel.setFont(new Font("Times New Roman", 14));
		Button copyCalc = new Button("Copy Calc");
		Button copyRolls = new Button("Copy Rolls");
		Button copyCalcAndRolls = new Button("Copy Calc + Damage Rolls");
		rollsAndCopy.getChildren().addAll(mainDamageRollsLabel, copyCalc, copyRolls, copyCalcAndRolls);
		rollsAndCopy.setSpacing(5);
		rollsAndCopy.setAlignment(Pos.CENTER_LEFT);
		damageCalcs.addRow(1, rollsAndCopy);

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
		leftMon.getTopMoves().setOnMouseClicked(e ->
		{
			leftMon.setCurrentMoveslot(leftMon.getTopMoves().getSelectionModel().getSelectedIndices().get(0));
			mainDamageResultLabel.setText(leftMon.getDamageOutput(leftMon.getCurrentMoveslot()));
			mainDamageRollsLabel.setText(leftMon.getDamageRolls(leftMon.getCurrentMoveslot()));
		});

		rightMon.getTopMoves().setOnMouseClicked(e ->
		{
			rightMon.setCurrentMoveslot(rightMon.getTopMoves().getSelectionModel().getSelectedIndices().get(0));
			mainDamageResultLabel.setText(rightMon.getDamageOutput(rightMon.getCurrentMoveslot()));
			mainDamageRollsLabel.setText(rightMon.getDamageRolls(rightMon.getCurrentMoveslot()));
		});
		/****** END TOP *******/

		/****** BEGIN CENTER *******/
		leftSideFieldOptions = new SideFieldOptions(true);
		leftSideFieldOptions.getGeomancyButton().setOnAction(e ->
		{
			if (leftSideFieldOptions.getGeomancyButton().isSelected())
			{
				for (int i = 0; i < 3; i++)
				{
					leftMon.getStatChanges(i).setValue("--");
					leftMon.getStatChanges(i + 3).setValue("+2");
				}
			}
			else
			{
				for (int i = 0; i < 6; i++)
				{
					leftMon.getStatChanges(i).setValue("--");
				}
			}
		});
		leftSideFieldOptions.getPlusOneAllButton().setOnAction(e ->
		{
			if (leftSideFieldOptions.getPlusOneAllButton().isSelected())
			{
				for (int i = 0; i < 6; i++)
				{
					leftMon.getStatChanges(i).setValue("+1");
				}
			}
			else
			{
				for (int i = 0; i < 6; i++)
				{
					leftMon.getStatChanges(i).setValue("--");
				}
			}
		});
		leftSideFieldOptions.getPlusTwoAllButton().setOnAction(e ->
		{
			if (leftSideFieldOptions.getPlusTwoAllButton().isSelected())
			{
				for (int i = 0; i < 6; i++)
				{
					leftMon.getStatChanges(i).setValue("+2");
				}
			}
			else
			{
				for (int i = 0; i < 6; i++)
				{
					leftMon.getStatChanges(i).setValue("--");
				}
			}
		});
		leftSideFieldOptions.getSoakButton().setOnAction(e ->
		{
			if (leftSideFieldOptions.getSoakButton().isSelected())
			{
				leftMon.getTypeLeft().setValue("Water");
				leftMon.getTypeRight().setValue("(none)");
			}
			else
			{
				Pokemon tempMon = pokedex.get(leftMon.getTeamData(leftMon.getCurrentPokemon()).getName());
				leftMon.getTypeLeft().setValue(tempMon.getType(0));
				leftMon.getTypeRight().setValue(tempMon.getType(1));
			}
		});
		
		
		rightSideFieldOptions = new SideFieldOptions(false);
		rightSideFieldOptions.getGeomancyButton().setOnAction(e ->
		{
			if (rightSideFieldOptions.getGeomancyButton().isSelected())
			{
				for (int i = 0; i < 3; i++)
				{
					rightMon.getStatChanges(i).setValue("--");
					rightMon.getStatChanges(i + 3).setValue("+2");
				}
			}
			else
			{
				for (int i = 0; i < 6; i++)
				{
					rightMon.getStatChanges(i).setValue("--");
				}
			}
		});
		rightSideFieldOptions.getPlusOneAllButton().setOnAction(e ->
		{
			if (rightSideFieldOptions.getPlusOneAllButton().isSelected())
			{
				for (int i = 0; i < 6; i++)
				{
					rightMon.getStatChanges(i).setValue("+1");
				}
			}
			else
			{
				for (int i = 0; i < 6; i++)
				{
					rightMon.getStatChanges(i).setValue("--");
				}
			}
		});
		rightSideFieldOptions.getPlusTwoAllButton().setOnAction(e ->
		{
			if (rightSideFieldOptions.getPlusTwoAllButton().isSelected())
			{
				for (int i = 0; i < 6; i++)
				{
					rightMon.getStatChanges(i).setValue("+2");
				}
			}
			else
			{
				for (int i = 0; i < 6; i++)
				{
					rightMon.getStatChanges(i).setValue("--");
				}
			}
		});
		rightSideFieldOptions.getSoakButton().setOnAction(e ->
		{
			if (rightSideFieldOptions.getSoakButton().isSelected())
			{
				rightMon.getTypeLeft().setValue("Water");
				rightMon.getTypeRight().setValue("(none)");
			}
			else
			{
				Pokemon tempMon = pokedex.get(rightMon.getTeamData(rightMon.getCurrentPokemon()).getName());
				rightMon.getTypeLeft().setValue(tempMon.getType(0));
				rightMon.getTypeRight().setValue(tempMon.getType(1));
			}
		});
		
		fieldOptions = new FieldOptions(leftSideFieldOptions, rightSideFieldOptions);
		
		fieldOptions.getLevelFiveButton().setOnAction(e -> setDefaultLevels(5));
		fieldOptions.getLevelFiftyButton().setOnAction(e -> setDefaultLevels(50));
		fieldOptions.getLevelHundredButton().setOnAction(e -> setDefaultLevels(100));

		ImageView wobbuffet = new ImageView(new Image(getClass().getResourceAsStream("/resources/wobbuffet-large.png")));
		wobbuffet.setPreserveRatio(true);
		wobbuffet.setFitHeight(125);
		wobbuffet.setTranslateY(-100);
		
		wobbuffet.setOnMouseClicked(e -> {openLink("https://www.youtube.com/watch?v=JMX00jdY5AU");});
		
		center.setTop(fieldOptions.getFieldOptions());
		BorderPane sideOptions = new BorderPane();
		sideOptions.setLeft(leftSideFieldOptions.getOptions());
		sideOptions.setRight(rightSideFieldOptions.getOptions());
		sideOptions.setCenter(wobbuffet);
		BorderPane.setMargin(wobbuffet, new Insets(0, -100, 0, -100));
		center.setCenter(sideOptions);

		/****** END CENTER *******/
		
		/****** DYNAMIC UPDATES FOR DAMAGE CALCULATION/ABILITIES *******/
		leftMon.getTriggerCalcs().addListener((observable) ->
		{
			updateDamageCalcs(leftMon.getTeamData(leftMon.getCurrentPokemon()), rightMon.getTeamData(rightMon.getCurrentPokemon()), leftMon, true);
			updateDamageCalcs(rightMon.getTeamData(rightMon.getCurrentPokemon()), leftMon.getTeamData(leftMon.getCurrentPokemon()), rightMon, false);
		});
		rightMon.getTriggerCalcs().addListener((observable) ->
		{
			updateDamageCalcs(leftMon.getTeamData(leftMon.getCurrentPokemon()), rightMon.getTeamData(rightMon.getCurrentPokemon()), leftMon, true);
			updateDamageCalcs(rightMon.getTeamData(rightMon.getCurrentPokemon()), leftMon.getTeamData(leftMon.getCurrentPokemon()), rightMon, false);
		});
		
		leftMon.getTriggerAbilities().addListener((observable) ->
		{
			fieldOptions.setActiveAbilities(leftMon.getAbility(), rightMon.getAbility());
		});
		
		rightMon.getTriggerAbilities().addListener((observable) ->
		{
			fieldOptions.setActiveAbilities(rightMon.getAbility(), leftMon.getAbility());
		});
		
		fieldOptions.getTriggerCalcs().addListener((observable) ->
		{
			updateDamageCalcs(leftMon.getTeamData(leftMon.getCurrentPokemon()), rightMon.getTeamData(rightMon.getCurrentPokemon()), leftMon, true);
			updateDamageCalcs(rightMon.getTeamData(rightMon.getCurrentPokemon()), leftMon.getTeamData(leftMon.getCurrentPokemon()), rightMon, false);
		});
		
		leftSideFieldOptions.getTriggerCalcs().addListener((observable) ->
		{
			updateDamageCalcs(leftMon.getTeamData(leftMon.getCurrentPokemon()), rightMon.getTeamData(rightMon.getCurrentPokemon()), leftMon, true);
			updateDamageCalcs(rightMon.getTeamData(rightMon.getCurrentPokemon()), leftMon.getTeamData(leftMon.getCurrentPokemon()), rightMon, false);
		});
		
		rightSideFieldOptions.getTriggerCalcs().addListener((observable) ->
		{
			updateDamageCalcs(leftMon.getTeamData(leftMon.getCurrentPokemon()), rightMon.getTeamData(rightMon.getCurrentPokemon()), leftMon, true);
			updateDamageCalcs(rightMon.getTeamData(rightMon.getCurrentPokemon()), leftMon.getTeamData(leftMon.getCurrentPokemon()), rightMon, false);
		});
		/****** END DYNAMIC UPDATES FOR DAMAGE CALCULATION/ABILITIES *******/
		
		subPane.setTop(damageCalcs);
		subPane.setLeft(pokemonLeft);
		subPane.setRight(pokemonRight);
		subPane.setCenter(center);

		mainPane.setTop(menubar);
		mainPane.setCenter(subPane);
		
		//Run damage calculation initially before launching
		updateDamageCalcs(leftMon.getTeamData(leftMon.getCurrentPokemon()), rightMon.getTeamData(rightMon.getCurrentPokemon()), leftMon, true);
		updateDamageCalcs(rightMon.getTeamData(rightMon.getCurrentPokemon()), leftMon.getTeamData(leftMon.getCurrentPokemon()), rightMon, false);

		Scene scene = new Scene(mainPane, 1200, 680);
		scene.getStylesheets().add(getClass().getResource("stylesheet.css").toExternalForm());
		//mainDamageResultLabel.prefWidthProperty().bind(scene.widthProperty());
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
		leftMon.setLevel(level);
		rightMon.setLevel(level);
		leftMon.setDefaultLevel(level);
		rightMon.setDefaultLevel(level);
	}
	
	//Passes in the Pokemon for damage calculation, then updates the GUI.
	public void updateDamageCalcs(Pokemon attacker, Pokemon defender, PokemonSide attackerUI, boolean isLeft)
	{
		for (int i = 0; i < 4; i++)
		{
			CalculateDamage damagecalc = new CalculateDamage(attacker.getMove(i), attacker, defender, fieldOptions, isLeft);
			attackerUI.setDamageOutput(damagecalc.getDamageOutput(), i);
			attackerUI.setDamageOutputShort(damagecalc.getDamageOutputShort(), i);
			attackerUI.setDamageRolls(damagecalc.getDamageRolls(), i);
			attackerUI.getTopMoveNames().set(i, attackerUI.getDamageOutputShort(i));
		}
		
		mainDamageResultLabel.setText(leftMon.getDamageOutput(leftMon.getCurrentMoveslot()));
		String rollsText = leftMon.getDamageRolls(leftMon.getCurrentMoveslot());
		mainDamageRollsLabel.setText(rollsText);
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
