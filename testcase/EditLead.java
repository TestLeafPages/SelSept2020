package testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends BaseClass{
	
	
	@BeforeTest
	public void setFileName() {
		excelFileName = "EditLead";

	}
	

	@Test(dataProvider = "fetchData")
	public void runEditLead(String PhNo, String company) throws InterruptedException {
		
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(PhNo);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").sendKeys(company);
		driver.findElementByName("submitButton").click();
		
}
	/*
	 * @DataProvider(name = "fetchData") public String[][] sendData() throws
	 * IOException { ReadExcelData red = new ReadExcelData(); String[][] data =
	 * red.readExcel("EditLead");
	 * 
	 * return data; }
	 */

}






