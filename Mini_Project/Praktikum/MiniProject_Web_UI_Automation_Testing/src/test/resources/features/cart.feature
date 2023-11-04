Feature: Cart
  As a user
  I want to see product in cart
  so that i can buy it

  @TCC4.1
  Scenario: As a user i want to add quantity of product but not login
    Given I am already on product page
    And I click beli button
    And I click cart button
    And I on cart page
    When I click plus icon
    Then I see quantity of product increases successfully

  @TCC4.2
  Scenario: As a user i want to substract quantity of product but not login
    Given I am already on product page
    And I click beli button
    And I click cart button
    And I on cart page
    And I click plus icon
    When I click min icon
    Then I see quantity of product reduces successfully

  @TCC4.3
  Scenario: As a user i want to remove product form cart but not login
    Given I am already on product page
    And I click beli button
    And I click cart button
    And I on cart page
    When I click min icon
    Then I see "Order Is Empty!"

  @TCC4.4
  Scenario: As a user i want to checkout product but not login
    Given I am already on product page
    And I click beli button
    And I click cart button
    And I on cart page
    When I click bayar button
    Then I am on the login page

  @TCC4.5
  Scenario: As a user i want to add quantity of product
    Given I am already login
    And I am on the product page
    And I click beli button
    And I click cart button
    And I on cart page
    When I click plus icon
    Then I see quantity of product increases successfully

  @TCC4.6
  Scenario: As a user i want to substract quantity of product
    Given I am already login
    And I am on the product page
    And I click beli button
    And I click cart button
    And I on cart page
    And I click plus icon
    When I click min icon
    Then I see quantity of product reduces successfully

  @TCC4.7
  Scenario: As a user i want to remove product form cart
    Given I am already login
    And I am on the product page
    And I click beli button
    And I click cart button
    And I on cart page
    When I click min icon
    Then I see "Order Is Empty!"

  @TCC4.8
  Scenario: As a user i want to checkout product
    Given I am already login
    And I am on the product page
    And I click beli button
    And I click cart button
    And I on cart page
    When I click bayar button
    Then I am on the transactions page