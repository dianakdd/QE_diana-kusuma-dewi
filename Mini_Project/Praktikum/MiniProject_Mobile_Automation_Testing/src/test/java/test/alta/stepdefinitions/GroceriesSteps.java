package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.alta.pages.GroceriesPage;

public class GroceriesSteps {

    @Steps
    GroceriesPage groceriesPage;

    @Given("user on the groceries page")
    public void onTheGroceriesPage(){
        boolean actual = groceriesPage.isOnGroceriesPage();
        Assert.assertTrue(actual);
    }

    @When("user click add icon")
    public void userClickAddIcon(){
        groceriesPage.onClickAddIcon();
    }

    @And("user on the add item page")
    public void onTheAddItemPage(){
        boolean actual = groceriesPage.isOnAddItemPage();
        Assert.assertTrue(actual);
    }

    @And("user input empty name")
    public void userInputInvalidNameField(){
        String name = "1";
        groceriesPage.inputInvalidName("name");
    }

    @And("user click add item button")
    public void userClickAddItemButton(){
        groceriesPage.onClickAddItemButton();
    }

    @Then("user see error {string} message")
    public void userSeeErrorMessage(String message){
        boolean actual = groceriesPage.errorMessageIsShow();
        Assert.assertTrue(actual);
    }

}
