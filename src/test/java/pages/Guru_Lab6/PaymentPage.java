package pages.Guru_Lab6;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;


public class PaymentPage extends BrowserUtils {
    public PaymentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='6u 12u$(xsmall)']/font[2]") WebElement toyPrice;

    @FindBy(xpath = "//input[@name='card_nmuber']")
    private WebElement creditCardNumber;
    @FindBy(id = "month")
    private WebElement expMonth;
    @FindBy(id = "year")
    private WebElement expYear;
    @FindBy(id = "cvv_code")
    private WebElement cvvCode;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement payBtn;
    @FindBy(xpath = "//h2[.='Payment successfull!']")
    private WebElement orderConfirmationText;

    public void setOrderConfirmationText(String expMessage){
        Assert.assertEquals(expMessage,orderConfirmationText.getText());
    }

    public void setCreditCardNumber(String CreditCardNumber) {
        staticWait(1);
       creditCardNumber.sendKeys(CreditCardNumber);
    }

    public void setExpMonth(String ExpMonth) {
       staticWait(1);
       expMonth.sendKeys(ExpMonth);
    }

    public void setExpYear(String ExpYear) {
      staticWait(1);
      expYear.sendKeys(ExpYear);
    }

    public void setCvvCode(String CvvCode) {
       staticWait(1);
       cvvCode.sendKeys(CvvCode);
    }

    public void setPayBtn() {
     payBtn.click();
    }

    public void setPriceTag(String expectedPrice) {
        Assert.assertEquals(expectedPrice,toyPrice.getText());

    }




}
