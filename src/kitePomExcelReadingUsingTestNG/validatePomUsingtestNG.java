
package kitePomExcelReadingUsingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteutility.utility;

public class validatePomUsingtestNG {
   
	  WebDriver driver;
	  org.apache.poi.ss.usermodel.Sheet mySheet;
	  KiteLoginPage login;
	  KitePinPage pin;
	  KiteHomePage Home;
	  int TCID=555;
	  @BeforeClass
	  public void  LaunchBrowser() throws EncryptedDocumentException, IOException
	    {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\chromedriver_win32\\chromedriver.exe");
	  ChromeOptions opt= new ChromeOptions();
	  //opt.addArguments("--headless");
	  //opt.addArguments("--disable-notifications");
	  opt.addArguments("incognito");
	  
	  driver= new ChromeDriver(opt);
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  
	  Reporter.log("Launching browser",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  File myfile = new File("C:\\Users\\acer\\selenium\\New folder\\Worksheet.xlsx");
	   mySheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
	  
	  login= new KiteLoginPage(driver);
	  pin = new KitePinPage(driver);
	  Home= new KiteHomePage(driver);
	  }
	  
	  @BeforeMethod
	  public void kiteLoginPage()
	  { 
		String UD = mySheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = mySheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(0).getCell(2).getStringCellValue();
		  
		  
	 login.sendUserName(UD);
	  Reporter.log("sending username",true);
	  login.sendPassword(PWD);
	  Reporter.log("sending password",true);
	  login.clickOnLoginButton();
	  Reporter.log("clicking on login button",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  pin.sendPin(PIN);
	  Reporter.log("sending PIN",true);
	  pin.clickOnContinueButton();
	  Reporter.log("clicking on continue button",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  }
	  
	  @Test
	  public void validateUserName() throws IOException
	  {
	  String expectedUD = mySheet.getRow(0).getCell(0).getStringCellValue();
	  String actualUD = Home.getActualUserName();
	  Reporter.log("Validating UserName",true);
	  Assert.assertEquals(actualUD, expectedUD,"Actual and Expected UD are notmatching TC failed");
	  Reporter.log("Actual and Expected UD are matching TC PASSED",true);
	  utility.captureScreenshots(driver, TCID);
	  
	  }
	  @AfterMethod
	  public void logoutFromKiteApp() throws InterruptedException
	  {
	  Home.Logout();
	  Reporter.log("logging out...",true);
	  }
	  
	  @AfterClass
	  public void closeBrowser() throws InterruptedException  
	  {
		  
	 Thread.sleep(1000);
	  Reporter.log("Closing browser",true);
	  driver.close();
  }
}
