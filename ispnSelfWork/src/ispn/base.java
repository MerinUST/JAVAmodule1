package ispn;

import java.util.Scanner;
import java.io.IOException;
public class base {
	public static void main(String[] args)throws IOException {
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int rem=0;
		int c=0;
		int sum=0;
		int i=1;
		
		while(temp>0) {
			rem=temp%10;
			c++;
			temp=temp/10;
			
		}
		
		if(c==10) {
			
				while(i<=10) 
						{
					rem=num%10;
					sum=rem*i;
					num=num/10;
					}
				i++;
		
		//}
		
		System.out.println("count="+c);
		System.out.println("value="+sum);
		}
		//}
		else {
		System.out.println("Invalid number");
		}
	}
}
