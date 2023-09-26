package com.demo.qa;

import com.demo.qa.pages.HomePage;
import com.demo.qa.pages.SidePanelPage;
import com.test.qa.data.Names;
import org.testng.annotations.Test;

public class JSETests extends BaseTest {

    @Test
    public void registerWithJSETest() {
        new HomePage(driver).getElements();
        new SidePanelPage(driver).selectedTextBox();
        new GetJsExecuter(driver)
                .typeNameEmailWithJSE(Names.USER_NAME, Names.USER_EMAIL)
                .clickSubmintButton();
    }


    @Test
    public void checkBoxWithJSE() {
        new HomePage(driver).getForms();
        new SidePanelPage(driver).selectPracticeForm();
        new GetJsExecuter(driver).checkboxWithJSE();
    }

}
