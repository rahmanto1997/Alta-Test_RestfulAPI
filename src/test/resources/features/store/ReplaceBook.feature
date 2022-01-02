@PutBook
Feature: Bookstore
  As a demoqa user
  I want to edit list a book on my wishlist read
  So that I can read it later

  Scenario: Replace a Book
    Given I am on the put book bookstore page
    When I enter my username and password correctly for put a book
    And I login first
    And I click edit book button
    Then I suceed to edit a book on my profile
    And I check the book