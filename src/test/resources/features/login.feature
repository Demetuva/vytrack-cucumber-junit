@wip
Feature: Login to Vytrack application
  Agile Story: As a user, I should be able to login to the app


  Scenario Outline: Login to homepage
    Given User are on the login page
    When user enters valid "<username>" and valid "<password>"
    And user clicks on the login button
    Then User should be able to see "Dashboard" in the title

    Examples: username and password I want to enter as a user
      | username | password    |
      | user4    | UserUser123 |

