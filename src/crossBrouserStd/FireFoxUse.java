package crossBrouserStd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxUse {
  @Test
  public void MyMtd() 
  {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\acer\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		//WebDriver driver=new ChromeDriver();
	  WebDriver driver=new FirefoxDriver();
	  
		
	  driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		
	}
  }

