package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Product.*;
public class productSteps {
    @Steps
    GET_All_Product getAllProduct;

    @Steps
    GET_Single_Product getSingleProduct;

    @Steps
    GET_Limit_Product getLimitProduct;

    @Steps
    GET_Short_Product getShortProduct;

    @Steps
    GET_All_Category getAllCategory;

    @Steps
    GET_Product_Spect_Category productSpectCategory;

    @Steps
    POST_New_Product postNewProduct;

    @Steps
    PUT_Product putProduct;

    @Steps
    DELETE_Product deleteProduct;


    // GetAllProduct.Features
    @Then("user received valid GET HTTP response code 200 OK")
    public void userReceivedValidGETHTTPResponseCode200OK() {
        getAllProduct.userReceivedValidGETHTTPResponseCode200OK();
    }

    @Then("user received GET HTTP response code 400 bad request")
    public void userReceivedGETHTTPResponseCode400BadRequest() {
        getAllProduct.userReceivedGETHTTPResponseCode400BadRequest();
    }

    // GetSingleProduct.Features
    @Given("user set GET valid endpoint for product by ID")
    public void userSetGETValidEndpointForProductByID() {
        getSingleProduct.userSetGETValidEndpointForProductByID();
    }

    @When("user send GET HTTP request with valid endpoint for product by ID")
    public void userSendGETHTTPRequestWithValidEndpointForProductByID() {
        getSingleProduct.userSendGETHTTPRequestWithValidEndpointForProductByID();
    }

    @Then("user received valid GET HTTP response code 200 for product by ID")
    public void userReceivedValidGETHTTPResponseCode200ForProductByID() {
        getSingleProduct.userReceivedValidGETHTTPResponseCode200ForProductByID();
    }

    @Given("user set GET invalid endpoint for product by ID")
    public void userSetGETInvalidEndpointForProductByID() {
        getSingleProduct.userSetGETInvalidEndpointForProductByID();
    }

    @When("user send GET HTTP request with invalid endpoint for product by ID")
    public void userSendGETHTTPRequestWithInvalidEndpointForProductByID() {
        getSingleProduct.userSendGETHTTPRequestWithInvalidEndpointForProductByID();
    }

    @Then("user received GET HTTP response code 404 for product by ID")
    public void userReceivedGETHTTPResponseCode404ForProductByID() {
        getSingleProduct.userReceivedGETHTTPResponseCode404ForProductByID();
    }

    @And("user received valid data for product by ID")
    public void userReceivedValidDataForProductByID() {
        getSingleProduct.userReceivedValidDataForProductByID();
    }

    // GetLimitProduct.Features
    @Given("user set GET valid endpoint to get a list 5 product")
    public void userSetGETValidEndpointToGetAList5Product() {
        getLimitProduct.userSetGETValidEndpointToGetAList5Product();
    }

    @When("user send GET HTTP request to get limit product with valid endpoint")
    public void userSendGETHTTPRequestToGetLimitProductWithValidEndpoint() {
        getLimitProduct.userSendGETHTTPRequestToGetLimitProductWithValidEndpoint();
    }

    @Then("user received valid GET HTTP response code 200 to get list 5 product")
    public void userReceivedValidGETHTTPResponseCode200ToGetList5Product() {
        getLimitProduct.userReceivedValidGETHTTPResponseCode200ToGetList5Product();
    }

    @Given("user set GET invalid endpoint to get a list 5 product")
    public void userSetGETInvalidEndpointToGetAList5Product() {
        getLimitProduct.userSetGETInvalidEndpointToGetAList5Product();
    }

    @When("user send GET HTTP request to get limit product with invalid endpoint")
    public void userSendGETHTTPRequestToGetLimitProductWithInvalidEndpoint() {
        getLimitProduct.userSendGETHTTPRequestToGetLimitProductWithInvalidEndpoint();
    }

    @Then("user received GET HTTP response code 200 to get list 5 product")
    public void userReceivedGETHTTPResponseCode200ToGetList5Product() {
        getLimitProduct.userReceivedGETHTTPResponseCode200ToGetList5Product();
    }

    @And("user received valid data forget list 5 product")
    public void userReceivedValidDataForgetList5Product() {
        getLimitProduct.userReceivedValidDataForgetList5Product();
    }

    // GetShortProduct.Features
    @Given("user set GET valid endpoint to get sorted in descending product")
    public void userSetGETValidEndpointToGetSortedInDescendingProduct() {
        getShortProduct.userSetGETValidEndpointToGetSortedInDescendingProduct();
    }

    @When("user send GET HTTP request to sorted in descending product with valid endpoint")
    public void userSendGETHTTPRequestToSortedInDescendingProductWithValidEndpoint() {
        getShortProduct.userSendGETHTTPRequestToSortedInDescendingProductWithValidEndpoint();
    }

    @Then("user received valid GET HTTP response code 200 to get sorted in descending product")
    public void userReceivedValidGETHTTPResponseCode200ToGetSortedInDescendingProduct() {
        getShortProduct.userReceivedValidGETHTTPResponseCode200ToGetSortedInDescendingProduct();
    }

    @Given("user set GET invalid endpoint to get sorted in descending product")
    public void userSetGETInvalidEndpointToGetSortedInDescendingProduct() {
        getShortProduct.userSetGETInvalidEndpointToGetSortedInDescendingProduct();
    }

    @When("user send GET HTTP request to sorted in descending product with invalid endpoint")
    public void userSendGETHTTPRequestToSortedInDescendingProductWithInvalidEndpoint() {
        getShortProduct.userSendGETHTTPRequestToSortedInDescendingProductWithInvalidEndpoint();
    }

    @Then("user received GET HTTP response code 200 to get sorted in descending product")
    public void userReceivedGETHTTPResponseCode200ToGetSortedInDescendingProduct() {
        getShortProduct.userReceivedGETHTTPResponseCode200ToGetSortedInDescendingProduct();
    }

    @And("user received valid data forget sorted in descending product")
    public void userReceivedValidDataForgetSortedInDescendingProduct() {
        getShortProduct.userReceivedValidDataForgetSortedInDescendingProduct();
    }

    // GetAllCategory.Features
    @Given("user set GET valid endpoint for all categories")
    public void userSetGETValidEndpointForAllCategories() {
        getAllCategory.userSetGETValidEndpointForAllCategories();
    }

    @When("user send GET HTTP request with valid endpoint for all categories")
    public void userSendGETHTTPRequestWithValidEndpointForAllCategories() {
        getAllCategory.userSendGETHTTPRequestWithValidEndpointForAllCategories();
    }

    @Then("user received valid GET HTTP response code 200 for all categories")
    public void userReceivedValidGETHTTPResponseCode200ForAllCategories() {
        getAllCategory.userReceivedValidGETHTTPResponseCode200ForAllCategories();
    }

    @Given("user set GET invalid endpoint for all categories")
    public void userSetGETInvalidEndpointForAllCategories() {
        getAllCategory.userSetGETInvalidEndpointForAllCategories();
    }

    @When("user send GET HTTP request with invalid endpoint for all categories")
    public void userSendGETHTTPRequestWithInvalidEndpointForAllCategories() {
        getAllCategory.userSendGETHTTPRequestWithInvalidEndpointForAllCategories();
    }

    @Then("user received GET HTTP response code 404 for all categories")
    public void userReceivedGETHTTPResponseCode404ForAllCategories() {
        getAllCategory.userReceivedGETHTTPResponseCode404ForAllCategories();
    }

    // GetProductSpecificCategory.Features
    @Given("user set GET valid endpoint for all Product Specific Category")
    public void userSetGETValidEndpointForAllProductSpecificCategory() {
        productSpectCategory.userSetGETValidEndpointForAllProductSpecificCategory();
    }

    @When("user send GET HTTP request with valid endpoint for Product Specific Category")
    public void userSendGETHTTPRequestWithValidEndpointForProductSpecificCategory() {
        productSpectCategory.userSendGETHTTPRequestWithValidEndpointForProductSpecificCategory();
    }

    @Then("user received valid GET HTTP response code 200 for Product Specific Category")
    public void userReceivedValidGETHTTPResponseCodeForProductSpecificCategory() {
        productSpectCategory.userReceivedValidGETHTTPResponseCodeForProductSpecificCategory();
    }

    @Given("user set GET invalid endpoint for all Product Specific Category")
    public void userSetGETInvalidEndpointForAllProductSpecificCategory() {
        productSpectCategory.userSetGETInvalidEndpointForAllProductSpecificCategory();
    }

    @When("user send GET HTTP request with invalid endpoint for all Product Specific Category")
    public void userSendGETHTTPRequestWithInvalidEndpointForAllProductSpecificCategory() {
        productSpectCategory.userSendGETHTTPRequestWithInvalidEndpointForAllProductSpecificCategory();
    }

    @Then("user received GET HTTP response code 404 for all Product Specific Category")
    public void userReceivedGETHTTPResponseCode404ForAllProductSpecificCategory() {
        productSpectCategory.userReceivedGETHTTPResponseCode404ForAllProductSpecificCategory();
    }

    // PostNewProduct.Features
    @Given("user set POST valid endpoint product")
    public void userSetPOSTValidEndpointProduct() {
        postNewProduct.userSetPOSTValidEndpointProduct();
    }

    @Then("user received HTTP response code 200 OK")
    public void userReceivedHTTPResponseCode200OK() {
        postNewProduct.userReceivedHTTPResponseCode200OK();
    }

    @Given("user set POST invalid endpoint product")
    public void userSetPOSTInvalidEndpointProduct() {
        postNewProduct.userSetPOSTInvalidEndpointProduct();
    }

    @When("user send POST HTTP request with invalid endpoint product")
    public void userSendPOSTHTTPRequestWithInvalidEndpointProduct() {
        postNewProduct.userSendPOSTHTTPRequestWithInvalidEndpointProduct();
    }

    @Then("user received POST HTTP response code 404 Not found")
    public void userReceivedPOSTHTTPResponseCode404NotFound() {
        postNewProduct.userReceivedPOSTHTTPResponseCode404NotFound();
    }

    @When("user send POST HTTP request with input empty request body product")
    public void userSendPOSTHTTPRequestWithInputEmptyRequestBodyProduct() {
        postNewProduct.userSendPOSTHTTPRequestWithInputEmptyRequestBodyProduct();
    }

    @Then("user received HTTP response code 404 with input empty request body")
    public void userReceivedHTTPResponseCode404WithInputEmptyRequestBody() {
        postNewProduct.userReceivedHTTPResponseCode404ithInputEmptyRequestBody();
    }

    @And("user received valid data for new product")
    public void userReceivedValidDataForNewProduct() {
        postNewProduct.userReceivedValidDataForNewProduct();
    }

    // PutProduct.Features
    @Given("the user sets a valid PUT endpoint product")
    public void UserSetsAValidPUTEndpointProduct() {
        putProduct.UserSetsAValidPUTEndpointProduct();
    }

    @When("the user sends a PUT HTTP request body")
    public void UserSendsAPUTHTTPRequestBody() {
        putProduct.UserSendsAPUTHTTPRequestBody();
    }

    @Then("the user receives an HTTP response code 200 OK")
    public void UserReceivesAnHTTPResponseCode200OK() {
        putProduct.UserReceivesAnHTTPResponseCode200OK();
    }

    @Given("the user sets an invalid PUT endpoint product")
    public void UserSetsAnInvalidPUTEndpointProduct() {
        putProduct.UserSetsAnInvalidPUTEndpointProduct();
    }

    @When("the user sends a PUT HTTP request with an invalid endpoint product")
    public void UserSendsAPUTHTTPRequestWithAnInvalidEndpointProduct() {
        putProduct.UserSendsAPUTHTTPRequestWithAnInvalidEndpointProduct();
    }

    @Then("the user receives an HTTP response code 404")
    public void UserReceivesAnHTTPResponseCode404() {
        putProduct.UserReceivesAnHTTPResponseCode404();
    }

    // DeleteProduct.Features
    @Given("the user has a valid endpoint to delete")
    public void UserHasAValidEndpointToDelete() {
        deleteProduct.UserHasAValidEndpointToDelete();
    }

    @When("the user sends a DELETE HTTP request with a valid endpoint")
    public void UserSendsADELETEHTTPRequestWithAValidEndpoint() {
        deleteProduct.UserSendsADELETEHTTPRequestWithAValidEndpoint();
    }

    @Then("the user receives a DELETE HTTP response code 200 with a valid endpoint")
    public void UserReceivesADELETEHTTPResponseCode200WithAValidEndpoint() {
        deleteProduct.UserReceivesADELETEHTTPResponseCode200WithAValidEndpoint();
    }

    @Given("the user has an invalid endpoint to delete")
    public void UserHasAnInvalidEndpointToDelete() {
        deleteProduct.UserHasAnInvalidEndpointToDelete();
    }

    @When("the user sends a DELETE HTTP request with an invalid endpoint")
    public void UserSendsADELETEHTTPRequestWithAnInvalidEndpoint() {
        deleteProduct.UserSendsADELETEHTTPRequestWithAnInvalidEndpoint();
    }

    @Then("the user receives a DELETE HTTP response code 404 with an invalid endpoint")
    public void UserReceivesADELETEHTTPResponseCode404WithAnInvalidEndpoint() {
        deleteProduct.UserReceivesADELETEHTTPResponseCode404WithAnInvalidEndpoint();
    }
}
