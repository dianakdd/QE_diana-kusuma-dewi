package starter.post;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GET_All_Post {
    public String validEndpointPostUser = "https://jsonplaceholder.typicode.com/posts";
    public String invalidEndpointPostUser = "https://jsonplaceholder.typicode.com/post";

    @Step("user set valid GET all Post endpoint")
    public String setValidGETAllPostEndpointAsUser(){
        return validEndpointPostUser;
    }

    @Step("user send GET HTTP request with valid endpoint for all Post")
    public void sendGETHTTPRequestWithValidEndpointForAllPostAsUser(){
        SerenityRest.given().get(setValidGETAllPostEndpointAsUser());
    }

    @Step("user received valid GET HTTP response code 200 for all Post")
    public void validateGETHTTPResponseCode200ForAllPostAsUser(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("As a user i want to get all Post with invalid endpoint")
    public String setInvalidGETAllPostEndpointAsUser(){
        return invalidEndpointPostUser;
    }

    @Step("send GET HTTP request with invalid endpoint for all Post as user")
    public void sendGETHTTPRequestWithInvalidEndpointForAllPostAsUser(){
        SerenityRest.given().get(setInvalidGETAllPostEndpointAsUser());
    }

    @Step("received GET HTTP response code 404 for all Post as user")
    public void validateGETHTTPResponseCode404ForAllPostAsUser() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send GET HTTP request with invalid method for all Post as user")
    public void sendGETHTTPRequestWithInvalidMethodForAllPostAsUser(){
        SerenityRest.given().post(setValidGETAllPostEndpointAsUser());
    }

    @Step("received GET HTTP response code 500 for all Post as user")
    public void validateGETHTTPResponseCode500ForAllPostAsUser(){
        restAssuredThat(response -> response.statusCode(500));
    }

}
