package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3_OpenGodaddydotcomandValidatePageTitle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.godaddy.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		if (title == "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN") {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		
		
		String currentURL = driver.getCurrentUrl();
		if (currentURL == "https://www.godaddy.com/") {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		
		String sourceCode = driver.getPageSource();	
		System.out.println(sourceCode);
			
		driver.quit();
	}

}
