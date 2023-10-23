package starter.Users;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static io.restassured.RestAssured.given;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class GET_All_Users {
    public String valid_url = "https://fakestoreapi.com/users";
    public String invalid_url = "https://fakestoreapi.com/users/invalid";

    @Step("user set GET valid endpoint")
    public String userSetGETValidEndpoint() {
        return valid_url;
    }

    @Step("user send GET HTTP request with valid endpoint")
    public void userSendGETHTTPRequestWithValidEndpoint() {
        SerenityRest.given().get(userSetGETValidEndpoint());
    }

    @Step("user received valid GET HTTP response code 200")
    public void userReceivedValidGETHTTPResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set GET invalid endpoint")
    public String userSetGETInvalidEndpoint() {
        return invalid_url;
    }

    @Step("user send GET HTTP request with invalid endpoint")
    public void userSendGETHTTPRequestWithInvalidEndpoint() {
        SerenityRest.given().get(userSetGETInvalidEndpoint());
    }

    @Step("user received GET HTTP response code 400")
    public void userReceivedGETHTTPResponseCode400() {
        restAssuredThat(response -> response.statusCode(400));
    }

}
