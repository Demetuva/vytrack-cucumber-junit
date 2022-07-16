package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckGridSettingsOnTheRightPage {
    public CheckGridSettingsOnTheRightPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='grid-custom-entity-grid-53751541']/div[2]/div[1]/div/div[3]/div[1]/div/div/a")
    public WebElement GridSettingsBtn;


    @FindBy(xpath = "//*[@id='grid-custom-entity-grid-53751541']/div[2]/div[1]/div/div[3]/div[1]/div/div/div/div[1]")
    public WebElement GridSettingsMenu;
}