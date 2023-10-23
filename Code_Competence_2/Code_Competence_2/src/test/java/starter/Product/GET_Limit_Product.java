package starter.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
public class GET_Limit_Product {
    public String valid_url = "https://fakestoreapi.com/products?limit=5";

    public String invalid_url = "https://fakestoreapi.com/products?limit=5/invalid_url";

    @Step("user set GET valid endpoint to get a list 5 product")
    public String userSetGETValidEndpointToGetAList5Product() {
        return valid_url;
    }

    @Step("user send GET HTTP request to get limit product with valid endpoint")
    public void userSendGETHTTPRequestToGetLimitProductWithValidEndpoint() {
        SerenityRest.given().get(userSetGETValidEndpointToGetAList5Product());
    }

    @Step("user received valid GET HTTP response code 200 to get list 5 product")
    public void userReceivedValidGETHTTPResponseCode200ToGetList5Product() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set GET invalid endpoint to get a list 5 product")
    public String userSetGETInvalidEndpointToGetAList5Product() {
        return invalid_url;
    }

    @Step("user send GET HTTP request to get limit product with invalid endpoint")
    public void userSendGETHTTPRequestToGetLimitProductWithInvalidEndpoint() {
        SerenityRest.given().get(userSetGETInvalidEndpointToGetAList5Product());
    }
    @Step("user received GET HTTP response code 200 to get list 5 product")
    public void userReceivedGETHTTPResponseCode200ToGetList5Product() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user received valid data forget list 5 product")
    public void userReceivedValidDataForgetList5Product() {
        restAssuredThat(response -> {
            response.body("size()", equalTo(5)); // Memeriksa jumlah data harus sama dengan 5
            response.body("id", hasSize(5)); // Memastikan ada 5 data pengguna
        });
    }
}
