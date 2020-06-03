package test.com;

import org.testng.annotations.Test;

public class java_exceptionHandling {

	@Test
	public void test1() {
		try {
			int i = 0;
			int j = 100;
			System.out.println(j / i);
			// System.out.println(i / j);
		} catch (ArithmeticException ar) {
			System.out.println("Arithmatic exception : " + ar);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally handled sucessfully");
		}
	}
}
