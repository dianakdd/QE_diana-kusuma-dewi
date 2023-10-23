Feature: GET - get limit cart
  As a user
  I want to see list 5 cart
  So that i can see list of 5 cart

  Scenario: GET - As a user i want to get list 5 cart with valid endpoint
    Given user set GET valid endpoint to get a list 5 cart
    When user send GET HTTP request to get limit cart with valid endpoint
    Then user received valid GET HTTP response code 200 to get list 5 cart

  @NegativeScenario
  Scenario: GET - As a user i want to get list 5 cart with invalid endpoint
    Given user set GET invalid endpoint to get a list 5 cart
    When user send GET HTTP request to get limit cart with invalid endpoint
    Then user received GET HTTP response code 200 to get list 5 cart
