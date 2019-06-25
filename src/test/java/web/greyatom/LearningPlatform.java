package web.greyatom;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LearningPlatform  extends BaseTest {
	
	@Test
	public void testProgram() {
		
		PageObject po = new PageObject(driver);
		
		String user = "grsaithal@gmail.com";
		
		String pwd = "letmein1";
		
		driver.navigate().to("https://id.greyatom.com");
		
		po.email(user);
		
		po.password(pwd);
		
		po.signIn();
		
		po.waitByXPath("//span[contains(text(),'Confirm')]");
		
		driver.switchTo().activeElement().findElement(By.xpath("//span[contains(text(),'Confirm')]")).click();
		
		po.waitByXPath("//div[contains(text(),'Pre Work :: Data Science')]");
		
		po.continueButton();
		
		po.waitByXPath("//span[contains(text(),'Introduction to Programming')]");
		
		po.viewProgram();
		
		po.outLine();
		
		po.python();
		
		po.waitByXPath("//div[contains(@class,'view-lines')]//div[4]");
		
		po.submitButton();
		
		po.waitByXPath("//*[contains(text(),'Result')]");
		
		po.waitByXPath("//*[contains(text(),'Continue')]");
		
		driver.switchTo().activeElement();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='flex-full sup-mde-dark']")).getText());
		
		po.menu();
		
		po.logOut();
		
		

	}

}
