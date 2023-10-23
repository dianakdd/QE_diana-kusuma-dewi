package starter.Cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
public class GET_Short_Cart {
    public String Valid_url = "https://fakestoreapi.com/carts?sort=desc";
    public String Invalid_url = "https://fakestoreapi.com/carts?sort=desc/Invalid_url";


    @Step("user set GET valid endpoint to get sorted in descending cart")
    public String userSetGETValidEndpointToGetSortedInDescendingCart() {
        return Valid_url;
    }

    @Step("user send GET HTTP request to sorted in descending cart with valid endpoint")
    public void userSendGETHTTPRequestToSortedInDescendingCartWithValidEndpoint() {
        SerenityRest.given().get(userSetGETValidEndpointToGetSortedInDescendingCart());
    }

    @Step("user received valid GET HTTP response code 200 to get sorted in descending cart")
    public void userReceivedValidGETHTTPResponseCode200ToGetSortedInDescendingCart() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set GET invalid endpoint to get sorted in descending cart")
    public String userSetGETInvalidEndpointToGetSortedInDescendingCart() {
        return Invalid_url;
    }

    @Step("user send GET HTTP request to sorted in descending cart with invalid endpoint")
    public void userSendGETHTTPRequestToSortedInDescendingCartWithInvalidEndpoint() {
        SerenityRest.given().get(userSetGETInvalidEndpointToGetSortedInDescendingCart());
    }

    @Step("user received GET HTTP response code 200 to get sorted in descending cart")
    public void userReceivedGETHTTPResponseCode200ToGetSortedInDescendingCart() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user received valid data forget sorted in descending cart")
    public void userReceivedValidDataForgetSortedInDescendingCart() {
        restAssuredThat(response -> {
            response.body("size()", equalTo(7)); // Memeriksa jumlah data harus sama dengan 10
            response.body("id[0]", equalTo(7)); // Memastikan ID data pertama adalah 10
            response.body("id[1]", equalTo(6)); // Memastikan ID data kedua adalah 1
            // Tambahkan pemeriksaan untuk data-data lain sesuai kebutuhan
        });
    }
}
