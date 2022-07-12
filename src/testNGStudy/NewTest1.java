package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void Stdy()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32.\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Reporter.log("hi good morning true",true);
  }
}
