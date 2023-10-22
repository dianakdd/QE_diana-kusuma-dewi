Feature: Pilih Produk
  As a user
  I want to choose product
  So that I can pay the item

  Background:
    Given I am on the login page
    When I input valid username
    And I input valid password
    And I click login button

  Scenario: As a user I can choose product with Valid data
    Given I am on the home page
    When I choose the product
    And I input valid phone number
    Then I choose nominal price product detail

  @NegativeScenario
  Scenario: As a user I can choose product with Invalid data
    Given I am on the home page
    When I choose the product
    And I input invalid phone number
    Then I can not go to the payment method

  @NegativeScenario
  Scenario: As a user I can choose product with data more than 13 digits number
    Given I am on the home page
    When I choose the product
    And I input more than 13 digits phone number
    Then I got error message after input more than 13 digits "Nomor handphonenya kelebihan. Maksimal 13 digit ya."