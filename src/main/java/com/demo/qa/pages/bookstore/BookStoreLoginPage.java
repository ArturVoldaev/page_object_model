package com.demo.qa.pages.bookstore;

import com.demo.qa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookStoreLoginPage extends BasePage {
    public BookStoreLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userName")
    WebElement userName;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login")
    WebElement loginButton;

    @FindBy(id = "name")
    WebElement errorMessage;



    public BookStoreLoginPage login(String userNameText, String passwordText) {
        fillField(userNameText, userName);
        fillField(passwordText, password);
        clickOnElement(loginButton);
        return this;
    }


    public boolean invalidUserPasswordDisplayed() {
        return errorMessage.isDisplayed();
    }

    public boolean isValidateUserNameInput() {
        return userName.getAttribute("class").contains("is-invalid");
    }

    public boolean isValidatePasswordNameInput() {
        return password.getAttribute("class").contains("is-invalid");
    }
}
