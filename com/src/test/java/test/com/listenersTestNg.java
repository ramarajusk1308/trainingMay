package test.com;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

public class listenersTestNg extends baseClass implements ITestListener {

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult failure) {
		System.out.println("On Test Failure");
		test.log(LogStatus.FAIL, failure.getThrowable().getMessage());
	}

	public void onTestSuccess(ITestResult testStatus) {
		System.out.println("onTestSuccess");
		test.log(LogStatus.PASS, testStatus.getThrowable().getMessage());
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("onTestSkipped");
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("onTestStart");
	}

	public void onFinish(ITestContext arg0) {
		System.out.println("onFinish");
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

}
