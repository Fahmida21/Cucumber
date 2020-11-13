package Cucumber.Cucumber1;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"C:\\Users\\USER\\eclipse-workspace\\Cucumber1\\feature file"} , format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
glue = "Stepdep")
//tags= {"@Sanity"})

public class testrunner1 extends AbstractTestNGCucumberTests {
	

}



