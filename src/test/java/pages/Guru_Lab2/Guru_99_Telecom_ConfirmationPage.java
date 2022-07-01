package pages.Guru_Lab2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BrowserUtils;
import utils.Driver;

import static org.junit.Assert.fail;

public class Guru_99_Telecom_ConfirmationPage extends BrowserUtils {

    public Guru_99_Telecom_ConfirmationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h2[text()='Congratulation you add Tariff Plan']") private WebElement verificationText;


    public void verifyText(){
        String actualText= verificationText.getText();
        String expectedText="Congratulation you add Tariff Plan";
        if ( !expectedText.equals(actualText)){
            fail("Add Tariff Plan verification failed.");
        }
    }

}
