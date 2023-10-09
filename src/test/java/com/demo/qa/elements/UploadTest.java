package com.demo.qa.elements;

import com.demo.qa.BaseTest;
import com.demo.qa.pages.HomePage;
import com.demo.qa.pages.SidePanelPage;
import com.demo.qa.pages.UploadAndDownloadPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class UploadTest extends BaseTest {
    @BeforeMethod
    public void prepare() {
        new HomePage(driver).getElements();
        new SidePanelPage(driver).selectUploadAndDownload();
    }

    @Test
    public void robotUpLoadTest() throws AWTException {
        new UploadAndDownloadPage(driver).uploadDoc();
        Assert.assertEquals(new UploadAndDownloadPage(driver).getUploader(), "C:\\fakepath\\1x.txt");
    }

    @Test
    public void uploadByLocation() throws AWTException {
        new UploadAndDownloadPage(driver).uploadByLocation();
    }
}
