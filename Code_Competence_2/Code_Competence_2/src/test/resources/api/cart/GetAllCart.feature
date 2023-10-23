Feature: GET - All Cart
  As a user
  I want to see list of cart
  So that i can see all cart

  Scenario: GET - As a user i want to get all cart with valid endpoint
    Given the user set GET valid endpoint
    When the user send GET HTTP request with valid endpoint
    Then the user received valid GET HTTP response code 200 OK

  @NegativeScenario
  Scenario: GET - As a user i want to get all cart with invalid endpoint
    Given the user set GET invalid endpoint
    When the user send GET HTTP request with invalid endpoint
    Then the user received GET HTTP response code 400 bad request