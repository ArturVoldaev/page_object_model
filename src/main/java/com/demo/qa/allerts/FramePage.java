package com.demo.qa.allerts;

import com.demo.qa.pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramePage extends BasePage {
    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "iframe")
    List<WebElement> iframes;
    public FramePage getListOfFrames() {
        System.out.println("NOFFRAMES " + iframes.size());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Integer jsFrame = Integer.valueOf(js.executeScript("return window.length").toString()) ;
        System.out.println(jsFrame);
        return this;
    }

    public FramePage switchToIFrameIndex(int i) {
        pause(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 100)");
        driver.switchTo().frame(i);
        return this;
    }

    @FindBy(id="frame1")
    WebElement frame1;

    public FramePage switchToIFrameById() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 100)");
        driver.switchTo().frame(frame1);
        driver.switchTo().defaultContent();

        return this;
    }
}
