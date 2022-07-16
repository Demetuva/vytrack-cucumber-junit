package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("User are on the login page")
    public void user_are_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack"));
    }

    @When("user enters valid {string} and valid {string}")
    public void user_enters_valid_and_valid(String username, String password) {
        loginPage.username.sendKeys(username+ Keys.ENTER);
        loginPage.password.sendKeys(password);
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
