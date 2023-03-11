package shapes.trial;

public class square implements interfaceShapes {
private baseShapes bs = new baseShapes(2,2);
	@Override
	public int area() {
		// TODO Auto-generated method stub
		
		return (bs.getLength()*bs.getBreadth());
	}

	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		return (bs.getBreadth()*2);
	}

}
