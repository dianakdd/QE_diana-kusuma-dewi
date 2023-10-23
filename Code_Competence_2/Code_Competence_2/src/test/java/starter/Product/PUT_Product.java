package starter.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PUT_Product {
    public String valid_url = "https://fakestoreapi.com/products/7";
    public String invalid_url = "https://fakestoreapi.com/products/7/invalid_product";


    @Step("the user sets a valid PUT endpoint product")
    public String UserSetsAValidPUTEndpointProduct() {
        return valid_url;
    }

    @Step("the user sends a PUT HTTP request body")
    public void UserSendsAPUTHTTPRequestBody() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "test product");
        requestBody.put("price", 13.5);
        requestBody.put("description", "lorem ipsum set");
        requestBody.put("image", "https://i.pravatar.cc");
        requestBody.put("category", "electronic");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(UserSetsAValidPUTEndpointProduct());
    }

    @Step("the user receives an HTTP response code 200 OK")
    public void UserReceivesAnHTTPResponseCode200OK() {
    }

    @Step("the user sets an invalid PUT endpoint product")
    public String UserSetsAnInvalidPUTEndpointProduct() {
        return invalid_url;
    }

    @Step("the user sends a PUT HTTP request with an invalid endpoint product")
    public void UserSendsAPUTHTTPRequestWithAnInvalidEndpointProduct() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "test product");
        requestBody.put("price", 13.5);
        requestBody.put("description", "lorem ipsum set");
        requestBody.put("image", "https://i.pravatar.cc");
        requestBody.put("category", "electronic");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(UserSetsAnInvalidPUTEndpointProduct());
    }

    @Step("the user receives an HTTP response code 404")
    public void UserReceivesAnHTTPResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
