package testing;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class practiceform {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandrashekar.t\\Desktop\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("chandrashekar");
		driver.findElement(By.cssSelector("input#lastName")).sendKeys("T");
		driver.findElement(By.cssSelector("input#userEmail"));
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		driver.findElement(By.cssSelector("input#userNumber")).sendKeys("7019233657");
	   // driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\chandrashekar.t\\Desktop\\image\\download.jpg");  /* this is one method*/
	    driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("dallas");
	    
	    
	    
	    WebElement state = driver.findElement(By.id("state"));
	    state.click();
	    
	    WebElement setvalue = driver.findElement(By.xpath("//div[contains(text(),'NCR')]"));
	    setvalue.click();
	    
	    WebElement city = driver.findElement(By.cssSelector("div#city"));
	    city.click();
	    
	    WebElement setcity = driver.findElement(By.xpath("//div[contains(text(),'Delhi')]"));
	    setcity.click();  // one way for selecting elements in dropdown i.e if it does not contain select tagname.
	    
	    
	   /* Select select = new Select(driver.findElement(By.id("state")));
	    select.selectByVisibleText("NCR");
	    
	    Select city = new Select(driver.findElement(By.id("city")));
	    city.selectByValue("Haryana"); */ // another method using select class this can be used only when it contains select tagname 
	    
	  
	    
	    
	     driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("physics");
	      Robot rb = new Robot();
	      
	      rb.keyPress(KeyEvent.VK_ENTER);
	      rb.keyRelease(KeyEvent.VK_ENTER);
	    
	    
	    
	    
	    
	      driver.findElement(By.xpath("//label[contains(text(),'Select picture')]")).click();
	    
	      Robot robot = new Robot();
	
			
	    StringSelection strselection = new StringSelection("C:\\Users\\chandrashekar.t\\Desktop\\image\\download.jpg");
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(strselection, null);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		String month = "September 2021";
	    String day = "20";
	    driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).click();
	    
	    while(true)
	    {
	    	 String text = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]")).getText();
	    	 
	    	 if(text.equals(month))
	    	 {
	    		 break;
	    	 }
	    	 else
	    	 {
	    		 driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/button[2]")).click();
	    	 }
	    }
	  
	    driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[contains(text(),'20')]")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
	  
	}	
	
}