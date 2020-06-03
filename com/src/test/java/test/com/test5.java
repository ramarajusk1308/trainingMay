package test.com;

import org.testng.annotations.Test;

public class test5 {

	@Test(groups = { "Smoke" })
	public void test1() {
		System.out.println("test1");
	}

	@Test(groups = { "Functional" })
	public void test2() {
		System.out.println("test2");
	}

	@Test(groups = { "Regression" })
	public void test3() {
		System.out.println("test3");
	}

	@Test(groups = { "Smoke", "Regression" })
	public void test4() {
		System.out.println("test4");
	}

	@Test(groups = { "Functional", "Regression" })
	public void test5() {
		System.out.println("test5");
	}
}
