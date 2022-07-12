package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//implicit 
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
    	WebElement radio = driver.findElement(By.xpath("//input[@value='Radio1']"));
    	//scroll to view
    	JavascriptExecutor e=(JavascriptExecutor)driver;
    	e.executeScript("arguments[0].scrollIntoView(true)", radio);
    	radio.click();
    	
    	WebElement id = driver.findElement(By.id("autocomplete"));
 	     JavascriptExecutor j=(JavascriptExecutor)driver;
    	j.executeScript("arguments[0].scrollIntoView(true)",id);
    	id.sendKeys("swt");
    	
    	WebElement name = driver.findElement(By.id("name"));
    	 JavascriptExecutor k=(JavascriptExecutor)driver;
     	k.executeScript("arguments[0].scrollIntoView(true)",name);
     	name.sendKeys("swati");

	}

}
