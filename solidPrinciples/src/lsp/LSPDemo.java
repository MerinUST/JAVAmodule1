package lsp;

public class LSPDemo {
	public void calculateAreas(shape s) {
		System.out.println(s.getArea());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LSPDemo lsp=new LSPDemo();
		lsp.calculateAreas(new Rectangle(1,4));
		lsp.calculateAreas(new square(5));
	}

}
