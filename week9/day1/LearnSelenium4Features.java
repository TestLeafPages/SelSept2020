package week9.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium4Features {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//to minimize the window
	//	driver.manage().window().minimize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("Demosalesmanager");
		
		/*
		 * //driver.findElement(RelativeLocator.withTagName("input").toRightOf(By.xpath(
		 * "//label[text()='Username']"))).sendKeys("demosalesmanager"); String text =
		 * driver.findElement(RelativeLocator.withTagName("label").toLeftOf(By.id(
		 * "username"))).getText();
		 * 
		 * System.out.println(text);
		 * 
		 * //toRightOf //toLeftOf //below //above //near
		 * 
		 * //switchTo() to new window directly
		 * //driver.switchTo().newWindow(WindowType.TAB).get("https://www.google.com/");
		 * //System.out.println(driver.getTitle());
		 */

	}

}
