package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		
		// to create the physical html report
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./ExtentReports/result.html");
		
		//to maintain the history
		reporter.setAppendExisting(true);
		
		// to get the actual report
		ExtentReports extent = new ExtentReports();
		
		//to integrate the physical file to the actual report
		extent.attachReporter(reporter);
		
		//to create a test case with test case details
		ExtentTest testcase1 = extent.createTest("LoginAndLogout", "LeafTaps login and logout");
		testcase1.assignAuthor("Hari");
		testcase1.assignCategory("Smoke");
		
		
		//step level status
		testcase1.pass("Username demosalesmanager entered successfully", MediaEntityBuilder.createScreenCaptureFromPath(".././snapshot/username.png").build());
		//testcase1.pass("Username demosalesmanager entered successfully");
		testcase1.pass("password crmsfa entered successfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snapshot/leaftaps.png").build());
		testcase1.pass("login button clicked successfully");
		//testcase1.fail("login button not clicked successfully");
		
		//to have all the information in report
		extent.flush();
		
	}

}
