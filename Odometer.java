//this class simulates a car's odometer
public class Odometer {
	private double numMiles; //the car's current mileage
	
	public Odometer(double miles) {
		numMiles = miles;
	}
	
	public Odometer() {
		numMiles = 0;
	}
	
	public void setMiles(double miles) {
		numMiles = miles;
	}
	
	public double getMiles() {
		return numMiles;
	}
	
	public void goMile() {
		if(numMiles == 999999) {
			numMiles = 0;
		}
		else {
			numMiles++;
		}
	}
}