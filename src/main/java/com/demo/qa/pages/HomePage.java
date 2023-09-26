package com.demo.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }


    //@FindBy(xpath = "//span[.='Elements']")
    @FindBy(xpath = "//h5[.='Elements']")
    WebElement elements;

    public HomePage getElements() {
       clickOnElementWithJS(elements, 0, 400);
        return this;
    }

    @FindBy(xpath = "//span[.='Forms']")
    WebElement forms;

    public HomePage getForms() {
        clickOnElement(elements);
        return this;
    }

    @FindBy(xpath = "//div[.='Alerts, Frame & Windows']//span")
    WebElement AlertsFrameWindows;

    public HomePage getAlertsFrameWindows() {
        clickOnElement(elements);
        return this;
    }




}
