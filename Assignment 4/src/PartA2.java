/*
 *	Michael Buffone 
 * 	2/15/2019
 * 	COSC1047W19
 * 	Assignment 4 Question A2 (14.17 pg 589)
 * 	This program will create a concept of hangman in javafx
 */

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class PartA2 extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		// ===================== BACKGROUND ===================== //
		pane.setStyle("-fx-background-color: lightblue");
		Rectangle ground = new Rectangle(-1, 300, 501, 200);
		ground.setFill(Color.LIGHTGREEN);
		ground.setStroke(Color.DARKGREEN);

		Rectangle lake = new Rectangle(-1, 200, 501,300);
		lake.setFill(Color.CORNFLOWERBLUE);
		
		Circle sun = new Circle(-1, -1, 30);
		sun.setFill(Color.YELLOW);
		sun.setStroke(Color.LIGHTGOLDENRODYELLOW);
		sun.setStrokeWidth(3);
		
		Polygon rearMountain = new Polygon();
		rearMountain.getPoints().addAll(new Double[] {
									-50.0, 200.0,
									110.0, 140.0,
									215.0, 150.0,
									290.0, 90.0,
									320.0, 100.0,
									390.0, 135.0,
									460.0, 140.0,
									501.0, 90.0,
									502.0, 200.0
									
												});
		rearMountain.setFill(Color.DARKSLATEGRAY);
		
		Arc mountain1 = new Arc(125, 300, 150, 75, 0, 180);
		mountain1.setFill(Color.DARKGRAY);
		mountain1.setStroke(Color.BLACK);
		Arc mountain2 = new Arc(380, 300, 160, 90, 0, 180);
		mountain2.setFill(Color.DARKGRAY);
		mountain2.setStroke(Color.BLACK);
		
		pane.getChildren().addAll(sun, lake, ground, rearMountain, mountain1, mountain2);
		
		
		
		
		// ===================== STAND WITH ROPE ===================== //
		Ellipse base = new Ellipse(90, 390, 40, 15);
		base.setFill(Color.GRAY);
		base.setStroke(Color.BLACK);
		
		// Vertical post creation:
		Rectangle vertRect = new Rectangle(75, 70, 25, 325);
		vertRect.setFill(Color.SADDLEBROWN);
		vertRect.setStroke(Color.BROWN);
		
		Polygon standSide1 = new Polygon();
		standSide1.getPoints().addAll(new Double[] {
								100.0, 595.0,
								110.0, 390.0,
								110.0, 65.0,
								100.0, 70.0
												});
		standSide1.setFill(Color.SADDLEBROWN);
		standSide1.setStroke(Color.BROWN);
		
		Polygon standSide2 = new Polygon();
		standSide2.getPoints().addAll(new Double[] {
								75.0, 70.0,
								85.0, 65.0,
								110.0, 65.0,
								100.0, 70.0
												});
		standSide2.setFill(Color.SADDLEBROWN);
		standSide2.setStroke(Color.BROWN);
		pane.getChildren().addAll(base, vertRect, standSide1, standSide2);
		
		// Rope behind the horizontal post and rope pile
		Polygon rope1 = new Polygon();
		rope1.getPoints().addAll(new Double[] {
							279.0, 342.0,
							274.0, 342.0,
							245.0, 75.0,
							250.0, 75.0
							
												});
		rope1.setFill(Color.BEIGE);
		
		Ellipse ropePile1 = new Ellipse(280, 350, 20, 6);
		ropePile1.setFill(Color.LIGHTGREEN);
		ropePile1.setStroke(Color.BEIGE);
		ropePile1.setStrokeWidth(3);
		Ellipse ropePile2 = new Ellipse(285, 345, 18, 6);
		ropePile2.setFill(Color.LIGHTGREEN);
		ropePile2.setStroke(Color.BEIGE);
		ropePile2.setStrokeWidth(3);
		Ellipse ropePile3 = new Ellipse(290, 340, 16, 6);
		ropePile3.setFill(Color.LIGHTGREEN);
		ropePile3.setStroke(Color.BEIGE);
		ropePile3.setStrokeWidth(3);
		Ellipse ropePile4 = new Ellipse(263, 342, 16, 6);
		ropePile4.setFill(Color.LIGHTGREEN);
		ropePile4.setStroke(Color.BEIGE);
		ropePile4.setStrokeWidth(3);
		Ellipse ropePile5 = new Ellipse(265, 353, 16, 6);
		ropePile5.setFill(Color.LIGHTGREEN);
		ropePile5.setStroke(Color.BEIGE);
		ropePile5.setStrokeWidth(3);
		Ellipse ropePile6 = new Ellipse(278, 348, 16, 6);
		ropePile6.setFill(Color.LIGHTGREEN);
		ropePile6.setStroke(Color.BEIGE);
		ropePile6.setStrokeWidth(3);
		Ellipse ropePile7 = new Ellipse(272, 335, 16, 6);
		ropePile7.setFill(Color.LIGHTGREEN);
		ropePile7.setStroke(Color.BEIGE);
		ropePile7.setStrokeWidth(3);
		
		pane.getChildren().addAll(ropePile7, ropePile4, ropePile1, ropePile2, ropePile3, ropePile5, ropePile6, rope1);
		
		
		// Horizontal post creation:
		Rectangle horzRect = new Rectangle(75, 80, 175, 20);
		horzRect.setFill(Color.BURLYWOOD);
		horzRect.setStroke(Color.GRAY);
		
		Polygon standSide3 = new Polygon();
		standSide3.getPoints().addAll(new Double[] {
								250.0, 100.0,
								255.0, 95.0,
								255.0, 75.0,
								250.0, 80.0
												});
		standSide3.setFill(Color.BURLYWOOD);
		standSide3.setStroke(Color.GRAY);
		
		Polygon standSide4 = new Polygon();
		standSide4.getPoints().addAll(new Double[] {
								255.0, 75.0,
								110.0, 75.0,
								100.0, 80.0,
								250.0, 80.0
												});
		standSide4.setFill(Color.BURLYWOOD);
		standSide4.setStroke(Color.GRAY);
		pane.getChildren().addAll(horzRect, standSide3, standSide4);
		
		// Wrap the rope above the horizontal post and let it hang with the noose
		Polygon rope2 = new Polygon();
		rope2.getPoints().addAll(new Double[] {
							250.0, 75.0,
							245.0, 75.0,
							240.0, 80.0,
							240.0, 100.0,
							245.0, 100.0,
							245.0, 80.0
												});
		rope2.setFill(Color.BEIGE);
		rope2.setStroke(Color.LIGHTGRAY);
		Polygon rope3 = new Polygon();
		rope3.getPoints().addAll(new Double[] {
							240.0, 75.0,
							235.0, 75.0,
							230.0, 80.0,
							230.0, 100.0,
							235.0, 100.0,
							235.0, 80.0
												});
		rope3.setFill(Color.BEIGE);
		rope3.setStroke(Color.LIGHTGRAY);
		Polygon rope4 = new Polygon();
		rope4.getPoints().addAll(new Double[] {
							230.0, 75.0,
							225.0, 75.0,
							220.0, 80.0,
							220.0, 150.0,
							225.0, 150.0,
							225.0, 80.0
												});
		rope4.setFill(Color.BEIGE);
		rope4.setStroke(Color.LIGHTGRAY);
		
		Line nooseLine1 = new Line(220.5, 114, 224.5, 116);
		nooseLine1.setStroke(Color.LIGHTGRAY);
		nooseLine1.setStrokeWidth(2);
		Line nooseLine2 = new Line(220.5, 120, 224.5, 122);
		nooseLine2.setStroke(Color.LIGHTGRAY);
		nooseLine2.setStrokeWidth(2);
		Line nooseLine3 = new Line(220.5, 126, 224.5, 128);
		nooseLine3.setStroke(Color.LIGHTGRAY);
		nooseLine3.setStrokeWidth(2);
		Line nooseLine4 = new Line(220.5, 132, 224.5, 134);
		nooseLine4.setStroke(Color.LIGHTGRAY);
		nooseLine4.setStrokeWidth(2);
		Line nooseLine5 = new Line(220.5, 138, 224.5, 140);
		nooseLine5.setStroke(Color.LIGHTGRAY);
		nooseLine5.setStrokeWidth(2);
		
		Ellipse noose = new Ellipse(222.5, 150, 6, 15);
		noose.setFill(Color.LIGHTBLUE);
		noose.setStroke(Color.BEIGE);
		noose.setStrokeWidth(3);
		
		
		
		pane.getChildren().addAll(rope2, rope3, rope4, nooseLine1,  nooseLine2, nooseLine3, nooseLine4, nooseLine5, noose);
		
		
		// Bolts for two posts:
		Circle bolt1 = new Circle(85, 85, 3);
		bolt1.setFill(Color.DARKGRAY);
		bolt1.setStroke(Color.DARKSLATEGRAY);
		Circle bolt2 = new Circle(85, 95, 3);
		bolt2.setFill(Color.DARKGRAY);
		bolt2.setStroke(Color.DARKSLATEGRAY);
		
		pane.getChildren().addAll(bolt1, bolt2);
	
		
		
		// ===================== MAN / FIGURE ===================== //
		Circle head = new Circle(222.5, 155, 16);
		head.setFill(Color.LIGHTGOLDENRODYELLOW);
		head.setStroke(Color.AQUAMARINE);
		
		Ellipse torso = new Ellipse(222.5, 195, 13, 40);
		torso.setFill(Color.RED);
		torso.setStroke(Color.FIREBRICK);
		
		Polygon leftArm = new Polygon();
		leftArm.getPoints().addAll(new Double[] {
							212.0, 170.0,
							207.0, 170.0,
							197.0, 210.0,
							202.0, 215.0,
							212.0, 175.0
													});
		leftArm.setFill(Color.RED);
		leftArm.setStroke(Color.FIREBRICK);
		
		Polygon rightArm = new Polygon();
		rightArm.getPoints().addAll(new Double[] {
							233.0, 170.0,
							238.0, 170.0,
							248.0, 210.0,
							243.0, 215.0,
							233.0, 175.0
													});
		rightArm.setFill(Color.RED);
		rightArm.setStroke(Color.FIREBRICK);
		
		Polygon leftLeg = new Polygon();
		leftLeg.getPoints().addAll(new Double[] {
							213.0, 225.0,
							213.0, 270.0,
							203.0, 270.0,
							203.0, 280.0,
							220.0, 280.0,
							220.0, 225.0
													});
		leftLeg.setFill(Color.DARKBLUE);
		
		Polygon rightLeg = new Polygon();
		rightLeg.getPoints().addAll(new Double[] {
							232.0, 225.0,
							232.0, 270.0,
							242.0, 270.0,
							242.0, 280.0,
							225.0, 280.0,
							225.0, 225.0
													});
		rightLeg.setFill(Color.DARKBLUE);
		
		Line leftEye1 = new Line(215, 150, 218, 153);
		Line leftEye2 = new Line(218, 150, 215, 153);
		Line rightEye1 = new Line(228, 150, 231, 153);
		Line rightEye2 = new Line(231, 150, 228, 153);
		
		Arc mouth = new Arc(230, 162, 15, 5, 90, 180);
		mouth.setType(ArcType.CHORD);

		
		pane.getChildren().addAll(leftLeg, rightLeg, torso, head, leftArm, rightArm, leftEye1, leftEye2, rightEye1, rightEye2, mouth);
		
		Text name = new Text(3, 497, "\"Dead Island\"- Michael Buffone: 2019/02/15");
		pane.getChildren().add(name);
		
		// Create the scene
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Hangman Drawing Concept");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch();
	}

}
