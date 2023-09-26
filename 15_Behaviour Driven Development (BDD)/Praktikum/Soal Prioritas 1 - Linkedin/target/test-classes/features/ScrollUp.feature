Feature: ScrollUp

  As a Linkedin user
  I want to scroll up to the newest posts
  So that I can see newest posts that i want

  Background:
    Given I am on the LinkedIn homepage

  Scenario: As a User I can Scroll Up to the newest Posts
    When I see the button new post
    And I click the button new post
    Then I redirect to the newest post