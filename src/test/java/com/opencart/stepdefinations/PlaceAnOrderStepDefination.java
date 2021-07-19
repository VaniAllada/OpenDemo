package com.opencart.stepdefinations;

import java.util.Properties;

import com.opencart.factory.DriverFactory;
import com.opencart.pages.AddToCartPage;
import com.opencart.pages.LoginPage;
import com.opencart.pages.PlaceAnOrder;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PlaceAnOrderStepDefination {

	//Variables Initialization 
	  PlaceAnOrder placeOrder;
	  public static Properties prop;
	   
	//Desc- Mapping the snippets for actions for place an order
	@When("^mouse over on laptops and notebooks and click on show all laptops and notepads$")
	public void mouse_over_on_laptops_and_notebooks_and_click_on_show_all_laptops_and_notepads() throws Throwable {
		placeOrder = new PlaceAnOrder(DriverFactory.getDriver());
		placeOrder.mouseOnOverLaptopsAndNoteBooks();
	}

	@And("^select HP(\\d+)$")
	public void select_HP(int arg1) throws Throwable {
		placeOrder.selectHP();
	}

	@And("^scrolldown the page and change the deliverydate to future date$")
	public void scrolldown_the_page_and_change_the_deliverydate_to_future_date() throws Throwable {
		placeOrder.selectFutureDate();
	}

	@And("^scrolldown the page and click on add to cart button$")
	public void scrolldown_the_page_and_click_on_add_to_cart_button() throws Throwable {
		placeOrder.laptopAddToCart();
	}

	@When("^Click on the Items basket on the top right corner and Click on the check out button$")
	public void click_on_the_Items_basket_on_the_top_right_corner_and_Click_on_the_check_out_button() throws Throwable {
	  placeOrder.shoppinpCartClick();
	}

	@And("^Click on the Guest checkout button in the checkout page$")
	public void click_on_the_Guest_checkout_button_in_the_checkout_page() throws Throwable {
	    placeOrder.checkoutClicked();
	}

	@And("^Enter all the mandatory fields in the billing details and click on continue button$")
	public void enter_all_the_mandatory_fields_in_the_billing_details_and_click_on_continue_button() throws Throwable {
		
		placeOrder.billingDetails();
	}

	@And("^Add some comments in Delivery Methods field and continue$")
	public void add_some_comments_in_Delivery_Methods_field_and_continue() throws Throwable {
	  placeOrder.deliveryDetails();
	}

	@And("^Click on Term and Conditions checkbox and continue$")
	public void click_on_Term_and_Conditions_checkbox_and_continue() throws Throwable {
		 placeOrder.acceptTermsAndConditions();
	}

	@Then("^Click on Confirm Order$")
	public void click_on_Confirm_Order() throws Throwable {
	    placeOrder.confirmOrder();
	}


}
