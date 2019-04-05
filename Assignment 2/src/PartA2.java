/*
 *	Michael Buffone 
 * 	1/23/2019
 * 	COSC1047W19
 * 	Assignment 2 Question A2 (12.19 pg 494)
 * 	This program will count the number of words from the website
 */

import java.util.Scanner;

public class PartA2 {

	public static void main(String[] args) {
		
		
		int count = 0;
		try{
			java.net.URL url = new java.net.URL("https://liveexample.pearsoncmg.com/data/Lincoln.txt");
			Scanner in = new Scanner(url.openStream());
			while(in.hasNext()){
				count++;
				in.next();
			}
		}
		catch(java.net.MalformedURLException ex) {
				System.out.println("Invalid url");
			}
		catch(java.io.IOException ie) {
			System.out.println(ie.getMessage());
		
		}
		
		System.out.println("The word count is: " + count);

	}

}
