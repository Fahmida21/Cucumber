package Stepdep2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdep2 {
	WebDriver driver;
	@Given("^Launch url$")
	public void Launch_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver","\\C:\\driver\\chromedriver.exe\\");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			   
	}
	@Then("^Enter baby clothes in the search page$")
	public void Enter_baby_clothes_in_the_search_page() throws Throwable {
	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("baby clothes");
	}

	@Then("^Click on the search button$")
	public void Click_on_the_search_button() throws Throwable {
	   
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    driver.close();
	}

	
}
