package week2.day2;

import java.util.List;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {

		// To setup the driver
		WebDriverManager.chromedriver().setup();

		// Code to open chrome browser
		ChromeDriver driver = new ChromeDriver();

		// to maximize the browser
		driver.manage().window().maximize();

		// To load the application url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementByXPath("//input").sendKeys("demosalesmanager");

		
	}

}
