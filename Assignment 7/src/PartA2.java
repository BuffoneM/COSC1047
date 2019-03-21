/*
 *	Michael Buffone 
 * 	3/20/2019
 * 	COSC1047W19
 * 	Assignment 7 A2 (Page 716 #5)
 * 
 *  This program will store an array of 5 int values, a date object,
 *  and the double value 5.5 in a file which can be read
 */

import java.io.*;

public class PartA2 {

	public static void main(String[] args) {
		
		File file = new File("Exercise17_05.dat");
		
		populateFile(file);
		

	}
	
	public static void populateFile(File file) {
		
		int[] array = {1,2,3,4,5};
		java.util.Date date = new java.util.Date();
		double decimalNum = 5.5;
		
		try(DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
			
			
			
			
		}
		catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

}
