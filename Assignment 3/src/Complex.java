/*
 * Class used for partB2
 */

public class Complex implements Comparable<Complex>, Cloneable{
	
	private double a;
	private double b;
	private final double i = Math.sqrt(-1);
	
	
	// Constructors
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public Complex(double a) {
		this.a = a;
		b = 0;
	}
	
	public Complex() {
		a = 0;
		b = 0;
	}
	
	// Methods
	public void add(double num3, double num4) {
		double term1 = a + num3;
		double term2 = b + num4;
				
		System.out.println("(" + a + " + " + b + "i)" + " + (" + num3 + " + " + num4 + "i)" + " = " + term1 + " + " + term2 + "i");
	}
	
	public void subtract(double num3, double num4) {
		double term1 = a - num3;
		double term2 = b - num4;
		
		System.out.println("(" + a + " + " + b + "i)" + " - (" + num3 + " + " + num4 + "i)" + " = " + term1 + " + " + term2 + "i");
	}
	
	public void multiply(double num3, double num4) { 
		double term1 = ((a * num3) - (b * num4)); 
		double term2 = ((b * num3) + (a * num4));
		
		System.out.println("(" + a + " + " + b + "i)" + " * (" + num3 + " + " + num4 + "i)" + " = " + term1 + " + " + term2 + "i");
	}
	
	public void divide(double num3, double num4) {
		double term1 = ((a * num3) + (b * num4)) / ((Math.pow(num3, 2) + Math.pow(num4, 2)));
		double term2 = ((b * num3) - (a * num4)) / ((Math.pow(num3, 2) + Math.pow(num4, 2)));
		
		System.out.println("(" + a + " + " + b + "i)" + " / (" + num3 + " + " + num4 + "i)" + " = " + term1 + " + " + term2 + "i");
	}
	
	public double abs() { 
		
		double answer = Math.pow(a, 2) + Math.pow(b, 2);
		answer = Math.sqrt(answer);
		
		System.out.println("|(" + a + " + " + b + "i)| = " + answer);
		
		return answer;
	}
	
	public double getRealPart() {
		return a;
	}
	
	public double getImaginaryPart() {
		return b;
	}
	
	// Overridden Methods
	@Override
	public String toString() {
		if(b == 0) {
			return "" + a;
		}
		else {
			return "" + (a + " + " + b + "i");
		}
		
	}

	@Override
	public int compareTo(Complex n) {
		System.out.println("\nComparing the complex numbers' absolute values': ");
		if(abs() > n.abs()) {
			return 1;
		}
		else if(abs() == n.abs()) {
			return 0;
		}
		return -1;
	}
	

	
}
