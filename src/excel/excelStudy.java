package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelStudy {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile = new File("C:\\Users\\acer\\selenium\\New folder\\Worksheet.xlsx");
		
		String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
        System.out.println("name is "+name);
        
        String mychara = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
         System.out.println("my char is "+mychara);

        double number = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
         System.out.println("number is "+number);
        

        boolean value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(1).getBooleanCellValue();
       System.out.println("value is "+value);
        
       
	}

}
