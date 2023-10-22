package com.uitap.pages.progressBar;

import com.uitap.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class ProgressBarPage extends BasePage {
    public ProgressBarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "startButton")
    WebElement startButton;
    @FindBy(id = "stopButton")
    WebElement stopButton;

    @FindBy(id = "progressBar")
    WebElement progressBar;

    @FindBy(id = "result")
    WebElement result;



    public ProgressBarPage progressBarStopGetValue() {
        clickOnElement(startButton);
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(10));
        if (wait.until(ExpectedConditions.textToBePresentInElement(progressBar, "75%"))) clickOnElement(stopButton);
        return this;
    }

    public Boolean checkResult() {
        int value = 75 - Integer.parseInt(progressBar.getAttribute("aria-valuenow"));
        String strI = String.valueOf(value);
        boolean isTrue = result.getText().contains(strI);
        return isTrue;
    }
}
