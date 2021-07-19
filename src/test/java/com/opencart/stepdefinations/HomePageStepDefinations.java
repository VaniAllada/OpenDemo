package com.opencart.stepdefinations;

import org.openqa.selenium.WebDriver;

import com.opencart.factory.DriverFactory;
import com.opencart.pages.EditProfile;
import com.opencart.pages.HomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefinations {
	
	//Variable Declaration
	HomePage hmePage;
	
	//Desc- Mapping the snippets for actions of HomePage actions
	@When("^Mouseover to the Components tab$")
	public void mouseover_to_the_Components_tab() throws Throwable {
		hmePage = new HomePage(DriverFactory.getDriver());
		hmePage.mouseOverTheComponentsTab();

	}

	@And("^Click on monitors and Click on\"([^\"]*)\"$")
	public void click_on_monitors_and_Click_on(String arg1) throws Throwable {
	   hmePage.clickOnMonitorsAndAppleCinema();
	}

	@And("^Enter all the required fields and upload file  in available options$")
	public void enter_all_the_required_fields_and_upload_file_in_available_options() throws Throwable {
		hmePage.enterAllRequiredFieldsAndUploadFile();
	}

	@And("^Click on Add to cart button and the item should be added to the cart$")
	public void click_on_Add_to_cart_button_and_the_item_should_be_added_to_the_cart() throws Throwable {
	   hmePage.addToCartClicked();
	}

	@Then("^If the file is not uploaded then it should throw an error message$")
	public void if_the_file_is_not_uploaded_then_it_should_throw_an_error_message() throws Throwable {
		hmePage.fileRequiredErrorMsg();
	}

	



}
