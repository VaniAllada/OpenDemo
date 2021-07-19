package com.opencart.stepdefinations;

import java.util.Properties;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.opencart.factory.DriverFactory;

import com.opencart.utils.ConfigReader;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;

public class ApplicationHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	
	private ConfigReader configReader;
	Properties prop;
	
	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}
	
	@Before(order = 1) 
	public void lauchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driverFactory.init_driver(browserName);
		driverFactory.getDriver().get(prop.getProperty("url"));
      
	}
	
	@After(order = 0)
	public void quitBrowser() {
		//driverFactory.getDriver().close();
	}
	
	@After(order = 1)
	public void endTest(Scenario scenario) { // Taking Screenshots for failed testcases
		if (scenario.isFailed()) {

			try {

				final byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png"); // ... and embed it in
			} catch (WebDriverException e) {
				e.printStackTrace();
			}

		} else {   // Taking Screenshots for passed testcases
			try {
				scenario.embed(((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES), "image/png");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	//	DriverFactory.getDriver().quit();
	}
		
	
}
