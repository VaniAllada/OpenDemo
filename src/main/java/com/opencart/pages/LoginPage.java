package com.opencart.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.opencart.utils.TestUtils;
import com.opencart.factory.DriverFactory;

public class LoginPage extends DriverFactory {
	
	private WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void MyAccountClick() {
		
		WebElement myAcc=driver.findElement(By.xpath("//a[@title='My Account']"));
		myAcc.click();
		
		WebElement loginClick=driver.findElement(By.xpath("//a[text()='Login']"));		
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
		act.moveToElement(loginClick).perform();
		loginClick.click();
		}
	
	 public void enterEmail(String emailId) {
	    	WebElement eId=driver.findElement(By.xpath("//input[@id='input-email']"));
	    	eId.sendKeys(emailId);
	    }
	    
	 public void enterPassword(String password) {
	    	WebElement pwd=driver.findElement(By.xpath("//input[@id='input-password']"));
	    	pwd.sendKeys(password);
	    }
	   public void clickLoginBtn() {
	    	WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
	    	loginBtn.click();
	    	
	    }
	   
}
