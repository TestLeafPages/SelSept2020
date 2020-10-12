package testcase;

import org.testng.annotations.Test;

public class LearnPriority {

	@Test//(priority = 0)   //-> 1
	public void createLead() {
		System.out.println("CreateLead");
	}
	
	@Test//(priority = -2) // -> 3
	public void editLead() {
		System.out.println("EditLead");
	}
	
	@Test//(priority = 2)// -> 2
	public void mergeLead() {
		System.out.println("MergeLead");
	}


}
