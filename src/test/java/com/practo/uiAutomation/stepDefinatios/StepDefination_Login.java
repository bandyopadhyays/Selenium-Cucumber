package com.practo.uiAutomation.stepDefinatios;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination_Login {
	
	@Given("^user opens chrome browser$")
	public void user_opens_chrome_browser() throws Throwable {
	   System.out.println("Browser openes");
	}

	@Given("^navigate to application url$")
	public void navigate_to_application_url() throws Throwable {
	    System.out.println("go to url");
	}

	@When("^user provide valid user name$")
	public void user_provide_valid_user_name() throws Throwable {
	  System.out.println("uname");
	}

	@When("^user provide valid \"([^\"]*)\"$")
	public void user_provide_valid(String arg1) throws Throwable {
	    System.out.println(arg1);
	}



	@When("^click on login buttoon$")
	public void click_on_login_buttoon() throws Throwable {
		System.out.println("btn click");
	}

	@Then("^user should successfully login to application$")
	public void user_should_successfully_login_to_application() throws Throwable {
		System.out.println("assert");
	}


}
