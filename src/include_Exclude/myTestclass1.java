package include_Exclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class myTestclass1 {
  @Test
  public void q () 
	  {
		  Reporter.log("q is Running",true);
	  }
	  @Test
	  public void p() 
	  {
		  Reporter.log("p is Running",true);
	  }
	  @Test
	  public void r() 
	  {
		  Reporter.log("r is Running",true);
	  }
  }
