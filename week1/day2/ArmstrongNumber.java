package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		
		int input = 153;
		
		int orgValue= input;
		
		int rem ;
		
		int calculated = 0;
			
		
		while(input > 0) {
			
			rem = input % 10; 
			
			calculated = calculated + (rem*rem*rem);
			
			input = input / 10; 
			
			
		}
		
		if (calculated == orgValue) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an armstrong number");
		}
		
	//	System.out.println(sum);
		
		
		
		
		

	}

}
