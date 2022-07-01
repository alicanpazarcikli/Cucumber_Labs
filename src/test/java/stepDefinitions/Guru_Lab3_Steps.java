package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Guru_Lab3.Guru99_Home;
import utils.ConfigurationsReader;
import utils.Driver;

public class Guru_Lab3_Steps {

    Guru99_Home guru99_home=new Guru99_Home();
    @Given("The user wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("lab3-Guru99-URL"));
    }
    @When("The user wants to add a customer")
    public void the_user_wants_to_add_a_customer() {
       guru99_home.setAddCustomerBtn();

    }
    @Then("The users wants to verify {string} header")
    public void the_users_wants_to_verify_header(String string) {
        guru99_home.setAddCustomerHeader(string);

    }
    @Then("The user wants to enter background check as {string}")
    public void the_user_wants_to_enter_background_check_as(String string) {
        guru99_home.setBackgroundCheck(string);

    }
    @Then("The user wants to enter billingaddress as {string} and {string} and {string} and {string} and {string}")
    public void the_user_wants_to_enter_billingaddress_as_and_and_and_and(String firstname, String lastName, String email, String address, String phoneNumber) {
        guru99_home.setFirstName(firstname);
        guru99_home.setLastName(lastName);
        guru99_home.setEmail(email);
        guru99_home.setAddress(address);
        guru99_home.setMobileNumber(phoneNumber);

    }
    @Then("The wants to verify message as {string}")
    public void the_wants_to_verify_message_as(String string) {
       guru99_home.setSubmitBtn(string);
        Assert.assertEquals(guru99_home.setVerificationHeader().getText(),string);
    }

}
