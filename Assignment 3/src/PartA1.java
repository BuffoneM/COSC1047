/*
 *	Michael Buffone 
 * 	1/30/2019
 * 	COSC1047W19
 * 	Assignment 3 Question A1 (13.7 pg 536)
 * 	This program will use the following: "Colorable", "GeometricObject", and "Square"
 *  -Within main, five squares will be made with random sizes and results will be outputted
 */

public class PartA1 {
	
	public static void main(String[] args) {
		
		Square[] squareArray = new Square[5];
		
		for(int i = 0; i < squareArray.length; i++) {
			
			// Generate a random sized square with a random filled value- if the value is true generate a random color otherwise keep it white
			Square temp = new Square((2 + (int)(Math.random() * (9 - 1 + 1))));
			temp.setFilled(getRandomFilled());
			if(temp.getFilled()) {
				temp.setColor(getRandomColor());
			}
			
			squareArray[i] = temp;
			
			System.out.println(squareArray[i]);
			squareArray[i].howToColor();
			System.out.println("------------------------------------------------------------------------------");
		}
		
		
		
	}
	
	public static String getRandomColor() {
		String color = "";
		
		switch(0 + (int)(Math.random() * (3 - 1 + 1))) {
		case 0:
			color = "yellow";
			break;
		case 1:
			color = "blue";
			break;
		case 2:
			color = "red";
			break;
		default:
			color = "orange";
			break;
		}
		
		return color;
	}
	
	public static boolean getRandomFilled() {
		boolean isFilled = false;
		
		switch(0 + (int)(Math.random() * (2 - 0 + 0))) {
		case 0:
			isFilled = true;
			break;
		default:
			isFilled = false;
		}
		
		return isFilled;
	}
}
