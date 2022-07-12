package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingIntoView {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		WebElement Admin = driver.findElement(By.xpath("(//h1[@class='et_pb_module_header'])[1]"));
		
		
		JavascriptExecutor e=(JavascriptExecutor)driver;
        e.executeScript("arguments[0].scrollIntoView(true)", Admin);
	}

}
