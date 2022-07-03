package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("User are on the login page")
    public void user_are_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack"));
    }

    @When("user enters valid username")
    public void user_enters_valid_as_username() {
        loginPage.username.sendKeys("user4");
    }

    @When("user enters valid password")
    public void user_enters_valid() {
        loginPage.password.sendKeys("UserUser123");
    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        loginPage.loginBtn.click();
    }

    @Then("User should be able to see \"Dashboard\" in the title")
    public void user_should_be_able_to_see_in_the_title() {
        Driver.getDriver().getTitle();
    }
}
