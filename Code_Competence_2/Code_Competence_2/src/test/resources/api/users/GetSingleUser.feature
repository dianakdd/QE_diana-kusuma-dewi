Feature: GET - Product by ID
As a user
I want to see list of users
So that i can see users by ID

Scenario: GET - As a user i want to get users by ID with valid endpoint
  Given user set GET valid endpoint for users by ID
  When user send GET HTTP request with valid endpoint for users by ID
  Then user received valid GET HTTP response code 200 for users by ID

@NegativeScenario
Scenario: GET - As a user i want to get users by ID with invalid endpoint
  Given user set GET invalid endpoint for users by ID
  When user send GET HTTP request with invalid endpoint for users by ID
  Then user received GET HTTP response code 404 for users by ID

