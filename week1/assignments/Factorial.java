package week1.assignments;

public class Factorial {

	public static void main(String[] args) {
		int input = 10;
		
		int fact = 1 ;
		
		for (int i = 1; i <= input; i++) {
			
			fact = fact * i ;  
			
		}
		
		
		System.out.println(fact);
	

	}

}
