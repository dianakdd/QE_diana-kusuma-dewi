package starter.Users;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
public class GET_Single_Users {
    public String valid_url = "https://fakestoreapi.com/users/1";
    public String Invalid_url = "https://fakestoreapi.com/users/1/invalid";

    @Step("user set GET valid endpoint for users by ID")
    public String userSetGETValidEndpointForUsersByID() {
        return valid_url;
    }

    @Step("user send GET HTTP request with valid endpoint for users by ID")
    public void userSendGETHTTPRequestWithValidEndpointForUsersByID() {
        SerenityRest.given().get(userSetGETValidEndpointForUsersByID());
    }

    @Step("user received valid GET HTTP response code 200 for users by ID")
    public void userReceivedValidGETHTTPResponseCode200ForUsersByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set GET invalid endpoint for users by ID")
    public String userSetGETInvalidEndpointForUsersByID() {
        return Invalid_url;
    }

    @Step("user send GET HTTP request with invalid endpoint for users by ID")
    public void userSendGETHTTPRequestWithInvalidEndpointForUsersByID() {
        SerenityRest.given().get(userSetGETInvalidEndpointForUsersByID());
    }

    @Step("user received GET HTTP response code 404 for users by ID")
    public void userReceivedGETHTTPResponseCode404ForUsersByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("user received valid data for users by ID")
    public void userReceivedValidDataForUsersByID() {
        restAssuredThat(response -> {
            response.body("id", equalTo(1));
            response.body("email", equalTo("john@gmail.com"));
            response.body("username", equalTo("johnd"));
            response.body("password", equalTo("m38rmF$"));
            response.body("name.firstname", equalTo("john"));
            response.body("name.lastname", equalTo("doe"));
            response.body("address.city", equalTo("kilcoole"));
            response.body("address.street", equalTo("new road"));
            response.body("address.number", equalTo(7682));
            response.body("address.zipcode", equalTo("12926-3874"));
            response.body("address.geolocation.lat", equalTo("-37.3159"));
            response.body("address.geolocation.long", equalTo("81.1496"));
            response.body("phone", equalTo("1-570-236-7033"));
        });
    }
}
