package javaEnums2;

public enum color {
	
	    RED(255, 0, 0),
	    GREEN(0, 255, 0),
	    BLUE(0, 0, 255),
	    WHITE(255, 255, 255),
	    BLACK(0, 0, 0);

	    private final int red;
	    private final int green;
	    private final int blue;

	    color(int red, int green, int blue) {
	        this.red = red;
	        this.green = green;
	        this.blue = blue;
	    }

	    public int getRed() {
	        return red;
	    }

	    public int getGreen() {
	        return green;
	    }

	    public int getBlue() {
	        return blue;
	    }
	

}
