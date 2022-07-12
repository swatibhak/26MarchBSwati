package listner;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnersStd implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("Take screenshot",true);
	}
   @Override
     public void onTestSuccess(ITestResult result) 
     {
	Reporter.log("Test passed Successful",true);
     }
   @Override
  public void onTestSkipped(ITestResult result)
   {
 	Reporter.log("this Test is skipped",true);
   }
}
