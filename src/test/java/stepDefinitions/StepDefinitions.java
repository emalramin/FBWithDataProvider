package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.FBSignupPageObjects;
import utilities.DriverUtility;


public class StepDefinitions extends Base {

	FBSignupPageObjects pageObjects = new FBSignupPageObjects();
	DriverUtility utility = new DriverUtility();

	@Given("^User is on signup page$")
	public void user_is_on_signup_page() throws Throwable {
		Base.initializeDriver();
	}

	@When("^User enter firstName \"([^\"]*)\"$")
	public void user_enter_firstName_khan(String firstName) throws Throwable {
		pageObjects.enterFirstName(firstName);
	}

	@When("^User enter lastName \"([^\"]*)\"$")
	public void user_enter_lastName_jan(String lastName) throws Throwable {
		pageObjects.enterLastName(lastName);
	}

	@When("^User enter email \"([^\"]*)\"$")
	public void user_enter_email_khanjan_edu_com(String emailAddress) throws Throwable {
		pageObjects.enterEmailAddress(emailAddress);
	}

	@When("^User enter password \"([^\"]*)\"$")
	public void user_enter_password_khanjan(String password) throws Throwable {
		pageObjects.enterPassword(password);
	}

	@Then("^User click on signup button$")
	public void user_click_on_signup_button() throws Throwable {
		pageObjects.clickOnSignupButton();
	}

}
