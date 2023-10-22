package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class PaymentMethodPage extends PageObject {

    private By paymentMethodPage() {
        return By.xpath("//h1[normalize-space()='Pembayaran']");
    }

    private By anotherPaymentMethod() {
        return By.xpath("//div[@class='show-more-payment']");
    }

    private By gopayPayment() {
        return By.xpath("//label[@id='label Gopay']");
    }

    private By paymentButton() {
        return By.xpath("//button[@id='submit_payment']");
    }

    private By errorMessageClickContinueBeforeChoose() {
        return By.xpath("//p[@id='error_select_payment']");
    }

    @Step
    public boolean validateOnPaymentMethodPage() {
        return $(paymentMethodPage()).isDisplayed();
    }

    @Step
    public boolean clickAnotherPaymentMethod() { return $(anotherPaymentMethod()).isDisplayed();
    }

    @Step
    public void choosePaymentMethod() { $(gopayPayment()).click();
    }

    @Step
    public void clickPaymentNow() { $(paymentButton()).click();
    }

    @Step
    public boolean validateErrorMessageAtPaymentMethodPage() {
        return $(errorMessageClickContinueBeforeChoose()).isDisplayed();
    }

    @Step
    public boolean validateEqualErrorMessageAtPaymentMethodPage(String message) {
        return $(errorMessageClickContinueBeforeChoose()).getText().equalsIgnoreCase(message);
    }
}
