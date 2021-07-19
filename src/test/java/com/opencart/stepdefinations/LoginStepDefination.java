package com.opencart.stepdefinations;

import java.util.List;
import java.util.Properties;

import org.testng.Assert;

import com.opencart.factory.DriverFactory;
import com.opencart.pages.LoginPage;
import com.opencart.pages.RegistrationPage;


import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {

	   LoginPage loginPage;
	   public static Properties prop;
	   
	  @Given("^open chrome browser and entering opencart url$")
	   public void open_chrome_browser_and_entering_opencart_url() throws Throwable {
		   loginPage=new LoginPage(DriverFactory.getDriver());	
	   }  
	   
	@When("^user is selecting the myaccount and click on login$")
	public void user_is_selecting_the_myaccount_and_click_on_login() throws Throwable {
			
		loginPage.MyAccountClick();

	}

	@And("^entering the emailid$")
	public void entering_the_emailid(DataTable datatable) throws Throwable {
		  List<String>li=datatable.asList(String.class);
		   loginPage.enterEmail(li.get(0));
	}

	@And("^user entering the password$")
	public void user_entering_the_password(DataTable datatable) throws Throwable {
		   List<String>li=datatable.asList(String.class);
		   loginPage.enterPassword(li.get(0));
	   }
	

	@And("^click on the login button$")
	public void click_on_the_login_button() throws Throwable {
		   loginPage.clickLoginBtn();
	}

	@Then("^varify the title after login$")
	public void varify_the_title_after_login() throws Throwable {
		String estimated = DriverFactory.getDriver().getTitle() ;
		System.out.println(estimated);
		String actualTitle = "My Account";
		Assert.assertEquals(estimated, actualTitle);
	}
	
	

}
