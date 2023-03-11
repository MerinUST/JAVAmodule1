package oopsday2shapes;

public class Rectangle implements ShapeIface {
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



	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("area="+(length*bredth));

	}



	@Override
	public String toString() {
		return "shapes [length=" + length + ", bredth=" + bredth + "]";
	}
	

}
