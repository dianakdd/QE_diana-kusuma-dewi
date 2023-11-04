package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.productPage;
import starter.pages.transactionsPage;

public class transactionsSteps {
    @Steps
    productPage productpage;
    transactionsPage transactionpage;

    @When("I click profile icon")
    public void userClickProfileIcon() {
        productpage.clickProfileIcon();
    }

    @And("I click transaksi button")
    public void userClickTransaksiButton() {
        productpage.clickTransaksiButton();
    }

    @Then("I see the transactions")
    public void userSeeTheTransactions() {
        transactionpage.seeTheTransactions();
    }

    @And("I click logout icon")
    public void userClickLogoutIcon() {
        productpage.clickLogoutIcon();
    }
}
