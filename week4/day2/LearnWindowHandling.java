package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/Window.html");

		// to get the reference of the current window
		/*
		 * String firstWinRef = driver.getWindowHandle();
		 * System.out.println(firstWinRef);
		 * 
		 * System.out.println("********************************************");
		 */

		driver.findElementById("home").click();

		// It will print first window

		String title = driver.getTitle();

		System.out.println(title);

		Set<String> setOfHandles = driver.getWindowHandles();

		List<String> listOfHandles = new ArrayList<String>(setOfHandles);

		String secondWinRef = listOfHandles.get(1);

		driver.switchTo().window(secondWinRef);

		driver.close();
		

		// to go back to the first window
		String firstWinRef = listOfHandles.get(0);

		driver.switchTo().window(firstWinRef);

		String title1 = driver.getTitle();
		System.out.println(title1);

		/*
		 * for (String eachHandle : setOfHandles) {
		 * 
		 * System.out.println(eachHandle);
		 * 
		 * }
		 */

		// driver.quit();

	}

}
