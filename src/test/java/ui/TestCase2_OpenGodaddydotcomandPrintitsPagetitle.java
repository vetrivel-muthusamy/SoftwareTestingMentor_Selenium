package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2_OpenGodaddydotcomandPrintitsPagetitle {

	public static void main(String[] args) {
		
		WebDriverManager.chromiumdriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.godaddy.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Page Title: "+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL: "+currentUrl);
		
		driver.quit();
		
		

	}

}
