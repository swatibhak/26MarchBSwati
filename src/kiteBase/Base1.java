package kiteBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import kiteutility.Utility1;

public class Base1 {
	protected WebDriver driver;
	public void openBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--disable-notifications");
//	opt.addArguments("incognito");
	 driver = new ChromeDriver();
    driver.manage().window().maximize();
	driver.get(Utility1.getDataFromPropertyFile("URL"));
	Reporter.log("Launching browser",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	

}
}