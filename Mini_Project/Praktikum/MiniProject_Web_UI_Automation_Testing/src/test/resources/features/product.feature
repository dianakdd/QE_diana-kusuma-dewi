Feature: Product
  As a user
  I want to see product
  so that i can order product

  @TCP3.1
  Scenario: As a user i want to see detail product but not login
    Given I am already on product page
    When I click detail button
    Then I see detail product successfully

  @TCP3.2
  Scenario: As a user i want add product to cart but not login
    Given I am already on product page
    When I click beli button
    And I click cart button
    Then I see product in cart

  @TCP3.3
  Scenario: As a user i want to see detail product
    Given I am already login
    And I am on the product page
    When I click detail button
    Then I see detail product successfully

  @TCP3.4
  Scenario: As a user i want add product to cart
    Given I am already login
    And I am on the product page
    When I click beli button
    And I click cart button
    Then I see product in cart