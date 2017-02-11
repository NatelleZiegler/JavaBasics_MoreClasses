import java.util.*;
public class ParkingCopDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the make of your car: ");
		String make = scan.nextLine();
		System.out.print("Enter the model of your car: ");
		String model = scan.nextLine();
		System.out.print("Enter the color of your car: ");
		String color = scan.nextLine();
		System.out.print("Enter the license number of your car: ");
		String license = scan.nextLine();
		System.out.print("Enter for how many minutes your car has been parked: ");
		int numMinutes = scan.nextInt();
		scan.nextLine();
		while(numMinutes < 0) {
			System.out.println("You cannot be parked for a negative number of minutes.");
			System.out.print("Enter the number of minutes your car has been parked: ");
			numMinutes = scan.nextInt();
			scan.nextLine();
		}
		System.out.print("Enter how many minutes you paid for on the meter: ");
		int paidMinutes = scan.nextInt();
		scan.nextLine();
		while(paidMinutes < 0) {
			System.out.println("You cannot have purchased a negative number of minutes.");
			System.out.print("Enter how many minutes you paid for on the meter: ");
			paidMinutes = scan.nextInt();
			scan.nextLine();
		}
		ParkedCar userCar = new ParkedCar();
		userCar.setMake(make);
		userCar.setModel(model);
		userCar.setColor(color);
		userCar.setLicense(license);
		userCar.setMinutes(numMinutes);
		
		ParkingMeter userMeter = new ParkingMeter(paidMinutes);
		
		String officerName = "Howard Cooper";
		String officerBadge = "THX1138";
		PoliceOfficer officer = new PoliceOfficer(officerName, officerBadge);
		officer.examineMeter(userCar, userMeter);
	}
}