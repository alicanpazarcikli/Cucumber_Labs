package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Guru_Lab2.Guru99_Telecom_AddTariffPlansPage;
import pages.Guru_Lab2.Guru99_Telecom_HomePage;
import pages.Guru_Lab2.Guru_99_Telecom_ConfirmationPage;
import utils.ConfigurationsReader;
import utils.Driver;

public class Guru_Lab2_Steps {
    Guru99_Telecom_HomePage guru99_telecom_homePage=new Guru99_Telecom_HomePage();
    Guru99_Telecom_AddTariffPlansPage guru99_telecom_addTariffPlansPage=new Guru99_Telecom_AddTariffPlansPage();
    Guru_99_Telecom_ConfirmationPage guru_99_telecom_confirmationPage=new Guru_99_Telecom_ConfirmationPage();

    @Given("I am on Guru99 Telecom Home Page")
    public void i_am_on_guru99_telecom_home_page() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("Lab2-Guru99-URL"));
    }
    @When("I click on Add Tariff Plan")
    public void i_click_on_add_tariff_plan() {
       guru99_telecom_homePage.clickOnLink();
    }
    @Then("I add details as follows")
    public void i_add_details_as_follows(DataTable dataTable) {
        guru99_telecom_addTariffPlansPage.setMonthlyRental(dataTable.cell(0,1));
        guru99_telecom_addTariffPlansPage.setFreeLocalMins(dataTable.cell(1,1));
        guru99_telecom_addTariffPlansPage.setInternationalMinCharges(dataTable.cell(2,1));
        guru99_telecom_addTariffPlansPage.setFreeSmsPack(dataTable.cell(3,1));
        guru99_telecom_addTariffPlansPage.setLocalMinCharges(dataTable.cell(4,1));
        guru99_telecom_addTariffPlansPage.setFreeInternationalMins(dataTable.cell(5,1));
        guru99_telecom_addTariffPlansPage.setSmsCharges(dataTable.cell(6,1));
    }
    @Then("I click on Submit button")
    public void i_click_on_submit_button() {
        guru99_telecom_addTariffPlansPage.setSubmitBtn();
    }
    @Then("I validate message as {string}")
    public void i_validate_message_as(String string) {
        guru_99_telecom_confirmationPage.verifyText();

    }



}
