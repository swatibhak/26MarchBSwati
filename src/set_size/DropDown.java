package set_size;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.facebook.com/r.php");
			
			// by using create object of action class
			Actions act=new Actions(driver);
			WebElement month = driver.findElement(By.id("month"));
			act.moveToElement(month).click().build().perform();
			
			for(int i=1;i<=1;i++)
			{
				act.sendKeys(Keys.ARROW_UP).perform();
			}
 WebElement may = driver.findElement(By.id("month"));
 act.contextClick(may).perform();
	}

}
