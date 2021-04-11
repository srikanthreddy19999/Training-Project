package com.alerts.util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Spreadsheetdata 
{
	Locators locator;
	 XSSFSheet sheet;
	 String cellValue;
   public Spreadsheetdata()
   {
	   Locators locator = new Locators();
	   File file = new File(locator.prop.getProperty("alertExcelPath"));
		 FileInputStream fs;
		try {
			fs = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			 XSSFSheet sheet = workbook.getSheet("Sheet1");
			 this.sheet = sheet;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
   }
   
   public String getText(String colName, String rowName)
   {
	   Row row = sheet.getRow(0);
	   Cell cell = row.getCell(0);
   
	   
	       int rowcount=sheet.getLastRowNum();
	       int cellcount= row.getLastCellNum();
	       for(int rows=0;rows<=rowcount;rows++) {
	       for(int cells=0;cells<cellcount;cells++) {
	       if(sheet.getRow(rows).getCell(cells).getStringCellValue().equalsIgnoreCase(rowName)) {



	       for(int rows1=0;rows1<=rowcount;rows1++) {
	       for(int cells1=0;cells1<cellcount;cells1++) {


	            if(sheet.getRow(rows1).getCell(cells1).getStringCellValue().equalsIgnoreCase(colName)) {

	          System.out.println(sheet.getRow(rows).getCell(cells1).getStringCellValue());
	       String alert=sheet.getRow(rows).getCell(cells1).getStringCellValue();
	       return alert;
	            }
	       }
	     }
	   }
	 }
   }
		return null;

   }
   
}
