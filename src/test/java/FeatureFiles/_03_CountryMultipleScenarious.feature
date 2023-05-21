Feature: Country Multi Scenario
#Background->before senaryo gibi
  Background:Before Scenario
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to Country Page

  Scenario: Create country

    When Create a Country
    Then Success message should be displayed

  Scenario: Create a country 2
 #Burdaki cift tirnaklarin icinde yazilanlar parametre gibidirler
    When Create a Country name as "isThisCountDust2" code as "is7355608"
    Then Success message should be displayed