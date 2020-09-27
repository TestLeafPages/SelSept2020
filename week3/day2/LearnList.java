package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		List<String> values = new ArrayList<String>();

		// method to add values into List
		values.add("Hari"); // index of the first item is 0
		values.add("Naveen");
		values.add("Sam");
		values.add("Dhivya");
		values.add("Naveen");
		values.add("Bowya"); // index of the last item is size()-1

		// remove using index
		// values.remove(-3);
		int count;
		
		count = values.size();
		System.out.println(count);
		
		List<String> newValues = new ArrayList<String>(values);

		values.remove("Sam");

		// to get the number of items
		count = values.size();
		System.out.println(count);

		// newValues.addAll(values);

		/*
		 * 
		 * Collections.sort(newValues); Collections.reverse(newValues);
		 * 
		 * 
		 * //System.out.println(newValues);
		 * 
		 * 
		 * 
		 * 
		 * // to get single item from list System.out.println(values);
		 * 
		 * //all the matching items will be ratained //newValues.retainAll(values);
		 * 
		 * //remove all the matching items // newValues.removeAll(values);
		 * 
		 * 
		 * 
		 * 
		 * for (int i = count-1; i >= 0 ; i--) {
		 * 
		 * System.out.println(values.get(i));
		 * 
		 * }
		 * 
		 * 
		 * // for (dataType tempVariable : sourceVariable) {}
		 * 
		 * 
		 * for (String eachValue : values) {
		 * 
		 * if(eachValue.equals("Naveen")) { values.remove("Naveen"); }
		 * 
		 * }
		 * 
		 * 
		 * for (String eachVal : newValues) {
		 * 
		 * System.out.println(eachVal);
		 * 
		 * }
		 */
	}

}
