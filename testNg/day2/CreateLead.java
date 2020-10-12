package testcase;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.PreandPost;

public class CreateLead extends PreandPost{

	@DataProvider(name = "Lead")
	public String[][] getData() { 
		//						Row  ColumnnData
		String[][] data = new String[3][3];
		//Row 1
				data[0][0] = "TestLeaf";
				data[0][1] = "Gopi";
				data[0][2] = "J";
		//Row 2
				data[1][0] = "TestLeaf";
				data[1][1] = "Babu";
				data[1][2] = "M";
		//Row 3
				data[2][0] = "TestLeaf";
				data[2][1] = "Sarath";
				data[2][2] = "M";
		return data;
	}
	
	//	@Test(invocationCount = 2, threadPoolSize = 2)
	@Test(dataProvider = "Lead")
	public void createLead(String cName,String fName, String lName,Object i) {

		//@Test
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();
		new Select(driver.findElementByClassName("")).selectByIndex((int)i);
	}

}






