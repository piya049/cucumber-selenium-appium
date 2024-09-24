Feature: Test Background Keyword

  Background: 
    Given I open a browser
    When I navigate to google page

  Scenario: Validate Google search text field
    Then I validate the search text field

  Scenario: Validate Gmail link
    Then I validate the gmail link

  Scenario: Validate Image link
    Then I validate the image link
