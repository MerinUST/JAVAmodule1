package shapes.trial;

public class shapesFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceShapes b=new rectangle();
		int w=b.area();
		System.out.println("area ="+w);
		int e=b.perimeter();
		System.out.println("perimeter="+e);
		interfaceShapes bb=new square();
		int ww=bb.area();
		System.out.println("area ="+ww);
		int ee=bb.perimeter();
		System.out.println("perimeter="+ee);

	}

}
