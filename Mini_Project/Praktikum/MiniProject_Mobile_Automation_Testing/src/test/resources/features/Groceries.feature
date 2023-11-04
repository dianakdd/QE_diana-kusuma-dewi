Feature: As an User, I want to add item, So that I can see list of all groceris

  Scenario: User input empty name, valid quantity, and valid category
    Given user on the groceries page
    When user click add icon
    And user on the add item page
    And user input empty name
    And user click add item button
    Then user see error "Must be between 1 and 50 characters." message