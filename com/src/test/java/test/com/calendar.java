package test.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class calendar {
	WebDriver driver;

	@Test(enabled = true)
	public void test1() {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		// Click on date field
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		// Get number of rows from July 2020 table
		List<WebElement> mnthColl = driver.findElements(By
				.xpath("//div[@class='DayPicker-Caption']/div[text()='July 2020']/parent::div/parent::div/div[3]/div"));
		// to exit from First for loop
		boolean flag = false;
		// First for loop - to iterate over number of rows in July --- i
		// represents rows of july table
		for (int i = 1; i <= mnthColl.size(); i++) {
			// Get number of dates present in each row-- columns in each row
			List<WebElement> dateColl = driver.findElements(By
					.xpath("//div[@class='DayPicker-Caption']/div[text()='July 2020']/parent::div/parent::div/div[3]/div["
							+ i + "]//div/div/p[1]"));
			// Get each element - second for loop -- to get date values from
			// dateColl --- J represents date values
			for (int j = 1; j <= dateColl.size(); j++) {
				// To get each element of a row - column/date value
				WebElement el = driver.findElement(By
						.xpath("(//div[@class='DayPicker-Caption']/div[text()='July 2020']/parent::div/parent::div/div[3]/div["
								+ i + "]/div/div/p[1])[" + j + "]"));
				// Comparing above date value with a date
				if (el.getText().contains("28")) {
					el.click();
					// If click not works , use javascript executor
					// JavascriptExecutor executor = (JavascriptExecutor)
					// driver;
					// executor.executeScript("arguments[0].click();", dt);
					flag = true;
					// Break second for loop
					break;
				}
			}
			if (flag) {
				// break first for loop
				break;
			}
		}
	}
}
