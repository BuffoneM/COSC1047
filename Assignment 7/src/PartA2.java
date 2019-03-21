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
import java.util.Arrays;

public class PartA2 {

	public static void main(String[] args) {
		
		File file = new File("Exercise17_05.dat");
		
		if(!file.exists()) {
			populateFile(file);
		}
		readFile(file);
		

	}
	
	public static void populateFile(File file) {
		
		int[] array = {1,2,3,4,5};
		java.util.Date date = new java.util.Date();
		double decimalNum = 5.5;
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
			
			oos.writeObject(array);
			oos.writeObject(date);
			oos.writeObject(decimalNum);
			
		}
		catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	
	public static void readFile(File file) {
		try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
			
			int[] fileArray = (int[])ois.readObject();
			java.util.Date fileDate = (java.util.Date)ois.readObject();
			double fileDouble = (double)ois.readObject();
			
			System.out.println(Arrays.toString(fileArray));
			System.out.println(fileDate);
			System.out.println(fileDouble);

		}
		catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
