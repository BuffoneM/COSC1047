/*
 *	Michael Buffone 
 * 	1/14/2019
 * 	COSC1047W19
 * 	Assignment 1 Question B2
 * 	This is the test program that allows the user to enter three sides of the triangle, a color, and a boolean value to indicate if the triangle is filled
 */
import java.util.Scanner;
public class PartB2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// Collect user input
		System.out.print("Enter three sides of the triangle: ");
		double side1 = in.nextDouble();
		double side2 = in.nextDouble();
		double side3 = in.nextDouble();
		// double side1 = 5;
		// double side2 = 7;
		// double side3 = 10;
		
		System.out.print("Enter a color for the triangle: ");
		String color = in.next();
		// String color = "blue";
		
		System.out.print("Is the triangle going to be filled? " );
		boolean isFilled = in.nextBoolean();
		// boolean isFilled = true;
		
		// Create the triangle here with all of the data inputed
		Triangle t1 = new Triangle(side1, side2, side3);
		t1.setColor(color);
		t1.setFilled(isFilled);
		
		// Print the information
		System.out.println("\n" + t1.toString());
		System.out.println("-The area is: " + t1.getArea() + ", the perimeter is: " + t1.getPerimeter()); 
		
	}
}
