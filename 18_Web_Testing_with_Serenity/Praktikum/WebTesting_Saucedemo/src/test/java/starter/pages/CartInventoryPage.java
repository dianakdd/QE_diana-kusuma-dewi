package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class CartInventoryPage extends PageObject {
    private By title() {
        return By.className("title");
    }

    private By addToCartButton() {
        return By.id("add-to-cart-sauce-labs-backpack");
    }

    private By cartCounter() {
        return By.className("shopping_cart_badge");
    }


    @Step
    public boolean validateOnInventoryPage() {
        return $(title()).isDisplayed();
    }

    @Step
    public boolean addToCartButtonIsDisplayed() {
        return $(addToCartButton()).isDisplayed();
    }

    @Step
    public void clickAddToCartButton() {
        $(addToCartButton()).click();
    }

    @Step
    public boolean validateCartCounterIsDisplayed() {
        return $(cartCounter()).isDisplayed();
    }

    @Step
    public boolean validateCartCounter() {
        return $(cartCounter()).getText().equals("1");
    }

}