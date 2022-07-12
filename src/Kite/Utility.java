package Kite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility  {
	
		public static void captureScreenshots(WebDriver driver,String TCID) throws IOException
		{
			File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("D:\\MyClass\\VelocityFamily\\26marchB\\Screenshots\\s1"+TCID+".png");
			FileHandler.copy(scr, dest);
			
		}
		public static String getDataFromPropertyFile(String key) throws IOException
		
		{
			Properties pr=new Properties();
			FileInputStream myFile= new FileInputStream("C:\\Users\\acer\\eclipse-workspace\\selenium\\MyProperty.properties");
			pr.load(myFile);
			
			String value = pr.getProperty(key);
			return value;
	
		
	}
	
		}


