package com.uitap.mouseOver;

import com.uitap.BaseTest;
import com.uitap.pages.HomePage;
import com.uitap.pages.mouseOver.MouseOverPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseOverTest extends BaseTest {
    @BeforeMethod
    public void prepare() {
        new HomePage(driver).redirectToMouseOver();
    }

    @Test
    public void mouseOverTest() {
        new MouseOverPage(driver).mouseOverDoubleClick();
        Assert.assertTrue(new MouseOverPage(driver).getNumberClick().contains("2"));
    }
}
