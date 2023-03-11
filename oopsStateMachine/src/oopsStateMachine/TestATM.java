package oopsStateMachine;
import java.util.Scanner;
public class TestATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******WELCOME******");
		//System.out.println("Enter amount");
		//Scanner sc=new Scanner(System.in);
		//int amount=sc.nextInt();
		methods m=new methods();
		int x=0;
		int y=0;
		int z=0;
		int q=0;
		int w=0;
		 int i=1;
		 //int trails;
		 System.out.println("Enter the number of trials you need:");
		 Scanner sc=new Scanner(System.in);
		 int trys=sc.nextInt();
		 
		 
		 while(i<=trys){
			 System.out.println("Enter Amount: ");
			 
			 int amount= sc.nextInt();
			 
			 if(amount>=5) {
				 
			 System.out.println("Denomination for 100:");
			 int deno1=sc.nextInt();
			 x=m.denomi100(amount,deno1);
			 System.out.println("Amount left:"+x);
			 if(amount==x)
				 break;
			 
			 System.out.println("Denomination for 50:");
			 int deno2=sc.nextInt();
			 y=m.denomi50(x,deno2);
			 System.out.println("Amount left:"+y);
			 if(amount==y)
				 break;
			 
			 if(y<=amount){
			 System.out.println("Denomination for 20:");
			 int deno3=sc.nextInt();
			 z=m.denomi20(y,deno3);
			 System.out.println("Amount left:"+z);
			 if(amount==z)
				 break;
			 }
			
			 if(z<=amount){
			 System.out.println("Denomination for 10:");
			 int deno4=sc.nextInt();
			 q=m.denomi10(z,deno4);
			 System.out.println("Amount left:"+q);
			 if(amount==q)
				 break;
			 }
			 
			 
			  if(q<=amount){
			 System.out.println("Denomination for 5:");
			 int deno5=sc.nextInt();
			 w=m.denomi5(q,deno5);
			 System.out.println("Amount left:"+w);
			 if(amount==q)
				 break;
			 }
			  
	 }
			 
			 
			 else {
				 System.out.println("Enter value greater than 5...!");
			 }
			 //else {
				 
				//System.out.println("invalid input");
			 
			 
			 
			 
		// }
		i++;

		 }
		 System.out.println("THANKYOU...!");
		 
	}

		
	
}
