package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Webtablocmethod.Locatormethod;
import spreadsheet.Spreadsheet;

public class Helper 
{
	Locatormethod locator;
	Spreadsheet sheet;
  public Helper() throws Exception
  {
	  Locatormethod locator = new Locatormethod();
	  Spreadsheet sheet = new Spreadsheet();
	  this.locator=locator;
	  this.sheet=sheet;
  }
  public void getFirstName(WebDriver driver)
  {
	  By firstNamepath =   locator.getHeaderPath("firstname");
	  String firstname = driver.findElement(firstNamepath).getText();
	  String excelfirstname = sheet.getExcelHeaderName(0,0);
	  
	  if(firstname.equalsIgnoreCase(excelfirstname))
	  {
		  System.out.println("matching element found is :"+firstname);
	  }
	  else
	  {
		  System.out.println("no matching element found");
	  }
  }
  public void getlastName(WebDriver driver)
  {
	  By lastNamepath =   locator.getHeaderPath("LastName");
	  String lastname = driver.findElement(lastNamepath).getText();
	  String excellastname = sheet.getExcelHeaderName(0,1);
	  
	  if(lastname.equalsIgnoreCase(excellastname))
	  {
		  System.out.println("matching element found is :"+lastname);
	  }
	  else
	  {
		  System.out.println("no matching element found");
	  }
  }
  public void getAge(WebDriver driver)
  {
	  By Agepath =   locator.getHeaderPath("Age");
	  String Age = driver.findElement(Agepath).getText();
	  String excelage = sheet.getExcelHeaderName(0,2);
	  
	  if(Age.equalsIgnoreCase(excelage))
	  {
		  System.out.println("matching element found is :"+Age);
	  }
	  else
	  {
		  System.out.println("no matching element found");
	  }
  }
  public void getEmail(WebDriver driver)
  {
	  By emailpath =   locator.getHeaderPath("Email");
	  String email = driver.findElement(emailpath).getText();
	  String excelemail = sheet.getExcelHeaderName(0,3);
	  
	  if(email.equalsIgnoreCase(excelemail))
	  {
		  System.out.println("matching element found is :"+email);
	  }
	  else
	  {
		  System.out.println("no matching element found");
	  }
  }
  public void getSalary(WebDriver driver)
  {
	  By salarypath =   locator.getHeaderPath("Salary");
	  String salary = driver.findElement(salarypath).getText();
	  String excelsalary = sheet.getExcelHeaderName(0,4);
	  
	  if(salary.equalsIgnoreCase(excelsalary))
	  {
		  System.out.println("matching element found is :"+salary);
	  }
	  else
	  {
		  System.out.println("no matching element found");
	  }
  }
  public void getDepartment(WebDriver driver)
  {
	  By departmentpath =   locator.getHeaderPath("Department");
	  String department = driver.findElement(departmentpath).getText();
	  String exceldepartment = sheet.getExcelHeaderName(0,5);
	  
	  if(department.equalsIgnoreCase(exceldepartment))
	  {
		  System.out.println("matching element found is :"+department);
	  }
	  else
	  {
		  System.out.println("no matching element found");
	  }
  }
  public void getAction(WebDriver driver)
  {
	  By actionpath =   locator.getHeaderPath("Action");
	  String action = driver.findElement(actionpath).getText();
	  String excelaction = sheet.getExcelHeaderName(0,6);
	  
	  if(action.equalsIgnoreCase(excelaction	))
	  {
		  System.out.println("matching element found is :"+action);
	  }
	  else
	  {
		  System.out.println("no matching element found");
	  }
  }
}
