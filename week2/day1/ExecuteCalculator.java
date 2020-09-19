package week2.day1;


//packageName.ClassName
import week1.day2.Calculator;




public class ExecuteCalculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int add = calc.add(10, 20);
		System.out.println(add);
		
		int sub = calc.sub(30, 20);
		System.out.println(sub);
		
		double mult = calc.mult(45.53, 25.78);
		System.out.println(mult);

	}

}
