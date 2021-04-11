package spreadsheet;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Webtablocmethod.Locatormethod;

public class Spreadsheet 
{
	 Locatormethod locator; 
	 XSSFSheet sheet;
	 
   public Spreadsheet() throws Exception
   {
	   locator = new Locatormethod();
	   File file = new File(locator.getexcelfilepath());
		 FileInputStream fs = new FileInputStream(file);
		 XSSFWorkbook workbook = new XSSFWorkbook(fs);
		 XSSFSheet sheet = workbook.getSheet("Sheet1");
		 this.sheet = sheet;
   }
   
   public String getExcelHeaderName(int row, int cell)
   {
	   String name = sheet.getRow(row).getCell(cell).getStringCellValue();
	   return name;
   }
 
   public void getWebtabledata()
   {
	   Iterator<Row> rows = sheet.rowIterator(); 
	   rows.next();
	   if(rows.hasNext())
	   {
		   Row r = rows.next();
		   XSSFRow row = (XSSFRow) r;
	   }
	   
   }
}
