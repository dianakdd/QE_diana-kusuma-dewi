Feature: GET - get limit users
  As a user
  I want to see list 5 users
  So that i can see list of 5 users

  Scenario: GET - As a user i want to get list 5 users with valid endpoint
    Given user set GET valid endpoint to get a list 5 users
    When user send GET HTTP request to get limit users with valid endpoint
    Then user received valid GET HTTP response code 200 to get list 5 users

  @NegativeScenario
  Scenario: GET - As a user i want to get list 5 users with invalid endpoint
    Given user set GET invalid endpoint to get a list 5 users
    When user send GET HTTP request to get limit users with invalid endpoint
    Then user received GET HTTP response code 200 to get list 5 users

