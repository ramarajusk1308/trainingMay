package test.com;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test7_assertions {
	static WebDriver driver = null;

	@Test
	public static void test1() {
		// SoftAssert - if assertion failed, test continues
		// Assert- Hard Assert - if assertion failed, test fails
		System.out.println("test1");
		// String userEmail = "ramaraju.kkt@gmail.com";
		// Account creation
		// driver.findElement(By.id("")).sendKeys(userEmail);

		// After submitting, verify text
		// String getUserEmail = driver.findElement(By.id("")).getText(); //
		// ramaraju.kkt@gmail.com

		// Assert.assertEquals(fname, fname);
		// Assert.assertEquals(userEmail,getUserEmail);

		/*
		 * driver.findElement(By.id("")).click(); String pageTile
		 * =driver.getTitle(); Assert.assertEquals(pageTile, "Contact Us");
		 */

		// Assert.assertEquals("Nokia", "Samsung");
		// Assert.assertEquals("Nokia", "Nokia");
		// boolean flag = true;
		boolean flag = false;
		Assert.assertFalse(flag);
		Assert.assertTrue(false);
		// Assert.assertTrue(true);
		System.out.println("assertion passed");
	}
}
