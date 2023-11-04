Feature: Register
  As a user
  i want to register
  so that i can see login page

  Background:
    Given I am on the register page

  @TCR1.1
  Scenario: As a user i success register with input valid fullname, valid email, and valid password
    When I input valid fullname for register
    And I input valid email for register
    And I input valid password for register
    And I click register button
    Then I am on the login page

  @TCR1.2
  Scenario: As a user i failed register with input valid fullname, empty email, and valid password
    When I input valid fullname for register
    And I input empty email for register
    And I input valid password for register
    And I click register button
    Then I got error message register ""

  @TCR1.3
  Scenario: As a user i failed register with input valid fullname, valid email, and empty password
    When I input valid fullname for register
    And I input valid email for register
    And I input empty password for register
    And I click register button
    Then I got error message register ""

  @TCR1.4
  Scenario: As a user i failed register with input empty fullname, valid email, and valid password
    When I input empty fullname for register
    And I input valid email for register
    And I input valid password for register
    And I click register button
    Then I got error message register ""

  @TCR1.5
  Scenario: As a user i failed register with input empty all fields
    When I input empty fullname for register
    And I input empty email for register
    And I input empty password for register
    And I click register button
    Then I got error message register ""

  @TCR1.6
  Scenario: As a user i failed register with input fullname, email, and password that have been registered
    When I input fullname for register
    And I input email for register
    And I input password for register
    And I click register button
    Then I got error message register ""