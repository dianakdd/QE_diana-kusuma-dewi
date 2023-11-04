package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
public class registerPage extends PageObject {

    private By nameField() {
        return By.id("input-18");
    }
    private By emailField() {
        return By.id("input-21");
    }
    private By passwordField() {
        return By.id("input-24");
    }
    private By registerButton() {
        return By.xpath("//button[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");
    }
    private By alertMessageRegister() {
        return By.xpath("//div[@role='alert']");
    }

    @Step
    public boolean validateOnRegisterPage() {
        return $(registerButton()).isDisplayed();
    }

    @Step
    public void inputName(String name) {
        $(nameField()).type(name);
    }
    @Step
    public void inputEmail(String space) {
        int min = 1;
        int max = 1000000;
        int number = (int)Math.floor(Math.random() * (max - min + 1) + min);
        String email_register = "kusuma" + String.valueOf(number) + "@gmail.com";
        $(emailField()).type(email_register);
    }

    @Step
    public void inputEmptyFullnameForRegister(String empty_fullname_register){
        $(nameField()).type(empty_fullname_register);
    }
    @Step
    public void inputEmptyEmailForRegister(String empty_email_register){
        $(emailField()).type(empty_email_register);
    }

    @Step
    public void inputEmptyPasswordForRegister(String empty_password_register){
        $(passwordField()).type(empty_password_register);
    }

    @Step
    public void inputEmailRegistered(String email) {
        $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickRegisterButton() {
        $(registerButton()).click();
    }

    @Step
    public boolean validateErrorMessageIsDisplayed() {
        return $(alertMessageRegister()).isDisplayed();
    }

    @Step
    public boolean validateEqualErrorMessage(String message) {
        return $(alertMessageRegister()).getText().equalsIgnoreCase(message);
    }
}
