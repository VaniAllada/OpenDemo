package com.opencart.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.opencart.utils.TestUtils;

public class RemoveItemFromCart {

	//Variable Declaration
	private WebDriver driver;
	
	//Desc- RemoveItemFromCart constructor
	public RemoveItemFromCart(WebDriver driver) {
		this.driver = driver;
	}
	
	//methods
	public void mouseOnOverLaptopsAndNoteBooks() {
		
	WebElement laptopNotebook = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));	
	driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
	Actions act = new Actions(driver);
	act.moveToElement(laptopNotebook).perform();
	WebElement showAllLaptopNoteBuks = driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']"));	
	showAllLaptopNoteBuks.click();
	
	}
	
	public void selectHP() {
		//WebElement selectHp = driver.findElement(By.xpath("//a[text()='HP LP3065']"));
		WebElement selectHp = driver.findElement(By.xpath("//*[@id='content']/div[4]/div[1]/div/div[2]/div[1]/h4/a"));

		selectHp.click();		
	}
	public void laptopAddToCart() {
		WebElement addCart = driver.findElement(By.xpath("//button[text()='Add to Cart']"));
		addCart.click();		
	}
	public void shoppinpCartClick() {
		WebElement shopCart = driver.findElement(By.xpath("//span[text()='Shopping Cart']"));
		shopCart.click();	
	}
	public void removeItemFromCart() {
		WebElement removeItem = driver.findElement(By.xpath("	//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/span/button[2]"));
		removeItem.click();	
	}
	

	
}
