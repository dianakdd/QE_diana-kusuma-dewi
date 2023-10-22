package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.Checkout;

public class CheckoutSteps {

    @Steps
    Checkout checkout;

    @When("I click shopping cart icon")
    public void clickShoppingCartIcon() {
        checkout.clickShoppingCart();
    }

    @And("I click button checkout")
    public void clickCheckoutButton() {
        checkout.clickCheckout();
    }

    @And("I input valid first name")
    public void inputValidFirstname() {
        checkout.inputFirstname("Diana");
    }

    @And("I input valid last name")
    public void inputValidLastname() {
        checkout.inputLastname("Kusuma");
    }

    @And("I input valid postal code")
    public void inputValidPostalCode() {
        checkout.inputPostalCode("61258");
    }

    @And("I click button continue")
    public void clickContinueCheckoutButton() {
        checkout.clickContinueCheckout();
    }

    @And("I click button finish")
    public void clickFinishCheckoutButton() {
        checkout.clickFinishCheckout();
    }

    @Then("Item is already checked out")
    public void clickBackToHomeButton() {
        checkout.clickBackToHome();
    }
}
