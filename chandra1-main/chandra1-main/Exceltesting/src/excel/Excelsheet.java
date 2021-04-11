package excel;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Excelsheet 
{
   public static void main(String[] args) throws Exception 
   {
	   WebElement state = null;
	   WebElement setvalue = null;
	   WebElement city = null;
	   WebElement setcity = null;
	   WebElement confirmationmssg = null;
	   Properties prop = new Properties();
	   File fl = new File(System.getProperty("user.dir")+"//src//excel//Excelfile.properties");
	   FileInputStream fis = new FileInputStream(fl);
	   prop.load(fis);
	 System.setProperty(prop.getProperty("webdriver"), prop.getProperty("webdriverurl"));
	
	 
	 File file = new File(prop.getProperty("excelpath"));
	 FileInputStream fs = new FileInputStream(file);
	 XSSFWorkbook wb = new XSSFWorkbook(fs);
	 XSSFSheet sheet = wb.getSheet("Sheet2");
	 
	 int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();
	 System.out.println(rowcount);
	 
	 WebDriver driver = new ChromeDriver();
	 driver.get(prop.getProperty("practiceformpath"));
	 driver.manage().window().maximize();
	  
  	WebElement firstname=driver.findElement(By.id("firstName"));
	 WebElement lastname=driver.findElement(By.id("lastName"));
     WebElement email=driver.findElement(By.id("userEmail"));
     WebElement mobilenumber=driver.findElement(By.id("userNumber"));
     WebElement subject=driver.findElement(By.id("subjectsInput"));
     WebElement address=driver.findElement(By.id("currentAddress"));
     WebElement submitBtn=driver.findElement(By.id("submit")); 
  
  /*  for(int i=0;i<=rowcount;i++)
    {
    	Row row = sheet.getRow(i);
    	System.out.println("row"+i+"data is :");
    	
    	for(int j=0;j<row.getLastCellNum();j++)
     	{
    		Cell cell = row.getCell(j);
    		switch (cell.getCellType()) {
			case STRING:
				System.out.print(row.getCell(j).getStringCellValue()+" ");
				break;

			case NUMERIC:
				System.out.print(row.getCell(j).getNumericCellValue()+" ");
				break;
			}
    	}
    	System.out.println();
    } */
    
     // code to validated successfull submission of form
 
	 for(int i=1;i<=rowcount;i++)
	 { 
		
		Thread.sleep(1000);
    firstname.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
    lastname.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
    email.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
    driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
    

    mobilenumber.sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
    driver.findElement(By.id("uploadPicture")).sendKeys(prop.getProperty("imagepath"));
    driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
    
   subject.sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
    Robot rb = new Robot();
    
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    
    address.sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
    
    
    
    state = driver.findElement(By.id("state"));
    state.click();
    
     setvalue = driver.findElement(By.xpath("//div[contains(text(),'NCR')]"));
    setvalue.click();
    
   city = driver.findElement(By.cssSelector("div#city"));
    city.click();
    
   setcity = driver.findElement(By.xpath("//div[contains(text(),'Delhi')]"));
    setcity.click();  
    
    Thread.sleep(200);
    
    submitBtn.click();
    
    
  confirmationmssg =  driver.findElement(By.xpath("//div[contains(text(),'Thanks for submitting the form')]"));
  
  if(confirmationmssg.isDisplayed())
  {
	  System.out.println("Form submitted successfully");
  }
  else {
	  System.out.println("insufficient details");
  }
    
 Thread.sleep(500); 
 
 driver.findElement(By.xpath("//*[@id=\"closeLargeModal\"]")).click();

	 }
   }
}
  
   