package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandrashekar.t\\Chromedriver\\Chromedriver.exe");
	  WebDriver d = new ChromeDriver();
	  d.get("https://www.google.com/");
	  d.manage().window().maximize();
	  d.findElement(By.name("q")).sendKeys("selenium"+Keys.ENTER);
	}

}
