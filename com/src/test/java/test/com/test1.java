package test.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1 {
	@Parameters({ "browser" })
	@Test
	public static void launchChrome(String browser) {
		WebDriver driver = null;
		if (browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.selenium.dev");
			System.out.println(driver.getTitle());
		} else if (browser.contains("IE")) {
			System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer_64.exe");
			driver = new InternetExplorerDriver();
			driver.get("https://www.selenium.dev");
			System.out.println(driver.getTitle());
		} else if (browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.selenium.dev");
			System.out.println(driver.getTitle());
		}
		driver.quit();
	}
}
