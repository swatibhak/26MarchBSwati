package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSampl1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//switch selenium focus from main page to frame
		
		driver.switchTo().frame("iframe-name");
		Thread.sleep(100);
		//current focus is on frame now
		driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click(); // this element is present on iframe(need to switch selenium focus from main page to frame)
		// to take action on main page again, we need to switch selenium  focus from frame to main page
		//parentframe();default content ();
		driver.switchTo().defaultContent();// switching selenium focus to main page
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();

	}

}
