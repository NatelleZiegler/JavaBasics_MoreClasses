//this class will simulate a fuel gauge
public class FuelGage {
	private int numFuel; //the car's current amount of fuel in gallons
	
	//constructor
	public FuelGage(int fuel) {
		numFuel = fuel;
	}
	
	public FuelGage() {
		numFuel = 0;
	}
	
	//returns the car's current amount of fuel, in gallons
	public int getFuel() {
		return numFuel;
	}
	
	public void setFuel(int fuel) {
		numFuel = fuel;
	}
	
	//increments amount fuel by one gallon
	public void fuelCar() {
		if(numFuel < 15) {
			numFuel++;
		}
	}
	
	//decrements fuel by one gallon
	public void burnFuel() {
		if(numFuel > 0) {
			numFuel--;
		}
	}
}