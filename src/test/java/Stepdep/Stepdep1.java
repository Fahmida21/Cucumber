package Stepdep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdep1 {
	WebDriver driver;
	@Given("^Launch url$")
	public void Launch_url() throws Throwable {
	
		System.setProperty("webdriver.chrome.driver","\\C:\\driver\\chromedriver.exe\\");
		driver= new ChromeDriver();
		driver.get("https://www.dell.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Then("^Enter computer bag in the search page$")
	public void Enter_computer_bag_in_the_search_page() throws Throwable {

		driver.findElement(By.cssSelector("input.mh-search-input")).sendKeys("computer bag");
	    
	}

	@Then("^Click the search button$")
	public void Click_the_search_button() throws Throwable {
	
		driver.findElement(By.xpath("//span[@class='mh-search-button-label']")).click();
	    driver.close();
	}
	
} 