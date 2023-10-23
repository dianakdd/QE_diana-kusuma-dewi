Feature: GET - All Users
  As a user
  I want to see list of users
  So that i can see all users

  Scenario: GET - As a user i want to get all users with valid endpoint
    Given user set GET valid endpoint
    When user send GET HTTP request with valid endpoint
    Then user received valid GET HTTP response code 200

  @NegativeScenario
  Scenario: GET - As a user i want to get all users with invalid endpoint
    Given user set GET invalid endpoint
    When user send GET HTTP request with invalid endpoint
    Then user received GET HTTP response code 400