package oopsday4.polymorphism;

public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Rectangle(10.25,65.75);
		double result= s.area();
		System.out.println(result);
		Shape s1=new Square(22);
		result=s1.area();
		System.out.println(result);
		Shape s3= new Circle(3);
		result=s3.area();
		System.out.println(result);

		
	}

}
