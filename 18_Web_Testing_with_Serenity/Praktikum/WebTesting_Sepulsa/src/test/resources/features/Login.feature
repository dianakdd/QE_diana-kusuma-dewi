Feature: Login
  As a user
  I want to login
  So that I can access all feature of sepulsa

  Background:
    Given I am on the login page

  Scenario: As a user I can login with valid credentials
    When I input valid username
    And I input valid password
    And I click login button
    Then I am on the home page

  @NegativeScenario
  Scenario: As a user I can login with invalid credentials
    When I input invalid username
    And I input invalid password
    And I click login button
    Then I got error message "Coba ingat-ingat lagi alamat e-mail/ nomor handphone dan password kamu. Masih ada yang salah nih."