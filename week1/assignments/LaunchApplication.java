package week1.assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		
		
		  //to set the path of the driver 
		  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		
		  // To setup the driver
		  WebDriverManager.chromedriver().setup();
		
		  //Code to open chrome browser 
		  ChromeDriver driver = new ChromeDriver();
		  
		  
		  //to maximize the browser
		  driver.manage().window().maximize();
		 
		  		  
		  //To load the application url
		  driver.get("http://leafground.com/pages/Image.html");
		  
		 Dimension size = driver.findElementByXPath("(//img)[3]").getSize();
		 
		 System.out.println(size);
		 
		 System.out.println(driver.findElementByXPath("//label[text()='Am I Broken Image?']").isEnabled());
		  
		 
		  
		  
		  
		  
		 	 
		
		
	

	}

}
