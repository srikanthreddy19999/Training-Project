package helper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.webtablepages;

public class Webtablehelper 
{
	 webtablepages pages; 
   public void getTableSize(WebDriver driver)
   {
	   pages = new webtablepages();
	   
	   WebDriverWait wait = new WebDriverWait(driver, 5);
	   try
	   {
	   By table = pages.getTablePath();
	   WebElement tablesize = wait.until(ExpectedConditions.visibilityOfElementLocated(table));
	   if(tablesize.isDisplayed())
	   {
		   driver.findElement(table);
		   
	   }
	  }
	 catch(Exception e)
	   {
		 System.out.println("timeout @ webtable not found :"+e);
	   }
	   List<WebElement> colWithData = driver.findElements(pages.getsecondcol());
	   System.out.println("data of second col is:");
	   for(int index=0;index<colWithData.size();index++)
	   {
		   System.out.println(colWithData.get(index).getText());
	   }
	  
   }
}
