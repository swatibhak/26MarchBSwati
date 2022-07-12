package kiteAppPom;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.codec.http.websocketx.PingWebSocketFrame;

public class Testclass {

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
		
		KiteLoginpage login=new KiteLoginpage(driver);
		login.sendUserName();
		login.sendPassword();
		login.loginButton();
        Thread.sleep(1000);
	  
        KitePinPage pin1 = new  KitePinPage(driver);
	   pin1.sendpin();
	   pin1.clickOncontinueButton();
	   Thread.sleep(1000);
	   
	   KiteHomePage home=new KiteHomePage(driver);
	   home.ValidateUserName();
	   home.Logout();
	  Thread.sleep(1000);
	   driver.close();
	   
	   
	   
	 
	 
	
	}
	 

}
