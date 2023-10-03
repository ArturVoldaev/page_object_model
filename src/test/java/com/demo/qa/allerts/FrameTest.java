package com.demo.qa.allerts;

import com.demo.qa.BaseTest;
import com.demo.qa.pages.HomePage;
import com.demo.qa.pages.SidePanelPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest {
    @BeforeMethod
    public void prepare() {
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanelPage(driver).selectFrame();
    }

    @Test
    public void getListsOfFramesTest() {
        new FramePage(driver).getListOfFrames();
    }

    @Test
    public void switchToFrameByIndexText() {
        new FramePage(driver).switchToIFrameIndex(1);
    }

    @Test
    public void switchToFrameByIdText() {
        new FramePage(driver).switchToIFrameById();
    }
}
