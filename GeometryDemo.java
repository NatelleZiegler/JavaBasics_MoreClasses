import java.util.*;
public class GeometryDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userInput;
		
		do {
			System.out.println("Geometry Calculator");
			System.out.println("1.  Calculate the Area of a Circle");
			System.out.println("2.  Calculate the Area of a Rectangle");
			System.out.println("3.  Calculate the Area of a Triangle");
			System.out.println("4.  Quit");
			System.out.println();
			System.out.print("Enter your choice (1 - 4): ");
			userInput = scan.nextInt();
			scan.nextLine();
			while(userInput < 1 || userInput > 4) {
				System.out.println("Error - invalid menu selection.");
				System.out.print("Enter your choice (1 - 4): ");
				userInput = scan.nextInt();
				scan.nextLine();
			}
			switch(userInput) {
				case 1:
					System.out.print("Enter the radius of a circle: ");
					double radius = scan.nextDouble();
					scan.nextLine();
					double cArea = Geometry.getCircleArea(radius);
					while(cArea < 0) {
						System.out.print("Enter the radius of a circle: ");
						radius = scan.nextDouble();
						scan.nextLine();
						cArea = Geometry.getCircleArea(radius);
					}
					System.out.printf("The area of your circle is %.1f.", cArea);
					System.out.println();
				break;
				case 2:
					System.out.print("Enter the length of a rectangle: ");
					double length = scan.nextDouble();
					scan.nextLine();
					System.out.print("Enter the width of a rectangle: ");
					double width = scan.nextDouble();
					scan.nextLine();
					double rArea = Geometry.getRecArea(length, width);
					while(rArea < 0) {
						System.out.print("Enter the length of a rectangle: ");
						length = scan.nextDouble();
						scan.nextLine();
						System.out.print("Enter the width of a rectangle: ");
						width = scan.nextDouble();
						scan.nextLine();
						rArea = Geometry.getRecArea(length, width);
					}
					System.out.printf("The area of your rectangle is %.1f.", rArea);
					System.out.println();
				break;
				case 3:
					System.out.print("Enter the base of a triangle: ");
					double base = scan.nextDouble();
					scan.nextLine();
					System.out.print("Enter the height of a triangle: ");
					double height = scan.nextDouble();
					scan.nextLine();
					double tArea = Geometry.getTriangleArea(base, height);
					while(tArea < 0) {
						System.out.print("Enter the base of a triangle: ");
						base = scan.nextDouble();
						scan.nextLine();
						System.out.print("Enter the height of a triangle: ");
						height = scan.nextDouble();
						scan.nextLine();
						tArea = Geometry.getTriangleArea(base, height);
					}
					System.out.printf("The area of your triangle is %.1f.", tArea);
					System.out.println();
				break;
				case 4:
				break;
				default:
					System.out.println("Error.");
			}
		} while(userInput != 4);
	}
}