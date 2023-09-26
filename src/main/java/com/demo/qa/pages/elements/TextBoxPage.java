package com.demo.qa.pages.elements;

import com.test.qa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage {
    public TextBoxPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "userName")
    WebElement userName;

    @FindBy(css = "userEmail")
    WebElement userEmail;

    @FindBy(css = "currentAddress")
    WebElement currentAddress;

    @FindBy(css = "permanentAddress")
    WebElement permanentAddress;

    @FindBy(css = "submit")
    WebElement submit;


}
