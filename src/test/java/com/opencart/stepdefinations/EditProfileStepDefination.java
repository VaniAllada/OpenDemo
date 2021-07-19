package com.opencart.stepdefinations;

import com.opencart.factory.DriverFactory;
import com.opencart.pages.EditProfile;
import com.opencart.pages.PlaceAnOrder;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditProfileStepDefination {   // Class

	//Variable Declaration
	EditProfile editAccount;
	
	//Desc- Mapping the snippets for actions of Edit Profile	
	@When("^Select the Edit Account from the right side corner$")
	public void select_the_Edit_Account_from_the_right_side_corner() throws Throwable {
		editAccount = new EditProfile(DriverFactory.getDriver());
		editAccount.selectEditAccount();
	}

	@And("^update the Last Name and Click continue$")
	public void update_the_Last_Name_and_Click_continue() throws Throwable {
		editAccount.updateLastName();
		
	}

	@And("^Log the success msg$")
	public void log_the_success_msg() throws Throwable {
		editAccount.getSuccessMesg();
	}

	@And("^Scroll down and click on logout button$")
	public void scroll_down_and_click_on_logout_button() throws Throwable {
	  editAccount.clickLogoutAndClickContinue();
	}

	@Then("^Click continue to return to homepage\\.$")
	public void click_continue_to_return_to_homepage() throws Throwable {
	   editAccount.returnToHomePage();
	}


}
