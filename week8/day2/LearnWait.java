package week8.day2;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		  driver.get("http://leafground.com/pages/TextChange.html");
		  
		  WebElement element = driver.findElementById("btn");
		  
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		  
		  wait.until(ExpectedConditions.textToBePresentInElement(element, "Click ME!"));
		  
		  element.click();
		  
		  
		 // WebElement eleDisapper =
		 // driver.findElementByXPath("//*[contains(text(),'looking at me')]");
		/*
		 * WebElement eleDisapper = driver.findElementByTagName("h1");
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 * 
		 * wait.until(ExpectedConditions.invisibilityOf(eleDisapper));
		 * 
		 * String text = driver.findElementByTagName("strong").getText();
		 * System.out.println(text);
		 */
		
		/*
		 * driver.get("http://leafground.com/pages/appear.html");
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 * 
		 * String text = wait.until(ExpectedConditions.visibilityOf(driver.
		 * findElementByXPath("//b[contains(text(),'here Guys')]"))).getText();
		 * 
		 * System.out.println(text);
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
