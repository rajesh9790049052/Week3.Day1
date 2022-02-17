package week3.day1;

public class MyVehicle {
	
	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		Audi audi = new Audi();
		
		vehicle.applyBrake();
		vehicle.soundHorn();
		car.openDoor();
		car.applyBrake();
		car.soundHorn();
		audi.autoPark();
		audi.soundHorn();
		audi.openDoor();
		audi.applyBrake();
		
			
	}

}	
