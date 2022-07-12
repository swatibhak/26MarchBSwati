package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClassEnableUse {
  @Test
  public void d() 
  {
	  Reporter.log("d is running",true);
  }
  @Test(enabled = false)
  public void v() 
  {
	  Reporter.log("v is running",true);
  }
  @Test
  public void m() 
  {
	  Reporter.log("m is running",true);
  }
}
