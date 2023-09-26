package com.test.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheatSheetPage extends BasePage {
    public CheatSheetPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".page_heading")
    WebElement pageName;

    public String getPageName() {
        return pageName.getText();
    }
}
