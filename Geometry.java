public class Geometry {
	
	//a formula for calculating and returning the area of a circle
	public static double getCircleArea(double radius) {
		double area;
		if(radius < 0) {
			System.out.println("Error - the radius of a circle cannot be a negative value.");
			area = -1;
		}
		else {
			area = Math.PI * (radius * radius);
		}
		return area;
	}
	
	//a formula for calculating the area of a rectangle
	public static double getRecArea(double length, double width) {
		double area;
		if(length < 0 || width < 0) {
			System.out.println("Error - the length and/or width of a rectangle cannot be a negative value.");
			area = -1;
		}
		else {
			area = length * width;
		}
		return area;
	}
	
	//a formula for calculating the area of a triangle
	public static double getTriangleArea(double base, double height) {
		double area;
		if(base < 0 || height < 0) {
			System.out.println("Error - the base and/or height of your triangle cannot be a negative value.");
			area = -1;
		}
		else {
			area = base * height * 0.5;
		}
		return area;
	}
}