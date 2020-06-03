package test.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test3 {

	@BeforeClass
	public static void CreateDBConnection() {
		System.out.println("Beforeclass-CreateDBConnection");
	}

	@AfterClass
	public static void CloseDBConnection() {
		System.out.println("AfterClass-CloseDBConnection");
	}

	@BeforeMethod
	public static void login() {
		System.out.println("Before Method1");
	}

	@AfterMethod
	public static void logout() {
		System.out.println("After Method");
	}

	@Test(priority = 0, enabled = true)
	public static void myAccountDetails() {
		System.out.println("Test 1");
	}

	@Test(priority = 1)
	public static void myOrders() {
		System.out.println("Test 2");
	}

	@Test(priority = 2)
	public static void myBankDetails() {
		System.out.println("Test 3");
	}
}
