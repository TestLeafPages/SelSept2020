package week1.day1;

public class Car {
	
	String carColor = "Red";
	int numWheels = 4;
	boolean isPuncture = false;
	double carPriceinLakhs = 7.50;
	char fuelType = 'P';
	
		
	//accessSpecifier returnType methodName(){}
	public void driveCar() { 
		
		int numOfDrivers = 2;
		
		System.out.println("drive a car");
		System.out.println(numOfDrivers);

	}
	
		
	public static void main(String[] args) {
		
		//ClassName objectName = new ClassName() - constructor
		
		Car myCar = new Car();
		
		//call the method using object
		myCar.driveCar();
		
		myCar.applyBrake();
		
		
		//System.out.println(myCar.carPriceinLakhs);
		
		double price = myCar.carPriceinLakhs;
		
		System.out.println(price);
		
		
		
		
			
	}
	
	public void applyBrake() {
		System.out.println("brake applied");
		System.out.println(fuelType);
		driveCar();

	}
	
	
	

}
