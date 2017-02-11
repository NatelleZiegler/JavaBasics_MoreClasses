import java.util.*;
public class CarpetCalc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//getting the dimensions of the room
		System.out.print("Enter the length of the room you would like to carpet: ");
		double length = scan.nextDouble();
		scan.nextLine();
		while(length <= 0) {
			System.out.println("The length of your room must be greater than zero.");
			System.out.print("Enter the length of the room you would like to carpet: ");
			length = scan.nextDouble();
			scan.nextLine();
		}
		System.out.print("Enter the width of the room you would like to carpet: ");
		double width = scan.nextDouble();
		scan.nextLine();
		while(width <= 0) {
			System.out.println("The width of your room must be greater than zero.");
			System.out.print("Enter the width of the room you would like to carpet: ");
			width = scan.nextDouble();
			scan.nextLine();
		}
		
		RoomDimension targetRoom = new RoomDimension(length, width);
		
		System.out.print("Enter the price of the carpet per square foot: $");
		double price = scan.nextDouble();
		scan.nextLine();
		while(price <= 0) {
			System.out.println("The cost of the carpet must be greater than zero.");
			System.out.print("Enter the price of the carpet per square foot: $");
			price = scan.nextDouble();
			scan.nextLine();
		}
		
		RoomCarpet targetCarpet = new RoomCarpet();
		targetCarpet.setRoomDimension(targetRoom);
		targetCarpet.setCost(price);
		double total = targetCarpet.getTotalCost();
		System.out.printf("\nThe total cost of the carpeting the room is $%,.2f.", total);
		System.out.println();
	}
}