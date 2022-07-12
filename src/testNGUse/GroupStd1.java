package testNGUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupStd1 {
  @Test
  public void Tc1()
  {
	  Reporter.log("Tc1 is running",true);
  }
  @Test(groups = {"sanity"})
  public void Tc2()
  {
	  Reporter.log("Tc2 is sanity running",true);
  }
  @Test(groups = {"regression"})
  public void Tc3()
  {
	  Reporter.log("Tc3 is  regression running",true);
  }
  @Test(groups = {"regresion"})
  public void Tc4()
  {
	  Reporter.log("Tc4 is  regression running",true);
  }
}
