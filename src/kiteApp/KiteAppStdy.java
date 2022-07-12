package kiteApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppStdy {

	    public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		//step1=login
		WebElement UserID = driver.findElement(By.id("userid"));
		WebElement PassWord = driver.findElement(By.id("password"));
		WebElement LogInButton = driver.findElement(By.xpath("//button[@type='submit']"));

		UserID.sendKeys("ELR321");
		PassWord.sendKeys("Dhana1111");
		LogInButton.click();
		Thread.sleep(1000);
		
		WebElement PIN = driver.findElement(By.id("pin"));
		WebElement ContinButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		PIN.sendKeys("982278");
		ContinButton.click();
		Thread.sleep(1000);
		//Compare Result
		WebElement UserName = driver.findElement(By.xpath("//span[@class='user-id']"));
		String ActualuserID = UserName.getText();
		String ExpectedUserID="ELR321";
		
		//using if else 
		if(ActualuserID.equals(ExpectedUserID) ) 
		{
			System.out.println("User ID matching TC is PASSED");
			}
		else
			{
			
			System.out.println("User ID matching TC is PASSED");
			
			}
		UserName.click();
		Thread.sleep(100);
		//logout
		WebElement LogOut = driver.findElement(By.xpath("//a[@target='_self']"));
		Thread.sleep(2000);
		driver.close();
		
	}
	

}
