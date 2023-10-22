package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.PaymentMethodPage;

public class PilihMetodePembayaranSteps {
    @Steps
    PaymentMethodPage paymentMethodPage;

    @When("I am on the payment method page")
    public void onPaymentMethodPage() {paymentMethodPage.validateOnPaymentMethodPage();}

    @And("I click another payment method text")
    public void clickAnotherPaymentMethodText() {paymentMethodPage.clickAnotherPaymentMethod();}

    @And("I choose payment via Gopay")
    public void choosePaymentMethodViaGopay() {paymentMethodPage.choosePaymentMethod();}

    @Then("I can continue to payment")
    public void clickPaymentNowToContinue() {paymentMethodPage.clickPaymentNow();}

    @And("I click continue to payment")
    public void clickPaymentNowToContinueBeforeChoose() {paymentMethodPage.clickPaymentNow();}

    @Then("I got error message after click continue before choosing payment {string}")
    public void validErrorMessageWithInvalidMoreThan13Digits(String message) {
        Assertions.assertTrue(paymentMethodPage.validateErrorMessageAtPaymentMethodPage());
        Assertions.assertTrue(paymentMethodPage.validateEqualErrorMessageAtPaymentMethodPage(message));
    }
}
