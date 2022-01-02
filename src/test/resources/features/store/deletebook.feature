@DeleteBook
Feature: Delete A Book
  As a demoqa user
  I want to delete a book on my list book

  Scenario: Delete A Book Successful
    Given I am on the login bookstore
    When I enter my username and password correctly for delete book
    And I click Login button to delete book
    Then I click delete book button
    And I success to delete a book