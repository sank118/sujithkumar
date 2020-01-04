package stepDefinations;

import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import Cucumber.Automation.base;
import cucumber.api.java.Before;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Hooks extends base {
	public WebDriver driver;
	
	
	@Before
	public void beforeScenario(Scenario scenario) {
	 Reporter.assignAuthor("INS Zoom - Sujith Kumar");
	}
	
	
	@Before("@SmokeTest")
	public void beforeValidation()  {
		System.out.println("Before hook");
		}
	
	@After("@SmokeTest")
	public void afterValidations()  {
		driver=base.driver;
		driver.close();
		System.out.println("After hook");
		}
	@After("@SanityTest")
	public void afterValidations1()  {
		driver=base.driver;
		driver.close();
		System.out.println("After hook");
		}
	@After("@RegressionTest")
	public void afterValidations2()  {
		driver=base.driver;
		driver.close();
		System.out.println("After hook");
		}

}
