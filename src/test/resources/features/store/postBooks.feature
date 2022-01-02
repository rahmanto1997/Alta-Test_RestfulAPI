@Post
Feature: Bookstore
  As a demoqa user
  I want to see bookstore
  So that I can grab a book i want to read

  Scenario: Post Books
    Given I am on the login pages bookstore
    When I enter my userId and isbn
    And I click Post books
    Then I succes to Post books