package set_size;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizePosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			
			Dimension sizeofpg = driver.manage().window().getSize();
			System.out.println(sizeofpg);
			
			//to  change size using dimension method
//			Dimension setsize=new Dimension(500,1000);
//			driver.manage().window().setSize(setsize);
//			Thread.sleep(1000);
			

			//Dimension setsize2=new Dimension (800,700);
			//driver.manage().window().setSize(setsize2);
			Thread.sleep(1000);
			
			// change to position
			Point position = driver.manage().window().getPosition();
			System.out.println(position);
			
			Point step1=new Point(0,0);
			driver.manage().window().setPosition(step1);
			
			Point position1 = driver.manage().window().getPosition();
			System.out.println(position1);
			
			
			
			
	}

}
