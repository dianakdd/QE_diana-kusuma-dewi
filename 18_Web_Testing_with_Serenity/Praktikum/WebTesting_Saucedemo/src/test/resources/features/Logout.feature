Feature: Logout
  As a user
  I want to logout
  So that I can logout my activity from the browser

  Background:
    Given I am on the login page
    When I input valid username
    And I input valid password
    And I click login button

  Scenario: As a user I can logout my account
    Given I am on the inventory page
    When I click burger button
    And I click logout sidebar
    Then I am on the login page