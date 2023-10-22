Feature: Login
  As a user
  I want to login
  So that I can access products page

  Background:
    Given I am on the login page

  Scenario: As a user I can login with valid credentials
    When I input valid username
    And I input valid password
    And I click login button
    Then I am on the inventory page

  @NegativeScenario
  Scenario: As a locked user I cannot access products page
    When I input locked username
    And I input valid password
    And I click login button
    Then I got error message "Epic sadface: Sorry, this user has been locked out."
