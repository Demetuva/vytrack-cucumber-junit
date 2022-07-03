package com.vytrack.step_definitions;

import com.vytrack.pages.ClickExportGridPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickExportGridSteps {

    ClickExportGridPage clickPage = new ClickExportGridPage();
    LoginPage loginPage = new LoginPage();

    @Given("user loginned successfully with {string} {string}")
    public void userLoginnedSuccessfullyWith(String username, String pass) {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack"));
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(pass);
        loginPage.loginBtn.click();
    }

    @Given("user is on the home page")
    public void user_on_the_homePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrackHome"));
    }

    @When("user hovers over on Fleet Module")
    public void user_hovers_over_on_fleet_module() {

        BrowserUtils.waitForVisibilityOf(clickPage.fleetBtn);
        BrowserUtils.hoverOver(clickPage.fleetBtn);

    }

    @When("user clicks on Vehicles button")
    public void user_clicks_on_vehicles_button() {

        BrowserUtils.waitForVisibilityOf(clickPage.vehiclesBtn);
        clickPage.vehiclesBtn.click();

    }

    @Then("user clicks on Export Grid dropdown button")
    public void user_clicks_on_export_grid_dropdown_button() {

        BrowserUtils.waitForVisibilityOf(clickPage.dropDownBtn);
        clickPage.dropDownBtn.click();
    }

}
