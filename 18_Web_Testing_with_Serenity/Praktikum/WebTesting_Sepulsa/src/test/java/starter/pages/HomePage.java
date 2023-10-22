package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
public class HomePage extends PageObject{

    private By productHome() {
        return By.xpath("//*[@class='product-name']");
    }

    private By product() { return By.id("product_type_0");}

    @Step
    public boolean validateOnHomePage() {
        return $(productHome()).isDisplayed();
    }

    @Step
    public void clickTheProduct() {
        $(product()).click();
    }

}
