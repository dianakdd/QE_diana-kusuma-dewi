package starter.Cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
public class GET_User_Cart {
    public String Valid_url = "https://fakestoreapi.com/carts/user/2";
    public String Invalid_url = "https://fakestoreapi.com/carts/user/2/Invalid_url";


    @Step("user set GET valid endpoint to get user carts")
    public String userSetGETValidEndpointToGetUserCarts() {
        return Valid_url;
    }

    @Step("user send GET HTTP request to get user carts with valid endpoint")
    public void userSendGETHTTPRequestToGetUserCartsWithValidEndpoint() {
        SerenityRest.given().get(userSetGETValidEndpointToGetUserCarts());
    }

    @Step("user received valid GET HTTP response code 200 to get user carts")
    public void userReceivedValidGETHTTPResponseCode200ToGetUserCarts() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set GET invalid endpoint to get user carts")
    public String userSetGETInvalidEndpointToGetUserCarts() {
        return Invalid_url;
    }

    @Step("user send GET HTTP request to get user carts with invalid endpoint")
    public void userSendGETHTTPRequestToGetUserCartsWithInvalidEndpoint() {
        SerenityRest.given().get(userSetGETInvalidEndpointToGetUserCarts());
    }

    @Step("user received GET HTTP response code 404 with invalid endpoint")
    public void user_received_get_http_response_code_404_with_invalid_endpoint() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("user received valid data for getting user carts")
    public void userReceivedValidDataForGettingUserCarts() {
        restAssuredThat(response -> {
            response.body("size()", equalTo(1));
            response.body("id[0]", equalTo(3));
            response.body("userId[0]", equalTo(2));
            response.body("date[0]", equalTo("2020-03-01T00:00:00.000Z"));
        });
    }
}
