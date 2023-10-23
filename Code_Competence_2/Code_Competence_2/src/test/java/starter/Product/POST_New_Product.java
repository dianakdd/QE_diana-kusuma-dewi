package starter.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
public class POST_New_Product {
    public String valid_url = "https://fakestoreapi.com/products";
    public String invalid_url = "https://fakestoreapi.com/products/invalid_url";

    @Step("user set POST valid endpoint product")
    public String userSetPOSTValidEndpointProduct() {
        return valid_url;
    }

    @Step("user received HTTP response code 200 OK")
    public void userReceivedHTTPResponseCode200OK() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set POST invalid endpoint product")
    public String userSetPOSTInvalidEndpointProduct() {
        return invalid_url;
    }

    @Step("user send POST HTTP request with invalid endpoint product")
    public void userSendPOSTHTTPRequestWithInvalidEndpointProduct() {
        String body = "{ " +
                "\"title\":\"test product\", " +
                "\"price\":13.5, " +
                "\"description\":\"lorem ipsum set\", " +
                "\"image\":\"https://i.pravatar.cc\", " +
                "\"category\":\"electronic\" " +
                "}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(reqBody.toString())
                .post(userSetPOSTInvalidEndpointProduct());
    }

    @Step("user received POST HTTP response code 404 Not found")
    public void userReceivedPOSTHTTPResponseCode404NotFound() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("user send POST HTTP request with input empty request body product")
    public void userSendPOSTHTTPRequestWithInputEmptyRequestBodyProduct() {
    }

    @Step("user received HTTP response code 404 with input empty request body")
    public void userReceivedHTTPResponseCode404ithInputEmptyRequestBody() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("user received valid data for new product")
    public void userReceivedValidDataForNewProduct() {
        restAssuredThat(response -> {
            response.body("title", equalTo(null)); // Sesuaikan dengan nilai yang diharapkan
            response.body("price", equalTo(null)); // Sesuaikan dengan nilai yang diharapkan
            response.body("description", equalTo(null)); // Sesuaikan dengan nilai yang diharapkan
            response.body("image", equalTo(null)); // Sesuaikan dengan nilai yang diharapkan
            response.body("category", equalTo(null)); // Sesuaikan dengan nilai yang diharapkan
        });
    }
}
