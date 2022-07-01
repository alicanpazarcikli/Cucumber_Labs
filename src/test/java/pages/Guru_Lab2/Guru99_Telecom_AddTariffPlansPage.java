package pages.Guru_Lab2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

public class Guru99_Telecom_AddTariffPlansPage extends BrowserUtils {
    public Guru99_Telecom_AddTariffPlansPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='rental1']") private WebElement monthlyRental;
    @FindBy(xpath = "//input[@id='local_minutes']") private WebElement freeLocalMins;
    @FindBy(xpath = "//input[@id='inter_minutes']") private WebElement freeInternationalMins;
    @FindBy(xpath = "//input[@id='sms_pack']") private WebElement freeSmsPack;
    @FindBy(xpath = "//input[@id='minutes_charges']") private WebElement localMinCharges;
    @FindBy(xpath = "//input[@id='inter_charges']") private WebElement internationalMinCharges;
    @FindBy(xpath = "//input[@id='sms_charges']") private WebElement smsCharges;
    @FindBy(xpath = "//input[@name='submit']") private WebElement submitBtn;

    public void setMonthlyRental(String MonthlyRental) {
       monthlyRental.sendKeys(MonthlyRental);
    }

    public void setFreeLocalMins(String FreeLocalMins) {
       freeLocalMins.sendKeys(FreeLocalMins);
    }

    public void setFreeInternationalMins(String FreeInternationalMins) {
         freeInternationalMins.sendKeys(FreeInternationalMins);
    }

    public void setFreeSmsPack(String FreeSmsPack) {
        freeSmsPack.sendKeys(FreeSmsPack);
    }

    public void setLocalMinCharges(String LocalMinCharges) {
        localMinCharges.sendKeys(LocalMinCharges);
    }

    public void setInternationalMinCharges(String InternationalMinCharges) {
        internationalMinCharges.sendKeys(InternationalMinCharges);
    }

    public void setSmsCharges(String SmsCharges) {
        smsCharges.sendKeys(SmsCharges);
    }

    public void setSubmitBtn() {
        submitBtn.click();
    }
}
