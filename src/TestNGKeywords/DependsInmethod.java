package TestNGKeywords;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class DependsInmethod {
  
	 @Test
	  public void d() 
	  {
	
		
		  Reporter.log("d is running",true);
	  }
	  @Test(dependsOnMethods = {"m"})
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
