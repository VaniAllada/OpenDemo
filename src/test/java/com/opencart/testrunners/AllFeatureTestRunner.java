package com.opencart.testrunners;  // package

//Imports
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="Features", glue={"com.opencart.stepdefinations"}, monochrome=true,
plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent reports/report.html",
"pretty","junit:target/MyReports/report.xml","html:target/cucumber-html-report",
	"json:target/MyReports/report.json"})
public class AllFeatureTestRunner {   // TestRunner
	@AfterClass
	public static void extentReport() {
		  Reporter.loadXMLConfig(new File(com.opencart.managers.FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));	
    }
}
