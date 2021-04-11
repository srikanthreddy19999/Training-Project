package page;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class Pages 
{
	Properties prop = new Properties();
	
	public Pages() throws Exception
	{
		File file = new  File(System.getProperty("user.dir")+"//src//locators//studregformlocators.properties");
	  FileInputStream fileInputStream	= new FileInputStream(file);
	 
	 Properties  prop  = new Properties();
	 prop.load(fileInputStream);
	 this.prop = prop;
	}

	public String getStudregPathUrl() 
	{
		String studregpathurl =prop.getProperty("practiceFormPath"); // use camel case
		return studregpathurl;
	}

	public By getusernamePath() 
	{
		By firstnamepath = By.xpath(prop.getProperty("firstNamePath"));
		return firstnamepath;
	}
	public By getLastnamePath()
	{
		By lastNamePath = By.xpath(prop.getProperty("lastNamePath"));
		return lastNamePath;
	}
	public By getEmailIdPath()
	{
		By emailId = By.xpath(prop.getProperty("EmailIdPath"));
		return emailId;
	}
	public By getGenderPath()
	{
		By gender = By.xpath(prop.getProperty("GenderPath"));
		return gender;
	}
	public By getMobileNumPath()
	{
		By mobileNum = By.xpath(prop.getProperty("MobileNumPath"));
		return mobileNum;
	}
	public By getHobbiespath()
	{
		By Hobbies = By.xpath(prop.getProperty("HobbiesPath"));
		return Hobbies;
	}
	public By currentAddress()
	{
		By address = By.xpath(prop.getProperty("CurrentAddress"));
		return address;
	}
	public By submitPath()
	{
		By submit = By.xpath(prop.getProperty("submit"));
		return submit;
	}
		
}
