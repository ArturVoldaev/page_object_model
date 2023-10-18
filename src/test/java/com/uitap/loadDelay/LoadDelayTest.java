package com.uitap.loadDelay;
import com.uitap.BaseTest;
import com.uitap.pages.HomePage;
import com.uitap.pages.loadDelay.LoadDelayPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoadDelayTest extends BaseTest {
    @BeforeMethod
    public  void prepare() {
        new HomePage(driver).redirectToLoadDelay();
    }

    @Test
    public void clickOnButtonDifferentLaysTest() {
        new LoadDelayPage(driver).clickOnButtonAfterDelay();
    }
}
