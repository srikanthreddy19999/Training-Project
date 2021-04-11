package com.alerts.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class Locators 
{
	public Properties prop;
   public Locators()
   {
	   Properties prop = new Properties();
	   File file = new File(System.getProperty("user.dir")+"//src//main//java//com//alerts//properties//elementspath.properties");
	   FileInputStream fis;
	try {
		fis = new FileInputStream(file);
		prop.load(fis);
		this.prop = prop;
	} catch (Exception e1) {
		e1.printStackTrace();
	}
	  
   }
   
  public By getWebelementsPath(String pathname)
  {
	  By path = By.xpath(prop.getProperty(pathname));
	  return path;
  }
 
}
