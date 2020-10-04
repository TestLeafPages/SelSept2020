package week1.assignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
				WebDriverManager.chromedriver().setup();

				ChromeDriver driver = new ChromeDriver();

				driver.manage().window().maximize();
				
				
				driver.get("https://jqueryui.com/droppable/");
				
				// to get into frame
				driver.switchTo().frame(0);
				
				
				WebElement source = driver.findElementById("draggable");
				
				WebElement target = driver.findElementById("droppable");
				
				
				Actions builder = new Actions(driver);
				
				builder.dragAndDrop(source,target).perform();
		
				
				
				
				
				
				

	}

}
