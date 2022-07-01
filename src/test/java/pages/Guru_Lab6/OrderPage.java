package pages.Guru_Lab6;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BrowserUtils;
import utils.Driver;

import java.util.List;


public class OrderPage extends BrowserUtils {

    public OrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='three']/div/header/h2") private WebElement headerText;
    @FindBy(xpath = "//div[@class='row']/div[2]/h3") private WebElement priceTag;
    @FindBy(css = "select[name='quantity']") private WebElement dropDown;
    @FindBy(css = "input[value='Buy Now']") private WebElement buyNowBtn;
    public void setHeaderText() {

       boolean bool= headerText.isDisplayed();
       Assert.assertTrue(bool);
    }
    public void setQuantity(String quantity) {
        Select select=new Select(dropDown);
        BrowserUtils.staticWait(2);
        select.selectByIndex(Integer.parseInt(quantity));
    }

    public void setBuyNowBtn() {
        BrowserUtils.clickWithWait(buyNowBtn);
    }
}
