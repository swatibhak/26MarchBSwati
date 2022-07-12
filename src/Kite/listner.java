package Kite;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listner  implements ITestListener  {
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("Tc is Successfull "+ result.getName(),true);
		
	}	
		
	@Override
	public void onTestFailure(ITestResult result) {
		
		Reporter.log("Test Failed plz try again, faild  tc name is "+result.getName(),true);	
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
	Reporter.log("Tc is Skipped "+result.getName(),true);
	}

		

}
