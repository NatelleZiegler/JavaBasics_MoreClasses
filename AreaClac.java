import java.util.*;
public class AreaClac {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("This program will calculate the area of three objects:\nA circle," 
		+ " a rectangle, and a cylinder.");
		System.out.println();
		Area myArea = new Area();
		
		//getting radius of a circle
		System.out.print("Enter the radius of a circle: ");
		double radius = scan.nextDouble();
		scan.nextLine();
		while(radius <= 0) {
			System.out.println("The radius you entered must be greater than zero.");
			System.out.print("Enter the radius of a circle: ");
			radius = scan.nextDouble();
			scan.nextLine();
		}
		double circleArea = myArea.getArea(radius);
		
		//getting area of a rectangle
		System.out.print("Enter the width of a rectangle: ");
		double width = scan.nextDouble();
		scan.nextLine();
		while(width <= 0) {
			System.out.println("The width you entered must be greater than zero.");
			System.out.print("Enter the width of a rectangle: ");
			width = scan.nextDouble();
			scan.nextLine();
		}
		System.out.print("Enter the length of a rectangle: ");
		double length = scan.nextDouble();
		scan.nextLine();
		while(length <= 0) {
			System.out.println("The length you entered must be greater than zero.");
			System.out.print("Enter the length of a rectangle: ");
			length = scan.nextDouble();
			scan.nextLine();
		}
		double recArea = myArea.getArea(width, length);
		
		//getting the area of a cylinder
		System.out.print("Enter the radius of the base of a cylinder: ");
		double cylRadius = scan.nextDouble();
		scan.nextLine();
		while(cylRadius <= 0) {
			System.out.println("The radius you entered must be greater than zero.");
			System.out.print("Enter the radius of the base of a cylinder: ");
			cylRadius = scan.nextDouble();
			scan.nextLine();
		}
		System.out.print("Enter the height of a cylinder: ");
		double cylHeight = scan.nextDouble();
		scan.nextLine();
		while(cylHeight <= 0) {
			System.out.println("The height you entered must be greater than zero.");
			System.out.print("Enter the height of a cylinder: ");
			cylHeight = scan.nextDouble();
			scan.nextLine();
		}
		double cylArea = myArea.getCylArea(cylRadius, cylHeight);
		
		System.out.println(); //blank line for readability
		System.out.printf("The area of your circle is %.2f.", circleArea);
		System.out.println();
		System.out.printf("The area of your rectangle is %.2f.", recArea);
		System.out.println();
		System.out.printf("The area of your cylinder is %.2f.", cylArea);
		System.out.println();
	}
}