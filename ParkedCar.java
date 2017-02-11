public class ParkedCar {
	private String make; //the car's make
	private String model; //the car's model
	private String color; //the car's color
	private String license; //the car's license number
	private int numMinutes; //the number of minutes the car has been parked
	
	public ParkedCar() {
		make = "";
		model = "";
		color = "";
		license = "";
		numMinutes = 0;
	}
	
	//setters
	public void setMake(String carMake) {
		make = carMake;
	}
	
	public void setModel(String carModel) {
		model = carModel;
	}
	
	public void setColor(String carColor) {
		color = carColor;
	}
	
	public void setLicense(String carLicense) {
		license = carLicense;
	}
	
	public void setMinutes(int min) {
		numMinutes = min;
	}
	
	//getters
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getLicense() {
		return license;
	}
	
	public int getMinutes() {
		return numMinutes;
	}
}