package starter.Cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PUT_Cart_Product {
    public String valid_url = "https://fakestoreapi.com/carts/7";
    public String invalid_url = "https://fakestoreapi.com/carts/7/invalid_url";

    @Step("the user sets a valid PUT endpoint Update cart Product")
    public String theUserSetsAValidPUTEndpointUpdateCartProduct() {
        return valid_url;
    }

    @Step("the user sends a PUT HTTP request Update cart Product")
    public void theUserSendsAPUTHTTPRequestUpdateCartProduct() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId", 3);
        requestBody.put("date", "2019-12-10");

        // Array produk
        JSONObject[] products = new JSONObject[1];
        JSONObject productToUpdate = new JSONObject();
        productToUpdate.put("productId", 1);
        productToUpdate.put("quantity", 3);

        products[0] = productToUpdate;
        requestBody.put("products", products);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(theUserSetsAValidPUTEndpointUpdateCartProduct());
    }

    @Step("the user receives an HTTP response code 200 with valid endpoint")
    public void theUserReceivesAnHTTPResponseCode200WithValidEndpoint() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("the user sets an invalid PUT endpoint Update cart Product")
    public String theUserSetsAnInvalidPUTEndpointUpdateCartProduct() {
        return invalid_url;
    }

    @Step("the user sends a PUT HTTP request Update cart Product with an invalid endpoint")
    public void theUserSendsAPUTHTTPRequestUpdateCartProductWithAnInvalidEndpoint() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId", 3);
        requestBody.put("date", "2019-12-10");

        // Array produk
        JSONObject[] products = new JSONObject[1];
        JSONObject productToUpdate = new JSONObject();
        productToUpdate.put("productId", 1);
        productToUpdate.put("quantity", 3);

        products[0] = productToUpdate;
        requestBody.put("products", products);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(theUserSetsAnInvalidPUTEndpointUpdateCartProduct());
    }

    @Step("the user receives an HTTP response code 404 with invalid endpoint")
    public void theUserReceivesAnHTTPResponseCode404WithInvalidEndpoint() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
