package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.HomePage;
import starter.pages.ProductPage;

public class PilihProdukSteps {

    @Steps
    ProductPage produkPage;

    @Steps
    HomePage homePage;

    @When("I choose the product")
    public void chooseTheProduct() {homePage.clickTheProduct();}

    @And("I input valid phone number")
    public void inputValidPhoneNumber() {
        produkPage.inputPhoneNumber("082236909663");
    }

    @Then("I choose nominal price product detail")
    public void chooseTheProductDetail() {produkPage.clickTheProductDetail();}

    @And("I input invalid phone number")
    public void inputInvalidPhoneNumber() {
        produkPage.inputPhoneNumber("4336306930693");
    }

    @Then("I can not go to the payment method")
    public void canNotGoToPayment() {}

    @And("I input more than 13 digits phone number")
    public void inputMoreThan13Digits() {
        produkPage.inputPhoneNumber("01111111111111");
    }

    @Then("I got error message after input more than 13 digits {string}")
    public void validErrorMessageWithInvalidMoreThan13Digits(String message) {
        Assertions.assertTrue(produkPage.validateErrorMessageWith13Digits());
        Assertions.assertTrue(produkPage.validateEqualErrorMessageWith13Digits(message));
    }

}
