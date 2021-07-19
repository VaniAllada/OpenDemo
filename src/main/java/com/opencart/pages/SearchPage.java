package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

	//Variables Initialization 
	private WebDriver driver;
	
	//Desc- search page constructor
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//methods
	public void searchTheIphone() {
		WebElement searchIphone = driver.findElement(By.xpath("//input[@name='search']"));	
		searchIphone.sendKeys("iphone");
		searchIphone.sendKeys(Keys.ENTER);
	}
	
	public void selectIphoneAndEnterQuantity() {
		WebElement selectIphone = driver.findElement(By.xpath("//a[contains(text(),'iPhone')]"));	
		selectIphone.click();
		
		WebElement quantityNum = driver.findElement(By.xpath("//input[@id='input-quantity']"));	
		quantityNum.clear();
		quantityNum.sendKeys("2");
		
	}
	
	public void addToCart() {
		WebElement addToCart = driver.findElement(By.xpath("//button[text()='Add to Cart']"));	
		addToCart.click();	
	}
	public void clickTopRightCorner() {
		WebElement shoppingCart = driver.findElement(By.xpath("//span[text()='Shopping Cart']"));	
		shoppingCart.click();	
	}
	
	public void checkOutBtnClick() {
		WebElement checkOutBtn = driver.findElement(By.xpath("//span[text()='Checkout']"));	
		checkOutBtn.click();	
	}
	
}
