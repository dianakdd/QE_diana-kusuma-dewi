Feature: ReactionPost

  As a Linkedin user
  I want to like, comment and reposted posts
  So that I can Interactions with another people

  Background:
    Given I am on the LinkedIn homepage

  Scenario: As a User I can like Posts
    When I see the post that i like
    And I click icon like in that posts
    Then the posts successfully liked

  Scenario: As a User I can comment Posts
    When I see the post that i want to add a comment
    And I click icon comment in that posts
    And I write the comment
    And I click button post
    Then the comment has been added successfully

  Scenario: As a User I can reposted the Posts with add my opinion
    When I see the post that i want to repost it
    And I click icon repost in that posts
    And I select repost with my thought
    And I write I Agree about this one
    And I click button post
    Then the repost post has been reposted

  Scenario: As a User I can reposted the Posts with instant repost
    When I see the post that i want to repost it
    And I click icon repost in that posts
    And I select repost with instant
    Then the repost post has been reposted successfully