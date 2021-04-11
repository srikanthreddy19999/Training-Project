package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubelocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandrashekar.t\\Desktop\\Chromedriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.youtube.com/");
		d.manage().window().maximize();
		String search = "telugusongs";
		//d.findElement(By.id("search")).sendKeys("chicchore"+Keys.ENTER);
		//d.findElement(By.cssSelector("input[id='search']")).sendKeys(search+Keys.ENTER);
		//d.findElement(By.xpath("//input[@id='search']")).sendKeys(search+Keys.ENTER);
		d.findElement(By.xpath("//input[@id='search']")).sendKeys(search+Keys.ENTER);
	}

}
