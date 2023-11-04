package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class loginPage extends PageObject {
    private By emailField() {
        return By.id("input-18");
    }

    private By passwordField() {
        return By.id("input-21");
    }

    private By loginButton() {
        return By.xpath("//button[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");
    }

    private By alertMessageLogin() {
        return By.xpath("//div[@class='v-alert__content']");
    }

    @Step
    public void inputEmail(String email) {
        $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton() {
        $(loginButton()).click();
    }

    @Step
    public boolean validateOnLoginPage() {
        return $(loginButton()).isDisplayed();
    }

    @Step
    public boolean validateErrorMessageIsDisplayed() {
        return $(alertMessageLogin()).isDisplayed();
    }

    @Step
    public boolean validateEqualErrorMessage(String message) {
        return $(alertMessageLogin()).getText().equalsIgnoreCase(message);
    }

}
