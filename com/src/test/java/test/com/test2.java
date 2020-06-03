package test.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class test2 {
	static WebDriver driver;

	@Test
	public static void launchChrome() {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads");
		System.out.println(driver.getTitle());
		driver.quit();
	}

	@Test
	public static void launchIE() {
		System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer_64.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://www.selenium.dev/downloads");
		System.out.println(driver.getTitle());
		driver.quit();
	}

	@Test
	public static void launchFirefox() {
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
