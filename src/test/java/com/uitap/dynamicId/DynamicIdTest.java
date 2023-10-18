package com.uitap.dynamicId;

import com.uitap.BaseTest;
import com.uitap.pages.HomePage;
import com.uitap.pages.dynamicId.DynamicIdPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicIdTest extends BaseTest {
    @BeforeMethod
    public  void prepare() {
        new HomePage(driver).redirectToDynamicId();
    }

    @Test
    public void clickOnButtonWithDITest() {
        new DynamicIdPage(driver).clickButtonWithDynamicId();
        Assert.assertTrue(new DynamicIdPage(driver).getButtonText().contains("Dynamic I"));
    }
}
