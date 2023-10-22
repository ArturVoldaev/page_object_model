package com.uitap.ScrollbarsTest;

import com.uitap.BaseTest;
import com.uitap.pages.HomePage;
import com.uitap.pages.ScrollbarsPage.ScrollBarsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollbarsTest extends BaseTest {
    @BeforeMethod
    public void prepare() {
        new HomePage(driver).redirectToScrollbars();
    }

    @Test
    public void scrollToElementAndClickButtonTest() {
        new ScrollBarsPage(driver).scrollToElementAndClickButtonTest();
        Assert.assertTrue(new ScrollBarsPage(driver).getTextHidingButton().contains("ding"));
    }
}
