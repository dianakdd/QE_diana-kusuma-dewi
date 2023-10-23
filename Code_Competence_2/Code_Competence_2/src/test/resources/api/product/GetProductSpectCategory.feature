Feature: GET - Product Specific Category
  As a user
  I want to see Product Specific Category
  So that i can see all Product Specific Category

  Scenario: GET - As a user i want to get all Product Specific Category with valid endpoint
    Given user set GET valid endpoint for all Product Specific Category
    When user send GET HTTP request with valid endpoint for Product Specific Category
    Then user received valid GET HTTP response code 200 for Product Specific Category

  @NegativeScenario
  Scenario: GET - As a user i want to get all Product Specific Category with invalid endpoint
    Given user set GET invalid endpoint for all Product Specific Category
    When user send GET HTTP request with invalid endpoint for all Product Specific Category
    Then user received GET HTTP response code 404 for all Product Specific Category