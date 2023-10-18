package com.uitap.pages.textInputPage;

import com.demo.qa.data.GenerateRandomData;
import com.uitap.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class InputTextPage extends BasePage {
    public InputTextPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "newButtonName")
    WebElement newButtonName;

    @FindBy(id = "updatingButton")
    WebElement updatingButton;

    public InputTextPage inputTextAndCheckButtonsText() {
        String randomEmail = new GenerateRandomData().generateEmail();
        fillField(randomEmail, newButtonName);
        updatingButton.click();
        Assert.assertEquals(updatingButton.getText(), randomEmail);
        return this;
    }
}
