Feature: Google search functionality
  User Story: As a user, when I am on the google search page
  I should be able to search whatever I want and see relevant information

  Scenario: Search functionality result finding verification
    Given user is on Google search page
    When user types apple in the google search box and clicks enter
    Then user sees apple – Google Search is in the google title