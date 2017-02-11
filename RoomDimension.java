public class RoomDimension {
	private double length; //the length of the room
	private double width; //the width of the room
	
	//constructor
	public RoomDimension(double l, double w) {
		length = l;
		width = w;
	}
	
	//mutators
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
	
	//calculate and return the area of the room
	public double getArea() {
		double area = length * width;
		return area;
	}
}