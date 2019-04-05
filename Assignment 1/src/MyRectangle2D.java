/*
 *	Michael Buffone 
 * 	1/10/2019
 * 	COSC1047W19
 * 	Assignment 1 Question B1
 * 	This is the Rectangle class for Question B1
 */
public class MyRectangle2D {
	// Variables
	private double x;
	private double y;
	private double width;
	private double height;


	// Accessors and Mutators
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	// Constructors
	MyRectangle2D(){
		x = 0;
		y = 0;
		width = 1;
		height = 1;
	}
	
	MyRectangle2D(double x, double y, double width, double height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// Methods
	public double getArea() {
		return Math.round((width * height) * 100.00) / 100.00;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
	// Checking: Contains a single point?
	public boolean contains(double x, double y) {
		
		// Get the location of the rectangle
		double minX = this.x - width / 2;
		minX = Math.round(minX * 100.0) / 100.0;
		double maxX = this.x + width / 2;
		maxX = Math.round(maxX * 100.0) / 100.0;
		double minY = this.y - height / 2;
		minY = Math.round(minY * 100.0) / 100.0;
		double maxY = this.y + height / 2;
		maxY = Math.round(maxY * 100.0) / 100.0;
		
		// Check to see if the point is in the main rectangle
		if((x > minX && x < maxX) && (y > minY && y < maxY)) {
			return true;
		}
		return false;
		
	}
	
	// Checking: Contains a full rectangle?
	public boolean contains(MyRectangle2D r) {
		
		// Get the location of the rectangle
		double minX = this.x - width / 2;
		minX = Math.round(minX * 100.0) / 100.0;
		double maxX = this.x + width / 2;
		maxX = Math.round(maxX * 100.0) / 100.0;
		double minY = this.y - height / 2;
		minY = Math.round(minY * 100.0) / 100.0;
		double maxY = this.y + height / 2;
		maxY = Math.round(maxY * 100.0) / 100.0;
		
		// Get the location of the second rectangle
		double Rect2MinX = r.getX() - width / 2;
		double Rect2MaxX = r.getX() + width / 2;
		double Rect2MinY = r.getY() - height / 2;
		double Rect2MaxY = r.getY() + height / 2;
		
		// Return false if any of the points aren't in the boundaries
		if(Rect2MinX < minX || Rect2MinX > maxX) {
			return false;
		}
		else if(Rect2MaxX < minX || Rect2MaxX > maxX) {
			return false;
		}
		else if(Rect2MinY < minY || Rect2MinY > maxY) {
			return false;
		}
		else if(Rect2MaxY < minY || Rect2MaxY > maxY) {
			return false;
		}
		return true;
	}
	
	// Checking: The bigger rectangle is overlapped with another rectangle?
	public boolean overlaps(MyRectangle2D r) {
		
		// Get the location of the rectangle
		double minX = this.x - width / 2;
		minX = Math.round(minX * 100.0) / 100.0;
		double maxX = this.x + width / 2;
		maxX = Math.round(maxX * 100.0) / 100.0;
		double minY = this.y - height / 2;
		minY = Math.round(minY * 100.0) / 100.0;
		double maxY = this.y + height / 2;
		maxY = Math.round(maxY * 100.0) / 100.0;
		
		// Get the location of the second rectangle
		double Rect2MinX = r.getX() - width / 2;
		double Rect2MaxX = r.getX() + width / 2;
		double Rect2MinY = r.getY() - height / 2;
		double Rect2MaxY = r.getY() + height / 2;
		
		// Return true if any point of the second rectangle is in the first rectangle
		if(Rect2MinX > minX && Rect2MinX < maxX) {
			return true;
		}
		else if(Rect2MaxX > minX && Rect2MaxX < maxX) {
			return true;
		}
		else if(Rect2MinY > minY && Rect2MinY < maxY) {
			return true;
		}
		else if(Rect2MaxY > minY && Rect2MaxY < maxY) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		// Get the coordinates of the point
		double minX = this.x - width / 2;
		minX = Math.round(minX * 100.0) / 100.0;
		double maxX = this.x + width / 2;
		maxX = Math.round(maxX * 100.0) / 100.0;
		double minY = this.y - height / 2;
		minY = Math.round(minY * 100.0) / 100.0;
		double maxY = this.y + height / 2;
		maxY = Math.round(maxY * 100.0) / 100.0;
		
		// Putting all the points into their strings
		String point1 = "(" + minX + ", " + maxY + ")";
		String point2 = "(" + maxX + ", " + maxY + ")";
		String point3 = "(" + maxX + ", " + minY + ")";
		String point4 = "(" + minX + ", " + minY + ")";
		
		return "\"Rectangle centered at (" + getX() + ", " + getY() + ") with a width of " + getWidth() + " and a height of " + getHeight() + " with corners at " + point1 + ", " +
				point2 + ", " + point3 + ", and " + point4 + ".\"";
	}
}
