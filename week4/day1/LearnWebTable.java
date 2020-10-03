package week4.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		// To setup the driver
		WebDriverManager.chromedriver().setup();

		// Code to open chrome browser
		ChromeDriver driver = new ChromeDriver();

		// to maximize the browser
		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/table.html");
		
		List<WebElement> rows = driver.findElementsByXPath("//table[@id='table_id']//tr");
		
		int rowsCount = rows.size();
		
		
		  List<WebElement> cells = driver.findElementsByXPath("//table[@id='table_id']//tr[2]/td");
		  
		  int cellCount = cells.size();
		 
		
		for (int i = 2; i <= rowsCount; i++) {
			
			//int cellCount = driver.findElementsByXPath("//table[@id='table_id']//tr["+i+"]/td").size();
			
			for (int j = 1; j <= cellCount; j++) {
				
				WebElement element = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]");
				String text = element.getText();
				System.out.print(text+" ");
			}
			
			System.out.println();
			
		}
		
		
		/*
		 * driver.findElementById("txtStationFrom").clear();
		 * driver.findElementById("txtStationFrom").sendKeys("ms");
		 * driver.findElementById("txtStationFrom").sendKeys(Keys.TAB);
		 */
		
		

	}

}
