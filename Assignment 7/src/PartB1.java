/*
 *	Michael Buffone 
 * 	3/21/2019
 * 	COSC1047W19
 * 	Assignment 7 B1 (Page 718 #21)
 * 
 *  This program will prompt the user to enter a file name, display
 *  its hex representation in a text area, and be able to modify
 *  the hex code which can be saved back to the file
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.*;

public class PartB1 extends Application{
	
	private TextField userInput;
	private TextArea textDisplay;
	
	@Override
	public void start(Stage primaryStage) {
		
		BorderPane mainPane = new BorderPane();
		
		// Top of main pane
		GridPane topPane = new GridPane();
		topPane.setHgap(5);
		topPane.setPadding(new Insets(5,5,5,5));
		
		Label text = new Label("Enter a file:");
		userInput = new TextField();
		userInput.setPrefWidth(400);
		topPane.add(text, 0, 0);
		topPane.add(userInput, 1, 0);
		mainPane.setTop(topPane);
		
		// Center of main pane
		textDisplay = new TextArea();
		textDisplay.setWrapText(true);
		mainPane.setCenter(textDisplay);
		
		// Bottom of main pane
		Button saveChange = new Button("Save the change");
		mainPane.setBottom(saveChange);
		BorderPane.setMargin(saveChange, new Insets(5,5,5,5));
		BorderPane.setAlignment(saveChange, Pos.BOTTOM_CENTER);
		
		// Actions in the main pane
		userInput.setOnAction(e -> readFile());
		
		Scene scene = new Scene(mainPane, 500, 250);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	private void readFile() {
		File file = new File(userInput.getText());
		
		try(DataInputStream dos = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
			
			while(dos.available() > 0) {
				//int currentNum = dos.readInt();
				//textDisplay.appendText(" " + currentNum);
				
				textDisplay.appendText();
			}
			
		}
		catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Application.launch();
	}

}
