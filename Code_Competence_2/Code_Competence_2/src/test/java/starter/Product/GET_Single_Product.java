package starter.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.StringContains.containsString;
public class GET_Single_Product {
    public String valid_url = "https://fakestoreapi.com/products/1";
    public String invalid_url = "https://fakestoreapi.com/products/1/invalid_url";


    @Step("user set GET valid endpoint for product by ID")
    public String userSetGETValidEndpointForProductByID() {
        return valid_url;
    }

    @Step("user send GET HTTP request with valid endpoint for product by ID")
    public void userSendGETHTTPRequestWithValidEndpointForProductByID() {
        SerenityRest.given().get(userSetGETValidEndpointForProductByID());
    }

    @Step("user received valid GET HTTP response code 200 for product by ID")
    public void userReceivedValidGETHTTPResponseCode200ForProductByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set GET invalid endpoint for product by ID")
    public String userSetGETInvalidEndpointForProductByID() {
        return invalid_url;
    }

    @Step("user send GET HTTP request with invalid endpoint for product by ID")
    public void userSendGETHTTPRequestWithInvalidEndpointForProductByID() {
        SerenityRest.given().get(userSetGETInvalidEndpointForProductByID());
    }

    @Step("user received GET HTTP response code 404 for product by ID")
    public void userReceivedGETHTTPResponseCode404ForProductByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("user received valid data for product by ID")
    public void userReceivedValidDataForProductByID() {
        restAssuredThat(response -> {
            response.body("id", equalTo(1));
            response.body("title", equalTo("Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops"));
            response.body("price", equalTo(109.95F));
            response.body("category", equalTo("men's clothing"));
            response.body("description", containsString("Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday"));
            response.body("image", equalTo("https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg"));
        });
    }
}
