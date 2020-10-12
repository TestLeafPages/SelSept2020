package testcase;

import org.testng.annotations.Test;

import base.PreandPost;

public class DuplicateLead extends PreandPost{
//PackageName.ClassName.MethodName
	//@Test(dependsOnMethods = {"testcase.CreateLead.createLead","testcase.CreateLead.EditLead"})
	@Test(dependsOnMethods = {"testcase.CreateLead.createLead"}, alwaysRun = true)
	public void duplicateLead() throws InterruptedException {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementByName("submitButton").click();
		
	}
}






