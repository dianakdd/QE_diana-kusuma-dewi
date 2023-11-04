Feature: Profile
As a user
i want to see my transactions
so that i can logout

  @TCPR5.1
  Scenario: As a user i want to see my transactions
    Given I am already login
    And I am on the product page
    When I click profile icon
    And I click transaksi button
    Then I see the transactions

  @TCPR5.2
  Scenario: As a user i want to logout
    Given I am already login
    And I am on the product page
    When I click profile icon
    And I click logout icon
    Then I am on the login page