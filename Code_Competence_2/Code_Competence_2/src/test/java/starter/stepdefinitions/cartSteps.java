package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Cart.*;
import starter.Product.POST_New_Product;

public class cartSteps {
    @Steps
    GET_All_Cart getAllCart;

    @Steps
    GET_Single_Cart getSingleCart;

    @Steps
    GET_Limit_Cart getLimitCart;

    @Steps
    GET_Short_Cart getShortCart;

    @Steps
    GET_Cart_Data_Range getCartDataRange;

    @Steps
    GET_User_Cart getUserCart;

    @Steps
    POST_New_Product_Cart postNewProductCart;

    @Steps
    PUT_Cart_Product putCartProduct;

    @Steps
    DELETE_Cart deleteCart;


    // GetAllCart.Features
    @Given("the user set GET valid endpoint")
    public void theUserSetGETValidEndpoint() {
        getAllCart.theUserSetGETValidEndpoint();
    }

    @When("the user send GET HTTP request with valid endpoint")
    public void theUserSendGETHTTPRequestWithValidEndpoint() {
        getAllCart.theUserSendGETHTTPRequestWithValidEndpoint();
    }

    @Then("the user received valid GET HTTP response code 200 OK")
    public void theUserReceivedValidGETHTTPResponseCode200OK() {
        getAllCart.theUserReceivedValidGETHTTPResponseCode200OK();
    }

    @Given("the user set GET invalid endpoint")
    public void theUserSetGETInvalidEndpoint() {
        getAllCart.theUserSetGETInvalidEndpoint();
    }

    @When("the user send GET HTTP request with invalid endpoint")
    public void theUserSendGETHTTPRequestWithInvalidEndpoint() {
        getAllCart.theUserSendGETHTTPRequestWithInvalidEndpoint();
    }

    @Then("the user received GET HTTP response code 400 bad request")
    public void theUserReceivedGETHTTPResponseCode400BadRequest() {
        getAllCart.theUserReceivedGETHTTPResponseCode400BadRequest();
    }

    // GetSingleCart.Features
    @Given("user set GET valid endpoint for cart by ID")
    public void userSetGETValidEndpointForCartByID() {
        getSingleCart.userSetGETValidEndpointForCartByID();
    }

    @When("user send GET HTTP request with valid endpoint for cart by ID")
    public void userSendGETHTTPRequestWithValidEndpointForCartByID() {
        getSingleCart.userSendGETHTTPRequestWithValidEndpointForCartByID();
    }

    @Then("user received valid GET HTTP response code 200 for cart by ID")
    public void userReceivedValidGETHTTPResponseCode200ForCartByID() {
        getSingleCart.userReceivedValidGETHTTPResponseCode200ForCartByID();
    }

    @Given("user set GET invalid endpoint for cart by ID")
    public void userSetGETInvalidEndpointForCartByID() {
        getSingleCart.userSetGETInvalidEndpointForCartByID();
    }

    @When("user send GET HTTP request with invalid endpoint for cart by ID")
    public void userSendGETHTTPRequestWithInvalidEndpointForCartByID() {
        getSingleCart.userSendGETHTTPRequestWithInvalidEndpointForCartByID();
    }

    @Then("user received GET HTTP response code 404 for cart by ID")
    public void userReceivedGETHTTPResponseCode404ForCartByID() {
        getSingleCart.userReceivedGETHTTPResponseCode404ForCartByID();
    }

    @And("user received valid data for cart by ID")
    public void userReceivedValidDataForCartByID() {
        getSingleCart.userReceivedValidDataForCartByID();
    }

    // GetLimitCart.Features
    @Given("user set GET valid endpoint to get a list 5 cart")
    public void userSetGETValidEndpointToGetAList5Cart() {
        getLimitCart.userSetGETValidEndpointToGetAList5Cart();
    }

    @When("user send GET HTTP request to get limit cart with valid endpoint")
    public void userSendGETHTTPRequestToGetLimitCartWithValidEndpoint() {
        getLimitCart.userSendGETHTTPRequestToGetLimitCartWithValidEndpoint();
    }

    @Then("user received valid GET HTTP response code 200 to get list 5 cart")
    public void userReceivedValidGETHTTPResponseCode200ToGetList5Cart() {
        getLimitCart.userReceivedValidGETHTTPResponseCode200ToGetList5Cart();
    }

    @Given("user set GET invalid endpoint to get a list 5 cart")
    public void userSetGETInvalidEndpointToGetAList5Cart() {
        getLimitCart.userSetGETInvalidEndpointToGetAList5Cart();
    }

    @When("user send GET HTTP request to get limit cart with invalid endpoint")
    public void userSendGETHTTPRequestToGetLimitCartWithInvalidEndpoint() {
        getLimitCart.userSendGETHTTPRequestToGetLimitCartWithInvalidEndpoint();
    }

    @Then("user received GET HTTP response code 200 to get list 5 cart")
    public void userReceivedGETHTTPResponseCodeToGetListCart() {
        getLimitCart.userReceivedGETHTTPResponseCodeToGetListCart();
    }

    @And("user received valid data forget list 5 cart")
    public void userReceivedValidDataForgetList5Cart() {
        getLimitCart.userReceivedValidDataForgetList5Cart();
    }

    // GetShortCart.Features
    @Given("user set GET valid endpoint to get sorted in descending cart")
    public void userSetGETValidEndpointToGetSortedInDescendingCart() {
        getShortCart.userSetGETValidEndpointToGetSortedInDescendingCart();
    }

    @When("user send GET HTTP request to sorted in descending cart with valid endpoint")
    public void userSendGETHTTPRequestToSortedInDescendingCartWithValidEndpoint() {
        getShortCart.userSendGETHTTPRequestToSortedInDescendingCartWithValidEndpoint();
    }

    @Then("user received valid GET HTTP response code 200 to get sorted in descending cart")
    public void userReceivedValidGETHTTPResponseCode200ToGetSortedInDescendingCart() {
        getShortCart.userReceivedValidGETHTTPResponseCode200ToGetSortedInDescendingCart();
    }

    @Given("user set GET invalid endpoint to get sorted in descending cart")
    public void userSetGETInvalidEndpointToGetSortedInDescendingCart() {
        getShortCart.userSetGETInvalidEndpointToGetSortedInDescendingCart();
    }

    @When("user send GET HTTP request to sorted in descending cart with invalid endpoint")
    public void userSendGETHTTPRequestToSortedInDescendingCartWithInvalidEndpoint() {
        getShortCart.userSendGETHTTPRequestToSortedInDescendingCartWithInvalidEndpoint();
    }

    @Then("user received GET HTTP response code 200 to get sorted in descending cart")
    public void userReceivedGETHTTPResponseCode200ToGetSortedInDescendingCart() {
        getShortCart.userReceivedGETHTTPResponseCode200ToGetSortedInDescendingCart();
    }

    @And("user received valid data forget sorted in descending cart")
    public void userReceivedValidDataForgetSortedInDescendingCart() {
        getShortCart.userReceivedValidDataForgetSortedInDescendingCart();
    }

    // GetCartDataRange.Features
    @Given("user set GET valid endpoint to get carts in a date range")
    public void userSetGETValidEndpointToGetCartsInADateRange() {
        getCartDataRange.userSetGETValidEndpointToGetCartsInADateRange();
    }

    @When("user send GET HTTP request to get carts in a date range with valid endpoint")
    public void userSendGETHTTPRequestToGetCartsInADateRangeWithValidEndpoint() {
        getCartDataRange.userSendGETHTTPRequestToGetCartsInADateRangeWithValidEndpoint();
    }

    @Then("user received valid GET HTTP response code 200 to get carts in a date range")
    public void userReceivedValidGETHTTPResponseCode200ToGetCartsInADateRange() {
        getCartDataRange.userReceivedValidGETHTTPResponseCode200ToGetCartsInADateRange();
    }

    @Given("user set GET invalid endpoint to get carts in a date range")
    public void userSetGETInvalidEndpointToGetCartsInADateRange() {
        getCartDataRange.userSetGETInvalidEndpointToGetCartsInADateRange();
    }

    @When("user send GET HTTP request to get carts in a date range with invalid endpoint")
    public void userSendGETHTTPRequestToGetCartsInADateRangeWithInvalidEndpoint() {
        getCartDataRange.userSendGETHTTPRequestToGetCartsInADateRangeWithInvalidEndpoint();
    }

    @Then("user received GET HTTP response code 400 with invalid endpoint")
    public void userReceivedGETHTTPResponseCode400WithInvalidEndpoint() {
        getCartDataRange.userReceivedGETHTTPResponseCode400WithInvalidEndpoint();
    }

    @And("user received valid data for getting carts in a date range")
    public void userReceivedValidDataForGettingCartsInADateRange() {
        getCartDataRange.userReceivedValidDataForGettingCartsInADateRange();
    }

    // getUserCart.features
    @Given("user set GET valid endpoint to get user carts")
    public void userSetGETValidEndpointToGetUserCarts() {
        getUserCart.userSetGETValidEndpointToGetUserCarts();
    }

    @When("user send GET HTTP request to get user carts with valid endpoint")
    public void userSendGETHTTPRequestToGetUserCartsWithValidEndpoint() {
        getUserCart.userSendGETHTTPRequestToGetUserCartsWithValidEndpoint();
    }

    @Then("user received valid GET HTTP response code 200 to get user carts")
    public void userReceivedValidGETHTTPResponseCode200ToGetUserCarts() {
        getUserCart.userReceivedValidGETHTTPResponseCode200ToGetUserCarts();
    }

    @Given("user set GET invalid endpoint to get user carts")
    public void userSetGETInvalidEndpointToGetUserCarts() {
        getUserCart.userSetGETInvalidEndpointToGetUserCarts();
    }

    @When("user send GET HTTP request to get user carts with invalid endpoint")
    public void userSendGETHTTPRequestToGetUserCartsWithInvalidEndpoint() {
        getUserCart.userSendGETHTTPRequestToGetUserCartsWithInvalidEndpoint();
    }

    @Then("user received GET HTTP response code 404 with invalid endpoint")
    public void user_received_get_http_response_code_404_with_invalid_endpoint() {
        getUserCart.user_received_get_http_response_code_404_with_invalid_endpoint();
    }


    @And("user received valid data for getting user carts")
    public void userReceivedValidDataForGettingUserCarts() {
        getUserCart.userReceivedValidDataForGettingUserCarts();
    }

    // PostNewProductCart.features

    @Given("user set POST valid endpoint to new product")
    public void userSetPOSTValidEndpointToNewProduct() {
        postNewProductCart.userSetPOSTValidEndpointToNewProduct();
    }

    @When("user send POST HTTP request to new product")
    public void userSendPOSTHTTPRequestToNewProduct() {
        postNewProductCart.userSendPOSTHTTPRequestToNewProduct();
    }

    @Then("user received HTTP response code 200 with valid endpoint")
    public void userReceivedHTTPResponseCode200WithValidEndpoint() {
        postNewProductCart.userReceivedHTTPResponseCode200WithValidEndpoint();
    }

    @Given("user set POST invalid endpoint to new product")
    public void userSetPOSTInvalidEndpointToNewProduct() {
        postNewProductCart.userSetPOSTInvalidEndpointToNewProduct();
    }

    @When("user send POST HTTP request to new product with invalid endpoint")
    public void userSendPOSTHTTPRequestToNewProductWithInvalidEndpoint() {
        postNewProductCart.userSendPOSTHTTPRequestToNewProductWithInvalidEndpoint();
    }

    @Then("user received POST HTTP response code 404 with invalid endpoint")
    public void userReceivedPOSTHTTPResponseCode404WithInvalidEndpoint() {
        postNewProductCart.userReceivedPOSTHTTPResponseCode404WithInvalidEndpoint();
    }

    // PutCartProduct.features

    @Given("the user sets a valid PUT endpoint Update cart Product")
    public void theUserSetsAValidPUTEndpointUpdateCartProduct() {
        putCartProduct.theUserSetsAValidPUTEndpointUpdateCartProduct();
    }

    @When("the user sends a PUT HTTP request Update cart Product")
    public void theUserSendsAPUTHTTPRequestUpdateCartProduct() {
        putCartProduct.theUserSendsAPUTHTTPRequestUpdateCartProduct();
    }

    @Then("the user receives an HTTP response code 200 with valid endpoint")
    public void theUserReceivesAnHTTPResponseCode200WithValidEndpoint() {
        putCartProduct.theUserReceivesAnHTTPResponseCode200WithValidEndpoint();
    }

    @Given("the user sets an invalid PUT endpoint Update cart Product")
    public void theUserSetsAnInvalidPUTEndpointUpdateCartProduct() {
        putCartProduct.theUserSetsAnInvalidPUTEndpointUpdateCartProduct();
    }

    @When("the user sends a PUT HTTP request Update cart Product with an invalid endpoint")
    public void theUserSendsAPUTHTTPRequestUpdateCartProductWithAnInvalidEndpoint() {
        putCartProduct.theUserSendsAPUTHTTPRequestUpdateCartProductWithAnInvalidEndpoint();
    }

    @Then("the user receives an HTTP response code 404 with invalid endpoint")
    public void theUserReceivesAnHTTPResponseCode404WithInvalidEndpoint() {
        putCartProduct.theUserReceivesAnHTTPResponseCode404WithInvalidEndpoint();
    }

    // DeleteCart.feature
    @Given("user sets a DELETE valid endpoint for deleting a cart")
    public void userSetsADELETEValidEndpointForDeletingACart() {
        deleteCart.userSetsADELETEValidEndpointForDeletingACart();
    }

    @When("user sends a DELETE HTTP request with a valid endpoint to delete a cart")
    public void userSendsADELETEHTTPRequestWithAValidEndpointToDeleteACart() {
        deleteCart.userSendsADELETEHTTPRequestWithAValidEndpointToDeleteACart();
    }

    @Then("user receives a DELETE HTTP response code 200 for deleting a cart with a valid endpoint")
    public void userReceivesADELETEHTTPResponseCode200ForDeletingACartWithAValidEndpoint() {
        deleteCart.userReceivesADELETEHTTPResponseCode200ForDeletingACartWithAValidEndpoint();
    }

    @Given("user sets a DELETE endpoint with an invalid endpoint for deleting a cart")
    public void userSetsADELETEEndpointWithAnInvalidEndpointForDeletingACart() {
        deleteCart.userSetsADELETEEndpointWithAnInvalidEndpointForDeletingACart();
    }

    @When("user sends a DELETE HTTP request with an invalid endpoint to delete a cart")
    public void userSendsADELETEHTTPRequestWithAnInvalidEndpointToDeleteACart() {
        deleteCart.userSendsADELETEHTTPRequestWithAnInvalidEndpointToDeleteACart();
    }

    @Then("user receives a DELETE HTTP response code 404 for deleting a cart with an invalid endpoint")
    public void userReceivesADELETEHTTPResponseCode404ForDeletingACartWithAnInvalidEndpoint() {
        deleteCart.userReceivesADELETEHTTPResponseCode404ForDeletingACartWithAnInvalidEndpoint();
    }
}
