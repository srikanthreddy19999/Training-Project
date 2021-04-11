package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import page.Pages;



public class StudentRegHelper
{
	 Pages pages;
	public void enterFirstName(WebDriver driver, String name)  
	 {
		try {
			pages = new Pages();
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		WebDriverWait wait = new WebDriverWait(driver, 3);
	
		 try
		 {
			By userName = pages.getusernamePath(); 
			WebElement firstname = wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
			 if(firstname.isDisplayed())
			 {
		                    driver.findElement(userName).sendKeys(name);
			 }
		 }
		 catch(TimeoutException timeOutE)
		 {
			 System.out.println("Time Out @ Student Registration Form - First Name: 1 " + timeOutE);
		 }
		 
		 catch(Exception e)
		 {
			 System.out.println("Student Registration Form - First Name: " + e);
		 }
		 
	 }
	public void enterLastName(WebDriver driver, String name)
	{
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		 try
		 {
			By userName = pages.getLastnamePath(); 
			WebElement Lastname = wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
			 if(Lastname.isDisplayed())
			 {
		                    driver.findElement(userName).sendKeys(name);
			 }
		 }
		 catch(TimeoutException timeOutE)
		 {
			 System.out.println("Time Out @ Student Registration Form - Last - Name: 1 " + timeOutE);
		 }
		 
		 catch(Exception e)
		 {
			 System.out.println("Student Registration Form -Last Name: " + e);
		 }
	}
	public void enterEmailId(WebDriver driver,String name)
	{
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		 try
		 {
			By userName = pages.getEmailIdPath(); 
			WebElement emailId = wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
			 if(emailId.isDisplayed())
			 {
		                    driver.findElement(userName).sendKeys(name);
			 }
		 }
		 catch(TimeoutException timeOutE)
		 {
			 System.out.println("Time Out @ Student Registration Form - emailId - Name: 1 " + timeOutE);
		 }
		 
		 catch(Exception e)
		 {
			 System.out.println("Student Registration Form - emailId: " + e);
		 }
	}
	public void enterGender(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		 try
		 {
			By userName = pages.getGenderPath(); 
			WebElement gender = wait.until(ExpectedConditions.elementToBeClickable(userName));
			  if(gender.isDisplayed())
			 {
		                    driver.findElement(userName).click();
			 }
		 }
		 catch(TimeoutException timeOutE)
		 {
			 System.out.println("Time Out @ Student Registration Form - gender: 1 " + timeOutE);
		 }
		 
		 catch(Exception e)
		 {
			 System.out.println("Student Registration Form -gender: " + e);
		 }
	}
	public void enterMobileNum(WebDriver driver,String mobileNum)
	{
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		 try
		 {
			By userName = pages.getMobileNumPath(); 
			WebElement mobNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
			  if(mobNumber.isDisplayed())
			 {
		                    driver.findElement(userName).sendKeys(mobileNum);
			 }
		 }
		 catch(TimeoutException timeOutE)
		 {
			 System.out.println("Time Out @ Student Registration Form - mobNumber: 1 " + timeOutE);
		 }
		 
		 catch(Exception e)
		 {
			 System.out.println("Student Registration Form -mobNumber: " + e);
		 }
	}
	public void enterHobbies(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		 try
		 {
			By userName = pages.getHobbiespath(); 
			WebElement Hobbies = wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
			  if(Hobbies.isDisplayed())
			 {
		                    driver.findElement(userName).click();
			 }
		 }
		 catch(TimeoutException timeOutE)
		 {
			 System.out.println("Time Out @ Student Registration Form - Hobbies: 1 " + timeOutE);
		 }
		 
		 catch(Exception e)
		 {
			 System.out.println("Student Registration Form -Hobbies: " + e);
		 }
	}
	public void enterAddress(WebDriver driver,String name)
	{
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		 try
		 {
			By userName = pages.currentAddress(); 
			WebElement address = wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
			  if(address.isDisplayed())
			 {
		                    driver.findElement(userName).sendKeys(name);
			 }
		 }
		 catch(TimeoutException timeOutE)
		 {
			 System.out.println("Time Out @ Student Registration Form - address: 1 " + timeOutE);
		 }
		 
		 catch(Exception e)
		 {
			 System.out.println("Student Registration Form -address: " + e);
		 }
	}
	public void submit(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		 try
		 {
			By userName = pages.submitPath(); 
			WebElement submit = wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
			  if(submit.isDisplayed())
			 {
		                    driver.findElement(userName).click();
			 }
		 }
		 catch(TimeoutException timeOutE)
		 {
			 System.out.println("Time Out @ Student Registration Form - submit: 1 " + timeOutE);
		 }
		 
		 catch(Exception e)
		 {
			 System.out.println("Student Registration Form -submit: " + e);
		 }
	}
}