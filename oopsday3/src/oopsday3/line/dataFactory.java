package oopsday3.line;

public class dataFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		points p1=new points(5,10);
		points p2=new points(10,20);
		
		DrawLine d= new DrawLine();
		d.drawline(p1,p2);

	}

}
