Feature: POST - Create New Post For user

  @PCP004
  Scenario: As a user i want to create new post with valid endpoint
    Given user set authentication endpoint
    When user set valid POST new post endpoint
    And user send POST HTTP request with valid endpoint for new post
    Then user received valid POST HTTP response code 201 for new post

  @PCP005
  Scenario: As a user i want to create new post with invalid endpoint
    Given user set authentication endpoint
    When user set invalid POST new post endpoint
    And user send POST HTTP request with invalid endpoint for new post
    Then user received POST HTTP response code 201 for new post

  @PCP006
  Scenario: As a user i want to create new post with empty request body
    Given user set authentication endpoint
    When user set valid POST new post endpoint
    And user send POST HTTP request with empty request body for new post
    Then user received POST HTTP response code 404 Bad Request for new post

  @PCP007
  Scenario: As a user i want to create new post with invalid request body
    Given user set authentication endpoint
    When user set valid POST new post endpoint
    And user send POST HTTP request with invalid request body for new post
    Then user received POST HTTP response code 201 invalid req body for new post

