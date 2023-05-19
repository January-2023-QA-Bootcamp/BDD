package stepdefenition;

import base.TestBase;
import io.cucumber.java.en.Given;
import report.Log;

public class CommonSteps extends TestBase{

	@Given("say hello!")
	public void say_hello() {
	    Log.log("Hello Guys!");
	}
	
	@Given("homepage title is <{string}>")
	public void homepage_title_is(String string) {
		homePage.getAQuoteTitleValidation(string);
	}
}
