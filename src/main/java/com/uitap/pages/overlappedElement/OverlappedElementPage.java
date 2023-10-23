package com.uitap.pages.overlappedElement;

import com.demo.qa.data.GenerateRandomData;
import com.uitap.pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverlappedElementPage extends BasePage {
    public OverlappedElementPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "id")
    WebElement inputId;

    @FindBy(id = "name")
    WebElement name;

    @FindBy(id = "subject")
    WebElement subject;

    public OverlappedElementPage OverlappedElementInputText() {
        pause(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("let el = document.querySelector(\"body > section > div > div > div:nth-child(2)\").remove()");
        fillField(new GenerateRandomData().generateFirstName(), inputId);
        fillField(new GenerateRandomData().generateFirstName(), name);
        js.executeScript("let el = document.querySelector(\"body > section > div > div > div:nth-child(1)\"); " +
                "el.scrollTo(0,100);");
        fillField(new GenerateRandomData().generateFirstName(), subject);
        return this;
    }
}
