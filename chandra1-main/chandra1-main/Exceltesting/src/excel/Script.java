package excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script {

	public static void main(String[] args) throws Exception 
	{
		connection conec = new connection();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandrashekar.t\\Desktop\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(conec.practiceformpath);
		driver.manage().window().maximize();
	
	Helper h1 = new Helper();
	h1.getfirstname(driver,"chandu");
	h1.lastName(driver);
	h1.getemail(driver);
	h1.getgender(driver);
	h1.getmobilenum(driver);
	h1.getsubject(driver);
	h1.gethobbies(driver);
	h1.getimage(driver);
	h1.getcurrentaddress(driver);
	h1.getsubmitbutton(driver);
	}
}
