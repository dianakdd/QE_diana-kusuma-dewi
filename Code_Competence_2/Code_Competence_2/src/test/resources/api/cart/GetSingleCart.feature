Feature: GET - Product by cart ID
  As a user
  I want to see list of users
  So that i can see users by cart ID

  Scenario: GET - As a user i want to get cart by ID with valid endpoint
    Given user set GET valid endpoint for cart by ID
    When user send GET HTTP request with valid endpoint for cart by ID
    Then user received valid GET HTTP response code 200 for cart by ID

  @NegativeScenario
  Scenario: GET - As a user i want to get cart by ID with invalid endpoint
    Given user set GET invalid endpoint for cart by ID
    When user send GET HTTP request with invalid endpoint for cart by ID
    Then user received GET HTTP response code 404 for cart by ID
