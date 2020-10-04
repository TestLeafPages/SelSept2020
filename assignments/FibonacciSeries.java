package week1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//0,1,1,2,3,5,8,13
		
		int n1 = 0; //1
		int n2 = 1; //1
		int n3;
		
		System.out.print(n1+",");
		System.out.print(n2);
		//3,4,5,6,7,8
		for (int i = 3; i <= 8; i++) {
			
			n3 = n1+n2;
			System.out.print(","+n3);
			
			n1 = n2;
			n2 = n3;
			
			
		}

	}

}
