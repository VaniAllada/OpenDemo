package com.opencart.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.opencart.utils.TestUtils;

public class HomePage {
	
	//Variable Declaration
	private WebDriver driver;
	
	//Desc- HomePage constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//methods
	public void mouseOverTheComponentsTab() {
		WebElement componentsClick=driver.findElement(By.xpath("//a[contains(text(),'Components')]"));	
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
		act.moveToElement(componentsClick).perform();
		
	}
	
	public void clickOnMonitorsAndAppleCinema() {
		
		WebElement monitorsClick = driver.findElement(By.xpath("//a[contains(text(),'Monitors (2)')]"));	
		monitorsClick.click();
		
		WebElement appleClick = driver.findElement(By.xpath("//a[contains(text(),'Apple Cinema 30')]"));	
		appleClick.click();
		
	}
	
	public void enterAllRequiredFieldsAndUploadFile() {
		WebElement checkBox3 = driver.findElement(By.xpath("//*[@id=\"input-option223\"]/div[1]/label/input"));	
		checkBox3.click();
		
		WebElement giveText = driver.findElement(By.xpath("//input[@id='input-option208']"));	
		giveText.clear();
		giveText.sendKeys("TestingSample");
		
		WebElement colorDropDown = driver.findElement(By.xpath("//select[@id='input-option217']"));	
		 Select select = new Select(colorDropDown);
		 select.selectByVisibleText("Blue (+$3.60)");
		
		WebElement textArea = driver.findElement(By.xpath("//textarea[@id='input-option209']"));	
		textArea.sendKeys("This is test test the application");
		
		WebElement uploadClickBtn = driver.findElement(By.xpath("//button[@id='button-upload222']"));	
		uploadClickBtn.click();
		
	}
	
	public void addToCartClicked() {
		WebElement addToCartBtn = driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]"));	
		addToCartBtn.click();
	}
	
	public void fileRequiredErrorMsg() {
		WebElement fileReq = driver.findElement(By.xpath("//div[contains(text(),'File required!')]"));	
		String fileRequired=fileReq.getText();
		System.out.println(fileRequired);
		
	}
	
	
}
