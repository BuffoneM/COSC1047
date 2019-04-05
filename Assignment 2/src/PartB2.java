/*
 *	Michael Buffone 
 * 	1/25/2019
 * 	COSC1047W19
 * 	Assignment 2 Question B1 (12.13 pg 493)
 * 	This program will write the contents of a text file backwards one character at a time
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PartB2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a file name: ");
		String fileName = in.nextLine();
		
		File file = new File(fileName);
		
		if(!file.exists()) {
			System.out.println("The file \"" + fileName + "\" does not exist!");
			System.exit(0);
		}
		
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		
		try {
			// Modify the scanner to use the text file
			in = new Scanner(file);
			
			// Calculate the word and character count
			while(in.hasNext()) {
				String currentWord = in.next();
				wordCount++;
				charCount += currentWord.length();			
			}
			
			// Reassign the scanner to the file again to count the amount of lines in the file
			in = new Scanner(file);
			while(in.hasNext()) {
				in.nextLine();
				lineCount++;
			}
		}
		catch(FileNotFoundException fnfe) {
			System.out.println("File not found!");
		}
		
		System.out.println("File " + file.getName()  + " has:");
		System.out.println(charCount + " characters");
		System.out.println(wordCount + " words");
		System.out.println(lineCount + " lines");
	}

}
