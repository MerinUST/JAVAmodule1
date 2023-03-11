package shapes.trial;

public class baseShapes {
	private int length;
	private int breadth;
	public baseShapes() {
		// TODO Auto-generated constructor stub
	}
	public baseShapes(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	@Override
	public String toString() {
		return "baseShapes [length=" + length + ", breadth=" + breadth + "]";
	}
	
	

}
