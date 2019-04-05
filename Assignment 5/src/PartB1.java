/*
 *	Michael Buffone 
 * 	3/02/2019
 * 	COSC1047W19
 * 	Assignment 5 Question B1 (15.3 pg 634)
 * 	This program will prompt the user to enter values and return a future value
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.*;

public class PartB1 extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		BorderPane pane = new BorderPane();
		
		/* 
		 * Create the buttons and put them in a HBox
		 */
		Button btLeft = new Button("Left");
		Button btRight = new Button("Right");
		Button btUp = new Button("Up");
		Button btDown = new Button("Down");
		
		HBox buttons = new HBox(30);
		buttons.setAlignment(Pos.CENTER);
		buttons.setPadding(new Insets(10,10,10,10));

		buttons.getChildren().addAll(btLeft, btRight, btUp, btDown);
		pane.setBottom(buttons);
		
		/*
		 * Create a ball
		 * 
		 * Create a pane for the ball so it can move within it
		 * 
		 * Add the movingBallPane to the pane
		 */
		Circle ball = new Circle(250, 250, 30);
		Pane movingBallPane = new Pane(ball);
		
		pane.setCenter(movingBallPane);
		
		// Border line above the buttons
		Line border = new Line(0, 450, 600, 450);
		border.getStrokeDashArray().addAll(20d, 10d);
		pane.getChildren().add(border);
		
		Scene scene = new Scene(pane, 500, 500);
		
		// Action events
		btLeft.setOnAction(e -> moveLeft(ball));
		btRight.setOnAction(e -> moveRight(ball));
		btUp.setOnAction(e -> moveUp(ball));
		btDown.setOnAction(e -> moveDown(ball));

		// Create the scene and other properties
		primaryStage.setScene(scene);
		primaryStage.setTitle("Colourful balls!");
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	/*
	 * When the user presses any of the keys, check to see if the ball is in the
	 * bounds of the pane depending on which direction they want to go in
	 * 
	 * If they're in bounds / not near the buttons, move the ball 
	 * and change the colour
	 */
	private static void moveLeft(Circle ball) {
		if (ball.getCenterX() > 30) {
			ball.setCenterX(ball.getCenterX() - 5);
			ball.setFill(Color.YELLOW);
		}	
	}

	private static void moveRight(Circle ball) {
		if (ball.getCenterX() < 480) {
			ball.setCenterX(ball.getCenterX() + 5);
			ball.setFill(Color.GREEN);
		}
	}

	private static void moveUp(Circle ball) {
		if (ball.getCenterY() > 30) {
			ball.setCenterY(ball.getCenterY() - 5);
			ball.setFill(Color.BLUE);
		}
	}

	private static void moveDown(Circle ball) {
		if (ball.getCenterY() < 415) {
			ball.setCenterY(ball.getCenterY() + 5);
			ball.setFill(Color.RED);
		}
	}

	public static void main(String[] args) {
		Application.launch();
	}
}


