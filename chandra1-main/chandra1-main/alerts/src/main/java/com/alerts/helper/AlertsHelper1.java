package com.alerts.helper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.alerts.util.Locators;
import com.alerts.util.Spreadsheetdata;

public class AlertsHelper1 
{
	Locators locator;
	 Spreadsheetdata data;
	 WebDriverWait wait ;
	 Alert alertmessage;
   public AlertsHelper1(WebDriver driver)
   {
	  
	   Locators locator  = new Locators();
	   Spreadsheetdata data = new Spreadsheetdata();
	   WebDriverWait wait  = new WebDriverWait(driver, 5);
	   this.locator = locator;
	   this.data = data;
	   this.wait = wait;
	  
   }
   
   public void verifyAlertframewindow(WebDriver driver)
   {
	   try
	   {
		 WebElement element =   wait.until(ExpectedConditions.visibilityOfElementLocated(locator.getWebelementsPath("Alerts,Frame,windowsPath")));
		 if(element.isDisplayed())
		 {
			 driver.findElement(locator.getWebelementsPath("Alertspath")).click();
		 }
	   }
	   catch (Exception e) 
	   {
		 System.out.println("Alerts,Frame,windowsPath not found :"+e);
	   }
	   
   }
   public void verifypreseneOfAlertbutton(WebDriver driver)
   {
	try
	{
		String alerttext = wait.until(ExpectedConditions.visibilityOfElementLocated(locator.getWebelementsPath("verifyalertbuttontext"))).getText();
		String clickbuttontext = wait.until(ExpectedConditions.visibilityOfElementLocated(locator.getWebelementsPath("alertbuttonPath"))).getText();
		if(alerttext.equalsIgnoreCase(data.getText("Text", "Alert")) && clickbuttontext.equalsIgnoreCase(data.getText("Textonbutton", "Alert")))
		{
			System.out.println("text,button and button text of alert button is present");
		}
	}
	catch (Exception e) {
		System.out.println("elements not present");
	}
   }
  /* public void ActiononFirsstElement(WebDriver driver)
   {
	   try
	   {
	    driver.findElement(locator.getWebelementsPath("alertbuttonPath")).click();
	    Alert alertmessage = driver.switchTo().alert();
	    String text = alertmessage.getText();
	   if(text.equalsIgnoreCase(data.getText("alertmessage", "Alert")))
	   {
		  alertmessage.accept();
	   }
	  }
	   catch (Exception e) {
		System.out.println("alert message not matching :"+e);
	}
   } */
  /* public void verificationofAfterFivsecAlert(WebDriver driver)
   {
	   try
	   {
		   driver.findElement(locator.getWebelementsPath("timealertbuttonpath")).click();
		   Alert alertmessage = driver.switchTo().alert();
		   wait.until(ExpectedConditions.visibilityOfElementLocated(null))
	   }
   } */
}
