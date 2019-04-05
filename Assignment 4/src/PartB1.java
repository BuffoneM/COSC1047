/*
 *	Michael Buffone 
 * 	2/16/2019
 * 	COSC1047W19
 * 	Assignment 4 Question A3 (14.13 pg 588)
 * 	This program will create a pie chart, and have each section of the pie stored in an array at the start of the program
 */
import java.util.Arrays;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.*;


public class PartB1 extends Application{

	@Override
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		pane.setStyle("-fx-background-color: lightgray");
		
		double[] pieArray = new double[10];
		pieArray[0] = 10.0;
		pieArray[1] = 10.0;
		pieArray[2] = 10.0;
		pieArray[3] = 10.0;
		/*pieArray[4] = 50.0;
		pieArray[5] = 60.0;
		pieArray[6] = 70.0;
		pieArray[7] = 80.0;
		pieArray[8] = 90.0;
		pieArray[9] = 100.0;*/

		
		double sum = 0;
		for(int i = 0; i < pieArray.length; i++) {
			sum += pieArray[i];
		}
		double[] pieArrayPercents = new double[pieArray.length];
		for(int i = 0; i < pieArrayPercents.length; i++) {
			pieArrayPercents[i] = (pieArray[i] / sum);
		}
		//System.out.println(Arrays.toString(pieArrayPercents));
		
		
		// ================= OUTER CIRCLE ================= //
		Circle circle = new Circle(250, 250, 100);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		circle.setStrokeWidth(2);
		pane.getChildren().add(circle);
		
		// ================= PIE CHART ================= //
		int total = 0;

		Arc percent1 = new Arc(250, 250, 100, 100, total, pieArrayPercents[0] * 360);
		percent1.setType(ArcType.ROUND);
		percent1.setFill(Color.BLUE);
		total += percent1.getLength();

		Arc percent2 = new Arc(250, 250, 100, 100, total, pieArrayPercents[1] * 360);
		percent2.setType(ArcType.ROUND);
		percent2.setFill(Color.RED);
		total += percent2.getLength();

		Arc percent3 = new Arc(250, 250, 100, 100, total, pieArrayPercents[2] * 360);
		percent3.setType(ArcType.ROUND);
		percent3.setFill(Color.YELLOW);
		total += percent3.getLength();

		Arc percent4 = new Arc(250, 250, 100, 100, total, pieArrayPercents[3] * 360);
		percent4.setType(ArcType.ROUND);
		percent4.setFill(Color.ORANGE);
		total += percent4.getLength();
		
		Arc percent5 = new Arc(250, 250, 100, 100, total, pieArrayPercents[4] * 360);
		percent5.setType(ArcType.ROUND);
		percent5.setFill(Color.GREEN);
		total += percent5.getLength();
		
		Arc percent6 = new Arc(250, 250, 100, 100, total, pieArrayPercents[5] * 360);
		percent6.setType(ArcType.ROUND);
		percent6.setFill(Color.PURPLE);
		total += percent6.getLength();
		
		Arc percent7 = new Arc(250, 250, 100, 100, total, pieArrayPercents[6] * 360);
		percent7.setType(ArcType.ROUND);
		percent7.setFill(Color.PINK);
		total += percent7.getLength();
		
		Arc percent8 = new Arc(250, 250, 100, 100, total, pieArrayPercents[7] * 360);
		percent8.setType(ArcType.ROUND);
		percent8.setFill(Color.GRAY);
		total += percent8.getLength();
		
		Arc percent9 = new Arc(250, 250, 100, 100, total, pieArrayPercents[8] * 360);
		percent9.setType(ArcType.ROUND);
		percent9.setFill(Color.BEIGE);
		total += percent9.getLength();
		
		Arc percent10= new Arc(250, 250, 100, 100, total, pieArrayPercents[9] * 360);
		percent10.setType(ArcType.ROUND);
		percent10.setFill(Color.LIME);
		
		pane.getChildren().addAll(percent1, percent2, percent3, percent4, percent5, percent6, percent7, percent8, percent9, percent10);
		
		// Create the scene
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Pie Chart");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch();
	}

}
