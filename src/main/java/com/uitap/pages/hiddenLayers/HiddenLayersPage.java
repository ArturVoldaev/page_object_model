package com.uitap.pages.hiddenLayers;

import com.uitap.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HiddenLayersPage extends BasePage {
    public HiddenLayersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "greenButton")
    WebElement greenButton;

    public HiddenLayersPage clickOnGreenButton() {
        clickOnElement(greenButton);
        return this;
    }

    @FindBy(id = "blueButton")
    WebElement blueButton;

    public HiddenLayersPage clickOnBlueButton() {
        clickOnElement(blueButton);
        return this;
    }
}
