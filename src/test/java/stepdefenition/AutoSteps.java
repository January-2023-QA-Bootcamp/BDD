package stepdefenition;

import base.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoSteps extends TestBase{
	
	@When("user insert zipcode <{string}>")
	@When("user insert zipcode {string}")
	public void user_insert_zipcode(String string) {
		homePage.insertZipCode(string);
		// this is an example of how to define two feature steps in a single method
	}

	@When("user clicks getAQuote button")
	public void user_clicks_get_a_quote_button() {
		homePage.clickGetQuoteBtn();
		// This is step without params
	}

	@Then("user is in General-Info page")
	public void user_is_in_general_info_page() {
		infoPage.validateTitle("General Info");
	}

	@When("user selects five_Yrs liablity <{string}>")
	public void user_selects__yrs_liablity(String string) {
		infoPage.select_last_5_yrs_liability(string);
	}

	@When("user selects ownHomeFlag <{string}>")
	public void user_selects_own_home_flag(String string) {
		infoPage.selectOwnsHomeFlag(string);
	}

	@When("user clicks continue button")
	public void user_clicks_continue_button() {
		infoPage.clickContinue();
	}

	@Then("system error shows <{string}>")
	public void system_error_shows(String string) {
		infoPage.validateError(string);
	}
}
