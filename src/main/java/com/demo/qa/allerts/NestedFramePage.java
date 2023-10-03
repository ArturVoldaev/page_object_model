package com.demo.qa.allerts;

import com.demo.qa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NestedFramePage extends BasePage {
    public NestedFramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "iframe")
    List <WebElement> iframe;

    @FindBy(id = "frame1")
    WebElement iframe1;

    @FindBy(tagName = "body")
    WebElement body;

    public NestedFramePage handleNestedFrames() {
        pause(3000);
        System.out.println("IFC " + iframe.size());

        driver.switchTo().frame(iframe1);
        System.out.println("TEXT " + body.getText());

        System.out.println("Number in parents " + iframe.size());
        pause(1000);
        driver.switchTo().frame(0);
        System.out.println("UPDATE TEXT " + body.getText());
        System.out.println("Number in children " + iframe.size());

        return this;
    }
}
