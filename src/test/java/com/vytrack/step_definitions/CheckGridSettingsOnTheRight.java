package com.vytrack.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.vytrack.utilities.BrowserUtils.verifyTitle2;

public class CheckGridSettingsOnTheRight {

    CheckGridSettingsOnTheRight checkGridSettingsOnTheRight = new CheckGridSettingsOnTheRight();
    @Given("user is on the Vehicles page")
    public void userIsOnTheVehiclesPage() {
        verifyTitle2("Car-Entities-System-Car-Entities-System");
    }

    @When("user navigate to the Grid Settings button")
    public void userNavigateToTheGridSettingsButton() {
    }

    @And("user clicks on Grid Settings button")
    public void userClicksOnGridSettingsButton() {
    }

    @Then("user get Quick Search and checked boxes menu")
    public void userGetQuickSearchAndCheckedBoxesMenu() {
    }
}
