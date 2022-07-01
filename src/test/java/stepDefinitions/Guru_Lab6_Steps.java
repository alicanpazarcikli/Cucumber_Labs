package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Guru_Lab6.OrderPage;
import pages.Guru_Lab6.PaymentPage;
import utils.ConfigurationsReader;
import utils.Driver;

import java.util.Map;

import static org.junit.Assert.fail;

public class Guru_Lab6_Steps {
    OrderPage orderPage = new OrderPage();
    PaymentPage paymentPage = new PaymentPage();

    @Given("The user is on  Payment Gateway Website")
    public void the_user_is_on_payment_gateway_website() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("Lab6_Guru99_URL"));
    }

    @When("The user wants to purchase an elephant toy")
    public void the_user_wants_to_purchase_an_elephant_toy() {
        orderPage.setBuyNowBtn();
    }

    @Then("The user wants to verify that {string} message is displayed")
    public void the_user_wants_to_verify_that_message_is_displayed(String string) {
        orderPage.setHeaderText();
    }


    @Then("The user wants to validate toy price tag as {string}")
    public void the_user_wants_to_validate_toy_price_tag_as(String string) {
        paymentPage.setPriceTag(string);

    }

    @Then("The user wants to verify the landing page as “payment-gateway”")
    public void the_user_wants_to_verify_the_landing_page_as_payment_gateway() {
        if (!Driver.getDriver().getCurrentUrl().contains("payment-gateway")) {
            fail("Page does not navigate to expected URL");
        }
    }

    @When("The user wants to purchase {string} elephant toy")
    public void the_user_wants_to_purchase_elephant_toy(String string) {
        orderPage.setQuantity(string);
    }

    @Then("The user wants to enter Credit Card Number as {string}")
    public void the_user_wants_to_enter_credit_card_number_as(String string) {
        paymentPage.setCreditCardNumber(string);
    }

    @Then("The user wants to enter Expiration Month as {string}")
    public void the_user_wants_to_enter_expiration_month_as(String string) {
        paymentPage.setExpMonth(string);
    }

    @Then("The user wants to enter Expiration Year as {string}")
    public void the_user_wants_to_enter_expiration_year_as(String string) {
        paymentPage.setExpYear(string);
    }

    @Then("The user wants to enter CVVCode as {string}")
    public void the_user_wants_to_enter_cvv_code_as(String string) {
        paymentPage.setCvvCode(string);
    }

    @Then("The user wants to click on pay now")
    public void the_user_wants_to_click_on_pay_now() {
        paymentPage.setPayBtn();
    }

    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
        paymentPage.setOrderConfirmationText(string);
    }


    @Then("The user wants to enter payment info as")
    public void the_user_wants_to_enter_payment_info_as(Map<String, String> dataTable) {
        paymentPage.setCreditCardNumber(dataTable.get("CardNum"));
        paymentPage.setExpMonth(dataTable.get("ExpMnth"));
        paymentPage.setExpYear(dataTable.get("ExpYear"));
        paymentPage.setCvvCode(dataTable.get("CVV"));
    }


    @When("The user wants to buy toys as follow {string}")
    public void theUserWantsToBuyToysAsFollow(String Quantity) {
        orderPage.setQuantity(Quantity);
    }
}
