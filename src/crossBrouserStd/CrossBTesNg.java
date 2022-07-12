package crossBrouserStd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBTesNg {
@Parameters("Browser name")
  @Test
  public void m1(String Name) throws InterruptedException
  {
	WebDriver driver=null;
	 
	if(Name.equals("FireFox"))
	  {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\acer\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			  driver=new FirefoxDriver();
	  }
	  else if(Name.equals("Chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32.\\chromedriver.exe");
			 driver=new ChromeDriver();
	  }
		
	  driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		driver.close();
		
		
	  
  }
	
	
}
