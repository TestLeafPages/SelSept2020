package testcase;

import org.testng.annotations.Test;

import base.PreandPost;

public class CreateLead extends PreandPost{

	@Test
	public void createLead() {
		
		//@Test
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		driver.findElementByName("submitButton").click();
		
	
	}
	
	
}






