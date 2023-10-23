package com.uitap.pages.mouseOver;

import com.uitap.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MouseOverPage extends BasePage {
    public MouseOverPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "clickCount")
    WebElement clickCount;

    public MouseOverPage mouseOverDoubleClick() {
        WebElement clickMe = driver.findElement(By.cssSelector("[title='Click me']"));
        new Actions(driver)
                .doubleClick(clickMe)
                .perform();
        return this;
    }

    public String getNumberClick() {
        return clickCount.getText();
    }


}
