/*
 *	Michael Buffone 
 * 	2/17/2019
 * 	COSC1047W19
 * 	Assignment 4 Question B2 (14.23 pg 590)
 * 	This program will prompt the user to enter the data for two rectangles and display whether they're overlapping or contained
 */

import java.util.Arrays;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class PartB2 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the center coordinates, width, and height of rectangle 1 (coordX, coordY, width, height) :");
		double rect1CoordX = in.nextDouble();
		double rect1CoordY = in.nextDouble();
		double rect1Width = in.nextDouble();
		double rect1Height = in.nextDouble();
		double[] rect1Dim = {rect1CoordX, rect1CoordY, rect1Width, rect1Height};
		double tLeftX = rect1Dim[0] - (rect1Dim[2]/2);
		double tLeftY = rect1Dim[1] - (rect1Dim[3]/2);
		
		Rectangle rect1 = new Rectangle(tLeftX, tLeftY, rect1Dim[2], rect1Dim[3]);
		rect1.setFill(Color.WHITE);
		rect1.setStroke(Color.BLACK);
				
		System.out.println("Enter the center coordinates, width, and height of rectangle 2 (coordX, coordY, width, height) :");
		double rect2CoordX = in.nextDouble();
		double rect2CoordY = in.nextDouble();
		double rect2Width = in.nextDouble();
		double rect2Height = in.nextDouble();
		
		// Add an array to keep everything clean when passing variables later for the checking
		double[] rect2Dim = {rect2CoordX, rect2CoordY, rect2Width, rect2Height};
		tLeftX = rect2Dim[0] - (rect2Dim[2]/2);
		tLeftY = rect2Dim[1] - (rect2Dim[3]/2);
		
		Rectangle rect2 = new Rectangle(tLeftX, tLeftY, rect2Dim[2], rect2Dim[3]);
		rect2.setFill(Color.WHITE);
		rect2.setStroke(Color.BLACK);
		
		
		// Getting the appropriate possibility message		
		String msg = "";
		
		// If rectangle 1 is smaller than rectangle 2, the scheme for functions will be r1, r2
		// Add the rectangles appropriately to the pane so that the smaller rectangle gets added last
		
		if((rect1Dim[2] * rect1Dim[3]) < (rect2Dim[2] * rect2Dim[3])) {
			pane.getChildren().addAll(rect2, rect1);
			if(contains(rect1Dim, rect2Dim)) {
				msg = "One rectangle is contained in another";
			}
			else if(overlaps(rect1Dim, rect2Dim)) {
				msg = "The rectangle overlaps";
			}
			else {
				msg = "The rectangles do not overlap";
			}
		}
		else {
			pane.getChildren().addAll(rect1, rect2);
			if(contains(rect2Dim, rect1Dim)) {
				msg = "One rectangle is contained in another";
			}
			else if(overlaps(rect2Dim, rect1Dim)) {
				msg = "The rectangle overlaps";
			}
			else {
				msg = "The rectangles do not overlap";
			}
		}
		
		Text screenMsg = new Text(250, 490, msg);
		pane.getChildren().add(screenMsg);
		
		// Create the scene
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Rectangles!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		
		Application.launch();
	}
	
	public static boolean contains(double rect1Dim[], double rect2Dim[]) {		
		// If rectangle 1's center X is within rectangle 2's center X range
		if((rect1Dim[0] >= (rect2Dim[0] - (rect2Dim[0] / 2))) && (rect1Dim[0] <= (rect2Dim[0] + (rect2Dim[0] / 2)))) {		
			// If rectangle 1's center Y is is within rectangle 2's center Y range
			if((rect1Dim[1] >= (rect2Dim[1] - (rect2Dim[1] / 2))) && (rect1Dim[1] <= (rect2Dim[1] + (rect2Dim[1] / 2)))) {
				return true;
			}
		}
		return false;	
	}
	
	public static boolean overlaps(double rect1Dim[], double rect2Dim[]) {
		
		// Compute the points of the rectangle
		double bLeftX = rect1Dim[0] - (rect1Dim[2]/2);
		double bLeftY = rect1Dim[1] - (rect1Dim[3]/2);
		
		double tLeftX = rect1Dim[0] - (rect1Dim[2]/2);
		double tLeftY = rect1Dim[1] + (rect1Dim[3]/2);
		
		double bRightX = rect1Dim[0] + (rect1Dim[2]/2);
		double bRightY = rect1Dim[1] - (rect1Dim[3]/2);
		
		double tRightX = rect1Dim[0] + (rect1Dim[2]/2);
		double tRightY = rect1Dim[1] + (rect1Dim[3]/2);
		
		// Compare the points to see if they're in the dimensions
		if(bLeftX >= (rect2Dim[0] - (rect2Dim[0] / 2)) && (bLeftX <= (rect2Dim[0] + (rect2Dim[0] / 2)))) {
			if(bLeftY >= (rect2Dim[1] - (rect2Dim[1] / 2)) && (bLeftY <= (rect2Dim[1] + (rect2Dim[1] / 2)))) {
				return true;
			}
		}
		
		if(tLeftX >= (rect2Dim[0] - (rect2Dim[0] / 2)) && (tLeftX <= (rect2Dim[0] + (rect2Dim[0] / 2)))) {
			if(tLeftY >= (rect2Dim[1] - (rect2Dim[1] / 2)) && (tLeftY <= (rect2Dim[1] + (rect2Dim[1] / 2)))) {
				return true;
			}
		}
		
		if(bRightX >= (rect2Dim[0] - (rect2Dim[0] / 2)) && (bRightX <= (rect2Dim[0] + (rect2Dim[0] / 2)))) {
			if(bRightY >= (rect2Dim[1] - (rect2Dim[1] / 2)) && (bRightY <= (rect2Dim[1] + (rect2Dim[1] / 2)))) {
				return true;
			}
		}
		
		if(tRightX >= (rect2Dim[0] - (rect2Dim[0] / 2)) && (tRightX <= (rect2Dim[0] + (rect2Dim[0] / 2)))) {
			if(tRightY >= (rect2Dim[1] - (rect2Dim[1] / 2)) && (tRightY <= (rect2Dim[1] + (rect2Dim[1] / 2)))) {
				return true;
			}
		}
		
		return false;
	}
	
}
