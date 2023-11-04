package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.productPage;
import starter.pages.registerPage;

public class registerSteps {
    @Steps
    registerPage registerpage;

    productPage productpage;

    @Given("I am on the register page")
    public void onTheLoginPage() {
        registerpage.openUrl("https://alta-shop.vercel.app/auth/register");
        Assertions.assertTrue(registerpage.validateOnRegisterPage());
    }

    @And("I input valid fullname for register")
    public void inputValidName() {
        registerpage.inputName("kusuma");
    }

    @And("I input valid email for register")
    public void inputValidEmail() {
        registerpage.inputEmail(" ");
    }

    @And("I input valid password for register")
    public void inputValidPassword() {
        registerpage.inputPassword("dianacantik");
    }

    @And("I click register button")
    public void clickLoginButton() {
        registerpage.clickRegisterButton();
    }

    @Then("I got error message register {string}")
    public void validErrorMessageIsDisplayedRegister(String message) {
        Assertions.assertTrue(registerpage.validateErrorMessageIsDisplayed());
        Assertions.assertTrue(registerpage.validateEqualErrorMessage(message));
    }

    @When("I input empty fullname for register")
    public void userInputEmptyFullnameForRegister() {
        registerpage.inputEmptyFullnameForRegister("");
    }

    @And("I input empty email for register")
    public void userInputEmptyEmailForRegister() {
        registerpage.inputEmptyEmailForRegister("");
    }

    @And("I input empty password for register")
    public void userInputEmptyPasswordForRegister() {
        registerpage.inputEmptyPasswordForRegister("");
    }

    @And("I input fullname for register")
    public void inputRegisteredName() {
        registerpage.inputName("Diana");
    }

    @And("I input email for register")
    public void inputRegisteredEmail() {
        registerpage.inputEmailRegistered("dianakd@gmail.com");
    }

    @And("I input password for register")
    public void inputRegisteredPassword() {
        registerpage.inputPassword("dianacantik");
    }


}
