package starter.Users;

import io.cucumber.java.sl.In;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
public class POST_New_Users {
    public String Valid_url = "https://fakestoreapi.com/users";
    public  String Invalid_url = "https://fakestoreapi.com/users/ivalid_url";
    @Step("user set POST valid endpoint")
    public String userSetPOSTValidEndpoint() {
        return Valid_url;
    }

    @Step("user send POST HTTP request")
    public void userSendPOSTHTTPRequest() {
        String body = "{ " +
                "\"email\":\"John@gmail.com\", " +
                "\"username\":\"johnd\", " +
                "\"password\":\"m38rmF$\", " +
                "\"name\":{ " +
                "\"firstname\":\"John\", " +
                "\"lastname\":\"Doe\" " +
                "}, " +
                "\"address\":{ " +
                "\"city\":\"kilcoole\", " +
                "\"street\":\"7835 new road\", " +
                "\"number\":3, " +
                "\"zipcode\":\"12926-3874\", " +
                "\"geolocation\":{ " +
                "\"lat\":\"-37.3159\", " +
                "\"long\":\"81.1496\" " +
                "} " +
                "}, " +
                "\"phone\":\"1-570-236-7033\" " +
                "}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(reqBody.toString())
                .post(userSetPOSTValidEndpoint());
    }
    @Step("user received HTTP response code 200")
    public void userReceivedHTTPResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set POST invalid endpoint")
    public String userSetPOSTInvalidEndpoint() {
        return Invalid_url;
    }

    @Step("user send POST HTTP request with invalid endpoint")
    public void userSendPOSTHTTPRequestWithInvalidEndpoint() {
        String body = "{ " +
                "\"email\":\"John@gmail.com\", " +
                "\"username\":\"johnd\", " +
                "\"password\":\"m38rmF$\", " +
                "\"name\":{ " +
                "\"firstname\":\"John\", " +
                "\"lastname\":\"Doe\" " +
                "}, " +
                "\"address\":{ " +
                "\"city\":\"kilcoole\", " +
                "\"street\":\"7835 new road\", " +
                "\"number\":3, " +
                "\"zipcode\":\"12926-3874\", " +
                "\"geolocation\":{ " +
                "\"lat\":\"-37.3159\", " +
                "\"long\":\"81.1496\" " +
                "} " +
                "}, " +
                "\"phone\":\"1-570-236-7033\" " +
                "}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(reqBody.toString())
                .post(userSetPOSTInvalidEndpoint());
    }

    @Step("user received POST HTTP response code 404")
    public void userReceivedPOSTHTTPResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("user send POST HTTP request with input empty request body")
    public void userSendPOSTHTTPRequestWithInputEmptyRequestBody() {
        String body = "{ }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(userSetPOSTValidEndpoint());
    }

    @Step("user received HTTP response code 200 with input empty request body")
    public void userReceivedHTTPResponseCode200WithInputEmptyRequestBody() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user received valid data for new users")
    public static void userReceivedValidDataForNewUsers() {
        restAssuredThat(response -> {
            response.body("id", equalTo(11));
            response.body("email", equalTo(null));
            response.body("username", equalTo(null));
            response.body("password", equalTo(null));
            response.body("name.firstname", equalTo(null));
            response.body("name.lastname", equalTo(null));
            response.body("address.city", equalTo(null));
            response.body("address.street", equalTo(null));
            response.body("address.number", equalTo(null));
            response.body("address.zipcode", equalTo(null));
            response.body("address.geolocation.lat", equalTo(null));
            response.body("address.geolocation.long", equalTo(null));
            response.body("phone", equalTo(null));
        });
    }
}
