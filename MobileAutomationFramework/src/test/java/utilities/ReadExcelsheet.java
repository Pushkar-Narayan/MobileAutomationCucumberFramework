package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelsheet {

	public String [] getExcelData(String sheetName,String workBookName) throws EncryptedDocumentException, IOException
	{
		File file = new File("C:\\Users\\lenovo\\Desktop\\"+workBookName+".xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int srow = sheet.getLastRowNum()- sheet.getFirstRowNum();
		String [] sArr = null;
		for(int i=0;i<srow;i++)
		{
			Row row = sheet.getRow(i);
			sArr = new String[row.getLastCellNum()];
			for(int j=0;i<row.getLastCellNum();j++)
			{
				System.out.print(row.getCell(j).getStringCellValue()+"|| ");
				sArr[i] = row.getCell(j).getStringCellValue().toString();
			}
		}
		
		return sArr;
	}
		

}
