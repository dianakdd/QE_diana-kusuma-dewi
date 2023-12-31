Feature: GET - Product by ID
  As a user
  I want to see list of products
  So that i can see product by ID

  Scenario: GET - As a user i want to get product by ID with valid endpoint
    Given user set GET valid endpoint for product by ID
    When user send GET HTTP request with valid endpoint for product by ID
    Then user received valid GET HTTP response code 200 for product by ID

  @NegativeScenario
  Scenario: GET - As a user i want to get product by ID with invalid endpoint
    Given user set GET invalid endpoint for product by ID
    When user send GET HTTP request with invalid endpoint for product by ID
    Then user received GET HTTP response code 404 for product by ID
