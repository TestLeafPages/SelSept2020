package week8.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LearnExceptionHandling {
	
	public int divide(int num1 , int num2) {
		
		int result;
		
		if(num2 > num1) {
			throw new ArithmeticException("wrong input: give first number as greater and second number as smaller");
		}
		else {
			result = num1/num2;
		}
		
		
		return result;

	}
	
	public static void fileHandling() throws Exception {
		
			FileInputStream fis = new FileInputStream("./data/test.xlsx");
		
	}
	

	public static void main(String[] args) throws Exception {
			
		try {
		fileHandling();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		/*
		 * LearnExceptionHandling leh = new LearnExceptionHandling();
		 * 
		 * int divide = leh.divide(10, 15);
		 * 
		 * System.out.println(divide);
		 */
		

		/*
		 * int num1 = 10;
		 * 
		 * int num2 = 5;
		 * 
		 * int result;
		 * 
		 * int[] values = { 10, 20, 30 };
		 * 
		 * try { result = num1 / num2; System.out.println(result);
		 * 
		 * try { System.out.println(values[3]); } catch (Exception e) {
		 * System.out.println(e); }
		 * 
		 * } catch (ArithmeticException e) { System.out.println(e); } catch (Exception
		 * e) { System.out.println(e); } finally {
		 * System.out.println("always getting executed"); }
		 */
		System.out.println("End of program");

	}

}
