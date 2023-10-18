package com.uitap.pages.classAttribute;

import com.uitap.pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClassAttributePage extends BasePage {
    public ClassAttributePage(WebDriver driver)  {
        super(driver);
    }


    @FindBy(xpath = "//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")
    WebElement blueButton;
    public ClassAttributePage clickOnBlueButton() {
        clickOnElement(blueButton);
        Alert alert = driver.switchTo().alert();
        pause(5000);
        alert.accept();
        return this;
    }

    public String getButtonText() {
        return blueButton.getText();
    }
}
