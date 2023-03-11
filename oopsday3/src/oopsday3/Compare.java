package oopsday3;

public class Compare {
	public static void main(String[] args)
	{
	Rectangle r1 = new Rectangle();
	Rectangle r2 = new Rectangle();
	Rectangle r3 = new Rectangle();
	
	Triangle t1 = new Triangle();
	Triangle t2 = new Triangle();
//comparing primitives
	int a = 10;
	int b = 35;
    boolean result = a==b;//hashcodes
//comparing objects
//1. comparing references
//2. comparing members
	result = r1==r2;
	System.out.println(result);
	System.out.println(r1.hashCode());
	System.out.println(r2.hashCode());
	System.out.println(r3.hashCode());
	
	
	result=r1.equals(r2);
	System.out.println(result);
	result=r1.equals(r3);
	System.out.println(result);
	// not applicable to premitives
	r1.setLength(35.5);
	r1.setBredth(75.45);
	r2.setLength(35.5);
	r2.setBredth(75.45);
	if((r1.getLength()==r2.getLength()) && (r1.getBredth()==r2.getBredth()))
			System.out.println("they have same length and bredth");
	else
		System.out.println("they dont have same length and bredth");
			
	//we are not comparing objects r1 and t1
	//we are comparing data members of two objects
	t1.setS1(b);
	//t1.getS2()
	
}
}
