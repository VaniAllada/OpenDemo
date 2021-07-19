package com.opencart.pages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.opencart.utils.TestUtils;

public class PlaceAnOrder {

	//Variable Declartion
	private WebDriver driver;
	
	//Desc- PlaceAnOrder constructor
	public PlaceAnOrder(WebDriver driver) {
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
	
	public void selectFutureDate() {
		WebElement futureDt = driver.findElement(By.xpath("//input[@id='input-option225']"));	
		futureDt.clear();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
	    Date date = new Date();
	    String todaysDate = dateFormat.format(date);
	    System.out.println(todaysDate);


	    String month=todaysDate.substring(0,2);
	    String day=todaysDate.substring(3,5);
	    
	    System.out.println(month);
	    System.out.println(day);

	    int monthValue=Integer.parseInt(month); 
	    int dayValue=Integer.parseInt(day); 

	    System.out.println(monthValue);
	    System.out.println(dayValue);
	    
	    if(dayValue+14>31)
	    {
	        int temp= 31-dayValue;
	        dayValue=14-temp;
	        monthValue=monthValue+1;
	    }
	    else
	    {
	        dayValue=dayValue+14;
	    }
	    String newDay = monthValue+"-"+dayValue+"-"+"2021";
	    System.out.println(newDay);
	    
	    futureDt.sendKeys(newDay);
	}
	
	public void laptopAddToCart() {
		WebElement addCart = driver.findElement(By.xpath("//button[text()='Add to Cart']"));
		addCart.click();		
	}
	
//	public void clickBasket() {
//		WebElement addCart = driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']"));
//		addCart.click();	
//	}
//	
	public void shoppinpCartClick() {
		WebElement shopCart = driver.findElement(By.xpath("//span[text()='Shopping Cart']"));
		shopCart.click();	
	}
	
	public void checkoutClicked() {
       WebElement remove = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/span/button[2]"));
		
		remove.click();
		//WebElement checkoutClick = driver.findElement(By.xpath("//a[text()='Checkout']"));
	//	WebElement checkoutClick = driver.findElement(By.xpath("//a[contains(text(),'Checkout')]"));
		WebElement checkoutClick = driver.findElement(By.xpath("//a[@title='Checkout']"));
		
		checkoutClick.click();		
	}
	
	public void billingDetails() {
		
		
		WebElement firstName = driver.findElement(By.xpath("//*[@id='input-payment-firstname']"));
		
//		WebElement firstName = driver.findElement(By.id("//*[@id="input-payment-firstname"]"));
		firstName.sendKeys("durga");
		
		WebElement lastName = driver.findElement(By.xpath("//*[@id='input-payment-lastname']"));
		//WebElement lastName = driver.findElement(By.id("input-payment-lastname"));
		lastName.sendKeys("bhavani");
		
		WebElement address1 = driver.findElement(By.xpath("//*[@id=\"input-payment-address-1\"]")); 
	//	WebElement address1 = driver.findElement(By.id("input-payment-address-1"));
		address1.sendKeys("11thstreet, pallikarani");
		
		WebElement city = driver.findElement(By.xpath("//*[@id=\"input-payment-city\"]")); 
		//WebElement city = driver.findElement(By.id("input-payment-city"));
		city.sendKeys("Chennai");
		
		WebElement postCode = driver.findElement(By.xpath("//*[@id=\"input-payment-postcode\"]")); 
		//WebElement postCode = driver.findElement(By.id("input-payment-postcode"));
		postCode.sendKeys("566625");
		
		WebElement countryDropDown = driver.findElement(By.xpath("//*[@id=\"input-payment-country\"]")); 
		//WebElement countryDropDown = driver.findElement(By.id("input-payment-country"));
		Select select = new Select(countryDropDown);
		 select.selectByVisibleText("Turkey");
		 
		 WebElement regienDropDown = driver.findElement(By.xpath("//*[@id=\"input-payment-zone\"]")); 
		// WebElement regienDropDown = driver.findElement(By.id("input-payment-zone"));
			Select regSelect = new Select(regienDropDown);
			regSelect.selectByVisibleText("Anglesey");
		 
			WebElement continueBtn = driver.findElement(By.xpath("//*[@id=\"button-payment-address\"]")); 
			//WebElement continueBtn = driver.findElement(By.id("button-payment-address"));
			continueBtn.click();
		
		
	}
	
	public void deliveryDetails() {
		
		WebElement continueshippingBtn = driver.findElement(By.xpath("//input[@id='button-shipping-address']")); 		
		continueshippingBtn.click();
		
		WebElement comments = driver.findElement(By.xpath("//textarea[@name='comment']")); 		
		comments.sendKeys("Please deliver the product on time");
		
		WebElement continueOnComments = driver.findElement(By.xpath("//input[@id='button-shipping-method']")); 		
		continueOnComments.click();
	}
	
	public void acceptTermsAndConditions() {
		WebElement termsConditionsBtn = driver.findElement(By.xpath("//input[@name='agree']")); 		
		termsConditionsBtn.click();
		
		WebElement continueTermsBtn = driver.findElement(By.xpath("//*[@id=\"button-payment-method\"]")); 		
		continueTermsBtn.click();
		
	}
	
	public void confirmOrder() {
		WebElement confirmOrderBtn = driver.findElement(By.xpath("//input[@id='button-confirm']")); 		
		confirmOrderBtn.click();
	}
	
	
	
}
