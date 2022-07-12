package Kite;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import kiteutility.Utility1;

	
public class Base {
	 protected static WebDriver driver;
	public static void initializebrowser() throws IOException
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
    driver.manage().window().maximize();
	driver.get(Utility.getDataFromPropertyFile("URL"));
	Reporter.log("Launching browser",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}
	
		public static void timer()
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		}
		
	}
		
	