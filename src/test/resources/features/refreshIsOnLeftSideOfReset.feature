Feature: Refresh button should be on the left side of Reset button

  User Story: As a user when I am on VYtrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown, Refresh, Reset and
  Grid Settings Buttons
@mas
  Scenario: Refresh button is on the left side of Reset button
    Given user logged in successfully
    When user clicks on vehicles on FLEET module
    Then user see refresh button is on left side of Reset