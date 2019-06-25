package web.greyatom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\qa\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void closeBrowser() {
		
		driver.close();
	}
}
