package com.demo.qa.allerts;

import com.demo.qa.BaseTest;
import com.demo.qa.pages.HomePage;
import com.demo.qa.pages.SidePanelPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NestedFramesTest extends BaseTest {
    @BeforeMethod
    public void prepare() {
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanelPage(driver).selectNestedFrames();
    }

    @Test
    public void handledNestedFrTest() {
        new NestedFramePage(driver).handleNestedFrames();
    }
}
