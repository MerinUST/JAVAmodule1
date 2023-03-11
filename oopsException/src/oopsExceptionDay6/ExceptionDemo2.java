package oopsExceptionDay6;

public class ExceptionDemo2 {

	public static void main(String[] args) {// command line arguments 
		// TODO Auto-generated method stub
		System.out.println("program task begins");
		try {
		int b =Integer.parseInt(args[0]);//"10" , "20"
		int a= Integer.parseInt(args[1]);
		int c =b/a;
		String name=args[2];
		int data[]= {a,b};
	   }
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		 System.out.println("programm task completed");
	}

}
