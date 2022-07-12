package VerificationUseTestNG;

import static org.testng.Assert.assertNotEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void Method1()
  {
	  String a="swati";
	  String b="swati1";
	//Assert.assertEquals(a, b,"a and b value are not matching tc is failed");
	//Reporter.log("a and b value are not matching tc is passed",true);
	
	  Assert.assertNotEquals(a, b," a and b values are matching TC failed");
	  Reporter.log(" a and b values are not matching TC Passed",true);
	}
}
