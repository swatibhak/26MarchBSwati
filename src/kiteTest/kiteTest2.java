package kiteTest;

import org.testng.annotations.Test;

import kiteBase.Base1;
import kitePomExcelReadingUsingTestNG.KiteHomePage;
import kitePomExcelReadingUsingTestNG.KiteLoginPage;
import kitePomExcelReadingUsingTestNG.KitePinPage;

import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.openqa.selenium.WebDriver;
	import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;

import kiteutility.Utility1;
import kiteutility.utility;
	public class kiteTest2 extends Base1 {
		  KiteHomePage Home;
		  KiteLoginPage login;
		  KitePinPage pin;
		  String TCID="1234";
	
		  @BeforeClass
		  public void launchBrowser() throws IOException
		  {
		  openBrowser();
		  login= new KiteLoginPage(driver);
		  pin= new KitePinPage(driver);
		  Home= new KiteHomePage(driver);
			}
		
		@BeforeMethod
		  public void loginToKIteApp() throws IOException
		  {
			  login.sendUserName(Utility1.getDataFromPropertyFile("UN"));
			  login.sendPassword(Utility1.getDataFromPropertyFile("PWD"));
			  login.clickOnLoginButton();
			  pin.sendPin(Utility1.getDataFromPropertyFile("PIN"));
			  pin.clickOnContinueButton();

			 }
		  @Test
		  public void validateUserID() throws EncryptedDocumentException, IOException
		 {
		 Assert.assertEquals(Home.getActualUserName(), Utility1.getDataFromPropertyFile("UN"));
		Utility1.captureScreenshots(driver, TCID);
		
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
		


