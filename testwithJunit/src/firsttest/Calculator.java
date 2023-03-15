package firsttest;

public class Calculator {
	public int power(int b,int e) {
		int p=1;
		int i=1;
		if(b==0||e==0) 
			return 0;
		
			else {
				while(i<=e) {
					p*=b;
				}
			}
		return p;
		}
	public int factorial(int n) {
	
		if (n == 0)
			  return 1;
			   
			  return n*factorial(n-1);
			 }
	public int add(int x,int y) {
		return x+y;
	}
	}

