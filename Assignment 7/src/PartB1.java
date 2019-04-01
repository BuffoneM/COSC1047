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
	
	private TextField tfUserInput;
	private TextArea taTextDisplay;
	private File file;
	
	@Override
	public void start(Stage primaryStage) {
		
		BorderPane mainPane = new BorderPane();
		
		// Top of main pane
		GridPane topPane = new GridPane();
		topPane.setHgap(5);
		topPane.setPadding(new Insets(5,5,5,5));
		
		Label text = new Label("Enter a file:");
		tfUserInput = new TextField();
		tfUserInput.setPrefWidth(400);
				
		topPane.add(text, 0, 0);
		topPane.add(tfUserInput, 1, 0);
		mainPane.setTop(topPane);
		
		// Center of main pane
		taTextDisplay = new TextArea();
		taTextDisplay.setWrapText(true);
		mainPane.setCenter(taTextDisplay);
		
		// Bottom of main pane
		Button btSaveChange = new Button("Save the change");
		mainPane.setBottom(btSaveChange);
		BorderPane.setMargin(btSaveChange, new Insets(5,5,5,5));
		BorderPane.setAlignment(btSaveChange, Pos.BOTTOM_CENTER);
		
		// Actions in the main pane
		tfUserInput.setOnAction(e -> readFile());
		btSaveChange.setOnAction(e -> writeFile());
		
		Scene scene = new Scene(mainPane, 500, 250);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	private void readFile() {
		file = new File(tfUserInput.getText());
		
		try(DataInputStream dos = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
			taTextDisplay.setText("");
			while(dos.available() > 0) {
				int currentNum = dos.read();
				taTextDisplay.appendText(Integer.toString(currentNum) + " ");
				//taTextDisplay.appendText(Integer.toHexString(currentNum) + " ");
			}
			
		}
		catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	private void writeFile() {
		
		try(DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
			
			/*
			 * 1. Take the textDisplay of hex values and take the space out from each value
			 * 2. Parse each hex value into an integer, and write it to the file in base 16
			 */
			String[] parts = taTextDisplay.getText().split(" ");
			int[] hexParts = new int[parts.length];
			for(int i = 0; i < parts.length; i++) {
				
				hexParts[i] = Integer.parseInt(parts[i], 16);
				dos.write(hexParts[i]);
				
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
