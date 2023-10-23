package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Users.*;
public class usersSteps {
    @Steps
    GET_All_Users getAllUsers;

    @Steps
    GET_Single_Users singleUsers;

    @Steps
    GET_Limit_Users limitUsers;

    @Steps
    GET_Short_Result ShortResult;

    @Steps
    POST_New_Users postNewUsers;

    @Steps
    PUT_Users putUsers;

    @Steps
    DELETE_Users deleteUsers;


    // GetAllUsers.Features
    @Given("user set GET valid endpoint")
    public void userSetGETValidEndpoint() {
        getAllUsers.userSetGETValidEndpoint();
    }

    @When("user send GET HTTP request with valid endpoint")
    public void userSendGETHTTPRequestWithValidEndpoint() {
        getAllUsers.userSendGETHTTPRequestWithValidEndpoint();
    }

    @Then("user received valid GET HTTP response code 200")
    public void userReceivedValidGETHTTPResponseCode200() {
        getAllUsers.userReceivedValidGETHTTPResponseCode200();
    }

    @Given("user set GET invalid endpoint")
    public void userSetGETInvalidEndpoint() {
        getAllUsers.userSetGETInvalidEndpoint();
    }

    @When("user send GET HTTP request with invalid endpoint")
    public void userSendGETHTTPRequestWithInvalidEndpoint() {
        getAllUsers.userSendGETHTTPRequestWithInvalidEndpoint();
    }

    @Then("user received GET HTTP response code 400")
    public void userReceivedGETHTTPResponseCode400() {
        getAllUsers.userReceivedGETHTTPResponseCode400();
    }

    // GetSingleUsers.Features
    @Given("user set GET valid endpoint for users by ID")
    public void userSetGETValidEndpointForUsersByID() {
        singleUsers.userSetGETValidEndpointForUsersByID();
    }

    @When("user send GET HTTP request with valid endpoint for users by ID")
    public void userSendGETHTTPRequestWithValidEndpointForUsersByID() {
        singleUsers.userSendGETHTTPRequestWithValidEndpointForUsersByID();
    }

    @Then("user received valid GET HTTP response code 200 for users by ID")
    public void userReceivedValidGETHTTPResponseCode200ForUsersByID() {
        singleUsers.userReceivedValidGETHTTPResponseCode200ForUsersByID();
    }

    @Given("user set GET invalid endpoint for users by ID")
    public void userSetGETInvalidEndpointForUsersByID() {
        singleUsers.userSetGETInvalidEndpointForUsersByID();
    }

    @When("user send GET HTTP request with invalid endpoint for users by ID")
    public void userSendGETHTTPRequestWithInvalidEndpointForUsersByID() {
        singleUsers.userSendGETHTTPRequestWithInvalidEndpointForUsersByID();
    }

    @Then("user received GET HTTP response code 404 for users by ID")
    public void userReceivedGETHTTPResponseCode404ForUsersByID() {
        singleUsers.userReceivedGETHTTPResponseCode404ForUsersByID();
    }

    @And("user received valid data for users by ID")
    public void userReceivedValidDataForUsersByID() {
        singleUsers.userReceivedValidDataForUsersByID();
    }

    // GetLimitUsers.Features
    @Given("user set GET valid endpoint to get a list 5 users")
    public void userSetGETValidEndpointToGetAList5Users() {
        limitUsers.userSetGETValidEndpointToGetAList5Users();
    }

    @When("user send GET HTTP request to get limit users with valid endpoint")
    public void userSendGETHTTPRequestToGetLimitUsersWithValidEndpoint() {
        limitUsers.userSendGETHTTPRequestToGetLimitUsersWithValidEndpoint();
    }

    @Then("user received valid GET HTTP response code 200 to get list 5 users")
    public void userReceivedValidGETHTTPResponseCode200ToGetList5Users() {
        limitUsers.userReceivedValidGETHTTPResponseCode200ToGetList5Users();
    }

    @Given("user set GET invalid endpoint to get a list 5 users")
    public void userSetGETInvalidEndpointToGetAList5Users() {
        limitUsers.userSetGETInvalidEndpointToGetAList5Users();
    }

    @When("user send GET HTTP request to get limit users with invalid endpoint")
    public void userSendGETHTTPRequestToGetLimitUsersWithInvalidEndpoint() {
        limitUsers.userSendGETHTTPRequestToGetLimitUsersWithInvalidEndpoint();
    }

    //Expected 404 --> 200 OK
    @Then("user received GET HTTP response code 200 to get list 5 users")
    public void userReceivedGETHTTPResponseCode200ToGetList5Users() {
        limitUsers.userReceivedGETHTTPResponseCode200ToGetList5Users();
    }

    @And("user received valid data forget list 5 users")
    public void userReceivedValidDataForgetList5Users() {
        limitUsers.userReceivedValidDataForgetList5Users();
    }

    // GetShortResult.Features
    @Given("user set GET valid endpoint to get sorted in descending order")
    public void userSetGETValidEndpointToGetSortedInDescendingOrder() {
        ShortResult.userSetGETValidEndpointToGetSortedInDescendingOrder();
    }

    @When("user send GET HTTP request to sorted in descending order with valid endpoint")
    public void userSendGETHTTPRequestToSortedInDescendingOrderWithValidEndpoint() {
        ShortResult.userSendGETHTTPRequestToSortedInDescendingOrderWithValidEndpoint();
    }

    @Then("user received valid GET HTTP response code 200 to get sorted in descending order")
    public void userReceivedValidGETHTTPResponseCodeTo200GetSortedInDescendingOrder() {
        ShortResult.userReceivedValidGETHTTPResponseCodeTo200GetSortedInDescendingOrder();
    }

    @Given("user set GET invalid endpoint to get sorted in descending order")
    public void userSetGETInvalidEndpointToGetSortedInDescendingOrder() {
        ShortResult.userSetGETInvalidEndpointToGetSortedInDescendingOrder();
    }

    @When("user send GET HTTP request to sorted in descending order with invalid endpoint")
    public void userSendGETHTTPRequestToSortedInDescendingOrderWithInvalidEndpoint() {
        ShortResult.userSendGETHTTPRequestToSortedInDescendingOrderWithInvalidEndpoint();
    }

    @Then("user received GET HTTP response code 200 to get sorted in descending order")
    public void userReceivedGETHTTPResponseCodeToGe200tSortedInDescendingOrder() {
        ShortResult.userReceivedGETHTTPResponseCodeToGe200tSortedInDescendingOrder();
    }

    @And("user received valid data forget sorted in descending order")
    public void userReceivedValidDataForgetSortedInDescendingOrder() {
        ShortResult.userReceivedValidDataForgetSortedInDescendingOrder();
    }

    // PostCreateNewUsers.Features
    @Given("user set POST valid endpoint")
    public void userSetPOSTValidEndpoint() {
        postNewUsers.userSetPOSTValidEndpoint();
    }

    @When("user send POST HTTP request")
    public void userSendPOSTHTTPRequest() {
        postNewUsers.userSendPOSTHTTPRequest();

    }

    @Then("user received HTTP response code 200")
    public void userReceivedHTTPResponseCode200() {
        postNewUsers.userReceivedHTTPResponseCode200();

    }

    @Given("user set POST invalid endpoint")
    public void userSetPOSTInvalidEndpoint() {
        postNewUsers.userSetPOSTInvalidEndpoint();

    }

    @When("user send POST HTTP request with invalid endpoint")
    public void userSendPOSTHTTPRequestWithInvalidEndpoint() {
        postNewUsers.userSendPOSTHTTPRequestWithInvalidEndpoint();

    }

    @Then("user received POST HTTP response code 404")
    public void userReceivedPOSTHTTPResponseCode404() {
        postNewUsers.userReceivedPOSTHTTPResponseCode404();

    }

    @When("user send POST HTTP request with input empty request body")
    public void userSendPOSTHTTPRequestWithInputEmptyRequestBody() {
        postNewUsers.userSendPOSTHTTPRequestWithInputEmptyRequestBody();

    }

    @Then("user received HTTP response code 200 with input empty request body")
    public void userReceivedHTTPResponseCode200WithInputEmptyRequestBody() {
        postNewUsers.userReceivedHTTPResponseCode200WithInputEmptyRequestBody();
    }

    @And("user received valid data for new users")
    public void userReceivedValidDataForNewUsers() {
        postNewUsers.userReceivedValidDataForNewUsers();
    }

    // PutUpdateUsers.Features
    @Given("the user sets a valid PUT endpoint")
    public void UserSetsAValidPUTEndpoint() {
        putUsers.UserSetsAValidPUTEndpoint();
    }

    @When("the user sends a PUT HTTP request")
    public void UserSendsAPUTHTTPRequest() {
        putUsers.UserSendsAPUTHTTPRequest();

    }

    @Then("the user receives an HTTP response code 200")
    public void UserReceivesAnHTTPResponseCode200() {
        putUsers.UserReceivesAnHTTPResponseCode200();

    }

    @Given("the user sets an invalid PUT endpoint")
    public void UserSetsAnInvalidPUTEndpoint() {
        putUsers.UserSetsAnInvalidPUTEndpoint();

    }

    @When("the user sends a PUT HTTP request with an invalid endpoint")
    public void UserSendsAPUTHTTPRequestWithAnInvalidEndpoint() {
        putUsers.UserSendsAPUTHTTPRequestWithAnInvalidEndpoint();

    }

    @Then("the user receives an HTTP response code 404 not content")
    public void UserReceivesAnHTTPResponseCodeNot404Content() {
        putUsers.UserReceivesAnHTTPResponseCodeNot404Content();
    }

    // DeleteUsers.Features
    @Given("user set DELETE valid endpoint")
    public void userSetDELETEValidEndpoint() {
        deleteUsers.userSetDELETEValidEndpoint();
    }

    @When("user send DELETE HTTP request with valid endpoint")
    public void userSendDELETEHTTPRequestWithValidEndpoint() {
        deleteUsers.userSendDELETEHTTPRequestWithValidEndpoint();

    }

    @Then("user received DELETE HTTP response code 200 with valid endpoint")
    public void userReceivedDELETEHTTPResponseCode200WithValidEndpoint() {
        deleteUsers.userReceivedDELETEHTTPResponseCode200WithValidEndpoint();

    }

    @Given("user set DELETE endpoint with invalid endpoint")
    public void userSetDELETEEndpointWithInvalidEndpoint() {
        deleteUsers.userSetDELETEEndpointWithInvalidEndpoint();

    }

    @When("user send DELETE HTTP request with invalid endpoint")
    public void userSendDELETEHTTPRequestWithInvalidEndpoint() {
        deleteUsers.userSendDELETEHTTPRequestWithInvalidEndpoint();

    }

    @Then("user received DELETE HTTP response code 404 with invalid endpoint")
    public void userReceivedDELETEHTTPResponseCode404WithInvalidEndpoint() {
        deleteUsers.userReceivedDELETEHTTPResponseCode404WithInvalidEndpoint();
    }
}
