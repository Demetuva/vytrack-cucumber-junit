package com.vytrack.step_definitions;

import com.vytrack.pages.CheckGridSettingsOnTheRightPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.vytrack.utilities.BrowserUtils.verifyTitle2;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class CheckGridSettingsOnTheRight {

    CheckGridSettingsOnTheRightPage checkGridSettingsOnTheRight = new CheckGridSettingsOnTheRightPage();

    @Then("user is on the Vehicles page")
    public void userIsOnTheVehiclesPage(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(titleIs("Car - Entities - System - Car - Entities - System"));
    }

    @Given("user navigate to the Grid Settings button")
    public void userNavigateToTheGridSettingsButton() {
        BrowserUtils.hoverOver(checkGridSettingsOnTheRight.GridSettingsBtn);
    }

    @And("user clicks on Grid Settings button")
    public void userClicksOnGridSettingsButton() {
        BrowserUtils.waitForVisibilityOf(checkGridSettingsOnTheRight.GridSettingsMenu);
        checkGridSettingsOnTheRight.GridSettingsBtn.click();
    }

    @Then("user get Quick Search and checked boxes menu")
    public void userGetQuickSearchAndCheckedBoxesMenu() {
        BrowserUtils.waitForVisibilityOf(checkGridSettingsOnTheRight.GridSettingsMenu);
        checkGridSettingsOnTheRight.GridSettingsMenu.isDisplayed();
    }
}
