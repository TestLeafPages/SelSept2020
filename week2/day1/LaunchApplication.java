package week2.day1;

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
		  driver.get("https://www.amazon.in/");
		  
		 //Java wait	  
		  Thread.sleep(2000);
		  
		  //to close the current browser
		  driver.close();
		  
		  
		 
		  
		  
		  
		  
		 	 
		
		
	

	}

}
