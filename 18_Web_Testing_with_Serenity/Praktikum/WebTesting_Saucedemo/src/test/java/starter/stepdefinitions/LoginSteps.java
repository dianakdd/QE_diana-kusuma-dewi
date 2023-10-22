package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.LoginPage;
import starter.pages.CartInventoryPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    CartInventoryPage inventoryPage;

    @Given("I am on the login page")
    public void onTheLoginPage() {
        loginPage.openUrl("https://www.saucedemo.com/");
        Assertions.assertTrue(loginPage.validateOnLoginPage());
    }

    @When("I input valid username")
    public void inputValidUsername() {
        loginPage.inputUsername("standard_user");
    }

    @When("I input locked username")
    public void inputLockedUsername() {
        loginPage.inputUsername("locked_out_user");
    }

    @And("I input valid password")
    public void inputValidPassword() {
        loginPage.inputPassword("secret_sauce");
    }

    @And("I click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I am on the inventory page")
    public void onTheInventoryPage() {
        Assertions.assertTrue(inventoryPage.validateOnInventoryPage());
    }

    @Then("I got error message {string}")
    public void validErrorMessageIsDisplayed(String message) {
        Assertions.assertTrue(loginPage.validateErrorMessageIsDisplayed());
        Assertions.assertTrue(loginPage.validateEqualErrorMessage(message));
    }

}
