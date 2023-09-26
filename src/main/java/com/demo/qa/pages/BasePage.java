package com.demo.qa.pages;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillField(String text, WebElement element) {
       element.click();
       element.clear();
       element.sendKeys(text);
    }

    public boolean isElementDisplayed(String cssLocator) {
        pause(50);
        return getSizeElementsOnPage(cssLocator) > 0;
    }

    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isElementNotDisplayed(String cssLocator) {
        return getSizeElementsOnPage(cssLocator) == 0;
    }

    public boolean countElementsOnPage(String cssSelector, int expectedCount) {
        return getSizeElementsOnPage(cssSelector) == expectedCount;
    }

    public int getSizeElementsOnPage(String cssSelector) {
        return driver.findElements(By.cssSelector(cssSelector)).size();
    }

    public String getTextFromElement(String xpath) {
        return driver.findElement(By.xpath(xpath)).getText();
    }


    public void clickOnElement(WebElement cssSelector) {
        cssSelector.click();
    }

    public void takeScreenshot(String link) {
        File fileSrc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File linkPath = new File(link);
        try {
            Files.copy(fileSrc, linkPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String makeScreenshot() {
        String path = ("screenshots/screen" + System.currentTimeMillis() / 1000 + ".png");
        takeScreenshot(path);
        return path;
    }

    public void clickOnElementWithJS(WebElement selector, int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(" + x + "," + y + ")");
        clickOnElement(selector);

    }

    public void hideAd () {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('adplus-anchor').style.display='none'");
    }

    public void hideFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('footer').style.display='none'");
    }


}