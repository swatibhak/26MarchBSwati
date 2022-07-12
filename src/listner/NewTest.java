package listner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listner.ListnersStd.class)
public class NewTest {
@Test
  public void myMethod1() 
  {
	  Reporter.log("my method1 is running",true);
	  
  }
  @Test
  public void myMethod2() 
  {
	  Assert.fail();
	  Reporter.log("my method2 is running",true);
	  
  }
  @Test(dependsOnMethods="myMethod2")
  public void myMethod3() 
  {
	  Reporter.log("my method3 is running",true);
	  
  }
}
