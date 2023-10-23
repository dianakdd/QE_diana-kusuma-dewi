Feature: PUT - Update Users
  As a user,
  I want to update user data,
  So that I can modify user information.

  Scenario: PUT - Update User with Valid Endpoint
    Given the user sets a valid PUT endpoint
    When the user sends a PUT HTTP request
    Then the user receives an HTTP response code 200

  @NegativeScenario
  Scenario: PUT - Update User with Invalid Endpoint
    Given the user sets an invalid PUT endpoint
    When the user sends a PUT HTTP request with an invalid endpoint
    Then the user receives an HTTP response code 404 not content