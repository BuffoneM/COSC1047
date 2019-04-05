/*
 *	Michael Buffone 
 * 	1/10/2019
 * 	COSC1047W19
 * 	Assignment 1 Question B1
 * 	This program will create a rectangle object and perform different operations on it
 */
public class PartB1 {
	public static void main(String[] args) {
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
		System.out.println(r1.toString());

		System.out.println("\nThe area of r1 is: " + r1.getArea());
		System.out.println("The perimeter of r1 is: " + r1.getPerimeter());
		System.out.println("Does r1 contain the point specified (3, 3)? : " + r1.contains(3, 3));
		System.out.println("Does r1 contain the rectangle specified (4, 5, 10.5, 3.2)? : " + r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
		System.out.println("Does r1 overlap the rectangle specified (3, 5, 2.3, 5.4)? : " + r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
	}
}
