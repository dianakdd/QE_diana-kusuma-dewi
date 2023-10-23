package starter.Cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DELETE_Cart {

    public String Valid_Users = "https://fakestoreapi.com/carts/6";
    public String Invalid_Users = "https://fakestoreapi.com/carts/6/Invalid_users";


    @Step("user sets a DELETE valid endpoint for deleting a cart")
    public String userSetsADELETEValidEndpointForDeletingACart() {
        return Valid_Users;
    }

    @Step("user sends a DELETE HTTP request with a valid endpoint to delete a cart")
    public void userSendsADELETEHTTPRequestWithAValidEndpointToDeleteACart() {
        SerenityRest.given().delete(userSetsADELETEValidEndpointForDeletingACart());
    }

    @Step("user receives a DELETE HTTP response code 200 for deleting a cart with a valid endpoint")
    public void userReceivesADELETEHTTPResponseCode200ForDeletingACartWithAValidEndpoint() {
        restAssuredThat(responses -> responses.statusCode(200));
    }

    @Step("user sets a DELETE endpoint with an invalid endpoint for deleting a cart")
    public String userSetsADELETEEndpointWithAnInvalidEndpointForDeletingACart() {
        return Invalid_Users;
    }

    @Step("user sends a DELETE HTTP request with an invalid endpoint to delete a cart")
    public void userSendsADELETEHTTPRequestWithAnInvalidEndpointToDeleteACart() {
        SerenityRest.given().delete(userSetsADELETEEndpointWithAnInvalidEndpointForDeletingACart());
    }

    @Step("user receives a DELETE HTTP response code 404 for deleting a cart with an invalid endpoint")
    public void userReceivesADELETEHTTPResponseCode404ForDeletingACartWithAnInvalidEndpoint() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
