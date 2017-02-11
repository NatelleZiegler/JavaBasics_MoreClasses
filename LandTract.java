public class LandTract {
	private double length; //length of the tract
	private double width; //width of the tract
	
	//constructor
	public LandTract(double l, double w) {
		length = l;
		width = w;
	}
	
	public LandTract() {
		length = 0;
		width = 0;
	}
	
	//setters
	public void setLength(double l) {
		length = l;
	}
	
	public void setWidth(double w) {
		width = w;
	}
	
	//getters
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	//returns the tract's area
	public double getArea() {
		double area = length * width;
		return area;
	}
	
	//equals method
	public boolean equals(LandTract tract2) {
		boolean status;
		if(length == tract2.length && width == tract2.width) {
			status = true;
		}
		else {
			status = false;
		}
		return status;
	}
	
	//toString method
	public String toString() {
		String str = "Length: " + length +
			"\nWidth: " + width;
		return str;
	}
}