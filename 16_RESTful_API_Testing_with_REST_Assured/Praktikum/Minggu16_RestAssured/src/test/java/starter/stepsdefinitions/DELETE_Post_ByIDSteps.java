package starter.stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.post.DELETE_Post_ByID;

public class DELETE_Post_ByIDSteps {
    @Steps
    DELETE_Post_ByID delete_post_byID;

    @When("user set valid DELETE post by ID endpoint")
    public void userSetValidDELETEPostByIDEndpoint() {
        delete_post_byID.setValidDELETEPostByIDEndpoint();
    }

    @And("user send DELETE HTTP request with valid endpoint for post by ID")
    public void userSendDELETEHTTPRequestWithValidEndpointForPostByID() {
        delete_post_byID.sendDELETEHTTPRequestWithValidEndpointForPostByID();
    }

    @Then("user received valid DELETE HTTP response code {int} for post by ID")
    public void userReceivedValidDELETEHTTPResponseCodeForPostByID(int arg0) {
        delete_post_byID.validateDELETEHTTPResponseCode200ForPostByID();
    }

    @When("user set invalid DELETE post by ID endpoint")
    public void userSetInvalidDELETEPostByIDEndpoint() {
        delete_post_byID.setInvalidDELETEPostByIDEndpoint();
    }

    @And("user send DELETE HTTP request with invalid endpoint for post by ID")
    public void userSendDELETEHTTPRequestWithInvalidEndpointForPostByID() {
        delete_post_byID.sendDELETEHTTPRequestWithInvalidEndpointForPostByID();
    }

    @Then("user received DELETE HTTP response code {int} for post by ID")
    public void userReceivedDELETEHTTPResponseCodeForPostByID(int arg0) {
        delete_post_byID.validateDELETEHTTPResponseCode404ForPostByID();
    }

    @And("user send DELETE HTTP request with invalid method for post by ID")
    public void userSendDELETEHTTPRequestWithInvalidMethodForPostByID() {
        delete_post_byID.sendDELETEHTTPRequestWithInvalidMethodForPostByID();
    }

    @When("user set invalid ID DELETE post by ID endpoint")
    public void userSetInvalidIDDELETEPostByIDEndpoint() {
        delete_post_byID.setInvalidIDDELETEPostByIDEndpoint();
    }

    @And("user send DELETE HTTP request with invalid ID for post by ID")
    public void userSendDELETEHTTPRequestWithInvalidIDForPostByID() {
        delete_post_byID.sendDELETEHTTPRequestWithInvalidIDForPostByID();
    }

}
