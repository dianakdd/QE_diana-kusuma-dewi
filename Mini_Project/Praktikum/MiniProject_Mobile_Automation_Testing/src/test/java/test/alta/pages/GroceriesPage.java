package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import test.alta.pageobject.BasePageObject;
import org.openqa.selenium.By;

public class GroceriesPage extends BasePageObject {

    private By textPage(){ return MobileBy.xpath("//android.view.View[@content-desc=\"Your Groceries\"]");}

    private By addIcon(){ return MobileBy.xpath("//android.widget.Button");}

    private By textPageOnAddPage(){ return MobileBy.xpath("//android.view.View[@content-desc=\"Add a new item\"]");}

    private By nameField(){return MobileBy.xpath("//android.widget.EditText[@text=\"Name\"]");}

    private By addItem(){return  MobileBy.xpath("//android.widget.Button[@content-desc=\"Add Item\"]");}

    private By errorMessage(){return MobileBy.className("android.view.View");}
    @Step
    public boolean isOnGroceriesPage() {
        return waitUntilPresence(textPage()).isDisplayed();
    }

    @Step
    public void onClickAddIcon() {
        onClick(addIcon());
    }

    @Step
    public boolean isOnAddItemPage() {
        return waitUntilPresence(textPageOnAddPage()).isDisplayed();
    }

    @Step
    public void inputInvalidName(String name) {
        onType(nameField(), name);
    }

    @Step
    public void onClickAddItemButton() {
        onClick(addItem());
    }

    @Step
    public boolean errorMessageIsShow() {
        return waitUntilPresence(errorMessage()).isDisplayed();
    }
}
