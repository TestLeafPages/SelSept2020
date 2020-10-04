package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		
		
		  driver.get("http://leafground.com/pages/frame.html");
		  
		  //getting inside the outer frame driver.switchTo().frame(1);
		  
		  //getting inside the inner frame (Nested frame)
		 // driver.switchTo().frame("frame2");
		  
		  driver.switchTo().frame(0);
		  
		  driver.findElementById("Click").click();
		  
		  //to get into the main dom / html page
		  driver.switchTo().defaultContent();
		  
		  String text = driver.findElementByTagName("h1").getText();
		  
		  System.out.println(text);
		  
		  
		  //to go to the immediate parent frame
		  driver.switchTo().parentFrame();
		  
		  driver.switchTo().parentFrame();
		  
		  driver.switchTo().parentFrame();
		 
		

		
		//ServiceNow application code
		/*
		 * driver.get("https://dev68594.service-now.com/");
		 * 
		 * 
		 * // WebElement elementFrame = driver.findElementById("gsft_main");
		 * 
		 * 
		 * //Switch to frame using id / name
		 * 
		 * driver.switchTo().frame("gsft_main123");
		 * 
		 * 
		 * //Switch to frame using Webelement //driver.switchTo().frame(elementFrame);
		 * 
		 * //switch to frame using index driver.switchTo().frame(0);
		 * 
		 * 
		 * driver.findElementById("user_name").sendKeys("admin");
		 * 
		 * 
		 */

	}

}
