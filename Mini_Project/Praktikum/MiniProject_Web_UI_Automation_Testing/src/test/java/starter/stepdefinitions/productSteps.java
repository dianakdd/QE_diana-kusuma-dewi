package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.cartPage;
import starter.pages.loginPage;
import starter.pages.productPage;

public class productSteps {
    @Steps
    loginPage loginpage;
    productPage productpage;
    cartPage cartpage;

    @Given("I am already login")
    public void userAreLogin() {
        productpage.openUrl("https://alta-shop.vercel.app/auth/login");
        loginpage.validateOnLoginPage();
        loginpage.inputEmail("dianakd@gmail.com");
        loginpage.inputPassword("dianacantik");
        loginpage.clickLoginButton();
        productpage.onProductPage();
    }

    @Given("I am already on product page")
    public void userAreOnProductPage() {
        productpage.openUrl("https://alta-shop.vercel.app/");
        Assertions.assertTrue(productpage.onProductPage());
    }

    @When("I click detail button")
    public void userClickDetailButton() {
        productpage.clickDetailProductButton();
    }

    @Then("I see detail product successfully")
    public void userSeeDetailProductSuccessfully() {
        productpage.seeDetailProduct();
    }

    @When("I click beli button")
    public void userClickBeliButton() {
        productpage.clickBeliButton();
    }

    @Then("I see product in cart")
    public void userSeeProductInCart() {
        cartpage.seeProductInCart();
    }

    @And("I click cart button")
    public void userClickCartButton() {
        cartpage.clickCartButton();
    }
}
