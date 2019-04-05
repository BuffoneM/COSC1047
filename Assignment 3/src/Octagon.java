/*
 * This is the class for question A2
 */

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	
	private double side;
	
	// Constructors
	public Octagon(){
		side = 0;
	}
	
	public Octagon(double side) {
		this.side = side;
	}
	
	// Accessors and Mutators
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}

	// Functions
	@Override
	public double getArea() {
		return ((2 + 4 / Math.sqrt(2)) * side * side);
	}
	
	@Override
	public double getPerimeter() {
		return side * 8;
	}

	@Override
	public int compareTo(Octagon o) {
		if(getSide() > o.getSide()) {
			return 1;
		}
		else if(getSide() == o.getSide()) {
			return 0;	
		}
		return -1;
	}

	@Override 
	public Object clone() throws CloneNotSupportedException {
		Octagon octClone = (Octagon)super.clone();
		return octClone;
	}
	
	@Override
	public String toString() {
		return "The side lengths are: " + getSide() + ", the area is: " + getArea() 
				+ ", the perimeter is: " + getPerimeter();
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof Octagon) {
			if(((Octagon) o).getSide() == getSide()) {
				return true;
			}
		}
		return false;
	}
}
