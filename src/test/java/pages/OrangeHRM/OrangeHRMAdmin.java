package pages.OrangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BrowserUtils;
import utils.Driver;

import java.util.List;

public class OrangeHRMAdmin extends BrowserUtils {

    public OrangeHRMAdmin(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//b[.='Admin']") private WebElement adminButton;
    @FindBy(xpath = "//a[.='Nationalities']") private WebElement nationalitiesMenu;
    @FindBy(id = "btnAdd") private WebElement addButton;
    @FindBy(xpath = "//input[@id='nationality_name']") private WebElement nationalityName;
    @FindBy(xpath = "//input[@id='btnSave']") private WebElement saveButton;

    @FindBy(xpath = "//table//tr//td[2]//a") private List<WebElement> nationalitiesList;


    public void setAdminButton() {
            adminButton.click();
            BrowserUtils.staticWait(5);
    }

    public void setNationalitiesMenu() {
       BrowserUtils.clickWithWait(nationalitiesMenu);
    }

    public void setAddButton() {
      //  addButton.click();
        BrowserUtils.clickWithWait(addButton);
    }

    public void setNationalityName(String NationalityName) {
        nationalityName.sendKeys(NationalityName);
    }

    public void setSaveButton() {
      saveButton.click();
      BrowserUtils.staticWait(5);
    }

    public void setNationalitiesList(String nationality) {
       for(WebElement each:nationalitiesList){
           if(each.getText().equals(nationality)){
               Assert.assertEquals(each.getText(),nationality);
           }
       }
    }
}
