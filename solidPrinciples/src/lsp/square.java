package lsp;

public class square implements shape {
	private int side;

	public square(int side) {
		super();
		this.side = side;
	}
	
	public int getArea() {
		return this.side*this.side;
	}

}
