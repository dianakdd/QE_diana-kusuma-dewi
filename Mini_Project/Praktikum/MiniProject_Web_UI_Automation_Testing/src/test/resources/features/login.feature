Feature: Login
  As a user
  I want to login
  So that I can access products page

  Background:
    Given I am on the login page

  @TCL2.1
  Scenario: As a user I can login with valid credentials
    When I input valid email
    And I input valid password
    And I click login button
    Then I am on the product page

  @TCL2.2
  Scenario: As a user i failed login with input valid email and empty password
    When I input valid email
    And I input empty password
    And I click login button
    Then I got error message "password is required"

  @TCL2.3
  Scenario: As a user i failed login with input empty email and valid password
    When I input empty email
    And I input valid password
    And I click login button
    Then I got error message "email is required"

  @TCL2.4
  Scenario: As a user i failed login with input empty email and empty password
    When I input empty email
    And I input empty password
    And I click login button
    Then I got error message "email is required"

  @TCL2.5
  Scenario: As a user i failed login with input invalid email and valid password
    When I input invalid email
    And I input valid password
    And I click login button
    Then I got error message "record not found"

  @TCL2.6
  Scenario: As a user i failed login with input valid email and invalid password
    When I input valid email
    And I input invalid password
    And I click login button
    Then I got error message "email or password is invalid"

  @TCL2.7
  Scenario: As a user i failed login with input invalid email and invalid password
    When I input invalid email
    And I input invalid password
    And I click login button
    Then I got error message "record not found"