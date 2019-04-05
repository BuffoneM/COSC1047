/*
 *	Michael Buffone 
 * 	2/1/2019
 * 	COSC1047W19
 * 	Assignment 3 Question B2 (13.17 pg 538)
 * 	This program will utilize the complex class created to perform mathematical operations on complex numbers inputed by the user
 */

import java.util.Scanner;

public class PartB2 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the first complex number: ");
		double num1 = in.nextDouble();
		double num2 = in.nextDouble();
		Complex comp1 = new Complex(num1, num2);
		
		System.out.print("Enter the second complex number: ");
		num1 = in.nextDouble();
		num2 = in.nextDouble();
		Complex comp2 = new Complex(num1, num2);
		
		
		// Perform operations on the complex numbers:
		comp1.add(comp2.getRealPart(), comp2.getImaginaryPart());
		
		comp1.subtract(comp2.getRealPart(), comp2.getImaginaryPart());
		
		comp1.multiply(comp2.getRealPart(), comp2.getImaginaryPart());

		comp1.divide(comp2.getRealPart(), comp2.getImaginaryPart());
		
		comp1.abs();
		
		System.out.println(comp1.compareTo(comp2));
	}
}
