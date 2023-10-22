package com.uitap.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//a[.='Dynamic ID'])")
    WebElement dynamicId;

    public HomePage redirectToDynamicId() {
        clickOnElement(dynamicId);
        return this;
    }

    @FindBy(xpath = "(//a[.='Class Attribute'])")
    WebElement classAttribute;

    public HomePage redirectToClassAttribute() {
        clickOnElement(classAttribute);
        return this;
    }

    @FindBy(xpath = "(//a[.='Hidden Layers'])")
    WebElement hiddenLayers;

    public HomePage redirectToHiddenLayers() {
        clickOnElement(hiddenLayers);
        return this;
    }

    @FindBy(xpath = "(//a[.='Load Delay'])")
    WebElement loadDelay;

    public HomePage redirectToLoadDelay() {
        clickOnElement(loadDelay);
        return this;
    }

    @FindBy(xpath = "(//a[.='AJAX Data'])")
    WebElement AJAXData;

    public HomePage redirectToAJAXData() {
        clickOnElement(AJAXData);
        return this;
    }

    @FindBy(xpath = "(//a[.='Click'])")
    WebElement badButton;

    public HomePage redirectToClick() {
        clickOnElement(badButton);
        return this;
    }

    @FindBy(xpath = "(//a[.='Text Input'])")
    WebElement textInput;

    public HomePage redirectToTextInput() {
        clickOnElement(textInput);
        return this;
    }

    @FindBy(xpath = "(//a[.='Dynamic Table'])")
    WebElement dynamicTable;

    public HomePage redirectToDynamicTable() {
        clickOnElement(dynamicTable);
        return this;
    }

    @FindBy(xpath = "(//a[.='Scrollbars'])")
    WebElement scrollBars;

    public HomePage redirectToScrollbars() {
        clickOnElement(scrollBars);
        return this;
    }

    @FindBy(xpath = "(//a[.='Verify Text'])")
    WebElement verifyText;

    public HomePage redirectToVerifyText() {
        clickOnElement(verifyText);
        return this;
    }

    @FindBy(xpath = "(//a[.='Progress Bar'])")
    WebElement progressBar;

    public HomePage redirectToProgressBar() {
        clickOnElement(progressBar);
        return this;
    }













}
