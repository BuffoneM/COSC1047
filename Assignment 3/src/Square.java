/*
 * Square class for question a1
 */

public class Square extends GeometricObject implements Colorable {
	
	private double side;
	
	public Square() {
		side = 0;
	}
	
	public Square(double side) {
		this.side = side;
	}
	
	// Accessors and Mutators
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	// Methods
	@Override
	public void howToColor() {
		System.out.println("Color all four sides");
	}

	@Override
	public double getArea() {
		return side * side;
	}

	@Override
	public double getPerimeter() {
		return side * 4;
	}
	 
	@Override
	public String toString() {
		return super.toString() + ", " + "\nThe size is: " + getSide() + ", the area is: " + getArea() +  ", and the perimeter is: " + getPerimeter();
	}
}
