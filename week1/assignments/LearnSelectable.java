package week1.assignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelectable {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/selectable/");

		// to get into frame
		driver.switchTo().frame(0);

		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");

		WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");

		WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");

		WebElement item7 = driver.findElementByXPath("//li[text()='Item 7']");

		
		Actions builder = new Actions(driver);

		builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).click(item7).keyUp(Keys.CONTROL).perform();

	}

}
