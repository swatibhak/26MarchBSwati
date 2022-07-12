package misc;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class noOfLinksWebpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		List<WebElement> tagname = driver.findElements(By.tagName("a"));
		System.out.println(tagname.size());
		
		java.util.Iterator<WebElement> it=tagname.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		

	}

}
