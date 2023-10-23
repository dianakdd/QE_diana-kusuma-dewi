package starter.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class GET_Product_Spect_Category {
    public String valid_url = "https://fakestoreapi.com/products/category/jewelery";

    public String invalid_url = "https://fakestoreapi.com/products/category/jewelery/invalid_url";

    @Step("user set GET valid endpoint for all Product Specific Category")
    public String userSetGETValidEndpointForAllProductSpecificCategory() {
        return valid_url;
    }

    @Step("user send GET HTTP request with valid endpoint for Product Specific Category")
    public void userSendGETHTTPRequestWithValidEndpointForProductSpecificCategory() {
        SerenityRest.given().get(userSetGETValidEndpointForAllProductSpecificCategory());
    }

    @Step("user received valid GET HTTP response code 200 for Product Specific Category")
    public void userReceivedValidGETHTTPResponseCodeForProductSpecificCategory() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set GET invalid endpoint for all Product Specific Category")
    public String userSetGETInvalidEndpointForAllProductSpecificCategory() {
        return invalid_url;
    }

    @Step("user send GET HTTP request with invalid endpoint for all Product Specific Category")
    public void userSendGETHTTPRequestWithInvalidEndpointForAllProductSpecificCategory() {
        SerenityRest.given().get(userSetGETInvalidEndpointForAllProductSpecificCategory());
    }

    @Step("user received GET HTTP response code 404 for all Product Specific Category")
    public void userReceivedGETHTTPResponseCode404ForAllProductSpecificCategory() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
