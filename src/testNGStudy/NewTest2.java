package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void m1()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32.\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
  }
  
	  @Test
	  public void m2()
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32.\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://vctcpune.com/");
	  }
  

}