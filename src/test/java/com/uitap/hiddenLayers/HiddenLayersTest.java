package com.uitap.hiddenLayers;

import com.uitap.BaseTest;
import com.uitap.pages.HomePage;
import com.uitap.pages.hiddenLayers.HiddenLayersPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HiddenLayersTest extends BaseTest {
    @BeforeMethod
    public  void prepare() {
        new HomePage(driver).redirectToHiddenLayers();
    }

    @Test
    public void clickOnButtonDifferentLaysTest() {
        new HiddenLayersPage(driver).clickOnGreenButton();
        new HiddenLayersPage(driver).clickOnBlueButton();
    }
}
