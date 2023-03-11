package testLamdas;
@FunctionalInterface
public interface TestInterface {//explicitily making it a interface
	public double method();//default methods and static methods
	public default void method2() {//default used in interface only
		System.out.println("form method2");
	}
public static void method3() {
	System.out.println("from static method");
}
}
