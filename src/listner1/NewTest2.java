package listner1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listner1.ListnersStd.class)
public class NewTest2 {
  @Test
  public void google() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.google.com");
		driver.findElement(By.name("q")).sendKeys("teddy");
		driver.quit();
  }
  @Test
  public void facebook()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:https://www.facebook.com/r.php");
		
		
  }
  
  
}
