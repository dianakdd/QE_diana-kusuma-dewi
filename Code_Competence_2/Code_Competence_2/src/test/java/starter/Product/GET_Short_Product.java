package starter.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
public class GET_Short_Product {
    public String Valid_url = "https://fakestoreapi.com/products?sort=desc";
    public String Invalid_url = "https://fakestoreapi.com/products?sort=desc/Invalid_url";


    @Step("user set GET valid endpoint to get sorted in descending product")
    public String userSetGETValidEndpointToGetSortedInDescendingProduct() {
        return Valid_url;
    }

    @Step("user send GET HTTP request to sorted in descending product with valid endpoint")
    public void userSendGETHTTPRequestToSortedInDescendingProductWithValidEndpoint() {
        SerenityRest.given().get(userSetGETValidEndpointToGetSortedInDescendingProduct());
    }

    @Step("user received valid GET HTTP response code 200 to get sorted in descending product")
    public void userReceivedValidGETHTTPResponseCode200ToGetSortedInDescendingProduct() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set GET invalid endpoint to get sorted in descending product")
    public String userSetGETInvalidEndpointToGetSortedInDescendingProduct() {
        return Invalid_url;
    }

    @Step("user send GET HTTP request to sorted in descending product with invalid endpoint")
    public void userSendGETHTTPRequestToSortedInDescendingProductWithInvalidEndpoint() {
        SerenityRest.given().get(userSetGETInvalidEndpointToGetSortedInDescendingProduct());
    }

    @Step("user received GET HTTP response code 200 to get sorted in descending Product")
    public void userReceivedGETHTTPResponseCode200ToGetSortedInDescendingProduct() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user received valid data forget sorted in descending product")
    public void userReceivedValidDataForgetSortedInDescendingProduct() {
        restAssuredThat(response -> {
            response.body("size()", equalTo(20)); // Memeriksa jumlah data harus sama dengan 20
            response.body("id[0]", equalTo(20)); // Memastikan ID data pertama adalah 20
            response.body("id[1]", equalTo(19)); // Memastikan ID data kedua adalah 19
            // Tambahkan pemeriksaan untuk data-data lain sesuai kebutuhan
        });
    }
}
