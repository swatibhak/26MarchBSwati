
package kitePomUsingExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheetReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
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
		
		KiteLoginPage login=new KiteLoginPage(driver);	
		login.sendUserName(UD);
		login.sendPassword(PWD);
		login.clickOnLoginButton();
		Thread.sleep(2000);
		
		KitePinPage pin= new KitePinPage(driver);
		pin.sendPin(PIN);
		pin.clickOnContinueButton();
		Thread.sleep(2000);
		
		KiteHomePage home= new KiteHomePage(driver);
		home.validateUserName(UD);
		home.Logout();
		driver.close();
		

	}

}
