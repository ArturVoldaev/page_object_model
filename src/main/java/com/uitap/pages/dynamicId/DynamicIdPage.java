package com.uitap.pages.dynamicId;

import com.uitap.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicIdPage extends BasePage {
    public DynamicIdPage(WebDriver driver)  {
        super(driver);
    }

    @FindBy(xpath = "(//button[.='Button with Dynamic ID'])")
    WebElement button;

    public DynamicIdPage clickButtonWithDynamicId() {
        clickOnElement(button);
        return this;
    }

    public String getButtonText() {
        return button.getText();
    }
}
