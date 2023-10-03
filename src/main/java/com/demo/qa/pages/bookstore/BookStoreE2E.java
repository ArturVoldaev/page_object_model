package com.demo.qa.pages.bookstore;

import com.demo.qa.pages.BasePage;
import com.demo.qa.pages.HomePage;
import com.demo.qa.pages.SidePanelPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class BookStoreE2E extends BasePage {
    public BookStoreE2E(WebDriver driver) {
        super(driver);
    }

    @BeforeMethod
    public void prepare() {
        new HomePage(driver).getBookStore();
        new SidePanelPage(driver).selectBookStoreLogin();
    }

}
