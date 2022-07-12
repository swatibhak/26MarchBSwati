package VerificationUseTestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotnulluse {
  @Test
  public void s1() 
  {
	  String s=null;
	  String b="swt";
	  
	 // Assert.assertNull(s, "value is not null tc is failed");
	 // Reporter.log("value is null tc is passed",true);
	  
	  Assert.assertNotNull(b,  "value is  null tc is failed");
	  Reporter.log("value is notnull tc is passed",true);
    // Assert.fail();
  
  }
}
