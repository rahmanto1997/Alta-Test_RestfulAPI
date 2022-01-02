@Get
Feature: Bookstore
  As a demoqa user
  I want to see bookstore
  So that I can grab a book i want to read

  Scenario: Get List Books Information
    Given I am on the login bookstore page
    When I enter my username and password correctly for get list book
    And I click Show List button
    Then I got list of All Books