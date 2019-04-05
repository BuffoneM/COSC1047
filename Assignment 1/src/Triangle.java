/*
 *	Michael Buffone 
 * 	1/14/2019
 * 	COSC1047W19
 * 	Assignment 1 Question B2
 * 	This is the triangle class that extends "GeometricObject"
 */
public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	// Default Constructor
	public Triangle(){	
	}
	
	// Constructor used to create the triangle
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	// Accessors and Mutators for the sides
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
 
	// Methods
	public double getArea() {
		if(isValid()) {
			double s = (side1 + side2 + side3) / 2.0;
			double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
			return Math.round(area * 100.00) / 100.00;
		}
		else {
			return 0;
		}
	}

	public double getPerimeter() {
		if(isValid()) {
			return side1 + side2 + side3;
		}
		else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		if(isValid()) {
			return "-Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3 + "\n-Created on " + getDateCreated() + "\n-Color: "
					+ getColor() + ", and filled: " + isFilled();
		}
		else {
			return "INVALID";
		}
	}

	// Check to see if the triangle is valid
	private boolean isValid() {
		if(side1 + side2 < side3) {
			return false;
		}
		else if(side1 + side3 < side2) {
			return false;
		}
		else if(side2 + side3 < side1) {
			return false;
		}
		return true;
	}
}
