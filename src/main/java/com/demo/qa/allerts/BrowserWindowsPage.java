package com.demo.qa.allerts;

import com.demo.qa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class BrowserWindowsPage extends BasePage {
    public BrowserWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "tabButton")
    WebElement newTab;

    public BrowserWindowsPage clickOnNewTabBtn () {
        clickOnElement(newTab);
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        return this;
    }

    @FindBy(id = "sampleHeading")
    WebElement sampleHeading;

    public String getTabText() {
        return sampleHeading.getText();
    }

    @FindBy(id = "windowButton")
    WebElement windowButton;


    public BrowserWindowsPage clickOnNewWindowBtn () {
        clickOnElement(windowButton);
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.manage().window().maximize();
        return this;
    }

    @FindBy(id = "messageWindowButton")
    WebElement messageWindowButton;

    public BrowserWindowsPage clickOnNewMessageWindowBtn () {
        clickOnElement(messageWindowButton);
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.manage().window().maximize();
        return this;
    }

    @FindBy(tagName = "body")
    WebElement bodyMessageWindow;

    public String getWindowText() {
        return bodyMessageWindow.getText();
    }

}
