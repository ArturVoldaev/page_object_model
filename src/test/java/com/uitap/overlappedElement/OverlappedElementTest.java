package com.uitap.overlappedElement;

import com.uitap.BaseTest;
import com.uitap.pages.HomePage;
import com.uitap.pages.overlappedElement.OverlappedElementPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OverlappedElementTest extends BaseTest {
    @BeforeMethod
    public  void prepare() {
        new HomePage(driver).redirectToOverlappedElement();
    }

    @Test
    public void progressBarStopTest() {
        new OverlappedElementPage(driver).OverlappedElementInputText();
    }
}
