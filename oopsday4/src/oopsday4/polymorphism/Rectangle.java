package oopsday4.polymorphism;

public class Rectangle extends Shape {
	private double length;
	private double bredth;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(double length, double bredth) {
		super();
		this.length = length;
		this.bredth = bredth;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBredth() {
		return bredth;
	}
	public void setBredth(double bredth) {
		this.bredth = bredth;
	}
	public double area() {
		return length*bredth;
		
	}

}
