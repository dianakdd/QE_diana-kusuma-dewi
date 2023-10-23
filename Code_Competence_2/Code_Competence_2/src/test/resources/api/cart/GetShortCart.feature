Feature: GET - get users in descending cart
  As a user
  I want to see sorted in descending cart
  So that i can see sorted in descending cart

  Scenario: GET - As a user i want to get users in descending cart with valid endpoint
    Given user set GET valid endpoint to get sorted in descending cart
    When user send GET HTTP request to sorted in descending cart with valid endpoint
    Then user received valid GET HTTP response code 200 to get sorted in descending cart

  @NegativeScenario
  Scenario: GET - As a user i want to get users in descending cart with invalid endpoint
    Given user set GET invalid endpoint to get sorted in descending cart
    When user send GET HTTP request to sorted in descending cart with invalid endpoint
    Then user received GET HTTP response code 200 to get sorted in descending cart
