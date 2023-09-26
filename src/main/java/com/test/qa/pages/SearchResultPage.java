package com.test.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage {
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h3/a")
    WebElement searchName;

    public String getFirstSearchNameText() {
        return searchName.getText();
    }


}
