/*
 *	Michael Buffone 
 * 	3/06/2019
 * 	COSC1047W19
 * 	Assignment 6 Question A1 (16.3 pg 682)
 * 	This program will utilize radio buttons and simulate a traffic light
 */

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.*;

public class PartA1 extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		/*----------------Basic objects----------------*/
		BorderPane mainPane = new BorderPane();
		trafficLight light1 = new trafficLight();
		light1.setScaleX(0.5);
		light1.setScaleY(0.5);
		light1.setScaleZ(0.5);
		mainPane.setCenter(light1);
		light1.setTranslateX(75);

		/*----------------Radio buttons----------------*/
		HBox rbPane = new HBox(20);
		rbPane.setPadding(new Insets(10,10,10,10));
		
		RadioButton rbRed = new RadioButton("Red");
		RadioButton rbYellow = new RadioButton("Yellow");
		RadioButton rbGreen = new RadioButton("Green");
		rbPane.getChildren().addAll(rbRed, rbYellow, rbGreen);
		
		ToggleGroup rbGroup = new ToggleGroup();
		rbRed.setToggleGroup(rbGroup);
		rbYellow.setToggleGroup(rbGroup);
		rbGreen.setToggleGroup(rbGroup);
		
		rbPane.setAlignment(Pos.CENTER);
		mainPane.setBottom(rbPane);
		
		/*----------------Button Actions----------------*/
		rbRed.setOnAction(e -> {
			if(rbRed.isSelected()) {
				light1.setRedLightColor();
			}
		});
		rbYellow.setOnAction(e -> {
			if(rbYellow.isSelected()) {
				light1.setYellowLightColor();
			}
		});
		rbGreen.setOnAction(e -> {
			if(rbGreen.isSelected()) {
				light1.setGreenLightColor();
			}
		});

		
		Scene scene = new Scene(mainPane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Traffic Light");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch();
	}

	private class trafficLight extends Pane {
		
		Circle topLight;
		Circle middleLight;
		Circle bottomLight;
		
		trafficLight() {
			
			/*----------------Components of the light----------------*/
			Rectangle rect = new Rectangle(0, 0, 200, 500);
			rect.setStroke(Color.BLACK);
			rect.setFill(Color.GREENYELLOW);
			rect.setStrokeWidth(3);
			
			topLight = new Circle(100, 100, 50 );
			topLight.setStroke(Color.BLACK);
			topLight.setStrokeWidth(1.5);
			topLight.setFill(Color.WHITE);
			
			middleLight = new Circle(100, 250, 50);
			middleLight.setStroke(Color.BLACK);
			middleLight.setStrokeWidth(1.5);
			middleLight.setFill(Color.WHITE);
			
			bottomLight = new Circle(100, 400, 50);
			bottomLight.setStroke(Color.BLACK);
			bottomLight.setStrokeWidth(1.5);
			bottomLight.setFill(Color.WHITE);
			
			getChildren().addAll(rect, topLight, middleLight, bottomLight);
			
		}
		
		// Light methods
		private void setRedLightColor() {
			topLight.setFill(Color.RED);
			middleLight.setFill(Color.WHITE);
			bottomLight.setFill(Color.WHITE);
		}
		private void setYellowLightColor() {
			topLight.setFill(Color.WHITE);
			middleLight.setFill(Color.YELLOW);
			bottomLight.setFill(Color.WHITE);
		}
		private void setGreenLightColor() {
			topLight.setFill(Color.WHITE);
			middleLight.setFill(Color.WHITE);
			bottomLight.setFill(Color.LIGHTGREEN);
		}
	}

}
