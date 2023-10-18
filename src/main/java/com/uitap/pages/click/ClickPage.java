package com.uitap.pages.click;

import com.uitap.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ClickPage extends BasePage {
    public ClickPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id= "badButton")
    WebElement badButton;

    public ClickPage clickButtonWithIgnoreDOM() {
        clickOnElement(badButton);
        Assert.assertTrue(badButton.getAttribute("class").contains("btn-success"));
        return this;
    }
}
