package starter.Cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class POST_New_Product_Cart {
    public String valid_url = "https://fakestoreapi.com/carts";
    public String invalid_url = "https://fakestoreapi.com/carts/invalid_url";


    @Step("user set POST valid endpoint to new product")
    public String userSetPOSTValidEndpointToNewProduct() {
        return valid_url;
    }

    @Step("user send POST HTTP request to new product")
    public void userSendPOSTHTTPRequestToNewProduct() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId", 5);
        requestBody.put("date", "2020-02-03");

        // Array produk
        JSONObject[] products = new JSONObject[2];

        // Produk pertama
        JSONObject product1 = new JSONObject();
        product1.put("productId", 5);
        product1.put("quantity", 1);

        // Produk kedua
        JSONObject product2 = new JSONObject();
        product2.put("productId", 1);
        product2.put("quantity", 5);

        // Masukkan produk ke dalam array
        products[0] = product1;
        products[1] = product2;

        requestBody.put("products", products);

        // Kirim permintaan POST menggunakan SerenityRest
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(userSetPOSTValidEndpointToNewProduct());
    }

    @Step("user received HTTP response code 200 with valid endpoint")
    public void userReceivedHTTPResponseCode200WithValidEndpoint() {
        restAssuredThat(response -> response.statusCode(200));
    }


    @Step("user set POST invalid endpoint to new product")
    public String userSetPOSTInvalidEndpointToNewProduct() {
        return invalid_url;
    }

    @Step("user send POST HTTP request to new product with invalid endpoint")
    public void userSendPOSTHTTPRequestToNewProductWithInvalidEndpoint() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId", 5);
        requestBody.put("date", "2020-02-03");

        // Array produk
        JSONObject[] products = new JSONObject[2];

        // Produk pertama
        JSONObject product1 = new JSONObject();
        product1.put("productId", 5);
        product1.put("quantity", 1);

        // Produk kedua
        JSONObject product2 = new JSONObject();
        product2.put("productId", 1);
        product2.put("quantity", 5);

        // Masukkan produk ke dalam array
        products[0] = product1;
        products[1] = product2;

        requestBody.put("products", products);

        // Kirim permintaan POST ke endpoint yang salah (invalid)
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(userSetPOSTInvalidEndpointToNewProduct());
    }

    @Step("user received POST HTTP response code 404 with invalid endpoint")
    public void userReceivedPOSTHTTPResponseCode404WithInvalidEndpoint() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
