package webdriversMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettextUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		
		String Title = driver.getTitle();
		System.out.println("Title is "+Title);
		
		String url = driver.getCurrentUrl();
		System.out.println("url is "+url);
		


	}

}
