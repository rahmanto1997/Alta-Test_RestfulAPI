Feature: Login
  As a Bookstore Web API
  I want to see my timeline
  So that I can like or comment my friend post

  Scenario: Login Success
    Given I am on the login page
    When I enter my username and password correctly
    And I click 'Login' button
    Then I am taken to the timeline