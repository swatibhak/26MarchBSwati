package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unorderlist {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
         driver.findElement(By.name("q")).sendKeys("teddy");
         Thread.sleep(1000);
         List<WebElement> SearchResult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
         System.out.println(SearchResult.size());
         
       for(WebElement r:SearchResult)
       {
    	   System.out.println(r.getText()); // for gettext
       }
      
	for(WebElement result:SearchResult)
	{
		String ActualText = result.getText();
		String ExpectedResult = "teddy";
		
		if( ActualText.equals(SearchResult))
			result.click();
		break;
	}
	driver.findElement(By.linkText("Images")).click();
	}

}
