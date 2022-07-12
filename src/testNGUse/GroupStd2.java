package testNGUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupStd2 {
  @Test
  public void T1() 
{
	  Reporter.log("T1 is running",true);
}
@Test(groups = {"regression"})
public void T2()
{
	  Reporter.log("T2 is regression running",true);
}
@Test(groups = {"sanity"})
public void T3()
{
	  Reporter.log("T3 is sanity  running",true);
}
@Test(groups = {"regresion"})
public void T4()
{
	  Reporter.log("T4 is regression running",true);
}
}