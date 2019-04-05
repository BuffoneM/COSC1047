/*
 *	Michael Buffone 
 * 	1/14/2019
 * 	COSC1047W19
 * 	Assignment 1 Question A2
 * 	This program will allow the user to enter an integer 'm' and find the smallest integer'n' such that m * n is a perfect square
 */
import java.util.Scanner;
public class PartA2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int product = 0;
		int multiple = 0;
		
		// Collect the value from the user
		System.out.print("Enter an integer m: ");
		int input = in.nextInt();
		
		/*
		 * -To find the lowest perfect square, during each iteration in the loop calculate the square root of input * i. 
		 *  The answer will be a perfect square if there is no decimal place.
		 *  
		 * -This can be tested by creating a new integer value and setting it equal to the square root value casted to an integer.
		 * 
		 * -If the square rooted answer is equal to the casted answer, we have found a perfect square. (The double answer is an integer)
		 */
		for(int i = 1; i < input; i++) {
			double answer = Math.sqrt(input * i);
			int castedAnswer = (int)answer;
			
			if (answer == castedAnswer) {
				multiple = i;	
				product = input * i;					
				break;		// exit the loop- we have found the lowest perfect square
			}
		}
		
		System.out.println("The smallest number n for m * n to be a perfect square is " + multiple + "\nm * n is " + product);
		
	}
}
