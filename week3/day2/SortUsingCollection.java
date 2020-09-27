package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
		String[] companies = {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		
		//declare empty list
		List<String> values = new ArrayList<String>();
		
		for (String eachData : companies) {
			values.add(eachData);
			
		}
		
		System.out.println(values);
		
		Collections.sort(values);
		
		for (String eachValue : values) {
			
			System.out.println(eachValue);
			
		}
		

	}

}
