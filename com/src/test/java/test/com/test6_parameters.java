package test.com;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test6_parameters {

	@Parameters({ "browser", "url" })
	@Test
	public void test1(String browserName, String applicationURL) {
		System.out.println("Test1");
		System.out.println(browserName + " " + applicationURL);
	}

}
