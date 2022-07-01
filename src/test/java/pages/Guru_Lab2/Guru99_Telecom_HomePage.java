package pages.Guru_Lab2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

public class Guru99_Telecom_HomePage extends BrowserUtils {
    public Guru99_Telecom_HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(linkText = "Add Tariff Plan")  private WebElement tariffPlanBtn;
  // xpath a[text()='Add Tariff Plan']

    @FindBy(linkText = "Add Customer") private WebElement AddCustomerBtn;
    // X-pat is (//a[text()='Add Customer'])[1]


    public void clickOnLink(){

        tariffPlanBtn.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveByOffset(0,0).click().build().perform();
    }

}
