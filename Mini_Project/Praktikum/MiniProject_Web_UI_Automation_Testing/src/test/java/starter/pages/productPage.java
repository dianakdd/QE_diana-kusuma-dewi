package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class productPage extends PageObject {
    private By titleProductPage() { return By.xpath("//h3[normalize-space()='AltaShop']");}

    @Step
    public boolean onProductPage(){
        return $(titleProductPage()).isDisplayed();
    }

    private By profileIcon(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]");
    }

    private By logoutButton(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]");
    }

    private By detailProductButton(){
        return By.xpath("(//button[@type='button'])[5]");
    }

    private By detailProductTittle(){
        return By.xpath("//p[text()='Sony PS5']");
    }

    private By beliButton(){
        return By.xpath("//div[@id='85532']//button[2]");
    }

    private By transaksiButton(){
        return By.xpath("//div[contains(text(),' Transaksi ')]");
    }

    private By logoutIcon(){
        return By.xpath("//div[contains(text(),' Logout ')]");
    }

    @Step
    public void clickLogoutButton(){
        $(logoutButton()).click();
    }

    @Step
    public void onProductPageSuccessfully(){
        $(profileIcon()).isDisplayed();
    }

    @Step
    public void clickDetailProductButton(){
        $(detailProductButton()).click();
    }

    @Step
    public void seeDetailProduct(){
        $(detailProductTittle()).isDisplayed();
    }

    @Step
    public void clickBeliButton(){
        $(beliButton()).click();
    }

    @Step
    public void clickProfileIcon(){
        $(profileIcon()).click();
    }

    @Step
    public void clickTransaksiButton(){
        $(transaksiButton()).click();
    }

    @Step
    public void clickLogoutIcon(){
        $(logoutIcon()).click();
    }
}
