package excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel extends Varex
{
	public static void main(String[] args) 
	{
		 Excel el = new Excel();
		 String  user =  el.getFirstName();
		 String last = el.getlastName();
		 String mail = el.getMail();
		
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandrashekar.t\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://demoqa.com/automation-practice-form");
	   
	  
	   
	   driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(user);
	   driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(last);
	   driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(mail);
	   driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
	
	}

}
