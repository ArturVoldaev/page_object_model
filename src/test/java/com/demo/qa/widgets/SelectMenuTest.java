package com.demo.qa.widgets;

import com.demo.qa.BaseTest;
import com.demo.qa.pages.HomePage;
import com.demo.qa.pages.SidePanelPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectMenuTest extends BaseTest {
    @BeforeMethod
    public void prepare() {
        new HomePage(driver).getWidgets();
        new SidePanelPage(driver).selectSelectMenu();
    }

    @Test
    public void oldStyleSelectMenuTest() {
        new SelectMenuPage(driver).oldStyleSelect("White");
    }

    @Test
    public void multiStyleSelectMenuTest() {
        new SelectMenuPage(driver)
                .multiStyleSelect("Red")
                .deselect()
                .multiSelectMore(new String[] {"Green", "Blue"})
                .deselectAll();
    }

    @Test
    public void standartMultiStyleSelectMenuTest() {
        new SelectMenuPage(driver).standartMutiSelect();
    }



    @Test
    public void withGroupMenuTest() {
        new SelectMenuPage(driver).selectGroupValue();
//        Assert.assertTrue(new SelectMenuPage(driver).selectGroupTakeValue().contains("Group 1, option 2"));
//        new SelectMenuPage(driver).selectGroupValue(9);
//        Assert.assertEquals(new SelectMenuPage(driver).selectGroupTakeValue(), "Group 2, option 1");
//        new SelectMenuPage(driver).selectGroupValue(12);
//        Assert.assertTrue(new SelectMenuPage(driver).selectGroupTakeValue().contains("option"));
    }
}
