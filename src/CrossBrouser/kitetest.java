package CrossBrouser;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import kitePomExcelReadingUsingTestNG.KiteHomePage;
import kitePomExcelReadingUsingTestNG.KiteLoginPage;
import kitePomExcelReadingUsingTestNG.KitePinPage;
import kiteutility.Utility1;
@Listeners(Kite.listner.class)
public class kitetest extends Base {
  
	  KiteHomePage Home;
	  KiteLoginPage login;
	  KitePinPage pin;
	  String TCID="129";
      @Parameters("browsername")
	  @BeforeClass
	  public void Browser(@Optional String name) throws IOException
	  {
    	 if( name.equals("chrome"))
    			 {
    		 openChromeebrowser();
    		 
    			 }
    	 else if (name.equals("FireFox"))
    	 {
    		openFirefoxdriver(); 
    	 }
    	
	
	  login= new KiteLoginPage(driver);
	  pin= new KitePinPage(driver);
	  Home= new KiteHomePage(driver);
		}
	

	@BeforeMethod
	  public void loginToKIteApp() throws IOException
	  {
	 login.sendUserName(Utility.getDataFromPropertyFile("UN"));
	login.sendPassword(Utility.getDataFromPropertyFile("PWD"));
	login.clickOnLoginButton();
	pin.sendPin(Utility.getDataFromPropertyFile("PIN"));
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
