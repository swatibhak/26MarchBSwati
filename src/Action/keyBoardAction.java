package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyBoardAction {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32.\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			Thread.sleep(1000);
			//1.using sendkeys
			WebElement textbox = driver.findElement(By.id("autocomplete"));
			//textbox.sendKeys("Hi ");
			
			//2.action class using keyword methods
			Actions act1=new Actions(driver);
			act1.sendKeys(textbox, "hi swt").perform();
			
			//3.how to handle dropdown using keyboard action
			WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
			act1.sendKeys(dropdown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();


			

	}

}
