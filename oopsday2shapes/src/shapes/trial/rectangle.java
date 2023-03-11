package shapes.trial;

public class rectangle implements interfaceShapes {
private baseShapes b=new baseShapes(2,3);
int r=0;
int t=0;
	@Override
	
	public int area() {
		// TODO Auto-generated method stub
		r=b.getLength()*b.getBreadth();
		return r;
	}

	@Override
	public int perimeter() {
		t=b.getBreadth()+b.getLength();
		// TODO Auto-generated method stub
		return t;
	}

}
