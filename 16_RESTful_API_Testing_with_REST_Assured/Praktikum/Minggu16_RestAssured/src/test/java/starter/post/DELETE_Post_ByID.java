package starter.post;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DELETE_Post_ByID {
    public String validUrlPostByID = "https://jsonplaceholder.typicode.com/posts/1";
    public String invalidUrlPostByID = "https://jsonplaceholder.typicode.com/post/1";
    public String invalidIDUrl = "https://jsonplaceholder.typicode.com/posts/3";

    @Step("set valid DELETE Post by ID endpoint")
    public String setValidDELETEPostByIDEndpoint(){
        return validUrlPostByID;
    }

    @Step("send DELETE HTTP request with valid endpoint for Post by ID")
    public void sendDELETEHTTPRequestWithValidEndpointForPostByID(){
        SerenityRest.given().delete(setValidDELETEPostByIDEndpoint());
    }

    @Step("received valid DELETE HTTP response code 200 for Post by ID")
    public void validateDELETEHTTPResponseCode200ForPostByID(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set invalid DELETE Post by ID endpoint")
    public String setInvalidDELETEPostByIDEndpoint(){
        return invalidUrlPostByID;
    }

    @Step("send DELETE HTTP request with invalid endpoint for Post by ID")
    public void sendDELETEHTTPRequestWithInvalidEndpointForPostByID(){
        SerenityRest.given().delete(setInvalidDELETEPostByIDEndpoint());
    }

    @Step("received DELETE HTTP response code 404 for Post by ID")
    public void validateDELETEHTTPResponseCode404ForPostByID(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send DELETE HTTP request with invalid method for Post by ID")
    public void sendDELETEHTTPRequestWithInvalidMethodForPostByID(){
        SerenityRest.given().patch(setInvalidDELETEPostByIDEndpoint());
    }

    @Step("set invalid ID DELETE Post by ID endpoint")
    public String setInvalidIDDELETEPostByIDEndpoint(){
        return invalidIDUrl;
    }

    @Step("send DELETE HTTP request with invalid ID for Post by ID")
    public void sendDELETEHTTPRequestWithInvalidIDForPostByID(){
        SerenityRest.given().delete(setInvalidIDDELETEPostByIDEndpoint());
    }
}
