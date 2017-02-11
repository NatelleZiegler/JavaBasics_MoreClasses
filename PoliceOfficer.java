public class PoliceOfficer {
	private String name;
	private String badgeNumber;
	
	public PoliceOfficer(String nm, String badge) {
		name = nm;
		badgeNumber = badge;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBadgeNumber() {
		return badgeNumber;
	}
	
	public void examineMeter(ParkedCar car, ParkingMeter meter) {
		int purchasedTime = meter.getParkTime(); //number of minutes the car purchased at the meter
		int parkedTime = car.getMinutes(); //number of minutes the car has been parked
		boolean expired;
		int overTime = purchasedTime - parkedTime;
		if(overTime < 0) {
			expired = true;
		}
		else {
			expired = false;
		}
		
		if(expired) {
			ParkingTicket ticket = new ParkingTicket();
			ticket.reportInfo(car);
			ticket.reportFine(meter, car);
		}
		else {
			System.out.println("You have not been issued a ticket.");
		}
	}
}