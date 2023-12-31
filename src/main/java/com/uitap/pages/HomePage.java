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

    @FindBy(xpath = "(//a[.='Visibility'])")
    WebElement visibility;

    public HomePage redirectToVisibility() {
        clickOnElement(visibility);
        return this;
    }

    @FindBy(xpath = "(//a[.='Sample App'])")
    WebElement sampleApp;

    public HomePage redirectToSampleApp() {
        clickOnElement(sampleApp);
        return this;
    }

    @FindBy(xpath = "(//a[.='Mouse Over'])")
    WebElement mouseOver;

    public HomePage redirectToMouseOver() {
        clickOnElement(mouseOver);
        return this;
    }

    @FindBy(xpath = "(//a[.='Non-Breaking Space'])")
    WebElement   nonBreakingSpace;

    public HomePage redirectToNonBreakingSpace() {
        clickOnElement(nonBreakingSpace);
        return this;
    }

    @FindBy(xpath = "(//a[.='Overlapped Element'])")
    WebElement   overlappedElement;

    public HomePage redirectToOverlappedElement() {
        clickOnElement(overlappedElement);
        return this;
    }

    @FindBy(xpath = "(//a[.='Shadow DOM'])")
    WebElement shadowDOM;

    public HomePage redirectToShadowDOM() {
        clickOnElement(shadowDOM);
        return this;
    }
























}
