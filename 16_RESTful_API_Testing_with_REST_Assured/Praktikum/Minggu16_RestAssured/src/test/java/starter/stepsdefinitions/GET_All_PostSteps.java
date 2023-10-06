package starter.stepsdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.post.GET_All_Post;

public class GET_All_PostSteps {
    @Steps
    GET_All_Post get_all_post;

    @Given("user set valid GET all Post endpoint")
    public void userSetValidGETAllPostEndpoint() {
        get_all_post.setValidGETAllPostEndpointAsUser();
    }

    @When("user send GET HTTP request with valid endpoint for all Post")
    public void userSendGETHTTPRequestWithValidEndpointForAllPost() {
        get_all_post.sendGETHTTPRequestWithValidEndpointForAllPostAsUser();
    }

    @Then("user received valid GET HTTP response code {int} for all Post")
    public void userReceivedValidGETHTTPResponseCodeForAllPost(int arg0) {
        get_all_post.validateGETHTTPResponseCode200ForAllPostAsUser();
    }

    @Given("user set invalid GET all Post endpoint")
    public void userSetInvalidGETAllPostEndpoint() {
        get_all_post.setInvalidGETAllPostEndpointAsUser();
    }

    @When("user send GET HTTP request with invalid endpoint for all Post")
    public void userSendGETHTTPRequestWithInvalidEndpointForAllPost() {
        get_all_post.sendGETHTTPRequestWithInvalidEndpointForAllPostAsUser();
    }

    @Then("user received GET HTTP response code {int} for all Post")
    public void userReceivedGETHTTPResponseCodeForAllPost(int arg0) {
        get_all_post.validateGETHTTPResponseCode404ForAllPostAsUser();
    }

    @When("user send GET HTTP request with invalid method for all Post")
    public void userSendGETHTTPRequestWithInvalidMethodForAllPost() {
        get_all_post.sendGETHTTPRequestWithInvalidMethodForAllPostAsUser();
    }

    @Then("user received GET HTTP response code {int} Method Not Allowed for all Post")
    public void userReceivedGETHTTPResponseCodeMethodNotAllowedForAllPost(int arg0) {
        get_all_post.validateGETHTTPResponseCode500ForAllPostAsUser();
    }
}
