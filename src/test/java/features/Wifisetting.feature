Feature: Set the wifi name

  @wifi
  Scenario: Validate Wifi settings
    Given I open the new application
    When I tap on Preference
    Then I tap on the Preference dependencies
    Then I need to check the checkbox to see the wifi settings
    Then I Validate wifi settings
    Then I tap on wifi settings
    Then I set the name