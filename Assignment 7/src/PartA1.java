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
		
		if(!file.exists()) {
			populateFile(file);
		}
		readFile(file);
		
		
		
	}
	
	public static void populateFile(File file) {
		//int randomQuantity = (int)(200 + (int)(Math.random() * (300 - 200 + 1)));
		int randomQuantity = 1;

		try(DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
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
			while(dos.available() > 0) {
				System.out.printf("%1d ", dos.readInt());
				if(++count == 15) {
					count = 0;
					System.out.println();
				}
				
			}
			
		}
		catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

}
