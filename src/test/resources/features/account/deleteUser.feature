@Delete
Feature: Delete User
  As a Linkedin user
  I want to delete my account

  Scenario: Delete User Succsesful
    Given I am on the web page
    When I enter my username and password correctly for delete
    And I click Login button
    Then I click delete button
    And I success to delete my account
