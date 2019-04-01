/*
 *	Michael Buffone 
 * 	03/27/2019
 * 	COSC1047W19
 * 	Assignment 8 A2 (Page 743 #7)
 * 
 *  This program will display the amount of times the fibonacci method is called
 */

import java.util.Scanner;

public class PartA2 {

	public static int counter = 0;
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int userNum = in.nextInt();
		
		System.out.println("The \"fibonacci\" method call answer is: " + fibonacci(userNum));
		System.out.println("The \"fibonacci\" method call amount is: " + counter);

	}
	
	public static int fibonacci(int userNum) {
		counter++;
		if(userNum == 0) return 0;
		else if(userNum == 1) return 1;
		
		return fibonacci(userNum - 1) + fibonacci(userNum - 2);
	}

}
