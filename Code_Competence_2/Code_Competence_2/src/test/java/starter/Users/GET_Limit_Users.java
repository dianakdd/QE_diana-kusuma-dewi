package starter.Users;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
public class GET_Limit_Users {
    public String Valid_url = "https://fakestoreapi.com/users?limit=5";
    public String Invalid_url = "https://fakestoreapi.com/users?limit=5/invalid_url";

    @Step("user set GET valid endpoint to get a list 5 users")
    public String userSetGETValidEndpointToGetAList5Users() {
        return Valid_url;
    }

    @Step("user send GET HTTP request to get limit users with valid endpoint")
    public void userSendGETHTTPRequestToGetLimitUsersWithValidEndpoint() {
        SerenityRest.given().get(userSetGETValidEndpointToGetAList5Users());
    }

    @Step("user received valid GET HTTP response code 200 to get list 5 users")
    public void userReceivedValidGETHTTPResponseCode200ToGetList5Users() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set GET invalid endpoint to get a list 5 users")
    public String userSetGETInvalidEndpointToGetAList5Users() {
        return Invalid_url;
    }

    @Step("user send GET HTTP request to get limit users with invalid endpoint")
    public void userSendGETHTTPRequestToGetLimitUsersWithInvalidEndpoint() {
        SerenityRest.given().get(userSetGETInvalidEndpointToGetAList5Users());
    }

    @Step("user received GET HTTP response code 200 to get list 5 users")
    public void userReceivedGETHTTPResponseCode200ToGetList5Users() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user received valid data forget list 5 users")
    public void userReceivedValidDataForgetList5Users() {
        restAssuredThat(response -> {
            response.body("size()", equalTo(5)); // Memeriksa jumlah data harus sama dengan 5
            response.body("id", hasSize(5)); // Memastikan ada 5 data pengguna
        });
    }
}
