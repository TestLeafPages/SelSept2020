package week4.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAdvanceUserInteractions {

	public static void main(String[] args) throws InterruptedException {
		// To setup the driver
				WebDriverManager.chromedriver().setup();

				// Code to open chrome browser
				ChromeDriver driver = new ChromeDriver();

				// to maximize the browser
				driver.manage().window().maximize();
				
				
				driver.get("http://leafground.com/pages/selectable.html");
				
				// to get into frame
				driver.switchTo().frame(0);
				
				
				WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
				
				WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
		/*
		 * WebElement source = driver.findElementById("draggable");
		 * 
		 * WebElement target = driver.findElementById("droppable");
		 */
				
				
			//	WebElement selenium = driver.findElementByXPath("//option[text()='Select your programs']/following::option[text()='Selenium']");

			//	WebElement appium = driver.findElementByXPath("//option[text()='Select your programs']/following::option[text()='Appium']");
		
				
				
				
				
				/*
		 * driver.get("https://www.myntra.com/");
		 * 
		 * //WebElement men = driver.findElementByLinkText("Men");
		 * 
		 * WebElement men = driver.findElementByXPath("//a[text()='Men']");
		 */
				
				//Thread.sleep(3000);
				
				Actions builder = new Actions(driver);
				builder.clickAndHold(item1).moveToElement(item4).release().perform();
				
				//builder.dragAndDrop(source, target).perform();
				
				//builder.keyDown(Keys.CONTROL).click(selenium).click(appium).keyUp(Keys.CONTROL).perform();
				
				//builder.moveToElement(men).perform();
				
				//builder.contextClick(men).perform();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	}

}
