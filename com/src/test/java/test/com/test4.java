package test.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test4 {

	@Test
	public void login() {
		System.out.println("login");
		Assert.assertTrue(true);
	}

	@Test
	public void searchUser() {
		System.out.println("searchUser");
		Assert.assertTrue(true);
	}

	@Test(dependsOnMethods = { "login", "searchUser" })
	public void registerUser() {
		System.out.println("registerUser");
	}

	@Test(groups = { "Regression" })
	public void test1() {
		System.out.println("test1");
		Assert.assertTrue(true);
	}
}
