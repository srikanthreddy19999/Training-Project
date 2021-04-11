package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Webtablehelper;

public class webtablescript 
{
   public static void main(String[] args) 
   {
	
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandrashekar.t\\Desktop\\Chromedriver\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://demoqa.com/webtables");
	   
	   Webtablehelper helper = new Webtablehelper();
	   
	   helper.getTableSize(driver);
	   
}
}
