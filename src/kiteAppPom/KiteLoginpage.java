package kiteAppPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginpage {
	//1.data member
	@FindBy(id="userid") private WebElement UserName;
	@FindBy(id="password")private WebElement PassWord;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;
	
	//2.constructor
	public KiteLoginpage(WebDriver Driver)
	{
		PageFactory.initElements(Driver,this);
	}
	
	//3.methods
	public void sendUserName()
	{
		UserName.sendKeys("ELR321");
	}
	public void sendPassword()
	{
		PassWord.sendKeys("Dhana1111");
	}
    public void loginButton()
  {
   loginButton.click();	
   }
}
