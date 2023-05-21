Feature: Country Functionality

  @SmokeTest
  Scenario: Create a Country
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to Country Page
    When Create a Country
    Then Success message should be displayed