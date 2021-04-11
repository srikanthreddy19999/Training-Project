package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Iedriver {

	public static void main(String[] args) 
	{
	   System.setProperty("webdriver.ie.driver", "C:\\Users\\chandrashekar.t\\Desktop\\IEdriver\\IEDriverServer.exe");
	   WebDriver dl = new InternetExplorerDriver();
	   dl.get("https://www.google.com/");
	   dl.manage().window().maximize();
	   dl.findElement(By.name("q")).sendKeys("atmecs"+Keys.ENTER);
	   
	}

}
