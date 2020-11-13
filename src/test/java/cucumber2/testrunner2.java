package cucumber2;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"C:\\Users\\USER\\eclipse-workspace\\Cucumber1\\feature file2"} , format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
glue = "Stepdep2")
//tags= {"@Sanity"})

public class testrunner2 extends AbstractTestNGCucumberTests {
	

public class testrunner3 {

}
}