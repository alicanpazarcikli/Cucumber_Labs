package pages.Guru_Lab3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BrowserUtils;
import utils.Driver;

import java.util.List;

public class Guru99_Home extends BrowserUtils {

    public Guru99_Home(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy(xpath = "(//a[.='Add Customer'])[1]") private WebElement addCustomerBtn;
    @FindBy(xpath = "//h1[.='Add Customer']") private WebElement addCustomerHeader;
    @FindBy (xpath = "//input[@type='radio']") private List<WebElement> backgroundCheck;
    @FindBy(id = "fname")private WebElement firstName;
    @FindBy(id = "lname") private WebElement lastName;
    @FindBy(id = "email") private WebElement email;
    @FindBy(xpath = "//div[@class='12u$']/textarea") private WebElement address;
    @FindBy(xpath = "//input[@id='telephoneno']") private WebElement mobileNumber;
    @FindBy(xpath = "//input[@name='submit']") private WebElement submitBtn;
    @FindBy(xpath = "//h1[.='Access Details to Guru99 Telecom']") private WebElement verificationHeader;


    public void setAddCustomerBtn() {
        addCustomerBtn.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveByOffset(0,0).click().build().perform();
    }

    public void setAddCustomerHeader(String AddCustomerHeader) {
        Assert.assertEquals(addCustomerHeader.getText(),AddCustomerHeader);
    }

    public void setBackgroundCheck(String BackgroundCheck) {
       for(WebElement each:backgroundCheck){
           if(each.getAttribute("id").equals(BackgroundCheck)){
               //each.click();
               JavascriptExecutor executor= (JavascriptExecutor) Driver.getDriver();
               executor.executeScript("arguments[0].click();", each);
           }else{
               System.out.println("please check the selection u provided");
           }
       }
    }

    public void setFirstName(String FirstName) {
       firstName.sendKeys(FirstName);
    }

    public void setLastName(String LastName) {
       lastName.sendKeys(LastName);
    }

    public void setEmail(String Email) {
       email.sendKeys(Email);
    }

    public void setAddress(String Address) {
      address.sendKeys(Address);
    }

    public void setMobileNumber(String MobileNumber) {
       mobileNumber.sendKeys(MobileNumber);
    }

    public void setSubmitBtn(String SubmitBtn) {
       submitBtn.click();
    }
    public WebElement setVerificationHeader(){
        return verificationHeader;
    }

}
