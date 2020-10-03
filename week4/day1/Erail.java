package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {

		// To setup the driver
		WebDriverManager.chromedriver().setup();

		// Code to open chrome browser
		ChromeDriver driver = new ChromeDriver();

		// to maximize the browser
		driver.manage().window().maximize();

		
		driver.get("https://erail.in/");

		//to type From station
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("ms");
		driver.findElementById("txtStationFrom").sendKeys(Keys.TAB);
		
		//to type To station
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("mdu");
		driver.findElementById("txtStationTo").sendKeys(Keys.TAB);
		
		
		//to uncheck sort on date
		driver.findElementById("chkSelectDateOnly").click();
		
		//to wait for the table to load
		Thread.sleep(2000);
		
		int rowsCount = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr").size();
		
		
		List<String> listTrainNames = new ArrayList<String>();
		
		
		for (int i = 1; i <= rowsCount; i++) {
			
			String text = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]/a").getText();
			//System.out.println(text);
			listTrainNames.add(text);
			
		}
		
		
		int listSize = listTrainNames.size();
		
		
		Set<String> setTrainNames = new HashSet<String>(listTrainNames);
		
		
		int setSize = setTrainNames.size();
		
		if(listSize == setSize) {
			System.out.println("no duplicates");
		}else {
			System.out.println("duplicates are available");
		}
		
		

	}

}
