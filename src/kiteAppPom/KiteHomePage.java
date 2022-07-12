package kiteAppPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	//1
	@FindBy(xpath = "//span[@class='user-id']")private WebElement UserName;
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogOut;
	//2.
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void ValidateUserName()
	
	{
		String ExpectedUserName="ELR321";
		String ActualUserNmae=UserName.getText();
		
		if(ExpectedUserName.equals(ActualUserNmae))
		{
			System.out.println("Actual and Expected User Id are matching TC is passed");
		}
		else
		{
			System.out.println("Actual and Expected User Id are matching TC is Failed");
		}
	}
	
public void Logout() throws InterruptedException
{
	UserName.click();
	Thread.sleep(1000);
	LogOut.click();
	
}

}
