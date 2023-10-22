package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.CartInventoryPage;

public class CartSteps {
    @Steps
    CartInventoryPage inventoryPage;

    @When("I add item to the cart")
    public void addItemToTheCart() {
        Assertions.assertTrue(inventoryPage.addToCartButtonIsDisplayed());
        inventoryPage.clickAddToCartButton();
    }

    @Then("Item is added to the cart")
    public void itemIsAddedToTheCart() {
        Assertions.assertTrue(inventoryPage.validateCartCounterIsDisplayed());
        Assertions.assertTrue(inventoryPage.validateCartCounter());
    }
}
