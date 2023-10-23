Feature: POST - create a new product
  As a user
  I want to see list of product
  So that i can create a new product

  Scenario: POST - as a user i want to create a product users with valid endpoint
    Given user set POST valid endpoint product
    When user send POST HTTP request
    Then user received HTTP response code 200 OK

  @NegativeScenario
  Scenario: POST - as a user i want to add new product with invalid endpoint
    Given user set POST invalid endpoint product
    When user send POST HTTP request with invalid endpoint product
    Then user received POST HTTP response code 404 Not found

  @NegativeScenario
  Scenario: POST - as a user i want to create a new product with input empty request body product
    Given user set POST valid endpoint
    When user send POST HTTP request with input empty request body product
    Then user received HTTP response code 404 with input empty request body

