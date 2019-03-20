/*
 *	Michael Buffone 
 * 	3/14/2019
 * 	COSC1047W19
 * 	Assignment 7 Custom Problem 1
 * 
 *  This program will generate a random quantity of numbers within the range
 *  of -12250 to 13580 and put store them in a binary file. The program will
 *  perform multiple tasks on the numbers generated.
 */

import java.io.*;

public class PartA1 {
	
	public static void main(String[] args) {
		
		File file = new File("MyData.dat");
		
		populateFile(file);
		readFile(file);
		
	}
	
	public static void populateFile(File file) {
		int randomQuantity = (int)(200 + (int)(Math.random() * (300 - 200 + 1)));
		//int randomQuantity = 1;

		try(DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file, true)))) {
			for(int i = 0; i < randomQuantity; i++) {
				
				int randomNum = (-12250 + (int)(Math.random() * (13580 - (-12250) + 1)));
				dos.writeInt(randomNum);
				
			}
			
		}
		catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	
	public static void readFile(File file) {

		try(DataInputStream dos = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
			
			int count = 0;
			int sum = 0;
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			
			while(dos.available() > 0) {
				int currentNum = dos.readInt();
				
				// Calculations
				count++;
				sum += currentNum;
				if(currentNum < min) {
					min = currentNum;
				}
				if(currentNum > max) {
					max = currentNum;
				}
			}
			
			System.out.println("The amount of integers is: " + count);
			System.out.println("The sum of integers is: " + sum);
			System.out.println("The average of integers is: " + (double)sum / (double)count);
			System.out.println("The largest integer is: " + max);
			System.out.println("The smallest integer is: " + min);
			
		}
		catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

}
