Feature: DELETE - Carts
  As a user
  I want to delete a cart
  So that I can remove unwanted carts

  Scenario: DELETE - As a user I want to delete a cart with a valid endpoint
    Given user sets a DELETE valid endpoint for deleting a cart
    When user sends a DELETE HTTP request with a valid endpoint to delete a cart
    Then user receives a DELETE HTTP response code 200 for deleting a cart with a valid endpoint

  @NegativeScenario
  Scenario: DELETE - As a user I want to delete a cart with an invalid endpoint
    Given user sets a DELETE endpoint with an invalid endpoint for deleting a cart
    When user sends a DELETE HTTP request with an invalid endpoint to delete a cart
    Then user receives a DELETE HTTP response code 404 for deleting a cart with an invalid endpoint
