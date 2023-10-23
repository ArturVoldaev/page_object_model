package com.uitap.visibility;

import com.uitap.BaseTest;
import com.uitap.pages.HomePage;
import com.uitap.pages.visibility.VisibilityPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisibilityTest extends BaseTest {

    @BeforeMethod
    public  void prepare() {
        new HomePage(driver).redirectToVisibility();
    }

    @Test
    public void visibilityButtonsTest() {
        new VisibilityPage(driver).clickOnHideButton();
    }
}
