package week1.assignments;

public class ICICICustomer {

	public static void main(String[] args) {
		ICICIBank ib  = new ICICIBank();
		
		ib.setPin(1234);
		
		int pin = ib.getPin();
		
		System.out.println(pin);

	}

}
