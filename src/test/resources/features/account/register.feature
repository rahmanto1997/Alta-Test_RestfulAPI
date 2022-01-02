@Register
Feature: Register
  As a Linkedin user
  I want to register account
  So that I can login with that account

  Scenario: Register Success
    Given I am on the register page
    When I input my valid username and password
    And I click register button
    Then I am redirected to the profile

  Scenario: Register Failed
    Given I am on the register page
    When I entered a registered account
    And I click register button when account exist
    Then I am failed to registered account and show message that user exist

