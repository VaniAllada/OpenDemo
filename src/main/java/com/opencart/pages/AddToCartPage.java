package com.opencart.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.opencart.factory.DriverFactory;
import com.opencart.utils.TestUtils;

public class AddToCartPage extends DriverFactory {
	
	//Variable Declaration
	private WebDriver driver;
	
	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void MyAccountClick() {  // MyAccount Click Action
		WebElement myAcc=driver.findElement(By.xpath("//a[@title='My Account']"));
		myAcc.click();
		
		WebElement loginClick=driver.findElement(By.xpath("//a[text()='Login']"));	
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
		act.moveToElement(loginClick).perform();
		loginClick.click();
		}
	
	 public void enterEmail(String emailId) {   //enter email action
	    	WebElement eId=driver.findElement(By.xpath("//input[@id='input-email']"));
	    	eId.sendKeys(emailId);
	    }
	    
	 public void enterPassword(String password) {
	    	WebElement pwd=driver.findElement(By.xpath("//input[@id='input-password']"));
	    	pwd.sendKeys(password);
	    }
	   public void clickLoginBtn() { //loginbutton click action
	    	WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
	    	loginBtn.click();
	    	
	    }
	   
	   public void mouseOverDesktopAndClickOnMac() { 
		   
		   WebElement desktopClick=driver.findElement(By.xpath("//a[text()='Desktops']"));
			Actions act = new Actions(driver);
			act.moveToElement(desktopClick).perform();
			
		   driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
			 WebElement macClick=driver.findElement(By.xpath("//a[text()='Mac (1)']"));
			 macClick.click();
		 
	   }
	   
	   public void addItemToCart() {    //addTocart action
		   WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]"));
		   addToCart.click();
	   }
	   
	   public void getSuccessMsgAfterAddToCart() {
		   WebElement successMsg = driver.findElement(By.xpath("//div[text()=' Success: You have added ']"));
		   String logSuccessMsg=successMsg.getText();
		   System.out.println(logSuccessMsg);
	   }
	 
	   
//	   public void editAccount() {
//		   WebElement editAccount=driver.findElement(By.linkText("Edit your account information"));		   
//		   editAccount.click();
//	   }
//	   
//	   public void clickContinueFromEditAcc() {
//		   WebElement continueBtn=driver.findElement(By.id("input-lastname"));		   
//		   continueBtn.click();
//		   
//	   }
}
