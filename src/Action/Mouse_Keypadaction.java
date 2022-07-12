package Action;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Keypadaction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		//1.using click
		WebElement seleniumButton = driver.findElement(By.linkText("Selenium"));
		 seleniumButton.click();
		
		//2.to create action class object
			Actions act=new Actions(driver);
		//act.moveToElement(seleniumButton).perform();
		//act.click().perform();
			
		//3.using move to element
	 //act.click(seleniumButton).perform();
		//act.moveToElement(seleniumButton).click().build().perform();
		
			//4.using right click
			WebElement RightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
//			act.contextClick(RightClick).perform();
//			act.moveToElement(RightClick).contextClick().build().perform();
//			act.moveToElement(RightClick).perform();
//			act.contextClick().perform();
			
		
		WebElement DoubleClick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		
		act.doubleClick(DoubleClick).perform();
		Thread.sleep(1000);
		
		

	}

}
