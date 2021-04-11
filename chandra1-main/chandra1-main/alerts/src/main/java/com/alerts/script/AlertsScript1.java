package com.alerts.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.alerts.helper.AlertsHelper1;
import com.alerts.util.Locators;

public class AlertsScript1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandrashekar.t\\Desktop\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        
		   AlertsHelper1 helper = new AlertsHelper1(driver);
		   Locators locator = new Locators();
		   driver.get(locator.prop.getProperty("alertPagePath"));
		
		helper.verifyAlertframewindow(driver);
		helper.verifypreseneOfAlertbutton(driver);
	    //helper.ActiononFirsstElement(driver);
		

	}

}
