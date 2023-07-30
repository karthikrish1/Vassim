package testnglis;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class lo implements ITestListener{

	public void onTestSuccess(ITestResult result) {
		System.out.println("sucesss");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("failed");
	}

	public void onStart(ITestContext context) {
		System.out.println("started");
	}

	public void onFinish(ITestContext context) {
		System.out.println("finished");
	}
	
	//ITestListner 
	//rightclick=> source=> override/impleme

}
