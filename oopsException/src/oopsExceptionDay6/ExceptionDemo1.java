package oopsExceptionDay6;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Programm tast begins");
		try {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("cannot / by zero");
		}
		catch(InputMismatchException e){
			System.out.println("invalid input format");
			
		}
		System.out.println("Programm task ended");

	}

}
