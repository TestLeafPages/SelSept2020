package week2.day2;

import java.util.List;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelectClass {

	public static void main(String[] args) throws InterruptedException {

		// To setup the driver
		WebDriverManager.chromedriver().setup();

		// Code to open chrome browser
		ChromeDriver driver = new ChromeDriver();

		// to maximize the browser
		driver.manage().window().maximize();

		// To load the application url
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement multiSelect = driver.findElementByXPath("(//select)[6]");
		
		Select dd = new Select(multiSelect);
		
		dd.selectByVisibleText("Selenium");
		dd.selectByVisibleText("Appium");
		
		Thread.sleep(2000);
		dd.deselectByVisibleText("Selenium");
		
		
		
		/*
		 * // Enter username WebElement username = driver.findElementById("username");
		 * 
		 * // to type the text in the username fields
		 * username.sendKeys("demosalesmanager");
		 * 
		 * // to type the password //
		 * driver.findElementById("password").sendKeys("crmsfa");
		 * 
		 * driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		 * 
		 * driver.findElementByClassName("decorativeSubmit").click();
		 * 
		 * // code to click on CRM/SFA link
		 * 
		 * driver.findElementByLinkText("CRM/SFA").click();
		 * 
		 * // driver.findElementByPartialLinkText("SFA").click();
		 * 
		 * // to click on Lead tab driver.findElementByLinkText("Leads").click();
		 * 
		 * // to click the Create Lead link on the leftpanel
		 * driver.findElementByLinkText("Create Lead").click();
		 * 
		 * // To select a value from dropDown
		 * 
		 * // Select using sendKeys method //
		 * driver.findElementById("createLeadForm_dataSourceId").sendKeys("Conference");
		 * 
		 * WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		 * 
		 * Select dd = new Select(source);
		 * 
		 * // selectByVisibleText ; selectByValue ; selectByIndex
		 * 
		 * // dd.selectByIndex(1);
		 * 
		 * // select last item from the dropDown
		 * 
		 * List<WebElement> options = dd.getOptions();
		 * 
		 * int size = options.size();
		 * 
		 * options.get(size-2).click();
		 */
		/*
		 * for (int i = 1; i < options.size()-1; i++) {
		 * 
		 * String text = options.get(i).getText(); System.out.println(text);
		 * 
		 * 
		 * 
		 * options.get(i).click(); Thread.sleep(1000);
		 * 
		 * }
		 */

		// WebElement oneElement = options.get(1);

		// oneElement.click();

		/*
		 * WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		 * 
		 * Select dropDown = new Select(source);
		 * 
		 * //select using visible text // dropDown.selectByVisibleText("Employee");
		 * 
		 * // dropDown.selectByValue("LEAD_CONFERENCE");
		 * 
		 * dropDown.selectByIndex(1);
		 * 
		 * // to get all the sun elements into a single variable List<WebElement>
		 * options = dropDown.getOptions();
		 * 
		 * int size = options.size(); //13 last index 12
		 * 
		 * 
		 * dropDown.selectByIndex(size-2);
		 */

		WebElement marketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");

		Select dropDown1 = new Select(marketingCampaign);

		dropDown1.selectByVisibleText("Car and Driver");

	}

}
