package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
       	WebDriver driver = new ChromeDriver();
		
       	driver.get("https://www.godaddy.com/");
       	driver.manage().window().maximize();
		driver.quit();
	}

}
