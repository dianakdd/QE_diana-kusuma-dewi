Feature: POST - create a new users
  As a user
  I want to see list of carts
  So that i can create a new carts

  Scenario: POST - as a user i want to create a new carts with valid endpoint
    Given user set POST valid endpoint to new product
    When user send POST HTTP request to new product
    Then user received HTTP response code 200 with valid endpoint

  @NegativeScenario
  Scenario: POST - as a user i want to add new users with invalid endpoint
    Given user set POST invalid endpoint to new product
    When user send POST HTTP request to new product with invalid endpoint
    Then user received POST HTTP response code 404 with invalid endpoint
