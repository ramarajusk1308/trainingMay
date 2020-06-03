package test.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class listeners_test3 extends baseClass {

	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String text = driver.getTitle();
		Assert.assertEquals("Test1", "Test1");
		test.log(LogStatus.PASS, "Validating test1 string");
		Assert.assertEquals(text, "Google");
		test.log(LogStatus.PASS, "Validating Google homepage");
		driver.quit();
	}

}
