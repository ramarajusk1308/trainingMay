package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test_dataProvider {
	WebDriver driver = null;

	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(dataProvider = "dataprovider1")
	public void test1(String user, String pwd, String xyz) throws InterruptedException {
		System.out.println(user + " - " + pwd + " - " + xyz);
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("passwd")).sendKeys(pwd);
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//div[@class='alert alert-danger']/ol/li")).getText();
		System.out.println("Error " + text);
		Assert.assertEquals(text, "Welcome"); // Valid username/pwd, sucessful
												// login, welcome text display
	}

	@Test(dataProvider = "dataprovider1")
	public void test2(String user, String pwd, String xyz) throws InterruptedException {
		System.out.println(user + " - " + pwd + " - " + xyz);
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("passwd")).sendKeys(pwd);
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//div[@class='alert alert-danger']/ol/li")).getText();
		System.out.println("Error " + text);
		Assert.assertEquals(text, "Invalid email address."); // All invalid
																// login, error should display
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@DataProvider(name = "dataprovider1")
	public Object[][] testData() {
		return new Object[][] { { "user1", "pwd1", "account1" }, { "user2", "pwd2", "account2" },
				{ "user3", "pwd3", "account3" } };
	}
}
