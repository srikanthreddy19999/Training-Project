package excel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandrashekar.t\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.name("cusid")).sendKeys("5644545");
	driver.findElement(By.name("submit")).click();
	
	Alert alert = driver.switchTo().alert();
	
	String alertmessage = alert.getText();
	
	System.out.println(alertmessage);
	Thread.sleep(5000);
	
	alert.accept();
	

	}

}
