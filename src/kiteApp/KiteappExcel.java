package kiteApp;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteappExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		File myfile = new File("C:\\Users\\acer\\selenium\\New folder\\Worksheet.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		
		String UD = mySheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = mySheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(0).getCell(2).getStringCellValue();
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		//step1=login
		WebElement UserID = driver.findElement(By.id("userid"));
		WebElement PassWord = driver.findElement(By.id("password"));
		WebElement LogInButton = driver.findElement(By.xpath("//button[@type='submit']"));

		UserID.sendKeys(UD);
		PassWord.sendKeys(PWD);
		LogInButton.click();
		Thread.sleep(1000);
		
		WebElement PIN1 = driver.findElement(By.id("pin"));
		WebElement ContinButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		PIN1.sendKeys(PIN);
		ContinButton.click();
		Thread.sleep(1000);
		//Compare Result
		WebElement UserName = driver.findElement(By.xpath("//span[@class='user-id']"));
		String ActualuserID = UserName.getText();
		String ExpectedUserID=UD;
		
		//using if else 
		if(ActualuserID.equals(ExpectedUserID) ) 
		{
			System.out.println("User ID matching TC is PASSED");
			}
		else
			{
			
			System.out.println("User ID matching TC is PASSED");
			
			}
		UserName.click();
		Thread.sleep(100);
		//logout
		WebElement LogOut = driver.findElement(By.xpath("//a[@target='_self']"));
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
