Feature: GET - get users in descending order
  As a user
  I want to see sorted in descending order
  So that i can see sorted in descending order

  Scenario: GET - As a user i want to get users in descending order with valid endpoint
    Given user set GET valid endpoint to get sorted in descending order
    When user send GET HTTP request to sorted in descending order with valid endpoint
    Then user received valid GET HTTP response code 200 to get sorted in descending order

  @NegativeScenario
  Scenario: GET - As a user i want to get users in descending order with invalid endpoint
    Given user set GET invalid endpoint to get sorted in descending order
    When user send GET HTTP request to sorted in descending order with invalid endpoint
    Then user received GET HTTP response code 200 to get sorted in descending order

