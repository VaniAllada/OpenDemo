package com.opencart.stepdefinations;

import com.opencart.factory.DriverFactory;
import com.opencart.pages.EditProfile;
import com.opencart.pages.SearchPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStepDefination {

	//Variable Declaration
	SearchPage searchPage;
	
	//Desc- Mapping the snippets for actions of search functionality
	@When("^Enter Iphone in the search option and click on the search button$")
	public void enter_Iphone_in_the_search_option_and_click_on_the_search_button() throws Throwable {
		searchPage = new SearchPage(DriverFactory.getDriver());
		searchPage.searchTheIphone();
	}

	@When("^Select Iphone and Enter the quantity as two$")
	public void select_Iphone_and_Enter_the_quantity_as_two() throws Throwable {
		searchPage.selectIphoneAndEnterQuantity();
	}

	@When("^Click the Add to Cart button and Select item cart on the right corner$")
	public void click_the_Add_to_Cart_button_and_Select_item_cart_on_the_right_corner() throws Throwable {
		searchPage.clickTopRightCorner();
	}

	@Then("^Click Checkout Option$")
	public void click_Checkout_Option() throws Throwable {
		searchPage.checkOutBtnClick();
	}

}
