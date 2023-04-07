package debugg;

public class TestCode2 {
	int a;
	int b;
	int x;
	int a1[]= {2,5,7,8,5};
	int b1[]= {23,43,27,32,12};
	int x1[]= {18,19,20,21,22};
	void add() {
		for(int i=0;i<a1.length;i++) {
		int res=a1[i]*(x1[i]*x1[i])+b1[i]*(x1[i]*x1[i])+2*a1[i]*b1[i];
		System.out.println(res);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestCode2().add();
		
	}

}
