package testcase;

import org.testng.annotations.Test;

public class LearnPriority2  extends  LearnPriority{

	@Test(priority = 6)   //-> 1
	public void cl2() {
		System.out.println("CreateLead");
	}
	
	@Test(priority = 5) // -> 3
	public void el2() {
		System.out.println("EditLead");
	}
	
	@Test(priority = 4)// -> 2
	public void ml2() {
		System.out.println("MergeLead");
	}


}
