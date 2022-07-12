package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsUsingSendkeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.facebook.com/");
		
		Thread.sleep(1000);

		driver.findElement(By.id("email")).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).clear();
		
		String text = driver.findElement(By.xpath("//button[@type='submit']")).getText();
		System.out.println("Get Text is "+text);
	}

}
