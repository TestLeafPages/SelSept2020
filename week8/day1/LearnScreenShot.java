package week8.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScreenShot {

	public static void main(String[] args) throws IOException {
		  WebDriverManager.chromedriver().setup();
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://leaftaps.com/opentaps/control/main");
		  
		  WebElement userName = driver.findElementById("username");
		  
		  userName.sendKeys("Demosalesmanager");
		  
		  File source = userName.getScreenshotAs(OutputType.FILE);
		  
		  
		  //target to save the screenshot
		  File target = new File("./snapshot/username.png");
		  
		  //to capture the screenshot as file
		 // File source = driver.getScreenshotAs(OutputType.FILE);
		  	 
		
		  //to paste the source into target
		  FileUtils.copyFile(source, target);

	}

}
