Feature: Checkout
  As a user
  I want to checkout my item
  So that I can buy the item

  Background:
    Given I am on the login page
    When I input valid username
    And I input valid password
    And I click login button
    And I am on the inventory page
    And I add item to the cart

  Scenario: As a user I can checkout my item
    Given Item is added to the cart
    When I click shopping cart icon
    And I click button checkout
    And I input valid first name
    And I input valid last name
    And I input valid postal code
    And I click button continue
    And I click button finish
    Then Item is already checked out