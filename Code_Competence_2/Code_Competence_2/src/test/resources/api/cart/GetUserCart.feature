Feature: GET - get user carts
  As a user
  I want to see user carts
  So that I can retrieve relevant cart data

  Scenario: GET - As a user I want to get user carts with valid endpoint
    Given user set GET valid endpoint to get user carts
    When user send GET HTTP request to get user carts with valid endpoint
    Then user received valid GET HTTP response code 200 to get user carts

  @NegativeScenario
  Scenario: GET - As a user I want to get user carts with invalid endpoint
    Given user set GET invalid endpoint to get user carts
    When user send GET HTTP request to get user carts with invalid endpoint
    Then user received GET HTTP response code 404 with invalid endpoint
