package starter.Users;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.junit.validator.PublicClassValidator;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
public class GET_Short_Result {
    public String Valid_url = "https://fakestoreapi.com/users?sort=desc";
    public String Invalid_url = "https://fakestoreapi.com/users?sort=desc/Invalid_url";

    @Step("user set GET valid endpoint to get sorted in descending order")
    public String userSetGETValidEndpointToGetSortedInDescendingOrder() {
        return Valid_url;
    }

    @Step("user send GET HTTP request to sorted in descending order with valid endpoint")
    public void userSendGETHTTPRequestToSortedInDescendingOrderWithValidEndpoint() {
        SerenityRest.given().get(userSetGETValidEndpointToGetSortedInDescendingOrder());
    }

    @Step("user received valid GET HTTP response code 200 to get sorted in descending order")
    public void userReceivedValidGETHTTPResponseCodeTo200GetSortedInDescendingOrder() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set GET invalid endpoint to get sorted in descending order")
    public String userSetGETInvalidEndpointToGetSortedInDescendingOrder() {
        return Invalid_url;
    }

    @Step("user send GET HTTP request to sorted in descending order with invalid endpoint")
    public void userSendGETHTTPRequestToSortedInDescendingOrderWithInvalidEndpoint() {
        SerenityRest.given().get(userSetGETInvalidEndpointToGetSortedInDescendingOrder());
    }

    @Step("user received GET HTTP response code 200 to get sorted in descending order")
    public void userReceivedGETHTTPResponseCodeToGe200tSortedInDescendingOrder() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user received valid data forget sorted in descending order")
    public void userReceivedValidDataForgetSortedInDescendingOrder() {
        restAssuredThat(response -> {
            response.body("size()", equalTo(10)); // Memeriksa jumlah data harus sama dengan 10
            response.body("id[0]", equalTo(10)); // Memastikan ID data pertama adalah 10
            response.body("id[1]", equalTo(9)); // Memastikan ID data kedua adalah 1
            // Tambahkan pemeriksaan untuk data-data lain sesuai kebutuhan
        });
    }
}
