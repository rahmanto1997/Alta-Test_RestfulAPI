@DeleteAllBook
Feature: Delete All Book
  As a demoqa user
  I want to delete all my list book

  Scenario: Delete All Book Succsessful
    Given I am on the demoqa page
    When I enter my username and password correctly for delete all book
    And I click Login button to delete all book
    Then I click delete all book button
    And I success to delete all my list book