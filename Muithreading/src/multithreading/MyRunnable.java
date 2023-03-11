package multithreading;

import java.util.Scanner;

public class MyRunnable implements Runnable {

	@Override
	public void run() {//entry point for every child thread
		for(int i=1;i<=5;i++) {
			System.out.println("enter your input");//thread  is blocked
			int a=new Scanner(System.in).nextInt();
			System.out.println("got the input proceeding");
					
			System.out.println(Thread.currentThread().getName()+"="+i);
			try {
				Thread.sleep(3000);//is we dont put the treads to sleep they dint give way to others
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				}

	}

}
