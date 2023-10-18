package com.uitap.click;

import com.uitap.BaseTest;
import com.uitap.pages.HomePage;
import com.uitap.pages.click.ClickPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClickTest extends BaseTest {
    @BeforeMethod
    public  void prepare() {
        new HomePage(driver).redirectToClick();
    }

    @Test
    public void clickOnButtonIgnoreDOM() {
        new ClickPage(driver).clickButtonWithIgnoreDOM();
    }
}
