package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.loginPage;
import starter.pages.productPage;

public class loginSteps {
    @Steps
    loginPage loginpage;
    productPage productpage;

    @Given("I am on the login page")
    public void onTheLoginPage() {
        loginpage.openUrl("https://alta-shop.vercel.app/auth/login");
        Assertions.assertTrue(loginpage.validateOnLoginPage());
    }

    @When("I input valid email")
    public void inputValidEmail() {
        loginpage.inputEmail("dianakd@gmail.com");
    }

    @And("I input valid password")
    public void inputValidPassword() {
        loginpage.inputPassword("dianacantik");
    }

    @And("I click login button")
    public void clickLoginButton() {
        loginpage.clickLoginButton();
    }

    @Then("I am on the product page")
    public void onTheInventoryPage() {
        Assertions.assertTrue(productpage.onProductPage());
    }

    @And("I input empty password")
    public void inputEmptyPassword(){loginpage.inputPassword("");}

    @And("I input empty email")
    public void inputEmptyEmail(){loginpage.inputEmail("");}

    @Then("I got error message {string}")
    public void validErrorMessageIsDisplayedForEmptyPassword(String message) {
        Assertions.assertTrue(loginpage.validateErrorMessageIsDisplayed());
        Assertions.assertTrue(loginpage.validateEqualErrorMessage(message));
    }

    @When("I input invalid email")
    public void inputInvalidEmail() {
        loginpage.inputEmail("dianaaja@gmail.com");
    }

    @And("I input invalid password")
    public void inputInvalidPassword() {
        loginpage.inputPassword("hehe");
    }


}
