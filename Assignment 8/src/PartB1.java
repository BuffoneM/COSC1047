/*
 *	Michael Buffone 
 * 	03/27/2019
 * 	COSC1047W19
 * 	Assignment 8 B1 (Page 743 #9)
 * 
 *  This program will display a reversed string produced by a recursive method
 */

import java.util.Scanner;

public class PartB1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String userString = in.nextLine();
		
		System.out.println("The reverse order of the string is: " + reverseDisplay(userString));
		
	}
	
	public static String reverseDisplay(String value) {
		
		if(value.equals("" + value.charAt(0))) return "" + value.charAt(0);
		else if(value.length() == 1) return "" + value.charAt(0);
		
		// Move the last character from string to the front, and append the remaining string	
		return "" + value.charAt(value.length()-1) + reverseDisplay(value.substring(0, value.length()-1));
	}

}
