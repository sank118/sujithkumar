package stepDefinations;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObject.homePage;
import pageObject.previewPage;


import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;

import Cucumber.Automation.base;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	public static WebDriver driver;
		
	
    @Given("^User is on Greencart landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable 
    {
    	driver=base.getDriver();
    	System.out.println("User landed successfully");
	}

    @When("^User searched for (.+) vegitable$")
    public void user_searched_for_something_vegitable(String strArg1) throws Throwable 
    {
    	homePage hp=new homePage(driver);
    	hp.getSearch().sendKeys(strArg1);
    	Thread.sleep(3000);
    	hp.increaseItem().click();
    	hp.addToCart().click();
    	System.out.println("------Adding item to cart is completed---------");
    }

    @Then("(.+) result are displayed$")
    public void something_result_are_displayed(String strArg1) throws Throwable 
    {
    	homePage hp=new homePage(driver);
    	hp.cartIcon().click();
    	Thread.sleep(3000);
    	hp.verifyItemSelectedhp(strArg1);
    	hp.proceedToCard().click();
    	Thread.sleep(3000);
    }
    
    @And("^confirm the checkout item is (.+)$")
    public void confirm_the_checkout_item_is_something(String strArg1) throws Throwable 
    {
    	
       	previewPage pp=new previewPage(driver);
    	String itemPicked = strArg1;
		pp.verifyItemSelectedpp(itemPicked);
        pp.placeOrder().click();
        Thread.sleep(3000);
        pp.agreeTerms().click();
        pp.proceed().click();
        System.out.println("Item checked out successfully");
        Thread.sleep(5000);
    }
    
    

}