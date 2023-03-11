package oopsday5;

public class TestFinal {
	int a=b;// bis forward refernced
	static int b=10;
	final double pie=3.14;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFinal t =new TestFinal();
		System.out.println(t.pie)  ;
	}

}
