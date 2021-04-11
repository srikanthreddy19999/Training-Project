package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\chandrashekar.t\\Desktop\\firefoxdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium"+Keys.ENTER);
		
	}

}
