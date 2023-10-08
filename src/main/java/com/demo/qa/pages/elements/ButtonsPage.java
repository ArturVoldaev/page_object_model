package com.demo.qa.pages.elements;

import com.demo.qa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage extends BasePage {
    public ButtonsPage (WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "doubleClickBtn")
    WebElement doubleClickBtn;

    public ButtonsPage doubleClick() {
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickBtn).perform();
        return this;
    }

    @FindBy(id = "rightClickBtn")
    WebElement rightClickBtn;
    public ButtonsPage rightClick() {
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickBtn).perform();
        return this;
    }

    @FindBy(xpath = "(//button[.='Click Me'])")
    WebElement dynamicBtn ;

    public ButtonsPage dynamicClick() {
        dynamicBtn.click();
        System.out.println(dynamicBtn.getText());
        return this;
    }

    @FindBy(id = "dynamicClickMessage")
    WebElement dynamicClickMessage;

    public String dynamicClickBoxMessage() {
        return dynamicClickMessage.getText();
    }


}
