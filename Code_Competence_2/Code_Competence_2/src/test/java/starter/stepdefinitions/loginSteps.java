package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Auth.Login;
public class loginSteps {
    @Steps
    Login login;

    // Login.Features
    // POST - Successful login with valid credentials
    @Given("I set POST endpoint the Fake Store API")
    public void SetPOSTEndpointTheFakeStoreAPI() {
        login.SetPOSTEndpointTheFakeStoreAPI();
    }

    @And("I have valid credentials")
    public void ValidCredentials() {
        login.ValidCredentials();
    }

    @And("I send a POST HTTP request")
    public void SendAPOSTHTTPRequest() {
        login.SendAPOSTHTTPRequest();
    }

    @Then("the response status code should be 200")
    public void ResponseStatusCodeShouldBe200() {
        login.SendAPOSTHTTPRequestCodeShouldBe200();
    }

    // POST - Failed login with invalid credentials
    @And("I have invalid credentials")
    public void InvalidCredentials() {
        login.InvalidCredentials();
    }

    @When("I send a POST invalid HTTP request")
    public void SendAPOSTInvalidHTTPRequest() {
        login.SendAPOSTInvalidHTTPRequest();
    }

    // @Then("the response status code should be 200")
    //public void theResponseStatusCodeShouldBe200() {
    ///  login.theResponseStatusCodeShouldBe200();
    //}

    //POST - Invalid endpoint for login
    @Given("I set POST endpoint to an invalid URL")
    public void SetPOSTEndpointToAnInvalidURL() {
        login.SetPOSTEndpointToAnInvalidURL();
    }

    @When("I send a POST to invalid HTTP request")
    public void SendAPOSTToInvalidHTTPRequest() {
        login.SendAPOSTToInvalidHTTPRequest();
    }

    @Then("the response status code should be 404")
    public void theResponseStatusCodeShouldBe404() {
        login.theResponseStatusCodeShouldBe404();
    }

}
