package include_Exclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class myTestClass {
  @Test
  public void b() 
  {
	  Reporter.log("b is Running",true);
  }
  @Test
  public void a() 
  {
	  Reporter.log("a is Running",true);
  }
  @Test
  public void c() 
  {
	  Reporter.log("c is Running",true);
  }
}
