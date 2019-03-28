/*
 *	Michael Buffone 
 * 	03/26/2019
 * 	COSC1047W19
 * 	Assignment 8 Custom Problem 1
 * 
 *  This program will recursively calculate a series and prove it using
 *  a custom program with a for loop
 */

import java.util.Scanner;

public class PartA1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int userNum = in.nextInt();
		
		System.out.println("Series calculation using recursion: " + recursiveSeries(userNum));
		System.out.println("Series calculation using a for loop: " + loopSeries(userNum));
		
	}
	
	public static double recursiveSeries(double i) {
		// Base case
		if(i <= 1) return 1;
		
		// Return the current added to the subordinate
		return ((2 * i) / (3 * i - 1)) + recursiveSeries(i - 1);

	}
	
	public static double loopSeries(int userNum) {
		double answer = 0;
		for(int i = userNum; i >= 1; i--) {
			answer += ((double)(2 * i) / (double)(3 * i - 1));
		}
		return answer;
	}
	
}
