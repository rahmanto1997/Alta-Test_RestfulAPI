@GetABook
Feature: Bookstore
  As a demoqa user
  I want to see a book by isbn
  So that I can get information about that book

  Scenario: Get A Book Information
    Given I am on the  bookstore page
    When I enter my username and password correctly for get a book
    And I click Show  button
    Then I got information about the Book