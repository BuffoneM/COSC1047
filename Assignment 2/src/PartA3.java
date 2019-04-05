/*
 *	Michael Buffone 
 * 	1/25/2019
 * 	COSC1047W19
 * 	Assignment 2 Question A3 (12.23 pg 494)
 * 	This program will read scores from the file and display their total and average
 */

import java.util.Scanner;

public class PartA3 {

	public static void main(String[] args) {
		
		int sum = 0;
		int counter = 0;
		
		try {
			
			java.net.URL url = new java.net.URL("http://liveexample.pearsoncmg.com/data/Scores.txt");
			Scanner in = new Scanner(url.openStream());
			
			while(in.hasNext()) {
				sum += in.nextInt();
				counter++;
			}
			
		}
		catch(java.net.MalformedURLException ex) {
			System.out.println("Invalid url");
		}
		catch(java.io.IOException ie) {
			System.out.println(ie.getMessage());
		}
		
		System.out.println("The total is: " + sum);
		System.out.println("The average is: " + sum / counter);
		
	}

}
