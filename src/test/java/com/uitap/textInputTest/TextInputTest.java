package com.uitap.textInputTest;

import com.uitap.BaseTest;
import com.uitap.pages.HomePage;
import com.uitap.pages.textInputPage.InputTextPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextInputTest extends BaseTest {
    @BeforeMethod
    public  void prepare() {
        new HomePage(driver).redirectToTextInput();
    }

    @Test
    public void inputTextTest() {
        new InputTextPage(driver).inputTextAndCheckButtonsText();
    }
}
