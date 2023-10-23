package starter.Users;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class PUT_Users {
    public String Valid_url = "https://fakestoreapi.com/users/7";
    public String Invalid_url = "https://fakestoreapi.com/users/7/Invalid_url";

    @Step("the user sets a valid PUT endpoint")
    public String UserSetsAValidPUTEndpoint() {
        return Valid_url;
    }
    @Step("the user sends a PUT HTTP request")
    public void UserSendsAPUTHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "John@gmail.com");
        requestBody.put("username", "johnd");
        requestBody.put("password", "m38rmF$");

        JSONObject nameObject = new JSONObject();
        nameObject.put("firstname", "John");
        nameObject.put("lastname", "Doe");
        requestBody.put("name", nameObject);

        JSONObject addressObject = new JSONObject();
        addressObject.put("city", "kilcoole");
        addressObject.put("street", "7835 new road");
        addressObject.put("number", 3);
        addressObject.put("zipcode", "12926-3874");

        JSONObject geolocationObject = new JSONObject();
        geolocationObject.put("lat", "-37.3159");
        geolocationObject.put("long", "81.1496");

        addressObject.put("geolocation", geolocationObject);

        requestBody.put("address", addressObject);
        requestBody.put("phone", "1-570-236-7033");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(UserSetsAValidPUTEndpoint());
    }

    @Step("the user receives an HTTP response code 200")
    public void UserReceivesAnHTTPResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("the user sets an invalid PUT endpoint")
    public String UserSetsAnInvalidPUTEndpoint() {
        return Invalid_url;
    }

    @Step("the user sends a PUT HTTP request with an invalid endpoint")
    public void UserSendsAPUTHTTPRequestWithAnInvalidEndpoint() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "John@gmail.com");
        requestBody.put("username", "johnd");
        requestBody.put("password", "m38rmF$");

        JSONObject nameObject = new JSONObject();
        nameObject.put("firstname", "John");
        nameObject.put("lastname", "Doe");
        requestBody.put("name", nameObject);

        JSONObject addressObject = new JSONObject();
        addressObject.put("city", "kilcoole");
        addressObject.put("street", "7835 new road");
        addressObject.put("number", 3);
        addressObject.put("zipcode", "12926-3874");

        JSONObject geolocationObject = new JSONObject();
        geolocationObject.put("lat", "-37.3159");
        geolocationObject.put("long", "81.1496");

        addressObject.put("geolocation", geolocationObject);

        requestBody.put("address", addressObject);
        requestBody.put("phone", "1-570-236-7033");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(UserSetsAnInvalidPUTEndpoint());
    }

    @Step("the user receives an HTTP response code 404 not content")
    public void UserReceivesAnHTTPResponseCodeNot404Content() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
