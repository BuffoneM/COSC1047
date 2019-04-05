/*
 *	Michael Buffone 
 * 	1/25/2019
 * 	COSC1047W19
 * 	Assignment 2 Question B1 (Custom question)
 * 	This program will write the contents of a text file backwards one character at a time
 */

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class PartB1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the name of the text file: ");
		String fileName = in.nextLine();	
		File file = new File(fileName);
		
		// Exit the program if the file doesn't exist
		if(!file.exists()) {
			System.out.println("The file \"" + fileName + "\" does not exist!");
			System.exit(0);
		}
		
		// Read the file into a StringBuilder
		StringBuilder sb = new StringBuilder(file.getName());
		try {
			in = new Scanner(file);
			
			while(in.hasNext()) {
				sb.append(in.next());
				sb.append(" ");
			}
		
		}
		catch(FileNotFoundException fnfe) {
			System.out.println("File not found!");
		}
		
		// Create a new file with "Ver2-" in front of it and enter in all of the text backwards
		File newFile = new File("Ver2-" + file.getName());
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(newFile);
			
			for(int i = sb.length()-1; i >= 0; i--) {
				pw.print(sb.charAt(i));
			}
			
			pw.close();
		}
		catch(FileNotFoundException fnfe) {
			System.out.println("File not found!");
		}
		finally {
			if(pw != null) pw = null;
		}
		
		System.out.println("Complete!");
	}

}
