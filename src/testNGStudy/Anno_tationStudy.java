package testNGStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Anno_tationStudy {
  @Test
  public void RechargePhone()
  {
	  Reporter.log("recharge done",true);
  }
  @BeforeMethod
  public void loginToportalRecharge()
  {
	  Reporter.log("login succsess",true);
  }

  @AfterMethod
  public void LogOutPortal() {
	  Reporter.log("logout",true);
  }

  @BeforeClass
  public void launchedBrouser() {
	  Reporter.log("Brouser Lauched",true);
  }

  @AfterClass
  public void ClosedBrouser() {
	  Reporter.log("Brouser Closed",true);
  }

}
