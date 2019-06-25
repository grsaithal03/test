package web.greyatom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {

	public final WebDriver driver;


	public PageObject(WebDriver driver) {
		
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "emailId")
	private WebElement email;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "signInButton")
	private WebElement signIn;
	
	
	@FindBy(xpath = "//span[contains(text(),'Introduction to Programming')]")
	private WebElement program;
	
	@FindBy(xpath = "//div[@id='conceptCard2']//span[contains(text(),'View')]")
	private WebElement view;
	
	@FindBy(xpath = "//div[contains(@class,'br-radius-circle')]")
	private WebElement menu;
	
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logOut;
	
	@FindBy(xpath = "//button[@id='conceptDetailOutline']")
	private WebElement outLine;
	
	@FindBy(xpath = "//div[contains(text(),'Values in Python')]")
	private WebElement python;
	
	@FindBy(xpath = "//div[contains(@class,'view-lines')]//div[4]")
	private WebElement line;
	
	@FindBy(xpath = "//div[contains(text(),'SUBMIT')]")
	private WebElement submitButton;
	
	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	private WebElement continueButton;
	
	
	public void email(String text) {
		email.sendKeys(text);
	}
	
	public void password(String text) {
		password.sendKeys(text);
	}
	
	public void signIn() {
		signIn.click();
	}
	
	public void menu() {
		menu.click();
	}
	
	public void logOut() {
		logOut.click();
	}
	
	public void outLine() {
		outLine.click();
	}
	
	public void python() {
		python.click();
	}
	
	public void line() {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElement.value='print(\\\"Hello GreyAtom\\\")';", line);
		
		//line.sendKeys("print(\"Hello GreyAtom\")");
	}
	
	public void submitButton() {
		submitButton.click();
	}
	
	public void continueButton() {
		continueButton.click();
	}
	
	public void waitByXPath(String text) {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(text)));
	}
	
	public void viewProgram() {
		Actions action = new Actions(driver);
		
		action.moveToElement(program).perform();
		
		action.moveToElement(view);
		
		action.click().perform();
		

	}
}
