package com.uitap.AJAXData;

import com.uitap.BaseTest;
import com.uitap.pages.AJAXData.AJAXDataPage;
import com.uitap.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AJAXDataTest extends BaseTest {
    @BeforeMethod
    public  void prepare() {
        new HomePage(driver).redirectToAJAXData();
    }

    @Test
    public void clickOnButtonAJAXButton() {
        new AJAXDataPage(driver).clickOnButtonAJAXData();
    }
}
