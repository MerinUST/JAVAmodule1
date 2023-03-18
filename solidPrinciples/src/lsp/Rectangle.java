package lsp;

public class Rectangle implements shape {
	private int length;
	private int bredth;
	public Rectangle(int length, int bredth) {
		super();
		this.length = length;
		this.bredth = bredth;
	}
	public int getArea() {
		return this.bredth*this.length;
	}

}
