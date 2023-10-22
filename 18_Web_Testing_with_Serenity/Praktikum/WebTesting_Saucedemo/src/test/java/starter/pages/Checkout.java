package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Checkout extends PageObject {

    private By cartContainer() { return By.id("shopping_cart_container");}

    private By checkout() { return By.id("checkout");}

    private By firstnameField() {
        return By.id("first-name");
    }

    private By lastnameField() {
        return By.id("last-name");
    }

    private By postalCodeField() {
        return By.id("postal-code");
    }

    private By buttonCheckoutContinue() { return By.id("continue");}

    private By buttonFinishCheckout() { return By.id("finish");}

    private By buttonBackToHome() { return By.id("back-to-products");}

    @Step
    public void clickShoppingCart() {
        $(cartContainer()).click();
    }

    @Step
    public void clickCheckout() {
        $(checkout()).click();
    }

    public void inputFirstname(String firstname) {
        $(firstnameField()).type(firstname);
    }

    public void inputLastname(String lastname) {
        $(lastnameField()).type(lastname);
    }

    public void inputPostalCode(String postalCode) {
        $(postalCodeField()).type(postalCode);
    }

    @Step
    public void clickContinueCheckout() {
        $(buttonCheckoutContinue()).click();
    }

    @Step
    public void clickFinishCheckout() {
        $(buttonFinishCheckout()).click();
    }

    @Step
    public void clickBackToHome() {
        $(buttonBackToHome()).click();
    }
}
