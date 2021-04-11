package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.StudentRegHelper;
import page.Pages;



public class FormFillStudentsReg 
{
	 
	public static void main(String[] args) throws Exception 
	{
		Pages pages = new Pages();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandrashekar.t\\Desktop\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(pages.getStudregPathUrl());
		driver.manage().window().maximize();
	
	StudentRegHelper helper = new StudentRegHelper();
	helper.enterFirstName(driver,"chandu");
	helper.enterLastName(driver, "shekar");
	helper.enterEmailId(driver, "chan11@gmail.com");
	helper.enterGender(driver);
	helper.enterMobileNum(driver, "9898989898");
	helper.enterHobbies(driver);
	helper.enterAddress(driver, "Dallas");
	helper.submit(driver);
	}
}
