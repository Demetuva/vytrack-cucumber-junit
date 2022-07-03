@all
Feature: Click Export Grid dropdown
  User Story: As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown, Refresh, Reset and
  Grid Settings Buttons

Background: User login successfully
  Given user loginned successfully with "user4" "UserUser123"


   Scenario: Click Export Grid dropdown
   Given user is on the home page
   When user hovers over on Fleet Module
    And user clicks on Vehicles button
    Then user clicks on Export Grid dropdown button

