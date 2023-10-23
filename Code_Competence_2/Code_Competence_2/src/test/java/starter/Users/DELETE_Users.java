package starter.Users;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DELETE_Users {
    public String Valid_Users = "https://fakestoreapi.com/users/6";
    public String Invalid_Users = "https://fakestoreapi.com/users/6/Invalid_users";

    @Step("user set DELETE valid endpoint")
    public String userSetDELETEValidEndpoint() {
        return Valid_Users;
    }

    @Step("user send DELETE HTTP request with valid endpoint")
    public void userSendDELETEHTTPRequestWithValidEndpoint() {
        SerenityRest.given().delete(userSetDELETEValidEndpoint());
    }

    @Step("user received DELETE HTTP response code 200 with valid endpoint")
    public void userReceivedDELETEHTTPResponseCode200WithValidEndpoint() {
        restAssuredThat(responses -> responses.statusCode(200));
    }

    @Step("user set DELETE endpoint with invalid endpoint")
    public String userSetDELETEEndpointWithInvalidEndpoint() {
        return Invalid_Users;
    }

    @Step("user send DELETE HTTP request with invalid endpoint")
    public void userSendDELETEHTTPRequestWithInvalidEndpoint() {
        SerenityRest.given().delete(userSetDELETEEndpointWithInvalidEndpoint());
    }

    @Step("user received DELETE HTTP response code 404 with invalid endpoint")
    public void userReceivedDELETEHTTPResponseCode404WithInvalidEndpoint() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
