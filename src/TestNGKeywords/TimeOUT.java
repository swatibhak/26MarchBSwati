package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOUT {
  @Test(timeOut = 1000)
  public void a() throws InterruptedException 
  {
	  Thread.sleep(200);
	  Reporter.log("a is running",true);
  }
  @Test
  public void d()
  {
	  Reporter.log("d is running",true);
  }
  @Test
  public void v()
  {
	  Reporter.log("v is running",true);
  }
  
}
