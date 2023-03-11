package testLamdas;
@FunctionalInterface
interface Shape{
	double area();
	//double perimeter(); not allowed
}
interface Math{
	double power(int b,int e);
}
interface factorial{
	double fact(int f);
}
public class TestLamdasExample1 {

	public static void main(String[] args) {
		factorial f1=(int f)->{
			int x=1;
			for(int i=1;i<=f;i++) {
				x=x*i;
			}
			return x;
		};
		double ff=f1.fact(5);
		System.out.println(ff);
		
		//-----------------------------
		Runnable r1=new Runnable() {
			public void run() {
				System.out.println("from run method");
			}
		};
		Thread t1=new Thread(r1);
		t1.start();
		Runnable r=()->{
			for(int i=1;i<5;i++) {
				System.out.println("in run method"+i);
			}
		};
		Thread t=new Thread(r);
		t.start();
		//--------------------------------
		Math m=(int b,int e)->{
			int p=1;
			for(int i=1;i<=e;i++) {
				p*=b;
			}
			return p;
				
		};
		double p=m.power(2,3);
		System.out.println(p);
		
		//------------------------------
		Shape s=()->{//lambda is a placeholder. when area method is called the code is activated
			return 0.0;
		};
		double result=s.area();
		System.out.println(result);
		
		
	}

}
