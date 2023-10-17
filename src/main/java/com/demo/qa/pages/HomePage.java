package com.demo.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//h5[.='Elements']")
    WebElement elements;

    @FindBy(xpath = "//h5[.='Book Store Application']")
    WebElement bookStoreApplication;

    public HomePage getElements() {
       clickOnElementWithJS(elements, 0, 400);
        return this;
    }

    public HomePage getBookStore() {
        clickOnElementWithJS(bookStoreApplication, 0, 400);
        return this;
    }


    @FindBy(xpath = "//span[.='Forms']")
    WebElement forms;

    public HomePage getForms() {
        clickOnElement(elements);
        return this;
    }

    @FindBy(xpath = "//h5[.='Alerts, Frame & Windows']")
    WebElement AlertsFrameWindows;


    public HomePage getAlertsFrameWindows() {
        clickOnElement(AlertsFrameWindows);
        return this;
    }


    @FindBy(xpath = "//h5[.='Widgets']")
    WebElement widgets;
    public void getWidgets() {
        clickOnElement(widgets);
    }

    @FindBy(xpath = "//h5[.='Interactions']")
    WebElement interaction;
    public void getInteraction() {
        clickOnElement(interaction);
    }

    public static class UploadTest {
    }

//    @FindBy(xpath = "//h5[.='Forms']")
//    WebElement forms;
//    public void getPageForms() {
//        clickOnElement(forms);
//    }
}
