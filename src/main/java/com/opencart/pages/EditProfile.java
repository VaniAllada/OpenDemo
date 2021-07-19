package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditProfile {
	
	//Variable Declartion
	private WebDriver driver;
	public EditProfile(WebDriver driver) {
		this.driver = driver;
	}
	
	//methods
	public void selectEditAccount() {
		WebElement editAcc=driver.findElement(By.xpath("//a[text()='Edit Account']"));
		editAcc.click();
		
	}
	public void updateLastName() {
		WebElement updateLastName=driver.findElement(By.xpath("//input[@id='input-lastname']"));
		updateLastName.clear();
		updateLastName.sendKeys("Kanaka");
		
		WebElement continueBtn=driver.findElement(By.xpath("//input[@type='submit']"));
		continueBtn.click();
	}
	
	public void getSuccessMesg() {
		
		WebElement succMsg=driver.findElement(By.xpath("//*[@id=\"account-account\"]/div[1]"));
		String sucString=succMsg.getText();
		System.out.println(sucString);
	}
	
	public void clickLogoutAndClickContinue() {	
		//WebElement logoutBtn=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		WebElement logoutBtn=driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[13]"));
		
		logoutBtn.click();
	}
	
	public void returnToHomePage() {
		WebElement continueBtn=driver.findElement(By.xpath("//a[contains(text(),'Continue')]"));
		continueBtn.click();
		
	}
	
	
}
