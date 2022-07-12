package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollstd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		WebElement PracticePage = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
		
      JavascriptExecutor e=(JavascriptExecutor)driver;

	 
      
    //  e.executeScript("arguments[0].scrollIntoView(true)", PracticePage);
	   e.executeScript("arguments[0].scrollIntoView(true)", PracticePage);
	}
}
