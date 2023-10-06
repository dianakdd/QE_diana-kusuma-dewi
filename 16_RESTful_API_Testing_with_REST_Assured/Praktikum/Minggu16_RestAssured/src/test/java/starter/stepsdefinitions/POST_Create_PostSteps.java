package starter.stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.post.POST_Create_Post;

public class POST_Create_PostSteps {
    @Steps
    POST_Create_Post post_create_post;

    @Given("user set authentication endpoint")
    public void userSetAuthEndpoint() {

    }

    @When("user set valid POST new post endpoint")
    public void userSetValidPOSTNewPostEndpoint() {
        post_create_post.setValidPOSTNewPostEndpoint();
    }

    @And("user send POST HTTP request with valid endpoint for new post")
    public void userSendPOSTHTTPRequestWithValidEndpointForNewPost() {
        post_create_post.sendPOSTHTTPRequestWithValidEndpointForNewPost();
    }

    @Then("user received valid POST HTTP response code {int} for new post")
    public void userReceivedValidPOSTHTTPResponseCodeForNewPost(int arg0) {
        post_create_post.validateHTTPResponseCode201ForNewPost();
    }

    @When("user set invalid POST new post endpoint")
    public void userSetInvalidPOSTNewPostEndpoint() {
        post_create_post.setInvalidPOSTNewPostEndpoint();
    }

    @And("user send POST HTTP request with invalid endpoint for new post")
    public void userSendPOSTHTTPRequestWithInvalidEndpointForNewPost() {
        post_create_post.sendPOSTHTTPRequestWithInvalidEndpointForNewPost();
    }

    @Then("user received POST HTTP response code {int} for new post")
    public void userReceivedPOSTHTTPResponseCodeForNewPost(int arg0) {
        post_create_post.validateHTTPResponseCode404ForNewPost();
    }

    @And("user send POST HTTP request with empty request body for new post")
    public void userSendPOSTHTTPRequestWithEmptyRequestBodyForNewPost() {
        post_create_post.sendPOSTHTTPRequestWithEmptyRequestBodyForNewPost();
    }

    @Then("user received POST HTTP response code {int} Bad Request for new post")
    public void userReceivedPOSTHTTPResponseCodeBadRequestForNewPost(int arg0) {
        post_create_post.validateHTTPResponseCode400ForNewPost();
    }

    @And("user send POST HTTP request with invalid request body for new post")
    public void userSendPOSTHTTPRequestWithInvalidRequestBodyForNewPost() {
        post_create_post.sendPOSTHTTPRequestWithInvalidRequestBodyForNewPost();
    }

    @And("user send POST HTTP request with invalid method for new post")
    public void userSendPOSTHTTPRequestWithInvalidMethodForNewPost() {
        post_create_post.sendPOSTHTTPRequestWithInvalidMethodForNewPost();
    }

    @Then("user received POST HTTP response code {int} invalid req body for new post")
    public void userReceivedPOSTHTTPResponseCodeInternalServerErrorForNewPost(int arg0) {
        post_create_post.validateHTTPResponseCode500ForNewPost();
    }
}
