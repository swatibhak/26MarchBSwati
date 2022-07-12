package VerificationUseTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyRadioButton {
  @Test
  public void A() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32.\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement radiobutton = driver.findElement(By.xpath("//input[@value='Radio1']"));
//  if(radiobutton.isSelected())
//  {
//	
//	  Reporter.log("radio button is selected",true);
//  }
//  else
//  {
//	  Reporter.log("radio  button is not selected",true);
//  }
		Assert.assertTrue(radiobutton.isSelected(),"radio button is not selected TC is failed");
 
}
  
}