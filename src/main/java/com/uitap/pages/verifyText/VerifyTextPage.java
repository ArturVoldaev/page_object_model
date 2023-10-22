package com.uitap.pages.verifyText;

import com.uitap.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class VerifyTextPage extends BasePage {
    public VerifyTextPage(WebDriver driver)  {
        super(driver);
    }

    @FindBy(xpath = "//span[normalize-space(.)='Welcome UserName!']")
    WebElement targetElem;


    public void verifyTextInElement(WebElement elem, String string) {
        Assert.assertTrue(elem.getText().contains(string));
    }

    public WebElement getElem () {
        return targetElem;
    }
}
