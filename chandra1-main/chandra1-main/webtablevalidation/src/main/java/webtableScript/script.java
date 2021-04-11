package webtableScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Helper;

public class script {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandrashekar.t\\Desktop\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		
		Helper helper = new Helper();
		helper.getFirstName(driver);
		helper.getlastName(driver);
		helper.getAge(driver);
		helper.getEmail(driver);
		helper.getSalary(driver);
		helper.getDepartment(driver);
		helper.getAction(driver);

	}

}
