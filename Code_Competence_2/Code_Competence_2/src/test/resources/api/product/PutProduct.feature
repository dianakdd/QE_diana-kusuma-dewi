Feature: PUT - Update Product
  As a user,
  I want to update product data,
  So that I can modify product information.

  Scenario: PUT - Update Product with Valid Endpoint
    Given the user sets a valid PUT endpoint product
    When the user sends a PUT HTTP request body
    Then the user receives an HTTP response code 200 OK

  @NegativeScenario
  Scenario: PUT - Update User with Invalid Endpoint
    Given the user sets an invalid PUT endpoint product
    When the user sends a PUT HTTP request with an invalid endpoint product
    Then the user receives an HTTP response code 404