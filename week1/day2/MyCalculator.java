package week1.day2;

public class MyCalculator {
	
	
	public int divide(int a, int b) {

		return a/b;

	}
	
	

	public static void main(String[] args) {
	
	Calculator calc = new Calculator();
		
		int add = calc.add(10, 20);
		System.out.println(add);
		
		int sub = calc.sub(30, 20);
		System.out.println(sub);
		
		double mult = calc.mult(45.53, 25.78);
		System.out.println(mult);
		
		MyCalculator mc = new MyCalculator();
		
		int divide = mc.divide(20, 10);
		System.out.println(divide);
		

	}

}
