/*
 * GeometricObject which Square extends in partA1, and Octagon extends in partA2
 */

public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public boolean getFilled() {
		return filled;
	}
	
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	@Override
	public String toString() {
		return "Created on " + dateCreated + "\nColor: " + color + ", and filled: " + filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();

}
