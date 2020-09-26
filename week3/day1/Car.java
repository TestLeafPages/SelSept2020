package week3.day1;

public class Car extends Vehicle  {

	public void switchOnAc() {
		System.out.println("switch on AC");

	}

	public static void main(String[] args) {

		/*
		 * Car myCar = new Car();
		 * 
		 * myCar.applyBrake(); myCar.soundHorn(); myCar.switchOnAc();
		 */

		
		  Vehicle veh = new Vehicle();
		  
		  veh.applyBrake(); 
		  veh.soundHorn();
		 

	}

}
