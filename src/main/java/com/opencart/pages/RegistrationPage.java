package com.opencart.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.opencart.factory.DriverFactory;
import com.opencart.utils.TestUtils;

public class RegistrationPage extends DriverFactory {

	private WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void MyAccountClick() {
		
		WebElement myAcc=driver.findElement(By.xpath("//a[@title='My Account']"));
		myAcc.click();
		
		WebElement registerClick=driver.findElement(By.xpath("//a[text()='Register']"));	
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
		act.moveToElement(registerClick).perform();
		registerClick.click();
		}
	
    public void checkConditions() {
    	WebElement checkConditionBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
    	checkConditionBtn.click();
    	
    }
    
    public void clickContinueBtn() {
    	WebElement continueBtn=driver.findElement(By.xpath("//input[@type='submit']"));
    	continueBtn.click();
    	
    }
    
    public void errorMessageShown() {
    	//WebElement errorMsg=driver.findElement(By.xpath("//div[@class='text-danger']"));
    	WebElement errorMsg=driver.findElement(By.xpath("//*[@id=\"account\"]/div[5]/div/div"));
    	
    	System.out.println(errorMsg.getText());
    }
   
    
    public void registerExcel(String firstName1, String lastName1, String email1, String telephone1, String password1, String pwdConfirm1 )
    {
    	WebElement fn=driver.findElement(By.xpath("//input[@id='input-firstname']"));
    	fn.sendKeys(firstName1);
    	
    	WebElement ln=driver.findElement(By.xpath("//input[@id='input-lastname']"));
    	ln.sendKeys(lastName1);
     
    	WebElement eId=driver.findElement(By.xpath("//input[@id='input-email']"));
    	eId.sendKeys(email1);
    	
    	WebElement phnNum=driver.findElement(By.xpath("//input[@id='input-telephone']"));
    	phnNum.sendKeys(telephone1);
    	
    	WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));
    	password.sendKeys(password1);
    	
    	WebElement cnPassword=driver.findElement(By.xpath("//input[@id='input-confirm']"));
    	cnPassword.sendKeys(pwdConfirm1);
    	
        }
	   
}
