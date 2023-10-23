package starter.Auth;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;
public class Login {
    protected String url = "https://fakestoreapi.com/auth/login";
    private Response response;

    @Step("I set POST endpoint the Fake Store API")
    public void SetPOSTEndpointTheFakeStoreAPI() {
        // Tidak perlu mengembalikan URL, cukup digunakan dalam metode ini.
    }

    @Step("I have valid credentials")
    public void ValidCredentials() {
        // Anda bisa mengatur kredensial valid di sini jika diperlukan.
    }

    @Step("I send a POST HTTP request")
    public void SendAPOSTHTTPRequest() {
        response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body("{\"username\": \"mor_2314\", \"password\": \"83r5^_\"}")
                .post(url);
    }

    @Step("the response status code should be 200")
    public void SendAPOSTHTTPRequestCodeShouldBe200() {
        response.then().statusCode(200);

    }


    // POST - Failed login with invalid credentials
    @Step("I have invalid credentials")
    public void InvalidCredentials() {
        // Anda dapat mengatur kredensial yang tidak valid di sini jika diperlukan.
    }

    @Step("I send a POST invalid HTTP request")
    public void SendAPOSTInvalidHTTPRequest() {
        response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body("{\"username\": \"anastasyazherinvalid\", \"password\": \"mnbvcxz8\"}")
                .post(url);
    }

    // @Step("the response status code should be 200")
    // public void theResponseStatusCodeShouldBe200() {
    //    response.then().statusCode(200);
    //}

    // POST - Invalid endpoint for login
    @Step("I set POST endpoint to an invalid URL")
    public void SetPOSTEndpointToAnInvalidURL() {
        url = "https://fakestoreapi.com/auth/invalid_endpoint";
    }

    @Step("I send a POST to invalid HTTP request")
    public void SendAPOSTToInvalidHTTPRequest() {
        response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body("{\"username\": \"anastasyazherinvalid\", \"password\": \"mnbvcxz8\"}")
                .post(url);
    }

    @Step("the response status code should be 404")
    public void theResponseStatusCodeShouldBe404() {
        response.then().statusCode(404);
    }

}
