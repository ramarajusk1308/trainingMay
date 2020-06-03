package test.com;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class listeners_test extends baseClass {

	@Test
	public void test1() throws InterruptedException {
		driver.get("https://www.google.com");
		String text = driver.getTitle();
		Assert.assertEquals("Test1", "Test1");
		test.log(LogStatus.PASS, "Validating test1 string");
		Assert.assertEquals(text, "Welcome");
		test.log(LogStatus.PASS, "Validating Google homepage");
	}
}
