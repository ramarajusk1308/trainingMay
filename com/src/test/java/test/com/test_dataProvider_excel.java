package test.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test_dataProvider_excel {
	WebDriver driver = null;

	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(dataProvider = "excelDataProvider")
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
		Assert.assertEquals(text, "Invalid email address.");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@DataProvider(name = "excelDataProvider")
	public Object[][] testDataProvider() throws IOException {
		Object[][] excelData = null;
		File file = new File(".\\testData\\testData1.xls");
		FileInputStream inputStream = new FileInputStream(file);
		// Create workbook object
		Workbook wb = new HSSFWorkbook(inputStream);
		// From which sheet we need data
		Sheet sheet1 = wb.getSheet("Sheet1");
		// Numbers of rows present in Sheet1
		int rowcount = sheet1.getLastRowNum() - sheet1.getFirstRowNum();
		int colcount = sheet1.getRow(1).getLastCellNum();
		excelData = new Object[rowcount][colcount];
		for (int i = 1; i <= rowcount; i++) {
			Row row = sheet1.getRow(i);
			int colcount1 = sheet1.getRow(i).getLastCellNum();
			System.out.println("colcount " + colcount1);
			for (int j = 0; j < colcount1; j++) {
				String d = row.getCell(j).getStringCellValue();
				excelData[i - 1][j] = d;
			}
		}
		return excelData;
	}
}