package com.demo.qa.store;

import com.demo.qa.BaseTest;
import com.demo.qa.data.Names;
import com.demo.qa.pages.HomePage;
import com.demo.qa.pages.SidePanelPage;
import com.demo.qa.pages.bookstore.BookStorePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BookStoreTest extends BaseTest {

    @BeforeMethod
    public void prepare() {
        new HomePage(driver).getBookStore();
        new SidePanelPage(driver).selectBookStore();
    }

    @Test
    public void searchBookPositiveTest() {
        new BookStorePage(driver).searchBook(Names.BOOK_NAME);
    }

    @Test
    public void searchNotExistBook() {
        new BookStorePage(driver).searchBook(Names.BOOK_NAME_NONEXIST);
        Assert.assertEquals(new BookStorePage(driver).getEmptyRowNane(), "a");
    }

    @Test
    public void searchJSBookPositiveTest() {
        new BookStorePage(driver).searchBook(Names.BOOK_NAME_JS);
        Assert.assertEquals(new BookStorePage(driver).searchResultJsBook(Names.BOOK_NAME_JS), new BookStorePage(driver).getListBook(Names.BOOK_NAME_JS).size());
    }

    @Test
    public void checkNameContainsStr() {
        new BookStorePage(driver).searchBook(Names.BOOK_NAME_JS);
        List<WebElement> book = new BookStorePage(driver).getListBook(Names.BOOK_NAME_JS);
        for (int i = 0; i < book.size(); i++) {
            Assert.assertTrue(book.get(i).getText().contains(Names.BOOK_NAME_JS));
        }
    }

    @Test
    public void checkTitleBookTest () {
        new BookStorePage(driver).searchBook(Names.BOOK_NAME_JS);
        ArrayList<String> el = (ArrayList<String>) new BookStorePage(driver).getLinksFromWebElement(Names.BOOK_NAME_JS);
        ArrayList <String> bookName = (ArrayList<String>) new BookStorePage(driver).getBookNameWebElement(Names.BOOK_NAME_JS);
        for (int i = 0; i < el.size() ; i++) {
            driver.switchTo().newWindow(WindowType.TAB);
            driver.get(el.get(i));
            Assert.assertEquals(new BookStorePage(driver).bookTitle().getText(), bookName.get(i));
        }
    }
}
