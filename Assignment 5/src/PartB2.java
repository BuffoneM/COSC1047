/*
 *	Michael Buffone 
 * 	3/02/2019
 * 	COSC1047W19
 * 	Assignment 5 Question B2 (15.29 pg 639)
 * 	This program will prompt the user to enter values and return a future value
 */


import java.io.File;

import javafx.animation.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.media.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.*;
import javafx.util.Duration;

public class PartB2 extends Application{
	
	double carSpeed = 2;
	
	@Override
	public void start(Stage primaryStage) {
		
		
		Pane mainPane = new Pane();
		Scene scene = new Scene(mainPane, 500, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Cars");
		primaryStage.setResizable(false);
		primaryStage.show();
		
		mainPane.setStyle("-fx-background-color: lightblue");
		
		// Create the text labels
		Text instruction1 = new Text(5, 10, "Up arrow = increase speed");
		Text instruction2 = new Text(5, 25, "Down arrow  = decrease speed");
		Text instruction3 = new Text(5, 40, "Spacebar = pause / play");
		mainPane.getChildren().addAll(instruction1, instruction2, instruction3);
		
		// Create the car
		raceCar car1 = new raceCar();
		car1.setTranslateX(-50);
		car1.setTranslateY(40);
		
		// Create the road
		Rectangle road = new Rectangle(0, 230, 550, 100);
		road.setFill(Color.DARKSLATEGREY);
		road.setStroke(Color.BLACK);
		Line roadLine = new Line(0, 260, 550, 260);
		roadLine.setFill(Color.YELLOW);
		roadLine.setStroke(Color.YELLOW);
		roadLine.getStrokeDashArray().addAll(18d, 10d);
		
		mainPane.getChildren().addAll(road, roadLine, car1);
		
		/*-------------Create the transition-------------*/
		Timeline animation = new Timeline();
		animation.setCycleCount(Animation.INDEFINITE);
		KeyValue movingCar = new KeyValue(car1.layoutXProperty(), 730);
		KeyFrame carFrame = new KeyFrame(Duration.seconds(carSpeed), movingCar);
		animation.getKeyFrames().add(carFrame);
		animation.play();
		
		
		/*--------------To change the speed with beeper and skid--------------*/
		// https://stackoverflow.com/questions/23202272/how-to-play-sounds-with-javafx/29529478
		
		Text speedometer = new Text(300, 20, "");
		speedometer.setFont(Font.font("Comic Sans MS", 20));
		
		scene.setOnKeyPressed(e -> {
		
			// For the speed up and speed down
			if(e.getCode() == KeyCode.UP) {
				
				carSpeed += 0.5;
				animation.setRate(carSpeed);
				
				Media horn = new Media(new File("BeepBeep.mp3").toURI().toString());
				MediaPlayer hornPlayer = new MediaPlayer(horn);
				hornPlayer.play();
			}
			else if(e.getCode() == KeyCode.DOWN) {
				if(carSpeed > 0.0) {
					
					carSpeed -= 0.5;	
					animation.setRate(carSpeed);
					
					Media skrt = new Media(new File("CarSkid.mp3").toURI().toString());
					MediaPlayer skrtPlayer = new MediaPlayer(skrt);
					skrtPlayer.play();
				}
			}
			
			// For the pause
			else if(e.getCode() == KeyCode.SPACE) {
				
				if(animation.getStatus() == Transition.Status.PAUSED) {
					animation.play();
				}
				else {
					animation.pause();
				}
			}
			speedometer.setText(carSpeed * 10 + "km/h"); // Multiply by 10 to make it seem faster
			
		}); // End of setOnKeyPressed
		mainPane.getChildren().add(speedometer);

	}
	
	
	private class raceCar extends Pane {

		raceCar() {
			
			// Wheels
			Circle rWheel = new Circle(10, 205, 6);
			rWheel.setFill(Color.GRAY);
			rWheel.setStroke(Color.BLACK);
			rWheel.setStrokeWidth(4);
			
			Circle fWheel = new Circle(40, 205, 6);
			fWheel.setFill(Color.GRAY);
			fWheel.setStroke(Color.BLACK);
			fWheel.setStrokeWidth(4);
			
			// Body
			Polygon carBody = new Polygon();
			carBody.getPoints().addAll(new Double[] {
										0.0, 200.0,
										55.0, 200.0,
										55.0, 190.0,
										50.0, 188.0,
										46.0, 180.0,
										23.0, 180.0,
										23.0, 188.0,
										0.0, 188.0,	
													});
			carBody.setFill(Color.RED);
			carBody.setStroke(Color.DARKRED);
			getChildren().addAll(rWheel, fWheel, carBody);

			
			// Windows & window trim
			Line windowTrim1 = new Line(23, 188, 50, 188);
			windowTrim1.setStroke(Color.DARKGRAY);
			Line windowTrim2 = new Line(36.5, 188, 36.5, 180);
			windowTrim2.setStroke(Color.DARKGRAY);
			
			Polygon rearWindow = new Polygon();
			rearWindow.getPoints().addAll(new Double[] {
										23.5, 180.5,
										23.5, 187.5,
										36.0, 187.5,
										36.0, 180.5,
			});
			rearWindow.setFill(Color.GHOSTWHITE);
			
			Polygon frontWindow = new Polygon();
			frontWindow.getPoints().addAll(new Double[] {
										37.0, 180.5,
										37.0, 187.5,
										49.5, 187.5,
										46.0, 180.5,
			});
			frontWindow.setFill(Color.GHOSTWHITE);
			getChildren().addAll(windowTrim1, windowTrim2, rearWindow, frontWindow);
		}
		
	}
	
	public static void main(String[] args) {
		Application.launch();
	}
}
