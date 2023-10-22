package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LogoutSidebar extends PageObject {
    private By burgerButton() {
        return By.id("react-burger-menu-btn");
    }

    private By logout() {
        return By.id("logout_sidebar_link");
    }

    @Step
    public void clickBurgerButton() {
        $(burgerButton()).click();
    }

    @Step
    public void clickLogoutSidebar() {
        $(logout()).click();
    }
}
