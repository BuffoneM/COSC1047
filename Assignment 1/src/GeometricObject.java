/*
 *	Michael Buffone 
 * 	1/14/2019
 * 	COSC1047W19
 * 	Assignment 1 Question B2
 * 	This is the geometric object class given from the textbook
 */
public class GeometricObject {
	private String color = "white";
	
	private boolean filled;
	private java.util.Date dateCreated;
	
	// Constructors
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	// Accessors and Mutators
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
}
