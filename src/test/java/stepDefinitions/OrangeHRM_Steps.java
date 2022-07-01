package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import pages.OrangeHRM.OrangeHRMAdmin;
import pages.OrangeHRM.OrangeHRM_HomePage;
import pages.OrangeHRM.OrangeHRM_LoginPage;
import utils.BrowserUtils;
import utils.ConfigurationsReader;
import utils.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.fail;

public class OrangeHRM_Steps {

    OrangeHRM_LoginPage orangeHRM_loginPage=new OrangeHRM_LoginPage();
    OrangeHRM_HomePage orangeHRMHomePage=new OrangeHRM_HomePage();
    OrangeHRMAdmin orangeHRMAdmin=new OrangeHRMAdmin();


    @Given("I am on Orange HRM Login Page")
    public void i_am_on_orange_hrm_login_page() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("OrangeHRMTest_URL"));
        BrowserUtils.waitForPageToLoad(3);
    }
    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
      orangeHRM_loginPage.setUsername();
      orangeHRM_loginPage.setPassword();

    }
    @Then("I click on login button")
    public void i_click_on_login_button() {
        orangeHRM_loginPage.clickOnLogin();
    }
    @Then("I navigate to Orange HRM Home Page")
    public void i_navigate_to_orange_hrm_home_page() {
        String expextedURL="https://hrm-test.renastechschool.com/symfony/web/index.php/dashboard";
        String actualURL=Driver.getDriver().getCurrentUrl();
        if (! expextedURL.equals(actualURL)){
            fail("Page does not navigate to "+expextedURL);
        }
        //also another way with getting some sort of text from home page
        OrangeHRM_HomePage orangeHRM_homePage=new OrangeHRM_HomePage();
        orangeHRM_homePage.verifyDashboardMessage();
    }

    @Given("The user wants to go to OrangeHRM Website")
    public void the_user_wants_to_go_to_orange_hrm_website() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("OrangeHRMTest_URL"));
        BrowserUtils.waitForPageToLoad(4);
    }
    @When("Thee user wants to enter username and password")
    public void thee_user_wants_to_enter_username_and_password() {
     orangeHRM_loginPage.setUsername();
     orangeHRM_loginPage.setPassword();

    }
    @Then("The user wants to click on Login button")
    public void the_user_wants_to_click_on_login_button() {
        orangeHRM_loginPage.setLoginButton();
    }
    @Then("The user wants to verify that browser landed on {string}")
    public void the_user_wants_to_verify_that_browser_landed_on(String string) {
      orangeHRMHomePage.verifyDashboardMessage(string);

    }
    @Then("The user wants to click on PIM module")
    public void the_user_wants_to_click_on_pim_module() {
      orangeHRMHomePage.setPIM();
    }
    @Then("The user wants to go to Add Employee page")
    public void the_user_wants_to_go_to_add_employee_page() {
     orangeHRMHomePage.setAddEmployeeButton();
    }
    @Then("The user wants to  add first name as {string}")
    public void the_user_wants_to_add_first_name_as(String string) {
       orangeHRMHomePage.setFirstName(string);

    }
    @Then("The user wants to add last name as {string}")
    public void the_user_wants_to_add_last_name_as(String string) {
        orangeHRMHomePage.setLastName(string);
    }
    @Then("The user wants to save personal information")
    public void the_user_wants_to_save_personal_information() {
        orangeHRMHomePage.setSaveButton();
    }
    @Then("The user should be able to see {string}")
    public void the_user_should_be_able_to_see(String string) {
    orangeHRMHomePage.setPersonalDetailHeader(string);
    }
    @Then("The user wants to add employee's first and last name as follows")
    public void the_user_wants_to_add_employee_s_first_and_last_name_as_follows(Map<String,String> dataTable) {
        orangeHRMHomePage.setAddEmployeeButton();
        orangeHRMHomePage.setFirstName(dataTable.get("FirstName"));
        orangeHRMHomePage.setLastName(dataTable.get("LastName"));
    }
    @Then("The user wants to add login details as follows")
    public void the_user_wants_to_add_login_details_as_follows(Map<String,String> dataTable) {
        orangeHRMHomePage.setAddLoginDetails();
        orangeHRMHomePage.setUserName(dataTable.get("UserName"));
       orangeHRMHomePage.setPassword(dataTable.get("Password"));
        orangeHRMHomePage.setConfirmPassword(dataTable.get("Password"));
        orangeHRMHomePage.setStatusDropdown(dataTable.get("Status"));
    }
    @Then("The user wants to save the information")
    public void the_user_wants_to_save_the_information() {
      orangeHRMHomePage.setSaveButton();
    }

    @Then("The user wants to add employee's first and last name as following list")
    public void the_user_wants_to_add_employee_s_first_and_last_name_as_following_list(List<List<String>> dataTable) {
        orangeHRMHomePage.setAddEmployeeButton();
        orangeHRMHomePage.setFirstName(dataTable.get(0).get(0));
        orangeHRMHomePage.setLastName(dataTable.get(0).get(1));
    }
    @Then("The user wants to add login details in a list way")
    public void the_user_wants_to_add_login_details_in_a_list_way(List<List<String >> dataTable) {
        orangeHRMHomePage.setAddLoginDetails();
        orangeHRMHomePage.setUserName(dataTable.get(3).get(0));
        orangeHRMHomePage.setPassword(dataTable.get(3).get(1));
        orangeHRMHomePage.setConfirmPassword(dataTable.get(3).get(1));
        orangeHRMHomePage.setStatusDropdown(dataTable.get(3).get(2));
       /*
        orangeHRMHomePage.setUserName(dataTable.cell(0,0));
        orangeHRMHomePage.setPassword(dataTable.cell(0,1));
        orangeHRMHomePage.setConfirmPassword(dataTable.cell(0,1));
        orangeHRMHomePage.setStatusDropdown(dataTable.cell(0,2));

        */



    }
    @Then("The user wants to go to Admin Page")
    public void the_user_wants_to_go_to_admin_page() {
        orangeHRMAdmin.setAdminButton();
    }
    @Then("The user wants to go to Nationalities section")
    public void the_user_wants_to_go_to_nationalities_section() {
     orangeHRMAdmin.setNationalitiesMenu();

    }
    @Then("The user wants to click on add new nationality")
    public void the_user_wants_to_click_on_add_new_nationality() {
        orangeHRMAdmin.setAddButton();
    }
    @Then("The user wants to add new nationalities as {string}")
    public void the_user_wants_to_add_new_nationalities_as(String string) {
        orangeHRMAdmin.setNationalityName(string);
        orangeHRMAdmin.setNationalitiesList(string);
    }
    @Then("The user wants to verify that Nationality is added")
    public void theUserWantsToVerifyThatNationalityIsAdded() {

    }
    @Given("The user wants to login OrangeHRM using Excel file")
    public void the_user_wants_to_login_orange_hrm_using_excel_file() throws IOException {

        Driver.getDriver().get(ConfigurationsReader.getProperties("OrangeHRMTest_URL"));

        String filePath="C:\\Users\\pazar\\IdeaProjects\\Cucumber_Labs\\src\\test\\resources\\book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(filePath);
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet=workbook.getSheet("Sheet1");
        int rows=sheet.getLastRowNum();//this will give us the last number
        int columns=sheet.getRow(0).getLastCellNum();// this will give us all the cells in the specific row

        XSSFRow row=sheet.getRow(1);
        System.out.println(row.getCell(0));
        System.out.println(row.getCell(1));

        System.out.println("total number of rows"+ rows);
        System.out.println("total number of cells or column in that row "+ columns);

        orangeHRM_loginPage.setDataFromExcel(row.getCell(0).toString(),row.getCell(1).toString());

    }

}
