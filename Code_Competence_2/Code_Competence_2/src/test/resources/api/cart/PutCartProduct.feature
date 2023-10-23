Feature: PUT - Update cart Product
  As a user,
  I want to Update cart Product,
  So that I can modify product information.

  Scenario: PUT - Update cart Product with Valid Endpoint
    Given the user sets a valid PUT endpoint Update cart Product
    When the user sends a PUT HTTP request Update cart Product
    Then the user receives an HTTP response code 200 with valid endpoint

  @NegativeScenario
  Scenario: PUT - Update User with Invalid Endpoint
    Given the user sets an invalid PUT endpoint Update cart Product
    When the user sends a PUT HTTP request Update cart Product with an invalid endpoint
    Then the user receives an HTTP response code 404 with invalid endpoint