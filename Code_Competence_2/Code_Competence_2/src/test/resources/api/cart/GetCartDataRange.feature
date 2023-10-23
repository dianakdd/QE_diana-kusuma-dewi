Feature: GET - get carts in a date range
  As a user
  I want to see carts in a date range
  So that I can retrieve the relevant cart data

  Scenario: GET - As a user I want to get carts in a date range with valid endpoint
    Given user set GET valid endpoint to get carts in a date range
    When user send GET HTTP request to get carts in a date range with valid endpoint
    Then user received valid GET HTTP response code 200 to get carts in a date range

  @NegativeScenario
  Scenario: GET - As a user I want to get carts in a date range with invalid endpoint
    Given user set GET invalid endpoint to get carts in a date range
    When user send GET HTTP request to get carts in a date range with invalid endpoint
    Then user received GET HTTP response code 400 with invalid endpoint

