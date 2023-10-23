package starter.Cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.IsEqual.equalTo;
public class GET_Single_Cart {
    public String valid_url = "https://fakestoreapi.com/carts/5";
    public String Invalid_url = "https://fakestoreapi.com/carts/5/invalid";

    @Step("user set GET valid endpoint for cart by ID")
    public String userSetGETValidEndpointForCartByID() {
        return valid_url;
    }

    @Step("user send GET HTTP request with valid endpoint for cart by ID")
    public void userSendGETHTTPRequestWithValidEndpointForCartByID() {
        SerenityRest.given().get(userSetGETValidEndpointForCartByID());
    }

    @Step("user received valid GET HTTP response code 200 for cart by ID")
    public void userReceivedValidGETHTTPResponseCode200ForCartByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set GET invalid endpoint for cart by ID")
    public String userSetGETInvalidEndpointForCartByID() {
        return Invalid_url;
    }

    @Step("user send GET HTTP request with invalid endpoint for cart by ID")
    public void userSendGETHTTPRequestWithInvalidEndpointForCartByID() {
        SerenityRest.given().get(userSetGETInvalidEndpointForCartByID());
    }

    @Step("user received GET HTTP response code 404 for cart by ID")
    public void userReceivedGETHTTPResponseCode404ForCartByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("user received valid data for cart by ID")
    public void userReceivedValidDataForCartByID() {
        restAssuredThat(response -> {
            response.body("id", equalTo(5));
            response.body("userId", equalTo(3));
            response.body("date", notNullValue()); // Anda perlu menyesuaikan dengan format tanggal yang diharapkan
            response.body("products", notNullValue()); // Anda perlu mengisi data produk yang sesuai dengan format yang diharapkan
        });
    }
}
