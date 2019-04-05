/*
 *	Michael Buffone 
 * 	1/30/2019
 * 	COSC1047W19
 * 	Assignment 3 Question A2 (13.11 pg 536)
 * 	This program creates an Octagon object: extends GeoObject, implements comparable and cloneable interfaces
 */

public class PartA2 {
	
	public static void main (String[] args) throws CloneNotSupportedException{
		
		// Create an octagon with a side value of 5
		Octagon firstOct = new Octagon(5);
		
		// Clone the octagon
		Octagon clonedOct = (Octagon)firstOct.clone(); 
	
		// Print the octagon information, see if the two octagons are equal, and then compare the two
		System.out.println("Octagon 1: " + firstOct);
		System.out.println("Cloned octagon: " + clonedOct);
		System.out.println("Is octagon 1 == to cloned octagon? " + firstOct.equals(clonedOct));
		compareStatements(firstOct.compareTo(clonedOct));
		
		clonedOct.setSide(7);
		System.out.println("Change the octagon side to '7' and compare it again:");
		System.out.println(clonedOct);
		System.out.println("Is octagon 1 == to cloned octagon? " + firstOct.equals(clonedOct));
		compareStatements(firstOct.compareTo(clonedOct));
		
		System.out.println("----------------------------------------------------------------------------------");
		
		// Create two more octagons and compare them using various functions to the previous octagons
		Octagon secondOctagon = new Octagon(10);
		Octagon thirdOctagon = new Octagon();
		
		System.out.println("Octagon 3: " + secondOctagon);
		System.out.println("Octagon 4: " + thirdOctagon);
		
	}
	
	public static void compareStatements(int compareInt) {
		switch(compareInt) {
		case 1: 
			System.out.println("-Octagon 1 is bigger than octagon 2");
			break;
		case 0:
			System.out.println("-Octagon 1 has the same size as octagon 2");
			break;
		case -1:
			System.out.println("-Octagon 1 is smaller than octagon 2");
			break;
		}
		System.out.println();
	}
}
