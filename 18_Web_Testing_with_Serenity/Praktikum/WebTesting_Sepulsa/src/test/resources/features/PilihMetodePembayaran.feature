Feature: Pilih Metode Pembayaran
  As a user
  I want to choose payment method
  So that I can buy the item

  Background:
    Given I am on the login page
    When I input valid username
    And I input valid password
    And I click login button
    And I choose the product
    And I input valid phone number

  Scenario: As a user I can payment with valid method payment
    Given I choose nominal price product detail
    When I am on the payment method page
    And I click another payment method text
    And I choose payment via Gopay
    Then I can continue to payment

  @NegativeScenario
  Scenario: As a user I can not payment before choosing valid method payment
    Given I choose nominal price product detail
    When I am on the payment method page
    And I click another payment method text
    And I click continue to payment
    Then I got error message after click continue before choosing payment "Kamu belum memilih metode pembayaran"
