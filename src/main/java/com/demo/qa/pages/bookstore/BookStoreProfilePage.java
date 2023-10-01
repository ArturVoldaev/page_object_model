package com.demo.qa.pages.bookstore;

import com.demo.qa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BookStoreProfilePage extends BasePage {
    public BookStoreProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#userName-value")
    WebElement loginUserName;

    @FindBy(id = "submit")
    WebElement logoutButton;

    public BookStoreProfilePage verifyLoginUserName(String loginName) {
        Assert.assertEquals(loginName, loginUserName.getText());
        return this;
    }

    public BookStoreProfilePage logOut() {
        clickOnElement(logoutButton);
        return this;
    }


}
