package excel;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper 
{	
 public void getfirstname(WebDriver driver, String name) 
 {
	connection con = new connection();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	 try
	 {
		WebElement fname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(con.firstnamepath)));
		 if(fname.isDisplayed())
		 {
			driver.findElement(By.xpath(con.firstnamepath)).sendKeys(name);
		 }
	 }
	 catch(Exception e)
	 {
		 System.out.println("element not found");
	 }
 }
	 
	 public void lastName(WebDriver driver)
	 {
		 connection con = new connection();
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 try
		 {
			 WebElement lname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(con.lastnamepath)));
			 if(lname.isDisplayed())
			 {
				 driver.findElement(By.xpath(con.lastnamepath)).sendKeys(con.lastname);
			 }
		 }
		 catch (Exception e) {
		 System.out.println("element not found");
		}
		 
	 }
	 
	 public void getemail(WebDriver driver)
	 {
		 connection con = new connection();
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 try
		 {
			 WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(con.emailpath)));
			 if(email.isDisplayed())
			 {
				 driver.findElement(By.xpath(con.emailpath)).sendKeys(con.emailid);
			 }
		 }
		 catch (Exception e) {
		 System.out.println("element not found");
		}
	 }
	 public void getgender(WebDriver driver)
	 {
		 connection con = new connection();
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 try
		 {
			 WebElement gender = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(con.gender)));
			 if(gender.isDisplayed())
			 {
				 driver.findElement(By.xpath(con.gender)).click();
			 }
		 }
		 catch (Exception e) {
		 System.out.println("element not found");
		}
	 }
	 public void getmobilenum(WebDriver driver)
	 {
		 connection con = new connection();
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 try
		 {
			 WebElement mobnum = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(con.mobilenum)));
			 if(mobnum.isDisplayed())
			 {
				 driver.findElement(By.xpath(con.mobilenum)).sendKeys(con.mobno);
			 }
		 }
		 catch (Exception e) {
		 System.out.println("element not found");
		}
	 }
	 public void getsubject(WebDriver driver)
	 {
		 connection con = new connection();
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 try
		 {
			 WebElement subject = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(con.subjectpath)));
			 if(subject.isDisplayed())
			 {
				 driver.findElement(By.xpath(con.subjectpath)).sendKeys(con.subject);
				 Robot rb = new Robot();
				    
				    rb.keyPress(KeyEvent.VK_ENTER);
				    rb.keyRelease(KeyEvent.VK_ENTER);
			 }
		 }
		 catch (Exception e) {
		 System.out.println("element not found");
		}
	 }
	public void gethobbies(WebDriver driver)
	 {
		 connection con = new connection();
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 try
		 {
			 WebElement hobbies = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(con.hobbiespath)));
			 if(hobbies.isDisplayed())
			 {
				 driver.findElement(By.xpath(con.hobbiespath)).click();
				 Robot rb = new Robot();
				    
				    rb.keyPress(KeyEvent.VK_ENTER);
				    rb.keyRelease(KeyEvent.VK_ENTER);
			 }
		 }
		 catch (Exception e) {
		 System.out.println("element not found");
		}
	 }
	 public void getimage(WebDriver driver) 
	 {
		 connection con = new connection();
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 try
		 {
			 WebElement image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(con.imagepath)));
			 if(image.isDisplayed())
			 {
				 driver.findElement(By.xpath(con.imagepath)).sendKeys(con.imageaddress);
			
			 }
		 }
		 catch (Exception e) {
		 System.out.println("element not found");
		}
		 
	 }
	public void getcurrentaddress(WebDriver driver) 
	 {
		 connection con = new connection();
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 try
		 {
			 WebElement address = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(con.currentaddess)));
			 if(address.isDisplayed())
			 {
				 driver.findElement(By.xpath(con.currentaddess)).sendKeys(con.address);
			
			 }
		 }
		 catch (Exception e) {
		 System.out.println("element not found");
		}
	 }  
	
	public void getsubmitbutton(WebDriver driver) 
	 {
		 connection con = new connection();
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 try
		 {
			 WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(con.submitpath)));
			 if(submit.isDisplayed())
			 {
				 driver.findElement(By.xpath(con.submitpath)).click();
				
			 }
		 }
		 catch (Exception e) {
		 System.out.println("element not found");
		}
 }  
	
	 
	
 }

	

	
		
 



