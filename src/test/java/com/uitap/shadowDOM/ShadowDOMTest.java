package com.uitap.shadowDOM;

import com.uitap.BaseTest;
import com.uitap.pages.HomePage;
import com.uitap.pages.shadowDOM.ShadowDOMPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class ShadowDOMTest extends BaseTest {
    @BeforeMethod
    public void prepare() {
        new HomePage(driver).redirectToShadowDOM();
    }

    @Test
    public void scrollToElementAndClickButtonTest() throws IOException, UnsupportedFlavorException {
        Assert.assertTrue(new ShadowDOMPage(driver).writeDateInClipboard().contains(new ShadowDOMPage(driver).readClipBoardValue()));
    }
}
