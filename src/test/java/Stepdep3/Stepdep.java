package Stepdep3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdep {
WebDriver driver;

        @Given("^LAUNCH URL$")
         public void LAUNCH_URL() throws Throwable {
        	System.setProperty("webdriver.chrome.driver","\\C:\\driver\\chromedriver.exe\\");
    		driver= new ChromeDriver();
    		driver.get("https://www.google.com/");
    		driver.manage().window().maximize();
    		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    		  		
}
       @Then("^Enter nexttechitc on search page$")
        public void Enter_nexttechitc_on_search_page() throws Throwable {
   
    	   driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("nexttech itc");
    	   
}
       @Then("^Click on search button$")
        public void Click_on_search_button() throws Throwable {
   
    	   driver.findElement(By.name("btnK")).click();
     	   driver.close();
}
              
       @Given("^Launch \"([^\"]*)\"$")
       public void Launch_url(String url) throws Throwable {
      	System.setProperty("webdriver.chrome.driver","\\C:\\driver\\chromedriver.exe\\");
  		driver= new ChromeDriver();
  		driver.get(url); 
  		driver.manage().window().maximize();
  		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	  
}

       @Then("^Enter XPS \"([^\"]*)\" on search field$")
         public void enter_XPS_on_search_field(String productname) throws Throwable {
    
    	   driver.findElement(By.cssSelector("input.mh-search-input")).sendKeys("productname");
}

       @Then("^Click search button$")
        public void click_search_button() throws Throwable {
    
}

       @Then("^verify user in seach page$")
        public void verify_user_in_seach_page() throws Throwable {
   
}
}
