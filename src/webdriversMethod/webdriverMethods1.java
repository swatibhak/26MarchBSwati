package webdriversMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverMethods1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//1.
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		
		//2.driver.close();
		//3.driver.manage().window().minimize();
		//4.navigate
		driver.navigate().to("https://www.google.com/");
		driver.navigate().forward(); //frorword metgod
		Thread.sleep(100);
		driver.navigate().back();     // backword method
		Thread.sleep(100);
		driver.navigate().refresh();   // refresh method
		Thread.sleep(100);
		
		

	}

}
