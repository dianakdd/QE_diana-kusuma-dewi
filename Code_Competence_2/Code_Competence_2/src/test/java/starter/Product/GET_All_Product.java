package starter.Product;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GET_All_Product {
    public String Valid_url = "https://fakestoreapi.com/products";
    public String Invalid_url = "https://fakestoreapi.com/products/invalid_url";

    @Step("user received valid GET HTTP response code 200 OK")
    public void userReceivedValidGETHTTPResponseCode200OK() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user received GET HTTP response code 400 bad request")
    public void userReceivedGETHTTPResponseCode400BadRequest() {
        restAssuredThat(response -> response.statusCode(400));
    }
}
