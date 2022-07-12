package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse {
  @Test(priority = -1)
  public void s()
  {
	Reporter.log("s is running",true);  
  }
  @Test
  public void b()
  {
  Reporter.log("b is running",true);
  }
  @Test(priority = -2)
  public void t()
  {
  Reporter.log("t is running",true);
}
}