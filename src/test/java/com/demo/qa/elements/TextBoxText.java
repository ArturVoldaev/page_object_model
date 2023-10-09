package com.demo.qa.elements;

import com.demo.qa.BaseTest;
import com.demo.qa.pages.HomePage;
import com.demo.qa.pages.SidePanelPage;
import com.demo.qa.pages.elements.TextBoxPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxText extends BaseTest {
    @BeforeMethod
    public void prepare() {
        new HomePage(driver).getElements();
        new SidePanelPage(driver).selectedTextBox();
    }

    @Test
    public void keyBoardsEventsTest() {
        new TextBoxPage(driver).keyBoadrEvent();
        Assert.assertEquals(new TextBoxPage(driver).getFieldPermanentAddress(), new TextBoxPage(driver).getFieldCurrentAddress());
//        Assert.assertEquals(new TextBoxPage(driver).outputPermanentAddress(), Names.TEXT_BOX_ADDRESS);
    }
}
