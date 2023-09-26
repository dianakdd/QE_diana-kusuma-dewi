Feature: CreatePost

  As a Linkedin user
  I want to create all type of posts
  So that I can post that what i like

  Background:
    Given I am on the LinkedIn homepage

  Scenario: As a User I can create a Text Post
    When I click the Create Post button
    And I select Text as the post type
    And I enter the text Hello, LinkedIn! in the post content
    And I click the Post button
    And I click the confirmation button to publish it
    Then I redirect to the post of published text post

  Scenario: As a User I can Post Photos
    When I click the Create Post button
    And I select Photo as the post type
    And I attach a photo to the post
    And I add captions to the photo post
    And I click the confirmation button to publish it
    Then I redirect to the post of published photo post

  Scenario: As a User I can Post Video
    When I click the Create Post button
    And I select Video as the post type
    And I upload a video file
    And I add captions to the video post
    And I click the confirmation button to publish it
    Then I redirect to the post of published video post

  Scenario: As a User I can Create a Article Post
    When I click the Create Post button
    And I select Article as the post type
    And I enter the article title
    And I write the article content
    And I click the next button within the article editor
    And I click the confirmation button to publish it
    Then I redirect to the post of published article post

  Scenario: As a User I can Create a Program Post
    When I click the Create program button
    And I select the program type
    And I select the program format
    And I write the program title
    And I select the program zone
    And I choose the program started date
    And I choose the program started time
    And I click checkbox for add ended date and time
    And I choose the program ended date
    And I choose the program ended time
    And I write the description program
    And I tag a spokesman
    And I click the next button
    And I click the confirmation button to publish it
    Then I redirect to the post of published program post

