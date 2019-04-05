/*
 *	Michael Buffone 
 * 	3/01/2019
 * 	COSC1047W19
 * 	Assignment 5 Question A2 (15.27 pg 638)
 * 	This program will animate text which can be played/paused
 */

import javafx.application.*;
import javafx.animation.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;
import javafx.util.Duration;

public class PartA2 extends Application {
	
	
	@Override
	public void start(Stage primaryStage) {
		
		/* ---------------------ANIMATE THE TEXT--------------------- */
		Pane pane = new Pane();
		
		Text movingText = new Text(-500, 110, "Michael Buffone");
		movingText.setFont(Font.font("Comic Sans MS", 50));
		pane.getChildren().add(movingText);		
		
		/*
		 * Create a Timeline where the text starts to move outside of the view
		 * of the user and then passes through
		 */
		Timeline transition = new Timeline();
		KeyValue textMovement = new KeyValue(movingText.layoutXProperty(), 900);
		KeyFrame textSpeed = new KeyFrame(Duration.seconds(4), textMovement);
		transition.getKeyFrames().add(textSpeed);
		transition.setCycleCount(Animation.INDEFINITE);
		transition.play();
		
		// Check the status of the transition, and start the corresponding action
		pane.setOnMouseClicked(e -> {
			if(transition.getStatus() == Transition.Status.PAUSED) {
				transition.play();
			}
			else {
				transition.pause();
			}
		});

		// Basic scene properties
		Scene scene = new Scene(pane, 400, 200);
		primaryStage.setTitle("Animated Text");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch();
	}
}
