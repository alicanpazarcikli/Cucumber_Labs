package pages.Guru_Lab2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

import static org.junit.Assert.fail;

public class Guru99_Telecom_AccessDetailsPage extends BrowserUtils {


    public Guru99_Telecom_AccessDetailsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h1[text()='Access Details to Guru99 Telecom']") private WebElement accessDetailsHeader;

    public void verifyHeaderText(String str){
        String actText= accessDetailsHeader.getText();
        String expText=str;
        if( ! str.equals(actText)){
            fail("Add Customer verification failed");
        }
    }



}
