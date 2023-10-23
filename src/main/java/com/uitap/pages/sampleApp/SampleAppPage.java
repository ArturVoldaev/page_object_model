package com.uitap.pages.sampleApp;

import com.demo.qa.data.GenerateRandomData;
import com.uitap.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SampleAppPage extends BasePage {
    public SampleAppPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "login")
    WebElement login;

    @FindBy(id = "loginstatus")
    WebElement loginStatus;


    public String loginStatusString() {
        return loginStatus.getText();
    }

    public WebElement getUserNameField() {
        return driver.findElement(By.cssSelector("[name='UserName']"));
    }

    public WebElement getUserPasswordField() {
        return driver.findElement(By.cssSelector("[name='Password']"));
    }

    public SampleAppPage loginToSampleApp() {
        String randomUser = new GenerateRandomData().generateFirstName();
        fillField(randomUser, getUserNameField());
        fillField("pwd", getUserPasswordField());
        clickOnElement(login);
        Assert.assertTrue(loginStatusString().contains(randomUser));
        return this;
    }
}
