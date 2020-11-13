package cucumber4;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"C:\\Users\\USER\\eclipse-workspace\\Cucumber1\\feature file4"} , format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
glue = "Stepdep4")
//tags= {"@Sanity"})

public class testrunner extends AbstractTestNGCucumberTests {
}

