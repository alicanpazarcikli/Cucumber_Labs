package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Herokuapp_Insurance_Steps {
    @Given("I am on Herokuapp Insurance Page")
    public void i_am_on_herokuapp_insurance_page() {
        System.out.println("I am on Herokuapp Insurance Page");
    }
    @When("I click on Get Quote button")
    public void i_click_on_get_quote_button() {
        System.out.println("I click on Get Quote button");
    }
    @Then("I navigate to application form")
    public void i_navigate_to_application_form() {
        System.out.println("I navigate to application form");
    }

    @When("I click on Finance Details")
    public void i_click_on_finance_details() {
        System.out.println("I click on Finance Details");
    }
    @Then("I validate only one option")
    public void i_validate_only_one_option() {
        System.out.println("I validate only one option");
    }
    @When("I complete the application")
    public void i_complete_the_application() {
        System.out.println("I complete the application");
    }
    @When("I click on submit button")
    public void i_click_on_submit_button() {
        System.out.println("I click on submit button");
    }
    @Then("I verify Let us call you button")
    public void i_verify_let_us_call_you_button() {
        System.out.println("I verify Let us call you button");
    }










}
