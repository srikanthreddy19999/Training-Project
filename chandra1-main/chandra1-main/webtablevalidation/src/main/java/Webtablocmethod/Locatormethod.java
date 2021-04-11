package Webtablocmethod;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locatormethod 
{
	public Properties prop;
	FileInputStream fis;
   public Locatormethod() throws Exception
   {
	   Properties prop = new Properties();
	   File file = new File(System.getProperty("user.dir")+"//src//main//java//webtablelocators//locators.properties");
	   FileInputStream fis = new FileInputStream(file);
	   prop.load(fis);
	   this.fis = fis;
	   this.prop = prop;
   }
   public String getexcelfilepath()
   {
	   String url = prop.getProperty("excelpath");
	   return url;
   }
   
   public By getHeaderPath(String headername)
   {
	   By name = By.xpath(prop.getProperty(headername));
	   return name;
   }
  
//   public void getColdata(WebDriver driver)
//	{
//		  prop.getProperty("webtablepath")); WebElement webtable = driver.findElement(
//		  
//	
//   }
}
