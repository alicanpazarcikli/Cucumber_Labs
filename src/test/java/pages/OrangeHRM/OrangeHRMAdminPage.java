package pages.OrangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

public class OrangeHRMAdminPage extends BrowserUtils {


    public  OrangeHRMAdminPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']") private WebElement admin;
    // also with the xpath //b[.='Admin']















}
