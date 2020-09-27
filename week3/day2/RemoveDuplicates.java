package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String[] companies = {"TCS","Wipro","Infosys","FIS","TCS","Wipro"};
		
		//declare empty list
		Set<String> values = new LinkedHashSet<String>();
		
		for (String eachData : companies) {
			values.add(eachData);
			
		}
		
		System.out.println(values);
			
		
		for (String eachValue : values) {
			
			System.out.println(eachValue);
			
		}
		

	}

}
