package com.uitap.pages.ScrollbarsPage;

import com.uitap.pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScrollBarsPage extends BasePage {
    public ScrollBarsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='container']//div//div//div")
    WebElement windowWithScroll;

    @FindBy(id = "hidingButton")
    WebElement hidingButton;

    public ScrollBarsPage scrollToElementAndClickButtonTest() {
        pause(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("let el = document.querySelector(\"body > section > div > div\"); " +
                "el.scrollTo(200,100);");

        clickOnElement(hidingButton);
        return this;
    }

    public String getTextHidingButton() {
        return hidingButton.getText();
    }

}
