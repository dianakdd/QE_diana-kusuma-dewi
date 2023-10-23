Feature: POST - create a new users
  As a user
  I want to see list of users
  So that i can create a new users

  Scenario: POST - as a user i want to create a new users with valid endpoint
    Given user set POST valid endpoint
    When user send POST HTTP request
    Then user received HTTP response code 200

  @NegativeScenario
  Scenario: POST - as a user i want to add new users with invalid endpoint
    Given user set POST invalid endpoint
    When user send POST HTTP request with invalid endpoint
    Then user received POST HTTP response code 404

  @NegativeScenario
  Scenario: POST - as a user i want to create a new users with input empty request body
    Given user set POST valid endpoint
    When user send POST HTTP request with input empty request body
    Then user received HTTP response code 200 with input empty request body

