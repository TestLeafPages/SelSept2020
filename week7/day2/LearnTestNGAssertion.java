package week7.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LearnTestNGAssertion {

	@Test
	public void leafTapsLogin() {
		
		String expectedTitle = "TestLeaf";
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();

		String actualTitle = driver.getTitle();

		
		  boolean crmsfaLink = driver.findElementByLinkText("CRM/SFA").isDisplayed();
		  
		  //soft assert
		  SoftAssert sa = new SoftAssert();
		  
		  // first Assertion 
		 // Assert.assertEquals(expectedTitle, actualTitle);
		  sa.assertEquals(expectedTitle, actualTitle);
		  	  
		  System.out.println("second Assertion starts here");
		  
		  // Second Assertion 
		 // Assert.assertTrue(crmsfaLink);
		  sa.assertTrue(crmsfaLink);
		  
		  
		  System.out.println("last line of code");
		  
		  
		  
		 

		
		/*
		 * if (actualTitle.equals("TestLeaf")) { System.out.println("matching"); }
		 */
		//its mandatory to have assertAll as last statement in the test case
		sa.assertAll();
	}

}
