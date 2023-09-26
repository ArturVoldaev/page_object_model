package com.test.qa;

import com.test.qa.data.Names;
import com.test.qa.pages.HomePage;
import com.test.qa.pages.Selenium_3_0_TrainingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_3_0_TrainingTest extends BaseTest {
    @Test
    public void comparePrice() {
        new HomePage(driver).getPage();
        Assert.assertEquals(Names.COURSE_PRICE, new Selenium_3_0_TrainingPage(driver).getPrice());
    }
}
