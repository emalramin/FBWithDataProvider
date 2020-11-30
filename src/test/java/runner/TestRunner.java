package runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ardcs\\eclipse-workspace-two\\CucumberWithDataProv\\src\\test\\resources\\features\\Facebook.feature",
		glue = { "stepDefinitions" }, 
		dryRun = false, 
		monochrome = true,
		strict = false,
		format = {"pretty",
		        "html:target/cucumber-reports/cucumber-pretty",
		        "json:target/cucumber-reports/CucumberTestReport.json",
		        "rerun:target/cucumber-reports/rerun.txt"
		},
		plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class TestRunner {

}
