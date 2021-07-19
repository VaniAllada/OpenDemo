package com.opencart.stepdefinations;

import com.opencart.pages.CouponCodePage;
import com.opencart.pages.EditProfile;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CouponCodeStepDefination {

	//Variable Declaration
	CouponCodePage couponCode;
		
		//Desc- Mapping the snippets for actions of CouponCodeapage	
		
	@When("^Mouseover to Laptop & Notebooks Select Show all Laptops And Notebooks$")
	public void mouseover_to_Laptop_Notebooks_Select_Show_all_Laptops_And_Notebooks() throws Throwable {
		couponCode.mouseOnOverLaptopsAndNoteBooks();
	}

	@And("^Select HP LP(\\d+)$")
	public void select_HP_LP(int arg1) throws Throwable {
		couponCode.selectHP();
	}

	@And("^Change the delivery date and quantity$")
	public void change_the_delivery_date_and_quantity() throws Throwable {
		couponCode.changeDeliveryDateAndQuantity();
	}

	@And("^Click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
		couponCode.laptopAddToCart();
		couponCode.shoppinpCartClick();
	}

	@Then("^Enter the Coupon Code and click on the \"([^\"]*)\" button$")
	public void enter_the_Coupon_Code_and_click_on_the_button(String arg1) throws Throwable {
		
	}


}
