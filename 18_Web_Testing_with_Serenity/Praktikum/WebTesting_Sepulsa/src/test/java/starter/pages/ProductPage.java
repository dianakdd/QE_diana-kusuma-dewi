package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
public class ProductPage extends PageObject{

    private By phoneNumberField() {
        return By.id("phone_number");
    }

    private By chooseNominalDetail() { return By.xpath("//div[@id='Telkomsel Rp15.000']");}

    private By errorMessage13Digits() {
        return By.xpath("//p[contains(text(),'Nomor handphonenya kelebihan. Maksimal 13 digit ya')]");
    }

    public void inputPhoneNumber(String phonenumber) {
        $(phoneNumberField()).type(phonenumber);
    }

    @Step
    public void clickTheProductDetail() {
        $(chooseNominalDetail()).click();
    }

    @Step
    public boolean validateErrorMessageWith13Digits() {
        return $(errorMessage13Digits()).isDisplayed();
    }

    @Step
    public boolean validateEqualErrorMessageWith13Digits(String message) {
        return $(errorMessage13Digits()).getText().equalsIgnoreCase(message);
    }

}
