package com.uitap.pages.loadDelay;

import com.uitap.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoadDelayPage extends BasePage {
    public LoadDelayPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[.='Button Appearing After Delay']")
    WebElement buttonAfterDelayLoad;


    public void clickOnButtonAfterDelay() {
        clickOnElement(buttonAfterDelayLoad);
    }
}
