public class ParkingMeter {
	private int parkTime; //the number of min of parking time that has been purchased
	
	//constructors
	public ParkingMeter(int time) {
		parkTime = time;
	}
	
	public ParkingMeter() {
		parkTime = 0;
	}
	
	//setters
	public void setParkTime(int time) {
		parkTime = time;
	}
	
	//getters
	public int getParkTime() {
		return parkTime;
	}	
}