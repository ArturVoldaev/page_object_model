package com.uitap.classAtribute;

import com.uitap.BaseTest;
import com.uitap.pages.HomePage;
import com.uitap.pages.classAttribute.ClassAttributePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassAttributeTest extends BaseTest {
    @BeforeMethod
    public  void prepare() {
        new HomePage(driver).redirectToClassAttribute();
    }

    @Test
    public void clickOnButtonWithDITest() {
        new ClassAttributePage(driver).clickOnBlueButton();
        Assert.assertTrue(new ClassAttributePage(driver).getButtonText().contains("Bu"));
    }

}
