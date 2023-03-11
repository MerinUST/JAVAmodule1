package oopsday3.overloading;

public class Testmath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		math m=new math();
		int result=m.add(2, 3);
		System.out.println(result);
		result=m.add(2, 3, 4);
		System.out.println(result);
		double result2=m.add(2.5, 3.4);
		System.out.println(result2);
		result2=m.add(2.5, 3.4, 4.4);
		System.out.println(result2);
		result2=m.add(20L, 37L, 44L);
		System.out.println("LONG"+result2);
		result2=m.add(10,10f,33);  //compile time polymorphism 
		// it will think that it can do
		System.out.println("float"+result2);

	}

}
