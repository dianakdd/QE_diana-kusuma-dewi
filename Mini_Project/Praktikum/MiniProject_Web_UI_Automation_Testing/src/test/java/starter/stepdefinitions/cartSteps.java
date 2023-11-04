package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.cartPage;
import starter.pages.productPage;
import starter.pages.transactionsPage;

public class cartSteps {
    @Steps
    cartPage cartpage;
    transactionsPage transactionspage;

    @And("I on cart page")
    public void userOnCartPage() {
        cartpage.onCartPage();
    }

    @When("I click plus icon")
    public void userClickPlusIcon() {
        cartpage.clickPlusIcon();
    }

    @Then("I see quantity of product increases successfully")
    public void userSeeQuantityOfProductIncreasesSuccessfully() {
        cartpage.seeQuantityProduct();
    }

    @When("I click min icon")
    public void userClickMinIcon() {
        cartpage.clickMinIcon();
    }

    @Then("I see quantity of product reduces successfully")
    public void userSeeQuantityOfProductReducesSuccessfully() {
        cartpage.seeQuantityProduct();
    }

    @Then("I see {string}")
    public void userSee(String arg0) {
        cartpage.seeProductEmptyTitle();
    }

    @When("I click bayar button")
    public void userClickBayarButton() {
        cartpage.clickBayarButton();
    }

    @Then("I am on the transactions page")
    public void userOnTransactionsPage() {
        transactionspage.onTransactionsPage();
    }
}
