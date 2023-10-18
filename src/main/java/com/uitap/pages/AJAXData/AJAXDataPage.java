package com.uitap.pages.AJAXData;

import com.uitap.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AJAXDataPage extends BasePage {
    public AJAXDataPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "ajaxButton")
    WebElement ajaxButton;

    @FindBy(css = ".bg-success")
    WebElement content;

    public AJAXDataPage clickOnButtonAJAXData() {
        clickOnElement(ajaxButton);
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        clickOnElement(content);
        Assert.assertTrue(wait.until(d -> content.isDisplayed()));
        return this;
    }
}
