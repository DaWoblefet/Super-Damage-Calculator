package superDamageCalculator;

import java.util.ArrayList;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DamageOptimizationTabs
{
	private Tab koChance;
	private KOChanceLogic calculation;
	
	
	private Tab autoKO;
	private Tab survivalCalc;
	private TabPane functions;
	
	private final Clipboard clipboard = Clipboard.getSystemClipboard();
	private final ClipboardContent content = new ClipboardContent();
	
	public DamageOptimizationTabs()
	{
		koChance = new Tab("KO Chance Calculator");
		autoKO = new Tab("AutoKO");
		survivalCalc = new Tab("Survival Calc");
		functions = new TabPane(koChance, autoKO, survivalCalc);
		functions.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
		functions.setId("damageOptimizationTabs");
		
		koChance.setContent(generateKOChanceGUI());
		autoKO.setContent(new Text("Coming Soon!"));
		survivalCalc.setContent(new Text("Coming Soon!"));
	}
	
	public TabPane getTabFunctions()
	{
		return functions;
	}
	
	public BorderPane generateKOChanceGUI()
	{
		final int ROLLS_TF_WIDTH = 375;
		final int ROLLS_LABEL_WIDTH = 33;
		BorderPane pane = new BorderPane();

		/* HP Stat, top */
		BorderPane top = new BorderPane();
		top.setPadding(new Insets(2, 0, 5, 0));
		GridPane hpInput = new GridPane();
		Label hpLabel = new Label("HP Stat: ");
		TextField hpTF = new TextField("0");
		hpTF.setPrefWidth(40);
		hpInput.addRow(0, hpLabel, hpTF);
		top.setLeft(hpInput);

		Button helpButton = new Button("Help");
		top.setRight(helpButton);

		pane.setTop(top);

		/* Damage roll entry, center */
		GridPane center = new GridPane();
		center.setPadding(new Insets(0, 0, 10, 0));
		ScrollPane rollsScrollPane = new ScrollPane();
		rollsScrollPane.setPadding(new Insets(0, 0, 2, 0));
		rollsScrollPane.setFitToWidth(true);
		GridPane rollsInput = new GridPane();

		ArrayList<Label> rollLabels = new ArrayList<Label>();
		ArrayList<TextField> rollTFs = new ArrayList<TextField>();

		for (int i = 0; i < 2; i++)
		{
			rollLabels.add(new Label("Set " + (i + 1) + ": "));
			rollLabels.get(i).setMinWidth(ROLLS_LABEL_WIDTH);
			rollTFs.add(new TextField("(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)"));
			rollTFs.get(i).setPrefWidth(ROLLS_TF_WIDTH);

			GridPane.setConstraints(rollLabels.get(i), 0, i);
			GridPane.setConstraints(rollTFs.get(i), 1, i);

			rollsInput.getChildren().addAll(rollLabels.get(i), rollTFs.get(i));
		}
		rollsScrollPane.setContent(rollsInput);
		rollsInput.setVgap(2);
		
		BorderPane plusMinusCalculate = new BorderPane();
		
		GridPane plusMinus = new GridPane();
		Button addRowButton = new Button("+");
		Button removeRowButton = new Button("-");
		removeRowButton.setPrefWidth(25); //match dimensions of addRow
		plusMinus.addRow(0, addRowButton, removeRowButton);
		plusMinus.setHgap(5);
		
		Button calcButton = new Button("Calculate");
		
		plusMinusCalculate.setLeft(plusMinus);
		plusMinusCalculate.setRight(calcButton);
		
		center.addRow(0, rollsScrollPane);
		center.addRow(1, plusMinusCalculate);
		pane.setCenter(center);

		/* Results, Bottom */
		GridPane results = new GridPane();

		ComboBox<String> outputTypes = new ComboBox<String>();
		outputTypes.setItems(FXCollections.observableArrayList("% of the time", "Raw fraction", "Reduced fraction"));
		outputTypes.setValue("% of the time");
		
		TextField outputTF = new TextField();
		outputTF.setPrefWidth(200);
		outputTF.setEditable(false);
		
		Button copyOutput = new Button("Copy");
		copyOutput.setOnAction(e ->
		{
			content.putString(outputTF.getText());
			clipboard.setContent(content);
		});

		results.addRow(0, outputTypes, outputTF, copyOutput);
		results.setHgap(5);
		pane.setBottom(results);

		addRowButton.setOnAction(e ->
		{
			rollLabels.add(new Label("Set " + (rollLabels.size() + 1) + ": "));
			rollTFs.add(new TextField("(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)"));

			int index = rollTFs.size() - 1;
			rollTFs.get(index).setPrefWidth(ROLLS_TF_WIDTH);
			rollLabels.get(index).setMinWidth(ROLLS_LABEL_WIDTH);
			
			GridPane.setConstraints(rollLabels.get(index), 0, index);
			GridPane.setConstraints(rollTFs.get(index), 1, index);

			rollsInput.getChildren().addAll(rollLabels.get(index), rollTFs.get(index));
		});

		removeRowButton.setOnAction(e ->
		{
			int index = rollTFs.size() - 1;
			if (index == 0) {return;} //Don't let user remove roll input boxes if there's only 1 left

			rollsInput.getChildren().remove(rollLabels.get(index));
			rollsInput.getChildren().remove(rollTFs.get(index));

			rollLabels.remove(index);
			rollTFs.remove(index);
		});

		calcButton.setOnAction(e ->
		{
			int HPStat = Integer.parseInt(hpTF.getText());

			int[][] damageRollSets = new int[rollTFs.size()][16];

			for (int i = 0; i < rollTFs.size(); i++)
			{
				damageRollSets[i] = parseDamageRolls(rollTFs.get(i).getText());
			}

			calculation = new KOChanceLogic(HPStat, damageRollSets);
			displayResult(outputTypes, outputTF);
		});
		
		outputTypes.setOnAction(e -> {displayResult(outputTypes, outputTF);});
		helpButton.setOnAction(e -> {openHelp();});
		
		return pane;
	}
	
	public int[] parseDamageRolls(String input)
	{
		//Sanitizes () if they exist.
		if (input.contains("("))
		{
			input = input.substring(1, input.length());
		}
		if (input.contains(")"))
		{
			input = input.substring(0, input.length() - 1);
		}
		String[] rollsString = input.split(", ");

		//Sanity check for damage roll input.
		if (rollsString.length != 16)
		{
			return new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		}

		//If you've made it this far, you should be good.
		int[] damageRolls = new int[16];
		for (int i = 0; i < 16; i++)
		{
			damageRolls[i] = Integer.parseInt(rollsString[i]);
		}

		return damageRolls;
	}
	
	public void displayResult(ComboBox<String> outputTypes, TextField outputTF)
	{
		if (calculation == null) {return;}
		String text;
		switch (outputTypes.getValue())
		{
			case "% of the time":
				text = calculation.getPercentToKO() + "% chance to KO";
				break;
			case "Raw fraction":
				text = calculation.getFractionToKO();
				break;
			case "Reduced fraction":
				text = calculation.getSimplifiedFractionToKO();
				break;
			default:
				text = "";
				break;
		}
		outputTF.setText(text);
	}
	

	public void openHelp()
	{
		Stage stage = new Stage();
		String helpTextRaw = "";
		try
		{
			Scanner input = new Scanner((getClass().getResourceAsStream("/resources/kochancecalchelptext.txt")));
			while (input.hasNextLine())
			{
				helpTextRaw += input.nextLine() + "\n";
			}
			input.close();
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		TextArea helpText = new TextArea(helpTextRaw);
		helpText.setEditable(false);
		helpText.setWrapText(true);
		helpText.setPrefRowCount(19);

		Scene scene = new Scene(helpText, 500, 300);
		stage.setScene(scene);
		stage.setTitle("Help");
		stage.show();
		return;
	}
	
	
}
