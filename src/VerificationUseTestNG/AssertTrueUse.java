package VerificationUseTestNG;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueUse {
  @Test
  public void m1()
  {
	  boolean a=true;
	  boolean b=false;
	  
 // Assert.assertTrue(a,"tc is failed value is false");
	 // Reporter.log("tc is passed value is true",true);
 
	Assert.assertFalse(b,"tc is failed value is true");
	Reporter.log("tc is passed value is false",true);
	  
  
  }
  
}
