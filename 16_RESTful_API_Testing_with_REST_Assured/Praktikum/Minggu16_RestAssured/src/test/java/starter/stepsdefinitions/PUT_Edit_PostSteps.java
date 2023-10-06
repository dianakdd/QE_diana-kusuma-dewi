package starter.stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.post.PUT_Edit_Post;

public class PUT_Edit_PostSteps {
    @Steps
    PUT_Edit_Post put_edit_post;

    @When("user set valid PUT post by ID endpoint")
    public void userSetValidPUTClassByIDEndpoint() {
        put_edit_post.setValidPUTPostByIDEndpoint();
    }

    @And("user send PUT HTTP request with valid endpoint for edit post by ID")
    public void userSendPUTHTTPRequestWithValidEndpointForEditClassByID() {
        put_edit_post.sendPUTHTTPRequestWithValidEndpointForPostByID();
    }

    @Then("user received valid PUT HTTP response code {int} for edit post by ID")
    public void userReceivedValidPUTHTTPResponseCodeForEditClassByID(int arg0) {
        put_edit_post.validateHTTPResponseCode200ForEditPostByID();
    }

    @When("user set invalid PUT post by ID endpoint")
    public void userSetInvalidPUTClassByIDEndpoint() {
        put_edit_post.setInvalidPUTPostByIDEndpoint();
    }

    @And("user send PUT HTTP request with invalid endpoint for edit post by ID")
    public void userSendPUTHTTPRequestWithInvalidEndpointForEditClassByID() {
        put_edit_post.sendPUTHTTPRequestWithInvalidEndpointForPostByID();
    }

    @Then("user received PUT HTTP response code {int} for edit post by ID")
    public void userReceivedPUTHTTPResponseCodeForEditClassByID(int arg0) {
        put_edit_post.validateHTTPResponseCode404ForEditPostByID();
    }

    @And("user send PUT HTTP request with invalid method for edit post by ID")
    public void userSendPUTHTTPRequestWithInvalidMethodForEditClassByID() {
        put_edit_post.sendPUTHTTPRequestWithInvalidMethodForPostByID();
    }

    @Then("user received PUT HTTP response code {int} Bad Request for edit class by ID")
    public void userReceivedPUTHTTPResponseCodeBadRequestForEditClassByID(int arg0) {
        put_edit_post.validateHTTPResponseCode400ForEditPostByID();
    }

    @When("user set invalid ID PUT post by ID endpoint")
    public void userSetInvalidIDPUTClassByIDEndpoint() {
        put_edit_post.setInvalidIDPUTPostByIDEndpoint();
    }

    @And("user send PUT HTTP request with invalid ID for edit post by ID")
    public void userSendPUTHTTPRequestWithInvalidIDForEditClassByID() {
        put_edit_post.sendPUTHTTPRequestWithInvalidIDForPostByID();
    }

    @And("user send PUT HTTP request with empty request body for edit post by ID")
    public void userSendPUTHTTPRequestWithEmptyRequestBodyForEditClassByID() {
        put_edit_post.sendPUTHTTPRequestWithEmptyRequestBodyForPostByID();
    }

    @Then("user received PUT HTTP response code {int} Bad Request for edit post by ID")
    public void userReceivedPUTHTTPResponseCodeBadReqBodyForEditClassByID(int arg0) {
        put_edit_post.validateHTTPResponseCode400ForEditPostByID();
    }
}
