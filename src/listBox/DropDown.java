package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?l");
		WebElement date = driver.findElement(By.id("day"));
		Select s=new Select(date);
		s.selectByIndex(3);
		Thread.sleep(2000);
		
		WebElement month1 = driver.findElement(By.id("month"));
		Select s1=new Select(month1);
		s1.selectByValue("5");
		Thread.sleep(2000);
		
		WebElement year1 = driver.findElement(By.id("year"));
		Select s2=new Select(year1);
		s2.selectByVisibleText("1994");
		Thread.sleep(2000);
		
		
		

	}

}
