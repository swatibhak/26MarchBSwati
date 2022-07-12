package listner1;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnersStd implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("*********Test Started "+result.getName(),true);
	}
   @Override
     public void onTestSuccess(ITestResult result) 
     {
	Reporter.log("**********Test Successful "+result.getName(),true);
     }
   @Override
  public void onTestSkipped(ITestResult result)
   {
 	Reporter.log("********* Test is skipped "+result.getName());
   }
}
