import java.util.*;
public class LandTractDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LandTract tract1 = new LandTract();
		LandTract tract2 = new LandTract();
		
		//getting the width of the two tracts of land
		System.out.print("Enter the width of your first tact of land: ");
		double width = scan.nextDouble();
		scan.nextLine();
		while(width <= 0) {
			System.out.println("The width of your tract of land must be greater than zero.");
			System.out.print("Enter the width of your first tract of land: ");
			width = scan.nextDouble();
			scan.nextLine();
		}
		tract1.setWidth(width);
		System.out.print("Enter the width of your second tract of land: ");
		width = scan.nextDouble();
		scan.nextLine();
		while(width <= 0) {
			System.out.println("The width of your tract of land must be greater than zero.");
			System.out.print("Enter the width of your second tract of land: ");
			width = scan.nextDouble();
			scan.nextLine();
		}
		tract2.setWidth(width);
		
		//getting the length of the two tracts of land
		System.out.print("Enter the length of your first tract of land: ");
		double length = scan.nextDouble();
		scan.nextLine();
		while(length <=0) {
			System.out.println("The length of your tract of land must be greater than zero.");
			System.out.print("Enter the length of your first tract of land: ");
			length = scan.nextDouble();
			scan.nextLine();
		}
		tract1.setLength(length);
		System.out.print("Enter the width of your second tract of land: ");
		length = scan.nextDouble();
		scan.nextLine();
		while(length <= 0) {
			System.out.println("The width of your tract of land must be greater than zero.");
			System.out.print("Enter the width of your second tract of land: ");
			length = scan.nextDouble();
			scan.nextLine();
		}
		tract2.setLength(length);
		
		//getting the areas
		double area1 = tract1.getArea();
		double area2 = tract2.getArea();
		
		System.out.println("The area of tract one is " + area1 + ".");
		System.out.println("The area of tract two is " + area2 + ".");
		if(tract1.equals(tract2)) {
			System.out.println("The tracts of land are equal.");
		}
		else {
			System.out.println("The tracts of land are not equal.");
		}
	}
}