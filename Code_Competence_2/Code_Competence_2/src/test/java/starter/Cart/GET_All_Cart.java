package starter.Cart;


import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GET_All_Cart {
    public String valid_url = "https://fakestoreapi.com/carts";
    public String invalid_url = "https://fakestoreapi.com/carts/invalid";


    @Step("the user set GET valid endpoint")
    public String theUserSetGETValidEndpoint() {
        return valid_url;
    }

    @Step("the user send GET HTTP request with valid endpoint")
    public void theUserSendGETHTTPRequestWithValidEndpoint() {
        SerenityRest.given().get(theUserSetGETValidEndpoint());
    }

    @Step("the user received valid GET HTTP response code 200 OK")
    public void theUserReceivedValidGETHTTPResponseCode200OK() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("the user set GET invalid endpoint")
    public String theUserSetGETInvalidEndpoint() {
        return invalid_url;
    }

    @Step("the user send GET HTTP request with invalid endpoint")
    public void theUserSendGETHTTPRequestWithInvalidEndpoint() {
        SerenityRest.given().get(theUserSetGETInvalidEndpoint());
    }

    @Step("the user received GET HTTP response code 400 bad request")
    public void theUserReceivedGETHTTPResponseCode400BadRequest() {
        restAssuredThat(response -> response.statusCode(400));
    }
}
