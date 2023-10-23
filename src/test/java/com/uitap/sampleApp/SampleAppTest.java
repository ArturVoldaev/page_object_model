package com.uitap.sampleApp;

import com.uitap.BaseTest;
import com.uitap.pages.HomePage;
import com.uitap.pages.sampleApp.SampleAppPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleAppTest extends BaseTest {

    @BeforeMethod
    public void prepare() {
        new HomePage(driver).redirectToSampleApp();
    }

    @Test
    public void loginInAppTest() {
        new SampleAppPage(driver).loginToSampleApp();
    }
}
