package Stepdep4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdep {
	WebDriver driver;

    @Given("^Launch URL$")
     public void Launch_URL() throws Throwable {
    	System.setProperty("webdriver.chrome.driver","\\C:\\driver\\chromedriver.exe\\");
		driver= new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
    @Then("^Enter mobile banking in search field$")
    public void Enter_mobile_banking_in_search_field() throws Throwable {
       driver.findElement(By.id("nav-search-query")).sendKeys("mobile banking");
    }

    @Then("^Click search button$")
    public void Click_search_button() throws Throwable {
        driver.findElement(By.name("Search Module - Top Result – Search Button")).click();
        driver.close();
    }

   
}