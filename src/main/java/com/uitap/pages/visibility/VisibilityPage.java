package com.uitap.pages.visibility;

import com.uitap.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VisibilityPage extends BasePage {
    public VisibilityPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "removedButton")
    WebElement removedButton;

    @FindBy(id = "hideButton")
    WebElement hideButton;

    public VisibilityPage clickOnHideButton() {
        clickOnElement(hideButton);
        return this;
    }


    public Boolean checkVisibilityRemovedButton() {
        if (removedButton.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
}
