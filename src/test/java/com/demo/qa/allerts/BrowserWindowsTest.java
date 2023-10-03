package com.demo.qa.allerts;

import com.demo.qa.BaseTest;
import com.demo.qa.pages.HomePage;
import com.demo.qa.pages.SidePanelPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserWindowsTest extends BaseTest {
    @BeforeMethod
    public void prepare() {
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanelPage(driver).selectBrowserWindows();
    }

    @Test
    public void openNewTabTest() {
        new BrowserWindowsPage(driver).clickOnNewTabBtn();
        Assert.assertTrue(new BrowserWindowsPage(driver).getTabText().contains("sample"));
    }

    @Test
    public void openNewWindowTest() {
        new BrowserWindowsPage(driver).clickOnNewWindowBtn();
        Assert.assertTrue(new BrowserWindowsPage(driver).getTabText().contains("sample"));
    }

    @Test
    public void openNewWindowMessageTest() {
        new BrowserWindowsPage(driver).clickOnNewMessageWindowBtn();
        Assert.assertTrue(new BrowserWindowsPage(driver).getWindowText().contains("friends"));
    }
}
