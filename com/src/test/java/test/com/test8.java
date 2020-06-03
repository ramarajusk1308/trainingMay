package test.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test8 {

	@Test(groups = { "smoke" })
	public static void test1() {
		System.out.println("test1");
		Assert.assertTrue(false);
	}

	// @Test(dependsOnMethods = { "test1" })

	@Test(dependsOnGroups = { "smoke" })
	public static void test2() {
		System.out.println("test2");
	}

	@Test
	public static void test3() {
		System.out.println("test3");
	}
}
