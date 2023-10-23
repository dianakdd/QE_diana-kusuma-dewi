Feature: GET - get users in descending product
  As a user
  I want to see sorted in descending product
  So that i can see sorted in descending product

  Scenario: GET - As a user i want to get product in descending product with valid endpoint
    Given user set GET valid endpoint to get sorted in descending product
    When user send GET HTTP request to sorted in descending product with valid endpoint
    Then user received valid GET HTTP response code 200 to get sorted in descending product

  @NegativeScenario
  Scenario: GET - As a user i want to get product in descending product with invalid endpoint
    Given user set GET invalid endpoint to get sorted in descending product
    When user send GET HTTP request to sorted in descending product with invalid endpoint
    Then user received GET HTTP response code 200 to get sorted in descending product
