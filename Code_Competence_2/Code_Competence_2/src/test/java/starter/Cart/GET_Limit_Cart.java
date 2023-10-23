package starter.Cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
public class GET_Limit_Cart {
    public String Valid_url = "https://fakestoreapi.com/carts?limit=5";
    public String Invalid_url = "https://fakestoreapi.com/carts?limit=5/invalid_url";


    @Step("user set GET valid endpoint to get a list 5 cart")
    public String userSetGETValidEndpointToGetAList5Cart() {
        return Valid_url;
    }

    @Step("user send GET HTTP request to get limit cart with valid endpoint")
    public void userSendGETHTTPRequestToGetLimitCartWithValidEndpoint() {
        SerenityRest.given().get(userSetGETValidEndpointToGetAList5Cart());
    }

    @Step("user received valid GET HTTP response code 200 to get list 5 cart")
    public void userReceivedValidGETHTTPResponseCode200ToGetList5Cart() {
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("user set GET invalid endpoint to get a list 5 cart")
    public String userSetGETInvalidEndpointToGetAList5Cart() {
        return Invalid_url;
    }

    @Step("user send GET HTTP request to get limit cart with invalid endpoint")
    public void userSendGETHTTPRequestToGetLimitCartWithInvalidEndpoint() {
        SerenityRest.given().get(userSetGETInvalidEndpointToGetAList5Cart());
    }

    @Step("user received GET HTTP response code 200 to get list 5 cart")
    public void userReceivedGETHTTPResponseCodeToGetListCart() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user received valid data forget list 5 cart")
    public void userReceivedValidDataForgetList5Cart() {
        restAssuredThat(response -> {
            response.body("size()", equalTo(5)); // Memeriksa jumlah data harus sama dengan 5
            response.body("id", hasSize(5)); // Memastikan ada 5 data pengguna
        });
    }
}
