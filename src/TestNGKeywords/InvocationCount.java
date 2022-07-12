package TestNGKeywords;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

public class InvocationCount {
  @Test(invocationCount=3)
  public void MyTest() {Reporter.log("swt",true);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("hi",true);
  }

}
