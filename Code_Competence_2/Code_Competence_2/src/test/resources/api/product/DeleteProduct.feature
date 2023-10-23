Feature: DELETE - A Product
  As a user
  I want to see list of product
  So that i can delete a product

  Scenario: DELETE - as a user I want to delete a product with a valid endpoint
    Given the user has a valid endpoint to delete
    When the user sends a DELETE HTTP request with a valid endpoint
    Then the user receives a DELETE HTTP response code 200 with a valid endpoint

  @NegativeScenario
  Scenario: DELETE - as a user I want to delete a product with an invalid endpoint
    Given the user has an invalid endpoint to delete
    When the user sends a DELETE HTTP request with an invalid endpoint
    Then the user receives a DELETE HTTP response code 404 with an invalid endpoint
