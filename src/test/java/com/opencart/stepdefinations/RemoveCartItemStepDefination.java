package com.opencart.stepdefinations;

import java.util.Properties;

import com.opencart.factory.DriverFactory;
import com.opencart.pages.PlaceAnOrder;
import com.opencart.pages.RemoveItemFromCart;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RemoveCartItemStepDefination {

	//Variable Declaration
	RemoveItemFromCart removeItemPage;
	 
	//Desc- Mapping the snippets for actions for removecart item
	@When("^Mouseover to Laptop & Notebook and select Show all Laptops & Notebooks$")
	public void mouseover_to_Laptop_Notebook_and_select_Show_all_Laptops_Notebooks() throws Throwable {
		removeItemPage = new RemoveItemFromCart(DriverFactory.getDriver());
		removeItemPage.mouseOnOverLaptopsAndNoteBooks();
	}

	@And("^Select HP LP(\\d+) and click on the add to cart button$")
	public void select_HP_LP_and_click_on_the_add_to_cart_button(int arg1) throws Throwable {
		removeItemPage.selectHP();
		removeItemPage.laptopAddToCart();
	}

	@And("^Go to Shopping cart tab and click on the Shopping Cart$")
	public void go_to_Shopping_cart_tab_and_click_on_the_Shopping_Cart() throws Throwable {
		removeItemPage.shoppinpCartClick();
	}

	@And("^Remove the item from the cart$")
	public void remove_the_item_from_the_cart() throws Throwable {
		removeItemPage.removeItemFromCart();
	}

	@Then("^Click on continue$")
	public void click_on_continue() throws Throwable {
		
	}


}
