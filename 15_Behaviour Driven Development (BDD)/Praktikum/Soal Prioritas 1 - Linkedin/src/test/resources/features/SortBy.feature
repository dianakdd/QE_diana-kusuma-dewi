Feature: SortBy

  As a Linkedin user
  I want to sort a posts
  So that I can see sorted posts that i want

  Background:
    Given I am on the LinkedIn homepage

  Scenario: As a User I can Sort a Posts by the newest
    When I click the Sort area feature
    And I select the sort type
    And I choose sorted by newest
    Then I redirect to the top of newest post

  Scenario: As a User I can Sort a Posts by the most popular
    When I click the Sort area feature
    And I select the sort type
    And I choose sorted by most popular
    Then I redirect to the top of most popular post