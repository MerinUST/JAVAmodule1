package oopsExceptionDay6;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program task begin");
		
		try {
			System.out.println("entered try");
			int c=10/0;
			
			System.out.println("from try after exception...");
		}catch(Exception e) {
			System.out.println("from catch...");
			
		}
		finally {
			System.out.println("from finally..");
		}
	System.out.println("Program completed task");	
	}

}
