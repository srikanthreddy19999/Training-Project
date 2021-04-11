package pages;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class webtablepages 
{
	Properties prop = new Properties();
    public webtablepages()
    {
    	Properties prop = new Properties();
    	File file = new File(System.getProperty("user.dir")+"//src//locators//webtable.properties");
    	FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.prop = prop;	
    }
    
    public By getTablePath()
    {
    	By tablePath = By.xpath(prop.getProperty("TablePath"));
    	return tablePath;
    }
    public By getsecondcol()
    {
    	By secondcol = By.xpath(prop.getProperty("secondcol"));
    	return secondcol;
    }
} 
