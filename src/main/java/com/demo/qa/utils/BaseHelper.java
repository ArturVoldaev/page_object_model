package com.demo.qa.utils;

import com.demo.qa.pages.BasePage;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class BaseHelper extends BasePage {


    public BaseHelper(WebDriver driver) {
        super(driver);
    }

    public void takeScreenshot(String link) {
        File fileSrc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File linkPath = new File(link);
        try {
            Files.copy(fileSrc, linkPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String makeScreenshot() {
        String path = ("screenshots/screen" + System.currentTimeMillis() / 1000 + ".png");
        takeScreenshot(path);
        return path;
    }
}
