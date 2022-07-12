package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[text()='Click me!'])[1]")).click();
		Thread.sleep(3000);
		

		
	
			
			

	}

}
