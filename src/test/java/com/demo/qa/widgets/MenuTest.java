package com.demo.qa.widgets;

import com.demo.qa.BaseTest;
import com.demo.qa.pages.HomePage;
import com.demo.qa.pages.MenuPage;
import com.demo.qa.pages.SidePanelPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuTest extends BaseTest {
    @BeforeMethod
    public void prepare() {
        new HomePage(driver).getWidgets();
        new SidePanelPage(driver).selectMenu();
    }

    @Test
    public void hoverToLastElement() {
        new MenuPage(driver).hoverToLastElement();
    }
}
