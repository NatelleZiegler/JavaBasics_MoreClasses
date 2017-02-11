public class CarSim {
	public static void main(String[] args) {
		FuelGage fuel = new FuelGage();
		Odometer mileage = new Odometer();
		
		//fill up the car with gas
		fuel.setFuel(15);
		int amountFuel;
		System.out.println("Gas\t\t\tMiles");
		
		do {
			mileage.goMile();
			if((mileage.getMiles() % 24) == 0) {
				fuel.burnFuel();
			}
			amountFuel = fuel.getFuel();
			System.out.print(fuel.getFuel());
			System.out.print("\t\t\t");
			System.out.print(mileage.getMiles());
			System.out.println();
		} while(amountFuel != 0);
	}
}