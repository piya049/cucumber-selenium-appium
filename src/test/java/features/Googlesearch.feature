Feature: Google Search

  @SmokeTest
  Scenario Outline: Validate Google search feature
    Given I open a browser
    When I navigate to google page
    And I enter "<searchText>" in search keyword
    Then I tap on search

    Examples: 
      | searchText              |
      | Piyush Shende           |
      | Piyush Shende Developer |
