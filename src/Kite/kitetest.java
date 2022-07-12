package Kite;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import kitePomExcelReadingUsingTestNG.KiteHomePage;
import kitePomExcelReadingUsingTestNG.KiteLoginPage;
import kitePomExcelReadingUsingTestNG.KitePinPage;

@Listeners(Kite.listner.class)
public class kitetest extends Base {
  
	  KiteHomePage Home;
	  KiteLoginPage login;
	  KitePinPage pin;
	  String TCID="150";

	  @BeforeClass
	  
	  public void launchBrowser() throws IOException
	  {
		 
	initializebrowser();
	  login= new KiteLoginPage(driver);
	  pin= new KitePinPage(driver);
	  Home= new KiteHomePage(driver);
		}
	
	@BeforeMethod
	  public void loginToKIteApp() throws IOException
	  {
	 login.sendUserName(Utility.getDataFromPropertyFile("UN"));
	 Reporter.log("Entered UserName",true);
	login.sendPassword(Utility.getDataFromPropertyFile("PWD"));
	 Reporter.log("Entered Password",true);
	login.clickOnLoginButton();
	
	pin.sendPin(Utility.getDataFromPropertyFile("PIN"));
	 Reporter.log("Entered PIN",true);
    pin.clickOnContinueButton();

		 }
	  @Test
	  public void validateUserID() throws EncryptedDocumentException, IOException
	 {
		 
	 Assert.assertNotEquals(Home.getActualUserName(), Utility.getDataFromPropertyFile("UN"));
	Utility.captureScreenshots(driver, TCID);
	
	 }
	  @AfterMethod
	 public void logoutFromKiteApp() throws InterruptedException
	  {
	  Home.Logout();
	 
	  }
	  @AfterClass
	  public void closeBrowser() throws InterruptedException  
	  {
		   driver.close();
  }
}
