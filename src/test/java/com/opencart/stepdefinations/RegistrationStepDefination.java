package com.opencart.stepdefinations;

import com.opencart.pages.RegistrationPage;
import com.opencart.utils.ExcelReader;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.opencart.factory.DriverFactory;


public class RegistrationStepDefination {

	//Variable Declarations
		RegistrationPage regPage;
		Properties prop;

		//Desc- User able to register the account
		
			@Given("^user launch correct url$")
			public void user_launch_correct_url() throws Throwable {
				 regPage=new RegistrationPage(DriverFactory.getDriver());		
				 regPage.MyAccountClick();
			}
	
			@When("^user enter username and password from sheetname\"([^\"]*)\" and rownumber (\\d+)$")
			public void user_enter_username_and_password_from_sheetname_and_rownumber(String sheetName, int rowNumber) throws Throwable {
				  ExcelReader  reader=new ExcelReader();
				    
				    List<Map<String,String>> testData =  reader.getData("C:\\Users\\LENOVO\\eclipse-workspace\\OpenCartDemoProject\\src\\main\\java\\com\\opencart\\utils\\data.xlsx",sheetName);
				    String firstName2 = testData.get(rowNumber).get("FirstName");
				    String lastName2 = testData.get(rowNumber).get("LastName");
				    String email2 = testData.get(rowNumber).get("Email");
				    String telephone2 = testData.get(rowNumber).get("Telephone");
				    String password2 = testData.get(rowNumber).get("Password");
				    String pwdconfirm2 = testData.get(rowNumber).get("ConfirmPassword");
				    
				    regPage.registerExcel(firstName2, lastName2, email2, telephone2, password2, pwdconfirm2);
			}
	
			@When("^user click on login button$")
			public void user_click_on_login_button() throws Throwable {
				regPage.checkConditions();
			    regPage.clickContinueBtn();
			   // regPage.errorMessageShown();
			}	
			
}
