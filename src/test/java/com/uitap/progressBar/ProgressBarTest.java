package com.uitap.progressBar;

import com.uitap.BaseTest;
import com.uitap.pages.HomePage;
import com.uitap.pages.progressBar.ProgressBarPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProgressBarTest extends BaseTest {
    @BeforeMethod
    public  void prepare() {
        new HomePage(driver).redirectToProgressBar();
    }

    @Test
    public void progressBarStopTest() {
        new ProgressBarPage(driver).progressBarStopGetValue();
        Assert.assertTrue(new ProgressBarPage(driver).checkResult());
    }

}
