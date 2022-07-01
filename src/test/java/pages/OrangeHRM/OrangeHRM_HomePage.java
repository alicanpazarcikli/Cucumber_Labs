package pages.OrangeHRM;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

public class OrangeHRM_HomePage extends BrowserUtils {


    public OrangeHRM_HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    private static final org.apache.log4j.Logger logger= org.apache.log4j.Logger.getLogger(OrangeHRM_HomePage.class);
    @FindBy(xpath = "//div[@class='head']/h1") private WebElement dashboardHeader;
               //  //h1[.='Dashboard']
    @FindBy(xpath = "//a[@id='menu_pim_viewPimModule']") private WebElement PIM;
    @FindBy(xpath = "//input[@id='btnAdd']") private WebElement addEmployeeButton;
    @FindBy(xpath = "//input[@id='firstName']") private WebElement firstName;
    @FindBy(xpath = "//input[@id='lastName']") private WebElement lastName;
    @FindBy(xpath = "//input[@id='btnSave']") private WebElement saveButton;
    @FindBy(xpath = "//h1[.='Personal Details']") private WebElement personalDetailHeader;
    @FindBy(xpath = "//input[@id='chkLogin']") private WebElement addLoginDetails;
    @FindBy(xpath = "//input[@id='user_name']") private WebElement userName;
    @FindBy(xpath = "//input[@id='user_password']") private WebElement password;
    @FindBy(xpath = "//input[@id='re_password']") private WebElement confirmPassword;
    @FindBy(xpath = "//select[@id='status']") private WebElement statusDropdown;


    public void setAddLoginDetails() {
        addLoginDetails.click();

    }

    public void setUserName(String UserName) {
       userName.sendKeys(UserName);
    }

    public void setPassword(String Password) {
       password.sendKeys(Password);
    }

    public void setConfirmPassword(String  ConfirmPassword) {
       confirmPassword.sendKeys(ConfirmPassword);
    }

    public void setStatusDropdown(String  statusdropdown) {
      //  Select select = new Select(statusDropdown);
       // select.selectByVisibleText(statusdropdown);
        BrowserUtils.selectFromDropDown(statusDropdown,statusdropdown);
        //first parameter is the web element and the second is string parameter from scenario
    }

    public void setPIM() {
     // PIM.click(); // regular way of clicking also see below with utils
        BrowserUtils.clickWithWait(PIM);
    }

    public void setAddEmployeeButton() {
     addEmployeeButton.click();
    }

    public void setFirstName(String FirstName) {
     firstName.sendKeys(FirstName);
    }

    public void setLastName(String LastName) {
       lastName.sendKeys(LastName);
    }

    public void setSaveButton() {
     BrowserUtils.clickWithWait(saveButton);
    }

    public void setPersonalDetailHeader(String expectedHeader) {
        Assert.assertEquals(expectedHeader,personalDetailHeader.getText());
    }

    public void verifyDashboardMessage(){
        Assert.assertEquals("Dashboard",dashboardHeader.getText());


    }
    public void verifyDashboardMessage(String expected){
        Assert.assertEquals(expected,dashboardHeader.getText());


    }

}

