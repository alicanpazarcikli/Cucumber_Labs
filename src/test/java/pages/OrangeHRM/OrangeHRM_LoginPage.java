package pages.OrangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.ConfigurationsReader;
import utils.Driver;

public class OrangeHRM_LoginPage extends BrowserUtils {
    public OrangeHRM_LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='txtUsername']") private WebElement username;
    @FindBy(xpath = "//input[@id='txtPassword']") private WebElement password;
    @FindBy(xpath = "//input[@id='btnLogin']") private WebElement LoginButton;


    public void setUsername(){
        username.sendKeys(ConfigurationsReader.getProperties("OrangeHRM_userName"));
    }
    public void setPassword(){
        password.sendKeys(ConfigurationsReader.getProperties("OrangeHRM_password"));
    }
    public void clickOnLogin(){
        LoginButton.click();
    }

    public void setUsername(String UserName) {
        BrowserUtils.staticWait(1);
        username.sendKeys(UserName);
    }

    public void setPassword(String Password) {
    password.sendKeys(Password);
    }

    public void setLoginButton() {
        LoginButton.click();
    }

    public void setDataFromExcel(String usname,String pswrd){
        username.sendKeys(usname);
        password.sendKeys(pswrd);
        LoginButton.click();
    }


}
