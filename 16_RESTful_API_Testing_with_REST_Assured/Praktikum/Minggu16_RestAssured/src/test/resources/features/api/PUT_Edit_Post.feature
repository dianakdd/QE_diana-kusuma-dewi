Feature: PUT - Edit Post By ID For User

  @PUP012
  Scenario: As a user i want to edit post by ID with valid endpoint
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set valid PUT post by ID endpoint
    And user send PUT HTTP request with valid endpoint for edit post by ID
    Then user received valid PUT HTTP response code 200 for edit post by ID

  @PUP013
  Scenario: As a user i want to edit post by ID with invalid endpoint
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set invalid PUT post by ID endpoint
    And user send PUT HTTP request with invalid endpoint for edit post by ID
    Then user received PUT HTTP response code 404 for edit post by ID

  @PUP014
  Scenario: As a user i want to edit post by ID with invalid method
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set valid PUT post by ID endpoint
    And user send PUT HTTP request with invalid method for edit post by ID
    Then user received PUT HTTP response code 200 for edit post by ID

  @PUP015
  Scenario: As a user i want to edit post by ID with invalid ID
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set invalid ID PUT post by ID endpoint
    And user send PUT HTTP request with invalid ID for edit post by ID
    Then user received valid PUT HTTP response code 200 for edit post by ID

  @PUP016
  Scenario: As a user i want to edit post by ID with empty request body
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set valid PUT post by ID endpoint
    And user send PUT HTTP request with empty request body for edit post by ID
    Then user received valid PUT HTTP response code 200 for edit post by ID