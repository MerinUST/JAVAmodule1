package oopsday4;

public class StaicDemo2 {
	static int a; //
	public static void method() {//cannot access not static methods
		
	
		System.out.println("from method"+a);
	
	}
	public void method2() {// is non static
		System.out.println(a);
	}
	
}
