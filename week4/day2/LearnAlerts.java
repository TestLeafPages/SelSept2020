package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/Alert.html");
		
		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		
		//to switch my control to alert
	//	Alert alert = driver.switchTo().alert();
		
		/*
		 * String text = alert.getText(); System.out.println(text);
		 */
		
		//alert.sendKeys("TestLeaf software solutions Pvt Ltd");
		
		//Thread.sleep(2000);
		
		
		//to click Ok button in the alert
		//alert.accept();
		
		//to click on Cancel button
		//alert.dismiss();
		
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		
		driver.switchTo().alert().accept();
		
	

	}

}
