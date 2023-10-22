package com.uitap.verifyText;

import com.uitap.BaseTest;
import com.uitap.pages.HomePage;
import com.uitap.pages.verifyText.VerifyTextPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyTextTest extends BaseTest {

    @BeforeMethod
    public void prepare() {
        new HomePage(driver).redirectToVerifyText();
    }

    @Test
    public void inputTextTest() {
        new VerifyTextPage(driver).verifyTextInElement(new VerifyTextPage(driver).getElem(), "Name!");
    }
}
