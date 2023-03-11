 package Math.trail;

public class operations implements interfaceMath {
	
	private int num;

	public operations() {
		// TODO Auto-generated constructor stub
	}
	public operations(int num) {
		
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void fact(int num) {
		int f=1;
		for(int i=num;i>0;i--) {
			f=f*i;
		}
		System.out.println("fact="+f);
		
	}
}
