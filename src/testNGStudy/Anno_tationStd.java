package testNGStudy;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Anno_tationStd {
  @Test
  public void validateUserId() 
  {
	
	
	Reporter.log("User Id Is validate",true);
	  
  }
  @Test
  public void validateDashBoard() 
  {
	  Reporter.log("Dashboard is validate",true);
	  
  }
  @BeforeMethod
  public void LoginToKitepage()
  {
	  Reporter.log("LoginSuccess",true);
  }
  @BeforeClass
  public void Launchbrouser()
  {
	  Reporter.log("Brouser Launched",true);
  }
  @AfterMethod
  public void LogoutFromKitepage()
  {
	  Reporter.log("LogOut",true);
  }
  @AfterClass
  public void BrouserClosed()
  {
	  Reporter.log("BrouserClosed",true);
  }
  
}
