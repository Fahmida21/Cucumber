package cucumber3;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"C:\\Users\\USER\\eclipse-workspace\\Cucumber1\\feature file 3"} , format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
glue = "Stepdep3", tags= {"@Sanity"})

public class testrunner extends AbstractTestNGCucumberTests {


}