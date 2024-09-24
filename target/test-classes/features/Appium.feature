Feature: Validate Different Options

  @appium
  Scenario: Validate Custom view
    Given I open the application
    When I tap on Accessibility
    Then I validate the Custom view

  @appium
  Scenario Outline: Validate Custom view
    Given I open the application
    When I tap on Accessibility
    Then I validate the Custom view