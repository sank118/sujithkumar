package stepDefinations;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on net banking landing page$")
    public void user_is_on_net_banking_landing_page() throws Throwable {
        System.out.println("given is executed");
    }

    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_to_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	 System.out.println(strArg1);
    	 System.out.println(strArg2);
    }


    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("then block");
    }

    @And("^Cards are displayed$")
    public void cards_displayed_are(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("and block");
    }
    
    @When("^User Sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
        List<List<String>> obj=data.raw();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(1).get(0));
        System.out.println(obj.get(1).get(1));
        System.out.println(obj.get(1).get(2));
        System.out.println(obj.get(1).get(3));
    }
    
    @When("^User login to application with (.+) and password (.+)$")
    public void user_login_to_application_with_and_password(String username, String password) throws Throwable {
       System.out.println(username);
       System.out.println(password);
    }
    
    @Then("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are1(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cards are displayed "+ arg1);
    }
    
    @Given("^Validate browser$")
    public void validate_browser() throws Throwable {
       System.out.println("Deciding the browser");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	 System.out.println("Triggering the browser");
    }

    @Then("^Browser is opened$")
    public void browser_is_opened() throws Throwable {
    	 System.out.println("Browser is opened");
    }



}