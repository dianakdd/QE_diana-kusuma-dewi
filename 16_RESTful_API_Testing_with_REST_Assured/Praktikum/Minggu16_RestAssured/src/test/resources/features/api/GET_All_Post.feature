Feature: GET - All Post as a user

  @GAP001
  Scenario: As a user i want to get all Post with valid endpoint
    Given user set valid GET all Post endpoint
    When user send GET HTTP request with valid endpoint for all Post
    Then user received valid GET HTTP response code 200 for all Post

  @GAP002
  Scenario: As a user i want to get all Post with invalid endpoint
    Given user set invalid GET all Post endpoint
    When user send GET HTTP request with invalid endpoint for all Post
    Then user received GET HTTP response code 404 for all Post

  @GAP003
  Scenario: As a user i want to get all Post with invalid method
    Given user set valid GET all Post endpoint
    When user send GET HTTP request with invalid method for all Post
    Then user received GET HTTP response code 500 Method Not Allowed for all Post
