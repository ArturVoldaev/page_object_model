package com.demo.qa;

import com.demo.qa.pages.HomePage;
import com.demo.qa.pages.SidePanelPage;
import com.demo.qa.pages.elements.BrokenLinksImagesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenLinksImagesTest extends BaseTest {

    @BeforeMethod
    public  void prepare() {
        new HomePage(driver).getElements();
        new SidePanelPage(driver).selectedBIP();
    }

    @Test
    public void Test () {
        new BrokenLinksImagesPage(driver).checkAllLinks();
        new BrokenLinksImagesPage(driver).checkBrokenLinks();
    }
}
