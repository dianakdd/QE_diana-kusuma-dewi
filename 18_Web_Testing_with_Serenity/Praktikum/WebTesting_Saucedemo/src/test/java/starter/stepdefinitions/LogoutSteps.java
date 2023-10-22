package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LogoutSidebar;

public class LogoutSteps {

    @Steps
    LogoutSidebar logout;

    @When("I click burger button")
    public void clickBurgerButton() {
        logout.clickBurgerButton();
    }

    @Then("I click logout sidebar")
    public void clickLogoutSidebar() {
        logout.clickLogoutSidebar();
    }

}
