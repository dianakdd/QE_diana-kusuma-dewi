package starter.stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.post.GET_Post_ByID;

public class GET_Post_ByIDSteps {
    @Steps
    GET_Post_ByID get_post_byID;

    @Given("user set valid GET post by ID endpoint")
    public void userSetValidGETPostByIDEndpoint() {
        get_post_byID.setValidGETPostByIDEndpointAsUser();
    }

    @And("user send authentication endpoint")
    public void userSendAuthEndpoint() {

    }

    @When("user send GET HTTP request with valid endpoint for post by ID")
    public void userSendGETHTTPRequestWithValidEndpointForPostByID() {
        get_post_byID.sendGETHTTPRequestWithValidEndpointForPostByIDAsUser();
    }

    @Then("user received valid GET HTTP response code {int} for post by ID")
    public void userReceivedValidGETHTTPResponseCodeForPostByID(int arg0) {
        get_post_byID.validateGETHTTPResponseCode200ForPostByIDAsUser();
    }

    @Given("user set invalid GET post by ID endpoint")
    public void userSetInvalidGETPostByIDEndpoint() {
        get_post_byID.setInvalidGETPostByIDEndpointAsUser();
    }

    @When("user send GET HTTP request with invalid endpoint for post by ID")
    public void userSendGETHTTPRequestWithInvalidEndpointForPostByID() {
        get_post_byID.sendGETHTTPRequestWithInvalidEndpointForPostByIDAsUser();
    }

    @Then("user received GET HTTP response code {int} for post by ID")
    public void userReceivedGETHTTPResponseCodeForPostByID(int arg0) {
        get_post_byID.validateGETHTTPResponseCode404ForPostByIDAsUser();
    }

    @When("user send GET HTTP request with invalid method for post by ID")
    public void userSendGETHTTPRequestWithInvalidMethodForPostByID() {
        get_post_byID.sendGETHTTPRequestWithInvalidMethodForPostByIDAsUser();
    }

    @Then("user received GET HTTP response code {int} Method Not Allowed for post by ID")
    public void userReceivedGETHTTPResponseCodeMethodNotAllowedForPostByID(int arg0) {
        get_post_byID.validateGETHTTPResponseCode500ForPostByIDAsUser();
    }

    @Given("user set valid GET post by ID endpoint with invalid ID")
    public void userSetValidGETPostClassByIDEndpointWithInvalidID() {
        get_post_byID.setValidGETPostByIDEndpointWithInvalidIDAsUser();
    }

    @Given("user set invalid ID GET post by ID endpoint")
    public void userSetValidGETPostByIDEndpointWithInvalidID() {
        get_post_byID.setValidGETPostByIDEndpointWithInvalidIDAsUser();
    }

    @When("user send GET HTTP request with invalid ID for post by ID")
    public void userSendGETHTTPRequestWithInvalidIDForPostByID() {
        get_post_byID.sendGETHTTPRequestWithInvalidIDForPostByIDAsUser();
    }

}
