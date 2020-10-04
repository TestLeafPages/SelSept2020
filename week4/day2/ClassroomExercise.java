package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassroomExercise {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		
		//to disbale the browser notifications
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(option);

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Hari");
		alert.accept();
		
		String text = driver.findElementById("demo").getText();
		
		if(text.contains("Hari")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}

	}

}
