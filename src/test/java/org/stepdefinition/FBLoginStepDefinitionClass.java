package org.stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.utilities.BaseClass;
import org.utilities.FBLoginPojo;

import cucumber.api.java.en.*;

public class FBLoginStepDefinitionClass extends BaseClass {

	@Given("User launchs Chrome and load url")
	public void user_launchs_Chrome_and_load_url() {
		launchChrome();
	    getUrl("https://www.facebook.com/");
	    winMax();
	}

	@When("User enters username")
	public void user_enters_username() throws IOException {
		FBLoginPojo f = new FBLoginPojo();
		fill(f.getUserId(), getData(1, 0));
	}

	@When("User enters password")
	public void user_enters_password() throws IOException {
		FBLoginPojo f = new FBLoginPojo();
	    fill(f.getPassword(), getData(1, 1));
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
		FBLoginPojo f = new FBLoginPojo();
	    btnClick(f.getLoginBtn());
	}

	@Then("User navigates to incorrect credentials login page")
	public void user_navigates_to_incorrect_credentials_login_page() {
		 String currentUrl = driver.getCurrentUrl();
		    Assert.assertTrue("Incorrect credential login page not displayed", currentUrl.contains("privacy_mutation"));
		    System.out.println("Facebook login functionality with invalid username and invalid password PASSED");
	}
}
