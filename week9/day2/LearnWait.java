package week9.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		//System.out.println(System.getProperty("webdriver.chrome.driver"));
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/disapper.html");
		
		
		WebElement eleDisappear = driver.findElementByXPath("//*[contains(text(),'Keep looking')]");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOf(eleDisappear));
		
		//String text = wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//b[contains(text(),'here Guys')]"))).getText();
		
		String text2 = driver.findElementByTagName("strong").getText();
		
		System.out.println(text2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		/*
		 * driver.findElementById("username").sendKeys("demosalesmanager");
		 * 
		 * driver.findElementById("password").sendKeys("crmsfa");
		 */
	}

}
