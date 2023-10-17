package com.demo.qa.forms;

import com.demo.qa.BaseTest;
import com.demo.qa.pages.HomePage;
import com.demo.qa.pages.SidePanelPage;
import com.demo.qa.pages.forms.PracticeFormPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormsTest extends BaseTest {
    @BeforeMethod
    public void prepare() {
        new HomePage(driver).getForms();
        new SidePanelPage(driver).selectPracticeForm();
    }

    @Test
    public void checkTitleForm() {
        Assert.assertTrue(new PracticeFormPage(driver).getFormTitle().contains("Registration"));
    }

    @Test
    public void fillOutForm() {
        new PracticeFormPage(driver).fillOutForm();
    }
}
