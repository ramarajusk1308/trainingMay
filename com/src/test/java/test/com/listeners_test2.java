package test.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class listeners_test2 {

	@Test
	public static void test1() {
		System.out.println("test1");
		Assert.assertEquals("Test1", "test1");
	}

	@Test
	public static void test2() {
		System.out.println("test2");
		Assert.assertEquals("Test1", "Test1");
	}
}
