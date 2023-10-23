package com.uitap.nonBreakingSpace;

import com.uitap.BaseTest;
import com.uitap.pages.HomePage;
import com.uitap.pages.nonBreakingSpace.NonBreakingSpacePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NonBreakingSpaceTest extends BaseTest {
    @BeforeMethod
    public  void prepare() {
        new HomePage(driver).redirectToNonBreakingSpace();
    }

    @Test
    public void nonBreakingSpaceTest() {
        Assert.assertTrue( new NonBreakingSpacePage(driver).clickOnNonBreakingButton().contains("My"));
    }
}
