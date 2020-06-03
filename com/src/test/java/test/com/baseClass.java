package test.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@Listeners(test.com.listenersTestNg.class)
public class baseClass {
	static WebDriver driver;
	static ExtentTest test;
	static ExtentReports report;

	@BeforeClass
	public void reportDetails() {
		report = new ExtentReports(".\\executionReports\\sampleReport.html");
		test = report.startTest("Demo Test execution");
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void endTest() {
		report.endTest(test);
		report.flush();
	}
}
