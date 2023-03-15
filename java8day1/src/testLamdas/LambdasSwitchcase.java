package testLamdas;

public class LambdasSwitchcase {
	static double calculate(String operator, double x, double y)
	{
		return switch(operator) {
		case "+"->x+y;
		case "-"->x-y;
		case "*"->x*y;
		case "/"->{
			if(y==0) {
				throw new IllegalArgumentException("can't divide by zero");
			}
			yield x/y;
		}
		default->throw new IllegalArgumentException("Unknown operators");
		
		};
	}
	public static void main(String[] args) {
		double c= calculate("+",2,3);
		System.out.println(c);
		System.out.println(calculate("-",2,3));
		System.out.println(calculate("*",2,3));
		System.out.println(calculate("/",2,3));
		System.out.println(calculate("/",2,0));
		
		
		
	
	}
	}

