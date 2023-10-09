package com.demo.qa.pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


public class UploadAndDownloadPage extends BasePage{
    public UploadAndDownloadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//label[normalize-space()='Select a file']")
    WebElement button;

    public UploadAndDownloadPage uploadDoc() throws AWTException {
        clickOnElement(button);

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_1);
        pause(100);
        robot.keyPress(KeyEvent.VK_X);
        pause(100);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_X);
        robot.keyPress(KeyEvent.VK_T);
        pause(100);
        robot.keyPress(KeyEvent.VK_ENTER);
        pause(5000);
        return this;


    }

    @FindBy(id="uploadedFilePath")
    WebElement uploadedFilePath;

    public String getUploader() {
        return uploadedFilePath.getText();
    }

    public UploadAndDownloadPage uploadByLocation() throws AWTException {
        clickOnElement(button);
        Dimension d = driver.manage().window().getSize();
        System.out.println(d.width +" "+d.height);
        int x = d.getWidth()/2 + 200;
        int y = d.getHeight()/4 +150;

        Robot robot = new Robot();
        robot.mouseMove(x, y);
        pause(1000);

        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        pause(5000);
        robot.keyPress(KeyEvent.VK_ENTER);
        return this;
    }
}
