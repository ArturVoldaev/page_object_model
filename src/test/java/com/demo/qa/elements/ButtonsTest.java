package com.demo.qa.elements;

import com.demo.qa.BaseTest;
import com.demo.qa.pages.HomePage;
import com.demo.qa.pages.SidePanelPage;
import com.demo.qa.pages.elements.ButtonsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest {

    @BeforeMethod
    public void prepare() {
        new HomePage(driver).getElements();
        new SidePanelPage(driver).selectButtons();
    }

    @Test
    public void doubleClickTest() {
        new ButtonsPage(driver).doubleClick();
    }

    @Test void rightClickTest() {
        new ButtonsPage(driver).rightClick();
    }

    @Test void dynamicClickTest() {
        new ButtonsPage(driver).dynamicClick();
        Assert.assertTrue(new ButtonsPage(driver).dynamicClickBoxMessage().contains("dynamic click"));
    }
}
