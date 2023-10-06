Feature: GET - Post by ID as a user

  @GPB008
  Scenario: As a user i want to get post by ID with valid endpoint
    Given user set valid GET post by ID endpoint
    When user send GET HTTP request with valid endpoint for post by ID
    Then user received valid GET HTTP response code 200 for post by ID

  @GPB009
  Scenario: As a user i want to get post by ID with invalid endpoint
    Given user set invalid GET post by ID endpoint
    When user send GET HTTP request with invalid endpoint for post by ID
    Then user received GET HTTP response code 404 for post by ID

  @GPB010
  Scenario: As a user i want to get post by ID with invalid method
    Given user set valid GET post by ID endpoint
    When user send GET HTTP request with invalid method for post by ID
    Then user received GET HTTP response code 405 Method Not Allowed for post by ID

  @GPB011
  Scenario: As a user i want to get post by ID with invalid ID
    Given user set valid GET post by ID endpoint with invalid ID
    When user send GET HTTP request with invalid ID for post by ID
    Then user received valid GET HTTP response code 200 for post by ID