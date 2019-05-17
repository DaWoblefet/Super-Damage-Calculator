/* The main GUI. Imports two copies of PokemonSide to represent each Pokemon, a top menubar,
 * labels at the top to display damage output, and center field options. */

package superDamageCalculator;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

import java.awt.Desktop;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

public class SuperDamageCalculator extends Application
{
	//Initializing the HashMaps for use
	private Pokedex pokedex = new Pokedex();
	
	private PokemonSide[] pokemonSides = new PokemonSide[2];
	private SideFieldOptions[] sideFieldOptions = new SideFieldOptions[2];
	private FieldOptions fieldOptions;
	private final int leftMon = 0;
	private final int rightMon = 1;
	
	private InvalidationListener damageCalcListener;

	private Label mainDamageResultLabel;
	private Label mainDamageRollsLabel;

	private final Clipboard clipboard = Clipboard.getSystemClipboard();
	private final ClipboardContent content = new ClipboardContent();
	private final String currentVersion = "0.5.1";

	@Override
	public void start(Stage primaryStage)
	{
		long startTime = System.currentTimeMillis();
		Thread.setDefaultUncaughtExceptionHandler(SuperDamageCalculator::showError);
		Font.loadFont(getClass().getResourceAsStream("/resources/segoeui.ttf"), 16);
		String latestVersion = checkForUpdates();
		boolean newerVersionExists = !latestVersion.equals(currentVersion);

		/*** Declarations of GUI elements ***/		
		
		//Top Menu
		Menu menuFile = new Menu("File");
		MenuItem psImport = new MenuItem("Import from Showdown");
		MenuItem koChanceWidget = new MenuItem("KO Chance Calculator");
		MenuItem additionalOptions = new MenuItem("Additional Options");
		MenuItem menuExit = new MenuItem("Exit");
		
		Menu menuLinks = new Menu("Links");
		MenuItem ttHome = new MenuItem("Trainer Tower");
		MenuItem psVGC = new MenuItem("Pokemon Showdown VGC room");
		MenuItem speedTiers = new MenuItem("Speed Tiers");
		MenuItem survivalCalc = new MenuItem("Survival Calc");

		Menu menuAbout = new Menu("About");
		MenuItem credits = new MenuItem("Credits");
		
		pokemonSides[leftMon] = new PokemonSide();
		pokemonSides[rightMon] = new PokemonSide();
		
		//Main damage display
		mainDamageResultLabel = new Label("This is where the calc would go.");
		mainDamageResultLabel.setId("damage-result-label");

		mainDamageRollsLabel = new Label(pokemonSides[leftMon].getDamageRolls(pokemonSides[leftMon].getCurrentMoveslot()));
		mainDamageRollsLabel.setId("damage-rolls-label");
		
		Button copyCalc = new Button("Copy Calc");
		Button copyRolls = new Button("Copy Rolls");
		Button copyCalcAndRolls = new Button("Copy Calc + Damage Rolls");
		Button updateButton = new Button("New Update Available! Version " + latestVersion);
		updateButton.setId("update-button");
		
		sideFieldOptions[leftMon] = new SideFieldOptions(true);
		sideFieldOptions[rightMon] = new SideFieldOptions(false);
		fieldOptions = new FieldOptions(sideFieldOptions[leftMon], sideFieldOptions[rightMon]);
		
		ImageView wobbuffet = new ImageView(new Image(getClass().getResourceAsStream("/resources/wobbuffet-large.png")));
		wobbuffet.setPreserveRatio(true);
		wobbuffet.setFitHeight(125);
		wobbuffet.setTranslateY(-100);
		
		/*** Structure of GUI elements ***/
		BorderPane mainPane = new BorderPane(); //What will be set on the scene
		mainPane.setId("main-pane");
		
		MenuBar menubar = new MenuBar(); //Top menubar with a few functions
		//menuFile.getItems().addAll(additionalOptions, psImport, koChanceWidget, menuExit); //There are no additional options atm.
		menuFile.getItems().addAll(psImport, koChanceWidget, menuExit);
		menuLinks.getItems().addAll(ttHome, psVGC, speedTiers, survivalCalc);
		menuAbout.getItems().addAll(credits);
		menubar.getMenus().addAll(menuFile, menuLinks, menuAbout);
		mainPane.setTop(menubar);

		BorderPane subPane = new BorderPane(); //Everything but the menu bar
		subPane.setLeft(pokemonSides[leftMon].getPokemonSide());
		subPane.setRight(pokemonSides[rightMon].getPokemonSide());
		
		GridPane damageCalcs = new GridPane(); //Covers the main damage result and the rolls for that damage result
		damageCalcs.addRow(0, mainDamageResultLabel);
		
		HBox rollsAndCopy = new HBox(); //The rolls for that damage result
		rollsAndCopy.getChildren().addAll(mainDamageRollsLabel, copyCalc, copyRolls, copyCalcAndRolls);
		rollsAndCopy.setId("rolls-and-copy");
		damageCalcs.addRow(1, rollsAndCopy);
		
		if (newerVersionExists) //Add an additional button to notify the user that an update exists
		{
			BorderPane damages = new BorderPane();
			damages.setLeft(damageCalcs);
			damages.setRight(updateButton);
			damages.setPadding(new Insets(2,5,0,5));
			BorderPane.setMargin(updateButton, new Insets(3,0,0,0));
			subPane.setTop(damages);
		}
		else
		{
			damageCalcs.setPadding(new Insets(2,5,0,5));
			subPane.setTop(damageCalcs);
		}
		
		BorderPane center = new BorderPane(); //The field options (both general and specific)
		center.setTop(fieldOptions.getFieldOptions());
		
		BorderPane sideOptions = new BorderPane();
		sideOptions.setLeft(sideFieldOptions[leftMon].getOptions());
		sideOptions.setRight(sideFieldOptions[rightMon].getOptions());
		sideOptions.setCenter(wobbuffet);
		BorderPane.setMargin(wobbuffet, new Insets(0, -100, 0, -100));
		center.setCenter(sideOptions);
		subPane.setCenter(center);
		
		mainPane.setCenter(subPane);
		
		/*** SetOnAction()s for GUI elements ***/
		
		//File -> Options
		psImport.setOnAction(e -> openPSImport());
		koChanceWidget.setOnAction(e -> openKOChanceCalculator());
		additionalOptions.setOnAction(e -> openAdditionalOptions());
		menuExit.setOnAction(e -> {System.exit(0);});
		
		//Links -> Options
		ttHome.setOnAction(e -> openLink("https://www.trainertower.com"));
		psVGC.setOnAction(e -> openLink("https://play.pokemonshowdown.com/vgc"));
		speedTiers.setOnAction(e -> openLink("https://victoryroad.es/en/speed-tiers-vgc19-ultra/"));
		survivalCalc.setOnAction(e -> openLink("https://www.trainertower.com/survivalcalc/"));
		
		//About -> Options
		credits.setOnAction(e -> openCredits());
		
		//Copying the damage rolls information
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
		updateButton.setOnAction(e -> openLink("https://github.com/DaWoblefet/Super-Damage-Calculator/releases"));
		
		//Damage calculation listener.
		damageCalcListener = observable -> {updateDamageCalcs();};
		
		for (int i = 0; i < pokemonSides.length; i++)
		{
			final int j = i;
			
			//Coordinates the Moves ListView with the main damage output.
			pokemonSides[i].getTopMoves().setOnMouseClicked(e ->
			{
				pokemonSides[j].setCurrentMoveslot(pokemonSides[j].getTopMoves().getSelectionModel().getSelectedIndices().get(0));
				mainDamageResultLabel.setText(pokemonSides[j].getDamageOutput(pokemonSides[j].getCurrentMoveslot()));
				mainDamageRollsLabel.setText(pokemonSides[j].getDamageRolls(pokemonSides[j].getCurrentMoveslot()));
			});
			
			//Dynamic damage calculation. I turn this listener on and off occasionally to optimize how many times the function is called.
			pokemonSides[i].getTriggerCalcs().addListener(damageCalcListener);
			
			//Dynamic ability updates
			pokemonSides[i].getTriggerAbilities().addListener((observable) ->
			{
				fieldOptions.setActiveAbilities(pokemonSides[leftMon].getAbility(), pokemonSides[rightMon].getAbility(), j);
			});
			
			//Dynamic damage calculation based on the sideFieldOptions
			sideFieldOptions[i].getTriggerCalcs().addListener(damageCalcListener);
			
			//Geomancy
			sideFieldOptions[i].getGeomancyButton().setOnAction(e ->
			{
				pokemonSides[j].getTriggerCalcs().removeListener(damageCalcListener);
				if (sideFieldOptions[j].getGeomancyButton().isSelected())
				{			
					for (int k = 0; k < 3; k++)
					{
						pokemonSides[j].getTriggerCalcs().removeListener(damageCalcListener);
						pokemonSides[j].getStatChanges(k).setValue("--");
						pokemonSides[j].getStatChanges(k + 3).setValue("+2");
					}
				}
				else
				{
					for (int k = 0; k < 6; k++)
					{
						pokemonSides[j].getStatChanges(k).setValue("--");
					}
				}
				updateDamageCalcs();
				pokemonSides[j].getTriggerCalcs().addListener(damageCalcListener);
			});
			
			//+1 all stats
			sideFieldOptions[i].getPlusOneAllButton().setOnAction(e ->
			{
				pokemonSides[j].getTriggerCalcs().removeListener(damageCalcListener);
				if (sideFieldOptions[j].getPlusOneAllButton().isSelected())
				{
					for (int k = 0; k < 6; k++)
					{
						pokemonSides[j].getStatChanges(k).setValue("+1");	
					}
				}
				else
				{
					for (int k = 0; k < 6; k++)
					{	
						pokemonSides[j].getStatChanges(k).setValue("--");	
					}
				}
				updateDamageCalcs();
				pokemonSides[j].getTriggerCalcs().addListener(damageCalcListener);
			});
			
			//+2 all stats
			sideFieldOptions[i].getPlusTwoAllButton().setOnAction(e ->
			{
				pokemonSides[j].getTriggerCalcs().removeListener(damageCalcListener);
				if (sideFieldOptions[j].getPlusTwoAllButton().isSelected())
				{
					for (int k = 0; k < 6; k++)
					{
						pokemonSides[j].getStatChanges(k).setValue("+2");
					}
				}
				else
				{
					for (int k = 0; k < 6; k++)
					{	
						pokemonSides[j].getStatChanges(k).setValue("--");		
					}
				}
				updateDamageCalcs();
				pokemonSides[j].getTriggerCalcs().addListener(damageCalcListener);
			});
			
			//Soak
			sideFieldOptions[i].getSoakButton().setOnAction(e ->
			{
				pokemonSides[j].getTriggerCalcs().removeListener(damageCalcListener);
				if (sideFieldOptions[j].getSoakButton().isSelected())
				{	
					pokemonSides[j].getTypeLeft().setValue("Water");
					pokemonSides[j].getTypeRight().setValue("(none)");
				}
				else
				{
					Pokemon tempMon = pokedex.get(pokemonSides[j].getTeamData(pokemonSides[j].getCurrentPokemon()).getName());
					pokemonSides[j].getTypeLeft().setValue(tempMon.getType(0));
					pokemonSides[j].getTypeRight().setValue(tempMon.getType(1));			
				}
				updateDamageCalcs();
				pokemonSides[j].getTriggerCalcs().addListener(damageCalcListener);
			});
		}
		
		//Dynamic damage calculation based on field options
		fieldOptions.getTriggerCalcs().addListener(damageCalcListener);
		
		//Default levels 
		fieldOptions.getLevelFiveButton().setOnAction(e -> setDefaultLevels(5));
		fieldOptions.getLevelFiftyButton().setOnAction(e -> setDefaultLevels(50));
		fieldOptions.getLevelHundredButton().setOnAction(e -> setDefaultLevels(100));
		
		//Fun link for clicking Wobbuffet
		wobbuffet.setOnMouseClicked(e -> {openLink("https://www.youtube.com/watch?v=JMX00jdY5AU");});
		
		//Run damage calculation initially before launching
		updateDamageCalcs();
		
		//Final touches
		Scene scene = new Scene(mainPane, 1200, 660);
		
		scene.getStylesheets().add(getClass().getResource("stylesheet.css").toExternalForm());
		Image icon = new Image(getClass().getResourceAsStream("/resources/woblescientist.png"));
		primaryStage.getIcons().add(icon);
		primaryStage.setTitle("Super Damage Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//System.out.println(scene.getHeight());
		//System.out.println(scene.getWidth());
		long endTime = System.currentTimeMillis();
		System.out.println("Startup time: " + (endTime - startTime));
	}

	//Launches the URL in the user's default web browser.
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
		leftImportButton.setOnAction(e -> pokemonSides[leftMon].setImportedData(stage, PSText.getText()));
		rightImportButton.setOnAction(e -> pokemonSides[rightMon].setImportedData(stage, PSText.getText()));

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
		for (int i = 0; i < pokemonSides.length; i++)
		{
			pokemonSides[i].getTriggerCalcs().removeListener(damageCalcListener);
			pokemonSides[i].setLevel(level);
			pokemonSides[i].setDefaultLevel(level);
			pokemonSides[i].getTriggerCalcs().addListener(damageCalcListener);
		}	
		updateDamageCalcs();
	}
	
	//Passes in the Pokemon for damage calculation, then updates the GUI.
	public void updateDamageCalcs()
	{
		System.out.println("Doing another set of damage calculations.");
		
		Pokemon leftPokemon = pokemonSides[leftMon].getTeamData(pokemonSides[leftMon].getCurrentPokemon());
		Pokemon rightPokemon = pokemonSides[rightMon].getTeamData(pokemonSides[rightMon].getCurrentPokemon());
		
		//Attacker left Pokemon vs Defender right Pokemon
		for (int i = 0; i < 4; i++)
		{
			CalculateDamage damagecalc = new CalculateDamage(leftPokemon.getMove(i), leftPokemon, rightPokemon, fieldOptions, true);
			pokemonSides[leftMon].setDamageOutput(damagecalc.getDamageOutput(), i);
			pokemonSides[leftMon].setDamageOutputShort(damagecalc.getDamageOutputShort(), i);
			pokemonSides[leftMon].setDamageRolls(damagecalc.getDamageRolls(), i);
			pokemonSides[leftMon].getTopMoveNames().set(i, pokemonSides[leftMon].getDamageOutputShort(i));
		}
		
		//Attacker right Pokemon vs Defender left Pokemon
		for (int i = 0; i < 4; i++)
		{
			CalculateDamage damagecalc = new CalculateDamage(rightPokemon.getMove(i), rightPokemon, leftPokemon, fieldOptions, true);
			pokemonSides[rightMon].setDamageOutput(damagecalc.getDamageOutput(), i);
			pokemonSides[rightMon].setDamageOutputShort(damagecalc.getDamageOutputShort(), i);
			pokemonSides[rightMon].setDamageRolls(damagecalc.getDamageRolls(), i);
			pokemonSides[rightMon].getTopMoveNames().set(i, pokemonSides[rightMon].getDamageOutputShort(i));
		}
		
		mainDamageResultLabel.setText(pokemonSides[leftMon].getDamageOutput(pokemonSides[leftMon].getCurrentMoveslot()));
		String rollsText = pokemonSides[leftMon].getDamageRolls(pokemonSides[leftMon].getCurrentMoveslot());
		mainDamageRollsLabel.setText(rollsText);
	}
	
	//Makes a connection using the Github API and just searches directly for the tag in the retrieved JSON.
	public String checkForUpdates()
	{
		String tag = currentVersion;
		String apiEndpoint = "https://api.github.com/repos/dawoblefet/super-damage-calculator/releases/latest";
		HttpsURLConnection openConnection = null;
		try
		{
			openConnection = (HttpsURLConnection) new URL(apiEndpoint).openConnection();
			openConnection.setRequestMethod("GET");
			openConnection.addRequestProperty("User-Agent", "Chrome/71.0.3578.98");
			openConnection.connect();
			
			Scanner responseScanner = new Scanner(openConnection.getInputStream());
			String fullResponse = responseScanner.nextLine();
			responseScanner.close();
			int tagLocation = fullResponse.indexOf("\"tag_name\":\"");
			int endTagLocation = fullResponse.indexOf("\",", tagLocation);
			tag = fullResponse.substring(tagLocation + "\"tag_name\":\"".length(), endTagLocation);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			tag = currentVersion; //If something messed up, just assume user is on latest version.
		}
		
		return tag;
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
