package starter.post;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class POST_Create_Post {
    public String valid_endpoint_post = "https://jsonplaceholder.typicode.com/posts";
    public String invalid_endpoint_post = "https://jsonplaceholder.typicode.com/post";

    @Step("set valid POST new Post endpoint")
    public String setValidPOSTNewPostEndpoint(){
        return valid_endpoint_post;
    }

    @Step("send POST HTTP request with valid endpoint for new Post")
    public void sendPOSTHTTPRequestWithValidEndpointForNewPost(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("userId", 1);
        requestBody.put("id", 1);
        requestBody.put("title","Bagaimana testing di cucumber");
        requestBody.put("body","Cara testing di cucumber adalah sebagai berikut");

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(setValidPOSTNewPostEndpoint());
        }

    @Step("received POST HTTP response code 201 for new Post")
    public void validateHTTPResponseCode201ForNewPost(){
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("set invalid POST new Post endpoint")
    public String setInvalidPOSTNewPostEndpoint(){
        return invalid_endpoint_post;
    }

    @Step("send POST HTTP request with invalid endpoint for new Post")
    public void sendPOSTHTTPRequestWithInvalidEndpointForNewPost(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("userId", "h");
        requestBody.put("id", 1);
        requestBody.put("title","Bagaimana testing di cucumber");
        requestBody.put("body","Cara testing di cucumber adalah sebagai berikut");

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(setValidPOSTNewPostEndpoint());

    }

    @Step("received POST HTTP response code 404 for new Post")
    public void validateHTTPResponseCode404ForNewPost(){
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("send POST HTTP request with empty request body for new Post")
    public void sendPOSTHTTPRequestWithEmptyRequestBodyForNewPost(){
        String body = "{ }";

        JSONObject requestBody = new JSONObject(body);

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .delete(setValidPOSTNewPostEndpoint());
    }

    @Step("received POST HTTP response code 404 for new Post")
    public void validateHTTPResponseCode400ForNewPost(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send POST HTTP request with invalid request body for new Post")
    public void sendPOSTHTTPRequestWithInvalidRequestBodyForNewPost(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("userId", "h");
        requestBody.put("id", "0jn");
        requestBody.put("title","Bagaimana testing di cucumber");
        requestBody.put("body","Cara testing di cucumber adalah sebagai berikut");

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .delete(setValidPOSTNewPostEndpoint());
    }

    @Step("send POST HTTP request with invalid method for new Post")
    public void sendPOSTHTTPRequestWithInvalidMethodForNewPost(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("userId", 1);
        requestBody.put("id", 1);
        requestBody.put("title","Bagaimana testing di cucumber");
        requestBody.put("body","Cara testing di cucumber adalah sebagai berikut");

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .delete(setValidPOSTNewPostEndpoint());
    }
    @Step("received POST HTTP response code 500 for new Post")
    public void validateHTTPResponseCode500ForNewPost(){
        restAssuredThat(response -> response.statusCode(404));
    }

}

