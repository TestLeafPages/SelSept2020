package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFindElements {

	public static void main(String[] args) {
		// To setup the driver
				WebDriverManager.chromedriver().setup();

				// Code to open chrome browser
				ChromeDriver driver = new ChromeDriver();

				// to maximize the browser
				driver.manage().window().maximize();
				
				driver.get("http://leafground.com/pages/Link.html");
				
				//System.out.println(driver.findElementsByTagName("a").size());
				
				List<WebElement> links = driver.findElementsByXPath("//a");
				
				for (WebElement eachLink : links) {
					
					if(eachLink.getText().contains("broken")) {
						eachLink.click();
						break;
					}
					
				}
				
		/*
		 * WebElement secondElement = links.get(1);
		 * 
		 * String text = secondElement.getText();
		 * 
		 * System.out.println(text);
		 */
				
		/*
		 * for (WebElement eachLink : links) {
		 * 
		 * System.out.println(eachLink.getAttribute("href"));
		 * 
		 * //to get the visible text // eachLink.getText();
		 * 
		 * }
		 */

		/*
		 * // To load the application url
		 * driver.get("http://leaftaps.com/opentaps/control/main");
		 * 
		 * //driver.findElementByXPath("//input").sendKeys("demosalesmanager");
		 * 
		 * //driver.findElementByTagName("input").sendKeys("demosalesmanager");
		 * 
		 * //List<WebElement> input = driver.findElementsByTagName("input");
		 * 
		 * List<WebElement> inputLogin = driver.findElementsByClassName("inputLogin");
		 * 
		 * //System.out.println(input.size());
		 * 
		 * for(WebElement eachElement : inputLogin) {
		 * 
		 * String idValue = eachElement.getAttribute("id"); System.out.println(idValue);
		 * }
		 * 
		 */
				
				
	}

}
