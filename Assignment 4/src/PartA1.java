/*
 *	Michael Buffone 
 * 	2/15/2019
 * 	COSC1047W19
 * 	Assignment 4 Question A1 (14.7 pg 587)
 * 	This program will create an app that draws four fans
 */

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.*;

public class PartA1 extends Application{

	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		// ===================== TOP LEFT FAN ===================== //
		Circle tlCircle = new Circle (120, 120, 90);
		tlCircle.setStroke(Color.BLACK);
		tlCircle.setFill(Color.WHITE);
		
		Arc tlFanBlade1 = new Arc(120, 120, 75, 75, 25, 45);
		tlFanBlade1.setType(ArcType.ROUND);
		tlFanBlade1.setFill(Color.RED);
		
		Arc tlFanBlade2 = new Arc(120, 120, 75, 75, 115, 45);
		tlFanBlade2.setType(ArcType.ROUND);
		tlFanBlade2.setFill(Color.RED);
		
		Arc tlFanBlade3 = new Arc(120, 120, 75, 75, 205, 45);
		tlFanBlade3.setType(ArcType.ROUND);
		tlFanBlade3.setFill(Color.RED);
		
		Arc tlFanBlade4 = new Arc(120, 120, 75, 75, 295, 45);
		tlFanBlade4.setType(ArcType.ROUND);
		tlFanBlade4.setFill(Color.RED);
		
		pane.getChildren().addAll(tlCircle, tlFanBlade1, tlFanBlade2, tlFanBlade3, tlFanBlade4);
		
		// ===================== TOP RIGHT FAN ===================== //
		Circle trCircle = new Circle (380, 120, 90);
		trCircle.setStroke(Color.BLACK);
		trCircle.setFill(Color.WHITE);
		
		Arc trFanBlade1 = new Arc(380, 120, 75, 75, 25, 45);
		trFanBlade1.setType(ArcType.ROUND);
		trFanBlade1.setFill(Color.BLUE);
		
		Arc trFanBlade2 = new Arc(380, 120, 75, 75, 115, 45);
		trFanBlade2.setType(ArcType.ROUND);
		trFanBlade2.setFill(Color.BLUE);
		
		Arc trFanBlade3 = new Arc(380, 120, 75, 75, 205, 45);
		trFanBlade3.setType(ArcType.ROUND);
		trFanBlade3.setFill(Color.BLUE);
		
		Arc trFanBlade4 = new Arc(380, 120, 75, 75, 295, 45);
		trFanBlade4.setType(ArcType.ROUND);
		trFanBlade4.setFill(Color.BLUE);
		pane.getChildren().addAll(trCircle, trFanBlade1, trFanBlade2, trFanBlade3, trFanBlade4);
		
		// ===================== BOTTOM LEFT FAN ===================== //
		Circle blCircle = new Circle (120, 380, 90);
		blCircle.setStroke(Color.BLACK);
		blCircle.setFill(Color.WHITE);
		
		Arc blFanBlade1 = new Arc(120, 380, 75, 75, 25, 45);
		blFanBlade1.setType(ArcType.ROUND);
		blFanBlade1.setFill(Color.YELLOW);
		
		Arc blFanBlade2 = new Arc(120, 380, 75, 75, 115, 45);
		blFanBlade2.setType(ArcType.ROUND);
		blFanBlade2.setFill(Color.YELLOW);
		
		Arc blFanBlade3 = new Arc(120, 380, 75, 75, 205, 45);
		blFanBlade3.setType(ArcType.ROUND);
		blFanBlade3.setFill(Color.YELLOW);
		
		Arc blFanBlade4 = new Arc(120, 380, 75, 75, 295, 45);
		blFanBlade4.setType(ArcType.ROUND);
		blFanBlade4.setFill(Color.YELLOW);
		
		pane.getChildren().addAll(blCircle, blFanBlade1, blFanBlade2, blFanBlade3, blFanBlade4);
		
		// ===================== BOTTOM RIGHT FAN ===================== //
		Circle brCircle = new Circle (380, 380, 90);
		brCircle.setStroke(Color.BLACK);
		brCircle.setFill(Color.WHITE);
		
		Arc brFanBlade1 = new Arc(380, 380, 75, 75, 25, 45);
		brFanBlade1.setType(ArcType.ROUND);
		brFanBlade1.setFill(Color.LIMEGREEN);
		
		Arc brFanBlade2 = new Arc(380, 380, 75, 75, 115, 45);
		brFanBlade2.setType(ArcType.ROUND);
		brFanBlade2.setFill(Color.LIMEGREEN);
		
		Arc brFanBlade3 = new Arc(380, 380, 75, 75, 205, 45);
		brFanBlade3.setType(ArcType.ROUND);
		brFanBlade3.setFill(Color.LIMEGREEN);
		
		Arc brFanBlade4 = new Arc(380, 380, 75, 75, 295, 45);
		brFanBlade4.setType(ArcType.ROUND);
		brFanBlade4.setFill(Color.LIMEGREEN);
		
		pane.getChildren().addAll(brCircle, brFanBlade1, brFanBlade2, brFanBlade3, brFanBlade4);
		
		// Create the scene
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Four fans!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch();
	}

}
