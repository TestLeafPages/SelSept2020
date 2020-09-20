package week2.day2;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnVerificationMethods {

	public static void main(String[] args) throws InterruptedException {
		
			
		  // To setup the driver
		  WebDriverManager.chromedriver().setup();
		
		  //Code to open chrome browser 
		  ChromeDriver driver = new ChromeDriver();
		  
		  
		  //to maximize the browser
		  driver.manage().window().maximize();
		 
		  		  
		  //To load the application url
		  driver.get("http://leaftaps.com/opentaps/control/main");
		  
		  //Browser verification methods
		  
		/*
		 * String title = driver.getTitle();
		 * 
		 * System.out.println(title);
		 * 
		 * String currentUrl = driver.getCurrentUrl();
		 * 
		 * System.out.println(currentUrl);
		 * 
		 * String pageSource = driver.getPageSource(); System.out.println(pageSource);
		 * 
		 */
		  
		/*
		 * String text = driver.findElementByTagName("h2").getText();
		 * 
		 * System.out.println(text);
		 * 
		 * String attribute = driver.findElementById("username").getAttribute("name");
		 * 
		 * System.out.println(attribute);
		 * 
		 * Dimension xyz = driver.findElementByClassName("decorativeSubmit").getSize();
		 * 
		 * System.out.println(xyz);
		 * 
		 * xyz.getWidth(); xyz.getHeight();
		 * 
		 * 
		 * Point location =
		 * driver.findElementByClassName("decorativeSubmit").getLocation();
		 * 
		 * System.out.println(location);
		 * 
		 * location.getX(); location.getY();
		 */
		 
		  boolean enabled = driver.findElementByClassName("decorativeSubmit").isEnabled();
		 
		 if(enabled == true) {
			 System.out.println("element is enabled");
		 }
		 else {
			 System.out.println("element is not enabled");
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		  
		  
		 		  
		 
		  
		  
		  
		  
		 	 
		
		
	

	}

}
