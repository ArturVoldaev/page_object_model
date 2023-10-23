package com.uitap.pages.nonBreakingSpace;

import com.uitap.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NonBreakingSpacePage extends BasePage {
    public NonBreakingSpacePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='My Button']")
    WebElement buttonNbsp;

    public String clickOnNonBreakingButton() {
        return buttonNbsp.getText();
    }
}
