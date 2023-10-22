package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("I am on the login page")
    public void onTheLoginPage() {
        loginPage.openUrl("https://www.sepulsa.com/signin");
        Assertions.assertTrue(loginPage.validateOnLoginPage());
    }

    @When("I input valid username")
    public void inputValidUsername() {
        loginPage.inputEmail("blackpink@yopmail.com");
    }

    @And("I input valid password")
    public void inputValidPassword() {
        loginPage.inputPassword("hahahaha");
    }

    @And("I click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I am on the home page")
    public void onTheInventoryPage() {
        loginPage.openUrl("https://www.sepulsa.com/");
        Assertions.assertTrue(homePage.validateOnHomePage());
    }

    @When("I input invalid username")
    public void inputInvalidUsername() {
        loginPage.inputEmail("anjay@yopmail.com");
    }

    @And("I input invalid password")
    public void inputInvalidPassword() {
        loginPage.inputPassword("sukasukague");
    }

    @Then("I got error message {string}")
    public void validErrorMessageIsDisplayed(String message) {
        Assertions.assertTrue(loginPage.validateErrorMessageIsDisplayed());
        Assertions.assertTrue(loginPage.validateEqualErrorMessage(message));
    }

}
