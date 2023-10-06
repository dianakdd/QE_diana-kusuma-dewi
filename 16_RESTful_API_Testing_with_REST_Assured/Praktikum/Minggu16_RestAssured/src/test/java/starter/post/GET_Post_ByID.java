package starter.post;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GET_Post_ByID {
    public String validUrlPostUser = "https://jsonplaceholder.typicode.com/posts/1";
    public String invalidUrlPostUser = "https://jsonplaceholder.typicode.com/post/1";
    public String invalidIDPostUser = "https://jsonplaceholder.typicode.com/posts/3";

    @Step("set valid GET Post by ID endpoint as user")
    public String setValidGETPostByIDEndpointAsUser(){
        return validUrlPostUser;
    }

    @Step("send GET HTTP request with valid endpoint for post by ID as user")
    public void sendGETHTTPRequestWithValidEndpointForPostByIDAsUser(){
        SerenityRest.given().get(setValidGETPostByIDEndpointAsUser());
    }

    @Step("received valid GET HTTP response code 200 for post by ID as user")
    public void validateGETHTTPResponseCode200ForPostByIDAsUser(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set invalid GET post by ID endpoint as user")
    public String setInvalidGETPostByIDEndpointAsUser(){
        return invalidUrlPostUser;
    }

    @Step("send GET HTTP request with invalid endpoint for post by ID as user")
    public void sendGETHTTPRequestWithInvalidEndpointForPostByIDAsUser(){
        SerenityRest.given().get(setInvalidGETPostByIDEndpointAsUser());
    }

    @Step("received GET HTTP response code 404 for post by ID as user")
    public void validateGETHTTPResponseCode404ForPostByIDAsUser(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send GET HTTP request with invalid method for post by ID as user")
    public void sendGETHTTPRequestWithInvalidMethodForPostByIDAsUser(){
        SerenityRest.given().post(setValidGETPostByIDEndpointAsUser());
    }

    @Step("received GET HTTP response code 500 for post by ID as user")
    public void validateGETHTTPResponseCode500ForPostByIDAsUser(){
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("set valid GET post by ID endpoint with invalid ID as user")
    public String setValidGETPostByIDEndpointWithInvalidIDAsUser(){
        return invalidIDPostUser;
    }

    @Step("send GET HTTP request with invalid ID for post by ID as user")
    public void sendGETHTTPRequestWithInvalidIDForPostByIDAsUser(){
        SerenityRest.given().get(setValidGETPostByIDEndpointWithInvalidIDAsUser());
    }
}
