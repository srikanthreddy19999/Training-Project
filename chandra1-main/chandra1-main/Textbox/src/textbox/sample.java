package textbox;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample 
{
	
	public static void main(String[] args) throws Exception 
	{
		Properties prop = new Properties();
		
		File file = new File(System.getProperty("user.dir")+"//src//textbox//test.properties");
		
		FileInputStream fps = new FileInputStream(file);
		prop.load(fps);
		System.setProperty("webdriver.chrome.driver", prop.getProperty("driverlink"));
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath(prop.getProperty("fullname"))).sendKeys(prop.getProperty("name"));
		driver.findElement(By.xpath(prop.getProperty("emailadd"))).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath(prop.getProperty("addressurl"))).sendKeys(prop.getProperty("address"));
		
		driver.findElement(By.xpath(prop.getProperty("submit"))).click();
		
		Thread.sleep(2500);
		
		driver.findElement(By.xpath(prop.getProperty("nextpage"))).click();
		//driver.findElement(By.xpath(prop.getProperty("uncheckbox"))).click();
		
		//Thread.sleep(2000);
		//driver.findElement(By.xpath(prop.getProperty("checkbox"))).click();
		
		if(driver.findElement(By.xpath(prop.getProperty("uncheckbox"))).isDisplayed())
{
		System.out.println("radio box is unchecked");
}else
{
	System.out.println("radio box is checked");
}
		driver.findElement(By.xpath(prop.getProperty("home"))).click();
		Thread.sleep(250);
		driver.findElement(By.xpath(prop.getProperty("desktop"))).click();
		
	}
}
