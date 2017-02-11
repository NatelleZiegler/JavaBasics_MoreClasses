public class ParkingTicket {
	public void reportInfo(ParkedCar badCar) {
		String make, model, color, licesne;
		make = badCar.getMake();
		model = badCar.getModel();
		color = badCar.getColor();
		licesne = badCar.getLicense();
		System.out.println("Information on illegally parked car: ");
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("License: " + licesne);
	}
	
	public void reportFine(ParkingMeter meter, ParkedCar car) {
		int purchasedTime; //number of minutes purchased
		int parkedTime; //number of minutes car has been parked
		double fine;
		purchasedTime = meter.getParkTime();
		parkedTime = car.getMinutes();
		double overTime;
		overTime = purchasedTime - parkedTime;
		if(overTime < 0) {
			overTime *= -1;
			if(overTime > 60) {
				overTime -= 60; //subtract 60 minutes
				fine = ((overTime / 60) * 10.00) + 25.00;
			}
			else {
				fine = 25.00;
			}
		}
		else {
			fine = 0;
		}
		System.out.printf("Your fine is $%.2f.", fine);
		System.out.println(); //print out a new line for readability
	}
	
	public void reportPoliceInfo(PoliceOfficer officer) {
		String name;
		String badgeNum;
		name = officer.getName();
		badgeNum = officer.getBadgeNumber();
		System.out.println("Information on police officer issuing ticket: ");
		System.out.println("Name: " + name);
		System.out.println("Badge number: " + badgeNum);
	}
}