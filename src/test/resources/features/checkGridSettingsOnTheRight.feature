@Vick
Feature: AC8 Grid Setting button is on the right of the page
  User Story: As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown, Refresh, Reset and
  Grid Settings Buttons

  Background: User login successfully
    Given user loginned successfully with "user4" "UserUser123"
    When user hovers over on Fleet Module
    And user clicks on Vehicles button
    Then user is on the Vehicles page

  Scenario: Grid Setting button is on the right of the Vehicles page
    Given user navigate to the Grid Settings button
    When user clicks on Grid Settings button
    Then user get Quick Search and checked boxes menu

