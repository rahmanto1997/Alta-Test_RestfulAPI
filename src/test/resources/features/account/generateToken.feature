@generatetoken
Feature: Generate Token
  As a demoqa user
  I want to generate my token
  So that I can login

  Scenario: Generate Token Successful
    Given I am on the login page
    When I input username and password base on register account
    And I click generate button
    Then I got the token