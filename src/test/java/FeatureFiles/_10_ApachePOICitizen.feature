Feature: ApachePOI Citizen Functionality
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to CitizenShip Page

    Scenario: Create and Delete CitizenShip from Excel
      When User Create citizenship with ApachePOI
      Then User Delete citizenship with ApachePOI