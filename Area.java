public class Area {

	//get the area of a circle
	public static double getArea(double radius) {
		double area = Math.PI * radius * radius;
		return area;
	}
	
	//get area of a rectangle
	public static double getArea(double width, double length) {
		double area = width * length;
		return area;
	}
	
	//get area of a cylinder
	public static double getCylArea(double base, double height) {
		double area = Math.PI * (base * base) * height;
		return area;
	}
}