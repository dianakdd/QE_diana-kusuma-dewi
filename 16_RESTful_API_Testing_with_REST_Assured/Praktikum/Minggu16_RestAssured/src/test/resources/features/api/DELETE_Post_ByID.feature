Feature: DELETE - post By ID For user

  @DPB-017
  Scenario: As a user i want to delete post by ID with valid endpoint
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set valid DELETE post by ID endpoint
    And user send DELETE HTTP request with valid endpoint for post by ID
    Then user received valid DELETE HTTP response code 200 for post by ID

  @DPB-018
  Scenario: As a user i want to delete post by ID with invalid endpoint
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set invalid DELETE post by ID endpoint
    And user send DELETE HTTP request with invalid endpoint for post by ID
    Then user received DELETE HTTP response code 404 for post by ID

  @DPB-019
  Scenario: As a user i want to delete post by ID with invalid method
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set valid DELETE post by ID endpoint
    And user send DELETE HTTP request with invalid method for post by ID
    Then user received DELETE HTTP response code 404 for post by ID

  @DPB-021
  Scenario: As a user i want to delete post by ID with invalid ID
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set invalid ID DELETE post by ID endpoint
    And user send DELETE HTTP request with invalid ID for post by ID
    Then user received valid DELETE HTTP response code 200 for post by ID