package starter.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DELETE_Product {
    public String Valid_url = "https://fakestoreapi.com/products/6";
    public  String Invalid_url = "https://fakestoreapi.com/products/6/Invalid_product";

    @Step("the user has a valid endpoint to delete")
    public String UserHasAValidEndpointToDelete() {
        return Valid_url;
    }

    @Step("the user sends a DELETE HTTP request with a valid endpoint")
    public void UserSendsADELETEHTTPRequestWithAValidEndpoint() {
        SerenityRest.given().delete(UserHasAValidEndpointToDelete());
    }

    @Step("the user receives a DELETE HTTP response code 200 with a valid endpoint")
    public void UserReceivesADELETEHTTPResponseCode200WithAValidEndpoint() {
        restAssuredThat(responses -> responses.statusCode(200));
    }

    @Step("the user has an invalid endpoint to delete")
    public String UserHasAnInvalidEndpointToDelete() {
        return Invalid_url;
    }

    @Step("the user sends a DELETE HTTP request with an invalid endpoint")
    public void UserSendsADELETEHTTPRequestWithAnInvalidEndpoint() {
        SerenityRest.given().delete(UserHasAnInvalidEndpointToDelete());
    }

    @Step("the user receives a DELETE HTTP response code 404 with an invalid endpoint")
    public void UserReceivesADELETEHTTPResponseCode404WithAnInvalidEndpoint() {
        restAssuredThat(responses -> responses.statusCode(404));
    }
}
