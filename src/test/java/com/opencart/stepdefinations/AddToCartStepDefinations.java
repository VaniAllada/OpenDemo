package com.opencart.stepdefinations;


import java.util.Properties;

import com.opencart.factory.DriverFactory;
import com.opencart.pages.AddToCartPage;




import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCartStepDefinations extends DriverFactory {

	//Variables Initialization 
	   public static Properties prop;
	   AddToCartPage addToCartPage;
	   
	   @When("^mouse over the desktop and click the mac from dropdown$")
	   public void mouse_over_the_desktop_and_click_the_mac_from_dropdown() throws Throwable {
		   addToCartPage=new AddToCartPage(DriverFactory.getDriver());				
		   addToCartPage.mouseOverDesktopAndClickOnMac();
	   }

	   @Then("^scrolldown and add cart to the item$")
	   public void scrolldown_and_add_cart_to_the_item() throws Throwable {
		   addToCartPage.addItemToCart();
		   addToCartPage.getSuccessMsgAfterAddToCart();
	   }
	   

	   
}
