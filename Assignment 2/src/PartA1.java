/*
 *	Michael Buffone 
 * 	1/23/2019
 * 	COSC1047W19
 * 	Assignment 2 Question A1 (12.15 pg 494)
 * 	This program will create a file if it doesn't exist, and create 100 integers into the file using text I/0
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.util.Scanner;
import java.util.Arrays;

public class PartA1 {
	
	public static void main(String[] args) {
		
		// Create the file object
		String name = "Exercise12_15.txt";
		File file = new File(name);
		
		if(!file.exists()) {
			populateFile(file);		
		}
		
		int[] arrayNums = readFile(file);
		
		sortArray(arrayNums);
		
		// -Print 5 elements and then after the 5th go to the next line
		// -Use counter to indicate when we need to go to the next line
		int counter = 0;
		for(int i = 0; i < arrayNums.length; i++) {
			System.out.printf("     %12d", arrayNums[i]);
			counter++;
			if(counter == 5) {
				System.out.println();
				counter = 0;
			}
		}

	}
	
	// Function used to create the file and populate the it with random numbers
	public static void populateFile(File file) {
		PrintWriter pw = null;
		
		try {
			pw =  new PrintWriter(file);
			
			// Generate a random number between 0 and 10 and print it in the file
			for(int i = 0; i < 100; i++) {
				pw.print((0 + (int)(Math.random() * (Integer.MAX_VALUE - 1 + 1))) + " ");			
			}
				
			pw.close();
		}
		catch(FileNotFoundException fnfe){
			System.out.println("FILE NOT FOUND!");
		}
				
		finally {
			if(pw != null) pw = null;
		}
	}
	
	// Function used to read the data back from the file
	public static int[] readFile(File file) {
		int[] numArray = new int[100];
		
		try {
			Scanner input = new Scanner(file);
			
			int i = 0;
			while(input.hasNext()) {
				numArray[i] = input.nextInt();
				i++;
			}
			
		}
		catch(FileNotFoundException fnfe) {
			System.out.println("ERROR READING THE FILE!");
		}
		
		return numArray;
	}

	// Sort the array using a bubble sort
	public static void sortArray(int[] array) {
		
		for(int i = 0; i < array.length-1; i++) {
			for(int j = 0; j < array.length-1; j++) {
				
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
}
