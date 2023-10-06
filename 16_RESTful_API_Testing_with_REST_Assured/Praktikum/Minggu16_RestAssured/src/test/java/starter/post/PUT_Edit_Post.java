package starter.post;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PUT_Edit_Post {
    public String valid_url_post = "https://jsonplaceholder.typicode.com/posts/1";
    public String invalid_url_post = "https://jsonplaceholder.typicode.com/post/1";
    public String invalid_ID_post = "https://jsonplaceholder.typicode.com/posts/3";

    @Step("set valid PUT post by ID endpoint")
    public String setValidPUTPostByIDEndpoint(){
        return valid_url_post;
    }

    @Step("send PUT HTTP request with valid endpoint for edit post by ID")
    public void sendPUTHTTPRequestWithValidEndpointForPostByID(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("userId", 1);
        requestBody.put("id", 1);
        requestBody.put("title","Bagaimana testing di cucumber");
        requestBody.put("body","Cara testing di cucumber adalah sebagai berikut");

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .put(setValidPUTPostByIDEndpoint());
        }

    @Step("received PUT HTTP response code 200 for edit post ID")
    public void validateHTTPResponseCode200ForEditPostByID(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set invalid PUT post by ID endpoint")
    public String setInvalidPUTPostByIDEndpoint(){
        return invalid_url_post;
    }

    @Step("send PUT HTTP request with invalid endpoint for edit post by ID")
    public void sendPUTHTTPRequestWithInvalidEndpointForPostByID(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("userId", 1);
        requestBody.put("id", 1);
        requestBody.put("title","Bagaimana testing di cucumber");
        requestBody.put("body","Cara testing di cucumber adalah sebagai berikut");

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .put(setInvalidPUTPostByIDEndpoint());
        }

    @Step("received PUT HTTP response code 404 for edit post ID")
    public void validateHTTPResponseCode404ForEditPostByID(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send PUT HTTP request with invalid method for edit post by ID")
    public void sendPUTHTTPRequestWithInvalidMethodForPostByID(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("userId", 1);
        requestBody.put("id", 1);
        requestBody.put("title","Bagaimana testing di cucumber");
        requestBody.put("body","Cara testing di cucumber adalah sebagai berikut");

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .delete(setInvalidPUTPostByIDEndpoint());
        }

    @Step("received PUT HTTP response code 400 for edit post ID")
    public void validateHTTPResponseCode400ForEditPostByID(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("set invalid ID PUT post by ID endpoint")
    public String setInvalidIDPUTPostByIDEndpoint(){
        return invalid_ID_post;
    }

    @Step("send PUT HTTP request with invalid ID for edit post by ID")
    public void sendPUTHTTPRequestWithInvalidIDForPostByID(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("userId", 1);
        requestBody.put("id", 1);
        requestBody.put("title","Bagaimana testing di cucumber");
        requestBody.put("body","Cara testing di cucumber adalah sebagai berikut");

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .put(setInvalidIDPUTPostByIDEndpoint());
        }

    @Step("send PUT HTTP request with empty request body for edit post by ID")
    public void sendPUTHTTPRequestWithEmptyRequestBodyForPostByID(){
        String body = "{ }";

        JSONObject requestBody = new JSONObject(body);

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .put(setInvalidIDPUTPostByIDEndpoint());
        }

}
