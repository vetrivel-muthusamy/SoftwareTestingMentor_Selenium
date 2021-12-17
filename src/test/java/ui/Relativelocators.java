package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Relativelocators {
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
		
		
		By emailLocator = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
		By passwordLocator = RelativeLocator.with(By.tagName("input")).below(By.id("email"));
		By cancelLocator = RelativeLocator.with(By.tagName("button")).toLeftOf(By.id("submit"));
		By submitLocator = RelativeLocator.with(By.tagName("button")).toRightOf(By.id("cancel"));
		By emailLocator1 = RelativeLocator.with(By.tagName("input")).near(By.id("lbl-email"));
		
		driver.quit();
	}

}
