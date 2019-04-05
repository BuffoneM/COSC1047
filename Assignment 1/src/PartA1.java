/*
 *	Michael Buffone 
 * 	1/10/2019
 * 	COSC1047W19
 * 	Assignment 1 Question A1
 * 	This program will shuffle elements in an array using a method
 */
import java.util.*;
public class PartA1 {

	public static void main(String[] args) {
		// Create an array of one digit numbers, add it into an arraylist, and call the shuffle method
		Integer[] array1 = {1,2,3,4,5};
		ArrayList<Integer> intList1 = new ArrayList<>(Arrays.asList(array1));
		System.out.println(intList1);
		//shuffle(intList1);
		System.out.println(Collections.max(intList1));
		System.out.println(intList1);
		
		System.out.println();
		
		// Create an array of two digit numbers, add it into an arraylist, and call the shuffle method
		Integer[] array2 = {10,20,30,40,50};
		ArrayList<Integer> intList2 = new ArrayList<>(Arrays.asList(array2));
		System.out.println(intList2);
		shuffle(intList2);
		System.out.println(intList2);
		
		System.out.println();
		
		// Create an array of three digit numbers, add it into an arraylist, and call the shuffle method
		Integer[] array3 = {100,200,300,400,500};
		ArrayList<Integer> intList3 = new ArrayList<>(Arrays.asList(array3));
		System.out.println(intList3);
		shuffle(intList3);
		System.out.println(intList3);
		
	}
	
	public static void shuffle(ArrayList<Integer> list) {
		// Within the for loop, get a random position in the list, take the value at list[i] and swap it with list[rn]
		for(int i = 0; i < list.size(); i++) {
			int rn = (0 + (int)(Math.random() * (list.size() - 0)));
			int temp = list.get(rn);									// Store list[rn] in temp
			list.set(rn, list.get(i));									// Set list[rn] = list[i]
			list.set(i, temp);											// Set list[i] = temp
		}
	} // end shuffle
	
}
