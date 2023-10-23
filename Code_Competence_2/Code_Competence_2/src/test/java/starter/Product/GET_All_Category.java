package starter.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GET_All_Category {
    public String valid_url = "https://fakestoreapi.com/products/categories";
    public String invalid_url = "https://fakestoreapi.com/products/categories/invalid_url";

    @Step("user set GET valid endpoint for all categories")
    public String userSetGETValidEndpointForAllCategories() {
        return valid_url;
    }

    @Step("user send GET HTTP request with valid endpoint for all categories")
    public void userSendGETHTTPRequestWithValidEndpointForAllCategories() {
        SerenityRest.given().get(userSetGETValidEndpointForAllCategories());
    }

    @Step("user received valid GET HTTP response code 200 for all categories")
    public void userReceivedValidGETHTTPResponseCode200ForAllCategories() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set GET invalid endpoint for all categories")
    public String userSetGETInvalidEndpointForAllCategories() {
        return invalid_url;
    }

    @Step("user send GET HTTP request with invalid endpoint for all categories")
    public void userSendGETHTTPRequestWithInvalidEndpointForAllCategories() {
        SerenityRest.given().get(userSetGETInvalidEndpointForAllCategories());
    }

    @Step("user received GET HTTP response code 404 for all categories")
    public void userReceivedGETHTTPResponseCode404ForAllCategories() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
