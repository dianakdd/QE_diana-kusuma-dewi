package starter.Cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
public class GET_Cart_Data_Range {
    public String Valid_url = "https://fakestoreapi.com/carts?startdate=2019-12-10&enddate=2020-10-10";
    public String Invalid_url = "https://fakestoreapi.com/carts?startdate=2019-12-10&enddate=2020-10-10/Invalid_url";


    @Step("user set GET valid endpoint to get carts in a date range")
    public String userSetGETValidEndpointToGetCartsInADateRange() {
        return Valid_url;
    }

    @Step("user send GET HTTP request to get carts in a date range with valid endpoint")
    public void userSendGETHTTPRequestToGetCartsInADateRangeWithValidEndpoint() {
        SerenityRest.given().get(userSetGETValidEndpointToGetCartsInADateRange());
    }

    @Step("user received valid GET HTTP response code 200 to get carts in a date range")
    public void userReceivedValidGETHTTPResponseCode200ToGetCartsInADateRange() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set GET invalid endpoint to get carts in a date range")
    public String userSetGETInvalidEndpointToGetCartsInADateRange() {
        return Invalid_url;
    }

    @Step("user send GET HTTP request to get carts in a date range with invalid endpoint")
    public void userSendGETHTTPRequestToGetCartsInADateRangeWithInvalidEndpoint() {
        SerenityRest.given().get(userSetGETInvalidEndpointToGetCartsInADateRange());
    }

    @Step("user received GET HTTP response code 400 with invalid endpoint")
    public void userReceivedGETHTTPResponseCode400WithInvalidEndpoint() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("user received valid data for getting carts in a date range")
    public void userReceivedValidDataForGettingCartsInADateRange() {
        restAssuredThat(response -> {
            response.body("size()", equalTo(7)); // Memeriksa jumlah data harus sesuai dengan yang diharapkan

            // Memastikan data pertama sesuai dengan yang diharapkan
            response.body("id[0]", equalTo(1));
            response.body("userId[0]", equalTo(1));
            response.body("date[0]", equalTo("2020-03-02T00:00:00.000Z"));

            // Memastikan data kedua sesuai dengan yang diharapkan
            response.body("id[1]", equalTo(2));
            response.body("userId[1]", equalTo(1));
            response.body("date[1]", equalTo("2020-01-02T00:00:00.000Z"));

            // Memastikan data ketiga sesuai dengan yang diharapkan
            response.body("id[2]", equalTo(3));
            response.body("userId[2]", equalTo(2));
            response.body("date[2]", equalTo("2020-03-01T00:00:00.000Z"));

            // Memastikan data keempat sesuai dengan yang diharapkan
            response.body("id[3]", equalTo(4));
            response.body("userId[3]", equalTo(3));
            response.body("date[3]", equalTo("2020-01-01T00:00:00.000Z"));

            // Tambahkan pemeriksaan untuk data-data lain sesuai kebutuhan
        });
    }
}
