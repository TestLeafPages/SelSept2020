package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

		Set<String> values = new LinkedHashSet<String>();

		// method to add values into List
		values.add("Hari"); // index of the first item is 0
		values.add("Naveen");
		values.add("Sam");
		values.add("Dhivya");
		values.add("Naveen");
		values.add("Bowya"); // index of the last item is size()-1
		
		List<String> listValues = new ArrayList<String>(values);
		
		System.out.println(listValues.get(2));
		
		/*
		 * for (String eachValue : values) {
		 * 
		 * System.out.println(eachValue);
		 * 
		 * }
		 */

	
	}

}
