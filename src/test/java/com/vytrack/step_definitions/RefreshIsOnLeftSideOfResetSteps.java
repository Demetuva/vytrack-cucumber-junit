package com.vytrack.step_definitions;

import com.vytrack.pages.ClickExportGridPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.cs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RefreshIsOnLeftSideOfResetSteps {
    LoginPage loginPage = new LoginPage();
    ClickExportGridPage clickExportGridPage = new ClickExportGridPage();
    BrowserUtils browserUtils = new BrowserUtils();

    @Given("user logged in successfully")
    public void user_logged_in_successfully() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack"));
        loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));


    }

    @When("user clicks on vehicles on FLEET module")
    public void user_clicks_on_vehicles_on_fleet_module() {
        BrowserUtils.waitForVisibilityOf(clickExportGridPage.fleetBtn);
        BrowserUtils.hoverOver(clickExportGridPage.fleetBtn);
        clickExportGridPage.vehiclesBtn.click();


    }

    @Then("user see refresh button is on left side of Reset")
    public void user_see_refresh_button_is_on_left_side_of_reset() throws InterruptedException {
        BrowserUtils.waitForVisibilityOf(clickExportGridPage.resetBtn);
        BrowserUtils.hoverOver(clickExportGridPage.resetBtn);
        Thread.sleep(3000);
        for (int x = 1; x < 5000; x++) {
            browserUtils.js.executeScript("window.scrollBy("+x+", 0)");
            if (browserUtils.seeRefreshBtn()) {
                System.out.println(x);
                break;
            }
                Assert.assertTrue(browserUtils.seeRefreshBtn());

            }


        }
    }

