Feature: DELETE - A Users
  As a user
  I want to see list of Users
  So that i can delete a Users

  Scenario: DELETE - as a user i want to delete a users with valid endpoint
    Given user set DELETE valid endpoint
    When user send DELETE HTTP request with valid endpoint
    Then user received DELETE HTTP response code 200 with valid endpoint

  @NegativeScenario
  Scenario: DELETE - as a user i want to delete a users with invalid endpoint
    Given user set DELETE endpoint with invalid endpoint
    When user send DELETE HTTP request with invalid endpoint
    Then user received DELETE HTTP response code 404 with invalid endpoint