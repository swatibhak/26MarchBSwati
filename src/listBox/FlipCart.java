package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCart {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			
			
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@class='_2IX_2- _2LYh3d VJZDxU']")).sendKeys("45566");
//		Thread.sleep(1000);
//			

	}

}
