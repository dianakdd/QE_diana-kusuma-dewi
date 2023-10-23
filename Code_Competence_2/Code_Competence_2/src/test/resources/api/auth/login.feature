Feature: User login to the Fake Store API
  As a user,
  I want to be able to log in to the Fake Store API
  So that I can access my account and perform actions.

  Scenario: POST - Successful login with valid credentials
    Given I set POST endpoint the Fake Store API
    And I have valid credentials
    When I send a POST HTTP request
    Then the response status code should be 200

  @NegativeScenario
  Scenario: POST - Failed login with invalid credentials
    Given I set POST endpoint the Fake Store API
    And I have invalid credentials
    When I send a POST HTTP request
    Then the response status code should be 200

  @NegativeScenario
  Scenario: POST - Invalid endpoint for login
    Given I set POST endpoint to an invalid URL
    And I have valid credentials
    When I send a POST HTTP request
    Then the response status code should be 404
