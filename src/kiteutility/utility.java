package kiteutility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility
{
	
	
	//excel
	//screenshot
	//closing

	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
   File myfile = new File("C:\\Users\\acer\\selenium\\New folder\\Worksheet.xlsx");
	 org.apache.poi.ss.usermodel.Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
	String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
	return value;
}
	public static void captureScreenshots(WebDriver driver,int TCID) throws IOException
	{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\MyClass\\VelocityFamily\\26marchB\\Screenshots\\s1"+TCID+".png");
		FileHandler.copy(scr, dest);
		
	}
	
		
	}
