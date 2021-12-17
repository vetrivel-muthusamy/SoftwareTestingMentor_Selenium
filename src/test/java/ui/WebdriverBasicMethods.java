package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverBasicMethods {
	
	public static String browser = "Firefox"; //Assuming this input getting from external File like XLS, CSV (Configuration)
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("Chrome")) {
			WebDriverManager.chromiumdriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
				
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		driver.navigate().to("https://www.google.com/");
		String tpageTitle = driver.getTitle();
		System.out.println(tpageTitle);
		driver.quit();
		
		
		
		
		
		
		
		driver.quit();
	}

}
