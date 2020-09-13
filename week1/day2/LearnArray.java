package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {

		int[] values = new int[3];

		values[0] = 25;
		values[1] = 20;
		values[2] = 15;
		
		
		//to sort the array
		Arrays.sort(values);
		
	
		
		for (int i = values.length-1; i >=0 ; i--) {
			
			System.out.println(values[i]);
			
		}
		
		
		
		

		/*
		 * int[] values = {10,20,30,40,50,56,25,78,89};
		 * 
		 * int arraySize = values.length;
		 * 
		 * System.out.println(arraySize);
		 */

		//System.out.println(values[3]);

		// System.out.println(values[0]);

		// last index as sizeofArray - 1

	}

}
